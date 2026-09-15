package com.bpjstku.data.setting.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/setting/model/response/ExpResponse;", "", "", "p0", "p1", "p2", "Lcom/bpjstku/data/setting/model/response/Specs;", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/setting/model/response/Specs;Lcom/bpjstku/data/setting/model/response/Specs;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/bpjstku/data/setting/model/response/Specs;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/setting/model/response/Specs;Lcom/bpjstku/data/setting/model/response/Specs;)Lcom/bpjstku/data/setting/model/response/ExpResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "type", "getType", "name", "getName", "image", "Lcom/bpjstku/data/setting/model/response/Specs;", "getImage", "thumbnail", "getThumbnail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExpResponse {
    public static final int $stable = 0;

    @SerializedName("id")
    private final String id;

    @SerializedName("image")
    private final Specs image;

    @SerializedName("name")
    private final String name;

    @SerializedName("thumbnail")
    private final Specs thumbnail;

    @SerializedName("type")
    private final String type;

    public ExpResponse(String str, String str2, String str3, Specs specs, Specs specs2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(specs, "");
        Intrinsics.checkNotNullParameter(specs2, "");
        this.id = str;
        this.type = str2;
        this.name = str3;
        this.image = specs;
        this.thumbnail = specs2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getName() {
        return this.name;
    }

    public final Specs getImage() {
        return this.image;
    }

    public final Specs getThumbnail() {
        return this.thumbnail;
    }

    public static /* synthetic */ ExpResponse copy$default(ExpResponse expResponse, String str, String str2, String str3, Specs specs, Specs specs2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = expResponse.type;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = expResponse.name;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            specs = expResponse.image;
        }
        Specs specs3 = specs;
        if ((i & 16) != 0) {
            specs2 = expResponse.thumbnail;
        }
        return expResponse.copy(str, str4, str5, specs3, specs2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Specs getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Specs getThumbnail() {
        return this.thumbnail;
    }

    public final ExpResponse copy(String p0, String p1, String p2, Specs p3, Specs p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new ExpResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExpResponse)) {
            return false;
        }
        ExpResponse expResponse = (ExpResponse) p0;
        return Intrinsics.areEqual(this.id, expResponse.id) && Intrinsics.areEqual(this.type, expResponse.type) && Intrinsics.areEqual(this.name, expResponse.name) && Intrinsics.areEqual(this.image, expResponse.image) && Intrinsics.areEqual(this.thumbnail, expResponse.thumbnail);
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.name.hashCode()) * 31) + this.image.hashCode()) * 31) + this.thumbnail.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.name;
        Specs specs = this.image;
        Specs specs2 = this.thumbnail;
        StringBuilder sb = new StringBuilder("ExpResponse(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", image=");
        sb.append(specs);
        sb.append(", thumbnail=");
        sb.append(specs2);
        sb.append(")");
        return sb.toString();
    }
}
