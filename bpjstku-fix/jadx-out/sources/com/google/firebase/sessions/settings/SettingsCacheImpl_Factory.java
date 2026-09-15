package com.google.firebase.sessions.settings;

import androidx.content.core.DataStore;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {
    private final ExtraSupportedResolutionQuirk<CoroutineContext> backgroundDispatcherProvider;
    private final ExtraSupportedResolutionQuirk<DataStore<SessionConfigs>> sessionConfigsDataStoreProvider;
    private final ExtraSupportedResolutionQuirk<TimeProvider> timeProvider;

    public SettingsCacheImpl_Factory(ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<DataStore<SessionConfigs>> extraSupportedResolutionQuirk3) {
        this.backgroundDispatcherProvider = extraSupportedResolutionQuirk;
        this.timeProvider = extraSupportedResolutionQuirk2;
        this.sessionConfigsDataStoreProvider = extraSupportedResolutionQuirk3;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SettingsCacheImpl get() {
        return newInstance(this.backgroundDispatcherProvider.get(), this.timeProvider.get(), this.sessionConfigsDataStoreProvider.get());
    }

    public static SettingsCacheImpl_Factory create(ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<DataStore<SessionConfigs>> extraSupportedResolutionQuirk3) {
        return new SettingsCacheImpl_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, extraSupportedResolutionQuirk3);
    }

    public static SettingsCacheImpl newInstance(CoroutineContext coroutineContext, TimeProvider timeProvider, DataStore<SessionConfigs> dataStore) {
        return new SettingsCacheImpl(coroutineContext, timeProvider, dataStore);
    }
}
