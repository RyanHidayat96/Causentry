package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VirtualCamera implements Application.ActivityLifecycleCallbacks {
    static Double TuitionPaymentFragmentbindingInflater1;
    final MixpanelAPI TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final calculateOutConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f242a;
    private Runnable g;
    private final Handler asInterface = new Handler(Looper.getMainLooper());
    boolean b = false;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public VirtualCamera(MixpanelAPI mixpanelAPI, calculateOutConfig calculateoutconfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mixpanelAPI;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateoutconfig;
        if (TuitionPaymentFragmentbindingInflater1 == null) {
            TuitionPaymentFragmentbindingInflater1 = Double.valueOf(System.currentTimeMillis());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        Runnable runnable = this.g;
        if (runnable != null) {
            this.asInterface.removeCallbacks(runnable);
        }
        this.f242a = null;
        Handler handler = this.asInterface;
        Runnable runnable2 = new Runnable() { // from class: VirtualCamera.1
            @Override // java.lang.Runnable
            public final void run() {
                if (VirtualCamera.this.b && VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    VirtualCamera.this.b = false;
                    try {
                        double dCurrentTimeMillis = System.currentTimeMillis() - VirtualCamera.TuitionPaymentFragmentbindingInflater1.doubleValue();
                        if (dCurrentTimeMillis >= VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact && dCurrentTimeMillis < VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub && VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.booleanValue()) {
                            double dRound = Math.round((dCurrentTimeMillis / 1000.0d) * 10.0d) / 10.0d;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_session_length", dRound);
                            VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("$ae_total_app_sessions", 1.0d);
                            VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("$ae_total_app_session_length", dRound);
                            VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("$ae_session", jSONObject, true);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    MixpanelAPI mixpanelAPI = VirtualCamera.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g) {
                        mixpanelAPI.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                }
            }
        };
        this.g = runnable2;
        handler.postDelayed(runnable2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f242a = new WeakReference<>(activity);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        boolean z = this.b;
        this.b = true;
        Runnable runnable = this.g;
        if (runnable != null) {
            this.asInterface.removeCallbacks(runnable);
        }
        if (z) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1 = Double.valueOf(System.currentTimeMillis());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
    }
}
