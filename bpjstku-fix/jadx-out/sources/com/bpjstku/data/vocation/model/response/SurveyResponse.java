package com.bpjstku.data.vocation.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/SurveyResponse;", "", "", "Lcom/bpjstku/data/vocation/model/response/SurveyItem;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/vocation/model/response/SurveyResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SurveyResponse {
    public static final int $stable = 8;

    @SerializedName("listSurvey")
    private final List<SurveyItem> data;

    public SurveyResponse(List<SurveyItem> list) {
        this.data = list;
    }

    public final List<SurveyItem> getData() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyResponse copy$default(SurveyResponse surveyResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = surveyResponse.data;
        }
        return surveyResponse.copy(list);
    }

    public final List<SurveyItem> component1() {
        return this.data;
    }

    public final SurveyResponse copy(List<SurveyItem> p0) {
        return new SurveyResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof SurveyResponse) && Intrinsics.areEqual(this.data, ((SurveyResponse) p0).data);
    }

    public final int hashCode() {
        List<SurveyItem> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        List<SurveyItem> list = this.data;
        StringBuilder sb = new StringBuilder("SurveyResponse(data=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
