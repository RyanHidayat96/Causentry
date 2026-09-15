package id.vida.liveness;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import id.vida.liveness.dto.VidaBackendLivenessRequest;
import id.vida.liveness.dto.VidaLivenessRequest;
import id.vida.liveness.listeners.BackendLivenessListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class r1 {
    public static q1 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1160a;
    public final VidaLivenessRequest b;
    public String c;
    public BackendLivenessListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1161e;
    public final String f;
    public final String g;
    public String h;
    public SDKConfigResponseDTO i;
    public VidaBackendLivenessRequest j;

    private static native Object[] $liveness$B5e69e0a1(WeakReference weakReference, VidaLivenessRequest vidaLivenessRequest, String str, BackendLivenessListener backendLivenessListener);

    private static native /* synthetic */ void $liveness$COI();

    private static native void $liveness$E5e69e0a1(Object obj, Object obj2);

    public r1(WeakReference weakReference, VidaLivenessRequest vidaLivenessRequest, String str, BackendLivenessListener backendLivenessListener) {
        $liveness$E5e69e0a1(this, $liveness$B5e69e0a1(weakReference, vidaLivenessRequest, str, backendLivenessListener));
    }

    public /* synthetic */ r1(WeakReference weakReference, VidaLivenessRequest vidaLivenessRequest, String str, BackendLivenessListener backendLivenessListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, vidaLivenessRequest, str, backendLivenessListener);
    }

    @JvmStatic
    public static final native r1 forExecution(Activity activity, VidaLivenessRequest vidaLivenessRequest, String str, BackendLivenessListener backendLivenessListener);

    @JvmStatic
    public static final native r1 forPrefetch(Activity activity, VidaLivenessRequest vidaLivenessRequest);

    @JvmStatic
    public static final native r1 prepareForExecution(r1 r1Var, String str, BackendLivenessListener backendLivenessListener);

    public final native WeakReference<Activity> getActivityRef();

    public final native String getImageString();

    public final native BackendLivenessListener getListener();

    public final native VidaBackendLivenessRequest getLivenessRequest();

    public final native String getRefId();

    public final native VidaLivenessRequest getRequest();

    public final native SDKConfigResponseDTO getSdkConfig();

    public final native String getSessionId();

    public final native String getToken();

    public final native String getTransactionId();

    public final native void setImageString(String str);

    public final native void setListener(BackendLivenessListener backendLivenessListener);

    public final native void setLivenessRequest(VidaBackendLivenessRequest vidaBackendLivenessRequest);

    public final native void setSdkConfig(SDKConfigResponseDTO sDKConfigResponseDTO);

    public final native void setToken(String str);

    static {
        Object[] objArr;
        ClassLoader classLoader = r1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3414), 1559 - Gravity.getAbsoluteGravity(0, 0), 23 - TextUtils.lastIndexOf("", '0', 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2049418457, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2049418457};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.resolveSize(0, 0)), 3111 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getTrimmedLength("") + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 518, 76 - ((Process.getThreadPriority(0) + 20) >> 6)), Integer.TYPE});
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
                int i6 = ~iMyUid;
                int i7 = i3 + (((~((-1658731906) | i6)) | (~(iMyUid | 46299553))) * 959) + 1570633409 + (((~(iMyUid | (-1658731906))) | (~(i6 | 46299553))) * 959);
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
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i13 = ~iFreeMemory;
                int i14 = i10 + (-1984962272) + (((~((-1062233815) | i13)) | 642797644) * 226) + (((~(i13 | (-419440275))) | (~((-642797645) | iFreeMemory)) | 4104) * (-113)) + ((~(iFreeMemory | (-1062233815))) * 113);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(r1.class, new Object[0]);
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
                int i19 = -(985783508 * i17);
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                int i21 = -(i17 * (-1768586034));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                int i23 = ((i22 | (-2125067615)) << 1) - ((-2125067615) ^ i22);
                int i24 = i23 >> 27;
                int i25 = ((i24 ^ (-63)) + ((i24 & (-63)) << 1)) / 32;
                int i26 = (i25 & 1) + (i25 | 1);
                int i27 = -(((((i23 >> 29) - 15) / 8) + 1) ^ ((i23 & i26) + (i26 | i23)));
                int i28 = (i27 ^ 3) + ((i27 & 3) << 1);
                int i29 = i28 >> 17;
                int i30 = ((i29 ^ (-65535)) + ((i29 & (-65535)) << 1)) / 32768;
                int i31 = (i30 & 1) + (i30 | 1);
                Loader.l((1577762091 / (((-(((i31 | 1) << 1) - (i31 ^ 1))) & i28) * 3)) + 1379605058);
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
