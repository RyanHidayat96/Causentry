package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class m1 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1144a;
    public final ThreadGroup b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ int d;

    private static native Object[] $liveness$B5923b461(Class cls, int i);

    private static native void $liveness$E5923b461(Object obj, Object obj2);

    public m1(Class cls, int i) {
        this.c = cls;
        this.d = i;
        $liveness$E5923b461(this, $liveness$B5923b461(cls, i));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final native Thread newThread(Runnable runnable);

    static {
        Object[] objArr;
        ClassLoader classLoader = m1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 3414), View.resolveSize(0, 0) + 1559, 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -453843935, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -453843935};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042), TextUtils.lastIndexOf("", '0') + 3112, 22 - (ViewConfiguration.getTapTimeout() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Gravity.getAbsoluteGravity(0, 0), 518 - View.resolveSizeAndState(0, 0, 0), TextUtils.getOffsetAfter("", 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i5};
                int iMyTid = Process.myTid();
                int i6 = ~iMyTid;
                int i7 = 1662433194 + (((~(1433627690 | i6)) | 787152) * (-1188));
                int i8 = (~(iMyTid | (-1433627691))) | 787152;
                int i9 = ~(271403768 | i6);
                int i10 = i3 + i7 + ((i8 | i9) * 594) + (((~((-1433627691) | i6)) | 1163011074 | i9) * 594);
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i13 = ((int[]) objArr4[0])[0];
                int i14 = ((int[]) objArr4[2])[0];
                int i15 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i14};
                int iMyPid = Process.myPid();
                int i16 = ~iMyPid;
                int i17 = (~((-79395027) | i16)) | 10565712;
                int i18 = ~(iMyPid | 1694465746);
                int i19 = i13 + (-1580915710) + ((i17 | i18) * (-502)) + ((i18 | (~(i16 | (-68829315)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr[0])[0] = i21 ^ (i21 << 5);
                objArr = new Object[]{new int[1], new int[]{i15}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(m1.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i22 = ((int[]) objArr[0])[0];
                int i23 = i22 * i22;
                int i24 = -(422354639 * i22);
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                int i26 = -(i22 * 68668163);
                int i27 = (i25 & i26) + (i26 | i25);
                int i28 = ((i27 | 2111011857) << 1) - (2111011857 ^ i27);
                int i29 = (((i28 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
                int i30 = -(i29 ^ (((i28 | i29) << 1) - (i28 ^ i29)));
                int i31 = ((i30 | 5) << 1) - (i30 ^ 5);
                int i32 = i31 >> 29;
                int i33 = ((i32 ^ (-15)) + ((i32 & (-15)) << 1)) / 8;
                int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
                Loader.l((1724705960 / (((-((i34 ^ 1) + ((i34 & 1) << 1))) & i31) * 2)) + 751617752);
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
