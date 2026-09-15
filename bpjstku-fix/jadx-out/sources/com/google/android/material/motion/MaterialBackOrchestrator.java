package com.google.android.material.motion;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.view.BackEventCompat;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialBackOrchestrator {
    private final BackCallbackDelegate backCallbackDelegate;
    private final MaterialBackHandler backHandler;
    private final View view;

    interface BackCallbackDelegate {
        void startListeningForBackCallbacks(MaterialBackHandler materialBackHandler, View view, boolean z);

        void stopListeningForBackCallbacks(View view);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(T t) {
        this(t, t);
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    public final boolean shouldListenForBackCallbacks() {
        return this.backCallbackDelegate != null;
    }

    public final void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public final void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    private void startListeningForBackCallbacks(boolean z) {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z);
        }
    }

    public final void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    private static BackCallbackDelegate createBackCallbackDelegate() {
        if (Build.VERSION.SDK_INT >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return new Api33BackCallbackDelegate();
        }
        return null;
    }

    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private static final byte[] $$c = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
        private static final int $$f = 58;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {53, -70, 9, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 109;
        private static final byte[] $$a = {27, 65, -33, 120, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -36, -19, -4, -10, 8, -8, 0, 22, -22, -15, 11, -8, 0, -15, 0, -17, 34, -19, -4, -10, 8, -8, 0, 26, -39, 6, -11};
        private static final int $$b = 141;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int[] TuitionPaymentFragmentbindingInflater1 = {-372748817, 17494039, -520405866, 1589947998, 1197761266, -1161594707, -1422065320, -140117318, -805096778, 1858116590, -377651612, 1705596424, 1030706055, 2142684089, -368533541, 309784010, -1506533470, 266668937};

        private static void a(short s, short s2, short s3, Object[] objArr) {
            int i = s3 + 4;
            int i2 = s * 19;
            int i3 = 103 - (s2 * 6);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[33 - i2];
            int i4 = 32 - i2;
            int i5 = -1;
            if (bArr == null) {
                i3 = (i4 + (-i)) - 2;
                i = i;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i + 1;
                i3 = (i3 + (-bArr[i7])) - 2;
                i = i7;
                i5 = i6;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 52
                int r8 = 55 - r8
                byte[] r0 = com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.$$d
                int r6 = r6 * 52
                int r1 = 53 - r6
                int r7 = r7 + 84
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2e
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r8 = r8 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r7 = r7 + r8
                int r7 = r7 + (-11)
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.b(short, byte, byte, java.lang.Object[]):void");
        }

        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        OnBackInvokedCallback createOnBackInvokedCallback(final MaterialBackHandler materialBackHandler) {
            int i = 2 % 2;
            OnBackAnimationCallback onBackAnimationCallback = new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.startBackProgress(new BackEventCompat(backEvent));
                    }
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.updateBackProgress(new BackEventCompat(backEvent));
                    }
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    if (Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.cancelBackProgress();
                    }
                }
            };
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return onBackAnimationCallback;
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = TuitionPaymentFragmentbindingInflater1;
            int i3 = -1870535734;
            int i4 = 1;
            int i5 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i6 = 0;
                while (i6 < length2) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr3[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i5;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", ""), 3291 - TextUtils.getTrimmedLength(""), 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i6++;
                        int i7 = $10 + 33;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = -1870535734;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = TuitionPaymentFragmentbindingInflater1;
            int i11 = 3;
            if (iArr6 != null) {
                int i12 = $10 + 19;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i13 = 0;
                while (i13 < length) {
                    int i14 = $10 + i11;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        Object[] objArr3 = new Object[i4];
                        objArr3[0] = Integer.valueOf(iArr6[i13]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 3291 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr2[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i13++;
                        iArr6 = iArr6;
                        i11 = 3;
                        i4 = 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr6 = iArr2;
            }
            char c = 0;
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i16 = 17;
                for (int i17 = 1; i16 > i17; i17 = 1) {
                    int i18 = $11 + 35;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i16];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 2559, 29 - KeyEvent.normalizeMetaState(0), 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i16--;
                    int i20 = $10 + 35;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                }
                int i22 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i23 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28879), TextUtils.lastIndexOf("", '0', 0) + 349, TextUtils.getOffsetBefore("", 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Code duplicated, block: B:107:0x0865  */
        /* JADX WARN: Code duplicated, block: B:109:0x0869  */
        /* JADX WARN: Code duplicated, block: B:112:0x0879  */
        /* JADX WARN: Code duplicated, block: B:114:0x087d  */
        /* JADX WARN: Code duplicated, block: B:116:0x0888  */
        /* JADX WARN: Code duplicated, block: B:117:0x088a  */
        /* JADX WARN: Code duplicated, block: B:120:0x089b  */
        /* JADX WARN: Code duplicated, block: B:122:0x08a0  */
        /* JADX WARN: Code duplicated, block: B:125:0x08c3  */
        /* JADX WARN: Code duplicated, block: B:127:0x0915  */
        /* JADX WARN: Code duplicated, block: B:128:0x0919  */
        /* JADX WARN: Code duplicated, block: B:130:0x0920  */
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
            long j;
            int i;
            int i2;
            int i3;
            boolean z;
            int i4;
            int i5;
            int i6;
            String string;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i7;
            int i8;
            int i9;
            int i10;
            Method method;
            int[] iArr;
            int iResolveSizeAndState;
            int i11;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i12;
            int i13;
            Object objInvoke;
            int i14;
            int[] iArr2;
            int i15;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i16;
            int i17;
            Object[] objArr;
            Method method2;
            int i18 = 2;
            int i19 = 2 % 2;
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i21 = 1;
            int i22 = ((i20 | 115) << 1) - (i20 ^ 115);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
            int i23 = i22 % 2;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[28], bArr[7], bArr[13], objArr2);
            int i24 = 0;
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[7];
            byte b2 = bArr[28];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 | 31), objArr3);
            String str = (String) objArr3[0];
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i26 = (i25 ^ 63) + ((i25 & 63) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
            int i27 = i26 % 2;
            Class<?> cls2 = Class.forName("android.app.ApplicationPackageManager");
            byte b3 = bArr[7];
            byte b4 = bArr[28];
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 | 31), objArr4);
            Method[] methodArr = {cls.getMethod(str, String.class, Integer.TYPE), cls2.getMethod((String) objArr4[0], String.class, Integer.TYPE)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRed = (char) Color.red(0);
                int threadPriority = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr2 = $$d;
                byte b5 = bArr2[7];
                Object[] objArr5 = new Object[1];
                b(b5, b5, (byte) (-bArr2[5]), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, threadPriority, maxKeyCode, 1814927978, false, (String) objArr5[0], null);
            }
            int i28 = 14;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822, 21 - TextUtils.indexOf((CharSequence) "", '0', 0))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i29 = 0;
                while (i29 < length) {
                    Method method3 = declaredMethods[i29];
                    int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i30 % 128;
                    if (i30 % i18 != 0) {
                        try {
                            iArr = new int[i28];
                            // fill-array-data instruction
                            iArr[0] = 171616809;
                            iArr[1] = -1861835210;
                            iArr[2] = 288787086;
                            iArr[3] = -1244446795;
                            iArr[4] = 285879172;
                            iArr[5] = 456934963;
                            iArr[6] = -770089619;
                            iArr[7] = -1210468834;
                            iArr[8] = 1514017126;
                            iArr[9] = 1401225177;
                            iArr[10] = 638313094;
                            iArr[11] = 1691738534;
                            iArr[12] = -257865521;
                            iArr[13] = 1999830372;
                            iResolveSizeAndState = View.resolveSizeAndState(i21, i21, i24);
                            i11 = -60;
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i12 = (980 << iResolveSizeAndState) / (-57702);
                            i13 = 59;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        iArr = new int[i28];
                        // fill-array-data instruction
                        iArr[0] = 171616809;
                        iArr[1] = -1861835210;
                        iArr[2] = 288787086;
                        iArr[3] = -1244446795;
                        iArr[4] = 285879172;
                        iArr[5] = 456934963;
                        iArr[6] = -770089619;
                        iArr[7] = -1210468834;
                        iArr[8] = 1514017126;
                        iArr[9] = 1401225177;
                        iArr[10] = 638313094;
                        iArr[11] = 1691738534;
                        iArr[12] = -257865521;
                        iArr[13] = 1999830372;
                        iResolveSizeAndState = View.resolveSizeAndState(i24, i24, i24);
                        int i31 = iResolveSizeAndState * 980;
                        i11 = -25;
                        i13 = 24;
                        i12 = ((i31 | (-23472)) << i21) - (i31 ^ (-23472));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                    HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i32 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i33 = -(-(979 * (~((i11 & i32) | (i11 ^ i32)))));
                    int i34 = (i12 & i33) + (i33 | i12);
                    int i35 = ((iResolveSizeAndState ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (iResolveSizeAndState & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * (-979);
                    int i36 = (i34 & i35) + (i35 | i34);
                    int i37 = ~i13;
                    int i38 = ~((i37 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i37 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i39 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i40 = (i39 & iResolveSizeAndState) | (i39 ^ iResolveSizeAndState);
                    int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                    int i42 = i41 % i18;
                    int i43 = ~i40;
                    if (i42 == 0) {
                        int i44 = (i43 & i38) | (i38 ^ i43);
                        Object[] objArr6 = new Object[i21];
                        c(iArr, i36 % (((i44 | 979) << i21) - (i44 ^ 979)), objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[i24]);
                        Object[] objArr7 = new Object[i21];
                        c(new int[]{759470524, 72609479, -291772709, 1538854776, -194515940, 32054348, 1734079247, 3639233}, 4 >> (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr7);
                        objInvoke = cls3.getMethod((String) objArr7[i24], null).invoke(method3, null);
                    } else {
                        int i45 = ((i43 & i38) | (i38 ^ i43)) * 979;
                        int i46 = ((i36 | i45) << i21) - (i45 ^ i36);
                        Object[] objArr8 = new Object[i21];
                        c(iArr, i46, objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[i24]);
                        Object[] objArr9 = new Object[i21];
                        c(new int[]{759470524, 72609479, -291772709, 1538854776, -194515940, 32054348, 1734079247, 3639233}, 10 - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr9);
                        objInvoke = cls4.getMethod((String) objArr9[i24], null).invoke(method3, null);
                    }
                    Object[] objArr10 = new Object[i21];
                    objArr10[i24] = Integer.valueOf(((Integer) objInvoke).intValue());
                    int[] iArr3 = {170175535, 220339774, 57620856, 1254509954, 1454072401, -851125849, -1754790440, 1133435531, 684723581, -570534664, -745120942, 1036291434, 1866084266, -981431146, 2000292189, 1572129047};
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(i24);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i47 = (bitsPerPixel * TypedValues.Custom.TYPE_DIMENSION) - 24381;
                    int i48 = ~bitsPerPixel;
                    int i49 = ~(i48 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    int i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i51 = i47 + (((~((i50 ^ 27) | (i50 & 27))) | i49) * (-1808));
                    int i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i53 = (i52 ^ 23) + ((i52 & 23) << i21);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53 % 128;
                    if (i53 % 2 == 0) {
                        int i54 = (i48 ^ (-28)) | (i48 & (-28));
                        int i55 = ~((i54 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i54 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i56 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i57 = ~((i56 ^ bitsPerPixel) | (i56 & bitsPerPixel) | 27);
                        i14 = i51 >>> (TypedValues.Custom.TYPE_BOOLEAN << ((i55 ^ i57) | (i57 & i55)));
                    } else {
                        int i58 = (i48 ^ (-28)) | (i48 & (-28));
                        int i59 = ~((i58 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i58 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i61 = (i60 ^ bitsPerPixel) | (i60 & bitsPerPixel);
                        int i62 = ~((i61 ^ 27) | (i61 & 27));
                        int i63 = ((i59 ^ i62) | (i59 & i62)) * TypedValues.Custom.TYPE_BOOLEAN;
                        i14 = ((i51 | i63) << 1) - (i63 ^ i51);
                    }
                    int i64 = ~((i48 ^ 27) | (i48 & 27));
                    int i65 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-28)) | ((-28) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i66 = (i64 & i65) | (i64 ^ i65);
                    int i67 = ~((i50 & bitsPerPixel) | (i50 ^ bitsPerPixel));
                    int i68 = i14 + (TypedValues.Custom.TYPE_BOOLEAN * ((i66 & i67) | (i66 ^ i67)));
                    Object[] objArr11 = new Object[1];
                    c(iArr3, i68, objArr11);
                    Class<?> cls5 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new int[]{770675899, 1918707312, 1976306381, -510752393, 655585166, 527875428}, 7 - (~View.combineMeasuredStates(0, 0)), objArr12);
                    if (((Boolean) cls5.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).booleanValue()) {
                        int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i69 % 128;
                        int i70 = i69 % 2;
                        Class cls6 = Long.TYPE;
                        Object[] objArr13 = new Object[1];
                        c(new int[]{171616809, -1861835210, 288787086, -1244446795, 285879172, 456934963, -770089619, -1210468834, 1514017126, 1401225177, 638313094, 1691738534, -257865521, 1999830372}, 23 - (~(-(-TextUtils.indexOf("", "", 0, 0)))), objArr13);
                        Class<?> cls7 = Class.forName((String) objArr13[0]);
                        int i71 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i72 = ((i71 | 61) << 1) - (i71 ^ 61);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i72 % 128;
                        int i73 = i72 % 2;
                        int[] iArr4 = {1574335077, 774911975, 1855418815, 9343196, -2138660737, 1465733293, -1324366845, -1535555059, 678326348, -821332198};
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 13;
                        int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i74 % 128;
                        int i75 = i74 % 2;
                        Object[] objArr14 = new Object[1];
                        c(iArr4, capsMode, objArr14);
                        if (cls6.equals(cls7.getMethod((String) objArr14[0], null).invoke(method3, null))) {
                            int i76 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i77 = (i76 & 95) + (i76 | 95);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i77 % 128;
                            if (i77 % 2 == 0) {
                                iArr2 = new int[]{171616809, -1861835210, 288787086, -1244446795, 285879172, 456934963, -770089619, -1210468834, 1514017126, 1401225177, 638313094, 1691738534, -257865521, 1999830372};
                                i15 = -Color.green(1);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i16 = 44;
                            } else {
                                iArr2 = new int[]{171616809, -1861835210, 288787086, -1244446795, 285879172, 456934963, -770089619, -1210468834, 1514017126, 1401225177, 638313094, 1691738534, -257865521, 1999830372};
                                i15 = -Color.green(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i16 = 24;
                            }
                            int i78 = ((i15 * (-575)) - (~(-(-(i16 * (-575)))))) - 1;
                            int i79 = ~i15;
                            int i80 = ~i16;
                            int i81 = ~((i79 ^ i80) | (i79 & i80));
                            int i82 = ~i16;
                            int i83 = ~(i82 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            int i84 = ((i81 ^ i83) | (i81 & i83)) * 576;
                            int i85 = (i78 & i84) + (i78 | i84);
                            int i86 = ~((i16 & i79) | (i79 ^ i16));
                            int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i88 = (i87 & 7) + (i87 | 7);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i88 % 128;
                            int i89 = i88 % 2;
                            int i90 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i91 = (i90 & i82) | (i82 ^ i90);
                            if (i89 != 0) {
                                int i92 = ~(i15 | i91);
                                i17 = i85 * ((i92 & i86) | (i86 ^ i92)) * 576;
                            } else {
                                int i93 = ~((i15 & i91) | (i91 ^ i15));
                                int i94 = ((i93 & i86) | (i86 ^ i93)) * 576;
                                i17 = (i85 ^ i94) + ((i94 & i85) << 1);
                            }
                            int i95 = -(-(576 * (~((i79 ^ i80) | (i79 & i80)))));
                            int i96 = ((i17 | i95) << 1) - (i95 ^ i17);
                            Object[] objArr15 = new Object[1];
                            c(iArr2, i96, objArr15);
                            Class<?> cls8 = Class.forName((String) objArr15[0]);
                            int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i98 = (i97 & 7) + (i97 | 7);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i98 % 128;
                            if (i98 % 2 != 0) {
                                int i99 = -(-(ViewConfiguration.getPressedStateDuration() << 77));
                                Object[] objArr16 = new Object[1];
                                c(new int[]{-607162781, -661492251, 473073655, 626654175, -1229012213, 997920528, -1943515051, 1084193592, 448135829, -2088221811, -5983286, 696784070}, (i99 & 120) + (i99 | 120), objArr16);
                                method2 = cls8.getMethod((String) objArr16[0], null);
                                objArr = null;
                            } else {
                                int i100 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                int i101 = ((i100 | 17) << 1) - (i100 ^ 17);
                                Object[] objArr17 = new Object[1];
                                c(new int[]{-607162781, -661492251, 473073655, 626654175, -1229012213, 997920528, -1943515051, 1084193592, 448135829, -2088221811, -5983286, 696784070}, i101, objArr17);
                                objArr = null;
                                method2 = cls8.getMethod((String) objArr17[0], null);
                            }
                            Object[] objArr18 = (Object[]) method2.invoke(method3, objArr);
                            if (objArr18.length == 2 && Long.TYPE.equals(objArr18[0])) {
                                int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i103 = ((i102 | 47) << 1) - (i102 ^ 47);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i103 % 128;
                                int i104 = i103 % 2;
                                int i105 = -(Process.myPid() >> 22);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i106 = i105 * (-244);
                                int i107 = (i106 ^ 5904) + ((i106 & 5904) << 1);
                                int i108 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i109 = ~((i108 & (-25)) | ((-25) ^ i108));
                                int i110 = ~(((-25) ^ i105) | ((-25) & i105));
                                int i111 = -(-(((i109 & i110) | (i109 ^ i110)) * (-245)));
                                int i112 = ((((i107 | i111) << 1) - (i111 ^ i107)) - (~((~((-25) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * (-245)))) - 1;
                                int i113 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & (-25)) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i114 = ((i105 & i113) | (i105 ^ i113)) * 245;
                                int i115 = (i112 ^ i114) + ((i114 & i112) << 1);
                                Object[] objArr19 = new Object[1];
                                c(new int[]{171616809, -1861835210, 288787086, -1244446795, 285879172, 456934963, -770089619, -1210468834, 1514017126, 1401225177, 638313094, 1691738534, -257865521, 1999830372}, i115, objArr19);
                                if (Class.forName((String) objArr19[0]).equals(objArr18[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                        int minimumFlingVelocity = 2823 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                                        byte[] bArr3 = $$d;
                                        byte b6 = bArr3[7];
                                        Object[] objArr20 = new Object[1];
                                        b(b6, b6, (byte) (-bArr3[5]), objArr20);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, minimumFlingVelocity, packedPositionGroup, 1814927978, false, (String) objArr20[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                        int iMyTid = (Process.myTid() >> 22) + 2823;
                                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                                        byte[] bArr4 = $$d;
                                        byte b7 = bArr4[7];
                                        Object[] objArr21 = new Object[1];
                                        b(b7, b7, (byte) (-bArr4[5]), objArr21);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, iMyTid, packedPositionType, 1814927978, false, (String) objArr21[0], null);
                                    }
                                    try {
                                        Object[] objArr22 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                            int iResolveOpacity = 2823 - Drawable.resolveOpacity(0, 0);
                                            int iGreen = Color.green(0) + 22;
                                            byte[] bArr5 = $$d;
                                            Object[] objArr23 = new Object[1];
                                            b((byte) (-bArr5[5]), bArr5[54], bArr5[7], objArr23);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, iResolveOpacity, iGreen, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr22)).longValue();
                                        int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i117 = (i116 ^ 27) + ((i116 & 27) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i117 % 128;
                                        int i118 = i117 % 2;
                                        break;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i29 = ((i29 | 1) << 1) - (i29 ^ 1);
                    int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i120 = (i119 & 65) + (i119 | 65);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i120 % 128;
                    int i121 = i120 % 2;
                    i18 = 2;
                    i21 = 1;
                    i24 = 0;
                    i28 = 14;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int maxKeyCode2 = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
                int i122 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                byte[] bArr6 = $$d;
                byte b8 = bArr6[7];
                Object[] objArr24 = new Object[1];
                b(b8, b8, (byte) (-bArr6[5]), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, maxKeyCode2, i122, 1814927978, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int threadPriority2 = 2823 - ((Process.getThreadPriority(0) + 20) >> 6);
                int i123 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                byte[] bArr7 = $$d;
                Object[] objArr26 = new Object[1];
                b((byte) (-bArr7[5]), (byte) 14, bArr7[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, threadPriority2, i123, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr25);
            Object[] objArr27 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c = (char) (37658 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int size = View.MeasureSpec.getSize(0) + 2720;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 20;
                byte[] bArr8 = $$d;
                Object[] objArr28 = new Object[1];
                b((byte) (-bArr8[5]), (byte) 14, bArr8[7], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, size, iIndexOf, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
            int i124 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i125 = ((i124 | 119) << 1) - (i124 ^ 119);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i125 % 128;
            if (i125 % 2 == 0) {
                long j2 = -1231353196;
                long j3 = -494;
                long j4 = -1;
                long j5 = (j3 * j2) + (j3 * jLongValue) + (((long) (-495)) * ((j2 | jLongValue) ^ j4));
                long j6 = 495;
                long jMyPid = (((long) Process.myPid()) ^ j4) | j2;
                j = j5 + (j6 * jMyPid) + (j6 * ((((jLongValue ^ j4) | (j2 ^ j4)) ^ j4) | (jMyPid ^ j4))) + ((long) (-579052649));
                i = (int) (j << 106);
                int i126 = (int) Runtime.getRuntime().totalMemory();
                i2 = (-1067651596) + (((~(145275388 | i126)) | 1582501799) * (-366));
                i3 = ((~(i126 | 1593556991)) | 134220196) * 366;
            } else {
                long j7 = -1563667658;
                long j8 = 140;
                long jMyPid2 = Process.myPid();
                long j9 = -1;
                long j10 = (j7 ^ j9) | jLongValue;
                long j11 = jMyPid2 ^ j9;
                j = (((long) 141) * j7) + (((long) (-279)) * jLongValue) + ((jLongValue | jMyPid2) * j8) + (((long) (-280)) * ((j10 ^ j9) | ((j11 | jLongValue) ^ j9))) + (j8 * ((j9 ^ (j10 | jMyPid2)) | (((jLongValue ^ j9) | j7) ^ j9) | ((j11 | j7) ^ j9))) + ((long) (-246738187));
                i = (int) (j >> 32);
                int iNextInt = new Random().nextInt(1707197302);
                int i127 = ~iNextInt;
                i2 = (-43747114) + ((1307746679 | iNextInt) * (-859)) + (((~(iNextInt | (-95592500))) | (~(1307746679 | i127))) * 859);
                i3 = ((~((-129479732) | i127)) | 33887232) * 859;
            }
            int i128 = i & (i2 + i3);
            int iNextInt2 = new Random().nextInt(1922889440);
            int i129 = ((int) j) & (484646344 + (((~((-1865966628) | iNextInt2)) | 723010594) * 345) + (((~((-1865966628) | (~iNextInt2))) | 268763664) * 345) + ((~(iNextInt2 | (-723010595))) * 345));
            int i130 = (i128 & i129) | (i128 ^ i129);
            int i131 = i130 >>> 24;
            int i132 = i130 & ViewCompat.MEASURED_SIZE_MASK;
            int i133 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i131 != 0) {
                int i134 = i133 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i134 % 128;
                if (i134 % 2 != 0) {
                    z = true;
                }
                if (!z) {
                    int i135 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i4 = (i135 & 103) + (i135 | 103);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    i5 = 2;
                    if (i4 % 2 != 0) {
                        i6 = 1;
                    }
                    if (z) {
                        int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i10 = i136 + 33;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        if (i10 % i5 != 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (i132 < i5 || (method = methodArr[i132]) == null) {
                            string = null;
                        } else {
                            int i137 = i136 + 105;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i137 % 128;
                            int i138 = i137 % i5;
                            string = method.toString();
                        }
                    } else {
                        string = null;
                    }
                    list.add(string);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i139 = i131 * (-885);
                    i7 = (10638 & i139) + (i139 | 10638);
                    i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i9 = (i8 ^ 21) + ((i8 & 21) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    if (i9 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i140 = ~i131;
                    int i141 = ~((i140 & (-7)) | ((-7) ^ i140));
                    int i142 = ~i131;
                    int i143 = ~((i142 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i142 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    int i144 = (i141 & i143) | (i141 ^ i143);
                    int i145 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i146 = ~(i145 | 6 | i131);
                    int i147 = 886 * ((i144 & i146) | (i144 ^ i146));
                    int i148 = i8 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i148 % 128;
                    int i149 = i148 % 2;
                    int i150 = i7 + i147;
                    int i151 = i8 + 47;
                    int i152 = i151 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i152;
                    int i153 = i151 % 2;
                    int i154 = ~(i131 | i145);
                    int i155 = (-1772) * ((i154 & 6) | (6 ^ i154));
                    int i156 = ((i150 | i155) << 1) - (i150 ^ i155);
                    int i157 = ((i152 | 115) << 1) - (i152 ^ 115);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i157 % 128;
                    int i158 = i157 % 2;
                    int i159 = (~((i145 & 6) | (i145 ^ 6))) * 886;
                    return i158 == 0 ? (i156 / i159) + i6 : ((i156 & i159) + (i159 | i156)) * i6;
                }
                i5 = 2;
                i6 = 0;
                if (z) {
                    int i1310 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i10 = i1310 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    if (i10 % i5 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (i132 < i5) {
                        string = null;
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
                list.add(string);
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i1311 = i131 * (-885);
                i7 = (10638 & i1311) + (i1311 | 10638);
                i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i9 = (i8 ^ 21) + ((i8 & 21) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                if (i9 % 2 == 0) {
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                int i1410 = ~i131;
                int i1411 = ~((i1410 & (-7)) | ((-7) ^ i1410));
                int i1412 = ~i131;
                int i1413 = ~((i1412 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i1412 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i1414 = (i1411 & i1413) | (i1411 ^ i1413);
                int i1415 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i1416 = ~(i1415 | 6 | i131);
                int i1417 = 886 * ((i1414 & i1416) | (i1414 ^ i1416));
                int i1418 = i8 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1418 % 128;
                int i1419 = i1418 % 2;
                int i1510 = i7 + i1417;
                int i1511 = i8 + 47;
                int i1512 = i1511 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1512;
                int i1513 = i1511 % 2;
                int i1514 = ~(i131 | i1415);
                int i1515 = (-1772) * ((i1514 & 6) | (6 ^ i1514));
                int i1516 = ((i1510 | i1515) << 1) - (i1510 ^ i1515);
                int i1517 = ((i1512 | 115) << 1) - (i1512 ^ 115);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1517 % 128;
                int i1518 = i1517 % 2;
                int i1519 = (~((i1415 & 6) | (i1415 ^ 6))) * 886;
                if (i1518 == 0) {
                }
            }
            int i160 = ((i133 | 73) << 1) - (i133 ^ 73);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i160 % 128;
            if (i160 % 2 == 0) {
                int i161 = 4 / 2;
            }
            z = false;
            if (!z) {
                int i1312 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i4 = (i1312 & 103) + (i1312 | 103);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                i5 = 2;
                if (i4 % 2 != 0) {
                    i6 = 1;
                }
                if (z) {
                    int i1313 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i10 = i1313 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    if (i10 % i5 != 0) {
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                    if (i132 < i5) {
                        string = null;
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
                list.add(string);
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i1314 = i131 * (-885);
                i7 = (10638 & i1314) + (i1314 | 10638);
                i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i9 = (i8 ^ 21) + ((i8 & 21) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                if (i9 % 2 == 0) {
                    Object obj6 = null;
                    obj6.hashCode();
                    throw null;
                }
                int i14110 = ~i131;
                int i14111 = ~((i14110 & (-7)) | ((-7) ^ i14110));
                int i14112 = ~i131;
                int i14113 = ~((i14112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i14112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i14114 = (i14111 & i14113) | (i14111 ^ i14113);
                int i14115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i14116 = ~(i14115 | 6 | i131);
                int i14117 = 886 * ((i14114 & i14116) | (i14114 ^ i14116));
                int i14118 = i8 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14118 % 128;
                int i14119 = i14118 % 2;
                int i15110 = i7 + i14117;
                int i15111 = i8 + 47;
                int i15112 = i15111 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15112;
                int i15113 = i15111 % 2;
                int i15114 = ~(i131 | i14115);
                int i15115 = (-1772) * ((i15114 & 6) | (6 ^ i15114));
                int i15116 = ((i15110 | i15115) << 1) - (i15110 ^ i15115);
                int i15117 = ((i15112 | 115) << 1) - (i15112 ^ 115);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15117 % 128;
                int i15118 = i15117 % 2;
                int i15119 = (~((i14115 & 6) | (i14115 ^ 6))) * 886;
                if (i15118 == 0) {
                }
            }
            i5 = 2;
            i6 = 0;
            if (z) {
                int i1315 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                i10 = i1315 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                if (i10 % i5 != 0) {
                    Object obj7 = null;
                    obj7.hashCode();
                    throw null;
                }
                if (i132 < i5) {
                    string = null;
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            list.add(string);
            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i1316 = i131 * (-885);
            i7 = (10638 & i1316) + (i1316 | 10638);
            i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i9 = (i8 ^ 21) + ((i8 & 21) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj8 = null;
                obj8.hashCode();
                throw null;
            }
            int i141110 = ~i131;
            int i141111 = ~((i141110 & (-7)) | ((-7) ^ i141110));
            int i141112 = ~i131;
            int i141113 = ~((i141112 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i141112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i141114 = (i141111 & i141113) | (i141111 ^ i141113);
            int i141115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i141116 = ~(i141115 | 6 | i131);
            int i141117 = 886 * ((i141114 & i141116) | (i141114 ^ i141116));
            int i141118 = i8 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i141118 % 128;
            int i141119 = i141118 % 2;
            int i151110 = i7 + i141117;
            int i151111 = i8 + 47;
            int i151112 = i151111 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i151112;
            int i151113 = i151111 % 2;
            int i151114 = ~(i131 | i141115);
            int i151115 = (-1772) * ((i151114 & 6) | (6 ^ i151114));
            int i151116 = ((i151110 | i151115) << 1) - (i151110 ^ i151115);
            int i151117 = ((i151112 | 115) << 1) - (i151112 ^ 115);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i151117 % 128;
            int i151118 = i151117 % 2;
            int i151119 = (~((i141115 & 6) | (i141115 ^ 6))) * 886;
            if (i151118 == 0) {
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, int r7, byte r8) {
            /*
                byte[] r0 = com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.$$c
                int r7 = r7 * 2
                int r1 = 1 - r7
                int r6 = r6 * 2
                int r6 = r6 + 4
                int r8 = r8 * 56
                int r8 = 122 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                r3 = -1
                if (r0 != 0) goto L19
                r8 = r6
                r4 = r7
                goto L2b
            L19:
                r5 = r8
                r8 = r6
                r6 = r5
            L1c:
                int r3 = r3 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L29:
                r4 = r0[r8]
            L2b:
                int r6 = r6 + r4
                int r8 = r8 + 1
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.$$g(short, int, byte):java.lang.String");
        }
    }

    static class Api33BackCallbackDelegate implements BackCallbackDelegate {
        private OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
        }

        boolean isListeningForBackCallbacks() {
            return this.onBackInvokedCallback != null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void startListeningForBackCallbacks(MaterialBackHandler materialBackHandler, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.onBackInvokedCallback != null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            OnBackInvokedCallback onBackInvokedCallbackCreateOnBackInvokedCallback = createOnBackInvokedCallback(materialBackHandler);
            this.onBackInvokedCallback = onBackInvokedCallbackCreateOnBackInvokedCallback;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, onBackInvokedCallbackCreateOnBackInvokedCallback);
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void stopListeningForBackCallbacks(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.onBackInvokedCallback = null;
        }

        OnBackInvokedCallback createOnBackInvokedCallback(final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }
            };
        }
    }
}
