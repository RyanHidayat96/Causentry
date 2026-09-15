package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import id.vida.liveness.listeners.APIResponseListener;
import id.vida.liveness.listeners.TokenListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0724b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1079a;

    private static native Object[] $liveness$B995e2392(Context context);

    private static native void $liveness$E995e2392(Object obj, Object obj2);

    public C0724b1(Context context) {
        $liveness$E995e2392(this, $liveness$B995e2392(context));
    }

    public final native void fetchSDKConfig(r1 r1Var, APIResponseListener<SDKConfigResponseDTO> aPIResponseListener);

    public final native void fetchToken(r1 r1Var, TokenListener tokenListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0724b1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - Process.getGidForName("")), (Process.myTid() >> 22) + 1559, 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1106237048, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1106237048};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110, Color.alpha(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 518 - (Process.myPid() >> 22), 77 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Integer.TYPE});
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
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = ~((-780418036) | iElapsedRealtime);
                int i7 = (-1302453678) + ((142606544 | i6) * (-280)) + ((i6 | (~((-924613424) | iElapsedRealtime))) * 140);
                int i8 = ~((-637811492) | iElapsedRealtime);
                int i9 = ~iElapsedRealtime;
                int i10 = i3 + i7 + (((~(i9 | (-286801933))) | i8 | (~((-142606545) | i9))) * 140);
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
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
                int i13 = ((int[]) objArr4[0])[0];
                int i14 = ((int[]) objArr4[2])[0];
                int i15 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i16 = i13 + (((~(iFreeMemory | 4426437)) | 1700605021) * 56) + 1466361922 + (((~((~iFreeMemory) | 1700605021)) | 4426437) * 56);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i15}, new int[]{i14}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0724b1.class, new Object[0]);
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
                int i20 = i19 * i19;
                int i21 = -(2043666256 * i19);
                int i22 = (i20 & i21) + (i20 | i21);
                int i23 = -(i19 * 919294628);
                int i24 = (i22 & i23) + (i23 | i22);
                int i25 = ((i24 | 1104008228) << 1) - (1104008228 ^ i24);
                int i26 = i25 >> 27;
                int i27 = (((i26 | (-63)) << 1) - (i26 ^ (-63))) / 32;
                int i28 = (i25 - (~(((i27 | 1) << 1) - (i27 ^ 1)))) - 1;
                int i29 = i25 >> 23;
                int i30 = ((i29 & (-1023)) + (i29 | (-1023))) / 512;
                int i31 = -(i28 ^ ((i30 ^ 1) + ((i30 & 1) << 1)));
                int i32 = ((i31 | 3) << 1) - (i31 ^ 3);
                int i33 = i32 >> 18;
                int i34 = ((i33 ^ (-32767)) + ((i33 & (-32767)) << 1)) / 16384;
                int i35 = (i34 & 1) + (i34 | 1);
                Loader.l((1562210811 / (((-((i35 ^ 1) + ((i35 & 1) << 1))) & i32) * 3)) + 1320650977);
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
