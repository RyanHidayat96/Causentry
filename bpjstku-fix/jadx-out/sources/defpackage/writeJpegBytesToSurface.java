package defpackage;

import com.datadog.android.api.InternalLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class writeJpegBytesToSurface implements lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public writeJpegBytesToSurface(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    @Override // defpackage.lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.time.LoggingSyncListener$onError$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Kronos onError @host:".concat(String.valueOf(str));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, th, false, null);
    }

    @Override // defpackage.lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }
}
