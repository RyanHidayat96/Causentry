package com.bpjstku.domain.tuition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\"R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\"R\u0014\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\""}, d2 = {"Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "asBinder", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "Ljava/lang/Double;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "d", "asInterface", "a", "cancel", "notify", "INotificationSideChannel", "onTransact", "cancelAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PaymentHistoryItem implements Parcelable {
    public static final Parcelable.Creator<PaymentHistoryItem> CREATOR = new b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final Double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final Double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final Double b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String g;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String INotificationSideChannel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PaymentHistoryItem(String str, Double d, Double d2, Double d3, Double d4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentbindingInflater1 = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d3;
        this.b = d4;
        this.d = str2;
        this.asInterface = str3;
        this.a = str4;
        this.asBinder = str5;
        this.g = str6;
        this.INotificationSideChannel = str7;
        this.onTransact = str8;
        this.notify = str9;
    }

    public static final class b implements Parcelable.Creator<PaymentHistoryItem> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PaymentHistoryItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaymentHistoryItem(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PaymentHistoryItem[] newArray(int i) {
            return new PaymentHistoryItem[i];
        }
    }

    public static /* synthetic */ PaymentHistoryItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentHistoryItem paymentHistoryItem, String str) {
        String str2 = paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Double d = paymentHistoryItem.TuitionPaymentFragmentbindingInflater1;
        Double d2 = paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Double d3 = paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Double d4 = paymentHistoryItem.b;
        String str3 = paymentHistoryItem.d;
        String str4 = paymentHistoryItem.asInterface;
        String str5 = paymentHistoryItem.a;
        String str6 = paymentHistoryItem.asBinder;
        String str7 = paymentHistoryItem.g;
        String str8 = paymentHistoryItem.onTransact;
        String str9 = paymentHistoryItem.notify;
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new PaymentHistoryItem(str2, d, d2, d3, d4, str3, str4, str5, str6, str7, str, str8, str9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PaymentHistoryItem)) {
            return false;
        }
        PaymentHistoryItem paymentHistoryItem = (PaymentHistoryItem) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual((Object) this.TuitionPaymentFragmentbindingInflater1, (Object) paymentHistoryItem.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual((Object) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Object) paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual((Object) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Object) paymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual((Object) this.b, (Object) paymentHistoryItem.b) && Intrinsics.areEqual(this.d, paymentHistoryItem.d) && Intrinsics.areEqual(this.asInterface, paymentHistoryItem.asInterface) && Intrinsics.areEqual(this.a, paymentHistoryItem.a) && Intrinsics.areEqual(this.asBinder, paymentHistoryItem.asBinder) && Intrinsics.areEqual(this.g, paymentHistoryItem.g) && Intrinsics.areEqual(this.INotificationSideChannel, paymentHistoryItem.INotificationSideChannel) && Intrinsics.areEqual(this.onTransact, paymentHistoryItem.onTransact) && Intrinsics.areEqual(this.notify, paymentHistoryItem.notify);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode4 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.b;
        int iHashCode5 = d4 == null ? 0 : d4.hashCode();
        String str2 = this.d;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.asInterface;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.asBinder;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.g;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.INotificationSideChannel;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + this.onTransact.hashCode()) * 31) + this.notify.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Double d = this.TuitionPaymentFragmentbindingInflater1;
        Double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Double d4 = this.b;
        String str2 = this.d;
        String str3 = this.asInterface;
        String str4 = this.a;
        String str5 = this.asBinder;
        String str6 = this.g;
        String str7 = this.INotificationSideChannel;
        String str8 = this.onTransact;
        String str9 = this.notify;
        StringBuilder sb = new StringBuilder("PaymentHistoryItem(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(d3);
        sb.append(", b=");
        sb.append(d4);
        sb.append(", d=");
        sb.append(str2);
        sb.append(", asInterface=");
        sb.append(str3);
        sb.append(", a=");
        sb.append(str4);
        sb.append(", asBinder=");
        sb.append(str5);
        sb.append(", g=");
        sb.append(str6);
        sb.append(", INotificationSideChannel=");
        sb.append(str7);
        sb.append(", onTransact=");
        sb.append(str8);
        sb.append(", notify=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Double d = this.TuitionPaymentFragmentbindingInflater1;
        if (d == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d.doubleValue());
        }
        Double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (d2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d2.doubleValue());
        }
        Double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (d3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d3.doubleValue());
        }
        Double d4 = this.b;
        if (d4 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeDouble(d4.doubleValue());
        }
        p0.writeString(this.d);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.onTransact);
        p0.writeString(this.notify);
    }
}
