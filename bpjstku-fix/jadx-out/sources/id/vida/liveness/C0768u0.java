package id.vida.liveness;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0768u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f1176a;
    public final Rect b;

    private static native Object[] $liveness$B009c0fc4(Bitmap bitmap);

    private static native Object[] $liveness$Ba5bdac9d(Bitmap bitmap, Rect rect);

    private static native void $liveness$E009c0fc4(Object obj, Object obj2);

    private static native void $liveness$Ea5bdac9d(Object obj, Object obj2);

    public C0768u0(Bitmap bitmap) {
        $liveness$E009c0fc4(this, $liveness$B009c0fc4(bitmap));
    }

    public C0768u0(Bitmap bitmap, Rect rect) {
        $liveness$Ea5bdac9d(this, $liveness$Ba5bdac9d(bitmap, rect));
    }

    public final native Rect getCoordinates();

    public final native Bitmap getImage();

    static {
        Object[] objArr;
        ClassLoader classLoader = C0768u0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1559 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 24 - (ViewConfiguration.getScrollBarSize() >> 8), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1437081927, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1437081927};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - Color.blue(0)), KeyEvent.normalizeMetaState(0) + 3111, Color.argb(0, 0, 0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 517 - Process.getGidForName(""), KeyEvent.getDeadChar(0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyUid = Process.myUid();
                int i6 = i3 + (-382798554) + (((~((-782374747) | iMyUid)) | (-922656713)) * (-964)) + (((~((~iMyUid) | (-782374747))) | 134217746) * (-964));
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
                int i13 = ~i12;
                int i14 = i9 + (-988629054) + (((~((-94421797) | i13)) | (~((-270143643) | i12)) | (~((-1246044225) | i12))) * 765) + ((94421796 | (~((-364565439) | i13))) * 1530) + (((~(i12 | (-364565439))) | (~(i13 | (-1246044225)))) * 765);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0768u0.class, new Object[0]);
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
                int i19 = -(1639787921 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * (-884062287));
                int i22 = ((i20 & i21) + (i21 | i20)) - (-525883713);
                int i23 = i22 >> 19;
                int i24 = ((i23 ^ (-16383)) + ((i23 & (-16383)) << 1)) / 8192;
                int i25 = (i24 & 1) + (i24 | 1);
                int i26 = (i22 & i25) + (i25 | i22);
                int i27 = ((i22 >> 21) - 4095) / 2048;
                int i28 = (-(i26 ^ (((i27 | 1) << 1) - (i27 ^ 1)))) + 6;
                int i29 = i28 >> 21;
                int i30 = (((i29 ^ (-4095)) + ((i29 & (-4095)) << 1)) / 2048) + 1;
                Loader.l(((-1796061576) / ((i28 & (-((i30 ^ 1) + ((i30 & 1) << 1)))) * 2)) - 195963230);
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
