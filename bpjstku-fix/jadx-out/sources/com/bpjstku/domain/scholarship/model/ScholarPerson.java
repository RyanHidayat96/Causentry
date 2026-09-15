package com.bpjstku.domain.scholarship.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001c\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b$\u0010\u001d"}, d2 = {"Lcom/bpjstku/domain/scholarship/model/ScholarPerson;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "Lcom/bpjstku/domain/scholarship/model/ScholarBenefit;", "p3", "p4", "Ljava/util/Calendar;", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/scholarship/model/ScholarBenefit;Ljava/lang/String;Ljava/util/Calendar;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "g", "Lcom/bpjstku/domain/scholarship/model/ScholarBenefit;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Calendar;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarPerson implements Parcelable {
    public static final Parcelable.Creator<ScholarPerson> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public String asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Calendar a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ScholarBenefit TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ScholarPerson(String str, String str2, String str3, ScholarBenefit scholarBenefit, String str4, Calendar calendar, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.b = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = scholarBenefit;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.a = calendar;
        this.asBinder = str5;
    }

    public /* synthetic */ ScholarPerson(String str, String str2, String str3, ScholarBenefit scholarBenefit, String str4, Calendar calendar, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : scholarBenefit, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : calendar, (i & 64) != 0 ? null : str5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarPerson)) {
            return false;
        }
        ScholarPerson scholarPerson = (ScholarPerson) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarPerson.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarPerson.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, scholarPerson.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, scholarPerson.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, scholarPerson.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.a, scholarPerson.a) && Intrinsics.areEqual(this.asBinder, scholarPerson.asBinder);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        String str = this.b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        ScholarBenefit scholarBenefit = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode4 = scholarBenefit == null ? 0 : scholarBenefit.hashCode();
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Calendar calendar = this.a;
        int iHashCode6 = calendar == null ? 0 : calendar.hashCode();
        String str3 = this.asBinder;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.b;
        ScholarBenefit scholarBenefit = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        Calendar calendar = this.a;
        String str5 = this.asBinder;
        StringBuilder sb = new StringBuilder("ScholarPerson(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(scholarBenefit);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str4);
        sb.append(", a=");
        sb.append(calendar);
        sb.append(", asBinder=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        ScholarBenefit scholarBenefit = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (scholarBenefit == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            scholarBenefit.writeToParcel(p0, p1);
        }
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeSerializable(this.a);
        p0.writeString(this.asBinder);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<ScholarPerson> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScholarPerson createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ScholarPerson(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ScholarBenefit.CREATOR.createFromParcel(parcel), parcel.readString(), (Calendar) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScholarPerson[] newArray(int i) {
            return new ScholarPerson[i];
        }
    }
}
