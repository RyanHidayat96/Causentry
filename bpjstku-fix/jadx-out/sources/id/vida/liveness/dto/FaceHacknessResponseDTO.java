package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class FaceHacknessResponseDTO implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ekycId")
    private int f1095a;

    @SerializedName("code")
    private int b;

    @SerializedName("liveImage")
    private boolean c;

    @SerializedName("message")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private double f1096e;

    @SerializedName("imgManipulationScore")
    private double f;

    private static native Object[] $liveness$Bb5914be6();

    private static native void $liveness$Eb5914be6(Object obj, Object obj2);

    public FaceHacknessResponseDTO() {
        $liveness$Eb5914be6(this, $liveness$Bb5914be6());
    }

    public final native int getCode();

    public final native double getImgManipulationScore();

    public final native String getMessage();

    public final native double getScore();

    public final native boolean isLiveImage();

    static {
        Object[] objArr;
        ClassLoader classLoader = FaceHacknessResponseDTO.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 3414), 1559 - View.resolveSizeAndState(0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1132848939, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1132848939};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "") + 43042), TextUtils.indexOf((CharSequence) "", '0') + 3112, Color.alpha(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 518 - Color.alpha(0), (Process.myTid() >> 22) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMyPid = Process.myPid();
                int i6 = ~iMyPid;
                int i7 = i3 + (-1820476890) + (((~((-881894577) | i6)) | 823136882) * (-602)) + (((~(iMyPid | (-881894577))) | 806354992 | (~(898676466 | i6))) * (-301)) + ((~(i6 | 823136882)) * 301);
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
                int iNextInt = new Random().nextInt(1917341364);
                int i13 = ~iNextInt;
                int i14 = i10 + (-1796411576) + (((~((-1340106455) | i13)) | (~((-364925005) | i13))) * (-867)) + (((~((-364925005) | iNextInt)) | 96485444 | (~((-1340106455) | iNextInt))) * (-1734)) + (((~(iNextInt | (-1243621011))) | (~(i13 | (-96485445))) | (~((-268439561) | iNextInt))) * 867);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(FaceHacknessResponseDTO.class, new Object[0]);
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
                int i19 = -(443323787 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * (-721153489));
                int i22 = ((i20 ^ i21) + ((i21 & i20) << 1)) - (-522783945);
                int i23 = i22 >> 15;
                int i24 = (((i23 | (-262143)) << 1) - (i23 ^ (-262143))) / 131072;
                int i25 = (i22 - (~((i24 ^ 1) + ((i24 & 1) << 1)))) - 1;
                int i26 = i22 >> 19;
                int i27 = ((i26 ^ (-16383)) + ((i26 & (-16383)) << 1)) / 8192;
                int i28 = -((((i27 | 1) << 1) - (i27 ^ 1)) ^ i25);
                int i29 = (i28 & 5) + (i28 | 5);
                int i30 = i29 >> 15;
                int i31 = (((i30 | (-262143)) << 1) - (i30 ^ (-262143))) / 131072;
                int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                Loader.l((1785925340 / (((-(((i32 | 1) << 1) - (i32 ^ 1))) & i29) * 2)) + 12798963);
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
