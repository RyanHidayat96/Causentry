package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.work.WorkRequest;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.firebase.messaging.Constants;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class AdvertisingIdClient {
    BlockingServiceConnection zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;
    private static final byte[] $$c = {91, -9, 99, 11};
    private static final int $$d = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {70, -114, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 209;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6651236056378067885L;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        public final String toString() {
            String str = this.zza;
            boolean z = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public final String getId() {
            return this.zza;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.$$a
            int r8 = r8 + 1
            int r7 = r7 + 4
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.a(short, short, short, java.lang.Object[]):void");
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (advertisingIdClient.zzc) {
                    Preconditions.checkNotNull(advertisingIdClient.zza);
                    Preconditions.checkNotNull(advertisingIdClient.zzb);
                    zZzd = advertisingIdClient.zzb.zzd();
                } else {
                    synchronized (advertisingIdClient.zzd) {
                        zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        Preconditions.checkNotNull(advertisingIdClient.zza);
                        Preconditions.checkNotNull(advertisingIdClient.zzb);
                        try {
                            zZzd = advertisingIdClient.zzb.zzd();
                        } catch (RemoteException unused) {
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                throw th;
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    private final Info zzd(int i) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                Preconditions.checkNotNull(this.zza);
                Preconditions.checkNotNull(this.zzb);
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } else {
                synchronized (this.zzd) {
                    zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    Preconditions.checkNotNull(this.zza);
                    Preconditions.checkNotNull(this.zzb);
                    try {
                        info = new Info(this.zzb.zzc(), this.zzb.zze(true));
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public Info getInfo() throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            zzd(-1);
            throw null;
        }
        Info infoZzd = zzd(-1);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return infoZzd;
    }

    public void start() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzb(true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg == null || this.zza == null) {
                return;
            }
            try {
                if (this.zzc) {
                    ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                }
            } catch (Throwable unused) {
            }
            this.zzc = false;
            this.zzb = null;
            this.zza = null;
        }
    }

    protected final void zzb(boolean z) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 651;
            int iRed = 44 - Color.red(0);
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b & 52), bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, offsetAfter, iRed, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(new char[]{44094, 22474, 44127, 4670, 63087, 20940, 38739, 29248, 11133, 32596, 55448, 64496, 41481, 59290, 17406, 25785, 14787, 24822, 52048, 60883, 45283, 59890, 29204, 38189, 3969, 4614}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(new char[]{11741, 36989, 11704, 37932, 12762, 55259, 24275, 48066, 43650, 47343, 24202, 12812, 9184, 8255, 50606, 44318, 47152, 42847, 19795}, View.MeasureSpec.getSize(0) + 1, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 652;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a((byte) 51, bArr2[7], bArr2[80], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, modifierMetaStateMask, iResolveSizeAndState, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                int iRgb = (-16777172) - Color.rgb(0, 0, 0);
                Object[] objArr7 = new Object[1];
                a((byte) 51, (byte) 37, $$a[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, keyRepeatTimeout, iRgb, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i = ((int[]) objArr8[2])[0];
            int i2 = ((int[]) objArr8[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (((-1972715175) + (((~(317176148 | iIdentityHashCode)) | 18350762) * 576)) + (((~((~iIdentityHashCode) | 335526910)) | 302256196) * 576)) - 1949155592;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[3])[0] = i5 ^ (i5 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 1610, 26 - View.MeasureSpec.getMode(0), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 365707384, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int iKeyCodeFromString = 651 - KeyEvent.keyCodeFromString("");
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44;
                    byte[] bArr3 = $$a;
                    Object[] objArr10 = new Object[1];
                    a((byte) 51, bArr3[7], bArr3[80], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iKeyCodeFromString, keyRepeatDelay, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - TextUtils.lastIndexOf("", '0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 694, 97 - ExpandableListView.getPackedPositionChild(0L)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63405), Color.red(0) + 793, 83 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i6 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                    Object[] objArr12 = new Object[1];
                    a((byte) 51, (byte) 37, $$a[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i6, maximumDrawingCacheSize, -1595579076, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    b(new char[]{44094, 22474, 44127, 4670, 63087, 20940, 38739, 29248, 11133, 32596, 55448, 64496, 41481, 59290, 17406, 25785, 14787, 24822, 52048, 60883, 45283, 59890, 29204, 38189, 3969, 4614}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    b(new char[]{11741, 36989, 11704, 37932, 12762, 55259, 24275, 48066, 43650, 47343, 24202, 12812, 9184, 8255, 50606, 44318, 47152, 42847, 19795}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                        int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr15 = new Object[1];
                        a((byte) 51, bArr4[7], bArr4[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout2, iNormalizeMetaState, pressedStateDuration, -873460649, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 651;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 44;
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[5];
                        Object[] objArr16 = new Object[1];
                        a(b2, (byte) (b2 & 52), bArr5[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(threadPriority, offsetAfter2, trimmedLength, -459846511, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr11;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[0])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 == i7) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i9 = ((int[]) objArr[3])[0];
            int i10 = ((int[]) objArr[2])[0];
            int i11 = ((int[]) objArr[0])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i12 = i9 + 573906247 + (((~((~iIdentityHashCode2) | (-790663426))) | (~((-4983443) | iIdentityHashCode2))) * (-302)) + ((~((-790663426) | iIdentityHashCode2)) * (-604)) + (((~(iIdentityHashCode2 | (-795646868))) | (-804061120)) * 302);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr2[3])[0] = i14 ^ (i14 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i8];
            int i15 = i8 - 1;
            iArr[i15] = 1;
            Toast.makeText((Context) null, iArr[((i8 * i15) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i16 = ((int[]) objArr[3])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i19 = i16 + 1601074203 + (((~(iIdentityHashCode3 | (-623730997))) | 627161806) * 191) + (((~((~iIdentityHashCode3) | (-623730997))) | 622927876) * 191);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[3])[0] = i21 ^ (i21 << 5);
        }
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                    throw new IOException("Google Play services not available");
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                int i22 = ((int[]) objArr2[3])[0];
                int i23 = i22 * i22;
                int i24 = -(1737234940 * i22);
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                int i26 = -(i22 * 1623526612);
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                int i28 = (i27 ^ (-1520395712)) + (((-1520395712) & i27) << 1);
                int i29 = i28 >> 15;
                int i30 = ((((-262143) | i29) << 1) - (i29 ^ (-262143))) / 131072;
                int i31 = (i28 - (~((i30 & 1) + (i30 | 1)))) - 1;
                int i32 = i28 >> 27;
                int i33 = ((i32 & (-63)) + (i32 | (-63))) / 32;
                int i34 = -(i31 ^ ((i33 ^ 1) + ((i33 & 1) << 1)));
                int i35 = ((i34 | 7) << 1) - (i34 ^ 7);
                int i36 = i35 >> 28;
                int i37 = ((i36 ^ (-31)) + ((i36 & (-31)) << 1)) / 16;
                int i38 = (i37 ^ 1) + ((i37 & 1) << 1);
                intent.setPackage("27,14,0,com.google.android.gms".substring(103712 / (((-((i38 & 1) + (i38 | 1))) & i35) * 1852)));
                try {
                    if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.zza = blockingServiceConnection;
                    try {
                        this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                        this.zzc = true;
                        if (z) {
                            zze();
                        }
                    } catch (InterruptedException unused2) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (Throwable th3) {
                    throw new IOException(th3);
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    protected final void finalize() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zza();
        super.finalize();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        int i = 2 % 2;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            advertisingIdClient.zza();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                return infoZzd;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            try {
                advertisingIdClient.zzc(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 15;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.MeasureSpec.getSize(0) + 64838), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1356, (Process.myPid() >> 22) + 38, 894276454, false, $$e(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47772), 468 - Color.argb(0, 0, 0, 0), 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 45;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
            if (i % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i2 = 2 % 2;
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    final boolean zzc(Info info, boolean z, float f, long j, String str, Throwable th) throws Throwable {
        Object[] objArr;
        String str2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651;
            int iBlue = Color.blue(0) + 44;
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b, (byte) (b & 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, scrollDefaultDelay, iBlue, -459846511, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{44094, 22474, 44127, 4670, 63087, 20940, 38739, 29248, 11133, 32596, 55448, 64496, 41481, 59290, 17406, 25785, 14787, 24822, 52048, 60883, 45283, 59890, 29204, 38189, 3969, 4614}, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{11741, 36989, 11704, 37932, 12762, 55259, 24275, 48066, 43650, 47343, 24202, 12812, 9184, 8255, 50606, 44318, 47152, 42847, 19795}, -MotionEvent.axisFromString(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
            int trimmedLength = 44 - TextUtils.getTrimmedLength("");
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 51, bArr2[7], bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i4, trimmedLength, -873460649, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                int iArgb = 44 - Color.argb(0, 0, 0, 0);
                Object[] objArr6 = new Object[1];
                a((byte) 51, (byte) 37, $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iCombineMeasuredStates, iArgb, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            int iMyUid = Process.myUid();
            int i7 = (((-1844612031) + (((~(iMyUid | (-1026269064))) | 1029699873) * 191)) + (((~((~iMyUid) | (-1026269064))) | 1024170241) * 191)) - 87333907;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.indexOf("", ""), (ViewConfiguration.getTouchSlop() >> 8) + 1610, 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -87333907, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int defaultSize = 651 - View.getDefaultSize(0, 0);
                    int iNormalizeMetaState = 44 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a((byte) 51, bArr3[7], bArr3[80], objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, defaultSize, iNormalizeMetaState, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 696, 99 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 63406), KeyEvent.keyCodeFromString("") + 793, 82 - ExpandableListView.getPackedPositionChild(0L)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 650;
                    int fadingEdgeLength = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr10 = new Object[1];
                    a((byte) 51, (byte) 37, $$a[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i10, fadingEdgeLength, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(new char[]{44094, 22474, 44127, 4670, 63087, 20940, 38739, 29248, 11133, 32596, 55448, 64496, 41481, 59290, 17406, 25785, 14787, 24822, 52048, 60883, 45283, 59890, 29204, 38189, 3969, 4614}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(new char[]{11741, 36989, 11704, 37932, 12762, 55259, 24275, 48066, 43650, 47343, 24202, 12812, 9184, 8255, 50606, 44318, 47152, 42847, 19795}, (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int maxKeyCode = 651 - (KeyEvent.getMaxKeyCode() >> 16);
                        int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a((byte) 51, bArr4[7], bArr4[80], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, maxKeyCode, edgeSlop, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int maximumDrawingCacheSize = 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[5];
                        Object[] objArr14 = new Object[1];
                        a(b2, (byte) (b2 & 52), bArr5[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, maximumDrawingCacheSize, pressedStateDuration, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr == null) {
                throw null;
            }
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            for (String str3 : strArr) {
                arrayList.add(str3);
            }
            throw null;
        }
        Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i16 = i13 + (-1669839520) + (((~((~elapsedCpuTime) | (-763316638))) | (-759885828)) * (-235)) + (((~((-763316638) | elapsedCpuTime)) | (-759885828)) * (-470)) + (((~(elapsedCpuTime | (-759840770))) | (-763361696)) * 235);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr15[3])[0] = i18 ^ (i18 << 5);
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        int i20 = i19 % 2;
        double dRandom = Math.random();
        int i21 = ((int[]) objArr15[3])[0];
        int i22 = i21 * i21;
        int i23 = -(1020667256 * i21);
        int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
        int i25 = -(i21 * 1768873786);
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        int i27 = (i26 & (-1744665871)) + ((-1744665871) | i26);
        int i28 = ((i27 >> 28) - 31) / 16;
        int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
        int i30 = (i27 ^ i29) + ((i29 & i27) << 1);
        int i31 = i27 >> 23;
        int i32 = (((i31 | (-1023)) << 1) - (i31 ^ (-1023))) / 512;
        int i33 = (-(i30 ^ ((i32 & 1) + (i32 | 1)))) + 2;
        int i34 = i33 >> 19;
        int i35 = ((((i34 | (-16383)) << 1) - (i34 ^ (-16383))) / 8192) + 1;
        if (dRandom > (920429712 / ((i33 & (-(((i35 | 1) << 1) - (i35 ^ 1)))) * 8)) - 57526857) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i36 % 128;
                if (i36 % 2 == 0) {
                    int i37 = 12 / 0;
                    str2 = "0";
                } else {
                    str2 = "0";
                }
            } else {
                str2 = "1";
            }
            map.put("limit_ad_tracking", str2);
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th != null) {
            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
            int i39 = i38 % 2;
            map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new zza(this, map).start();
        return true;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static String $$e(int i, short s, int i2) {
        byte[] bArr = $$c;
        int i3 = 3 - (i2 * 3);
        int i4 = (s * 3) + 107;
        int i5 = i * 2;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + i4;
        }
        while (true) {
            i6++;
            i3++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i3];
        }
    }
}
