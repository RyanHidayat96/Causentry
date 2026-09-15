package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"LsetCameraX;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "TuitionPaymentFragmentbindingInflater1", "Landroid/content/Context;", "", "LsetCameraX$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetOrCreateCameraXInstancelambda18lambda17;", "LgetOrCreateCameraXInstancelambda18lambda17;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class setCameraX {
    public final Context TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public getOrCreateCameraXInstancelambda18lambda17 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public ConnectivityManager.NetworkCallback b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        void TuitionPaymentFragmentbindingInflater1();
    }

    public setCameraX(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.TuitionPaymentFragmentbindingInflater1 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends ConnectivityManager.NetworkCallback {
        private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Handler(Looper.getMainLooper());

        public TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            Handler handler = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final setCameraX setcamerax = setCameraX.this;
            handler.post(new Runnable() { // from class: getOrCreateCameraXInstance
                @Override // java.lang.Runnable
                public final void run() {
                    setCameraX setcamerax2 = setcamerax;
                    Intrinsics.checkNotNullParameter(setcamerax2, "");
                    Iterator<T> it = setcamerax2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                    while (it.hasNext()) {
                        ((setCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3) it.next()).TuitionPaymentFragmentbindingInflater1();
                    }
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            Handler handler = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final setCameraX setcamerax = setCameraX.this;
            handler.post(new Runnable() { // from class: bindToLifecyclecamera_lifecycle_release
                @Override // java.lang.Runnable
                public final void run() {
                    setCameraX setcamerax2 = setcamerax;
                    Intrinsics.checkNotNullParameter(setcamerax2, "");
                    for (setCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 : setcamerax2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    }
                }
            });
        }
    }
}
