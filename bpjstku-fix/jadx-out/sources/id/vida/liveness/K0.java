package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import defpackage.initSession;
import id.vida.liveness.dto.ValidateResponseDTO;
import id.vida.liveness.listeners.ServiceResponseListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class K0 extends AbstractC0775y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static K0 f1037a;

    private static /* synthetic */ Response.ErrorListener $liveness$C81801476(final K0 k0, final ServiceResponseListener serviceResponseListener) {
        return new Response.ErrorListener() { // from class: id.vida.liveness.K0$$ExternalSyntheticLambda2
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                this.f$0.a(serviceResponseListener, volleyError);
            }
        };
    }

    private static /* synthetic */ Response.Listener $liveness$Ca93beeb3(final K0 k0, final ServiceResponseListener serviceResponseListener, final String str) {
        return new Response.Listener() { // from class: id.vida.liveness.K0$$ExternalSyntheticLambda0
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                this.f$0.a(serviceResponseListener, str, (String) obj);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$Cebafc583(final K0 k0, final VolleyError volleyError, final ServiceResponseListener serviceResponseListener) {
        return new Runnable() { // from class: id.vida.liveness.K0$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(volleyError, serviceResponseListener);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$Cefe724c6(final K0 k0, final String str, final ServiceResponseListener serviceResponseListener, final String str2) {
        return new Runnable() { // from class: id.vida.liveness.K0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, serviceResponseListener, str2);
            }
        };
    }

    public K0(Context context) {
        super(context);
    }

    public static native K0 getInstance(Context context);

    public final native String a();

    public final native String a(JSONObject jSONObject);

    public final native /* synthetic */ void a(VolleyError volleyError, ServiceResponseListener serviceResponseListener);

    public final native /* synthetic */ void a(ServiceResponseListener serviceResponseListener, VolleyError volleyError);

    public final native /* synthetic */ void a(ServiceResponseListener serviceResponseListener, String str, String str2);

    public final native /* synthetic */ void a(String str, ServiceResponseListener serviceResponseListener, String str2);

    public final native void validatePartnerCredentials(String str, String str2, String str3, String str4, String str5, String str6, ServiceResponseListener<ValidateResponseDTO> serviceResponseListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = K0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3414), Color.argb(0, 0, 0, 0) + 1559, 24 - (ViewConfiguration.getTouchSlop() >> 8), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -827782703, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -827782703};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042), 3112 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-16777194) - Color.rgb(0, 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 518, View.resolveSizeAndState(0, 0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i4};
                int[] iArr2 = {i5};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = 1522280006 + (((~((-37831779) | startUptimeMillis)) | 1058 | (~(1667199680 | startUptimeMillis))) * (-754));
                int i7 = ~((-1059) | startUptimeMillis);
                int i8 = ~startUptimeMillis;
                int i9 = i3 + i6 + ((i7 | (~(1667200738 | i8))) * (-754)) + ((i8 | (-37831779)) * 754);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i12 = ((int[]) objArr4[0])[0];
                int i13 = ((int[]) objArr4[2])[0];
                int i14 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i15 = i12 + (((~((-67446531) | iElapsedRealtime)) | 67380994) * (-566)) + 1187968398 + ((~(iElapsedRealtime | (-65537))) * 566);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(K0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i18 = ((int[]) objArr[0])[0];
                int i19 = i18 * i18;
                int i20 = -(581295412 * i18);
                int i21 = (((i19 & i20) + (i19 | i20)) - (~(-(i18 * 1086392762)))) - (-981344592);
                int i22 = i21 >> 19;
                int i23 = ((i22 ^ (-16383)) + ((i22 & (-16383)) << 1)) / 8192;
                int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                int i25 = (i21 ^ i24) + ((i24 & i21) << 1);
                int i26 = i21 >> 15;
                int i27 = (((i26 | (-262143)) << 1) - (i26 ^ (-262143))) / 131072;
                int i28 = -(((i27 & 1) + (i27 | 1)) ^ i25);
                int i29 = (i28 ^ 3) + ((i28 & 3) << 1);
                int i30 = ((i29 >> 18) - 32767) / 16384;
                int i31 = (i30 & 1) + (i30 | 1);
                Loader.l(((-1427113728) / (((-((i31 & 1) + (i31 | 1))) & i29) * 3)) - 387419917);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } catch (Throwable th) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }
}
