package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.KeyEvent;
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
public final class SDKConfigResponseDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("autogenerate_email")
    private String f1101a;

    @SerializedName("extended_error_handling_enabled")
    private String b;

    @SerializedName("kyc_signing_enabled")
    private String c;

    @SerializedName("prod_cert_profile_name")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("composite_liveness_enabled")
    private String f1102e;

    @SerializedName("backend_liveliness_enabled")
    private String f;

    @SerializedName("partner_user_profile_uri")
    private String g;

    @SerializedName("partner_kyc_workflow_name")
    private String h;

    @SerializedName("partner_doc_form_fields")
    private String i;

    @SerializedName("partner_doc_sign_web_hook_url")
    private String j;

    @SerializedName("kyc_signing_template_ids")
    private String k;

    @SerializedName("partner_web_hook_url")
    private String l;

    @SerializedName("prod_ticket_create_enabled")
    private String m;

    @SerializedName("hmac_validation_required")
    private String n;

    @SerializedName("indo_kyc_ext_demog_wf_allowed_fields")
    private String o;

    @SerializedName("partner_user_pdf_data_uri")
    private String p;

    @SerializedName("prod_cert_issued_template_name")
    private String q;

    @SerializedName("kyc_wf_verify")
    private String r;

    @SerializedName("scores_multiplier")
    private String s;

    @SerializedName("validation_flow_v1_enabled")
    private String t;

    @SerializedName("indo_kyc_demog_fr_wf_async_enabled")
    private String u;

    @SerializedName("kyc_wf_record")
    private String v;

    public final native String getBackendLivelinessEnabled();

    public final native String getCompositeLivenessEnabled();

    public final native boolean isBackendLivenessEnabled();

    public final native boolean isCompositeLivenessEnabled();

    public final native void setBackendLivelinessEnabled(String str);

    public final native void setCompositeLivenessEnabled(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = SDKConfigResponseDTO.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 3414), KeyEvent.getDeadChar(0, 0) + 1559, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -116207544, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -116207544};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43090 - AndroidCharacter.getMirror('0')), 3110 - ((byte) KeyEvent.getModifierMetaStateMask()), Color.alpha(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), 519 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 76 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Integer.TYPE});
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
                int i6 = i3 + 503457346 + (((~((-33626153) | (~iMaxMemory))) | (~(1671405306 | iMaxMemory))) * (-272)) + (((~((-597661819) | iMaxMemory)) | 564035666) * (-272)) + (((~(iMaxMemory | 597661818)) | 1107369640) * 272);
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
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i12 = ~iElapsedRealtime;
                int i13 = i9 + 1093267652 + ((iElapsedRealtime | 1012158420) * (-859)) + (((~(iElapsedRealtime | (-675563333))) | (~(1012158420 | i12))) * 859) + (((~((-692873039) | i12)) | 17309706) * 859);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(SDKConfigResponseDTO.class, new Object[0]);
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
                int i18 = -(1431472803 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * 1706471879);
                int i21 = ((i19 & i20) + (i20 | i19)) - (-174946041);
                int i22 = i21 >> 23;
                int i23 = ((i22 & (-1023)) + (i22 | (-1023))) / 512;
                int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                int i25 = (i21 & i24) + (i24 | i21);
                int i26 = i21 >> 24;
                int i27 = ((i26 ^ (-511)) + ((i26 & (-511)) << 1)) / 256;
                int i28 = -(((i27 & 1) + (i27 | 1)) ^ i25);
                int i29 = (i28 ^ 7) + ((i28 & 7) << 1);
                int i30 = i29 >> 18;
                int i31 = ((i30 & (-32767)) + (i30 | (-32767))) / 16384;
                int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                Loader.l(((-2035219886) / (((-(((i32 | 1) << 1) - (i32 ^ 1))) & i29) * 2)) - 1571884261);
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
