package androidx.FastestIyy;

import android.content.Context;
import android.location.Address;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class M extends AbstractC0201w {
    public M(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(137, new b0() { // from class: androidx.FastestIyy.M$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(297, new b0() { // from class: androidx.FastestIyy.M$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
    }

    public final /* synthetic */ Object b(JSONArray jSONArray) {
        return a(jSONArray.optBoolean(0, false), jSONArray.optDouble(1, 0.0d));
    }

    public final Object c(JSONArray jSONArray) throws JSONException, IOException {
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        List<Address> fromLocation = new Geocoder(this.f301a).getFromLocation(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"), 1);
        if (fromLocation == null || fromLocation.size() <= 0) {
            throw new RuntimeException("geocode failed");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("country", fromLocation.get(0).getCountryName());
        jSONObject2.put(RemoteConfigConstants.ResponseFieldKey.STATE, fromLocation.get(0).getAdminArea());
        jSONObject2.put("city", fromLocation.get(0).getLocality());
        return jSONObject2;
    }

    public final JSONObject a(boolean z, double d) throws JSONException {
        if (d <= 0.0d) {
            d = 30000.0d;
        }
        final LocationManager locationManager = (LocationManager) this.f301a.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (locationManager != null) {
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                Iterator<String> it = locationManager.getProviders(true).iterator();
                while (it.hasNext()) {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                    if (lastKnownLocation != null) {
                        jSONObject.put("latitude", lastKnownLocation.getLatitude());
                        jSONObject.put("longitude", lastKnownLocation.getLongitude());
                        return jSONObject;
                    }
                }
                throw new RuntimeException("No last location available");
            }
            final ConditionVariable conditionVariable = new ConditionVariable(false);
            final L l = new L(jSONObject, conditionVariable);
            final String bestProvider = locationManager.getBestProvider(new Criteria(), true);
            if (bestProvider != null) {
                Handler handler = new Handler(this.f301a.getMainLooper());
                handler.post(new Runnable() { // from class: androidx.FastestIyy.M$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        M.a(locationManager, bestProvider, l, conditionVariable);
                    }
                });
                try {
                    conditionVariable.block((long) d);
                    if (jSONObject.has("latitude") && jSONObject.has("longitude")) {
                        handler.post(new Runnable() { // from class: androidx.FastestIyy.M$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                locationManager.removeUpdates(l);
                            }
                        });
                        return jSONObject;
                    }
                    throw new RuntimeException("Could not obtain location");
                } catch (Throwable th) {
                    handler.post(new Runnable() { // from class: androidx.FastestIyy.M$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            locationManager.removeUpdates(l);
                        }
                    });
                    throw th;
                }
            }
            throw new RuntimeException("No BestProvider");
        }
        throw new RuntimeException("No LocationManager");
    }

    public static /* synthetic */ void a(LocationManager locationManager, String str, LocationListener locationListener, ConditionVariable conditionVariable) {
        try {
            locationManager.requestLocationUpdates(str, TimeUnit.MINUTES.toMillis(10L), 500.0f, locationListener);
        } catch (Error unused) {
            conditionVariable.open();
        }
    }
}
