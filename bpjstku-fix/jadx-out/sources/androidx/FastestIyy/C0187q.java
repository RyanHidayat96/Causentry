package androidx.FastestIyy;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0187q implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f296a;

    public static void a() {
        D.a("com.zimperium.state.screen.capture", (Integer) 1);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "capture");
        } catch (JSONException unused) {
        }
        ((i0) i0.a()).b("com.zimperium.screen.capture", jSONObject.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT < 34 || activity.getApplicationContext().checkCallingOrSelfPermission("android.permission.DETECT_SCREEN_CAPTURE") != 0) {
                return;
            }
            if (this.f296a == null) {
                this.f296a = new Activity.ScreenCaptureCallback() { // from class: androidx.FastestIyy.q$$ExternalSyntheticLambda0
                    @Override // android.app.Activity.ScreenCaptureCallback
                    public final void onScreenCaptured() {
                        C0187q.a();
                    }
                };
            }
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), (Activity.ScreenCaptureCallback) this.f296a);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            if (Build.VERSION.SDK_INT < 34 || activity.getApplicationContext().checkCallingOrSelfPermission("android.permission.DETECT_SCREEN_CAPTURE") != 0) {
                return;
            }
            activity.unregisterScreenCaptureCallback((Activity.ScreenCaptureCallback) this.f296a);
        } catch (Exception unused) {
        }
    }
}
