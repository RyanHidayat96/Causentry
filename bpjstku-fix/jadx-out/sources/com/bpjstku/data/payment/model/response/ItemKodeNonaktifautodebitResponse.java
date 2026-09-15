package com.bpjstku.data.payment.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/bpjstku/data/payment/model/response/ItemKodeNonaktifautodebitResponse;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/ItemKodeNonaktifautodebitResponse;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kode", "Ljava/lang/String;", "getKode", "kodeSegmen", "getKodeSegmen", "deskripsi", "getDeskripsi"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemKodeNonaktifautodebitResponse implements Parcelable {

    @SerializedName("deskripsi")
    private final String deskripsi;

    @SerializedName("kode")
    private final String kode;

    @SerializedName("kode_segmen")
    private final String kodeSegmen;
    public static final Parcelable.Creator<ItemKodeNonaktifautodebitResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemKodeNonaktifautodebitResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemKodeNonaktifautodebitResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemKodeNonaktifautodebitResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemKodeNonaktifautodebitResponse[] newArray(int i) {
            return new ItemKodeNonaktifautodebitResponse[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ItemKodeNonaktifautodebitResponse(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.kode = str;
        this.kodeSegmen = str2;
        this.deskripsi = str3;
    }

    public final String getKode() {
        return this.kode;
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final String getDeskripsi() {
        return this.deskripsi;
    }

    public static /* synthetic */ ItemKodeNonaktifautodebitResponse copy$default(ItemKodeNonaktifautodebitResponse itemKodeNonaktifautodebitResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemKodeNonaktifautodebitResponse.kode;
        }
        if ((i & 2) != 0) {
            str2 = itemKodeNonaktifautodebitResponse.kodeSegmen;
        }
        if ((i & 4) != 0) {
            str3 = itemKodeNonaktifautodebitResponse.deskripsi;
        }
        return itemKodeNonaktifautodebitResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKode() {
        return this.kode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeskripsi() {
        return this.deskripsi;
    }

    public final ItemKodeNonaktifautodebitResponse copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ItemKodeNonaktifautodebitResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ItemKodeNonaktifautodebitResponse)) {
            return false;
        }
        ItemKodeNonaktifautodebitResponse itemKodeNonaktifautodebitResponse = (ItemKodeNonaktifautodebitResponse) p0;
        return Intrinsics.areEqual(this.kode, itemKodeNonaktifautodebitResponse.kode) && Intrinsics.areEqual(this.kodeSegmen, itemKodeNonaktifautodebitResponse.kodeSegmen) && Intrinsics.areEqual(this.deskripsi, itemKodeNonaktifautodebitResponse.deskripsi);
    }

    public final int hashCode() {
        return (((this.kode.hashCode() * 31) + this.kodeSegmen.hashCode()) * 31) + this.deskripsi.hashCode();
    }

    public final String toString() {
        String str = this.kode;
        String str2 = this.kodeSegmen;
        String str3 = this.deskripsi;
        StringBuilder sb = new StringBuilder("ItemKodeNonaktifautodebitResponse(kode=");
        sb.append(str);
        sb.append(", kodeSegmen=");
        sb.append(str2);
        sb.append(", deskripsi=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kode);
        p0.writeString(this.kodeSegmen);
        p0.writeString(this.deskripsi);
    }
}
