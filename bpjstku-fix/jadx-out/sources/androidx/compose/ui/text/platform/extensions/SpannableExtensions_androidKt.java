package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u0016\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"\u001aa\u0010*\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020#2\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u000b2&\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0000¢\u0006\u0004\b*\u0010+\u001a3\u0010-\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.\u001aY\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020#2\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2&\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0002¢\u0006\u0004\b/\u00100\u001aM\u00102\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010,2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u000f0\u000e2\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000601H\u0000¢\u0006\u0004\b2\u00103\u001a!\u00107\u001a\u0004\u0018\u0001042\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106\u001a-\u00109\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u0001082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:\u001a-\u0010<\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010=\u001a+\u0010A\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010B2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bC\u0010D\u001a-\u0010F\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010I\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010H2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010J\u001a3\u0010M\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010N2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010P\u001a+\u0010R\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020>2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bQ\u0010@\u001a-\u0010V\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010S2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bT\u0010U\u001a5\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010W2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010Y\u001a\u0013\u0010Z\u001a\u00020 *\u00020#H\u0002¢\u0006\u0004\bZ\u0010[\u001a\u001d\u0010\\\u001a\u00020,*\u0004\u0018\u00010,2\u0006\u0010\u0002\u001a\u00020,H\u0002¢\u0006\u0004\b\\\u0010]\"\u0018\u0010`\u001a\u00020 *\u00020,8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_"}, d2 = {"Landroid/text/Spannable;", "", "p0", "", "p1", "p2", "", "setSpan", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Landroidx/compose/ui/text/style/TextIndent;", "", "Landroidx/compose/ui/unit/Density;", "setTextIndent", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextIndent;FLandroidx/compose/ui/unit/Density;)V", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "p3", "setBulletSpans", "(Landroid/text/Spannable;Ljava/util/List;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/TextIndent;)V", "Landroidx/compose/ui/unit/TextUnit;", "resolveBulletTextUnitToPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveBulletTextUnitToPx", "Landroidx/compose/ui/text/style/LineHeightStyle;", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "resolveLineHeightInPx-o2QH7mI", "resolveLineHeightInPx", "", "isNonLinearFontScalingActive", "(Landroidx/compose/ui/unit/Density;)Z", "Landroidx/compose/ui/text/TextStyle;", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "setSpanStyles", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/ui/text/SpanStyle;", "setSpanStyle", "(Landroid/text/Spannable;Landroidx/compose/ui/text/SpanStyle;IILandroidx/compose/ui/unit/Density;)V", "setFontAttributes", "(Landroid/text/Spannable;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function3;", "flattenFontStylesAndApply", "(Landroidx/compose/ui/text/SpanStyle;Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan", "Landroidx/compose/ui/graphics/Shadow;", "setShadow", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Shadow;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setDrawStyle", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/drawscope/DrawStyle;II)V", "Landroidx/compose/ui/graphics/Color;", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "setLocaleList", "(Landroid/text/Spannable;Landroidx/compose/ui/text/intl/LocaleList;II)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setGeometricTransform", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextGeometricTransform;II)V", "", "setFontFeatureSettings", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextDecoration", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/TextDecoration;II)V", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "setBaselineShift", "Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/Brush;FII)V", "hasFontAttributes", "(Landroidx/compose/ui/text/TextStyle;)Z", "merge", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/SpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "needsLetterSpacingSpan"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpannableExtensions_androidKt {
    public static final void setSpan(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        float fM7129getValueimpl;
        if (textIndent != null) {
            if ((TextUnit.m7126equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m7126equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnit.m7127getRawTypeimpl(textIndent.getFirstLine()) == 0 || TextUnit.m7127getRawTypeimpl(textIndent.getRestLine()) == 0) {
                return;
            }
            long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(textIndent.getFirstLine());
            float fM7129getValueimpl2 = 0.0f;
            if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
                fM7129getValueimpl = density.mo693toPxR2X_6o(textIndent.getFirstLine());
            } else {
                fM7129getValueimpl = TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA()) ? TextUnit.m7129getValueimpl(textIndent.getFirstLine()) * f : 0.0f;
            }
            long jM7128getTypeUIouoOA2 = TextUnit.m7128getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA2, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
                fM7129getValueimpl2 = density.mo693toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA2, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
                fM7129getValueimpl2 = TextUnit.m7129getValueimpl(textIndent.getRestLine()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fM7129getValueimpl), (int) Math.ceil(fM7129getValueimpl2)), 0, spannable.length());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f, Density density, TextIndent textIndent) {
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        float fM7129getValueimpl = 0.0f;
        if (textIndent != null) {
            long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(textIndent.getFirstLine());
            if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
                fM7129getValueimpl = density.mo693toPxR2X_6o(textIndent.getFirstLine());
            } else if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
                fM7129getValueimpl = TextUnit.m7129getValueimpl(textIndent.getFirstLine()) * f;
            }
        }
        float f2 = fM7129getValueimpl;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list2.get(i);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM6676resolveBulletTextUnitToPxo2QH7mI = m6676resolveBulletTextUnitToPxo2QH7mI(bullet.getWidth(), f, density);
                float fM6676resolveBulletTextUnitToPxo2QH7mI2 = m6676resolveBulletTextUnitToPxo2QH7mI(bullet.getHeight(), f, density);
                float fM6676resolveBulletTextUnitToPxo2QH7mI3 = m6676resolveBulletTextUnitToPxo2QH7mI(bullet.getPadding(), f, density);
                if (!Float.isNaN(fM6676resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM6676resolveBulletTextUnitToPxo2QH7mI2) && !Float.isNaN(fM6676resolveBulletTextUnitToPxo2QH7mI3)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM6676resolveBulletTextUnitToPxo2QH7mI, fM6676resolveBulletTextUnitToPxo2QH7mI2, fM6676resolveBulletTextUnitToPxo2QH7mI3, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density, f2), range.getStart(), range.getEnd());
                }
            }
            i++;
            list2 = list;
        }
    }

    /* JADX INFO: renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m6676resolveBulletTextUnitToPxo2QH7mI(long j, float f, Density density) {
        if (TextUnit.m7126equalsimpl0(j, TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE())) {
            return f;
        }
        long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(j);
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            return density.mo693toPxR2X_6o(j);
        }
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
            return TextUnit.m7129getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m6682setLineHeightKmRG4DE(Spannable spannable, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        float fM6677resolveLineHeightInPxo2QH7mI = m6677resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(fM6677resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        Spannable spannable2 = spannable;
        setSpan(spannable, new LineHeightStyleSpan(fM6677resolveLineHeightInPxo2QH7mI, 0, (spannable2.length() == 0 || StringsKt.last(spannable2) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m6804isTrimFirstLineTopimpl$ui_text(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m6805isTrimLastLineBottomimpl$ui_text(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), LineHeightStyle.Mode.m6793equalsimpl0(lineHeightStyle.getMode(), LineHeightStyle.Mode.INSTANCE.m6798getMinimumlzQqcRY())), 0, spannable.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m6683setLineHeightr9BaKPg(Spannable spannable, long j, float f, Density density) {
        float fM6677resolveLineHeightInPxo2QH7mI = m6677resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(fM6677resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM6677resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m6677resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        float fM7129getValueimpl;
        long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(j);
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo693toPxR2X_6o(j);
            }
            fM7129getValueimpl = TextUnit.m7129getValueimpl(j) / TextUnit.m7129getValueimpl(density.mo697toSpkPz2Gy4(f));
        } else {
            if (!TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
                return Float.NaN;
            }
            fM7129getValueimpl = TextUnit.m7129getValueimpl(j);
        }
        return fM7129getValueimpl * f;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        MetricAffectingSpan metricAffectingSpanM6675createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, function4);
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i2);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM6675createLetterSpacingSpaneAf_CNQ = m6675createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).getLetterSpacing(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM6675createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i, int i2, Density density) {
        m6679setBaselineShift0ocSgnM(spannable, spanStyle.getBaselineShift(), i, i2);
        m6680setColorRPmYEkk(spannable, spanStyle.m6338getColor0d7_KjU(), i, i2);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i, i2);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i, i2);
        m6681setFontSizeKmRG4DE(spannable, spanStyle.getFontSize(), density, i, i2);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i, i2);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i, i2);
        setLocaleList(spannable, spanStyle.getLocaleList(), i, i2);
        m6678setBackgroundRPmYEkk(spannable, spanStyle.getBackground(), i, i2);
        setShadow(spannable, spanStyle.getShadow(), i, i2);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFontAttributes$lambda$12(Spannable spannable, Function4 function4, SpanStyle spanStyle, int i, int i2) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontStyle fontStyle = spanStyle.getFontStyle();
        FontStyle fontStyleM6507boximpl = FontStyle.m6507boximpl(fontStyle != null ? fontStyle.m6513unboximpl() : FontStyle.INSTANCE.m6517getNormal_LCdwA());
        FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        spannable.setSpan(new TypefaceSpan((Typeface) function4.invoke(fontFamily, fontWeight, fontStyleM6507boximpl, FontSynthesis.m6518boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m6527getAllGVVA2EU()))), i, i2, 33);
        return Unit.INSTANCE;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> function3) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            function3.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        int[] iArr = new int[i];
        List<AnnotatedString.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            iArr[i2] = range.getStart();
            iArr[i2 + size] = range.getEnd();
        }
        ArraysKt.sort(iArr);
        int iFirst = ArraysKt.first(iArr);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 != iFirst) {
                int size3 = list2.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i5 = 0; i5 < size3; i5++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i5);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iFirst, i4, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    function3.invoke(spanStyleMerge, Integer.valueOf(iFirst), Integer.valueOf(i4));
                }
                iFirst = i4;
            }
        }
    }

    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m6675createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(j);
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo693toPxR2X_6o(j));
        }
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m7129getValueimpl(j));
        }
        return null;
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        return TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(spanStyle.getLetterSpacing()), TextUnitType.INSTANCE.m7162getSpUIouoOA()) || TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(spanStyle.getLetterSpacing()), TextUnitType.INSTANCE.m7161getEmUIouoOA());
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m4272toArgb8_81llA(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i2);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i, int i2) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i2);
        }
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m6678setBackgroundRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m4272toArgb8_81llA(j)), i, i2);
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m6681setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i, int i2) {
        long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(j);
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(MathKt.roundToInt(density.mo693toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m7129getValueimpl(j)), i, i2);
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        if (textDecoration != null) {
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(TextDecoration.INSTANCE.getUnderline()), textDecoration.contains(TextDecoration.INSTANCE.getLineThrough())), i, i2);
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m6680setColorRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m4272toArgb8_81llA(j)), i, i2);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m6679setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m6697unboximpl()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i, int i2) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m6680setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i, i2);
            } else {
                if (!(brush instanceof ShaderBrush)) {
                    throw new NoWhenBranchMatchedException();
                }
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i2);
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m6430getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, final Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> function4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).getFontSynthesis() != null)) {
                Intrinsics.checkNotNull(range, "");
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = arrayList;
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m6429getFontStyle4Lr2A7w(), textStyle.m6430getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null) : null, arrayList2, new Function3() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SpannableExtensions_androidKt.setFontAttributes$lambda$12(spannable, function4, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }
}
