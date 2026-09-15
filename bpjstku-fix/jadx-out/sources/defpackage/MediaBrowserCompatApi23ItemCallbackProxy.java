package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatApi23ItemCallbackProxy extends MediaBrowserCompatApi23ItemCallback {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final animateToFullOpacity TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Closeable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final MediaBrowserCompatApi23ItemCallback.TuitionPaymentFragmentbindingInflater1 asBinder;
    private RotationProvider1 asInterface;
    private boolean b;

    private animateToFullOpacity TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.MediaBrowserCompatApi23ItemCallback
    public final MediaBrowserCompatApi23ItemCallback.TuitionPaymentFragmentbindingInflater1 b() {
        return this.asBinder;
    }

    public MediaBrowserCompatApi23ItemCallbackProxy(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity animatetofullopacity, String str, Closeable closeable) {
        super(null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = surfaceViewImplementationExternalSyntheticLambda1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = animatetofullopacity;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = closeable;
        this.asBinder = null;
    }

    @Override // defpackage.MediaBrowserCompatApi23ItemCallback
    public final RotationProvider1 TuitionPaymentFragmentbindingInflater1() {
        synchronized (this) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            RotationProvider1 rotationProvider1 = this.asInterface;
            if (rotationProvider1 != null) {
                return rotationProvider1;
            }
            RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            this.asInterface = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.b = true;
            RotationProvider1 rotationProvider1 = this.asInterface;
            if (rotationProvider1 != null) {
                getRatingType.b(rotationProvider1);
            }
            Closeable closeable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (closeable != null) {
                getRatingType.b(closeable);
            }
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.b) {
            throw new IllegalStateException("closed".toString());
        }
    }
}
