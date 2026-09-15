package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import defpackage.initSession;
import id.vida.liveness.dto.VidaLivenessResponse;
import id.vida.liveness.utils.SegmentedProgressBar;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class M extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatImageView f1040a;
    public AppCompatImageView b;
    public AppCompatButton c;
    public AppCompatButton d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SegmentedProgressBar f1041e;
    public AppCompatTextView f;
    public ConstraintLayout g;
    public AppCompatImageView h;

    private static /* synthetic */ Runnable $liveness$C5113e0d6(final M m) {
        return new Runnable() { // from class: id.vida.liveness.M$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C51226cb6(final M m) {
        return new Runnable() { // from class: id.vida.liveness.M$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C5130f896(final M m) {
        return new Runnable() { // from class: id.vida.liveness.M$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        };
    }

    public static native ArrayList a(ArrayList arrayList);

    public final native VidaLivenessResponse a();

    public final native void b();

    public final native void c();

    public final native /* synthetic */ void d();

    public final native /* synthetic */ void e();

    public final native /* synthetic */ void f();

    public final native void g();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.Fragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(View view, Bundle bundle);

    static {
        Object[] objArr;
        ClassLoader classLoader = M.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.myPid() >> 22) + 3414), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1559, 24 - ExpandableListView.getPackedPositionType(0L), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1292653893, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1292653893};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6)), (KeyEvent.getMaxKeyCode() >> 16) + 3111, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.getMaxKeyCode() >> 16), 517 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = ~iFreeMemory;
                int i7 = i3 + (-1567116654) + (((~(i6 | 954580377)) | 750451081) * (-1042)) + ((954580377 | iFreeMemory) * 521) + (((~(iFreeMemory | (-750451082))) | 681621897 | (~(i6 | 1023409561))) * 521);
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
                int iNextInt = new Random().nextInt();
                int i13 = ~iNextInt;
                int i14 = i10 + 1206478406 + (((~((-1657290482) | i13)) | (~((-47740978) | iNextInt))) * (-370)) + (((~(iNextInt | (-1657290482))) | (~(i13 | (-47740978))) | (-1658355442)) * (-370)) + 588809788;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(M.class, new Object[0]);
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
                int i19 = -(227223889 * i17);
                int i20 = ((((i18 | i19) << 1) - (i18 ^ i19)) - (~(-(i17 * 1982988921)))) - 1;
                int i21 = ((i20 | (-1695523111)) << 1) - ((-1695523111) ^ i20);
                int i22 = (((i21 >> 23) - 1023) / 512) + 1;
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = i21 >> 27;
                int i25 = -(i23 ^ ((((i24 ^ (-63)) + ((i24 & (-63)) << 1)) / 32) + 1));
                int i26 = (i25 ^ 6) + ((i25 & 6) << 1);
                Loader.l((1760969160 / (((-((((i26 >> 22) - 2047) / 1024) + 2)) & i26) * 2)) + 1912864022);
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
