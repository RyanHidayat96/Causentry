package id.vida.liveness;

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
import java.util.Locale;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public abstract class D0 {
    public static native Context setLocale(Context context, Locale locale);

    static {
        Object[] objArr;
        ClassLoader classLoader = D0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 3414), 1559 - TextUtils.indexOf("", "", 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 876001995, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 876001995};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 43042), 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 517, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 75), Integer.TYPE});
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
                int iMyUid = Process.myUid();
                int i6 = ~iMyUid;
                int i7 = (-481515742) + (((~((-27351186) | i6)) | (~(1139497617 | iMyUid))) * 520);
                int i8 = ~((-1139497618) | i6);
                int i9 = ~(iMyUid | 565533841);
                int i10 = i3 + i7 + ((i8 | i9) * (-1040)) + ((i9 | (~(i6 | (-565533842))) | 1112146432) * 520);
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
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
                int i13 = ((int[]) objArr4[0])[0];
                int i14 = ((int[]) objArr4[2])[0];
                int i15 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr3 = {i14};
                int i16 = ~Process.myTid();
                int i17 = i13 + 1504976402 + (((-4228817) | i16) * 184) + (((~(i16 | 1069494313)) | (-442414801)) * 184);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], new int[]{i15}, iArr3, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(D0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ((i20 * i20) - (~(-(1232951809 * i20)))) - 1;
                int i22 = -(i20 * (-1511268503));
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = ((i23 | 74782713) << 1) - (74782713 ^ i23);
                int i25 = i24 >> 19;
                int i26 = ((i25 ^ (-16383)) + ((i25 & (-16383)) << 1)) / 8192;
                int i27 = (i26 & 1) + (i26 | 1);
                int i28 = (i24 & i27) + (i27 | i24);
                int i29 = i24 >> 21;
                int i30 = (-(i28 ^ ((((i29 & (-4095)) + (i29 | (-4095))) / 2048) + 1))) + 6;
                int i31 = ((i30 >> 25) - 255) / 128;
                int i32 = (i31 & 1) + (i31 | 1);
                Loader.l(((-1940619948) / ((i30 & (-((i32 & 1) + (i32 | 1)))) * 2)) - 1665923240);
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
