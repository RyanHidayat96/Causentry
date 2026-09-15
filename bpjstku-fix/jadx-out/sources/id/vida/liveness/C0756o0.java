package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0756o0 implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1150a;

    private static native Object[] $liveness$B6738ceb8();

    private static native void $liveness$E6738ceb8(Object obj, Object obj2);

    public C0756o0() {
        $liveness$E6738ceb8(this, $liveness$B6738ceb8());
    }

    public static native String a(int i);

    public final native void a();

    public final native void a(int i, String str);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0756o0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 1559, 24 - TextUtils.indexOf("", "", 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 366164954, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 366164954};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 43042), MotionEvent.axisFromString("") + 3112, TextUtils.lastIndexOf("", '0', 0) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 518, 76 - KeyEvent.getDeadChar(0, 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~(((int) Runtime.getRuntime().freeMemory()) | 858595837);
                int i7 = i3 + (((17572056 | i6) * (-196)) - 777716690) + ((i6 | 841023781) * 196);
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
                int i13 = i10 + 2000149676 + ((~((-67112963) | iUptimeMillis)) * 623) + (((~iUptimeMillis) | 26222616) * (-623)) + (((~(iUptimeMillis | 832070556)) | (~((-872960903) | iUptimeMillis)) | 67112962) * 623);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0756o0.class, new Object[0]);
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
                int i18 = -(1703489131 * i16);
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                int i20 = -(i16 * (-1918184537));
                int i21 = ((i19 & i20) + (i20 | i19)) - 1059777967;
                int i22 = i21 >> 26;
                int i23 = (((i22 | ComposerKt.defaultsKey) << 1) - (i22 ^ ComposerKt.defaultsKey)) / 64;
                int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                int i25 = (-(((((i21 >> 28) - 31) / 16) + 1) ^ ((i21 & i24) + (i24 | i21)))) + 1;
                int i26 = i25 >> 20;
                int i27 = ((i26 & (-8191)) + (i26 | (-8191))) / 4096;
                int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                Loader.l((1124966276 / ((i25 & (-(((i28 | 1) << 1) - (i28 ^ 1)))) * 7)) + 994604070);
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
