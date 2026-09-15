package androidx.compose.ui.text;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.text.HtmlCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0002\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0015\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001fH\u0002¢\u0006\u0004\b\u001d\u0010 \u001a\u001b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010)\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0006\n\u0004\b)\u0010(\"\u0014\u0010*\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0006\n\u0004\b*\u0010(\"\u0014\u0010+\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0006\n\u0004\b+\u0010("}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "p0", "Landroidx/compose/ui/text/TextLinkStyles;", "p1", "Landroidx/compose/ui/text/LinkInteractionListener;", "p2", "Landroidx/compose/ui/text/AnnotatedString;", "fromHtml", "(Landroidx/compose/ui/text/AnnotatedString$Companion;Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/Spanned;", "toAnnotatedString", "(Landroid/text/Spanned;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "addSpans", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroid/text/Spanned;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "", "", "p3", "p4", "addSpan", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/Object;IILandroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "Landroid/text/style/AlignmentSpan;", "Landroidx/compose/ui/text/ParagraphStyle;", "toParagraphStyle", "(Landroid/text/style/AlignmentSpan;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroid/text/style/StyleSpan;", "Landroidx/compose/ui/text/SpanStyle;", "toSpanStyle", "(Landroid/text/style/StyleSpan;)Landroidx/compose/ui/text/SpanStyle;", "Landroid/text/style/TypefaceSpan;", "(Landroid/text/style/TypefaceSpan;)Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/font/FontFamily;", "optionalFontFamilyFromName", "(Ljava/lang/String;)Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/Html_androidKt$TagHandler$1;", "TagHandler", "Landroidx/compose/ui/text/Html_androidKt$TagHandler$1;", Html_androidKt.ContentHandlerReplacementTag, "Ljava/lang/String;", "AnnotationTag", "Li", "Ul"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Html_androidKt {
    private static final String AnnotationTag = "annotation";
    private static final String ContentHandlerReplacementTag = "ContentHandlerReplacementTag";
    private static final String Li = "li";
    private static final Html_androidKt$TagHandler$1 TagHandler = new Html.TagHandler() { // from class: androidx.compose.ui.text.Html_androidKt$TagHandler$1
        @Override // android.text.Html.TagHandler
        public final void handleTag(boolean p0, String p1, Editable p2, XMLReader p3) {
            if (p3 == null || p2 == null || !p0 || !Intrinsics.areEqual(p1, "ContentHandlerReplacementTag")) {
                return;
            }
            p3.setContentHandler(new AnnotationContentHandler(p3.getContentHandler(), p2));
        }
    };
    private static final String Ul = "ul";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ AnnotatedString fromHtml$default(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
        if ((i & 2) != 0) {
            textLinkStyles = null;
        }
        if ((i & 4) != 0) {
            linkInteractionListener = null;
        }
        return fromHtml(companion, str, textLinkStyles, linkInteractionListener);
    }

    public static final AnnotatedString fromHtml(AnnotatedString.Companion companion, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        return toAnnotatedString(HtmlCompat.fromHtml("<ContentHandlerReplacementTag />".concat(String.valueOf(str)), 63, null, TagHandler), textLinkStyles, linkInteractionListener);
    }

    public static /* synthetic */ AnnotatedString toAnnotatedString$default(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
        if ((i & 1) != 0) {
            textLinkStyles = null;
        }
        if ((i & 2) != 0) {
            linkInteractionListener = null;
        }
        return toAnnotatedString(spanned, textLinkStyles, linkInteractionListener);
    }

    public static final AnnotatedString toAnnotatedString(Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        AnnotatedString.Builder builderAppend = new AnnotatedString.Builder(spanned.length()).append((CharSequence) spanned);
        addSpans(builderAppend, spanned, textLinkStyles, linkInteractionListener);
        return builderAppend.toAnnotatedString();
    }

    private static final void addSpans(AnnotatedString.Builder builder, Spanned spanned, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        for (Object obj : spanned.getSpans(0, builder.getLength(), Object.class)) {
            long jTextRange = TextRangeKt.TextRange(spanned.getSpanStart(obj), spanned.getSpanEnd(obj));
            addSpan(builder, obj, TextRange.m6397getStartimpl(jTextRange), TextRange.m6392getEndimpl(jTextRange), textLinkStyles, linkInteractionListener);
        }
    }

    private static final void addSpan(AnnotatedString.Builder builder, Object obj, int i, int i2, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
        String url;
        if (obj instanceof AbsoluteSizeSpan) {
            return;
        }
        if (obj instanceof AlignmentSpan) {
            builder.addStyle(toParagraphStyle((AlignmentSpan) obj), i, i2);
            return;
        }
        if (obj instanceof AnnotationSpan) {
            AnnotationSpan annotationSpan = (AnnotationSpan) obj;
            builder.addStringAnnotation(annotationSpan.getKey(), annotationSpan.getValue(), i, i2);
            return;
        }
        if (obj instanceof BackgroundColorSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63487, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof BulletSpanWithLevel) {
            long jM6221getDefaultIndentationXSAIIZE = Bullet.INSTANCE.m6221getDefaultIndentationXSAIIZE();
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
            int indentationLevel = bulletSpanWithLevel.getIndentationLevel();
            TextUnitKt.m7142checkArithmeticR2X_6o(jM6221getDefaultIndentationXSAIIZE);
            builder.m6211addBulletr9BaKPg(bulletSpanWithLevel.getBullet(), TextUnitKt.pack(TextUnit.m7127getRawTypeimpl(jM6221getDefaultIndentationXSAIIZE), TextUnit.m7129getValueimpl(jM6221getDefaultIndentationXSAIIZE) * indentationLevel), i, i2);
            return;
        }
        if (obj instanceof ForegroundColorSpan) {
            builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof RelativeSizeSpan) {
            builder.addStyle(new SpanStyle(0L, TextUnitKt.getEm(((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65533, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof StrikethroughSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof StyleSpan) {
            SpanStyle spanStyle = toSpanStyle((StyleSpan) obj);
            if (spanStyle != null) {
                builder.addStyle(spanStyle, i, i2);
                return;
            }
            return;
        }
        if (obj instanceof SubscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m6691boximpl(BaselineShift.INSTANCE.m6702getSubscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof SuperscriptSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, BaselineShift.m6691boximpl(BaselineShift.INSTANCE.m6703getSuperscripty9eOQZs()), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65279, (DefaultConstructorMarker) null), i, i2);
            return;
        }
        if (obj instanceof TypefaceSpan) {
            builder.addStyle(toSpanStyle((TypefaceSpan) obj), i, i2);
            return;
        }
        if (obj instanceof UnderlineSpan) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), i, i2);
        } else {
            if (!(obj instanceof URLSpan) || (url = ((URLSpan) obj).getURL()) == null) {
                return;
            }
            builder.addLink(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i, i2);
        }
    }

    private static final ParagraphStyle toParagraphStyle(AlignmentSpan alignmentSpan) {
        int iM6824getStarte0LSkKk;
        Layout.Alignment alignment = alignmentSpan.getAlignment();
        int i = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i == 1) {
            iM6824getStarte0LSkKk = TextAlign.INSTANCE.m6824getStarte0LSkKk();
        } else if (i == 2) {
            iM6824getStarte0LSkKk = TextAlign.INSTANCE.m6819getCentere0LSkKk();
        } else if (i == 3) {
            iM6824getStarte0LSkKk = TextAlign.INSTANCE.m6820getEnde0LSkKk();
        } else {
            iM6824getStarte0LSkKk = TextAlign.INSTANCE.m6825getUnspecifiede0LSkKk();
        }
        return new ParagraphStyle(iM6824getStarte0LSkKk, 0, 0L, (TextIndent) null, (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_POSITION_TYPE, (DefaultConstructorMarker) null);
    }

    private static final SpanStyle toSpanStyle(StyleSpan styleSpan) {
        int style = styleSpan.getStyle();
        if (style == 1) {
            return new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null);
        }
        if (style == 2) {
            return new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m6507boximpl(FontStyle.INSTANCE.m6516getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null);
        }
        if (style != 3) {
            return null;
        }
        return new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), FontStyle.m6507boximpl(FontStyle.INSTANCE.m6516getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan typefaceSpan) {
        GenericFontFamily serif;
        String family = typefaceSpan.getFamily();
        if (Intrinsics.areEqual(family, FontFamily.INSTANCE.getCursive().getName())) {
            serif = FontFamily.INSTANCE.getCursive();
        } else if (Intrinsics.areEqual(family, FontFamily.INSTANCE.getMonospace().getName())) {
            serif = FontFamily.INSTANCE.getMonospace();
        } else if (Intrinsics.areEqual(family, FontFamily.INSTANCE.getSansSerif().getName())) {
            serif = FontFamily.INSTANCE.getSansSerif();
        } else {
            serif = Intrinsics.areEqual(family, FontFamily.INSTANCE.getSerif().getName()) ? FontFamily.INSTANCE.getSerif() : optionalFontFamilyFromName(typefaceSpan.getFamily());
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, serif, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null);
    }

    private static final FontFamily optionalFontFamilyFromName(String str) {
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            if (Intrinsics.areEqual(typefaceCreate, Typeface.DEFAULT) || Intrinsics.areEqual(typefaceCreate, Typeface.create(Typeface.DEFAULT, 0))) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null) {
                return AndroidTypeface_androidKt.FontFamily(typefaceCreate);
            }
        }
        return null;
    }
}
