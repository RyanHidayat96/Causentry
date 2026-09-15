package defpackage;

import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"LImageCaptureBuilder;", "", "<init>", "()V", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LImageCaptureBuilder$b;", "LImageCaptureBuilder$TuitionPaymentFragmentbindingInflater1;", "LImageCaptureBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LImageCaptureBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LImageCaptureBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class ImageCaptureBuilder {
    private ImageCaptureBuilder() {
    }

    public /* synthetic */ ImageCaptureBuilder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentbindingInflater1 extends ImageCaptureBuilder {
        private final int b;

        public TuitionPaymentFragmentbindingInflater1(int i) {
            super(null);
            this.b = i;
        }

        public final String toString() {
            return "intake-code-".concat(String.valueOf(this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TuitionPaymentFragmentbindingInflater1) && this.b == ((TuitionPaymentFragmentbindingInflater1) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LImageCaptureBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LImageCaptureBuilder;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends ImageCaptureBuilder {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super(null);
        }

        public final String toString() {
            return TransactionResult.STATUS_INVALID;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LImageCaptureBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LImageCaptureBuilder;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends ImageCaptureBuilder {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super(null);
        }

        public final String toString() {
            return "purged";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LImageCaptureBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LImageCaptureBuilder;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends ImageCaptureBuilder {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super(null);
        }

        public final String toString() {
            return "obsolete";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LImageCaptureBuilder$b;", "LImageCaptureBuilder;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class b extends ImageCaptureBuilder {
        public static final b INSTANCE = new b();

        private b() {
            super(null);
        }

        public final String toString() {
            return "flushed";
        }
    }
}
