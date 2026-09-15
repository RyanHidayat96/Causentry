package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class VidaLivenessResponseBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("imageBytes")
    private byte[] f1119a;

    @SerializedName("livenessScore")
    private double b;

    @SerializedName("manipulationScore")
    private double c;

    @SerializedName("details")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("transactionId")
    private String f1120e;

    @SerializedName("additionalImages")
    private List<byte[]> f;

    @SerializedName("sessionId")
    private String g;

    @SerializedName("failedAttempts")
    private List<VidaFailedAttempt> h;

    private static native Object[] $liveness$B9ad83304();

    private static native void $liveness$E9ad83304(Object obj, Object obj2);

    public VidaLivenessResponseBuilder() {
        $liveness$E9ad83304(this, $liveness$B9ad83304());
    }

    public static native VidaLivenessResponseBuilder getInstance();

    public final native VidaLivenessResponse build();

    public final native VidaLivenessResponseBuilder setAdditionalImages(List<byte[]> list);

    public final native VidaLivenessResponseBuilder setErrorDetails(String str);

    public final native VidaLivenessResponseBuilder setFailedAttempts(List<VidaFailedAttempt> list);

    public final native VidaLivenessResponseBuilder setImageBytes(byte[] bArr);

    public final native VidaLivenessResponseBuilder setLivenessScore(double d);

    public final native VidaLivenessResponseBuilder setManipulationScore(double d);

    public final native VidaLivenessResponseBuilder setSessionId(String str);

    public final native VidaLivenessResponseBuilder setTransactionId(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = VidaLivenessResponseBuilder.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - View.resolveSize(0, 0)), 1559 - (ViewConfiguration.getTapTimeout() >> 16), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -2027143936, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -2027143936};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - Color.argb(0, 0, 0, 0)), 3111 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 518, 76 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Integer.TYPE});
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
                int i6 = ~iMyTid;
                int i7 = i3 + ((((~(i6 | 261126385)) | ((~((-261126386) | iMyTid)) | (~((-1443905074) | i6)))) * 959) - 1361167534) + (((~(iMyTid | 261126385)) | (~((-261126386) | i6)) | (~((-1443905074) | iMyTid))) * 959);
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i13 = ~iMaxMemory;
                int i14 = i10 + (-1204598886) + ((~((-941743678) | i13)) * 979) + ((iMaxMemory | 763287781) * (-979)) + (((~(iMaxMemory | (-941743678))) | (~(i13 | 763287781))) * 979);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaLivenessResponseBuilder.class, new Object[0]);
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
                int i18 = ((((i17 * i17) - (~(-(1281456454 * i17)))) - 1) - (~(-(i17 * (-712873490))))) - 1;
                int i19 = ((i18 | 133648548) << 1) - (133648548 ^ i18);
                int i20 = ((i19 >> 27) - 63) / 32;
                int i21 = ((i20 | 1) << 1) - (i20 ^ 1);
                int i22 = ((i19 | i21) << 1) - (i21 ^ i19);
                int i23 = i19 >> 16;
                int i24 = ((i23 ^ (-131071)) + ((i23 & (-131071)) << 1)) / 65536;
                int i25 = -(i22 ^ ((i24 ^ 1) + ((i24 & 1) << 1)));
                int i26 = ((i25 | 5) << 1) - (i25 ^ 5);
                int i27 = i26 >> 21;
                int i28 = (((i27 | (-4095)) << 1) - (i27 ^ (-4095))) / 2048;
                int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                Loader.l((1544112270 / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i26) * 2)) + 1503741506);
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
