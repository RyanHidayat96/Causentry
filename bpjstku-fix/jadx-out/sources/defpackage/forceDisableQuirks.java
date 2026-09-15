package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class forceDisableQuirks {
    private final observe TuitionPaymentFragmentbindingInflater1;
    private final getFlashType TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws NotFoundException, FormatException;

    forceDisableQuirks(getFlashType getflashtype) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getflashtype;
        this.TuitionPaymentFragmentbindingInflater1 = new observe(getflashtype);
    }

    protected final getFlashType TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    protected final observe b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
