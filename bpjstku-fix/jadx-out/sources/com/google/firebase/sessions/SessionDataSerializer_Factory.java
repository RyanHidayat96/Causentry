package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {
    private final ExtraSupportedResolutionQuirk<SessionGenerator> sessionGeneratorProvider;

    public SessionDataSerializer_Factory(ExtraSupportedResolutionQuirk<SessionGenerator> extraSupportedResolutionQuirk) {
        this.sessionGeneratorProvider = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SessionDataSerializer get() {
        return newInstance(this.sessionGeneratorProvider.get());
    }

    public static SessionDataSerializer_Factory create(ExtraSupportedResolutionQuirk<SessionGenerator> extraSupportedResolutionQuirk) {
        return new SessionDataSerializer_Factory(extraSupportedResolutionQuirk);
    }

    public static SessionDataSerializer newInstance(SessionGenerator sessionGenerator) {
        return new SessionDataSerializer(sessionGenerator);
    }
}
