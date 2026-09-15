package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"LonEvent;", "", "<init>", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LonEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LonEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class onEvent {
    private onEvent() {
    }

    public /* synthetic */ onEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends onEvent {
        public final int b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            super(null);
            this.b = i;
            if (i <= 0) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.b == ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).b;
        }

        public final int hashCode() {
            return this.b;
        }

        public final String toString() {
            return String.valueOf(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LonEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LonEvent;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends onEvent {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super(null);
        }

        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
