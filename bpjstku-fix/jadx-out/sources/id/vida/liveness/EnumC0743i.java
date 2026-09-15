package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: id.vida.liveness.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC0743i {
    public static EnumC0743i DENIED;
    public static EnumC0743i GRANTED;
    public static EnumC0743i REQUESTED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ EnumC0743i[] f1132a;

    private static native /* synthetic */ void $liveness$COI();

    public EnumC0743i(String str, int i) {
        super(str, i);
    }

    public static native EnumC0743i valueOf(String str);

    public static native EnumC0743i[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = EnumC0743i.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -1733428723, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3462 - AndroidCharacter.getMirror('0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1559, 23 - TextUtils.lastIndexOf("", '0', 0), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -1733428723};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (43042 - View.getDefaultSize(0, 0)), (Process.myTid() >> 22) + 3111, 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 517 - TextUtils.lastIndexOf("", '0', 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 76), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyUid = Process.myUid();
                int i6 = ~iMyUid;
                int i7 = i3 + ((((~((-1343750273) | i6)) | (~(1568435666 | iMyUid))) * 988) - 1456753994) + (((~(iMyUid | (-1480346065))) | 136595792 | (~(i6 | 1568435666))) * 988);
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
                int[] iArr = {i12};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i13 = (-1260329212) + (((~((~startUptimeMillis) | (-1503856927))) | 1342308634) * (-245));
                int i14 = ~(startUptimeMillis | (-1503856927));
                int i15 = i10 + i13 + (i14 * (-245)) + ((i14 | 201174532) * 245);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(EnumC0743i.class, new Object[0]);
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
                int i19 = ((i18 * i18) - (~(-(206034186 * i18)))) - 1;
                int i20 = -(i18 * 1686800552);
                int i21 = (((i19 | i20) << 1) - (i20 ^ i19)) - (-1721021425);
                int i22 = i21 >> 25;
                int i23 = ((i22 & (-255)) + (i22 | (-255))) / 128;
                int i24 = (i23 & 1) + (i23 | 1);
                int i25 = (i21 & i24) + (i24 | i21);
                int i26 = ((i21 >> 20) - 8191) / 4096;
                int i27 = -(i25 ^ ((i26 ^ 1) + ((i26 & 1) << 1)));
                int i28 = (i27 & 3) + (i27 | 3);
                int i29 = i28 >> 16;
                int i30 = ((i29 ^ (-131071)) + ((i29 & (-131071)) << 1)) / 65536;
                int i31 = ((i30 | 1) << 1) - (i30 ^ 1);
                Loader.l(((-964915746) / (((-(((i31 | 1) << 1) - (i31 ^ 1))) & i28) * 2)) - 1553646571);
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
