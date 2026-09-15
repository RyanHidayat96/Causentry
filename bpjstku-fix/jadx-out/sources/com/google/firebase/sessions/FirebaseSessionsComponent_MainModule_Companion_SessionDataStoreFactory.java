package com.google.firebase.sessions;

import android.content.Context;
import androidx.content.core.DataStore;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<DataStore<SessionData>> {
    private final ExtraSupportedResolutionQuirk<Context> appContextProvider;
    private final ExtraSupportedResolutionQuirk<CoroutineContext> blockingDispatcherProvider;
    private final ExtraSupportedResolutionQuirk<SessionDataSerializer> sessionDataSerializerProvider;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SessionDataSerializer> extraSupportedResolutionQuirk3) {
        this.appContextProvider = extraSupportedResolutionQuirk;
        this.blockingDispatcherProvider = extraSupportedResolutionQuirk2;
        this.sessionDataSerializerProvider = extraSupportedResolutionQuirk3;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final DataStore<SessionData> get() {
        return sessionDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get(), this.sessionDataSerializerProvider.get());
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory create(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SessionDataSerializer> extraSupportedResolutionQuirk3) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, extraSupportedResolutionQuirk3);
    }

    public static DataStore<SessionData> sessionDataStore(Context context, CoroutineContext coroutineContext, SessionDataSerializer sessionDataSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionDataStore(context, coroutineContext, sessionDataSerializer));
    }
}
