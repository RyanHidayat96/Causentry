package androidx.FastestIyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.FastestIyy.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0179i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0189t f285a;

    public C0179i(C0189t c0189t) {
        this.f285a = c0189t;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            intent.getAction();
            if (intent.getAction() == null) {
                return;
            }
            boolean z = V.b != null;
            if (!intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
                if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                    intent.getIntExtra("wifi_state", 4);
                    return;
                }
                return;
            }
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (!z || networkInfo == null) {
                return;
            }
            Objects.toString(networkInfo.getState());
            if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifiInfo");
                String ssid = wifiInfo != null ? wifiInfo.getSSID() : Y.a(V.b.f270a.f301a);
                if (!TextUtils.equals(this.f285a.c, ssid)) {
                    C0189t c0189t = this.f285a;
                    c0189t.c = ssid;
                    HandlerC0178h handlerC0178h = c0189t.f298a;
                    handlerC0178h.sendMessage(handlerC0178h.obtainMessage(1, ssid));
                }
                this.f285a.f298a.removeMessages(3);
                this.f285a.f298a.removeMessages(2);
                HandlerC0178h handlerC0178h2 = this.f285a.f298a;
                handlerC0178h2.sendMessageDelayed(handlerC0178h2.obtainMessage(2, ssid), 1500L);
                return;
            }
            if (networkInfo.getState() == NetworkInfo.State.DISCONNECTED) {
                this.f285a.f298a.removeMessages(3);
                this.f285a.f298a.removeMessages(2);
                C0189t c0189t2 = this.f285a;
                HandlerC0178h handlerC0178h3 = c0189t2.f298a;
                handlerC0178h3.sendMessageDelayed(handlerC0178h3.obtainMessage(3, c0189t2.c), 500L);
                return;
            }
            if (networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                WifiInfo wifiInfo2 = (WifiInfo) intent.getParcelableExtra("wifiInfo");
                String ssid2 = wifiInfo2 != null ? wifiInfo2.getSSID() : Y.a(V.b.f270a.f301a);
                this.f285a.f298a.removeMessages(3);
                if (TextUtils.equals(this.f285a.c, ssid2)) {
                    return;
                }
                C0189t c0189t3 = this.f285a;
                c0189t3.c = ssid2;
                c0189t3.f298a.removeMessages(2);
                HandlerC0178h handlerC0178h4 = this.f285a.f298a;
                handlerC0178h4.sendMessage(handlerC0178h4.obtainMessage(1, ssid2));
            }
        } catch (Exception unused) {
        }
    }
}
