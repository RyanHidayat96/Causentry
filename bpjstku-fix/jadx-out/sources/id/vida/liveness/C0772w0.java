package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0772w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1190a;
    public final ArrayList b;
    public int c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1191e;
    public long f;

    private static native Object[] $liveness$B6a210def(String str, int i);

    private static native void $liveness$E6a210def(Object obj, Object obj2);

    public C0772w0(String str, int i) {
        $liveness$E6a210def(this, $liveness$B6a210def(str, i));
    }

    public final native void addValue(long j);

    public final native int[] calculateHistogram(int i);

    public final native long get90thPercentile();

    public final native long get95thPercentile();

    public final native long get99thPercentile();

    public final native double getAverageValue();

    public final native long getDynamicBucketLowerBound(int i, int i2);

    public final native long getDynamicBucketUpperBound(int i, int i2);

    public final native double getMedianValue();

    public final native long getPercentile(int i);

    public final native void printStatistics(String str, int i);

    public final native String toString();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0772w0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1559 - KeyEvent.getDeadChar(0, 0), 24 - View.MeasureSpec.getMode(0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 324598148, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 324598148};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 43042), 3111 - Color.alpha(0), Drawable.resolveOpacity(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 518 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.argb(0, 0, 0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i5};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = (-1105839102) + (((~((-211836858) | iUptimeMillis)) | 134240041 | (~((-1493194602) | iUptimeMillis))) * (-880));
                int i7 = (~((-211836858) | (~iUptimeMillis))) | 1493194601;
                int i8 = ~(iUptimeMillis | 211836857);
                int i9 = i3 + i6 + ((i7 | i8) * (-880)) + (i8 * 880);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i12 = ((int[]) objArr4[0])[0];
                int i13 = ((int[]) objArr4[2])[0];
                int i14 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int i15 = (int) Runtime.getRuntime().totalMemory();
                int i16 = ~i15;
                int i17 = i12 + 1542659238 + (((~(701906836 | i16)) | 302530570) * (-108)) + (((~(i16 | 1003124622)) | (~((-1003124623) | i15)) | 1312784) * 54) + ((i15 | 1312784) * 54);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0772w0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = i20 * i20;
                int i22 = -(180820413 * i20);
                int i23 = (i21 & i22) + (i21 | i22);
                int i24 = -(i20 * (-357304811));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                int i26 = ((i25 | 171020817) << 1) - (171020817 ^ i25);
                int i27 = ((i26 >> 27) - 63) / 32;
                int i28 = ((i27 | 1) << 1) - (i27 ^ 1);
                int i29 = (i26 & i28) + (i28 | i26);
                int i30 = i26 >> 20;
                int i31 = ((i30 ^ (-8191)) + ((i30 & (-8191)) << 1)) / 4096;
                int i32 = -(i29 ^ (((i31 | 1) << 1) - (i31 ^ 1)));
                int i33 = (i32 ^ 3) + ((i32 & 3) << 1);
                int i34 = ((i33 >> 22) - 2047) / 1024;
                int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
                Loader.l((1068858204 / (((-(((i35 | 1) << 1) - (i35 ^ 1))) & i33) * 2)) + 1281936513);
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
