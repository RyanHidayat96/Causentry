package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"LgetSessionProcessor;", "", "<init>", "()V", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetSessionProcessor$TuitionPaymentFragmentbindingInflater1;", "LgetSessionProcessor$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class getSessionProcessor {
    private getSessionProcessor() {
    }

    public /* synthetic */ getSessionProcessor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends getSessionProcessor {
        private final List<isImageFormatSupported> TuitionPaymentFragmentbindingInflater1;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f979a;
        private final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(String str, Throwable th, long j, String str2, String str3, List<isImageFormatSupported> list) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
            this.f979a = j;
            this.b = str2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str3;
            this.TuitionPaymentFragmentbindingInflater1 = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.f979a == tuitionPaymentFragmentbindingInflater1.f979a && Intrinsics.areEqual(this.b, tuitionPaymentFragmentbindingInflater1.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + Long.hashCode(this.f979a)) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            long j = this.f979a;
            String str2 = this.b;
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List<isImageFormatSupported> list = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("Logs(threadName=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(", timestamp=");
            sb.append(j);
            sb.append(", message=");
            sb.append(str2);
            sb.append(", loggerName=");
            sb.append(str3);
            sb.append(", threads=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends getSessionProcessor {
        public final String TuitionPaymentFragmentbindingInflater1;
        public final Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final List<isImageFormatSupported> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th, String str, List<isImageFormatSupported> list) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = th;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = this.TuitionPaymentFragmentbindingInflater1;
            List<isImageFormatSupported> list = this.b;
            StringBuilder sb = new StringBuilder("Rum(throwable=");
            sb.append(th);
            sb.append(", message=");
            sb.append(str);
            sb.append(", threads=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }
}
