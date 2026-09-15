package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public interface lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation {
    TextureViewImplementationExternalSyntheticLambda4 TuitionPaymentFragmentbindingInflater1(lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation);

    boolean TuitionPaymentFragmentbindingInflater1();

    public static class TuitionPaymentFragmentbindingInflater1 implements lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation {
        private final Looper TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentbindingInflater1(Looper looper) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = looper;
        }

        @Override // defpackage.lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation
        public final boolean TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == Looper.myLooper();
        }

        @Override // defpackage.lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation
        public final TextureViewImplementationExternalSyntheticLambda4 TuitionPaymentFragmentbindingInflater1(lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation) {
            return new tryToProvidePreviewSurface(lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }
}
