package com.google.firebase.remoteconfig;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY;
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigRealtimeHandler configRealtimeHandler;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final ConfigGetParameterHandler getHandler;
    private final RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;
    private static final byte[] $$c = {38, 31, -70, -1};
    private static final int $$f = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -103, 14, -22, 21, 7, -54, Base64.padSymbol, 23, 3, 18, 10, 0, 19, -62, 75, 11, -4, 23, -5, 18, 15, -10, 28, -2, 15, 8, -55, 72, 1, 17, -2, 12, 22, 10, -2, 10, 16, -57, 60, 11, 9, 21, 15, 2, 15, -10, 11, 26, -2, 22, -12, 28, -2, 15, 8, -55, 73, 0, 27, -13, 11, 26, -2, 22, -12, 28, -2, 15, 8, -55, 41, 32, 27, -30, 33, 16, 8, 0, -6, 24, 22, 0, 6, 12, 3, 7, 28, -2, 15, 8, -19, 28, 23, -5, 24, -42, 43, 26, -2, 22, -4, 20, 14, -76, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -56};
    private static final int $$e = 219;
    private static final byte[] $$a = {109, 7, 114, -90, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 17;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 84 - r6
            int r7 = r7 * 15
            int r0 = r7 + 38
            byte[] r1 = com.google.firebase.remoteconfig.FirebaseRemoteConfig.$$a
            int r8 = r8 * 52
            int r8 = 108 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.FirebaseRemoteConfig.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfig.$$d
            int r8 = r8 + 4
            int r7 = r7 * 87
            int r7 = 140 - r7
            int r9 = r9 * 15
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r8 = r8 + r9
            int r8 = r8 + (-9)
            r9 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.FirebaseRemoteConfig.d(int, int, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (64838 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1356;
                    int iRed = 38 - Color.red(0);
                    byte b2 = $$c[3];
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollBarFadeDuration, iRed, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 47773), View.MeasureSpec.makeMeasureSpec(0, 0) + 468, 13 - ExpandableListView.getPackedPositionGroup(0L), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 97;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    public static FirebaseRemoteConfig getInstance() {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getInstance(FirebaseApp.getInstance());
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = getInstance(FirebaseApp.getInstance());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            return firebaseRemoteConfig;
        }
        throw null;
    }

    public static FirebaseRemoteConfig getInstance(FirebaseApp firebaseApp) {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
        int i3 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return firebaseRemoteConfig;
        }
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    static /* synthetic */ FirebaseRemoteConfigInfo lambda$ensureInitialized$0(Task task, Task task2) throws Exception {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfigInfo firebaseRemoteConfigInfo = (FirebaseRemoteConfigInfo) task.getResult();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        b = i4 % 128;
        int i5 = i4 % 2;
        return firebaseRemoteConfigInfo;
    }

    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        int i = 2 % 2;
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task taskCall = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.getInfo();
            }
        });
        Task taskContinueWith = Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2, task3, taskCall, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)}).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.lambda$ensureInitialized$0(taskCall, task4);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return taskContinueWith;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Task<Boolean> fetchAndActivate() {
        int i = 2 % 2;
        Task taskOnSuccessTask = fetch().onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.m7985xebd5994c((Void) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return taskOnSuccessTask;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: lambda$fetchAndActivate$1$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ Task m7985xebd5994c(Void r4) throws Exception {
        int i = 2 % 2;
        int i2 = b + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            activate();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Task<Boolean> taskActivate = activate();
        int i3 = b + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return taskActivate;
    }

    public Task<Boolean> activate() {
        int i = 2 % 2;
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        Task taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{task, task2}).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return this.f$0.m7984x98ca96b0(task, task2, task3);
            }
        });
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return taskContinueWithTask;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: lambda$activate$2$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ Task m7984x98ca96b0(Task task, Task task2, Task task3) throws Exception {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            task.isSuccessful();
            Boolean bool = Boolean.FALSE;
            throw null;
        }
        boolean zIsSuccessful = task.isSuccessful();
        Boolean bool2 = Boolean.FALSE;
        if (!zIsSuccessful || task.getResult() == null) {
            return Tasks.forResult(bool2);
        }
        ConfigContainer configContainer = (ConfigContainer) task.getResult();
        if (!(!task2.isSuccessful())) {
            int i3 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            if (!isFetchedFresh(configContainer, (ConfigContainer) task2.getResult())) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                b = i5 % 128;
                int i6 = i5 % 2;
                return Tasks.forResult(bool2);
            }
        }
        return this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new Continuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(FirebaseRemoteConfig.$r8$lambda$1OPe4FMLlfe5TevttUSGRiBjQ4o(this.f$0, task4));
            }
        });
    }

    public Task<Void> fetch() {
        int i = 2 % 2;
        Task taskOnSuccessTask = this.fetchHandler.fetch().onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
            }
        });
        int i2 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return taskOnSuccessTask;
    }

    static /* synthetic */ Task lambda$fetch$3(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        b = i2 % 128;
        int i3 = i2 % 2;
        Task taskForResult = Tasks.forResult(null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        b = i4 % 128;
        int i5 = i4 % 2;
        return taskForResult;
    }

    public Task<Void> fetch(long j) {
        int i = 2 % 2;
        Task taskOnSuccessTask = this.fetchHandler.fetch(j).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return taskOnSuccessTask;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Task lambda$fetch$4(ConfigFetchHandler.FetchResponse fetchResponse) throws Exception {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Task taskForResult = Tasks.forResult(null);
        int i4 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return taskForResult;
    }

    public String getString(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        b = i2 % 128;
        int i3 = i2 % 2;
        ConfigGetParameterHandler configGetParameterHandler = this.getHandler;
        if (i3 != 0) {
            return configGetParameterHandler.getString(str);
        }
        configGetParameterHandler.getString(str);
        throw null;
    }

    public boolean getBoolean(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        b = i2 % 128;
        int i3 = i2 % 2;
        ConfigGetParameterHandler configGetParameterHandler = this.getHandler;
        if (i3 != 0) {
            return configGetParameterHandler.getBoolean(str);
        }
        configGetParameterHandler.getBoolean(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public double getDouble(String str) {
        double d;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            d = this.getHandler.getDouble(str);
            int i3 = 23 / 0;
        } else {
            d = this.getHandler.getDouble(str);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getLong(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
        long j = this.getHandler.getLong(str);
        int i4 = b + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHandler.getValue(str);
            throw null;
        }
        FirebaseRemoteConfigValue value = this.getHandler.getValue(str);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        b = i3 % 128;
        int i4 = i3 % 2;
        return value;
    }

    public Set<String> getKeysByPrefix(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        b = i2 % 128;
        int i3 = i2 % 2;
        ConfigGetParameterHandler configGetParameterHandler = this.getHandler;
        if (i3 != 0) {
            return configGetParameterHandler.getKeysByPrefix(str);
        }
        configGetParameterHandler.getKeysByPrefix(str);
        throw null;
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        int i = 2 % 2;
        int i2 = b + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, FirebaseRemoteConfigValue> all = this.getHandler.getAll();
        int i4 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return all;
    }

    public FirebaseRemoteConfigInfo getInfo() {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        FirebaseRemoteConfigInfo info = this.frcSharedPrefs.getInfo();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return info;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Task<Void> setConfigSettingsAsync(final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        int i = 2 % 2;
        Task<Void> taskCall = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m7987xd6203cf5(firebaseRemoteConfigSettings);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        b = i2 % 128;
        int i3 = i2 % 2;
        return taskCall;
    }

    /* JADX INFO: renamed from: lambda$setConfigSettingsAsync$5$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ Void m7987xd6203cf5(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws Exception {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.frcSharedPrefs.setConfigSettings(firebaseRemoteConfigSettings);
            return null;
        }
        this.frcSharedPrefs.setConfigSettings(firebaseRemoteConfigSettings);
        throw null;
    }

    public Task<Void> setDefaultsAsync(Map<String, Object> map) {
        int i = 2 % 2;
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            int i2 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return setDefaultsWithStringsMapAsync(map2);
    }

    public Task<Void> setDefaultsAsync(int i) {
        int i2 = 2 % 2;
        int i3 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
        }
        setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
        throw null;
    }

    public Task<Void> reset() {
        int i = 2 % 2;
        Task<Void> taskCall = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m7986xf98246b6();
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return taskCall;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: lambda$reset$6$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ Void m7986xf98246b6() throws Exception {
        int i = 2 % 2;
        int i2 = b + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.activatedConfigsCache.clear();
            this.fetchedConfigsCache.clear();
            this.defaultConfigsCache.clear();
            this.frcSharedPrefs.clear();
            return null;
        }
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcSharedPrefs.clear();
        throw null;
    }

    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddRealtimeConfigUpdateListener = this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
        int i4 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return configUpdateListenerRegistrationAddRealtimeConfigUpdateListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void startLoadingConfigsFromDisk() {
        int i = 2 % 2;
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    public void schedule(Runnable runnable) {
        int i = 2 % 2;
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.executor.execute(runnable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private boolean processActivatePutTask(Task<ConfigContainer> task) {
        int i = 2 % 2;
        if (!task.isSuccessful()) {
            return false;
        }
        int i2 = b + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.fetchedConfigsCache.clear();
            task.getResult();
            throw null;
        }
        this.fetchedConfigsCache.clear();
        ConfigContainer result = task.getResult();
        if (result == null) {
            return true;
        }
        updateAbtWithActivatedExperiments(result.getAbtExperiments());
        this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(result);
        int i3 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        int i = 2 % 2;
        try {
            Task taskOnSuccessTask = this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(FirebaseExecutors.directExecutor(), new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
                }
            });
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            b = i2 % 128;
            int i3 = i2 % 2;
            return taskOnSuccessTask;
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    static /* synthetic */ Task lambda$setDefaultsWithStringsMapAsync$7(ConfigContainer configContainer) throws Exception {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Task taskForResult = Tasks.forResult(null);
        int i4 = b + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return taskForResult;
        }
        obj.hashCode();
        throw null;
    }

    public Task<Void> setCustomSignals(final CustomSignals customSignals) {
        int i = 2 % 2;
        Task<Void> taskCall = Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m7988x5520461b(customSignals);
            }
        });
        int i2 = b + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return taskCall;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01fd  */
    /* JADX INFO: renamed from: lambda$setCustomSignals$8$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ Void m7988x5520461b(CustomSignals customSignals) throws Exception {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2266;
            int iAlpha = Color.alpha(0) + 33;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[5], bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, i2, iAlpha, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{20197, 46328, 60075, 38773, 20100, 2390, 37199, 44615, 47498, 'Q', 38991, 42779, 41098, 8011, 33541, 45158, 43932, 5707, 35423, 35152, 37512, 11643, 48455, 33370, 40326, 9299}, ViewConfiguration.getTapTimeout() >> 16, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{20059, 35805, 44841, 26952, 20030, 13937, 54472, 20600, 47400, 16248, 56781, 22874, 41022, 8316, 50885, 20092, 43826, 10608, 53196}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int packedPositionType = 2267 - ExpandableListView.getPackedPositionType(0L);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 34;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, packedPositionType, packedPositionChild, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2268;
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 33;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i5, edgeSlop2, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = ((((-171892889) + ((iIdentityHashCode | 2786064) * 988)) + (((~(36605812 | i8)) | 738287755) * (-1976))) + ((((~(iIdentityHashCode | (-772107504))) | 2786064) | (~(772107503 | i8))) * 988)) - 1682405300;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{42428, 282, 60673, 9734, 42461, 48308, 38629, 7988, 21203, 46515, 40933, 5736, 19421, 43690, 34033, 360, 16637, 41913, 36341, 14383, 31178, 39091, 47861, 13119, 30440, 37298, 41971, 10787, 28637, 34494}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{26315, 33761, 48793, 44685, 26280, 15956, 50539, 38847, 37294, 14159, 52333, 40588, 35003, 10321, 55157, 35236, 33704, 8512, 56941, 45220, 47780, 6735}, Process.myTid() >> 22, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = b + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                    if (i12 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{46583, 57087, 31289, 3456, 46493, 25438, 463, 13473, 17113, 27219, 2264, 15790, 23440, 29969, 5098, 10937, 20612, 31819, 6876, 5037}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{4065, 48666, 822, 13097, 3976, 958, 30931, 2567, 63637, 2739, 29122, 784, 57769, 5563, 27333, 5121, 60066, 7349, 25554, 11532}, ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1682405300};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                d(bArr3[12], bArr3[130], bArr3[29], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d(bArr3[29], (short) ($$e & 942), bArr3[12], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 1);
                        int scrollBarFadeDuration = 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 33;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr16 = new Object[1];
                        a(b6, b7, b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, scrollBarFadeDuration, absoluteGravity, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{20197, 46328, 60075, 38773, 20100, 2390, 37199, 44615, 47498, 'Q', 38991, 42779, 41098, 8011, 33541, 45158, 43932, 5707, 35423, 35152, 37512, 11643, 48455, 33370, 40326, 9299}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{20059, 35805, 44841, 26952, 20030, 13937, 54472, 20600, 47400, 16248, 56781, 22874, 41022, 8316, 50885, 20092, 43826, 10608, 53196}, 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2268;
                            int defaultSize = 33 - View.getDefaultSize(0, 0);
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[7];
                            byte b9 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            a(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity2, iIndexOf, defaultSize, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
                            int iIndexOf2 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr5[7], bArr5[5], bArr5[40], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize2, jumpTapTimeout, iIndexOf2, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode2;
            int i19 = i15 + (-1716624630) + ((~((-346420612) | i18)) * 979) + ((iIdentityHashCode2 | 462292704) * (-979)) + (((~(iIdentityHashCode2 | (-346420612))) | (~(i18 | 462292704))) * 979);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr21[2])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i22 = b + 89;
                int i23 = i22 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23;
                int i24 = i22 % 2;
                int i25 = i23 + 93;
                b = i25 % 128;
                int i26 = i25 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iMyPid = Process.myPid();
            int i30 = ~iMyPid;
            int i31 = i27 + (-2011458249) + (((~(534769595 | i30)) | 273943720) * 220) + (((~(i30 | 274108088)) | 534605227) * (-440)) + ((iMyPid | 534769595) * 220);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr22[2])[0] = i33 ^ (i33 << 5);
            int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            b = i34 % 128;
            int i35 = i34 % 2;
        }
        this.frcSharedPrefs.setCustomSignals(customSignals.customSignals);
        return null;
    }

    void updateAbtWithActivatedExperiments(JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this.firebaseAbt != null) {
            try {
                this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
                int i4 = b + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            } catch (AbtException | JSONException unused) {
            }
        }
    }

    void setConfigUpdateBackgroundState(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.configRealtimeHandler.setBackgroundState(z);
        int i4 = b + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> itKeys = jSONObject.keys();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            b = i3 % 128;
            int i4 = i3 % 2;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
            i2++;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 113;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        b = i7 % 128;
        int i8 = i7 % 2;
        return arrayList;
    }

    RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 83;
        b = i3 % 128;
        int i4 = i3 % 2;
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = this.rolloutsStateSubscriptionsHandler;
        int i5 = i2 + 5;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return rolloutsStateSubscriptionsHandler;
        }
        throw null;
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, ConfigContainer configContainer2) {
        int i = 2 % 2;
        if (configContainer2 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            b = i2 % 128;
            int i3 = i2 % 2;
            if (configContainer.getFetchTime().equals(configContainer2.getFetchTime())) {
                int i4 = b + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$1OPe4FMLlfe5TevttUSGRiBjQ4o(FirebaseRemoteConfig firebaseRemoteConfig, Task task) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return firebaseRemoteConfig.processActivatePutTask(task);
        }
        firebaseRemoteConfig.processActivatePutTask(task);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4102820328726091686L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, int r6, byte r7) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r7 = 107 - r7
            byte[] r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfig.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.FirebaseRemoteConfig.$$g(short, int, byte):java.lang.String");
    }
}
