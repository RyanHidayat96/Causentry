package defpackage;

import com.midtrans.sdk.corekit.models.snap.Installment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class findCloserAspectRatio {
    public ArrayList<Integer> TuitionPaymentFragmentbindingInflater1 = new ArrayList<>();
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Installment TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public int b;

    public final ArrayList<Integer> b(String str) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return null;
        }
        for (String str2 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTerms().keySet()) {
            if (str2.equals(str)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                this.TuitionPaymentFragmentbindingInflater1.clear();
                this.TuitionPaymentFragmentbindingInflater1.add(0, 0);
                this.TuitionPaymentFragmentbindingInflater1.addAll(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTerms().get(str2));
                return this.TuitionPaymentFragmentbindingInflater1;
            }
        }
        return null;
    }
}
