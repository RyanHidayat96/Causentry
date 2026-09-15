package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {
    private final ExtraSupportedResolutionQuirk<SettingsProvider> localOverrideSettingsProvider;
    private final ExtraSupportedResolutionQuirk<SettingsProvider> remoteSettingsProvider;

    public SessionsSettings_Factory(ExtraSupportedResolutionQuirk<SettingsProvider> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<SettingsProvider> extraSupportedResolutionQuirk2) {
        this.localOverrideSettingsProvider = extraSupportedResolutionQuirk;
        this.remoteSettingsProvider = extraSupportedResolutionQuirk2;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final SessionsSettings get() {
        return newInstance(this.localOverrideSettingsProvider.get(), this.remoteSettingsProvider.get());
    }

    public static SessionsSettings_Factory create(ExtraSupportedResolutionQuirk<SettingsProvider> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<SettingsProvider> extraSupportedResolutionQuirk2) {
        return new SessionsSettings_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2);
    }

    public static SessionsSettings newInstance(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        return new SessionsSettings(settingsProvider, settingsProvider2);
    }
}
