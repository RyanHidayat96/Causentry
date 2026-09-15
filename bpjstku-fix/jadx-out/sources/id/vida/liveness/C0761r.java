package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import id.vida.liveness.dto.SDKConfigResponseDTO;
import id.vida.liveness.listeners.APIResponseListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlinx.coroutines.CancellableContinuationImpl;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0761r implements APIResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f1158a;

    public C0761r(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f1158a = cancellableContinuationImpl;
    }

    @Override // id.vida.liveness.listeners.APIResponseListener
    public final native void onError(int i, String str);

    @Override // id.vida.liveness.listeners.APIResponseListener
    public final native void onResponse(SDKConfigResponseDTO sDKConfigResponseDTO);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0761r.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3413), 1559 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0, 0) + 25, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 103664058, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 103664058};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - View.combineMeasuredStates(0, 0)), TextUtils.getTrimmedLength("") + 3111, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 518 - View.getDefaultSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i6 = ~iElapsedRealtime;
                int i7 = i3 + 1556967732 + (((~((-961299900) | i6)) | 743731559) * 519) + (((~(i6 | (-285738137))) | (~(1029469695 | iElapsedRealtime))) * (-519)) + (((~(iElapsedRealtime | 743731559)) | 961299899) * 519);
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
                int i13 = ~Process.myPid();
                int i14 = i10 + (-825869306) + (((-555483793) | i13) * 494) + (((~(i13 | 1111731279)) | (-1629398685)) * 494);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0761r.class, new Object[0]);
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
                int i19 = -(1730407954 * i17);
                int i20 = (((i18 ^ i19) + ((i18 & i19) << 1)) - (~(-(i17 * (-1767149382))))) - 1;
                int i21 = ((i20 | 1782619300) << 1) - (1782619300 ^ i20);
                int i22 = (((i21 >> 22) - 2047) / 1024) + 1;
                int i23 = (i21 & i22) + (i22 | i21);
                int i24 = ((i21 >> 18) - 32767) / 16384;
                int i25 = (-(i23 ^ ((i24 & 1) + (i24 | 1)))) + 3;
                int i26 = i25 >> 21;
                int i27 = ((i26 & (-4095)) + (i26 | (-4095))) / 2048;
                int i28 = ((i27 | 1) << 1) - (i27 ^ 1);
                Loader.l((999148806 / ((i25 & (-(((i28 | 1) << 1) - (i28 ^ 1)))) * 2)) + 962795807);
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
