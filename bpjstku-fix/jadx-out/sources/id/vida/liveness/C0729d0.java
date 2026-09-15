package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import defpackage.initSession;
import id.vida.liveness.dto.FaceHacknessResponseDTO;
import id.vida.liveness.dto.VidaBackendLivenessRequest;
import id.vida.liveness.listeners.APIResponseListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import liveness.Loader;
import org.json.JSONObject;

/* JADX INFO: renamed from: id.vida.liveness.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C0729d0 extends AbstractC0775y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0729d0 f1089a;

    private static /* synthetic */ Runnable $liveness$C985b4507(final C0729d0 c0729d0, final VolleyError volleyError, final APIResponseListener aPIResponseListener) {
        return new Runnable() { // from class: id.vida.liveness.d0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(volleyError, aPIResponseListener);
            }
        };
    }

    private static /* synthetic */ Response.ErrorListener $liveness$Cda4d33cd(final C0729d0 c0729d0, final APIResponseListener aPIResponseListener) {
        return new Response.ErrorListener() { // from class: id.vida.liveness.d0$$ExternalSyntheticLambda2
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                this.f$0.a(aPIResponseListener, volleyError);
            }
        };
    }

    private static /* synthetic */ Response.Listener $liveness$Cdb591038(final C0729d0 c0729d0, final APIResponseListener aPIResponseListener, final Gson gson) {
        return new Response.Listener() { // from class: id.vida.liveness.d0$$ExternalSyntheticLambda1
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                this.f$0.a(aPIResponseListener, gson, (JSONObject) obj);
            }
        };
    }

    private static /* synthetic */ Runnable $liveness$Cdb95b718(final C0729d0 c0729d0, final JSONObject jSONObject, final APIResponseListener aPIResponseListener, final Gson gson) {
        return new Runnable() { // from class: id.vida.liveness.d0$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(jSONObject, aPIResponseListener, gson);
            }
        };
    }

    public C0729d0(Context context) {
        super(context);
    }

    public static native C0729d0 getInstance(Context context);

    public final native /* synthetic */ void a(VolleyError volleyError, APIResponseListener aPIResponseListener);

    public final native /* synthetic */ void a(APIResponseListener aPIResponseListener, VolleyError volleyError);

    public final native /* synthetic */ void a(APIResponseListener aPIResponseListener, Gson gson, JSONObject jSONObject);

    public final native /* synthetic */ void a(JSONObject jSONObject, APIResponseListener aPIResponseListener, Gson gson);

    public final native void verify(String str, VidaBackendLivenessRequest vidaBackendLivenessRequest, APIResponseListener<FaceHacknessResponseDTO> aPIResponseListener);

    static {
        Object[] objArr;
        ClassLoader classLoader = C0729d0.class.getClassLoader();
        try {
            Object[] objArr2 = {1257092341};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (3414 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.indexOf("", "") + 1559, Color.green(0) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {"liveness", classLoader, false, 1867307191, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr2), 1867307191};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43042 - KeyEvent.keyCodeFromString("")), 3111 - TextUtils.getOffsetBefore("", 0), AndroidCharacter.getMirror('0') - 26, -675216362, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getEdgeSlop() >> 16), 518 - View.resolveSize(0, 0), 76 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Integer.TYPE});
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
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i6 = ~iMaxMemory;
                int i7 = ~((-766910052) | i6);
                int i8 = ~((-938121408) | iMaxMemory);
                int i9 = i3 + 564486596 + ((i7 | i8) * 1150) + ((i8 | (~(938121407 | i6))) * (-575)) + (((~(iMaxMemory | (-766910052))) | (~(i6 | 766910051))) * 575);
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
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
                int i12 = ((int[]) objArr4[0])[0];
                int i13 = ((int[]) objArr4[2])[0];
                int i14 = ((int[]) objArr4[1])[0];
                String[] strArr3 = (String[]) objArr4[3];
                int i15 = ~new Random().nextInt(355755807);
                int i16 = i12 + (-1993589826) + ((~((-1081473) | i15)) * (-783)) + (((~(i15 | 865023359)) | (-840008100)) * 783);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr[0])[0] = i18 ^ (i18 << 5);
                objArr = new Object[]{new int[1], new int[]{i14}, new int[]{i13}, strArr3};
            }
            try {
                Class<?> cls = Class.forName("java.lang.Runtime");
                Class<?> cls2 = Class.forName("java.lang.ClassLoader");
                Class<?> cls3 = Class.forName("java.lang.String");
                Object objInvoke = cls.getMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
                Object objInvoke2 = Class.forName("java.lang.Class").getMethod("getClassLoader", new Class[0]).invoke(C0729d0.class, new Object[0]);
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
                int i21 = -(1527381578 * i19);
                int i22 = (i20 & i21) + (i20 | i21);
                int i23 = -(i19 * (-1366960320));
                int i24 = ((i22 & i23) + (i23 | i22)) - 40715367;
                int i25 = i24 >> 15;
                int i26 = ((i25 & (-262143)) + (i25 | (-262143))) / 131072;
                int i27 = (i26 & 1) + (i26 | 1);
                int i28 = (i24 ^ i27) + ((i27 & i24) << 1);
                int i29 = ((i24 >> 17) - 65535) / 32768;
                int i30 = -(i28 ^ ((i29 & 1) + (i29 | 1)));
                int i31 = (i30 & 5) + (i30 | 5);
                int i32 = i31 >> 18;
                int i33 = (((i32 | (-32767)) << 1) - (i32 ^ (-32767))) / 16384;
                int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
                Loader.l((1572187310 / (((-(((i34 | 1) << 1) - (i34 ^ 1))) & i31) * 2)) + 523402613);
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
