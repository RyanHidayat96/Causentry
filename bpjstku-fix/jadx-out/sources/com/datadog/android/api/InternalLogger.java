package com.datadog.android.api;

import com.datadog.android.core.metrics.TelemetryMetricType;
import defpackage.ImageCaptureExternalSyntheticLambda2;
import defpackage.ImageReaderFormatRecommenderFormatCombo;
import defpackage.LayoutSettings;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fJW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011J]\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0006\u0010\b\u001a\u00020\u0016H&¢\u0006\u0004\b\u0010\u0010\u0019J1\u0010\u0010\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u001c"}, d2 = {"Lcom/datadog/android/api/InternalLogger;", "", "Lcom/datadog/android/api/InternalLogger$Level;", "p0", "Lcom/datadog/android/api/InternalLogger$Target;", "p1", "Lkotlin/Function0;", "", "p2", "", "p3", "", "p4", "", "p5", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "LLayoutSettings$b;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LLayoutSettings$b;F)V", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;F)V", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "LImageReaderFormatRecommenderFormatCombo;", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)LImageReaderFormatRecommenderFormatCombo;", "b", "Level", "Target"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface InternalLogger {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Target;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Target {
        USER,
        MAINTAINER,
        TELEMETRY
    }

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level p0, List<? extends Target> p1, Function0<String> p2, Throwable p3, boolean p4, Map<String, ? extends Object> p5);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutSettings.b p0, float p1);

    ImageReaderFormatRecommenderFormatCombo TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, TelemetryMetricType p1, float p2, String p3);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Level p0, Target p1, Function0<String> p2, Throwable p3, boolean p4, Map<String, ? extends Object> p5);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function0<String> p0, Map<String, ? extends Object> p1, float p2);

    /* JADX INFO: renamed from: com.datadog.android.api.InternalLogger$b, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion b = new Companion();
        private static final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImageCaptureExternalSyntheticLambda2(null, null, null, 6, null);

        private Companion() {
        }

        public static InternalLogger b() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }
}
