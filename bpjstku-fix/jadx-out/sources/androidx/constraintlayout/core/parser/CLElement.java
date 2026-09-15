package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;
    private final char[] mContent;
    private int mLine;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setLine(int i) {
        this.mLine = i;
    }

    public int getLine() {
        return this.mLine;
    }

    public void setStart(long j) {
        this.mStart = j;
    }

    public long getStart() {
        return this.mStart;
    }

    public long getEnd() {
        return this.mEnd;
    }

    public void setEnd(long j) {
        if (this.mEnd == Long.MAX_VALUE) {
            this.mEnd = j;
            if (CLParser.sDebug) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("closing ");
                sb.append(hashCode());
                sb.append(" -> ");
                sb.append(this);
                printStream.println(sb.toString());
            }
            CLContainer cLContainer = this.mContainer;
            if (cLContainer != null) {
                cLContainer.add(this);
            }
        }
    }

    protected void addIndent(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    public String toString() {
        long j = this.mStart;
        long j2 = this.mEnd;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.mStart);
            sb.append("-");
            sb.append(this.mEnd);
            sb.append(")");
            return sb.toString();
        }
        String strSubstring = new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getStrClass());
        sb2.append(" (");
        sb2.append(this.mStart);
        sb2.append(" : ");
        sb2.append(this.mEnd);
        sb2.append(") <<");
        sb2.append(strSubstring);
        sb2.append(">>");
        return sb2.toString();
    }

    protected String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    protected String getDebugName() {
        if (CLParser.sDebug) {
            StringBuilder sb = new StringBuilder();
            sb.append(getStrClass());
            sb.append(" -> ");
            return sb.toString();
        }
        return "";
    }

    public String content() {
        String str = new String(this.mContent);
        if (str.length() <= 0) {
            return "";
        }
        long j = this.mEnd;
        if (j != Long.MAX_VALUE) {
            long j2 = this.mStart;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        int i = (int) this.mStart;
        return str.substring(i, i + 1);
    }

    public boolean hasContent() {
        char[] cArr = this.mContent;
        return cArr != null && cArr.length > 0;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    protected String toJSON() {
        return "";
    }

    protected String toFormattedJSON(int i, int i2) {
        return "";
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.mLine == cLElement.mLine && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.mContent);
        long j = this.mStart;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.mEnd;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        CLContainer cLContainer = this.mContainer;
        return (((((((iHashCode * 31) + i) * 31) + i2) * 31) + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.mLine;
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public CLElement mo7195clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
