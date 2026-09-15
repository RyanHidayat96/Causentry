package com.zimperium.api.v5;

import androidx.FastestIyy.d0;
import androidx.FastestIyy.i0;
import androidx.FastestIyy.l0;
import androidx.FastestIyy.m0;
import com.zimperium.api.v5.ZDefend;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ZDefend {
    public static ZDeviceStatusRegistration addDeviceStatusCallback(ZDeviceStatusCallback zDeviceStatusCallback) {
        m0 m0Var = new m0(zDeviceStatusCallback);
        ArrayList arrayList = l0.o;
        synchronized (arrayList) {
            arrayList.add(m0Var);
        }
        l0.a(zDeviceStatusCallback);
        return m0Var;
    }

    public static void b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str == null) {
                jSONObject.put("tracking_id_1", JSONObject.NULL);
            } else {
                jSONObject.put("tracking_id_1", str);
            }
        } catch (JSONException unused) {
        }
        try {
            if (str2 == null) {
                jSONObject.put("tracking_id_2", JSONObject.NULL);
            } else {
                jSONObject.put("tracking_id_2", str2);
            }
        } catch (JSONException unused2) {
        }
        ((i0) i0.a()).a("com.zimperium.zdefendx.update_tracking_id", jSONObject.toString(), null);
    }

    public static void setTrackingIds(final String str, final String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.length() <= 128 && str2.length() <= 128) {
            d0.a(new Runnable() { // from class: PendingRecording
                @Override // java.lang.Runnable
                public final void run() {
                    ZDefend.b(str, str2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Tracking ID string length must be less than or equal to 128");
    }
}
