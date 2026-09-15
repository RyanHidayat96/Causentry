package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class setResolutionSelector implements getCameraControl {
    private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setResolutionSelector(Object obj) {
        if (obj != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectKey{object=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (obj instanceof setResolutionSelector) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(((setResolutionSelector) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return false;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString().getBytes(TuitionPaymentFragmentbindingInflater1));
    }
}
