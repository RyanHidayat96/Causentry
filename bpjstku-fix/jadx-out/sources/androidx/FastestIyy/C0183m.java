package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0183m extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            String language = Locale.getDefault().getLanguage();
            if (Locale.getDefault().toLanguageTag().contains("zh") && Locale.getDefault().toLanguageTag().contains("Hant")) {
                language = "zh-rTW";
            }
            C cA = i0.a();
            JSONObject jSONObject = new JSONObject();
            try {
                if (language == null) {
                    jSONObject.put("langCode", JSONObject.NULL);
                } else {
                    jSONObject.put("langCode", language);
                }
            } catch (JSONException unused) {
            }
            ((i0) cA).b("com.zimperium.lang.update", jSONObject.toString());
        } catch (Exception unused2) {
        }
    }
}
