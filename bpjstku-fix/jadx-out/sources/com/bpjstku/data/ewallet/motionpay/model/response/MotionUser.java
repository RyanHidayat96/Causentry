package com.bpjstku.data.ewallet.motionpay.model.response;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\tR\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionUser;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "fullname", "Ljava/lang/String;", "getFullname", "setFullname", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_PHONE, "getPhone", "setPhone", "type", "getType", "setType"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MotionUser {
    public static final int $stable = 8;

    @SerializedName("fullname")
    private String fullname;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    private String phone;

    @SerializedName("type")
    private String type;

    public MotionUser(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fullname = str;
        this.phone = str2;
        this.type = str3;
    }

    public /* synthetic */ MotionUser(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final void setFullname(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullname = str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.phone = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    public MotionUser() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MotionUser copy$default(MotionUser motionUser, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = motionUser.fullname;
        }
        if ((i & 2) != 0) {
            str2 = motionUser.phone;
        }
        if ((i & 4) != 0) {
            str3 = motionUser.type;
        }
        return motionUser.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFullname() {
        return this.fullname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final MotionUser copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new MotionUser(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MotionUser)) {
            return false;
        }
        MotionUser motionUser = (MotionUser) p0;
        return Intrinsics.areEqual(this.fullname, motionUser.fullname) && Intrinsics.areEqual(this.phone, motionUser.phone) && Intrinsics.areEqual(this.type, motionUser.type);
    }

    public final int hashCode() {
        return (((this.fullname.hashCode() * 31) + this.phone.hashCode()) * 31) + this.type.hashCode();
    }

    public final String toString() {
        String str = this.fullname;
        String str2 = this.phone;
        String str3 = this.type;
        StringBuilder sb = new StringBuilder("MotionUser(fullname=");
        sb.append(str);
        sb.append(", phone=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
