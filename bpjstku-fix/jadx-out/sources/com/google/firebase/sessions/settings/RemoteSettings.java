package com.google.firebase.sessions.settings;

import android.os.Build;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import defpackage.VideoEncoderConfig;
import defpackage.getExtraEncoderProfiles;
import defpackage.isSamsungJ6;
import defpackage.toIllegalArgumentException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes6.dex */
@getExtraEncoderProfiles
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eH\u0081@¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u00010,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/TimeProvider;", "p0", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "p1", "Lcom/google/firebase/sessions/ApplicationInfo;", "p2", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "p3", "Lcom/google/firebase/sessions/settings/SettingsCache;", "p4", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Lcom/google/firebase/sessions/settings/SettingsCache;)V", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "configsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "LVideoEncoderConfig;", "fetchInProgress", "LVideoEncoderConfig;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    private static final int defaultCacheDuration;
    private static final Regex sanitizeRegex;
    private final ApplicationInfo appInfo;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final VideoEncoderConfig fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {165, 78, 95}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    @isSamsungJ6
    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, SettingsCache settingsCache) {
        Intrinsics.checkNotNullParameter(timeProvider, "");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "");
        Intrinsics.checkNotNullParameter(applicationInfo, "");
        Intrinsics.checkNotNullParameter(crashlyticsSettingsFetcher, "");
        Intrinsics.checkNotNullParameter(settingsCache, "");
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = toIllegalArgumentException.b(false);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public final Duration mo8006getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m9372boximpl(DurationKt.toDuration(numSessionRestartTimeout.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:21:0x004b, B:42:0x00a2, B:44:0x00ae, B:48:0x00b5, B:35:0x0084, B:37:0x008c, B:40:0x0092), top: B:61:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Object updateSettings(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        RemoteSettings remoteSettings;
        VideoEncoderConfig videoEncoderConfig;
        String fid;
        Map<String, String> mapMapOf;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        VideoEncoderConfig videoEncoderConfig2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCreate = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = anonymousClass1.label;
        try {
            if (r3 == 0) {
                ResultKt.throwOnFailure(objCreate);
                if (!this.fetchInProgress.isLocked() && !this.settingsCache.hasCacheExpired()) {
                    return Unit.INSTANCE;
                }
                VideoEncoderConfig videoEncoderConfig3 = this.fetchInProgress;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = videoEncoderConfig3;
                anonymousClass1.label = 1;
                if (videoEncoderConfig3.lock(null, anonymousClass1) != coroutine_suspended) {
                    remoteSettings = this;
                    videoEncoderConfig = videoEncoderConfig3;
                }
                return coroutine_suspended;
            }
            if (r3 != 1) {
                if (r3 != 2) {
                    if (r3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    videoEncoderConfig2 = (VideoEncoderConfig) anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(objCreate);
                        Unit unit = Unit.INSTANCE;
                        videoEncoderConfig2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        r3 = videoEncoderConfig2;
                        r3.unlock(null);
                        throw th;
                    }
                }
                videoEncoderConfig = (VideoEncoderConfig) anonymousClass1.L$1;
                remoteSettings = (RemoteSettings) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objCreate);
                fid = ((InstallationId) objCreate).getFid();
                if (Intrinsics.areEqual(fid, "")) {
                    Unit unit2 = Unit.INSTANCE;
                    videoEncoderConfig.unlock(null);
                    return unit2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Build.MANUFACTURER);
                sb.append(Build.MODEL);
                String str = Build.VERSION.INCREMENTAL;
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                mapMapOf = MapsKt.mapOf(TuplesKt.to("X-Crashlytics-Installation-ID", fid), TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.sanitize(sb.toString())), TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.sanitize(str)), TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.sanitize(str2)), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                anonymousClass1.L$0 = videoEncoderConfig;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) != coroutine_suspended) {
                    videoEncoderConfig2 = videoEncoderConfig;
                    Unit unit3 = Unit.INSTANCE;
                    videoEncoderConfig2.unlock(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            videoEncoderConfig = (VideoEncoderConfig) anonymousClass1.L$1;
            remoteSettings = (RemoteSettings) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objCreate);
            if (!remoteSettings.settingsCache.hasCacheExpired()) {
                Unit unit4 = Unit.INSTANCE;
                videoEncoderConfig.unlock(null);
                return unit4;
            }
            InstallationId.Companion companion = InstallationId.INSTANCE;
            FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.firebaseInstallationsApi;
            anonymousClass1.L$0 = remoteSettings;
            anonymousClass1.L$1 = videoEncoderConfig;
            anonymousClass1.label = 2;
            objCreate = companion.create(firebaseInstallationsApi, anonymousClass1);
            if (objCreate != coroutine_suspended) {
                fid = ((InstallationId) objCreate).getFid();
                if (Intrinsics.areEqual(fid, "")) {
                    Unit unit5 = Unit.INSTANCE;
                    videoEncoderConfig.unlock(null);
                    return unit5;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.MANUFACTURER);
                sb2.append(Build.MODEL);
                String str3 = Build.VERSION.INCREMENTAL;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                String str4 = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                mapMapOf = MapsKt.mapOf(TuplesKt.to("X-Crashlytics-Installation-ID", fid), TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.sanitize(sb2.toString())), TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.sanitize(str3)), TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.sanitize(str4)), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                anonymousClass1.L$0 = videoEncoderConfig;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) != coroutine_suspended) {
                    videoEncoderConfig2 = videoEncoderConfig;
                    Unit unit6 = Unit.INSTANCE;
                    videoEncoderConfig2.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired();
    }

    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(Continuation<? super Unit> continuation) {
        Object objUpdateConfigs = this.settingsCache.updateConfigs(SessionConfigsSerializer.INSTANCE.getDefaultValue(), continuation);
        return objUpdateConfigs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigs : Unit.INSTANCE;
    }

    private final String sanitize(String p0) {
        return sanitizeRegex.replace(p0, "");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "<init>", "()V", "", "defaultCacheDuration", "I", "getDefaultCacheDuration", "()I", "Lkotlin/text/Regex;", "sanitizeRegex", "Lkotlin/text/Regex;", "getSanitizeRegex", "()Lkotlin/text/Regex;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public final int getDefaultCacheDuration() {
            return RemoteSettings.defaultCacheDuration;
        }

        public final Regex getSanitizeRegex() {
            return RemoteSettings.sanitizeRegex;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        defaultCacheDuration = (int) Duration.m9388getInWholeSecondsimpl(DurationKt.toDuration(24, DurationUnit.HOURS));
        sanitizeRegex = new Regex("/");
    }
}
