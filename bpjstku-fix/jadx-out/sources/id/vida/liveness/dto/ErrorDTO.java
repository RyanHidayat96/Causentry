package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String f1094a;

    @SerializedName("errorCode")
    private int b;

    @SerializedName("message")
    private String c;

    @SerializedName("details")
    private String d;

    private static native Object[] $liveness$B84bb885d(String str, int i, String str2, String str3);

    private static native void $liveness$E84bb885d(Object obj, Object obj2);

    public ErrorDTO() {
    }

    public ErrorDTO(String str, int i, String str2, String str3) {
        $liveness$E84bb885d(this, $liveness$B84bb885d(str, i, str2, str3));
    }

    public final native int getErrorCode();

    public final native String getMessage();

    public final native String getStatus();

    public final native void setDetails(String str);

    public final native void setErrorCode(int i);

    public final native void setMessage(String str);

    public final native void setStatus(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = ErrorDTO.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Gravity.getAbsoluteGravity(0, 0)), TextUtils.indexOf("", "", 0, 0) + 1559, 'H' - AndroidCharacter.getMirror('0'), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1299361423, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1299361423};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (Process.myTid() >> 22)), TextUtils.lastIndexOf("", '0', 0) + 3112, 22 - TextUtils.indexOf("", ""), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777734, Drawable.resolveOpacity(0, 0) + 76), Integer.TYPE});
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
                int i6 = i3 + (-1396201994) + (((~((-952095393) | iMyPid)) | (-1023407779)) * (-502)) + ((~((~iMyPid) | (-270471713))) * (-502)) + (((~(iMyPid | (-752936067))) | (-952095393)) * TypedValues.PositionType.TYPE_DRAWPATH);
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
                int[] iArr = {i10};
                int[] iArr2 = {i11};
                int iMyPid2 = Process.myPid();
                int i12 = 775087278 + (((~((-669619277) | iMyPid2)) | 38310920 | (~(1035412182 | iMyPid2))) * (-754));
                int i13 = ~((-38310921) | iMyPid2);
                int i14 = ~iMyPid2;
                int i15 = i9 + i12 + ((i13 | (~(1073723102 | i14))) * (-754)) + ((i14 | (-669619277)) * 754);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ErrorDTO.class, new Object[0]);
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
                int i20 = -(718315901 * i18);
                int i21 = (i19 & i20) + (i19 | i20);
                int i22 = -(i18 * 2091007761);
                int i23 = ((i21 ^ i22) + ((i22 & i21) << 1)) - 2116275279;
                int i24 = i23 >> 23;
                int i25 = ((i24 & (-1023)) + (i24 | (-1023))) / 512;
                int i26 = (i25 & 1) + (i25 | 1);
                int i27 = (i23 ^ i26) + ((i26 & i23) << 1);
                int i28 = i23 >> 29;
                int i29 = ((i28 ^ (-15)) + ((i28 & (-15)) << 1)) / 8;
                int i30 = -((((i29 | 1) << 1) - (i29 ^ 1)) ^ i27);
                int i31 = (i30 ^ 2) + ((i30 & 2) << 1);
                int i32 = i31 >> 26;
                int i33 = ((i32 ^ ComposerKt.defaultsKey) + ((i32 & ComposerKt.defaultsKey) << 1)) / 64;
                int i34 = (i33 & 1) + (i33 | 1);
                Loader.l(((-593874044) / (((-((i34 & 1) + (i34 | 1))) & i31) * 2)) - 1769180126);
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
