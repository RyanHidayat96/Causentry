package id.vida.liveness;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.VidaLivenessRequest;
import id.vida.liveness.listeners.BackendLivenessListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class q1 {
    public q1(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @JvmStatic
    public final native r1 forExecution(Activity activity, VidaLivenessRequest vidaLivenessRequest, String str, BackendLivenessListener backendLivenessListener);

    @JvmStatic
    public final native r1 forPrefetch(Activity activity, VidaLivenessRequest vidaLivenessRequest);

    @JvmStatic
    public final native r1 prepareForExecution(r1 r1Var, String str, BackendLivenessListener backendLivenessListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = q1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3414), KeyEvent.normalizeMetaState(0) + 1559, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 419883028, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 419883028};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3111 - (ViewConfiguration.getTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777238, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 517 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getTouchSlop() >> 8) + 76), Integer.TYPE});
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
                int i6 = ~iMaxMemory;
                int i7 = i3 + 1308308419 + (((~((-691686358) | i6)) | (~((-1013345102) | iMaxMemory))) * 217) + (((~(iMaxMemory | (-691686358))) | 673336133) * 217) + (((~((-1013345102) | i6)) | 691686357) * 217);
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
                int i13 = ~((int) Process.getStartUptimeMillis());
                int i14 = i10 + 1499702594 + (((-136201299) | i13) * 184) + (((~(i13 | 937507500)) | (-442386139)) * 184);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(q1.class, new Object[0]);
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
                int i19 = -(270007721 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * 1843488403);
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = (i22 & (-1359103100)) + ((-1359103100) | i22);
                int i24 = ((i23 >> 19) - 16383) / 8192;
                int i25 = -(((i23 - (~(((i24 | 1) << 1) - (i24 ^ 1)))) - 1) ^ ((((i23 >> 24) - 511) / 256) + 1));
                int i26 = (i25 ^ 3) + ((i25 & 3) << 1);
                int i27 = i26 >> 21;
                int i28 = ((i27 ^ (-4095)) + ((i27 & (-4095)) << 1)) / 2048;
                int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                Loader.l((1601856810 / (((-((i29 ^ 1) + ((i29 & 1) << 1))) & i26) * 3)) + 1425649237);
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
