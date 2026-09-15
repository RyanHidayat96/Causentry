package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class addRequestCancellationListener {
    private static final String TuitionPaymentFragmentbindingInflater1;
    public List<TuitionPaymentFragmentspecialinlinedviewModeldefault3> b = new ArrayList();
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 12;
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("CalloutTable");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(isServiced isserviced) {
        if (isserviced == null) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            StringBuilder sb = new StringBuilder();
            sb.append(isserviced.asBinder);
            sb.append(isserviced.hashCode());
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Add segment %s (id=%d pid=%d) currTimeout=%s", sb.toString(), Long.valueOf(isserviced.asInterface), Long.valueOf(isserviced.a()), Long.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
        }
        synchronized (this.b) {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).TuitionPaymentFragmentbindingInflater1 >= j) {
                    this.b.get(i).TuitionPaymentFragmentbindingInflater1 -= j;
                    this.b.add(i, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(isserviced, j));
                    return;
                }
                j -= this.b.get(i).TuitionPaymentFragmentbindingInflater1;
            }
            this.b.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(isserviced, j));
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        synchronized (this.b) {
            if (this.b.size() > 0) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(isServiced isserviced) {
        if (isserviced == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(isserviced.asBinder);
        sb.append(isserviced.hashCode());
        String string = sb.toString();
        synchronized (this.b) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(string)) {
                    int i2 = i + 1;
                    if (i2 < this.b.size()) {
                        this.b.get(i2).TuitionPaymentFragmentbindingInflater1 += this.b.get(i).TuitionPaymentFragmentbindingInflater1;
                    } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.get(i).TuitionPaymentFragmentbindingInflater1;
                    }
                    return this.b.remove(i) != null;
                }
            }
            return false;
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(long j) {
        synchronized (this.b) {
            if (j == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > j) {
                if (this.b.size() > 0) {
                    this.b.get(0).TuitionPaymentFragmentbindingInflater1 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - j;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        synchronized (this.b) {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (j > 0) {
                long j2 = j - 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j2;
                return j2 == 0;
            }
            if (this.b.size() > 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.get(0);
                long j3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 - 1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = j3;
                if (j3 == 0) {
                    do {
                        this.b.remove(0);
                        if (this.b.size() <= 0) {
                            break;
                        }
                    } while (this.b.get(0).TuitionPaymentFragmentbindingInflater1 == 0);
                    return true;
                }
            }
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(";");
        String string = sb.toString();
        for (int i = 0; i < this.b.size(); i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(this.b.get(i).TuitionPaymentFragmentbindingInflater1);
            sb2.append(";");
            string = sb2.toString();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        long TuitionPaymentFragmentbindingInflater1;
        String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(isServiced isserviced, long j) {
            StringBuilder sb = new StringBuilder();
            sb.append(isserviced.asBinder);
            sb.append(isserviced.hashCode());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sb.toString();
            this.TuitionPaymentFragmentbindingInflater1 = j;
        }
    }
}
