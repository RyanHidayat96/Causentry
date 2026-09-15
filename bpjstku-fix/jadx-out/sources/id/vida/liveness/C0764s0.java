package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.core.ImageProxy;
import androidx.compose.runtime.ComposerKt;
import com.google.mlkit.vision.face.Face;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.listeners.LivenessDetectionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0764s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1163a;
    public int b;
    public int c;
    public final LivenessDetectionListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1164e;
    public final VidaFaceDetectionOption f;
    public boolean g;
    public boolean h;

    private static native Object[] $liveness$Bf06b6684(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener);

    private static native void $liveness$Ef06b6684(Object obj, Object obj2);

    public C0764s0(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener) {
        $liveness$Ef06b6684(this, $liveness$Bf06b6684(context, vidaFaceDetectionOption, livenessDetectionListener));
    }

    public final native void executeGesture(Face face, ImageProxy imageProxy);

    public final native boolean isGestureCompleted();

    public final native void resetGesture(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0764s0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3414), 1559 - View.resolveSize(0, 0), 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 888819462, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 888819462};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042), 3111 - KeyEvent.getDeadChar(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 518 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 76 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i4};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = (~((-796548698) | i6)) | 639785033;
                int i8 = ~(iUptimeMillis | 1065246425);
                int i9 = i3 + (((i7 | i8) * (-252)) - 277897474) + ((i8 | (~(i6 | (-156763665)))) * 252);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
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
                int iNextInt = new Random().nextInt(1615376359);
                int i15 = ~iNextInt;
                int i16 = i12 + (-1984962272) + (((~((-1248253219) | i15)) | 456778240) * 226) + (((~(i15 | (-1078334755))) | (~((-456778241) | iNextInt)) | 286859776) * (-113)) + ((~(iNextInt | (-1248253219))) * 113);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0764s0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i19 = ((int[]) objArr[0])[0];
                int i20 = i19 * i19;
                int i21 = -(44219589 * i19);
                int i22 = (((i20 & i21) + (i20 | i21)) - (~(-(i19 * 200664637)))) - 1;
                int i23 = ((i22 | (-1937054975)) << 1) - ((-1937054975) ^ i22);
                int i24 = ((i23 >> 29) - 15) / 8;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = (i23 ^ i25) + ((i25 & i23) << 1);
                int i27 = i23 >> 26;
                int i28 = ((i27 & ComposerKt.defaultsKey) + (i27 | ComposerKt.defaultsKey)) / 64;
                int i29 = -(i26 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
                int i30 = (i29 & 3) + (i29 | 3);
                int i31 = ((i30 >> 28) - 31) / 16;
                Loader.l((-368941248) / (((-(((i31 ^ 1) + ((i31 & 1) << 1)) + 1)) & i30) * 29));
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
