package com.google.firebase.sessions;

import com.google.android.datatransport.Priority;
import com.google.firebase.inject.Provider;
import defpackage.ProcessingNodeExternalSyntheticLambda0;
import defpackage.ProcessingNodeExternalSyntheticLambda7;
import defpackage.ProcessingRequest;
import defpackage.getCaptureFuture;
import defpackage.getExtraEncoderProfiles;
import defpackage.isSamsungJ6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
@getExtraEncoderProfiles
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/inject/Provider;", "LgetCaptureFuture;", "p0", "<init>", "(Lcom/google/firebase/inject/Provider;)V", "Lcom/google/firebase/sessions/SessionEvent;", "", "log", "(Lcom/google/firebase/sessions/SessionEvent;)V", "", "encode", "(Lcom/google/firebase/sessions/SessionEvent;)[B", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventGDTLogger implements EventGDTLoggerInterface {
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    private final Provider<getCaptureFuture> transportFactoryProvider;

    @isSamsungJ6
    public EventGDTLogger(Provider<getCaptureFuture> provider) {
        Intrinsics.checkNotNullParameter(provider, "");
        this.transportFactoryProvider = provider;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public final void log(SessionEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.transportFactoryProvider.get().b(AQS_LOG_SOURCE, SessionEvent.class, new ProcessingNodeExternalSyntheticLambda7("json"), new ProcessingRequest() { // from class: com.google.firebase.sessions.EventGDTLogger$$ExternalSyntheticLambda0
            @Override // defpackage.ProcessingRequest
            public final Object apply(Object obj) {
                return this.f$0.encode((SessionEvent) obj);
            }
        }).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProcessingNodeExternalSyntheticLambda0(p0, Priority.DEFAULT, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(SessionEvent p0) {
        String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(p0);
        Intrinsics.checkNotNullExpressionValue(strEncode, "");
        p0.getEventType().name();
        byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }
}
