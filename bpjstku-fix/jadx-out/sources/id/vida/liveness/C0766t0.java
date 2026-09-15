package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0766t0 implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f1173a;

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0766t0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1559 - Gravity.getAbsoluteGravity(0, 0), 24 - View.combineMeasuredStates(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1807990242, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1807990242};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getLongPressTimeout() >> 16) + 3111, 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getThreadPriority(0) + 20) >> 6), 518 - ((Process.getThreadPriority(0) + 20) >> 6), 76 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt(738361744);
                int i6 = ~iNextInt;
                int i7 = i3 + (-1272411950) + (((~((-1061659203) | i6)) | 641794112) * 168) + ((~((-641794113) | iNextInt)) * 168) + (((~(iNextInt | (-419865091))) | (~(i6 | (-643372257))) | 1578144) * 168);
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
                int i13 = ~((int) Runtime.getRuntime().freeMemory());
                int i14 = i10 + (-517231294) + (((~(i13 | 783309856)) | (-1055940387)) * (-160)) + (((~(i13 | (-921721603))) | 783309856) * 160);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0766t0.class, new Object[0]);
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
                int i18 = ((i17 * i17) - (~(-(861789692 * i17)))) - 1;
                int i19 = -(i17 * (-1950443204));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = ((i20 | (-151959792)) << 1) - ((-151959792) ^ i20);
                int i22 = ((i21 >> 15) - 262143) / 131072;
                int i23 = (i21 - (~(((i22 | 1) << 1) - (i22 ^ 1)))) - 1;
                int i24 = i21 >> 26;
                int i25 = -(i23 ^ (((((i24 | ComposerKt.defaultsKey) << 1) - (i24 ^ ComposerKt.defaultsKey)) / 64) + 1));
                int i26 = ((i25 | 5) << 1) - (i25 ^ 5);
                int i27 = ((i26 >> 23) - 1023) / 512;
                int i28 = (i27 & 1) + (i27 | 1);
                Loader.l(((-1769933860) / (((-((i28 ^ 1) + ((i28 & 1) << 1))) & i26) * 2)) - 61157904);
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
