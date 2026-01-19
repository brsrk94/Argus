package app.vitune.android.ui.components.themed

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.End
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Start
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.IntOffset
import app.vitune.android.R
import app.vitune.core.ui.LocalAppearance

@Composable
fun HorizontalScaffold(
    key: String,
    topIconButtonId: Int,
    onTopIconButtonClick: () -> Unit,
    tabIndex: Int,
    onTabChange: (Int) -> Unit,
    tabColumnContent: HorizontalTabsBuilder.() -> Unit,
    modifier: Modifier = Modifier,
    tabsEditingTitle: String = stringResource(R.string.tabs),
    content: @Composable AnimatedVisibilityScope.(Int) -> Unit
) {
    val (colorPalette) = LocalAppearance.current

    Column(
        modifier = modifier
            .background(colorPalette.background0)
            .fillMaxSize()
    ) {
        HorizontalNavigationBar(
            topIconButtonId = topIconButtonId,
            onTopIconButtonClick = onTopIconButtonClick,
            tabIndex = tabIndex,
            onTabIndexChange = onTabChange,
            content = tabColumnContent
        )

        AnimatedContent(
            targetState = tabIndex,
            transitionSpec = {
                val slideDirection = if (targetState > initialState) Start else End
                val animationSpec = spring(
                    dampingRatio = 0.9f,
                    stiffness = Spring.StiffnessLow,
                    visibilityThreshold = IntOffset.VisibilityThreshold
                )

                ContentTransform(
                    targetContentEnter = slideIntoContainer(slideDirection, animationSpec),
                    initialContentExit = slideOutOfContainer(slideDirection, animationSpec),
                    sizeTransform = null
                )
            },
            content = content,
            label = "",
            modifier = Modifier.fillMaxSize()
        )
    }
}
