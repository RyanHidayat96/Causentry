package id.vida.liveness;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
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

/* JADX INFO: renamed from: id.vida.liveness.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0765t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1172a;
    public final /* synthetic */ C0769v b;
    public final /* synthetic */ r1 c;
    public final /* synthetic */ C0724b1 d;

    private static native Object[] $liveness$B43b4f2a9(C0769v c0769v, r1 r1Var, C0724b1 c0724b1, Continuation continuation);

    private static native void $liveness$E43b4f2a9(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public C0765t(C0769v c0769v, r1 r1Var, C0724b1 c0724b1, Continuation continuation) {
        this.b = c0769v;
        this.c = r1Var;
        this.d = c0724b1;
        Object[] objArr$liveness$B43b4f2a9 = $liveness$B43b4f2a9(c0769v, r1Var, c0724b1, continuation);
        super(((Value) objArr$liveness$B43b4f2a9[1]).i, (Continuation) objArr$liveness$B43b4f2a9[4]);
        $liveness$E43b4f2a9(this, objArr$liveness$B43b4f2a9);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Continuation<Unit> create(Object obj, Continuation<?> continuation);

    @Override // kotlin.jvm.functions.Function2
    public final native Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation);

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Object invokeSuspend(Object obj);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0765t.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3415 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 1559, 24 - (KeyEvent.getMaxKeyCode() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1171456659, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1171456659};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042), 3111 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.getDefaultSize(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.makeMeasureSpec(0, 0), 517 - ImageFormat.getBitsPerPixel(0), 76 - (ViewConfiguration.getLongPressTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i6 = i3 + (((1470212582 + (((~((~startElapsedRealtime) | (-1449950871))) | 103037060) * 446)) + (((~(startElapsedRealtime | (-1346913811))) | 152043528) * 446)) - 1290111496);
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
                int iMyUid = Process.myUid();
                int i12 = ~iMyUid;
                int i13 = i9 + (-498553052) + ((1671471071 | i12) * (-369)) + (((~((-578819932) | i12)) | 1126211527) * (-369)) + (((~(iMyUid | 578819931)) | 1092651140 | (~(i12 | (-545259545)))) * 369);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0765t.class, new Object[0]);
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
                int i18 = -(1493244670 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * (-553138272));
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = (i21 & 77518433) + (77518433 | i21);
                int i23 = i22 >> 25;
                int i24 = (((i23 ^ (-255)) + ((i23 & (-255)) << 1)) / 128) + 1;
                int i25 = ((i22 | i24) << 1) - (i24 ^ i22);
                int i26 = i22 >> 26;
                int i27 = (((i26 | ComposerKt.defaultsKey) << 1) - (i26 ^ ComposerKt.defaultsKey)) / 64;
                int i28 = -(i25 ^ ((i27 & 1) + (i27 | 1)));
                int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                int i30 = i29 >> 23;
                int i31 = ((i30 & (-1023)) + (i30 | (-1023))) / 512;
                int i32 = (i31 & 1) + (i31 | 1);
                Loader.l(((-520132098) / (((-((i32 & 1) + (i32 | 1))) & i29) * 3)) - 1755342442);
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
