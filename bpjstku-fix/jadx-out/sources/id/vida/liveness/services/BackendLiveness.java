package id.vida.liveness.services;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.C0724b1;
import id.vida.liveness.C0769v;
import id.vida.liveness.dto.FaceHacknessResponseDTO;
import id.vida.liveness.dto.VidaLivenessRequest;
import id.vida.liveness.listeners.BackendLivenessListener;
import id.vida.liveness.r1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class BackendLiveness {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0769v f1167a;
    public r1 b;
    public final C0724b1 c;

    private static native Object[] $liveness$Bc7be5a69(Context context);

    private static /* synthetic */ Runnable $liveness$C153bee3b(final BackendLiveness backendLiveness, final String str, final BackendLivenessListener backendLivenessListener, final Activity activity, final VidaLivenessRequest vidaLivenessRequest) {
        return new Runnable() { // from class: id.vida.liveness.services.BackendLiveness$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, backendLivenessListener, activity, vidaLivenessRequest);
            }
        };
    }

    private static /* synthetic */ Function2 $liveness$C7e957e62(final BackendLiveness backendLiveness) {
        return new Function2() { // from class: id.vida.liveness.services.BackendLiveness$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.f$0.a((CoroutineScope) obj, (Continuation) obj2);
            }
        };
    }

    private static native void $liveness$Ec7be5a69(Object obj, Object obj2);

    public BackendLiveness(Context context) {
        $liveness$Ec7be5a69(this, $liveness$Bc7be5a69(context));
    }

    public final native /* synthetic */ Object a(CoroutineScope coroutineScope, Continuation continuation);

    public final native void a(int i, r1 r1Var);

    public final native void a(r1 r1Var, int i, String str);

    public final native void a(r1 r1Var, FaceHacknessResponseDTO faceHacknessResponseDTO);

    public final native /* synthetic */ void a(String str, BackendLivenessListener backendLivenessListener, Activity activity, VidaLivenessRequest vidaLivenessRequest);

    public final native void execute(Activity activity, VidaLivenessRequest vidaLivenessRequest, String str, BackendLivenessListener backendLivenessListener);

    public final native void prefetchAuth(Activity activity, VidaLivenessRequest vidaLivenessRequest);

    static {
        Object[] objArr;
        ClassLoader classLoader = BackendLiveness.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - TextUtils.indexOf((CharSequence) "", '0')), 1559 - KeyEvent.normalizeMetaState(0), 24 - TextUtils.indexOf("", "", 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1352290007, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1352290007};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43042), View.MeasureSpec.getMode(0) + 3111, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), View.getDefaultSize(0, 0) + 518, 76 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Integer.TYPE});
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
                int i7 = i3 + 613863418 + (((~(870280922 | i6)) | 834750536) * (-756)) + (((~i6) | 870280922) * 756);
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
                int[] iArr = {i11};
                int[] iArr2 = {i12};
                int iMyPid = Process.myPid();
                int i13 = ~iMyPid;
                int i14 = (-784592542) + (((~((-27314214) | i13)) | (~(1139206197 | iMyPid))) * 520);
                int i15 = ~((-1139206198) | i13);
                int i16 = ~(iMyPid | 565825261);
                int i17 = i10 + i14 + ((i15 | i16) * (-1040)) + ((i16 | (~(i13 | (-565825262))) | 1111891984) * 520);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(BackendLiveness.class, new Object[0]);
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
                int i21 = ((i20 * i20) - (~(-(1768022367 * i20)))) - 1;
                int i22 = -(i20 * 656169189);
                int i23 = (((i21 | i22) << 1) - (i22 ^ i21)) - (-2047654020);
                int i24 = i23 >> 20;
                int i25 = ((i24 & (-8191)) + (i24 | (-8191))) / 4096;
                int i26 = (i25 & 1) + (i25 | 1);
                int i27 = (i23 & i26) + (i26 | i23);
                int i28 = i23 >> 19;
                int i29 = (((i28 | (-16383)) << 1) - (i28 ^ (-16383))) / 8192;
                int i30 = -(((i29 ^ 1) + ((i29 & 1) << 1)) ^ i27);
                int i31 = (i30 ^ 2) + ((i30 & 2) << 1);
                int i32 = i31 >> 18;
                int i33 = ((i32 & (-32767)) + (i32 | (-32767))) / 16384;
                Loader.l(((-619019688) / (((-(((i33 & 1) + (i33 | 1)) + 1)) & i31) * 2)) - 1246901009);
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
