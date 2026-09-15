package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LisAvc;", "LAutoValue_VideoEncoderConfig;", "", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Throwable;)V", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface isAvc extends AutoValue_VideoEncoderConfig {
    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable p0);

    public static final class TuitionPaymentFragmentbindingInflater1 implements isAvc {
        private final Function1<Throwable, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentbindingInflater1(Function1<? super Throwable, Unit> function1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        @Override // defpackage.isAvc
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(th);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelHandler.UserSupplied[");
            sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            sb.append('@');
            sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this));
            sb.append(']');
            return sb.toString();
        }
    }
}
