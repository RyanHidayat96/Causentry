package id.vida.liveness.services;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import id.vida.liveness.dto.ValidateResponseDTO;
import id.vida.liveness.listeners.TokenListener;
import id.vida.liveness.r1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements TokenListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f1169a;
    public final /* synthetic */ BackendLiveness b;

    private static native Object[] $liveness$B0cf8064f(BackendLiveness backendLiveness, r1 r1Var);

    private static native void $liveness$E0cf8064f(Object obj, Object obj2);

    public b(BackendLiveness backendLiveness, r1 r1Var) {
        this.b = backendLiveness;
        this.f1169a = r1Var;
        $liveness$E0cf8064f(this, $liveness$B0cf8064f(backendLiveness, r1Var));
    }

    @Override // id.vida.liveness.listeners.TokenListener
    public final native void onError(int i, String str);

    @Override // id.vida.liveness.listeners.TokenListener
    public final native void onSuccess(ValidateResponseDTO validateResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = b.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 3414), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1558, 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -2066407570, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -2066407570};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3112 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 21 - ImageFormat.getBitsPerPixel(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), 518 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = i3 + (-1415391094) + (((~(966839475 | iElapsedRealtime)) | 39789132) * (-140)) + ((~(1006628607 | iElapsedRealtime)) * 70) + (((~(iElapsedRealtime | 738191983)) | 308225756) * 70);
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
                int iNextInt = new Random().nextInt();
                int i12 = i9 + 226187106 + (((~(1568680673 | iNextInt)) | 2130944) * (-140)) + ((~(1570811617 | iNextInt)) * 70) + (((~(iNextInt | 136350785)) | 1436591776) * 70);
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(b.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i15 = ((int[]) objArr[0])[0];
                int i16 = i15 * i15;
                int i17 = -(1645865845 * i15);
                int i18 = ((((i16 | i17) << 1) - (i16 ^ i17)) - (~(-(i15 * (-1838185195))))) - 1;
                int i19 = (i18 & 759906969) + (759906969 | i18);
                int i20 = (((i19 >> 20) - 8191) / 4096) + 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = i19 >> 24;
                int i23 = -(i21 ^ ((((i22 ^ (-511)) + ((i22 & (-511)) << 1)) / 256) + 1));
                int i24 = (i23 ^ 6) + ((i23 & 6) << 1);
                int i25 = i24 >> 26;
                int i26 = ((i25 ^ ComposerKt.defaultsKey) + ((i25 & ComposerKt.defaultsKey) << 1)) / 64;
                int i27 = (i26 & 1) + (i26 | 1);
                Loader.l(((-1940556768) / (((-((i27 ^ 1) + ((i27 & 1) << 1))) & i24) * 2)) - 799463034);
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
