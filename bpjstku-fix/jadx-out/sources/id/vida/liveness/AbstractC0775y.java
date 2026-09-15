package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import defpackage.initSession;
import id.vida.liveness.dto.ErrorDTO;
import id.vida.liveness.dto.RestResponseDTO;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import liveness.Loader;
import org.json.JSONObject;

/* JADX INFO: renamed from: id.vida.liveness.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0775y {
    protected Context mContext;
    protected final ThreadFactory responseThreadFactory;

    private static native Object[] $liveness$B440335b2(Context context);

    private static native void $liveness$E440335b2(Object obj, Object obj2);

    public AbstractC0775y(Context context) {
        $liveness$E440335b2(this, $liveness$B440335b2(context));
    }

    public static native String getCompleteUrl(String str);

    public native void addRequestToQueue(JsonObjectRequest jsonObjectRequest) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException;

    public native void addRequestToQueue(StringRequest stringRequest) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, KeyManagementException;

    public native ErrorDTO fetchErrorCodeFromVolleyError(VolleyError volleyError);

    public native RestResponseDTO getCompleteServerErrorJSONObject(VolleyError volleyError);

    public native JSONObject getDencryptedJsonObject(String str, String str2) throws VIDAException;

    public native JSONObject getEncryptedJsonObject(JSONObject jSONObject, String str) throws VIDAException;

    static {
        Object[] objArr;
        ClassLoader classLoader = AbstractC0775y.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.getDefaultSize(0, 0) + 3414), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1558, 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1433471255, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1433471255};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041), 3112 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0', 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 518 - View.MeasureSpec.getMode(0), 76 - ((Process.getThreadPriority(0) + 20) >> 6)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = i3 + 636664570 + (((~(1543484922 | startUptimeMillis)) | 161546536) * (-756)) + (((~startUptimeMillis) | 1543484922) * 756);
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i12 = ~iUptimeMillis;
                int i13 = (~((-927700047) | i12)) | 285905930 | (~(777331412 | i12));
                int i14 = i9 + 228212302 + (((~(iUptimeMillis | (-135537297))) | i13) * 590) + (i13 * (-1180)) + (((~((-777331413) | i12)) | (~(i12 | 927700046))) * 590);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0775y.class, new Object[0]);
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
                int i19 = -(916109039 * i17);
                int i20 = (i18 & i19) + (i18 | i19);
                int i21 = -(i17 * (-958730567));
                int i22 = ((i20 ^ i21) + ((i21 & i20) << 1)) - 1179615344;
                int i23 = ((i22 >> 21) - 4095) / 2048;
                int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                int i25 = (i22 ^ i24) + ((i24 & i22) << 1);
                int i26 = i22 >> 15;
                int i27 = (((i26 | (-262143)) << 1) - (i26 ^ (-262143))) / 131072;
                int i28 = (-(i25 ^ (((i27 | 1) << 1) - (i27 ^ 1)))) + 5;
                int i29 = i28 >> 15;
                int i30 = ((i29 ^ (-262143)) + (((-262143) & i29) << 1)) / 131072;
                int i31 = (i30 ^ 1) + ((i30 & 1) << 1);
                Loader.l((1707582440 / ((i28 & (-(((i31 | 1) << 1) - (i31 ^ 1)))) * 2)) + 151713280);
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
