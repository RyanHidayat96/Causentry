package com.bpjstku.data.user.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/bpjstku/data/user/model/response/FiturList;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/response/FiturList;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kodeFitur", "Ljava/lang/String;", "getKodeFitur", "namaFitur", "getNamaFitur", "iconPath", "getIconPath"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FiturList implements Parcelable {

    @SerializedName("iconPath")
    private final String iconPath;

    @SerializedName("kodeFitur")
    private final String kodeFitur;

    @SerializedName("namaFitur")
    private final String namaFitur;
    public static final Parcelable.Creator<FiturList> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FiturList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiturList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FiturList(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiturList[] newArray(int i) {
            return new FiturList[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FiturList(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.kodeFitur = str;
        this.namaFitur = str2;
        this.iconPath = str3;
    }

    public final String getKodeFitur() {
        return this.kodeFitur;
    }

    public final String getNamaFitur() {
        return this.namaFitur;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public static /* synthetic */ FiturList copy$default(FiturList fiturList, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fiturList.kodeFitur;
        }
        if ((i & 2) != 0) {
            str2 = fiturList.namaFitur;
        }
        if ((i & 4) != 0) {
            str3 = fiturList.iconPath;
        }
        return fiturList.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeFitur() {
        return this.kodeFitur;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaFitur() {
        return this.namaFitur;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconPath() {
        return this.iconPath;
    }

    public final FiturList copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new FiturList(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FiturList)) {
            return false;
        }
        FiturList fiturList = (FiturList) p0;
        return Intrinsics.areEqual(this.kodeFitur, fiturList.kodeFitur) && Intrinsics.areEqual(this.namaFitur, fiturList.namaFitur) && Intrinsics.areEqual(this.iconPath, fiturList.iconPath);
    }

    public final int hashCode() {
        int iHashCode = this.kodeFitur.hashCode();
        int iHashCode2 = this.namaFitur.hashCode();
        String str = this.iconPath;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.kodeFitur;
        String str2 = this.namaFitur;
        String str3 = this.iconPath;
        StringBuilder sb = new StringBuilder("FiturList(kodeFitur=");
        sb.append(str);
        sb.append(", namaFitur=");
        sb.append(str2);
        sb.append(", iconPath=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kodeFitur);
        p0.writeString(this.namaFitur);
        p0.writeString(this.iconPath);
    }
}
