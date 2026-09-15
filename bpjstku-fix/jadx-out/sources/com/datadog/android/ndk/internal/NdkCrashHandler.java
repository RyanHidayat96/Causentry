package com.datadog.android.ndk.internal;

import defpackage.ImageAnalysisBlockingAnalyzer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface NdkCrashHandler {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ReportTarget {
        RUM,
        LOGS
    }

    void TuitionPaymentFragmentbindingInflater1(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, ReportTarget reportTarget);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1();
}
