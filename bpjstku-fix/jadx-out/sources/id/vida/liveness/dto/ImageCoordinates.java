package id.vida.liveness.dto;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
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

/* JADX INFO: loaded from: classes7.dex */
public final class ImageCoordinates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("topLeftCorner")
    private Coordinates f1097a;

    @SerializedName("bottomRightCorner")
    private Coordinates b;

    public final native Coordinates getBottomRightCorner();

    public final native Coordinates getTopLeftCorner();

    public final native void setBottomRightCorner(Coordinates coordinates);

    public final native void setTopLeftCorner(Coordinates coordinates);

    static {
        Object[] objArr;
        ClassLoader classLoader = ImageCoordinates.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 3414), (ViewConfiguration.getPressedStateDuration() >> 16) + 1559, 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1974816716, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1974816716};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042), 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 518 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 76 - View.combineMeasuredStates(0, 0)), Integer.TYPE});
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
                int i6 = i3 + ((~((~iMyTid) | (-408556179))) * 130) + 88530030 + (((~(iMyTid | (-408556179))) | 336968) * 130);
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
                int[] iArr = {i11};
                int iMyPid = Process.myPid();
                int i12 = (-1296323502) + (((~((~iMyPid) | (-758738122))) | 85468288) * (-245));
                int i13 = ~(iMyPid | (-758738122));
                int i14 = i9 + i12 + (i13 * (-245)) + ((i13 | 946293337) * 245);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ImageCoordinates.class, new Object[0]);
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
                int i18 = ((i17 * i17) - (~(-(941246747 * i17)))) - 1;
                int i19 = -(i17 * 196919407);
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                int i21 = (i20 ^ (-796278887)) + (((-796278887) & i20) << 1);
                int i22 = i21 >> 22;
                int i23 = ((i22 & (-2047)) + (i22 | (-2047))) / 1024;
                int i24 = (i23 ^ 1) + ((i23 & 1) << 1);
                int i25 = (i21 & i24) + (i24 | i21);
                int i26 = ((i21 >> 18) - 32767) / 16384;
                int i27 = (-(i25 ^ ((i26 & 1) + (i26 | 1)))) + 1;
                int i28 = ((i27 >> 20) - 8191) / 4096;
                int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                Loader.l((893694110 / ((i27 & (-((i29 & 1) + (i29 | 1)))) * 5)) + 564615947);
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
