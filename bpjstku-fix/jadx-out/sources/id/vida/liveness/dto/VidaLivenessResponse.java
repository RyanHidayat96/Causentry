package id.vida.liveness.dto;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import liveness.Loader;

/* JADX INFO: loaded from: classes4.dex */
public final class VidaLivenessResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("imageBytes")
    private byte[] f1117a;

    @SerializedName("livenessScore")
    private double b;

    @SerializedName("manipulationScore")
    private double c;

    @SerializedName("details")
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("transactionId")
    private String f1118e;

    @SerializedName("sessionId")
    private String f;

    @SerializedName("additionalImages")
    private List<byte[]> g;

    @SerializedName("failedAttempts")
    private List<VidaFailedAttempt> h;

    private static native Object[] $liveness$Bd08c2dcc(byte[] bArr, double d, double d2, String str, String str2, List list, String str3, List list2);

    private static native void $liveness$Ed08c2dcc(Object obj, Object obj2);

    public VidaLivenessResponse(byte[] bArr, double d, double d2, String str, String str2, List<byte[]> list, String str3, List<VidaFailedAttempt> list2) {
        $liveness$Ed08c2dcc(this, $liveness$Bd08c2dcc(bArr, d, d2, str, str2, list, str3, list2));
    }

    public final native List<byte[]> getAdditionalImages();

    public final native String getErrorDetails();

    public final native List<VidaFailedAttempt> getFailedAttempts();

    public final native byte[] getImageBytes();

    public final native double getLivenessScore();

    public final native double getManipulationScore();

    public final native String getSessionId();

    public final native String getTransactionId();

    static {
        Object[] objArr;
        ClassLoader classLoader = VidaLivenessResponse.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 3414), 1559 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1064266666, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1064266666};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 43043), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 517, 76 - ExpandableListView.getPackedPositionType(0L)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = ~(758399032 | i6);
                int i8 = i3 + 1575850776 + ((273168066 | i7) * (-814)) + ((i7 | (~((~i6) | (-946632427))) | 84934672) * 407) + (((~(i6 | 946632426)) | (~((-758399033) | i6)) | 84934672) * 407);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
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
                int i11 = ((int[]) objArr4[0])[0];
                int i12 = ((int[]) objArr4[2])[0];
                int i13 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr = {i12};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i14 = ~((-422049936) | iUptimeMillis);
                int i15 = ~iUptimeMillis;
                int i16 = i11 + 811956482 + ((i14 | (~(1282981523 | i15))) * (-1808)) + (((~((-136362116) | iUptimeMillis)) | (~(i15 | 1568669343))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iUptimeMillis | (-1282981524))) | 285687820 | (~(422049935 | i15))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(VidaLivenessResponse.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i19 = ((int[]) objArr[0])[0];
                int i20 = i19 * i19;
                int i21 = -(1275008696 * i19);
                int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                int i23 = -(i19 * 130551400);
                int i24 = ((i22 & i23) + (i23 | i22)) - (-1598591232);
                int i25 = i24 >> 27;
                int i26 = ((((i25 | (-63)) << 1) - (i25 ^ (-63))) / 32) + 1;
                int i27 = (i24 & i26) + (i26 | i24);
                int i28 = ((i24 >> 26) + ComposerKt.defaultsKey) / 64;
                int i29 = -(i27 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
                int i30 = (i29 ^ 6) + ((i29 & 6) << 1);
                int i31 = i30 >> 15;
                int i32 = ((i31 ^ (-262143)) + ((i31 & (-262143)) << 1)) / 131072;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l((2000314512 / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i30) * 2)) + 1770190014);
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
