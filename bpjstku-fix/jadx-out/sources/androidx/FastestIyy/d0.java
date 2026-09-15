package androidx.FastestIyy;

import androidx.FastestIyy;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f278a = new AtomicBoolean(false);
    public static ArrayList b = new ArrayList();

    static {
        FastestIyy.a();
    }

    public static void a(Runnable runnable) {
        synchronized (d0.class) {
            if (f278a.get()) {
                n0.a();
                n0.f292a.accept_fewer(runnable, false, false);
            } else if (b.size() < 100) {
                b.add(runnable);
            }
        }
    }

    public static void b() {
        synchronized (d0.class) {
            for (Runnable runnable : b) {
                n0.a();
                n0.f292a.accept_fewer(runnable, false, false);
            }
            b.clear();
            b = null;
            f278a.set(true);
        }
    }

    public static void c() {
        ((i0) i0.a()).b("com.zimperium.rules.check_updates", "{}");
        ((i0) i0.a()).b("com.zimperium.zdefendx.integrity.check", "{}");
    }

    public static void e() {
        a(new Runnable() { // from class: androidx.FastestIyy.d0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                d0.d();
            }
        });
    }

    public static void d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ImagesContract.URL, "*");
        } catch (JSONException unused) {
        }
        ((i0) i0.a()).b("com.zimperium.threat.mitigate_by_url_internal", jSONObject.toString());
    }

    public static void a() {
        a(new Runnable() { // from class: androidx.FastestIyy.d0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d0.c();
            }
        });
    }

    public static void b(Runnable runnable) {
        synchronized (d0.class) {
            if (!f278a.get()) {
                if (b.size() < 100) {
                    b.add(runnable);
                }
            } else {
                n0.a();
                n0.f292a.accept_fewer(runnable, true, true);
            }
        }
    }
}
