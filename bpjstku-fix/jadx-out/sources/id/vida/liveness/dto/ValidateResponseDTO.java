package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class ValidateResponseDTO implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("token")
    private String f1103a;

    @SerializedName("attributes")
    private PartnerAttributes b;

    @SerializedName("workflows")
    private List<ProductWorkflowLiteDTO> c;

    @SerializedName("certiStorage")
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("tncMessages")
    private TermsAndCondition f1104e;

    @SerializedName("links")
    private Links f;

    private static native Object[] $liveness$B8ba410a5();

    private static native void $liveness$E8ba410a5(Object obj, Object obj2);

    public ValidateResponseDTO() {
        $liveness$E8ba410a5(this, $liveness$B8ba410a5());
    }

    public final native PartnerAttributes getAttributes();

    public final native int getCertiStorage();

    public final native Links getLinks();

    public final native TermsAndCondition getTermsAndCondition();

    public final native String getToken();

    public final native ProductWorkflowLiteDTO getWorkflowForFeature(int i);

    public final native List<ProductWorkflowLiteDTO> getWorkflows();

    public final native void setAttributes(PartnerAttributes partnerAttributes);

    public final native void setCertiStorage(int i);

    public final native void setLinks(Links links);

    public final native void setTermsAndCondition(TermsAndCondition termsAndCondition);

    public final native void setToken(String str);

    public final native void setWorkflows(List<ProductWorkflowLiteDTO> list);

    public static class PartnerAttributes implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("text_colour")
        private String f1107a;

        @SerializedName("background_colour")
        private String b;

        public native String getBackgroundColor();

        public native String getTextColor();

        public native void setBackgroundColor(String str);

        public native void setTextColor(String str);

        static {
            Object[] objArr;
            ClassLoader classLoader = PartnerAttributes.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 3414), View.MeasureSpec.getMode(0) + 1559, 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, -369534018, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -369534018};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 43042), 3110 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - View.resolveSize(0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 518 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTouchSlop() >> 8) + 76), Integer.TYPE});
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
                    int i6 = ~iElapsedRealtime;
                    int i7 = i3 + 426752079 + (((~((-1044519032) | i6)) | 402653268) * 98) + (((~(i6 | (-660512428))) | (-1044519032) | (~(660512427 | iElapsedRealtime))) * (-49)) + (((~(iElapsedRealtime | (-1044519032))) | (-1063165696)) * 49);
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
                    int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                    int i13 = ~iElapsedRealtime2;
                    int i14 = ~(909385914 | i13);
                    int i15 = i10 + (-1968700654) + ((155752000 | i14) * (-712)) + (((~(iElapsedRealtime2 | 1065137914)) | (~(i13 | (-155752001)))) * (-712)) + (((-795645545) | i14) * 712);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                    objArr = new Object[]{new int[1], new int[]{i12}, iArr, strArr3};
                }
                try {
                    Class<?> cls = Class.forName("java.lang.Runtime");
                    Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                    Class<?> cls3 = Class.forName("java.lang.String");
                    Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(PartnerAttributes.class, new Object[0]);
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
                    int i20 = -(729227134 * i18);
                    int i21 = (((i19 & i20) + (i19 | i20)) - (~(-(i18 * 1733353376)))) - (-901263840);
                    int i22 = i21 >> 19;
                    int i23 = (((i22 | (-16383)) << 1) - (i22 ^ (-16383))) / 8192;
                    int i24 = (i23 & 1) + (i23 | 1);
                    int i25 = ((i21 | i24) << 1) - (i24 ^ i21);
                    int i26 = i21 >> 16;
                    int i27 = ((i26 & (-131071)) + (i26 | (-131071))) / 65536;
                    int i28 = (-((((i27 | 1) << 1) - (i27 ^ 1)) ^ i25)) + 1;
                    int i29 = (((i28 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
                    Loader.l((711892872 / ((i28 & (-(((i29 | 1) << 1) - (i29 ^ 1)))) * 4)) + 609111620);
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

    public static class ProductWorkflowLiteDTO implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("screenSequenceList")
        private List<String> f1108a;

        @SerializedName("livenessTimeout")
        private int b;

        @SerializedName("livenessChallenges")
        private int c;

        @SerializedName("camera")
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("selfieRetry")
        private boolean f1109e;

        @SerializedName("maximunRetry")
        private int f;

        @SerializedName("suspendTime")
        private int g;

        @SerializedName("featureId")
        private Long h;

        @SerializedName("authTimeOut")
        private int i;

        public native int getAuthTimeOut();

        public native String getCamera();

        public native Long getFeatureId();

        public native int getLivenessChallenges();

        public native int getLivenessTimeout();

        public native int getMaximunRetry();

        public native List<String> getScreenSequenceList();

        public native boolean getSelfieRetry();

        public native int getSuspendTime();

        public native void setAuthTimeOut(int i);

        public native void setCamera(String str);

        public native void setFeatureId(long j);

        public native void setLivenessChallenges(int i);

        public native void setLivenessTimeout(int i);

        public native void setMaximunRetry(int i);

        public native void setScreenSequenceList(List<String> list);

        public native void setSelfieRetry(boolean z);

        public native void setSuspendTime(int i);

        static {
            Object[] objArr;
            ClassLoader classLoader = ProductWorkflowLiteDTO.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSize(0, 0) + 3414), 1559 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.keyCodeFromString("") + 24, -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, -1130081582, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1130081582};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3110, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", ""), 566 - AndroidCharacter.getMirror('0'), TextUtils.getTrimmedLength("") + 76), Integer.TYPE});
                }
                Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i = ((int[]) objArr4[1])[0];
                int i2 = ((int[]) objArr4[2])[0];
                if (i2 == i) {
                    int i3 = ((int[]) objArr4[0])[0];
                    int i4 = ((int[]) objArr4[2])[0];
                    int i5 = ((int[]) objArr4[1])[0];
                    String[] strArr = (String[]) objArr4[3];
                    int iMyUid = Process.myUid();
                    int i6 = ~(682696281 | iMyUid);
                    int i7 = i3 + (-480370765) + ((340689024 | i6) * (-814)) + ((i6 | (~((-1022335178) | (~iMyUid))) | 1050128) * 407) + (((~(iMyUid | 1022335177)) | 1050128 | (~((-682696282) | iMyUid))) * 407);
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
                    int[] iArr = {i12};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i13 = ~iMaxMemory;
                    int i14 = (-1598473122) + (((~(1695758652 | i13)) | 9192642) * (-1188));
                    int i15 = (~(iMaxMemory | (-1695758653))) | 9192642;
                    int i16 = ~(9272806 | i13);
                    int i17 = i10 + i14 + ((i15 | i16) * 594) + (((~((-1695758653) | i13)) | 1695678488 | i16) * 594);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                    objArr = new Object[]{new int[1], iArr, new int[]{i11}, strArr3};
                }
                try {
                    Class<?> cls = Class.forName("java.lang.Runtime");
                    Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                    Class<?> cls3 = Class.forName("java.lang.String");
                    Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ProductWorkflowLiteDTO.class, new Object[0]);
                    if (Build.VERSION.SDK_INT <= 24) {
                        Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                    } else {
                        Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                    }
                    int i20 = ((int[]) objArr[0])[0];
                    int i21 = ((i20 * i20) - (~(-(1139719160 * i20)))) - 1;
                    int i22 = -(i20 * (-1913176276));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    int i24 = ((i23 | 53602116) << 1) - (53602116 ^ i23);
                    int i25 = i24 >> 17;
                    int i26 = ((i25 & (-65535)) + (i25 | (-65535))) / 32768;
                    int i27 = ((i26 | 1) << 1) - (i26 ^ 1);
                    int i28 = ((i24 | i27) << 1) - (i27 ^ i24);
                    int i29 = ((i24 >> 28) - 31) / 16;
                    int i30 = -(i28 ^ ((i29 & 1) + (i29 | 1)));
                    int i31 = ((i30 | 4) << 1) - (i30 ^ 4);
                    int i32 = i31 >> 23;
                    int i33 = ((i32 & (-1023)) + (i32 | (-1023))) / 512;
                    int i34 = (i33 & 1) + (i33 | 1);
                    Loader.l((1202851504 / (((-(((i34 | 1) << 1) - (i34 ^ 1))) & i31) * 2)) + 1572788537);
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
        ClassLoader classLoader = ValidateResponseDTO.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.combineMeasuredStates(0, 0) + 1559, 24 - Color.argb(0, 0, 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -610170100, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -610170100};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - MotionEvent.axisFromString("")), 3111 - Gravity.getAbsoluteGravity(0, 0), 22 - TextUtils.indexOf("", "", 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), KeyEvent.getDeadChar(0, 0) + 518, 76 - KeyEvent.getDeadChar(0, 0)), Integer.TYPE});
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
                int i7 = i3 + 1636481818 + (((~((-704726917) | i6)) | (~((-285212675) | iFreeMemory)) | (~((-10364953) | iFreeMemory))) * 765) + ((704726916 | (~((-989939591) | i6))) * 1530) + (((~((-989939591) | iFreeMemory)) | (~(i6 | (-10364953)))) * 765);
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
                int i13 = i10 + 563330354 + (((-1612220573) | iUptimeMillis) * 376) + (((~((~iUptimeMillis) | 584359763)) | (-1658626016)) * (-376)) + (((~(iUptimeMillis | (-584359764))) | 1120671695) * 376);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ValidateResponseDTO.class, new Object[0]);
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
                int i18 = -(1341218736 * i16);
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                int i20 = -(i16 * 1524542226);
                int i21 = (((i19 | i20) << 1) - (i20 ^ i19)) - 923996479;
                int i22 = i21 >> 24;
                int i23 = (((i22 | (-511)) << 1) - (i22 ^ (-511))) / 256;
                int i24 = (i21 - (~(((i23 | 1) << 1) - (i23 ^ 1)))) - 1;
                int i25 = i21 >> 15;
                int i26 = (((i25 | (-262143)) << 1) - (i25 ^ (-262143))) / 131072;
                int i27 = -(i24 ^ ((i26 & 1) + (i26 | 1)));
                int i28 = (i27 & 7) + (i27 | 7);
                int i29 = i28 >> 26;
                int i30 = (((i29 & ComposerKt.defaultsKey) + (i29 | ComposerKt.defaultsKey)) / 64) + 1;
                Loader.l(((-2142803754) / (((-((i30 & 1) + (i30 | 1))) & i28) * 2)) - 1947092267);
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

    public static class TermsAndCondition implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("en")
        private String f1110a;

        @SerializedName("id")
        private String b;

        public native String getMessageForEnglish();

        public native String getMessageForIndonesian();

        public native void setMessageForEnglish(String str);

        public native void setMessageForIndonesian(String str);

        static {
            Object[] objArr;
            ClassLoader classLoader = TermsAndCondition.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 3415), 1559 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 24 - ExpandableListView.getPackedPositionType(0L), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, 2092832916, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2092832916};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3110, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 518 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Gravity.getAbsoluteGravity(0, 0) + 76), Integer.TYPE});
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
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i6 = ~elapsedCpuTime;
                    int i7 = (~((-471816395) | i6)) | 134305864;
                    int i8 = ~(elapsedCpuTime | 1570725594);
                    int i9 = i3 + 407098450 + ((i7 | i8) * (-502)) + ((i8 | (~(i6 | (-337510531)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
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
                    int i12 = ((int[]) objArr4[0])[0];
                    int i13 = ((int[]) objArr4[2])[0];
                    int i14 = ((int[]) objArr4[1])[0];
                    String[] strArr3 = (String[]) objArr4[3];
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int i15 = (~((-740846638) | elapsedCpuTime2)) | 673728549;
                    int i16 = ~elapsedCpuTime2;
                    int i17 = i12 + 1583426368 + ((i15 | (~(i16 | 1031302909))) * 886) + (((~(i16 | 740846637)) | 964184821) * (-1772)) + ((~(i16 | 964184821)) * 886);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                    objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
                }
                try {
                    Class<?> cls = Class.forName("java.lang.Runtime");
                    Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                    Class<?> cls3 = Class.forName("java.lang.String");
                    Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(TermsAndCondition.class, new Object[0]);
                    if (Build.VERSION.SDK_INT <= 24) {
                        Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                    } else {
                        Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                    }
                    int i20 = ((int[]) objArr[0])[0];
                    int i21 = i20 * i20;
                    int i22 = -(1995075045 * i20);
                    int i23 = (i21 & i22) + (i21 | i22);
                    int i24 = -(i20 * (-1639054523));
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    int i26 = (i25 ^ (-1508276551)) + (((-1508276551) & i25) << 1);
                    int i27 = ((i26 >> 17) - 65535) / 32768;
                    int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                    int i29 = ((i26 | i28) << 1) - (i28 ^ i26);
                    int i30 = ((i26 >> 23) - 1023) / 512;
                    int i31 = -(i29 ^ ((i30 & 1) + (i30 | 1)));
                    int i32 = (i31 & 4) + (i31 | 4);
                    int i33 = i32 >> 28;
                    int i34 = ((i33 & (-31)) + (i33 | (-31))) / 16;
                    Loader.l(((-1374857080) / (((-(((i34 & 1) + (i34 | 1)) + 1)) & i32) * 2)) - 147492127);
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

    public static class LinksData implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("hyperlink")
        private String f1106a;

        @SerializedName("displayText")
        private String b;

        @SerializedName("text")
        private String c;

        public native String getDisplayText();

        public native String getHyperlink();

        public native String getLinkPlaceHolderText();

        public native void setDisplayText(String str);

        public native void setHyperlink(String str);

        public native void setLinkPlaceHolderText(String str);

        static {
            Object[] objArr;
            ClassLoader classLoader = LinksData.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Drawable.resolveOpacity(0, 0)), View.getDefaultSize(0, 0) + 1559, 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, 1576187746, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1576187746};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 43042), 3111 - View.resolveSize(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 518, 76 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Integer.TYPE});
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
                    int i6 = i3 + (-865710054) + ((~((~iElapsedRealtime) | (-73139217))) * 433) + (((~((-958657230) | iElapsedRealtime)) | (-746374230)) * (-433)) + (((~(iElapsedRealtime | (-746374230))) | (-1031796446)) * 433);
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
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i12 = ~startElapsedRealtime;
                    int i13 = i9 + (-1192998726) + (((~(startElapsedRealtime | 1000147342)) | (~((-704711045) | i12)) | (-1000320415)) * (-68)) + ((~((-173073) | i12)) * (-68)) + (((~((-1000147343) | i12)) | (-704884117)) * 68);
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
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(LinksData.class, new Object[0]);
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
                    int i17 = ((i16 * i16) - (~(-(2052889514 * i16)))) - 1;
                    int i18 = -(i16 * (-1737904844));
                    int i19 = ((i17 & i18) + (i18 | i17)) - (-17393697);
                    int i20 = i19 >> 26;
                    int i21 = ((i20 ^ ComposerKt.defaultsKey) + ((i20 & ComposerKt.defaultsKey) << 1)) / 64;
                    int i22 = (i21 & 1) + (i21 | 1);
                    int i23 = (i19 ^ i22) + ((i22 & i19) << 1);
                    int i24 = i19 >> 29;
                    int i25 = -(i23 ^ (((((i24 | (-15)) << 1) - (i24 ^ (-15))) / 8) + 1));
                    int i26 = (i25 & 1) + (i25 | 1);
                    int i27 = i26 >> 28;
                    int i28 = (((i27 | (-31)) << 1) - (i27 ^ (-31))) / 16;
                    int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                    Loader.l(((-629520472) / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i26) * 4)) - 1548590756);
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

    public static class Links implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("en")
        private List<LinksData> f1105a;

        @SerializedName("id")
        private List<LinksData> b;

        public native List<LinksData> getLinksDataForEnglish();

        public native List<LinksData> getLinksDataInIndonesian();

        public native void setLinksDataForEnglish(List<LinksData> list);

        public native void setLinksDataForIndonesian(List<LinksData> list);

        static {
            Object[] objArr;
            ClassLoader classLoader = Links.class.getClassLoader();
            try {
                Object[] objArr2 = {1257092341};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 3414), 1559 - KeyEvent.keyCodeFromString(""), 24 - KeyEvent.keyCodeFromString(""), -86093833, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {"liveness", classLoader, false, 856400562, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 856400562};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3111 - (ViewConfiguration.getLongPressTimeout() >> 16), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.alpha(0) + 518, (Process.myTid() >> 22) + 76), Integer.TYPE});
                }
                Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i = ((int[]) objArr4[1])[0];
                int i2 = ((int[]) objArr4[2])[0];
                if (i2 == i) {
                    int i3 = ((int[]) objArr4[0])[0];
                    int i4 = ((int[]) objArr4[2])[0];
                    int i5 = ((int[]) objArr4[1])[0];
                    String[] strArr = (String[]) objArr4[3];
                    int iNextInt = new Random().nextInt(1958363511);
                    int i6 = i3 + 2031687770 + (((~((-1362924125) | iNextInt)) | 342107334) * (-366)) + (((~(iNextInt | (-1092129305))) | 71312514) * 366);
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
                    int iNextInt2 = new Random().nextInt(408586343);
                    int i12 = i9 + (-611780919) + (((~((~iNextInt2) | (-733282576))) | 971748883) * (-235)) + (((~((-733282576) | iNextInt2)) | 971748883) * (-470)) + (((~(iNextInt2 | (-34865421))) | 273331728) * 235);
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
                    Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Links.class, new Object[0]);
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
                    int i17 = -(683508495 * i15);
                    int i18 = (((i16 & i17) + (i16 | i17)) - (~(-(i15 * (-457599621))))) - 1;
                    int i19 = (i18 ^ 1974045337) + ((1974045337 & i18) << 1);
                    int i20 = i19 >> 21;
                    int i21 = (((i20 | (-4095)) << 1) - (i20 ^ (-4095))) / 2048;
                    int i22 = (i21 & 1) + (i21 | 1);
                    int i23 = (i19 & i22) + (i22 | i19);
                    int i24 = i19 >> 23;
                    int i25 = ((i24 & (-1023)) + (i24 | (-1023))) / 512;
                    int i26 = (-((((i25 | 1) << 1) - (i25 ^ 1)) ^ i23)) + 6;
                    int i27 = i26 >> 24;
                    int i28 = ((i27 & (-511)) + (i27 | (-511))) / 256;
                    int i29 = (i28 & 1) + (i28 | 1);
                    Loader.l(((-1753924044) / ((i26 & (-((i29 ^ 1) + ((i29 & 1) << 1)))) * 2)) - 716395570);
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
}
