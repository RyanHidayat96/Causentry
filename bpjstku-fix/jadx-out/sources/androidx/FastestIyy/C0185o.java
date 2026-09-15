package androidx.FastestIyy;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.FastestIyy.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0185o extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f293a = new HashSet();
    public final /* synthetic */ C0189t b;

    public C0185o(C0189t c0189t) {
        this.b = c0189t;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        String string;
        boolean z = V.b != null;
        try {
            Objects.toString(network);
            this.f293a.add(network);
            NetworkInfo networkInfo = this.b.s.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == 1 && z) {
                string = Y.a(V.b.f270a.f301a);
            } else if (networkInfo != null) {
                StringBuilder sb = new StringBuilder("<unknown ssid> ");
                sb.append(networkInfo.getTypeName());
                string = sb.toString();
            } else {
                string = "<unknown ssid>";
            }
            if (!TextUtils.equals(this.b.c, string)) {
                C0189t c0189t = this.b;
                c0189t.c = string;
                HandlerC0178h handlerC0178h = c0189t.f298a;
                handlerC0178h.sendMessage(handlerC0178h.obtainMessage(1, string));
            }
            this.b.f298a.removeMessages(3);
            this.b.f298a.removeMessages(2);
            HandlerC0178h handlerC0178h2 = this.b.f298a;
            handlerC0178h2.sendMessageDelayed(handlerC0178h2.obtainMessage(2, string), 1500L);
            ((i0) i0.a()).b("com.zimperium.wifi.reachability_changed", "{}");
        } catch (Exception unused) {
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        try {
            Objects.toString(network);
            this.f293a.remove(network);
            if (this.f293a.size() != 0) {
                onAvailable((Network) this.f293a.iterator().next());
                return;
            }
            this.b.f298a.removeMessages(3);
            this.b.f298a.removeMessages(2);
            C0189t c0189t = this.b;
            HandlerC0178h handlerC0178h = c0189t.f298a;
            handlerC0178h.sendMessageDelayed(handlerC0178h.obtainMessage(3, c0189t.c), 500L);
            String str = this.b.c;
        } catch (Exception unused) {
        }
    }
}
