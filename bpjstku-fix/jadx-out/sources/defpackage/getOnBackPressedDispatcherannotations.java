package defpackage;

import com.bpjstku.data.notification.NotificationRepository;
import com.bpjstku.data.notification.model.request.NotificationActionRequest;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.data.notification.model.response.NotificationItem;
import com.bpjstku.data.notification.model.response.NotificationListItem;
import com.bpjstku.data.notification.model.response.Notifikasi;
import com.bpjstku.domain.notification.NotificationUseCase;
import com.bpjstku.domain.notification.model.Notification;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnBackPressedDispatcherannotations implements NotificationUseCase {
    private final NotificationRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getOnBackPressedDispatcherannotations(NotificationRepository notificationRepository) {
        Intrinsics.checkNotNullParameter(notificationRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = notificationRepository;
    }

    @Override // com.bpjstku.domain.notification.NotificationUseCase
    public final deriveCodec<List<Notification>> getNotifications(NotificationListRequest notificationListRequest) {
        Intrinsics.checkNotNullParameter(notificationListRequest, "");
        deriveCodec<NotificationListItem> notification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getNotification(notificationListRequest);
        final Function1 function1 = new Function1() { // from class: EdgeToEdge
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOnBackPressedDispatcherannotations.TuitionPaymentFragmentspecialinlinedviewModeldefault3((NotificationListItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getDefaultDarkScrim
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getOnBackPressedDispatcherannotations.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(notification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.notification.NotificationUseCase
    public final deriveCodec<getDefaultDarkScrimannotations> deleteNotification(NotificationActionRequest notificationActionRequest) {
        Intrinsics.checkNotNullParameter(notificationActionRequest, "");
        deriveCodec<NotificationItem> derivecodecDeleteNotification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.deleteNotification(notificationActionRequest);
        final Function1 function1 = new Function1() { // from class: enable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOnBackPressedDispatcherannotations.TuitionPaymentFragmentbindingInflater1((NotificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ComponentDialogExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getOnBackPressedDispatcherannotations.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecDeleteNotification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // com.bpjstku.domain.notification.NotificationUseCase
    public final deriveCodec<getDefaultDarkScrimannotations> readNotification(NotificationActionRequest notificationActionRequest) {
        Intrinsics.checkNotNullParameter(notificationActionRequest, "");
        deriveCodec<NotificationItem> notification = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.readNotification(notificationActionRequest);
        final Function1 function1 = new Function1() { // from class: ComponentDialogExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOnBackPressedDispatcherannotations.TuitionPaymentFragmentspecialinlinedviewModeldefault1((NotificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaYz0In1bzyBFjSE_9Sysnc9_l6Fw
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return getOnBackPressedDispatcherannotations.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(notification, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ getDefaultDarkScrimannotations TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (getDefaultDarkScrimannotations) function1.invoke(obj);
    }

    public static /* synthetic */ getDefaultDarkScrimannotations TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (getDefaultDarkScrimannotations) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ getDefaultDarkScrimannotations TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationItem notificationItem) {
        Intrinsics.checkNotNullParameter(notificationItem, "");
        Intrinsics.checkNotNullParameter(notificationItem, "");
        return new getDefaultDarkScrimannotations(notificationItem.getMessage());
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(NotificationListItem notificationListItem) {
        Intrinsics.checkNotNullParameter(notificationListItem, "");
        List<Notifikasi> notifikasi = notificationListItem.getNotifikasi();
        ArrayList arrayList = new ArrayList();
        if (notifikasi != null) {
            for (Notifikasi notifikasi2 : notifikasi) {
                String judul = notifikasi2.getJudul();
                String str = judul == null ? "" : judul;
                String pesan = notifikasi2.getPesan();
                String str2 = pesan == null ? "" : pesan;
                String tanggal = notifikasi2.getTanggal();
                String str3 = tanggal == null ? "" : tanggal;
                String kodeNotif = notifikasi2.getKodeNotif();
                String str4 = kodeNotif == null ? "" : kodeNotif;
                boolean zIsRead = notifikasi2.isRead();
                String type = notifikasi2.getType();
                arrayList.add(new Notification(str, str4, str2, str3, zIsRead, type == null ? "" : type));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ getDefaultDarkScrimannotations TuitionPaymentFragmentbindingInflater1(NotificationItem notificationItem) {
        Intrinsics.checkNotNullParameter(notificationItem, "");
        Intrinsics.checkNotNullParameter(notificationItem, "");
        return new getDefaultDarkScrimannotations(notificationItem.getMessage());
    }
}
