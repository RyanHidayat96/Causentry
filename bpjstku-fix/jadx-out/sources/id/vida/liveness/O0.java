package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.view.OnBackPressedCallback;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public final class O0 extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R0 f1045a;

    private static native Object[] $liveness$B3e83cd9e(R0 r0);

    private static native void $liveness$E3e83cd9e(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public O0(R0 r0) {
        this.f1045a = r0;
        Object[] objArr$liveness$B3e83cd9e = $liveness$B3e83cd9e(r0);
        super(((Value) objArr$liveness$B3e83cd9e[1]).i);
        $liveness$E3e83cd9e(this, objArr$liveness$B3e83cd9e);
    }

    @Override // androidx.view.OnBackPressedCallback
    public final native void handleOnBackPressed();

    static {
        Object[] objArr;
        ClassLoader classLoader = O0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1559 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.red(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -315164718, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -315164718};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - KeyEvent.normalizeMetaState(0)), 3111 - KeyEvent.keyCodeFromString(""), 22 - (KeyEvent.getMaxKeyCode() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 517 - ImageFormat.getBitsPerPixel(0), 76 - TextUtils.indexOf("", "")), Integer.TYPE});
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
                int i7 = i3 + (-215236775) + (((~(iMaxMemory | 1546113626)) | (~((-158917833) | i6))) * 333) + (((~(iMaxMemory | (-158917833))) | (~(i6 | 1546113626))) * 333);
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
                int i13 = ~(((int) Process.getStartUptimeMillis()) | 714668837);
                int i14 = i10 + (((295649496 | i13) * (-658)) - 319473886) + ((i13 | 285671640) * 658);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(O0.class, new Object[0]);
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
                int i19 = -(507751461 * i17);
                int i20 = (((i18 & i19) + (i18 | i19)) - (~(-(i17 * (-233927285))))) - 1;
                int i21 = (i20 ^ (-1066404288)) + (((-1066404288) & i20) << 1);
                int i22 = ((i21 >> 25) - 255) / 128;
                int i23 = (i21 - (~((i22 & 1) + (i22 | 1)))) - 1;
                int i24 = i21 >> 18;
                int i25 = (((i24 | (-32767)) << 1) - (i24 ^ (-32767))) / 16384;
                int i26 = -(i23 ^ ((i25 & 1) + (i25 | 1)));
                int i27 = (i26 ^ 4) + ((i26 & 4) << 1);
                int i28 = i27 >> 23;
                int i29 = (((i28 | (-1023)) << 1) - (i28 ^ (-1023))) / 512;
                int i30 = (i29 & 1) + (i29 | 1);
                Loader.l(((-1372615648) / (((-(((i30 | 1) << 1) - (i30 ^ 1))) & i27) * 2)) - 1836797942);
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
