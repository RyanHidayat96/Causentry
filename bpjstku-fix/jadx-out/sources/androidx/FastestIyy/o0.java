package androidx.FastestIyy;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f294a;

    public static void a(final Context context) {
        f294a = context;
        ((i0) i0.a()).a("com.zimperium.sdkresponse.REDIRECT_URL", new B() { // from class: androidx.FastestIyy.o0$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                o0.a(context, str, str2, j0Var);
            }
        });
        ((i0) i0.a()).a("com.zimperium.open_url", new B() { // from class: androidx.FastestIyy.o0$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                o0.b(context, str, str2, j0Var);
            }
        });
        ((i0) i0.a()).a("com.zimperium.is_third_party_vpn_running", new B() { // from class: androidx.FastestIyy.o0$$ExternalSyntheticLambda3
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) {
                j0Var.a(o0.a() ? "true" : "false");
            }
        });
        a0.a(371, new b0() { // from class: androidx.FastestIyy.o0$$ExternalSyntheticLambda4
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return Boolean.valueOf(o0.a());
            }
        });
    }

    public static void b(Context context, String str, String str2, j0 j0Var) {
        J jA = J.a(str2);
        String str3 = (String) J.a(jA.f263a, ImagesContract.URL, "");
        String str4 = (String) J.a(jA.f263a, "rule", "");
        StringBuilder sb = new StringBuilder("opening url ");
        sb.append(str3);
        sb.append(" for ");
        sb.append(str4);
        a(context, str3, sb.toString());
    }

    public static void a(Context context, String str, String str2, j0 j0Var) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("responseArgument");
            String str3 = (String) J.a((JSONObject) J.a(jSONObject, "threat", new JSONObject()), "internalName", "null");
            StringBuilder sb = new StringBuilder("REDIRECT_URL opening url ");
            sb.append(string);
            sb.append(" for ");
            sb.append(str3);
            a(context, string, sb.toString());
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (str2 == null) {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, JSONObject.NULL);
            } else {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str2);
            }
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, "INFO");
        } catch (JSONException unused2) {
        }
        ((i0) i0.a()).a("com.zimperium.public_log.add", jSONObject.toString(), null);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static boolean a() {
        String string = "";
        final AtomicReference atomicReference = new AtomicReference("");
        ((i0) i0.a()).a("com.zimperium.zvpn.is_running", "{}", new j0() { // from class: androidx.FastestIyy.o0$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.j0
            public final void a(String str) {
                atomicReference.set(str);
            }
        });
        if (((String) atomicReference.get()).equals("true")) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f294a.getSystemService("connectivity");
            Network[] allNetworks = connectivityManager.getAllNetworks();
            int length = allNetworks.length;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    string = network.toString();
                    break;
                }
            }
        } catch (Exception unused) {
        }
        TextUtils.isEmpty(string);
        return !TextUtils.isEmpty(string);
    }
}
