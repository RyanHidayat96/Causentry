package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: id.vida.liveness.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0733e1 {
    public static EnumC0733e1 BACKEND_LIVENESS_ERROR;
    public static EnumC0733e1 BACKEND_LIVENESS_REVIEW;
    public static EnumC0733e1 DEFAULT;
    public static EnumC0733e1 MAX_RETRY_EXHAUSTED;
    public static EnumC0733e1 SDK_LIVENESS_ERROR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static /* synthetic */ EnumC0733e1[] f1123a;

    private static native /* synthetic */ void $liveness$COI();

    public EnumC0733e1(String str, int i) {
        super(str, i);
    }

    public static native EnumC0733e1 valueOf(String str);

    public static native EnumC0733e1[] values();

    static {
        Object[] objArr;
        ClassLoader classLoader = EnumC0733e1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            Object[] objArr3 = {"liveness", classLoader, false, -857497392, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) (3414 - View.combineMeasuredStates(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 1560, 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).newInstance(objArr2), -857497392};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            Object[] objArr4 = (Object[]) ((Method) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (43042 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 3111 - TextUtils.getCapsMode("", 0, 0), KeyEvent.normalizeMetaState(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 518, 76 - TextUtils.indexOf("", "")), Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyPid = Process.myPid();
                int i6 = i3 + ((((-1140544862) + (((~((-1163347195) | iMyPid)) | 4276264) * 576)) + (((~((~iMyPid) | (-1159070931))) | 537408000) * 576)) - 1831839232);
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
                int i12 = ~new Random().nextInt();
                int i13 = ~(706351317 | i12);
                int i14 = i9 + (-1078307018) + ((i13 | 998680141) * 764) + (((~(i12 | 998680141)) | 1577104) * (-1528)) + ((295483032 | i13) * 764);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(EnumC0733e1.class, new Object[0]);
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
                int i19 = -(265572894 * i17);
                int i20 = (((i18 ^ i19) + ((i18 & i19) << 1)) - (~(-(i17 * (-1380366852))))) - 1;
                int i21 = ((i20 | (-759121751)) << 1) - ((-759121751) ^ i20);
                int i22 = i21 >> 26;
                int i23 = ((i22 ^ ComposerKt.defaultsKey) + ((i22 & ComposerKt.defaultsKey) << 1)) / 64;
                int i24 = (i23 & 1) + (i23 | 1);
                int i25 = (i21 & i24) + (i24 | i21);
                int i26 = i21 >> 25;
                int i27 = (((i26 | (-255)) << 1) - (i26 ^ (-255))) / 128;
                int i28 = -(((i27 & 1) + (i27 | 1)) ^ i25);
                int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                int i30 = i29 >> 15;
                int i31 = ((i30 ^ (-262143)) + ((i30 & (-262143)) << 1)) / 131072;
                int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
                Loader.l(((-296764686) / (((-((i32 ^ 1) + ((i32 & 1) << 1))) & i29) * 2)) - 518468283);
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
