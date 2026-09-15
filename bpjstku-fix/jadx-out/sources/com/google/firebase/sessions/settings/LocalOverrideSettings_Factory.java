package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class LocalOverrideSettings_Factory implements Factory<LocalOverrideSettings> {
    private final ExtraSupportedResolutionQuirk<Context> appContextProvider;

    public LocalOverrideSettings_Factory(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk) {
        this.appContextProvider = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final LocalOverrideSettings get() {
        return newInstance(this.appContextProvider.get());
    }

    public static LocalOverrideSettings_Factory create(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk) {
        return new LocalOverrideSettings_Factory(extraSupportedResolutionQuirk);
    }

    public static LocalOverrideSettings newInstance(Context context) {
        return new LocalOverrideSettings(context);
    }
}
