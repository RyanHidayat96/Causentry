package com.datadog.android.core.metrics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/core/metrics/MethodCallSamplingRate;", "", "", "p0", "<init>", "(Ljava/lang/String;IF)V", "rate", "F", "getRate", "()F", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum MethodCallSamplingRate {
    ALL(100.0f),
    HIGH(10.0f),
    MEDIUM(1.0f),
    LOW(0.1f),
    REDUCED(0.01f),
    RARE(0.001f);

    private final float rate;

    MethodCallSamplingRate(float f) {
        this.rate = f;
    }

    public final float getRate() {
        return this.rate;
    }
}
