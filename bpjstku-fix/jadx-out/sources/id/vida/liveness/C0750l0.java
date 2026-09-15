package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.constants.Gestures;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0750l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gestures f1141a;
    public final C0768u0 b;

    private static native Object[] $liveness$Bae30430a(Gestures gestures, C0768u0 c0768u0);

    private static native void $liveness$Eae30430a(Object obj, Object obj2);

    public C0750l0(Gestures gestures, C0768u0 c0768u0) {
        $liveness$Eae30430a(this, $liveness$Bae30430a(gestures, c0768u0));
    }

    public final native Gestures getGestures();

    public final native C0768u0 getImageDetails();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0750l0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 3414), (Process.myPid() >> 22) + 1559, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2001642267, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2001642267};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042), AndroidCharacter.getMirror('0') + 3063, KeyEvent.getDeadChar(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 518 - (ViewConfiguration.getWindowTouchSlop() >> 8), 76 - TextUtils.indexOf("", "", 0, 0)), Integer.TYPE});
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
                int i7 = i3 + 185046034 + (((-285737473) | i6) * 184) + (((~(i6 | 714372249)) | (-295187985)) * 184);
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
                int i13 = i10 + 1892901100 + (((~((-1667314644) | iUptimeMillis)) | 37716815) * (-366)) + (((~(iUptimeMillis | (-1631596689))) | 1998860) * 366);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0750l0.class, new Object[0]);
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
                int i18 = -(882468725 * i16);
                int i19 = ((((i17 | i18) << 1) - (i17 ^ i18)) - (~(-(i16 * (-1981457719))))) - 1;
                int i20 = (i19 & (-199589439)) + ((-199589439) | i19);
                int i21 = ((i20 >> 15) - 262143) / 131072;
                int i22 = ((i21 | 1) << 1) - (i21 ^ 1);
                int i23 = (i20 & i22) + (i22 | i20);
                int i24 = i20 >> 20;
                int i25 = ((i24 ^ (-8191)) + ((i24 & (-8191)) << 1)) / 4096;
                int i26 = -(i23 ^ (((i25 | 1) << 1) - (i25 ^ 1)));
                int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                int i28 = ((i27 >> 18) - 32767) / 16384;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l(((-972231798) / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i27) * 6)) - 33652581);
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
