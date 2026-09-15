package id.vida.liveness.services;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import id.vida.liveness.dto.FaceHacknessResponseDTO;
import id.vida.liveness.listeners.APIResponseListener;
import id.vida.liveness.r1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements APIResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f1168a;
    public final /* synthetic */ BackendLiveness b;

    private static native Object[] $liveness$B0ce9eece(BackendLiveness backendLiveness, r1 r1Var);

    private static native void $liveness$E0ce9eece(Object obj, Object obj2);

    public a(BackendLiveness backendLiveness, r1 r1Var) {
        this.b = backendLiveness;
        this.f1168a = r1Var;
        $liveness$E0ce9eece(this, $liveness$B0ce9eece(backendLiveness, r1Var));
    }

    @Override // id.vida.liveness.listeners.APIResponseListener
    public final native void onError(int i, String str);

    @Override // id.vida.liveness.listeners.APIResponseListener
    public final native void onResponse(FaceHacknessResponseDTO faceHacknessResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = a.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - ((byte) KeyEvent.getModifierMetaStateMask())), 1558 - TextUtils.indexOf((CharSequence) "", '0'), Color.argb(0, 0, 0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1944474536, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1944474536};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3111, 22 - TextUtils.getTrimmedLength(""), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 517, (ViewConfiguration.getEdgeSlop() >> 16) + 76), Integer.TYPE});
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
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = ~i6;
                int i8 = i3 + (-302025626) + ((i6 | 1350307085) * 140) + ((83927568 | (~(1350307085 | i7))) * (-280)) + (((~(i6 | (-83927569))) | (~(354724373 | i7)) | 1079510280) * 140);
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i14 = ~startElapsedRealtime;
                int i15 = i11 + 695544308 + (((~((-1343401524) | i14)) | (~((-361629936) | startElapsedRealtime))) * 210) + (((~(startElapsedRealtime | (-1074832913))) | (~(i14 | (-93061325)))) * 210);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(a.class, new Object[0]);
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
                int i20 = -(1841266151 * i18);
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                int i22 = -(i18 * 1301325879);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                int i24 = ((i23 | (-350536991)) << 1) - ((-350536991) ^ i23);
                int i25 = i24 >> 26;
                int i26 = ((i25 ^ ComposerKt.defaultsKey) + ((i25 & ComposerKt.defaultsKey) << 1)) / 64;
                int i27 = (i24 - (~(((i26 | 1) << 1) - (i26 ^ 1)))) - 1;
                int i28 = i24 >> 28;
                int i29 = (((i28 | (-31)) << 1) - (i28 ^ (-31))) / 16;
                int i30 = -(i27 ^ ((i29 ^ 1) + ((i29 & 1) << 1)));
                int i31 = ((i30 | 5) << 1) - (i30 ^ 5);
                int i32 = i31 >> 17;
                int i33 = (((i32 | (-65535)) << 1) - (i32 ^ (-65535))) / 32768;
                int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
                Loader.l(((-1770638370) / (((-(((i34 | 1) << 1) - (i34 ^ 1))) & i31) * 2)) - 393886876);
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
