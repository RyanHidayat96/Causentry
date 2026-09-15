package id.vida.liveness.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Process;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentedProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1184a;
    public int b;
    public int c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1185e;
    public int f;

    private static native Object[] $liveness$Be161470f(Context context, AttributeSet attributeSet);

    private static native void $liveness$Ee161470f(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        Object[] objArr$liveness$Be161470f = $liveness$Be161470f(context, attributeSet);
        super((Context) objArr$liveness$Be161470f[1], (AttributeSet) objArr$liveness$Be161470f[2]);
        $liveness$Ee161470f(this, objArr$liveness$Be161470f);
    }

    @Override // android.view.View
    public native void onDraw(Canvas canvas);

    public native void setProgressSegmentColor(int i);

    public native void setProgressSegments(int i);

    public native void setSegmentGapWidth(int i);

    public native void setSegments(int i, int i2, int i3, int i4);

    public native void setTotalSegments(int i);

    static {
        Object[] objArr;
        ClassLoader classLoader = SegmentedProgressBar.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3413), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1558, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 21945858, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 21945858};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042), 3111 - KeyEvent.getDeadChar(0, 0), 22 - Gravity.getAbsoluteGravity(0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName("") + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 518, 76 - KeyEvent.keyCodeFromString("")), Integer.TYPE});
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
                int i6 = i3 + ((((~(iMyPid | 739383037)) | 965648421) * 56) - 1523536062) + (((~((~iMyPid) | 965648421)) | 739383037) * 56);
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
                int iMyPid2 = Process.myPid();
                int i12 = ~iMyPid2;
                int i13 = i9 + 1624667276 + (((~((-1260773533) | i12)) | (~(1535112862 | iMyPid2))) * (-831)) + ((~((-1090854937) | iMyPid2)) * (-1662)) + (((~(iMyPid2 | 1260773532)) | (~(i12 | (-444257927))) | (~(444257926 | iMyPid2))) * 831);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(SegmentedProgressBar.class, new Object[0]);
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
                int i18 = -(1714695654 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * (-200383640));
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = ((i21 | (-2052301583)) << 1) - ((-2052301583) ^ i21);
                int i23 = i22 >> 15;
                int i24 = ((i23 ^ (-262143)) + ((i23 & (-262143)) << 1)) / 131072;
                int i25 = ((i24 | 1) << 1) - (i24 ^ 1);
                int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
                int i27 = i22 >> 26;
                int i28 = (((i27 | ComposerKt.defaultsKey) << 1) - (i27 ^ ComposerKt.defaultsKey)) / 64;
                int i29 = -(((i28 & 1) + (i28 | 1)) ^ i26);
                int i30 = (i29 & 2) + (i29 | 2);
                int i31 = i30 >> 16;
                int i32 = ((i31 ^ (-131071)) + ((i31 & (-131071)) << 1)) / 65536;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l(((-972995316) / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i30) * 3)) - 822652037);
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
