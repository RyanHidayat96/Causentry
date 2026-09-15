package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import id.vida.liveness.dto.ValidateResponseDTO;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import liveness.Loader;
import liveness.Value;

/* JADX INFO: renamed from: id.vida.liveness.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0769v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f1186a;
    public Deferred b;
    public Deferred c;

    private static native Object[] $liveness$B0d266f33(CoroutineContext coroutineContext);

    private static native Object[] $liveness$Bc5f66510(CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker);

    private static native Object[] $liveness$Bfb92b1c3();

    private static native void $liveness$E0d266f33(Object obj, Object obj2);

    private static native void $liveness$Ec5f66510(Object obj, Object obj2);

    private static native void $liveness$Efb92b1c3(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public C0769v() {
        Object[] objArr$liveness$Bfb92b1c3 = $liveness$Bfb92b1c3();
        this((CoroutineContext) objArr$liveness$Bfb92b1c3[0], ((Value) objArr$liveness$Bfb92b1c3[1]).i, null);
        $liveness$Efb92b1c3(this, objArr$liveness$Bfb92b1c3);
    }

    public C0769v(CoroutineContext coroutineContext) {
        $liveness$E0d266f33(this, $liveness$B0d266f33(coroutineContext));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0769v(CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object[] objArr$liveness$Bc5f66510 = $liveness$Bc5f66510(coroutineContext, i, defaultConstructorMarker);
        this((CoroutineContext) objArr$liveness$Bc5f66510[1]);
        $liveness$Ec5f66510(this, objArr$liveness$Bc5f66510);
    }

    public static final native /* synthetic */ Deferred access$getConfigDeferred$p(C0769v c0769v);

    public static final native /* synthetic */ Deferred access$getTokenDeferred$p(C0769v c0769v);

    public final native Object applyPrefetchedData(r1 r1Var, Continuation<? super Boolean> continuation);

    public final native void clearCache();

    public final native Object fetchSDKConfigSuspend(r1 r1Var, C0724b1 c0724b1, Continuation<? super SDKConfigResponseDTO> continuation);

    public final native Object fetchTokenSuspend(r1 r1Var, C0724b1 c0724b1, Continuation<? super ValidateResponseDTO> continuation);

    public final native void prefetchAuth(r1 r1Var, C0724b1 c0724b1);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0769v.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 3414), 1558 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, -1023369786, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), -1023369786};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - TextUtils.indexOf("", "", 0, 0)), 3111 - TextUtils.getCapsMode("", 0, 0), 22 - TextUtils.getOffsetBefore("", 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 518 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i6 = i3 + 365681771 + (((~(iFreeMemory | 1188869861)) | (-516161598)) * (-465)) + ((1188869861 | (~((-516161598) | iFreeMemory))) * 930) + ((iFreeMemory | (-402653209)) * 465);
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
                int i12 = (int) Runtime.getRuntime().totalMemory();
                int i13 = ~i12;
                int i14 = i9 + (((~(i13 | 936064200)) | (~((-768967259) | i13)) | 135561746) * (-397)) + 1808616610 + ((i12 | 438220434) * 397);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0769v.class, new Object[0]);
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
                int i18 = ((i17 * i17) - (~(-(610123395 * i17)))) - 1;
                int i19 = -(i17 * 1421651881);
                int i20 = ((i18 ^ i19) + ((i19 & i18) << 1)) - (-169244132);
                int i21 = i20 >> 26;
                int i22 = (((i21 ^ ComposerKt.defaultsKey) + ((i21 & ComposerKt.defaultsKey) << 1)) / 64) + 1;
                int i23 = (i20 ^ i22) + ((i22 & i20) << 1);
                int i24 = i20 >> 27;
                int i25 = (((i24 | (-63)) << 1) - (i24 ^ (-63))) / 32;
                int i26 = (-(i23 ^ (((i25 | 1) << 1) - (i25 ^ 1)))) + 5;
                int i27 = i26 >> 29;
                int i28 = (((i27 | (-15)) << 1) - (i27 ^ (-15))) / 8;
                int i29 = (i28 & 1) + (i28 | 1);
                Loader.l((1550414410 / ((i26 & (-(((i29 | 1) << 1) - (i29 ^ 1)))) * 2)) + 1512709953);
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
