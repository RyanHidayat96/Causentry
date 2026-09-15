package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.rum.RumActionType;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import defpackage.initSession;
import id.vida.liveness.constants.FaceStatus;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import liveness.Loader;
import org.json.JSONObject;

/* JADX INFO: renamed from: id.vida.liveness.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0745j {
    public static C0745j g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1134a;
    public final HashMap b;
    public int c;
    public final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MixpanelAPI f1135e;
    public String f;

    private static native Object[] $liveness$B432fd523(Context context);

    private static native void $liveness$E432fd523(Object obj, Object obj2);

    public C0745j(Context context) {
        $liveness$E432fd523(this, $liveness$B432fd523(context));
    }

    public static native JSONObject a(JSONObject jSONObject);

    public static native JSONObject b(JSONObject jSONObject);

    public static native C0745j getInstance(Context context);

    public final native HashMap a(boolean z);

    public final native void a(RumActionType rumActionType, String str, JSONObject jSONObject, boolean z);

    public final native void a(String str, JSONObject jSONObject, boolean z);

    public final native JSONObject b(boolean z);

    public final native synchronized JSONObject c(JSONObject jSONObject);

    public final native void clearAnalyticsEvents();

    public final native synchronized void saveFaceStatusEvent(FaceStatus faceStatus);

    public final native synchronized void saveGestureEvent(String str, String str2, String str3);

    public final native void saveZDefendDeviceId(String str);

    public final native void sendLivenessGestureEvents();

    public final native void trackCameraDetails(EnumC0743i enumC0743i);

    public final native void trackGenericEvent(String str);

    public final native void trackHandledException(Throwable th);

    public final native void trackHandledException(Throwable th, boolean z);

    public final native void trackLivenessFail(String str, int i, String str2);

    public final native synchronized void trackLivenessGestureComplete(String str, String str2, String str3);

    public final native void trackLivenessGestureStart(String str);

    public final native void trackLivenessStart(String str);

    public final native void trackLivenessSuccess(String str);

    public final native void trackSDKError(int i, String str);

    public final native void trackSDKInitialized();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0745j.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - MotionEvent.axisFromString("")), KeyEvent.keyCodeFromString("") + 1559, (ViewConfiguration.getPressedStateDuration() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1074156958, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1074156958};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getTouchSlop() >> 8)), 3111 - TextUtils.getTrimmedLength(""), View.resolveSize(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "", 0, 0) + 518, 77 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt(439073796);
                int i6 = ~iNextInt;
                int i7 = i3 + 1206478406 + (((~((-301991207) | iNextInt)) | (~((-1403040253) | i6))) * (-370)) + (((~((-301991207) | i6)) | (~(iNextInt | (-1403040253))) | (-1403041279)) * (-370)) + 565769586;
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i13 = i10 + ((~(iUptimeMillis | 823249602)) * TypedValues.CycleType.TYPE_EASING) + 629724686 + (((~((~iUptimeMillis) | 823249602)) | 805357632) * TypedValues.CycleType.TYPE_EASING);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0745j.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i16 = ((int[]) objArr[0])[0];
                int i17 = i16 * i16;
                int i18 = -(1258697142 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * (-1924582354));
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = ((i21 | 852585668) << 1) - (852585668 ^ i21);
                int i23 = (((i22 >> 22) - 2047) / 1024) + 1;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = i22 >> 17;
                int i26 = -(i24 ^ ((((i25 & (-65535)) + (i25 | (-65535))) / 32768) + 1));
                int i27 = (i26 ^ 4) + ((i26 & 4) << 1);
                int i28 = ((i27 >> 27) - 63) / 32;
                int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                Loader.l((1425184880 / (((-((i29 & 1) + (i29 | 1))) & i27) * 2)) + 603536990);
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
