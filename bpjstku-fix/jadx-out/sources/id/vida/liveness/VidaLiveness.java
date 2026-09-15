package id.vida.liveness;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.config.VidaUICustomizationOption;
import id.vida.liveness.dto.VidaLivenessRequest;
import id.vida.liveness.listeners.VidaLivenessListener;
import id.vida.liveness.listeners.VidaLogger;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public final class VidaLiveness {
    public static String TAG;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VidaFaceDetectionOption f1061a;
    public VidaUICustomizationOption b;
    public WeakReference c;
    public VidaLivenessRequest d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VidaLivenessListener f1062e;
    public VidaLogger f;
    public boolean g;
    public Q h;

    private static native Object[] $liveness$B6dfcbe97(VidaLivenessBuilder vidaLivenessBuilder);

    private static native /* synthetic */ void $liveness$COI();

    private static native void $liveness$E6dfcbe97(Object obj, Object obj2);

    public VidaLiveness(VidaLivenessBuilder vidaLivenessBuilder) {
        $liveness$E6dfcbe97(this, $liveness$B6dfcbe97(vidaLivenessBuilder));
    }

    public final native String getSDKVersion();

    public final native void initialize() throws VIDAException;

    public final native void release();

    public final native void startDetection();

    public final native void stopDetection();

    public static class VidaLivenessBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VidaFaceDetectionOption f1063a;
        public VidaUICustomizationOption b;
        public final WeakReference c;
        public final VidaLivenessRequest d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final VidaLivenessListener f1064e;
        public VidaLogger f;

        private static native Object[] $liveness$B2642903b(WeakReference weakReference, VidaLivenessRequest vidaLivenessRequest, VidaLivenessListener vidaLivenessListener);

        private static native void $liveness$E2642903b(Object obj, Object obj2);

        public VidaLivenessBuilder(WeakReference weakReference, VidaLivenessRequest vidaLivenessRequest, VidaLivenessListener vidaLivenessListener) {
            $liveness$E2642903b(this, $liveness$B2642903b(weakReference, vidaLivenessRequest, vidaLivenessListener));
        }

        public static native VidaLivenessBuilder newInstance(WeakReference<Activity> weakReference, VidaLivenessRequest vidaLivenessRequest, VidaLivenessListener vidaLivenessListener);

        public native VidaLiveness build() throws VIDAException;

        public native WeakReference<Activity> getActivity();

        public native VidaFaceDetectionOption getDetectionOptions();

        public native VidaLivenessListener getLivenessListener();

        public native VidaLivenessRequest getLivenessRequestDTO();

        public native VidaLogger getLogger();

        public native VidaUICustomizationOption getUICustomizationOptions();

        public native VidaLivenessBuilder setDetectionOptions(VidaFaceDetectionOption vidaFaceDetectionOption);

        public native VidaLivenessBuilder setLogger(VidaLogger vidaLogger);

        public native VidaLivenessBuilder setUICustomizationOptions(VidaUICustomizationOption vidaUICustomizationOption);

        static {
            Object[] objArr;
            ClassLoader classLoader = VidaLivenessBuilder.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3414), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1558, 'H' - AndroidCharacter.getMirror('0'), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, -1686677410, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1686677410};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 43042), ExpandableListView.getPackedPositionGroup(0L) + 3111, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 518, (ViewConfiguration.getFadingEdgeLength() >> 16) + 76), Integer.TYPE});
                }
                Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i = ((int[]) objArr4[1])[0];
                int i2 = ((int[]) objArr4[2])[0];
                if (i2 == i) {
                    int i3 = ((int[]) objArr4[0])[0];
                    int i4 = ((int[]) objArr4[2])[0];
                    int i5 = ((int[]) objArr4[1])[0];
                    String[] strArr = (String[]) objArr4[3];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i6 = i3 + ((((-1744362186) + (((~iElapsedRealtime) | 10565696) * 1324)) + (((~(iElapsedRealtime | 1085767232)) | (~(619264226 | iElapsedRealtime))) * (-1324))) - 1949653268);
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
                    int[] iArr = {i10};
                    int[] iArr2 = {i11};
                    int iNextInt = new Random().nextInt();
                    int i12 = (-1752456194) + ((iNextInt | 259595104) * (-50));
                    int i13 = ~((-102832961) | iNextInt);
                    int i14 = ~iNextInt;
                    int i15 = i9 + i12 + ((i13 | (~(i14 | (-1342603395)))) * 50) + (((~(i14 | 259595104)) | (~((-1445436355) | i14)) | 1342603394) * 50);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                    objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
                }
                try {
                    Class<?> cls = Class.forName("java.lang.Runtime");
                    Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                    Class<?> cls3 = Class.forName("java.lang.String");
                    Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaLivenessBuilder.class, new Object[0]);
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
                    int i19 = i18 * i18;
                    int i20 = -(1711049538 * i18);
                    int i21 = (i19 & i20) + (i19 | i20);
                    int i22 = -(i18 * (-1523292686));
                    int i23 = ((i21 & i22) + (i22 | i21)) - (-1940962468);
                    int i24 = ((i23 >> 23) - 1023) / 512;
                    int i25 = ((i24 | 1) << 1) - (i24 ^ 1);
                    int i26 = (i23 & i25) + (i25 | i23);
                    int i27 = i23 >> 25;
                    int i28 = (((i27 | (-255)) << 1) - (i27 ^ (-255))) / 128;
                    int i29 = -(i26 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
                    int i30 = (i29 & 2) + (i29 | 2);
                    int i31 = i30 >> 22;
                    int i32 = ((i31 ^ (-2047)) + ((i31 & (-2047)) << 1)) / 1024;
                    int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
                    Loader.l((669936388 / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 2)) + 1409927783);
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

    static {
        Object[] objArr;
        ClassLoader classLoader = VidaLiveness.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getTrimmedLength("") + 1559, ExpandableListView.getPackedPositionGroup(0L) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -120739720, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -120739720};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 3111, (Process.myPid() >> 22) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 518, 76 - (KeyEvent.getMaxKeyCode() >> 16)), Integer.TYPE});
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
                int[] iArr2 = {i5};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = ~((-1444013157) | iElapsedRealtime);
                int i7 = ~iElapsedRealtime;
                int i8 = i6 | (~(261018302 | i7));
                int i9 = ~(1444013156 | i7);
                int i10 = i3 + (-2049947206) + ((i8 | i9) * (-516)) + (((~(iElapsedRealtime | (-100712485))) | (~((-160305819) | i7))) * 516) + ((160305818 | i9) * 516);
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i13 = ((int[]) objArr4[0])[0];
                int i14 = ((int[]) objArr4[2])[0];
                int i15 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i16 = i13 + 1489877946 + ((~((~iUptimeMillis) | 1610612506)) * (-116)) + ((400948746 | iUptimeMillis) * 116) + (((~(iUptimeMillis | (-1304082713))) | 94418952) * 116);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i15}, new int[]{i14}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaLiveness.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i19 = ((int[]) objArr[0])[0];
                int i20 = i19 * i19;
                int i21 = -(1432502405 * i19);
                int i22 = (i20 & i21) + (i20 | i21);
                int i23 = -(i19 * 639642917);
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = (i24 ^ 988319033) + ((988319033 & i24) << 1);
                int i26 = i25 >> 29;
                int i27 = ((((i26 | (-15)) << 1) - (i26 ^ (-15))) / 8) + 1;
                int i28 = ((i25 | i27) << 1) - (i27 ^ i25);
                int i29 = i25 >> 27;
                int i30 = (((i29 | (-63)) << 1) - (i29 ^ (-63))) / 32;
                int i31 = (-(i28 ^ ((i30 ^ 1) + ((i30 & 1) << 1)))) + 2;
                Loader.l(((-684033752) / ((i31 & (-((((i31 >> 22) - 2047) / 1024) + 2))) * 2)) - 877031420);
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
