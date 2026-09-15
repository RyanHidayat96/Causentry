package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdatransform1androidxcameracoreimagecaptureCaptureNode implements Application.ActivityLifecycleCallbacks {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final lambdatransform0androidxcameracoreimagecaptureCaptureNode<Activity> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final LinkedHashSet<lambdareleaseInputResources4> TuitionPaymentFragmentbindingInflater1 = new LinkedHashSet<>();
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
    private final Set<onImageProxyAvailable> b = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ApplicationStateTracker");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public lambdatransform1androidxcameracoreimagecaptureCaptureNode(lambdatransform0androidxcameracoreimagecaptureCaptureNode<Activity> lambdatransform0androidxcameracoreimagecapturecapturenode) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdatransform0androidxcameracoreimagecapturecapturenode;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.b.add(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(activity));
        if (this.b.size() != 1 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("app returns to foreground");
        }
        Iterator<lambdareleaseInputResources4> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activity.isChangingConfigurations();
        this.b.remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(activity));
        if (!this.b.isEmpty() || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("app goes into background");
        }
        Iterator<lambdareleaseInputResources4> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
        while (it.hasNext()) {
            it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.b.add(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(activity));
    }
}
