package id.vida.liveness.services;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import id.vida.liveness.listeners.APIResponseListener;
import id.vida.liveness.r1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements APIResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f1170a;
    public final /* synthetic */ BackendLiveness b;

    private static native Object[] $liveness$B0d061dd0(BackendLiveness backendLiveness, r1 r1Var);

    private static native void $liveness$E0d061dd0(Object obj, Object obj2);

    public c(BackendLiveness backendLiveness, r1 r1Var) {
        this.b = backendLiveness;
        this.f1170a = r1Var;
        $liveness$E0d061dd0(this, $liveness$B0d061dd0(backendLiveness, r1Var));
    }

    @Override // id.vida.liveness.listeners.APIResponseListener
    public final native void onError(int i, String str);

    @Override // id.vida.liveness.listeners.APIResponseListener
    public final native void onResponse(SDKConfigResponseDTO sDKConfigResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = c.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1559, 24 - Gravity.getAbsoluteGravity(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1087413750, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1087413750};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 3111, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 517, Gravity.getAbsoluteGravity(0, 0) + 76), Integer.TYPE});
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
                int i6 = i3 + (-1579693538) + (((~((-968879082) | elapsedCpuTime)) | (-736152378)) * (-964)) + (((~((~elapsedCpuTime) | (-968879082))) | 270475456) * (-964));
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
                int iNextInt = new Random().nextInt(1929281022);
                int i12 = ~iNextInt;
                int i13 = i9 + (-1184515582) + (((-1682780177) | iNextInt) * (-676)) + (((~(11716237 | i12)) | 1682780176) * 676) + (((~(iNextInt | 1694496413)) | (~(i12 | (-1693315222))) | 10535045) * 676);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(c.class, new Object[0]);
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
                int i18 = -(296333489 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * (-1962156671));
                int i21 = (((i19 | i20) << 1) - (i20 ^ i19)) - 731127695;
                int i22 = i21 >> 15;
                int i23 = ((i22 ^ (-262143)) + ((i22 & (-262143)) << 1)) / 131072;
                int i24 = (i23 ^ 1) + ((i23 & 1) << 1);
                int i25 = -(((((i21 >> 23) - 1023) / 512) + 1) ^ (((i21 | i24) << 1) - (i24 ^ i21)));
                int i26 = ((i25 | 1) << 1) - (i25 ^ 1);
                int i27 = i26 >> 27;
                int i28 = (((i27 | (-63)) << 1) - (i27 ^ (-63))) / 32;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l(((-730229325) / (((-((i29 ^ 1) + ((i29 & 1) << 1))) & i26) * 5)) - 667793423);
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
