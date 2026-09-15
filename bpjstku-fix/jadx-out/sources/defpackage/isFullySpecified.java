package defpackage;

import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public final class isFullySpecified implements Resource<byte[]> {
    private final byte[] TuitionPaymentFragmentbindingInflater1;

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public isFullySpecified(byte[] bArr) {
        if (bArr != null) {
            this.TuitionPaymentFragmentbindingInflater1 = bArr;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentbindingInflater1.length;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final /* synthetic */ byte[] TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
