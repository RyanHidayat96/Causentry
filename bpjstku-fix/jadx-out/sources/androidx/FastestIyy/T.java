package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class T extends BroadcastReceiver {
    public static T d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f269a = null;
    public Q b = null;
    public final S c = new S(this);

    public static void e(Context context) {
        if (context != null) {
            try {
                context.getSharedPreferences("malware_upload_queue", 0).edit().clear().apply();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str, String str2, j0 j0Var) throws JSONException {
        JSONArray jSONArray = J.a(str2).f263a.getJSONArray("packages_name");
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        try {
            String str3 = (String) D.a("malware_upload_file_url", "");
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            Context context = this.f269a;
            ArrayList arrayList2 = new ArrayList();
            for (String str4 : arrayList) {
                if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, context.getPackageName()) && !str4.startsWith("com.zimperium.")) {
                    arrayList2.add(str4);
                }
            }
            if (arrayList2.size() > 0) {
                a(this.f269a, str3, arrayList2);
                c(this.f269a);
            }
        } catch (Throwable unused) {
            e(this.f269a);
        }
    }

    public final ArrayList b(Context context) {
        synchronized (this) {
            try {
                Set<String> stringSet = context.getSharedPreferences("malware_upload_queue", 0).getStringSet("list", null);
                if (stringSet != null && stringSet.size() > 0) {
                    stringSet.size();
                    return new ArrayList(stringSet);
                }
            } catch (Exception unused) {
            }
            return new ArrayList();
        }
    }

    public final void c(Context context) {
        synchronized (this) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = true;
            boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
            Q q = this.b;
            if (q != null && q.getStatus() != AsyncTask.Status.FINISHED) {
                z = false;
            }
            if (z2 && z) {
                ArrayList arrayListB = b(context);
                if (arrayListB.size() != 0) {
                    String strA = a(context);
                    arrayListB.size();
                    if (!TextUtils.isEmpty(strA)) {
                        Q q2 = new Q(context, this.c, strA, (String) arrayListB.get(0));
                        this.b = q2;
                        q2.execute(new Void[0]);
                    }
                }
            }
        }
    }

    public final void d(Context context) {
        this.f269a = context;
        ((i0) i0.a()).a("com.zimperium.server.upload.samples", new B() { // from class: androidx.FastestIyy.T$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.B
            public final void a(String str, String str2, j0 j0Var) throws JSONException {
                this.f$0.a(str, str2, j0Var);
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Q q;
        Objects.toString(intent);
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
            try {
                c(context);
                return;
            } catch (Throwable unused) {
                e(context);
                return;
            }
        }
        Q q2 = this.b;
        if (q2 == null || q2.getStatus() == AsyncTask.Status.FINISHED || (q = this.b) == null) {
            return;
        }
        q.cancel(true);
        this.b = null;
    }

    public final void a(Context context, String str, ArrayList arrayList) {
        try {
            synchronized (this) {
                arrayList.size();
                SharedPreferences sharedPreferences = context.getSharedPreferences("malware_upload_queue", 0);
                Set<String> stringSet = sharedPreferences.getStringSet("list", null);
                if (stringSet == null) {
                    arrayList.size();
                    stringSet = new HashSet<>(arrayList);
                } else {
                    stringSet.size();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (!stringSet.contains(str2)) {
                            stringSet.add(str2);
                        }
                    }
                }
                sharedPreferences.edit().putString(ImagesContract.URL, str).putStringSet("list", stringSet).apply();
            }
        } catch (Exception unused) {
        }
    }

    public final String a(Context context) {
        String str;
        synchronized (this) {
            try {
                context.getSharedPreferences("malware_upload_queue", 0);
                str = (String) D.a("malware_upload_file_url", "");
            } catch (Exception unused) {
                return "";
            }
        }
        return str;
    }

    public final void a(Context context, String str) {
        synchronized (this) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("malware_upload_queue", 0);
                Set<String> stringSet = sharedPreferences.getStringSet("list", null);
                if (stringSet != null && stringSet.remove(str)) {
                    sharedPreferences.edit().putStringSet("list", stringSet).apply();
                }
            } catch (Throwable unused) {
                e(context);
            }
        }
    }
}
