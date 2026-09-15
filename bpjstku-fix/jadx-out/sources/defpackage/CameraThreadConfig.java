package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CameraThreadConfig<E> extends hasConflict<E> {
    private final int TuitionPaymentFragmentbindingInflater1;
    private int b;

    protected abstract E b(int i);

    protected CameraThreadConfig(int i) {
        this(i, 0);
    }

    public CameraThreadConfig(int i, int i2) {
        if (i2 >= 0 && i2 <= i) {
            this.TuitionPaymentFragmentbindingInflater1 = i;
            this.b = i2;
            return;
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, i, FirebaseAnalytics.Param.INDEX));
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
