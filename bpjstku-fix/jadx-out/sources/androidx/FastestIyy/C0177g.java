package androidx.FastestIyy;

import android.telephony.SubscriptionManager;

/* JADX INFO: renamed from: androidx.FastestIyy.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0177g extends SubscriptionManager.OnSubscriptionsChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189t f281a;

    public C0177g(C0189t c0189t) {
        this.f281a = c0189t;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        try {
            this.f281a.a(0);
        } catch (Exception unused) {
        }
    }
}
