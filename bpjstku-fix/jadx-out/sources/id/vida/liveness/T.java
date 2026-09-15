package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes7.dex */
public final class T {
    public static T b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1055a;

    private static native Object[] $liveness$Bf9b392a1();

    private static native void $liveness$Ef9b392a1(Object obj, Object obj2);

    public T() {
        $liveness$Ef9b392a1(this, $liveness$Bf9b392a1());
    }

    public static native void a(Context context);

    public static native T getInstance();

    public final native long getAppStartupTime();

    public final native void preloadMLKitFaceModel(Context context);

    static {
        Object[] objArr;
        ClassLoader classLoader = T.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (Process.myTid() >> 22)), 1559 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1481554922, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1481554922};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3111, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 519 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 76 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Integer.TYPE});
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
                int iMyTid = Process.myTid();
                int i6 = ~((-712522548) | iMyTid);
                int i7 = ~iMyTid;
                int i8 = i3 + 2000428866 + ((i6 | (~(992508911 | i7))) * (-1808)) + (((~((-707279652) | iMyTid)) | (~(i7 | 997751807))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyTid | (-992508912))) | 5242896 | (~(712522547 | i7))) * TypedValues.Custom.TYPE_BOOLEAN);
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
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i14 = ~elapsedCpuTime;
                int i15 = i11 + (-1641410398) + ((402657496 | i14) * (-192)) + (((~((-668509734) | i14)) | 633864229) * (-384)) + (((~(elapsedCpuTime | 1071167229)) | (~(i14 | (-34645505))) | (~((-633864230) | elapsedCpuTime))) * DerHeader.TAG_CLASS_PRIVATE);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(T.class, new Object[0]);
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
                int i19 = ((i18 * i18) - (~(-(507946706 * i18)))) - 1;
                int i20 = -(i18 * (-1939133214));
                int i21 = ((i19 & i20) + (i20 | i19)) - (-1602129316);
                int i22 = i21 >> 26;
                int i23 = ((i22 ^ ComposerKt.defaultsKey) + ((i22 & ComposerKt.defaultsKey) << 1)) / 64;
                int i24 = (i23 & 1) + (i23 | 1);
                int i25 = (i21 & i24) + (i24 | i21);
                int i26 = i21 >> 21;
                int i27 = -(i25 ^ ((((i26 & (-4095)) + (i26 | (-4095))) / 2048) + 1));
                int i28 = ((i27 | 3) << 1) - (i27 ^ 3);
                int i29 = i28 >> 27;
                int i30 = (((i29 | (-63)) << 1) - (i29 ^ (-63))) / 32;
                Loader.l((1030919082 / (((-(((i30 & 1) + (i30 | 1)) + 1)) & i28) * 2)) + 273569784);
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
