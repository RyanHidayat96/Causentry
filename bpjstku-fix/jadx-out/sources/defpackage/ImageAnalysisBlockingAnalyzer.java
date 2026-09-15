package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0015J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0013\u0010\u0018J>\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022%\u0010\u0017\u001a!\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001a¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u00120\u0019H&¢\u0006\u0004\b\u000f\u0010\u001cR\u0014\u0010\b\u001a\u00020\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001e"}, d2 = {"LImageAnalysisBlockingAnalyzer;", "Lcom/datadog/android/api/SdkCore;", "", "p0", "Ljava/util/concurrent/ScheduledExecutorService;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "b", "(Ljava/lang/String;)LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Ljava/util/Map;", "Ldetach;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ldetach;)V", "(Ljava/lang/String;)V", "LsetRelativeRotation;", "p1", "(Ljava/lang/String;LsetRelativeRotation;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/api/InternalLogger;", "()Lcom/datadog/android/api/InternalLogger;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface ImageAnalysisBlockingAnalyzer extends SdkCore {
    ScheduledExecutorService TuitionPaymentFragmentbindingInflater1(String p0);

    ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0);

    Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, Function1<? super Map<String, Object>, Unit> p1);

    InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(detach p0);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, setRelativeRotation p1);

    ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 b(String p0);
}
