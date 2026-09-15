package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatApi26SubscriptionCallbackProxy extends MediaBrowserCompatApi23ItemCallback {
    private SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1;
    private RotationProvider1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Function0<? extends File> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final MediaBrowserCompatApi23ItemCallback.TuitionPaymentFragmentbindingInflater1 b;

    @Override // defpackage.MediaBrowserCompatApi23ItemCallback
    public final MediaBrowserCompatApi23ItemCallback.TuitionPaymentFragmentbindingInflater1 b() {
        return this.b;
    }

    public MediaBrowserCompatApi26SubscriptionCallbackProxy(RotationProvider1 rotationProvider1, Function0<? extends File> function0, MediaBrowserCompatApi23ItemCallback.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(null);
        this.b = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProvider1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            RotationProvider1 rotationProvider1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (rotationProvider1 != null) {
                getRatingType.b(rotationProvider1);
            }
        }
    }

    @Override // defpackage.MediaBrowserCompatApi23ItemCallback
    public final RotationProvider1 TuitionPaymentFragmentbindingInflater1() {
        synchronized (this) {
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                RotationProvider1 rotationProvider1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (rotationProvider1 != null) {
                    return rotationProvider1;
                }
                animateToFullOpacity animatetofullopacity = animateToFullOpacity.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNull(null);
                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                return rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            throw new IllegalStateException("closed".toString());
        }
    }
}
