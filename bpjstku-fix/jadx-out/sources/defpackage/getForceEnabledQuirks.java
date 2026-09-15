package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class getForceEnabledQuirks extends withQuirksForceDisabled {
    public getForceEnabledQuirks(getFlashType getflashtype) {
        super(getflashtype);
    }

    @Override // defpackage.forceDisableQuirks
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws NotFoundException, FormatException {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault1 < 48) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        StringBuilder sb = new StringBuilder();
        TuitionPaymentFragmentbindingInflater1(sb, 8);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b().TuitionPaymentFragmentbindingInflater1, 48, 2);
        sb.append("(393");
        sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(')');
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b().TuitionPaymentFragmentbindingInflater1, 50, 10);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 / 100 == 0) {
            sb.append('0');
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        sb.append(b().TuitionPaymentFragmentspecialinlinedviewModeldefault2(60, null).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return sb.toString();
    }
}
