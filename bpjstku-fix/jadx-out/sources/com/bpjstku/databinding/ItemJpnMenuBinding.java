package com.bpjstku.databinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemJpnMenuBinding implements ViewBinding {
    public final AppCompatImageView imgBalanceCheck;
    public final AppCompatImageView imgJpnSimulation;
    private final MaterialCardView rootView;
    public final AppCompatTextView tvJpSimulationDescription;
    public final AppCompatTextView tvJpSimulationMenu;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$f = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {60, 80, 13, 34, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -67, -3, 12, -15, 13, -10, -7, 18, -20, 10, -7, 0, 63, -55, -6, 1, -3, -12, 18, -12, 8, 1, -18, 13, 53, -23, -34, -16, 18, -9, -4, 39, -38, 1, -3, -12, 18, -12, 40, -31, -18, 13, 34, -35, -18, 10, -14, 12, -12, -6, 84, -80, 2, 10, 1, -7, 7, -12, 71, -1, -70, -6, 1, 2, -6, 8, 0, 63, -83, 12, 3, -19, 41, -35, 10, -2, -8, 71, -65, -2, -2, 4, -21, 8, -9, 79, -16, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 64};
    private static final int $$e = 10;
    private static final byte[] $$a = {58, -51, 54, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 124;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long b = 6091227850319327901L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.databinding.ItemJpnMenuBinding.$$a
            int r7 = r7 * 15
            int r7 = 53 - r7
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ItemJpnMenuBinding.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.databinding.ItemJpnMenuBinding.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r7 = r7 * 46
            int r1 = r7 + 53
            int r8 = r8 * 98
            int r8 = 101 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 52
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L31:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ItemJpnMenuBinding.d(int, short, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 41;
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
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1356, 38 - TextUtils.getCapsMode("", 0, 0), 894276454, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 468, 13 - TextUtils.getOffsetBefore("", 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        int i8 = $11 + 59;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 16 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01de  */
    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int mirror = AndroidCharacter.getMirror('0') + 2219;
            int defaultSize = 33 - View.getDefaultSize(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, mirror, defaultSize, -887667012, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{40386, 59822, 40355, 24193, 34091, 61755, 28435, 53160, 65089, 38176, 51975, 11224, 23157, 2318, 42849, 38833, 46719, 44386, 847, 62459, 4639, 16710, 40779, 24549, 28221, 58706}, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{25494, 49800, 25587, 8597, 53924, 55839, 4098, 38949, '\t', 48650, 46099, 31787, 42027, 8762, 55351, 49177, 18491, 34394, 31818}, -TextUtils.lastIndexOf("", '0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iResolveSize = View.resolveSize(0, 0) + 2267;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b3, b3, (byte) (-bArr2[1]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iResolveSize, iIndexOf, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 33;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                byte b5 = bArr3[5];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 102), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, iKeyCodeFromString, iKeyCodeFromString2, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[0])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = ((((~((-576104004) | iUptimeMillis)) | 570597443) * (-283)) - 920967564) + ((~(iUptimeMillis | (-5506561))) * 283) + 1305597835;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{25124, 31605, 25157, 63388, 52493, 25568, 50702, 34702, 423, 2043, 25114, 25598, 42397, 39894, 3618, 57322, 18849, 16297, 43602, 48081, 60898, 54199, 13902, 6101, 37356, 30602, 53884, 62437, 13773, 2962}, TextUtils.getOffsetAfter("", 0) + 1, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{65479, 6792, 65444, 48424, 57794, 518, 36012, 43841, 40014, 26113, 10430, 20318, 14447, 64043, 17546, 62306, 54368, 24150, 57574, 38686, 28696, 45645}, (Process.myTid() >> 22) + 1, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
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
            c(new char[]{11239, 56997, 11149, 15242, 47703, 50751, 2570, 61639, 18469, 41518, 44553, 5348, 60504, 15960, 49687, 43239, 'P', 39534, 26197, 52367}, (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{42734, 25739, 42631, 34502, 451, 31764, 46933, 19292, 50550, 6149, 4944, 44903, 24958, 33849, 32635, 4962, 36201, 8283, 56088, 30483}, 1 - Drawable.resolveOpacity(0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1305597835};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[5];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[26];
                byte b9 = b8;
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iRgb = (-16774949) - Color.rgb(0, 0, 0);
                        int edgeSlop = 33 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        byte b11 = bArr5[5];
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, (byte) (b11 | 102), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, iRgb, edgeSlop, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{40386, 59822, 40355, 24193, 34091, 61755, 28435, 53160, 65089, 38176, 51975, 11224, 23157, 2318, 42849, 38833, 46719, 44386, 847, 62459, 4639, 16710, 40779, 24549, 28221, 58706}, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{25494, 49800, 25587, 8597, 53924, 55839, 4098, 38949, '\t', 48650, 46099, 31787, 42027, 8762, 55351, 49177, 18491, 34394, 31818}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int mode = 2267 - View.MeasureSpec.getMode(0);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            a(b12, b12, (byte) (-bArr6[1]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, mode, pressedStateDuration, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
                            int tapTimeout2 = 33 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte[] bArr7 = $$a;
                            byte b13 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b13, b13, bArr7[132], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, keyRepeatDelay, tapTimeout2, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        int i11 = i10 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[c])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode;
            int i20 = i16 + (-1453893174) + (((~((-496751378) | i19)) | 311961938) * (-90)) + (((~((-496751378) | iIdentityHashCode)) | (-530316116)) * (-45)) + (((~(iIdentityHashCode | (-311961939))) | (-496751378) | (~(i19 | 311961938))) * 45);
            int i21 = i20 ^ (i20 << 13);
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                int i24 = 2;
                int i25 = i23 % 2;
                int i26 = 0;
                while (i26 < strArr3.length) {
                    int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
                    if (i27 % i24 == 0) {
                        arrayList.add(strArr3[i26]);
                        i26 += 105;
                    } else {
                        arrayList.add(strArr3[i26]);
                        i26++;
                    }
                    i24 = 2;
                }
            }
            int[] iArr = new int[i13];
            int i28 = i13 - 1;
            iArr[i28] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i28) % 2) - 1], 1).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            int i31 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i32 = i29 + 2080898353 + (((~((-277216389) | iIdentityHashCode2)) | (~((~iIdentityHashCode2) | 531496927))) * (-318)) + (((~(328072341 | iIdentityHashCode2)) | 203424586) * (-318)) + (((~(iIdentityHashCode2 | (-328072342))) | (-480640975)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr22[2])[0] = i34 ^ (i34 << 5);
        }
        return getRoot();
    }

    private ItemJpnMenuBinding(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = materialCardView;
        this.imgBalanceCheck = appCompatImageView;
        this.imgJpnSimulation = appCompatImageView2;
        this.tvJpSimulationDescription = appCompatTextView;
        this.tvJpSimulationMenu = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        MaterialCardView materialCardView = this.rootView;
        int i5 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return materialCardView;
    }

    public static ItemJpnMenuBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        ItemJpnMenuBinding itemJpnMenuBindingInflate = inflate(layoutInflater, null, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return itemJpnMenuBindingInflate;
    }

    public static ItemJpnMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_jpn_menu, viewGroup, false);
        if (z) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i3 = 79 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        ItemJpnMenuBinding itemJpnMenuBindingBind = bind(viewInflate);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemJpnMenuBindingBind;
        }
        throw null;
    }

    public static ItemJpnMenuBinding bind(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.imgBalanceCheck;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceCheck);
        if (appCompatImageView != null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.imgJpnSimulation;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgJpnSimulation);
            if (appCompatImageView2 != null) {
                i4 = R.id.tvJpSimulationDescription;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpSimulationDescription);
                if (appCompatTextView != null) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                    Object obj = null;
                    if (i7 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpSimulationMenu);
                    if (appCompatTextView2 != null) {
                        ItemJpnMenuBinding itemJpnMenuBinding = new ItemJpnMenuBinding((MaterialCardView) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                        if (i8 % 2 != 0) {
                            return itemJpnMenuBinding;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    i4 = R.id.tvJpSimulationMenu;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 107
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = com.bpjstku.databinding.ItemJpnMenuBinding.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ItemJpnMenuBinding.$$g(short, short, short):java.lang.String");
    }
}
