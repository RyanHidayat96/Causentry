package id.vida.liveness;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.Gravity;
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

/* JADX INFO: renamed from: id.vida.liveness.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0770v0 {
    public static String c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1187a;
    public final int b;

    private static native Object[] $liveness$B732ac7f1(int i, int i2);

    private static native /* synthetic */ void $liveness$COI();

    private static native void $liveness$E732ac7f1(Object obj, Object obj2);

    public C0770v0(int i, int i2) {
        $liveness$E732ac7f1(this, $liveness$B732ac7f1(i, i2));
    }

    public final native String signImage(Context context, byte[] bArr) throws VIDAException;

    static {
        Object[] objArr;
        ClassLoader classLoader = C0770v0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3413), 1559 - (ViewConfiguration.getWindowTouchSlop() >> 8), 24 - View.resolveSizeAndState(0, 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1333721779, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1333721779};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43042), (KeyEvent.getMaxKeyCode() >> 16) + 3111, Gravity.getAbsoluteGravity(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 518 - (ViewConfiguration.getScrollBarSize() >> 8), ImageFormat.getBitsPerPixel(0) + 77), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) SystemClock.uptimeMillis());
                int i7 = i3 + 1511855794 + (((~(i6 | (-1695433881))) | (~((-9437761) | i6))) * (-184)) + ((79909 | (~((-9517670) | i6)) | (~((-1695513790) | i6))) * 184) + 178472408;
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i13 = ~startElapsedRealtime;
                int i14 = i10 + ((((~((-763931566) | i13)) | (~(startElapsedRealtime | 941099893))) * 959) - 189232871) + (((~(startElapsedRealtime | (-763931566))) | (~(i13 | 941099893))) * 959);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0770v0.class, new Object[0]);
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
                int i19 = -(1251001189 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * 1757007553);
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = ((i22 | 2103039849) << 1) - (2103039849 ^ i22);
                int i24 = i23 >> 29;
                int i25 = (((i24 | (-15)) << 1) - (i24 ^ (-15))) / 8;
                int i26 = (i25 & 1) + (i25 | 1);
                int i27 = (i23 & i26) + (i26 | i23);
                int i28 = ((i23 >> 27) - 63) / 32;
                int i29 = -(i27 ^ ((i28 ^ 1) + ((i28 & 1) << 1)));
                int i30 = (i29 & 1) + (i29 | 1);
                int i31 = i30 >> 29;
                int i32 = (((i31 | (-15)) << 1) - (i31 ^ (-15))) / 8;
                Loader.l(((-931157520) / (((-(((i32 ^ 1) + ((i32 & 1) << 1)) + 1)) & i30) * 6)) - 1317451150);
                $liveness$COI();
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
