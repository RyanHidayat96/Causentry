package com.bpjstku.data.user.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/request/ProfilePictureRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "path", "Ljava/lang/String;", "email"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProfilePictureRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("path")
    private final String path;

    public ProfilePictureRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.path = str;
        this.email = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getEmail() {
        return this.email;
    }

    public static /* synthetic */ ProfilePictureRequest copy$default(ProfilePictureRequest profilePictureRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profilePictureRequest.path;
        }
        if ((i & 2) != 0) {
            str2 = profilePictureRequest.email;
        }
        return profilePictureRequest.copy(str, str2);
    }

    public final ProfilePictureRequest copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ProfilePictureRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProfilePictureRequest)) {
            return false;
        }
        ProfilePictureRequest profilePictureRequest = (ProfilePictureRequest) p0;
        return Intrinsics.areEqual(this.path, profilePictureRequest.path) && Intrinsics.areEqual(this.email, profilePictureRequest.email);
    }

    public final int hashCode() {
        return (this.path.hashCode() * 31) + this.email.hashCode();
    }

    public final String toString() {
        String str = this.path;
        String str2 = this.email;
        StringBuilder sb = new StringBuilder("ProfilePictureRequest(path=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
