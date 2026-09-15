package defpackage;

import android.view.Window;
import androidx.metrics.performance.JankStats;
import com.datadog.android.api.InternalLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LRetryPolicyRetryConfigBuilder;", "", "Landroid/view/Window;", "p0", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "Landroidx/metrics/performance/JankStats;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/Window;Landroidx/metrics/performance/JankStats$OnFrameListener;Lcom/datadog/android/api/InternalLogger;)Landroidx/metrics/performance/JankStats;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface RetryPolicyRetryConfigBuilder {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.b;

    JankStats TuitionPaymentFragmentspecialinlinedviewModeldefault3(Window p0, JankStats.OnFrameListener p1, InternalLogger p2);

    /* JADX INFO: renamed from: RetryPolicyRetryConfigBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion b = new Companion();
        private static final RetryPolicyRetryConfigBuilder TuitionPaymentFragmentbindingInflater1 = new b();

        private Companion() {
        }

        /* JADX INFO: renamed from: RetryPolicyRetryConfigBuilder$TuitionPaymentFragmentspecialinlinedviewModeldefault3$b */
        /* JADX INFO: loaded from: classes5.dex */
        public static final class b implements RetryPolicyRetryConfigBuilder {
            b() {
            }

            @Override // defpackage.RetryPolicyRetryConfigBuilder
            public final JankStats TuitionPaymentFragmentspecialinlinedviewModeldefault3(Window window, JankStats.OnFrameListener onFrameListener, InternalLogger internalLogger) {
                Intrinsics.checkNotNullParameter(window, "");
                Intrinsics.checkNotNullParameter(onFrameListener, "");
                Intrinsics.checkNotNullParameter(internalLogger, "");
                try {
                    return JankStats.INSTANCE.createAndTrack(window, onFrameListener);
                } catch (IllegalStateException e2) {
                    internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsProvider$Companion$DEFAULT$1$createJankStatsAndTrack$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Unable to attach JankStats to the current window";
                        }
                    }, e2, false, null);
                    return null;
                }
            }
        }

        public static RetryPolicyRetryConfigBuilder TuitionPaymentFragmentbindingInflater1() {
            return TuitionPaymentFragmentbindingInflater1;
        }
    }
}
