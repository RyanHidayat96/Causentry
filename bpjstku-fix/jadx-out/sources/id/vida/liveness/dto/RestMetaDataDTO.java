package id.vida.liveness.dto;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class RestMetaDataDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("refId")
    private String f1099a;

    static {
        ClassLoader classLoader = RestMetaDataDTO.class.getClassLoader();
        try {
            Object[] objArr = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3413 - MotionEvent.axisFromString("")), 1559 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr2 = {"liveness", classLoader, false, -443220879, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr), -443220879};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 3111, (-16777194) - Color.rgb(0, 0, 0), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.red(0) + 518, 77 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Integer.TYPE});
            }
            Object[] objArr3 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2);
            int i = ((int[]) objArr3[1])[0];
            int i2 = ((int[]) objArr3[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr3[0])[0];
                int i4 = ((int[]) objArr3[2])[0];
                int i5 = ((int[]) objArr3[1])[0];
                String[] strArr = (String[]) objArr3[3];
                int iNextInt = new Random().nextInt();
                int i6 = i3 + 2048583942 + (((~(iNextInt | 174574042)) | (-1535110619)) * 305) + (((~((~iNextInt) | 174574042)) | (-1530457417)) * 305);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
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
                int i9 = ((int[]) objArr3[0])[0];
                int i10 = ((int[]) objArr3[2])[0];
                int i11 = ((int[]) objArr3[1])[0];
                String[] strArr3 = (String[]) objArr3[3];
                int iMyUid = Process.myUid();
                int i12 = ~iMyUid;
                int i13 = (-1101214134) + (((~((-779441230) | i12)) | 639713349 | (~((-925590230) | i12)) | (~(1065318109 | iMyUid))) * (-84));
                int i14 = (~(iMyUid | (-925590230))) | 779441229;
                int i15 = ~(i12 | 925590229);
                int i16 = i9 + i13 + ((i14 | i15) * (-84)) + (((-1065318110) | i15) * 84);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                Object[] objArr5 = {new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(RestMetaDataDTO.class, new Object[0]);
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
