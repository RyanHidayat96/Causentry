package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class onMergeConfig {
    private static volatile onMergeConfig TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final b TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final Set<ImageAnalysis.TuitionPaymentFragmentbindingInflater1> b = new HashSet();

    interface b {
        void TuitionPaymentFragmentbindingInflater1();

        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    static onMergeConfig TuitionPaymentFragmentbindingInflater1(Context context) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            synchronized (onMergeConfig.class) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new onMergeConfig(context.getApplicationContext());
                }
            }
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private onMergeConfig(final Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new setZslDisabled.AnonymousClass3(new setZslDisabled.b<ConnectivityManager>() { // from class: onMergeConfig.3
            @Override // setZslDisabled.b
            public final /* synthetic */ ConnectivityManager TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        }), new ImageAnalysis.TuitionPaymentFragmentbindingInflater1() { // from class: onMergeConfig.1
            @Override // ImageAnalysis.TuitionPaymentFragmentbindingInflater1
            public final void b(boolean z) {
                ArrayList arrayList;
                getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                synchronized (onMergeConfig.this) {
                    arrayList = new ArrayList(onMergeConfig.this.b);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ImageAnalysis.TuitionPaymentFragmentbindingInflater1) it.next()).b(z);
                }
            }
        });
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements b {
        boolean TuitionPaymentFragmentbindingInflater1;
        private final setZslDisabled.b<ConnectivityManager> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final ImageAnalysis.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ConnectivityManager.NetworkCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ConnectivityManager.NetworkCallback() { // from class: onMergeConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3.2

            /* JADX INFO: renamed from: onMergeConfig$TuitionPaymentFragmentspecialinlinedviewModeldefault3$2$1, reason: invalid class name */
            final class AnonymousClass1 implements Runnable {
                private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

                AnonymousClass1(boolean z) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    boolean z2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentbindingInflater1;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentbindingInflater1 = z;
                    if (z2 != z) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(z);
                    }
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(new AnonymousClass1(true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(new AnonymousClass1(false));
            }
        };

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(setZslDisabled.b<ConnectivityManager> bVar, ImageAnalysis.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
        }

        @Override // onMergeConfig.b
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().getActiveNetwork() != null;
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().registerDefaultNetworkCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // onMergeConfig.b
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1().unregisterNetworkCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }
}
