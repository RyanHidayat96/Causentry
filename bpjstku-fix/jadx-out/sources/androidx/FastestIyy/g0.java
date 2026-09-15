package androidx.FastestIyy;

import com.zimperium.api.v5.ZDefendThreat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 implements ZDefendThreat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f282a;
    public final JSONObject b;
    public final JSONObject c;

    public g0(JSONObject jSONObject) {
        this.f282a = jSONObject;
        this.b = J.a((String) J.a(jSONObject, "forensicJson", "{}")).f263a;
        if (jSONObject.has("lang_description")) {
            this.c = (JSONObject) J.a(jSONObject, "lang_description", new JSONObject());
            return;
        }
        final AtomicReference atomicReference = new AtomicReference("");
        C cA = i0.a();
        String uuid = getUUID();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (uuid == null) {
                jSONObject2.put("uuid", JSONObject.NULL);
            } else {
                jSONObject2.put("uuid", uuid);
            }
        } catch (JSONException unused) {
        }
        ((i0) cA).a("com.zimperium.threat.get", jSONObject2.toString(), new j0() { // from class: androidx.FastestIyy.g0$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.j0
            public final void a(String str) {
                atomicReference.set(str);
            }
        });
        this.c = (JSONObject) J.a(J.a((String) atomicReference.get()).f263a, "lang_description", new JSONObject());
    }

    public final String getAlertText() {
        return getLocalizedAlertText(false);
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getAppName() {
        try {
            if (this.b.has("server_ooc_detail") && this.b.getJSONObject("server_ooc_detail").has("app_name")) {
                return this.b.getJSONObject("server_ooc_detail").getString("app_name");
            }
            if (this.b.has("server_suspicious_ipa_detail") && this.b.getJSONObject("server_suspicious_ipa_detail").has("app_name")) {
                return this.b.getJSONObject("server_suspicious_ipa_detail").getString("app_name");
            }
            if (this.b.has("app_name")) {
                return this.b.getString("app_name");
            }
            if (this.b.has("Process")) {
                return this.b.getString("Process");
            }
            if (this.b.has("Application")) {
                return this.b.getString("Application");
            }
            return this.b.has("SideloadedAppName") ? this.b.getString("SideloadedAppName") : "";
        } catch (JSONException unused) {
            return "";
        }
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final Date getAttackTime() {
        return new Date((this.f282a.has("threatTime") ? this.f282a.getLong("threatTime") : 0L) * 1000);
    }

    public final String getHumanThreatName() {
        return getLocalizedName();
    }

    public final String getHumanThreatSummary() {
        return getLocalizedDetails(false);
    }

    public final String getHumanThreatType() {
        return getLocalizedName();
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getInternalName() {
        return (String) J.a(this.c, "internalLocalizationName", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final int getInternalThreatID() {
        return ((Integer) J.a(this.f282a, "legacyThreatId", 0)).intValue();
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final JSONObject getJson() {
        return this.f282a;
    }

    public final String getLocalizedAlertButtonLink() {
        return (String) J.a(this.c, "deviceAlertLink", "");
    }

    public final String getLocalizedAlertButtonText() {
        return (String) J.a(this.c, "deviceAlertButton", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getLocalizedAlertText() {
        return getLocalizedAlertText(false);
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getLocalizedDetails() {
        return getLocalizedDetails(false);
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getLocalizedName() {
        String str = (String) J.a(this.c, "deviceName", "");
        return str.isEmpty() ? (String) J.a(this.f282a, "internalName", "") : str;
    }

    public final String getLocalizedResolution() {
        return getLocalizedResolution(false);
    }

    public final String getMalwareFamily() {
        String str = (String) J.a(this.b, "MalwareThreatName", "");
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        return stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : str;
    }

    public final String getMalwareName() {
        return (String) J.a(this.b, "MalwareThreatName", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getPackageName() {
        try {
            if (this.b.has("server_ooc_detail") && this.b.getJSONObject("server_ooc_detail").has("package")) {
                return this.b.getJSONObject("server_ooc_detail").getString("package");
            }
            if (this.b.has("server_suspicious_ipa_detail") && this.b.getJSONObject("server_suspicious_ipa_detail").has("package")) {
                return this.b.getJSONObject("server_suspicious_ipa_detail").getString("package");
            }
            if (this.b.has("package")) {
                return this.b.getString("package");
            }
            if (this.b.has("SideloadedAppPackage")) {
                return this.b.getString("SideloadedAppPackage");
            }
            if (this.b.has("AppPackageName")) {
                return this.b.getString("AppPackageName");
            }
            return this.b.has("Application") ? this.b.getString("Application") : "";
        } catch (JSONException unused) {
            return "";
        }
    }

    public final String getProfileName() {
        JSONObject jSONObject;
        if (this.b.has("server_untrusted_profile_detail")) {
            jSONObject = (JSONObject) J.a(this.b, "server_untrusted_profile_detail", new JSONObject());
        } else {
            if (!this.b.has("server_suspicious_profile_detail")) {
                return "";
            }
            jSONObject = (JSONObject) J.a(this.b, "server_suspicious_profile_detail", new JSONObject());
        }
        return (String) J.a(jSONObject, "profile_name", "");
    }

    public final String getSSID() {
        return (String) J.a(this.b, "ssid", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final ZDefendThreat.ZThreatSeverity getSeverity() {
        String str = (String) J.a(this.f282a, "severity", "");
        if ("CRITICAL".equals(str)) {
            return ZDefendThreat.ZThreatSeverity.CRITICAL;
        }
        if ("IMPORTANT".equals(str)) {
            return ZDefendThreat.ZThreatSeverity.IMPORTANT;
        }
        return "LOW".equals(str) ? ZDefendThreat.ZThreatSeverity.LOW : ZDefendThreat.ZThreatSeverity.HIDDEN;
    }

    public final String getSideloadedAppDeveloper() {
        return (String) J.a(this.b, "SideloadedAppDeveloper", "");
    }

    public final JSONObject getThreatJson() {
        return this.f282a;
    }

    public final String getThreatResolution() {
        return getLocalizedResolution(false);
    }

    public final ZDefendThreat.ZThreatSeverity getThreatSeverity() {
        return getSeverity();
    }

    public final String getThreatUUID() {
        return getUUID();
    }

    public final String getThreatVector() {
        return getVector();
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getUUID() {
        return (String) J.a(this.f282a, "uuid", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getUrl() {
        return (String) J.a(this.b, "SuspectedUrl", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final String getVector() {
        return (String) J.a(this.c, "vector", "");
    }

    @Override // com.zimperium.api.v5.ZDefendThreat
    public final boolean isMitigated() {
        return ((Boolean) J.a(this.f282a, "mitigated", Boolean.FALSE)).booleanValue();
    }

    public final String toString() {
        return getLocalizedDetails(false);
    }

    public final String getAlertText(boolean z) {
        return getLocalizedAlertText(z);
    }

    public final String getHumanThreatSummary(boolean z) {
        return getLocalizedDetails(z);
    }

    public final String getLocalizedAlertText(boolean z) {
        String str = (String) J.a(this.c, "deviceAlert", "");
        return !z ? str.replaceAll("<br>|<br/>", "\n").replaceAll("<[^>]*>", "") : str;
    }

    public final String getLocalizedDetails(boolean z) {
        String str = (String) J.a(this.c, "deviceDetailV5", "");
        return !z ? str.replaceAll("<br>|<br/>", "\n").replaceAll("<[^>]*>", "") : str;
    }

    public final String getLocalizedResolution(boolean z) {
        String str = (String) J.a(this.c, "deviceResolution", "");
        return !z ? str.replaceAll("<br>|<br/>", "\n").replaceAll("<[^>]*>", "") : str;
    }

    public final boolean isSimulated() {
        return "simulated_threat".equals((String) J.a(this.f282a, "internalName", ""));
    }
}
