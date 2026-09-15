package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class U implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f1057a;

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = U.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 3414), TextUtils.getOffsetAfter("", 0) + 1559, TextUtils.getOffsetBefore("", 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1848812186, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1848812186};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 43042), 3111 - KeyEvent.keyCodeFromString(""), 22 - Color.argb(0, 0, 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), View.resolveSizeAndState(0, 0, 0) + 518, 77 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) SystemClock.elapsedRealtime());
                int i7 = i3 + 346373671 + ((~((-67437699) | i6)) * (-783)) + (((~(i6 | 1492841080)) | (-212190379)) * 783);
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
                int i13 = ~(Process.myPid() | 341509938);
                int i14 = i10 + (((1159637186 | i13) * (-658)) - 260785082) + ((i13 | 1090824384) * 658);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(U.class, new Object[0]);
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
                int i19 = -(1672892802 * i17);
                int i20 = (((i18 & i19) + (i18 | i19)) - (~(-(i17 * (-795550000))))) - 1;
                int i21 = ((i20 | (-1437944175)) << 1) - ((-1437944175) ^ i20);
                int i22 = i21 >> 24;
                int i23 = (((i22 | (-511)) << 1) - (i22 ^ (-511))) / 256;
                int i24 = (i21 - (~(((i23 | 1) << 1) - (i23 ^ 1)))) - 1;
                int i25 = i21 >> 19;
                int i26 = (-(i24 ^ ((((i25 & (-16383)) + (i25 | (-16383))) / 8192) + 1))) + 4;
                int i27 = i26 >> 29;
                int i28 = ((i27 ^ (-15)) + ((i27 & (-15)) << 1)) / 8;
                int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
                Loader.l(((-1284840624) / ((i26 & (-(((i29 | 1) << 1) - (i29 ^ 1)))) * 2)) - 999418841);
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
