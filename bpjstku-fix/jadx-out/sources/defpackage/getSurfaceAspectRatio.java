package defpackage;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonParseException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LgetSurfaceAspectRatio;", "LisReversedVertical;", "", "LgetSize;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "([B)LgetSize;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/InternalLogger;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getSurfaceAspectRatio implements isReversedVertical<byte[], getSize> {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    public getSurfaceAspectRatio(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.isReversedVertical
    public getSize TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.length == 0) {
            return null;
        }
        try {
            getSize.Companion companion = getSize.INSTANCE;
            return getSize.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new String(p0, Charsets.UTF_8), this.TuitionPaymentFragmentbindingInflater1);
        } catch (JsonParseException e2) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMetaDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to deserialize RUM event meta";
                }
            }, e2, false, null);
            return null;
        }
    }
}
