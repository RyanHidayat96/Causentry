package defpackage;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoRecordEventStatus<T> {
    private static VideoRecordEventStatus<Object> b = new VideoRecordEventStatus<>(null);
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    private VideoRecordEventStatus(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VideoRecordEventStatus) {
            return share.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((VideoRecordEventStatus) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj)) {
            StringBuilder sb = new StringBuilder("OnErrorNotification[");
            sb.append(NotificationLite.b(obj));
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("OnNextNotification[");
        sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb2.append("]");
        return sb2.toString();
    }

    public static <T> VideoRecordEventStatus<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        share.b(t, "value is null");
        return new VideoRecordEventStatus<>(t);
    }

    public static <T> VideoRecordEventStatus<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
        share.b(th, "error is null");
        return new VideoRecordEventStatus<>(NotificationLite.TuitionPaymentFragmentbindingInflater1(th));
    }

    public static <T> VideoRecordEventStatus<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (VideoRecordEventStatus<T>) b;
    }
}
