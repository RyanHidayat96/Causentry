package androidx.FastestIyy;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f263a = new JSONObject();

    public final J a(String str, String str2) {
        try {
            if (str2 == null) {
                this.f263a.put(str, JSONObject.NULL);
                return this;
            }
            this.f263a.put(str, str2);
            return this;
        } catch (JSONException unused) {
        }
    }

    public final String toString() {
        return this.f263a.toString();
    }

    public static J a(String str) {
        J j = new J();
        try {
            j.f263a = new JSONObject(str);
        } catch (JSONException unused) {
        }
        return j;
    }

    public static Object a(JSONObject jSONObject, String str, Object obj) {
        try {
            if (!jSONObject.isNull(str)) {
                return jSONObject.get(str);
            }
        } catch (JSONException unused) {
        }
        return obj;
    }
}
