package com.bpjstku.domain.branchoffice.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010$"}, d2 = {"Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "p3", "p4", "", "Lcom/bpjstku/domain/branchoffice/model/Office;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RegionalOffice implements Parcelable {
    public static final Parcelable.Creator<RegionalOffice> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<Office> asInterface;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RegionalOffice(String str, String str2, double d, double d2, String str3, List<Office> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d;
        this.TuitionPaymentFragmentbindingInflater1 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
        this.asInterface = list;
    }

    public /* synthetic */ RegionalOffice(String str, String str2, double d, double d2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, d2, str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RegionalOffice)) {
            return false;
        }
        RegionalOffice regionalOffice = (RegionalOffice) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, regionalOffice.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, regionalOffice.b) && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, regionalOffice.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0 && Double.compare(this.TuitionPaymentFragmentbindingInflater1, regionalOffice.TuitionPaymentFragmentbindingInflater1) == 0 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, regionalOffice.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.asInterface, regionalOffice.asInterface);
    }

    public final int hashCode() {
        return (((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.b.hashCode()) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + Double.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.asInterface.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.b;
        double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        double d2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        List<Office> list = this.asInterface;
        StringBuilder sb = new StringBuilder("RegionalOffice(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str3);
        sb.append(", asInterface=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeDouble(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        List<Office> list = this.asInterface;
        p0.writeInt(list.size());
        Iterator<Office> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<RegionalOffice> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RegionalOffice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Office.CREATOR.createFromParcel(parcel));
            }
            return new RegionalOffice(string, string2, d, d2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RegionalOffice[] newArray(int i) {
            return new RegionalOffice[i];
        }
    }
}
