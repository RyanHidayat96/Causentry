package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzazo {
    private static int $10 = 0;
    private static int $11 = 1;
    private final Object zza;
    private final int zzb;
    private static final byte[] $$d = {43, 23, 22, -14, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -59, 0, 15, 5, -16, 14, -3, 4, 67, -73, 3, 5};
    private static final int $$e = 177;
    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 164;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4816871034728791471L;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzazo.$$a
            int r7 = r7 * 52
            int r1 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r6 = r6 * 52
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzazo.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 98
            int r8 = r8 * 34
            int r8 = 37 - r8
            byte[] r0 = com.google.android.libraries.places.internal.zzazo.$$d
            int r9 = r9 * 34
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r5 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + 3
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzazo.c(byte, short, byte, java.lang.Object[]):void");
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 29;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 19472), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2624, TextUtils.lastIndexOf("", '0', 0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.indexOf("", "")), 481 - TextUtils.getOffsetBefore("", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 119;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 481, 37 - ((Process.getThreadPriority(0) + 20) >> 6), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 39423), TextUtils.lastIndexOf("", '0', 0) + 482, KeyEvent.normalizeMetaState(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cGreen = (char) (Color.green(0) + 37567);
            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
            int keyRepeatTimeout = 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b = bArr[7];
            byte b2 = (byte) (-bArr[5]);
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iResolveSizeAndState, keyRepeatTimeout, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{5333, 28549, 57966, 26331, 63911, 31750, 61674, 19203, 52771, 17040, 50476, 23026, 56505, 22292, 44018, 11840, 41257, 9656, 47222, 15574, 47035, 2580}, TextUtils.indexOf((CharSequence) "", '0', 0) + 31584, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{5329, 54241, 39591, 16751, 2083, 61644, 49030, 26217, 11545, 5588, 56546, 39859, 17009, 2364, 61903}, (ViewConfiguration.getTouchSlop() >> 8) + 51001, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char gidForName = (char) (Process.getGidForName("") + 37568);
            int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 625;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 14;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, i2, iNormalizeMetaState, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 37519);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 625;
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 14;
                byte[] bArr2 = $$a;
                byte b5 = (byte) (-bArr2[5]);
                byte b6 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, packedPositionGroup, maxKeyCode, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (((-251048693) + ((((~(i5 | 1818859783)) | (-1819015432)) | (~((-4722690) | iIdentityHashCode))) * 717)) + (((~(iIdentityHashCode | 1818859783)) | ((~(i5 | (-4722690))) | (-1819015432))) * 717)) - 894005138;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[]{i4}, new int[1], new int[]{i3}, strArr};
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{5333, 50355, 46082, 26109, 21887, 1744, 63142, 42565, 38813, 18293, 12510, 57369, 53273, 33154, 29054, 8954, 4690, 49700, 45986, 25350, 23764, 3137, 64960, 44478, 40205, 20113}, (ViewConfiguration.getTapTimeout() >> 16) + 53353, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{5335, 14756, 19980, 40169, 41285, 63011, 1182, 10550, 32748, 35913, 53546, 59274, 13419, 23284, 28486, 48182, 49803, 5999}, 11620 - ExpandableListView.getPackedPositionChild(0L), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(new char[]{5342, 58284, 64048, 62142, 51582, 49541, 55299, 53397, 44827, 42971, 48733, 46846, 36203, 34277, 40015, 38094}, 63353 - View.getDefaultSize(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(new char[]{5341, 63275, 54055, 48939, 39724, 26426, 17186, 12048, 2852, 5894, 62217, 57109, 47923, 34660, 25450, 20324}, TextUtils.lastIndexOf("", '0') + 58364, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            b(new char[]{5254, 21388, 39528, 49858, 2465, 28679, 47356, 59145, 11877, 38551, 56688, 1150, 19597, 35688, 62403, 15090, 24915, 43432, 4104, 24374, 34757, 52770, 13693, 32141, 42089, 60566, 11172, 37450, 55979, 345, 18534, 45262, 65325, 9768, 28380, 54586, 7569, 17652, 33602, 52222, 12890, 31076, 41410, 59411, 22318, 40840, 50737, 3730, 30117, 48201, 58534, 9042, 27236, 53965, 6424, 16429, 35029, 63289, 16274, 26297, 44314, 5627, 23552, 39733}, KeyEvent.getDeadChar(0, 0) + 18269, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            b(new char[]{5335, 48830, 16390, 60355, 48424, 16534, 59988, 48238, 18313, 59665, 48298, 17999, 59861, 46057, 17672, 59589, 45622, 17820, 61188, 45430, 17629, 60996, 45536, 23327, 61150, 45299, 23048, 60868, 46899, 23186, 60423, 46713, 23021, 58141, 46775, 22564, 58252, 46502, 24375, 58059, 46142, 24562, 57692, 35707, 24295, 57423, 35773, 23842, 57501, 35500, 23659, 59356, 35178, 23719, 58901, 34939, 21439, 58625, 35000, 21033, 58817, 36859, 20840, 58503}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 43627, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -894005138};
                byte b7 = (byte) ($$e & 7);
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                c(b7, b8, b8, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = $$d[27];
                byte b10 = b9;
                Object[] objArr16 = new Object[1];
                c(b9, b10, b10, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iMakeMeasureSpec = 625 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iRgb = (-16777202) - Color.rgb(0, 0, 0);
                        byte[] bArr3 = $$a;
                        byte b11 = (byte) (-bArr3[5]);
                        byte b12 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        a(b11, b12, b12, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iMakeMeasureSpec, iRgb, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        b(new char[]{5333, 28549, 57966, 26331, 63911, 31750, 61674, 19203, 52771, 17040, 50476, 23026, 56505, 22292, 44018, 11840, 41257, 9656, 47222, 15574, 47035, 2580}, 31583 - View.combineMeasuredStates(0, 0), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        b(new char[]{5329, 54241, 39591, 16751, 2083, 61644, 49030, 26217, 11545, 5588, 56546, 39859, 17009, 2364, 61903}, 51001 - (ViewConfiguration.getScrollBarSize() >> 8), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRed = (char) (Color.red(0) + 37567);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 626;
                            int tapTimeout = 14 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte b13 = $$a[7];
                            byte b14 = b13;
                            Object[] objArr20 = new Object[1];
                            a(b13, b14, b14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, bitsPerPixel, tapTimeout, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                            int doubleTapTimeout = 625 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 14;
                            byte[] bArr4 = $$a;
                            byte b15 = bArr4[7];
                            byte b16 = (byte) (-bArr4[5]);
                            Object[] objArr21 = new Object[1];
                            a(b15, b16, b16, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, doubleTapTimeout, touchSlop, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                        int i16 = i15 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
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
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 == null) {
                throw null;
            }
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i20 = i17 + 1394912856 + (((~iMaxMemory) | 81005577) * 1324) + (((~(iMaxMemory | 1188383967)) | (~(635354153 | iMaxMemory))) * (-1324)) + 551623716;
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        Object obj2 = new Object[]{new int[]{i19}, new int[1], new int[]{i18}, strArr4}[1];
        ((int[]) obj2)[0] = i22 ^ (i22 << 5);
        if (!(obj instanceof zzazo)) {
            return false;
        }
        zzazo zzazoVar = (zzazo) obj;
        if (this.zza == zzazoVar.zza && this.zzb == zzazoVar.zzb) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
            int i24 = i23 % 2;
            return true;
        }
        int i25 = ((int[]) obj2)[0];
        int i26 = ((i25 * i25) - (~(-(1830332428 * i25)))) - 1;
        int i27 = -(i25 * (-1932020142));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = ((i28 | (-71152991)) << 1) - ((-71152991) ^ i28);
        int i30 = i29 >> 16;
        int i31 = (((-131071) & i30) + (i30 | (-131071))) / 65536;
        int i32 = (i31 & 1) + (i31 | 1);
        int i33 = ((i29 | i32) << 1) - (i32 ^ i29);
        int i34 = i29 >> 23;
        int i35 = ((i34 & (-1023)) + (i34 | (-1023))) / 512;
        int i36 = -((((i35 | 1) << 1) - (i35 ^ 1)) ^ i33);
        int i37 = (i36 & 1) + (i36 | 1);
        int i38 = i37 >> 29;
        int i39 = (((i38 & (-15)) + (i38 | (-15))) / 8) + 1;
        return 0 / (((-((i39 ^ 1) + ((i39 & 1) << 1))) & i37) * 301);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return i2 % 2 == 0 ? (System.identityHashCode(this.zza) / 65535) % this.zzb : (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }

    zzazo(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }
}
