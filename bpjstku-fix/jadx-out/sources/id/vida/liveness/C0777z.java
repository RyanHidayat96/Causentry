package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0777z implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1197a;
    public h1 b;
    public h1 c;
    public h1 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h1 f1198e;
    public h1 f;
    public BatteryManager g;
    public HandlerThread h;
    public Handler i;
    public int j;
    public long k;
    public String l;

    private static native Object[] $liveness$Bfbcb0fc7();

    private static /* synthetic */ Runnable $liveness$Ca309e1f7(C0777z c0777z) {
        return new z$$ExternalSyntheticLambda0(c0777z);
    }

    private static /* synthetic */ Runnable $liveness$Ca317f978(C0777z c0777z) {
        return new z$$ExternalSyntheticLambda0(c0777z);
    }

    private static native void $liveness$Efbcb0fc7(Object obj, Object obj2);

    public C0777z() {
        $liveness$Efbcb0fc7(this, $liveness$Bfbcb0fc7());
    }

    public final native void a();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0777z.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - TextUtils.indexOf((CharSequence) "", '0')), Gravity.getAbsoluteGravity(0, 0) + 1559, 24 - (Process.myTid() >> 22), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1605984739, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1605984739};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042), 3111 - View.MeasureSpec.makeMeasureSpec(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 518, 76 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((~Process.myPid()) | 904633101);
                int i7 = i3 + ((273318664 | i6) * (-374)) + 958598532 + ((i6 | 631314437) * 374);
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
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i13 = 1570683550 + ((elapsedCpuTime | 765272904) * (-50));
                int i14 = ~((-671155017) | elapsedCpuTime);
                int i15 = ~elapsedCpuTime;
                int i16 = i10 + i13 + ((i14 | (~((-268603539) | i15))) * 50) + (((~(i15 | 765272904)) | (~((-939758555) | i15)) | 268603538) * 50);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0777z.class, new Object[0]);
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
                int i20 = i19 * i19;
                int i21 = -(1880477666 * i19);
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                int i23 = -(i19 * 1673873430);
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                int i25 = ((i24 | 891527184) << 1) - (891527184 ^ i24);
                int i26 = i25 >> 20;
                int i27 = (i25 - (~(((((i26 | (-8191)) << 1) - (i26 ^ (-8191))) / 4096) + 1))) - 1;
                int i28 = i25 >> 22;
                int i29 = ((i28 & (-2047)) + (i28 | (-2047))) / 1024;
                int i30 = (-(i27 ^ ((i29 & 1) + (i29 | 1)))) + 4;
                int i31 = i30 >> 26;
                int i32 = (((i31 ^ ComposerKt.defaultsKey) + ((i31 & ComposerKt.defaultsKey) << 1)) / 64) + 1;
                Loader.l(((-1392557512) / ((i30 & (-(((i32 | 1) << 1) - (i32 ^ 1)))) * 2)) - 798350174);
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
