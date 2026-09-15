package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0010\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0012\u0010\u0018"}, d2 = {"LlambdasubmitStillCaptureRequests0;", "", "", "p0", "", "p1", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "(I)V"}, k = 1, mv = {2, 3, 0})
public final /* data */ class lambdasubmitStillCaptureRequests0 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @SerializedName("message")
    String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("code")
    String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdasubmitStillCaptureRequests0(int i, String str, String str2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
    }

    public /* synthetic */ lambdasubmitStillCaptureRequests0(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }

    public final void TuitionPaymentFragmentbindingInflater1(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        this.b = str;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final String getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    public lambdasubmitStillCaptureRequests0() {
        this(0, null, null, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof lambdasubmitStillCaptureRequests0)) {
            return false;
        }
        lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0 = (lambdasubmitStillCaptureRequests0) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.b, lambdasubmitstillcapturerequests0.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((i * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("lambdasubmitStillCaptureRequests0(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", b=");
        sb.append(this.b);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(")");
        return sb.toString();
    }
}
