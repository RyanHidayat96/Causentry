package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class B implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1011a;

    private static native Object[] $liveness$Bf8b5eb8f();

    private static native void $liveness$Ef8b5eb8f(Object obj, Object obj2);

    public B() {
        $liveness$Ef8b5eb8f(this, $liveness$Bf8b5eb8f());
    }

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = B.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Color.blue(0)), 1559 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23 - ExpandableListView.getPackedPositionChild(0L), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -208638237, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -208638237};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3110 - TextUtils.indexOf((CharSequence) "", '0', 0), 21 - TextUtils.lastIndexOf("", '0'), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 519, 76 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = i3 + (-1374525322) + (((~((-807469348) | iUptimeMillis)) | (~(897562111 | iUptimeMillis))) * 69) + (((~(iUptimeMillis | 812585455)) | (~((-892446004) | iUptimeMillis)) | 84976656) * (-69)) + 353011452;
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
                int[] iArr2 = {i11};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i12 = (-1087533526) + (((~((-1064223888) | startElapsedRealtime)) | (-640807572)) * (-318));
                int i13 = ~((-640807572) | startElapsedRealtime);
                int i14 = ~startElapsedRealtime;
                int i15 = i9 + i12 + ((i13 | (~(i14 | 1065350815))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(startElapsedRealtime | 1065350815)) | (~((-1126929) | i14))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(B.class, new Object[0]);
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
                int i19 = ((i18 * i18) - (~(-(1987107314 * i18)))) - 1;
                int i20 = -(i18 * (-1191863644));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = (i21 ^ 203952633) + ((203952633 & i21) << 1);
                int i23 = i22 >> 15;
                int i24 = ((i23 & (-262143)) + (i23 | (-262143))) / 131072;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = ((i22 | i25) << 1) - (i25 ^ i22);
                int i27 = i22 >> 22;
                int i28 = ((i27 ^ (-2047)) + ((i27 & (-2047)) << 1)) / 1024;
                int i29 = -(((i28 & 1) + (i28 | 1)) ^ i26);
                int i30 = (i29 ^ 2) + ((i29 & 2) << 1);
                int i31 = i30 >> 24;
                int i32 = ((i31 & (-511)) + (i31 | (-511))) / 256;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l((643476628 / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i30) * 2)) + 1580234681);
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
