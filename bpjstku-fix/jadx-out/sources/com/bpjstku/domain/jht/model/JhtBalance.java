package com.bpjstku.domain.jht.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.util.constant.MembershipType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\"R\u0014\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\"R\u0014\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\"R\u0014\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\"R\u0014\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\""}, d2 = {"Lcom/bpjstku/domain/jht/model/JhtBalance;", "Landroid/os/Parcelable;", "", "p0", "Lcom/bpjstku/util/constant/MembershipType;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(Ljava/lang/String;Lcom/bpjstku/util/constant/MembershipType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "asBinder", "Lcom/bpjstku/util/constant/MembershipType;", "b", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "d", "g", "INotificationSideChannel", "cancel", "a", "asInterface", "notify", "cancelAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtBalance implements Parcelable {
    public static final Parcelable.Creator<JhtBalance> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final MembershipType b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String cancel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public JhtBalance(String str, MembershipType membershipType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(membershipType, "");
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.b = membershipType;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str4;
        this.d = str5;
        this.asBinder = str6;
        this.g = str7;
        this.a = str8;
        this.asInterface = str9;
        this.cancel = str10;
        this.notify = str11;
        this.cancelAll = str12;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtBalance)) {
            return false;
        }
        JhtBalance jhtBalance = (JhtBalance) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.b == jhtBalance.b && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, jhtBalance.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jhtBalance.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.d, jhtBalance.d) && Intrinsics.areEqual(this.asBinder, jhtBalance.asBinder) && Intrinsics.areEqual(this.g, jhtBalance.g) && Intrinsics.areEqual(this.a, jhtBalance.a) && Intrinsics.areEqual(this.asInterface, jhtBalance.asInterface) && Intrinsics.areEqual(this.cancel, jhtBalance.cancel) && Intrinsics.areEqual(this.notify, jhtBalance.notify) && Intrinsics.areEqual(this.cancelAll, jhtBalance.cancelAll);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.d.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.g.hashCode()) * 31) + this.a.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.cancel.hashCode()) * 31) + this.notify.hashCode()) * 31) + this.cancelAll.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MembershipType membershipType = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str5 = this.d;
        String str6 = this.asBinder;
        String str7 = this.g;
        String str8 = this.a;
        String str9 = this.asInterface;
        String str10 = this.cancel;
        String str11 = this.notify;
        String str12 = this.cancelAll;
        StringBuilder sb = new StringBuilder("JhtBalance(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", b=");
        sb.append(membershipType);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str4);
        sb.append(", d=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", a=");
        sb.append(str8);
        sb.append(", asInterface=");
        sb.append(str9);
        sb.append(", cancel=");
        sb.append(str10);
        sb.append(", notify=");
        sb.append(str11);
        sb.append(", cancelAll=");
        sb.append(str12);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.b.writeToParcel(p0, p1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.a);
        p0.writeString(this.asInterface);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.cancelAll);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<JhtBalance> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ JhtBalance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JhtBalance(parcel.readString(), MembershipType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JhtBalance[] newArray(int i) {
            return new JhtBalance[i];
        }
    }
}
