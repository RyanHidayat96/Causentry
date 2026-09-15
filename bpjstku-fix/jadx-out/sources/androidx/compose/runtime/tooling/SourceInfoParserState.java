package androidx.compose.runtime.tooling;

import com.google.firebase.messaging.Constants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\"\u0010!\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/tooling/SourceInfoParserState;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "expect", "(C)V", "", "throwParseError", "(Ljava/lang/String;)Ljava/lang/Void;", "", "matches", "(C)Z", "", "takeIntUntil", "(Ljava/lang/String;)I", "takeUntil", "(Ljava/lang/String;)Ljava/lang/String;", "takeUntilEnd", "()Ljava/lang/String;", "skipUntil", "advance", "(I)V", "current", "()C", "atEnd", "()Z", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/lang/String;", "getData", "i", "I", "getI", "()I", "setI"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SourceInfoParserState {
    private final String data;
    private int i;

    public SourceInfoParserState(String str) {
        this.data = str;
    }

    public final String getData() {
        return this.data;
    }

    public final int getI() {
        return this.i;
    }

    public final void setI(int i) {
        this.i = i;
    }

    public final void expect(char p0) throws ParseException {
        if (matches(p0)) {
            return;
        }
        throwParseError("expected ".concat(String.valueOf(p0)));
        throw new KotlinNothingValueException();
    }

    public final Void throwParseError(String p0) throws ParseException {
        int iMin = Math.min(this.i, this.data.length());
        StringBuilder sb = new StringBuilder("Error while parsing source information: ");
        sb.append(p0);
        sb.append(" at ");
        String strSubstring = this.data.substring(0, iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        sb.append('|');
        String strSubstring2 = this.data.substring(iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        throw new ParseException(sb.toString());
    }

    public final boolean matches(char p0) {
        return this.i < this.data.length() && this.data.charAt(this.i) == p0;
    }

    public final int takeIntUntil(String p0) throws ParseException {
        Integer intOrNull = StringsKt.toIntOrNull(takeUntil(p0));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throwParseError("expected int");
        throw new KotlinNothingValueException();
    }

    public final String takeUntil(String p0) {
        int i = this.i;
        skipUntil(p0);
        int i2 = this.i;
        if (i2 <= i) {
            return "";
        }
        String strSubstring = this.data.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final String takeUntilEnd() {
        String str = this.data;
        String strSubstring = str.substring(this.i, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final void skipUntil(String p0) {
        while (this.i < this.data.length() && !StringsKt.contains$default((CharSequence) p0, this.data.charAt(this.i), false, 2, (Object) null)) {
            this.i++;
        }
    }

    public static /* synthetic */ void advance$default(SourceInfoParserState sourceInfoParserState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        sourceInfoParserState.advance(i);
    }

    public final void advance(int p0) {
        this.i += p0;
    }

    public final char current() {
        return this.data.charAt(this.i);
    }

    public final boolean atEnd() {
        return this.i >= this.data.length();
    }
}
