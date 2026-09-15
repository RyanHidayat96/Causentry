package id.vida.liveness.constants;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class LogLevel {
    public static LogLevel DEBUG;
    public static LogLevel ERROR;
    public static LogLevel INFO;
    public static LogLevel VERBOSE;
    public static LogLevel WARN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ LogLevel[] f1085a;

    private static native /* synthetic */ void $liveness$COI();

    public LogLevel(String str, int i) {
        super(str, i);
    }

    public static native LogLevel valueOf(String str);

    public static native LogLevel[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = LogLevel.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -496188315, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3414), 1559 - Color.argb(0, 0, 0, 0), 24 - (ViewConfiguration.getTapTimeout() >> 16), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -496188315};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43042), TextUtils.getOffsetAfter("", 0) + 3111, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), 518 - (ViewConfiguration.getTouchSlop() >> 8), 76 - KeyEvent.keyCodeFromString("")), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~Process.myPid();
                int i7 = i3 + (((490608162 + (((~((-315569426) | i6)) | (-1389462034)) * (-933))) + (((~(i6 | (-1389462034))) | 1074823680) * 933)) - 156644506);
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i13 = i10 + 1879698000 + (((~((-306279680) | iMaxMemory)) | 306266147) * 345) + (((~((-306279680) | (~iMaxMemory))) | 1092485632) * 345) + ((~(iMaxMemory | (-306266148))) * 345);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(LogLevel.class, new Object[0]);
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
                int i18 = -(1679717826 * i16);
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                int i20 = -(i16 * (-1193765106));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = ((i21 | (-830404032)) << 1) - ((-830404032) ^ i21);
                int i23 = i22 >> 26;
                int i24 = (((i23 | ComposerKt.defaultsKey) << 1) - (i23 ^ ComposerKt.defaultsKey)) / 64;
                int i25 = ((i24 | 1) << 1) - (i24 ^ 1);
                int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
                int i27 = i22 >> 28;
                int i28 = -(i26 ^ ((((i27 & (-31)) + (i27 | (-31))) / 16) + 1));
                int i29 = (i28 ^ 3) + ((i28 & 3) << 1);
                int i30 = ((i29 >> 25) - 255) / 128;
                Loader.l(((-1455509259) / (((-(((i30 ^ 1) + ((i30 & 1) << 1)) + 1)) & i29) * 3)) - 422999507);
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
