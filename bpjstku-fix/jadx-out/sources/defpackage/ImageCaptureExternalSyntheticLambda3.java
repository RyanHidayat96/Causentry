package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageCaptureExternalSyntheticLambda3 implements Application.ActivityLifecycleCallbacks {
    private final AtomicInteger TuitionPaymentFragmentbindingInflater1;
    private final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final AtomicInteger b;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        void TuitionPaymentFragmentbindingInflater1();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public ImageCaptureExternalSyntheticLambda3(TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentbindingInflater1 = new AtomicInteger(0);
        this.b = new AtomicInteger(0);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicBoolean(true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicBoolean(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.TuitionPaymentFragmentbindingInflater1.decrementAndGet() != 0 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(true)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.b.incrementAndGet() == 1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(false)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.b.decrementAndGet() == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.TuitionPaymentFragmentbindingInflater1.incrementAndGet() == 1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(false)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }
}
