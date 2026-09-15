package com.bpjstku.data.notification.remote;

import com.bpjstku.data.notification.model.request.NotificationActionRequest;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.data.notification.model.response.NotificationItem;
import com.bpjstku.data.notification.model.response.NotificationListItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/notification/remote/NotificationApi;", "LunbindChildren;", "Lcom/bpjstku/data/notification/remote/NotificationApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/notification/remote/NotificationApiClient;)V", "Lcom/bpjstku/data/notification/model/request/NotificationListRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/notification/model/response/NotificationListItem;", "getNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;", "Lcom/bpjstku/data/notification/model/response/NotificationItem;", "readNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;)LderiveCodec;", "deleteNotification", "notificationApiClient", "Lcom/bpjstku/data/notification/remote/NotificationApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationApi implements unbindChildren, NotificationApiClient {
    public static final int $stable = 8;
    private final NotificationApiClient notificationApiClient;

    public NotificationApi(NotificationApiClient notificationApiClient) {
        Intrinsics.checkNotNullParameter(notificationApiClient, "");
        this.notificationApiClient = notificationApiClient;
    }

    @Override // com.bpjstku.data.notification.remote.NotificationApiClient
    public final deriveCodec<Response<NotificationListItem>> getNotification(NotificationListRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.notificationApiClient.getNotification(p0);
    }

    @Override // com.bpjstku.data.notification.remote.NotificationApiClient
    public final deriveCodec<Response<NotificationItem>> readNotification(NotificationActionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.notificationApiClient.readNotification(p0);
    }

    @Override // com.bpjstku.data.notification.remote.NotificationApiClient
    public final deriveCodec<Response<NotificationItem>> deleteNotification(NotificationActionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.notificationApiClient.deleteNotification(p0);
    }
}
