package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.sessions.api.CrashEventReceiver;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER;
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String META_INF_FOLDER = "META-INF/";
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    private static final Charset UTF_8;
    private static final String VERSION_CONTROL_INFO_FILE = "version-control-info.textproto";
    private static final String VERSION_CONTROL_INFO_KEY = "com.crashlytics.version-control-info";
    private static boolean b;
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    private final SessionReportingCoordinator reportingCoordinator;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final UserMetadata userMetadata;
    private static final byte[] $$c = {6, -86, -9, -124};
    private static final int $$d = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, -79, 42, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 49;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f819a = 1;
    private static int asBinder = 1;
    private SettingsProvider settingsProvider = null;
    final TaskCompletionSource<Boolean> unsentReportsAvailable = new TaskCompletionSource<>();
    final TaskCompletionSource<Boolean> reportActionProvided = new TaskCompletionSource<>();
    final TaskCompletionSource<Void> unsentReportsHandled = new TaskCompletionSource<>();
    final AtomicBoolean checkForUnsentReportsCalled = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r0 = r8 + 1
            byte[] r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.$$a
            int r7 = r7 + 3
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.c(byte, int, short, java.lang.Object[]):void");
    }

    static /* synthetic */ long access$000(long j) {
        int i = 2 % 2;
        int i2 = f819a + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long timestampSeconds = getTimestampSeconds(j);
        int i4 = asInterface + 47;
        f819a = i4 % 128;
        if (i4 % 2 != 0) {
            return timestampSeconds;
        }
        throw null;
    }

    static /* synthetic */ String access$100(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = f819a + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String currentSessionId = crashlyticsController.getCurrentSessionId();
        int i4 = f819a + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return currentSessionId;
    }

    static /* synthetic */ AnalyticsEventLogger access$1000(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 77;
        f819a = i3 % 128;
        int i4 = i3 % 2;
        AnalyticsEventLogger analyticsEventLogger = crashlyticsController.analyticsEventLogger;
        int i5 = i2 + 87;
        f819a = i5 % 128;
        if (i5 % 2 != 0) {
            return analyticsEventLogger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ CrashlyticsFileMarker access$200(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = f819a + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        CrashlyticsFileMarker crashlyticsFileMarker = crashlyticsController.crashMarker;
        int i5 = i3 + 1;
        f819a = i5 % 128;
        if (i5 % 2 != 0) {
            return crashlyticsFileMarker;
        }
        throw null;
    }

    static /* synthetic */ SessionReportingCoordinator access$300(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 25;
        f819a = i3 % 128;
        int i4 = i3 % 2;
        SessionReportingCoordinator sessionReportingCoordinator = crashlyticsController.reportingCoordinator;
        int i5 = i2 + 77;
        f819a = i5 % 128;
        int i6 = i5 % 2;
        return sessionReportingCoordinator;
    }

    static /* synthetic */ void access$400(CrashlyticsController crashlyticsController, long j) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        crashlyticsController.doWriteAppExceptionMarker(j);
        int i4 = f819a + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void access$500(CrashlyticsController crashlyticsController, String str, Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        crashlyticsController.doOpenSession(str, bool);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    static /* synthetic */ DataCollectionArbiter access$600(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        DataCollectionArbiter dataCollectionArbiter = crashlyticsController.dataCollectionArbiter;
        if (i3 != 0) {
            return dataCollectionArbiter;
        }
        throw null;
    }

    static /* synthetic */ CrashlyticsWorkers access$700(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 91;
        f819a = i3 % 128;
        int i4 = i3 % 2;
        CrashlyticsWorkers crashlyticsWorkers = crashlyticsController.crashlyticsWorkers;
        int i5 = i2 + 41;
        f819a = i5 % 128;
        if (i5 % 2 != 0) {
            return crashlyticsWorkers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Task access$800(CrashlyticsController crashlyticsController) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        f819a = i2 % 128;
        if (i2 % 2 != 0) {
            return crashlyticsController.logAnalyticsAppExceptionEvents();
        }
        crashlyticsController.logAnalyticsAppExceptionEvents();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void access$900(List list) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        deleteFiles(list);
        int i4 = f819a + 113;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        APP_EXCEPTION_MARKER_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return CrashlyticsController.lambda$static$0(file, str);
            }
        };
        UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        int i = asBinder + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean lambda$static$0(File file, String str) {
        int i = 2 % 2;
        int i2 = f819a + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zStartsWith = str.startsWith(APP_EXCEPTION_MARKER_PREFIX);
        int i4 = asInterface + 13;
        f819a = i4 % 128;
        int i5 = i4 % 2;
        return zStartsWith;
    }

    CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.context = context;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsEventLogger = analyticsEventLogger;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.reportingCoordinator = sessionReportingCoordinator;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    private static void d(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 21;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (-b2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.getTrimmedLength("") + 2994, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1182129903, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 43326), ExpandableListView.getPackedPositionChild(0L) + 254, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            if (b) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 33602), (Process.myPid() >> 22) + 3085, TextUtils.lastIndexOf("", '0', 0) + 27, -2146875848, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i7 = $11 + 1;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 4;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 33601), 3085 - Color.alpha(0), 26 - View.MeasureSpec.getSize(0), -2146875848, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                j = 0;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    void enableExceptionHandling(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        int i = 2 % 2;
        this.settingsProvider = settingsProvider;
        openSession(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(SettingsProvider settingsProvider2, Thread thread, Throwable th) {
                CrashlyticsController.this.handleUncaughtException(settingsProvider2, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.nativeComponent);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
        int i2 = f819a + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    void handleUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th) {
        int i = 2 % 2;
        int i2 = f819a + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        handleUncaughtException(settingsProvider, thread, th, false);
        int i4 = f819a + 41;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    void handleUncaughtException(final SettingsProvider settingsProvider, final Thread thread, final Throwable th, final boolean z) {
        synchronized (this) {
            try {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Handling uncaught exception \"");
                sb.append(th);
                sb.append("\" from thread ");
                sb.append(thread.getName());
                logger.d(sb.toString());
                if (!z) {
                    CrashEventReceiver.notifyCrashOccurred();
                }
                final long jCurrentTimeMillis = System.currentTimeMillis();
                Task taskSubmitTask = this.crashlyticsWorkers.common.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public Task<Void> call() throws Exception {
                        long jAccess$000 = CrashlyticsController.access$000(jCurrentTimeMillis);
                        final String strAccess$100 = CrashlyticsController.access$100(CrashlyticsController.this);
                        if (strAccess$100 == null) {
                            Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                            return Tasks.forResult(null);
                        }
                        CrashlyticsController.access$200(CrashlyticsController.this).create();
                        CrashlyticsController.access$300(CrashlyticsController.this).persistFatalEvent(th, thread, strAccess$100, jAccess$000);
                        CrashlyticsController.access$400(CrashlyticsController.this, jCurrentTimeMillis);
                        CrashlyticsController.this.doCloseSessions(settingsProvider);
                        CrashlyticsController.access$500(CrashlyticsController.this, new CLSUUID().getSessionId(), Boolean.valueOf(z));
                        if (!CrashlyticsController.access$600(CrashlyticsController.this).isAutomaticDataCollectionEnabled()) {
                            return Tasks.forResult(null);
                        }
                        return settingsProvider.getSettingsAsync().onSuccessTask(CrashlyticsController.access$700(CrashlyticsController.this).common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public Task<Void> then(Settings settings) throws Exception {
                                if (settings == null) {
                                    Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                                    return Tasks.forResult(null);
                                }
                                Task[] taskArr = new Task[2];
                                taskArr[0] = CrashlyticsController.access$800(CrashlyticsController.this);
                                taskArr[1] = CrashlyticsController.access$300(CrashlyticsController.this).sendReports(CrashlyticsController.access$700(CrashlyticsController.this).common, z ? strAccess$100 : null);
                                return Tasks.whenAll((Task<?>[]) taskArr);
                            }
                        });
                    }
                });
                if (!z) {
                    try {
                        Utils.awaitEvenIfOnMainThread(taskSubmitTask);
                    } catch (TimeoutException unused) {
                        Logger.getLogger().e("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e2) {
                        Logger.getLogger().e("Error handling uncaught exception", e2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v82, types: [boolean, int] */
    private Task<Boolean> waitForReportAction() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int mode = View.MeasureSpec.getMode(0) + 651;
            int keyRepeatTimeout = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b2 = bArr[79];
            byte b3 = bArr[4];
            Object[] objArr2 = new Object[1];
            c(b2, b3, (byte) (b3 & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, mode, keyRepeatTimeout, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(null, null, Process.getGidForName("") + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i2 = 652 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int iAlpha = 44 - Color.alpha(0);
            byte b4 = $$a[6];
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            c(b5, (byte) (b5 | 51), b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, iAlpha, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int iArgb = Color.argb(0, 0, 0, 0) + 651;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 44;
                byte b6 = $$a[79];
                Object[] objArr6 = new Object[1];
                c(b6, (byte) (b6 | 50), (byte) 37, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, iArgb, absoluteGravity, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            int iMyTid = Process.myTid();
            int i5 = (~((-995388645) | iMyTid)) | 5532836;
            int i6 = ((((-1698250455) + (i5 * 992)) + ((i5 | (~((~iMyTid) | (-2102027)))) * (-496))) + ((iMyTid | (-991957835)) * 496)) - 60527874;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[3])[0] = i8 ^ (i8 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.green(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1610, 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -60527874, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 652;
                    int bitsPerPixel = 43 - ImageFormat.getBitsPerPixel(0);
                    byte b7 = $$a[6];
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    c(b8, (byte) (b8 | 51), b7, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, packedPositionChild, bitsPerPixel, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 695 - (Process.myTid() >> 22), 99 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63406), 792 - MotionEvent.axisFromString(""), 83 - Color.green(0)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int iMakeMeasureSpec = 651 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i9 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b9 = $$a[79];
                    Object[] objArr11 = new Object[1];
                    c(b9, (byte) (b9 | 50), (byte) 37, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iMakeMeasureSpec, i9, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    d(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    d(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int threadPriority = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43;
                        byte b10 = $$a[6];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        c(b11, (byte) (b11 | 51), b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, threadPriority, i10, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int absoluteGravity2 = 651 - Gravity.getAbsoluteGravity(0, 0);
                        int modifierMetaStateMask = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr2 = $$a;
                        byte b12 = bArr2[79];
                        byte b13 = bArr2[4];
                        Object[] objArr15 = new Object[1];
                        c(b12, b13, (byte) (b13 & 52), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, absoluteGravity2, modifierMetaStateMask, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i11 = f819a + 19;
                asInterface = i11 % 128;
                for (int i12 = i11 % 2 == 0 ? 0 : 1; i12 < strArr.length; i12++) {
                    int i13 = asInterface + 19;
                    f819a = i13 % 128;
                    int i14 = i13 % 2;
                    arrayList.add(strArr[i12]);
                }
            }
            throw null;
        }
        int i15 = asInterface + 89;
        f819a = i15 % 128;
        int i16 = i15 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = i17 + 1272830139 + (((~(764106731 | i20)) | (~((-767537542) | iIdentityHashCode))) * (-370)) + (((~(iIdentityHashCode | 764106731)) | (~(i20 | (-767537542))) | 18026) * (-370)) + 6669620;
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr16[3])[0] = i23 ^ (i23 << 5);
        int i24 = f819a + 51;
        asInterface = i24 % 128;
        int i25 = i24 % 2;
        boolean zIsAutomaticDataCollectionEnabled = this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
        int i26 = ((int[]) objArr16[3])[0];
        int i27 = i26 * i26;
        int i28 = -(293452692 * i26);
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        int i30 = -(i26 * 1099306010);
        int i31 = ((i29 & i30) + (i30 | i29)) - (-1453569681);
        int i32 = ((i31 >> 22) - 2047) / 1024;
        int i33 = (i31 - (~((i32 & 1) + (i32 | 1)))) - 1;
        int i34 = ((i31 >> 21) - 4095) / 2048;
        int i35 = -(i33 ^ (((i34 | 1) << 1) - (i34 ^ 1)));
        int i36 = (i35 & 8) + (i35 | 8);
        int i37 = ((i36 >> 27) - 63) / 32;
        int i38 = (i37 ^ 1) + ((i37 & 1) << 1);
        Boolean boolValueOf = Boolean.valueOf((boolean) (10200 / (((-((i38 ^ 1) + ((i38 & 1) << 1))) & i36) * 1275)));
        if (zIsAutomaticDataCollectionEnabled) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
            return Tasks.forResult(boolValueOf);
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.trySetResult(boolValueOf);
        Task<TContinuationResult> taskOnSuccessTask = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task<Boolean> then(Void r1) throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return CrashlyticsTasks.race(taskOnSuccessTask, this.reportActionProvided.getTask());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r6.nativeComponent.hasCrashDataForSession(r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r6.nativeComponent.hasCrashDataForSession(r1) != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a + 7;
        com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean didCrashOnPreviousExecution() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a = r2
            int r1 = r1 % r0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.checkBackgroundThread()
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r1 = r6.crashMarker
            boolean r1 = r1.isPresent()
            r2 = 1
            if (r1 != 0) goto L5a
            int r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a
            int r1 = r1 + 29
            int r3 = r1 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L55
            java.lang.String r1 = r6.getCurrentSessionId()
            r3 = 0
            if (r1 == 0) goto L54
            int r4 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L41
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r4 = r6.nativeComponent
            boolean r1 = r4.hasCrashDataForSession(r1)
            r4 = 48
            int r4 = r4 / r3
            if (r1 == 0) goto L54
            goto L4a
        L41:
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r4 = r6.nativeComponent
            boolean r1 = r4.hasCrashDataForSession(r1)
            if (r1 == r2) goto L4a
            goto L54
        L4a:
            int r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a
            int r1 = r1 + 7
            int r3 = r1 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface = r3
            int r1 = r1 % r0
            return r2
        L54:
            return r3
        L55:
            r6.getCurrentSessionId()
            r0 = 0
            throw r0
        L5a:
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r1 = "Found previous crash marker."
            r0.v(r1)
            com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker r0 = r6.crashMarker
            r0.remove()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.didCrashOnPreviousExecution():boolean");
    }

    Task<Boolean> checkForUnsentReports() {
        int i = 2 % 2;
        int i2 = f819a + 107;
        asInterface = i2 % 128;
        if (i2 % 2 == 0 ? (!this.checkForUnsentReportsCalled.compareAndSet(false, true)) : !this.checkForUnsentReportsCalled.compareAndSet(true, true)) {
            Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
            Task<Boolean> taskForResult = Tasks.forResult(Boolean.FALSE);
            int i3 = f819a + 65;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return taskForResult;
        }
        return this.unsentReportsAvailable.getTask();
    }

    Task<Void> sendUnsentReports() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        this.reportActionProvided.trySetResult(Boolean.TRUE);
        Task<Void> task = this.unsentReportsHandled.getTask();
        int i4 = asInterface + 31;
        f819a = i4 % 128;
        int i5 = i4 % 2;
        return task;
    }

    Task<Void> deleteUnsentReports() {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        f819a = i2 % 128;
        if (i2 % 2 != 0) {
            this.reportActionProvided.trySetResult(Boolean.FALSE);
            return this.unsentReportsHandled.getTask();
        }
        this.reportActionProvided.trySetResult(Boolean.FALSE);
        this.unsentReportsHandled.getTask();
        throw null;
    }

    void submitAllReports(final Task<Settings> task) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        if (!this.reportingCoordinator.hasReportsToSend()) {
            Logger.getLogger().v("No crash reports are available to be sent.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
            return;
        }
        Logger.getLogger().v("Crash reports are available to be sent.");
        waitForReportAction().onSuccessTask(this.crashlyticsWorkers.common, new SuccessContinuation<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task<Void> then(Boolean bool) throws Exception {
                if (!bool.booleanValue()) {
                    Logger.getLogger().v("Deleting cached crash reports...");
                    CrashlyticsController.access$900(CrashlyticsController.this.listAppExceptionMarkerFiles());
                    CrashlyticsController.access$300(CrashlyticsController.this).removeAllReports();
                    CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                    return Tasks.forResult(null);
                }
                Logger.getLogger().d("Sending cached crash reports...");
                CrashlyticsController.access$600(CrashlyticsController.this).grantDataCollectionPermission(bool.booleanValue());
                return task.onSuccessTask(CrashlyticsController.access$700(CrashlyticsController.this).common, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public Task<Void> then(Settings settings) throws Exception {
                        if (settings == null) {
                            Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                            return Tasks.forResult(null);
                        }
                        CrashlyticsController.access$800(CrashlyticsController.this);
                        CrashlyticsController.access$300(CrashlyticsController.this).sendReports(CrashlyticsController.access$700(CrashlyticsController.this).common);
                        CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                });
            }
        });
        int i4 = asInterface + 59;
        f819a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    void writeToLog(long j, String str) {
        int i = 2 % 2;
        int i2 = f819a + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            isHandlingException();
            throw null;
        }
        if (isHandlingException()) {
            return;
        }
        int i3 = asInterface + 77;
        f819a = i3 % 128;
        int i4 = i3 % 2;
        this.logFileManager.writeToLog(j, str);
    }

    void writeNonFatalException(Thread thread, Throwable th, Map<String, String> map) {
        int i = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (isHandlingException()) {
            return;
        }
        int i2 = f819a + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long timestampSeconds = getTimestampSeconds(jCurrentTimeMillis);
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId != null) {
            this.reportingCoordinator.persistNonFatalEvent(th, thread, new EventMetadata(currentSessionId, timestampSeconds, map));
        } else {
            int i4 = asInterface + 25;
            f819a = i4 % 128;
            int i5 = i4 % 2;
            Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
        }
    }

    void logFatalException(Thread thread, Throwable th) {
        int i = 2 % 2;
        int i2 = f819a + 105;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SettingsProvider settingsProvider = this.settingsProvider;
        if (settingsProvider != null) {
            handleUncaughtException(settingsProvider, thread, th, true);
            return;
        }
        int i4 = i3 + 43;
        f819a = i4 % 128;
        int i5 = i4 % 2;
        Logger.getLogger().w("settingsProvider not set");
        int i6 = asInterface + 17;
        f819a = i6 % 128;
        int i7 = i6 % 2;
    }

    void setUserId(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        this.userMetadata.setUserId(str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void setCustomKey(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.userMetadata.setCustomKey(str, str2);
            int i4 = f819a + 27;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
        } catch (IllegalArgumentException e2) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e2;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void setCustomKeys(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = f819a + 117;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.userMetadata.setCustomKeys(map);
            obj.hashCode();
            throw null;
        }
        this.userMetadata.setCustomKeys(map);
        int i3 = asInterface + 71;
        f819a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    void setInternalKey(String str, String str2) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        f819a = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.userMetadata.setInternalKey(str, str2);
                int i3 = 39 / 0;
            } else {
                this.userMetadata.setInternalKey(str, str2);
            }
        } catch (IllegalArgumentException e2) {
            Context context = this.context;
            if (context == null || !CommonUtils.isAppDebuggable(context)) {
                Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
                int i4 = asInterface + 113;
                f819a = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = asInterface + 117;
            f819a = i6 % 128;
            if (i6 % 2 != 0) {
                throw e2;
            }
            int i7 = 97 / 0;
            throw e2;
        }
    }

    void openSession(final String str) {
        int i = 2 % 2;
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7932xe0c67ca9(str);
            }
        });
        int i2 = asInterface + 35;
        f819a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 42 / 0;
        }
    }

    /* JADX INFO: renamed from: lambda$openSession$1$com-google-firebase-crashlytics-internal-common-CrashlyticsController, reason: not valid java name */
    /* synthetic */ void m7932xe0c67ca9(String str) {
        int i = 2 % 2;
        int i2 = f819a + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        doOpenSession(str, Boolean.FALSE);
        int i4 = asInterface + 37;
        f819a = i4 % 128;
        int i5 = i4 % 2;
    }

    private String getCurrentSessionId() {
        int i = 2 % 2;
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            int i2 = f819a + 25;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = asInterface + 99;
        f819a = i4 % 128;
        int i5 = i4 % 2;
        return sortedSetListSortedOpenSessionIds.first();
    }

    boolean finalizeSessions(SettingsProvider settingsProvider) {
        int i = 2 % 2;
        int i2 = f819a + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CrashlyticsWorkers.checkBackgroundThread();
        if (isHandlingException()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, settingsProvider, true);
            Logger.getLogger().v("Closed all previously open sessions.");
            int i4 = f819a + 69;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return true;
        } catch (Exception e2) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    private void doOpenSession(String str, Boolean bool) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        Logger.getLogger().d("Opening a new session with ID ".concat(String.valueOf(str)));
        this.nativeComponent.prepareNativeSession(str, String.format(Locale.US, GENERATOR_FORMAT, CrashlyticsCore.getVersion()), currentTimestampSeconds, StaticSessionData.create(createAppData(this.idManager, this.appData), createOsData(), createDeviceData(this.context)));
        if (!(!bool.booleanValue()) && str != null) {
            int i4 = f819a + 11;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                this.userMetadata.setNewSession(str);
                throw null;
            }
            this.userMetadata.setNewSession(str);
        }
        this.logFileManager.setCurrentSession(str);
        this.sessionsSubscriber.setSessionId(str);
        this.reportingCoordinator.onBeginSession(str, currentTimestampSeconds);
    }

    void doCloseSessions(SettingsProvider settingsProvider) {
        int i = 2 % 2;
        int i2 = f819a + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        doCloseSessions(false, settingsProvider, false);
        int i4 = asInterface + 3;
        f819a = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z, SettingsProvider settingsProvider, boolean z2) {
        int i = 2 % 2;
        CrashlyticsWorkers.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.reportingCoordinator.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (z2 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            writeApplicationExitInfoEventIfRelevant(str);
        } else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        String str2 = null;
        if (z2) {
            int i2 = f819a + 99;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                this.nativeComponent.hasCrashDataForSession(str);
                throw null;
            }
            if (!(!this.nativeComponent.hasCrashDataForSession(str))) {
                int i3 = f819a + 15;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                finalizePreviousNativeSession(str);
                int i5 = asInterface + 39;
                f819a = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (z != 0) {
            str2 = (String) arrayList.get(0);
        } else {
            this.sessionsSubscriber.setSessionId(null);
        }
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds(), str2);
    }

    List<File> listAppExceptionMarkerFiles() {
        int i = 2 % 2;
        int i2 = f819a + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List<File> commonFiles = this.fileStore.getCommonFiles(APP_EXCEPTION_MARKER_FILTER);
        int i4 = asInterface + 73;
        f819a = i4 % 128;
        int i5 = i4 % 2;
        return commonFiles;
    }

    void saveVersionControlInfo() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            String versionControlInfo = getVersionControlInfo();
            if (versionControlInfo != null) {
                int i4 = f819a + 73;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                setInternalKey(VERSION_CONTROL_INFO_KEY, versionControlInfo);
                Logger.getLogger().i("Saved version control info");
                int i6 = f819a + 117;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        } catch (IOException e2) {
            Logger.getLogger().w("Unable to save version control info", e2);
        }
        int i7 = f819a + 19;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    String getVersionControlInfo() throws IOException {
        int i = 2 % 2;
        int i2 = f819a + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String versionControlInfo = CommonUtils.getVersionControlInfo(this.context);
        if (versionControlInfo != null) {
            Logger.getLogger().d("Read version control info from string resource");
            return Base64.encodeToString(versionControlInfo.getBytes(UTF_8), 0);
        }
        InputStream resourceAsStream = getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream != null) {
            try {
                Logger.getLogger().d("Read version control info from file");
                String strEncodeToString = Base64.encodeToString(readResource(resourceAsStream), 0);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return strEncodeToString;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (resourceAsStream != null) {
            int i4 = asInterface + 1;
            f819a = i4 % 128;
            int i5 = i4 % 2;
            resourceAsStream.close();
        }
        Logger.getLogger().i("No version control information found");
        int i6 = f819a + 117;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private InputStream getResourceAsStream(String str) {
        int i = 2 % 2;
        int i2 = f819a + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        Logger.getLogger().w("Couldn't get Class Loader");
        int i4 = f819a + 113;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static byte[] readResource(InputStream inputStream) throws IOException {
        int i = 2 % 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                int i3 = asInterface + 93;
                f819a = i3 % 128;
                if (i3 % 2 == 0) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                } else {
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            int i4 = f819a + 1;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return byteArray;
            }
            throw null;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void finalizePreviousNativeSession(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        Logger.getLogger().v("Finalizing native report for session ".concat(String.valueOf(str)));
        NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (!(!nativeCoreAbsent(str, minidumpFile, applicationExitInto))) {
            int i4 = f819a + 75;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                Logger.getLogger().w("No native core present");
                throw null;
            }
            Logger.getLogger().w("No native core present");
            int i5 = f819a + 81;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
                return;
            }
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.fileStore, str);
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            int i7 = asInterface + 117;
            f819a = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        doWriteAppExceptionMarker(jLastModified);
        List<NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, this.fileStore, logFileManager.getBytesForLog());
        NativeSessionFileGzipper.processNativeSessions(nativeSessionDir, nativeSessionFiles);
        Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
        this.reportingCoordinator.finalizeSessionWithNativeEvent(str, nativeSessionFiles, applicationExitInto);
        logFileManager.clearLog();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    private static boolean nativeCoreAbsent(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        int i = 2 % 2;
        if (file != null) {
            int i2 = asInterface + 91;
            f819a = i2 % 128;
            int i3 = i2 % 2;
            if (!file.exists()) {
                Logger.getLogger().w("No minidump data found for session ".concat(String.valueOf(str)));
            }
        } else {
            Logger.getLogger().w("No minidump data found for session ".concat(String.valueOf(str)));
        }
        if (applicationExitInfo == null) {
            Logger.getLogger().i("No Tombstones data found for session ".concat(String.valueOf(str)));
            int i4 = asInterface + 15;
            f819a = i4 % 128;
            int i5 = i4 % 2;
        }
        if (file != null) {
            int i6 = asInterface + 123;
            f819a = i6 % 128;
            if (i6 % 2 == 0) {
                file.exists();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (file.exists()) {
                return false;
            }
        }
        return applicationExitInfo == null;
    }

    private static long getCurrentTimestampSeconds() {
        int i = 2 % 2;
        int i2 = f819a + 109;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return getTimestampSeconds(System.currentTimeMillis());
        }
        getTimestampSeconds(System.currentTimeMillis());
        throw null;
    }

    private static long getTimestampSeconds(long j) {
        int i = 2 % 2;
        int i2 = f819a;
        int i3 = i2 + 95;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j2 = j / 1000;
        int i5 = i2 + 49;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    private void doWriteAppExceptionMarker(long j) {
        int i = 2 % 2;
        try {
            FileStore fileStore = this.fileStore;
            StringBuilder sb = new StringBuilder(APP_EXCEPTION_MARKER_PREFIX);
            sb.append(j);
            if (!fileStore.getCommonFile(sb.toString()).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
            int i2 = f819a + 49;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 64 / 0;
            }
        } catch (IOException e2) {
            Logger.getLogger().w("Could not create app exception marker file.", e2);
        }
    }

    private static StaticSessionData.AppData createAppData(IdManager idManager, AppData appData) {
        int i = 2 % 2;
        int i2 = f819a + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        StaticSessionData.AppData appDataCreate = StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
        int i4 = f819a + 63;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return appDataCreate;
    }

    private static StaticSessionData.OsData createOsData() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        StaticSessionData.OsData osDataCreate = StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
        int i4 = asInterface + 117;
        f819a = i4 % 128;
        if (i4 % 2 != 0) {
            return osDataCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static StaticSessionData.DeviceData createDeviceData(Context context) {
        int i = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StaticSessionData.DeviceData deviceDataCreate = StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
        int i2 = f819a + 65;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceDataCreate;
        }
        throw null;
    }

    UserMetadata getUserMetadata() {
        int i = 2 % 2;
        int i2 = f819a;
        int i3 = i2 + 103;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        UserMetadata userMetadata = this.userMetadata;
        int i4 = i2 + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return userMetadata;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler) = 
  (r1v4 com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler)
  (r1v11 com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler)
 binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler;
        int i = 2 % 2;
        int i2 = f819a + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            crashlyticsUncaughtExceptionHandler = this.crashHandler;
            int i3 = 30 / 0;
            if (crashlyticsUncaughtExceptionHandler != null) {
                if (!(!crashlyticsUncaughtExceptionHandler.isHandlingException())) {
                    return true;
                }
            }
        } else {
            crashlyticsUncaughtExceptionHandler = this.crashHandler;
            if (crashlyticsUncaughtExceptionHandler != null) {
                if (!(!crashlyticsUncaughtExceptionHandler.isHandlingException())) {
                    return true;
                }
            }
        }
        int i4 = f819a + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private Task<Void> logAnalyticsAppExceptionEvents() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (File file : listAppExceptionMarkerFiles()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(Long.parseLong(file.getName().substring(3))));
                int i2 = asInterface + 105;
                f819a = i2 % 128;
                int i3 = i2 % 2;
            } catch (NumberFormatException unused) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Could not parse app exception timestamp from file ");
                sb.append(file.getName());
                logger.w(sb.toString());
            }
            file.delete();
        }
        Task<Void> taskWhenAll = Tasks.whenAll(arrayList);
        int i4 = asInterface + 107;
        f819a = i4 % 128;
        int i5 = i4 % 2;
        return taskWhenAll;
    }

    private Task<Void> logAnalyticsAppExceptionEvent(final long j) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        if (firebaseCrashExists()) {
            Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            Task<Void> taskForResult = Tasks.forResult(null);
            int i4 = asInterface + 95;
            f819a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
            return taskForResult;
        }
        Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt(CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
                bundle.putLong(CrashlyticsController.FIREBASE_TIMESTAMP, j);
                CrashlyticsController.access$1000(CrashlyticsController.this).logEvent(CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
                return null;
            }
        });
    }

    private static void deleteFiles(List<File> list) {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            int i4 = f819a + 115;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().delete();
                int i5 = 18 / 0;
            } else {
                it.next().delete();
            }
        }
    }

    private static boolean firebaseCrashExists() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            int i4 = f819a + 39;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        int i = 2 % 2;
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        File sessionFile3 = fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(nativeCoreFile(nativeSessionFileProvider));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", sessionFile));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new FileBackedNativeSessionFile("rollouts_file", "rollouts", sessionFile3));
        int i2 = asInterface + 119;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }

    private static NativeSessionFile nativeCoreFile(NativeSessionFileProvider nativeSessionFileProvider) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        f819a = i2 % 128;
        int i3 = i2 % 2;
        File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        if (minidumpFile != null) {
            int i4 = asInterface + 111;
            f819a = i4 % 128;
            int i5 = i4 % 2;
            if (minidumpFile.exists()) {
                return new FileBackedNativeSessionFile("minidump_file", "minidump", minidumpFile);
            }
        }
        BytesBackedNativeSessionFile bytesBackedNativeSessionFile = new BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0});
        int i6 = asInterface + 69;
        f819a = i6 % 128;
        int i7 = i6 % 2;
        return bytesBackedNativeSessionFile;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v21 java.util.List<android.app.ApplicationExitInfo>, still in use, count: 2, list:
          (r1v21 java.util.List<android.app.ApplicationExitInfo>) from 0x002d: INVOKE (r1v21 java.util.List<android.app.ApplicationExitInfo>) INTERFACE call: java.util.List.size():int A[MD:():int (c), WRAPPED]
          (r1v21 java.util.List<android.app.ApplicationExitInfo>) from 0x0047: PHI (r1 I:??) = (r1v13 java.util.List<android.app.ApplicationExitInfo>), (r1v21 java.util.List<android.app.ApplicationExitInfo>) binds: [B:10:0x0045, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private void writeApplicationExitInfoEventIfRelevant(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface = r2
            int r1 = r1 % r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L86
            int r1 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a = r2
            int r1 = r1 % r0
            java.lang.String r2 = "activity"
            r3 = 0
            if (r1 != 0) goto L34
            android.content.Context r1 = r6.context
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r2 = 1
            java.util.List r1 = r1.getHistoricalProcessExitReasons(r3, r2, r2)
            int r2 = r1.size()
            if (r2 == 0) goto L6b
            goto L47
        L34:
            android.content.Context r1 = r6.context
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r2 = 0
            java.util.List r1 = r1.getHistoricalProcessExitReasons(r3, r2, r2)
            int r2 = r1.size()
            if (r2 == 0) goto L6b
        L47:
            com.google.firebase.crashlytics.internal.metadata.LogFileManager r2 = new com.google.firebase.crashlytics.internal.metadata.LogFileManager
            com.google.firebase.crashlytics.internal.persistence.FileStore r4 = r6.fileStore
            r2.<init>(r4, r7)
            com.google.firebase.crashlytics.internal.persistence.FileStore r4 = r6.fileStore
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers r5 = r6.crashlyticsWorkers
            com.google.firebase.crashlytics.internal.metadata.UserMetadata r4 = com.google.firebase.crashlytics.internal.metadata.UserMetadata.loadFromExistingSession(r7, r4, r5)
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r5 = r6.reportingCoordinator
            r5.persistRelevantAppExitInfoEvent(r7, r1, r2, r4)
            int r7 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a
            int r7 = r7 + 39
            int r1 = r7 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L67
            return
        L67:
            r3.hashCode()
            throw r3
        L6b:
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.String r2 = "No ApplicationExitInfo available. Session: "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r2.concat(r7)
            r1.v(r7)
            int r7 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.f819a
            int r7 = r7 + 113
            int r1 = r7 % 128
            com.google.firebase.crashlytics.internal.common.CrashlyticsController.asInterface = r1
            int r7 = r7 % r0
            return
        L86:
            com.google.firebase.crashlytics.internal.Logger r7 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ANR feature enabled, but device is API "
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.writeApplicationExitInfoEventIfRelevant(java.lang.String):void");
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{47475, 47462, 47472, 47458, 47461, 47467, 47398, 47457, 47425, 47515, 47456, 47471, 47463, 47441, 47464, 47473, 47465, 47460, 47426};
        TuitionPaymentFragmentbindingInflater1 = 2047719700;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        b = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = com.google.firebase.crashlytics.internal.common.CrashlyticsController.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r6 = r6 + 67
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.$$e(byte, short, byte):java.lang.String");
    }
}
