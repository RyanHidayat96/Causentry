package id.vida.liveness;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.face.Face;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.constants.Gestures;
import id.vida.liveness.listeners.LivenessDetectionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0754n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f1146a;
    public final C0730d1 b;
    public final C0764s0 c;
    public final F1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LivenessDetectionListener f1147e;
    public final ArrayList f;
    public final HashSet g;
    public boolean h;

    private static native Object[] $liveness$Be7e32b69(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener);

    private static native void $liveness$Ee7e32b69(Object obj, Object obj2);

    public C0754n0(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener) {
        $liveness$Ee7e32b69(this, $liveness$Be7e32b69(context, vidaFaceDetectionOption, livenessDetectionListener));
    }

    public final native void executeGesture(Face face, ImageProxy imageProxy, int i, int i2);

    public final native Gestures getNextGesture();

    public final native boolean isActiveLivenessGestureCompleted();

    public final native boolean isGestureOngoingOrCompleted();

    public final native void resetGesture(String str, boolean z);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0754n0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - KeyEvent.normalizeMetaState(0)), 1558 - MotionEvent.axisFromString(""), 24 - View.combineMeasuredStates(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1775343062, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1775343062};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - Drawable.resolveOpacity(0, 0)), 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.combineMeasuredStates(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 517 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getTapTimeout() >> 16) + 76), Integer.TYPE});
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
                int iMyUid = Process.myUid();
                int i6 = (~((-998000373) | iMyUid)) | 707018788;
                int i7 = ~((~iMyUid) | 998012670);
                int i8 = i3 + (-1003587270) + ((i6 | i7) * (-470)) + (((~(iMyUid | (-290981585))) | i7) * 470);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
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
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i12};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i14 = ~((-1120509725) | startElapsedRealtime);
                int i15 = ~startElapsedRealtime;
                int i16 = i11 + 272823302 + ((i14 | (~(1658822430 | i15))) * (-406)) + ((~((-1074300697) | i15)) * (-406)) + (((~(startElapsedRealtime | (-584521735))) | (~(1120509724 | i15))) * 406);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0754n0.class, new Object[0]);
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
                int i20 = ((i19 * i19) - (~(-(1286246397 * i19)))) - 1;
                int i21 = -(i19 * (-538278135));
                int i22 = (((i20 | i21) << 1) - (i21 ^ i20)) - (-2009302281);
                int i23 = i22 >> 28;
                int i24 = ((i23 & (-31)) + (i23 | (-31))) / 16;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = (i22 & i25) + (i25 | i22);
                int i27 = i22 >> 15;
                int i28 = ((i27 & (-262143)) + (i27 | (-262143))) / 131072;
                int i29 = (-((((i28 | 1) << 1) - (i28 ^ 1)) ^ i26)) + 4;
                int i30 = i29 >> 29;
                int i31 = ((i30 ^ (-15)) + ((i30 & (-15)) << 1)) / 8;
                int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                Loader.l(((-1257195376) / ((i29 & (-((i32 & 1) + (i32 | 1)))) * 2)) - 1917996597);
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
