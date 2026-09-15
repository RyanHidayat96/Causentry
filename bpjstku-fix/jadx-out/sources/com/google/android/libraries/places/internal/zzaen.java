package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
final class zzaen implements zzbak {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long b;
    static final zzbak zza;
    private static final byte[] $$c = {92, 126, -38, -95};
    private static final int $$f = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -59, 0, 15, 5, -16, 14, -3, 4, 67, -73, 3, 5};
    private static final int $$e = 218;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 45;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 52
            int r0 = 53 - r5
            byte[] r1 = com.google.android.libraries.places.internal.zzaen.$$a
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaen.a(int, short, short, java.lang.Object[]):void");
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
    private static void d(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 34
            int r7 = 38 - r7
            int r9 = 99 - r9
            byte[] r0 = com.google.android.libraries.places.internal.zzaen.$$d
            int r8 = r8 * 34
            int r8 = 35 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
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
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaen.d(byte, short, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 61;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 115;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 64838), 1356 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 39, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 47773), TextUtils.getOffsetBefore("", 0) + 468, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (37567 - Color.blue(0));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
            int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0', 0);
            byte b2 = $$a[5];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, (byte) (-b3), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, maximumDrawingCacheSize, iLastIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{58801, 58832, 24133, 23270, 41767, 39542, 53816, 60994, 62634, 35837, 49324, 64898, 50998, 47475, 61802, 52363, 53652, 42639, 59268, 8753, 40972, 21547, 37888, 12719, 45718, 17807}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{38889, 38796, 9704, 51476, 57692, 57817, 16847, 44091, 34542, 61532, 21342, 49029, 46436, 49868, 25306, 36567, 41948, 56636, 29799}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0'));
            int i6 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 14;
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (-bArr[5]), b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i6, iResolveSizeAndState, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) (37567 - TextUtils.indexOf("", "", 0));
                int keyRepeatTimeout = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iKeyCodeFromString = 14 - KeyEvent.keyCodeFromString("");
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 51), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, keyRepeatTimeout, iKeyCodeFromString, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i9 = ((int[]) objArr7[2])[0];
            int i10 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i9};
            int i11 = (((378411976 + (((~((-1754265870) | i)) | 264457) * 336)) + (((~(i | 69472251)) | (-1823473664)) * (-168))) + (((-1754265870) | (~(69472251 | (~i)))) * 168)) - 1402021657;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            objArr = new Object[]{new int[]{i10}, new int[]{i13 ^ (i13 << 5)}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{21753, 21656, 36375, 23465, 31396, 18980, 54135, 14273, 17890, 23471, 49635, 9217, 30320, 26914, 61563, 5493, 24804, 30413, 59083, 64446, 4447, 33875, 38231, 59450, 1001, 38366, 33829, 56986, 15392, 41830}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{2786, 2689, 44947, 46471, 9571, 27579, 15695, 26630, 7155, 31276, 12253, 31657, 10362, 18598, 7753, 19189, 16093, 22347, 2277, 42105, 20317, 42448}, TextUtils.getCapsMode("", 0, 0) + 1, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{22610, 22624, 41054, 15393, 31892, 25702, 46333, 12770, 18759, 30189, 42601, 8745, 31363, 18301, 38885, 4958, 27755, 22658, 33110, 64978, 7605, 43586, 62109, 60950, 3875, 48072, 58344, 55469, 12431, 36220, 52529, 51562, 8781, 40627, 16115, 48110, 54219, 61378, 10313, 42010, 50551, 49438, 6615, 38622, 63164, 53902, 2903, 34611, 59336, 9314, 29860, 29106, 35139, 13731, 26163, 25202, 47746, 1831, 22413, 21261, 44083, 6355, 16647, 15769, 24060, 27153, 45717, 11797}, -ImageFormat.getBitsPerPixel(0), objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            c(new char[]{28561, 28658, 42797, 36078, 48287, 25361, 1072, 61886, 32469, 29385, 5794, 57891, 19740, 16398, 10108, 54018, 23464, 24486, 12702, 15832, 10867, 44339, 16978, 11851, 14560, 48315, 21366, 6386, 1867, 35340, 32254, 2409, 5518, 39325, 36401, 31716, 58376, 59570, 39041, 25625, 62129, 50745, 43329, 22150, 49451, 54701, 48074, 18230, 53338, 9024, 50283, 45503, 48856, 12931, 55037, 41505, 36119, 'X', 59203, 37718, 39850, 8190, 61902, 64964, 27196, 27956, 606, 60954}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr11);
            try {
                Object[] objArr12 = {applicationContext, new String[]{str, (String) objArr11[0]}, Integer.valueOf(i), 17, -1402021657};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[27];
                byte b8 = (byte) (b7 + 1);
                byte b9 = b7;
                Object[] objArr13 = new Object[1];
                d(b8, b9, b9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b10 = bArr2[27];
                byte b11 = (byte) (b10 + 1);
                Object[] objArr14 = new Object[1];
                d(b10, b11, b11, objArr14);
                Object[] objArr15 = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i14 = ((int[]) objArr15[0])[0];
                int i15 = ((int[]) objArr15[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 625;
                        int iMakeMeasureSpec = 14 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr16 = new Object[1];
                        a(b13, (byte) (b13 | 51), b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, tapTimeout2, iMakeMeasureSpec, -973632554, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{58801, 58832, 24133, 23270, 41767, 39542, 53816, 60994, 62634, 35837, 49324, 64898, 50998, 47475, 61802, 52363, 53652, 42639, 59268, 8753, 40972, 21547, 37888, 12719, 45718, 17807}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{38889, 38796, 9704, 51476, 57692, 57817, 16847, 44091, 34542, 61532, 21342, 49029, 46436, 49868, 25306, 36567, 41948, 56636, 29799}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr18);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 37567);
                            int offsetBefore = 625 - TextUtils.getOffsetBefore("", 0);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 14;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[7];
                            Object[] objArr19 = new Object[1];
                            a(b14, (byte) (-bArr3[5]), b14, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, offsetBefore, trimmedLength, -976899241, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') + 37519);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                            byte b15 = $$a[5];
                            byte b16 = b15;
                            Object[] objArr20 = new Object[1];
                            a(b16, (byte) (-b16), b15, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, longPressTimeout, keyRepeatDelay, -477065106, false, (String) objArr20[0], null);
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
        int i16 = ((int[]) objArr[0])[0];
        int i17 = ((int[]) objArr[2])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i5 < strArr2.length) {
                    int i18 = TuitionPaymentFragmentbindingInflater1 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList.add(strArr2[i5]);
                        i5 += 97;
                    } else {
                        arrayList.add(strArr2[i5]);
                        i5++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int i22 = ~((~((int) SystemClock.uptimeMillis())) | 804978684);
        int i23 = i19 + (((54720240 | i22) * (-374)) - 609512416) + ((i22 | 750258444) * 374);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        Object obj = new Object[]{new int[]{i21}, new int[1], new int[]{i20}, strArr3}[1];
        ((int[]) obj)[0] = i25 ^ (i25 << 5);
        if (i != 0) {
            int i26 = TuitionPaymentFragmentbindingInflater1;
            int i27 = i26 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
            if (i27 % 2 == 0 ? i != 1 : i != 0) {
                if (i != 2) {
                    int i28 = ((int[]) obj)[0];
                    int i29 = i28 * i28;
                    int i30 = -(1557935870 * i28);
                    int i31 = (((i29 & i30) + (i29 | i30)) - (~(-(i28 * (-51851468))))) - 1;
                    int i32 = ((i31 | 1397135473) << 1) - (1397135473 ^ i31);
                    int i33 = i32 >> 18;
                    int i34 = ((i33 - 32767) / 16384) + 1;
                    int i35 = (i32 & i34) + (i32 | i34);
                    int i36 = ((i33 ^ (-32767)) + ((i33 & (-32767)) << 1)) / 16384;
                    int i37 = -(((i36 & 1) + (i36 | 1)) ^ i35);
                    int i38 = (i37 & 3) + (i37 | 3);
                    if (i != 10188 / (((-((((i38 >> 27) - 63) / 32) + 2)) & i38) * 1132) && i != 4) {
                        int i39 = i26 + 53;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                        if (i39 % 2 == 0 ? i != 5 : i != 5) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = new zzaen();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    private zzaen() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        b = -6602700626568729029L;
    }

    private static String $$g(short s, int i, byte b2) {
        int i2 = 3 - (i * 3);
        byte[] bArr = $$c;
        int i3 = 107 - (s * 4);
        int i4 = b2 * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (-i3) + i4;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
            i5 = i6;
        }
    }
}
