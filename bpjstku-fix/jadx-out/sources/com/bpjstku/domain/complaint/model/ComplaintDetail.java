package com.bpjstku.domain.complaint.model;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0014¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b(\u0010#R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b,\u0010#R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001c\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b/\u0010#"}, d2 = {"Lcom/bpjstku/domain/complaint/model/ComplaintDetail;", "Landroid/os/Parcelable;", "", "p0", "", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "Lcom/bpjstku/domain/complaint/model/DetailPerusahaanBelumTerdaftar;", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/bpjstku/domain/complaint/model/DetailPerusahaanBelumTerdaftar;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b", "asBinder", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "TuitionPaymentFragmentbindingInflater1", "onTransact", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "cancelAll", "g", "Lcom/bpjstku/domain/complaint/model/DetailPerusahaanBelumTerdaftar;", "cancel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ComplaintDetail implements Parcelable {
    public static final Parcelable.Creator<ComplaintDetail> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final DetailPerusahaanBelumTerdaftar onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List<TrackingComplaint> asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final List<TrackingComplaint> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public String asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final List<TrackingComplaint> g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String cancel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ComplaintDetail(String str, List<TrackingComplaint> list, String str2, String str3, String str4, String str5, List<TrackingComplaint> list2, String str6, List<TrackingComplaint> list3, String str7, DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar, String str8) {
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str4;
        this.asBinder = str5;
        this.asInterface = list2;
        this.d = str6;
        this.g = list3;
        this.a = str7;
        this.onTransact = detailPerusahaanBelumTerdaftar;
        this.cancel = str8;
    }

    public /* synthetic */ ComplaintDetail(String str, List list, String str2, String str3, String str4, String str5, List list2, String str6, List list3, String str7, DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? CollectionsKt.emptyList() : list3, (i & 512) != 0 ? null : str7, (i & 1024) == 0 ? detailPerusahaanBelumTerdaftar : null, (i & 2048) == 0 ? str8 : "");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<ComplaintDetail> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComplaintDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TrackingComplaint.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList4 = arrayList;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(TrackingComplaint.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList5 = arrayList2;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(TrackingComplaint.CREATOR.createFromParcel(parcel));
                }
            }
            return new ComplaintDetail(string, arrayList4, string2, string3, string4, string5, arrayList5, string6, arrayList3, parcel.readString(), parcel.readInt() != 0 ? DetailPerusahaanBelumTerdaftar.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComplaintDetail[] newArray(int i) {
            return new ComplaintDetail[i];
        }
    }

    public ComplaintDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComplaintDetail)) {
            return false;
        }
        ComplaintDetail complaintDetail = (ComplaintDetail) p0;
        return Intrinsics.areEqual(this.b, complaintDetail.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, complaintDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, complaintDetail.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, complaintDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, complaintDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.asBinder, complaintDetail.asBinder) && Intrinsics.areEqual(this.asInterface, complaintDetail.asInterface) && Intrinsics.areEqual(this.d, complaintDetail.d) && Intrinsics.areEqual(this.g, complaintDetail.g) && Intrinsics.areEqual(this.a, complaintDetail.a) && Intrinsics.areEqual(this.onTransact, complaintDetail.onTransact) && Intrinsics.areEqual(this.cancel, complaintDetail.cancel);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<TrackingComplaint> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.asBinder;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        List<TrackingComplaint> list2 = this.asInterface;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        String str6 = this.d;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        List<TrackingComplaint> list3 = this.g;
        int iHashCode9 = list3 == null ? 0 : list3.hashCode();
        String str7 = this.a;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar = this.onTransact;
        int iHashCode11 = detailPerusahaanBelumTerdaftar == null ? 0 : detailPerusahaanBelumTerdaftar.hashCode();
        String str8 = this.cancel;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        List<TrackingComplaint> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str5 = this.asBinder;
        List<TrackingComplaint> list2 = this.asInterface;
        String str6 = this.d;
        List<TrackingComplaint> list3 = this.g;
        String str7 = this.a;
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar = this.onTransact;
        String str8 = this.cancel;
        StringBuilder sb = new StringBuilder("ComplaintDetail(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(list);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str4);
        sb.append(", asBinder=");
        sb.append(str5);
        sb.append(", asInterface=");
        sb.append(list2);
        sb.append(", d=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(list3);
        sb.append(", a=");
        sb.append(str7);
        sb.append(", onTransact=");
        sb.append(detailPerusahaanBelumTerdaftar);
        sb.append(", cancel=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.b);
        List<TrackingComplaint> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (list == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(list.size());
            Iterator<TrackingComplaint> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(p0, p1);
            }
        }
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.asBinder);
        List<TrackingComplaint> list2 = this.asInterface;
        if (list2 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(list2.size());
            Iterator<TrackingComplaint> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(p0, p1);
            }
        }
        p0.writeString(this.d);
        List<TrackingComplaint> list3 = this.g;
        if (list3 == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            p0.writeInt(list3.size());
            Iterator<TrackingComplaint> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(p0, p1);
            }
        }
        p0.writeString(this.a);
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar = this.onTransact;
        if (detailPerusahaanBelumTerdaftar == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            detailPerusahaanBelumTerdaftar.writeToParcel(p0, p1);
        }
        p0.writeString(this.cancel);
    }
}
