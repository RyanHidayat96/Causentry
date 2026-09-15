package id.vida.liveness.dto;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import liveness.Loader;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes7.dex */
public final class RestResponseDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private RestMetaDataDTO f1100a;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private Object b;

    @SerializedName("errors")
    private List<RestErrorDTO> c;

    private static native Object[] $liveness$B7224751e(RestMetaDataDTO restMetaDataDTO, Object obj, List list);

    private static native void $liveness$E7224751e(Object obj, Object obj2);

    public RestResponseDTO() {
    }

    public RestResponseDTO(RestMetaDataDTO restMetaDataDTO, Object obj, List<RestErrorDTO> list) {
        $liveness$E7224751e(this, $liveness$B7224751e(restMetaDataDTO, obj, list));
    }

    public final native Object getData();

    public final native List<RestErrorDTO> getErrors();

    public final native RestMetaDataDTO getMetaData();

    public final native void setData(Object obj);

    public final native void setErrors(List<RestErrorDTO> list);

    public final native void setMetaData(RestMetaDataDTO restMetaDataDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = RestResponseDTO.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 3414), 1558 - ExpandableListView.getPackedPositionChild(0L), ExpandableListView.getPackedPositionChild(0L) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -919659268, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -919659268};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 43042), 3111 - (ViewConfiguration.getLongPressTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 519, 75 - TextUtils.lastIndexOf("", '0')), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iNextInt = new Random().nextInt(1701498032);
                int i6 = i3 + 2079560342 + (((~(iNextInt | 737652739)) | (-967378720)) * (-668)) + ((737652739 | (~((-967378720) | iNextInt))) * 1336) + ((iNextInt | (-268961565)) * 668);
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
                int iNextInt2 = new Random().nextInt(20983394);
                int i12 = ~iNextInt2;
                int i13 = i9 + (-1641410398) + ((85525520 | i12) * (-192)) + (((~((-1485236970) | i12)) | 134268969) * (-384)) + (((~(iNextInt2 | 1570762489)) | (~(i12 | (-1350968001))) | (~((-134268970) | iNextInt2))) * DerHeader.TAG_CLASS_PRIVATE);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(RestResponseDTO.class, new Object[0]);
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
                int i18 = -(875416346 * i16);
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                int i20 = -(i16 * (-1930572928));
                int i21 = (((i19 | i20) << 1) - (i20 ^ i19)) - (-1413821737);
                int i22 = i21 >> 22;
                int i23 = (((i22 | (-2047)) << 1) - (i22 ^ (-2047))) / 1024;
                int i24 = (i23 & 1) + (i23 | 1);
                int i25 = (i21 ^ i24) + ((i24 & i21) << 1);
                int i26 = i21 >> 18;
                int i27 = ((i26 & (-32767)) + (i26 | (-32767))) / 16384;
                int i28 = -((((i27 | 1) << 1) - (i27 ^ 1)) ^ i25);
                int i29 = (i28 ^ 3) + ((i28 & 3) << 1);
                int i30 = i29 >> 26;
                int i31 = ((i30 & ComposerKt.defaultsKey) + (i30 | ComposerKt.defaultsKey)) / 64;
                int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
                Loader.l((1538377398 / (((-(((i32 | 1) << 1) - (i32 ^ 1))) & i29) * 3)) + 536391960);
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
