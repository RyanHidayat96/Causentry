package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001a"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "<init>", "()V", "Landroidx/compose/ui/text/font/FontWeight;", "p0", "Landroidx/compose/ui/text/font/FontStyle;", "p1", "Landroid/graphics/Typeface;", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "Landroidx/compose/ui/text/font/GenericFontFamily;", "p2", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "Landroid/content/Context;", "p4", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "optionalOnDeviceFontFamilyByName", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "createAndroidTypefaceUsingTypefaceStyle-RetOiIg", "createAndroidTypefaceUsingTypefaceStyle"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public final android.graphics.Typeface mo6538createDefaultFO1MlWM(FontWeight p0, int p1) {
        return m6541createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, p0, p1);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public final android.graphics.Typeface mo6539createNamedRetOiIg(GenericFontFamily p0, FontWeight p1, int p2) {
        android.graphics.Typeface typefaceM6543loadNamedFromTypefaceCacheOrNullRetOiIg = m6543loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(p0.getName(), p1), p1, p2);
        return typefaceM6543loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m6541createAndroidTypefaceUsingTypefaceStyleRetOiIg(p0.getName(), p1, p2) : typefaceM6543loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public final android.graphics.Typeface mo6540optionalOnDeviceFontFamilyByName78DK7lM(String p0, FontWeight p1, int p2, FontVariation.Settings p3, Context p4) {
        android.graphics.Typeface typefaceMo6539createNamedRetOiIg;
        if (Intrinsics.areEqual(p0, FontFamily.INSTANCE.getSansSerif().getName())) {
            typefaceMo6539createNamedRetOiIg = mo6539createNamedRetOiIg(FontFamily.INSTANCE.getSansSerif(), p1, p2);
        } else if (Intrinsics.areEqual(p0, FontFamily.INSTANCE.getSerif().getName())) {
            typefaceMo6539createNamedRetOiIg = mo6539createNamedRetOiIg(FontFamily.INSTANCE.getSerif(), p1, p2);
        } else if (Intrinsics.areEqual(p0, FontFamily.INSTANCE.getMonospace().getName())) {
            typefaceMo6539createNamedRetOiIg = mo6539createNamedRetOiIg(FontFamily.INSTANCE.getMonospace(), p1, p2);
        } else {
            typefaceMo6539createNamedRetOiIg = Intrinsics.areEqual(p0, FontFamily.INSTANCE.getCursive().getName()) ? mo6539createNamedRetOiIg(FontFamily.INSTANCE.getCursive(), p1, p2) : m6543loadNamedFromTypefaceCacheOrNullRetOiIg(p0, p1, p2);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceMo6539createNamedRetOiIg, p3, p4);
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6543loadNamedFromTypefaceCacheOrNullRetOiIg(String p0, FontWeight p1, int p2) {
        if (p0.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM6541createAndroidTypefaceUsingTypefaceStyleRetOiIg = m6541createAndroidTypefaceUsingTypefaceStyleRetOiIg(p0, p1, p2);
        if (Intrinsics.areEqual(typefaceM6541createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m6461getAndroidTypefaceStyleFO1MlWM(p1, p2))) || Intrinsics.areEqual(typefaceM6541createAndroidTypefaceUsingTypefaceStyleRetOiIg, m6541createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, p1, p2))) {
            return null;
        }
        return typefaceM6541createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m6542createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.INSTANCE.m6517getNormal_LCdwA();
        }
        return platformTypefacesApi.m6541createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6541createAndroidTypefaceUsingTypefaceStyleRetOiIg(String p0, FontWeight p1, int p2) {
        String str;
        if (FontStyle.m6510equalsimpl0(p2, FontStyle.INSTANCE.m6517getNormal_LCdwA()) && Intrinsics.areEqual(p1, FontWeight.INSTANCE.getNormal()) && ((str = p0) == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int iM6461getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m6461getAndroidTypefaceStyleFO1MlWM(p1, p2);
        String str2 = p0;
        if (str2 == null || str2.length() == 0) {
            return android.graphics.Typeface.defaultFromStyle(iM6461getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.create(p0, iM6461getAndroidTypefaceStyleFO1MlWM);
    }
}
