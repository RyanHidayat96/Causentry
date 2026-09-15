package com.bpjstku.domain.programinfo.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lcom/bpjstku/domain/programinfo/model/BenefitItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "description", "Ljava/lang/String;", "title"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BenefitItem implements Parcelable {
    public final String description;
    public final String title;
    public static final Parcelable.Creator<BenefitItem> CREATOR = new b();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BenefitItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.description = str;
        this.title = str2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BenefitItem)) {
            return false;
        }
        BenefitItem benefitItem = (BenefitItem) p0;
        return Intrinsics.areEqual(this.description, benefitItem.description) && Intrinsics.areEqual(this.title, benefitItem.title);
    }

    public final int hashCode() {
        return (this.description.hashCode() * 31) + this.title.hashCode();
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("BenefitItem(description=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.description);
        p0.writeString(this.title);
    }

    public static final class b implements Parcelable.Creator<BenefitItem> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public static int b;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BenefitItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BenefitItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BenefitItem[] newArray(int i) {
            return new BenefitItem[i];
        }

        public static int b() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = i % 7952677;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            if (i2 != 0) {
                return b;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            b = i3;
            return i3;
        }
    }
}
