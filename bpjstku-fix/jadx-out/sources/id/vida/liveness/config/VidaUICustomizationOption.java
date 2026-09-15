package id.vida.liveness.config;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import id.vida.liveness.constants.CameraType;
import id.vida.liveness.constants.Shape;
import id.vida.liveness.constants.VIDAScreenFlow;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public final class VidaUICustomizationOption {

    @SerializedName("cameraOverlayStrokeWidth")
    private final int cameraOverlayStrokeWidth;

    @SerializedName("cameraType")
    private final CameraType cameraType;

    @SerializedName("consentScreenProgressCount")
    private final int consentScreenProgressCount;

    @SerializedName("consentScreenProgressTotalCount")
    private final int consentScreenProgressTotalCount;

    @SerializedName("locale")
    private final Locale locale;

    @SerializedName("maxRetryAttempt")
    private final int maxRetryAttempt;

    @SerializedName("overlayShape")
    private final Shape overlayShape;

    @SerializedName("screenFlow")
    private final VIDAScreenFlow screenFlow;

    @SerializedName("showConsentScreen")
    private final boolean showConsentScreen;

    @SerializedName("showReviewScreen")
    private final boolean showReviewScreen;

    @SerializedName("showTutorialScreen")
    private final boolean showTutorialScreen;

    @SerializedName("useSdkUI")
    private final boolean useSdkUI;

    private static native Object[] $liveness$B545b7e18(VidaUICustomizationOptionBuilder vidaUICustomizationOptionBuilder);

    private static native void $liveness$E545b7e18(Object obj, Object obj2);

    private VidaUICustomizationOption(VidaUICustomizationOptionBuilder vidaUICustomizationOptionBuilder) {
        $liveness$E545b7e18(this, $liveness$B545b7e18(vidaUICustomizationOptionBuilder));
    }

    public final native int getCameraOverlayStrokeWidth();

    public final native CameraType getCameraType();

    public final native int getConsentScreenProgressCount();

    public final native int getConsentScreenProgressTotalCount();

    public final native Locale getLocale();

    public final native int getMaxRetryAttempt();

    @Deprecated
    public final native int getMaxRetryAttemptAllowedForBackendLiveness();

    public final native Shape getOverlayShape();

    public final native VIDAScreenFlow getScreenFlow();

    public final native boolean getShowConsentScreen();

    public final native boolean getShowReviewScreen();

    public final native boolean getShowTutorialScreen();

    public final native boolean getUseSdkUI();

    public final native String toString();

    public static class VidaUICustomizationOptionBuilder {

        @SerializedName("cameraOverlayStrokeWidth")
        private int cameraOverlayStrokeWidth;

        @SerializedName("cameraType")
        private CameraType cameraType;

        @SerializedName("consentScreenProgressCount")
        private int consentScreenProgressCount;

        @SerializedName("consentScreenTotalProgressCount")
        private int consentScreenTotalProgressCount;

        @SerializedName("locale")
        private Locale locale;

        @SerializedName("maxRetryAttempt")
        private int maxRetryAttempt;

        @SerializedName("overlayShape")
        private Shape overlayShape;

        @SerializedName("screenFlow")
        private VIDAScreenFlow screenFlow;

        @SerializedName("showConsentScreen")
        private boolean showConsentScreen;

        @SerializedName("showReviewScreen")
        private boolean showReviewScreen;

        @SerializedName("showTutorialScreen")
        private boolean showTutorialScreen;

        @SerializedName("useSDKUI")
        private final boolean useSDKUI;

        private static native Object[] $liveness$Bc6bbec11();

        private static native void $liveness$Ec6bbec11(Object obj, Object obj2);

        private VidaUICustomizationOptionBuilder() {
            $liveness$Ec6bbec11(this, $liveness$Bc6bbec11());
        }

        public static native VidaUICustomizationOptionBuilder newInstance();

        public native VidaUICustomizationOption build();

        public native VidaUICustomizationOptionBuilder setCameraOverlayStrokeWidth(int i);

        public native VidaUICustomizationOptionBuilder setCameraType(CameraType cameraType);

        public native VidaUICustomizationOptionBuilder setConsentScreenProgressCount(int i);

        public native VidaUICustomizationOptionBuilder setConsentScreenTotalProgressCount(int i);

        public native VidaUICustomizationOptionBuilder setLocal(Locale locale);

        public native VidaUICustomizationOptionBuilder setMaxRetryAttempt(int i);

        @Deprecated
        public native VidaUICustomizationOptionBuilder setMaxRetryAttemptAllowedForBackendLiveness(int i);

        public native VidaUICustomizationOptionBuilder setOverlayShape(Shape shape);

        public native VidaUICustomizationOptionBuilder setScreenFlow(VIDAScreenFlow vIDAScreenFlow);

        public native VidaUICustomizationOptionBuilder setShowConsentScreen(boolean z);

        public native VidaUICustomizationOptionBuilder setShowReviewScreen(boolean z);

        public native VidaUICustomizationOptionBuilder setShowTutorialScreen(boolean z);

        static {
            Object[] objArr;
            ClassLoader classLoader = VidaUICustomizationOptionBuilder.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.alpha(0) + 3414), 1559 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, 1408101175, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1408101175};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 43042), 3111 - TextUtils.indexOf("", ""), 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AndroidCharacter.getMirror('0') - '0'), 517 - TextUtils.indexOf((CharSequence) "", '0', 0), 76 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE});
                }
                Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i = ((int[]) objArr4[1])[0];
                int i2 = ((int[]) objArr4[2])[0];
                if (i2 == i) {
                    int i3 = ((int[]) objArr4[0])[0];
                    int i4 = ((int[]) objArr4[2])[0];
                    int i5 = ((int[]) objArr4[1])[0];
                    String[] strArr = (String[]) objArr4[3];
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i6 = i3 + 1312898920 + (((-605037185) | iMaxMemory) * (-627)) + (((~((-1089442914) | iMaxMemory)) | 615588545) * (-627)) + (((~(iMaxMemory | 615588545)) | (~((~iMaxMemory) | 1089442913))) * 627);
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
                    int i12 = (int) Runtime.getRuntime().totalMemory();
                    int i13 = i9 + 1118489362 + (((~((~i12) | (-413049041))) | (~(1067431421 | i12))) * (-302)) + ((~((-413049041) | i12)) * (-604)) + (((~(i12 | 654382381)) | 16782344) * 302);
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
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaUICustomizationOptionBuilder.class, new Object[0]);
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
                    int i17 = ((i16 * i16) - (~(-(1090492764 * i16)))) - 1;
                    int i18 = -(i16 * 1385064986);
                    int i19 = (i17 & i18) + (i18 | i17);
                    int i20 = ((i19 | 1455226521) << 1) - (1455226521 ^ i19);
                    int i21 = i20 >> 18;
                    int i22 = (((i21 & (-32767)) + (i21 | (-32767))) / 16384) + 1;
                    int i23 = (i20 & i22) + (i22 | i20);
                    int i24 = i20 >> 19;
                    int i25 = ((i24 & (-16383)) + (i24 | (-16383))) / 8192;
                    int i26 = -(i23 ^ (((i25 | 1) << 1) - (i25 ^ 1)));
                    int i27 = (i26 ^ 3) + ((i26 & 3) << 1);
                    int i28 = i27 >> 23;
                    int i29 = (((i28 | (-1023)) << 1) - (i28 ^ (-1023))) / 512;
                    int i30 = (i29 & 1) + (i29 | 1);
                    Loader.l(((-1589194251) / (((-(((i30 | 1) << 1) - (i30 ^ 1))) & i27) * 3)) - 945391100);
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
        ClassLoader classLoader = VidaUICustomizationOption.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3462 - AndroidCharacter.getMirror('0')), View.combineMeasuredStates(0, 0) + 1559, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 439728272, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 439728272};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 43043), 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 518 - (ViewConfiguration.getScrollBarSize() >> 8), 76 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Integer.TYPE});
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
                int i6 = i3 + 1723541638 + (((~((~iElapsedRealtime) | 824588837)) | (-897482494)) * 529) + (((~(iElapsedRealtime | 824588837)) | (-880442622)) * 529);
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
                int iMyPid = Process.myPid();
                int i12 = ~iMyPid;
                int i13 = ~(19883699 | i12);
                int i14 = i9 + 1962068482 + ((1682968652 | i13) * (-712)) + (((~(iMyPid | 1702852351)) | (~(i12 | (-1682968653)))) * (-712)) + (((-1685147760) | i13) * 712);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaUICustomizationOption.class, new Object[0]);
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
                int i19 = -(1549711320 * i17);
                int i20 = ((((i18 | i19) << 1) - (i18 ^ i19)) - (~(-(i17 * (-425665426))))) - (-878002376);
                int i21 = ((i20 >> 19) - 16383) / 8192;
                int i22 = (i20 - (~((i21 & 1) + (i21 | 1)))) - 1;
                int i23 = i20 >> 26;
                int i24 = ((i23 & ComposerKt.defaultsKey) + (i23 | ComposerKt.defaultsKey)) / 64;
                int i25 = (-(i22 ^ ((i24 ^ 1) + ((i24 & 1) << 1)))) + 6;
                int i26 = i25 >> 16;
                int i27 = ((i26 & (-131071)) + (i26 | (-131071))) / 65536;
                int i28 = (i27 & 1) + (i27 | 1);
                Loader.l((1718653932 / ((i25 & (-((i28 ^ 1) + ((i28 & 1) << 1)))) * 2)) + 1909317645);
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
