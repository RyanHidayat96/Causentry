package com.google.firebase.sessions;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataMigration;
import androidx.content.core.DataStore;
import androidx.content.core.DataStoreFactory;
import androidx.content.core.MultiProcessDataStoreFactory;
import androidx.content.core.Serializer;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.Binds;
import com.google.firebase.sessions.dagger.BindsInstance;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import com.google.firebase.sessions.dagger.Provides;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SettingsCache;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsProvider;
import defpackage.getCaptureFuture;
import defpackage.getExtraEncoderProfiles;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes6.dex */
@Component(modules = {MainModule.class})
@getExtraEncoderProfiles
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "Lcom/google/firebase/sessions/FirebaseSessions;", "getFirebaseSessions", "()Lcom/google/firebase/sessions/FirebaseSessions;", "firebaseSessions", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getSessionFirelogPublisher", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionGenerator;", "getSessionGenerator", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getSessionsSettings", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/firebase/sessions/SharedSessionRepository;", "getSharedSessionRepository", "()Lcom/google/firebase/sessions/SharedSessionRepository;", "sharedSessionRepository", "Builder", "MainModule"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FirebaseSessionsComponent {

    @Component.Builder
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "Landroid/content/Context;", "p0", "appContext", "(Landroid/content/Context;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "blockingDispatcher", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/inject/Provider;", "LgetCaptureFuture;", "transportFactoryProvider", "(Lcom/google/firebase/inject/Provider;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "build", "()Lcom/google/firebase/sessions/FirebaseSessionsComponent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder appContext(Context p0);

        @BindsInstance
        Builder backgroundDispatcher(@Background CoroutineContext p0);

        @BindsInstance
        Builder blockingDispatcher(@Blocking CoroutineContext p0);

        FirebaseSessionsComponent build();

        @BindsInstance
        Builder firebaseApp(FirebaseApp p0);

        @BindsInstance
        Builder firebaseInstallationsApi(FirebaseInstallationsApi p0);

        @BindsInstance
        Builder transportFactoryProvider(Provider<getCaptureFuture> p0);
    }

    FirebaseSessions getFirebaseSessions();

    SessionFirelogPublisher getSessionFirelogPublisher();

    SessionGenerator getSessionGenerator();

    SessionsSettings getSessionsSettings();

    SharedSessionRepository getSharedSessionRepository();

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "Lcom/google/firebase/sessions/EventGDTLogger;", "p0", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "eventGDTLoggerInterface", "(Lcom/google/firebase/sessions/EventGDTLogger;)Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionFirelogPublisher", "(Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;)Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "crashlyticsSettingsFetcher", "(Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;)Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "localOverrideSettings", "(Lcom/google/firebase/sessions/settings/LocalOverrideSettings;)Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/settings/RemoteSettings;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/RemoteSettings;)Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "(Lcom/google/firebase/sessions/settings/SettingsCacheImpl;)Lcom/google/firebase/sessions/settings/SettingsCache;", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "sharedSessionRepository", "(Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;)Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "processDataManager", "(Lcom/google/firebase/sessions/ProcessDataManagerImpl;)Lcom/google/firebase/sessions/ProcessDataManager;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Module
    public interface MainModule {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Binds
        @getExtraEncoderProfiles
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher(RemoteSettingsFetcher p0);

        @Binds
        @getExtraEncoderProfiles
        EventGDTLoggerInterface eventGDTLoggerInterface(EventGDTLogger p0);

        @Binds
        @getExtraEncoderProfiles
        @LocalOverrideSettingsProvider
        SettingsProvider localOverrideSettings(LocalOverrideSettings p0);

        @Binds
        @getExtraEncoderProfiles
        ProcessDataManager processDataManager(ProcessDataManagerImpl p0);

        @RemoteSettingsProvider
        @Binds
        @getExtraEncoderProfiles
        SettingsProvider remoteSettings(RemoteSettings p0);

        @Binds
        @getExtraEncoderProfiles
        SessionFirelogPublisher sessionFirelogPublisher(SessionFirelogPublisherImpl p0);

        @Binds
        @getExtraEncoderProfiles
        SettingsCache settingsCache(SettingsCacheImpl p0);

        @Binds
        @getExtraEncoderProfiles
        SharedSessionRepository sharedSessionRepository(SharedSessionRepositoryImpl p0);

        @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJc\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "<init>", "()V", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "()Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "()Lcom/google/firebase/sessions/UuidGenerator;", "Lcom/google/firebase/FirebaseApp;", "p0", "Lcom/google/firebase/sessions/ApplicationInfo;", "applicationInfo", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/ApplicationInfo;", "Landroid/content/Context;", "Lkotlin/coroutines/CoroutineContext;", "p1", "Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Landroidx/datastore/core/DataStore;", "Lcom/google/firebase/sessions/SessionDataSerializer;", "p2", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionDataSerializer;)Landroidx/datastore/core/DataStore;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "", "Landroidx/datastore/core/DataMigration;", "Lkotlinx/coroutines/CoroutineScope;", "p3", "Lkotlin/Function0;", "Ljava/io/File;", "p4", "createDataStore", "(Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "", "loadDataStoreSharedCounter", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private static final byte[] $$d = {84, 10, 24, -102, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
            private static final int $$e = 11;
            private static final byte[] $$a = {14, 116, 92, -78, -36, 46, -43, 6, 56, -4, 26, -16, -46, 67, -6, 18, -2, -52, 41, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, -4, 26, -16, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, 20, -29, 40, -2, 11, -6, 9, -3, -4, 26, -16, -46, 67, -6, 18, -2, -52, 26, 46, -6, 23, 5, 3, 20, -44, 46, -6, 23, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, 8, -9, 8, -19, 34, -2, 21, -12, 22, 12, -68};
            private static final int $$b = 66;
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion.$$a
                    int r7 = r7 + 4
                    int r8 = 108 - r8
                    int r6 = r6 + 6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L11
                    r4 = r8
                    r3 = r2
                    r8 = r7
                    goto L28
                L11:
                    r3 = r2
                L12:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L23:
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L28:
                    int r7 = r7 + r4
                    int r7 = r7 + (-5)
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion.a(short, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 3
                    int r0 = 53 - r6
                    int r8 = r8 * 3
                    int r8 = 84 - r8
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion.$$d
                    byte[] r0 = new byte[r0]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r6
                    r4 = r2
                    goto L2f
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r7 = r7 + 1
                    int r4 = r3 + 1
                    if (r3 != r6) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2a:
                    r3 = r1[r7]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L2f:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-10)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessionsComponent.MainModule.Companion.b(byte, byte, byte, java.lang.Object[]):void");
            }

            private Companion() {
            }

            @getExtraEncoderProfiles
            @Provides
            public final TimeProvider timeProvider() {
                return TimeProviderImpl.INSTANCE;
            }

            @getExtraEncoderProfiles
            @Provides
            public final UuidGenerator uuidGenerator() {
                return UuidGeneratorImpl.INSTANCE;
            }

            @getExtraEncoderProfiles
            @Provides
            public final ApplicationInfo applicationInfo(FirebaseApp p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return SessionEvents.INSTANCE.getApplicationInfo(p0);
            }

            @getExtraEncoderProfiles
            @Provides
            public final DataStore<SessionConfigs> sessionConfigsDataStore(final Context p0, @Blocking CoroutineContext p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                return createDataStore$default(this, SessionConfigsSerializer.INSTANCE, new ReplaceFileCorruptionHandler(new Function1() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((CorruptionException) obj);
                    }
                }), null, CoroutineScopeKt.CoroutineScope(p1), new Function0() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$1(p0);
                    }
                }, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs sessionConfigsDataStore$lambda$0(CorruptionException corruptionException) {
                Intrinsics.checkNotNullParameter(corruptionException, "");
                return SessionConfigsSerializer.INSTANCE.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionConfigsDataStore$lambda$1(Context context) {
                return androidx.content.Context.dataStoreFile(context, "aqs/sessionConfigsDataStore.data");
            }

            @getExtraEncoderProfiles
            @Provides
            public final DataStore<SessionData> sessionDataStore(final Context p0, @Blocking CoroutineContext p1, final SessionDataSerializer p2) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                Intrinsics.checkNotNullParameter(p2, "");
                return createDataStore$default(this, p2, new ReplaceFileCorruptionHandler(new Function1() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$2(p2, (CorruptionException) obj);
                    }
                }), null, CoroutineScopeKt.CoroutineScope(p1), new Function0() { // from class: com.google.firebase.sessions.FirebaseSessionsComponent$MainModule$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3(p0);
                    }
                }, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData sessionDataStore$lambda$2(SessionDataSerializer sessionDataSerializer, CorruptionException corruptionException) {
                Intrinsics.checkNotNullParameter(corruptionException, "");
                return sessionDataSerializer.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionDataStore$lambda$3(Context context) {
                return androidx.content.Context.dataStoreFile(context, "aqs/sessionDataStore.data");
            }

            static /* synthetic */ DataStore createDataStore$default(Companion companion, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i, Object obj) {
                if ((i & 4) != 0) {
                    list = CollectionsKt.emptyList();
                }
                return companion.createDataStore(serializer, replaceFileCorruptionHandler, list, coroutineScope, function0);
            }

            private final <T> DataStore<T> createDataStore(Serializer<T> p0, ReplaceFileCorruptionHandler<T> p1, List<? extends DataMigration<T>> p2, CoroutineScope p3, Function0<? extends File> p4) {
                if (loadDataStoreSharedCounter()) {
                    return MultiProcessDataStoreFactory.INSTANCE.create(p0, p1, p2, p3, p4);
                }
                return DataStoreFactory.INSTANCE.create(p0, p1, p2, p3, p4);
            }

            /* JADX WARN: Type inference failed for: r1v37, types: [boolean, int] */
            private final boolean loadDataStoreSharedCounter() {
                Object[] objArr;
                byte b = (byte) 0;
                try {
                    try {
                        Object[] objArr2 = new Object[1];
                        a(b, (byte) (b - 1), $$a[21], objArr2);
                        String str = (String) objArr2[0];
                        ClassLoader classLoader = Companion.class.getClassLoader();
                        try {
                            Object[] objArr3 = {1257092341};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3413), 1559 - (ViewConfiguration.getPressedStateDuration() >> 16), 24 - View.resolveSize(0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr4 = {str, classLoader, false, 384689965, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr3), 384689965};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43041);
                                    int absoluteGravity = 3111 - Gravity.getAbsoluteGravity(0, 0);
                                    int gidForName = Process.getGidForName("") + 23;
                                    byte b2 = (byte) ($$d[7] - 1);
                                    byte b3 = b2;
                                    Object[] objArr5 = new Object[1];
                                    b(b2, b3, b3, objArr5);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, absoluteGravity, gidForName, -675216362, false, (String) objArr5[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), 518 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 75), Integer.TYPE});
                                }
                                Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4);
                                int i = ((int[]) objArr6[1])[0];
                                int i2 = ((int[]) objArr6[2])[0];
                                if (i2 == i) {
                                    int i3 = ((int[]) objArr6[0])[0];
                                    int i4 = ((int[]) objArr6[2])[0];
                                    int i5 = ((int[]) objArr6[1])[0];
                                    String[] strArr = (String[]) objArr6[3];
                                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int i6 = ~iMaxMemory;
                                    int i7 = i3 + 1657390690 + (((~(i6 | 995938515)) | (~((-709092944) | i6)) | 206348) * 464) + (((-708886596) | iMaxMemory) * (-464)) + (((~(iMaxMemory | 995938515)) | 206348) * 464);
                                    int i8 = (i7 << 13) ^ i7;
                                    int i9 = i8 ^ (i8 >>> 17);
                                    ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                                    objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr};
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr2 = (String[]) objArr6[3];
                                    if (strArr2 != null) {
                                        for (String str2 : strArr2) {
                                            arrayList.add(str2);
                                        }
                                    }
                                    Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                                    int i10 = ((int[]) objArr6[0])[0];
                                    int i11 = ((int[]) objArr6[2])[0];
                                    int i12 = ((int[]) objArr6[1])[0];
                                    String[] strArr3 = (String[]) objArr6[3];
                                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                    int i13 = i10 + (-1196613604) + (((~(startUptimeMillis | 1192229636)) | (-512801823)) * (-465)) + ((1192229636 | (~((-512801823) | startUptimeMillis))) * 930) + ((startUptimeMillis | (-412091419)) * 465);
                                    int i14 = (i13 << 13) ^ i13;
                                    int i15 = i14 ^ (i14 >>> 17);
                                    ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                                    objArr = new Object[]{new int[1], new int[]{i12}, new int[]{i11}, strArr3};
                                }
                                try {
                                    byte[] bArr = $$a;
                                    Object[] objArr7 = new Object[1];
                                    a(bArr[21], (byte) (-bArr[9]), (byte) (-bArr[16]), objArr7);
                                    Class<?> cls = Class.forName((String) objArr7[0]);
                                    Object[] objArr8 = new Object[1];
                                    a((byte) (bArr[0] + 1), bArr[61], (byte) (-bArr[16]), objArr8);
                                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                                    Object[] objArr9 = new Object[1];
                                    a(bArr[58], bArr[19], (byte) (-bArr[16]), objArr9);
                                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                                    byte b4 = (byte) (-bArr[9]);
                                    Object[] objArr10 = new Object[1];
                                    a(b4, (byte) (b4 | 51), bArr[38], objArr10);
                                    Object objInvoke = cls.getMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0]);
                                    byte b5 = bArr[23];
                                    int i16 = $$b;
                                    Object[] objArr11 = new Object[1];
                                    a(b5, (byte) (i16 - 2), (byte) (-bArr[16]), objArr11);
                                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                                    Object[] objArr12 = new Object[1];
                                    a(bArr[42], (byte) (-bArr[3]), bArr[38], objArr12);
                                    Object objInvoke2 = cls4.getMethod((String) objArr12[0], new Class[0]).invoke(Companion.class, new Object[0]);
                                    if (Build.VERSION.SDK_INT <= 24) {
                                        Object[] objArr13 = new Object[1];
                                        a(bArr[38], (byte) (i16 | 25), b, objArr13);
                                        Method declaredMethod = cls.getDeclaredMethod((String) objArr13[0], cls3, cls2);
                                        declaredMethod.setAccessible(true);
                                        declaredMethod.invoke(objInvoke, str, objInvoke2);
                                    } else {
                                        Object[] objArr14 = new Object[1];
                                        a(bArr[7], (byte) 101, b, objArr14);
                                        Method declaredMethod2 = cls.getDeclaredMethod((String) objArr14[0], cls2, cls3);
                                        declaredMethod2.setAccessible(true);
                                        declaredMethod2.invoke(objInvoke, objInvoke2, str);
                                    }
                                    int i17 = ((int[]) objArr[0])[0];
                                    int i18 = i17 * i17;
                                    int i19 = -(1894158965 * i17);
                                    int i20 = (i18 & i19) + (i18 | i19);
                                    int i21 = -(i17 * 1943270521);
                                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                                    int i23 = ((i22 | 306020689) << 1) - (306020689 ^ i22);
                                    int i24 = i23 >> 27;
                                    int i25 = ((i24 & (-63)) + (i24 | (-63))) / 32;
                                    int i26 = (i23 - (~((i25 & 1) + (i25 | 1)))) - 1;
                                    int i27 = i23 >> 16;
                                    int i28 = (((-131071) ^ i27) + ((i27 & (-131071)) << 1)) / 65536;
                                    int i29 = -(i26 ^ (((i28 | 1) << 1) - (i28 ^ 1)));
                                    int i30 = (i29 ^ 6) + ((i29 & 6) << 1);
                                    int i31 = i30 >> 19;
                                    int i32 = ((i31 & (-16383)) + (i31 | (-16383))) / 8192;
                                    return 1866 / (((-(((i32 & 1) + (i32 | 1)) + 1)) & i30) * 311);
                                } catch (InvocationTargetException e2) {
                                    Throwable cause = e2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw e2;
                                }
                            } catch (Throwable th) {
                                Throwable cause2 = th.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            Throwable cause3 = th2.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th2;
                        }
                    } catch (SecurityException | UnsatisfiedLinkError unused) {
                        return false;
                    }
                } catch (SecurityException | UnsatisfiedLinkError unused2) {
                    return false;
                }
            }
        }
    }
}
