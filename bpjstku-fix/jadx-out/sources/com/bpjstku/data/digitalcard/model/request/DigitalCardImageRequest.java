package com.bpjstku.data.digitalcard.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.getMinimumLoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "LgetMinimumLoggingLevel;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "isEquivalentTo", "(Ljava/lang/Object;)Z", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/digitalcard/model/request/DigitalCardImageRequest;", "equals", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "hash", "getHash"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DigitalCardImageRequest extends BaseRequest implements getMinimumLoggingLevel {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("hash")
    private final String hash;

    @Override // defpackage.getMinimumLoggingLevel
    public final boolean isEquivalentTo(Object p0) {
        return true;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getHash() {
        return this.hash;
    }

    public DigitalCardImageRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.hash = str2;
    }

    public static /* synthetic */ DigitalCardImageRequest copy$default(DigitalCardImageRequest digitalCardImageRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digitalCardImageRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = digitalCardImageRequest.hash;
        }
        return digitalCardImageRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final DigitalCardImageRequest copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new DigitalCardImageRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DigitalCardImageRequest)) {
            return false;
        }
        DigitalCardImageRequest digitalCardImageRequest = (DigitalCardImageRequest) p0;
        return Intrinsics.areEqual(this.email, digitalCardImageRequest.email) && Intrinsics.areEqual(this.hash, digitalCardImageRequest.hash);
    }

    public final int hashCode() {
        return (this.email.hashCode() * 31) + this.hash.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.hash;
        StringBuilder sb = new StringBuilder("DigitalCardImageRequest(email=");
        sb.append(str);
        sb.append(", hash=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
