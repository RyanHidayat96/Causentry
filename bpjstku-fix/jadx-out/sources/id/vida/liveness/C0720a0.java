package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.listeners.LivenessDetectionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0720a0 implements ImageAnalysis.Analyzer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0723b0 f1075a;
    public boolean b;

    private static native Object[] $liveness$B4f54f606();

    private static native void $liveness$E4f54f606(Object obj, Object obj2);

    public C0720a0() {
        $liveness$E4f54f606(this, $liveness$B4f54f606());
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final native void analyze(ImageProxy imageProxy);

    public final native void initialization(Context context, VidaFaceDetectionOption vidaFaceDetectionOption, LivenessDetectionListener livenessDetectionListener, int i, int i2) throws VIDAException;

    public final native void startAnalysis();

    public final native void stopAnalysis();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0720a0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1560, ExpandableListView.getPackedPositionGroup(0L) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -153874914, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -153874914};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43041), Color.argb(0, 0, 0, 0) + 3111, ExpandableListView.getPackedPositionGroup(0L) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.indexOf((CharSequence) "", '0') + 519, View.resolveSize(0, 0) + 76), Integer.TYPE});
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
                int i6 = i3 + 1470212582 + (((~((~iMyPid) | (-988084999))) | 715175940) * 446) + (((~(iMyPid | (-272909059))) | 1770520) * 446) + 1140889336;
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
                int[] iArr2 = {i11};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i12 = 2078094738 + (((~((-217632014) | startUptimeMillis)) | 72877320 | (~(1487399445 | startUptimeMillis))) * (-754));
                int i13 = ~((-72877321) | startUptimeMillis);
                int i14 = ~startUptimeMillis;
                int i15 = i9 + i12 + ((i13 | (~(1560276765 | i14))) * (-754)) + ((i14 | (-217632014)) * 754);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0720a0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i18 = ((int[]) objArr[0])[0];
                int i19 = i18 * i18;
                int i20 = -(409116271 * i18);
                int i21 = (i19 & i20) + (i19 | i20);
                int i22 = -(i18 * 1166950491);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = (i23 ^ 1344847321) + ((1344847321 & i23) << 1);
                int i25 = i24 >> 20;
                int i26 = ((i25 & (-8191)) + (i25 | (-8191))) / 4096;
                int i27 = (i26 & 1) + (i26 | 1);
                int i28 = ((i24 | i27) << 1) - (i27 ^ i24);
                int i29 = i24 >> 25;
                int i30 = (((i29 | (-255)) << 1) - (i29 ^ (-255))) / 128;
                int i31 = -((((i30 | 1) << 1) - (i30 ^ 1)) ^ i28);
                int i32 = (i31 ^ 5) + ((i31 & 5) << 1);
                int i33 = ((i32 >> 23) - 1023) / 512;
                Loader.l((1788207150 / (((-((((i33 | 1) << 1) - (i33 ^ 1)) + 1)) & i32) * 2)) + 1296405262);
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
