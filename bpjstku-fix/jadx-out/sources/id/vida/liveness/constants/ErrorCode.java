package id.vida.liveness.constants;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorCode {
    public static int CRYPTO_DECRYPTION_FAILED;
    public static int CRYPTO_ENCRYPTION_FAILED;
    public static int CRYPTO_HMAC_FAILED;
    public static int GENERAL_CAMERA_CAPTURE_FAILED;
    public static int GENERAL_CAMERA_PERMISSION;
    public static int GENERAL_CAMERA_START_FAILED;
    public static int GENERAL_CERTIFICATE_EXCEPTION;
    public static int GENERAL_CRITICAL_THREAT_DETECTED;
    public static int GENERAL_CRYPTO_ENCRYPTION;
    public static int GENERAL_DATA_OBJECT_NOT_FOUND;
    public static int GENERAL_DETECTION_CANCELED;
    public static int GENERAL_DETECTION_FAILED;
    public static int GENERAL_DETECTION_TIMED_OUT;
    public static int GENERAL_DETECTION_USER_PRESSED_BACK;
    public static int GENERAL_ERROR_INVALID_INPUT_DATA;
    public static int GENERAL_ERROR_PARSING_JSON_OBJECT;
    public static int GENERAL_IMAGE_RESULT_IS_NULL;
    public static int GENERAL_INVALID_CONFIGURATION;
    public static int GENERAL_INVALID_GESTURE_COMBINATION;
    public static int GENERAL_KEYSTORE_EXCEPTION;
    public static int GENERAL_KEY_MANAGEMENT_EXCEPTION;
    public static int GENERAL_LIVENESS_IS_NOT_CONFIGURED;
    public static int GENERAL_LIVENESS_LICENSE_KEY_NOT_AVAILABLE;
    public static int GENERAL_LIVENESS_OBJECT_IS_ALREADY_ACTIVE;
    public static int GENERAL_LIVENESS_SDK_NOT_INITIALIZED;
    public static int GENERAL_MAX_RETRY_EXHAUSTED;
    public static int GENERAL_NO_SUCH_ALGORITHM;
    public static int GENERAL_REQUEST_IN_PROGRESS;
    public static int GENERAL_RESPONSE_OBJECT_IS_INVALID;
    public static int GENERAL_RESPONSE_OBJECT_IS_NULL;
    public static int GENERAL_RESPONSE_PARSE_ERROR;
    public static int GENERAL_SIGNAL_COLLECTION_BAD_STATE;
    public static int GENERAL_STORE_FAILED;
    public static int GENERAL_UNKNOWN_ERROR;
    public static int GENERAL_UNKNOWN_ERROR_FETCHING_PRODUCT_DETAILS;
    public static int GENERAL_UNKNOWN_ERROR_WHILE_GENERATING_PRODUCT_REQUEST;
    public static int NETWORK_AUTH_FAILURE_ERROR;
    public static int NETWORK_MALFORMED_REQUEST;
    public static int NETWORK_NOT_FOUND;
    public static int NETWORK_NO_CONNECTION_ERROR;
    public static int NETWORK_OUT_OF_MEMORY_ERROR;
    public static int NETWORK_TIMEOUT_ERROR;
    public static int NETWORK_UNKNOWN;
    public static int SERVER_ERROR_CODE_1041;
    public static int SERVER_ERROR_CODE_1051;
    public static int SERVER_ERROR_CODE_1052;
    public static int SERVER_ERROR_CODE_1053;
    public static int SERVER_ERROR_CODE_1054;
    public static int SERVER_ERROR_CODE_1055;
    public static int SERVER_ERROR_CODE_1058;
    public static int SERVER_ERROR_CODE_1059;
    public static int SERVER_ERROR_CODE_1060;
    public static int SERVER_ERROR_CODE_1062;
    public static int SERVER_ERROR_CODE_1063;
    public static int SERVER_ERROR_CODE_1064;
    public static int SERVER_ERROR_CODE_1065;
    public static int SERVER_ERROR_CODE_1066;
    public static int SERVER_ERROR_CODE_1074;
    public static int SERVER_ERROR_CODE_1075;
    public static int SERVER_ERROR_CODE_1076;
    public static int error_crypto;
    public static int error_general;
    public static int error_liveness;
    public static int error_network;

    private static native /* synthetic */ void $liveness$COI();

    public static native ArrayList<Integer> getServerErrorCodeListForFaceQuality();

    static {
        Object[] objArr;
        ClassLoader classLoader = ErrorCode.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 3414), (ViewConfiguration.getLongPressTimeout() >> 16) + 1559, Color.alpha(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1796653058, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1796653058};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.red(0) + 43042), 3111 - (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), Color.green(0) + 518, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i6 = ~iMaxMemory;
                int i7 = i3 + (-1984962272) + (((~((-1090507114) | i6)) | 614524345) * 226) + (((~(i6 | (-1079971905))) | (~((-614524346) | iMaxMemory)) | 603989136) * (-113)) + ((~(iMaxMemory | (-1090507114))) * 113);
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
                int i13 = (~new Random().nextInt(1933249052)) | 51069446;
                int i14 = i10 + (-2060062379) + (i13 * 495) + (((~i13) | 33636356) * 495);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(ErrorCode.class, new Object[0]);
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
                int i19 = -(728596888 * i17);
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int i21 = -(i17 * 45884336);
                int i22 = (i20 & i21) + (i21 | i20);
                int i23 = (i22 ^ 250706192) + ((250706192 & i22) << 1);
                int i24 = i23 >> 25;
                int i25 = (((i24 | (-255)) << 1) - (i24 ^ (-255))) / 128;
                int i26 = (i23 - (~(((i25 | 1) << 1) - (i25 ^ 1)))) - 1;
                int i27 = i23 >> 16;
                int i28 = -(i26 ^ ((((i27 ^ (-131071)) + ((i27 & (-131071)) << 1)) / 65536) + 1));
                int i29 = (i28 & 2) + (i28 | 2);
                int i30 = i29 >> 28;
                int i31 = ((i30 ^ (-31)) + ((i30 & (-31)) << 1)) / 16;
                Loader.l((678733164 / (((-(((i31 & 1) + (i31 | 1)) + 1)) & i29) * 2)) + 1670363539);
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
