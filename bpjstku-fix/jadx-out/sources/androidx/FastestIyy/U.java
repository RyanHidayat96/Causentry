package androidx.FastestIyy;

import android.content.Context;
import android.os.Build;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class U extends AbstractC0201w {
    public U(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(43, new b0() { // from class: androidx.FastestIyy.U$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(45, new b0() { // from class: androidx.FastestIyy.U$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(47, new b0() { // from class: androidx.FastestIyy.U$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
    }

    public final Object b(JSONArray jSONArray) {
        return this.f301a.getPackageManager().getPackageInfo(this.f301a.getPackageName(), 0).versionName;
    }

    public final Object c(JSONArray jSONArray) {
        return Build.VERSION.RELEASE;
    }

    public final /* synthetic */ Object d(JSONArray jSONArray) {
        return "Android";
    }
}
