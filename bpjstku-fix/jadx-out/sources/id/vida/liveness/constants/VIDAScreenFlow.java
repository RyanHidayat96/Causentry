package id.vida.liveness.constants;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class VIDAScreenFlow {
    public static VIDAScreenFlow CONSENT;
    public static VIDAScreenFlow REVIEW;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ VIDAScreenFlow[] f1087a;

    private static native /* synthetic */ void $liveness$COI();

    public VIDAScreenFlow(String str, int i) {
        super(str, i);
    }

    public static native VIDAScreenFlow valueOf(String str);

    public static native VIDAScreenFlow[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = VIDAScreenFlow.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, 1121848170, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3415 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1560, (ViewConfiguration.getPressedStateDuration() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), 1121848170};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (43090 - AndroidCharacter.getMirror('0')), 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 518 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 76), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i4};
                int iMyUid = Process.myUid();
                int i6 = ~iMyUid;
                int i7 = (~((-476372131) | i6)) | 136370304;
                int i8 = ~(iMyUid | 1568661154);
                int i9 = i3 + 1443447330 + ((i7 | i8) * (-502)) + ((i8 | (~(i6 | (-340001827)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
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
                int i12 = ((int[]) objArr4[0])[0];
                int i13 = ((int[]) objArr4[2])[0];
                int i14 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i15 = i12 + 2048583942 + (((~(startElapsedRealtime | 738730921)) | (-1033417722)) * 305) + (((~((~startElapsedRealtime) | 738730921)) | (-966300538)) * 305);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VIDAScreenFlow.class, new Object[0]);
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
                int i20 = -(159206101 * i18);
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                int i22 = -(i18 * 1423024035);
                int i23 = ((i21 ^ i22) + ((i22 & i21) << 1)) - 168303088;
                int i24 = (((i23 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                int i26 = ((i23 >> 18) - 32767) / 16384;
                int i27 = -(i25 ^ ((i26 & 1) + (i26 | 1)));
                int i28 = ((i27 | 2) << 1) - (i27 ^ 2);
                int i29 = ((i28 >> 25) - 255) / 128;
                int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
                Loader.l((928106754 / (((-(((i30 | 1) << 1) - (i30 ^ 1))) & i28) * 3)) + 848334209);
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
