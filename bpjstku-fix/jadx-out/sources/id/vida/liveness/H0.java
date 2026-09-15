package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class H0 {
    public static H0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f1032a;
    public final Context b;

    private static native Object[] $liveness$B6cf20beb(Context context);

    private static native void $liveness$E6cf20beb(Object obj, Object obj2);

    public H0(Context context) {
        $liveness$E6cf20beb(this, $liveness$B6cf20beb(context));
    }

    public static native H0 getInstance(Context context);

    public final native String DecryptResponse(byte[] bArr, String str);

    public final native byte[] EncryptPayload(String str, String str2) throws VIDAException;

    public final native String generateHMAC(String str, EnumC0725c enumC0725c) throws VIDAException;

    public final native String getUniqueId();

    static {
        Object[] objArr;
        ClassLoader classLoader = H0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-16773802) - Color.rgb(0, 0, 0)), TextUtils.getTrimmedLength("") + 1559, 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1915378179, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1915378179};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042), KeyEvent.getDeadChar(0, 0) + 3111, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.argb(0, 0, 0, 0), 518 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 77), Integer.TYPE});
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = i3 + 563330354 + (((-358498329) | iUptimeMillis) * 376) + (((~((~iUptimeMillis) | 745634709)) | (-1031764894)) * (-376)) + (((~(iUptimeMillis | (-745634710))) | 959396749) * 376);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
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
                int i9 = ((int[]) objArr4[0])[0];
                int i10 = ((int[]) objArr4[2])[0];
                int i11 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i10};
                int iNextInt = new Random().nextInt(677527059);
                int i12 = i9 + ((((-1680631934) + (((-134299722) | (~iNextInt)) * (-490))) + (((~(iNextInt | (-1570337498))) | 1436037776) * 490)) - 1575531940);
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(H0.class, new Object[0]);
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
                int i17 = -(623568131 * i15);
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                int i19 = -(i15 * (-1856158097));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = ((i20 | 304078769) << 1) - (304078769 ^ i20);
                int i22 = i21 >> 18;
                int i23 = ((i22 & (-32767)) + (i22 | (-32767))) / 16384;
                int i24 = (i23 ^ 1) + ((i23 & 1) << 1);
                int i25 = (i21 & i24) + (i24 | i21);
                int i26 = i21 >> 20;
                int i27 = ((i26 ^ (-8191)) + ((i26 & (-8191)) << 1)) / 4096;
                int i28 = -((((i27 | 1) << 1) - (i27 ^ 1)) ^ i25);
                int i29 = (i28 & 5) + (i28 | 5);
                int i30 = i29 >> 20;
                int i31 = ((i30 ^ (-8191)) + ((i30 & (-8191)) << 1)) / 4096;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                Loader.l(((-1692603230) / (((-((i32 ^ 1) + ((i32 & 1) << 1))) & i29) * 2)) - 1546993898);
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
