package com.bpjstku.databinding;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySyariahPrintEakadBinding implements ViewBinding {
    public final MaterialButton btnExit;
    public final MaterialButton btnPrintEakad;
    public final ImageView imgActivated;
    public final LayoutToolbarBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvMessageSyariahActivated;
    public final TextView tvTitleSyariahActivated;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {110, -73, -111, 99, 20, -37, 56, -7, 32, -8, 23, -21, 35, 7, 5, 11, -26, 55, 5, 14, -2, 29, -1, 16, 9, -31, 51, -3, 11, 20, 3, 9, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -57};
    private static final int $$e = 0;
    private static final byte[] $$a = {111, 40, 23, -13, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 216;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59705, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59757, 59756, 59746, 59744, 59771, 59751, 59439, 59428, 59436, 59415, 59435, 59398, 59412, 59435, 59429, 59424, 59415, 59436, 59435, 59435, 59427, 59778, 59410, 59408, 59414, 59433, 59413, 59411, 59888, 59890, 59409, 59433, 59402, 59874, 59407, 59414, 59435, 59434, 59434, 59435, 59427, 59411, 59419, 59412, 59414, 59422, 59423, 59720, 59789, 59781, 59801, 59803, 59801, 59783, 59803, 59804, 59805, 59780, 59782, 59806, 59765, 59767, 59807, 59801, 59781, 59759, 59848, 59842, 59842, 59822, 59808, 59855, 59854, 59843, 59811, 59797, 59855, 59871, 59866, 59841, 59852, 59712, 59782, 59772, 59784, 59794, 59802, 59802, 59807, 59783, 59788, 59778, 59777, 59788, 59783, 59767, 59763, 59736, 59781, 59803, 59811, 59821, 59780, 59761, 59767, 59802, 59781, 59762, 59761, 59781, 59803, 59763, 59783, 59780, 59763, 59803, 59810, 59800, 59761, 59763, 59802, 59820, 59803, 59763, 59774, 59762, 59762, 59782, 59802, 59766, 59761, 59803, 59780, 59773, 59782, 59803, 59801, 59820, 59803, 59760, 59761, 59802, 59802, 59772, 59763, 59761, 59780, 59820, 59810, 59802, 59802, 59809, 59800, 59760, 59801, 59811, 59822, 59822, 59820, 59810, 59780, 59666, 59705, 59712, 59758, 59717, 59709, 59710, 59704, 59704, 59709, 59717, 59717, 59698, 59718, 59712, 59704, 59705, 59713, 59759, 59719, 59704, 59713, 59715, 59704, 59717, 59759, 59753, 59753, 59718, 59704, 59705, 59712, 59719, 59717, 59758, 59712, 59714, 59752, 59712, 59719, 59718, 59704, 59705, 59711, 59711, 59711, 59709, 59717, 59717, 59719, 59712, 59712, 59718, 59709, 59709, 59698, 59699, 59699, 59718, 59712, 59704, 59705, 59719, 59752};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.$$a
            int r7 = r7 * 52
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 24
            int r0 = r7 + 29
            int r6 = r6 * 21
            int r6 = 105 - r6
            int r8 = r8 * 28
            int r8 = r8 + 4
            byte[] r1 = com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 28
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r3
            r3 = r6
            r6 = r5
        L2d:
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.d(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0221  */
    /* JADX WARN: Code duplicated, block: B:68:0x023c  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x022d -> B:60:0x0215). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int[] r23, boolean r24, byte[] r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.c(int[], boolean, byte[], java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0205  */
    /* JADX WARN: Code duplicated, block: B:27:0x0207  */
    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37566);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, doubleTapTimeout, deadChar, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 16}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 187, 13}, true, null, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
            int iMyPid = 625 - (Process.myPid() >> 22);
            int i2 = 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte b3 = $$a[5];
            byte b4 = (byte) (-b3);
            byte b5 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (-b5), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iMyPid, i2, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
                int iMyPid2 = (Process.myPid() >> 22) + 625;
                int jumpTapTimeout = 14 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte b6 = $$a[5];
                byte b7 = (byte) (-b6);
                Object[] objArr6 = new Object[1];
                a(b7, (byte) (b7 | 50), (byte) (-b6), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iMyPid2, jumpTapTimeout, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i5 = 182097076 + (((~(iMaxMemory | 956303067)) | (-867435054)) * (-668)) + ((956303067 | (~((-867435054) | iMaxMemory))) * 1336) + ((iMaxMemory | (-45350949)) * 668) + 1576034866;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            objArr = new Object[]{new int[]{i4}, new int[1], new int[]{i3}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 178, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 36, 6}, false, new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i8 = b + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 49 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            c(new int[]{81, 16, 94, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 35, 11}, true, new byte[]{0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new int[]{113, 64, 68, 0}, true, new byte[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new int[]{177, 64, 0, 25}, false, new byte[]{0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1576034866};
                byte b8 = (byte) $$e;
                byte b9 = b8;
                Object[] objArr15 = new Object[1];
                d(b8, b9, b9, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b10 = $$d[65];
                byte b11 = b10;
                Object[] objArr16 = new Object[1];
                d(b10, b11, b11, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i10 = ((int[]) objArr17[0])[0];
                int i11 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionChild = (char) (37566 - ExpandableListView.getPackedPositionChild(0L));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 626;
                        int mirror = '>' - AndroidCharacter.getMirror('0');
                        byte b12 = $$a[5];
                        byte b13 = (byte) (-b12);
                        Object[] objArr18 = new Object[1];
                        a(b13, (byte) (b13 | 50), (byte) (-b12), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iIndexOf, mirror, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{0, 22, 0, 16}, false, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new int[]{22, 15, 187, 13}, true, null, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char touchSlop = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
                            int windowTouchSlop = 625 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                            byte b14 = $$a[5];
                            byte b15 = (byte) (-b14);
                            byte b16 = b14;
                            Object[] objArr21 = new Object[1];
                            a(b15, b16, (byte) (-b16), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, windowTouchSlop, maxKeyCode, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 37567);
                            int iRgb = (-16776591) - Color.rgb(0, 0, 0);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 14;
                            byte[] bArr2 = $$a;
                            byte b17 = bArr2[7];
                            Object[] objArr22 = new Object[1];
                            a(b17, bArr2[5], b17, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, iRgb, trimmedLength, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[0])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int i17 = ~((int) SystemClock.uptimeMillis());
            int i18 = i14 + (-503529109) + (((~((-1279059887) | i17)) | (-544678235)) * (-983)) + (((~(i17 | (-544678235))) | 541261904) * 983);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[1])[0] = i20 ^ (i20 << 5);
            Object[] objArr23 = {new int[]{i16}, new int[1], new int[]{i15}, strArr2};
            int i21 = b + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
            int i22 = i21 % 2;
            return getRoot();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i13));
    }

    private ActivitySyariahPrintEakadBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, LayoutToolbarBinding layoutToolbarBinding, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnExit = materialButton;
        this.btnPrintEakad = materialButton2;
        this.imgActivated = imageView;
        this.layoutToolbar = layoutToolbarBinding;
        this.tvMessageSyariahActivated = textView;
        this.tvTitleSyariahActivated = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.rootView;
        int i5 = i3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return constraintLayout;
    }

    public static ActivitySyariahPrintEakadBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        ActivitySyariahPrintEakadBinding activitySyariahPrintEakadBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = b + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySyariahPrintEakadBindingInflate;
    }

    public static ActivitySyariahPrintEakadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_syariah_print_eakad, viewGroup, false);
        if (!(!z)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = b + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 % 4;
            }
        }
        ActivitySyariahPrintEakadBinding activitySyariahPrintEakadBindingBind = bind(viewInflate);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return activitySyariahPrintEakadBindingBind;
    }

    public static ActivitySyariahPrintEakadBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btnExit;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnExit);
        if (materialButton != null) {
            int i3 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPrintEakad);
            if (materialButton2 != null) {
                i2 = R.id.imgActivated;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgActivated);
                if (imageView != null) {
                    i2 = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                        i2 = R.id.tvMessageSyariahActivated;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvMessageSyariahActivated);
                        if (textView != null) {
                            i2 = R.id.tvTitleSyariahActivated;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleSyariahActivated);
                            if (textView2 != null) {
                                ActivitySyariahPrintEakadBinding activitySyariahPrintEakadBinding = new ActivitySyariahPrintEakadBinding((ConstraintLayout) view, materialButton, materialButton2, imageView, layoutToolbarBindingBind, textView, textView2);
                                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                                b = i4 % 128;
                                if (i4 % 2 != 0) {
                                    int i5 = 84 / 0;
                                }
                                return activitySyariahPrintEakadBinding;
                            }
                        }
                    }
                }
            } else {
                i2 = R.id.btnPrintEakad;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r8 = r8 + 99
            byte[] r0 = com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + 1
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.databinding.ActivitySyariahPrintEakadBinding.$$g(short, int, short):java.lang.String");
    }
}
