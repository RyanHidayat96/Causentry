package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"LsetCaptureMode;", "LImageReaderFormatRecommenderFormatCombo;", "Lcom/datadog/android/api/InternalLogger;", "p0", "", "p1", "p2", "", "p3", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Ljava/lang/String;J)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Z)V", "Ljava/lang/String;", "b", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "J"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setCaptureMode implements ImageReaderFormatRecommenderFormatCombo {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    private setCaptureMode(InternalLogger internalLogger, String str, String str2, long j) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = internalLogger;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
    }

    public /* synthetic */ setCaptureMode(InternalLogger internalLogger, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, str, str2, (i & 8) != 0 ? System.nanoTime() : j);
    }

    @Override // defpackage.ImageReaderFormatRecommenderFormatCombo
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean p0) {
        long jNanoTime = System.nanoTime();
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("execution_time", Long.valueOf(jNanoTime - j));
        linkedHashMap.put("operation_name", this.b);
        linkedHashMap.put("caller_class", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        linkedHashMap.put("is_successful", Boolean.valueOf(p0));
        linkedHashMap.put("metric_type", "method called");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0<String>() { // from class: com.datadog.android.core.internal.metrics.MethodCalledTelemetry$stopAndSend$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "[Mobile Metric] Method Called";
            }
        }, linkedHashMap, MethodCallSamplingRate.ALL.getRate());
    }
}
