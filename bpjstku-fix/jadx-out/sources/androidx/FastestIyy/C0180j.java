package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0180j extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (intent.getData() == null || intent.getData().getEncodedSchemeSpecificPart() == null) {
                return;
            }
            String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
            JSONObject jSONObject = new JSONObject();
            try {
                if (encodedSchemeSpecificPart == null) {
                    jSONObject.put("package_name", JSONObject.NULL);
                } else {
                    jSONObject.put("package_name", encodedSchemeSpecificPart);
                }
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                ((i0) i0.a()).b("com.zimperium.app.installed", string);
                return;
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
                ((i0) i0.a()).b("com.zimperium.app.uninstalled", string);
            } else if ("android.intent.action.PACKAGE_CHANGED".equals(intent.getAction()) && ((Boolean) D.a("com.zimperium.collect_system_apps", Boolean.FALSE)).booleanValue()) {
                ((i0) i0.a()).b("com.zimperium.app.changed", string);
            }
        } catch (Exception unused2) {
        }
    }
}
