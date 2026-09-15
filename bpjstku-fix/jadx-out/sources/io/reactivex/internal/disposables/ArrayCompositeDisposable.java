package io.reactivex.internal.disposables;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.BufferProviderState;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<BufferProviderState> implements BufferProviderState {
    private static final long serialVersionUID = 2746389416410565408L;
    private static final byte[] $$c = {38, 31, -70, -1};
    private static final int $$f = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {74, 60, 122, -26, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -21, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
    private static final int $$e = 164;
    private static final byte[] $$a = {5, 11, -122, -94, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 46;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722401;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = io.reactivex.internal.disposables.ArrayCompositeDisposable.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = 53 - r8
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-10)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.ArrayCompositeDisposable.a(short, int, short, java.lang.Object[]):void");
    }

    private static void c(short s, byte b, short s2, Object[] objArr) {
        int i = 39 - (b * 35);
        int i2 = 99 - (s * 15);
        int i3 = s2 * 17;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[53 - i3];
        int i4 = 52 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i4 + (-i2)) - 8;
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i])) - 8;
            i++;
            i5 = i6;
        }
    }

    public ArrayCompositeDisposable() {
        super(2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d4  */
    private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            j = 0;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i5 = $10 + 11;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int maxKeyCode = 3291 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 31;
                    byte b = (byte) (-$$c[3]);
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, maxKeyCode, iIndexOf, 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iRed = 651 - Color.red(0);
                    int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b3 = (byte) ($$c[3] + 1);
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iRed, pressedStateDuration, -450685997, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 113;
            $11 = i8 % 128;
            int i9 = i8 % 2;
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
                int i10 = $11 + 105;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i2];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)));
                        int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                        int capsMode = 44 - TextUtils.getCapsMode("", 0, 0);
                        byte b5 = (byte) ($$c[3] + 1);
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iCombineMeasuredStates, capsMode, -450685997, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43;
                        byte b7 = (byte) ($$c[3] + 1);
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iNormalizeMetaState, i11, -450685997, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                j = 0;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0263  */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, BufferProviderState bufferProviderState) throws Throwable {
        BufferProviderState bufferProviderState2;
        int i2;
        Object[] objArr;
        int i3 = 2 % 2;
        do {
            bufferProviderState2 = get(i);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            int i4 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 921;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                byte[] bArr = $$a;
                byte b = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b | 52), bArr[37], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, capsMode, longPressTimeout, -1048449946, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(true, TextUtils.getTrimmedLength("") + 160, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, 7 - ExpandableListView.getPackedPositionGroup(0L), new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 163, 15 - KeyEvent.keyCodeFromString(""), KeyEvent.keyCodeFromString("") + 1, new char[]{65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                a(bArr2[7], bArr2[80], bArr2[37], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, keyRepeatDelay, iNormalizeMetaState, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                    int i5 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr3[7], (byte) (-bArr3[33]), (byte) ($$b + 5), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i5, modifierMetaStateMask, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = ~iIdentityHashCode;
                int i7 = (((149746270 + (((~((-753389635) | i6)) | 1020690009) * 519)) + (((~(i6 | (-2195459))) | (~(1022885467 | iIdentityHashCode))) * (-519))) + (((~(iIdentityHashCode | 1020690009)) | 753389634) * 519)) - 559611457;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 160, ExpandableListView.getPackedPositionGroup(0L) + 26, 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(true, TextUtils.indexOf("", "") + 167, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-16777202) - Color.rgb(0, 0, 0), new char[]{65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n'}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (!(!(applicationContext instanceof ContextWrapper))) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                        if (i10 % 2 != 0) {
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
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 == 0) {
                    i2 = 4;
                    int i12 = 3 % 4;
                } else {
                    i2 = 4;
                }
                try {
                    Object[] objArr10 = new Object[i2];
                    objArr10[3] = -559611457;
                    objArr10[2] = 0;
                    objArr10[1] = Integer.valueOf(i);
                    objArr10[0] = applicationContext;
                    byte[] bArr4 = $$d;
                    byte b2 = bArr4[49];
                    byte b3 = bArr4[72];
                    Object[] objArr11 = new Object[1];
                    c(b2, b3, b3, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b4 = bArr4[72];
                    byte b5 = bArr4[49];
                    Object[] objArr12 = new Object[1];
                    c(b4, b5, b5, objArr12);
                    objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString("") + 922;
                        int iNormalizeMetaState2 = 28 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr5[7], (byte) (-bArr5[33]), (byte) ($$b + 5), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iAxisFromString, iNormalizeMetaState2, -1142834547, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        b(true, TextUtils.indexOf((CharSequence) "", '0') + 161, 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 7, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        b(false, 164 - Color.blue(0), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), 1 - TextUtils.indexOf("", "", 0), new char[]{65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6}, objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                            int iNormalizeMetaState3 = 921 - KeyEvent.normalizeMetaState(0);
                            int iRgb = Color.rgb(0, 0, 0) + 16777244;
                            byte[] bArr6 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr6[7], bArr6[80], bArr6[37], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, iNormalizeMetaState3, iRgb, -778300370, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                            int capsMode2 = 921 - TextUtils.getCapsMode("", 0, 0);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 28;
                            byte[] bArr7 = $$a;
                            byte b6 = bArr7[80];
                            Object[] objArr17 = new Object[1];
                            a(b6, (byte) (b6 | 52), bArr7[37], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, capsMode2, trimmedLength, -1048449946, false, (String) objArr17[0], null);
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
                if (strArr == null) {
                    throw null;
                }
                while (i4 < strArr.length) {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                    if (i13 % 2 != 0) {
                        arrayList.add(strArr[i4]);
                        i4 += 96;
                    } else {
                        arrayList.add(strArr[i4]);
                        i4++;
                    }
                }
                throw null;
            }
            int i14 = ((int[]) objArr[0])[0];
            int[] iArr = {i ^ (i << 5)};
            Object[] objArr18 = {iArr, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i15 = ~i;
            int i16 = i14 + (((~((-1083180377) | i15)) | (~(1606110715 | i))) * 988) + 288636427 + (((~(i15 | 1606110715)) | (~((-1251149305) | i)) | 167968928) * 988);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            int i20 = i19 % 2;
            if (bufferProviderState2 == DisposableHelper.DISPOSED) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                int i22 = i21 % 2;
                bufferProviderState.dispose();
                int i23 = ((int[]) objArr18[0])[0];
                int i24 = ((((i23 * i23) - (~(-(580795631 * i23)))) - 1) - (~(-(i23 * (-1666417043))))) - 1;
                int i25 = (i24 & 143909444) + (143909444 | i24);
                int i26 = i25 >> 25;
                int i27 = ((i26 ^ (-255)) + ((i26 & (-255)) << 1)) / 128;
                int i28 = (i25 - (~(((i27 | 1) << 1) - (i27 ^ 1)))) - 1;
                int i29 = i25 >> 22;
                int i30 = ((i29 ^ (-2047)) + ((i29 & (-2047)) << 1)) / 1024;
                int i31 = (-(i28 ^ ((i30 ^ 1) + ((i30 & 1) << 1)))) + 2;
                int i32 = ((i31 >> 24) - 511) / 256;
                int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
                return 0 / ((i31 & (-((i33 & 1) + (i33 | 1)))) * 815);
            }
        } while (!compareAndSet(i, bufferProviderState2, bufferProviderState));
        if (bufferProviderState2 != null) {
            bufferProviderState2.dispose();
        }
        return true;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        int i;
        BufferProviderState andSet;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = 1;
            if (get(1) == DisposableHelper.DISPOSED) {
                return;
            }
        } else {
            i = 0;
            if (get(0) == DisposableHelper.DISPOSED) {
                return;
            }
        }
        int length = length();
        while (i < length) {
            if (get(i) != DisposableHelper.DISPOSED && (andSet = getAndSet(i, DisposableHelper.DISPOSED)) != DisposableHelper.DISPOSED && andSet != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                andSet.dispose();
                if (i5 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            i++;
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        int i = 2 % 2;
        boolean z = false;
        if (get(0) == DisposableHelper.DISPOSED) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            z = !(i2 % 2 == 0);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r6 = r6 + 119
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = io.reactivex.internal.disposables.ArrayCompositeDisposable.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
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
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.ArrayCompositeDisposable.$$g(int, byte, int):java.lang.String");
    }
}
