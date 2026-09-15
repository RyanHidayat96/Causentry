package defpackage;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class onFrameUpdate {
    private static final Set<createImageAnalysis> b;

    static {
        Intrinsics.checkNotNullParameter(UInt.INSTANCE, "");
        createImageAnalysis descriptor = startPreviewStreamStateFlow.INSTANCE.getDescriptor();
        Intrinsics.checkNotNullParameter(ULong.INSTANCE, "");
        createImageAnalysis descriptor2 = cancelFlow.INSTANCE.getDescriptor();
        Intrinsics.checkNotNullParameter(UByte.INSTANCE, "");
        createImageAnalysis descriptor3 = lambdasetValue0androidxcameraviewPendingValue.INSTANCE.getDescriptor();
        Intrinsics.checkNotNullParameter(UShort.INSTANCE, "");
        b = SetsKt.setOf((Object[]) new createImageAnalysis[]{descriptor, descriptor2, descriptor3, PreviewStreamStateObserverExternalSyntheticLambda0.INSTANCE.getDescriptor()});
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return createimageanalysis.b() && b.contains(createimageanalysis);
    }

    public static final boolean b(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return createimageanalysis.b() && Intrinsics.areEqual(createimageanalysis, getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }
}
