package com.bpjstku.domain.programinfo.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/bpjstku/domain/programinfo/model/BenefitProgram;", "Landroid/os/Parcelable;", "", "p0", "", "Lcom/bpjstku/domain/programinfo/model/BenefitItem;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "title", "Ljava/lang/String;", "benefitItems", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BenefitProgram implements Parcelable {
    public final List<BenefitItem> benefitItems;
    private final String title;
    public static final Parcelable.Creator<BenefitProgram> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BenefitProgram(String str, List<BenefitItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.benefitItems = list;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BenefitProgram)) {
            return false;
        }
        BenefitProgram benefitProgram = (BenefitProgram) p0;
        return Intrinsics.areEqual(this.title, benefitProgram.title) && Intrinsics.areEqual(this.benefitItems, benefitProgram.benefitItems);
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.benefitItems.hashCode();
    }

    public final String toString() {
        String str = this.title;
        List<BenefitItem> list = this.benefitItems;
        StringBuilder sb = new StringBuilder("BenefitProgram(title=");
        sb.append(str);
        sb.append(", benefitItems=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.title);
        List<BenefitItem> list = this.benefitItems;
        p0.writeInt(list.size());
        Iterator<BenefitItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<BenefitProgram> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BenefitProgram createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BenefitItem.CREATOR.createFromParcel(parcel));
            }
            return new BenefitProgram(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BenefitProgram[] newArray(int i) {
            return new BenefitProgram[i];
        }
    }
}
