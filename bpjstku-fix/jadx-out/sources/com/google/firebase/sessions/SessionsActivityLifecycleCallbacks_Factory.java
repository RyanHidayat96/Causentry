package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionsActivityLifecycleCallbacks_Factory implements Factory<SessionsActivityLifecycleCallbacks> {
    private final ExtraSupportedResolutionQuirk<SharedSessionRepository> sharedSessionRepositoryProvider;

    public SessionsActivityLifecycleCallbacks_Factory(ExtraSupportedResolutionQuirk<SharedSessionRepository> extraSupportedResolutionQuirk) {
        this.sharedSessionRepositoryProvider = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SessionsActivityLifecycleCallbacks get() {
        return newInstance(this.sharedSessionRepositoryProvider.get());
    }

    public static SessionsActivityLifecycleCallbacks_Factory create(ExtraSupportedResolutionQuirk<SharedSessionRepository> extraSupportedResolutionQuirk) {
        return new SessionsActivityLifecycleCallbacks_Factory(extraSupportedResolutionQuirk);
    }

    public static SessionsActivityLifecycleCallbacks newInstance(SharedSessionRepository sharedSessionRepository) {
        return new SessionsActivityLifecycleCallbacks(sharedSessionRepository);
    }
}
