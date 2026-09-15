package com.datadog.android.core.configuration;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "maxBatchesPerUploadJob", "I", "getMaxBatchesPerUploadJob", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public enum BatchProcessingLevel {
    LOW(1),
    MEDIUM(10),
    HIGH(100);

    private final int maxBatchesPerUploadJob;

    BatchProcessingLevel(int i) {
        this.maxBatchesPerUploadJob = i;
    }

    public final int getMaxBatchesPerUploadJob() {
        return this.maxBatchesPerUploadJob;
    }
}
