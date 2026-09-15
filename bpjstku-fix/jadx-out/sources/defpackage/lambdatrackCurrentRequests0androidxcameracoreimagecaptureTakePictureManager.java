package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdatrackCurrentRequests0androidxcameracoreimagecaptureTakePictureManager implements getSurfaceConfig<Executor> {

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        static final lambdatrackCurrentRequests0androidxcameracoreimagecaptureTakePictureManager b = new lambdatrackCurrentRequests0androidxcameracoreimagecaptureTakePictureManager();
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* synthetic */ Object get() {
        return new TakePictureManagerExternalSyntheticLambda1(Executors.newSingleThreadExecutor());
    }
}
