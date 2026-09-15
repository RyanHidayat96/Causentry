package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import id.vida.liveness.dto.FaceHacknessResponseDTO;
import id.vida.liveness.listeners.BackendLivenessListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class F implements BackendLivenessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f1022a;

    private static /* synthetic */ Runnable $liveness$C975d07fd(final F f) {
        return new Runnable() { // from class: id.vida.liveness.F$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        };
    }

    public F(H h) {
        this.f1022a = h;
    }

    public final native /* synthetic */ void a();

    @Override // id.vida.liveness.listeners.BackendLivenessListener
    public final native void onFailure(byte[] bArr, int i, String str, FaceHacknessResponseDTO faceHacknessResponseDTO);

    @Override // id.vida.liveness.listeners.BackendLivenessListener
    public final native void onSuccess(byte[] bArr, FaceHacknessResponseDTO faceHacknessResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = F.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 3414), 1559 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-16777192) - Color.rgb(0, 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2081677904, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2081677904};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.combineMeasuredStates(0, 0)), Color.alpha(0) + 3111, ExpandableListView.getPackedPositionChild(0L) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 518 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt(1027572439);
                int i6 = i3 + 475418962 + (((~((-852041724) | iNextInt)) | 851515171) * 104) + ((~((~iNextInt) | 853516287)) * (-104)) + ((iNextInt | 852989735) * 104);
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
                int i12 = (int) Runtime.getRuntime().totalMemory();
                int i13 = i9 + 995169282 + (((~((-639696905) | (~i12))) | (~(1065334554 | i12))) * (-272)) + (((~((-1064380169) | i12)) | 424683264) * (-272)) + (((~(i12 | 1064380168)) | 640651290) * 272);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(F.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i16 = ((int[]) objArr[0])[0];
                int i17 = ((i16 * i16) - (~(-(150004162 * i16)))) - 1;
                int i18 = -(i16 * (-1073907646));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                int i20 = (i19 ^ 1875227652) + ((1875227652 & i19) << 1);
                int i21 = i20 >> 15;
                int i22 = ((i21 & (-262143)) + (i21 | (-262143))) / 131072;
                int i23 = ((i22 | 1) << 1) - (i22 ^ 1);
                int i24 = -(((((i20 >> 18) - 32767) / 16384) + 1) ^ ((i20 ^ i23) + ((i23 & i20) << 1)));
                int i25 = (i24 ^ 5) + ((i24 & 5) << 1);
                int i26 = i25 >> 26;
                Loader.l(((-1484764320) / (((-((((i26 & ComposerKt.defaultsKey) + (i26 | ComposerKt.defaultsKey)) / 64) + 2)) & i25) * 2)) - 714630542);
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
