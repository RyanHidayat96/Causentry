package id.vida.liveness;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
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

/* JADX INFO: renamed from: id.vida.liveness.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0719a implements InterfaceC0776y0 {
    public static String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1074a;

    private static native Object[] $liveness$Bfa6ac42e();

    private static native /* synthetic */ void $liveness$COI();

    private static native void $liveness$Efa6ac42e(Object obj, Object obj2);

    public C0719a() {
        $liveness$Efa6ac42e(this, $liveness$Bfa6ac42e());
    }

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0719a.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.keyCodeFromString("") + 1559, 24 - (ViewConfiguration.getTapTimeout() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 918536055, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 918536055};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.indexOf((CharSequence) "", '0')), 3111 - (ViewConfiguration.getWindowTouchSlop() >> 8), 21 - MotionEvent.axisFromString(""), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), Drawable.resolveOpacity(0, 0) + 518, 75 - TextUtils.lastIndexOf("", '0', 0)), Integer.TYPE});
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i6 = ~((-789642651) | iMaxMemory);
                int i7 = ~iMaxMemory;
                int i8 = i3 + (-2103268434) + ((i6 | (~(1067449754 | i7))) * (-406)) + ((~((-152060947) | i7)) * (-406)) + (((~(iMaxMemory | (-915388809))) | (~(789642650 | i7))) * 406);
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
                int[] iArr2 = {i13};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i14 = ~iElapsedRealtime;
                int i15 = 1621982604 + (((~(847973031 | i14)) | 18130008) * (-1188));
                int i16 = (~(iElapsedRealtime | (-847973032))) | 18130008;
                int i17 = ~(857058427 | i14);
                int i18 = i11 + i15 + ((i16 | i17) * 594) + (((~((-847973032) | i14)) | 9044612 | i17) * 594);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
                objArr = new Object[]{new int[1], iArr2, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0719a.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i21 = ((int[]) objArr[0])[0];
                int i22 = i21 * i21;
                int i23 = -(899620821 * i21);
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                int i25 = -(i21 * 579864979);
                int i26 = ((i24 ^ i25) + ((i25 & i24) << 1)) - 289890672;
                int i27 = i26 >> 23;
                int i28 = ((i27 & (-1023)) + (i27 | (-1023))) / 512;
                int i29 = (i26 - (~((i28 & 1) + (i28 | 1)))) - 1;
                int i30 = i26 >> 25;
                int i31 = (-(i29 ^ ((((i30 & (-255)) + (i30 | (-255))) / 128) + 1))) + 4;
                int i32 = i31 >> 25;
                int i33 = ((i32 ^ (-255)) + ((i32 & (-255)) << 1)) / 128;
                int i34 = (i33 & 1) + (i33 | 1);
                Loader.l((1259031864 / ((i31 & (-(((i34 | 1) << 1) - (i34 ^ 1)))) * 2)) + 1029749908);
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
