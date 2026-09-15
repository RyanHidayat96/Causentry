package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001a"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi28;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "<init>", "()V", "", "p0", "Landroidx/compose/ui/text/font/FontWeight;", "p1", "Landroidx/compose/ui/text/font/FontStyle;", "p2", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "Landroid/content/Context;", "p4", "Landroid/graphics/Typeface;", "optionalOnDeviceFontFamilyByName-78DK7lM", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "optionalOnDeviceFontFamilyByName", "createDefault-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createDefault", "Landroidx/compose/ui/text/font/GenericFontFamily;", "createNamed-RetOiIg", "(Landroidx/compose/ui/text/font/GenericFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "createNamed", "loadNamedFromTypefaceCacheOrNull-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "loadNamedFromTypefaceCacheOrNull", "createAndroidTypefaceApi28-RetOiIg", "createAndroidTypefaceApi28"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PlatformTypefacesApi28 implements PlatformTypefaces {
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
            typefaceMo6539createNamedRetOiIg = Intrinsics.areEqual(p0, FontFamily.INSTANCE.getCursive().getName()) ? mo6539createNamedRetOiIg(FontFamily.INSTANCE.getCursive(), p1, p2) : m6546loadNamedFromTypefaceCacheOrNullRetOiIg(p0, p1, p2);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceMo6539createNamedRetOiIg, p3, p4);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public final android.graphics.Typeface mo6538createDefaultFO1MlWM(FontWeight p0, int p1) {
        return m6544createAndroidTypefaceApi28RetOiIg(null, p0, p1);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public final android.graphics.Typeface mo6539createNamedRetOiIg(GenericFontFamily p0, FontWeight p1, int p2) {
        return m6544createAndroidTypefaceApi28RetOiIg(p0.getName(), p1, p2);
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6546loadNamedFromTypefaceCacheOrNullRetOiIg(String p0, FontWeight p1, int p2) {
        if (p0.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM6544createAndroidTypefaceApi28RetOiIg = m6544createAndroidTypefaceApi28RetOiIg(p0, p1, p2);
        if (Intrinsics.areEqual(typefaceM6544createAndroidTypefaceApi28RetOiIg, TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, p1.getWeight(), FontStyle.m6510equalsimpl0(p2, FontStyle.INSTANCE.m6516getItalic_LCdwA()))) || Intrinsics.areEqual(typefaceM6544createAndroidTypefaceApi28RetOiIg, m6544createAndroidTypefaceApi28RetOiIg(null, p1, p2))) {
            return null;
        }
        return typefaceM6544createAndroidTypefaceApi28RetOiIg;
    }

    /* JADX INFO: renamed from: createAndroidTypefaceApi28-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m6545createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m6544createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceApi28-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6544createAndroidTypefaceApi28RetOiIg(String p0, FontWeight p1, int p2) {
        android.graphics.Typeface typefaceCreate;
        String str;
        if (FontStyle.m6510equalsimpl0(p2, FontStyle.INSTANCE.m6517getNormal_LCdwA()) && Intrinsics.areEqual(p1, FontWeight.INSTANCE.getNormal()) && ((str = p0) == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        if (p0 == null) {
            typefaceCreate = android.graphics.Typeface.DEFAULT;
        } else {
            typefaceCreate = android.graphics.Typeface.create(p0, 0);
        }
        return android.graphics.Typeface.create(typefaceCreate, p1.getWeight(), FontStyle.m6510equalsimpl0(p2, FontStyle.INSTANCE.m6516getItalic_LCdwA()));
    }
}
