package com.datadog.android.rum.tracking;

import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import defpackage.ImageAnalysisBlockingAnalyzer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LImageAnalysisBlockingAnalyzer;", "p0", "Lcom/datadog/android/rum/RumMonitor;", "TuitionPaymentFragmentbindingInflater1", "(LImageAnalysisBlockingAnalyzer;)Lcom/datadog/android/rum/RumMonitor;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class ActivityViewTrackingStrategy$getRumMonitor$1 extends Lambda implements Function1<ImageAnalysisBlockingAnalyzer, RumMonitor> {
    public static final ActivityViewTrackingStrategy$getRumMonitor$1 TuitionPaymentFragmentbindingInflater1 = new ActivityViewTrackingStrategy$getRumMonitor$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final RumMonitor invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        return GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer);
    }

    ActivityViewTrackingStrategy$getRumMonitor$1() {
        super(1);
    }
}
