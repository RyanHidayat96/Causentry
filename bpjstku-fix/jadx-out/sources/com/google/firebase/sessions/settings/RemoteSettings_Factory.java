package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {
    private final ExtraSupportedResolutionQuirk<ApplicationInfo> appInfoProvider;
    private final ExtraSupportedResolutionQuirk<CrashlyticsSettingsFetcher> configsFetcherProvider;
    private final ExtraSupportedResolutionQuirk<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final ExtraSupportedResolutionQuirk<SettingsCache> settingsCacheProvider;
    private final ExtraSupportedResolutionQuirk<TimeProvider> timeProvider;

    public RemoteSettings_Factory(ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<FirebaseInstallationsApi> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<ApplicationInfo> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<CrashlyticsSettingsFetcher> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<SettingsCache> extraSupportedResolutionQuirk5) {
        this.timeProvider = extraSupportedResolutionQuirk;
        this.firebaseInstallationsApiProvider = extraSupportedResolutionQuirk2;
        this.appInfoProvider = extraSupportedResolutionQuirk3;
        this.configsFetcherProvider = extraSupportedResolutionQuirk4;
        this.settingsCacheProvider = extraSupportedResolutionQuirk5;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final RemoteSettings get() {
        return newInstance(this.timeProvider.get(), this.firebaseInstallationsApiProvider.get(), this.appInfoProvider.get(), this.configsFetcherProvider.get(), this.settingsCacheProvider.get());
    }

    public static RemoteSettings_Factory create(ExtraSupportedResolutionQuirk<TimeProvider> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<FirebaseInstallationsApi> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<ApplicationInfo> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<CrashlyticsSettingsFetcher> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<SettingsCache> extraSupportedResolutionQuirk5) {
        return new RemoteSettings_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2, extraSupportedResolutionQuirk3, extraSupportedResolutionQuirk4, extraSupportedResolutionQuirk5);
    }

    public static RemoteSettings newInstance(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, SettingsCache settingsCache) {
        return new RemoteSettings(timeProvider, firebaseInstallationsApi, applicationInfo, crashlyticsSettingsFetcher, settingsCache);
    }
}
