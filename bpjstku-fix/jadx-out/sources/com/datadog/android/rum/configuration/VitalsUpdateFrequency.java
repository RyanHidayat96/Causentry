package com.datadog.android.rum.configuration;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "", "", "p0", "<init>", "(Ljava/lang/String;IJ)V", "periodInMs", "J", "getPeriodInMs$dd_sdk_android_rum_release", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum VitalsUpdateFrequency {
    FREQUENT(100),
    AVERAGE(500),
    RARE(1000),
    NEVER(0);

    private final long periodInMs;

    VitalsUpdateFrequency(long j) {
        this.periodInMs = j;
    }

    /* JADX INFO: renamed from: getPeriodInMs$dd_sdk_android_rum_release, reason: from getter */
    public final long getPeriodInMs() {
        return this.periodInMs;
    }
}
