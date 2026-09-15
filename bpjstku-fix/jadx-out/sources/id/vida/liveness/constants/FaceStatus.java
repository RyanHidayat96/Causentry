package id.vida.liveness.constants;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class FaceStatus {
    private static /* synthetic */ FaceStatus[] $VALUES;
    public static FaceStatus BLINK_EYES;
    public static FaceStatus EYES_OCCLUDED;
    public static FaceStatus EYE_CLOSED;
    public static FaceStatus FACE_CHANGE_DETECTED;
    public static FaceStatus FACE_DETECTED;
    public static FaceStatus FACE_NOT_FRONTAL;
    public static FaceStatus FACE_OUT_OF_BOX;
    public static FaceStatus FACE_TOO_CLOSE;
    public static FaceStatus FACE_TOO_FAR;
    public static FaceStatus IMAGE_TOO_DARK;
    public static FaceStatus LEFT_EKY_CLOSED;
    public static FaceStatus MULTIPLE_FACE_DETECTED;
    public static FaceStatus NO_FACE_DETECTED;
    public static FaceStatus RIGHT_EKY_CLOSED;
    public static FaceStatus SHAKE_YOUR_HEAD;
    public static FaceStatus SMILE;
    public static FaceStatus SMILE_AND_BLINK;
    public static FaceStatus ZOOM;

    private static native /* synthetic */ void $liveness$COI();

    private static native /* synthetic */ FaceStatus[] $values();

    private FaceStatus(String str, int i) {
        super(str, i);
    }

    public static native FaceStatus valueOf(String str);

    public static native FaceStatus[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = FaceStatus.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, 206689913, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3414 - Color.green(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1559, (ViewConfiguration.getTouchSlop() >> 8) + 24, -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), 206689913};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSize(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 518, TextUtils.indexOf("", "", 0) + 76), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) Process.getStartElapsedRealtime());
                int i7 = i3 + (((1005714870 + (((~((-398706580) | i6)) | (-1306324880)) * (-933))) + (((~(i6 | (-1306324880))) | 1209804812) * 933)) - 1797542432);
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
                int i13 = i10 + 1360159950 + (((~((-673233700) | iUptimeMillis)) | (~(1031797759 | iUptimeMillis))) * 69) + (((~(iUptimeMillis | 1010629555)) | (~((-694401904) | iUptimeMillis)) | 21168204) * (-69)) + 1805477584;
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(FaceStatus.class, new Object[0]);
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
                int i18 = -(799212561 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * 616665737);
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = (i21 ^ (-1002818263)) + (((-1002818263) & i21) << 1);
                int i23 = (((i22 >> 28) - 31) / 16) + 1;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = i22 >> 24;
                int i26 = -(i24 ^ ((((i25 & (-511)) + (i25 | (-511))) / 256) + 1));
                int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                int i28 = ((i27 >> 22) - 2047) / 1024;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l((1238404006 / (((-((i29 ^ 1) + ((i29 & 1) << 1))) & i27) * 7)) + 1840896545);
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
