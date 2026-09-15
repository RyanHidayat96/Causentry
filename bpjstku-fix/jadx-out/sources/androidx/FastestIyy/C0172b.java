package androidx.FastestIyy;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: androidx.FastestIyy.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0172b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189t f275a;

    public C0172b(C0189t c0189t) {
        this.f275a = c0189t;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f275a.f298a.removeMessages(4);
        this.f275a.f298a.removeMessages(5);
        HandlerC0178h handlerC0178h = this.f275a.f298a;
        handlerC0178h.sendMessageDelayed(handlerC0178h.obtainMessage(4, ""), 1000L);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f275a.f298a.removeMessages(4);
        this.f275a.f298a.removeMessages(5);
        HandlerC0178h handlerC0178h = this.f275a.f298a;
        handlerC0178h.sendMessageDelayed(handlerC0178h.obtainMessage(5, ""), 3000L);
    }
}
