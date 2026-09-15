package id.vida.liveness;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import defpackage.initSession;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public abstract class C0 {
    public static native ArrayList a(ArrayList arrayList);

    public static native List<byte[]> getActiveLivenessImages(Activity activity);

    public static native int getCustomisableErrorMessage(int i);

    public static native VidaLivenessResponse getGeneralVidaLivenessResponse(Activity activity, double d, double d2);

    public static native String getSDKErrorMessage(int i, Fragment fragment);

    public static native boolean isErrorCodeWhitelistedForRetries(int i);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 3415), 16778775 + Color.rgb(0, 0, 0), 24 - (ViewConfiguration.getScrollBarSize() >> 8), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1069402286, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1069402286};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43090 - AndroidCharacter.getMirror('0')), 3110 - ImageFormat.getBitsPerPixel(0), Color.green(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), 518 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i4};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~((-100044155) | iUptimeMillis);
                int i7 = ~iUptimeMillis;
                int i8 = i3 + (-1553910606) + ((i6 | (~(1604987304 | i7))) * (-1808)) + (((~((-94505257) | iUptimeMillis)) | (~(i7 | 1610526202))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iUptimeMillis | (-1604987305))) | 5538898 | (~(100044154 | i7))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
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
                int i14 = ~((~((int) SystemClock.elapsedRealtime())) | 1086748550);
                int i15 = i11 + ((1074020354 | i14) * (-970)) + 366273678 + ((i14 | 12728196) * 970);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0.class, new Object[0]);
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
                int i19 = ((i18 * i18) - (~(-(1330500440 * i18)))) - 1;
                int i20 = -(i18 * 6826464);
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = (i21 & 652865296) + (652865296 | i21);
                int i23 = i22 >> 28;
                int i24 = ((i23 ^ (-31)) + ((i23 & (-31)) << 1)) / 16;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = (i22 & i25) + (i25 | i22);
                int i27 = i22 >> 22;
                int i28 = ((i27 & (-2047)) + (i27 | (-2047))) / 1024;
                int i29 = (-(((i28 ^ 1) + ((i28 & 1) << 1)) ^ i26)) + 4;
                int i30 = i29 >> 19;
                int i31 = ((i30 & (-16383)) + (i30 | (-16383))) / 8192;
                int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                Loader.l(((-1416601776) / ((i29 & (-((i32 & 1) + (i32 | 1)))) * 2)) - 48861538);
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
