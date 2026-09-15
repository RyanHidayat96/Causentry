package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ int[] f1049a;

    private static native /* synthetic */ void $liveness$COI();

    static {
        Object[] objArr;
        ClassLoader classLoader = Q0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3414), TextUtils.lastIndexOf("", '0', 0, 0) + 1560, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1684154423, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1684154423};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43042), Gravity.getAbsoluteGravity(0, 0) + 3111, ((byte) KeyEvent.getModifierMetaStateMask()) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 518 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyUid = Process.myUid();
                int i6 = i3 + (-2117610514) + (((~(971855328 | iMyUid)) | 34742274) * (-140)) + ((~(1006597602 | iMyUid)) * 70) + (((~(iMyUid | 733176130)) | 308163746) * 70);
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
                int[] iArr2 = {i11};
                int iMyUid2 = Process.myUid();
                int i12 = ~((-756156876) | iMyUid2);
                int i13 = ~iMyUid2;
                int i14 = i12 | (~(948874583 | i13));
                int i15 = ~(756156875 | i13);
                int i16 = i9 + 1046941938 + ((i14 | i15) * (-516)) + (((~(iMyUid2 | (-671222084))) | (~((-277652501) | i13))) * 516) + ((277652500 | i15) * 516);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Q0.class, new Object[0]);
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
                int i20 = i19 * i19;
                int i21 = -(1119763149 * i19);
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                int i23 = -(i19 * 1256498501);
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i25 = (i24 ^ 196730961) + ((196730961 & i24) << 1);
                int i26 = i25 >> 19;
                int i27 = (((i26 | (-16383)) << 1) - (i26 ^ (-16383))) / 8192;
                int i28 = ((i27 | 1) << 1) - (i27 ^ 1);
                int i29 = ((i25 | i28) << 1) - (i28 ^ i25);
                int i30 = i25 >> 20;
                int i31 = (((i30 | (-8191)) << 1) - (i30 ^ (-8191))) / 4096;
                int i32 = (-(((i31 & 1) + (i31 | 1)) ^ i29)) + 4;
                int i33 = i32 >> 20;
                int i34 = ((i33 & (-8191)) + (i33 | (-8191))) / 4096;
                int i35 = (i34 & 1) + (i34 | 1);
                Loader.l((1346647848 / ((i32 & (-((i35 & 1) + (i35 | 1)))) * 2)) + 15548125);
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
