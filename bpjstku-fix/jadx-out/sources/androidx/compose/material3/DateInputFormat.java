package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Landroidx/compose/material3/DateInputFormat;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;C)V", "component1", "()Ljava/lang/String;", "component2", "()C", "copy", "(Ljava/lang/String;C)Landroidx/compose/material3/DateInputFormat;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "delimiter", "C", "getDelimiter", "patternWithDelimiters", "Ljava/lang/String;", "getPatternWithDelimiters", "patternWithoutDelimiters", "getPatternWithoutDelimiters"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    public DateInputFormat(String str, char c) {
        this.patternWithDelimiters = str;
        this.delimiter = c;
        this.patternWithoutDelimiters = StringsKt.replace$default(str, String.valueOf(c), "", false, 4, (Object) null);
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i & 2) != 0) {
            c = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final char getDelimiter() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String p0, char p1) {
        return new DateInputFormat(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) p0;
        return Intrinsics.areEqual(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + Character.hashCode(this.delimiter);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateInputFormat(patternWithDelimiters=");
        sb.append(this.patternWithDelimiters);
        sb.append(", delimiter=");
        sb.append(this.delimiter);
        sb.append(')');
        return sb.toString();
    }
}
