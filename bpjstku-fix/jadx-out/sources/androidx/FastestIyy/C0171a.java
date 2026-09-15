package androidx.FastestIyy;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: androidx.FastestIyy.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0171a extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189t f273a;

    public C0171a(C0189t c0189t) {
        this.f273a = c0189t;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        int i = c0.f276a;
        C0189t c0189t = this.f273a;
        c0189t.h = true;
        c0189t.c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = c0.f276a;
        C0189t c0189t = this.f273a;
        c0189t.h = false;
        c0189t.c();
    }
}
