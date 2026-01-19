package app.vitune.android.ui.components.themed

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import app.vitune.android.utils.color
import app.vitune.android.utils.semiBold
import app.vitune.core.ui.Dimensions
import app.vitune.core.ui.LocalAppearance
import kotlinx.parcelize.Parcelize

@Parcelize
data class TabItem(
    val key: String,
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val canHide: Boolean = true
) : Parcelable

class HorizontalTabsBuilder {
    val tabs = mutableListOf<TabItem>()

    fun tab(
        key: Int,
        @StringRes title: Int,
        @DrawableRes icon: Int,
        canHide: Boolean = true
    ) = tab(key.toString(), title, icon, canHide)

    fun tab(
        key: String,
        @StringRes title: Int,
        @DrawableRes icon: Int,
        canHide: Boolean = true
    ) {
        tabs.add(TabItem(key, title, icon, canHide))
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalNavigationBar(
    topIconButtonId: Int,
    onTopIconButtonClick: () -> Unit,
    tabIndex: Int,
    onTabIndexChange: (Int) -> Unit,
    content: HorizontalTabsBuilder.() -> Unit,
    modifier: Modifier = Modifier
) {
    val (colorPalette, typography) = LocalAppearance.current

    val builder = HorizontalTabsBuilder().apply(content)
    val tabs = builder.tabs

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(colorPalette.background0)
    ) {
        // Header with settings icon - matching app's Header style
        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(Dimensions.items.headerHeight)
                .fillMaxWidth()
        ) {
            HeaderIconButton(
                icon = topIconButtonId,
                color = colorPalette.text,
                onClick = onTopIconButtonClick,
                modifier = Modifier.size(24.dp)
            )
        }

        // Horizontal tabs - minimal and integrated
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            itemsIndexed(tabs) { index, tab ->
                val isSelected = tabIndex == index

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .clickable { onTabIndexChange(index) }
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                ) {
                    Image(
                        painter = painterResource(tab.icon),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(
                            if (isSelected) colorPalette.accent else colorPalette.textSecondary
                        ),
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    BasicText(
                        text = stringResource(tab.title),
                        style = typography.xxs.semiBold.color(
                            if (isSelected) colorPalette.text else colorPalette.textSecondary
                        ).copy(textAlign = TextAlign.Center),
                        maxLines = 1
                    )
                }
            }
        }
    }
}
