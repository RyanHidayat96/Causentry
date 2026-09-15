package defpackage;

import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"LRetryPolicyRetryConfig;", "LwrapImageProxy;", "Ljava/io/File;", "p0", "Lcom/datadog/android/api/InternalLogger;", "p1", "<init>", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)V", "", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/Double;", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/io/File;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RetryPolicyRetryConfig implements wrapImageProxy {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;
    private final File TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final File TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new File("/proc/self/stat");

    private RetryPolicyRetryConfig(File file, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    public /* synthetic */ RetryPolicyRetryConfig(File file, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2 : file, internalLogger);
    }

    @Override // defpackage.wrapImageProxy
    public final Double TuitionPaymentFragmentbindingInflater1() {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (!ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1) || !ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1) || (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8, this.TuitionPaymentFragmentbindingInflater1)) == null) {
            return null;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault2, new char[]{' '}, false, 0, 6, (Object) null);
        if (listSplit$default.size() > 13) {
            return StringsKt.toDoubleOrNull((String) listSplit$default.get(13));
        }
        return null;
    }
}
