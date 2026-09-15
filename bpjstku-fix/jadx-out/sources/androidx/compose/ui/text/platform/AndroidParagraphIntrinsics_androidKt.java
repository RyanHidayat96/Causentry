package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "p0", "Landroidx/compose/ui/text/intl/LocaleList;", "p1", "", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "resolveTextDirectionHeuristics", "", "Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "p2", "Landroidx/compose/ui/text/Placeholder;", "p3", "Landroidx/compose/ui/unit/Density;", "p4", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p5", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ActualParagraphIntrinsics", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "hasEmojiCompat"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidParagraphIntrinsics_androidKt {
    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m6659resolveTextDirectionHeuristicsHklW4sA$default(int i, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m6658resolveTextDirectionHeuristicsHklW4sA(i, localeList);
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m6658resolveTextDirectionHeuristicsHklW4sA(int i, LocaleList localeList) {
        Locale platformLocale;
        if (TextDirection.m6829equalsimpl0(i, TextDirection.INSTANCE.m6834getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m6829equalsimpl0(i, TextDirection.INSTANCE.m6835getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m6829equalsimpl0(i, TextDirection.INSTANCE.m6836getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m6829equalsimpl0(i, TextDirection.INSTANCE.m6837getRtls_7Xco())) {
            return 1;
        }
        if (TextDirection.m6829equalsimpl0(i, TextDirection.INSTANCE.m6833getContents_7Xco()) || TextDirection.m6829equalsimpl0(i, TextDirection.INSTANCE.m6838getUnspecifieds_7Xco())) {
            if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
                platformLocale = Locale.getDefault();
            }
            int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(platformLocale);
            return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
        }
        throw new IllegalStateException("Invalid TextDirection.".toString());
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        EmojiSupportMatch emojiSupportMatchM6224boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m6224boximpl(paragraphStyle.getEmojiSupportMatch());
        return !(emojiSupportMatchM6224boximpl == null ? false : EmojiSupportMatch.m6227equalsimpl0(emojiSupportMatchM6224boximpl.getValue(), EmojiSupportMatch.INSTANCE.m6233getNone_3YsG6Y()));
    }
}
