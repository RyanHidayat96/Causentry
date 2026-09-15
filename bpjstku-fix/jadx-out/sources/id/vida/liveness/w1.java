package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class w1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w1 f1192e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0728d f1193a;
    public final C0740g1 b;
    public final I c;
    public final Context d;

    private static native Object[] $liveness$Bbd33e89d(Context context);

    private static native void $liveness$Ebd33e89d(Object obj, Object obj2);

    public w1(Context context) {
        $liveness$Ebd33e89d(this, $liveness$Bbd33e89d(context));
    }

    public static native w1 createInstance(Context context);

    public final native String AESDecrypt(byte[] bArr, String str) throws VIDAException;

    public final native byte[] AESEncrypt(String str, String str2) throws VIDAException;

    public final native String generateHmac(String str, EnumC0725c enumC0725c) throws VIDAException;

    public final native String getDeviceId();

    static {
        Object[] objArr;
        ClassLoader classLoader = w1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 3414), 1559 - TextUtils.getOffsetAfter("", 0), 24 - (ViewConfiguration.getPressedStateDuration() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1052152576, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1052152576};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getEdgeSlop() >> 16)), 3111 - View.resolveSize(0, 0), Color.alpha(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.lastIndexOf("", '0') + 519, 76 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Integer.TYPE});
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
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = ~((-1004629660) | startUptimeMillis);
                int i7 = ~startUptimeMillis;
                int i8 = i3 + 1849109954 + ((i6 | (~(700401799 | i7))) * (-1808)) + (((~((-698435716) | startUptimeMillis)) | (~(i7 | 1006595743))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(startUptimeMillis | (-700401800))) | 306193944 | (~(1004629659 | i7))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
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
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int i14 = ~(((int) Process.getElapsedCpuTime()) | 295829741);
                int i15 = i11 + ((1113372376 | i14) * (-658)) + 1705163058 + ((i14 | 1113372176) * 658);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(w1.class, new Object[0]);
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
                int i20 = -(258686264 * i18);
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                int i22 = -(i18 * 1467866616);
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = (i23 ^ 806406720) + ((806406720 & i23) << 1);
                int i25 = i24 >> 24;
                int i26 = ((i25 ^ (-511)) + ((i25 & (-511)) << 1)) / 256;
                int i27 = ((i26 | 1) << 1) - (i26 ^ 1);
                int i28 = (i24 & i27) + (i27 | i24);
                int i29 = ((i24 >> 22) - 2047) / 1024;
                int i30 = -(i28 ^ (((i29 | 1) << 1) - (i29 ^ 1)));
                int i31 = (i30 & 3) + (i30 | 3);
                int i32 = i31 >> 27;
                int i33 = (((i32 ^ (-63)) + ((i32 & (-63)) << 1)) / 32) + 1;
                Loader.l(((-962021292) / (((-((i33 & 1) + (i33 | 1))) & i31) * 2)) - 1692509446);
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
