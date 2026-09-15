package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0758p0 extends AbstractC0731e {
    public h1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1 f1154e;
    public h1 f;

    private static native Object[] $liveness$B68eda757();

    private static native void $liveness$E68eda757(Object obj, Object obj2);

    public C0758p0() {
        $liveness$E68eda757(this, $liveness$B68eda757());
    }

    @Override // id.vida.liveness.AbstractC0731e, id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.AbstractC0731e
    public final native int getSensorType();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    @Override // id.vida.liveness.AbstractC0731e
    public final native void updateSensorData(SensorEvent sensorEvent);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0758p0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Color.blue(0)), 1559 - (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1506984146, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1506984146};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042), 3111 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 518, 76 - ((Process.getThreadPriority(0) + 20) >> 6)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt();
                int i6 = ~iNextInt;
                int i7 = i3 + (-1272411950) + (((~((-1174704998) | i6)) | 100926245) * 168) + ((~((-100926246) | iNextInt)) * 168) + (((~(iNextInt | (-1073778753))) | (~(i6 | (-530326462))) | 429400216) * 168);
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
                int i13 = ~Process.myUid();
                int i14 = i10 + 865245062 + (((-33567965) | i13) * 494) + (((~(i13 | 1644053027)) | (-1650210525)) * 494);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0758p0.class, new Object[0]);
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
                int i18 = ((((i17 * i17) - (~(-(1613230187 * i17)))) - 1) - (~(-(i17 * 1421585913)))) - 1;
                int i19 = (i18 & (-1177164348)) + ((-1177164348) | i18);
                int i20 = i19 >> 23;
                int i21 = ((i20 & (-1023)) + (i20 | (-1023))) / 512;
                int i22 = (i19 - (~(((i21 | 1) << 1) - (i21 ^ 1)))) - 1;
                int i23 = i19 >> 28;
                int i24 = ((i23 & (-31)) + (i23 | (-31))) / 16;
                int i25 = -(i22 ^ (((i24 | 1) << 1) - (i24 ^ 1)));
                int i26 = (i25 & 4) + (i25 | 4);
                int i27 = i26 >> 28;
                int i28 = ((i27 & (-31)) + (i27 | (-31))) / 16;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l((1338282088 / (((-((i29 ^ 1) + ((i29 & 1) << 1))) & i26) * 2)) + 1697781946);
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
