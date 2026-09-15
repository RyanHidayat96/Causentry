package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$$ExternalSyntheticLambda0;
import androidx.work.WorkInfo;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.setAspectRatio;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigCacheClient {
    static final long DISK_READ_TIMEOUT_IN_SECONDS = 5;
    private Task<ConfigContainer> cachedContainerTask = null;
    private final Executor executor;
    private final ConfigStorageClient storageClient;
    private static final Map<String, ConfigCacheClient> clientInstances = new HashMap();
    private static final Executor DIRECT_EXECUTOR = new AdIdManagerImplCommon$$ExternalSyntheticLambda0();

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.executor = executor;
        this.storageClient = configStorageClient;
    }

    public ConfigContainer getBlocking() {
        return getBlocking(5L);
    }

    ConfigContainer getBlocking(long j) {
        synchronized (this) {
            Task<ConfigContainer> task = this.cachedContainerTask;
            if (task != null && task.isSuccessful()) {
                return this.cachedContainerTask.getResult();
            }
            try {
                return (ConfigContainer) await(get(), j, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return null;
            }
        }
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    /* JADX INFO: renamed from: lambda$put$0$com-google-firebase-remoteconfig-internal-ConfigCacheClient, reason: not valid java name */
    /* synthetic */ Void m7991xddaae01c(ConfigContainer configContainer) throws Exception {
        return this.storageClient.write(configContainer);
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m7991xddaae01c(configContainer);
            }
        }).onSuccessTask(this.executor, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda1
            private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
            private static final int $$d = 195;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {57, -50, -56, -93, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 215;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int asBinder = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47317, 47304, 47314, 47300, 47303, 47309, 47240, 47315, 47298, 47313, 47283, 47358, 47311, 47285, 47302, 47306, 47277, 47312, 47305, 47299, 47239, 47307, 47241, 47316, 47297, 47237};
            private static int b = 2047719542;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = 145 - r7
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    byte[] r0 = com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda1.$$a
                    int r6 = 53 - r6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r8
                    r5 = r2
                    r8 = r6
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L23:
                    r3 = r0[r7]
                L25:
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    int r8 = r8 + (-11)
                    r3 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda1.c(byte, int, short, java.lang.Object[]):void");
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) throws Exception {
                int i = 2 % 2;
                int i2 = asBinder + 81;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                Task taskM7992x9820809d = this.f$0.m7992x9820809d(z, configContainer, (Void) obj);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    return taskM7992x9820809d;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i2 = 2;
                int i3 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                long j = 0;
                int i4 = 0;
                if (cArr3 != null) {
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $10 + 21;
                        $11 = i6 % 128;
                        int i7 = i6 % i2;
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i4] = Integer.valueOf(cArr3[i5]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31339);
                                int i8 = 2995 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                                int iIndexOf = 16 - TextUtils.indexOf((CharSequence) "", '0', i4);
                                byte b2 = (byte) ($$d & 5);
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, i8, iIndexOf, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr4[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i5++;
                            i2 = 2;
                            j = 0;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                Object[] objArr3 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                float f = 0.0f;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 253, 22 - TextUtils.getOffsetAfter("", 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 3085, 26 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        f = 0.0f;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    int i9 = $10 + 25;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    } else {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    }
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i10 = $10 + 35;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33602), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085, 26 - Color.red(0), -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i12 = 0;
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:122:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x02b8  */
            /* JADX WARN: Code duplicated, block: B:36:0x02be  */
            /* JADX WARN: Code duplicated, block: B:40:0x02d3  */
            /* JADX WARN: Code duplicated, block: B:44:0x0308 A[Catch: all -> 0x0421, TryCatch #1 {all -> 0x0421, blocks: (B:42:0x02fb, B:44:0x0308, B:45:0x0348), top: B:115:0x02fb, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:57:0x042c A[Catch: Exception -> 0x05cc, TRY_LEAVE, TryCatch #3 {Exception -> 0x05cc, blocks: (B:49:0x03ab, B:53:0x0424, B:55:0x042a, B:56:0x042b, B:57:0x042c, B:61:0x048e, B:67:0x051d, B:69:0x0543, B:74:0x05b9, B:78:0x05c2, B:80:0x05c8, B:81:0x05c9, B:68:0x052d, B:62:0x04ad, B:70:0x0565, B:72:0x0572, B:73:0x05b2, B:42:0x02fb, B:44:0x0308, B:45:0x0348), top: B:119:0x02d1, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:60:0x0483  */
            /* JADX WARN: Code duplicated, block: B:62:0x04ad A[Catch: Exception -> 0x05cc, TRY_LEAVE, TryCatch #3 {Exception -> 0x05cc, blocks: (B:49:0x03ab, B:53:0x0424, B:55:0x042a, B:56:0x042b, B:57:0x042c, B:61:0x048e, B:67:0x051d, B:69:0x0543, B:74:0x05b9, B:78:0x05c2, B:80:0x05c8, B:81:0x05c9, B:68:0x052d, B:62:0x04ad, B:70:0x0565, B:72:0x0572, B:73:0x05b2, B:42:0x02fb, B:44:0x0308, B:45:0x0348), top: B:119:0x02d1, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:66:0x0517  */
            /* JADX WARN: Code duplicated, block: B:68:0x052d A[Catch: Exception -> 0x05cc, TryCatch #3 {Exception -> 0x05cc, blocks: (B:49:0x03ab, B:53:0x0424, B:55:0x042a, B:56:0x042b, B:57:0x042c, B:61:0x048e, B:67:0x051d, B:69:0x0543, B:74:0x05b9, B:78:0x05c2, B:80:0x05c8, B:81:0x05c9, B:68:0x052d, B:62:0x04ad, B:70:0x0565, B:72:0x0572, B:73:0x05b2, B:42:0x02fb, B:44:0x0308, B:45:0x0348), top: B:119:0x02d1, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:72:0x0572 A[Catch: all -> 0x05c1, TryCatch #0 {all -> 0x05c1, blocks: (B:70:0x0565, B:72:0x0572, B:73:0x05b2), top: B:113:0x0565, outer: #3 }] */
            /* JADX WARN: Code duplicated, block: B:76:0x05bf  */
            /* JADX WARN: Code duplicated, block: B:83:0x05cc A[PHI: r20
  0x05cc: PHI (r20v3 int) = (r20v2 int), (r20v6 int), (r20v6 int) binds: [B:82:0x05ca, B:112:0x05cc, B:75:0x05bd] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:86:0x05ef  */
            /* JADX WARN: Code duplicated, block: B:87:0x05f9  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
                int i4;
                int i5;
                int i6;
                int i7;
                Object[] objArr;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int scrollDefaultDelay;
                int i14;
                int i15;
                int i16;
                int i17;
                String str;
                int i18;
                int i19;
                int iB;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Class<?> cls;
                int tapTimeout;
                int i28 = 2 % 2;
                if (context != null) {
                    int i29 = TuitionPaymentFragmentbindingInflater1;
                    int i30 = ((i29 | 11) << 1) - (i29 ^ 11);
                    int i31 = i30 % 128;
                    asBinder = i31;
                    int i32 = i30 % 2;
                    int i33 = (i31 & 39) + (i31 | 39);
                    TuitionPaymentFragmentbindingInflater1 = i33 % 128;
                    int i34 = i33 % 2;
                    try {
                        int i35 = -ExpandableListView.getPackedPositionGroup(0L);
                        int iB2 = setAspectRatio.AnonymousClass6.b();
                        int i36 = i35 * (-559);
                        int i37 = (i36 ^ 71247) + ((i36 & 71247) << 1);
                        int i38 = ~iB2;
                        int i39 = asBinder + 51;
                        int i40 = i39 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i40;
                        int i41 = i39 % 2;
                        int i42 = (-560) * (~(i38 | i35));
                        int i43 = (i37 & i42) + (i42 | i37);
                        int i44 = ((-128) & i35) | ((-128) ^ i35);
                        int i45 = -(-((~((i44 & iB2) | (i44 ^ iB2))) * (-560)));
                        int i46 = (i43 & i45) + (i43 | i45);
                        int i47 = ~((~i35) | 127);
                        int i48 = ~iB2;
                        int i49 = (i40 & 37) + (i40 | 37);
                        asBinder = i49 % 128;
                        int i50 = i49 % 2;
                        int i51 = ~((i48 & 127) | (i48 ^ 127));
                        int i52 = -(-(560 * ((i47 & i51) | (i47 ^ i51))));
                        Object[] objArr3 = new Object[1];
                        a(null, null, (i46 ^ i52) + ((i52 & i46) << 1), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        int mode = View.MeasureSpec.getMode(0);
                        Object[] objArr4 = new Object[1];
                        a(null, null, (mode ^ 127) + ((mode & 127) << 1), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr4);
                        Object objInvoke = cls2.getMethod((String) objArr4[0], null).invoke(context, null);
                        int threadPriority = Process.getThreadPriority(0);
                        int iB3 = setAspectRatio.AnonymousClass6.b();
                        int i53 = 16579 - (~(threadPriority * 829));
                        int i54 = asBinder;
                        int i55 = (i54 & 121) + (i54 | 121);
                        TuitionPaymentFragmentbindingInflater1 = i55 % 128;
                        int i56 = i55 % 2;
                        int i57 = ~threadPriority;
                        int i58 = ~(((-21) ^ i57) | (i57 & (-21)));
                        int i59 = ~iB3;
                        int i60 = (i59 ^ 20) | (i59 & 20);
                        int i61 = -(-((-828) * (i58 | (~((i60 ^ threadPriority) | (i60 & threadPriority))))));
                        int i62 = (i53 & i61) + (i53 | i61);
                        int i63 = (20 & threadPriority) | (20 ^ threadPriority);
                        int i64 = ~iB3;
                        int i65 = (i64 & i63) | (i63 ^ i64);
                        int i66 = ((i54 | 63) << 1) - (i54 ^ 63);
                        TuitionPaymentFragmentbindingInflater1 = i66 % 128;
                        if (i66 % 2 != 0) {
                            int i67 = -i65;
                            Object[] objArr5 = new Object[1];
                            a(null, null, 127 % (((i62 >> ((i67 & (-828)) + (i67 | (-828)))) >>> (828 >>> (~i63))) >>> 72), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr5);
                            cls = Class.forName((String) objArr5[0]);
                            tapTimeout = 84 / (ViewConfiguration.getTapTimeout() >> 112);
                        } else {
                            int i68 = -(((((i62 - (~(-(-(i65 * (-828)))))) - 1) - (~(-(-((~i63) * 828))))) - 1) >> 6);
                            Object[] objArr6 = new Object[1];
                            a(null, null, (i68 ^ 127) + ((i68 & 127) << 1), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr6);
                            cls = Class.forName((String) objArr6[0]);
                            int i69 = -(ViewConfiguration.getTapTimeout() >> 16);
                            tapTimeout = (i69 ^ 127) + ((i69 & 127) << 1);
                        }
                        Object[] objArr7 = new Object[1];
                        a(null, null, tapTimeout, new byte[]{-108, -115, -127, -112, -110}, objArr7);
                        int i70 = cls.getField((String) objArr7[0]).getInt(objInvoke) & 2;
                        int i71 = (~(i & 1)) & (i | 1);
                        int i72 = -i70;
                        int i73 = ((i70 & i72) | (i70 ^ i72)) >> 31;
                        int i74 = ~i73;
                        int i75 = TuitionPaymentFragmentbindingInflater1;
                        int i76 = i75 + 117;
                        asBinder = i76 % 128;
                        int i77 = i76 % 2;
                        int i78 = i74 & i;
                        int i79 = i73 & i71;
                        int i80 = (i75 ^ 85) + ((i75 & 85) << 1);
                        asBinder = i80 % 128;
                        int i81 = i80 % 2;
                        i4 = (i79 & i78) | (i78 ^ i79);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i4 = i;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char packedPositionGroup = (char) (16949 - ExpandableListView.getPackedPositionGroup(0L));
                        int i82 = 2740 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i83 = 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr = $$a;
                        byte b2 = bArr[7];
                        Object[] objArr8 = new Object[1];
                        c(b2, (short) (b2 | 141), bArr[132], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, i82, i83, 1501733736, false, (String) objArr8[0], new Class[0]);
                    }
                    Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup2 = (char) (16949 - ExpandableListView.getPackedPositionGroup(0L));
                        int iBlue = 2739 - Color.blue(0);
                        int i84 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12;
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[7];
                        Object[] objArr9 = new Object[1];
                        c(b3, (short) (b3 | 89), bArr2[132], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup2, iBlue, i84, 47863026, false, (String) objArr9[0], null);
                    }
                    Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                    int i85 = asBinder + 17;
                    TuitionPaymentFragmentbindingInflater1 = i85 % 128;
                    int i86 = i85 % 2;
                    if (!set.contains(obj)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 16949);
                            int mirror = AndroidCharacter.getMirror('0') + 2691;
                            int i87 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13;
                            byte[] bArr3 = $$a;
                            Object[] objArr10 = new Object[1];
                            c((byte) (bArr3[33] - 1), (short) 37, bArr3[132], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, mirror, i87, 631063962, false, (String) objArr10[0], null);
                        }
                        if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i88 = asBinder;
                                int i89 = ((i88 | 27) << 1) - (i88 ^ 27);
                                TuitionPaymentFragmentbindingInflater1 = i89 % 128;
                                int i90 = i89 % 2;
                                Object[] objArr11 = new Object[1];
                                a(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr11);
                                Object[] objArr12 = {(String) objArr11[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                    int windowTouchSlop = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                                    short s = $$a[7];
                                    Object[] objArr13 = new Object[1];
                                    c((byte) 52, s, (byte) s, objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, windowTouchSlop, longPressTimeout, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                                long j = 1245469057;
                                long j2 = -1;
                                long j3 = j ^ j2;
                                i6 = i4;
                                long startUptimeMillis = (int) Process.getStartUptimeMillis();
                                long j4 = startUptimeMillis ^ j2;
                                long j5 = (((long) TypedValues.Custom.TYPE_DIMENSION) * j) + (((long) (-903)) * jLongValue) + (((long) (-1808)) * (((j3 | startUptimeMillis) ^ j2) | ((j4 | jLongValue) ^ j2)));
                                long j6 = TypedValues.Custom.TYPE_BOOLEAN;
                                long j7 = jLongValue ^ j2;
                                long j8 = j4 | j;
                                long j9 = j5 + (((((j3 | j7) | startUptimeMillis) ^ j2) | ((j8 | jLongValue) ^ j2)) * j6) + (j6 * (((j3 | jLongValue) ^ j2) | ((j7 | startUptimeMillis) ^ j2) | (j8 ^ j2))) + ((long) (-1446387294));
                                int i91 = (int) (j9 >> 32);
                                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                int i92 = ~(36038159 | startElapsedRealtime);
                                int i93 = ~startElapsedRealtime;
                                int i94 = i91 & ((-1454325938) + ((i92 | (~((-2475014) | i93))) * (-406)) + ((~(1475739583 | i93)) * (-406)) + (((~(startElapsedRealtime | (-1473264571))) | (~((-36038160) | i93))) * 406));
                                int i95 = (int) j9;
                                int i96 = (int) Runtime.getRuntime().totalMemory();
                                int i97 = ~((-1684622158) | i96);
                                int i98 = 1453776913 + ((536936517 | i97) * (-280)) + ((i97 | (~((-1173118729) | i96))) * 140);
                                int i99 = ~((-1147685641) | i96);
                                int i100 = ~i96;
                                int i101 = i95 & (i98 + (((~(i100 | (-25433089))) | i99 | (~((-536936518) | i100))) * 140));
                                i11 = (i94 & i101) | (i94 ^ i101);
                                int i102 = TuitionPaymentFragmentbindingInflater1 + 79;
                                asBinder = i102 % 128;
                                int i103 = i102 % 2;
                            } else {
                                i6 = i4;
                                scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                int iB4 = setAspectRatio.AnonymousClass6.b();
                                int i104 = scrollDefaultDelay * 375;
                                int i105 = (i104 ^ (-94869)) + ((i104 & (-94869)) << 1);
                                int i106 = ~scrollDefaultDelay;
                                int i107 = ~(i106 | 127);
                                int i108 = ~((~iB4) | scrollDefaultDelay);
                                int i109 = (i105 - (~(-(-(((i107 & i108) | (i107 ^ i108)) * (-374)))))) - 1;
                                int i110 = asBinder;
                                int i111 = (i110 & 109) + (i110 | 109);
                                TuitionPaymentFragmentbindingInflater1 = i111 % 128;
                                int i112 = i111 % 2;
                                i14 = (i109 - (~(748 * (~((-128) | scrollDefaultDelay))))) - 1;
                                i15 = ~(i106 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                i16 = ~iB4;
                                i17 = (i110 & 67) + (i110 | 67);
                                TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    int i113 = ~(scrollDefaultDelay | i16);
                                    int i114 = i14 >>> (374 << ((i113 & i15) | (i15 ^ i113)));
                                    Object[] objArr14 = new Object[1];
                                    a(null, null, i114, new byte[]{-102}, objArr14);
                                    str = (String) objArr14[0];
                                    i19 = -(ViewConfiguration.getTouchSlop() >> 48);
                                    iB = setAspectRatio.AnonymousClass6.b();
                                    i18 = 106;
                                } else {
                                    int i115 = ((~((scrollDefaultDelay & i16) | (i16 ^ scrollDefaultDelay))) | i15) * 374;
                                    Object[] objArr15 = new Object[1];
                                    a(null, null, (i14 & i115) + (i115 | i14), new byte[]{-102}, objArr15);
                                    str = (String) objArr15[0];
                                    i18 = 127;
                                    i19 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    iB = setAspectRatio.AnonymousClass6.b();
                                }
                                int i116 = i19 * (-523);
                                int i117 = i18 * 263;
                                int i118 = (i116 ^ i117) + ((i116 & i117) << 1);
                                i20 = ~i19;
                                int i119 = ~(i20 | i18);
                                i21 = ~i18;
                                int i120 = asBinder;
                                int i121 = i120 + 107;
                                TuitionPaymentFragmentbindingInflater1 = i121 % 128;
                                int i122 = i121 % 2;
                                int i123 = ~(i21 | i19);
                                int i124 = (i119 & i123) | (i119 ^ i123);
                                int i125 = ~((~i18) | iB);
                                int i126 = 262 * ((i124 & i125) | (i124 ^ i125));
                                i22 = (i118 ^ i126) + ((i118 & i126) << 1);
                                i23 = (i21 ^ i19) | (i21 & i19);
                                i24 = i120 + 25;
                                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                if (i24 % 2 != 0) {
                                    i25 = i22 / ((-787) - (~(-(-(~i23)))));
                                    int i127 = ~iB;
                                    int i128 = ~((i127 & i21) | (i21 ^ i127));
                                    int i129 = ~((i20 ^ i18) | (i20 & i18));
                                    i26 = i128 ^ i129;
                                    i27 = i128 & i129;
                                } else {
                                    int i130 = -(-((~i23) * (-786)));
                                    i25 = (i22 & i130) + (i130 | i22);
                                    int i131 = ~iB;
                                    int i132 = ~((i131 & i21) | (i21 ^ i131));
                                    int i133 = ~((~i19) | i18);
                                    i26 = i132 ^ i133;
                                    i27 = i133 & i132;
                                }
                                int i134 = i27 | i26;
                                int i135 = ~i23;
                                int i136 = -(-(262 * ((i134 & i135) | (i134 ^ i135))));
                                Object[] objArr16 = new Object[1];
                                a(null, null, (i25 & i136) + (i136 | i25), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr16);
                                objArr2 = new Object[]{(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char gidForName = (char) (Process.getGidForName("") + 33603);
                                    int i137 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int iBlue2 = 26 - Color.blue(0);
                                    short s2 = $$a[7];
                                    Object[] objArr17 = new Object[1];
                                    c((byte) 52, s2, (byte) s2, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, i137, iBlue2, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                            }
                            int i138 = -i11;
                            int i139 = ((i11 & i138) | (i11 ^ i138)) >> 31;
                            int i140 = (i139 & ((i & (-11)) | ((~i) & 10))) | ((~i139) & i);
                            int i141 = TuitionPaymentFragmentbindingInflater1;
                            i12 = (i141 ^ 103) + ((i141 & 103) << 1);
                            asBinder = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i142 = i2 & 38;
                                int i143 = -i142;
                                i13 = ((i142 & i143) | (i142 ^ i143)) + 48;
                            } else {
                                int i144 = i2 & 32;
                                i13 = (i144 | (-i144)) >> 31;
                            }
                            int i145 = i140 & (~i13);
                            int i146 = i13 & i;
                            i5 = (i145 & i146) | (i145 ^ i146);
                        } else if (Build.VERSION.SDK_INT == 30) {
                            int i147 = TuitionPaymentFragmentbindingInflater1 + 71;
                            asBinder = i147 % 128;
                            int i148 = i147 % 2;
                            i5 = i;
                            i6 = i4;
                        } else {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i810 = asBinder;
                                int i811 = ((i810 | 27) << 1) - (i810 ^ 27);
                                TuitionPaymentFragmentbindingInflater1 = i811 % 128;
                                int i910 = i811 % 2;
                                Object[] objArr18 = new Object[1];
                                a(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr18);
                                Object[] objArr19 = {(String) objArr18[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                    int windowTouchSlop2 = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                                    short s3 = $$a[7];
                                    Object[] objArr110 = new Object[1];
                                    c((byte) 52, s3, (byte) s3, objArr110);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, windowTouchSlop2, longPressTimeout2, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                                }
                                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr19)).longValue();
                                long j10 = 1245469057;
                                long j11 = -1;
                                long j12 = j10 ^ j11;
                                i6 = i4;
                                long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                long j13 = startUptimeMillis2 ^ j11;
                                long j14 = (((long) TypedValues.Custom.TYPE_DIMENSION) * j10) + (((long) (-903)) * jLongValue2) + (((long) (-1808)) * (((j12 | startUptimeMillis2) ^ j11) | ((j13 | jLongValue2) ^ j11)));
                                long j15 = TypedValues.Custom.TYPE_BOOLEAN;
                                long j16 = jLongValue2 ^ j11;
                                long j17 = j13 | j10;
                                long j18 = j14 + (((((j12 | j16) | startUptimeMillis2) ^ j11) | ((j17 | jLongValue2) ^ j11)) * j15) + (j15 * (((j12 | jLongValue2) ^ j11) | ((j16 | startUptimeMillis2) ^ j11) | (j17 ^ j11))) + ((long) (-1446387294));
                                int i911 = (int) (j18 >> 32);
                                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                int i912 = ~(36038159 | startElapsedRealtime2);
                                int i913 = ~startElapsedRealtime2;
                                int i914 = i911 & ((-1454325938) + ((i912 | (~((-2475014) | i913))) * (-406)) + ((~(1475739583 | i913)) * (-406)) + (((~(startElapsedRealtime2 | (-1473264571))) | (~((-36038160) | i913))) * 406));
                                int i915 = (int) j18;
                                int i916 = (int) Runtime.getRuntime().totalMemory();
                                int i917 = ~((-1684622158) | i916);
                                int i918 = 1453776913 + ((536936517 | i917) * (-280)) + ((i917 | (~((-1173118729) | i916))) * 140);
                                int i919 = ~((-1147685641) | i916);
                                int i1010 = ~i916;
                                int i1011 = i915 & (i918 + (((~(i1010 | (-25433089))) | i919 | (~((-536936518) | i1010))) * 140));
                                i11 = (i914 & i1011) | (i914 ^ i1011);
                                int i1012 = TuitionPaymentFragmentbindingInflater1 + 79;
                                asBinder = i1012 % 128;
                                int i1013 = i1012 % 2;
                            } else {
                                i6 = i4;
                                scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                int iB5 = setAspectRatio.AnonymousClass6.b();
                                int i1014 = scrollDefaultDelay * 375;
                                int i1015 = (i1014 ^ (-94869)) + ((i1014 & (-94869)) << 1);
                                int i1016 = ~scrollDefaultDelay;
                                int i1017 = ~(i1016 | 127);
                                int i1018 = ~((~iB5) | scrollDefaultDelay);
                                int i1019 = (i1015 - (~(-(-(((i1017 & i1018) | (i1017 ^ i1018)) * (-374)))))) - 1;
                                int i1110 = asBinder;
                                int i1111 = (i1110 & 109) + (i1110 | 109);
                                TuitionPaymentFragmentbindingInflater1 = i1111 % 128;
                                int i1112 = i1111 % 2;
                                i14 = (i1019 - (~(748 * (~((-128) | scrollDefaultDelay))))) - 1;
                                i15 = ~(i1016 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                i16 = ~iB5;
                                i17 = (i1110 & 67) + (i1110 | 67);
                                TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    int i1113 = ~(scrollDefaultDelay | i16);
                                    int i1114 = i14 >>> (374 << ((i1113 & i15) | (i15 ^ i1113)));
                                    Object[] objArr111 = new Object[1];
                                    a(null, null, i1114, new byte[]{-102}, objArr111);
                                    str = (String) objArr111[0];
                                    i19 = -(ViewConfiguration.getTouchSlop() >> 48);
                                    iB = setAspectRatio.AnonymousClass6.b();
                                    i18 = 106;
                                } else {
                                    int i1115 = ((~((scrollDefaultDelay & i16) | (i16 ^ scrollDefaultDelay))) | i15) * 374;
                                    Object[] objArr112 = new Object[1];
                                    a(null, null, (i14 & i1115) + (i1115 | i14), new byte[]{-102}, objArr112);
                                    str = (String) objArr112[0];
                                    i18 = 127;
                                    i19 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    iB = setAspectRatio.AnonymousClass6.b();
                                }
                                int i1116 = i19 * (-523);
                                int i1117 = i18 * 263;
                                int i1118 = (i1116 ^ i1117) + ((i1116 & i1117) << 1);
                                i20 = ~i19;
                                int i1119 = ~(i20 | i18);
                                i21 = ~i18;
                                int i1210 = asBinder;
                                int i1211 = i1210 + 107;
                                TuitionPaymentFragmentbindingInflater1 = i1211 % 128;
                                int i1212 = i1211 % 2;
                                int i1213 = ~(i21 | i19);
                                int i1214 = (i1119 & i1213) | (i1119 ^ i1213);
                                int i1215 = ~((~i18) | iB);
                                int i1216 = 262 * ((i1214 & i1215) | (i1214 ^ i1215));
                                i22 = (i1118 ^ i1216) + ((i1118 & i1216) << 1);
                                i23 = (i21 ^ i19) | (i21 & i19);
                                i24 = i1210 + 25;
                                TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                if (i24 % 2 != 0) {
                                    i25 = i22 / ((-787) - (~(-(-(~i23)))));
                                    int i1217 = ~iB;
                                    int i1218 = ~((i1217 & i21) | (i21 ^ i1217));
                                    int i1219 = ~((i20 ^ i18) | (i20 & i18));
                                    i26 = i1218 ^ i1219;
                                    i27 = i1218 & i1219;
                                } else {
                                    int i1310 = -(-((~i23) * (-786)));
                                    i25 = (i22 & i1310) + (i1310 | i22);
                                    int i1311 = ~iB;
                                    int i1312 = ~((i1311 & i21) | (i21 ^ i1311));
                                    int i1313 = ~((~i19) | i18);
                                    i26 = i1312 ^ i1313;
                                    i27 = i1313 & i1312;
                                }
                                int i1314 = i27 | i26;
                                int i1315 = ~i23;
                                int i1316 = -(-(262 * ((i1314 & i1315) | (i1314 ^ i1315))));
                                Object[] objArr113 = new Object[1];
                                a(null, null, (i25 & i1316) + (i1316 | i25), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr113);
                                objArr2 = new Object[]{(String) objArr113[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char gidForName2 = (char) (Process.getGidForName("") + 33603);
                                    int i1317 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int iBlue3 = 26 - Color.blue(0);
                                    short s4 = $$a[7];
                                    Object[] objArr114 = new Object[1];
                                    c((byte) 52, s4, (byte) s4, objArr114);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName2, i1317, iBlue3, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                            }
                            int i1318 = -i11;
                            int i1319 = ((i11 & i1318) | (i11 ^ i1318)) >> 31;
                            int i149 = (i1319 & ((i & (-11)) | ((~i) & 10))) | ((~i1319) & i);
                            int i1410 = TuitionPaymentFragmentbindingInflater1;
                            i12 = (i1410 ^ 103) + ((i1410 & 103) << 1);
                            asBinder = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i1411 = i2 & 38;
                                int i1412 = -i1411;
                                i13 = ((i1411 & i1412) | (i1411 ^ i1412)) + 48;
                            } else {
                                int i1413 = i2 & 32;
                                i13 = (i1413 | (-i1413)) >> 31;
                            }
                            int i1414 = i149 & (~i13);
                            int i1415 = i13 & i;
                            i5 = (i1414 & i1415) | (i1414 ^ i1415);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i1416 = TuitionPaymentFragmentbindingInflater1 + 71;
                        asBinder = i1416 % 128;
                        int i1417 = i1416 % 2;
                        i5 = i;
                        i6 = i4;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i812 = asBinder;
                                    int i813 = ((i812 | 27) << 1) - (i812 ^ 27);
                                    TuitionPaymentFragmentbindingInflater1 = i813 % 128;
                                    int i9110 = i813 % 2;
                                    Object[] objArr115 = new Object[1];
                                    a(null, null, 127 - KeyEvent.keyCodeFromString(""), new byte[]{-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107}, objArr115);
                                    try {
                                        Object[] objArr116 = {(String) objArr115[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                            int windowTouchSlop3 = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                                            short s5 = $$a[7];
                                            Object[] objArr117 = new Object[1];
                                            c((byte) 52, s5, (byte) s5, objArr117);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, windowTouchSlop3, longPressTimeout3, 410748506, false, (String) objArr117[0], new Class[]{String.class});
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr116)).longValue();
                                        long j19 = 1245469057;
                                        long j110 = -1;
                                        long j111 = j19 ^ j110;
                                        i6 = i4;
                                        long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                        long j112 = startUptimeMillis3 ^ j110;
                                        long j113 = (((long) TypedValues.Custom.TYPE_DIMENSION) * j19) + (((long) (-903)) * jLongValue3) + (((long) (-1808)) * (((j111 | startUptimeMillis3) ^ j110) | ((j112 | jLongValue3) ^ j110)));
                                        long j114 = TypedValues.Custom.TYPE_BOOLEAN;
                                        long j115 = jLongValue3 ^ j110;
                                        long j116 = j112 | j19;
                                        long j117 = j113 + (((((j111 | j115) | startUptimeMillis3) ^ j110) | ((j116 | jLongValue3) ^ j110)) * j114) + (j114 * (((j111 | jLongValue3) ^ j110) | ((j115 | startUptimeMillis3) ^ j110) | (j116 ^ j110))) + ((long) (-1446387294));
                                        int i9111 = (int) (j117 >> 32);
                                        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                        int i9112 = ~(36038159 | startElapsedRealtime3);
                                        int i9113 = ~startElapsedRealtime3;
                                        int i9114 = i9111 & ((-1454325938) + ((i9112 | (~((-2475014) | i9113))) * (-406)) + ((~(1475739583 | i9113)) * (-406)) + (((~(startElapsedRealtime3 | (-1473264571))) | (~((-36038160) | i9113))) * 406));
                                        int i9115 = (int) j117;
                                        int i9116 = (int) Runtime.getRuntime().totalMemory();
                                        int i9117 = ~((-1684622158) | i9116);
                                        int i9118 = 1453776913 + ((536936517 | i9117) * (-280)) + ((i9117 | (~((-1173118729) | i9116))) * 140);
                                        int i9119 = ~((-1147685641) | i9116);
                                        int i10110 = ~i9116;
                                        int i10111 = i9115 & (i9118 + (((~(i10110 | (-25433089))) | i9119 | (~((-536936518) | i10110))) * 140));
                                        i11 = (i9114 & i10111) | (i9114 ^ i10111);
                                        int i10112 = TuitionPaymentFragmentbindingInflater1 + 79;
                                        asBinder = i10112 % 128;
                                        int i10113 = i10112 % 2;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i6 = i4;
                                    scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                    int iB6 = setAspectRatio.AnonymousClass6.b();
                                    int i10114 = scrollDefaultDelay * 375;
                                    int i10115 = (i10114 ^ (-94869)) + ((i10114 & (-94869)) << 1);
                                    int i10116 = ~scrollDefaultDelay;
                                    int i10117 = ~(i10116 | 127);
                                    int i10118 = ~((~iB6) | scrollDefaultDelay);
                                    int i10119 = (i10115 - (~(-(-(((i10117 & i10118) | (i10117 ^ i10118)) * (-374)))))) - 1;
                                    int i11110 = asBinder;
                                    int i11111 = (i11110 & 109) + (i11110 | 109);
                                    TuitionPaymentFragmentbindingInflater1 = i11111 % 128;
                                    int i11112 = i11111 % 2;
                                    i14 = (i10119 - (~(748 * (~((-128) | scrollDefaultDelay))))) - 1;
                                    i15 = ~(i10116 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    i16 = ~iB6;
                                    i17 = (i11110 & 67) + (i11110 | 67);
                                    TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        int i11113 = ~(scrollDefaultDelay | i16);
                                        int i11114 = i14 >>> (374 << ((i11113 & i15) | (i15 ^ i11113)));
                                        Object[] objArr118 = new Object[1];
                                        a(null, null, i11114, new byte[]{-102}, objArr118);
                                        str = (String) objArr118[0];
                                        i19 = -(ViewConfiguration.getTouchSlop() >> 48);
                                        iB = setAspectRatio.AnonymousClass6.b();
                                        i18 = 106;
                                    } else {
                                        int i11115 = ((~((scrollDefaultDelay & i16) | (i16 ^ scrollDefaultDelay))) | i15) * 374;
                                        Object[] objArr119 = new Object[1];
                                        a(null, null, (i14 & i11115) + (i11115 | i14), new byte[]{-102}, objArr119);
                                        str = (String) objArr119[0];
                                        i18 = 127;
                                        i19 = -(ViewConfiguration.getTouchSlop() >> 8);
                                        iB = setAspectRatio.AnonymousClass6.b();
                                    }
                                    int i11116 = i19 * (-523);
                                    int i11117 = i18 * 263;
                                    int i11118 = (i11116 ^ i11117) + ((i11116 & i11117) << 1);
                                    i20 = ~i19;
                                    int i11119 = ~(i20 | i18);
                                    i21 = ~i18;
                                    int i12110 = asBinder;
                                    int i12111 = i12110 + 107;
                                    TuitionPaymentFragmentbindingInflater1 = i12111 % 128;
                                    int i12112 = i12111 % 2;
                                    int i12113 = ~(i21 | i19);
                                    int i12114 = (i11119 & i12113) | (i11119 ^ i12113);
                                    int i12115 = ~((~i18) | iB);
                                    int i12116 = 262 * ((i12114 & i12115) | (i12114 ^ i12115));
                                    i22 = (i11118 ^ i12116) + ((i11118 & i12116) << 1);
                                    i23 = (i21 ^ i19) | (i21 & i19);
                                    i24 = i12110 + 25;
                                    TuitionPaymentFragmentbindingInflater1 = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        i25 = i22 / ((-787) - (~(-(-(~i23)))));
                                        int i12117 = ~iB;
                                        int i12118 = ~((i12117 & i21) | (i21 ^ i12117));
                                        int i12119 = ~((i20 ^ i18) | (i20 & i18));
                                        i26 = i12118 ^ i12119;
                                        i27 = i12118 & i12119;
                                    } else {
                                        int i13110 = -(-((~i23) * (-786)));
                                        i25 = (i22 & i13110) + (i13110 | i22);
                                        int i13111 = ~iB;
                                        int i13112 = ~((i13111 & i21) | (i21 ^ i13111));
                                        int i13113 = ~((~i19) | i18);
                                        i26 = i13112 ^ i13113;
                                        i27 = i13113 & i13112;
                                    }
                                    int i13114 = i27 | i26;
                                    int i13115 = ~i23;
                                    int i13116 = -(-(262 * ((i13114 & i13115) | (i13114 ^ i13115))));
                                    Object[] objArr1110 = new Object[1];
                                    a(null, null, (i25 & i13116) + (i13116 | i25), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr1110);
                                    try {
                                        objArr2 = new Object[]{(String) objArr1110[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char gidForName3 = (char) (Process.getGidForName("") + 33603);
                                            int i13117 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int iBlue4 = 26 - Color.blue(0);
                                            short s6 = $$a[7];
                                            Object[] objArr1111 = new Object[1];
                                            c((byte) 52, s6, (byte) s6, objArr1111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName3, i13117, iBlue4, 1411172903, false, (String) objArr1111[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                            i11 = 1;
                                        } else {
                                            i11 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i6 = i4;
                        }
                        int i13118 = -i11;
                        int i13119 = ((i11 & i13118) | (i11 ^ i13118)) >> 31;
                        int i1418 = (i13119 & ((i & (-11)) | ((~i) & 10))) | ((~i13119) & i);
                        int i1419 = TuitionPaymentFragmentbindingInflater1;
                        i12 = (i1419 ^ 103) + ((i1419 & 103) << 1);
                        asBinder = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i14110 = i2 & 38;
                            int i14111 = -i14110;
                            i13 = ((i14110 & i14111) | (i14110 ^ i14111)) + 48;
                        } else {
                            int i14112 = i2 & 32;
                            i13 = (i14112 | (-i14112)) >> 31;
                        }
                        int i14113 = i1418 & (~i13);
                        int i14114 = i13 & i;
                        i5 = (i14113 & i14114) | (i14113 ^ i14114);
                    }
                    int i150 = i ^ i6;
                    int i151 = -i150;
                    int i152 = ((i150 & i151) | (i150 ^ i151)) >> 31;
                    int i153 = asBinder;
                    int i154 = ((i153 | 35) << 1) - (i153 ^ 35);
                    int i155 = i154 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i155;
                    if (i154 % 2 != 0) {
                        int i156 = i5 & (~i152);
                        int i157 = i6 & i152;
                        i7 = (i156 & i157) | (i156 ^ i157);
                        objArr = new Object[]{new int[1], new int[1]};
                        objArr[3] = new int[0];
                    } else {
                        int i158 = i5 & (~i152);
                        int i159 = i6 & i152;
                        i7 = (i158 & i159) | (i158 ^ i159);
                        objArr = new Object[4];
                        objArr[0] = new int[1];
                        objArr[1] = new int[1];
                        objArr[2] = new int[1];
                    }
                    int i160 = (~i7) & i;
                    int i161 = ~i;
                    int i162 = i160 | (i7 & i161);
                    int i163 = -i162;
                    int i164 = (((i162 & i163) | (i162 ^ i163)) >> 31) & 16;
                    int i165 = (i155 & 23) + (i155 | 23);
                    asBinder = i165 % 128;
                    if (i165 % 2 == 0) {
                        ((int[]) objArr[0])[0] = i;
                        ((int[]) objArr[4])[0] = i7;
                        i8 = 2;
                    } else {
                        ((int[]) objArr[0])[0] = i;
                        i8 = 2;
                        ((int[]) objArr[2])[0] = i7;
                    }
                    int i166 = i155 + 95;
                    asBinder = i166 % 128;
                    if (i166 % i8 == 0) {
                        objArr[i8] = null;
                        int i167 = ~(((int) Runtime.getRuntime().freeMemory()) | 488723136);
                        i10 = ((((-127626796) | i167) * (-658)) + 80880468 + ((i167 | (-532381420)) * 658)) * i164;
                        i9 = 1;
                    } else {
                        objArr[3] = null;
                        int i168 = 1089055209 + (((~(i | (-932785921))) | 973096149) * 191) + (((~((-932785921) | i161)) | 838861824) * 191);
                        int i169 = -(-i164);
                        i9 = 1;
                        i10 = ((i168 | i169) << 1) - (i169 ^ i168);
                    }
                    int i170 = i10 * 450;
                    int i171 = i3 * (-448);
                    int i172 = ((i170 | i171) << i9) - (i170 ^ i171);
                    int i173 = ~i10;
                    int i174 = (i173 ^ i3) | (i173 & i3);
                    int i175 = ~i174;
                    int i176 = ~i3;
                    int i177 = ~(i176 | i10 | i);
                    int i178 = (i175 & i177) | (i175 ^ i177);
                    int i179 = asBinder + 109;
                    int i180 = i179 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i180;
                    int i181 = i179 % 2;
                    int i182 = (i172 - (~(-(-(449 * i178))))) - 1;
                    int i183 = (~((i173 & i3) | (i173 ^ i3))) * (-1347);
                    int i184 = (i182 & i183) + (i183 | i182);
                    int i185 = ~i174;
                    int i186 = (~i) | i176;
                    int i187 = ((i180 | 19) << 1) - (i180 ^ 19);
                    asBinder = i187 % 128;
                    if (i187 % 2 == 0) {
                        int i188 = ~((i186 & i10) | (i186 ^ i10));
                        int i189 = i184 << (((i185 & i188) | (i185 ^ i188)) * 449);
                        int i190 = (i189 & 100) + (i189 | 100);
                        int i191 = (i189 | i190) & (~(i189 & i190));
                        int i192 = i191 >> 80;
                        int i193 = ((~i191) & i192) | ((~i192) & i191);
                        int i194 = i193 / 5;
                        ((int[]) objArr[1])[1] = (i193 | i194) & (~(i193 & i194));
                        return objArr;
                    }
                    int i195 = ~((i186 & i10) | (i186 ^ i10));
                    int i196 = ((i185 & i195) | (i185 ^ i195)) * 449;
                    int i197 = (i184 & i196) + (i196 | i184);
                    int i198 = i197 << 13;
                    int i199 = (i198 & (~i197)) | ((~i198) & i197);
                    int i200 = i199 >>> 17;
                    int i201 = ((~i199) & i200) | ((~i200) & i199);
                    int i202 = i201 << 5;
                    ((int[]) objArr[1])[0] = ((~i201) & i202) | ((~i202) & i201);
                    return objArr;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, short r7, int r8) {
                /*
                    int r8 = r8 * 4
                    int r0 = 1 - r8
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda1.$$c
                    int r6 = r6 + 67
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2c
                L16:
                    r3 = r2
                L17:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L26:
                    r3 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L2c:
                    int r6 = -r6
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda1.$$e(int, short, int):java.lang.String");
            }
        });
    }

    /* JADX INFO: renamed from: lambda$put$1$com-google-firebase-remoteconfig-internal-ConfigCacheClient, reason: not valid java name */
    /* synthetic */ Task m7992x9820809d(boolean z, ConfigContainer configContainer, Void r3) throws Exception {
        if (z) {
            updateInMemoryConfigContainer(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    public Task<ConfigContainer> get() {
        Task<ConfigContainer> task;
        synchronized (this) {
            Task<ConfigContainer> task2 = this.cachedContainerTask;
            if (task2 == null || (task2.isComplete() && !this.cachedContainerTask.isSuccessful())) {
                Executor executor = this.executor;
                final ConfigStorageClient configStorageClient = this.storageClient;
                Objects.requireNonNull(configStorageClient);
                this.cachedContainerTask = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.ConfigCacheClient$$ExternalSyntheticLambda2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return configStorageClient.read();
                    }
                });
            }
            task = this.cachedContainerTask;
        }
        return task;
    }

    public void clear() {
        synchronized (this) {
            this.cachedContainerTask = Tasks.forResult(null);
        }
        this.storageClient.clear();
    }

    private void updateInMemoryConfigContainer(ConfigContainer configContainer) {
        synchronized (this) {
            this.cachedContainerTask = Tasks.forResult(configContainer);
        }
    }

    Task<ConfigContainer> getCachedContainerTask() {
        Task<ConfigContainer> task;
        synchronized (this) {
            task = this.cachedContainerTask;
        }
        return task;
    }

    public static ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            String fileName = configStorageClient.getFileName();
            Map<String, ConfigCacheClient> map = clientInstances;
            if (!map.containsKey(fileName)) {
                map.put(fileName, new ConfigCacheClient(executor, configStorageClient));
            }
            configCacheClient = map.get(fileName);
        }
        return configCacheClient;
    }

    public static void clearInstancesForTest() {
        synchronized (ConfigCacheClient.class) {
            clientInstances.clear();
        }
    }

    private static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = DIRECT_EXECUTOR;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.await(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        private final CountDownLatch latch;

        private AwaitListener() {
            this.latch = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.latch.countDown();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.latch.countDown();
        }

        public void await() throws InterruptedException {
            this.latch.await();
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.latch.await(j, timeUnit);
        }
    }
}
