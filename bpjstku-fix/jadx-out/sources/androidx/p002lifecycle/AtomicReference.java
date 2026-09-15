package androidx.p002lifecycle;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/lifecycle/AtomicReference;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "p0", "<init>", "(Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "p1", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "base", "Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AtomicReference<V> {
    private final java.util.concurrent.atomic.AtomicReference<V> base;

    public AtomicReference(V v) {
        this.base = new java.util.concurrent.atomic.AtomicReference<>(v);
    }

    public final V get() {
        return this.base.get();
    }

    public final boolean compareAndSet(V p0, V p1) {
        return PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.base, p0, p1);
    }
}
