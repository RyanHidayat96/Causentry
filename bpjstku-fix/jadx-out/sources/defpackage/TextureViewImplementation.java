package defpackage;

import java.util.logging.Level;
import kotlin.collections.ArraysUtilJVM;

/* JADX INFO: loaded from: classes4.dex */
final class TextureViewImplementation implements Runnable, TextureViewImplementationExternalSyntheticLambda4 {
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final TextureViewImplementationExternalSyntheticLambda1 b = new TextureViewImplementationExternalSyntheticLambda1();

    TextureViewImplementation(lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
    }

    @Override // defpackage.TextureViewImplementationExternalSyntheticLambda4
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj) {
        TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3B = TextureViewImplementationExternalSyntheticLambda3.b(onsurfacetextureupdated, obj);
        synchronized (this) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textureViewImplementationExternalSyntheticLambda3B);
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentbindingInflater1();
                    if (textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1 == null) {
                        synchronized (this) {
                            textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            if (textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1 == null) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                                return;
                            }
                        }
                    }
                    lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object obj = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    onSurfaceTextureUpdated onsurfacetextureupdated = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
                    TextureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentbindingInflater1);
                    if (onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1545908961, new Object[]{lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation, onsurfacetextureupdated, obj});
                    }
                } catch (InterruptedException e2) {
                    lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface2androidxcameraviewtextureviewimplementation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder();
                    sb.append(Thread.currentThread().getName());
                    sb.append(" was interruppted");
                    lambdatrytoprovidepreviewsurface2androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(level, sb.toString(), e2);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                    return;
                }
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                throw th;
            }
        }
    }
}
