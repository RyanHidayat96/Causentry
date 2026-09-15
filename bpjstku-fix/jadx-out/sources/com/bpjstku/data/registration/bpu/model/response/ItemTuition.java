package com.bpjstku.data.registration.bpu.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\b"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/response/ItemTuition;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/response/ItemTuition;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "totalIuran", "Ljava/lang/String;", "getTotalIuran", "nominalDasarUpah", "getNominalDasarUpah"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemTuition implements Parcelable {

    @SerializedName("nomDasarUpah")
    private final String nominalDasarUpah;

    @SerializedName("totIuran")
    private final String totalIuran;
    public static final Parcelable.Creator<ItemTuition> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemTuition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemTuition createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemTuition(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemTuition[] newArray(int i) {
            return new ItemTuition[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ItemTuition(String str, String str2) {
        this.totalIuran = str;
        this.nominalDasarUpah = str2;
    }

    public /* synthetic */ ItemTuition(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getTotalIuran() {
        return this.totalIuran;
    }

    public final String getNominalDasarUpah() {
        return this.nominalDasarUpah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemTuition() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ItemTuition copy$default(ItemTuition itemTuition, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemTuition.totalIuran;
        }
        if ((i & 2) != 0) {
            str2 = itemTuition.nominalDasarUpah;
        }
        return itemTuition.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalIuran() {
        return this.totalIuran;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNominalDasarUpah() {
        return this.nominalDasarUpah;
    }

    public final ItemTuition copy(String p0, String p1) {
        return new ItemTuition(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ItemTuition)) {
            return false;
        }
        ItemTuition itemTuition = (ItemTuition) p0;
        return Intrinsics.areEqual(this.totalIuran, itemTuition.totalIuran) && Intrinsics.areEqual(this.nominalDasarUpah, itemTuition.nominalDasarUpah);
    }

    public final int hashCode() {
        String str = this.totalIuran;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nominalDasarUpah;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.totalIuran;
        String str2 = this.nominalDasarUpah;
        StringBuilder sb = new StringBuilder("ItemTuition(totalIuran=");
        sb.append(str);
        sb.append(", nominalDasarUpah=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.totalIuran);
        p0.writeString(this.nominalDasarUpah);
    }
}
