package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class surfaceListWithTimeout {
    public getBufferFormat TuitionPaymentFragmentbindingInflater1;
    public final DeferrableSurfaces TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public surfaceListWithTimeout(DeferrableSurfaces deferrableSurfaces) {
        if (deferrableSurfaces == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deferrableSurfaces;
    }

    public final String toString() {
        try {
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
            }
            return this.TuitionPaymentFragmentbindingInflater1.toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
