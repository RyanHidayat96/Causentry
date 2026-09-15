package id.vida.liveness.services;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class LogService {
    public static native void debug(String str);

    public static native void debug(String str, String str2);

    public static native void error(String str);

    public static native void error(String str, String str2);

    public static native void error(Throwable th);

    public static native void info(String str);

    public static native void info(String str, String str2);

    public static native void internal(String str);

    public static native void internal(String str, String str2);

    public static native void verbose(String str);

    public static native void verbose(String str, String str2);

    public static native void warn(String str);

    public static native void warn(String str, String str2);

    static {
        Object[] objArr;
        ClassLoader classLoader = LogService.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3413), 1559 - ExpandableListView.getPackedPositionType(0L), 24 - View.getDefaultSize(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 883204618, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 883204618};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 3111 - (ViewConfiguration.getScrollBarSize() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (MotionEvent.axisFromString("") + 1), TextUtils.getOffsetAfter("", 0) + 518, ExpandableListView.getPackedPositionType(0L) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyTid = Process.myTid();
                int i6 = i3 + 1292864786 + (((~((-965562248) | iMyTid)) | (-739469212)) * (-948)) + ((~((~iMyTid) | (-671172484))) * (-948)) + 91377020;
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
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i12 = i9 + 1803353086 + (((~((~iFreeMemory) | (-17957059))) | (~(1033860082 | iFreeMemory))) * (-302)) + ((~((-17957059) | iFreeMemory)) * (-604)) + (((~(iFreeMemory | 1015903024)) | 344731648) * 302);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(LogService.class, new Object[0]);
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
                int i16 = i15 * i15;
                int i17 = -(1686218761 * i15);
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                int i19 = -(i15 * 2137998329);
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = ((i20 | (-1168839679)) << 1) - ((-1168839679) ^ i20);
                int i22 = i21 >> 28;
                int i23 = (((i22 | (-31)) << 1) - (i22 ^ (-31))) / 16;
                int i24 = (i21 - (~((i23 & 1) + (i23 | 1)))) - 1;
                int i25 = i21 >> 25;
                int i26 = ((i25 ^ (-255)) + ((i25 & (-255)) << 1)) / 128;
                int i27 = -(i24 ^ ((i26 ^ 1) + ((i26 & 1) << 1)));
                int i28 = (i27 & 4) + (i27 | 4);
                int i29 = i28 >> 22;
                int i30 = ((i29 & (-2047)) + (i29 | (-2047))) / 1024;
                int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
                Loader.l(((-1171872152) / (((-((i31 ^ 1) + ((i31 & 1) << 1))) & i28) * 2)) - 987781965);
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
