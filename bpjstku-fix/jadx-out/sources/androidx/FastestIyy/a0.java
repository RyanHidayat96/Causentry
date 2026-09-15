package androidx.FastestIyy;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f274a;
    public final C0189t b = new C0189t();

    public a0(Context context) {
        this.f274a = context;
        synchronized (AbstractC0191u.class) {
            if (!AbstractC0191u.f300a) {
                new C0192v(context).a();
                new A(context).a();
                new E(context).a();
                new P(context).a();
                new U(context).a();
                new V(context).a();
                new M(context).a();
                new C0204z(context).a();
                new H(context).a();
                AbstractC0191u.f300a = true;
            }
        }
    }

    public static InvocationHandler a(final b0 b0Var) {
        return new InvocationHandler() { // from class: androidx.FastestIyy.a0$$ExternalSyntheticLambda0
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return a0.a(b0Var, obj, method, objArr);
            }
        };
    }

    public static Object a(b0 b0Var, Object obj, Method method, Object[] objArr) {
        try {
            Object objA = b0Var.a(new JSONArray(obj.toString()));
            JSONObject jSONObject = new JSONObject();
            try {
                if (objA == null) {
                    jSONObject.put("result", JSONObject.NULL);
                } else {
                    jSONObject.put("result", objA);
                }
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        } catch (Error | Exception e2) {
            String string = e2.toString();
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (string == null) {
                    jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, JSONObject.NULL);
                } else {
                    jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, string);
                }
            } catch (JSONException unused2) {
            }
            return jSONObject2.toString();
        }
    }

    public static void a(int i, b0 b0Var) {
        i0.a();
        InvocationHandler invocationHandlerA = a(b0Var);
        n0.a();
        n0.f292a.barcelona_aging(i, invocationHandlerA, 100, false);
    }
}
