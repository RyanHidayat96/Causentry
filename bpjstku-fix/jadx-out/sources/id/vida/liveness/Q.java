package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import liveness.Loader;

/* JADX INFO: loaded from: classes5.dex */
public final class Q {
    public static ThreadFactory d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f1048a;
    public final HashMap b;
    public final HashMap c;
    protected final ExecutorService executorService;

    private static native Object[] $liveness$B2ca654c1(ExecutorService executorService);

    private static native Object[] $liveness$Bf9894c1e();

    private static /* synthetic */ Runnable $liveness$C559d0a00(final Q q, final InterfaceC0776y0 interfaceC0776y0, final Context context) {
        return new Runnable() { // from class: id.vida.liveness.Q$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(interfaceC0776y0, context);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C68d6051d(final Q q, final InterfaceC0776y0 interfaceC0776y0, final Map map, final CountDownLatch countDownLatch) {
        return new Runnable() { // from class: id.vida.liveness.Q$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(interfaceC0776y0, map, countDownLatch);
            }
        };
    }

    private static native /* synthetic */ void $liveness$COI();

    private static native void $liveness$E2ca654c1(Object obj, Object obj2);

    private static native void $liveness$Ef9894c1e(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public Q() {
        Object[] objArr$liveness$Bf9894c1e = $liveness$Bf9894c1e();
        this((ExecutorService) objArr$liveness$Bf9894c1e[0]);
        $liveness$Ef9894c1e(this, objArr$liveness$Bf9894c1e);
    }

    public Q(ExecutorService executorService) {
        $liveness$E2ca654c1(this, $liveness$B2ca654c1(executorService));
    }

    public final native /* synthetic */ void a(InterfaceC0776y0 interfaceC0776y0, Context context);

    public final native /* synthetic */ void a(InterfaceC0776y0 interfaceC0776y0, Map map, CountDownLatch countDownLatch);

    public final native synchronized Map<String, String> getSignedSignals(Context context, long j, TimeUnit timeUnit) throws VIDAException;

    public final native void guaranteeShutdown() throws VIDAException;

    public final native void initialize();

    public final native void startSensing(Context context) throws VIDAException;

    public final native Map<String, Map<String, String>> stopSensing(long j, TimeUnit timeUnit) throws VIDAException;

    static {
        Object[] objArr;
        ClassLoader classLoader = Q.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 3414), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1558, 24 - View.MeasureSpec.getMode(0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2036605323, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2036605323};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.lastIndexOf("", '0')), (Process.myTid() >> 22) + 3111, (Process.myPid() >> 22) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 518, (KeyEvent.getMaxKeyCode() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = i3 + 1470212582 + (((~((~startUptimeMillis) | (-1142694620))) | 262211) * 446) + (((~(startUptimeMillis | (-1142432409))) | 562074628) * 446) + 116946106;
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
                int i12 = ~((int) Process.getElapsedCpuTime());
                int i13 = i9 + (-24833606) + ((~(1593827058 | i12)) * 52) + (((~(249682610 | i12)) | (~((-1455348849) | i12)) | 1344144448) * (-52)) + (((~(i12 | (-249682611))) | 138478210) * 52);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Q.class, new Object[0]);
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
                int i18 = -(426240605 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * 538129619);
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = (i21 & (-1761924544)) + ((-1761924544) | i21);
                int i23 = i22 >> 25;
                int i24 = (((i23 ^ (-255)) + ((i23 & (-255)) << 1)) / 128) + 1;
                int i25 = ((i22 | i24) << 1) - (i24 ^ i22);
                int i26 = i22 >> 22;
                int i27 = -(i25 ^ ((((i26 & (-2047)) + (i26 | (-2047))) / 1024) + 1));
                int i28 = ((i27 | 3) << 1) - (i27 ^ 3);
                int i29 = i28 >> 19;
                int i30 = ((i29 ^ (-16383)) + ((i29 & (-16383)) << 1)) / 8192;
                int i31 = (i30 & 1) + (i30 | 1);
                Loader.l(((-1388346120) / (((-(((i31 | 1) << 1) - (i31 ^ 1))) & i28) * 3)) - 1213892057);
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
