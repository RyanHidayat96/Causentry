package id.vida.liveness;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.face.Face;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.listeners.LivenessDetectionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1071a;
    public int b;
    public boolean c;
    public final LivenessDetectionListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VidaFaceDetectionOption f1072e;

    private static native Object[] $liveness$B7c6754f7(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener);

    private static native void $liveness$E7c6754f7(Object obj, Object obj2);

    public Z(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener) {
        $liveness$E7c6754f7(this, $liveness$B7c6754f7(context, vidaFaceDetectionOption, livenessDetectionListener));
    }

    public static native boolean checkHeadIsStraight(Face face);

    public final native void executeGesture(Face face, ImageProxy imageProxy);

    public final native boolean isGestureCompleted();

    public final native void resetGesture(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = Z.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - TextUtils.getTrimmedLength("")), KeyEvent.getDeadChar(0, 0) + 1559, 24 - View.getDefaultSize(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1156879882, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1156879882};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 21 - ImageFormat.getBitsPerPixel(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.getSize(0) + 518, 76 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i6 = ~elapsedCpuTime;
                int i7 = i3 + (-727829025) + (((~(elapsedCpuTime | 1667873065)) | (~((-37158394) | i6))) * 333) + (((~(elapsedCpuTime | (-37158394))) | (~(i6 | 1667873065))) * 333);
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
                int i13 = ~((int) Process.getStartElapsedRealtime());
                int i14 = i10 + (((1511855794 + (((~(i13 | (-25952385))) | (~((-68321299) | i13))) * (-184))) + (((805378888 | (~((-873700187) | i13))) | (~((-831331273) | i13))) * 184)) - 1967651664);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Z.class, new Object[0]);
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
                int i19 = -(1481743466 * i17);
                int i20 = ((((i18 | i19) << 1) - (i18 ^ i19)) - (~(-(i17 * (-1572651372))))) - 2109643520;
                int i21 = i20 >> 20;
                int i22 = (((i21 | (-8191)) << 1) - (i21 ^ (-8191))) / 4096;
                int i23 = (i22 & 1) + (i22 | 1);
                int i24 = (i20 & i23) + (i23 | i20);
                int i25 = ((i20 >> 17) - 65535) / 32768;
                int i26 = -(i24 ^ (((i25 | 1) << 1) - (i25 ^ 1)));
                int i27 = ((i26 | 2) << 1) - (i26 ^ 2);
                int i28 = i27 >> 17;
                Loader.l((-1021296550) / (((-(((((i28 | (-65535)) << 1) - (i28 ^ (-65535))) / 32768) + 2)) & i27) * 5));
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
