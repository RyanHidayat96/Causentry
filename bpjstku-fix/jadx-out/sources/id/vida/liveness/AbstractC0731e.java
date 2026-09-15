package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
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
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0731e implements InterfaceC0776y0, SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1121a;
    public long b;
    public HandlerThread c;
    protected Map<String, Float> sensorData;
    protected SensorManager sensorManager;

    private static native Object[] $liveness$Bfaa32232();

    private static native void $liveness$Efaa32232(Object obj, Object obj2);

    public AbstractC0731e() {
        $liveness$Efaa32232(this, $liveness$Bfaa32232());
    }

    @Override // id.vida.liveness.InterfaceC0776y0
    public native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public native Map<String, String> endCollection();

    public abstract int getSensorType();

    @Override // android.hardware.SensorEventListener
    public native void onAccuracyChanged(Sensor sensor, int i);

    @Override // android.hardware.SensorEventListener
    public native void onSensorChanged(SensorEvent sensorEvent);

    public abstract void updateSensorData(SensorEvent sensorEvent);

    static {
        Object[] objArr;
        ClassLoader classLoader = AbstractC0731e.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3414), 1559 - ExpandableListView.getPackedPositionType(0L), 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -136937023, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -136937023};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Color.red(0) + 3111, TextUtils.indexOf("", "") + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16777216), 518 - Color.blue(0), 76 - (Process.myTid() >> 22)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyUid = Process.myUid();
                int i6 = i3 + 1279747562 + (((~((~iMyUid) | (-84676749))) | (~(1570764287 | iMyUid))) * (-302)) + ((~((-84676749) | iMyUid)) * (-604)) + (((~(iMyUid | 1486087539)) | 1351820368) * 302);
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
                int[] iArr = {i10};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i12 = ~iMaxMemory;
                int i13 = i9 + (-54186754) + ((iMaxMemory | 268632584) * 988) + ((140248084 | (~(916707979 | i12))) * (-1976)) + (((~(iMaxMemory | (-788323480))) | 268632584 | (~(788323479 | i12))) * 988);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0731e.class, new Object[0]);
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
                int i18 = -(539592313 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * 501774049);
                int i21 = (((i19 | i20) << 1) - (i20 ^ i19)) - 835993367;
                int i22 = ((i21 >> 15) - 262143) / 131072;
                int i23 = (i21 - (~((i22 ^ 1) + ((i22 & 1) << 1)))) - 1;
                int i24 = i21 >> 22;
                int i25 = (((i24 | (-2047)) << 1) - (i24 ^ (-2047))) / 1024;
                int i26 = -(i23 ^ ((i25 ^ 1) + ((i25 & 1) << 1)));
                int i27 = (i26 ^ 7) + ((i26 & 7) << 1);
                Loader.l(((-2118963252) / (((-((((i27 >> 23) - 1023) / 512) + 2)) & i27) * 2)) - 1096279039);
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
