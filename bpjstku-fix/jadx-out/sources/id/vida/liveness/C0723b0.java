package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.face.FaceDetector;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.listeners.LivenessDetectionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0723b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FaceDetector f1077a;
    public LivenessDetectionListener b;
    public int c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f1078e;
    public VidaFaceDetectionOption f;
    public ExecutorService g;
    public Context h;
    public int i;
    public C0754n0 j;
    public int k;

    private static native Object[] $liveness$B5109cea5();

    private static /* synthetic */ OnCompleteListener $liveness$C68b01421() {
        return new OnCompleteListener() { // from class: id.vida.liveness.b0$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C0723b0.a(task);
            }
        };
    }

    private static /* synthetic */ OnSuccessListener $liveness$Cc89e6299(final C0723b0 c0723b0, final ImageProxy imageProxy) {
        return new OnSuccessListener() { // from class: id.vida.liveness.b0$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.a(imageProxy, (List) obj);
            }
        };
    }

    private static /* synthetic */ OnFailureListener $liveness$Cfe831c1e(final C0723b0 c0723b0) {
        return new OnFailureListener() { // from class: id.vida.liveness.b0$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f$0.a(exc);
            }
        };
    }

    private static native void $liveness$E5109cea5(Object obj, Object obj2);

    public C0723b0() {
        $liveness$E5109cea5(this, $liveness$B5109cea5());
    }

    public static native /* synthetic */ void a(Task task);

    public final native /* synthetic */ void a(ImageProxy imageProxy, List list);

    public final native /* synthetic */ void a(Exception exc);

    public final native void detect(ImageProxy imageProxy);

    public final native void initialization(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener, int i, int i2) throws VIDAException;

    public final native void stop();

    public final native void updateStartDetectionTime();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0723b0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 1560, (-16777192) - Color.rgb(0, 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1969707854, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1969707854};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 3112 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getMode(0), 518 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 76), Integer.TYPE});
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
                int i6 = ~iUptimeMillis;
                int i7 = i3 + (-2139345890) + (((~((-865707924) | i6)) | (~(866103199 | iUptimeMillis))) * (-831)) + ((~((-26779665) | iUptimeMillis)) * (-1662)) + (((~(iUptimeMillis | 865707923)) | (~(i6 | (-839323536))) | (~(839323535 | iUptimeMillis))) * 831);
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
                int i13 = ~(((int) Runtime.getRuntime().maxMemory()) | 1354976330);
                int i14 = i10 + 577213982 + (((-350055129) | i13) * (-220)) + ((i13 | (-1423929051)) * 220) + 1156879036;
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0723b0.class, new Object[0]);
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
                int i19 = -(11262181 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * (-271761119));
                int i22 = (((i20 | i21) << 1) - (i21 ^ i20)) - (-924077577);
                int i23 = i22 >> 17;
                int i24 = ((i23 & (-65535)) + (i23 | (-65535))) / 32768;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = -(((i22 ^ i25) + ((i25 & i22) << 1)) ^ (i24 + 1));
                int i27 = ((i26 | 3) << 1) - (i26 ^ 3);
                int i28 = i27 >> 23;
                int i29 = ((i28 & (-1023)) + (i28 | (-1023))) / 512;
                int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
                Loader.l(((-1549582173) / (((-((i30 ^ 1) + ((i30 & 1) << 1))) & i27) * 3)) - 1299357632);
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
