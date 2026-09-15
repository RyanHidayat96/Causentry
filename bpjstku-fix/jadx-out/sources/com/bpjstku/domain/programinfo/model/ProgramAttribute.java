package com.bpjstku.domain.programinfo.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "", "Lcom/bpjstku/domain/programinfo/model/BenefitProgram;", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "bpuTuitionAmount", "Ljava/lang/String;", "JakonTuitionAmount", "pmiTuitionAmount", "puTuitionAmount", "description", "title", "benefits", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProgramAttribute implements Parcelable {
    public final String JakonTuitionAmount;
    public final List<BenefitProgram> benefits;
    public final String bpuTuitionAmount;
    public final String description;
    public final String pmiTuitionAmount;
    public final String puTuitionAmount;
    private final String title;
    public static final Parcelable.Creator<ProgramAttribute> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ProgramAttribute(String str, String str2, String str3, String str4, String str5, String str6, List<BenefitProgram> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.bpuTuitionAmount = str;
        this.JakonTuitionAmount = str2;
        this.pmiTuitionAmount = str3;
        this.puTuitionAmount = str4;
        this.description = str5;
        this.title = str6;
        this.benefits = list;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProgramAttribute)) {
            return false;
        }
        ProgramAttribute programAttribute = (ProgramAttribute) p0;
        return Intrinsics.areEqual(this.bpuTuitionAmount, programAttribute.bpuTuitionAmount) && Intrinsics.areEqual(this.JakonTuitionAmount, programAttribute.JakonTuitionAmount) && Intrinsics.areEqual(this.pmiTuitionAmount, programAttribute.pmiTuitionAmount) && Intrinsics.areEqual(this.puTuitionAmount, programAttribute.puTuitionAmount) && Intrinsics.areEqual(this.description, programAttribute.description) && Intrinsics.areEqual(this.title, programAttribute.title) && Intrinsics.areEqual(this.benefits, programAttribute.benefits);
    }

    public final int hashCode() {
        return (((((((((((this.bpuTuitionAmount.hashCode() * 31) + this.JakonTuitionAmount.hashCode()) * 31) + this.pmiTuitionAmount.hashCode()) * 31) + this.puTuitionAmount.hashCode()) * 31) + this.description.hashCode()) * 31) + this.title.hashCode()) * 31) + this.benefits.hashCode();
    }

    public final String toString() {
        String str = this.bpuTuitionAmount;
        String str2 = this.JakonTuitionAmount;
        String str3 = this.pmiTuitionAmount;
        String str4 = this.puTuitionAmount;
        String str5 = this.description;
        String str6 = this.title;
        List<BenefitProgram> list = this.benefits;
        StringBuilder sb = new StringBuilder("ProgramAttribute(bpuTuitionAmount=");
        sb.append(str);
        sb.append(", JakonTuitionAmount=");
        sb.append(str2);
        sb.append(", pmiTuitionAmount=");
        sb.append(str3);
        sb.append(", puTuitionAmount=");
        sb.append(str4);
        sb.append(", description=");
        sb.append(str5);
        sb.append(", title=");
        sb.append(str6);
        sb.append(", benefits=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.bpuTuitionAmount);
        p0.writeString(this.JakonTuitionAmount);
        p0.writeString(this.pmiTuitionAmount);
        p0.writeString(this.puTuitionAmount);
        p0.writeString(this.description);
        p0.writeString(this.title);
        List<BenefitProgram> list = this.benefits;
        p0.writeInt(list.size());
        Iterator<BenefitProgram> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<ProgramAttribute> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProgramAttribute createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BenefitProgram.CREATOR.createFromParcel(parcel));
            }
            return new ProgramAttribute(string, string2, string3, string4, string5, string6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProgramAttribute[] newArray(int i) {
            return new ProgramAttribute[i];
        }
    }
}
