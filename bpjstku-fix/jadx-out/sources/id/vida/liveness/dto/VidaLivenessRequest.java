package id.vida.liveness.dto;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import id.vida.liveness.listeners.DTOValidationResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public final class VidaLivenessRequest implements DTOValidationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1115a;

    @SerializedName(DynamicLink.Builder.KEY_API_KEY)
    private String b;

    @SerializedName("licenseKey")
    private String c;

    @SerializedName("kycEventId")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("partnerTransactionID")
    private String f1116e;

    @SerializedName("userInfo")
    private String f;

    private static native Object[] $liveness$B70a3b2f9();

    private static native void $liveness$E70a3b2f9(Object obj, Object obj2);

    public VidaLivenessRequest() {
        $liveness$E70a3b2f9(this, $liveness$B70a3b2f9());
    }

    public final native String getApiKey();

    @Override // id.vida.liveness.listeners.DTOValidationResult
    public final native String getErrorMessage();

    public final native String getKycEventId();

    public final native String getLicenseKey();

    public final native String getPartnerTransactionID();

    public final native String getUserInfo();

    @Override // id.vida.liveness.listeners.DTOValidationResult
    public final native boolean isValid();

    public final native void setApiKey(String str);

    public final native void setKycEventId(String str);

    public final native void setLicenseKey(String str);

    public final native void setPartnerTransactionID(String str);

    public final native void setUserInfo(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = VidaLivenessRequest.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3462 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1559, 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 363405574, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 363405574};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask())), 3111 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 519 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 76), Integer.TYPE});
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
                int iNextInt = new Random().nextInt(381507045);
                int i6 = ~iNextInt;
                int i7 = (~((-611558204) | i6)) | 2163491;
                int i8 = ~(iNextInt | 1702867967);
                int i9 = i3 + (-1503863356) + ((i7 | i8) * (-502)) + ((i8 | (~(i6 | (-609394713)))) * TypedValues.PositionType.TYPE_DRAWPATH);
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
                int[] iArr2 = {i13};
                int[] iArr3 = {i14};
                int iNextInt2 = new Random().nextInt();
                int i15 = ~iNextInt2;
                int i16 = (-397558990) + (((~((-675351441) | i15)) | (~(759638930 | iNextInt2))) * 520);
                int i17 = ~((-759638931) | i15);
                int i18 = ~(iNextInt2 | 945392528);
                int i19 = i12 + i16 + ((i17 | i18) * (-1040)) + ((i18 | (~(i15 | (-945392529))) | 84287490) * 520);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
                objArr = new Object[]{new int[1], iArr3, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaLivenessRequest.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i22 = ((int[]) objArr[0])[0];
                int i23 = ((i22 * i22) - (~(-(1131721782 * i22)))) - 1;
                int i24 = -(i22 * (-452356716));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                int i26 = (i25 & (-167299879)) + ((-167299879) | i25);
                int i27 = ((i26 >> 20) - 8191) / 4096;
                int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                int i29 = ((i26 | i28) << 1) - (i28 ^ i26);
                int i30 = i26 >> 28;
                int i31 = (((i30 | (-31)) << 1) - (i30 ^ (-31))) / 16;
                int i32 = (-(i29 ^ ((i31 ^ 1) + ((i31 & 1) << 1)))) + 4;
                int i33 = ((i32 >> 27) - 63) / 32;
                Loader.l((1163875352 / ((i32 & (-(((i33 ^ 1) + ((i33 & 1) << 1)) + 1))) * 2)) + 1400168958);
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
