package io.reactivex.internal.util;

import defpackage.BufferProviderState;
import defpackage.deriveMediaType;
import defpackage.share;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public enum NotificationLite {
    COMPLETE;

    public static <T> Object TuitionPaymentFragmentbindingInflater1(T t) {
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        return obj;
    }

    static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Throwable f1213e;

        ErrorNotification(Throwable th) {
            this.f1213e = th;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Error[");
            sb.append(this.f1213e);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.f1213e.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return share.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f1213e, ((ErrorNotification) obj).f1213e);
            }
            return false;
        }
    }

    static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final BufferProviderState upstream;

        DisposableNotification(BufferProviderState bufferProviderState) {
            this.upstream = bufferProviderState;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Disposable[");
            sb.append(this.upstream);
            sb.append("]");
            return sb.toString();
        }
    }

    public static Object b() {
        return COMPLETE;
    }

    public static Object TuitionPaymentFragmentbindingInflater1(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(BufferProviderState bufferProviderState) {
        return new DisposableNotification(bufferProviderState);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static Throwable b(Object obj) {
        return ((ErrorNotification) obj).f1213e;
    }

    public static <T> boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, deriveMediaType<? super T> derivemediatype) {
        if (obj == COMPLETE) {
            derivemediatype.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            derivemediatype.onError(((ErrorNotification) obj).f1213e);
            return true;
        }
        derivemediatype.onNext(obj);
        return false;
    }

    public static <T> boolean b(Object obj, deriveMediaType<? super T> derivemediatype) {
        if (obj == COMPLETE) {
            derivemediatype.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            derivemediatype.onError(((ErrorNotification) obj).f1213e);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            derivemediatype.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        }
        derivemediatype.onNext(obj);
        return false;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
