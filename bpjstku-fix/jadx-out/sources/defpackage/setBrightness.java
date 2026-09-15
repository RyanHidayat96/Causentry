package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e"}, d2 = {"LsetBrightness;", "LtryToComplete;", "p0", "Ljava/util/zip/Inflater;", "p1", "<init>", "(LtryToComplete;Ljava/util/zip/Inflater;)V", "LRotationProvider1;", "(LRotationProvider1;Ljava/util/zip/Inflater;)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "", "read", "(LRotationProviderListenerWrapper;J)J", "TuitionPaymentFragmentbindingInflater1", "", "b", "()Z", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "Ljava/util/zip/Inflater;", "LRotationProvider1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class setBrightness implements tryToComplete {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Inflater b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RotationProvider1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setBrightness(RotationProvider1 rotationProvider1, Inflater inflater) {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        Intrinsics.checkNotNullParameter(inflater, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProvider1;
        this.b = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setBrightness(tryToComplete trytocomplete, Inflater inflater) {
        this(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trytocomplete), inflater);
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        Intrinsics.checkNotNullParameter(inflater, "");
    }

    @Override // defpackage.tryToComplete
    public final long read(RotationProviderListenerWrapper p0, long p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        do {
            long jTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0, p1);
            if (jTuitionPaymentFragmentbindingInflater1 > 0) {
                return jTuitionPaymentFragmentbindingInflater1;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d());
        throw new EOFException("source exhausted prematurely");
    }

    public final long TuitionPaymentFragmentbindingInflater1(RotationProviderListenerWrapper p0, long p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
        }
        if (this.TuitionPaymentFragmentbindingInflater1) {
            throw new IllegalStateException("closed".toString());
        }
        if (p1 == 0) {
            return 0L;
        }
        try {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            int iMin = (int) Math.min(p1, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit);
            b();
            int iInflate = this.b.inflate(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, iMin);
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i != 0) {
                int remaining = i - this.b.getRemaining();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= remaining;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g(remaining);
            }
            if (iInflate > 0) {
                surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += iInflate;
                long j = iInflate;
                p0.size += j;
                return j;
            }
            if (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.pos == surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit) {
                p0.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean b() throws IOException {
        if (!this.b.needsInput()) {
            return false;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d()) {
            return true;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface().head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos;
        this.b.setInput(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return false;
    }

    @Override // defpackage.tryToComplete
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.timeout();
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.b.end();
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
    }
}
