package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class binderDied<K, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TuitionPaymentFragmentbindingInflater1<K> f347a;
    protected MediaSessionCompatCallbackCallbackHandler<A> b;
    public final List<b> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList(1);
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
    protected float TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0.0f;
    private A asBinder = null;
    private float d = -1.0f;
    private float TuitionPaymentFragmentbindingInflater1 = -1.0f;

    interface TuitionPaymentFragmentbindingInflater1<T> {
        onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        float TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f);

        float TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        boolean b();

        boolean b(float f);
    }

    public interface b {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    abstract A TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSkipToNext<K> onskiptonext, float f);

    binderDied(List<? extends onSkipToNext<K>> list) {
        TuitionPaymentFragmentbindingInflater1<K> tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        TuitionPaymentFragmentbindingInflater1<K> tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        byte b2 = 0;
        if (list.isEmpty()) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2<>(b2);
        } else {
            if (list.size() == 1) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3<>(list);
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(list);
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        this.f347a = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f) {
        if (this.f347a.b()) {
            return;
        }
        if (this.d == -1.0f) {
            this.d = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        float f2 = this.d;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.d = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            f = this.d;
        } else if (f > TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            f = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        if (f != this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f;
            if (this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(f)) {
                asBinder();
            }
        }
    }

    public void asBinder() {
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    protected final onSkipToNext<K> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        onSkipToNext<K> onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
        return onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return 0.0f;
        }
        onSkipToNext<K> onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
        if (onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder == null) {
            return 0.0f;
        }
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1()) / (onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3() - onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
    }

    float TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == -1.0f) {
            this.TuitionPaymentFragmentbindingInflater1 = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    public A asInterface() {
        float fTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        if (this.b == null && this.f347a.b(fTuitionPaymentFragmentbindingInflater1)) {
            return this.asBinder;
        }
        onSkipToNext<K> onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
        A aTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1, fTuitionPaymentFragmentbindingInflater1);
        this.asBinder = aTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return aTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final float b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaSessionCompatCallbackCallbackHandler<A> mediaSessionCompatCallbackCallbackHandler) {
        this.b = mediaSessionCompatCallbackCallbackHandler;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements TuitionPaymentFragmentbindingInflater1<T> {
        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final float TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return 0.0f;
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f) {
            return false;
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return 1.0f;
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean b() {
            return true;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte b) {
            this();
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            throw new IllegalStateException("not implemented");
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean b(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements TuitionPaymentFragmentbindingInflater1<T> {
        private float TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1.0f;
        private final onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean b() {
            return false;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<? extends onSkipToNext<T>> list) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list.get(0);
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f) {
            return !(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder == null);
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final float TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean b(float f) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == f) {
                return true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f;
            return false;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements TuitionPaymentFragmentbindingInflater1<T> {
        private final List<? extends onSkipToNext<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        private float b = -1.0f;
        private onSkipToNext<T> TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(0.0f);

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean b() {
            return false;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<? extends onSkipToNext<T>> list) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(float f) {
            onSkipToNext<T> onskiptonext = this.TuitionPaymentFragmentbindingInflater1;
            if (f >= onskiptonext.TuitionPaymentFragmentbindingInflater1() && f < onskiptonext.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                return !(this.TuitionPaymentFragmentbindingInflater1.asBinder == null);
            }
            this.TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(f);
            return true;
        }

        private onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f) {
            List<? extends onSkipToNext<T>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            onSkipToNext<T> onskiptonext = list.get(list.size() - 1);
            if (f >= onskiptonext.TuitionPaymentFragmentbindingInflater1()) {
                return onskiptonext;
            }
            for (int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 2; size > 0; size--) {
                onSkipToNext<T> onskiptonext2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size);
                if (this.TuitionPaymentFragmentbindingInflater1 != onskiptonext2 && f >= onskiptonext2.TuitionPaymentFragmentbindingInflater1() && f < onskiptonext2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    return onskiptonext2;
                }
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0);
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final onSkipToNext<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final float TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0).TuitionPaymentFragmentbindingInflater1();
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            List<? extends onSkipToNext<T>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return list.get(list.size() - 1).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // binderDied.TuitionPaymentFragmentbindingInflater1
        public final boolean b(float f) {
            onSkipToNext<T> onskiptonext = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            onSkipToNext<T> onskiptonext2 = this.TuitionPaymentFragmentbindingInflater1;
            if (onskiptonext == onskiptonext2 && this.b == f) {
                return true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onskiptonext2;
            this.b = f;
            return false;
        }
    }

    protected final float TuitionPaymentFragmentbindingInflater1() {
        onSkipToNext<K> onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.f347a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
        if (onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder == null) {
            return 0.0f;
        }
        return onskiptonextTuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder.getInterpolation(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }
}
