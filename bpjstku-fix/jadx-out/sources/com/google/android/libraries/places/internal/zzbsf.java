package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.initSession;
import defpackage.registerCamera;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.tryOpenCamera;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsf {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int b;
    static final zzbfc zza;
    final Long zzb;
    final Boolean zzc;
    final Integer zzd;
    final Integer zze;
    final zzbvm zzf;
    final zzbpg zzg;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {22, 102, 43, -6, -10, 4, 65, -49, -13, 2, -1, 15, -4, -11, 22, -11, 70, -57, -3, -4, 17, -11, 6, 15, -9, 64, -17, -3, -29, 54, -71, 41, 17, -5, 41, -27, -3, -25, 50, -70, 40, 17, -5, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69};
    private static final int $$e = 199;
    private static final byte[] $$a = {55, -64, 35, -71, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 195;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zza = zzbfc.zza("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e8 A[PHI: r5
  0x01e8: PHI (r5v4 long) = (r5v3 long), (r5v9 long) binds: [B:109:0x01e6, B:106:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ea A[PHI: r5
  0x01ea: PHI (r5v6 long) = (r5v3 long), (r5v9 long) binds: [B:109:0x01e6, B:106:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[PHI: r2
  0x011d: PHI (r2v29 double) = (r2v28 double), (r2v59 double) binds: [B:57:0x011b, B:54:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[PHI: r2
  0x0121: PHI (r2v57 double) = (r2v28 double), (r2v59 double) binds: [B:57:0x011b, B:54:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    zzbsf(Map map, boolean z, int i, int i2) {
        Map mapZzd;
        boolean z2;
        boolean z3;
        double dDoubleValue;
        double d;
        boolean z4;
        boolean z5;
        boolean z6;
        zzbvm zzbvmVar;
        Map mapZzd2;
        long jLongValue;
        boolean z7;
        zzbpg zzbpgVar;
        this.zzb = zzbqj.zzh(map, "timeout");
        this.zzc = zzbqj.zzi(map, "waitForReady");
        Integer numZzf = zzbqj.zzf(map, "maxResponseMessageBytes");
        this.zzd = numZzf;
        if (numZzf != null) {
            if (!(numZzf.intValue() >= 0)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("maxInboundMessageSize %s exceeds bounds", numZzf));
            }
        }
        Integer numZzf2 = zzbqj.zzf(map, "maxRequestMessageBytes");
        this.zze = numZzf2;
        if (numZzf2 != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            if (!(numZzf2.intValue() >= 0)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("maxOutboundMessageSize %s exceeds bounds", numZzf2));
            }
        }
        if (z) {
            mapZzd = zzbqj.zzd(map, "retryPolicy");
            int i5 = 2 % 2;
        } else {
            mapZzd = null;
        }
        if (mapZzd == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            zzbvmVar = null;
        } else {
            Integer numZzf3 = zzbqj.zzf(mapZzd, "maxAttempts");
            if (numZzf3 == null) {
                throw new NullPointerException("maxAttempts cannot be empty");
            }
            int iIntValue = numZzf3.intValue();
            if (iIntValue >= 2) {
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                int i9 = i8 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("maxAttempts must be greater than 1: %s", Integer.valueOf(iIntValue)));
            }
            int iMin = Math.min(iIntValue, 5);
            Long lZzh = zzbqj.zzh(mapZzd, "initialBackoff");
            if (lZzh == null) {
                throw new NullPointerException("initialBackoff cannot be empty");
            }
            long jLongValue2 = lZzh.longValue();
            if (!(jLongValue2 > 0)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("initialBackoffNanos must be greater than 0: %s", Long.valueOf(jLongValue2)));
            }
            Long lZzh2 = zzbqj.zzh(mapZzd, "maxBackoff");
            if (lZzh2 == null) {
                throw new NullPointerException("maxBackoff cannot be empty");
            }
            long jLongValue3 = lZzh2.longValue();
            if (jLongValue3 > 0) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("maxBackoff must be greater than 0: %s", Long.valueOf(jLongValue3)));
            }
            Double dZze = zzbqj.zze(mapZzd, "backoffMultiplier");
            if (dZze == null) {
                throw new NullPointerException("backoffMultiplier cannot be empty");
            }
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            if (i13 % 2 != 0) {
                dDoubleValue = dZze.doubleValue();
                if (dDoubleValue > 1.0d) {
                    d = dDoubleValue;
                    z4 = true;
                } else {
                    d = dDoubleValue;
                    z4 = false;
                }
            } else {
                dDoubleValue = dZze.doubleValue();
                if (dDoubleValue > 0.0d) {
                    d = dDoubleValue;
                    z4 = true;
                } else {
                    d = dDoubleValue;
                    z4 = false;
                }
            }
            Double dValueOf = Double.valueOf(d);
            if (!z4) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("backoffMultiplier must be greater than 0: %s", dValueOf));
            }
            Long lZzh3 = zzbqj.zzh(mapZzd, "perAttemptRecvTimeout");
            if (lZzh3 != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                if (i14 % 2 != 0 ? lZzh3.longValue() >= 0 : lZzh3.longValue() >= 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                z5 = true;
            }
            if (!z5) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("perAttemptRecvTimeout cannot be negative: %s", lZzh3));
            }
            Set setZza = zzbvz.zza(mapZzd);
            if (lZzh3 == null) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                if (i15 % 2 != 0) {
                    setZza.isEmpty();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (setZza.isEmpty()) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    int i17 = i16 % 2;
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else {
                z6 = true;
            }
            if (!z6) {
                throw new IllegalArgumentException("retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            }
            zzbvmVar = new zzbvm(iMin, jLongValue2, jLongValue3, d, lZzh3, setZza);
        }
        this.zzf = zzbvmVar;
        if (z) {
            mapZzd2 = zzbqj.zzd(map, "hedgingPolicy");
        } else {
            int i18 = 2 % 2;
            mapZzd2 = null;
        }
        if (mapZzd2 == null) {
            zzbpgVar = null;
        } else {
            Integer numZzf4 = zzbqj.zzf(mapZzd2, "maxAttempts");
            if (numZzf4 == null) {
                throw new NullPointerException("maxAttempts cannot be empty");
            }
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
            int i20 = 2 % 2;
            int iIntValue2 = numZzf4.intValue();
            if (!(iIntValue2 >= 2)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("maxAttempts must be greater than 1: %s", Integer.valueOf(iIntValue2)));
            }
            int iMin2 = Math.min(iIntValue2, 5);
            Long lZzh4 = zzbqj.zzh(mapZzd2, "hedgingDelay");
            if (lZzh4 == null) {
                throw new NullPointerException("hedgingDelay cannot be empty");
            }
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
            if (i21 % 2 != 0) {
                jLongValue = lZzh4.longValue();
                if (jLongValue >= 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                jLongValue = lZzh4.longValue();
                if (jLongValue >= 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            if (!z7) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("hedgingDelay must not be negative: %s", Long.valueOf(jLongValue)));
            }
            zzbpgVar = new zzbpg(iMin2, jLongValue, zzbvz.zzb(mapZzd2));
        }
        this.zzg = zzbpgVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.google.android.libraries.places.internal.zzbsf.$$a
            int r7 = r7 * 52
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r3 = -r3
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsf.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbsf.$$d
            int r7 = r7 * 39
            int r7 = 42 - r7
            int r8 = r8 * 15
            int r8 = 99 - r8
            int r9 = r9 * 13
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L30
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 2
            r8 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsf.d(short, byte, short, java.lang.Object[]):void");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            boolean z = obj instanceof zzbsf;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof zzbsf)) {
            return false;
        }
        zzbsf zzbsfVar = (zzbsf) obj;
        if (tryOpenCamera.b(this.zzb, zzbsfVar.zzb) && tryOpenCamera.b(this.zzc, zzbsfVar.zzc) && tryOpenCamera.b(this.zzd, zzbsfVar.zzd)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                tryOpenCamera.b(this.zze, zzbsfVar.zze);
                throw null;
            }
            if (tryOpenCamera.b(this.zze, zzbsfVar.zze) && tryOpenCamera.b(this.zzf, zzbsfVar.zzf)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 == 0) {
                    tryOpenCamera.b(this.zzg, zzbsfVar.zzg);
                    throw null;
                }
                if (!(!tryOpenCamera.b(this.zzg, zzbsfVar.zzg))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0171  */
    /* JADX WARN: Code duplicated, block: B:34:0x0172  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3291, KeyEvent.getDeadChar(0, 0) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 650 - TextUtils.indexOf((CharSequence) "", '0', 0), 44 - (ViewConfiguration.getFadingEdgeLength() >> 16), -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 651, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i9 = $10 + 31;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x02db  */
    public final String toString() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2 = 2 % 2;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        Long l = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = l;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "timeoutNanos";
        Boolean bool = this.zzc;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = bool;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "waitForReady";
        Integer num = this.zzd;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = num;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "maxInboundMessageSize";
        Integer num2 = this.zze;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.b = num2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "maxOutboundMessageSize";
        zzbvm zzbvmVar = this.zzf;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.b = zzbvmVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "retryPolicy";
        zzbpg zzbpgVar = this.zzg;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAlpha = (char) (37567 - Color.alpha(0));
            int i3 = 625 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i4 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b2 = $$a[5];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, i3, i4, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(false, ExpandableListView.getPackedPositionChild(0L) + 229, TextUtils.getTrimmedLength("") + 22, 16 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(false, 232 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, 4 - Gravity.getAbsoluteGravity(0, 0), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37567);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b4, b4, bArr[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, modifierMetaStateMask, i5, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (37567 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int offsetBefore = 625 - TextUtils.getOffsetBefore("", 0);
                int scrollBarFadeDuration = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b5, b6, b6, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, offsetBefore, scrollBarFadeDuration, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i6};
            int[] iArr2 = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 2029200456 + (((~((-1575141365) | iIdentityHashCode)) | (-1609826293)) * (-502)) + ((~((~iIdentityHashCode) | (-1361229537))) * (-502)) + (((~(iIdentityHashCode | (-248596757))) | (-1575141365)) * TypedValues.PositionType.TYPE_DRAWPATH) + 1069881836;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(false, View.MeasureSpec.getSize(0) + 228, 26 - TextUtils.getCapsMode("", 0, 0), ImageFormat.getBitsPerPixel(0) + 23, new char[]{'\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(false, ExpandableListView.getPackedPositionChild(0L) + 236, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, TextUtils.getCapsMode("", 0, 0) + 4, new char[]{'\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        int i13 = i12 % 2;
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            c(true, TextUtils.indexOf((CharSequence) "", '0') + 228, ExpandableListView.getPackedPositionGroup(0L) + 16, 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(false, TextUtils.lastIndexOf("", '0', 0) + 232, 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, new char[]{'\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            c(false, 203 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 63, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 56, new char[]{65517, 65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25, 65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29, 65513, 25, 65513, 28, 29, 24, 24, 25, 29}, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            c(false, (ViewConfiguration.getEdgeSlop() >> 16) + 198, 64 - View.MeasureSpec.makeMeasureSpec(0, 0), 57 - Color.green(0), new char[]{65522, ' ', '!', 65515, 29, ' ', 65517, '!', 65519, 65517, 65518, 65521, 65518, 65520, 65522, '!', 65521, 29, 65519, 29, 65524, 65518, 65524, 65524, 65523, 65524, 29, 65520, 65516, 65519, ' ', 28, 65517, 65517, ' ', '!', 65521, 65522, 65519, 65518, 65518, 65524, 30, 65524, 65524, 29, 65519, 65518, 65517, 30, '!', 65517, 65519, 28, 65515, 65521, '!', 30, 28, 31, 65521, 65515, 65520, 29}, objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr15 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1069881836};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[85];
                byte b8 = b7;
                Object[] objArr16 = new Object[1];
                d(b8, (byte) (b8 - 1), b7, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b9 = bArr2[85];
                byte b10 = (byte) (b9 - 1);
                byte b11 = b9;
                Object[] objArr17 = new Object[1];
                d(b10, b11, (byte) (b11 - 1), objArr17);
                Object[] objArr18 = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i16 = ((int[]) objArr18[0])[0];
                int i17 = ((int[]) objArr18[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                        int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                        int jumpTapTimeout = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr19 = new Object[1];
                        a(b12, b13, b13, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, deadChar, jumpTapTimeout, -973632554, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr18);
                    try {
                        Object[] objArr20 = new Object[1];
                        c(false, View.MeasureSpec.getMode(0) + 228, (Process.myPid() >> 22) + 22, 16 - KeyEvent.normalizeMetaState(0), new char[]{1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6}, objArr20);
                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        c(false, 232 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, 4 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr21);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int iAlpha = 625 - Color.alpha(0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 15;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[7];
                            Object[] objArr22 = new Object[1];
                            a(b14, b14, bArr3[5], objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iAlpha, iLastIndexOf, -976899241, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 625;
                            int iResolveSize = 14 - View.resolveSize(0, 0);
                            byte b15 = $$a[5];
                            byte b16 = b15;
                            Object[] objArr23 = new Object[1];
                            a(b15, b16, b16, objArr23);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, iResolveSize, -477065106, false, (String) objArr23[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr18;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr3 = {i21};
            int i23 = ~Process.myUid();
            int i24 = i20 + ((((-2028272048) + (((~((-718763865) | i23)) | (-1104974257)) * (-933))) + (((~(i23 | (-1104974257))) | 1091076256) * 933)) - 658685565);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[1])[0] = i26 ^ (i26 << 5);
            objArr2 = new Object[]{new int[]{i22}, new int[1], iArr3, strArr3};
            i = 1;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
                int i28 = i27 % 2;
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i29 = ((int[]) objArr[1])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr4 = {i30};
            int iNextInt = new Random().nextInt(432075188);
            int i32 = ~iNextInt;
            int i33 = i29 + 779556416 + (((~((-12067105) | i32)) | (~((-725697089) | iNextInt)) | (~((-1073906825) | iNextInt))) * 765) + (((~((-737764193) | i32)) | 12067104) * 1530) + (((~(iNextInt | (-737764193))) | (~(i32 | (-1073906825)))) * 765);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            i = 1;
            ((int[]) objArr2[1])[0] = i35 ^ (i35 << 5);
            objArr2 = new Object[]{new int[]{i31}, new int[1], iArr4, strArr5};
        }
        int i36 = ((int[]) objArr2[i])[0];
        int i37 = ((i36 * i36) - (~(-(1427342094 * i36)))) - i;
        int i38 = -(i36 * 56895202);
        int i39 = (i37 ^ i38) + ((i38 & i37) << i);
        int i40 = ((i39 | 461090880) << i) - (461090880 ^ i39);
        int i41 = i40 >> 26;
        int i42 = ((i41 ^ ComposerKt.defaultsKey) + ((i41 & ComposerKt.defaultsKey) << i)) / 64;
        int i43 = ((i42 | 1) << i) - (i42 ^ i);
        int i44 = (i40 ^ i43) + ((i43 & i40) << i);
        int i45 = i40 >> 23;
        int i46 = ((i45 & (-1023)) + (i45 | (-1023))) / 512;
        int i47 = -((((i46 | 1) << 1) - (i46 ^ 1)) ^ i44);
        int i48 = (i47 ^ 5) + ((i47 & 5) << 1);
        int i49 = i48 >> 26;
        int i50 = ((i49 ^ ComposerKt.defaultsKey) + ((i49 & ComposerKt.defaultsKey) << 1)) / 64;
        int i51 = (i50 ^ 1) + ((i50 & 1) << 1);
        String strSubstring = "28/21/hedgingPolicy".substring(59010 / (((-((i51 ^ 1) + ((i51 & 1) << 1))) & i48) * 1967));
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault7 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault7;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault7;
        tuitionPaymentFragmentspecialinlinedviewModeldefault7.b = zzbpgVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strSubstring;
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = -83722269;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r7 = 120 - r7
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzbsf.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsf.$$g(short, int, short):java.lang.String");
    }
}
