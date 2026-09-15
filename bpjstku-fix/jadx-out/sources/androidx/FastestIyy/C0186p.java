package androidx.FastestIyy;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: androidx.FastestIyy.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0186p extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189t f295a;

    public C0186p(C0189t c0189t) {
        this.f295a = c0189t;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        C0189t c0189t = this.f295a;
        c0189t.g = true;
        c0189t.c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C0189t c0189t = this.f295a;
        c0189t.g = false;
        c0189t.c();
    }
}
