package id.vida.liveness.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.AbstractC0734f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public class OverlayView extends AbstractC0734f {
    public final RectF d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1180e;
    public float f;

    private static native Object[] $liveness$B355773b2(Context context, AttributeSet attributeSet, int i);

    private static native Object[] $liveness$B6842f27d(Context context);

    private static native Object[] $liveness$Bbd944797(Context context, AttributeSet attributeSet);

    private static native void $liveness$E355773b2(Object obj, Object obj2);

    private static native void $liveness$E6842f27d(Object obj, Object obj2);

    private static native void $liveness$Ebd944797(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public OverlayView(Context context) {
        Object[] objArr$liveness$B6842f27d = $liveness$B6842f27d(context);
        super((Context) objArr$liveness$B6842f27d[1]);
        $liveness$E6842f27d(this, objArr$liveness$B6842f27d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OverlayView(Context context, AttributeSet attributeSet) {
        Object[] objArr$liveness$Bbd944797 = $liveness$Bbd944797(context, attributeSet);
        super((Context) objArr$liveness$Bbd944797[1], (AttributeSet) objArr$liveness$Bbd944797[2]);
        $liveness$Ebd944797(this, objArr$liveness$Bbd944797);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr$liveness$B355773b2 = $liveness$B355773b2(context, attributeSet, i);
        super((Context) objArr$liveness$B355773b2[1], (AttributeSet) objArr$liveness$B355773b2[2], ((Value) objArr$liveness$B355773b2[3]).i);
        $liveness$E355773b2(this, objArr$liveness$B355773b2);
    }

    @Override // id.vida.liveness.AbstractC0734f
    public native void buildPath(Path path, int i, int i2);

    @Override // id.vida.liveness.AbstractC0734f
    public native Rect getMaskBounds();

    static {
        Object[] objArr;
        ClassLoader classLoader = OverlayView.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3414), 1559 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2037684843, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2037684843};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 43042), 3111 - View.MeasureSpec.makeMeasureSpec(0, 0), 22 - Color.blue(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 519 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 75), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = i3 + ((((-578370750) + (((~((-723201738) | iFreeMemory)) | 704710729) * 1504)) + ((~(iFreeMemory | (-18491009))) * (-1504))) - 1039579392);
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
                int iMyPid = Process.myPid();
                int i12 = ~iMyPid;
                int i13 = i9 + 1953475450 + (((~(iMyPid | 1640204982)) | (~((-29427749) | i12)) | (-1675603711)) * (-68)) + ((~((-35398729) | i12)) * (-68)) + (((~((-1640204983) | i12)) | (-64826477)) * 68);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(OverlayView.class, new Object[0]);
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
                int i17 = ((((i16 * i16) - (~(-(1118154755 * i16)))) - 1) - (~(-(i16 * (-577411051))))) - 1;
                int i18 = (i17 ^ (-2024464240)) + (((-2024464240) & i17) << 1);
                int i19 = i18 >> 22;
                int i20 = ((i19 ^ (-2047)) + ((i19 & (-2047)) << 1)) / 1024;
                int i21 = (i20 ^ 1) + ((i20 & 1) << 1);
                int i22 = (i18 & i21) + (i21 | i18);
                int i23 = i18 >> 17;
                int i24 = ((i23 & (-65535)) + (i23 | (-65535))) / 32768;
                int i25 = -(((i24 ^ 1) + ((i24 & 1) << 1)) ^ i22);
                int i26 = (i25 ^ 3) + ((i25 & 3) << 1);
                int i27 = i26 >> 22;
                int i28 = (((i27 | (-2047)) << 1) - (i27 ^ (-2047))) / 1024;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l((1580752773 / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i26) * 3)) + 767308241);
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
