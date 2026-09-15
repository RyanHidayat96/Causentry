package com.bpjstku.data.podcast.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "tipe", "Ljava/lang/String;", "getTipe", "deviceId", "getDeviceId", "email", "getEmail", "ipClient", "getIpClient", "podcastId", "getPodcastId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PodcastLogRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("email")
    private final String email;

    @SerializedName("ipClient")
    private final String ipClient;

    @SerializedName("podcastId")
    private final String podcastId;

    @SerializedName("tipe")
    private final String tipe;

    public final String getTipe() {
        return this.tipe;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIpClient() {
        return this.ipClient;
    }

    public final String getPodcastId() {
        return this.podcastId;
    }

    public PodcastLogRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tipe = str;
        this.deviceId = str2;
        this.email = str3;
        this.ipClient = str4;
        this.podcastId = str5;
    }

    public static /* synthetic */ PodcastLogRequest copy$default(PodcastLogRequest podcastLogRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = podcastLogRequest.tipe;
        }
        if ((i & 2) != 0) {
            str2 = podcastLogRequest.deviceId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = podcastLogRequest.email;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = podcastLogRequest.ipClient;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = podcastLogRequest.podcastId;
        }
        return podcastLogRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTipe() {
        return this.tipe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIpClient() {
        return this.ipClient;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPodcastId() {
        return this.podcastId;
    }

    public final PodcastLogRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new PodcastLogRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PodcastLogRequest)) {
            return false;
        }
        PodcastLogRequest podcastLogRequest = (PodcastLogRequest) p0;
        return Intrinsics.areEqual(this.tipe, podcastLogRequest.tipe) && Intrinsics.areEqual(this.deviceId, podcastLogRequest.deviceId) && Intrinsics.areEqual(this.email, podcastLogRequest.email) && Intrinsics.areEqual(this.ipClient, podcastLogRequest.ipClient) && Intrinsics.areEqual(this.podcastId, podcastLogRequest.podcastId);
    }

    public final int hashCode() {
        return (((((((this.tipe.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.email.hashCode()) * 31) + this.ipClient.hashCode()) * 31) + this.podcastId.hashCode();
    }

    public final String toString() {
        String str = this.tipe;
        String str2 = this.deviceId;
        String str3 = this.email;
        String str4 = this.ipClient;
        String str5 = this.podcastId;
        StringBuilder sb = new StringBuilder("PodcastLogRequest(tipe=");
        sb.append(str);
        sb.append(", deviceId=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", ipClient=");
        sb.append(str4);
        sb.append(", podcastId=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
