package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {
    private final ExtraSupportedResolutionQuirk<FirebaseApp> firebaseAppProvider;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(ExtraSupportedResolutionQuirk<FirebaseApp> extraSupportedResolutionQuirk) {
        this.firebaseAppProvider = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final ApplicationInfo get() {
        return applicationInfo(this.firebaseAppProvider.get());
    }

    public static FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory create(ExtraSupportedResolutionQuirk<FirebaseApp> extraSupportedResolutionQuirk) {
        return new FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(extraSupportedResolutionQuirk);
    }

    public static ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
        return (ApplicationInfo) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.applicationInfo(firebaseApp));
    }
}
