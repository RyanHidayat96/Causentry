package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.view.OnBackPressedCallback;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public final class t1 extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1 f1174a;

    private static native Object[] $liveness$B7db5b79c(u1 u1Var);

    private static native void $liveness$E7db5b79c(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public t1(u1 u1Var) {
        this.f1174a = u1Var;
        Object[] objArr$liveness$B7db5b79c = $liveness$B7db5b79c(u1Var);
        super(((Value) objArr$liveness$B7db5b79c[1]).i);
        $liveness$E7db5b79c(this, objArr$liveness$B7db5b79c);
    }

    @Override // androidx.view.OnBackPressedCallback
    public final native void handleOnBackPressed();

    static {
        Object[] objArr;
        ClassLoader classLoader = t1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3415 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 1559, 24 - TextUtils.getOffsetBefore("", 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 778285404, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 778285404};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 43042), 3111 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 519 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 76 - TextUtils.getOffsetAfter("", 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = (~((-545670386) | i6)) | 147505;
                int i8 = i3 + 2117985602 + (i7 * 992) + ((i7 | (~((~i6) | 1704883953))) * (-496)) + ((i6 | 1159361073) * 496);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
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
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int i14 = ~((int) Process.getStartUptimeMillis());
                int i15 = i11 + 923278178 + ((~(887092985 | i14)) * 52) + (((~(818734825 | i14)) | (~((-886296634) | i14)) | 68358160) * (-52)) + (((~(i14 | (-818734826))) | 796352) * 52);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(t1.class, new Object[0]);
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
                int i20 = -(238373589 * i18);
                int i21 = (((i19 & i20) + (i19 | i20)) - (~(-(i18 * (-1001187171))))) - 1;
                int i22 = (i21 ^ 904943537) + ((904943537 & i21) << 1);
                int i23 = (((i22 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = i22 >> 16;
                int i26 = (((i25 | (-131071)) << 1) - (i25 ^ (-131071))) / 65536;
                int i27 = -(((i26 & 1) + (i26 | 1)) ^ i24);
                int i28 = ((i27 | 2) << 1) - (i27 ^ 2);
                int i29 = i28 >> 24;
                int i30 = ((i29 & (-511)) + (i29 | (-511))) / 256;
                int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
                Loader.l((1022891208 / (((-((i31 ^ 1) + ((i31 & 1) << 1))) & i28) * 3)) + 486071087);
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
