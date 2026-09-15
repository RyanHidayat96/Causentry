package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class X extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WifiManager f271a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ConditionVariable c;
    public final /* synthetic */ Y d;

    public X(Y y, WifiManager wifiManager, ArrayList arrayList, ConditionVariable conditionVariable) {
        this.d = y;
        this.f271a = wifiManager;
        this.b = arrayList;
        this.c = conditionVariable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (this.f271a.getScanResults() == null || this.f271a.getScanResults().size() <= 0) {
                return;
            }
            this.b.addAll(this.f271a.getScanResults());
            this.c.open();
            Y.a(this.b);
        } catch (Exception unused) {
            this.c.open();
        }
    }
}
