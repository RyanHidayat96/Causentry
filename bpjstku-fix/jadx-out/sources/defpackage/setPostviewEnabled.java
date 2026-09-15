package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010\u001a\u001a\u00020\u00048\u0002@CX\u0083\f¢\u0006\u0006\n\u0004\b\f\u0010\u001d"}, d2 = {"LsetPostviewEnabled;", "Landroid/net/ConnectivityManager$NetworkCallback;", "LsetFlashType;", "LImageCaptureMetadata;", "Lcom/datadog/android/api/context/NetworkInfo;", "p0", "LisSupportedRotationDegrees;", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "<init>", "(LImageCaptureMetadata;LisSupportedRotationDegrees;Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentbindingInflater1", "()Lcom/datadog/android/api/context/NetworkInfo;", "Landroid/net/Network;", "Landroid/net/NetworkCapabilities;", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/content/Context;", "b", "(Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LisSupportedRotationDegrees;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LImageCaptureMetadata;", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/context/NetworkInfo;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setPostviewEnabled extends ConnectivityManager.NetworkCallback implements setFlashType {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final ImageCaptureMetadata<NetworkInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final isSupportedRotationDegrees b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setPostviewEnabled(ImageCaptureMetadata imageCaptureMetadata, isSupportedRotationDegrees issupportedrotationdegrees, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
            issupportedrotationdegrees = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this(imageCaptureMetadata, issupportedrotationdegrees, internalLogger);
    }

    private setPostviewEnabled(ImageCaptureMetadata<NetworkInfo> imageCaptureMetadata, isSupportedRotationDegrees issupportedrotationdegrees, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(imageCaptureMetadata, "");
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageCaptureMetadata;
        this.b = issupportedrotationdegrees;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network p0, NetworkCapabilities p1) {
        NetworkInfo.Connectivity connectivity;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onCapabilitiesChanged(p0, p1);
        if (p1.hasTransport(1)) {
            connectivity = NetworkInfo.Connectivity.NETWORK_WIFI;
        } else if (p1.hasTransport(3)) {
            connectivity = NetworkInfo.Connectivity.NETWORK_ETHERNET;
        } else if (p1.hasTransport(0)) {
            connectivity = NetworkInfo.Connectivity.NETWORK_CELLULAR;
        } else if (p1.hasTransport(2)) {
            connectivity = NetworkInfo.Connectivity.NETWORK_BLUETOOTH;
        } else {
            connectivity = NetworkInfo.Connectivity.NETWORK_OTHER;
        }
        NetworkInfo networkInfo = new NetworkInfo(connectivity, null, null, p1.getLinkUpstreamBandwidthKbps() > 0 ? Long.valueOf(p1.getLinkUpstreamBandwidthKbps()) : null, p1.getLinkDownstreamBandwidthKbps() > 0 ? Long.valueOf(p1.getLinkDownstreamBandwidthKbps()) : null, (this.b.b() < 29 || p1.getSignalStrength() == Integer.MIN_VALUE) ? null : Long.valueOf(p1.getSignalStrength()), null, 70, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = networkInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(networkInfo);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onLost(p0);
        NetworkInfo networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, 126, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = networkInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(networkInfo);
    }

    @Override // defpackage.setFlashType
    public final void b(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object systemService = p0.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
                Network activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (activeNetwork == null || networkCapabilities == null) {
                    return;
                }
                onCapabilitiesChanged(activeNetwork, networkCapabilities);
                return;
            } catch (SecurityException e2) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "We couldn't register a Network Callback, the network information reported will be less accurate.";
                    }
                }, e2, false, null);
                NetworkInfo networkInfo = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = networkInfo;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(networkInfo);
                return;
            } catch (Exception e3) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "We couldn't register a Network Callback, the network information reported will be less accurate.";
                    }
                }, e3, false, null);
                NetworkInfo networkInfo2 = new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = networkInfo2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(networkInfo2);
                return;
            }
        }
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "We couldn't register a Network Callback, the network information reported will be less accurate.";
            }
        }, null, false, null);
    }

    @Override // defpackage.setFlashType
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object systemService = p0.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
                return;
            } catch (SecurityException e2) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, CallbackNetworkInfoProvider$unregister$2.b, e2, false, null);
                return;
            } catch (RuntimeException e3) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "We couldn't unregister the Network Callback";
                    }
                }, e3, false, null);
                return;
            }
        }
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "We couldn't unregister the Network Callback";
            }
        }, null, false, null);
    }

    @Override // defpackage.setFlashType
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final NetworkInfo getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
