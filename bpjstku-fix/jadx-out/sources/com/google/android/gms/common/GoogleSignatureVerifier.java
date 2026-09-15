package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private static volatile Set zzc;
    private final Context zzd;
    private volatile String zze;
    private static final byte[] $$c = {83, -90, 68, -23};
    private static final int $$f = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {113, 29, -123, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 118;
    private static final byte[] $$a = {84, 10, 24, -102, -2, 15, -36, 17, 2, 8, -10, 6, -2, -28, 37, -8, 9};
    private static final int $$b = 127;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 52579;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 38003;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1212;
    private static char b = 54038;

    public GoogleSignatureVerifier(Context context) {
        this.zzd = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 14
            byte[] r1 = com.google.android.gms.common.GoogleSignatureVerifier.$$a
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 13
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
        L19:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L30:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = 53 - r6
            byte[] r1 = com.google.android.gms.common.GoogleSignatureVerifier.$$d
            int r8 = r8 + 4
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.c(int, int, short, java.lang.Object[]):void");
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzn.zze(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            Signature[] signatureArr = packageInfo.signatures;
            throw null;
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i3 = 0; i3 < zzjVarArr.length; i3++) {
            if (zzjVarArr[i3].equals(zzkVar)) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return zzjVarArr[i3];
            }
        }
        return null;
    }

    public static final boolean zzb(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        zzj zzjVarZza;
        int i = 2 % 2;
        if (z) {
            packageInfo2 = null;
            if (packageInfo != null) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 45;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    "com.android.vending".equals(packageInfo.packageName);
                    throw null;
                }
                if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                }
                packageInfo2 = packageInfo;
            }
        } else {
            packageInfo2 = packageInfo;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if (z) {
                zzjVarZza = zza(packageInfo2, zzm.zza);
                int i3 = TuitionPaymentFragmentbindingInflater1 + 93;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            } else {
                zzjVarZza = zza(packageInfo2, zzm.zza[0]);
            }
            if (zzjVarZza != null) {
                int i5 = asBinder + 35;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    public boolean isPackageGoogleSigned(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzw zzwVarZzc = zzc(str, false, false);
        zzwVarZzc.zze();
        boolean z = zzwVarZzc.zza;
        int i4 = asBinder + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 51;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (packageInfo == null) {
            int i5 = i2 + 51;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (zzb(packageInfo, false)) {
            int i7 = asBinder + 93;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (zzb(packageInfo, true)) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 71;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd)) {
                int i11 = TuitionPaymentFragmentbindingInflater1 + 121;
                asBinder = i11 % 128;
                int i12 = i11 % 2;
                return true;
            }
        }
        int i13 = TuitionPaymentFragmentbindingInflater1 + 81;
        asBinder = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isUidGoogleSigned(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        zzw zzwVarZzc = null;
        if (i3 % 2 != 0) {
            this.zzd.getPackageManager().getPackagesForUid(i);
            throw null;
        }
        String[] packagesForUid = this.zzd.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            zzwVarZzc = zzw.zzc("no pkgs");
        } else {
            int i4 = asBinder + 15;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            for (String str : packagesForUid) {
                zzwVarZzc = zzc(str, false, false);
                if (!zzwVarZzc.zza) {
                }
            }
            Preconditions.checkNotNull(zzwVarZzc);
            int i6 = asBinder + 79;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
        }
        zzwVarZzc.zze();
        boolean z = zzwVarZzc.zza;
        int i8 = TuitionPaymentFragmentbindingInflater1 + 91;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0619  */
    private final zzw zzc(String str, boolean z, boolean z2) throws Throwable {
        String string;
        GoogleSignatureVerifier googleSignatureVerifier;
        String str2;
        zzw zzwVarZzc;
        Method method;
        Method method2;
        int i = 2 % 2;
        int i2 = asBinder + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return zzw.zzc("null pkg");
        }
        if (str.equals(this.zze)) {
            return zzw.zzb();
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int length = str != null ? str.length() : 0;
        Class<?> cls = Class.forName("android.content.pm.PackageManager");
        byte b2 = (byte) 0;
        byte b3 = b2;
        byte b4 = b3;
        Object[] objArr = new Object[1];
        a(b2, b3, b4, objArr);
        Method method3 = cls.getMethod((String) objArr[0], String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
        Object[] objArr2 = new Object[1];
        a(b2, b3, b4, objArr2);
        Method[] methodArr = {method3, cls2.getMethod((String) objArr2[0], String.class, Integer.TYPE)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int iResolveSize = View.resolveSize(0, 0) + 22;
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            c(bArr[7], bArr[10], (byte) (-bArr[5]), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, longPressTimeout, iResolveSize, 1814927978, false, (String) objArr3[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i4 = 0;
            while (i4 < length2) {
                int i5 = asBinder + 109;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                if (i5 % 2 != 0) {
                    method2 = declaredMethods[i4];
                    int i6 = 74 / i3;
                } else {
                    method2 = declaredMethods[i4];
                }
                try {
                    Object[] objArr4 = new Object[1];
                    d(new char[]{50923, 63509, 60224, 28772, 1470, 58497, 12357, 30571, 42524, 22822, 36246, 18603, 11501, 54097, 41462, 11519, 13418, 39533, 3452, 48984, 30733, 64429, 18640, 49737, 64445, 56884}, 24 - TextUtils.indexOf("", ""), objArr4);
                    Class<?> cls3 = Class.forName((String) objArr4[i3]);
                    Object[] objArr5 = new Object[1];
                    d(new char[]{18271, 35394, 7690, 56242, 27630, 60253, 11783, 1710, 3331, 15381, 51989, 65274, 44461, 32806}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, objArr5);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr5[i3], null).invoke(method2, null)).intValue();
                    Object[] objArr6 = new Object[1];
                    objArr6[i3] = Integer.valueOf(iIntValue);
                    Object[] objArr7 = new Object[1];
                    d(new char[]{21627, 56213, 28731, 37723, 42749, 17154, 19190, 48098, 10148, 30325, 9242, 33443, 9074, 6623, 41827, 23169, 58074, 41926, 23339, 9107, 46708, 9629, 61401, 57895, 5441, 57209, 41523, 30361}, ((byte) KeyEvent.getModifierMetaStateMask()) + 27, objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[i3]);
                    Object[] objArr8 = new Object[1];
                    d(new char[]{41719, 12206, 26998, 14403, 10807, 15425, 5272, 47124, 59189, 44162}, 8 - ExpandableListView.getPackedPositionGroup(0L), objArr8);
                    if (((Boolean) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                        Class cls5 = Long.TYPE;
                        Object[] objArr9 = new Object[1];
                        d(new char[]{50923, 63509, 60224, 28772, 1470, 58497, 12357, 30571, 42524, 22822, 36246, 18603, 11501, 54097, 41462, 11519, 13418, 39533, 3452, 48984, 30733, 64429, 18640, 49737, 64445, 56884}, 24 - View.combineMeasuredStates(0, 0), objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        d(new char[]{65485, 15088, 43310, 3370, 46060, 58018, 49044, 33360, 28229, 45662, 17178, 13564, 60788, 45180, 55164, 13964}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, objArr10);
                        if (cls5.equals(cls6.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                            int i7 = TuitionPaymentFragmentbindingInflater1 + 7;
                            asBinder = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr11 = new Object[1];
                            d(new char[]{50923, 63509, 60224, 28772, 1470, 58497, 12357, 30571, 42524, 22822, 36246, 18603, 11501, 54097, 41462, 11519, 13418, 39533, 3452, 48984, 30733, 64429, 18640, 49737, 64445, 56884}, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr11);
                            Class<?> cls7 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            d(new char[]{36334, 48231, 61171, 38225, Typography.registered, 65435, 33525, 11297, 60090, 35899, 11491, 24578, 27363, 8648, 11755, 58004, 19730, 64972, 'h', 7627}, 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
                            Object[] objArr13 = (Object[]) cls7.getMethod((String) objArr12[0], null).invoke(method2, null);
                            if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                Object[] objArr14 = new Object[1];
                                d(new char[]{50923, 63509, 60224, 28772, 1470, 58497, 12357, 30571, 42524, 22822, 36246, 18603, 11501, 54097, 41462, 11519, 13418, 39533, 3452, 48984, 30733, 64429, 18640, 49737, 64445, 56884}, (ViewConfiguration.getLongPressTimeout() >> 16) + 24, objArr14);
                                if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                        int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                                        int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        byte[] bArr2 = $$d;
                                        Object[] objArr15 = new Object[1];
                                        c(bArr2[7], bArr2[10], (byte) (-bArr2[5]), objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, i9, maximumDrawingCacheSize, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        int iAxisFromString = 2822 - MotionEvent.axisFromString("");
                                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                                        byte[] bArr3 = $$d;
                                        Object[] objArr16 = new Object[1];
                                        c(bArr3[7], bArr3[10], (byte) (-bArr3[5]), objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iAxisFromString, scrollDefaultDelay, 1814927978, false, (String) objArr16[0], null);
                                    }
                                    try {
                                        Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                            int absoluteGravity = 2823 - Gravity.getAbsoluteGravity(0, 0);
                                            int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
                                            byte[] bArr4 = $$d;
                                            byte b5 = bArr4[5];
                                            byte b6 = bArr4[7];
                                            Object[] objArr18 = new Object[1];
                                            c(b5, b6, (byte) (b6 | 51), objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, absoluteGravity, packedPositionChild, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i4++;
                    i3 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int i10 = 2823 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i11 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr5 = $$d;
            Object[] objArr19 = new Object[1];
            c(bArr5[7], bArr5[10], (byte) (-bArr5[5]), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i10, i11, 1814927978, false, (String) objArr19[0], null);
        }
        Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int edgeSlop = 2823 - (ViewConfiguration.getEdgeSlop() >> 16);
            int size = View.MeasureSpec.getSize(0) + 22;
            byte b7 = $$d[5];
            Object[] objArr21 = new Object[1];
            c(b7, (byte) (b7 + 4), (byte) 51, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, edgeSlop, size, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
        Object[] objArr22 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mirror2 = (char) (AndroidCharacter.getMirror('0') + 37609);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2721;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19;
            byte b8 = $$d[5];
            Object[] objArr23 = new Object[1];
            c(b8, (byte) (b8 + 4), (byte) 51, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror2, modifierMetaStateMask, minimumFlingVelocity, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
        long j = -1123065165;
        long j2 = -1;
        long j3 = j ^ j2;
        long jMyTid = Process.myTid();
        long j4 = jMyTid ^ j2;
        long j5 = (((long) 302) * j) + (((long) TypedValues.MotionType.TYPE_EASING) * jLongValue) + (((long) (-602)) * (jLongValue | ((j3 | j4) ^ j2))) + (((long) (-301)) * (((j3 | (jLongValue ^ j2)) ^ j2) | ((j3 | jMyTid) ^ j2) | (((j4 | j) | jLongValue) ^ j2))) + (((long) 301) * ((j4 | jLongValue) ^ j2)) + ((long) (-687340680));
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i12 = ~iElapsedRealtime;
        int i13 = ((int) (j5 >> 32)) & (1406989698 + (((~((-5641350) | i12)) | 1442867760) * 220) + (((~(i12 | (-569808264))) | 2007034674) * (-440)) + ((iElapsedRealtime | (-5641350)) * 220));
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i14 = ~iMaxMemory;
        int i15 = i13 | (((int) j5) & ((-1278128229) + (((~((-1628547453) | i14)) | (~(1229193433 | iMaxMemory))) * 333) + (((~(iMaxMemory | (-1628547453))) | (~(i14 | 1229193433))) * 333)));
        int i16 = i15 >>> 24;
        int i17 = i15 & ViewCompat.MEASURED_SIZE_MASK;
        int i18 = i16 != 0 ? 1 : 0;
        if (i18 == 0 || i17 >= 2 || (method = methodArr[i17]) == null) {
            string = null;
        } else {
            string = method.toString();
            int i19 = asBinder + 89;
            TuitionPaymentFragmentbindingInflater1 = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 2 / 4;
            }
        }
        arrayList.add(string);
        if ((i16 + 6) * i18 != 0) {
            Toast.makeText((Context) null, length / (((length - 1) * length) % 2), 0).show();
            int i21 = asBinder + 45;
            TuitionPaymentFragmentbindingInflater1 = i21 % 128;
            int i22 = i21 % 2;
        }
        if (zzn.zzg()) {
            int i23 = TuitionPaymentFragmentbindingInflater1 + 87;
            asBinder = i23 % 128;
            int i24 = i23 % 2;
            googleSignatureVerifier = this;
            str2 = str;
            zzwVarZzc = zzn.zzb(str2, GooglePlayServicesUtilLight.honorsDebugCertificates(googleSignatureVerifier.zzd), false, false);
        } else {
            googleSignatureVerifier = this;
            str2 = str;
            try {
                PackageInfo packageInfo = googleSignatureVerifier.zzd.getPackageManager().getPackageInfo(str2, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(googleSignatureVerifier.zzd);
                if (packageInfo == null) {
                    zzwVarZzc = zzw.zzc("null pkg");
                } else if (packageInfo.signatures != null) {
                    int i25 = asBinder + 25;
                    TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                    int i26 = i25 % 2;
                    if (packageInfo.signatures.length == 1) {
                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        zzw zzwVarZza = zzn.zza(str3, zzkVar, zHonorsDebugCertificates, false);
                        zzwVarZzc = ((zzwVarZza.zza ^ true) || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !zzn.zza(str3, zzkVar, false, true).zza) ? zzwVarZza : zzw.zzc("debuggable release cert app rejected");
                    } else {
                        zzwVarZzc = zzw.zzc("single cert required");
                    }
                } else {
                    zzwVarZzc = zzw.zzc("single cert required");
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return zzw.zzd("no pkg ".concat(str2), e2);
            }
        }
        if (!(!zzwVarZzc.zza)) {
            googleSignatureVerifier.zze = str2;
        }
        return zzwVarZzc;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 47774);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 468;
                        int mirror = '=' - AndroidCharacter.getMirror('0');
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, minimumFlingVelocity, mirror, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i10 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 47773), 468 - ExpandableListView.getPackedPositionType(0L), 13 - TextUtils.getTrimmedLength(""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i10 + 1;
                    int i11 = $11 + 1;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2323 - Color.green(0), ExpandableListView.getPackedPositionChild(0L) + 45, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
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
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = com.google.android.gms.common.GoogleSignatureVerifier.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 108
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.$$g(byte, byte, short):java.lang.String");
    }
}
