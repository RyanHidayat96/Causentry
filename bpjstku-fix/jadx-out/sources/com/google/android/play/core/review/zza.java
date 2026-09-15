package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes4.dex */
public final class zza extends ReviewInfo {
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private final PendingIntent TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = pendingIntent;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(reviewInfo.b()) && this.TuitionPaymentFragmentbindingInflater1 == reviewInfo.TuitionPaymentFragmentbindingInflater1();
    }

    public final int hashCode() {
        return ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() ^ 1000003) * 1000003) ^ (true != this.TuitionPaymentFragmentbindingInflater1 ? 1237 : 1231);
    }

    public final String toString() {
        String string = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.toString();
        StringBuilder sb = new StringBuilder("ReviewInfo{pendingIntent=");
        sb.append(string);
        sb.append(", isNoOp=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
