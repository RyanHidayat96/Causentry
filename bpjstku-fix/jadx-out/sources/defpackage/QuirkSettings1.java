package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* JADX INFO: loaded from: classes6.dex */
abstract class QuirkSettings1 extends withQuirksForceDisabled {
    protected abstract int b(int i);

    protected abstract void b(StringBuilder sb, int i);

    QuirkSettings1(getFlashType getflashtype) {
        super(getflashtype);
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringBuilder sb, int i, int i2) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b().TuitionPaymentFragmentbindingInflater1, i, i2);
        b(sb, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int iB = b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i3 = AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iB / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iB);
    }
}
