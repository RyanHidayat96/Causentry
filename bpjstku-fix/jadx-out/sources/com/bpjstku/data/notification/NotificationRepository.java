package com.bpjstku.data.notification;

import com.bpjstku.data.notification.model.request.NotificationActionRequest;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.data.notification.model.response.NotificationItem;
import com.bpjstku.data.notification.model.response.NotificationListItem;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/notification/NotificationRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/notification/model/request/NotificationListRequest;", "p0", "LderiveCodec;", "Lcom/bpjstku/data/notification/model/response/NotificationListItem;", "getNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;", "Lcom/bpjstku/data/notification/model/response/NotificationItem;", "deleteNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;)LderiveCodec;", "readNotification"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NotificationRepository extends getChildrenOutConfigs {
    deriveCodec<NotificationItem> deleteNotification(@Body NotificationActionRequest p0);

    deriveCodec<NotificationListItem> getNotification(@Body NotificationListRequest p0);

    deriveCodec<NotificationItem> readNotification(@Body NotificationActionRequest p0);
}
