package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class l1 extends AbstractC0731e {
    public h1 d;

    private static native Object[] $liveness$B62285c5c();

    private static native void $liveness$E62285c5c(Object obj, Object obj2);

    public l1() {
        $liveness$E62285c5c(this, $liveness$B62285c5c());
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
        ClassLoader classLoader = l1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 3414), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1558, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 518614455, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 518614455};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 43042), 3110 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.argb(0, 0, 0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 518, ExpandableListView.getPackedPositionChild(0L) + 77), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~(Process.myPid() | 867729282);
                int i7 = i3 + (((38815778 | i6) * (-658)) - 1283863482) + ((i6 | 4194336) * 658);
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
                int i13 = ~new Random().nextInt();
                int i14 = i10 + (-129813442) + (((~((-1458323380) | i13)) | (-246708080)) * (-983)) + (((~(i13 | (-246708080))) | 135282764) * 983);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(l1.class, new Object[0]);
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
                int i19 = -(1832522210 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * 936962200);
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = (i22 ^ 1552851081) + ((1552851081 & i22) << 1);
                int i24 = i23 >> 25;
                int i25 = ((i24 & (-255)) + (i24 | (-255))) / 128;
                int i26 = (i23 - (~((i25 ^ 1) + ((i25 & 1) << 1)))) - 1;
                int i27 = ((i23 >> 16) - 131071) / 65536;
                int i28 = -(i26 ^ ((i27 & 1) + (i27 | 1)));
                int i29 = ((i28 | 5) << 1) - (i28 ^ 5);
                int i30 = i29 >> 19;
                int i31 = ((i30 & (-16383)) + (i30 | (-16383))) / 8192;
                int i32 = (i31 & 1) + (i31 | 1);
                Loader.l((1758407750 / (((-(((i32 | 1) << 1) - (i32 ^ 1))) & i29) * 2)) + 1252795695);
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
