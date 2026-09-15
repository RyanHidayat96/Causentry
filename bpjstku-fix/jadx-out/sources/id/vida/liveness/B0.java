package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.config.VidaFaceDetectionOption;
import id.vida.liveness.config.VidaUICustomizationOption;
import id.vida.liveness.dto.VidaLivenessRequest;
import id.vida.liveness.dto.VidaLivenessResponse;
import id.vida.liveness.listeners.VidaLivenessListener;
import id.vida.liveness.listeners.VidaLogger;
import id.vida.liveness.services.BackendLiveness;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class B0 {
    public static B0 x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VidaLivenessRequest f1012a;
    public VidaFaceDetectionOption b;
    public VidaUICustomizationOption c;
    public VidaLivenessListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1013e;
    public final HashMap f;
    public final HashMap g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public String k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public String q;
    public G1 r;
    public VidaLivenessResponse s;
    public VidaLogger t;
    public Q u;
    public BackendLiveness v;
    public Map w;

    private static native Object[] $liveness$B1a6ebac5();

    private static native void $liveness$E1a6ebac5(Object obj, Object obj2);

    public B0() {
        $liveness$E1a6ebac5(this, $liveness$B1a6ebac5());
    }

    public static native B0 getInstance();

    public final native Object get(int i);

    public final native void reset();

    public final native void set(int i, Object obj);

    static {
        Object[] objArr;
        ClassLoader classLoader = B0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - ImageFormat.getBitsPerPixel(0)), 1559 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1887366708, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1887366708};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 42994), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111, Color.blue(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ExpandableListView.getPackedPositionGroup(0L) + 518, 77 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = i3 + 475418962 + (((~((-800336656) | iElapsedRealtime)) | 631506947) * 104) + ((~((~iElapsedRealtime) | 1073524511)) * (-104)) + ((iElapsedRealtime | 904694803) * 104);
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
                int i12 = ~Process.myTid();
                int i13 = i9 + 1499690818 + (((-1073741955) | i12) * 184) + (((~(i12 | 536837724)) | (-1516127899)) * 184);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(B0.class, new Object[0]);
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
                int i17 = i16 * i16;
                int i18 = -(141456186 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * (-465129542));
                int i21 = (i19 & i20) + (i20 | i19);
                int i22 = ((i21 | 343109156) << 1) - (343109156 ^ i21);
                int i23 = i22 >> 17;
                int i24 = (((i23 | (-65535)) << 1) - (i23 ^ (-65535))) / 32768;
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = ((i22 | i25) << 1) - (i25 ^ i22);
                int i27 = i22 >> 28;
                int i28 = ((i27 & (-31)) + (i27 | (-31))) / 16;
                int i29 = (-(((i28 ^ 1) + ((i28 & 1) << 1)) ^ i26)) + 4;
                int i30 = (((i29 >> 19) - 16383) / 8192) + 1;
                Loader.l((1392328664 / ((i29 & (-((i30 & 1) + (i30 | 1)))) * 2)) + 1129114778);
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
