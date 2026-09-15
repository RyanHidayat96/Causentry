package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: androidx.FastestIyy.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0182l extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            ((i0) i0.a()).b("com.zimperium.wifi.proxy_changed", "{}");
        } catch (Exception unused) {
        }
    }
}
