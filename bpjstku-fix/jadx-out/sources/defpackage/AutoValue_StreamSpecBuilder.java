package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoValue_StreamSpecBuilder implements getSurfaceConfig<String> {
    private final ExtraSupportedResolutionQuirk<Context> TuitionPaymentFragmentbindingInflater1;

    public AutoValue_StreamSpecBuilder(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk) {
        this.TuitionPaymentFragmentbindingInflater1 = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        String packageName = this.TuitionPaymentFragmentbindingInflater1.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
