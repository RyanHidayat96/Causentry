package androidx.FastestIyy;

import android.view.accessibility.AccessibilityManager;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class AccessibilityManagerAccessibilityStateChangeListenerC0176f implements AccessibilityManager.AccessibilityStateChangeListener {
    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        C cA = i0.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", RemoteConfigConstants.ResponseFieldKey.STATE);
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put("enabled", z);
        } catch (JSONException unused2) {
        }
        ((i0) cA).b("com.zimperium.accessibility.changed", jSONObject.toString());
    }
}
