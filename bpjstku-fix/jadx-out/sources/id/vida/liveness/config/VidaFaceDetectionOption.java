package id.vida.liveness.config;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import id.vida.liveness.G1;
import id.vida.liveness.constants.Gestures;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public final class VidaFaceDetectionOption {

    @SerializedName("detectionTimeOut")
    private final long detectionTimeOut;

    @SerializedName("enableActiveLiveness")
    private final boolean enableActiveLiveness;

    @SerializedName("eyeCloseProbability")
    private float eyeCloseProbability;

    @SerializedName("eyeOpenProbability")
    private final float eyeOpenProbability;
    private HashSet<Gestures> gestures;

    @SerializedName("iouThreshold")
    private final float iouThreshold;

    @SerializedName("luminanceThreshold")
    private final float luminanceThreshold;

    @SerializedName("minFaceSize")
    private final int minFaceSize;

    @SerializedName("minPreviewHeight")
    private int minPreviewHeight;

    @SerializedName("minPreviewWidth")
    private int minPreviewWidth;

    @SerializedName("minimumStableFrames")
    private final int minimumStableFrames;

    @SerializedName("zoomGestureMinimumStableFrames")
    private final int zoomGestureMinimumStableFrames;
    private HashSet<G1> zoomGestures;

    @SerializedName("zoomGesturesFrameSizeMap")
    private final HashMap<G1, List<Float>> zoomGesturesFrameSizeMap;

    private static native Object[] $liveness$B72263313(VidaFaceDetectionOptionBuilder vidaFaceDetectionOptionBuilder);

    private static native void $liveness$E72263313(Object obj, Object obj2);

    private VidaFaceDetectionOption(VidaFaceDetectionOptionBuilder vidaFaceDetectionOptionBuilder) {
        $liveness$E72263313(this, $liveness$B72263313(vidaFaceDetectionOptionBuilder));
    }

    public final native long getDetectionTimeOut();

    public final native float getEyeCloseProbability();

    public final native float getEyeOpenProbability();

    public final native HashSet<Gestures> getGestures();

    public final native float getIOUThreshold();

    public final native float getLuminanceThreshold();

    public final native int getMinFaceSize();

    public final native int getMinPreviewHeight(Context context);

    public final native int getMinPreviewWidth(Context context);

    public final native int getMinimumStableFrames();

    public final native HashMap<G1, List<Float>> getZoomGestureFrameSizeMap();

    public final native int getZoomGestureMinimumStableFrames();

    public final native HashSet<G1> getZoomGestures();

    public final native boolean isEnableActiveLiveness();

    public final native String toString();

    public static class VidaFaceDetectionOptionBuilder {

        @SerializedName("allowedGestures")
        private HashSet<Gestures> allowedGestures;

        @SerializedName("allowedZoomGestures")
        private HashSet<G1> allowedZoomGestures;

        @SerializedName("detectionTimeOut")
        private int detectionTimeOut;

        @SerializedName("enableActiveLiveness")
        private boolean enableActiveLiveness;

        @SerializedName("eyeCloseProbability")
        private final float eyeCloseProbability;

        @SerializedName("eyeOpenProbability")
        private float eyeOpenProbability;

        @SerializedName("iouThreshold")
        private final float iouThreshold;

        @SerializedName("luminanceThreshold")
        private float luminanceThreshold;

        @SerializedName("minFaceSize")
        private final int minFaceSize;

        @SerializedName("minPreviewHeight")
        private int minPreviewHeight;

        @SerializedName("minPreviewWidth")
        private int minPreviewWidth;

        @SerializedName("minimumStableFrame")
        private int minimumStableFrame;

        @SerializedName("useSDKUI")
        private final boolean useSDKUI;

        @SerializedName("zoomGestureFrameSizeMap")
        private final HashMap<G1, List<Float>> zoomGestureFrameSizeMap;

        @SerializedName("zoomGestureMinimumStableFrame")
        private int zoomGestureMinimumStableFrame;

        private static native Object[] $liveness$Bea04eb7f();

        private static native void $liveness$Eea04eb7f(Object obj, Object obj2);

        private VidaFaceDetectionOptionBuilder() {
            $liveness$Eea04eb7f(this, $liveness$Bea04eb7f());
        }

        public static native VidaFaceDetectionOptionBuilder newInstance();

        public native VidaFaceDetectionOption build();

        public native VidaFaceDetectionOptionBuilder setAllowedGestures(HashSet<Gestures> hashSet);

        public native VidaFaceDetectionOptionBuilder setDetectionTimeout(int i);

        public native VidaFaceDetectionOptionBuilder setEnableActiveLiveness(boolean z);

        public native VidaFaceDetectionOptionBuilder setEyeOpenProbability(float f);

        public native VidaFaceDetectionOptionBuilder setLuminanceThreshold(float f);

        public native VidaFaceDetectionOptionBuilder setMinimumFrame(int i);

        public native VidaFaceDetectionOptionBuilder setZoomGestureMinimumStableFrame(int i);

        static {
            Object[] objArr;
            ClassLoader classLoader = VidaFaceDetectionOptionBuilder.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getTapTimeout() >> 16)), 1558 - TextUtils.lastIndexOf("", '0'), 24 - TextUtils.indexOf("", ""), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, 1753295283, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1753295283};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 43043), TextUtils.indexOf("", "") + 3111, 22 - View.MeasureSpec.makeMeasureSpec(0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 518, 76 - TextUtils.getTrimmedLength("")), Integer.TYPE});
                }
                Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i = ((int[]) objArr4[1])[0];
                int i2 = ((int[]) objArr4[2])[0];
                if (i2 == i) {
                    int i3 = ((int[]) objArr4[0])[0];
                    int i4 = ((int[]) objArr4[2])[0];
                    int i5 = ((int[]) objArr4[1])[0];
                    String[] strArr = (String[]) objArr4[3];
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i6 = ~startElapsedRealtime;
                    int i7 = i3 + (-1703104138) + (((~(774966700 | i6)) | 290365522) * (-108)) + (((~(i6 | 930064758)) | (~((-930064759) | startElapsedRealtime)) | 135267464) * 54) + ((startElapsedRealtime | 135267464) * 54);
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
                    int iMyPid = Process.myPid();
                    int i13 = i10 + (-553556516) + (((~((~iMyPid) | (-163846181))) | (-1541185279)) * (-591)) + ((iMyPid | (-163846181)) * 591);
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
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaFaceDetectionOptionBuilder.class, new Object[0]);
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
                    int i17 = ((i16 * i16) - (~(-(419541665 * i16)))) - 1;
                    int i18 = -(i16 * (-9607501));
                    int i19 = (i17 & i18) + (i18 | i17);
                    int i20 = (i19 ^ (-1370070812)) + (((-1370070812) & i19) << 1);
                    int i21 = i20 >> 16;
                    int i22 = i21 & (-131071);
                    int i23 = ((i21 ^ (-131071)) + (i22 << 1)) / 65536;
                    int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                    int i25 = (-(((i20 & i24) + (i20 | i24)) ^ (((i22 + (i21 | (-131071))) / 65536) + 1))) + 4;
                    int i26 = i25 >> 16;
                    int i27 = ((i26 & (-131071)) + (i26 | (-131071))) / 65536;
                    int i28 = (i27 & 1) + (i27 | 1);
                    Loader.l(((-1176051576) / ((i25 & (-((i28 & 1) + (i28 | 1)))) * 2)) - 560629637);
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
        ClassLoader classLoader = VidaFaceDetectionOption.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Color.alpha(0)), View.resolveSize(0, 0) + 1559, (KeyEvent.getMaxKeyCode() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1082910606, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1082910606};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.MeasureSpec.getSize(0)), 3110 - Process.getGidForName(""), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), 517 - ImageFormat.getBitsPerPixel(0), 77 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Integer.TYPE});
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
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = i3 + (-1532465114) + (((~(967675718 | iFreeMemory)) | 38936728) * (-140)) + ((~(1006612446 | iFreeMemory)) * 70) + (((~(iFreeMemory | 737355740)) | 308193434) * 70);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
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
                int i9 = ((int[]) objArr4[0])[0];
                int i10 = ((int[]) objArr4[2])[0];
                int i11 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i10};
                int i12 = ~((int) SystemClock.elapsedRealtime());
                int i13 = ~(734434210 | i12);
                int i14 = i9 + (-1136825702) + ((i13 | 970597248) * 764) + (((~(i12 | 970597248)) | 33853474) * (-1528)) + ((303869986 | i13) * 764);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaFaceDetectionOption.class, new Object[0]);
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
                int i19 = -(48669850 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * 1747195866);
                int i22 = ((i20 & i21) + (i21 | i20)) - (-250783012);
                int i23 = ((i22 >> 19) - 16383) / 8192;
                int i24 = (i23 ^ 1) + ((i23 & 1) << 1);
                int i25 = (i22 ^ i24) + ((i24 & i22) << 1);
                int i26 = i22 >> 29;
                int i27 = (((i26 | (-15)) << 1) - (i26 ^ (-15))) / 8;
                int i28 = (-(i25 ^ (((i27 | 1) << 1) - (i27 ^ 1)))) + 7;
                int i29 = i28 >> 21;
                int i30 = ((i29 ^ (-4095)) + ((i29 & (-4095)) << 1)) / 2048;
                Loader.l((2116381526 / ((i28 & (-((((i30 | 1) << 1) - (i30 ^ 1)) + 1))) * 2)) + 489431796);
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
