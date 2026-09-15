package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
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

/* JADX INFO: loaded from: classes7.dex */
public final class V0 extends JsonObjectRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1060a;
    public final /* synthetic */ String b;

    private static native Object[] $liveness$Bff827987(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3);

    private static native void $liveness$Eff827987(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public V0(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3) {
        this.f1060a = str2;
        this.b = str3;
        Object[] objArr$liveness$Bff827987 = $liveness$Bff827987(str, listener, errorListener, str2, str3);
        super(((Value) objArr$liveness$Bff827987[1]).i, (String) objArr$liveness$Bff827987[2], (JSONObject) objArr$liveness$Bff827987[3], (Response.Listener) objArr$liveness$Bff827987[4], (Response.ErrorListener) objArr$liveness$Bff827987[5]);
        $liveness$Eff827987(this, objArr$liveness$Bff827987);
    }

    @Override // com.android.volley.Request
    public final native Map<String, String> getHeaders();

    static {
        Object[] objArr;
        ClassLoader classLoader = V0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 3414), 1559 - Gravity.getAbsoluteGravity(0, 0), 23 - MotionEvent.axisFromString(""), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 26306666, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 26306666};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.resolveSize(0, 0)), AndroidCharacter.getMirror('0') + 3063, TextUtils.getOffsetBefore("", 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 517, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) Process.getElapsedCpuTime());
                int i7 = i3 + (((426838298 + (((~(i6 | 861928858)) | 843102600) * (-828))) + ((i6 | 861928858) * (-828))) - 712524116);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
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
                int i10 = ((int[]) objArr4[0])[0];
                int i11 = ((int[]) objArr4[2])[0];
                int i12 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int i13 = ~Process.myUid();
                int i14 = i10 + 1645617330 + ((~(1065344799 | i13)) * 52) + (((~(1059575831 | i13)) | (~((-645455628) | i13)) | 5768968) * (-52)) + (((~(i13 | (-1059575832))) | 419889172) * 52);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(V0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i17 = ((int[]) objArr[0])[0];
                int i18 = ((i17 * i17) - (~(-(1349569669 * i17)))) - 1;
                int i19 = -(i17 * 37728219);
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = ((i20 | 807094528) << 1) - (807094528 ^ i20);
                int i22 = i21 >> 15;
                int i23 = ((i22 & (-262143)) + (i22 | (-262143))) / 131072;
                int i24 = (i21 - (~(((i23 | 1) << 1) - (i23 ^ 1)))) - 1;
                int i25 = i21 >> 29;
                int i26 = ((i25 ^ (-15)) + ((i25 & (-15)) << 1)) / 8;
                int i27 = -(i24 ^ (((i26 | 1) << 1) - (i26 ^ 1)));
                int i28 = (i27 & 4) + (i27 | 4);
                int i29 = i28 >> 28;
                int i30 = ((i29 ^ (-31)) + ((i29 & (-31)) << 1)) / 16;
                int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
                Loader.l(((-1333053504) / (((-(((i31 | 1) << 1) - (i31 ^ 1))) & i28) * 2)) - 1076362751);
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
