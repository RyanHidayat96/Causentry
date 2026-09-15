package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0004\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u0002*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/style/TextAlign;", "p0", "", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutAlign", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutHyphenationFrequency", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutBreakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "toLayoutLineBreakWordStyle", "Landroidx/compose/ui/text/android/TextLayout;", "numberOfLinesThatFitMaxHeight", "(Landroidx/compose/ui/text/android/TextLayout;I)I", "Landroidx/compose/ui/text/TextStyle;", "", "p1", "shouldAttachIndentationFixSpan", "(Landroidx/compose/ui/text/TextStyle;Z)Z", "", "attachIndentationFixSpan", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "toLayoutTextGranularity"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m6203toLayoutAlignaXe7zB0(int i) {
        if (TextAlign.m6815equalsimpl0(i, TextAlign.INSTANCE.m6822getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m6815equalsimpl0(i, TextAlign.INSTANCE.m6823getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m6815equalsimpl0(i, TextAlign.INSTANCE.m6819getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m6815equalsimpl0(i, TextAlign.INSTANCE.m6824getStarte0LSkKk()) && TextAlign.m6815equalsimpl0(i, TextAlign.INSTANCE.m6820getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m6205toLayoutHyphenationFrequency3fSNIE(int i) {
        if (Hyphens.m6713equalsimpl0(i, Hyphens.INSTANCE.m6717getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m6713equalsimpl0(i, Hyphens.INSTANCE.m6718getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m6204toLayoutBreakStrategyxImikfE(int i) {
        if (LineBreak.Strategy.m6744equalsimpl0(i, LineBreak.Strategy.INSTANCE.m6750getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m6744equalsimpl0(i, LineBreak.Strategy.INSTANCE.m6749getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m6744equalsimpl0(i, LineBreak.Strategy.INSTANCE.m6748getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m6206toLayoutLineBreakStylehpcqdu8(int i) {
        if (LineBreak.Strictness.m6755equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6759getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m6755equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6760getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m6755equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6761getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m6755equalsimpl0(i, LineBreak.Strictness.INSTANCE.m6762getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m6207toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return (!LineBreak.WordBreak.m6767equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m6771getDefaultjp8hJ3c()) && LineBreak.WordBreak.m6767equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m6772getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return (!z || TextUnit.m7126equalsimpl0(textStyle.m6433getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m7126equalsimpl0(textStyle.m6433getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m7140getUnspecifiedXSAIIZE()) || TextAlign.m6815equalsimpl0(textStyle.m6438getTextAligne0LSkKk(), TextAlign.INSTANCE.m6825getUnspecifiede0LSkKk()) || TextAlign.m6815equalsimpl0(textStyle.m6438getTextAligne0LSkKk(), TextAlign.INSTANCE.m6824getStarte0LSkKk()) || TextAlign.m6815equalsimpl0(textStyle.m6438getTextAligne0LSkKk(), TextAlign.INSTANCE.m6821getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m6208toLayoutTextGranularityduNsdkg(int i) {
        return (!TextGranularity.m6355equalsimpl0(i, TextGranularity.INSTANCE.m6359getCharacterDRrd7Zo()) && TextGranularity.m6355equalsimpl0(i, TextGranularity.INSTANCE.m6360getWordDRrd7Zo())) ? 1 : 0;
    }
}
