package com.bumptech.glide.request;

import defpackage.ImageAnalysisBuilder;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestCoordinator {
    boolean TuitionPaymentFragmentbindingInflater1();

    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageAnalysisBuilder imageAnalysisBuilder);

    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageAnalysisBuilder imageAnalysisBuilder);

    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBuilder imageAnalysisBuilder);

    RequestCoordinator b();

    void b(ImageAnalysisBuilder imageAnalysisBuilder);

    void g(ImageAnalysisBuilder imageAnalysisBuilder);

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        public final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }
    }
}
