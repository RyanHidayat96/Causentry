package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class T0 implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f1056a;

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = T0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 3414), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1559, 24 - Gravity.getAbsoluteGravity(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 2126046496, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 2126046496};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.alpha(0) + 43042), 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), 519 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 76 - Drawable.resolveOpacity(0, 0)), Integer.TYPE});
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
                int i6 = ~((int) Process.getStartElapsedRealtime());
                int i7 = i3 + 1350445911 + ((~((-84935763) | i6)) * (-783)) + (((~(i6 | 1617719976)) | (-87311483)) * 783);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
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
                int i10 = ((int[]) objArr4[0])[0];
                int i11 = ((int[]) objArr4[2])[0];
                int i12 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int[] iArr2 = {i11};
                int iMyUid = Process.myUid();
                int i13 = i10 + (-2011813634) + (((~((-1588882759) | iMyUid)) | (-1593601503)) * (-502)) + ((~((~iMyUid) | (-1477452803))) * (-502)) + (((~(iMyUid | (-116148701))) | (-1588882759)) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                objArr = new Object[]{new int[1], new int[]{i12}, iArr2, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(T0.class, new Object[0]);
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
                int i17 = ((i16 * i16) - (~(-(1392658481 * i16)))) - 1;
                int i18 = -(i16 * (-1793246483));
                int i19 = (i17 & i18) + (i18 | i17);
                int i20 = (i19 ^ (-652546591)) + (((-652546591) & i19) << 1);
                int i21 = (((i20 >> 20) - 8191) / 4096) + 1;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = i20 >> 23;
                int i24 = (((i23 | (-1023)) << 1) - (i23 ^ (-1023))) / 512;
                int i25 = (-(((i24 ^ 1) + ((i24 & 1) << 1)) ^ i22)) + 1;
                int i26 = i25 >> 22;
                int i27 = ((((i26 | (-2047)) << 1) - (i26 ^ (-2047))) / 1024) + 1;
                Loader.l(((-1181250560) / ((i25 & (-(((i27 | 1) << 1) - (i27 ^ 1)))) * 7)) - 1074615810);
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
