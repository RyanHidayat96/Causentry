package id.vida.liveness;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n1 {
    public static native HandlerThread getNamedInDebugHandlerThread(String str, int i);

    public static native ThreadFactory getNamedInDebugThreadFactory(Class cls);

    public static native ThreadFactory getNamedInDebugThreadFactory(Class cls, int i);

    static {
        Object[] objArr;
        ClassLoader classLoader = n1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 3414), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1559, 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 481708337, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 481708337};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43042), 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 517 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 76), Integer.TYPE});
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
                int i7 = i3 + (-561898301) + (((~((-1163066446) | iMyPid)) | (~((-541965014) | i6))) * 217) + (((~(iMyPid | (-541965014))) | 4241477) * 217) + (((~((-1163066446) | i6)) | 541965013) * 217);
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
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i13 = i10 + (((~(startUptimeMillis | 1382334704)) * TypedValues.CycleType.TYPE_EASING) - 718146618) + (((~((~startUptimeMillis) | 1382334704)) | 304136240) * TypedValues.CycleType.TYPE_EASING);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(n1.class, new Object[0]);
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
                int i18 = -(823846626 * i16);
                int i19 = (i17 & i18) + (i17 | i18);
                int i20 = -(i16 * 714117878);
                int i21 = ((i19 ^ i20) + ((i20 & i19) << 1)) - 467437168;
                int i22 = i21 >> 20;
                int i23 = ((i22 ^ (-8191)) + ((i22 & (-8191)) << 1)) / 4096;
                int i24 = (i21 - (~((i23 ^ 1) + ((i23 & 1) << 1)))) - 1;
                int i25 = i21 >> 28;
                int i26 = ((i25 ^ (-31)) + ((i25 & (-31)) << 1)) / 16;
                int i27 = (-(i24 ^ ((i26 ^ 1) + ((i26 & 1) << 1)))) + 1;
                int i28 = i27 >> 16;
                int i29 = ((i28 ^ (-131071)) + ((i28 & (-131071)) << 1)) / 65536;
                int i30 = (i29 ^ 1) + ((i29 & 1) << 1);
                Loader.l(((-873467200) / ((i27 & (-((i30 ^ 1) + ((i30 & 1) << 1)))) * 5)) - 849893858);
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
