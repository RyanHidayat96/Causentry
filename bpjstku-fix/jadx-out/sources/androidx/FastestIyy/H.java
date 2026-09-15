package androidx.FastestIyy;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class H extends AbstractC0201w implements SensorEventListener, Application.ActivityLifecycleCallbacks {
    public KeyguardManager b;
    public SensorManager c;
    public PowerManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioManager f262e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final F i;
    public final F j;
    public final F k;
    public final F l;
    public final F m;
    public final F n;
    public final F o;
    public final HashSet p;
    public boolean q;
    public long r;

    public H(Context context) {
        super(context);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new F();
        this.j = new F();
        this.k = new F();
        this.l = new F();
        this.m = new F();
        this.n = new F();
        this.o = new F();
        this.p = new HashSet();
        this.q = false;
        this.r = 0L;
    }

    public final void a() {
        a0.a(380, new b0() { // from class: androidx.FastestIyy.H$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(381, new b0() { // from class: androidx.FastestIyy.H$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(383, new b0() { // from class: androidx.FastestIyy.H$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
    }

    public final Object b(JSONArray jSONArray) {
        Intent intentRegisterReceiver = this.f301a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = -1;
        int intExtra2 = 1;
        if (intentRegisterReceiver != null) {
            intExtra = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            intExtra2 = intentRegisterReceiver.getIntExtra("scale", 1);
        }
        return Float.valueOf((intExtra / intExtra2) * 100.0f);
    }

    public final Object c(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.b != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("locked", this.i.a());
            jSONObject2.put("secured", this.j.a());
            jSONObject.put("keyguard", jSONObject2);
        }
        if (this.d != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("screenOn", this.k.a());
            jSONObject.put("power", jSONObject3);
        }
        if (this.c != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("used", this.l.a());
            jSONObject4.put("volume", this.m.a());
            jSONObject4.put("proximity", this.n.a());
            jSONObject4.put("orientation", this.o.a());
            jSONObject.put("sensor", jSONObject4);
        }
        return jSONObject;
    }

    public final Object d(JSONArray jSONArray) {
        jSONArray.optJSONObject(0);
        synchronized (this) {
            if (this.r != 0) {
                return new JSONObject();
            }
            this.f262e = (AudioManager) this.f301a.getSystemService("audio");
            this.c = (SensorManager) this.f301a.getSystemService("sensor");
            this.b = (KeyguardManager) this.f301a.getSystemService("keyguard");
            this.d = (PowerManager) this.f301a.getSystemService("power");
            SensorManager sensorManager = this.c;
            if (sensorManager != null) {
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(8), 3);
                SensorManager sensorManager2 = this.c;
                sensorManager2.registerListener(this, sensorManager2.getDefaultSensor(1), 3);
            }
            this.r = System.currentTimeMillis();
            Application application = (Application) this.f301a.getApplicationContext();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(this);
            }
            return new JSONObject();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
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
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        synchronized (this) {
            this.p.add(activity);
            SensorManager sensorManager = this.c;
            if (sensorManager != null && !this.q) {
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(8), 3);
                SensorManager sensorManager2 = this.c;
                sensorManager2.registerListener(this, sensorManager2.getDefaultSensor(1), 3);
                this.q = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        synchronized (this) {
            this.p.remove(activity);
            if (this.c != null && this.p.isEmpty() && this.q) {
                this.c.unregisterListener(this);
                this.c.unregisterListener(this);
                this.q = false;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        String str;
        F f = this.i;
        KeyguardManager keyguardManager = this.b;
        f.a(Boolean.valueOf(keyguardManager != null && (keyguardManager.isDeviceLocked() || this.b.isKeyguardLocked())));
        F f2 = this.m;
        JSONObject jSONObject = new JSONObject();
        if (this.f262e != null) {
            int[] iArr = {3, 4, 2, 5, 0, 1};
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    str = "Voice Call";
                } else if (i2 == 1) {
                    str = "System";
                } else if (i2 == 2) {
                    str = "Ring";
                } else if (i2 == 3) {
                    str = "Music";
                } else if (i2 != 4) {
                    str = i2 != 5 ? "Unknown" : "Notification";
                } else {
                    str = "Alarm";
                }
                try {
                    jSONObject.put(str, this.f262e.getStreamVolume(i2));
                } catch (JSONException unused) {
                }
            }
        }
        f2.a(jSONObject);
        F f3 = this.j;
        KeyguardManager keyguardManager2 = this.b;
        f3.a(Boolean.valueOf(keyguardManager2 != null && (keyguardManager2.isDeviceSecure() || this.b.isKeyguardSecure())));
        F f4 = this.k;
        PowerManager powerManager = this.d;
        f4.a(Boolean.valueOf(powerManager != null ? powerManager.isInteractive() : false));
        int type = sensorEvent.sensor.getType();
        if (type != 1) {
            if (type == 8) {
                float f5 = sensorEvent.values[0];
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("proximity", f5 < 2.0f);
                    jSONObject2.put("value", f5);
                    this.n.a(jSONObject2);
                    return;
                } catch (JSONException unused2) {
                    return;
                }
            }
            return;
        }
        float[] fArr = sensorEvent.values;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        this.f.add(Float.valueOf(f6));
        this.g.add(Float.valueOf(f7));
        this.h.add(Float.valueOf(f8));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.r >= 3000) {
            G g = new G(this.f);
            G g2 = new G(this.g);
            G g3 = new G(this.h);
            float f9 = ((g.f261a + g2.f261a) + g3.f261a) / 3.0f;
            float f10 = g3.b;
            String str2 = f10 > 6.0f ? EnabledPayment.STATUS_UP : f10 < -6.0f ? EnabledPayment.STATUS_DOWN : "sideways";
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("used", f9 >= 0.3f);
                jSONObject3.put("value", f9);
                this.l.a(jSONObject3);
            } catch (JSONException unused3) {
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("orientation", str2);
                jSONObject4.put("value", g3.b);
                this.o.a(jSONObject4);
            } catch (JSONException unused4) {
            }
            this.f.clear();
            this.g.clear();
            this.h.clear();
            this.r = jCurrentTimeMillis;
        }
    }
}
