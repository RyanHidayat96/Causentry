package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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

/* JADX INFO: renamed from: id.vida.liveness.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0773x extends AbstractC0731e {
    public h1 d;

    private static native Object[] $liveness$Bfbaee0c5();

    private static native void $liveness$Efbaee0c5(Object obj, Object obj2);

    public C0773x() {
        $liveness$Efbaee0c5(this, $liveness$Bfbaee0c5());
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
        ClassLoader classLoader = C0773x.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 3414), 1559 - (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - Color.green(0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1906771713, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1906771713};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask())), 3111 - TextUtils.indexOf("", ""), Color.red(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 518 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyPid = Process.myPid();
                int i6 = i3 + 145605230 + (((~((-2163492) | iMyPid)) | (~(1702867967 | iMyPid))) * 69) + (((~(iMyPid | 1081676579)) | (~((-623354880) | iMyPid)) | 621191388) * (-69)) + 1471959040;
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
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i12 = ~elapsedCpuTime;
                int i13 = (~((-1051168424) | i12)) | 403080836;
                int i14 = ~(elapsedCpuTime | (-5775449));
                int i15 = i9 + 1515931566 + ((i13 | i14) * (-713)) + (i14 * 1426) + ((~((-653863036) | i12)) * 713);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0773x.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i18 = ((int[]) objArr[0])[0];
                int i19 = i18 * i18;
                int i20 = -(263098223 * i18);
                int i21 = (i19 & i20) + (i19 | i20);
                int i22 = -(i18 * (-532396789));
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = ((i23 | (-1933536631)) << 1) - ((-1933536631) ^ i23);
                int i25 = i24 >> 17;
                int i26 = ((i25 ^ (-65535)) + ((i25 & (-65535)) << 1)) / 32768;
                int i27 = (i26 & 1) + (i26 | 1);
                int i28 = (i24 & i27) + (i27 | i24);
                int i29 = ((i24 >> 23) - 1023) / 512;
                int i30 = -(i28 ^ (((i29 | 1) << 1) - (i29 ^ 1)));
                int i31 = ((i30 | 2) << 1) - (i30 ^ 2);
                int i32 = i31 >> 22;
                int i33 = (((i32 | (-2047)) << 1) - (i32 ^ (-2047))) / 1024;
                int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
                Loader.l((605636448 / (((-((i34 & 1) + (i34 | 1))) & i31) * 2)) + 1817306648);
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
