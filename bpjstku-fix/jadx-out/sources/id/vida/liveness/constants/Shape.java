package id.vida.liveness.constants;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class Shape {
    public static Shape CIRCLE;
    public static Shape OVAL;
    public static Shape RECTANGLE;
    public static Shape SQUARE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ Shape[] f1086a;

    private static native /* synthetic */ void $liveness$COI();

    public Shape(String str, int i) {
        super(str, i);
    }

    public static native Shape valueOf(String str);

    public static native Shape[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = Shape.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -251983988, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3414 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1559, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -251983988};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43042), (ViewConfiguration.getTouchSlop() >> 8) + 3111, TextUtils.indexOf((CharSequence) "", '0') + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') + 470, 76 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = i3 + 282880300 + (((~((-1326473828) | iElapsedRealtime)) | 378557631) * (-366)) + (((~(iElapsedRealtime | (-1224745537))) | 276829340) * 366);
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
                int iMyPid = Process.myPid();
                int i12 = i9 + ((((-410663446) + (((~((-33603878) | iMyPid)) | (~(1671427581 | iMyPid))) * 69)) + (((~(iMyPid | 1645920637)) | ((~((-59110822) | iMyPid)) | 25506944)) * (-69))) - 419293256);
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Shape.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i15 = ((int[]) objArr[0])[0];
                int i16 = ((i15 * i15) - (~(-(447686332 * i15)))) - 1;
                int i17 = -(i15 * 1675098750);
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                int i19 = (i18 & 1239351369) + (1239351369 | i18);
                int i20 = ((i19 >> 17) - 65535) / 32768;
                int i21 = (i20 & 1) + (i20 | 1);
                int i22 = (i19 ^ i21) + ((i21 & i19) << 1);
                int i23 = i19 >> 25;
                int i24 = ((i23 & (-255)) + (i23 | (-255))) / 128;
                int i25 = -(i22 ^ ((i24 ^ 1) + ((i24 & 1) << 1)));
                int i26 = ((i25 | 6) << 1) - (i25 ^ 6);
                int i27 = i26 >> 23;
                int i28 = (((i27 | (-1023)) << 1) - (i27 ^ (-1023))) / 512;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l(751443276 / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i26) * 2));
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
