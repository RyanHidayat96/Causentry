package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
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

/* JADX INFO: renamed from: id.vida.liveness.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0727c1 implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1082a;

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0727c1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 3415), 1559 - Color.green(0), 24 - TextUtils.getOffsetBefore("", 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1844593579, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1844593579};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111, 22 - ExpandableListView.getPackedPositionGroup(0L), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 518 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 76 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt(1575434575);
                int i6 = ~iNextInt;
                int i7 = i3 + (((((~((-1443311380) | i6)) | (~((-261720080) | iNextInt))) | (~(i6 | 261720079))) * 959) - 406603868) + (((~(iNextInt | 261720079)) | (~(i6 | (-261720080))) | (~((-1443311380) | iNextInt))) * 959);
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
                int i13 = ~((~((int) Process.getStartUptimeMillis())) | 1115374759);
                int i14 = i10 + ((1079641220 | i13) * (-970)) + 683200172 + ((i13 | 35733539) * 970);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0727c1.class, new Object[0]);
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
                int i19 = -(1233908151 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * 689838221);
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = ((i22 | (-1934731132)) << 1) - ((-1934731132) ^ i22);
                int i24 = ((i23 >> 24) - 511) / 256;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = (i23 ^ i25) + ((i25 & i23) << 1);
                int i27 = i23 >> 17;
                int i28 = ((i27 ^ (-65535)) + ((i27 & (-65535)) << 1)) / 32768;
                int i29 = -(i26 ^ ((i28 & 1) + (i28 | 1)));
                int i30 = ((i29 | 3) << 1) - (i29 ^ 3);
                int i31 = i30 >> 16;
                int i32 = (((i31 | (-131071)) << 1) - (i31 ^ (-131071))) / 65536;
                int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
                Loader.l((1016047656 / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 2)) + 94968472);
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
