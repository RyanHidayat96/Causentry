package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0014J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0014R\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", "p0", "", "p1", "p2", "Ljava/util/Locale;", "p3", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "nextBoundary", "(I)I", "prevBoundary", "getPrevWordBeginningOnTwoWordsBoundary", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "", "isAfterPunctuation", "(I)Z", "isOnPunctuation", "getBeginning", "(IZ)I", "getEnd", "isPunctuationStartBoundary", "isPunctuationEndBoundary", "isAfterLetterOrDigitOrEmoji", "isOnLetterOrDigitOrEmoji", "", "checkOffsetIsValid", "(I)V", "isBoundary", "isHiraganaKatakanaBoundary", "charSequence", "Ljava/lang/CharSequence;", "getCharSequence", "()Ljava/lang/CharSequence;", "start", "I", "end", "Ljava/text/BreakIterator;", "iterator", "Ljava/text/BreakIterator;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public WordIterator(CharSequence charSequence, int i, int i2, Locale locale) {
        this.charSequence = charSequence;
        if (i < 0 || i > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i - 50);
        this.end = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i, i2));
    }

    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int nextBoundary(int p0) {
        checkOffsetIsValid(p0);
        int iFollowing = this.iterator.following(p0);
        return (isOnLetterOrDigitOrEmoji(iFollowing + (-1)) && isOnLetterOrDigitOrEmoji(iFollowing) && !isHiraganaKatakanaBoundary(iFollowing)) ? nextBoundary(iFollowing) : iFollowing;
    }

    public final int prevBoundary(int p0) {
        checkOffsetIsValid(p0);
        int iPreceding = this.iterator.preceding(p0);
        return (isOnLetterOrDigitOrEmoji(iPreceding) && isAfterLetterOrDigitOrEmoji(iPreceding) && !isHiraganaKatakanaBoundary(iPreceding)) ? prevBoundary(iPreceding) : iPreceding;
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int p0) {
        return getBeginning(p0, true);
    }

    public final int getNextWordEndOnTwoWordBoundary(int p0) {
        return getEnd(p0, true);
    }

    public final int getPunctuationBeginning(int p0) {
        checkOffsetIsValid(p0);
        while (p0 != -1 && !isPunctuationStartBoundary(p0)) {
            p0 = prevBoundary(p0);
        }
        return p0;
    }

    public final int getPunctuationEnd(int p0) {
        checkOffsetIsValid(p0);
        while (p0 != -1 && !isPunctuationEndBoundary(p0)) {
            p0 = nextBoundary(p0);
        }
        return p0;
    }

    public final boolean isAfterPunctuation(int p0) {
        int i = this.start;
        if (p0 > this.end || i + 1 > p0) {
            return false;
        }
        return INSTANCE.isPunctuation$ui_text(Character.codePointBefore(this.charSequence, p0));
    }

    public final boolean isOnPunctuation(int p0) {
        int i = this.start;
        if (p0 >= this.end || i > p0) {
            return false;
        }
        return INSTANCE.isPunctuation$ui_text(Character.codePointAt(this.charSequence, p0));
    }

    private final int getBeginning(int p0, boolean p1) {
        checkOffsetIsValid(p0);
        if (isOnLetterOrDigitOrEmoji(p0)) {
            return (!isBoundary(p0) || (isAfterLetterOrDigitOrEmoji(p0) && p1)) ? prevBoundary(p0) : p0;
        }
        if (isAfterLetterOrDigitOrEmoji(p0)) {
            return prevBoundary(p0);
        }
        return -1;
    }

    private final int getEnd(int p0, boolean p1) {
        checkOffsetIsValid(p0);
        if (isAfterLetterOrDigitOrEmoji(p0)) {
            return (!isBoundary(p0) || (isOnLetterOrDigitOrEmoji(p0) && p1)) ? nextBoundary(p0) : p0;
        }
        if (isOnLetterOrDigitOrEmoji(p0)) {
            return nextBoundary(p0);
        }
        return -1;
    }

    private final boolean isPunctuationStartBoundary(int p0) {
        return isOnPunctuation(p0) && !isAfterPunctuation(p0);
    }

    private final boolean isPunctuationEndBoundary(int p0) {
        return !isOnPunctuation(p0) && isAfterPunctuation(p0);
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int p0) {
        int i = this.start;
        if (p0 > this.end || i + 1 > p0) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, p0))) {
            return true;
        }
        int i2 = p0 - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i2))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i2) != -1;
    }

    private final boolean isOnLetterOrDigitOrEmoji(int p0) {
        int i = this.start;
        if (p0 >= this.end || i > p0) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, p0)) || Character.isSurrogate(this.charSequence.charAt(p0))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, p0) != -1;
    }

    private final void checkOffsetIsValid(int p0) {
        int i = this.start;
        if (p0 > this.end || i > p0) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(p0);
            sb.append(". Valid range is [");
            sb.append(this.start);
            sb.append(" , ");
            sb.append(this.end);
            sb.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    private final boolean isBoundary(int p0) {
        checkOffsetIsValid(p0);
        if (!this.iterator.isBoundary(p0)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(p0) && isOnLetterOrDigitOrEmoji(p0 - 1) && isOnLetterOrDigitOrEmoji(p0 + 1)) {
            return false;
        }
        return p0 <= 0 || p0 >= this.charSequence.length() - 1 || !(isHiraganaKatakanaBoundary(p0) || isHiraganaKatakanaBoundary(p0 + 1));
    }

    private final boolean isHiraganaKatakanaBoundary(int p0) {
        int i = p0 - 1;
        if (Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(i)), Character.UnicodeBlock.HIRAGANA) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(p0)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(p0)), Character.UnicodeBlock.HIRAGANA) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "<init>", "()V", "", "p0", "", "isPunctuation$ui_text", "(I)Z", "WINDOW_WIDTH", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isPunctuation$ui_text(int p0) {
            int type = Character.getType(p0);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
