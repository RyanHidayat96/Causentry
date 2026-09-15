package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1200a;
    public final String b;

    private static native Object[] $liveness$Bcc482caf(int i, String str);

    private static native void $liveness$Ecc482caf(Object obj, Object obj2);

    public z1(int i, String str) {
        $liveness$Ecc482caf(this, $liveness$Bcc482caf(i, str));
    }

    public final native String getDescription();

    public final native int getImage();

    static {
        Object[] objArr;
        ClassLoader classLoader = z1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3413), (-16775657) - Color.rgb(0, 0, 0), (Process.myTid() >> 22) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 458906897, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 458906897};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042), TextUtils.getCapsMode("", 0, 0) + 3111, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 518 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 75 - ExpandableListView.getPackedPositionChild(0L)), Integer.TYPE});
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
                int i6 = i3 + (-1908918182) + (((~(1033862878 | iUptimeMillis)) | 671168580) * (-756)) + (((~iUptimeMillis) | 1033862878) * 756);
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i12 = ~iMaxMemory;
                int i13 = i9 + 1824846274 + ((756142497 | i12) * (-757)) + ((~((-277750785) | iMaxMemory)) * 1514) + (((~(iMaxMemory | 1033893281)) | (~(i12 | (-948888962))) | 671138177) * 757);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(z1.class, new Object[0]);
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
                int i18 = -(1509576164 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * 1476398772);
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = ((i21 | (-896047472)) << 1) - ((-896047472) ^ i21);
                int i23 = i22 >> 26;
                int i24 = (((i23 ^ ComposerKt.defaultsKey) + ((i23 & ComposerKt.defaultsKey) << 1)) / 64) + 1;
                int i25 = -(((i22 ^ i24) + ((i24 & i22) << 1)) ^ ((((i22 >> 24) - 511) / 256) + 1));
                int i26 = (i25 ^ 5) + ((i25 & 5) << 1);
                int i27 = i26 >> 22;
                int i28 = ((i27 ^ (-2047)) + ((i27 & (-2047)) << 1)) / 1024;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l((1587103670 / (((-(((i29 | 1) << 1) - (i29 ^ 1))) & i26) * 2)) + 1753032538);
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
