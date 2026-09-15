package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import liveness.Loader;

/* JADX INFO: renamed from: id.vida.liveness.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0755o extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1148a;
    public r1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0769v d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0755o(C0769v c0769v, Continuation continuation) {
        super(continuation);
        this.d = c0769v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final native Object invokeSuspend(Object obj);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0755o.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-16773802) - Color.rgb(0, 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1558, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 721885637, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 721885637};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 43042), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110, 21 - Process.getGidForName(""), -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), 517 - Process.getGidForName(""), TextUtils.indexOf("", "", 0) + 76), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i6 = i3 + (((~(elapsedCpuTime | 1069565361)) | 635466097) * 56) + 596800674 + (((~((~elapsedCpuTime) | 635466097)) | 1069565361) * 56);
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
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i12 = i9 + 127993010 + ((~((~iFreeMemory) | (-286164481))) * 433) + (((~((-781261018) | iFreeMemory)) | (-923770442)) * (-433)) + (((~(iFreeMemory | (-923770442))) | (-1067425498)) * 433);
                int i13 = (i12 << 13) ^ i12;
                int i14 = i13 ^ (i13 >>> 17);
                ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, new int[]{i10}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0755o.class, new Object[0]);
                if (Build.VERSION.SDK_INT <= 24) {
                    Method declaredMethod = cls.getDeclaredMethod("loadLibrary", cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(objInvoke, "liveness", objInvoke2);
                } else {
                    Method declaredMethod2 = cls.getDeclaredMethod("loadLibrary0", cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(objInvoke, objInvoke2, "liveness");
                }
                int i15 = ((int[]) objArr[0])[0];
                int i16 = i15 * i15;
                int i17 = -(1285739597 * i15);
                int i18 = (i16 & i17) + (i16 | i17);
                int i19 = -(i15 * (-2032277895));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = ((i20 | 1821447241) << 1) - (1821447241 ^ i20);
                int i22 = i21 >> 20;
                int i23 = (((i22 | (-8191)) << 1) - (i22 ^ (-8191))) / 4096;
                int i24 = (i21 - (~((i23 & 1) + (i23 | 1)))) - 1;
                int i25 = i21 >> 22;
                int i26 = (-(i24 ^ (((((i25 | (-2047)) << 1) - (i25 ^ (-2047))) / 1024) + 1))) + 5;
                int i27 = ((i26 >> 19) - 16383) / 8192;
                int i28 = (i27 & 1) + (i27 | 1);
                Loader.l((1456321030 / ((i26 & (-(((i28 | 1) << 1) - (i28 ^ 1)))) * 2)) + 1996944591);
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
