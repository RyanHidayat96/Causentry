package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AutoValue_OutputSurface implements Runnable {
    private /* synthetic */ int TuitionPaymentFragmentbindingInflater1;
    private /* synthetic */ Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ getHdrFormat b;

    public /* synthetic */ AutoValue_OutputSurface(getHdrFormat gethdrformat, retryRequest retryrequest, int i, Runnable runnable) {
        this.b = gethdrformat;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = retryrequest;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final getHdrFormat gethdrformat = this.b;
        final retryRequest retryrequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final int i = this.TuitionPaymentFragmentbindingInflater1;
        Runnable runnable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        try {
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0 = gethdrformat.f939a;
            final AutoValue_StreamSpec1 autoValue_StreamSpec1 = gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Objects.requireNonNull(autoValue_StreamSpec1);
            cameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getChromaSubsampling
                @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                public final Object b() {
                    return Integer.valueOf(autoValue_StreamSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            });
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                gethdrformat.f939a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1() { // from class: getFrameRate
                    @Override // CameraConfigProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1
                    public final Object b() {
                        getHdrFormat gethdrformat2 = gethdrformat;
                        gethdrformat2.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest, i + 1);
                        return null;
                    }
                });
            } else {
                gethdrformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest, i);
            }
        } catch (SynchronizationException unused) {
            gethdrformat.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(retryrequest, i + 1);
        } finally {
            runnable.run();
        }
    }
}
