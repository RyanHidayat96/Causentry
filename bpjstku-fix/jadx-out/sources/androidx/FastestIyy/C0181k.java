package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: androidx.FastestIyy.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0181k extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f287a = 0;
    public long b = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("plugged", -1);
                if (intExtra == -1 || intExtra == this.f287a) {
                    return;
                }
                this.f287a = intExtra;
                if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                    ((i0) i0.a()).b("com.zimperium.charger.disconnected", "{}");
                    return;
                }
                if (System.currentTimeMillis() - this.b > 3600000) {
                    ((i0) i0.a()).b("com.zimperium.zdetection.charger_connected", "{}");
                    this.b = System.currentTimeMillis();
                }
                ((i0) i0.a()).b("com.zimperium.charger.connected", "{}");
            } catch (Exception unused) {
            }
        }
    }
}
