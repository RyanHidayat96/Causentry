package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: id.vida.liveness.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0744i0 {
    static {
        ClassLoader classLoader = AbstractC0744i0.class.getClassLoader();
        try {
            Object[] objArr = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getTouchSlop() >> 8)), 1559 - ExpandableListView.getPackedPositionType(0L), Color.red(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr2 = {"liveness", classLoader, false, -1867688828, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr), -1867688828};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 43043), 3111 - (Process.myPid() >> 22), 22 - ((Process.getThreadPriority(0) + 20) >> 6), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 518, ExpandableListView.getPackedPositionType(0L) + 76), Integer.TYPE});
            }
            Object[] objArr3 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2);
            int i = ((int[]) objArr3[1])[0];
            int i2 = ((int[]) objArr3[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr3[0])[0];
                int i4 = ((int[]) objArr3[2])[0];
                int i5 = ((int[]) objArr3[1])[0];
                String[] strArr = (String[]) objArr3[3];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i6 = ~startElapsedRealtime;
                int i7 = i3 + (((~((-1620456818) | i6)) | (~((-84574642) | startElapsedRealtime)) | (~(i6 | 84574641))) * 959) + 1579041874 + (((~(startElapsedRealtime | 84574641)) | (~(i6 | (-84574642))) | (~((-1620456818) | startElapsedRealtime))) * 959);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                Object[] objArr4 = {new int[1], new int[]{i5}, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr3[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i10 = ((int[]) objArr3[0])[0];
                int i11 = ((int[]) objArr3[2])[0];
                int i12 = ((int[]) objArr3[1])[0];
                String[] strArr3 = (String[]) objArr3[3];
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i13 = i10 + 33667774 + (((~((-654069655) | iFreeMemory)) | (-1056731039)) * (-502)) + ((~((~iFreeMemory) | (-5769235))) * (-502)) + (((~(iFreeMemory | (-1050961805))) | (-654069655)) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i14 = (i13 << 13) ^ i13;
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                Object[] objArr5 = {new int[1], new int[]{i12}, new int[]{i11}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(AbstractC0744i0.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
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
