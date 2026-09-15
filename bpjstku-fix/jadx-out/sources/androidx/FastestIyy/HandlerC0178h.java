package androidx.FastestIyy;

import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: androidx.FastestIyy.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC0178h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f283a;
    public final /* synthetic */ C0189t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0178h(C0189t c0189t, Looper looper) {
        super(looper);
        this.b = c0189t;
        this.f283a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z = V.b != null;
        try {
            int i = message.what < AbstractC0188s.a(6).length ? AbstractC0188s.a(6)[message.what] : 1;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    Objects.toString(message.obj);
                    if (i == 0) {
                        throw null;
                    }
                    int i2 = i - 1;
                    if (i2 == 1) {
                        if (this.f283a) {
                            return;
                        }
                        this.f283a = true;
                        Objects.toString(message.obj);
                        C cA = i0.a();
                        Object obj = message.obj;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (obj == null) {
                                jSONObject.put("ssid", JSONObject.NULL);
                            } else {
                                jSONObject.put("ssid", obj);
                            }
                            break;
                        } catch (JSONException unused) {
                        }
                        ((i0) cA).b("com.zimperium.wifi.connecting", jSONObject.toString());
                        return;
                    }
                    String strReplace = "";
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 || i2 == 5) {
                                ((i0) i0.a()).b("com.zimperium.zdefendx.integrity.check", "{}");
                                return;
                            }
                            return;
                        }
                        this.f283a = false;
                        C0189t c0189t = this.b;
                        c0189t.d = false;
                        Object obj2 = message.obj;
                        c0189t.f299e = obj2;
                        c0189t.c = "";
                        Objects.toString(obj2);
                        C cA2 = i0.a();
                        Object obj3 = this.b.f299e;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            if (obj3 == null) {
                                jSONObject2.put("ssid", JSONObject.NULL);
                            } else {
                                jSONObject2.put("ssid", obj3);
                            }
                            break;
                        } catch (JSONException unused2) {
                        }
                        ((i0) cA2).b("com.zimperium.wifi.disconnected", jSONObject2.toString());
                        return;
                    }
                    this.f283a = false;
                    C0189t c0189t2 = this.b;
                    c0189t2.d = true;
                    c0189t2.f299e = message.obj;
                    if (z) {
                        WifiManager wifiManager = (WifiManager) V.b.f270a.f301a.getApplicationContext().getSystemService("wifi");
                        if (wifiManager == null) {
                            throw new RuntimeException("No WifiManager");
                        }
                        if (wifiManager.getConnectionInfo() != null && wifiManager.getConnectionInfo().getBSSID() != null) {
                            strReplace = wifiManager.getConnectionInfo().getBSSID().replace("\"", "");
                        }
                        c0189t2.f = strReplace;
                    }
                    Objects.toString(message.obj);
                    C cA3 = i0.a();
                    Object obj4 = this.b.f299e;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        if (obj4 == null) {
                            jSONObject3.put("ssid", JSONObject.NULL);
                        } else {
                            jSONObject3.put("ssid", obj4);
                        }
                        break;
                    } catch (JSONException unused3) {
                    }
                    String str = this.b.f;
                    try {
                        if (str == null) {
                            jSONObject3.put("bssid", JSONObject.NULL);
                        } else {
                            jSONObject3.put("bssid", str);
                        }
                        break;
                    } catch (JSONException unused4) {
                    }
                    ((i0) cA3).b("com.zimperium.wifi.connected", jSONObject3.toString());
                    return;
                default:
                    throw null;
            }
        } catch (Exception unused5) {
        }
    }
}
