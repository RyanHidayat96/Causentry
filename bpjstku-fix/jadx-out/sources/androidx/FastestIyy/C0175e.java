package androidx.FastestIyy;

import android.hardware.display.DisplayManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0175e implements DisplayManager.DisplayListener {
    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "added");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("id", i);
        } catch (JSONException unused2) {
        }
        ((i0) cA).b("com.zimperium.displays.updated", jSONObject.toString());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "changed");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("id", i);
        } catch (JSONException unused2) {
        }
        ((i0) cA).b("com.zimperium.displays.updated", jSONObject.toString());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "removed");
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("id", i);
        } catch (JSONException unused2) {
        }
        ((i0) cA).b("com.zimperium.displays.updated", jSONObject.toString());
    }
}
