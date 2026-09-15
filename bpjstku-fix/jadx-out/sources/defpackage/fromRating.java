package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class fromRating implements MediaMetadataCompatLongKey {
    private final ConnectivityManager TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final b TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final MediaMetadataCompatLongKey.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public fromRating(ConnectivityManager connectivityManager, MediaMetadataCompatLongKey.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = connectivityManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        b bVar = new b();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bVar);
    }

    public static final class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            fromRating.this.b(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            fromRating.this.b(network, false);
        }
    }

    @Override // defpackage.MediaMetadataCompatLongKey
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        for (Network network : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAllNetworks()) {
            if (TuitionPaymentFragmentbindingInflater1(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.MediaMetadataCompatLongKey
    public final void b() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.unregisterNetworkCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Network network, boolean z) {
        boolean z2 = false;
        for (Network network2 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAllNetworks()) {
            if (Intrinsics.areEqual(network2, network) ? z : TuitionPaymentFragmentbindingInflater1(network2)) {
                z2 = true;
                break;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z2);
    }

    private final boolean TuitionPaymentFragmentbindingInflater1(Network network) {
        NetworkCapabilities networkCapabilities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
