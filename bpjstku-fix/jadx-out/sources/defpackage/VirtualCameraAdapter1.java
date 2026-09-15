package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u000b\f\r\u000e\u000f"}, d2 = {"LVirtualCameraAdapter1;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asBinder", "LVirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LVirtualCameraAdapter1$TuitionPaymentFragmentbindingInflater1;", "LVirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LVirtualCameraAdapter1$asBinder;", "LVirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {2, 3, 0})
public abstract class VirtualCameraAdapter1<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> extends VirtualCameraAdapter1<T> {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super(null);
        }
    }

    private VirtualCameraAdapter1() {
    }

    public /* synthetic */ VirtualCameraAdapter1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class TuitionPaymentFragmentbindingInflater1<T> extends VirtualCameraAdapter1<T> {
        public TuitionPaymentFragmentbindingInflater1() {
            super(null);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> extends VirtualCameraAdapter1<T> {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super(null);
        }
    }

    public static final class asBinder<T> extends VirtualCameraAdapter1<T> {
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public asBinder(T t) {
            super(null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof asBinder) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((asBinder) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(data=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends VirtualCameraAdapter1<T> {
        public final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th, String str) {
            super(null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = th;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int iHashCode = th != null ? th.hashCode() : 0;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(throwable=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(", message=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: VirtualCameraAdapter1$b, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\b\u0010\u000bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0007J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u0010"}, d2 = {"LVirtualCameraAdapter1$b;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "LVirtualCameraAdapter1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LVirtualCameraAdapter1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "p0", "(Ljava/lang/String;)LVirtualCameraAdapter1;", "", "p1", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/Throwable;Ljava/lang/String;)LVirtualCameraAdapter1;", "(Ljava/lang/Object;)LVirtualCameraAdapter1;"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static <T> VirtualCameraAdapter1<T> TuitionPaymentFragmentbindingInflater1() {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        public static <T> VirtualCameraAdapter1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new TuitionPaymentFragmentbindingInflater1();
        }

        public static <T> VirtualCameraAdapter1<T> TuitionPaymentFragmentbindingInflater1(T p0) {
            return new asBinder(p0);
        }

        public static <T> VirtualCameraAdapter1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        public static <T> VirtualCameraAdapter1<T> TuitionPaymentFragmentbindingInflater1(Throwable p0, String p1) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, p1);
        }

        public static <T> VirtualCameraAdapter1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, p0);
        }
    }
}
