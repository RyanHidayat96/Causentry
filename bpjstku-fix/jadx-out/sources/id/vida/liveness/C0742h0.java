package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0742h0 implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1129a;

    private static native Object[] $liveness$B5b46e25f();

    private static native void $liveness$E5b46e25f(Object obj, Object obj2);

    public C0742h0() {
        $liveness$E5b46e25f(this, $liveness$B5b46e25f());
    }

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0742h0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - View.resolveSizeAndState(0, 0, 0)), 1559 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -438264256, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -438264256};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43042), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3111, TextUtils.indexOf("", "", 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), TextUtils.getOffsetAfter("", 0) + 518, 76 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Integer.TYPE});
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
                int i6 = ~(158519230 | startUptimeMillis);
                int i7 = i3 + (-410318598) + ((1410146368 | i6) * (-814)) + ((i6 | (~((-1546512229) | (~startUptimeMillis))) | 22153370) * 407) + (((~(startUptimeMillis | 1546512228)) | 22153370 | (~((-158519231) | startUptimeMillis))) * 407);
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
                int iNextInt = new Random().nextInt(2004161087);
                int i13 = i10 + 2040836662 + (((~(1279613850 | iNextInt)) | 286916608) * (-140)) + ((~(1566530458 | iNextInt)) * 70) + (((~(iNextInt | 425417608)) | 1428029458) * 70);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0742h0.class, new Object[0]);
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
                int i18 = -(699543626 * i16);
                int i19 = ((((i17 | i18) << 1) - (i17 ^ i18)) - (~(-(i16 * (-1256767606))))) - (-519070179);
                int i20 = (((i19 >> 29) - 15) / 8) + 1;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = i19 >> 17;
                int i23 = ((i22 ^ (-65535)) + ((i22 & (-65535)) << 1)) / 32768;
                int i24 = -(((i23 & 1) + (i23 | 1)) ^ i21);
                int i25 = (i24 & 4) + (i24 | 4);
                int i26 = i25 >> 21;
                int i27 = ((i26 ^ (-4095)) + ((i26 & (-4095)) << 1)) / 2048;
                Loader.l(((-1361829912) / (((-((((i27 | 1) << 1) - (i27 ^ 1)) + 1)) & i25) * 2)) - 968434374);
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
