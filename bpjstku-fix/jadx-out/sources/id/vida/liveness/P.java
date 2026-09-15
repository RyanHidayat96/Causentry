package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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
public final class P {
    public static P COLLECTING;
    public static P ENDED;
    public static P IDLE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ P[] f1046a;

    private static native /* synthetic */ void $liveness$COI();

    public P(String str, int i) {
        super(str, i);
    }

    public static native P valueOf(String str);

    public static native P[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = P.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -1614100598, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (Color.argb(0, 0, 0, 0) + 3414), (KeyEvent.getMaxKeyCode() >> 16) + 1559, TextUtils.lastIndexOf("", '0') + 25, -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -1614100598};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (AndroidCharacter.getMirror('0') + 42994), 3111 - TextUtils.getOffsetAfter("", 0), 22 - View.resolveSizeAndState(0, 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), 519 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 76), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = i3 + 1312898920 + (((-656641) | iUptimeMillis) * (-627)) + (((~((-1003860515) | iUptimeMillis)) | 701170944) * (-627)) + (((~(iUptimeMillis | 701170944)) | (~((~iUptimeMillis) | 1003860514))) * 627);
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
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i12 = ~elapsedCpuTime;
                int i13 = i9 + 2026821064 + (((~((-738500293) | i12)) | (-966531167)) * (-865)) + ((~(elapsedCpuTime | 738500292)) * 865) + (((~((-966531167) | i12)) | (~(i12 | 738500292))) * 865);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(P.class, new Object[0]);
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
                int i18 = -(263883852 * i16);
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                int i20 = -(i16 * (-354337496));
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = (i21 & 138401572) + (138401572 | i21);
                int i23 = i22 >> 29;
                int i24 = ((i23 & (-15)) + (i23 | (-15))) / 8;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = (i22 & i25) + (i25 | i22);
                int i27 = i22 >> 26;
                int i28 = ((i27 & ComposerKt.defaultsKey) + (i27 | ComposerKt.defaultsKey)) / 64;
                int i29 = -((((i28 | 1) << 1) - (i28 ^ 1)) ^ i26);
                int i30 = (i29 ^ 2) + ((i29 & 2) << 1);
                int i31 = i30 >> 22;
                int i32 = (((i31 | (-2047)) << 1) - (i31 ^ (-2047))) / 1024;
                int i33 = (i32 & 1) + (i32 | 1);
                Loader.l((974244384 / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 3)) + 850749582);
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
