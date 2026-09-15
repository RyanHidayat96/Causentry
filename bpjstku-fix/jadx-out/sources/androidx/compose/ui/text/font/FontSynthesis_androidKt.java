package androidx.compose.ui.text.font;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "p0", "Landroidx/compose/ui/text/font/Font;", "p1", "Landroidx/compose/ui/text/font/FontWeight;", "p2", "Landroidx/compose/ui/text/font/FontStyle;", "p3", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "synthesizeTypeface"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FontSynthesis_androidKt {
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m6531synthesizeTypefaceFxwP2eA(int i, Object obj, Font font, FontWeight fontWeight, int i2) {
        int weight;
        boolean zM6510equalsimpl0;
        if (obj instanceof android.graphics.Typeface) {
            boolean z = false;
            boolean z2 = FontSynthesis.m6524isWeightOnimpl$ui_text(i) && !Intrinsics.areEqual(font.getWeight(), fontWeight) && fontWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.INSTANCE)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.INSTANCE)) < 0;
            boolean z3 = FontSynthesis.m6523isStyleOnimpl$ui_text(i) && !FontStyle.m6510equalsimpl0(i2, font.getStyle());
            if (z3 || z2) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (z3 && FontStyle.m6510equalsimpl0(i2, FontStyle.INSTANCE.m6516getItalic_LCdwA())) {
                        z = true;
                    }
                    return android.graphics.Typeface.create((android.graphics.Typeface) obj, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z2, z));
                }
                if (z2) {
                    weight = fontWeight.getWeight();
                } else {
                    weight = font.getWeight().getWeight();
                }
                if (z3) {
                    zM6510equalsimpl0 = FontStyle.m6510equalsimpl0(i2, FontStyle.INSTANCE.m6516getItalic_LCdwA());
                } else {
                    zM6510equalsimpl0 = FontStyle.m6510equalsimpl0(font.getStyle(), FontStyle.INSTANCE.m6516getItalic_LCdwA());
                }
                return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, weight, zM6510equalsimpl0);
            }
        }
        return obj;
    }
}
