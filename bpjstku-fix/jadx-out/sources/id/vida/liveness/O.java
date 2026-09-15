package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1044a;
    public KeyStore b;

    private static native Object[] $liveness$B41b35a88(Context context);

    private static native void $liveness$E41b35a88(Object obj, Object obj2);

    public O(Context context) {
        $liveness$E41b35a88(this, $liveness$B41b35a88(context));
    }

    public static native String getDeviceIdKey();

    public final native void a();

    public final native synchronized String decryptString(byte[] bArr);

    public final native synchronized byte[] encryptString(byte[] bArr);

    static {
        Object[] objArr;
        ClassLoader classLoader = O.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3415), Gravity.getAbsoluteGravity(0, 0) + 1559, ImageFormat.getBitsPerPixel(0) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1229539106, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1229539106};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.getDefaultSize(0, 0) + 3111, 22 - Color.green(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0), Color.alpha(0) + 518, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 75), Integer.TYPE});
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
                int i7 = i3 + (((~((-228816315) | iMyTid)) | (~((-1476215145) | i6)) | (~(i6 | 228816314))) * 959) + 1317905929 + (((~(iMyTid | 228816314)) | (~(i6 | (-228816315))) | (~((-1476215145) | iMyTid))) * 959);
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i13 = i10 + (((~(iUptimeMillis | 176876009)) | 1528155449) * 56) + 896841314 + (((~((~iUptimeMillis) | 1528155449)) | 176876009) * 56);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(O.class, new Object[0]);
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
                int i18 = -(1911535639 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * (-1731256119));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = (i21 & 151957760) + (151957760 | i21);
                int i23 = i22 >> 29;
                int i24 = (((i23 | (-15)) << 1) - (i23 ^ (-15))) / 8;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
                int i27 = i22 >> 27;
                int i28 = (((i27 | (-63)) << 1) - (i27 ^ (-63))) / 32;
                int i29 = -(((i28 ^ 1) + ((i28 & 1) << 1)) ^ i26);
                int i30 = ((i29 | 4) << 1) - (i29 ^ 4);
                int i31 = i30 >> 26;
                int i32 = (((i31 | ComposerKt.defaultsKey) << 1) - (i31 ^ ComposerKt.defaultsKey)) / 64;
                int i33 = (i32 & 1) + (i32 | 1);
                Loader.l(((-1374708072) / (((-((i33 & 1) + (i33 | 1))) & i30) * 2)) - 1887041524);
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
