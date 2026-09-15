package com.bpjstku.domain.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00078\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a"}, d2 = {"Lcom/bpjstku/domain/notification/model/Notification;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "title", "Ljava/lang/String;", "notificationCode", "message", "date", "isRead", "Z", "type"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Notification implements Parcelable {
    public final String date;
    public boolean isRead;
    public final String message;
    public final String notificationCode;
    public final String title;
    public final String type;
    public static final Parcelable.Creator<Notification> CREATOR = new b();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Notification(String str, String str2, String str3, String str4, boolean z, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.notificationCode = str2;
        this.message = str3;
        this.date = str4;
        this.isRead = z;
        this.type = str5;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) p0;
        return Intrinsics.areEqual(this.title, notification.title) && Intrinsics.areEqual(this.notificationCode, notification.notificationCode) && Intrinsics.areEqual(this.message, notification.message) && Intrinsics.areEqual(this.date, notification.date) && this.isRead == notification.isRead && Intrinsics.areEqual(this.type, notification.type);
    }

    public final int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.notificationCode.hashCode()) * 31) + this.message.hashCode()) * 31) + this.date.hashCode()) * 31) + Boolean.hashCode(this.isRead)) * 31) + this.type.hashCode();
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.notificationCode;
        String str3 = this.message;
        String str4 = this.date;
        boolean z = this.isRead;
        String str5 = this.type;
        StringBuilder sb = new StringBuilder("Notification(title=");
        sb.append(str);
        sb.append(", notificationCode=");
        sb.append(str2);
        sb.append(", message=");
        sb.append(str3);
        sb.append(", date=");
        sb.append(str4);
        sb.append(", isRead=");
        sb.append(z);
        sb.append(", type=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.title);
        p0.writeString(this.notificationCode);
        p0.writeString(this.message);
        p0.writeString(this.date);
        p0.writeInt(this.isRead ? 1 : 0);
        p0.writeString(this.type);
    }

    public static final class b implements Parcelable.Creator<Notification> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Notification createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Notification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Notification[] newArray(int i) {
            return new Notification[i];
        }
    }
}
