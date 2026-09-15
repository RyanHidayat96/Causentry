package defpackage;

import com.datadog.android.telemetry.internal.TelemetryType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class initialSurfaceRecreationCompleter {
    public static final SurfaceRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutSettings layoutSettings) {
        Intrinsics.checkNotNullParameter(layoutSettings, "");
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
            TelemetryType telemetryTypeB = b(layoutSettings);
            LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) layoutSettings;
            return new SurfaceRequest(telemetryTypeB, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return new SurfaceRequest(b(layoutSettings), ((LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2) layoutSettings).TuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        }
        return new SurfaceRequest(b(layoutSettings), "", null);
    }

    private static TelemetryType b(LayoutSettings layoutSettings) {
        Intrinsics.checkNotNullParameter(layoutSettings, "");
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.C0002TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return TelemetryType.DEBUG;
        }
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
            return TelemetryType.ERROR;
        }
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return TelemetryType.CONFIGURATION;
        }
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentbindingInflater1) {
            return TelemetryType.METRIC;
        }
        if (layoutSettings instanceof LayoutSettings.b) {
            return TelemetryType.API_USAGE;
        }
        if (layoutSettings instanceof LayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return TelemetryType.INTERCEPTOR_SETUP;
        }
        throw new NoWhenBranchMatchedException();
    }
}
