package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC0746j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ int[] f1136a;

    private static native /* synthetic */ void $liveness$COI();

    static {
        Object[] objArr;
        ClassLoader classLoader = AbstractC0746j0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3415), TextUtils.lastIndexOf("", '0', 0) + 1560, 24 - KeyEvent.keyCodeFromString(""), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1729389908, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1729389908};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getTapTimeout() >> 16)), 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 518, 75 - Process.getGidForName("")), Integer.TYPE});
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
                int i6 = i3 + 1359578810 + (((~(iElapsedRealtime | 944477492)) | (-760553967)) * (-668)) + ((944477492 | (~((-760553967) | iElapsedRealtime))) * 1336) + ((iElapsedRealtime | (-85205195)) * 668);
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
                int[] iArr = {i10};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i12 = ~iMaxMemory;
                int i13 = (~((-1437218659) | i12)) | 94517056;
                int i14 = ~(iMaxMemory | 1610514402);
                int i15 = i9 + (((i13 | i14) * (-252)) - 246474206) + ((i14 | (~(i12 | (-1342701603)))) * 252);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0746j0.class, new Object[0]);
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
                int i20 = -(1248886618 * i18);
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                int i22 = -(i18 * 941878576);
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = (i23 ^ 1969565337) + ((1969565337 & i23) << 1);
                int i25 = (i24 - (~((((i24 >> 25) - 255) / 128) + 1))) - 1;
                int i26 = i24 >> 18;
                int i27 = ((i26 & (-32767)) + (i26 | (-32767))) / 16384;
                int i28 = -(i25 ^ (((i27 | 1) << 1) - (i27 ^ 1)));
                int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                int i30 = i29 >> 15;
                int i31 = (((i30 | (-262143)) << 1) - (i30 ^ (-262143))) / 131072;
                int i32 = (i31 & 1) + (i31 | 1);
                Loader.l(((-1186437084) / (((-((i32 ^ 1) + ((i32 & 1) << 1))) & i29) * 7)) - 198800142);
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
