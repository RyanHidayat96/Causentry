package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class orientationToSurfaceRotation implements Closeable {
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final ReentrantLock TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ReentrantLock();
    int b;

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException;

    protected abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, byte[] bArr, int i, int i2) throws IOException;

    protected abstract long TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException;

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, byte[] bArr, int i, int i2) throws IOException;

    protected abstract void b() throws IOException;

    public orientationToSurfaceRotation(boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        ReentrantLock reentrantLock = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        reentrantLock.lock();
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() throws IOException {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        reentrantLock.lock();
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final tryToComplete TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) throws IOException {
        ReentrantLock reentrantLock = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        reentrantLock.lock();
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new IllegalStateException("closed".toString());
            }
            this.b++;
            reentrantLock.unlock();
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) throws IOException {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        reentrantLock.lock();
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new IllegalStateException("closed".toString());
            }
            this.b++;
            reentrantLock.unlock();
            return new b(this, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        reentrantLock.lock();
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                reentrantLock.unlock();
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            if (this.b != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class b implements SurfaceViewImplementationApi24Impl {
        private final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(orientationToSurfaceRotation orientationtosurfacerotation, long j) {
            Intrinsics.checkNotNullParameter(orientationtosurfacerotation, "");
            this.TuitionPaymentFragmentbindingInflater1 = orientationtosurfacerotation;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                throw new IllegalStateException("closed".toString());
            }
            orientationToSurfaceRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, rotationProviderListenerWrapper, j);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 += j;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                throw new IllegalStateException("closed".toString());
            }
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return cancelPreviousRequest.NONE;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            ReentrantLock reentrantLock = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            reentrantLock.lock();
            try {
                this.TuitionPaymentFragmentbindingInflater1.b--;
                if (this.TuitionPaymentFragmentbindingInflater1.b == 0 && this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    this.TuitionPaymentFragmentbindingInflater1.b();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements tryToComplete {
        private final orientationToSurfaceRotation TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private long b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(orientationToSurfaceRotation orientationtosurfacerotation, long j) {
            Intrinsics.checkNotNullParameter(orientationtosurfacerotation, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = orientationtosurfacerotation;
            this.b = j;
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IllegalStateException("closed".toString());
            }
            long jTuitionPaymentFragmentbindingInflater1 = orientationToSurfaceRotation.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, rotationProviderListenerWrapper, j);
            if (jTuitionPaymentFragmentbindingInflater1 != -1) {
                this.b += jTuitionPaymentFragmentbindingInflater1;
            }
            return jTuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.tryToComplete
        public final cancelPreviousRequest timeout() {
            return cancelPreviousRequest.NONE;
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            ReentrantLock reentrantLock = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            reentrantLock.lock();
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b--;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
                    return;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public static final /* synthetic */ long TuitionPaymentFragmentbindingInflater1(orientationToSurfaceRotation orientationtosurfacerotation, long j, RotationProviderListenerWrapper rotationProviderListenerWrapper, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)).toString());
        }
        long j3 = j2 + j;
        long j4 = j;
        while (j4 < j3) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = orientationtosurfacerotation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j4, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, (int) Math.min(j3 - j4, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit));
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
                if (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.pos == surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit) {
                    rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                if (j != j4) {
                    break;
                }
                return -1L;
            }
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            long j5 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            j4 += j5;
            rotationProviderListenerWrapper.size += j5;
        }
        return j4 - j;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(orientationToSurfaceRotation orientationtosurfacerotation, long j, RotationProviderListenerWrapper rotationProviderListenerWrapper, long j2) throws IOException {
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper.size, 0L, j2);
        long j3 = j2 + j;
        while (j < j3) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            int iMin = (int) Math.min(j3 - j, surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            orientationtosurfacerotation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j, surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, iMin);
            surfaceViewImplementationSurfaceRequestCallback.pos += iMin;
            long j4 = iMin;
            j += j4;
            rotationProviderListenerWrapper.size -= j4;
            if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
                rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            }
        }
    }
}
