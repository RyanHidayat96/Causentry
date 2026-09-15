package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.crypto.spec.SecretKeySpec;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0728d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1088a;
    public final String genericKeyString;
    public final String signingKeyString;

    private static native Object[] $liveness$B42db481d(Context context);

    private static native void $liveness$E42db481d(Object obj, Object obj2);

    public C0728d(Context context) {
        $liveness$E42db481d(this, $liveness$B42db481d(context));
    }

    public final native String AESDecryptSyncWithSessionKey(byte[] bArr, String str) throws VIDAException;

    public final native byte[] AESEncryptWithSessionKey(String str, String str2) throws VIDAException;

    public final native String a(EnumC0725c enumC0725c);

    public final native String a(byte[] bArr, SecretKeySpec secretKeySpec);

    public final native byte[] a(String str, SecretKeySpec secretKeySpec);

    public final native String generateHashWithHmac256(String str, EnumC0725c enumC0725c) throws VIDAException;

    static {
        Object[] objArr;
        ClassLoader classLoader = C0728d.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1559 - TextUtils.getOffsetAfter("", 0), Color.green(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -2109303052, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -2109303052};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 43042), 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 566 - AndroidCharacter.getMirror('0'), 76 - TextUtils.getOffsetAfter("", 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i5};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = 1772658562 + (((~(1021677417 | iFreeMemory)) | 683354041) * 672);
                int i7 = ~iFreeMemory;
                int i8 = i3 + i6 + (((~(iFreeMemory | 683354041)) | (~((-1021677418) | i7))) * (-672)) + (((~((-683354042) | i7)) | 1712272) * 672);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
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
                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                int i14 = i11 + ((((~((-293474803) | iFreeMemory2)) | 22810818) * (-283)) - 429441640) + ((~(iFreeMemory2 | (-270663985))) * 283);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0728d.class, new Object[0]);
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
                int i19 = -(201829446 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * 607175846);
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = ((i22 | (-2042374556)) << 1) - ((-2042374556) ^ i22);
                int i24 = i23 >> 24;
                int i25 = (((i24 | (-511)) << 1) - (i24 ^ (-511))) / 256;
                int i26 = (i23 - (~((i25 ^ 1) + ((i25 & 1) << 1)))) - 1;
                int i27 = ((i23 >> 20) - 8191) / 4096;
                int i28 = -(i26 ^ ((i27 ^ 1) + ((i27 & 1) << 1)));
                int i29 = (i28 ^ 3) + ((i28 & 3) << 1);
                int i30 = i29 >> 27;
                int i31 = ((i30 & (-63)) + (i30 | (-63))) / 32;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                Loader.l((943261290 / (((-(((i32 | 1) << 1) - (i32 ^ 1))) & i29) * 2)) + 143836680);
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
