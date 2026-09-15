package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.view.OnBackPressedCallback;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public final class D extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f1017a;

    private static native Object[] $liveness$B4bd98577(H h);

    private static native void $liveness$E4bd98577(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public D(H h) {
        this.f1017a = h;
        Object[] objArr$liveness$B4bd98577 = $liveness$B4bd98577(h);
        super(((Value) objArr$liveness$B4bd98577[1]).i);
        $liveness$E4bd98577(this, objArr$liveness$B4bd98577);
    }

    @Override // androidx.view.OnBackPressedCallback
    public final native void handleOnBackPressed();

    static {
        Object[] objArr;
        ClassLoader classLoader = D.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - View.MeasureSpec.makeMeasureSpec(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1558, Color.alpha(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 520162820, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 520162820};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getCapsMode("", 0, 0) + 3111, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 519, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 77), Integer.TYPE});
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
                int iMyUid = Process.myUid();
                int i6 = ~iMyUid;
                int i7 = i3 + 861645454 + ((iMyUid | 1909460) * 988) + (((~(297657079 | i6)) | 1111626760) * (-1976)) + (((~(iMyUid | (-1407374380))) | 1909460 | (~(1407374379 | i6))) * 988);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
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
                int i10 = ((int[]) objArr4[0])[0];
                int i11 = ((int[]) objArr4[2])[0];
                int i12 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i11};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i13 = (~((-1599844433) | iFreeMemory)) | 104923216;
                int i14 = ~((~iFreeMemory) | 1600108242);
                int i15 = i10 + (-520664574) + ((i13 | i14) * (-470)) + (((~(iFreeMemory | (-1494921217))) | i14) * 470);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(D.class, new Object[0]);
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
                int i20 = -(1589013957 * i18);
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                int i22 = -(i18 * 2113389717);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = (i23 & (-888155671)) + ((-888155671) | i23);
                int i25 = i24 >> 29;
                int i26 = (i24 - (~(((((i25 | (-15)) << 1) - (i25 ^ (-15))) / 8) + 1))) - 1;
                int i27 = i24 >> 25;
                int i28 = ((i27 ^ (-255)) + ((i27 & (-255)) << 1)) / 128;
                int i29 = -(i26 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
                int i30 = (i29 & 1) + (i29 | 1);
                int i31 = i30 >> 15;
                int i32 = ((i31 & (-262143)) + (i31 | (-262143))) / 131072;
                int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
                Loader.l(((-977936748) / (((-(((i33 | 1) << 1) - (i33 ^ 1))) & i30) * 6)) - 1321076597);
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
