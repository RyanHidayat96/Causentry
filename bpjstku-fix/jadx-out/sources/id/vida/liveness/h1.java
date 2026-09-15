package id.vida.liveness;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1130a;
    public float b;
    public float c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1131e;
    public float f;
    public int g;
    public float h;

    private static native Object[] $liveness$Bad90e508(String str);

    private static native void $liveness$Ead90e508(Object obj, Object obj2);

    public h1(String str) {
        $liveness$Ead90e508(this, $liveness$Bad90e508(str));
    }

    public final native void update(float f);

    public final native void writeResultsToMap(Map<String, Float> map);

    static {
        Object[] objArr;
        ClassLoader classLoader = h1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 3415), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1559, 24 - View.MeasureSpec.getMode(0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1944284760, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1944284760};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3110, Process.getGidForName("") + 23, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionGroup(0L), 517 - TextUtils.lastIndexOf("", '0', 0), 76 - TextUtils.getOffsetAfter("", 0)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int i6 = ~((int) Process.getElapsedCpuTime());
                int i7 = i3 + 70026785 + ((~((-89961729) | i6)) * (-783)) + (((~(i6 | 807535122)) | (-897496337)) * 783);
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
                int i13 = ~iMyPid;
                int i14 = (-728007700) + (((~(861342743 | i13)) | 566024) * (-1188));
                int i15 = (~(iMyPid | (-861342744))) | 566024;
                int i16 = ~(843688715 | i13);
                int i17 = i10 + i14 + ((i15 | i16) * 594) + (((~((-861342744) | i13)) | 18220052 | i16) * 594);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(h1.class, new Object[0]);
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
                int i21 = ((i20 * i20) - (~(-(1930249665 * i20)))) - 1;
                int i22 = -(i20 * (-1632790235));
                int i23 = ((i21 ^ i22) + ((i22 & i21) << 1)) - 854397527;
                int i24 = i23 >> 22;
                int i25 = ((i24 & (-2047)) + (i24 | (-2047))) / 1024;
                int i26 = ((i25 | 1) << 1) - (i25 ^ 1);
                int i27 = (i23 & i26) + (i26 | i23);
                int i28 = i23 >> 17;
                int i29 = -(i27 ^ ((((i28 ^ (-65535)) + ((i28 & (-65535)) << 1)) / 32768) + 1));
                int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
                int i31 = i30 >> 29;
                int i32 = (((i31 | (-15)) << 1) - (i31 ^ (-15))) / 8;
                Loader.l(((-492616971) / (((-(((i32 ^ 1) + ((i32 & 1) << 1)) + 1)) & i30) * 3)) - 1057060358);
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
