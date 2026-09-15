package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class DataCollectionArbiter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    private Boolean crashlyticsDataCollectionEnabled;
    TaskCompletionSource<Void> dataCollectionEnabledTask;
    private final TaskCompletionSource<Void> dataCollectionExplicitlyApproved;
    private final FirebaseApp firebaseApp;
    private boolean setInManifest;
    private final SharedPreferences sharedPreferences;
    private final Object taskLock;
    boolean taskResolved;
    private static final byte[] $$d = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 17, 3, -58, 68, 1, 0, 21, 3, -12, 18, 10, -64, 74, -10, 12, -56, 58, 17, 8, -8, 11, 3, 16, -65, 68, 7, -6, 6, 12, 12, -64, 32, 42, -5, 16, 9, -13, 24, -43, 48, 3, 8, -6, 20, -4, 15, -30, 24, 17, 9, -11, 19, 6, -75, 42, 42, -5, 16, 9, -13, 24, -43, 48, 3, 8, -6, 20, -4, 15, -43, 46, 11, -6, 16, 10, 38, -7, 16, -6, 11, 4, -25, 22, 29, -7, -3, 14, 11, -41, 49, -12, 11, 11, -3, 14, 11, -13, 12, 10, -5, 10, 10, -2, -25, 42, -3, 11, -6, 24, -10, 18, -60};
    private static final int $$e = 225;
    private static final byte[] $$a = {27, 65, -33, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 245;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -4762795458172550515L;

    private static void a(short s, int i, short s2, Object[] objArr) {
        int i2 = s2 * 52;
        int i3 = (i * 52) + 4;
        int i4 = 103 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i4)) - 11;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + (-bArr[i3])) - 11;
            i3++;
            i6 = i7;
        }
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
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 38
            int r0 = 76 - r7
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r6 = r6 + 4
            byte[] r1 = com.google.firebase.crashlytics.internal.common.DataCollectionArbiter.$$d
            byte[] r0 = new byte[r0]
            int r7 = 75 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r6 = r6 + (-5)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.DataCollectionArbiter.d(short, byte, short, java.lang.Object[]):void");
    }

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.taskLock = obj;
        this.dataCollectionEnabledTask = new TaskCompletionSource<>();
        this.taskResolved = false;
        this.setInManifest = false;
        this.dataCollectionExplicitlyApproved = new TaskCompletionSource<>();
        Context applicationContext = firebaseApp.getApplicationContext();
        this.firebaseApp = firebaseApp;
        this.sharedPreferences = CommonUtils.getSharedPrefs(applicationContext);
        Boolean dataCollectionValueFromSharedPreferences = getDataCollectionValueFromSharedPreferences();
        this.crashlyticsDataCollectionEnabled = dataCollectionValueFromSharedPreferences == null ? getDataCollectionValueFromManifest(applicationContext) : dataCollectionValueFromSharedPreferences;
        synchronized (obj) {
            if (isAutomaticDataCollectionEnabled()) {
                this.dataCollectionEnabledTask.trySetResult(null);
                this.taskResolved = true;
            }
        }
    }

    public boolean isAutomaticDataCollectionEnabled() {
        boolean zIsFirebaseDataCollectionDefaultEnabled;
        synchronized (this) {
            Boolean bool = this.crashlyticsDataCollectionEnabled;
            if (bool != null) {
                zIsFirebaseDataCollectionDefaultEnabled = bool.booleanValue();
            } else {
                zIsFirebaseDataCollectionDefaultEnabled = isFirebaseDataCollectionDefaultEnabled();
            }
            logDataCollectionState(zIsFirebaseDataCollectionDefaultEnabled);
        }
        return zIsFirebaseDataCollectionDefaultEnabled;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 69;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 19472), 2624 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - (ViewConfiguration.getPressedStateDuration() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 39422), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 481, 36 - TextUtils.indexOf((CharSequence) "", '0'), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19471), Color.argb(0, 0, 0, 0) + 2624, 13 - View.combineMeasuredStates(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39421), (Process.myPid() >> 22) + 481, 37 - TextUtils.indexOf("", "", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((Process.myTid() >> 22) + 39422), ImageFormat.getBitsPerPixel(0) + 482, 37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    private boolean isFirebaseDataCollectionDefaultEnabled() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
        b = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                this.firebaseApp.isDataCollectionDefaultEnabled();
                obj.hashCode();
                throw null;
            }
            boolean zIsDataCollectionDefaultEnabled = this.firebaseApp.isDataCollectionDefaultEnabled();
            int i3 = b + 29;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                return zIsDataCollectionDefaultEnabled;
            }
            obj.hashCode();
            throw null;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public void setCrashlyticsDataCollectionEnabled(Boolean bool) {
        synchronized (this) {
            if (bool != null) {
                try {
                    this.setInManifest = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.crashlyticsDataCollectionEnabled = bool != null ? bool : getDataCollectionValueFromManifest(this.firebaseApp.getApplicationContext());
            storeDataCollectionValueInSharedPreferences(this.sharedPreferences, bool);
            synchronized (this.taskLock) {
                if (isAutomaticDataCollectionEnabled()) {
                    if (!this.taskResolved) {
                        this.dataCollectionEnabledTask.trySetResult(null);
                        this.taskResolved = true;
                    }
                } else if (this.taskResolved) {
                    this.dataCollectionEnabledTask = new TaskCompletionSource<>();
                    this.taskResolved = false;
                }
            }
        }
    }

    public Task<Void> waitForAutomaticDataCollectionEnabled() {
        Task<Void> task;
        synchronized (this.taskLock) {
            task = this.dataCollectionEnabledTask.getTask();
        }
        return task;
    }

    public Task<Void> waitForDataCollectionPermission() {
        int i = 2 % 2;
        int i2 = b + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        TaskCompletionSource<Void> taskCompletionSource = this.dataCollectionExplicitlyApproved;
        if (i3 == 0) {
            return CrashlyticsTasks.race(taskCompletionSource.getTask(), waitForAutomaticDataCollectionEnabled());
        }
        CrashlyticsTasks.race(taskCompletionSource.getTask(), waitForAutomaticDataCollectionEnabled());
        throw null;
    }

    public void grantDataCollectionPermission(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        int i5 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            this.dataCollectionExplicitlyApproved.trySetResult(null);
        } else {
            this.dataCollectionExplicitlyApproved.trySetResult(null);
            int i6 = 35 / 0;
        }
    }

    private void logDataCollectionState(boolean z) {
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.crashlyticsDataCollectionEnabled == null) {
            str2 = "global Firebase setting";
        } else {
            str2 = this.setInManifest ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        Logger.getLogger().d(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    private Boolean getDataCollectionValueFromSharedPreferences() {
        int i = 2 % 2;
        if (!this.sharedPreferences.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            int i2 = b + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = b + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            this.setInManifest = false;
            return Boolean.valueOf(this.sharedPreferences.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, false));
        }
        this.setInManifest = false;
        return Boolean.valueOf(this.sharedPreferences.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01d2  */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    private Boolean getDataCollectionValueFromManifest(Context context) throws Throwable {
        Context applicationContext;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 876;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
            byte b2 = (byte) ($$b & 15);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b2, bArr[7], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, iIndexOf, iResolveOpacity, 252381699, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{44023, 19757, 26200, 8091, 12461, 10710, 49932, 58475, 40273, 46744, 45034, 16610, 31251, 4916, 13380, 11656, 50859, 65520, 37120, 35382, 41809, 17540}, ExpandableListView.getPackedPositionGroup(0L) + 59093, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{44019, 13881, 36977, 29359, 56553, 48956, 6496, 64401, 17899, 8236, 33380, 27779, 52955, 43292, 2905}, 40387 - Color.argb(0, 0, 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int iIndexOf2 = TextUtils.indexOf("", "") + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[10];
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, windowTouchSlop, iIndexOf2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 10;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                byte b6 = bArr3[5];
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, maxKeyCode, offsetBefore, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = (~(824748656 | iIdentityHashCode)) | 42418181;
            int i3 = ~iIdentityHashCode;
            int i4 = (((204199558 + ((i2 | (~((-2107953) | i3))) * 886)) + (((~(i3 | (-824748657))) | 865058885) * (-1772))) + ((~(i3 | 865058885)) * 886)) - 131872687;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            if (context == null) {
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                int i7 = b + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                if (i7 % 2 != 0) {
                    ((ContextWrapper) context).getBaseContext();
                    obj.hashCode();
                    throw null;
                }
                if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext = context.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = context.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            c(new char[]{44028, 33120, 65230, 54322, 484, 32521, 21629, 33241, 65353, 54519, 547, 32658, 21745, 33353, 65457, 54562}, 10902 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{44031, 5377, 54805, 38689, 20526, 4416, 53840, 37706, 23622, 7548, 56987, 40847, 22705, 6574, 55992, 39886}, 48882 - ImageFormat.getBitsPerPixel(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = b + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(iIntValue), -131872687};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[8];
                Object[] objArr11 = new Object[1];
                d((byte) (-b7), bArr4[9], b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d(bArr4[16], bArr4[8], bArr4[9], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                        int iMyTid = 10 - (Process.myTid() >> 22);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        byte b9 = bArr5[5];
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, b9, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iKeyCodeFromString, iMyTid, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{44023, 19757, 26200, 8091, 12461, 10710, 49932, 58475, 40273, 46744, 45034, 16610, 31251, 4916, 13380, 11656, 50859, 65520, 37120, 35382, 41809, 17540}, 59093 - KeyEvent.keyCodeFromString(""), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{44019, 13881, 36977, 29359, 56553, 48956, 6496, 64401, 17899, 8236, 33380, 27779, 52955, 43292, 2905}, 40387 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 10;
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[10];
                            byte b11 = bArr6[7];
                            Object[] objArr17 = new Object[1];
                            a(b10, b11, b11, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, doubleTapTimeout, iResolveOpacity2, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i10 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                            byte b12 = (byte) ($$b & 15);
                            byte[] bArr7 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(b12, bArr7[7], bArr7[5], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i10, iResolveSizeAndState, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 != i11) {
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i14 = ~System.identityHashCode(this);
        int i15 = i13 + 1595882950 + (((~(621629564 | i14)) | (-661939794)) * (-983)) + (((~(i14 | (-661939794))) | 621035600) * 983);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr19[1])[0] = i17 ^ (i17 << 5);
        Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(context);
        if (crashlyticsDataCollectionEnabledFromManifest != null) {
            this.setInManifest = true;
            return Boolean.valueOf(Boolean.TRUE.equals(crashlyticsDataCollectionEnabledFromManifest));
        }
        int i18 = ((int[]) objArr19[1])[0];
        int i19 = i18 * i18;
        int i20 = -(464934902 * i18);
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        int i22 = -(i18 * (-1393225514));
        int i23 = (i21 & i22) + (i22 | i21);
        int i24 = (i23 & (-86271836)) + ((-86271836) | i23);
        int i25 = i24 >> 23;
        int i26 = ((i25 ^ (-1023)) + ((i25 & (-1023)) << 1)) / 512;
        int i27 = (i26 ^ 1) + ((i26 & 1) << 1);
        int i28 = (i25 - 1023) / 512;
        int i29 = (-(((i24 ^ i27) + ((i24 & i27) << 1)) ^ ((i28 & 1) + (i28 | 1)))) + 4;
        int i30 = i29 >> 15;
        int i31 = ((((-262143) | i30) << 1) - (i30 ^ (-262143))) / 131072;
        int i32 = (i31 & 1) + (i31 | 1);
        this.setInManifest = 0 / ((i29 & (-(((i32 | 1) << 1) - (i32 ^ 1)))) * 288);
        return null;
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
        int i = 2 % 2;
        Object obj = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                b = i2 % 128;
                int i3 = i2 % 2;
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null) {
                    int i4 = b + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 != 0) {
                        Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                        obj.hashCode();
                        throw null;
                    }
                    if (((PackageItemInfo) applicationInfo).metaData != null && ((PackageItemInfo) applicationInfo).metaData.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                        return Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.getLogger().e("Could not read data collection permission from manifest", e2);
        }
        return null;
    }

    private static void storeDataCollectionValueInSharedPreferences(SharedPreferences sharedPreferences, Boolean bool) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            sharedPreferences.edit();
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, bool.booleanValue());
        } else {
            editorEdit.remove(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED);
            int i3 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 5;
            }
        }
        editorEdit.apply();
    }
}
