package com.bpjstku.data.jkp.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/jkp/model/response/JkpClaimTrackItem;", "", "", "p0", "", "p1", "", "Lcom/bpjstku/data/jkp/model/response/TahapKlaim;", "p2", "Lcom/bpjstku/data/jkp/model/response/TitleKlaim;", "p3", "<init>", "(ZLjava/lang/String;Ljava/util/List;Lcom/bpjstku/data/jkp/model/response/TitleKlaim;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/bpjstku/data/jkp/model/response/TitleKlaim;", "copy", "(ZLjava/lang/String;Ljava/util/List;Lcom/bpjstku/data/jkp/model/response/TitleKlaim;)Lcom/bpjstku/data/jkp/model/response/JkpClaimTrackItem;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isSuccessful", "Z", "message", "Ljava/lang/String;", "getMessage", "tahapKlaim", "Ljava/util/List;", "getTahapKlaim", "titleKlaim", "Lcom/bpjstku/data/jkp/model/response/TitleKlaim;", "getTitleKlaim"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JkpClaimTrackItem {
    public static final int $stable = 8;

    @SerializedName("isSuccessful")
    private final boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName("tahapKlaim")
    private final List<TahapKlaim> tahapKlaim;

    @SerializedName("titleKlaim")
    private final TitleKlaim titleKlaim;

    public JkpClaimTrackItem(boolean z, String str, List<TahapKlaim> list, TitleKlaim titleKlaim) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(titleKlaim, "");
        this.isSuccessful = z;
        this.message = str;
        this.tahapKlaim = list;
        this.titleKlaim = titleKlaim;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<TahapKlaim> getTahapKlaim() {
        return this.tahapKlaim;
    }

    public final TitleKlaim getTitleKlaim() {
        return this.titleKlaim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JkpClaimTrackItem copy$default(JkpClaimTrackItem jkpClaimTrackItem, boolean z, String str, List list, TitleKlaim titleKlaim, int i, Object obj) {
        if ((i & 1) != 0) {
            z = jkpClaimTrackItem.isSuccessful;
        }
        if ((i & 2) != 0) {
            str = jkpClaimTrackItem.message;
        }
        if ((i & 4) != 0) {
            list = jkpClaimTrackItem.tahapKlaim;
        }
        if ((i & 8) != 0) {
            titleKlaim = jkpClaimTrackItem.titleKlaim;
        }
        return jkpClaimTrackItem.copy(z, str, list, titleKlaim);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<TahapKlaim> component3() {
        return this.tahapKlaim;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TitleKlaim getTitleKlaim() {
        return this.titleKlaim;
    }

    public final JkpClaimTrackItem copy(boolean p0, String p1, List<TahapKlaim> p2, TitleKlaim p3) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new JkpClaimTrackItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JkpClaimTrackItem)) {
            return false;
        }
        JkpClaimTrackItem jkpClaimTrackItem = (JkpClaimTrackItem) p0;
        return this.isSuccessful == jkpClaimTrackItem.isSuccessful && Intrinsics.areEqual(this.message, jkpClaimTrackItem.message) && Intrinsics.areEqual(this.tahapKlaim, jkpClaimTrackItem.tahapKlaim) && Intrinsics.areEqual(this.titleKlaim, jkpClaimTrackItem.titleKlaim);
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.isSuccessful) * 31) + this.message.hashCode()) * 31) + this.tahapKlaim.hashCode()) * 31) + this.titleKlaim.hashCode();
    }

    public final String toString() {
        boolean z = this.isSuccessful;
        String str = this.message;
        List<TahapKlaim> list = this.tahapKlaim;
        TitleKlaim titleKlaim = this.titleKlaim;
        StringBuilder sb = new StringBuilder("JkpClaimTrackItem(isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", tahapKlaim=");
        sb.append(list);
        sb.append(", titleKlaim=");
        sb.append(titleKlaim);
        sb.append(")");
        return sb.toString();
    }
}
