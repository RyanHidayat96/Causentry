package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public abstract class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap f1054a;
    public static String[] b;
    public static String[] c;
    public static String[] knownDangerousAppsPackages;
    public static String[] knownRootCloakingPackages;

    private static native /* synthetic */ void $liveness$COI();

    public static native String a(String str);

    public static native ArrayList a(ArrayList arrayList, Context context);

    public static native Map<String, String> getRootInfo(Context context);

    public static native boolean isDeviceRooted(Context context);

    static {
        Object[] objArr;
        ClassLoader classLoader = S0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.getMode(0) + 1559, 24 - TextUtils.indexOf("", ""), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1193662133, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1193662133};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041), 3111 - ((Process.getThreadPriority(0) + 20) >> 6), 22 - TextUtils.getOffsetAfter("", 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getPressedStateDuration() >> 16), 566 - AndroidCharacter.getMirror('0'), 76 - TextUtils.indexOf("", "")), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) Runtime.getRuntime().freeMemory());
                int i7 = i3 + 1511855794 + (((~(i6 | (-1344151579))) | (~((-92276929) | i6))) * (-184)) + ((134301476 | (~((-226578405) | i6)) | (~((-1478453055) | i6))) * 184) + 1251507856;
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i13 = i10 + (((~((-1567289085) | iMaxMemory)) | 1432299226) * 398) + 1322041682 + (((~((~iMaxMemory) | (-1567289085))) | 1432299226) * 398);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(S0.class, new Object[0]);
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
                int i18 = -(342941102 * i16);
                int i19 = ((((i17 | i18) << 1) - (i17 ^ i18)) - (~(-(i16 * 773682110)))) - 2022874781;
                int i20 = i19 >> 27;
                int i21 = (((i20 | (-63)) << 1) - (i20 ^ (-63))) / 32;
                int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
                int i23 = ((i19 | i22) << 1) - (i22 ^ i19);
                int i24 = i19 >> 17;
                int i25 = ((i24 & (-65535)) + (i24 | (-65535))) / 32768;
                int i26 = -(i23 ^ ((i25 & 1) + (i25 | 1)));
                int i27 = (i26 ^ 7) + ((i26 & 7) << 1);
                int i28 = i27 >> 17;
                int i29 = ((i28 ^ (-65535)) + ((i28 & (-65535)) << 1)) / 32768;
                int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
                Loader.l(((-2089124128) / (((-((i30 ^ 1) + ((i30 & 1) << 1))) & i27) * 2)) - 272460704);
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
