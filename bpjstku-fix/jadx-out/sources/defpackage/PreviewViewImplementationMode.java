package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public class PreviewViewImplementationMode extends stopListeningToDisplayChange {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public PreviewViewImplementationMode(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    protected final String onTransact() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.stopListeningToDisplayChange
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i == -1) {
            return false;
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        return false;
    }

    @Override // defpackage.stopListeningToDisplayChange
    public int cancel() {
        char cCharAt;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i == -1) {
            return i;
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        return i;
    }

    @Override // defpackage.stopListeningToDisplayChange
    public void TuitionPaymentFragmentbindingInflater1(char c) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == -1) {
            b(c);
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                if (cCharAt == c) {
                    return;
                } else {
                    b(c);
                }
            }
            i = i2;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
        b(c);
    }

    @Override // defpackage.stopListeningToDisplayChange
    public final String b() {
        TuitionPaymentFragmentbindingInflater1(Typography.quote);
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Typography.quote, i, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            a();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i2 = i; i2 < iIndexOf$default; i2++) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.charAt(i2) == '\\') {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i2);
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIndexOf$default + 1;
        String strSubstring = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.substring(i, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    @Override // defpackage.stopListeningToDisplayChange
    public final String b(String str, boolean z) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        try {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1() == 6 && Intrinsics.areEqual(TuitionPaymentFragmentspecialinlinedviewModeldefault1(z), str)) {
                d();
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1() == 5) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
                }
            }
            return null;
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            d();
        }
    }

    @Override // defpackage.stopListeningToDisplayChange
    public byte TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
                if (cCharAt < '~') {
                    return getImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3[cCharAt];
                }
                return (byte) 0;
            }
            i = i2;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str.length();
        return (byte) 10;
    }

    @Override // defpackage.stopListeningToDisplayChange
    public final /* synthetic */ CharSequence asInterface() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.stopListeningToDisplayChange
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length()) {
            return i;
        }
        return -1;
    }
}
