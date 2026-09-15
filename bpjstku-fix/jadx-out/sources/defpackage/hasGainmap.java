package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class hasGainmap implements Application.ActivityLifecycleCallbacks {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private onImageProxyAvailable TuitionPaymentFragmentbindingInflater1;
    private final getAppExecutor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final isAborted TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Bitmap2JpegBytesIn asBinder;
    private final LinkedList<onImageProxyAvailable> asInterface = new LinkedList<>();
    private final lambdatransform0androidxcameracoreimagecaptureCaptureNode<Activity> b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ActiveActivityTracker");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
    }

    public hasGainmap(lambdatransform0androidxcameracoreimagecaptureCaptureNode<Activity> lambdatransform0androidxcameracoreimagecapturecapturenode, getAppExecutor getappexecutor, Bitmap2JpegBytesIn bitmap2JpegBytesIn, isAborted isaborted) {
        this.b = lambdatransform0androidxcameracoreimagecapturecapturenode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getappexecutor;
        this.asBinder = bitmap2JpegBytesIn;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isaborted;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        onImageProxyAvailable onimageproxyavailableB = this.b.b(activity);
        if (onimageproxyavailableB.equals(this.TuitionPaymentFragmentbindingInflater1)) {
            return;
        }
        this.asInterface.addFirst(onimageproxyavailableB);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(onimageproxyavailableB);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.asInterface.remove(this.b.b(activity));
        if (this.asInterface.size() > 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface.peekFirst());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.asInterface.size() == 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onImageProxyAvailable onimageproxyavailable) {
        if (this.TuitionPaymentFragmentbindingInflater1 == onimageproxyavailable) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            if (onimageproxyavailable == null) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("unset current activity");
            } else {
                StringBuilder sb = new StringBuilder("set current activity to ");
                sb.append(onimageproxyavailable.TuitionPaymentFragmentbindingInflater1);
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
            }
        }
        if (onimageproxyavailable == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(null);
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(onimageproxyavailable.TuitionPaymentFragmentbindingInflater1);
        }
        this.TuitionPaymentFragmentbindingInflater1 = onimageproxyavailable;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activity));
    }
}
