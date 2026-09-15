package id.vida.liveness;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.camera.core.ImageProxy;
import androidx.compose.runtime.ComposerKt;
import com.google.mlkit.vision.face.Face;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0735f0 {
    private static /* synthetic */ Comparator $liveness$Ca84c6618() {
        return new Comparator() { // from class: id.vida.liveness.f0$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC0735f0.a((Face) obj, (Face) obj2);
            }
        };
    }

    public static native /* synthetic */ int a(Face face, Face face2);

    public static native boolean checkDetectedFaceSize(int i, int i2);

    public static native boolean checkFrontalFacePosition(Face face);

    public static native boolean checkIfDetectedFaceIsUnderBound(Face face, int i, int i2, int i3, int i4);

    public static native boolean checkIfTwoRectOverlap(Rect rect, Rect rect2);

    public static native byte[] convertBitmapToByteArray(Bitmap bitmap, boolean z);

    public static native Rect getNormalizedPreviewRect(int i, int i2);

    public static native int getShapeLimit();

    public static native boolean isDarkImage(Face face, ImageProxy imageProxy, VidaFaceDetectionOption vidaFaceDetectionOption);

    public static native boolean isFaceLargeEnoughForDetection(List<Face> list, int i, int i2, int i3, int i4, float f);

    public static native boolean isIoUWithinRange(int i, int i2, Rect rect, float f);

    public static native Rect normalizeFace(Face face, int i, int i2, int i3, int i4);

    public static native Bitmap rotateBitmap(Bitmap bitmap, int i, boolean z, boolean z2);

    static {
        Object[] objArr;
        ClassLoader classLoader = AbstractC0735f0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.green(0) + 3414), 1559 - View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 920035362, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 920035362};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43042), TextUtils.indexOf("", "", 0) + 3111, 21 - Process.getGidForName(""), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 519, 76 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Integer.TYPE});
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
                int i6 = ~((-661676558) | iUptimeMillis);
                int i7 = (-190329150) + ((20980232 | i6) * (-280)) + ((i6 | (~((-1043354902) | iUptimeMillis))) * 140);
                int i8 = ~((-640696326) | iUptimeMillis);
                int i9 = ~iUptimeMillis;
                int i10 = i3 + i7 + (((~(i9 | (-402658577))) | i8 | (~((-20980233) | i9))) * 140);
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
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
                int i13 = ((int[]) objArr4[0])[0];
                int i14 = ((int[]) objArr4[2])[0];
                int i15 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iMyUid = Process.myUid();
                int i16 = i13 + (-669970727) + (((~((~iMyUid) | (-221789408))) | 1483242051) * (-235)) + (((~((-221789408) | iMyUid)) | 1483242051) * (-470)) + (((~(iMyUid | (-84935837))) | 1346388480) * 235);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i15}, new int[]{i14}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0735f0.class, new Object[0]);
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
                int i21 = -(1111797904 * i19);
                int i22 = (((i20 ^ i21) + ((i20 & i21) << 1)) - (~(-(i19 * (-112916744))))) - 1;
                int i23 = (i22 & (-1463226864)) + ((-1463226864) | i22);
                int i24 = i23 >> 26;
                int i25 = (((i24 | ComposerKt.defaultsKey) << 1) - (i24 ^ ComposerKt.defaultsKey)) / 64;
                int i26 = ((i25 | 1) << 1) - (i25 ^ 1);
                int i27 = ((i23 | i26) << 1) - (i26 ^ i23);
                int i28 = i23 >> 21;
                int i29 = (((i28 | (-4095)) << 1) - (i28 ^ (-4095))) / 2048;
                int i30 = -((((i29 | 1) << 1) - (i29 ^ 1)) ^ i27);
                int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
                int i32 = i31 >> 21;
                int i33 = ((i32 & (-4095)) + (i32 | (-4095))) / 2048;
                int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
                Loader.l((689435308 / (((-(((i34 | 1) << 1) - (i34 ^ 1))) & i31) * 4)) + 1807840194);
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
