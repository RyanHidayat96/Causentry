package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: renamed from: id.vida.liveness.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0757p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1153a;
    public final /* synthetic */ C0769v b;

    private static native Object[] $liveness$B4556a935(C0769v c0769v, Continuation continuation);

    private static native void $liveness$E4556a935(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public C0757p(C0769v c0769v, Continuation continuation) {
        this.b = c0769v;
        Object[] objArr$liveness$B4556a935 = $liveness$B4556a935(c0769v, continuation);
        super(((Value) objArr$liveness$B4556a935[1]).i, (Continuation) objArr$liveness$B4556a935[2]);
        $liveness$E4556a935(this, objArr$liveness$B4556a935);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Continuation<Unit> create(Object obj, Continuation<?> continuation);

    @Override // kotlin.jvm.functions.Function2
    public final native Object invoke(CoroutineScope coroutineScope, Continuation<? super SDKConfigResponseDTO> continuation);

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Object invokeSuspend(Object obj);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0757p.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3414), View.MeasureSpec.getMode(0) + 1559, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -2017820024, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -2017820024};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 3111, (Process.myPid() >> 22) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 518, 76 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE});
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
                int i7 = i3 + (-997651732) + ((~((-1301379883) | i6)) * 979) + ((iUptimeMillis | 403651576) * (-979)) + (((~(iUptimeMillis | (-1301379883))) | (~(i6 | 403651576))) * 979);
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
                int[] iArr = {i11};
                int[] iArr2 = {i12};
                int iNextInt = new Random().nextInt(361997125);
                int i13 = ~iNextInt;
                int i14 = 2134004290 + (((~((-715262020) | i13)) | (~(989210819 | iNextInt))) * 520);
                int i15 = ~((-989210820) | i13);
                int i16 = ~(iNextInt | 715820639);
                int i17 = i10 + i14 + ((i15 | i16) * (-1040)) + ((i16 | (~(i13 | (-715820640))) | 273948800) * 520);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0757p.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = i20 * i20;
                int i22 = -(1879194237 * i20);
                int i23 = (i21 & i22) + (i21 | i22);
                int i24 = -(i20 * 862752897);
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                int i26 = (i25 ^ (-1580239615)) + (((-1580239615) & i25) << 1);
                int i27 = i26 >> 23;
                int i28 = (((i27 | (-1023)) << 1) - (i27 ^ (-1023))) / 512;
                int i29 = (i26 - (~((i28 ^ 1) + ((i28 & 1) << 1)))) - 1;
                int i30 = i26 >> 28;
                int i31 = ((i30 ^ (-31)) + ((i30 & (-31)) << 1)) / 16;
                int i32 = -(i29 ^ ((i31 & 1) + (i31 | 1)));
                int i33 = ((i32 | 2) << 1) - (i32 ^ 2);
                int i34 = i33 >> 15;
                Loader.l(((-1392934152) / (((-((((i34 & (-262143)) + (i34 | (-262143))) / 131072) + 2)) & i33) * 4)) - 239726135);
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
