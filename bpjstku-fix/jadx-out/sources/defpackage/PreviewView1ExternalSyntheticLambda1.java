package defpackage;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PreviewView1ExternalSyntheticLambda1 {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(createImageAnalysis createimageanalysis, PreviewStreamStateObserver2 previewStreamStateObserver2) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        for (Annotation annotation : createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            if (annotation instanceof PreviewStreamStateObserver1) {
                return ((PreviewStreamStateObserver1) annotation).TuitionPaymentFragmentbindingInflater1();
            }
        }
        return previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
    }
}
