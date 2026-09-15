package defpackage;

import kotlin.collections.ArraysUtilJVM;

/* JADX INFO: loaded from: classes4.dex */
final class lambdaonSurfaceRequested0androidxcameraviewTextureViewImplementation implements Runnable, TextureViewImplementationExternalSyntheticLambda4 {
    final lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation TuitionPaymentFragmentbindingInflater1;
    final TextureViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TextureViewImplementationExternalSyntheticLambda1();

    lambdaonSurfaceRequested0androidxcameraviewTextureViewImplementation(lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation) {
        this.TuitionPaymentFragmentbindingInflater1 = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
    }

    @Override // defpackage.TextureViewImplementationExternalSyntheticLambda4
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TextureViewImplementationExternalSyntheticLambda3.b(onsurfacetextureupdated, obj));
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            throw new IllegalStateException("No pending post available");
        }
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = this.TuitionPaymentFragmentbindingInflater1;
        Object obj = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        onSurfaceTextureUpdated onsurfacetextureupdated = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        TextureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1545908961, new Object[]{lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation, onsurfacetextureupdated, obj});
        }
    }
}
