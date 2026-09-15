package com.bpjstku.data.news.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0018\u0010\u0010R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/bpjstku/data/news/model/response/NewsResponse;", "", "", "Lcom/bpjstku/data/news/model/response/NewsItem;", "p0", "", "p1", "", "p2", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/bpjstku/data/news/model/response/NewsResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/List;", "getData", "isSuccessful", "Ljava/lang/Boolean;", "message", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NewsResponse {
    public static final int $stable = 8;

    @SerializedName("berita")
    private final List<NewsItem> data;

    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    public NewsResponse(List<NewsItem> list, Boolean bool, String str) {
        this.data = list;
        this.isSuccessful = bool;
        this.message = str;
    }

    public final List<NewsItem> getData() {
        return this.data;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsResponse copy$default(NewsResponse newsResponse, List list, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsResponse.data;
        }
        if ((i & 2) != 0) {
            bool = newsResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            str = newsResponse.message;
        }
        return newsResponse.copy(list, bool, str);
    }

    public final List<NewsItem> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final NewsResponse copy(List<NewsItem> p0, Boolean p1, String p2) {
        return new NewsResponse(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NewsResponse)) {
            return false;
        }
        NewsResponse newsResponse = (NewsResponse) p0;
        return Intrinsics.areEqual(this.data, newsResponse.data) && Intrinsics.areEqual(this.isSuccessful, newsResponse.isSuccessful) && Intrinsics.areEqual(this.message, newsResponse.message);
    }

    public final int hashCode() {
        List<NewsItem> list = this.data;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.isSuccessful;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.message;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        List<NewsItem> list = this.data;
        Boolean bool = this.isSuccessful;
        String str = this.message;
        StringBuilder sb = new StringBuilder("NewsResponse(data=");
        sb.append(list);
        sb.append(", isSuccessful=");
        sb.append(bool);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
