package androidx.FastestIyy;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.zimperium.api.v5.ZDefendPolicyType;
import com.zimperium.api.v5.ZDefendThreat;
import com.zimperium.api.v5.ZDeviceStatus;
import com.zimperium.api.v5.ZDeviceStatusCallback;
import com.zimperium.api.v5.ZDeviceStatusRegistration;
import com.zimperium.api.v5.ZLoginError;
import com.zimperium.api.v5.ZLoginStatus;
import defpackage.withAudioEnabled;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements ZDeviceStatus {
    public static l0 m;
    public static final AtomicBoolean n = new AtomicBoolean(false);
    public static final ArrayList o = new ArrayList();
    public static final HashMap p = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f289a;
    public final String b;
    public final String c;
    public final ZLoginStatus d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZLoginError f290e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final int j;
    public final String k;
    public final String l;

    static {
        d0.a(new Runnable() { // from class: androidx.FastestIyy.l0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                l0.b();
            }
        });
    }

    public l0(JSONObject jSONObject, l0 l0Var) throws JSONException {
        ZLoginError zLoginError;
        ZDefendThreat zDefendThreat;
        String string = jSONObject.getString("device_status_base64");
        this.b = string;
        this.c = jSONObject.getString("signature");
        JSONObject jSONObject2 = new JSONObject(new String(Base64.decode(string, 0), StandardCharsets.UTF_8));
        this.f289a = new Date(jSONObject2.getLong("date"));
        this.k = jSONObject2.getString("device_id");
        this.l = jSONObject2.getString("sdk_version");
        String string2 = jSONObject2.getString(NotificationCompat.CATEGORY_STATUS);
        ZLoginStatus zLoginStatus = "logged_in".equals(string2) ? ZLoginStatus.LOGGED_IN : "authenticating".equals(string2) ? ZLoginStatus.IN_PROGRESS : ZLoginStatus.LOGGED_OUT;
        this.d = zLoginStatus;
        String string3 = jSONObject2.getString("login_last_error");
        if (zLoginStatus != ZLoginStatus.LOGGED_OUT) {
            zLoginError = ZLoginError.NONE;
        } else {
            String upperCase = string3.toUpperCase(Locale.ROOT);
            zLoginError = upperCase.isEmpty() ? ZLoginError.NONE : "LICENSE_EXPIRED".equals(upperCase) ? ZLoginError.LICENSE_EXPIRED : "LICENSE_INVALID".equals(upperCase) ? ZLoginError.LICENSE_INVALID : "CONNECTION_ERROR".equals(upperCase) ? ZLoginError.CONNECTION_ERROR : "LICENSE_LIMITED".equals(upperCase) ? ZLoginError.LICENSE_LIMITED : "CLIENT_ERROR".equals(upperCase) ? ZLoginError.CLIENT_ERROR : ZLoginError.SERVER_ERROR;
        }
        this.f290e = zLoginError;
        JSONArray jSONArray = (JSONArray) J.a(jSONObject2, "threats", new JSONArray());
        ArrayList arrayList = l0Var != null ? l0Var.g : new ArrayList();
        this.f = new ArrayList();
        JSONObject jSONObject3 = (JSONObject) J.a(jSONObject2, "policies", new JSONObject());
        if (jSONObject3.length() > 0) {
            for (String str : p.keySet()) {
                ZDefendPolicyType zDefendPolicyType = (ZDefendPolicyType) p.get(str);
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" Policy Date");
                    Date date = new Date(jSONObject3.getLong(sb.toString()));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" Policy Hash");
                    this.f.add(new f0(zDefendPolicyType, date, jSONObject3.getString(sb2.toString())));
                } catch (JSONException unused) {
                }
            }
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            g0 g0Var = new g0(jSONArray.getJSONObject(i));
            this.g.add(g0Var);
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    zDefendThreat = null;
                    break;
                }
                zDefendThreat = (ZDefendThreat) it.next();
            } while (!g0Var.getUUID().equals(zDefendThreat.getUUID()));
            if (zDefendThreat == null || g0Var.isMitigated() != zDefendThreat.isMitigated()) {
                if (g0Var.isMitigated()) {
                    this.i.add(g0Var);
                } else {
                    this.h.add(g0Var);
                }
            }
        }
        this.j = ((Integer) J.a(jSONObject2, "scan_progress_percentage", 0)).intValue();
    }

    public static void a(String str, String str2, j0 j0Var) {
        ArrayList arrayList = o;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                m = new l0(new JSONObject(str2), m);
                a(null);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
        }
    }

    public static /* synthetic */ void b() {
        HashMap map = p;
        map.put("App Settings", ZDefendPolicyType.APP_SETTINGS);
        map.put("Phishing", ZDefendPolicyType.PHISHING);
        map.put("Privacy", ZDefendPolicyType.PRIVACY);
        map.put("Threat", ZDefendPolicyType.THREAT);
        map.put("Knox", ZDefendPolicyType.KNOX);
        ((i0) i0.a()).a("com.zimperium.device.status", new B() { // from class: androidx.FastestIyy.l0$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                l0.a(str, str2, j0Var);
            }
        });
    }

    public final List getActiveNewThreats() {
        return this.h;
    }

    public final List getActiveThreats() {
        ArrayList arrayList = new ArrayList();
        for (ZDefendThreat zDefendThreat : this.g) {
            if (!zDefendThreat.isMitigated()) {
                arrayList.add(zDefendThreat);
            }
        }
        return arrayList;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final List getAllThreats() {
        return this.g;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final String getBase64() {
        return this.b;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final String getBase64Signature() {
        return this.c;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final String getDeviceId() {
        return this.k;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final int getInitialScanProgressPercentage() {
        return this.j;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final ZLoginError getLoginLastError() {
        return this.f290e;
    }

    @Override // com.zimperium.api.v5.ZDeviceStatus
    public final ZLoginStatus getLoginStatus() {
        return this.d;
    }

    public final List getMitigatedNewThreats() {
        return this.i;
    }

    public final List getMitigatedThreats() {
        ArrayList arrayList = new ArrayList();
        for (ZDefendThreat zDefendThreat : this.g) {
            if (zDefendThreat.isMitigated()) {
                arrayList.add(zDefendThreat);
            }
        }
        return arrayList;
    }

    public final List getPolicies() {
        return this.f;
    }

    public final withAudioEnabled getPolicy(ZDefendPolicyType zDefendPolicyType) {
        for (withAudioEnabled withaudioenabled : this.f) {
            if (withaudioenabled.getPolicyType() == zDefendPolicyType) {
                return withaudioenabled;
            }
        }
        return null;
    }

    public final String getSdkVersion() {
        return this.l;
    }

    public final Date getStatusDate() {
        return this.f289a;
    }

    public static void a(final ZDeviceStatusCallback zDeviceStatusCallback) {
        final l0 l0Var = m;
        if (l0Var == null) {
            AtomicBoolean atomicBoolean = n;
            if (atomicBoolean.get()) {
                return;
            }
            d0.b(new Runnable() { // from class: androidx.FastestIyy.l0$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    l0.a();
                }
            });
            atomicBoolean.set(true);
            return;
        }
        if (zDeviceStatusCallback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.FastestIyy.l0$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    zDeviceStatusCallback.onDeviceStatus(l0Var);
                }
            });
            return;
        }
        ArrayList arrayList = o;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final ZDeviceStatusCallback callback = ((ZDeviceStatusRegistration) it.next()).getCallback();
                if (callback != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.FastestIyy.l0$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            callback.onDeviceStatus(l0Var);
                        }
                    });
                }
            }
        }
    }

    public static void a() {
        ((i0) i0.a()).b("com.zimperium.device.request_status_update", "{}");
    }
}
