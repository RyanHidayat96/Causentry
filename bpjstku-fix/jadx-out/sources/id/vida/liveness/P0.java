package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import id.vida.liveness.dto.FaceHacknessResponseDTO;
import id.vida.liveness.listeners.BackendLivenessListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class P0 implements BackendLivenessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R0 f1047a;

    private static /* synthetic */ Runnable $liveness$Cd973409d(final P0 p0) {
        return new Runnable() { // from class: id.vida.liveness.P0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$Ce9f3bd30(final P0 p0, final int i, final FaceHacknessResponseDTO faceHacknessResponseDTO, final String str) {
        return new Runnable() { // from class: id.vida.liveness.P0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i, faceHacknessResponseDTO, str);
            }
        };
    }

    public P0(R0 r0) {
        this.f1047a = r0;
    }

    public final native /* synthetic */ void a();

    public final native /* synthetic */ void a(int i, FaceHacknessResponseDTO faceHacknessResponseDTO, String str);

    @Override // id.vida.liveness.listeners.BackendLivenessListener
    public final native void onFailure(byte[] bArr, int i, String str, FaceHacknessResponseDTO faceHacknessResponseDTO);

    @Override // id.vida.liveness.listeners.BackendLivenessListener
    public final native void onSuccess(byte[] bArr, FaceHacknessResponseDTO faceHacknessResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = P0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3415 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1559, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -430812220, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -430812220};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 43042), TextUtils.indexOf("", "", 0) + 3111, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 518, TextUtils.getCapsMode("", 0, 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i4};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i6 = ~((-986570488) | startUptimeMillis);
                int i7 = ~startUptimeMillis;
                int i8 = i3 + (-737101950) + ((i6 | (~(718460971 | i7))) * (-1808)) + (((~((-717281316) | startUptimeMillis)) | (~(i7 | 987750143))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(startUptimeMillis | (-718460972))) | 269289172 | (~(986570487 | i7))) * TypedValues.Custom.TYPE_BOOLEAN);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                objArr = new Object[]{new int[1], new int[]{i5}, iArr, strArr};
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
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i14 = ~elapsedCpuTime;
                int i15 = i11 + (-464780922) + (((~((-1373221856) | i14)) | (~(1407169503 | elapsedCpuTime))) * (-831)) + ((~((-1075359901) | elapsedCpuTime)) * (-1662)) + (((~(elapsedCpuTime | 1373221855)) | (~(i14 | (-331809604))) | (~(331809603 | elapsedCpuTime))) * 831);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i13}, new int[]{i12}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(P0.class, new Object[0]);
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
                int i20 = -(598519478 * i18);
                int i21 = (i19 & i20) + (i19 | i20);
                int i22 = -(i18 * (-1514300850));
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = ((i23 | 889770500) << 1) - (889770500 ^ i23);
                int i25 = i24 >> 25;
                int i26 = ((i25 ^ (-255)) + ((i25 & (-255)) << 1)) / 128;
                int i27 = -(((i24 - (~((i26 & 1) + (i26 | 1)))) - 1) ^ ((((i24 >> 29) - 15) / 8) + 1));
                int i28 = (i27 & 3) + (i27 | 3);
                int i29 = i28 >> 17;
                int i30 = ((i29 & (-65535)) + (i29 | (-65535))) / 32768;
                int i31 = (i30 & 1) + (i30 | 1);
                Loader.l(((-1022647656) / (((-(((i31 | 1) << 1) - (i31 ^ 1))) & i28) * 2)) - 1759624747);
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
