package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
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

/* JADX INFO: renamed from: id.vida.liveness.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0759q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1156a;
    public final /* synthetic */ C0769v b;

    private static native Object[] $liveness$B4564c0b6(C0769v c0769v, Continuation continuation);

    private static native void $liveness$E4564c0b6(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public C0759q(C0769v c0769v, Continuation continuation) {
        this.b = c0769v;
        Object[] objArr$liveness$B4564c0b6 = $liveness$B4564c0b6(c0769v, continuation);
        super(((Value) objArr$liveness$B4564c0b6[1]).i, (Continuation) objArr$liveness$B4564c0b6[2]);
        $liveness$E4564c0b6(this, objArr$liveness$B4564c0b6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Continuation<Unit> create(Object obj, Continuation<?> continuation);

    @Override // kotlin.jvm.functions.Function2
    public final native Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation);

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Object invokeSuspend(Object obj);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0759q.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getTapTimeout() >> 16)), 1559 - Color.red(0), 24 - ExpandableListView.getPackedPositionType(0L), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1081133583, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1081133583};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - Color.alpha(0)), View.getDefaultSize(0, 0) + 3111, (ViewConfiguration.getTapTimeout() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 517 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 77), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt();
                int i6 = i3 + 1470212582 + (((~((~iNextInt) | (-1277542473))) | 136364104) * 446) + (((~(iNextInt | (-1141178369))) | 291124882) * 446) + 688848240;
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
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i12 = ~iElapsedRealtime;
                int i13 = i9 + (((~((-1403927505) | i12)) | (~((-301103955) | iElapsedRealtime)) | (~(i12 | 301103954))) * 959) + 1457818161 + (((~(iElapsedRealtime | 301103954)) | (~(i12 | (-301103955))) | (~((-1403927505) | iElapsedRealtime))) * 959);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0759q.class, new Object[0]);
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
                int i18 = -(1867414248 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * (-1400280838));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = (i21 & (-1893882655)) + ((-1893882655) | i21);
                int i23 = ((i22 >> 15) - 262143) / 131072;
                int i24 = ((i22 >> 27) - 63) / 32;
                int i25 = (-(((i22 - (~((i23 ^ 1) + ((i23 & 1) << 1)))) - 1) ^ ((i24 ^ 1) + ((i24 & 1) << 1)))) + 7;
                int i26 = i25 >> 19;
                int i27 = ((i26 & (-16383)) + (i26 | (-16383))) / 8192;
                int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                Loader.l((2086538090 / ((i25 & (-((i28 ^ 1) + ((i28 & 1) << 1)))) * 2)) + 236165171);
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
