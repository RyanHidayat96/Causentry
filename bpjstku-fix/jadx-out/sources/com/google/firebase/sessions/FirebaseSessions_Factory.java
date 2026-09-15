package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {
    private final ExtraSupportedResolutionQuirk<CoroutineContext> backgroundDispatcherProvider;
    private final ExtraSupportedResolutionQuirk<FirebaseApp> firebaseAppProvider;
    private final ExtraSupportedResolutionQuirk<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
    private final ExtraSupportedResolutionQuirk<SessionsSettings> settingsProvider;

    public FirebaseSessions_Factory(ExtraSupportedResolutionQuirk<FirebaseApp> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<SessionsSettings> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<SessionsActivityLifecycleCallbacks> extraSupportedResolutionQuirk4) {
        this.firebaseAppProvider = extraSupportedResolutionQuirk;
        this.settingsProvider = extraSupportedResolutionQuirk2;
        this.backgroundDispatcherProvider = extraSupportedResolutionQuirk3;
        this.sessionsActivityLifecycleCallbacksProvider = extraSupportedResolutionQuirk4;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final FirebaseSessions get() {
        return newInstance(this.firebaseAppProvider.get(), this.settingsProvider.get(), this.backgroundDispatcherProvider.get(), this.sessionsActivityLifecycleCallbacksProvider.get());
    }

    public static FirebaseSessions_Factory create(ExtraSupportedResolutionQuirk<FirebaseApp> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<SessionsSettings> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<SessionsActivityLifecycleCallbacks> extraSupportedResolutionQuirk4) {
        return new FirebaseSessions_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, extraSupportedResolutionQuirk3, extraSupportedResolutionQuirk4);
    }

    public static FirebaseSessions newInstance(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, CoroutineContext coroutineContext, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        return new FirebaseSessions(firebaseApp, sessionsSettings, coroutineContext, sessionsActivityLifecycleCallbacks);
    }
}
