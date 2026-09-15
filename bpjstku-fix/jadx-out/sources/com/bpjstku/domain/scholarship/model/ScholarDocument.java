package com.bpjstku.domain.scholarship.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b%\u0010\u001c"}, d2 = {"Lcom/bpjstku/domain/scholarship/model/ScholarDocument;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "a", "b", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "asInterface", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarDocument implements Parcelable {
    public static final Parcelable.Creator<ScholarDocument> CREATOR = new b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ScholarDocument(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.b = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
        this.a = str5;
        this.asInterface = str6;
        this.d = str7;
    }

    public /* synthetic */ ScholarDocument(String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, obj, (i & 16) != 0 ? "false" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7);
    }

    public static final class b implements Parcelable.Creator<ScholarDocument> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScholarDocument createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ScholarDocument(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readValue(ScholarDocument.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScholarDocument[] newArray(int i) {
            return new ScholarDocument[i];
        }
    }

    public static /* synthetic */ ScholarDocument TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarDocument scholarDocument, String str, String str2, String str3, Object obj, String str4, String str5, String str6, String str7, int i) {
        String str8 = (i & 1) != 0 ? scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str;
        String str9 = (i & 2) != 0 ? scholarDocument.TuitionPaymentFragmentbindingInflater1 : str2;
        String str10 = (i & 4) != 0 ? scholarDocument.b : str3;
        Object obj2 = (i & 8) != 0 ? scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : obj;
        String str11 = (i & 16) != 0 ? scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str4;
        String str12 = (i & 32) != 0 ? scholarDocument.a : str5;
        String str13 = (i & 64) != 0 ? scholarDocument.asInterface : str6;
        String str14 = (i & 128) != 0 ? scholarDocument.d : str7;
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new ScholarDocument(str8, str9, str10, obj2, str11, str12, str13, str14);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarDocument)) {
            return false;
        }
        ScholarDocument scholarDocument = (ScholarDocument) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, scholarDocument.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, scholarDocument.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.a, scholarDocument.a) && Intrinsics.areEqual(this.asInterface, scholarDocument.asInterface) && Intrinsics.areEqual(this.d, scholarDocument.d);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode3 = this.b.hashCode();
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.a.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.b;
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = this.a;
        String str6 = this.asInterface;
        String str7 = this.d;
        StringBuilder sb = new StringBuilder("ScholarDocument(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(obj);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(", a=");
        sb.append(str5);
        sb.append(", asInterface=");
        sb.append(str6);
        sb.append(", d=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeValue(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.a);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
    }
}
