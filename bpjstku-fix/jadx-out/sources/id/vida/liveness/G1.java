package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class G1 {
    public static G1 LARGE;
    public static G1 MEDIUM;
    public static G1 SMALL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ G1[] f1029a;

    private static native /* synthetic */ void $liveness$COI();

    public G1(String str, int i) {
        super(str, i);
    }

    public static native G1 valueOf(String str);

    public static native G1[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = G1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -1715874709, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3414 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1559, 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -1715874709};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 43042), ((Process.getThreadPriority(0) + 20) >> 6) + 3111, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 518 - (ViewConfiguration.getFadingEdgeLength() >> 16), 75 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt();
                int i6 = ~iNextInt;
                int i7 = i3 + 156758148 + (((~((-1125511073) | i6)) | (~(1671425954 | iNextInt))) * (-831)) + ((~((-1091905569) | iNextInt)) * (-1662)) + (((~(iNextInt | 1125511072)) | (~(i6 | (-579520387))) | (~(579520386 | iNextInt))) * 831);
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i13 = i10 + (-350864876) + (((~((-671238437) | iUptimeMillis)) | (~(1033793022 | iUptimeMillis))) * 69) + (((~(iUptimeMillis | 680675820)) | (~((-1024355639) | iUptimeMillis)) | 353117202) * (-69)) + 651179496;
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(G1.class, new Object[0]);
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
                int i18 = -(1746393667 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * 1555605315);
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = (i21 ^ (-86895479)) + (((-86895479) & i21) << 1);
                int i23 = i22 >> 23;
                int i24 = (i23 - 1023) / 512;
                int i25 = (i22 - (~((i24 ^ 1) + ((i24 & 1) << 1)))) - 1;
                int i26 = (((i23 | (-1023)) << 1) - (i23 ^ (-1023))) / 512;
                int i27 = -((((i26 | 1) << 1) - (i26 ^ 1)) ^ i25);
                int i28 = ((i27 | 3) << 1) - (i27 ^ 3);
                int i29 = i28 >> 20;
                int i30 = (((i29 | (-8191)) << 1) - (i29 ^ (-8191))) / 4096;
                int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
                Loader.l((1439978175 / (((-((i31 ^ 1) + ((i31 & 1) << 1))) & i28) * 3)) + 575017177);
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
