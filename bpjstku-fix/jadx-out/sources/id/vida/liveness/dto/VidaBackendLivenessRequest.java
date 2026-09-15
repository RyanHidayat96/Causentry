package id.vida.liveness.dto;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
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
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class VidaBackendLivenessRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("livenessImage")
    private String f1111a;

    @SerializedName("composite")
    private boolean b;

    @SerializedName("transactionId")
    private String c;

    @SerializedName("partnerTrxId")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("kycId")
    private String f1112e;

    @SerializedName("deviceId")
    private String f;

    @SerializedName("isActiveLiveness")
    private boolean g;

    @SerializedName("inputs")
    private ActiveImageDetails[] h;

    @SerializedName("clientSignals")
    private Map<String, String> i;

    @SerializedName("version")
    private String j;

    public final native boolean getComposite();

    public final native String getDeviceId();

    public final native ActiveImageDetails[] getInputs();

    public final native String getKycId();

    public final native String getLivenessImage();

    public final native String getPartnerTrxId();

    public final native String getTransactionId();

    public final native String getVersion();

    public final native boolean isActiveLiveness();

    public final native void setActiveLiveness(boolean z);

    public final native void setClientSignals(Map<String, String> map);

    public final native void setComposite(boolean z);

    public final native void setDeviceId(String str);

    public final native void setInputs(ActiveImageDetails[] activeImageDetailsArr);

    public final native void setKycId(String str);

    public final native void setLivenessImage(String str);

    public final native void setPartnerTrxId(String str);

    public final native void setTransactionId(String str);

    public final native void setVersion(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = VidaBackendLivenessRequest.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1559, 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2005851541, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2005851541};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.getDefaultSize(0, 0)), TextUtils.indexOf("", "") + 3111, ((byte) KeyEvent.getModifierMetaStateMask()) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0), 518 - TextUtils.getOffsetBefore("", 0), 76 - KeyEvent.getDeadChar(0, 0)), Integer.TYPE});
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
                int i6 = i3 + 1723541638 + (((~((~startElapsedRealtime) | 742032702)) | (-1031714303)) * 529) + (((~(startElapsedRealtime | 742032702)) | (-962998757)) * 529);
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i12 = (-1105839102) + (((~((-564556165) | iMaxMemory)) | 27410820 | (~((-1140475295) | iMaxMemory))) * (-880));
                int i13 = (~((-564556165) | (~iMaxMemory))) | 1140475294;
                int i14 = ~(iMaxMemory | 564556164);
                int i15 = i9 + i12 + ((i13 | i14) * (-880)) + (i14 * 880);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaBackendLivenessRequest.class, new Object[0]);
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
                int i20 = -(452750076 * i18);
                int i21 = (((i19 & i20) + (i19 | i20)) - (~(-(i18 * (-1909626226))))) - 1;
                int i22 = (i21 & (-1827357799)) + ((-1827357799) | i21);
                int i23 = ((i22 >> 29) - 15) / 8;
                int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                int i25 = (i22 & i24) + (i24 | i22);
                int i26 = i22 >> 21;
                int i27 = ((i26 & (-4095)) + (i26 | (-4095))) / 2048;
                int i28 = (-(i25 ^ ((i27 ^ 1) + ((i27 & 1) << 1)))) + 4;
                int i29 = i28 >> 17;
                int i30 = ((((i29 | (-65535)) << 1) - (i29 ^ (-65535))) / 32768) + 1;
                Loader.l((1313629088 / ((i28 & (-((i30 ^ 1) + ((i30 & 1) << 1)))) * 2)) + 857953882);
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
