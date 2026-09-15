package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {
    private final ExtraSupportedResolutionQuirk<TimeProvider> timeProvider;
    private final ExtraSupportedResolutionQuirk<UuidGenerator> uuidGeneratorProvider;

    public SessionGenerator_Factory(ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<UuidGenerator> extraSupportedResolutionQuirk2) {
        this.timeProvider = extraSupportedResolutionQuirk;
        this.uuidGeneratorProvider = extraSupportedResolutionQuirk2;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SessionGenerator get() {
        return newInstance(this.timeProvider.get(), this.uuidGeneratorProvider.get());
    }

    public static SessionGenerator_Factory create(ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<UuidGenerator> extraSupportedResolutionQuirk2) {
        return new SessionGenerator_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2);
    }

    public static SessionGenerator newInstance(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        return new SessionGenerator(timeProvider, uuidGenerator);
    }
}
