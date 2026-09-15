package defpackage;

import com.datadog.android.api.context.NetworkInfo;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0004\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0011\u001a\u00020\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020#8'X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"LImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0;", "LImageAnalysisBlockingAnalyzer;", "", "LImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;", "b", "()Ljava/util/List;", "LrecalculateTransformMatrixAndCropRect;", "asInterface", "()LrecalculateTransformMatrixAndCropRect;", "Ljava/util/concurrent/ExecutorService;", "onTransact", "()Ljava/util/concurrent/ExecutorService;", "", "p0", "", "(J)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "([B)V", "asBinder", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetJpegQuality;", "d", "()LsetJpegQuality;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "cancelAll", "()Z", "a", "()Ljava/lang/Long;", "Lcom/google/gson/JsonObject;", "g", "()Lcom/google/gson/JsonObject;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/context/NetworkInfo;", "INotificationSideChannel", "()Lcom/datadog/android/api/context/NetworkInfo;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0 extends ImageAnalysisBlockingAnalyzer {
    NetworkInfo INotificationSideChannel();

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] p0);

    Long a();

    long asBinder();

    recalculateTransformMatrixAndCropRect asInterface();

    List<ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1> b();

    void b(long p0);

    boolean cancelAll();

    setJpegQuality d();

    JsonObject g();

    ExecutorService onTransact();
}
