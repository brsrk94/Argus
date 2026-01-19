package app.vitune.core.ui

import android.graphics.Bitmap
import android.os.Parcel
import android.os.Parcelable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.palette.graphics.Palette
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.WriteWith

typealias ParcelableColor = @WriteWith<ColorParceler> Color
typealias ParcelableDp = @WriteWith<DpParceler> Dp

@Parcelize
@Immutable
data class ColorPalette(
    val background0: ParcelableColor,
    val background1: ParcelableColor,
    val background2: ParcelableColor,
    val accent: ParcelableColor,
    val onAccent: ParcelableColor,
    val red: ParcelableColor = Color(0xffbf4040),
    val blue: ParcelableColor = Color(0xff4472cf),
    val yellow: ParcelableColor = Color(0xfffff176),
    val text: ParcelableColor,
    val textSecondary: ParcelableColor,
    val textDisabled: ParcelableColor,
    val isDefault: Boolean,
    val isDark: Boolean
) : Parcelable

private val defaultAccentColor = Color(0xff3e44ce).hsl

val defaultLightPalette = ColorPalette(
    background0 = Color(0xfffdfdfe),
    background1 = Color(0xfff8f8fc),
    background2 = Color(0xffeaeaf5),
    text = Color(0xff212121),
    textSecondary = Color(0xff656566),
    textDisabled = Color(0xff9d9d9d),
    accent = defaultAccentColor.color,
    onAccent = Color.White,
    isDefault = true,
    isDark = false
)

val defaultDarkPalette = ColorPalette(
    background0 = Color(0xff16171d),
    background1 = Color(0xff1f2029),
    background2 = Color(0xff2b2d3b),
    text = Color(0xffe1e1e2),
    textSecondary = Color(0xffa3a4a6),
    textDisabled = Color(0xff6f6f73),
    accent = defaultAccentColor.color,
    onAccent = Color.White,
    isDefault = true,
    isDark = true
)

val floralLightPalette = ColorPalette(
    background0 = Color(0xfffff9fb),
    background1 = Color(0xfffce4ec),
    background2 = Color(0xfff8bbd0),
    text = Color(0xff4a148c),
    textSecondary = Color(0xff880e4f),
    textDisabled = Color(0xffad1457),
    accent = Color(0xffec407a),
    onAccent = Color.White,
    isDefault = false,
    isDark = false
)

val floralDarkPalette = ColorPalette(
    background0 = Color(0xff2d1a22),
    background1 = Color(0xff3d242d),
    background2 = Color(0xff4d2e38),
    text = Color(0xfff8bbd0),
    textSecondary = Color(0xfff48fb1),
    textDisabled = Color(0xffad1457),
    accent = Color(0xffec407a),
    onAccent = Color.White,
    isDefault = false,
    isDark = true
)

val oceanLightPalette = ColorPalette(
    background0 = Color(0xffe3f2fd),
    background1 = Color(0xffbbdefb),
    background2 = Color(0xff90caf9),
    text = Color(0xff01579b),
    textSecondary = Color(0xff0277bd),
    textDisabled = Color(0xff0288d1),
    accent = Color(0xff03a9f4),
    onAccent = Color.White,
    isDefault = false,
    isDark = false
)

val oceanDarkPalette = ColorPalette(
    background0 = Color(0xff0d1b2a),
    background1 = Color(0xff1b263b),
    background2 = Color(0xff415a77),
    text = Color(0xffe0e1dd),
    textSecondary = Color(0xff778da9),
    textDisabled = Color(0xff415a77),
    accent = Color(0xff00b4d8),
    onAccent = Color.White,
    isDefault = false,
    isDark = true
)

val forestLightPalette = ColorPalette(
    background0 = Color(0xfff1f8e9),
    background1 = Color(0xffdcedc8),
    background2 = Color(0xffc5e1a5),
    text = Color(0xff33691e),
    textSecondary = Color(0xff558b2f),
    textDisabled = Color(0xff689f38),
    accent = Color(0xff8bc34a),
    onAccent = Color.White,
    isDefault = false,
    isDark = false
)

val forestDarkPalette = ColorPalette(
    background0 = Color(0xff1a2e1a),
    background1 = Color(0xff2d4a2d),
    background2 = Color(0xff3d5a3d),
    text = Color(0xffc5e1a5),
    textSecondary = Color(0xffaed581),
    textDisabled = Color(0xff689f38),
    accent = Color(0xff8bc34a),
    onAccent = Color.White,
    isDefault = false,
    isDark = true
)

val sunsetLightPalette = ColorPalette(
    background0 = Color(0xfffff3e0),
    background1 = Color(0xffffe0b2),
    background2 = Color(0xffffcc80),
    text = Color(0xffe65100),
    textSecondary = Color(0xfff57c00),
    textDisabled = Color(0xfffb8c00),
    accent = Color(0xffff9800),
    onAccent = Color.White,
    isDefault = false,
    isDark = false
)

val sunsetDarkPalette = ColorPalette(
    background0 = Color(0xff2a1810),
    background1 = Color(0xff3d2418),
    background2 = Color(0xff4d3020),
    text = Color(0xffffcc80),
    textSecondary = Color(0xffffb74d),
    textDisabled = Color(0xfffb8c00),
    accent = Color(0xffff9800),
    onAccent = Color.White,
    isDefault = false,
    isDark = true
)

val cherryBlossomLightPalette = ColorPalette(
    background0 = Color(0xfffff5f7),
    background1 = Color(0xffffe4e9),
    background2 = Color(0xffffd4dd),
    text = Color(0xff4a1942),
    textSecondary = Color(0xff8b4789),
    textDisabled = Color(0xffc084bd),
    accent = Color(0xffff6b9d),
    onAccent = Color.White,
    isDefault = false,
    isDark = false
)

val cherryBlossomDarkPalette = ColorPalette(
    background0 = Color(0xff1a0f18),
    background1 = Color(0xff2d1a2a),
    background2 = Color(0xff3d2538),
    text = Color(0xffffd4dd),
    textSecondary = Color(0xffffb3c6),
    textDisabled = Color(0xffc084bd),
    accent = Color(0xffff6b9d),
    onAccent = Color.White,
    isDefault = false,
    isDark = true
)

private fun lightColorPalette(accent: Hsl) = lightColorPalette(
    hue = accent.hue,
    saturation = accent.saturation
)

private fun lightColorPalette(hue: Float, saturation: Float) = ColorPalette(
    background0 = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.1f),
        lightness = 0.925f
    ),
    background1 = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.3f),
        lightness = 0.90f
    ),
    background2 = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.4f),
        lightness = 0.85f
    ),
    text = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.02f),
        lightness = 0.12f
    ),
    textSecondary = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.1f),
        lightness = 0.40f
    ),
    textDisabled = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.2f),
        lightness = 0.65f
    ),
    accent = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.5f),
        lightness = 0.5f
    ),
    onAccent = Color.White,
    isDefault = false,
    isDark = false
)

private fun darkColorPalette(accent: Hsl, darkness: Darkness) = darkColorPalette(
    hue = accent.hue,
    saturation = accent.saturation,
    darkness = darkness
)

private fun darkColorPalette(
    hue: Float,
    saturation: Float,
    darkness: Darkness
) = ColorPalette(
    background0 = if (darkness == Darkness.Normal) Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.1f),
        lightness = 0.10f
    ) else Color.Black,
    background1 = if (darkness == Darkness.Normal) Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.3f),
        lightness = 0.15f
    ) else Color.Black,
    background2 = if (darkness == Darkness.Normal) Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.4f),
        lightness = 0.2f
    ) else Color.Black,
    text = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.02f),
        lightness = 0.88f
    ),
    textSecondary = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.1f),
        lightness = 0.65f
    ),
    textDisabled = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(0.2f),
        lightness = 0.40f
    ),
    accent = Color.hsl(
        hue = hue,
        saturation = saturation.coerceAtMost(if (darkness == Darkness.AMOLED) 0.4f else 0.5f),
        lightness = 0.5f
    ),
    onAccent = Color.White,
    isDefault = false,
    isDark = true
)

fun accentColorOf(
    source: ColorSource,
    isDark: Boolean,
    materialAccentColor: Color?,
    sampleBitmap: Bitmap?
) = when (source) {
    ColorSource.Default -> defaultAccentColor
    ColorSource.Dynamic -> sampleBitmap?.let { dynamicAccentColorOf(it, isDark) }
        ?: defaultAccentColor

    ColorSource.MaterialYou -> materialAccentColor?.hsl ?: defaultAccentColor
    ColorSource.Floral -> Color(0xffec407a).hsl
    ColorSource.Ocean -> Color(0xff03a9f4).hsl
    ColorSource.Forest -> Color(0xff8bc34a).hsl
    ColorSource.Sunset -> Color(0xffff9800).hsl
    ColorSource.CherryBlossom -> Color(0xffff6b9d).hsl
}

fun dynamicAccentColorOf(
    bitmap: Bitmap,
    isDark: Boolean
): Hsl? {
    val palette = Palette
        .from(bitmap)
        .maximumColorCount(8)
        .addFilter(if (isDark) ({ _, hsl -> hsl[0] !in 36f..100f }) else null)
        .generate()

    val hsl = if (isDark) {
        palette.dominantSwatch ?: Palette
            .from(bitmap)
            .maximumColorCount(8)
            .generate()
            .dominantSwatch
    } else {
        palette.dominantSwatch
    }?.hsl ?: return null

    val arr = if (hsl[1] < 0.08)
        palette.swatches
            .map(Palette.Swatch::getHsl)
            .sortedByDescending(FloatArray::component2)
            .find { it[1] != 0f }
            ?: hsl
    else hsl

    return arr.hsl
}

fun ColorPalette.amoled() = if (isDark) {
    val (hue, saturation) = accent.hsl

    copy(
        background0 = Color.hsl(
            hue = hue,
            saturation = saturation.coerceAtMost(0.1f),
            lightness = 0.10f
        ),
        background1 = Color.hsl(
            hue = hue,
            saturation = saturation.coerceAtMost(0.3f),
            lightness = 0.15f
        ),
        background2 = Color.hsl(
            hue = hue,
            saturation = saturation.coerceAtMost(0.4f),
            lightness = 0.2f
        )
    )
} else this

fun ColorPalette.withDarkness(darkness: Darkness) = if (isDark) {
    when (darkness) {
        Darkness.Normal -> this
        Darkness.AMOLED -> amoled()
        Darkness.PureBlack -> copy(
            background0 = Color.Black,
            background1 = Color.Black,
            background2 = Color.Black
        )
    }
} else this

fun colorPaletteOf(
    source: ColorSource,
    darkness: Darkness,
    isDark: Boolean,
    materialAccentColor: Color?,
    sampleBitmap: Bitmap?
): ColorPalette {
    when (source) {
        ColorSource.Floral -> return if (isDark) floralDarkPalette.withDarkness(darkness) else floralLightPalette
        ColorSource.Ocean -> return if (isDark) oceanDarkPalette.withDarkness(darkness) else oceanLightPalette
        ColorSource.Forest -> return if (isDark) forestDarkPalette.withDarkness(darkness) else forestLightPalette
        ColorSource.Sunset -> return if (isDark) sunsetDarkPalette.withDarkness(darkness) else sunsetLightPalette
        ColorSource.CherryBlossom -> return if (isDark) cherryBlossomDarkPalette.withDarkness(darkness) else cherryBlossomLightPalette
        else -> {}
    }

    val accentColor = accentColorOf(
        source = source,
        isDark = isDark,
        materialAccentColor = materialAccentColor,
        sampleBitmap = sampleBitmap
    )

    return (if (isDark) darkColorPalette(accentColor, darkness) else lightColorPalette(accentColor))
        .copy(isDefault = accentColor == defaultAccentColor)
}

inline val ColorPalette.isPureBlack get() = background0 == Color.Black
inline val ColorPalette.collapsedPlayerProgressBar
    get() = if (isPureBlack) defaultDarkPalette.background0 else background2
inline val ColorPalette.favoritesIcon get() = if (isDefault) red else accent
inline val ColorPalette.shimmer get() = if (isDefault) Color(0xff838383) else accent
inline val ColorPalette.surface get() = if (isPureBlack) Color(0xff272727) else background2

@Suppress("UnusedReceiverParameter")
inline val ColorPalette.overlay get() = Color.Black.copy(alpha = 0.75f)

@Suppress("UnusedReceiverParameter")
inline val ColorPalette.onOverlay get() = defaultDarkPalette.text

@Suppress("UnusedReceiverParameter")
inline val ColorPalette.onOverlayShimmer get() = defaultDarkPalette.shimmer

object ColorParceler : Parceler<Color> {
    override fun Color.write(parcel: Parcel, flags: Int) = parcel.writeLong(value.toLong())
    override fun create(parcel: Parcel) = Color(parcel.readLong())
}

object DpParceler : Parceler<Dp> {
    override fun Dp.write(parcel: Parcel, flags: Int) = parcel.writeFloat(value)
    override fun create(parcel: Parcel) = parcel.readFloat().dp
}
