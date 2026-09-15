package com.bpjstku.data.vocation.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/ExpertiseFieldItem;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/ExpertiseFieldItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "trainingCode", "Ljava/lang/String;", "getTrainingCode", "trainingName", "getTrainingName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExpertiseFieldItem {
    public static final int $stable = 0;

    @SerializedName("kodePelatihan")
    private final String trainingCode;

    @SerializedName("namaPelatihan")
    private final String trainingName;

    public ExpertiseFieldItem(String str, String str2) {
        this.trainingCode = str;
        this.trainingName = str2;
    }

    public final String getTrainingCode() {
        return this.trainingCode;
    }

    public final String getTrainingName() {
        return this.trainingName;
    }

    public static /* synthetic */ ExpertiseFieldItem copy$default(ExpertiseFieldItem expertiseFieldItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expertiseFieldItem.trainingCode;
        }
        if ((i & 2) != 0) {
            str2 = expertiseFieldItem.trainingName;
        }
        return expertiseFieldItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrainingCode() {
        return this.trainingCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrainingName() {
        return this.trainingName;
    }

    public final ExpertiseFieldItem copy(String p0, String p1) {
        return new ExpertiseFieldItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExpertiseFieldItem)) {
            return false;
        }
        ExpertiseFieldItem expertiseFieldItem = (ExpertiseFieldItem) p0;
        return Intrinsics.areEqual(this.trainingCode, expertiseFieldItem.trainingCode) && Intrinsics.areEqual(this.trainingName, expertiseFieldItem.trainingName);
    }

    public final int hashCode() {
        String str = this.trainingCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.trainingName;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.trainingCode;
        String str2 = this.trainingName;
        StringBuilder sb = new StringBuilder("ExpertiseFieldItem(trainingCode=");
        sb.append(str);
        sb.append(", trainingName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
