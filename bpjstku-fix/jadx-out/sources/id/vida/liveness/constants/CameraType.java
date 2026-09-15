package id.vida.liveness.constants;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class CameraType {
    public static CameraType BACK;
    public static CameraType FRONT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ CameraType[] f1083a;

    private static native /* synthetic */ void $liveness$COI();

    public CameraType(String str, int i) {
        super(str, i);
    }

    public static native CameraType valueOf(String str);

    public static native CameraType[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = CameraType.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -728186494, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 3414), 1559 - (ViewConfiguration.getTapTimeout() >> 16), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -728186494};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (43042 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf("", "", 0) + 3111, 22 - (Process.myTid() >> 22), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AndroidCharacter.getMirror('0') - '0'), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 517, ExpandableListView.getPackedPositionChild(0L) + 77), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = i3 + (-1524463646) + (((~(i6 | 1543501561)) | 161529897) * 220) + (((~(i6 | 1504100585)) | 200930873) * (-440)) + ((iUptimeMillis | 1543501561) * 220);
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i13 = i10 + ((((-578370750) + (((~((-19468113) | startElapsedRealtime)) | 2164560) * 1504)) + ((~(startElapsedRealtime | (-17303553))) * (-1504))) - 972096032);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(CameraType.class, new Object[0]);
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
                int i18 = -(732321098 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * (-1149342620));
                int i21 = (((i19 | i20) << 1) - (i20 ^ i19)) - 1008864111;
                int i22 = i21 >> 26;
                int i23 = ((i22 ^ ComposerKt.defaultsKey) + ((i22 & ComposerKt.defaultsKey) << 1)) / 64;
                int i24 = (i23 ^ 1) + ((i23 & 1) << 1);
                int i25 = (i21 ^ i24) + ((i24 & i21) << 1);
                int i26 = i21 >> 29;
                int i27 = ((i26 ^ (-15)) + ((i26 & (-15)) << 1)) / 8;
                int i28 = -(((i27 & 1) + (i27 | 1)) ^ i25);
                int i29 = (i28 ^ 2) + ((i28 & 2) << 1);
                int i30 = ((i29 >> 23) - 1023) / 512;
                int i31 = (i30 & 1) + (i30 | 1);
                Loader.l(((-894113328) / (((-((i31 ^ 1) + ((i31 & 1) << 1))) & i29) * 3)) - 1369269290);
                $liveness$COI();
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
