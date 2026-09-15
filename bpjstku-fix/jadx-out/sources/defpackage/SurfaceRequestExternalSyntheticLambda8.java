package defpackage;

import com.dynatrace.android.agent.comm.InvalidResponseException;

/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceRequestExternalSyntheticLambda8 implements Runnable {
    private SurfaceRequest2 TuitionPaymentFragmentbindingInflater1;
    private Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SurfaceRequestExternalSyntheticLambda8(SurfaceRequest2 surfaceRequest2, Throwable th) {
        this.TuitionPaymentFragmentbindingInflater1 = surfaceRequest2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (th instanceof InvalidResponseException) {
            SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7 = ((InvalidResponseException) th).response;
            int i = surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentbindingInflater1;
            String str2 = surfaceRequestExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
