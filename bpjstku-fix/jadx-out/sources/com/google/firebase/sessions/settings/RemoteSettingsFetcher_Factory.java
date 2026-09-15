package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.Factory;
import defpackage.ExtraSupportedResolutionQuirk;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {
    private final ExtraSupportedResolutionQuirk<ApplicationInfo> appInfoProvider;
    private final ExtraSupportedResolutionQuirk<CoroutineContext> blockingDispatcherProvider;

    public RemoteSettingsFetcher_Factory(ExtraSupportedResolutionQuirk<ApplicationInfo> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk2) {
        this.appInfoProvider = extraSupportedResolutionQuirk;
        this.blockingDispatcherProvider = extraSupportedResolutionQuirk2;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final RemoteSettingsFetcher get() {
        return newInstance(this.appInfoProvider.get(), this.blockingDispatcherProvider.get());
    }

    public static RemoteSettingsFetcher_Factory create(ExtraSupportedResolutionQuirk<ApplicationInfo> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CoroutineContext> extraSupportedResolutionQuirk2) {
        return new RemoteSettingsFetcher_Factory(extraSupportedResolutionQuirk, extraSupportedResolutionQuirk2);
    }

    public static RemoteSettingsFetcher newInstance(ApplicationInfo applicationInfo, CoroutineContext coroutineContext) {
        return new RemoteSettingsFetcher(applicationInfo, coroutineContext);
    }
}
