package id.vida.liveness.constants;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class Gestures {
    public static Gestures BLINK;
    public static Gestures SHAKE_HEAD;
    public static Gestures SMILE;
    public static Gestures ZOOM_FACE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ Gestures[] f1084a;

    private static native /* synthetic */ void $liveness$COI();

    public Gestures(String str, int i) {
        super(str, i);
    }

    public static native Gestures valueOf(String str);

    public static native Gestures[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = Gestures.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, 649502208, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3414 - (Process.myTid() >> 22)), KeyEvent.normalizeMetaState(0) + 1559, 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), 649502208};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (View.combineMeasuredStates(0, 0) + 43042), 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 518, Color.green(0) + 76), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i6 = i3 + ((((-2105107870) + (((~((-956974234) | startElapsedRealtime)) | (-748057226)) * (-948))) + ((~((~startElapsedRealtime) | (-671236234))) * (-948))) - 296685300);
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
                int i12 = (int) Runtime.getRuntime().totalMemory();
                int i13 = i9 + ((~(i12 | 1658091263)) * TypedValues.CycleType.TYPE_EASING) + 3848630 + (((~((~i12) | 1658091263)) | 46415907) * TypedValues.CycleType.TYPE_EASING);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Gestures.class, new Object[0]);
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
                int i18 = -(749828267 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * (-1930114467));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = ((i21 | 603671568) << 1) - (603671568 ^ i21);
                int i23 = i22 >> 21;
                int i24 = ((i23 ^ (-4095)) + ((i23 & (-4095)) << 1)) / 2048;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = ((i22 | i25) << 1) - (i25 ^ i22);
                int i27 = i22 >> 26;
                int i28 = ((i27 & ComposerKt.defaultsKey) + (i27 | ComposerKt.defaultsKey)) / 64;
                int i29 = -(((i28 & 1) + (i28 | 1)) ^ i26);
                int i30 = (i29 ^ 3) + ((i29 & 3) << 1);
                int i31 = ((i30 >> 26) + ComposerKt.defaultsKey) / 64;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                Loader.l(((-904679562) / (((-((i32 ^ 1) + ((i32 & 1) << 1))) & i30) * 2)) - 761251695);
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
