package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class TextureViewImplementationExternalSyntheticLambda1 {
    private TextureViewImplementationExternalSyntheticLambda3 TuitionPaymentFragmentbindingInflater1;
    private TextureViewImplementationExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    TextureViewImplementationExternalSyntheticLambda1() {
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3) {
        synchronized (this) {
            try {
                if (textureViewImplementationExternalSyntheticLambda3 == null) {
                    throw new NullPointerException("null cannot be enqueued");
                }
                TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda4 = this.TuitionPaymentFragmentbindingInflater1;
                if (textureViewImplementationExternalSyntheticLambda4 != null) {
                    textureViewImplementationExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = textureViewImplementationExternalSyntheticLambda3;
                    this.TuitionPaymentFragmentbindingInflater1 = textureViewImplementationExternalSyntheticLambda3;
                } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    this.TuitionPaymentFragmentbindingInflater1 = textureViewImplementationExternalSyntheticLambda3;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = textureViewImplementationExternalSyntheticLambda3;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final TextureViewImplementationExternalSyntheticLambda3 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3;
        synchronized (this) {
            textureViewImplementationExternalSyntheticLambda3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (textureViewImplementationExternalSyntheticLambda3 != null) {
                TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda4 = textureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = textureViewImplementationExternalSyntheticLambda4;
                if (textureViewImplementationExternalSyntheticLambda4 == null) {
                    this.TuitionPaymentFragmentbindingInflater1 = null;
                }
            }
        }
        return textureViewImplementationExternalSyntheticLambda3;
    }

    final TextureViewImplementationExternalSyntheticLambda3 TuitionPaymentFragmentbindingInflater1() throws InterruptedException {
        TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                wait(1000L);
            }
            textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
