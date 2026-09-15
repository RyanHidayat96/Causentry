package defpackage;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class getQuirkSettings<A, B> {
    public final getAdditionalTransformMatrixAppliedByProcessor<b<A>, B> TuitionPaymentFragmentbindingInflater1;

    public getQuirkSettings() {
        this(250L);
    }

    public getQuirkSettings(long j) {
        this.TuitionPaymentFragmentbindingInflater1 = new getAdditionalTransformMatrixAppliedByProcessor<b<A>, B>(j) { // from class: getQuirkSettings.2
            @Override // defpackage.getAdditionalTransformMatrixAppliedByProcessor
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, Object obj2) {
                b<?> bVar = (b) obj;
                Queue<b<?>> queue = b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                synchronized (queue) {
                    queue.offer(bVar);
                }
            }
        };
    }

    public final B TuitionPaymentFragmentbindingInflater1(A a2) {
        b<A> bVarTuitionPaymentFragmentbindingInflater1 = b.TuitionPaymentFragmentbindingInflater1(a2, 0, 0);
        B bTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bVarTuitionPaymentFragmentbindingInflater1);
        Queue<b<?>> queue = b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (queue) {
            queue.offer(bVarTuitionPaymentFragmentbindingInflater1);
        }
        return bTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final class b<A> {
        static final Queue<b<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        private int TuitionPaymentFragmentbindingInflater1;
        private A TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int b;

        public static <A> b<A> TuitionPaymentFragmentbindingInflater1(A a2, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            ((b) bVar).TuitionPaymentFragmentspecialinlinedviewModeldefault1 = a2;
            ((b) bVar).b = 0;
            ((b) bVar).TuitionPaymentFragmentbindingInflater1 = 0;
            return bVar;
        }

        private b() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.TuitionPaymentFragmentbindingInflater1 == bVar.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentbindingInflater1 * 31) + this.b) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }
    }
}
