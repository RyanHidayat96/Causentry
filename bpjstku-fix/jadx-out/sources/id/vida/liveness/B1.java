package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Random;
import javax.security.cert.CertificateException;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class B1 {
    public static B1 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RequestQueue f1014a;
    public Context b;
    public CertificateException c;

    public static native synchronized B1 getInstance(Context context) throws NoSuchAlgorithmException, IOException, java.security.cert.CertificateException, KeyStoreException, KeyManagementException;

    public final native RequestQueue a(Context context);

    public final native <T> void addToRequestQueue(Request<T> request) throws NoSuchAlgorithmException, IOException, java.security.cert.CertificateException, KeyStoreException, KeyManagementException;

    public final native void cancelAllPendingRequest();

    public final native void clearException();

    public final native Exception getException();

    public final native RequestQueue getRequestQueue() throws NoSuchAlgorithmException, IOException, java.security.cert.CertificateException, KeyManagementException, KeyStoreException;

    public final native void initialization(Context context) throws NoSuchAlgorithmException, IOException, java.security.cert.CertificateException, KeyManagementException, KeyStoreException;

    static {
        Object[] objArr;
        ClassLoader classLoader = B1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (KeyEvent.getMaxKeyCode() >> 16)), View.MeasureSpec.getMode(0) + 1559, 24 - TextUtils.indexOf("", ""), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 778589519, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 778589519};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43042), (ViewConfiguration.getScrollBarSize() >> 8) + 3111, 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 518 - TextUtils.indexOf("", "", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 75), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt();
                int i6 = ~iNextInt;
                int i7 = i3 + ((((~((-1410596867) | i6)) | (~(1560278498 | iNextInt))) * 988) - 2015374210) + (((~(iNextInt | (-1555349827))) | 144752960 | (~(i6 | 1560278498))) * 988);
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
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i13 = ~iElapsedRealtime;
                int i14 = i10 + 1127816950 + (((~((-722720946) | i13)) | (~((-982310514) | iElapsedRealtime))) * 1900) + (((~(iElapsedRealtime | 722720945)) | (~(i13 | 982310513))) * (-950)) + (((~(iElapsedRealtime | 982310513)) | (~(i13 | 722720945))) * 950);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(B1.class, new Object[0]);
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
                int i19 = -(1534139083 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * (-424511147));
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = ((i22 | (-1784856320)) << 1) - ((-1784856320) ^ i22);
                int i24 = i23 >> 19;
                int i25 = (((i24 ^ (-16383)) + ((i24 & (-16383)) << 1)) / 8192) + 1;
                int i26 = (i23 & i25) + (i25 | i23);
                int i27 = i23 >> 16;
                int i28 = (((i27 | (-131071)) << 1) - (i27 ^ (-131071))) / 65536;
                int i29 = -(i26 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
                int i30 = (i29 ^ 6) + ((i29 & 6) << 1);
                int i31 = i30 >> 29;
                int i32 = ((i31 ^ (-15)) + ((i31 & (-15)) << 1)) / 8;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l(((-1796015520) / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 2)) - 294675138);
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
