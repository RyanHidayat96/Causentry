package androidx.FastestIyy;

import android.content.Context;
import org.json.JSONArray;

/* JADX INFO: renamed from: androidx.FastestIyy.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0201w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f301a;

    public AbstractC0201w(Context context) {
        this.f301a = context;
    }

    public static String a(JSONArray jSONArray) {
        if (jSONArray.isNull(0)) {
            return null;
        }
        return jSONArray.optString(0);
    }
}
