package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$$ExternalSyntheticLambda0;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.google.mlkit.common.MlKitException;
import defpackage.getCaptureFuture;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC;
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static int TuitionPaymentFragmentbindingInflater1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    static Provider<getCaptureFuture> transportFactory;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task<TopicsSubscriber> topicsSubscriberTask;
    private static final byte[] $$c = {31, 115, -100, -11};
    private static final int $$f = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 20, -37, 56, -7, 32, -8, 23, -21, 35, 7, 5, 11, -26, 55, 5, 14, -2, 29, -1, 16, 9, -31, 51, -3, 11, 20, 3, 9, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$a = {67, -127, -109, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 98;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 55 - r6
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = r8 * 52
            int r0 = 53 - r8
            byte[] r1 = com.google.firebase.messaging.FirebaseMessaging.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
        L30:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 24
            int r0 = 53 - r6
            byte[] r1 = com.google.firebase.messaging.FirebaseMessaging.$$d
            int r5 = r5 * 21
            int r5 = 105 - r5
            int r7 = r7 * 28
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
        L2b:
            int r5 = r5 + r4
            int r7 = r7 + 1
            int r5 = r5 + (-10)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.d(int, byte, short, java.lang.Object[]):void");
    }

    static /* synthetic */ FirebaseApp access$000(FirebaseMessaging firebaseMessaging) {
        int i = 2 % 2;
        int i2 = b + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        FirebaseApp firebaseApp = firebaseMessaging.firebaseApp;
        int i5 = i3 + 125;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return firebaseApp;
        }
        throw null;
    }

    static /* synthetic */ void access$100(FirebaseMessaging firebaseMessaging) {
        int i = 2 % 2;
        int i2 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        firebaseMessaging.startSyncIfNecessary();
        int i4 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8L);
        transportFactory = new Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda8
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseMessaging.lambda$static$0();
            }
        };
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public static FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    private static Store getStore(Context context) {
        Store store2;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new Store(context);
            }
            store2 = store;
        }
        return store2;
    }

    static void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    static FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<getCaptureFuture> provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<getCaptureFuture> provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0058  */
    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<getCaptureFuture> provider, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
            int i = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            int i2 = i % 2;
        } else {
            Objects.toString(applicationContext2);
            int i3 = b + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
            }
            if (firebaseInstanceIdInternal != null) {
                firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda3
                    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                    public final void onNewToken(String str) {
                        this.f$0.m7974lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(str);
                    }
                });
            }
            executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7975lambda$new$2$comgooglefirebasemessagingFirebaseMessaging();
                }
            });
            Task<TopicsSubscriber> taskCreateInstance = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
            this.topicsSubscriberTask = taskCreateInstance;
            taskCreateInstance.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda5
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.m7976lambda$new$3$comgooglefirebasemessagingFirebaseMessaging((TopicsSubscriber) obj);
                }
            });
            executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m7977lambda$new$4$comgooglefirebasemessagingFirebaseMessaging();
                }
            });
        }
        int i4 = 2 % 2;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda3
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(String str) {
                    this.f$0.m7974lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7975lambda$new$2$comgooglefirebasemessagingFirebaseMessaging();
            }
        });
        Task<TopicsSubscriber> taskCreateInstance2 = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = taskCreateInstance2;
        taskCreateInstance2.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m7976lambda$new$3$comgooglefirebasemessagingFirebaseMessaging((TopicsSubscriber) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m7977lambda$new$4$comgooglefirebasemessagingFirebaseMessaging();
            }
        });
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char c;
        char[] cArr;
        char c2;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i5 = 0;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (cArr3 != null) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 23;
                $10 = i13 % 128;
                if (i13 % i3 != 0) {
                    try {
                        Object[] objArr2 = new Object[i7];
                        objArr2[i5] = Integer.valueOf(cArr3[i12]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int iNormalizeMetaState = 1270 - KeyEvent.normalizeMetaState(i5);
                            int threadPriority = ((Process.getThreadPriority(i5) + 20) >> 6) + 18;
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                            Class[] clsArr = new Class[i7];
                            clsArr[0] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iNormalizeMetaState, threadPriority, 407021364, false, str$$g, clsArr);
                        }
                        cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i12 >>= 1;
                        i3 = 2;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = new Object[i7];
                    objArr3[0] = Integer.valueOf(cArr3[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), 1270 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 18, 407021364, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i12++;
                    i3 = 2;
                    i5 = 0;
                    i7 = 1;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i8];
        System.arraycopy(cArr3, i6, cArr4, 0, i8);
        if (bArr != null) {
            int i14 = $10 + 9;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr = new char[i8];
                setvideostabilizationmode.b = 0;
                c2 = 1;
            } else {
                cArr = new char[i8];
                setvideostabilizationmode.b = 0;
                c2 = 0;
            }
            while (setvideostabilizationmode.b < i8) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i15 = $11 + 59;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.normalizeMetaState(0), View.MeasureSpec.getSize(0) + 3225, TextUtils.getCapsMode("", 0, 0) + 13, 2133916302, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i18 = setvideostabilizationmode.b;
                    Object[] objArr5 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755, (ViewConfiguration.getEdgeSlop() >> 16) + 23, 387247676, false, $$g(b8, b9, (byte) (b9 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                }
                c2 = cArr[setvideostabilizationmode.b];
                Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 41241), 1704 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, -1434471773, false, $$g(b10, (byte) (b10 | 6), b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i19 = $10 + 83;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }
            cArr4 = cArr;
        }
        if (i10 > 0) {
            int i21 = $11 + 5;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                char[] cArr5 = new char[i8];
                i = 1;
                i2 = 0;
                System.arraycopy(cArr4, 1, cArr5, 0, i8);
                System.arraycopy(cArr5, 0, cArr4, i8 + i10, i10);
                System.arraycopy(cArr5, i10, cArr4, 1, i8 * i10);
            } else {
                i = 1;
                i2 = 0;
                char[] cArr6 = new char[i8];
                System.arraycopy(cArr4, 0, cArr6, 0, i8);
                int i22 = i8 - i10;
                System.arraycopy(cArr6, 0, cArr4, i22, i10);
                System.arraycopy(cArr6, i10, cArr4, 0, i22);
            }
        } else {
            i = 1;
            i2 = 0;
        }
        if (!z) {
            c = 2;
        } else {
            char[] cArr7 = new char[i8];
            setvideostabilizationmode.b = i2;
            while (setvideostabilizationmode.b < i8) {
                cArr7[setvideostabilizationmode.b] = cArr4[(i8 - setvideostabilizationmode.b) - i];
                setvideostabilizationmode.b += i;
                i = 1;
            }
            int i23 = $10 + 69;
            $11 = i23 % 128;
            c = 2;
            int i24 = i23 % 2;
            cArr4 = cArr7;
        }
        if (i9 > 0) {
            int i25 = 0;
            while (true) {
                setvideostabilizationmode.b = i25;
                if (setvideostabilizationmode.b >= i8) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[c]);
                i25 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: renamed from: lambda$new$1$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7974lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        b = i2 % 128;
        int i3 = i2 % 2;
        invokeOnTokenRefresh(str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    /* JADX INFO: renamed from: lambda$new$2$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7975lambda$new$2$comgooglefirebasemessagingFirebaseMessaging() {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            isAutoInitEnabled();
            throw null;
        }
        if (!isAutoInitEnabled()) {
            return;
        }
        startSyncIfNecessary();
        int i3 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX INFO: renamed from: lambda$new$3$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7976lambda$new$3$comgooglefirebasemessagingFirebaseMessaging(TopicsSubscriber topicsSubscriber) {
        int i = 2 % 2;
        int i2 = b + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
            if (isAutoInitEnabled()) {
                topicsSubscriber.startTopicsSyncIfNecessary();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (!(!isAutoInitEnabled())) {
            topicsSubscriber.startTopicsSyncIfNecessary();
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        b = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: renamed from: lambda$new$4$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7977lambda$new$4$comgooglefirebasemessagingFirebaseMessaging() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        initializeProxyNotifications();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
    }

    private void initializeProxyNotifications() throws Throwable {
        int i = 2 % 2;
        ProxyNotificationInitializer.initialize(this.context);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (!(!shouldRetainProxyNotifications())) {
            int i2 = b + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            handleProxiedNotificationData();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private boolean shouldRetainProxyNotifications() {
        int i = 2 % 2;
        ProxyNotificationInitializer.initialize(this.context);
        if (ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            if (this.firebaseApp.get(AnalyticsConnector.class) != null) {
                return true;
            }
            if (MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null) {
                return true;
            }
            int i2 = b + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        b = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private void handleProxiedNotificationData() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Task<CloudMessage> proxyNotificationData = this.gmsRpc.getProxyNotificationData();
        Executor executor = this.initExecutor;
        OnSuccessListener<? super CloudMessage> onSuccessListener = new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda12
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) throws Throwable {
                this.f$0.m7973x8ede5a30((CloudMessage) obj);
            }
        };
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (37567 - Color.argb(0, 0, 0, 0));
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
            int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a((byte) (-b2), bArr[7], (byte) (-b2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, minimumFlingVelocity, touchSlop, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 8, 14}, true, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
            int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 14;
            byte[] bArr2 = $$a;
            byte b3 = (byte) (-bArr2[5]);
            Object[] objArr5 = new Object[1];
            a(b3, b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, jumpTapTimeout, deadChar, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37566);
                int i2 = 625 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int absoluteGravity = 14 + Gravity.getAbsoluteGravity(0, 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (-bArr3[5]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i2, absoluteGravity, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i3};
            int[] iArr2 = {i4};
            int iMyUid = Process.myUid();
            int i5 = ~((-578186756) | iMyUid);
            int i6 = ~iMyUid;
            int i7 = (-178447880) + ((i5 | (~(1245551365 | i6))) * (-1808)) + (((~((-36964866) | iMyUid)) | (~(i6 | 1786773255))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iMyUid | (-1245551366))) | 541221890 | (~(578186755 | i6))) * TypedValues.Custom.TYPE_BOOLEAN) + 938060165;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 65, 0}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i10 = b + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 4 / 5;
                    }
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 0, 0}, true, new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 174, 0}, true, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new int[]{113, 64, 173, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new int[]{177, 64, 0, 23}, false, new byte[]{1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 938060165};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[65];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr15 = new Object[1];
                d(b6, b7, (byte) (b7 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr4[65];
                byte b9 = b8;
                Object[] objArr16 = new Object[1];
                d(b9, (byte) (b9 - 1), b8, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 37568);
                        int iResolveSize = 625 - View.resolveSize(0, 0);
                        int scrollBarFadeDuration = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        a(b10, (byte) (-bArr5[5]), b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iResolveSize, scrollBarFadeDuration, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(new int[]{22, 15, 8, 14}, true, new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char absoluteGravity2 = (char) (37567 - Gravity.getAbsoluteGravity(0, 0));
                            int jumpTapTimeout2 = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
                            byte[] bArr6 = $$a;
                            byte b11 = (byte) (-bArr6[5]);
                            Object[] objArr20 = new Object[1];
                            a(b11, b11, bArr6[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity2, jumpTapTimeout2, iIndexOf, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char size = (char) (View.MeasureSpec.getSize(0) + 37567);
                            int mirror = 673 - AndroidCharacter.getMirror('0');
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[5];
                            Object[] objArr21 = new Object[1];
                            a((byte) (-b12), bArr7[7], (byte) (-b12), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(size, mirror, iIndexOf2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                        b = i14 % 128;
                        int i15 = i14 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw null;
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr3 = {i17};
        int iIdentityHashCode = System.identityHashCode(this);
        int i19 = ~iIdentityHashCode;
        int i20 = i16 + (((~((-1124188289) | i19)) | (~(1475339496 | iIdentityHashCode))) * 988) + 248324804 + (((~(iIdentityHashCode | (-1472586913))) | 348398624 | (~(i19 | 1475339496))) * 988);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr[1])[0] = i22 ^ (i22 << 5);
        Object[] objArr22 = {new int[]{i18}, new int[1], iArr3, strArr3};
        proxyNotificationData.addOnSuccessListener(executor, onSuccessListener);
    }

    /* JADX INFO: renamed from: lambda$handleProxiedNotificationData$5$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7973x8ede5a30(CloudMessage cloudMessage) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        if (cloudMessage != null) {
            int i5 = i3 + 45;
            b = i5 % 128;
            int i6 = i5 % 2;
            MessagingAnalytics.logNotificationReceived(cloudMessage.getIntent());
            handleProxiedNotificationData();
        }
        int i7 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean isAutoInitEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEnabled = this.autoInit.isEnabled();
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zIsEnabled;
    }

    public void setAutoInitEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.autoInit.setEnabled(z);
            throw null;
        }
        this.autoInit.setEnabled(z);
        int i3 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zDeliveryMetricsExportToBigQueryEnabled = MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        b = i3 % 128;
        int i4 = i3 % 2;
        return zDeliveryMetricsExportToBigQueryEnabled;
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        int i4 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public boolean isNotificationDelegationEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsProxyNotificationEnabled = ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        b = i3 % 128;
        int i4 = i3 % 2;
        return zIsProxyNotificationEnabled;
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        int i = 2 % 2;
        Task<Void> taskAddOnSuccessListener = ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z).addOnSuccessListener(new AdIdManagerImplCommon$$ExternalSyntheticLambda0(), new OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.m7978x6495830d((Void) obj);
            }
        });
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return taskAddOnSuccessListener;
    }

    /* JADX INFO: renamed from: lambda$setNotificationDelegationEnabled$6$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7978x6495830d(Void r4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
            int i3 = 12 / 0;
        } else {
            ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        }
        int i4 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: lambda$getToken$7$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7972x6a533e85(TaskCompletionSource taskCompletionSource) {
        int i = 2 % 2;
        int i2 = b + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            taskCompletionSource.setResult(blockingGetToken());
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public Task<String> getToken() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal == null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7972x6a533e85(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        int i5 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        firebaseInstanceIdInternal.getTokenTask();
        throw null;
    }

    class AutoInit {
        private static final String AUTO_INIT_PREF = "auto_init";
        private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";
        private Boolean autoInitEnabled;
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final Subscriber subscriber;

        AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        void initialize() {
            synchronized (this) {
                if (this.initialized) {
                    return;
                }
                Boolean enabled = readEnabled();
                this.autoInitEnabled = enabled;
                if (enabled == null) {
                    EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0
                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            this.f$0.m7979x1061f0b8(event);
                        }
                    };
                    this.dataCollectionDefaultChangeEventHandler = eventHandler;
                    this.subscriber.subscribe(DataCollectionDefaultChange.class, eventHandler);
                }
                this.initialized = true;
            }
        }

        /* JADX INFO: renamed from: lambda$initialize$0$com-google-firebase-messaging-FirebaseMessaging$AutoInit, reason: not valid java name */
        /* synthetic */ void m7979x1061f0b8(Event event) {
            if (isEnabled()) {
                FirebaseMessaging.access$100(FirebaseMessaging.this);
            }
        }

        boolean isEnabled() {
            boolean zIsDataCollectionDefaultEnabled;
            synchronized (this) {
                initialize();
                Boolean bool = this.autoInitEnabled;
                if (bool != null) {
                    zIsDataCollectionDefaultEnabled = bool.booleanValue();
                } else {
                    zIsDataCollectionDefaultEnabled = FirebaseMessaging.access$000(FirebaseMessaging.this).isDataCollectionDefaultEnabled();
                }
            }
            return zIsDataCollectionDefaultEnabled;
        }

        void setEnabled(boolean z) {
            synchronized (this) {
                initialize();
                EventHandler<DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
                if (eventHandler != null) {
                    this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                    this.dataCollectionDefaultChangeEventHandler = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.access$000(FirebaseMessaging.this).getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean(AUTO_INIT_PREF, z);
                editorEdit.apply();
                if (z) {
                    FirebaseMessaging.access$100(FirebaseMessaging.this);
                }
                this.autoInitEnabled = Boolean.valueOf(z);
            }
        }

        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Context applicationContext = FirebaseMessaging.access$000(FirebaseMessaging.this).getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(AUTO_INIT_PREF)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(AUTO_INIT_PREF, false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey(MANIFEST_METADATA_AUTO_INIT_ENABLED)) {
                    return null;
                }
                return Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean(MANIFEST_METADATA_AUTO_INIT_ENABLED));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$deleteToken$8$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7970xd5738b77(TaskCompletionSource taskCompletionSource) {
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.iid.deleteToken(Metadata.getDefaultSenderId(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            b = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    /* JADX INFO: renamed from: lambda$deleteToken$9$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m7971xd4fd2578(TaskCompletionSource taskCompletionSource) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        b = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                Tasks.await(this.gmsRpc.deleteToken());
                getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
                taskCompletionSource.setResult(null);
                obj.hashCode();
                throw null;
            }
            Tasks.await(this.gmsRpc.deleteToken());
            getStore(this.context).deleteToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
            taskCompletionSource.setResult(null);
            int i3 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    public Task<Void> deleteToken() {
        int i = 2 % 2;
        int i2 = b + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.iid != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.initExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7970xd5738b77(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (getTokenWithoutTriggeringSync() != null) {
            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            FcmExecutors.newNetworkIOExecutor().execute(new Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7971xd4fd2578(taskCompletionSource2);
                }
            });
            return taskCompletionSource2.getTask();
        }
        int i4 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return Tasks.forResult(null);
    }

    public Task<Void> subscribeToTopic(final String str) {
        int i = 2 % 2;
        Task taskOnSuccessTask = this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.lambda$subscribeToTopic$10(str, (TopicsSubscriber) obj);
            }
        });
        int i2 = b + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return taskOnSuccessTask;
    }

    static /* synthetic */ Task lambda$subscribeToTopic$10(String str, TopicsSubscriber topicsSubscriber) throws Exception {
        int i = 2 % 2;
        int i2 = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return topicsSubscriber.subscribeToTopic(str);
        }
        topicsSubscriber.subscribeToTopic(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Task<Void> unsubscribeFromTopic(final String str) {
        int i = 2 % 2;
        Task taskOnSuccessTask = this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.lambda$unsubscribeFromTopic$11(str, (TopicsSubscriber) obj);
            }
        });
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return taskOnSuccessTask;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Task lambda$unsubscribeFromTopic$11(String str, TopicsSubscriber topicsSubscriber) throws Exception {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        b = i2 % 128;
        int i3 = i2 % 2;
        Task<Void> taskUnsubscribeFromTopic = topicsSubscriber.unsubscribeFromTopic(str);
        int i4 = b + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return taskUnsubscribeFromTopic;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing 'to'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.getTo()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.getTo()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = new android.content.Intent(com.google.firebase.messaging.FirebaseMessaging.SEND_INTENT_ACTION);
        r3 = new android.content.Intent();
        r3.setPackage("com.google.example.invalidpackage");
        r1.putExtra(com.google.firebase.messaging.FirebaseMessaging.EXTRA_DUMMY_P_INTENT, android.app.PendingIntent.getBroadcast(r6.context, 0, r3, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        r1.setPackage("com.google.android.gms");
        r7.populateSendMessageIntent(r1);
        r6.context.sendOrderedBroadcast(r1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
        r7 = com.google.firebase.messaging.FirebaseMessaging.b + 61;
        com.google.firebase.messaging.FirebaseMessaging.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r7 % 128;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void send(com.google.firebase.messaging.RemoteMessage r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.messaging.FirebaseMessaging.b
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.google.firebase.messaging.FirebaseMessaging.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1c
            java.lang.String r1 = r7.getTo()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 5
            int r3 = r3 / r2
            if (r1 != 0) goto L61
            goto L26
        L1c:
            java.lang.String r1 = r7.getTo()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L61
        L26:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.google.android.gcm.intent.SEND"
            r1.<init>(r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = "com.google.example.invalidpackage"
            r3.setPackage(r4)
            android.content.Context r4 = r6.context
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r4, r2, r3, r5)
            java.lang.String r3 = "app"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "com.google.android.gms"
            r1.setPackage(r2)
            r7.populateSendMessageIntent(r1)
            android.content.Context r7 = r6.context
            java.lang.String r2 = "com.google.android.gtalkservice.permission.GTALK_SERVICE"
            r7.sendOrderedBroadcast(r1, r2)
            int r7 = com.google.firebase.messaging.FirebaseMessaging.b
            int r7 = r7 + 61
            int r1 = r7 % 128
            com.google.firebase.messaging.FirebaseMessaging.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L5f
            return
        L5f:
            r7 = 0
            throw r7
        L61:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing 'to'"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.send(com.google.firebase.messaging.RemoteMessage):void");
    }

    Task<TopicsSubscriber> getTopicsSubscriberTask() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Task<TopicsSubscriber> task = this.topicsSubscriberTask;
        int i5 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return task;
    }

    public static getCaptureFuture getTransportFactory() {
        int i = 2 % 2;
        int i2 = b + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        getCaptureFuture getcapturefuture = transportFactory.get();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        b = i4 % 128;
        int i5 = i4 % 2;
        return getcapturefuture;
    }

    static void clearTransportFactoryForTest() {
        int i = 2 % 2;
        transportFactory = new Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda7
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            }
        };
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
    }

    boolean isGmsCorePresent() {
        int i = 2 % 2;
        int i2 = b + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsGmscorePresent = this.metadata.isGmscorePresent();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zIsGmscorePresent;
    }

    Context getApplicationContext() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 99;
        b = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.context;
        int i5 = i2 + 99;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return context;
    }

    void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    void syncWithDelaySecondsInternal(long j) {
        synchronized (this) {
            enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
            this.syncScheduledOrRunning = true;
        }
    }

    void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private void startSyncIfNecessary() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        b = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            int i4 = b + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            startSync();
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i6 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    private void startSync() {
        synchronized (this) {
            if (!this.syncScheduledOrRunning) {
                syncWithDelaySecondsInternal(0L);
            }
        }
    }

    Store.Token getTokenWithoutTriggeringSync() {
        int i = 2 % 2;
        int i2 = b + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Store store2 = getStore(this.context);
        if (i3 != 0) {
            return store2.getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
        }
        store2.getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
        throw null;
    }

    /* JADX INFO: renamed from: lambda$blockingGetToken$14$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ Task m7969xb7d2b1c4(final String str, final Store.Token token) {
        int i = 2 % 2;
        Task<TContinuationResult> taskOnSuccessTask = this.gmsRpc.getToken().onSuccessTask(this.fileExecutor, new SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.m7968xb84917c3(str, token, (String) obj);
            }
        });
        int i2 = b + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return taskOnSuccessTask;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX INFO: renamed from: lambda$blockingGetToken$13$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ Task m7968xb84917c3(String str, Store.Token token, String str2) throws Exception {
        int i = 2 % 2;
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token != null) {
            int i2 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                str2.equals(token.token);
                throw null;
            }
            if (!str2.equals(token.token)) {
                invokeOnTokenRefresh(str2);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                b = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            invokeOnTokenRefresh(str2);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        return Tasks.forResult(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return (java.lang.String) com.google.android.gms.tasks.Tasks.await(r1.getTokenTask());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        throw new java.io.IOException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r1 = getTokenWithoutTriggeringSync();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (tokenNeedsRefresh(r1) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r2 = com.google.firebase.messaging.FirebaseMessaging.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
        com.google.firebase.messaging.FirebaseMessaging.b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if ((r2 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r0 = r1.token;
        r1 = 49 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        return r1.token;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r0 = com.google.firebase.messaging.Metadata.getDefaultSenderId(r4.firebaseApp);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return (java.lang.String) com.google.android.gms.tasks.Tasks.await(r4.requestDeduplicator.getOrStartGetTokenRequest(r0, new com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda14(r4, r0, r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        throw new java.io.IOException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String blockingGetToken() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.messaging.FirebaseMessaging.b
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.google.firebase.messaging.FirebaseMessaging.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.google.firebase.iid.internal.FirebaseInstanceIdInternal r1 = r4.iid
            r2 = 20
            int r2 = r2 / 0
            if (r1 == 0) goto L2f
            goto L1b
        L17:
            com.google.firebase.iid.internal.FirebaseInstanceIdInternal r1 = r4.iid
            if (r1 == 0) goto L2f
        L1b:
            com.google.android.gms.tasks.Task r0 = r1.getTokenTask()     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L28
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L28
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L28
            return r0
        L26:
            r0 = move-exception
            goto L29
        L28:
            r0 = move-exception
        L29:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L2f:
            com.google.firebase.messaging.Store$Token r1 = r4.getTokenWithoutTriggeringSync()
            boolean r2 = r4.tokenNeedsRefresh(r1)
            if (r2 != 0) goto L4e
            int r2 = com.google.firebase.messaging.FirebaseMessaging.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r2 = r2 + 57
            int r3 = r2 % 128
            com.google.firebase.messaging.FirebaseMessaging.b = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L4b
            java.lang.String r0 = r1.token
            r1 = 49
            int r1 = r1 / 0
            goto L4d
        L4b:
            java.lang.String r0 = r1.token
        L4d:
            return r0
        L4e:
            com.google.firebase.FirebaseApp r0 = r4.firebaseApp
            java.lang.String r0 = com.google.firebase.messaging.Metadata.getDefaultSenderId(r0)
            com.google.firebase.messaging.RequestDeduplicator r2 = r4.requestDeduplicator
            com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda14 r3 = new com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda14
            r3.<init>()
            com.google.android.gms.tasks.Task r0 = r2.getOrStartGetTokenRequest(r0, r3)
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch: java.lang.InterruptedException -> L66 java.util.concurrent.ExecutionException -> L68
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L66 java.util.concurrent.ExecutionException -> L68
            return r0
        L66:
            r0 = move-exception
            goto L69
        L68:
            r0 = move-exception
        L69:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.blockingGetToken():java.lang.String");
    }

    private String getSubtype() {
        int i = 2 % 2;
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            int i2 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        String persistenceKey = this.firebaseApp.getPersistenceKey();
        int i4 = b + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return persistenceKey;
    }

    boolean tokenNeedsRefresh(Store.Token token) {
        int i = 2 % 2;
        int i2 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (token == null || !(!token.needsRefresh(this.metadata.getAppVersionCode()))) {
            return true;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        b = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    private void invokeOnTokenRefresh(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            b = i4 % 128;
            int i5 = i4 % 2;
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.firebaseApp.getName();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    static /* synthetic */ getCaptureFuture lambda$clearTransportFactoryForTest$12() {
        int i = 2 % 2;
        int i2 = b + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 113;
        b = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    static /* synthetic */ getCaptureFuture lambda$static$0() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59697, 59768, 59773, 59763, 59749, 59744, 59752, 59752, 59751, 59775, 59762, 59771, 59749, 59771, 59750, 59705, 59753, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59737, 59814, 59839, 59832, 59815, 59809, 59833, 59792, 59794, 59834, 59812, 59808, 59820, 59816, 59808, 59812, 59814, 59812, 59709, 59746, 59751, 59768, 59773, 59757, 59723, 59713, 59745, 59756, 59757, 59718, 59724, 59744, 59744, 59758, 59778, 59417, 59420, 59404, 59400, 59408, 59411, 59401, 59397, 59439, 59415, 59415, 59412, 59420, 59417, 59423, 59748, 59891, 59417, 59419, 59397, 59397, 59418, 59888, 59887, 59895, 59416, 59889, 59889, 59417, 59419, 59891, 59880, 59882, 59883, 59889, 59889, 59880, 59887, 59890, 59419, 59888, 59890, 59901, 59860, 59891, 59890, 59880, 59885, 59889, 59901, 59881, 59881, 59861, 59882, 59890, 59419, 59889, 59882, 59880, 59895, 59417, 59890, 59882, 59891, 59902, 59882, 59890, 59900, 59880, 59881, 59900, 59889, 59886, 59880, 59891, 59396, 59418, 59890, 59900, 59705, 59758, 59717, 59709, 59710, 59704, 59704, 59709, 59717, 59717, 59698, 59718, 59712, 59704, 59705, 59713, 59759, 59719, 59704, 59713, 59715, 59704, 59717, 59759, 59753, 59753, 59718, 59704, 59705, 59712, 59719, 59717, 59758, 59712, 59714, 59752, 59712, 59719, 59718, 59704, 59705, 59711, 59711, 59711, 59709, 59717, 59717, 59719, 59712, 59712, 59718, 59709, 59709, 59698, 59699, 59699, 59718, 59712, 59704, 59705, 59719, 59752, 59714, 59705};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 + 99
            byte[] r1 = com.google.firebase.messaging.FirebaseMessaging.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = r8 + 1
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.$$g(byte, byte, byte):java.lang.String");
    }
}
