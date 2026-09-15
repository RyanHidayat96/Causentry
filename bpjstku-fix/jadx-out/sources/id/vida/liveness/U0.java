package id.vida.liveness;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import defpackage.CaptureBundlesCaptureBundleImpl;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class U0 extends CaptureBundlesCaptureBundleImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1058a;
    public final int b;
    public final int c;

    private static native Object[] $liveness$B3adc5e19(int i, int i2, int i3);

    private static native void $liveness$E3adc5e19(Object obj, Object obj2);

    public U0(int i, int i2, int i3) {
        $liveness$E3adc5e19(this, $liveness$B3adc5e19(i, i2, i3));
    }

    @Override // defpackage.CaptureBundlesCaptureBundleImpl
    public final native Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);

    @Override // defpackage.getCameraControl
    public final native void updateDiskCacheKey(MessageDigest messageDigest);

    static {
        Object[] objArr;
        ClassLoader classLoader = U0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - TextUtils.getCapsMode("", 0, 0)), 1559 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 23 - TextUtils.lastIndexOf("", '0', 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 179854368, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 179854368};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 43042), 3110 - MotionEvent.axisFromString(""), 22 - View.MeasureSpec.getMode(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - Process.getGidForName("")), 518 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 76 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt();
                int i6 = (~((-892450980) | iNextInt)) | 807450659;
                int i7 = i3 + 2117985602 + (i6 * 992) + ((i6 | (~((~iNextInt) | 897580799))) * (-496)) + ((iNextInt | 812580479) * 496);
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i13 = i10 + (((~((-1095483016) | startElapsedRealtime)) | 1696548380) * 262) + 660627392 + (((~((~startElapsedRealtime) | (-1095483016))) | 1696548380) * 262);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(U0.class, new Object[0]);
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
                int i17 = ((i16 * i16) - (~(-(389083861 * i16)))) - 1;
                int i18 = -(i16 * 1342962155);
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                int i20 = (i19 ^ (-1791187968)) + (((-1791187968) & i19) << 1);
                int i21 = ((i20 >> 26) + ComposerKt.defaultsKey) / 64;
                int i22 = (i21 & 1) + (i21 | 1);
                int i23 = -(((i20 ^ i22) + ((i22 & i20) << 1)) ^ ((((i20 >> 25) - 255) / 128) + 1));
                int i24 = (i23 ^ 5) + ((i23 & 5) << 1);
                int i25 = i24 >> 21;
                int i26 = ((i25 & (-4095)) + (i25 | (-4095))) / 2048;
                int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
                Loader.l(((-1759680890) / (((-((i27 ^ 1) + ((i27 & 1) << 1))) & i24) * 2)) - 706055829);
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
