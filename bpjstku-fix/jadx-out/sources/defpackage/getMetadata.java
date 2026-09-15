package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class getMetadata {
    public static final void TuitionPaymentFragmentbindingInflater1(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        if (animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1) != null) {
            return;
        }
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        getRatingType.b(animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1, false));
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(animateToFullOpacity animatetofullopacity, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) throws IOException {
        try {
            IOException iOException = null;
            for (SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2 : animatetofullopacity.b(surfaceViewImplementationExternalSyntheticLambda1)) {
                try {
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    if (surfaceDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(animatetofullopacity, surfaceViewImplementationExternalSyntheticLambda2).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(animatetofullopacity, surfaceViewImplementationExternalSyntheticLambda2);
                    }
                    Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
                    animatetofullopacity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda2, false);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
