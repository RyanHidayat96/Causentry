package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.view.OnBackPressedCallback;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public final class L extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f1038a;

    private static native Object[] $liveness$B4c4a421a(M m);

    private static native void $liveness$E4c4a421a(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public L(M m) {
        this.f1038a = m;
        Object[] objArr$liveness$B4c4a421a = $liveness$B4c4a421a(m);
        super(((Value) objArr$liveness$B4c4a421a[1]).i);
        $liveness$E4c4a421a(this, objArr$liveness$B4c4a421a);
    }

    @Override // androidx.view.OnBackPressedCallback
    public final native void handleOnBackPressed();

    static {
        Object[] objArr;
        ClassLoader classLoader = L.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3414), (KeyEvent.getMaxKeyCode() >> 16) + 1559, 24 - (ViewConfiguration.getTouchSlop() >> 8), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1850288179, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1850288179};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.getDeadChar(0, 0) + 3111, 22 - Drawable.resolveOpacity(0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), 518 - Drawable.resolveOpacity(0, 0), Color.green(0) + 76), Integer.TYPE});
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
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = ~((-546741334) | iFreeMemory);
                int i7 = ~iFreeMemory;
                int i8 = i3 + (-1379262622) + ((i6 | (~(1158290125 | i7))) * (-1808)) + (((~((-137286) | iFreeMemory)) | (~(i7 | 1704894173))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iFreeMemory | (-1158290126))) | 546604048 | (~(546741333 | i7))) * TypedValues.Custom.TYPE_BOOLEAN);
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
                int iNextInt = new Random().nextInt();
                int i14 = i11 + 2048583942 + (((~(iNextInt | 902221801)) | (-1071640570)) * 305) + (((~((~iNextInt) | 902221801)) | (-802809658)) * 305);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(L.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i17 = ((int[]) objArr[0])[0];
                int i18 = i17 * i17;
                int i19 = -(1376207695 * i17);
                int i20 = (i18 & i19) + (i18 | i19);
                int i21 = -(i17 * (-884949087));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = ((i22 | 29501504) << 1) - (29501504 ^ i22);
                int i24 = i23 >> 23;
                int i25 = ((i24 & (-1023)) + (i24 | (-1023))) / 512;
                int i26 = (i25 ^ 1) + ((i25 & 1) << 1);
                int i27 = (i23 & i26) + (i26 | i23);
                int i28 = i23 >> 16;
                int i29 = -(i27 ^ ((((i28 ^ (-131071)) + ((i28 & (-131071)) << 1)) / 65536) + 1));
                int i30 = (i29 ^ 6) + ((i29 & 6) << 1);
                int i31 = i30 >> 25;
                int i32 = ((i31 ^ (-255)) + ((i31 & (-255)) << 1)) / 128;
                int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
                Loader.l(2136477180 / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 2));
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
