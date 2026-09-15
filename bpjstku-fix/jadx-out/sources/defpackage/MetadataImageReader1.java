package defpackage;

import androidx.core.app.NotificationCompat;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LMetadataImageReader1;", "LisReversedVertical;", "Lcom/google/gson/JsonObject;", "", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentbindingInflater1", "(Lcom/google/gson/JsonObject;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class MetadataImageReader1 implements isReversedVertical<JsonObject, Object> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public MetadataImageReader1(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.isReversedVertical
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(final JsonObject p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            JsonPrimitive asJsonPrimitive = p0.getAsJsonPrimitive("type");
            String asString = asJsonPrimitive != null ? asJsonPrimitive.getAsString() : null;
            if (asString != null) {
                switch (asString.hashCode()) {
                    case -1422950858:
                        if (asString.equals("action")) {
                            ActionEvent.Companion companion = ActionEvent.INSTANCE;
                            return ActionEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
                        }
                        break;
                    case -341064690:
                        if (asString.equals("resource")) {
                            ResourceEvent.Companion companion2 = ResourceEvent.INSTANCE;
                            return ResourceEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                        }
                        break;
                    case 3619493:
                        if (asString.equals("view")) {
                            ViewEvent.Companion companion3 = ViewEvent.INSTANCE;
                            return ViewEvent.Companion.b(p0);
                        }
                        break;
                    case 96784904:
                        if (asString.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            ErrorEvent.Companion companion4 = ErrorEvent.INSTANCE;
                            return ErrorEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                        }
                        break;
                    case 128111976:
                        if (asString.equals("long_task")) {
                            LongTaskEvent.Companion companion5 = LongTaskEvent.INSTANCE;
                            return LongTaskEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
                        }
                        break;
                    case 780346297:
                        if (asString.equals("telemetry")) {
                            String asString2 = p0.getAsJsonObject("telemetry").getAsJsonPrimitive(NotificationCompat.CATEGORY_STATUS).getAsString();
                            if (Intrinsics.areEqual(asString2, "debug")) {
                                TelemetryDebugEvent.Companion companion6 = TelemetryDebugEvent.INSTANCE;
                                return TelemetryDebugEvent.Companion.TuitionPaymentFragmentbindingInflater1(p0);
                            }
                            if (!Intrinsics.areEqual(asString2, Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                                throw new JsonParseException("We could not deserialize the telemetry event with status: ".concat(String.valueOf(asString2)));
                            }
                            TelemetryErrorEvent.Companion companion7 = TelemetryErrorEvent.INSTANCE;
                            return TelemetryErrorEvent.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
                        }
                        break;
                }
            }
            throw new JsonParseException("We could not deserialize the event with type: ".concat(String.valueOf(asString)));
        } catch (JsonParseException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{p0}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, e2, false, null);
            return null;
        } catch (IllegalStateException e3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{p0}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, e3, false, null);
            return null;
        }
    }
}
