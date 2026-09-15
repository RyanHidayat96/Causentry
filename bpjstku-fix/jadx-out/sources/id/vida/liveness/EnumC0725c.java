package id.vida.liveness;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: id.vida.liveness.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC0725c {
    public static EnumC0725c GENERIC_KEY;
    public static EnumC0725c SIGNING_KEY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ EnumC0725c[] f1080a;

    private static native /* synthetic */ void $liveness$COI();

    public EnumC0725c(String str, int i) {
        super(str, i);
    }

    public static native EnumC0725c valueOf(String str);

    public static native EnumC0725c[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = EnumC0725c.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, 1877686816, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3413 - TextUtils.lastIndexOf("", '0', 0, 0)), 1559 - TextUtils.getOffsetAfter("", 0), Gravity.getAbsoluteGravity(0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), 1877686816};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042), (Process.myTid() >> 22) + 3111, 21 - ImageFormat.getBitsPerPixel(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 518, 76 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i6 = ~startElapsedRealtime;
                int i7 = i3 + (((1206478406 + (((~((-1248117795) | i6)) | (~((-456913665) | startElapsedRealtime))) * (-370))) + ((((~(startElapsedRealtime | (-1248117795))) | (~(i6 | (-456913665)))) | (-1535112995)) * (-370))) - 1056125078);
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
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i13 = ~((-1121600727) | iElapsedRealtime);
                int i14 = ~iElapsedRealtime;
                int i15 = i13 | (~(583430732 | i14));
                int i16 = ~(1121600726 | i14);
                int i17 = i10 + 227874122 + ((i15 | i16) * (-516)) + (((~(iElapsedRealtime | (-46284869))) | (~((-537145865) | i14))) * 516) + ((537145864 | i16) * 516);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(EnumC0725c.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = i20 * i20;
                int i22 = -(1477078570 * i20);
                int i23 = (((i21 ^ i22) + ((i21 & i22) << 1)) - (~(-(i20 * 941908798)))) - 1;
                int i24 = (i23 ^ 992657040) + ((992657040 & i23) << 1);
                int i25 = i24 >> 15;
                int i26 = (((i25 | (-262143)) << 1) - (i25 ^ (-262143))) / 131072;
                int i27 = (i24 - (~((i26 & 1) + (i26 | 1)))) - 1;
                int i28 = i24 >> 20;
                int i29 = (((i28 | (-8191)) << 1) - (i28 ^ (-8191))) / 4096;
                int i30 = (-(i27 ^ ((i29 ^ 1) + ((i29 & 1) << 1)))) + 1;
                int i31 = i30 >> 23;
                int i32 = ((i31 ^ (-1023)) + ((i31 & (-1023)) << 1)) / 512;
                Loader.l((1093676808 / ((i30 & (-((((i32 | 1) << 1) - (i32 ^ 1)) + 1))) * 7)) + 665219796);
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
