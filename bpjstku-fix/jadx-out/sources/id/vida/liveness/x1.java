package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class x1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f1195a;
    public final TextView b;

    private static native Object[] $liveness$B365df306(View view);

    private static native void $liveness$E365df306(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public x1(View view) {
        Object[] objArr$liveness$B365df306 = $liveness$B365df306(view);
        super((View) objArr$liveness$B365df306[2]);
        $liveness$E365df306(this, objArr$liveness$B365df306);
    }

    static {
        Object[] objArr;
        ClassLoader classLoader = x1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1558 - Process.getGidForName(""), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1918713624, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1918713624};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043), 3110 - TextUtils.lastIndexOf("", '0', 0), 22 - Color.alpha(0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), MotionEvent.axisFromString("") + 519, 75 - ExpandableListView.getPackedPositionChild(0L)), Integer.TYPE});
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
                int i7 = i3 + (-1853868561) + (((~((-146868294) | i6)) | (~((-67241097) | iMyPid)) | (~((-1344053777) | iMyPid))) * 765) + ((146868293 | (~((-214109390) | i6))) * 1530) + (((~((-214109390) | iMyPid)) | (~(i6 | (-1344053777)))) * 765);
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i13 = (~((-1239394866) | iMaxMemory)) | 163645489;
                int i14 = ~((~iMaxMemory) | 1541385969);
                int i15 = i10 + 1308999960 + ((i13 | i14) * (-470)) + (((~(iMaxMemory | (-1075749377))) | i14) * 470);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, iArr, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(x1.class, new Object[0]);
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
                int i20 = -(1830477665 * i18);
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                int i22 = -(i18 * 1977848467);
                int i23 = (((i21 | i22) << 1) - (i22 ^ i21)) - (-1220170788);
                int i24 = i23 >> 24;
                int i25 = i24 & (-511);
                int i26 = (((i24 ^ (-511)) + (i25 << 1)) / 256) + 1;
                int i27 = (i25 + (i24 | (-511))) / 256;
                int i28 = -(((i27 & 1) + (i27 | 1)) ^ ((i23 & i26) + (i23 | i26)));
                int i29 = (i28 ^ 3) + ((i28 & 3) << 1);
                int i30 = i29 >> 19;
                int i31 = ((i30 ^ (-16383)) + ((i30 & (-16383)) << 1)) / 8192;
                int i32 = (i31 & 1) + (i31 | 1);
                Loader.l(((-1025900604) / (((-((i32 & 1) + (i32 | 1))) & i29) * 2)) - 1273236724);
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
