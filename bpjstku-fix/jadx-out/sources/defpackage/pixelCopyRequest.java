package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\rR\"\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012"}, d2 = {"LpixelCopyRequest;", "", "<init>", "()V", "LSurfaceViewImplementationSurfaceRequestCallback;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LSurfaceViewImplementationSurfaceRequestCallback;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LSurfaceViewImplementationSurfaceRequestCallback;", "", "b", "I", "LSurfaceViewImplementationSurfaceRequestCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "Ljava/util/concurrent/atomic/AtomicReference;", "[Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class pixelCopyRequest {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static final AtomicReference<SurfaceViewImplementationSurfaceRequestCallback>[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final int b;
    public static final pixelCopyRequest INSTANCE = new pixelCopyRequest();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 65536;
    private static final SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SurfaceViewImplementationSurfaceRequestCallback(new byte[0], 0, 0, false, false);

    private pixelCopyRequest() {
    }

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference<SurfaceViewImplementationSurfaceRequestCallback>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = atomicReferenceArr;
    }

    @JvmStatic
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationSurfaceRequestCallback p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.next != null || p0.prev != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (p0.shared) {
            return;
        }
        AtomicReference<SurfaceViewImplementationSurfaceRequestCallback> atomicReference = TuitionPaymentFragmentspecialinlinedviewModeldefault2[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        SurfaceViewImplementationSurfaceRequestCallback andSet = atomicReference.getAndSet(surfaceViewImplementationSurfaceRequestCallback);
        if (andSet == surfaceViewImplementationSurfaceRequestCallback) {
            return;
        }
        int i = andSet != null ? andSet.limit : 0;
        if (i >= TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            atomicReference.set(andSet);
            return;
        }
        p0.next = andSet;
        p0.pos = 0;
        p0.limit = i + 8192;
        atomicReference.set(p0);
    }

    @JvmStatic
    public static final SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        AtomicReference<SurfaceViewImplementationSurfaceRequestCallback> atomicReference = TuitionPaymentFragmentspecialinlinedviewModeldefault2[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        SurfaceViewImplementationSurfaceRequestCallback andSet = atomicReference.getAndSet(surfaceViewImplementationSurfaceRequestCallback);
        if (andSet == surfaceViewImplementationSurfaceRequestCallback) {
            return new SurfaceViewImplementationSurfaceRequestCallback();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new SurfaceViewImplementationSurfaceRequestCallback();
        }
        atomicReference.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }
}
