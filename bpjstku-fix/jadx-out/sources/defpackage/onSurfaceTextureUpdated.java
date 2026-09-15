package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class onSurfaceTextureUpdated {
    final onSurfaceTextureDestroyed TuitionPaymentFragmentbindingInflater1;
    volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    onSurfaceTextureUpdated(Object obj, onSurfaceTextureDestroyed onsurfacetexturedestroyed) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
        this.TuitionPaymentFragmentbindingInflater1 = onsurfacetexturedestroyed;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onSurfaceTextureUpdated)) {
            return false;
        }
        onSurfaceTextureUpdated onsurfacetextureupdated = (onSurfaceTextureUpdated) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentbindingInflater1.equals(onsurfacetextureupdated.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() + this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.hashCode();
    }
}
