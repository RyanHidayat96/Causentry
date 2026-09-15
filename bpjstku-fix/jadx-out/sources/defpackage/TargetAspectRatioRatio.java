package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TargetAspectRatioRatio implements getQuality {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public TargetAspectRatioRatio(String str, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
    }

    @Override // defpackage.getQuality
    public final String TuitionPaymentFragmentbindingInflater1(AutoValue_QualityRatioToResolutionsTable_QualityRatio autoValue_QualityRatioToResolutionsTable_QualityRatio) {
        Intrinsics.checkNotNullParameter(autoValue_QualityRatioToResolutionsTable_QualityRatio, "");
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.getQuality
    public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(AutoValue_QualityRatioToResolutionsTable_QualityRatio autoValue_QualityRatioToResolutionsTable_QualityRatio) {
        Intrinsics.checkNotNullParameter(autoValue_QualityRatioToResolutionsTable_QualityRatio, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.AutoValue_Quality_ConstantQuality
    public final List<AutoValue_QualityRatioToResolutionsTable_QualityRatio> TuitionPaymentFragmentbindingInflater1() {
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.AutoValue_Quality_ConstantQuality
    public final List<AutoValue_QualityRatioToResolutionsTable_QualityRatio> b() {
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.AutoValue_Quality_ConstantQuality
    public final boolean b(AutoValue_QualityRatioToResolutionsTable_QualityRatio autoValue_QualityRatioToResolutionsTable_QualityRatio) {
        TargetAspectRatioRatio targetAspectRatioRatio = this;
        if (targetAspectRatioRatio.TuitionPaymentFragmentbindingInflater1().contains(autoValue_QualityRatioToResolutionsTable_QualityRatio)) {
            return false;
        }
        return targetAspectRatioRatio.b().isEmpty() || targetAspectRatioRatio.b().contains(autoValue_QualityRatioToResolutionsTable_QualityRatio);
    }
}
