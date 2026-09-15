package com.google.firebase.sessions;

import androidx.content.core.DataStore;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {
    private final ExtraSupportedResolutionQuirk<CoroutineContext> backgroundDispatcherProvider;
    private final ExtraSupportedResolutionQuirk<ProcessDataManager> processDataManagerProvider;
    private final ExtraSupportedResolutionQuirk<DataStore<SessionData>> sessionDataStoreProvider;
    private final ExtraSupportedResolutionQuirk<SessionFirelogPublisher> sessionFirelogPublisherProvider;
    private final ExtraSupportedResolutionQuirk<SessionGenerator> sessionGeneratorProvider;
    private final ExtraSupportedResolutionQuirk<SessionsSettings> sessionsSettingsProvider;
    private final ExtraSupportedResolutionQuirk<TimeProvider> timeProvider;

    public SharedSessionRepositoryImpl_Factory(ExtraSupportedResolutionQuirk<SessionsSettings> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<SessionGenerator> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SessionFirelogPublisher> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<DataStore<SessionData>> extraSupportedResolutionQuirk5, ExtraSupportedResolutionQuirk<ProcessDataManager> extraSupportedResolutionQuirk6, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk7) {
        this.sessionsSettingsProvider = extraSupportedResolutionQuirk;
        this.sessionGeneratorProvider = extraSupportedResolutionQuirk2;
        this.sessionFirelogPublisherProvider = extraSupportedResolutionQuirk3;
        this.timeProvider = extraSupportedResolutionQuirk4;
        this.sessionDataStoreProvider = extraSupportedResolutionQuirk5;
        this.processDataManagerProvider = extraSupportedResolutionQuirk6;
        this.backgroundDispatcherProvider = extraSupportedResolutionQuirk7;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SharedSessionRepositoryImpl get() {
        return newInstance(this.sessionsSettingsProvider.get(), this.sessionGeneratorProvider.get(), this.sessionFirelogPublisherProvider.get(), this.timeProvider.get(), this.sessionDataStoreProvider.get(), this.processDataManagerProvider.get(), this.backgroundDispatcherProvider.get());
    }

    public static SharedSessionRepositoryImpl_Factory create(ExtraSupportedResolutionQuirk<SessionsSettings> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<SessionGenerator> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SessionFirelogPublisher> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<DataStore<SessionData>> extraSupportedResolutionQuirk5, ExtraSupportedResolutionQuirk<ProcessDataManager> extraSupportedResolutionQuirk6, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk7) {
        return new SharedSessionRepositoryImpl_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, extraSupportedResolutionQuirk3, extraSupportedResolutionQuirk4, extraSupportedResolutionQuirk5, extraSupportedResolutionQuirk6, extraSupportedResolutionQuirk7);
    }

    public static SharedSessionRepositoryImpl newInstance(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, DataStore<SessionData> dataStore, ProcessDataManager processDataManager, CoroutineContext coroutineContext) {
        return new SharedSessionRepositoryImpl(sessionsSettings, sessionGenerator, sessionFirelogPublisher, timeProvider, dataStore, processDataManager, coroutineContext);
    }
}
