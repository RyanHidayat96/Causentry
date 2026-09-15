package com.bpjstku.data.news.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/news/model/response/NewsItem;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/news/model/response/NewsItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", FirebaseAnalytics.Param.CONTENT, "Ljava/lang/String;", "getContent", "datePublish", "getDatePublish", "imagePath", "getImagePath", "title", "getTitle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NewsItem {
    public static final int $stable = 0;

    @SerializedName(FirebaseAnalytics.Param.CONTENT)
    private final String content;

    @SerializedName("datePublish")
    private final String datePublish;

    @SerializedName("imagePath")
    private final String imagePath;

    @SerializedName("title")
    private final String title;

    public NewsItem(String str, String str2, String str3, String str4) {
        this.content = str;
        this.datePublish = str2;
        this.imagePath = str3;
        this.title = str4;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDatePublish() {
        return this.datePublish;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getTitle() {
        return this.title;
    }

    public static /* synthetic */ NewsItem copy$default(NewsItem newsItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsItem.content;
        }
        if ((i & 2) != 0) {
            str2 = newsItem.datePublish;
        }
        if ((i & 4) != 0) {
            str3 = newsItem.imagePath;
        }
        if ((i & 8) != 0) {
            str4 = newsItem.title;
        }
        return newsItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDatePublish() {
        return this.datePublish;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final NewsItem copy(String p0, String p1, String p2, String p3) {
        return new NewsItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NewsItem)) {
            return false;
        }
        NewsItem newsItem = (NewsItem) p0;
        return Intrinsics.areEqual(this.content, newsItem.content) && Intrinsics.areEqual(this.datePublish, newsItem.datePublish) && Intrinsics.areEqual(this.imagePath, newsItem.imagePath) && Intrinsics.areEqual(this.title, newsItem.title);
    }

    public final int hashCode() {
        String str = this.content;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.datePublish;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imagePath;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.content;
        String str2 = this.datePublish;
        String str3 = this.imagePath;
        String str4 = this.title;
        StringBuilder sb = new StringBuilder("NewsItem(content=");
        sb.append(str);
        sb.append(", datePublish=");
        sb.append(str2);
        sb.append(", imagePath=");
        sb.append(str3);
        sb.append(", title=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
