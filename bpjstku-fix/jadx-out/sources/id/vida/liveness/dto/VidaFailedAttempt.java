package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes5.dex */
public final class VidaFailedAttempt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("livenessScore")
    private double f1113a;

    @SerializedName("manipulationScore")
    private double b;

    @SerializedName("details")
    private String c;

    @SerializedName("errorCode")
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("transactionId")
    private String f1114e;

    private static native Object[] $liveness$B0feb8724(double d, double d2, int i, String str, String str2);

    private static native void $liveness$E0feb8724(Object obj, Object obj2);

    public VidaFailedAttempt(double d, double d2, int i, String str, String str2) {
        $liveness$E0feb8724(this, $liveness$B0feb8724(d, d2, i, str, str2));
    }

    public final native int getErrorCode();

    public final native String getErrorDetails();

    public final native double getLivenessScore();

    public final native double getManipulationScore();

    public final native String getTransactionId();

    static {
        Object[] objArr;
        ClassLoader classLoader = VidaFailedAttempt.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 3415), 1559 - Color.red(0), TextUtils.getCapsMode("", 0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -558987675, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -558987675};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042), 3111 - KeyEvent.keyCodeFromString(""), 21 - TextUtils.lastIndexOf("", '0'), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 518, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = ~iFreeMemory;
                int i7 = i3 + ((((~(i6 | 1239294450)) | ((~((-465737009) | i6)) | 302027776)) * (-397)) - 100537784) + ((iFreeMemory | 1377612994) * 397);
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
                int[] iArr = {i11};
                int iMyPid = Process.myPid();
                int i13 = ~iMyPid;
                int i14 = i10 + 1925169026 + ((iMyPid | 5242970) * 988) + ((1695295616 | (~(7489406 | i13))) * (-1976)) + (((~(iMyPid | (-1697542053))) | 5242970 | (~(1697542052 | i13))) * 988);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaFailedAttempt.class, new Object[0]);
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
                int i19 = -(114584338 * i17);
                int i20 = (i18 & i19) + (i18 | i19);
                int i21 = -(i17 * (-1950175306));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = (i22 & 783240976) + (783240976 | i22);
                int i24 = ((i23 >> 22) - 2047) / 1024;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = ((i23 | i25) << 1) - (i25 ^ i23);
                int i27 = ((i23 >> 29) - 15) / 8;
                int i28 = -(i26 ^ (((i27 | 1) << 1) - (i27 ^ 1)));
                int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                int i30 = i29 >> 15;
                Loader.l(((-762964875) / (((-((((i30 & (-262143)) + (i30 | (-262143))) / 131072) + 2)) & i29) * 5)) - 391775075);
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
