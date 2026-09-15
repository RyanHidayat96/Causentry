package com.bpjstku.domain.notification;

import com.bpjstku.data.notification.model.request.NotificationActionRequest;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.domain.notification.model.Notification;
import defpackage.deriveCodec;
import defpackage.getDefaultDarkScrimannotations;
import java.util.List;
import kotlin.Metadata;
import retrofit2.http.Body;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\r\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/domain/notification/NotificationUseCase;", "", "Lcom/bpjstku/data/notification/model/request/NotificationListRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/domain/notification/model/Notification;", "getNotifications", "(Lcom/bpjstku/data/notification/model/request/NotificationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;", "LgetDefaultDarkScrimannotations;", "deleteNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;)LderiveCodec;", "readNotification"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NotificationUseCase {
    deriveCodec<getDefaultDarkScrimannotations> deleteNotification(@Body NotificationActionRequest p0);

    deriveCodec<List<Notification>> getNotifications(@Body NotificationListRequest p0);

    deriveCodec<getDefaultDarkScrimannotations> readNotification(@Body NotificationActionRequest p0);
}
