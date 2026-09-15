package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class y1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1196a;

    private static native Object[] $liveness$B7fddb7be(List list);

    private static native void $liveness$E7fddb7be(Object obj, Object obj2);

    public y1(List<z1> list) {
        $liveness$E7fddb7be(this, $liveness$B7fddb7be(list));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final native int getItemCount();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final native void onBindViewHolder(x1 x1Var, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final native x1 onCreateViewHolder(ViewGroup viewGroup, int i);

    static {
        Object[] objArr;
        ClassLoader classLoader = y1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - MotionEvent.axisFromString("")), 1559 - Color.red(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 999420384, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 999420384};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 43042), TextUtils.getTrimmedLength("") + 3111, 22 - View.MeasureSpec.getMode(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getTrimmedLength("") + 518, TextUtils.indexOf("", "", 0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i6 = (~((-1516408587) | iMaxMemory)) | 170002440;
                int i7 = ~iMaxMemory;
                int i8 = i3 + 1724068006 + (((~(i7 | 1535029018)) | i6) * 886) + (((~(1516408586 | i7)) | 188622872) * (-1772)) + ((~(i7 | 188622872)) * 886);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
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
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i14 = i11 + (-2076339366) + (((~(1073741822 | iUptimeMillis)) | 631289636) * (-756)) + (((~iUptimeMillis) | 1073741822) * 756);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(y1.class, new Object[0]);
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
                int i19 = -(1451404399 * i17);
                int i20 = (i18 & i19) + (i18 | i19);
                int i21 = -(i17 * 322738203);
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = (i22 ^ 588342937) + ((588342937 & i22) << 1);
                int i24 = i23 >> 25;
                int i25 = (((i24 & (-255)) + (i24 | (-255))) / 128) + 1;
                int i26 = -((((i23 | i25) << 1) - (i25 ^ i23)) ^ ((((i23 >> 27) - 63) / 32) + 1));
                int i27 = (i26 & 4) + (i26 | 4);
                int i28 = i27 >> 20;
                int i29 = ((i28 & (-8191)) + (i28 | (-8191))) / 4096;
                int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
                Loader.l((1400557888 / (((-((i30 ^ 1) + ((i30 & 1) << 1))) & i27) * 2)) + 729236748);
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
