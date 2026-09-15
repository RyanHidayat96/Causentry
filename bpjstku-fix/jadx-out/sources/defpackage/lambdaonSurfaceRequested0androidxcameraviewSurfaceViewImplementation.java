package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonSurfaceRequested0androidxcameraviewSurfaceViewImplementation implements tryToComplete {
    private SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final RotationProvider1 asBinder;
    private boolean b;

    public lambdaonSurfaceRequested0androidxcameraviewSurfaceViewImplementation(RotationProvider1 rotationProvider1) {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        this.asBinder = rotationProvider1;
        RotationProviderListenerWrapper rotationProviderListenerWrapperAsInterface = rotationProvider1.asInterface();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapperAsInterface;
        this.TuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapperAsInterface.head;
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapperAsInterface.head;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceViewImplementationSurfaceRequestCallback != null ? surfaceViewImplementationSurfaceRequestCallback.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // defpackage.tryToComplete
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.RotationProviderListenerWrapper r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L87
            boolean r3 = r8.b
            if (r3 != 0) goto L7b
            SurfaceViewImplementationSurfaceRequestCallback r3 = r8.TuitionPaymentFragmentbindingInflater1
            if (r3 == 0) goto L33
            RotationProviderListenerWrapper r4 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            SurfaceViewImplementationSurfaceRequestCallback r4 = r4.head
            if (r3 != r4) goto L27
            int r3 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            RotationProviderListenerWrapper r4 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            SurfaceViewImplementationSurfaceRequestCallback r4 = r4.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.pos
            if (r3 != r4) goto L27
            goto L33
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L33:
            if (r2 != 0) goto L36
            return r0
        L36:
            RotationProvider1 r0 = r8.asBinder
            long r1 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.asBinder(r1)
            if (r0 != 0) goto L46
            r9 = -1
            return r9
        L46:
            SurfaceViewImplementationSurfaceRequestCallback r0 = r8.TuitionPaymentFragmentbindingInflater1
            if (r0 != 0) goto L61
            RotationProviderListenerWrapper r0 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            SurfaceViewImplementationSurfaceRequestCallback r0 = r0.head
            if (r0 == 0) goto L61
            RotationProviderListenerWrapper r0 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            SurfaceViewImplementationSurfaceRequestCallback r0 = r0.head
            r8.TuitionPaymentFragmentbindingInflater1 = r0
            RotationProviderListenerWrapper r0 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            SurfaceViewImplementationSurfaceRequestCallback r0 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.pos
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r0
        L61:
            RotationProviderListenerWrapper r0 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            long r0 = r0.size
            long r2 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            RotationProviderListenerWrapper r2 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            long r4 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r3 = r9
            r6 = r10
            r2.b(r3, r4, r6)
            long r0 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            long r0 = r0 + r10
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r0
            return r10
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r0.concat(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdaonSurfaceRequested0androidxcameraviewSurfaceViewImplementation.read(RotationProviderListenerWrapper, long):long");
    }

    @Override // defpackage.tryToComplete
    public final cancelPreviousRequest timeout() {
        return this.asBinder.timeout();
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = true;
    }
}
