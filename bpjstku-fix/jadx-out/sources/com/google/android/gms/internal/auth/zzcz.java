package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcz {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;
    private static final byte[] $$c = {94, -1, 37, -59};
    private static final int $$f = DerHeader.TAG_CLASS_PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 66, -9, 18, 6, -66, 66, 5, -8, 4, 10, -59, 37, 34, 0, 16, -15, 11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$e = 249;
    private static final byte[] $$a = {7, 15, 25, 25, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 31;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -7539657165823480557L;

    public zzcz(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r1 = com.google.android.gms.internal.auth.zzcz.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 40
            int r8 = 44 - r8
            int r6 = r6 * 3
            int r0 = r6 + 38
            byte[] r1 = com.google.android.gms.internal.auth.zzcz.$$d
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L31
        L18:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1c:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L31:
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-3)
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.d(byte, short, short, java.lang.Object[]):void");
    }

    public final zzcz zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.zzb.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        zzcz zzczVar = new zzcz(null, this.zza, this.zzb, this.zzc, true, false, this.zze, false, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return zzczVar;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (true) {
            obj = null;
            if (abortcapture.b >= cArrB.length) {
                break;
            }
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i3 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 64838);
                    int packedPositionGroup2 = 1356 - ExpandableListView.getPackedPositionGroup(0L);
                    int iResolveSize = 38 - View.resolveSize(0, 0);
                    byte b = (byte) ($$c[1] + 1);
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, packedPositionGroup2, iResolveSize, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - TextUtils.indexOf((CharSequence) "", '0', 0)), 468 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf((CharSequence) "", '0') + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i4 = $10 + 81;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 97;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r4v28, types: [boolean, int] */
    public final zzdc zzc(String str, double d) throws Throwable {
        int i;
        int length;
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
            byte[] bArr = $$a;
            byte b = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b, bArr[7], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, iIndexOf, scrollBarFadeDuration, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{19835, 19738, 53440, 55259, 1929, 17070, 2311, 21635, 20672, 62944, 11091, 30387, 30396, 37806, 19765, 4346, 5246, 45122, 28571, 11536, 14918, 44614, 33247, 53102, 55356, 19506}, KeyEvent.getDeadChar(0, 0) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{36675, 36646, 8361, 10160, 41444, 62182, 44911, 58569, 37604, 1413, 36158, 50823, 46222, 25557, 60186, 41109, 54870, 16437, 51687}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            a(b2, b2, (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionGroup, iResolveSizeAndState, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                int touchSlop = 921 - (ViewConfiguration.getTouchSlop() >> 8);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b3, b4, (byte) (b4 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, touchSlop, iIndexOf2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i5 = ~((-553395632) | startElapsedRealtime);
            int i6 = ~startElapsedRealtime;
            int i7 = (-159195341) + ((i5 | (~(1220684012 | i6))) * (-1808)) + (((~((-12591277) | startElapsedRealtime)) | (~(i6 | 1761488367))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(startElapsedRealtime | (-1220684013))) | 540804355 | (~(553395631 | i6))) * TypedValues.Custom.TYPE_BOOLEAN) + 185424977;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{59041, 59072, 19388, 19623, 18443, 30906, 18053, 28311, 64282, 28316, 25809, 19623, 56680, 2257, 745, 10899, 49052, 11054, Typography.rightSingleQuote, 5896, 37255, 13584, 52805, 62828, 29649, 55117, 60535, 54108, 21560, 61877}, -TextUtils.lastIndexOf("", '0'), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{65314, 65345, 18320, 16528, 57527, 29335, 60975, 25786, 58003, 25271, 52349, 18149, 50426, 1277, 43593, 8441, 42557, 9984, 34981, 7461, 34845, 14651}, 1 - TextUtils.getTrimmedLength(""), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            if (str != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                i = 2;
                int i11 = i10 % 2;
                length = str.length();
            } else {
                i = 2;
                length = 0;
            }
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
            int i13 = i12 % i;
            try {
                Object[] objArr10 = new Object[4];
                objArr10[3] = 185424977;
                objArr10[i] = 0;
                objArr10[1] = Integer.valueOf(length);
                objArr10[0] = applicationContext;
                byte[] bArr3 = $$d;
                byte b5 = bArr3[5];
                Object[] objArr11 = new Object[1];
                d(b5, bArr3[18], b5, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[18];
                Object[] objArr12 = new Object[1];
                d(b6, bArr3[5], b6, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (31532 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iResolveSize = 28 - View.resolveSize(0, 0);
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[7];
                    byte b8 = bArr4[80];
                    Object[] objArr13 = new Object[1];
                    a(b7, b8, (byte) (b8 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, doubleTapTimeout, iResolveSize, -1142834547, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{19835, 19738, 53440, 55259, 1929, 17070, 2311, 21635, 20672, 62944, 11091, 30387, 30396, 37806, 19765, 4346, 5246, 45122, 28571, 11536, 14918, 44614, 33247, 53102, 55356, 19506}, TextUtils.indexOf("", "") + 1, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{36675, 36646, 8361, 10160, 41444, 62182, 44911, 58569, 37604, 1413, 36158, 50823, 46222, 25557, 60186, 41109, 54870, 16437, 51687}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (31533 - TextUtils.indexOf("", "", 0, 0));
                        int iIndexOf3 = 920 - TextUtils.indexOf((CharSequence) "", '0');
                        int iIndexOf4 = TextUtils.indexOf("", "") + 28;
                        byte b9 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        a(b9, b9, (byte) 52, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iIndexOf3, iIndexOf4, -778300370, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                        int i14 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                        int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[80];
                        Object[] objArr17 = new Object[1];
                        a(b10, bArr5[7], b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i14, i15, -1048449946, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            throw null;
        }
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i17 = ~System.identityHashCode(this);
        int i18 = ~(512022449 | i17);
        int i19 = i16 + 2134130215 + ((i18 | 1262057194) * 764) + (((~(i17 | 1262057194)) | 344228113) * (-1528)) + ((1438490971 | i18) * 764);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr18[0])[0] = i21 ^ (i21 << 5);
        Double dValueOf = Double.valueOf(0);
        int i22 = ((int[]) objArr18[0])[0];
        int i23 = i22 * i22;
        int i24 = -(490385572 * i22);
        int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
        int i26 = -(i22 * (-589910316));
        int i27 = ((i25 & i26) + (i26 | i25)) - (-207786512);
        int i28 = i27 >> 16;
        int i29 = (((i28 | (-131071)) << 1) - ((-131071) ^ i28)) / 65536;
        int i30 = (i28 - 131071) / 65536;
        int i31 = -(((i27 - (~((i29 ^ 1) + ((i29 & 1) << 1)))) - 1) ^ (((i30 | 1) << 1) - (i30 ^ 1)));
        int i32 = (i31 ^ 8) + ((i31 & 8) << 1);
        int i33 = i32 >> 25;
        int i34 = ((i33 & (-255)) + (i33 | (-255))) / 128;
        int i35 = (i34 & 1) + (i34 | 1);
        return new zzcx(this, str, dValueOf, 440 / (((-((i35 & 1) + (i35 | 1))) & i32) * 55));
    }

    public final zzdc zzd(String str, long j) {
        int i = 2 % 2;
        zzcv zzcvVar = new zzcv(this, str, Long.valueOf(j), true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzcvVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzdc zze(String str, boolean z) {
        int i = 2 % 2;
        zzcw zzcwVar = new zzcw(this, str, Boolean.valueOf(z), true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return zzcwVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzdc zzf(String str, Object obj, zzhy zzhyVar) {
        int i = 2 % 2;
        zzcy zzcyVar = new zzcy(this, "getTokenRefactor__blocked_packages", obj, true, zzhyVar);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return zzcyVar;
    }

    private zzcz(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzdg zzdgVar) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z;
        this.zze = z3;
    }

    public final zzcz zza() {
        int i = 2 % 2;
        zzcz zzczVar = new zzcz(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return zzczVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 107 - r7
            byte[] r0 = com.google.android.gms.internal.auth.zzcz.$$c
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcz.$$g(int, byte, int):java.lang.String");
    }
}
