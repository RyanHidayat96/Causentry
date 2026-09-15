package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SurfaceProcessor {
    public static final TelemetryDebugEvent.Source TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelemetryDebugEvent.Source.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return TelemetryDebugEvent.Source.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final TelemetryErrorEvent.Source b(TelemetryErrorEvent.Source.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return TelemetryErrorEvent.Source.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final TelemetryUsageEvent.Source TuitionPaymentFragmentbindingInflater1(TelemetryUsageEvent.Source.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return TelemetryUsageEvent.Source.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }

    public static final TelemetryConfigurationEvent.Source TuitionPaymentFragmentspecialinlinedviewModeldefault2(TelemetryConfigurationEvent.Source.Companion companion, final String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(companion, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return TelemetryConfigurationEvent.Source.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        } catch (NoSuchElementException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.telemetry.internal.TelemetryEventExtKt$tryFromSource$4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        }
    }
}
