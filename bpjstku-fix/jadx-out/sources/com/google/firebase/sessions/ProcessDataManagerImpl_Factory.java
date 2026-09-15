package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {
    private final ExtraSupportedResolutionQuirk<Context> appContextProvider;
    private final ExtraSupportedResolutionQuirk<UuidGenerator> uuidGeneratorProvider;

    public ProcessDataManagerImpl_Factory(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<UuidGenerator> extraSupportedResolutionQuirk2) {
        this.appContextProvider = extraSupportedResolutionQuirk;
        this.uuidGeneratorProvider = extraSupportedResolutionQuirk2;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final ProcessDataManagerImpl get() {
        return newInstance(this.appContextProvider.get(), this.uuidGeneratorProvider.get());
    }

    public static ProcessDataManagerImpl_Factory create(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<UuidGenerator> extraSupportedResolutionQuirk2) {
        return new ProcessDataManagerImpl_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2);
    }

    public static ProcessDataManagerImpl newInstance(Context context, UuidGenerator uuidGenerator) {
        return new ProcessDataManagerImpl(context, uuidGenerator);
    }
}
