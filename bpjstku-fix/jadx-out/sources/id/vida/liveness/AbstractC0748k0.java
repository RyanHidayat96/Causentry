package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import id.vida.liveness.constants.LogLevel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0748k0 {
    public static native void addLog(String str, LogLevel logLevel, String str2);

    public static native void assertStateOrLog(boolean z, String str);

    public static native Drawable changeDrawableColor(Drawable drawable, int i);

    public static native boolean checkConnection(Context context);

    public static native String generateRefId(Context context);

    public static native String generateUUID();

    public static native String generateUUIDForDeviceId();

    public static native String getAppPackageDetails(Context context);

    public static native String getLocalIPAddress();

    public static native String getSDKVersion();

    public static native boolean isBackgroundThread();

    public static native boolean isDebugBuild();

    public static native boolean isMainThread();

    static {
        Object[] objArr;
        ClassLoader classLoader = AbstractC0748k0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3413), 1559 - View.getDefaultSize(0, 0), (-16777192) - Color.rgb(0, 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2109512071, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2109512071};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - TextUtils.indexOf("", "", 0)), View.getDefaultSize(0, 0) + 3111, KeyEvent.keyCodeFromString("") + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), 518 - TextUtils.indexOf("", ""), 76 - View.resolveSizeAndState(0, 0, 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = i3 + 1060717834 + (((~(1181840412 | i6)) | 523191046) * (-328)) + ((iUptimeMillis | 523191046) * 164) + (((~(iUptimeMillis | (-1181840413))) | 102842372 | (~(i6 | 1602189086))) * 164);
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
                int i13 = ~Process.myTid();
                int i14 = i10 + (-671077374) + (((~(i13 | 38777250)) | (-1667216803)) * (-160)) + (((~(i13 | (-1666254209))) | 38777250) * 160);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0748k0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i17 = ((int[]) objArr[0])[0];
                int i18 = i17 * i17;
                int i19 = -(1402381937 * i17);
                int i20 = (i18 & i19) + (i18 | i19);
                int i21 = -(i17 * 585313011);
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                int i23 = (i22 & (-218948668)) + ((-218948668) | i22);
                int i24 = ((i23 >> 17) - 65535) / 32768;
                int i25 = (i23 - (~(((i24 | 1) << 1) - (i24 ^ 1)))) - 1;
                int i26 = i23 >> 22;
                int i27 = (((i26 | (-2047)) << 1) - (i26 ^ (-2047))) / 1024;
                int i28 = (-(i25 ^ ((i27 ^ 1) + ((i27 & 1) << 1)))) + 2;
                int i29 = i28 >> 26;
                int i30 = ((i29 & ComposerKt.defaultsKey) + (i29 | ComposerKt.defaultsKey)) / 64;
                int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
                Loader.l(((-1062237984) / ((i28 & (-((i31 & 1) + (i31 | 1)))) * 3)) - 163867639);
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
