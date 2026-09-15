package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
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

/* JADX INFO: renamed from: id.vida.liveness.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0730d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1090a;
    public int b;
    public boolean c;
    public final LivenessDetectionListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VidaFaceDetectionOption f1091e;

    private static native Object[] $liveness$Bd6e0ccb4(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener);

    private static native void $liveness$Ed6e0ccb4(Object obj, Object obj2);

    public C0730d1(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener) {
        $liveness$Ed6e0ccb4(this, $liveness$Bd6e0ccb4(context, vidaFaceDetectionOption, livenessDetectionListener));
    }

    public static native boolean checkHeadIsStraight(Face face);

    public final native void executeGesture(Face face, ImageProxy imageProxy);

    public final native boolean isGestureCompleted();

    public final native void resetGesture(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0730d1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - KeyEvent.normalizeMetaState(0)), 1559 - Color.blue(0), KeyEvent.keyCodeFromString("") + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -84751674, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -84751674};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "") + 43042), AndroidCharacter.getMirror('0') + 3063, 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 518, View.resolveSizeAndState(0, 0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyTid = Process.myTid();
                int i6 = i3 + 493999037 + (((~(iMyTid | 1521107507)) | (-183923952)) * (-465)) + ((1521107507 | (~((-183923952) | iMyTid))) * 930) + ((iMyTid | (-5518541)) * 465);
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i12 = ~startElapsedRealtime;
                int i13 = (~((-664175396) | i12)) | 26509312 | (~(1040856063 | i12));
                int i14 = i9 + (-1493230566) + (((~(startElapsedRealtime | (-403189981))) | i13) * 590) + (i13 * (-1180)) + (((~((-1040856064) | i12)) | (~(i12 | 664175395))) * 590);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0730d1.class, new Object[0]);
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
                int i19 = -(219971891 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * (-1575183457));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = (i22 ^ 1026598673) + ((1026598673 & i22) << 1);
                int i24 = ((i23 >> 16) - 131071) / 65536;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = -((((i23 | i25) << 1) - (i25 ^ i23)) ^ ((((i23 >> 25) - 255) / 128) + 1));
                int i27 = (i26 & 3) + (i26 | 3);
                int i28 = i27 >> 21;
                int i29 = (((i28 | (-4095)) << 1) - (i28 ^ (-4095))) / 2048;
                Loader.l(((-1065094824) / (((-(((i29 ^ 1) + ((i29 & 1) << 1)) + 1)) & i27) * 2)) - 1063924356);
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
