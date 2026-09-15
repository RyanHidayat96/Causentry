package androidx.FastestIyy;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class L implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f264a;
    public final /* synthetic */ ConditionVariable b;

    public L(JSONObject jSONObject, ConditionVariable conditionVariable) {
        this.f264a = jSONObject;
        this.b = conditionVariable;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        try {
            this.f264a.put("latitude", location.getLatitude());
            this.f264a.put("longitude", location.getLongitude());
            this.b.open();
        } catch (JSONException unused) {
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
