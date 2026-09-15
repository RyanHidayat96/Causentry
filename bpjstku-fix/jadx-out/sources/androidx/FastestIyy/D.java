package androidx.FastestIyy;

import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class D {
    public static Object a(String str, Object obj) {
        final AtomicReference atomicReference = new AtomicReference();
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stat_id", str);
        } catch (JSONException unused) {
        }
        ((i0) cA).a("com.zimperium.zdefendx.stat.retrieve", jSONObject.toString(), new j0() { // from class: androidx.FastestIyy.D$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.j0
            public final void a(String str2) {
                atomicReference.set(str2);
            }
        });
        String str2 = (String) atomicReference.get();
        if (str2 == null) {
            str2 = "{}";
        }
        return J.a(J.a(str2).f263a, "stat_value", obj);
    }

    public static /* synthetic */ void a(String str) {
    }

    public static /* synthetic */ void b(String str) {
    }

    public static /* synthetic */ void c(String str) {
    }

    public static void d(String str) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.zimperium.zdd.rule_level", str);
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("_db", "advcfg");
        } catch (JSONException unused2) {
        }
        ((i0) cA).a("com.zimperium.zdefendx.stat.update", jSONObject.toString(), new j0() { // from class: androidx.FastestIyy.D$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.j0
            public final void a(String str2) {
                D.c(str2);
            }
        });
    }

    public static void a(Boolean bool) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.zimperium.isBetaDebugBuild", bool);
        } catch (JSONException unused) {
        }
        ((i0) cA).a("com.zimperium.zdefendx.stat.update", jSONObject.toString(), new j0() { // from class: androidx.FastestIyy.D$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.j0
            public final void a(String str) {
                D.b(str);
            }
        });
    }

    public static void a(String str, Integer num) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stat_id", str);
        } catch (JSONException unused) {
        }
        try {
            if (num == null) {
                jSONObject.put("stat_value", JSONObject.NULL);
            } else {
                jSONObject.put("stat_value", num);
            }
        } catch (JSONException unused2) {
        }
        ((i0) cA).a("com.zimperium.zdefendx.global.set", jSONObject.toString(), new j0() { // from class: androidx.FastestIyy.D$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.j0
            public final void a(String str2) {
                D.a(str2);
            }
        });
    }
}
