package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: loaded from: classes7.dex */
public final class J0 extends StringRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1035a;

    private static native Object[] $liveness$B026dfacf(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2);

    private static native void $liveness$E026dfacf(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public J0(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2) {
        this.f1035a = str2;
        Object[] objArr$liveness$B026dfacf = $liveness$B026dfacf(str, listener, errorListener, str2);
        super(((Value) objArr$liveness$B026dfacf[4]).i, (String) objArr$liveness$B026dfacf[1], (Response.Listener) objArr$liveness$B026dfacf[2], (Response.ErrorListener) objArr$liveness$B026dfacf[3]);
        $liveness$E026dfacf(this, objArr$liveness$B026dfacf);
    }

    @Override // com.android.volley.Request
    public final native byte[] getBody();

    @Override // com.android.volley.Request
    public final native Map<String, String> getHeaders();

    static {
        Object[] objArr;
        ClassLoader classLoader = J0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3414), 1558 - MotionEvent.axisFromString(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 693074457, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 693074457};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041), View.MeasureSpec.getMode(0) + 3111, Color.alpha(0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0') + 1), View.combineMeasuredStates(0, 0) + 518, TextUtils.getOffsetAfter("", 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = ~iUptimeMillis;
                int i7 = i3 + 1122035740 + (((~((-1610840107) | i6)) | 94191352) * (-90)) + (((~((-1610840107) | iUptimeMillis)) | (-1704951547)) * (-45)) + (((~(iUptimeMillis | (-94191353))) | (-1610840107) | (~(i6 | 94191352))) * 45);
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
                int[] iArr = {i12};
                int iMyPid = Process.myPid();
                int i13 = ~((-323296997) | iMyPid);
                int i14 = (-447325718) + ((17041088 | i13) * (-280)) + ((i13 | (~((-1381734463) | iMyPid))) * 140);
                int i15 = ~((-306255909) | iMyPid);
                int i16 = ~iMyPid;
                int i17 = i10 + i14 + (((~(i16 | (-1075478555))) | i15 | (~((-17041089) | i16))) * 140);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(J0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i20 = ((int[]) objArr[0])[0];
                int i21 = i20 * i20;
                int i22 = -(771341422 * i20);
                int i23 = (((i21 ^ i22) + ((i21 & i22) << 1)) - (~(-(i20 * 104934926)))) - (-1572715267);
                int i24 = i23 >> 24;
                int i25 = (((i24 | (-511)) << 1) - (i24 ^ (-511))) / 256;
                int i26 = (i25 ^ 1) + ((i25 & 1) << 1);
                int i27 = (i23 ^ i26) + ((i26 & i23) << 1);
                int i28 = i23 >> 15;
                int i29 = (((i28 | (-262143)) << 1) - (i28 ^ (-262143))) / 131072;
                int i30 = -(((i29 & 1) + (i29 | 1)) ^ i27);
                int i31 = (i30 & 4) + (i30 | 4);
                int i32 = ((i31 >> 29) - 15) / 8;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l(((-1295918952) / (((-((i33 ^ 1) + ((i33 & 1) << 1))) & i31) * 2)) - 1788364100);
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
