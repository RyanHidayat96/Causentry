package com.bpjstku.data.asik.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000bR\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/asik/model/response/AsikListKpjMobileItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bpjstku/data/asik/model/response/AsikListKpjMobileItem;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kpj", "Ljava/lang/String;", "getKpj", "kodeTk", "getKodeTk", "kodeSegmen", "getKodeSegmen", "flagShow", "Ljava/lang/Boolean;", "getFlagShow"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikListKpjMobileItem implements Parcelable {

    @SerializedName("flagShow")
    private final Boolean flagShow;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kodeTk")
    private final String kodeTk;

    @SerializedName("kpj")
    private final String kpj;
    public static final Parcelable.Creator<AsikListKpjMobileItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AsikListKpjMobileItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsikListKpjMobileItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AsikListKpjMobileItem(string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsikListKpjMobileItem[] newArray(int i) {
            return new AsikListKpjMobileItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AsikListKpjMobileItem(String str, String str2, String str3, Boolean bool) {
        this.kpj = str;
        this.kodeTk = str2;
        this.kodeSegmen = str3;
        this.flagShow = bool;
    }

    public /* synthetic */ AsikListKpjMobileItem(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getKodeTk() {
        return this.kodeTk;
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final Boolean getFlagShow() {
        return this.flagShow;
    }

    public AsikListKpjMobileItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AsikListKpjMobileItem copy$default(AsikListKpjMobileItem asikListKpjMobileItem, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asikListKpjMobileItem.kpj;
        }
        if ((i & 2) != 0) {
            str2 = asikListKpjMobileItem.kodeTk;
        }
        if ((i & 4) != 0) {
            str3 = asikListKpjMobileItem.kodeSegmen;
        }
        if ((i & 8) != 0) {
            bool = asikListKpjMobileItem.flagShow;
        }
        return asikListKpjMobileItem.copy(str, str2, str3, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeTk() {
        return this.kodeTk;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getFlagShow() {
        return this.flagShow;
    }

    public final AsikListKpjMobileItem copy(String p0, String p1, String p2, Boolean p3) {
        return new AsikListKpjMobileItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikListKpjMobileItem)) {
            return false;
        }
        AsikListKpjMobileItem asikListKpjMobileItem = (AsikListKpjMobileItem) p0;
        return Intrinsics.areEqual(this.kpj, asikListKpjMobileItem.kpj) && Intrinsics.areEqual(this.kodeTk, asikListKpjMobileItem.kodeTk) && Intrinsics.areEqual(this.kodeSegmen, asikListKpjMobileItem.kodeSegmen) && Intrinsics.areEqual(this.flagShow, asikListKpjMobileItem.flagShow);
    }

    public final int hashCode() {
        String str = this.kpj;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.kodeTk;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kodeSegmen;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.flagShow;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kpj;
        String str2 = this.kodeTk;
        String str3 = this.kodeSegmen;
        Boolean bool = this.flagShow;
        StringBuilder sb = new StringBuilder("AsikListKpjMobileItem(kpj=");
        sb.append(str);
        sb.append(", kodeTk=");
        sb.append(str2);
        sb.append(", kodeSegmen=");
        sb.append(str3);
        sb.append(", flagShow=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kpj);
        p0.writeString(this.kodeTk);
        p0.writeString(this.kodeSegmen);
        Boolean bool = this.flagShow;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            p0.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        p0.writeInt(BooleanValue);
    }
}
