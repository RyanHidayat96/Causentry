package com.rtchagas.pingplacepicker.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0011\u0012B%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00018\u00008\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/rtchagas/pingplacepicker/viewmodel/Resource;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/rtchagas/pingplacepicker/viewmodel/Resource$Status;", "p0", "p1", "", "p2", "<init>", "(Lcom/rtchagas/pingplacepicker/viewmodel/Resource$Status;Ljava/lang/Object;Ljava/lang/Throwable;)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Throwable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/rtchagas/pingplacepicker/viewmodel/Resource$Status;", "b", "Status"}, k = 1, mv = {2, 3, 0})
public final class Resource<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final Status TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/rtchagas/pingplacepicker/viewmodel/Resource$Status;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 3, 0})
    public enum Status {
        LOADING,
        SUCCESS,
        ERROR,
        NO_DATA
    }

    private Resource(Status status, T t, Throwable th) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = status;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
    }

    public /* synthetic */ Resource(Status status, Object obj, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, obj, th);
    }

    /* JADX INFO: renamed from: com.rtchagas.pingplacepicker.viewmodel.Resource$b, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\b\u0010\r"}, d2 = {"Lcom/rtchagas/pingplacepicker/viewmodel/Resource$b;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "Lcom/rtchagas/pingplacepicker/viewmodel/Resource;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/Throwable;)Lcom/rtchagas/pingplacepicker/viewmodel/Resource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Lcom/rtchagas/pingplacepicker/viewmodel/Resource;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;)Lcom/rtchagas/pingplacepicker/viewmodel/Resource;"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> Resource<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new Resource<>(Status.LOADING, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> Resource<T> TuitionPaymentFragmentbindingInflater1(T p0) {
            return new Resource<>(Status.SUCCESS, p0, null, 0 == true ? 1 : 0);
        }

        public static <T> Resource<T> TuitionPaymentFragmentbindingInflater1(Throwable p0) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Resource<>(Status.ERROR, defaultConstructorMarker, p0, defaultConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> Resource<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new Resource<>(Status.NO_DATA, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }
    }
}
