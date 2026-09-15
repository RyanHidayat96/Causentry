package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: androidx.FastestIyy.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0174d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189t f277a;

    public C0174d(C0189t c0189t) {
        this.f277a = c0189t;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().equals("android.telephony.action.CARRIER_CONFIG_CHANGED") && intent.hasExtra("android.telephony.extra.SLOT_INDEX")) {
                this.f277a.a(intent.getIntExtra("android.telephony.extra.SLOT_INDEX", 0));
            }
        } catch (Exception unused) {
        }
    }
}
