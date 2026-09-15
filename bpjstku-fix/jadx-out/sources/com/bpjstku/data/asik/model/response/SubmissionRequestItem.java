package com.bpjstku.data.asik.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJX\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001d\u0010\u000fJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010%\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u000fR\u001c\u0010*\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/asik/model/response/SubmissionRequestItem;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/SubmissionRequestItem;", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", NotificationCompat.CATEGORY_STATUS, "Ljava/lang/Boolean;", "getStatus", "message", "Ljava/lang/String;", "getMessage", "transactionId", "getTransactionId", "statusCode", "getStatusCode", "branchOfficeChannelName", "getBranchOfficeChannelName", "signature", "getSignature"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubmissionRequestItem implements Parcelable {

    @SerializedName("branchOfficeChannelName")
    private final String branchOfficeChannelName;

    @SerializedName("message")
    private final String message;

    @SerializedName("signature")
    private final String signature;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final Boolean status;

    @SerializedName("statusCode")
    private final String statusCode;

    @SerializedName("transactionId")
    private final String transactionId;
    public static final Parcelable.Creator<SubmissionRequestItem> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubmissionRequestItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmissionRequestItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SubmissionRequestItem(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmissionRequestItem[] newArray(int i) {
            return new SubmissionRequestItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SubmissionRequestItem(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.status = bool;
        this.message = str;
        this.transactionId = str2;
        this.statusCode = str3;
        this.branchOfficeChannelName = str4;
        this.signature = str5;
    }

    public final Boolean getStatus() {
        return this.status;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getBranchOfficeChannelName() {
        return this.branchOfficeChannelName;
    }

    public final String getSignature() {
        return this.signature;
    }

    public static /* synthetic */ SubmissionRequestItem copy$default(SubmissionRequestItem submissionRequestItem, Boolean bool, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = submissionRequestItem.status;
        }
        if ((i & 2) != 0) {
            str = submissionRequestItem.message;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = submissionRequestItem.transactionId;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = submissionRequestItem.statusCode;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = submissionRequestItem.branchOfficeChannelName;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = submissionRequestItem.signature;
        }
        return submissionRequestItem.copy(bool, str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBranchOfficeChannelName() {
        return this.branchOfficeChannelName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final SubmissionRequestItem copy(Boolean p0, String p1, String p2, String p3, String p4, String p5) {
        return new SubmissionRequestItem(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubmissionRequestItem)) {
            return false;
        }
        SubmissionRequestItem submissionRequestItem = (SubmissionRequestItem) p0;
        return Intrinsics.areEqual(this.status, submissionRequestItem.status) && Intrinsics.areEqual(this.message, submissionRequestItem.message) && Intrinsics.areEqual(this.transactionId, submissionRequestItem.transactionId) && Intrinsics.areEqual(this.statusCode, submissionRequestItem.statusCode) && Intrinsics.areEqual(this.branchOfficeChannelName, submissionRequestItem.branchOfficeChannelName) && Intrinsics.areEqual(this.signature, submissionRequestItem.signature);
    }

    public final int hashCode() {
        Boolean bool = this.status;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.transactionId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.statusCode;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.branchOfficeChannelName;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.signature;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.status;
        String str = this.message;
        String str2 = this.transactionId;
        String str3 = this.statusCode;
        String str4 = this.branchOfficeChannelName;
        String str5 = this.signature;
        StringBuilder sb = new StringBuilder("SubmissionRequestItem(status=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(", transactionId=");
        sb.append(str2);
        sb.append(", statusCode=");
        sb.append(str3);
        sb.append(", branchOfficeChannelName=");
        sb.append(str4);
        sb.append(", signature=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(p0, "");
        Boolean bool = this.status;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            p0.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        p0.writeInt(BooleanValue);
        p0.writeString(this.message);
        p0.writeString(this.transactionId);
        p0.writeString(this.statusCode);
        p0.writeString(this.branchOfficeChannelName);
        p0.writeString(this.signature);
    }
}
