package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class L0 extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatButton f1039a;
    public AppCompatButton b;
    public final String[] c;

    private static native Object[] $liveness$B2b7f30fb();

    private static /* synthetic */ Runnable $liveness$C059280f7(final L0 l0) {
        return new Runnable() { // from class: id.vida.liveness.L0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        };
    }

    private static native void $liveness$E2b7f30fb(Object obj, Object obj2);

    public L0() {
        $liveness$E2b7f30fb(this, $liveness$B2b7f30fb());
    }

    public final native boolean a();

    public final native /* synthetic */ void b();

    public final native void c();

    public final native void d();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.Fragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(View view, Bundle bundle);

    static {
        Object[] objArr;
        ClassLoader classLoader = L0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 3414), View.MeasureSpec.getMode(0) + 1559, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 646233237, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 646233237};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (ViewConfiguration.getEdgeSlop() >> 16)), Process.getGidForName("") + 3112, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 517 - TextUtils.lastIndexOf("", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + 76), Integer.TYPE});
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
                int iMyUid = Process.myUid();
                int i6 = (-1688707866) + (((~((~iMyUid) | (-836824492))) | 4203656) * (-245));
                int i7 = ~(iMyUid | (-836824492));
                int i8 = i3 + i6 + (i7 * (-245)) + ((i7 | 868206967) * 245);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
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
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i14 = i11 + ((((-1140544862) + (((~((-1394150063) | iFreeMemory)) | 302057508) * 576)) + (((~((~iFreeMemory) | (-1092092555))) | 8823888) * 576)) - 2108534528);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(L0.class, new Object[0]);
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
                int i19 = -(1031074099 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * 1326188065);
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                int i23 = (i22 & 146590948) + (146590948 | i22);
                int i24 = i23 >> 22;
                int i25 = ((i24 & (-2047)) + (i24 | (-2047))) / 1024;
                int i26 = (i25 ^ 1) + ((i25 & 1) << 1);
                int i27 = ((i23 | i26) << 1) - (i26 ^ i23);
                int i28 = ((i23 >> 23) - 1023) / 512;
                int i29 = (-(i27 ^ (((i28 | 1) << 1) - (i28 ^ 1)))) + 5;
                int i30 = i29 >> 24;
                Loader.l((1635579460 / ((i29 & (-((((i30 & (-511)) + (i30 | (-511))) / 256) + 2))) * 2)) + 1659901950);
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
