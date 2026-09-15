package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public class R0 extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressBar f1051a;
    public AppCompatImageView b;
    public AppCompatImageView c;
    public AppCompatButton d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatButton f1052e;
    public AppCompatTextView f;
    public AppCompatTextView g;
    public AppCompatImageView h;
    public EnumC0733e1 i;
    public View j;
    public int k;
    public String l;

    private static /* synthetic */ Runnable $liveness$C44934854(final R0 r0) {
        return new Runnable() { // from class: id.vida.liveness.R0$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C44a1d434(final R0 r0) {
        return new Runnable() { // from class: id.vida.liveness.R0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C44b06014(final R0 r0) {
        return new Runnable() { // from class: id.vida.liveness.R0$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C44beebf4(R0 r0) {
        return new R0$$ExternalSyntheticLambda0(r0);
    }

    private static /* synthetic */ Runnable $liveness$C44cd77d4(final R0 r0) {
        return new Runnable() { // from class: id.vida.liveness.R0$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C44dc03b4(final R0 r0) {
        return new Runnable() { // from class: id.vida.liveness.R0$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$C44ea8f94(final R0 r0) {
        return new Runnable() { // from class: id.vida.liveness.R0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h();
            }
        };
    }

    public final native void a();

    public final native void a(boolean z);

    public final native /* synthetic */ void b();

    public final native /* synthetic */ void c();

    public final native /* synthetic */ void d();

    public final native /* synthetic */ void e();

    public final native /* synthetic */ void f();

    public final native /* synthetic */ void g();

    public final native /* synthetic */ void h();

    public final native void i();

    public final native void j();

    public final native void k();

    public final native void l();

    public final native void m();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.Fragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(View view, Bundle bundle);

    static {
        Object[] objArr;
        ClassLoader classLoader = R0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 3414), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1559, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1016169225, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1016169225};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042), MotionEvent.axisFromString("") + 3112, 22 - (ViewConfiguration.getTouchSlop() >> 8), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), 518 - KeyEvent.normalizeMetaState(0), 75 - TextUtils.lastIndexOf("", '0', 0, 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~(new Random().nextInt() | 523666692);
                int i7 = i3 + (((1499248410 | i6) * (-658)) - 597782238) + ((i6 | 1078473242) * 658);
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
                int iNextInt = new Random().nextInt(1215595330);
                int i13 = 1567293734 + (((~((~iNextInt) | (-1369383756))) | 1100881928) * (-245));
                int i14 = ~(iNextInt | (-1369383756));
                int i15 = i10 + i13 + (i14 * (-245)) + ((i14 | 335647703) * 245);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(R0.class, new Object[0]);
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
                int i19 = ((i18 * i18) - (~(-(1593744732 * i18)))) - 1;
                int i20 = -(i18 * (-1675231824));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = (i21 & 1615979044) + (1615979044 | i21);
                int i23 = i22 >> 26;
                int i24 = (((i23 | ComposerKt.defaultsKey) << 1) - (i23 ^ ComposerKt.defaultsKey)) / 64;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = (i22 ^ i25) + ((i25 & i22) << 1);
                int i27 = ((i22 >> 21) - 4095) / 2048;
                int i28 = -(i26 ^ ((i27 & 1) + (i27 | 1)));
                int i29 = ((i28 | 5) << 1) - (i28 ^ 5);
                int i30 = i29 >> 20;
                int i31 = (((i30 | (-8191)) << 1) - (i30 ^ (-8191))) / 4096;
                Loader.l((1498942120 / (((-(((i31 & 1) + (i31 | 1)) + 1)) & i29) * 2)) + 733733963);
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
