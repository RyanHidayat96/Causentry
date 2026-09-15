package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.listeners.TokenListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class p1 extends AbstractC0775y {
    public static p1 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1155a;
    public long b;

    private static native Object[] $liveness$Bb141fc44(Context context);

    private static native void $liveness$Eb141fc44(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public p1(Context context) {
        Object[] objArr$liveness$Bb141fc44 = $liveness$Bb141fc44(context);
        super((Context) objArr$liveness$Bb141fc44[3]);
        $liveness$Eb141fc44(this, objArr$liveness$Bb141fc44);
    }

    public static native synchronized p1 getInstance(Context context);

    public final native void clearData();

    public final native void setApiKey(String str);

    public final native void setLicenseKey(String str);

    public final native void setRefId(String str);

    public final native void setToken(String str);

    public final native void validate(String str, String str2, String str3, String str4, String str5, String str6, TokenListener tokenListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = p1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Color.green(0)), 1559 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionChild(0L) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1701220904, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1701220904};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43042), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3111, 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), Color.argb(0, 0, 0, 0) + 518, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 75), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i6 = i3 + (-967034562) + (((~elapsedCpuTime) | (-1482622483)) * 1444) + (((~(elapsedCpuTime | 1184947848)) | (~(520083610 | elapsedCpuTime)) | (-1593826971)) * (-1444)) + 1006575300;
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i12 = i9 + 884857042 + ((~((~iUptimeMillis) | (-559843345))) * 433) + (((~((-1109465066) | iUptimeMillis)) | (-595566394)) * (-433)) + (((~(iUptimeMillis | (-595566394))) | (-1669308410)) * 433);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(p1.class, new Object[0]);
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
                int i17 = -(428396318 * i15);
                int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
                int i19 = -(i15 * (-1431636476));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = (i20 ^ 215373345) + ((215373345 & i20) << 1);
                int i22 = i21 >> 23;
                int i23 = ((i22 ^ (-1023)) + ((i22 & (-1023)) << 1)) / 512;
                int i24 = ((i23 | 1) << 1) - (i23 ^ 1);
                int i25 = (i21 ^ i24) + ((i24 & i21) << 1);
                int i26 = ((i21 >> 22) - 2047) / 1024;
                int i27 = -(i25 ^ ((i26 ^ 1) + ((i26 & 1) << 1)));
                int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                int i29 = i28 >> 23;
                int i30 = ((i29 & (-1023)) + (i29 | (-1023))) / 512;
                Loader.l(((-616076636) / (((-(((i30 & 1) + (i30 | 1)) + 1)) & i28) * 4)) - 922638205);
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
