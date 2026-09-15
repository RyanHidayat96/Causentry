package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.model.ViewEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH&¢\u0006\u0004\b\n\u0010\u0010J/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\n\u0010\u0015"}, d2 = {"LPreviewExternalSyntheticLambda3;", "", "", "p0", "", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;J)V", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ViewEvent;", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent;)V", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "p2", "", "p3", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface PreviewExternalSyntheticLambda3 {
    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, long p1);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, String p1);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, RumSessionScope.StartReason p1, long p2, boolean p3);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, SessionEndedMetric.MissedEventType p1);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, ViewEvent p1);

    void b(String p0);
}
