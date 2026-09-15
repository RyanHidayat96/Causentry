package id.vida.liveness;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.android.volley.toolbox.HurlStack;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import liveness.Loader;

/* JADX INFO: loaded from: classes7.dex */
public final class A1 extends HurlStack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1 f1010a;

    private static native Object[] $liveness$B3dfa3366(B1 b1, SSLSocketFactory sSLSocketFactory);

    private static /* synthetic */ HostnameVerifier $liveness$Cc0195839(final A1 a1, final URL url) {
        return new HostnameVerifier() { // from class: id.vida.liveness.A1$$ExternalSyntheticLambda0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return this.f$0.a(url, str, sSLSession);
            }
        };
    }

    private static native void $liveness$E3dfa3366(Object obj, Object obj2);

    /* JADX WARN: Illegal instructions before constructor call */
    public A1(B1 b1, SSLSocketFactory sSLSocketFactory) {
        this.f1010a = b1;
        Object[] objArr$liveness$B3dfa3366 = $liveness$B3dfa3366(b1, sSLSocketFactory);
        super((HurlStack.UrlRewriter) objArr$liveness$B3dfa3366[1], (SSLSocketFactory) objArr$liveness$B3dfa3366[2]);
        $liveness$E3dfa3366(this, objArr$liveness$B3dfa3366);
    }

    public final native /* synthetic */ boolean a(URL url, String str, SSLSession sSLSession);

    @Override // com.android.volley.toolbox.HurlStack
    public final native HttpsURLConnection createConnection(URL url) throws IOException;

    static {
        Object[] objArr;
        ClassLoader classLoader = A1.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3415 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1558 - ExpandableListView.getPackedPositionChild(0L), 24 - View.MeasureSpec.makeMeasureSpec(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1046512470, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1046512470};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 43042), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3110, TextUtils.indexOf("", "", 0, 0) + 22, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 519, 76 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Integer.TYPE});
            }
            Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            int i = ((int[]) objArr4[1])[0];
            int i2 = ((int[]) objArr4[2])[0];
            if (i2 == i) {
                int i3 = ((int[]) objArr4[0])[0];
                int i4 = ((int[]) objArr4[2])[0];
                int i5 = ((int[]) objArr4[1])[0];
                String[] strArr = (String[]) objArr4[3];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i6 = i3 + ((((-578370750) + (((~((-423432532) | iUptimeMillis)) | 136380739) * 1504)) + ((~(iUptimeMillis | (-287051793))) * (-1504))) - 969766336);
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
                int iMyTid = Process.myTid();
                int i12 = i9 + 475418962 + (((~((-783532790) | iMyTid)) | 648069157) * 104) + ((~((~iMyTid) | 1056962301)) * (-104)) + ((iMyTid | 921498669) * 104);
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
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(A1.class, new Object[0]);
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
                int i16 = ((((i15 * i15) - (~(-(719906288 * i15)))) - 1) - (~(-(i15 * 1409901534)))) - 1;
                int i17 = ((i16 | (-1716533135)) << 1) - ((-1716533135) ^ i16);
                int i18 = i17 >> 28;
                int i19 = ((i18 & (-31)) + (i18 | (-31))) / 16;
                int i20 = ((i19 | 1) << 1) - (i19 ^ 1);
                int i21 = (i17 ^ i20) + ((i20 & i17) << 1);
                int i22 = i17 >> 17;
                int i23 = ((i22 ^ (-65535)) + ((i22 & (-65535)) << 1)) / 32768;
                int i24 = -(((i23 & 1) + (i23 | 1)) ^ i21);
                int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                int i26 = ((i25 >> 15) - 262143) / 131072;
                Loader.l(((-347683184) / (((-(((i26 & 1) + (i26 | 1)) + 1)) & i25) * 2)) - 1946459730);
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
