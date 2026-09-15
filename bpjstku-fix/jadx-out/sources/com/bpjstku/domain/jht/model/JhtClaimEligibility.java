package com.bpjstku.domain.jht.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0014¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010)\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b(\u0010#R\u0016\u0010*\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010\"\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010+\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010-\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010(\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b.\u0010#R\u0016\u0010%\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u0010/\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b0\u0010#R\u0016\u0010.\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b-\u0010#R\u0016\u00101\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u00100\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b1\u0010#R\u0016\u0010,\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b'\u0010#"}, d2 = {"Lcom/bpjstku/domain/jht/model/JhtClaimEligibility;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "asBinder", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "d", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "cancelAll", "g", "notify", "cancel", "onTransact", "INotificationSideChannel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimEligibility implements Parcelable {
    public static final Parcelable.Creator<JhtClaimEligibility> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public String onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public String asBinder;
    public String a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public String d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public String g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String notify;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public String asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public String cancel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public JhtClaimEligibility(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str5;
        this.asBinder = str6;
        this.a = str7;
        this.g = str8;
        this.asInterface = str9;
        this.d = str10;
        this.cancel = str11;
        this.notify = str12;
        this.INotificationSideChannel = str13;
        this.onTransact = str14;
        this.cancelAll = str15;
    }

    public /* synthetic */ JhtClaimEligibility(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimEligibility)) {
            return false;
        }
        JhtClaimEligibility jhtClaimEligibility = (JhtClaimEligibility) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, jhtClaimEligibility.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, jhtClaimEligibility.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.asBinder, jhtClaimEligibility.asBinder) && Intrinsics.areEqual(this.a, jhtClaimEligibility.a) && Intrinsics.areEqual(this.g, jhtClaimEligibility.g) && Intrinsics.areEqual(this.asInterface, jhtClaimEligibility.asInterface) && Intrinsics.areEqual(this.d, jhtClaimEligibility.d) && Intrinsics.areEqual(this.cancel, jhtClaimEligibility.cancel) && Intrinsics.areEqual(this.notify, jhtClaimEligibility.notify) && Intrinsics.areEqual(this.INotificationSideChannel, jhtClaimEligibility.INotificationSideChannel) && Intrinsics.areEqual(this.onTransact, jhtClaimEligibility.onTransact) && Intrinsics.areEqual(this.cancelAll, jhtClaimEligibility.cancelAll);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.a.hashCode()) * 31) + this.g.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.d.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.cancelAll.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = this.asBinder;
        String str7 = this.a;
        String str8 = this.g;
        String str9 = this.asInterface;
        String str10 = this.d;
        String str11 = this.cancel;
        String str12 = this.notify;
        String str13 = this.INotificationSideChannel;
        String str14 = this.onTransact;
        String str15 = this.cancelAll;
        StringBuilder sb = new StringBuilder("JhtClaimEligibility(TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", a=");
        sb.append(str7);
        sb.append(", g=");
        sb.append(str8);
        sb.append(", asInterface=");
        sb.append(str9);
        sb.append(", d=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", notify=");
        sb.append(str12);
        sb.append(", INotificationSideChannel=");
        sb.append(str13);
        sb.append(", onTransact=");
        sb.append(str14);
        sb.append(", cancelAll=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.asBinder);
        p0.writeString(this.a);
        p0.writeString(this.g);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancelAll);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<JhtClaimEligibility> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JhtClaimEligibility createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JhtClaimEligibility(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JhtClaimEligibility[] newArray(int i) {
            return new JhtClaimEligibility[i];
        }
    }
}
