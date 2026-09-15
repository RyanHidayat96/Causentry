package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n"}, d2 = {"LsetOnImageAvailableListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "LsetOnImageAvailableListener$b;", "LsetOnImageAvailableListener$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LsetOnImageAvailableListener$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class setOnImageAvailableListener<T> {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"LsetOnImageAvailableListener$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LsetOnImageAvailableListener;", "", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends setOnImageAvailableListener {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        public final int hashCode() {
            return 2043563085;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super(null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "TuitionPaymentFragmentspecialinlinedviewModeldefault1";
        }
    }

    private setOnImageAvailableListener() {
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends setOnImageAvailableListener<T> {
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
            super(null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("Success(data=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ setOnImageAvailableListener(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class b extends setOnImageAvailableListener {
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((b) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }
}
