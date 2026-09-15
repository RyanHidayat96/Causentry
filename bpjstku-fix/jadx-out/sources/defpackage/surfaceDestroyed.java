package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class surfaceDestroyed {
    public static final lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) throws IOException {
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1);
        if (lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw new FileNotFoundException("no such file: ".concat(String.valueOf(surfaceViewImplementationExternalSyntheticLambda1)));
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        ArrayDeque<SurfaceViewImplementationExternalSyntheticLambda1> arrayDeque = new ArrayDeque();
        while (surfaceViewImplementationExternalSyntheticLambda1 != null && !animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1)) {
            arrayDeque.addFirst(surfaceViewImplementationExternalSyntheticLambda1);
            surfaceViewImplementationExternalSyntheticLambda1 = surfaceViewImplementationExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1();
        }
        for (SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 : arrayDeque) {
            Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
            animatetofullopacity.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationExternalSyntheticLambda2, false);
        }
    }
}
