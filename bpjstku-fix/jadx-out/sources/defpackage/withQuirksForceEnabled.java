package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class withQuirksForceEnabled extends QuirkSettings1 {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String b;

    public withQuirksForceEnabled(getFlashType getflashtype, String str, String str2) {
        super(getflashtype);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.b = str;
    }

    @Override // defpackage.forceDisableQuirks
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws NotFoundException {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1 != 84) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        StringBuilder sb = new StringBuilder();
        TuitionPaymentFragmentbindingInflater1(sb, 8);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb, 48, 20);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b().TuitionPaymentFragmentbindingInflater1, 68, 16);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 38400) {
            sb.append('(');
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(')');
            int i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 % 32;
            int i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 32;
            int i3 = (i2 % 12) + 1;
            int i4 = i2 / 12;
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i3);
            if (i / 10 == 0) {
                sb.append('0');
            }
            sb.append(i);
        }
        return sb.toString();
    }

    @Override // defpackage.QuirkSettings1
    protected final void b(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.b);
        sb.append(i / AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        sb.append(')');
    }

    @Override // defpackage.QuirkSettings1
    protected final int b(int i) {
        return i % AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    }
}
