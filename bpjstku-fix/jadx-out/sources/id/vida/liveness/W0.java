package id.vida.liveness;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import id.vida.liveness.listeners.APIResponseListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class W0 extends AbstractC0775y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static W0 f1066a;

    private static /* synthetic */ Response.ErrorListener $liveness$C297443eb(final W0 w0, final APIResponseListener aPIResponseListener) {
        return new Response.ErrorListener() { // from class: id.vida.liveness.W0$$ExternalSyntheticLambda0
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                this.f$0.a(aPIResponseListener, volleyError);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C53392803(final W0 w0, final JSONObject jSONObject, final APIResponseListener aPIResponseListener) {
        return new Runnable() { // from class: id.vida.liveness.W0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(jSONObject, aPIResponseListener);
            }
        };
    }

    private static /* synthetic */ Response.Listener $liveness$C78b34171(final W0 w0, final APIResponseListener aPIResponseListener) {
        return new Response.Listener() { // from class: id.vida.liveness.W0$$ExternalSyntheticLambda1
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                this.f$0.a(aPIResponseListener, (JSONObject) obj);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$Cd0e2990a(final W0 w0, final VolleyError volleyError, final APIResponseListener aPIResponseListener) {
        return new Runnable() { // from class: id.vida.liveness.W0$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(volleyError, aPIResponseListener);
            }
        };
    }

    public W0(Context context) {
        super(context);
    }

    public static native W0 getInstance(Context context);

    public final native /* synthetic */ void a(VolleyError volleyError, APIResponseListener aPIResponseListener);

    public final native /* synthetic */ void a(APIResponseListener aPIResponseListener, VolleyError volleyError);

    public final native /* synthetic */ void a(APIResponseListener aPIResponseListener, JSONObject jSONObject);

    public final native /* synthetic */ void a(JSONObject jSONObject, APIResponseListener aPIResponseListener);

    public final native void fetchConfiguration(String str, String str2, APIResponseListener<SDKConfigResponseDTO> aPIResponseListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = W0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - TextUtils.getCapsMode("", 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 1559, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 762503598, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 762503598};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3111, 22 - TextUtils.getTrimmedLength(""), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Drawable.resolveOpacity(0, 0), 518 - View.MeasureSpec.getSize(0), View.combineMeasuredStates(0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i6 = i3 + 1998188530 + (((~((~elapsedCpuTime) | (-269750361))) | (~(1541322237 | elapsedCpuTime))) * (-302)) + ((~((-269750361) | elapsedCpuTime)) * (-604)) + (((~(elapsedCpuTime | 1271571877)) | 1107862656) * 302);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i9 = ((int[]) objArr4[0])[0];
                int i10 = ((int[]) objArr4[2])[0];
                int i11 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iMyUid = Process.myUid();
                int i12 = i9 + 1470212582 + (((~((~iMyUid) | (-1492079269))) | 144785444) * 446) + (((~(iMyUid | (-1347293825))) | 68166746) * 446) + 149798584;
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(W0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i15 = ((int[]) objArr[0])[0];
                int i16 = i15 * i15;
                int i17 = -(614091650 * i15);
                int i18 = (((i16 & i17) + (i16 | i17)) - (~(-(i15 * (-191383468))))) - 1;
                int i19 = (i18 & 1391046073) + (1391046073 | i18);
                int i20 = i19 >> 29;
                int i21 = ((i20 ^ (-15)) + ((i20 & (-15)) << 1)) / 8;
                int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
                int i23 = ((i19 | i22) << 1) - (i22 ^ i19);
                int i24 = i19 >> 20;
                int i25 = ((i24 & (-8191)) + (i24 | (-8191))) / 4096;
                int i26 = (-(((i25 ^ 1) + ((i25 & 1) << 1)) ^ i23)) + 3;
                int i27 = i26 >> 21;
                int i28 = (((i27 | (-4095)) << 1) - (i27 ^ (-4095))) / 2048;
                int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                Loader.l(((-1018593522) / ((i26 & (-(((i29 | 1) << 1) - (i29 ^ 1)))) * 2)) - 1875849184);
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
