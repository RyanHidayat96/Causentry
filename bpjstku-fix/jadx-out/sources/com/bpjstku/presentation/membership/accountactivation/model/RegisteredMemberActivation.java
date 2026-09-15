package com.bpjstku.presentation.membership.accountactivation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010%R\u0016\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010%R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010%R\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010%"}, d2 = {"Lcom/bpjstku/presentation/membership/accountactivation/model/RegisteredMemberActivation;", "Landroid/os/Parcelable;", "", "p0", "p1", "Lcom/bpjstku/util/constant/Citizenship;", "p2", "Lcom/bpjstku/util/constant/MembershipType;", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/util/constant/Citizenship;Lcom/bpjstku/util/constant/MembershipType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d", "b", "Lcom/bpjstku/util/constant/Citizenship;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "cancelAll", "Lcom/bpjstku/util/constant/MembershipType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "a", "asBinder", "INotificationSideChannel", "cancel", "asInterface", "notify", "g", "onTransact"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegisteredMemberActivation implements Parcelable {
    public static final Parcelable.Creator<RegisteredMemberActivation> CREATOR = new b();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Citizenship TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String onTransact;
    private final String a;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String cancelAll;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final MembershipType TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String INotificationSideChannel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final String g;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final String notify;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RegisteredMemberActivation(String str, String str2, Citizenship citizenship, MembershipType membershipType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = citizenship;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = membershipType;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.a = str4;
        this.d = str5;
        this.asBinder = str6;
        this.asInterface = str7;
        this.g = str8;
        this.cancelAll = str9;
        this.onTransact = str10;
        this.cancel = str11;
        this.notify = str12;
        this.INotificationSideChannel = str13;
    }

    public /* synthetic */ RegisteredMemberActivation(String str, String str2, Citizenship citizenship, MembershipType membershipType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : citizenship, (i & 8) == 0 ? membershipType : null, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) == 0 ? str13 : "");
    }

    public static final class b implements Parcelable.Creator<RegisteredMemberActivation> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegisteredMemberActivation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RegisteredMemberActivation(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Citizenship.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MembershipType.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegisteredMemberActivation[] newArray(int i) {
            return new RegisteredMemberActivation[i];
        }
    }

    public RegisteredMemberActivation() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegisteredMemberActivation)) {
            return false;
        }
        RegisteredMemberActivation registeredMemberActivation = (RegisteredMemberActivation) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, registeredMemberActivation.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, registeredMemberActivation.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == registeredMemberActivation.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == registeredMemberActivation.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, registeredMemberActivation.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.a, registeredMemberActivation.a) && Intrinsics.areEqual(this.d, registeredMemberActivation.d) && Intrinsics.areEqual(this.asBinder, registeredMemberActivation.asBinder) && Intrinsics.areEqual(this.asInterface, registeredMemberActivation.asInterface) && Intrinsics.areEqual(this.g, registeredMemberActivation.g) && Intrinsics.areEqual(this.cancelAll, registeredMemberActivation.cancelAll) && Intrinsics.areEqual(this.onTransact, registeredMemberActivation.onTransact) && Intrinsics.areEqual(this.cancel, registeredMemberActivation.cancel) && Intrinsics.areEqual(this.notify, registeredMemberActivation.notify) && Intrinsics.areEqual(this.INotificationSideChannel, registeredMemberActivation.INotificationSideChannel);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode3 = citizenship == null ? 0 : citizenship.hashCode();
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode4 = membershipType == null ? 0 : membershipType.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.d;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.asBinder;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.asInterface;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.g;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.cancelAll;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.onTransact;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.cancel;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.notify;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.INotificationSideChannel;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.b;
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.a;
        String str5 = this.d;
        String str6 = this.asBinder;
        String str7 = this.asInterface;
        String str8 = this.g;
        String str9 = this.cancelAll;
        String str10 = this.onTransact;
        String str11 = this.cancel;
        String str12 = this.notify;
        String str13 = this.INotificationSideChannel;
        StringBuilder sb = new StringBuilder("RegisteredMemberActivation(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(citizenship);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(membershipType);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", a=");
        sb.append(str4);
        sb.append(", d=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", asInterface=");
        sb.append(str7);
        sb.append(", g=");
        sb.append(str8);
        sb.append(", cancelAll=");
        sb.append(str9);
        sb.append(", onTransact=");
        sb.append(str10);
        sb.append(", cancel=");
        sb.append(str11);
        sb.append(", notify=");
        sb.append(str12);
        sb.append(", INotificationSideChannel=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.b);
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (citizenship == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            citizenship.writeToParcel(p0, p1);
        }
        MembershipType membershipType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (membershipType == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            membershipType.writeToParcel(p0, p1);
        }
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.a);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.asInterface);
        p0.writeString(this.g);
        p0.writeString(this.cancelAll);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.INotificationSideChannel);
    }
}
