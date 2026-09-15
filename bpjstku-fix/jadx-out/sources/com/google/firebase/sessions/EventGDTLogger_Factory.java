package com.google.firebase.sessions;

import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;
import defpackage.getCaptureFuture;

/* JADX INFO: loaded from: classes6.dex */
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {
    private final ExtraSupportedResolutionQuirk<Provider<getCaptureFuture>> transportFactoryProvider;

    public EventGDTLogger_Factory(ExtraSupportedResolutionQuirk<Provider<getCaptureFuture>> extraSupportedResolutionQuirk) {
        this.transportFactoryProvider = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final EventGDTLogger get() {
        return newInstance(this.transportFactoryProvider.get());
    }

    public static EventGDTLogger_Factory create(ExtraSupportedResolutionQuirk<Provider<getCaptureFuture>> extraSupportedResolutionQuirk) {
        return new EventGDTLogger_Factory(extraSupportedResolutionQuirk);
    }

    public static EventGDTLogger newInstance(Provider<getCaptureFuture> provider) {
        return new EventGDTLogger(provider);
    }
}
