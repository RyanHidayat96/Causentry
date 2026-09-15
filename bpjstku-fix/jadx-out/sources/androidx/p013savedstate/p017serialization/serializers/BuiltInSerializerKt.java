package androidx.p013savedstate.p017serialization.serializers;

import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "p0", "LstartListeningToRotationEvents;", "p1", "encoderErrorMessage", "(Ljava/lang/String;LstartListeningToRotationEvents;)Ljava/lang/String;", "LstopListeningToRotationEvents;", "decoderErrorMessage", "(Ljava/lang/String;LstopListeningToRotationEvents;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BuiltInSerializerKt {
    public static final String encoderErrorMessage(String str, startListeningToRotationEvents startlisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        StringBuilder sb = new StringBuilder("Cannot serialize ");
        sb.append(str);
        sb.append(" with '");
        sb.append(Reflection.getOrCreateKotlinClass(startlisteningtorotationevents.getClass()).getSimpleName());
        sb.append("'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.");
        return sb.toString();
    }

    public static final String decoderErrorMessage(String str, stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        StringBuilder sb = new StringBuilder("Cannot deserialize ");
        sb.append(str);
        sb.append(" with '");
        sb.append(Reflection.getOrCreateKotlinClass(stoplisteningtorotationevents.getClass()).getSimpleName());
        sb.append("'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.");
        return sb.toString();
    }
}
