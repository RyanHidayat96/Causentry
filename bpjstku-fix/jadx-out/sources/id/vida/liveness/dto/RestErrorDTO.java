package id.vida.liveness.dto;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class RestErrorDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("code")
    private int f1098a;

    @SerializedName("title")
    private String b;

    @SerializedName("detail")
    private String c;

    private static native Object[] $liveness$B4cf47bf9(int i, String str, String str2);

    private static native void $liveness$E4cf47bf9(Object obj, Object obj2);

    public RestErrorDTO() {
    }

    public RestErrorDTO(int i, String str, String str2) {
        $liveness$E4cf47bf9(this, $liveness$B4cf47bf9(i, str, str2));
    }

    public final native int getCode();

    public final native String getDetail();

    public final native String getPrintableMessage();

    public final native String getTitle();

    public final native void setCode(int i);

    public final native void setDetail(String str);

    public final native void setTitle(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = RestErrorDTO.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (KeyEvent.getMaxKeyCode() >> 16)), 1559 - View.resolveSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 878024101, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 878024101};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111, 22 - View.MeasureSpec.makeMeasureSpec(0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getCapsMode("", 0, 0), 518 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 75), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = ~startUptimeMillis;
                int i7 = i3 + (-1436273963) + (((~((-33642532) | i6)) | (~((-262221) | startUptimeMillis)) | (~((-1637484177) | startUptimeMillis))) * 765) + ((33642531 | (~((-33904752) | i6))) * 1530) + (((~(startUptimeMillis | (-33904752))) | (~(i6 | (-1637484177)))) * 765);
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
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i13 = ~iElapsedRealtime;
                int i14 = i10 + 1556967732 + (((~((-957672690) | i13)) | 747358769) * 519) + (((~(i13 | (-286532801))) | (~(1033891569 | iElapsedRealtime))) * (-519)) + (((~(iElapsedRealtime | 747358769)) | 957672689) * 519);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(RestErrorDTO.class, new Object[0]);
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
                int i18 = ((((i17 * i17) - (~(-(1192476127 * i17)))) - 1) - (~(-(i17 * 772463705)))) - 327034097;
                int i19 = ((i18 >> 29) - 15) / 8;
                int i20 = (i19 ^ 1) + ((i19 & 1) << 1);
                int i21 = (-((i19 + 1) ^ ((i18 ^ i20) + ((i18 & i20) << 1)))) + 5;
                int i22 = i21 >> 22;
                int i23 = (((i22 & (-2047)) + (i22 | (-2047))) / 1024) + 1;
                Loader.l(((-1578720420) / ((i21 & (-((i23 ^ 1) + ((i23 & 1) << 1)))) * 2)) - 1397873771);
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
