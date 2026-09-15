package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes5.dex */
public class CLToken extends CLElement {
    int mIndex;
    char[] mTokenFalse;
    char[] mTokenNull;
    char[] mTokenTrue;
    Type mType;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public boolean getBoolean() throws CLParsingException {
        if (this.mType == Type.TRUE) {
            return true;
        }
        if (this.mType == Type.FALSE) {
            return false;
        }
        StringBuilder sb = new StringBuilder("this token is not a boolean: <");
        sb.append(content());
        sb.append(">");
        throw new CLParsingException(sb.toString(), this);
    }

    public boolean isNull() throws CLParsingException {
        if (this.mType == Type.NULL) {
            return true;
        }
        StringBuilder sb = new StringBuilder("this token is not a null: <");
        sb.append(content());
        sb.append(">");
        throw new CLParsingException(sb.toString(), this);
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.mIndex = 0;
        this.mType = Type.UNKNOWN;
        this.mTokenTrue = "true".toCharArray();
        this.mTokenFalse = "false".toCharArray();
        this.mTokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        if (CLParser.sDebug) {
            StringBuilder sb = new StringBuilder("<");
            sb.append(content());
            sb.append(">");
            return sb.toString();
        }
        return content();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(content());
        return sb.toString();
    }

    public Type getType() {
        return this.mType;
    }

    public boolean validate(char c, long j) {
        int iOrdinal = this.mType.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            char[] cArr = this.mTokenTrue;
            int i = this.mIndex;
            if (cArr[i] == c) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i] == c) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i] == c) {
                this.mType = Type.NULL;
            }
            z = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.mTokenTrue;
            int i2 = this.mIndex;
            z = cArr2[i2] == c;
            if (z) {
                if (i2 + 1 == cArr2.length) {
                    setEnd(j);
                }
                z = true;
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.mTokenFalse;
            int i3 = this.mIndex;
            z = cArr3[i3] == c;
            if (z) {
                if (i3 + 1 == cArr3.length) {
                    setEnd(j);
                }
                z = true;
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.mTokenNull;
            int i4 = this.mIndex;
            z = cArr4[i4] == c;
            if (z) {
                if (i4 + 1 == cArr4.length) {
                    setEnd(j);
                }
                z = true;
            }
        }
        this.mIndex++;
        return z;
    }
}
