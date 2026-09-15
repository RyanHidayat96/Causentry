package id.vida.liveness;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class J implements InterfaceC0776y0 {
    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = J.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3414), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1559, 23 - MotionEvent.axisFromString(""), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1074790999, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1074790999};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112, ExpandableListView.getPackedPositionGroup(0L) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.lastIndexOf("", '0', 0) + 519, TextUtils.indexOf((CharSequence) "", '0') + 77), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~new Random().nextInt(272007768);
                int i7 = i3 + (-1379992433) + ((~((-5261443) | i6)) * (-783)) + (((~(i6 | 1001371488)) | (-703659971)) * 783);
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
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i13 = (-2129277590) + ((startElapsedRealtime | 298776563) * (-50));
                int i14 = ~((-297842468) | startElapsedRealtime);
                int i15 = ~startElapsedRealtime;
                int i16 = i10 + i13 + ((i14 | (~((-1108412429) | i15))) * 50) + (((~(i15 | 298776563)) | (~((-1406254896) | i15)) | 1108412428) * 50);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], iArr2, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(J.class, new Object[0]);
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
                int i21 = -(1162200759 * i19);
                int i22 = ((((i20 | i21) << 1) - (i20 ^ i21)) - (~(-(i19 * 1576690947)))) - 1;
                int i23 = (i22 & 807272649) + (807272649 | i22);
                int i24 = i23 >> 16;
                int i25 = ((i24 & (-131071)) + (i24 | (-131071))) / 65536;
                int i26 = (i23 - (~(((i25 | 1) << 1) - (i25 ^ 1)))) - 1;
                int i27 = i23 >> 20;
                int i28 = (((i27 | (-8191)) << 1) - (i27 ^ (-8191))) / 4096;
                int i29 = -(i26 ^ ((i28 ^ 1) + ((i28 & 1) << 1)));
                int i30 = (i29 & 1) + (i29 | 1);
                int i31 = i30 >> 26;
                int i32 = (((i31 | ComposerKt.defaultsKey) << 1) - (i31 ^ ComposerKt.defaultsKey)) / 64;
                int i33 = (i32 ^ 1) + ((i32 & 1) << 1);
                Loader.l(((-1204873376) / (((-((i33 & 1) + (i33 | 1))) & i30) * 7)) - 1322789061);
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
