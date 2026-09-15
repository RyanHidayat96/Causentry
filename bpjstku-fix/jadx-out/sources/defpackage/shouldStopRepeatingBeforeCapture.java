package defpackage;

import com.sofakingforever.analytics.exceptions.EventNotTrackedException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class shouldStopRepeatingBeforeCapture implements getSupportedSizes {
    private final getOutputUri TuitionPaymentFragmentbindingInflater1;

    public shouldStopRepeatingBeforeCapture(getOutputUri getoutputuri) {
        Intrinsics.checkNotNullParameter(getoutputuri, "");
        this.TuitionPaymentFragmentbindingInflater1 = getoutputuri;
    }

    @Override // defpackage.getSupportedSizes
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        getOutputUri getoutputuri = this.TuitionPaymentFragmentbindingInflater1;
        TargetAspectRatioRatio targetAspectRatioRatio = new TargetAspectRatioRatio(str, map);
        AutoValue_Quality_ConstantQuality[] autoValue_Quality_ConstantQualityArr = {targetAspectRatioRatio};
        if (getoutputuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = autoValue_Quality_ConstantQualityArr[0];
            for (AutoValue_OutputResults autoValue_OutputResults : getoutputuri.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (Intrinsics.areEqual(getoutputuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(autoValue_OutputResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), Boolean.FALSE) || Intrinsics.areEqual(getoutputuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(autoValue_OutputResults.b()), Boolean.FALSE)) {
                    return;
                }
                try {
                    autoValue_OutputResults.b(autoValue_Quality_ConstantQuality);
                } catch (Exception e2) {
                    getOutputUri.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = getoutputuri.b;
                    if (tuitionPaymentFragmentbindingInflater1 != null) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new EventNotTrackedException(autoValue_OutputResults, autoValue_Quality_ConstantQuality, e2));
                    }
                }
            }
        }
    }
}
