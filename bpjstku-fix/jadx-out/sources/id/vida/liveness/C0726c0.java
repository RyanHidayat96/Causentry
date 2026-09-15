package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import liveness.Loader;
import liveness.Value;
import org.json.JSONObject;

/* JADX INFO: renamed from: id.vida.liveness.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0726c0 extends JsonObjectRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1081a;

    private static native Object[] $liveness$B9ac83804(String str, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, String str2);

    private static native void $liveness$E9ac83804(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public C0726c0(String str, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, String str2) {
        this.f1081a = str2;
        Object[] objArr$liveness$B9ac83804 = $liveness$B9ac83804(str, jSONObject, listener, errorListener, str2);
        super(((Value) objArr$liveness$B9ac83804[1]).i, (String) objArr$liveness$B9ac83804[2], (JSONObject) objArr$liveness$B9ac83804[3], (Response.Listener) objArr$liveness$B9ac83804[4], (Response.ErrorListener) objArr$liveness$B9ac83804[5]);
        $liveness$E9ac83804(this, objArr$liveness$B9ac83804);
    }

    @Override // com.android.volley.Request
    public final native Map<String, String> getHeaders();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0726c0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3414), 1559 - Color.alpha(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1179495372, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1179495372};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042), 3111 - (ViewConfiguration.getPressedStateDuration() >> 16), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), 518 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 75 - TextUtils.lastIndexOf("", '0', 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i5};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = (-1105839102) + (((~((-624177774) | iUptimeMillis)) | 2359333 | (~((-1080853686) | iUptimeMillis))) * (-880));
                int i7 = (~((-624177774) | (~iUptimeMillis))) | 1080853685;
                int i8 = ~(iUptimeMillis | 624177773);
                int i9 = i3 + i6 + ((i7 | i8) * (-880)) + (i8 * 880);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
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
                int i15 = (~((int) Process.getElapsedCpuTime())) | 949966309;
                int i16 = i12 + 187941510 + (i15 * 495) + (((~i15) | 671170853) * 495);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0726c0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i19 = ((int[]) objArr[0])[0];
                int i20 = ((i19 * i19) - (~(-(2104632230 * i19)))) - 1;
                int i21 = -(i19 * (-1111270578));
                int i22 = ((i20 & i21) + (i21 | i20)) - 1845541340;
                int i23 = i22 >> 16;
                int i24 = ((i23 ^ (-131071)) + ((i23 & (-131071)) << 1)) / 65536;
                int i25 = ((i22 >> 27) - 63) / 32;
                int i26 = -(((i22 - (~((i24 ^ 1) + ((i24 & 1) << 1)))) - 1) ^ (((i25 | 1) << 1) - (i25 ^ 1)));
                int i27 = ((i26 | 2) << 1) - (i26 ^ 2);
                int i28 = i27 >> 22;
                int i29 = ((i28 ^ (-2047)) + ((i28 & (-2047)) << 1)) / 1024;
                int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
                Loader.l(((-1007018118) / (((-((i30 & 1) + (i30 | 1))) & i27) * 3)) - 1332526510);
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
