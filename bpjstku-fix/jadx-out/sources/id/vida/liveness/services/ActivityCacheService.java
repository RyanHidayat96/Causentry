package id.vida.liveness.services;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityCacheService {
    public static ActivityCacheService b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1166a;

    private static native Object[] $liveness$B883a9b00();

    private static native void $liveness$E883a9b00(Object obj, Object obj2);

    public ActivityCacheService() {
        $liveness$E883a9b00(this, $liveness$B883a9b00());
    }

    public static native synchronized ActivityCacheService getInstance();

    public final native synchronized void addOpenActivity(Activity activity);

    public final native synchronized void closeAllActivities();

    static {
        Object[] objArr;
        ClassLoader classLoader = ActivityCacheService.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 3414), 1559 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Process.getThreadPriority(0) + 20) >> 6) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -377065809, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -377065809};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43043), TextUtils.indexOf((CharSequence) "", '0') + 3112, 22 - View.combineMeasuredStates(0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), 519 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 76 - TextUtils.getCapsMode("", 0, 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = ~(826435618 | iFreeMemory);
                int i7 = i3 + 107557894 + ((68945664 | i6) * (-814)) + ((i6 | (~((-878595841) | (~iFreeMemory))) | 16785442) * 407) + (((~(iFreeMemory | 878595840)) | 16785442 | (~((-826435619) | iFreeMemory))) * 407);
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
                int[] iArr = {i11};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i13 = ~((-978897307) | iMaxMemory);
                int i14 = ~iMaxMemory;
                int i15 = i10 + 1247656878 + ((i13 | (~(996142490 | i14))) * (-406)) + ((~((-270008339) | i14)) * (-406)) + (((~(iMaxMemory | (-726134153))) | (~(978897306 | i14))) * 406);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ActivityCacheService.class, new Object[0]);
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
                int i20 = -(1132682758 * i18);
                int i21 = (i19 & i20) + (i19 | i20);
                int i22 = -(i18 * 317839160);
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = (i23 & (-680546623)) + ((-680546623) | i23);
                int i25 = i24 >> 15;
                int i26 = (((i25 | (-262143)) << 1) - (i25 ^ (-262143))) / 131072;
                int i27 = (i26 & 1) + (i26 | 1);
                int i28 = (i24 & i27) + (i27 | i24);
                int i29 = i24 >> 16;
                int i30 = ((i29 & (-131071)) + (i29 | (-131071))) / 65536;
                int i31 = -((((i30 | 1) << 1) - (i30 ^ 1)) ^ i28);
                int i32 = (i31 & 4) + (i31 | 4);
                int i33 = i32 >> 17;
                int i34 = ((i33 & (-65535)) + (i33 | (-65535))) / 32768;
                Loader.l((1347353016 / (((-(((i34 & 1) + (i34 | 1)) + 1)) & i32) * 2)) + 440115727);
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
