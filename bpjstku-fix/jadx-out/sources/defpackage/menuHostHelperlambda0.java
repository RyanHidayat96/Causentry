package defpackage;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class menuHostHelperlambda0 implements getSchedulerHandler<DigitalCardImageRequest, InputStream> {
    private final ensureViewModelStore TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public menuHostHelperlambda0(ensureViewModelStore ensureviewmodelstore) {
        Intrinsics.checkNotNullParameter(ensureviewmodelstore, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ensureviewmodelstore;
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<InputStream> TuitionPaymentFragmentbindingInflater1(DigitalCardImageRequest digitalCardImageRequest, int i, int i2, getTargetRotation gettargetrotation) {
        DigitalCardImageRequest digitalCardImageRequest2 = digitalCardImageRequest;
        Intrinsics.checkNotNullParameter(digitalCardImageRequest2, "");
        Intrinsics.checkNotNullParameter(gettargetrotation, "");
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(new setResolutionSelector(digitalCardImageRequest2.getHash()), new onBackPressedDispatcher_delegatelambda0(digitalCardImageRequest2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(DigitalCardImageRequest digitalCardImageRequest) {
        DigitalCardImageRequest digitalCardImageRequest2 = digitalCardImageRequest;
        Intrinsics.checkNotNullParameter(digitalCardImageRequest2, "");
        return digitalCardImageRequest2.getHash().length() > 0;
    }
}
