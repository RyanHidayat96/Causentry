package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public class VIDAException extends Exception {
    public int mErrorCode;
    public String mErrorMessage;

    private static native Object[] $liveness$B53e79fad(int i, String str);

    private static native void $liveness$E53e79fad(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public VIDAException(int i, String str) {
        Object[] objArr$liveness$B53e79fad = $liveness$B53e79fad(i, str);
        super((String) objArr$liveness$B53e79fad[2]);
        $liveness$E53e79fad(this, objArr$liveness$B53e79fad);
    }

    public VIDAException(Throwable th) {
        super(th);
    }

    public native String getMessage(int i);

    static {
        Object[] objArr;
        ClassLoader classLoader = VIDAException.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.getDefaultSize(0, 0) + 3414), (ViewConfiguration.getTapTimeout() >> 16) + 1559, TextUtils.getOffsetBefore("", 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1754012201, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1754012201};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042), 3111 - Color.red(0), View.MeasureSpec.getMode(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 518, View.MeasureSpec.getSize(0) + 76), Integer.TYPE});
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
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = 1297778242 + (((~(983093939 | i6)) | 721937519) * 672);
                int i8 = ~i6;
                int i9 = i3 + i7 + (((~(i6 | 721937519)) | (~((-983093940) | i8))) * (-672)) + (((~((-721937520) | i8)) | 17245260) * 672);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
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
                int i12 = ((int[]) objArr4[0])[0];
                int i13 = ((int[]) objArr4[2])[0];
                int i14 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i13};
                int iNextInt = new Random().nextInt(2070054742);
                int i15 = ~iNextInt;
                int i16 = (~((-962521221) | i15)) | 287186944 | (~(742510238 | i15));
                int i17 = i12 + (-1632475338) + (((~(iNextInt | (-67175963))) | i16) * 590) + (i16 * (-1180)) + (((~((-742510239) | i15)) | (~(i15 | 962521220))) * 590);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VIDAException.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = i20 * i20;
                int i22 = -(1357442405 * i20);
                int i23 = ((((i21 | i22) << 1) - (i21 ^ i22)) - (~(-(i20 * (-159521525))))) - 1;
                int i24 = ((i23 | (-1618019264)) << 1) - ((-1618019264) ^ i23);
                int i25 = i24 >> 26;
                int i26 = (((i25 & ComposerKt.defaultsKey) + (i25 | ComposerKt.defaultsKey)) / 64) + 1;
                int i27 = -((((i24 | i26) << 1) - (i26 ^ i24)) ^ ((((i24 >> 28) - 31) / 16) + 1));
                int i28 = (i27 & 6) + (i27 | 6);
                int i29 = ((i28 >> 15) - 262143) / 131072;
                int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
                Loader.l((2033059776 / (((-((i30 ^ 1) + ((i30 & 1) << 1))) & i28) * 2)) + 1871527677);
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
