package defpackage;

/* JADX INFO: loaded from: classes6.dex */
abstract class withQuirksForceDisabled extends forceDisableQuirks {
    withQuirksForceDisabled(getFlashType getflashtype) {
        super(getflashtype);
    }

    final void TuitionPaymentFragmentbindingInflater1(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb, i, length);
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b().TuitionPaymentFragmentbindingInflater1, (i3 * 10) + i, 10);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 100 == 0) {
                sb.append('0');
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(sb, i2);
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(StringBuilder sb, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 13; i3++) {
            int iCharAt = sb.charAt(i3 + i) - '0';
            if ((i3 & 1) == 0) {
                iCharAt *= 3;
            }
            i2 += iCharAt;
        }
        int i4 = 10 - (i2 % 10);
        sb.append(i4 != 10 ? i4 : 0);
    }
}
