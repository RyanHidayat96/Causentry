package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.ValidateResponseDTO;
import id.vida.liveness.listeners.ServiceResponseListener;
import id.vida.liveness.listeners.TokenListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 implements ServiceResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1151a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TokenListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f1152e;

    private static native Object[] $liveness$B0161e945(p1 p1Var, String str, String str2, String str3, TokenListener tokenListener);

    private static native void $liveness$E0161e945(Object obj, Object obj2);

    public o1(p1 p1Var, String str, String str2, String str3, TokenListener tokenListener) {
        this.f1152e = p1Var;
        this.f1151a = str;
        this.b = str2;
        this.c = str3;
        this.d = tokenListener;
        $liveness$E0161e945(this, $liveness$B0161e945(p1Var, str, str2, str3, tokenListener));
    }

    @Override // id.vida.liveness.listeners.ServiceResponseListener
    public final native void onError(int i, String str);

    @Override // id.vida.liveness.listeners.ServiceResponseListener
    public final native Boolean onResponse(ValidateResponseDTO validateResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = o1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 3414), 1559 - ((Process.getThreadPriority(0) + 20) >> 6), 24 - ((Process.getThreadPriority(0) + 20) >> 6), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1104397734, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1104397734};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43042), MotionEvent.axisFromString("") + 3112, 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 517 - TextUtils.indexOf((CharSequence) "", '0'), 76 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = i3 + (-1791169706) + (((~(i6 | 1544494826)) | (-160536633)) * (-465)) + ((1544494826 | (~((-160536633) | i6))) * 930) + ((i6 | (-26247185)) * 465);
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
                int i13 = ~((int) SystemClock.uptimeMillis());
                int i14 = i10 + 1718270419 + (((~((-885343211) | i13)) | (-819688249)) * (-983)) + (((~(i13 | (-819688249))) | 1716240) * 983);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(o1.class, new Object[0]);
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
                int i19 = -(435090993 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * 1531054531);
                int i22 = (((i20 | i21) << 1) - (i21 ^ i20)) - 2133196764;
                int i23 = i22 >> 21;
                int i24 = ((i23 & (-4095)) + (i23 | (-4095))) / 2048;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
                int i27 = i22 >> 28;
                int i28 = -(i26 ^ ((((i27 ^ (-31)) + ((i27 & (-31)) << 1)) / 16) + 1));
                int i29 = (i28 ^ 5) + ((i28 & 5) << 1);
                int i30 = i29 >> 24;
                Loader.l(((-1701150630) / (((-(((((i30 | (-511)) << 1) - (i30 ^ (-511))) / 256) + 2)) & i29) * 2)) - 1493058749);
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
