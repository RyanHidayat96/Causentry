package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import liveness.Loader;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes7.dex */
public final class k1 implements InterfaceC0776y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1139a;
    public final HashMap b;

    private static native Object[] $liveness$B607383bd();

    private static native void $liveness$E607383bd(Object obj, Object obj2);

    public k1() {
        $liveness$E607383bd(this, $liveness$B607383bd());
    }

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native void beginCollection(Context context);

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native Map<String, String> endCollection();

    @Override // id.vida.liveness.InterfaceC0776y0
    public final native String name();

    static {
        Object[] objArr;
        ClassLoader classLoader = k1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - Color.argb(0, 0, 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 1560, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 640297773, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 640297773};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43041 - Process.getGidForName("")), 3111 - (Process.myTid() >> 22), 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 518, 76 - (ViewConfiguration.getTapTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int[] iArr = {i5};
                int i6 = (int) Runtime.getRuntime().totalMemory();
                int i7 = (-1105839102) + (((~((-90556045) | i6)) | 2146436 | (~((-1614475415) | i6))) * (-880));
                int i8 = (~((-90556045) | (~i6))) | 1614475414;
                int i9 = ~(i6 | 90556044);
                int i10 = i3 + i7 + ((i8 | i9) * (-880)) + (i9 * 880);
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr4[3];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                int i13 = ((int[]) objArr4[0])[0];
                int i14 = ((int[]) objArr4[2])[0];
                int i15 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i16 = ~startElapsedRealtime;
                int i17 = i13 + (-1641410398) + ((67798668 | i16) * (-192)) + (((~((-955590740) | i16)) | 681642051) * (-384)) + (((~(startElapsedRealtime | 1023389407)) | (~(i16 | (-273948689))) | (~((-681642052) | startElapsedRealtime))) * DerHeader.TAG_CLASS_PRIVATE);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                objArr = new Object[]{new int[1], new int[]{i15}, new int[]{i14}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(k1.class, new Object[0]);
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
                int i21 = ((i20 * i20) - (~(-(624595455 * i20)))) - 1;
                int i22 = -(i20 * (-1689153407));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = (i23 & 1881772032) + (1881772032 | i23);
                int i25 = i24 >> 24;
                int i26 = (((i25 | (-511)) << 1) - (i25 ^ (-511))) / 256;
                int i27 = (i24 - (~((i26 & 1) + (i26 | 1)))) - 1;
                int i28 = i24 >> 18;
                int i29 = ((i28 & (-32767)) + (i28 | (-32767))) / 16384;
                int i30 = -(i27 ^ ((i29 & 1) + (i29 | 1)));
                int i31 = ((i30 | 6) << 1) - (i30 ^ 6);
                int i32 = i31 >> 16;
                int i33 = ((i32 & (-131071)) + (i32 | (-131071))) / 65536;
                Loader.l(((-2082099432) / (((-(((i33 & 1) + (i33 | 1)) + 1)) & i31) * 2)) - 1621028567);
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
