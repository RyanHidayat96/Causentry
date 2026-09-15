package defpackage;

import androidx.collection.ArrayMap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class getTargetRotation implements getCameraControl {
    public final ArrayMap<isMirroring<?>, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setSurfaceOccupancyPriority();

    @Override // defpackage.getCameraControl
    public final boolean equals(Object obj) {
        if (obj instanceof getTargetRotation) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(((getTargetRotation) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return false;
    }

    @Override // defpackage.getCameraControl
    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    @Override // defpackage.getCameraControl
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSize(); i++) {
            isMirroring<?> ismirroringKeyAt = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.keyAt(i);
            Object objValueAt = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.valueAt(i);
            isMirroring.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = ismirroringKeyAt.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (ismirroringKeyAt.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                ismirroringKeyAt.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ismirroringKeyAt.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getBytes(getCameraControl.TuitionPaymentFragmentbindingInflater1);
            }
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ismirroringKeyAt.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objValueAt, messageDigest);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Options{values=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append('}');
        return sb.toString();
    }
}
