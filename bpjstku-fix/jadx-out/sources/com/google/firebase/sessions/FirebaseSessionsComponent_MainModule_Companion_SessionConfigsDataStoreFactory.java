package com.google.firebase.sessions;

import android.content.Context;
import androidx.content.core.DataStore;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.settings.SessionConfigs;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<DataStore<SessionConfigs>> {
    private final ExtraSupportedResolutionQuirk<Context> appContextProvider;
    private final ExtraSupportedResolutionQuirk<CoroutineContext> blockingDispatcherProvider;

    public FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk2) {
        this.appContextProvider = extraSupportedResolutionQuirk;
        this.blockingDispatcherProvider = extraSupportedResolutionQuirk2;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final DataStore<SessionConfigs> get() {
        return sessionConfigsDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get());
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory create(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk2) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2);
    }

    public static DataStore<SessionConfigs> sessionConfigsDataStore(Context context, CoroutineContext coroutineContext) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionConfigsDataStore(context, coroutineContext));
    }
}
