package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.ComposerKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.initSession;
import id.vida.liveness.listeners.VidaErrorDialogEventListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public class Y extends BottomSheetDialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VidaErrorDialogEventListener f1069a;
    public AppCompatButton b;
    public AppCompatButton c;
    public AppCompatTextView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1070e;
    public EnumC0733e1 f;

    private static native Object[] $liveness$Bf9fa0826();

    private static /* synthetic */ Runnable $liveness$C68da5a75(Y y) {
        return new Y$$ExternalSyntheticLambda0(y);
    }

    private static native void $liveness$Ef9fa0826(Object obj, Object obj2);

    public Y() {
        $liveness$Ef9fa0826(this, $liveness$Bf9fa0826());
    }

    public final native /* synthetic */ void a();

    public final native void b();

    @Override // androidx.fragment.app.DialogFragment
    public native int getTheme();

    @Override // android.view.View.OnClickListener
    public native void onClick(View view);

    @Override // androidx.fragment.app.Fragment
    public native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(View view, Bundle bundle);

    public native void setErrorText(String str);

    public native void setListener(VidaErrorDialogEventListener vidaErrorDialogEventListener);

    public native void setState(EnumC0733e1 enumC0733e1);

    static {
        Object[] objArr;
        ClassLoader classLoader = Y.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 3414), 1559 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 307696539, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 307696539};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (Process.myTid() >> 22)), TextUtils.indexOf("", "", 0, 0) + 3111, 22 - TextUtils.indexOf("", "", 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 519 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 76 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = i3 + (-479546126) + (((~(1161699260 | i6)) | 541098050) * 184) + ((iUptimeMillis | 1159465112) * (-184)) + ((~((-543332199) | i6)) * 184);
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
                int i14 = i10 + 1404102420 + (((~((-730876505) | i13)) | (~(999321306 | iNextInt))) * (-831)) + ((~((-25166353) | iNextInt)) * (-1662)) + (((~(iNextInt | 730876504)) | (~(i13 | (-974154955))) | (~(974154954 | iNextInt))) * 831);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(Y.class, new Object[0]);
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
                int i19 = -(1218449844 * i17);
                int i20 = (i18 & i19) + (i18 | i19);
                int i21 = -(i17 * (-216041664));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = (i22 ^ (-2024338908)) + (((-2024338908) & i22) << 1);
                int i24 = i23 >> 26;
                int i25 = ((i24 ^ ComposerKt.defaultsKey) + ((i24 & ComposerKt.defaultsKey) << 1)) / 64;
                int i26 = (i25 ^ 1) + ((i25 & 1) << 1);
                int i27 = (i23 & i26) + (i26 | i23);
                int i28 = i23 >> 24;
                int i29 = (-(i27 ^ ((((i28 & (-511)) + (i28 | (-511))) / 256) + 1))) + 4;
                int i30 = i29 >> 22;
                int i31 = (((i30 | (-2047)) << 1) - (i30 ^ (-2047))) / 1024;
                int i32 = (i31 & 1) + (i31 | 1);
                Loader.l((1196109256 / ((i29 & (-((i32 ^ 1) + ((i32 & 1) << 1)))) * 2)) + 1770435761);
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
