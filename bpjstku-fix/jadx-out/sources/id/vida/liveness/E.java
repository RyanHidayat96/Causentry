package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class E extends ImageCapture.OnImageCapturedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f1019a;

    public E(H h) {
        this.f1019a = h;
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final native void onCaptureSuccess(ImageProxy imageProxy);

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public final native void onError(ImageCaptureException imageCaptureException);

    static {
        Object[] objArr;
        ClassLoader classLoader = E.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 3415), 1559 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.green(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 544595036, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 544595036};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - TextUtils.indexOf((CharSequence) "", '0')), View.combineMeasuredStates(0, 0) + 3111, TextUtils.indexOf("", "") + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), View.resolveSize(0, 0) + 518, 75 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((~Process.myPid()) | 1409079940);
                int i7 = i3 + ((1113326080 | i6) * (-970)) + 181135098 + ((i6 | 295753860) * 970);
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
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i13 = i10 + 1384429044 + (((~((~iUptimeMillis) | (-139941455))) | 1565090004) * (-235)) + (((~((-139941455) | iUptimeMillis)) | 1565090004) * (-470)) + (((~(iUptimeMillis | (-1447435))) | 1426595984) * 235);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(E.class, new Object[0]);
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
                int i18 = -(685097793 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * 373015481);
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = ((i21 | (-1877497079)) << 1) - ((-1877497079) ^ i21);
                int i23 = i22 >> 17;
                int i24 = (((i23 | (-65535)) << 1) - (i23 ^ (-65535))) / 32768;
                int i25 = (i22 - (~(((i24 | 1) << 1) - (i24 ^ 1)))) - 1;
                int i26 = i22 >> 19;
                int i27 = ((i26 ^ (-16383)) + ((i26 & (-16383)) << 1)) / 8192;
                int i28 = -((((i27 | 1) << 1) - (i27 ^ 1)) ^ i25);
                int i29 = ((i28 | 6) << 1) - (i28 ^ 6);
                int i30 = i29 >> 17;
                int i31 = (((i30 | (-65535)) << 1) - ((-65535) ^ i30)) / 32768;
                Loader.l(((-1941635340) / (((-((((i31 | 1) << 1) - (i31 ^ 1)) + 1)) & i29) * 2)) - 121107079);
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
