package com.bpjstku.presentation.program.jpn.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010#"}, d2 = {"Lcom/bpjstku/presentation/program/jpn/model/IndividualDataJp;", "Landroid/os/Parcelable;", "Ljava/io/File;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "<init>", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "b", "d", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "g", "INotificationSideChannel", "notify"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IndividualDataJp implements Parcelable {
    public static final Parcelable.Creator<IndividualDataJp> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final String d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String asBinder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IndividualDataJp(File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.asInterface = str5;
        this.a = str6;
        this.g = str7;
        this.asBinder = str8;
        this.d = str9;
        this.notify = str10;
    }

    public /* synthetic */ IndividualDataJp(File file, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<IndividualDataJp> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndividualDataJp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IndividualDataJp((File) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndividualDataJp[] newArray(int i) {
            return new IndividualDataJp[i];
        }
    }

    public IndividualDataJp() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IndividualDataJp)) {
            return false;
        }
        IndividualDataJp individualDataJp = (IndividualDataJp) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, individualDataJp.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.b, individualDataJp.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, individualDataJp.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, individualDataJp.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, individualDataJp.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.asInterface, individualDataJp.asInterface) && Intrinsics.areEqual(this.a, individualDataJp.a) && Intrinsics.areEqual(this.g, individualDataJp.g) && Intrinsics.areEqual(this.asBinder, individualDataJp.asBinder) && Intrinsics.areEqual(this.d, individualDataJp.d) && Intrinsics.areEqual(this.notify, individualDataJp.notify);
    }

    public final int hashCode() {
        File file = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return ((((((((((((((((((((file == null ? 0 : file.hashCode()) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.a.hashCode()) * 31) + this.g.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.d.hashCode()) * 31) + this.notify.hashCode();
    }

    public final String toString() {
        File file = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.asInterface;
        String str6 = this.a;
        String str7 = this.g;
        String str8 = this.asBinder;
        String str9 = this.d;
        String str10 = this.notify;
        StringBuilder sb = new StringBuilder("IndividualDataJp(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(file);
        sb.append(", b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str4);
        sb.append(", asInterface=");
        sb.append(str5);
        sb.append(", a=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", asBinder=");
        sb.append(str8);
        sb.append(", d=");
        sb.append(str9);
        sb.append(", notify=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeSerializable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.asInterface);
        p0.writeString(this.a);
        p0.writeString(this.g);
        p0.writeString(this.asBinder);
        p0.writeString(this.d);
        p0.writeString(this.notify);
    }
}
