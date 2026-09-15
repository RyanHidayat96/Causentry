package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjc {
    private zzbjx zza = zzbjx.zza(Collections.emptyList());
    private final zzbez zzb = zzbez.zza;
    private zzbiz zzc;
    private static final byte[] $$c = {17, 104, 102, -28};
    private static final int $$f = 108;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {49, -45, -112, 57, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -4, 4};
    private static final int $$e = 246;
    private static final byte[] $$a = {36, -74, -79, -21, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 26;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = -2391416845493224335L;

    zzbjc() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            int r8 = r8 * 52
            int r8 = r8 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzbjc.$$a
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbjc.a(short, byte, byte, java.lang.Object[]):void");
    }

    private static void d(short s, int i, int i2, Object[] objArr) {
        int i3 = 99 - i;
        int i4 = s * 49;
        byte[] bArr = $$d;
        int i5 = 52 - (i2 * 49);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + (-i5) + 3;
            i5 = i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i5 + 1;
            i3 = i3 + (-bArr[i8]) + 3;
            i5 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r5 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        throw new java.lang.NullPointerException("StatusOr addresses cannot be null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r4.zza = r5;
        r1 = r1 + 95;
        com.google.android.libraries.places.internal.zzbjc.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.zzbjc zza(com.google.android.libraries.places.internal.zzbjx r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzbjc.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r2 = r1 + 11
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzbjc.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 14
            int r2 = r2 / 0
            if (r5 == 0) goto L2a
            goto L17
        L15:
            if (r5 == 0) goto L2a
        L17:
            r2 = r5
            com.google.android.libraries.places.internal.zzbjx r2 = (com.google.android.libraries.places.internal.zzbjx) r2
            r4.zza = r5
            int r1 = r1 + 95
            int r5 = r1 % 128
            com.google.android.libraries.places.internal.zzbjc.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L29
            r5 = 68
            int r5 = r5 / 0
        L29:
            return r4
        L2a:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "StatusOr addresses cannot be null."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbjc.zza(com.google.android.libraries.places.internal.zzbjx):com.google.android.libraries.places.internal.zzbjc");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 123;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 64838), TextUtils.getOffsetAfter("", 0) + 1356, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 468 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        int i8 = $10 + 85;
        $11 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01fb  */
    public final zzbjd zzc() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int i2 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 14, (byte) (-bArr[5]), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, i2, iMakeMeasureSpec, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{12289, 49972, 53010, 12384, 6637, 38221, 25432, 7130, 26674, 27950, 52220, 17250, 32982, 50568, 37850, 43843, 14700, 40044, 31268, 4817, 20764, 29936, 49888, 31287, 35246, 52412}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{9309, 3241, 10667, 9272, 43717, 23250, 34276, 43248, 31858, 41663, 11589, 61494, 38016, 2567, 29985, 6220, 11552, 21487, 40076}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i3 = 877 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = (byte) (-bArr2[5]);
            Object[] objArr5 = new Object[1];
            a(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, i3, i4, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 876;
                int iRed = 10 - Color.red(0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[54];
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, maximumFlingVelocity, iRed, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = ((((-731710420) + (((~((-68353) | i7)) | 40378581) * 220)) + (((~(i7 | (-1032309539))) | 1072619767) * (-440))) + ((iIdentityHashCode | (-68353)) * 220)) - 83178469;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{54693, 40134, 13977, 54724, 42364, 51903, 39635, 42827, 36246, 13020, 12919, 65523, 25980, 39545, 27151, 6063, 56560, 50062, 33711, 44620, 46243, 11048, 15219, 50864, 27709, 37709, 21265, 6408, 51180, 62621}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{1501, 44682, 34430, 1470, 3928, 63720, 10786, 3439, 24036, 151, 33408, 21944, 46357, 43061, 56052, 48588, 3242, 61888, 13128, 1128, 25794, 6499}, -ExpandableListView.getPackedPositionChild(0L), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                    if (i11 % 2 == 0) {
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
            c(new char[]{17861, 25262, 1332, 17839, 2537, 13528, 43372, 3021, 7607, 52401, 479, 21286, 62746, 25679, 22913, 47981, 19618, 15857, 45075, 733}, View.resolveSizeAndState(0, 0, 0) + 1, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{57415, 21313, 38239, 57390, 24888, 1330, 14612, 25363, 47215, 64859, 37281, 15328, 20663, 21999, 51658, 54189, 59664, 3077, 8313, 27140}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -83178469};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[35];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b7, (byte) (b7 - 1), b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[35];
                byte b9 = (byte) (b8 - 1);
                byte b10 = b8;
                Object[] objArr14 = new Object[1];
                d(b9, b10, (byte) (b10 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[54];
                        byte b12 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, keyRepeatDelay, iKeyCodeFromString, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{12289, 49972, 53010, 12384, 6637, 38221, 25432, 7130, 26674, 27950, 52220, 17250, 32982, 50568, 37850, 43843, 14700, 40044, 31268, 4817, 20764, 29936, 49888, 31287, 35246, 52412}, '1' - AndroidCharacter.getMirror('0'), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{9309, 3241, 10667, 9272, 43717, 23250, 34276, 43248, 31858, 41663, 11589, 61494, 38016, 2567, 29985, 6220, 11552, 21487, 40076}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                            int i13 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                            byte[] bArr6 = $$a;
                            byte b13 = bArr6[7];
                            byte b14 = (byte) (-bArr6[5]);
                            Object[] objArr19 = new Object[1];
                            a(b13, b14, b14, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, i12, i13, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                            int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr7 = $$a;
                            byte b15 = (byte) (-bArr7[5]);
                            byte b16 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a((byte) 14, b15, b16, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, iResolveOpacity, i14, 252381699, false, (String) objArr20[0], null);
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
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~((-10166552) | iIdentityHashCode2);
            int i19 = ~iIdentityHashCode2;
            int i20 = i17 + 519531664 + ((i18 | (~(31192511 | i19))) * (-406)) + ((~((-1048835) | i19)) * (-406)) + (((~(iIdentityHashCode2 | (-30143678))) | (~(10166551 | i19))) * 406);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
        } else {
            int[] iArr = new int[i16];
            int i23 = i16 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i25 = i24 + 415477528 + (((~(186824548 | iIdentityHashCode3)) | (-227134778)) * (-964)) + (((~((~iIdentityHashCode3) | 186824548)) | (-262930302)) * (-964));
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[1])[0] = i27 ^ (i27 << 5);
        }
        return new zzbjd(this.zza, this.zzb, this.zzc);
    }

    public final zzbjc zzb(zzbiz zzbizVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zzc = zzbizVar;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzbjc.$$c
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2c:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbjc.$$g(int, short, int):java.lang.String");
    }
}
