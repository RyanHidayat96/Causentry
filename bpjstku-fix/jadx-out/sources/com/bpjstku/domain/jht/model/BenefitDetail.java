package com.bpjstku.domain.jht.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010%R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010%R\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010%R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010%R\u0016\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010%R\u0016\u00107\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010%"}, d2 = {"Lcom/bpjstku/domain/jht/model/BenefitDetail;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "INotificationSideChannel", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "getInterfaceDescriptor", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "d", "g", "onTransact", "asBinder", "cancel", "INotificationSideChannelDefault", "notify", "cancelAll", "RemoteActionCompatParcelizer", "INotificationSideChannelStub"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BenefitDetail implements Parcelable {
    public static final Parcelable.Creator<BenefitDetail> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String INotificationSideChannelStub;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String onTransact;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String asBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BenefitDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.b = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
        this.a = str6;
        this.g = str7;
        this.d = str8;
        this.asBinder = str9;
        this.asInterface = str10;
        this.notify = str11;
        this.onTransact = str12;
        this.INotificationSideChannel = str13;
        this.cancelAll = str14;
        this.cancel = str15;
        this.RemoteActionCompatParcelizer = str16;
        this.INotificationSideChannelStub = str17;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BenefitDetail)) {
            return false;
        }
        BenefitDetail benefitDetail = (BenefitDetail) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, benefitDetail.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, benefitDetail.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.a, benefitDetail.a) && Intrinsics.areEqual(this.g, benefitDetail.g) && Intrinsics.areEqual(this.d, benefitDetail.d) && Intrinsics.areEqual(this.asBinder, benefitDetail.asBinder) && Intrinsics.areEqual(this.asInterface, benefitDetail.asInterface) && Intrinsics.areEqual(this.notify, benefitDetail.notify) && Intrinsics.areEqual(this.onTransact, benefitDetail.onTransact) && Intrinsics.areEqual(this.INotificationSideChannel, benefitDetail.INotificationSideChannel) && Intrinsics.areEqual(this.cancelAll, benefitDetail.cancelAll) && Intrinsics.areEqual(this.cancel, benefitDetail.cancel) && Intrinsics.areEqual(this.RemoteActionCompatParcelizer, benefitDetail.RemoteActionCompatParcelizer) && Intrinsics.areEqual(this.INotificationSideChannelStub, benefitDetail.INotificationSideChannelStub);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.a;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.g;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.d;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.asBinder;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.asInterface;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.notify;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.onTransact;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.INotificationSideChannel;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.cancelAll;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.cancel;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.RemoteActionCompatParcelizer;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.INotificationSideChannelStub;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.a;
        String str7 = this.g;
        String str8 = this.d;
        String str9 = this.asBinder;
        String str10 = this.asInterface;
        String str11 = this.notify;
        String str12 = this.onTransact;
        String str13 = this.INotificationSideChannel;
        String str14 = this.cancelAll;
        String str15 = this.cancel;
        String str16 = this.RemoteActionCompatParcelizer;
        String str17 = this.INotificationSideChannelStub;
        StringBuilder sb = new StringBuilder("BenefitDetail(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str5);
        sb.append(", a=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", d=");
        sb.append(str8);
        sb.append(", asBinder=");
        sb.append(str9);
        sb.append(", asInterface=");
        sb.append(str10);
        sb.append(", notify=");
        sb.append(str11);
        sb.append(", onTransact=");
        sb.append(str12);
        sb.append(", INotificationSideChannel=");
        sb.append(str13);
        sb.append(", cancelAll=");
        sb.append(str14);
        sb.append(", cancel=");
        sb.append(str15);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str16);
        sb.append(", INotificationSideChannelStub=");
        sb.append(str17);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.a);
        p0.writeString(this.g);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.notify);
        p0.writeString(this.onTransact);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancelAll);
        p0.writeString(this.cancel);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.INotificationSideChannelStub);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<BenefitDetail> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BenefitDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BenefitDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BenefitDetail[] newArray(int i) {
            return new BenefitDetail[i];
        }
    }
}
