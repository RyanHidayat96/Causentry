package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: renamed from: id.vida.liveness.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0767u extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1175a;
    public final /* synthetic */ C0769v b;
    public final /* synthetic */ r1 c;
    public final /* synthetic */ C0724b1 d;

    private static native Object[] $liveness$B43c30a2a(C0769v c0769v, r1 r1Var, C0724b1 c0724b1, Continuation continuation);

    private static native void $liveness$E43c30a2a(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public C0767u(C0769v c0769v, r1 r1Var, C0724b1 c0724b1, Continuation continuation) {
        this.b = c0769v;
        this.c = r1Var;
        this.d = c0724b1;
        Object[] objArr$liveness$B43c30a2a = $liveness$B43c30a2a(c0769v, r1Var, c0724b1, continuation);
        super(((Value) objArr$liveness$B43c30a2a[1]).i, (Continuation) objArr$liveness$B43c30a2a[4]);
        $liveness$E43c30a2a(this, objArr$liveness$B43c30a2a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Continuation<Unit> create(Object obj, Continuation<?> continuation);

    @Override // kotlin.jvm.functions.Function2
    public final native Object invoke(CoroutineScope coroutineScope, Continuation<? super SDKConfigResponseDTO> continuation);

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Object invokeSuspend(Object obj);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0767u.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.getDefaultSize(0, 0) + 3414), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1559, View.getDefaultSize(0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1404947383, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1404947383};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 43042), TextUtils.indexOf("", "", 0) + 3111, TextUtils.lastIndexOf("", '0') + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), TextUtils.getOffsetBefore("", 0) + 518, 76 - View.resolveSize(0, 0)), Integer.TYPE});
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i6 = ~startElapsedRealtime;
                int i7 = i3 + (-1371171178) + ((startElapsedRealtime | 135800344) * 988) + ((1380221184 | (~(i6 | 230305309))) * (-1976)) + (((~(startElapsedRealtime | (-1474726150))) | 135800344 | (~(1474726149 | i6))) * 988);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
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
                int i10 = ((int[]) objArr4[0])[0];
                int i11 = ((int[]) objArr4[2])[0];
                int i12 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i11};
                int iMyTid = Process.myTid();
                int i13 = ~iMyTid;
                int i14 = ~(12457268 | i13);
                int i15 = i10 + (-347595662) + ((1681957066 | i14) * (-712)) + (((~(iMyTid | 1694414334)) | (~(i13 | (-1681957067)))) * (-712)) + (((-1692574191) | i14) * 712);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0767u.class, new Object[0]);
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
                int i20 = -(207198370 * i18);
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                int i22 = -(i18 * 587583430);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = ((i23 | 904997520) << 1) - (904997520 ^ i23);
                int i25 = i24 >> 25;
                int i26 = ((i25 & (-255)) + (i25 | (-255))) / 128;
                int i27 = ((i26 | 1) << 1) - (i26 ^ 1);
                int i28 = (i24 ^ i27) + ((i27 & i24) << 1);
                int i29 = i24 >> 23;
                int i30 = ((i29 ^ (-1023)) + ((i29 & (-1023)) << 1)) / 512;
                int i31 = -(((i30 ^ 1) + ((i30 & 1) << 1)) ^ i28);
                int i32 = (i31 & 2) + (i31 | 2);
                int i33 = ((i32 >> 22) - 2047) / 1024;
                int i34 = (i33 & 1) + (i33 | 1);
                Loader.l((1225620816 / (((-((i34 & 1) + (i34 | 1))) & i32) * 4)) + 917421468);
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
