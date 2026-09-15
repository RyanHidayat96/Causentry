package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class createMediaMuxer<T> implements getBytesPerFrame<T> {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object b = new Object();
    public final AtomicLong TuitionPaymentFragmentbindingInflater1;
    public final AtomicLong TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AtomicReferenceArray<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f885a;
    private AtomicReferenceArray<Object> asBinder;
    private int asInterface;
    private int d;
    private int g;

    public createMediaMuxer(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.TuitionPaymentFragmentbindingInflater1 = atomicLong;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.asBinder = atomicReferenceArray;
        this.d = i2;
        this.g = Math.min(iNumberOfLeadingZeros / 4, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReferenceArray;
        this.asInterface = i2;
        this.f885a = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.asBinder;
        long j = this.TuitionPaymentFragmentbindingInflater1.get();
        int i = this.d;
        int i2 = ((int) j) & i;
        if (j >= this.f885a) {
            long j2 = ((long) this.g) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f885a = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.TuitionPaymentFragmentbindingInflater1.lazySet(j + 1);
                return true;
            }
            long j3 = 1 + j;
            if (atomicReferenceArray.get(((int) j3) & i) != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(atomicReferenceArray, j, i2, t, i);
                return true;
            }
            atomicReferenceArray.lazySet(i2, t);
            this.TuitionPaymentFragmentbindingInflater1.lazySet(j3);
            return true;
        }
        atomicReferenceArray.lazySet(i2, t);
        this.TuitionPaymentFragmentbindingInflater1.lazySet(j + 1);
        return true;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.asBinder = atomicReferenceArray2;
        this.f885a = (j2 + j) - 1;
        atomicReferenceArray2.lazySet(i, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i, b);
        this.TuitionPaymentFragmentbindingInflater1.lazySet(j + 1);
    }

    @Override // defpackage.getBytesPerFrame, defpackage.AudioSettingsBuilder
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        int i = this.asInterface;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == b;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.lazySet(j + 1);
        }
        return t2;
    }

    public final T b() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        int i = this.asInterface;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        if (t != b) {
            return t;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i2);
    }

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        while (true) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault2() == null && this.TuitionPaymentFragmentbindingInflater1.get() == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get()) {
                return;
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.asBinder;
        long j = this.TuitionPaymentFragmentbindingInflater1.get();
        int i = this.d;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) != null) {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.asBinder = atomicReferenceArray2;
            int i2 = ((int) j) & i;
            atomicReferenceArray2.lazySet(i2 + 1, t2);
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, b);
            this.TuitionPaymentFragmentbindingInflater1.lazySet(j2);
        } else {
            int i3 = ((int) j) & i;
            atomicReferenceArray.lazySet(i3 + 1, t2);
            atomicReferenceArray.lazySet(i3, t);
            this.TuitionPaymentFragmentbindingInflater1.lazySet(j2);
        }
        return true;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentbindingInflater1.get() == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
    }
}
