package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {
    private final ExtraSupportedResolutionQuirk<CoroutineContext> backgroundDispatcherProvider;
    private final ExtraSupportedResolutionQuirk<EventGDTLoggerInterface> eventGDTLoggerProvider;
    private final ExtraSupportedResolutionQuirk<FirebaseApp> firebaseAppProvider;
    private final ExtraSupportedResolutionQuirk<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final ExtraSupportedResolutionQuirk<SessionsSettings> sessionSettingsProvider;

    public SessionFirelogPublisherImpl_Factory(ExtraSupportedResolutionQuirk<FirebaseApp> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<FirebaseInstallationsApi> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SessionsSettings> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<EventGDTLoggerInterface> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk5) {
        this.firebaseAppProvider = extraSupportedResolutionQuirk;
        this.firebaseInstallationsProvider = extraSupportedResolutionQuirk2;
        this.sessionSettingsProvider = extraSupportedResolutionQuirk3;
        this.eventGDTLoggerProvider = extraSupportedResolutionQuirk4;
        this.backgroundDispatcherProvider = extraSupportedResolutionQuirk5;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SessionFirelogPublisherImpl get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseInstallationsProvider.get(), this.sessionSettingsProvider.get(), this.eventGDTLoggerProvider.get(), this.backgroundDispatcherProvider.get());
    }

    public static SessionFirelogPublisherImpl_Factory create(ExtraSupportedResolutionQuirk<FirebaseApp> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<FirebaseInstallationsApi> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SessionsSettings> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<EventGDTLoggerInterface> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk5) {
        return new SessionFirelogPublisherImpl_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, extraSupportedResolutionQuirk3, extraSupportedResolutionQuirk4, extraSupportedResolutionQuirk5);
    }

    public static SessionFirelogPublisherImpl newInstance(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        return new SessionFirelogPublisherImpl(firebaseApp, firebaseInstallationsApi, sessionsSettings, eventGDTLoggerInterface, coroutineContext);
    }
}
