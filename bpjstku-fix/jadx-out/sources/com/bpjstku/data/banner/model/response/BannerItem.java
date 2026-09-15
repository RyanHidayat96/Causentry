package com.bpjstku.data.banner.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/bpjstku/data/banner/model/response/BannerItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/banner/model/response/BannerItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "imageLink", "Ljava/lang/String;", "getImageLink", "imageName", "getImageName", "imagePath", "getImagePath"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BannerItem implements Parcelable {

    @SerializedName("imageLink")
    private final String imageLink;

    @SerializedName("imageName")
    private final String imageName;

    @SerializedName("imagePath")
    private final String imagePath;
    public static final Parcelable.Creator<BannerItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BannerItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerItem[] newArray(int i) {
            return new BannerItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BannerItem(String str, String str2, String str3) {
        this.imageLink = str;
        this.imageName = str2;
        this.imagePath = str3;
    }

    public final String getImageLink() {
        return this.imageLink;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public static /* synthetic */ BannerItem copy$default(BannerItem bannerItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerItem.imageLink;
        }
        if ((i & 2) != 0) {
            str2 = bannerItem.imageName;
        }
        if ((i & 4) != 0) {
            str3 = bannerItem.imagePath;
        }
        return bannerItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageLink() {
        return this.imageLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    public final BannerItem copy(String p0, String p1, String p2) {
        return new BannerItem(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) p0;
        return Intrinsics.areEqual(this.imageLink, bannerItem.imageLink) && Intrinsics.areEqual(this.imageName, bannerItem.imageName) && Intrinsics.areEqual(this.imagePath, bannerItem.imagePath);
    }

    public final int hashCode() {
        String str = this.imageLink;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.imageName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imagePath;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.imageLink;
        String str2 = this.imageName;
        String str3 = this.imagePath;
        StringBuilder sb = new StringBuilder("BannerItem(imageLink=");
        sb.append(str);
        sb.append(", imageName=");
        sb.append(str2);
        sb.append(", imagePath=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.imageLink);
        p0.writeString(this.imageName);
        p0.writeString(this.imagePath);
    }
}
