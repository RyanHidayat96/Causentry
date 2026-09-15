package id.vida.liveness;

import android.content.Context;
import android.hardware.SensorEvent;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
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

/* JADX INFO: loaded from: classes7.dex */
public final class E0 extends AbstractC0731e {
    public h1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1 f1020e;
    public h1 f;

    private static native Object[] $liveness$B1f8d44a2();

    private static native void $liveness$E1f8d44a2(Object obj, Object obj2);

    public E0() {
        $liveness$E1f8d44a2(this, $liveness$B1f8d44a2());
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
        ClassLoader classLoader = E0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 3414), 1560 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1428870635, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1428870635};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 43042), TextUtils.lastIndexOf("", '0', 0) + 3112, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0), View.resolveSizeAndState(0, 0, 0) + 518, 77 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Integer.TYPE});
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
                int i6 = i3 + (-2090427277) + (((~((~iNextInt) | (-1050274450))) | 654757009) * (-235)) + (((~((-1050274450) | iNextInt)) | 654757009) * (-470)) + (((~(iNextInt | (-412688897))) | 17171456) * 235);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
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
                int i9 = ((int[]) objArr4[0])[0];
                int i10 = ((int[]) objArr4[2])[0];
                int i11 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int i12 = ~((int) Runtime.getRuntime().freeMemory());
                int i13 = i9 + (-1985336254) + (((~(i12 | 1049431755)) | (-1067429600)) * (-160)) + (((~(i12 | (-655599704))) | 1049431755) * 160);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(E0.class, new Object[0]);
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
                int i17 = ((i16 * i16) - (~(-(1456940891 * i16)))) - 1;
                int i18 = -(i16 * (-14447985));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                int i20 = (i19 & 1462459001) + (1462459001 | i19);
                int i21 = i20 >> 19;
                int i22 = ((((i21 | (-16383)) << 1) - (i21 ^ (-16383))) / 8192) + 1;
                int i23 = (i20 & i22) + (i22 | i20);
                int i24 = i20 >> 23;
                int i25 = (((i24 | (-1023)) << 1) - (i24 ^ (-1023))) / 512;
                int i26 = (-(i23 ^ (((i25 | 1) << 1) - (i25 ^ 1)))) + 1;
                int i27 = i26 >> 27;
                int i28 = ((i27 ^ (-63)) + ((i27 & (-63)) << 1)) / 32;
                Loader.l((667880960 / ((i26 & (-((((i28 | 1) << 1) - (i28 ^ 1)) + 1))) * 4)) + 853636910);
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
