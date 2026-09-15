package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class getMinInputChannelCount<T> {
    private int TuitionPaymentFragmentbindingInflater1;
    private Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int b = 4;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends findQualityInTargetQualities<T> {
        @Override // defpackage.findQualityInTargetQualities
        boolean b(T t);
    }

    public getMinInputChannelCount() {
        Object[] objArr = new Object[5];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = objArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = objArr;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        int i = this.b;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i] = objArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = objArr;
            i2 = 0;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2] = t;
        this.TuitionPaymentFragmentbindingInflater1 = i2 + 1;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2<? super T> tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        int i = this.b;
        for (Object[] objArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3; objArr != null; objArr = (Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.b(obj)) {
                        return;
                    }
                }
            }
        }
    }
}
