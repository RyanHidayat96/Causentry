package defpackage;

import com.datadog.android.api.storage.EventType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class getExecutedTimeInMillis {
    public static final getStatus b(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, ImageAnalysisNonBlockingAnalyzer1<Object> imageAnalysisNonBlockingAnalyzer1, EventType eventType, Function1<? super recalculateTransformMatrixAndCropRect, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(imageAnalysisNonBlockingAnalyzer1, "");
        Intrinsics.checkNotNullParameter(eventType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new getStatus(imageAnalysisBlockingAnalyzer, imageAnalysisNonBlockingAnalyzer1, eventType, function1);
    }
}
