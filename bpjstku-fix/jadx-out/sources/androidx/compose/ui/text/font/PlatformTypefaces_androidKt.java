package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefaces;", "PlatformTypefaces", "()Landroidx/compose/ui/text/font/PlatformTypefaces;", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p0", "Landroid/content/Context;", "p1", "setFontVariationSettings", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "Landroidx/compose/ui/text/font/FontWeight;", "getWeightSuffixForFallbackFamilyName", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PlatformTypefacesApi28();
        }
        return new PlatformTypefacesApi();
    }

    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context) : typeface;
    }

    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-thin");
            return sb.toString();
        }
        if (2 <= weight && weight < 4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("-light");
            return sb2.toString();
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("-medium");
            return sb3.toString();
        }
        if ((6 <= weight && weight < 8) || 8 > weight || weight >= 11) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("-black");
        return sb4.toString();
    }
}
