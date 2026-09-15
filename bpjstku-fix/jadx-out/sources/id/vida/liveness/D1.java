package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1 f1018a;
    public final C0768u0 b;

    private static native Object[] $liveness$Bdaa46353(G1 g1, C0768u0 c0768u0);

    private static native void $liveness$Edaa46353(Object obj, Object obj2);

    public D1(G1 g1, C0768u0 c0768u0) {
        $liveness$Edaa46353(this, $liveness$Bdaa46353(g1, c0768u0));
    }

    public final native C0768u0 getActiveImageDetails();

    public final native G1 getGestures();

    static {
        Object[] objArr;
        ClassLoader classLoader = D1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3415 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.argb(0, 0, 0, 0) + 1559, 24 - View.getDefaultSize(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -480732027, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -480732027};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 43043), View.resolveSize(0, 0) + 3111, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.getDefaultSize(0, 0) + 518, 76 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Integer.TYPE});
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
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = (~((-1214685574) | startUptimeMillis)) | 136446341;
                int i7 = ~((~startUptimeMillis) | 1568585117);
                int i8 = i3 + 1410302288 + ((i6 | i7) * (-470)) + (((~(startUptimeMillis | (-1078239233))) | i7) * 470);
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
                int[] iArr2 = {i12};
                int iMyUid = Process.myUid();
                int i14 = ~iMyUid;
                int i15 = (~((-1212045091) | i14)) | 1075582754 | (~(492986368 | i14));
                int i16 = i11 + 747915134 + (((~(iMyUid | (-356524033))) | i15) * 590) + (i15 * (-1180)) + (((~((-492986369) | i14)) | (~(i14 | 1212045090))) * 590);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(D1.class, new Object[0]);
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
                int i20 = ((i19 * i19) - (~(-(670267621 * i19)))) - 1;
                int i21 = -(i19 * (-461497281));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                int i23 = (i22 ^ 405453636) + ((405453636 & i22) << 1);
                int i24 = i23 >> 24;
                int i25 = ((i24 ^ (-511)) + ((i24 & (-511)) << 1)) / 256;
                int i26 = -(((i23 - (~((i25 ^ 1) + ((i25 & 1) << 1)))) - 1) ^ ((((i23 >> 21) - 4095) / 2048) + 1));
                int i27 = ((i26 | 5) << 1) - (i26 ^ 5);
                int i28 = i27 >> 29;
                int i29 = (((i28 & (-15)) + (i28 | (-15))) / 8) + 1;
                Loader.l((1774336410 / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i27) * 2)) + 536229303);
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
