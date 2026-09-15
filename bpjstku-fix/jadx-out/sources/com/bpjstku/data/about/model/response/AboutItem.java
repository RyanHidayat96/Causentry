package com.bpjstku.data.about.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.unsuspend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ>\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/about/model/response/AboutItem;", "Landroid/os/Parcelable;", "Lunsuspend;", "", "p0", "", "p1", "p2", "p3", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/about/model/response/AboutItem;", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "id", "I", "getId", "about", "Ljava/lang/String;", "getAbout", "email", "getEmail", HintConstants.AUTOFILL_HINT_PHONE, "getPhone"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AboutItem extends unsuspend implements Parcelable {

    @SerializedName("about")
    private final String about;

    @SerializedName("email")
    private final String email;
    private final int id;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    private final String phone;
    public static final Parcelable.Creator<AboutItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AboutItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AboutItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AboutItem(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AboutItem[] newArray(int i) {
            return new AboutItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getId() {
        return this.id;
    }

    public final String getAbout() {
        return this.about;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public AboutItem(int i, String str, String str2, String str3) {
        this.id = i;
        this.about = str;
        this.email = str2;
        this.phone = str3;
    }

    public static /* synthetic */ AboutItem copy$default(AboutItem aboutItem, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aboutItem.id;
        }
        if ((i2 & 2) != 0) {
            str = aboutItem.about;
        }
        if ((i2 & 4) != 0) {
            str2 = aboutItem.email;
        }
        if ((i2 & 8) != 0) {
            str3 = aboutItem.phone;
        }
        return aboutItem.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAbout() {
        return this.about;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final AboutItem copy(int p0, String p1, String p2, String p3) {
        return new AboutItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AboutItem)) {
            return false;
        }
        AboutItem aboutItem = (AboutItem) p0;
        return this.id == aboutItem.id && Intrinsics.areEqual(this.about, aboutItem.about) && Intrinsics.areEqual(this.email, aboutItem.email) && Intrinsics.areEqual(this.phone, aboutItem.phone);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        String str = this.about;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.phone;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.about;
        String str2 = this.email;
        String str3 = this.phone;
        StringBuilder sb = new StringBuilder("AboutItem(id=");
        sb.append(i);
        sb.append(", about=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", phone=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.id);
        p0.writeString(this.about);
        p0.writeString(this.email);
        p0.writeString(this.phone);
    }
}
