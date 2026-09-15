package com.google.firebase.sessions;

import defpackage.getExtraEncoderProfiles;
import defpackage.isSamsungJ6;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@getExtraEncoderProfiles
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "Lcom/google/firebase/sessions/TimeProvider;", "p0", "Lcom/google/firebase/sessions/UuidGenerator;", "p1", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/sessions/UuidGenerator;)V", "Lcom/google/firebase/sessions/SessionDetails;", "generateNewSession", "(Lcom/google/firebase/sessions/SessionDetails;)Lcom/google/firebase/sessions/SessionDetails;", "", "generateSessionId", "()Ljava/lang/String;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "uuidGenerator", "Lcom/google/firebase/sessions/UuidGenerator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionGenerator {
    private final TimeProvider timeProvider;
    private final UuidGenerator uuidGenerator;

    @isSamsungJ6
    public SessionGenerator(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "");
        Intrinsics.checkNotNullParameter(uuidGenerator, "");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
    }

    public final SessionDetails generateNewSession(SessionDetails p0) {
        String firstSessionId;
        String strGenerateSessionId = generateSessionId();
        return new SessionDetails(strGenerateSessionId, (p0 == null || (firstSessionId = p0.getFirstSessionId()) == null) ? strGenerateSessionId : firstSessionId, p0 != null ? p0.getSessionIndex() + 1 : 0, this.timeProvider.currentTime().getUs());
    }

    private final String generateSessionId() {
        String string = this.uuidGenerator.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String lowerCase = StringsKt.replace$default(string, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }
}
