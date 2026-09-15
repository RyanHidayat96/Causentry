package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import java.util.HashSet;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1025a;
    public final int b;
    public int c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1026e;
    public final HashSet f;
    public final VidaFaceDetectionOption g;
    public final LivenessDetectionListener h;
    public boolean i;

    private static native Object[] $liveness$Ba3af6a12(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener);

    private static native void $liveness$Ea3af6a12(Object obj, Object obj2);

    public F1(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener) {
        $liveness$Ea3af6a12(this, $liveness$Ba3af6a12(context, vidaFaceDetectionOption, livenessDetectionListener));
    }

    public final native void a(Face face, ImageProxy imageProxy, int i, int i2, G1 g1);

    public final native void executeGesture(Face face, ImageProxy imageProxy, int i, int i2);

    public final native boolean isGestureCompleted();

    public final native void resetGesture(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = F1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 3414), 1559 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter("", 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -782089383, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -782089383};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "") + 43042), 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), TextUtils.indexOf((CharSequence) "", '0') + 519, 76 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((~Process.myUid()) | 1105775995);
                int i7 = i3 + (((1078461528 | i6) * (-970)) - 884535820) + ((i6 | 27314467) * 970);
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i13 = i10 + (((~((-1396693261) | iMaxMemory)) | 1096746778) * 262) + 159455698 + (((~((~iMaxMemory) | (-1396693261))) | 1096746778) * 262);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(F1.class, new Object[0]);
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
                int i18 = -(1828926508 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * 1507043928);
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = (i21 ^ 1032211716) + ((1032211716 & i21) << 1);
                int i23 = i22 >> 26;
                int i24 = (((i23 | ComposerKt.defaultsKey) << 1) - (i23 ^ ComposerKt.defaultsKey)) / 64;
                int i25 = ((i24 | 1) << 1) - (i24 ^ 1);
                int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
                int i27 = i22 >> 27;
                int i28 = -(i26 ^ ((((i27 ^ (-63)) + ((i27 & (-63)) << 1)) / 32) + 1));
                int i29 = ((i28 | 4) << 1) - (i28 ^ 4);
                int i30 = i29 >> 21;
                int i31 = ((i30 ^ (-4095)) + ((i30 & (-4095)) << 1)) / 2048;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                Loader.l((1386406928 / (((-(((i32 | 1) << 1) - (i32 ^ 1))) & i29) * 2)) + 1511776591);
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
