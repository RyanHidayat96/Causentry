package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.TelemetryMetricType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
public final /* synthetic */ class ImageCaptureExternalSyntheticLambda2$TuitionPaymentFragmentbindingInflater1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[InternalLogger.Target.values().length];
        try {
            iArr[InternalLogger.Target.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InternalLogger.Target.MAINTAINER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InternalLogger.Target.TELEMETRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[TelemetryMetricType.values().length];
        try {
            iArr2[TelemetryMetricType.MethodCalled.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[InternalLogger.Level.values().length];
        try {
            iArr3[InternalLogger.Level.VERBOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[InternalLogger.Level.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[InternalLogger.Level.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[InternalLogger.Level.WARN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[InternalLogger.Level.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
