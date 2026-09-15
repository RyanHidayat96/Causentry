package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompatCallbackStubCompat {
    private final Matrix INotificationSideChannel;
    public binderDied<Integer, Integer> TuitionPaymentFragmentbindingInflater1;
    public binderDied<Float, Float> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public binderDied<?, PointF> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public binderDied<PointF, PointF> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public onAudioInfoChanged f176a;
    private final Matrix asBinder = new Matrix();
    public binderDied<?, Float> asInterface;
    public binderDied<?, Float> b;
    private final Matrix cancelAll;
    public onAudioInfoChanged d;
    public binderDied<onStop, onStop> g;
    private final Matrix notify;
    private final float[] onTransact;
    private static final byte[] $$c = {74, 60, 122, -26};
    private static final int $$f = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {90, 46, 113, 8, 11, -3, -64, 56, 7, -1, -9, 4, -8, -56, 55, 2, 8, -14, -4, -2, 17, -15, -56, 67, -14, 7, 1, 4, -16, -3, 11, -2, -9, 2, -3, -58, 20, 43, -2, -9, 2, -3, -19, 26, -13, -4, 18, -16, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -2, -4, -12, -3, 5, -9, 10, -4, 4, -3, -4, 4, -10, -2, 17, -14, -5, 17, -43, 33, -12, 0, 6, -9, 0, 0, -6, 19, -10, 7, -66};
    private static final int $$e = 36;
    private static final byte[] $$a = {59, -124, -78, 46, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 169;
    private static int INotificationSideChannelStubProxy = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char[] cancel = {59707, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59741, 59835, 59833, 59838, 59836, 59814, 59809, 59817, 59817, 59808, 59832, 59827, 59812, 59814, 59812, 59718, 59799, 59804, 59806, 59800, 59781, 59781, 59780, 59804, 59794, 59777, 59801, 59817, 59793, 59792, 59792, 59793, 59804, 59765, 59752, 59760, 59799, 59807, 59768, 59774, 59801, 59777, 59728, 59781, 59779, 59764, 59783, 59783, 59780, 59766, 59779, 59778, 59784, 59781, 59760, 59766, 59784, 59789, 59777, 59735, 59832, 59826, 59826, 59806, 59792, 59839, 59838, 59827, 59795, 59781, 59839, 59855, 59850, 59825, 59836, 59786, 59402, 59405, 59901, 59897, 59393, 59404, 59898, 59894, 59416, 59392, 59392, 59397, 59405, 59402, 59400};

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = r9 + 4
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = defpackage.MediaControllerCompatCallbackStubCompat.$$a
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r8 = r8 + r9
            int r8 = r8 + (-10)
            int r9 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallbackStubCompat.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = defpackage.MediaControllerCompatCallbackStubCompat.$$d
            int r6 = r6 * 8
            int r6 = 53 - r6
            int r7 = r7 * 44
            int r7 = 47 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallbackStubCompat.f(int, short, byte, java.lang.Object[]):void");
    }

    public MediaControllerCompatCallbackStubCompat(createCallback createcallback) throws Throwable {
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater1;
        binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater2;
        onAudioInfoChanged onaudioinfochanged;
        onAudioInfoChanged onaudioinfochanged2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = createcallback.TuitionPaymentFragmentbindingInflater1 == null ? null : createcallback.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        if (createcallback.b == null) {
            int i = RemoteActionCompatParcelizer + 117;
            INotificationSideChannelStubProxy = i % 128;
            int i2 = i % 2;
            binderdiedTuitionPaymentFragmentbindingInflater1 = null;
        } else {
            binderdiedTuitionPaymentFragmentbindingInflater1 = createcallback.b.TuitionPaymentFragmentbindingInflater1();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = binderdiedTuitionPaymentFragmentbindingInflater1;
        this.g = createcallback.f882a == null ? null : createcallback.f882a.TuitionPaymentFragmentbindingInflater1();
        if (createcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            int i3 = 2 % 2;
            binderdiedTuitionPaymentFragmentbindingInflater2 = null;
        } else {
            binderdiedTuitionPaymentFragmentbindingInflater2 = createcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = binderdiedTuitionPaymentFragmentbindingInflater2;
        if (createcallback.g == null) {
            int i4 = 2 % 2;
            onaudioinfochanged = null;
        } else {
            onaudioinfochanged = (onAudioInfoChanged) createcallback.g.TuitionPaymentFragmentbindingInflater1();
        }
        this.d = onaudioinfochanged;
        if (onaudioinfochanged != null) {
            this.notify = new Matrix();
            this.cancelAll = new Matrix();
            this.INotificationSideChannel = new Matrix();
            this.onTransact = new float[9];
        } else {
            this.notify = null;
            this.cancelAll = null;
            this.INotificationSideChannel = null;
            this.onTransact = null;
            int i5 = RemoteActionCompatParcelizer + 17;
            INotificationSideChannelStubProxy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if (createcallback.asInterface == null) {
            int i8 = RemoteActionCompatParcelizer + 29;
            INotificationSideChannelStubProxy = i8 % 128;
            int i9 = i8 % 2;
            onaudioinfochanged2 = null;
        } else {
            onaudioinfochanged2 = (onAudioInfoChanged) createcallback.asInterface.TuitionPaymentFragmentbindingInflater1();
        }
        this.f176a = onaudioinfochanged2;
        if (createcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            this.TuitionPaymentFragmentbindingInflater1 = createcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        }
        if (createcallback.d != null) {
            this.asInterface = createcallback.d.TuitionPaymentFragmentbindingInflater1();
        } else {
            this.asInterface = null;
        }
        int i10 = 2 % 2;
        if (createcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            this.b = createcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        } else {
            this.b = null;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(fromMediaSession frommediasession) {
        int i = 2 % 2;
        binderDied<Integer, Integer> binderdied = this.TuitionPaymentFragmentbindingInflater1;
        if (binderdied != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied);
        }
        binderDied<?, Float> binderdied2 = this.asInterface;
        if (binderdied2 != null) {
            int i2 = RemoteActionCompatParcelizer + 3;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
                int i3 = 8 / 0;
            } else {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
            }
        }
        binderDied<?, Float> binderdied3 = this.b;
        if (binderdied3 != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied3);
        }
        binderDied<PointF, PointF> binderdied4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (binderdied4 != null) {
            int i4 = RemoteActionCompatParcelizer + 33;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied4);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied4);
        }
        binderDied<?, PointF> binderdied5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (binderdied5 != null) {
            int i5 = RemoteActionCompatParcelizer + 73;
            INotificationSideChannelStubProxy = i5 % 128;
            int i6 = i5 % 2;
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied5);
        }
        binderDied<onStop, onStop> binderdied6 = this.g;
        if (binderdied6 != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied6);
        }
        binderDied<Float, Float> binderdied7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (binderdied7 != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied7);
        }
        onAudioInfoChanged onaudioinfochanged = this.d;
        if (onaudioinfochanged != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(onaudioinfochanged);
        }
        onAudioInfoChanged onaudioinfochanged2 = this.f176a;
        if (onaudioinfochanged2 != null) {
            frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(onaudioinfochanged2);
        }
        int i7 = INotificationSideChannelStubProxy + 47;
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void TuitionPaymentFragmentbindingInflater1(binderDied.b bVar) {
        int i = 2 % 2;
        binderDied<Integer, Integer> binderdied = this.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (binderdied != null) {
            int i2 = RemoteActionCompatParcelizer + 51;
            INotificationSideChannelStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
                throw null;
            }
            binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        binderDied<?, Float> binderdied2 = this.asInterface;
        if (binderdied2 != null) {
            int i3 = INotificationSideChannelStubProxy + 105;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                binderdied2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
                obj.hashCode();
                throw null;
            }
            binderdied2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        binderDied<?, Float> binderdied3 = this.b;
        if (binderdied3 != null) {
            binderdied3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        binderDied<PointF, PointF> binderdied4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (binderdied4 != null) {
            binderdied4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        binderDied<?, PointF> binderdied5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (binderdied5 != null) {
            int i4 = RemoteActionCompatParcelizer + 47;
            INotificationSideChannelStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                binderdied5.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
                int i5 = 68 / 0;
            } else {
                binderdied5.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
            }
        }
        binderDied<onStop, onStop> binderdied6 = this.g;
        if (binderdied6 != null) {
            binderdied6.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        binderDied<Float, Float> binderdied7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (binderdied7 != null) {
            binderdied7.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        onAudioInfoChanged onaudioinfochanged = this.d;
        if (onaudioinfochanged != null) {
            onaudioinfochanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
        onAudioInfoChanged onaudioinfochanged2 = this.f176a;
        if (onaudioinfochanged2 != null) {
            int i6 = RemoteActionCompatParcelizer + 61;
            INotificationSideChannelStubProxy = i6 % 128;
            int i7 = i6 % 2;
            onaudioinfochanged2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(bVar);
        }
    }

    private static void e(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = cancel;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 5;
                        byte b2 = (byte) (b - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(i3), (ViewConfiguration.getLongPressTimeout() >> 16) + 1270, 18 - (Process.myTid() >> 22), 407021364, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i9 = $10 + 107;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3225, (Process.myTid() >> 22) + 13, 2133916302, false, $$g((byte) 6, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                        int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 23;
                        byte length2 = (byte) $$c.length;
                        byte b4 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, i13, jumpTapTimeout, 387247676, false, $$g(length2, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1705, 'E' - AndroidCharacter.getMirror('0'), -1434471773, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i14, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i14);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i15 = 0;
            while (true) {
                setvideostabilizationmode.b = i15;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                int i16 = $11 + 125;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i15 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
        int i18 = $11 + 117;
        $10 = i18 % 128;
        if (i18 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0205  */
    public final binderDied<?, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 19;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
            int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
            int i5 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte b = $$a[80];
            Object[] objArr2 = new Object[1];
            c((byte) 52, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, i5, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new int[]{0, 22, 0, 1}, true, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new int[]{22, 15, 71, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
            int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 920;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, bArr[37], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i6, absoluteGravity, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[33];
                byte b4 = bArr2[37];
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i7, iResolveSizeAndState, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (((-282368444) + (((~((-168001) | iIdentityHashCode)) | (~(1773911643 | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | 1773384259)) | ((~((-695385) | iIdentityHashCode)) | 527384)) * (-69))) - 1110110279;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new int[]{37, 26, 44, 5}, true, new byte[]{1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new int[]{63, 18, 26, 9}, true, null, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = INotificationSideChannelStubProxy + 99;
                    RemoteActionCompatParcelizer = i11 % 128;
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
            e(new int[]{81, 16, 78, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new int[]{97, 16, 157, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = RemoteActionCompatParcelizer + 109;
            INotificationSideChannelStubProxy = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1092019434};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[26];
                Object[] objArr13 = new Object[1];
                f(b5, b5, bArr3[90], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[90];
                Object[] objArr14 = new Object[1];
                f(b6, b6, bArr3[26], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
                    int defaultSize = 921 - View.getDefaultSize(0, 0);
                    int capsMode = 28 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr4 = $$a;
                    byte b7 = bArr4[33];
                    byte b8 = bArr4[37];
                    Object[] objArr16 = new Object[1];
                    c(b7, b8, b8, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, defaultSize, capsMode, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new int[]{0, 22, 0, 1}, true, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new int[]{22, 15, 71, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 921;
                        int iAlpha = Color.alpha(0) + 28;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b9, bArr5[37], b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, iIndexOf, iAlpha, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c5 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                        byte b10 = $$a[80];
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, b10, b10, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, packedPositionGroup, offsetAfter, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i14 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i15 = ~Process.myTid();
        int i16 = i14 + (-428200564) + (((~((-625767805) | i15)) | (-1148311840)) * (-933)) + (((~(i15 | (-1148311840))) | 1076987907) * 933) + 466820224;
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
        int i19 = RemoteActionCompatParcelizer + 13;
        INotificationSideChannelStubProxy = i19 % 128;
        int i20 = i19 % 2;
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0188  */
    public final Matrix TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        float fSin;
        float fD;
        int i = 2 % 2;
        this.asBinder.reset();
        binderDied<?, PointF> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (binderdied != null) {
            PointF pointFAsInterface = binderdied.asInterface();
            if (pointFAsInterface.x != 0.0f || pointFAsInterface.y != 0.0f) {
                this.asBinder.preTranslate(pointFAsInterface.x, pointFAsInterface.y);
            }
        }
        binderDied<Float, Float> binderdied2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (binderdied2 != null) {
            if (binderdied2 instanceof processPendingCallbacksLocked) {
                int i2 = RemoteActionCompatParcelizer + 91;
                INotificationSideChannelStubProxy = i2 % 128;
                if (i2 % 2 != 0) {
                    binderdied2.asInterface().floatValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                fD = binderdied2.asInterface().floatValue();
                int i3 = RemoteActionCompatParcelizer + 49;
                INotificationSideChannelStubProxy = i3 % 128;
                int i4 = i3 % 2;
            } else {
                fD = ((onAudioInfoChanged) binderdied2).d();
            }
            if (fD != 0.0f) {
                this.asBinder.preRotate(fD);
            }
        }
        if (this.d != null) {
            onAudioInfoChanged onaudioinfochanged = this.f176a;
            float fCos = onaudioinfochanged == null ? 0.0f : (float) Math.cos(Math.toRadians((-onaudioinfochanged.d()) + 90.0f));
            onAudioInfoChanged onaudioinfochanged2 = this.f176a;
            if (onaudioinfochanged2 == null) {
                int i5 = RemoteActionCompatParcelizer + 13;
                INotificationSideChannelStubProxy = i5 % 128;
                int i6 = i5 % 2;
                fSin = 1.0f;
            } else {
                fSin = (float) Math.sin(Math.toRadians((-onaudioinfochanged2.d()) + 90.0f));
            }
            float fTan = (float) Math.tan(Math.toRadians(this.d.d()));
            for (int i7 = 0; i7 < 9; i7++) {
                int i8 = INotificationSideChannelStubProxy + 11;
                RemoteActionCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
                this.onTransact[i7] = 0.0f;
            }
            float[] fArr = this.onTransact;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f = -fSin;
            fArr[3] = f;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.notify.setValues(fArr);
            for (int i10 = 0; i10 < 9; i10++) {
                this.onTransact[i10] = 0.0f;
            }
            float[] fArr2 = this.onTransact;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.cancelAll.setValues(fArr2);
            int i11 = 0;
            while (i11 < 9) {
                int i12 = INotificationSideChannelStubProxy + 31;
                RemoteActionCompatParcelizer = i12 % 128;
                if (i12 % 2 == 0) {
                    this.onTransact[i11] = 1.0f;
                    i11 += 49;
                } else {
                    this.onTransact[i11] = 0.0f;
                    i11++;
                }
            }
            float[] fArr3 = this.onTransact;
            fArr3[0] = fCos;
            fArr3[1] = f;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.INotificationSideChannel.setValues(fArr3);
            this.cancelAll.preConcat(this.notify);
            this.INotificationSideChannel.preConcat(this.cancelAll);
            this.asBinder.preConcat(this.INotificationSideChannel);
        }
        binderDied<onStop, onStop> binderdied3 = this.g;
        if (binderdied3 != null) {
            int i13 = INotificationSideChannelStubProxy + 19;
            RemoteActionCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            onStop onstopAsInterface = binderdied3.asInterface();
            if (onstopAsInterface.b != 1.0f || onstopAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != 1.0f) {
                this.asBinder.preScale(onstopAsInterface.b, onstopAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        binderDied<PointF, PointF> binderdied4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (binderdied4 != null) {
            PointF pointFAsInterface2 = binderdied4.asInterface();
            if (pointFAsInterface2.x == 0.0f) {
                int i15 = INotificationSideChannelStubProxy + 55;
                RemoteActionCompatParcelizer = i15 % 128;
                int i16 = i15 % 2;
                if (pointFAsInterface2.y != 0.0f) {
                    this.asBinder.preTranslate(-pointFAsInterface2.x, -pointFAsInterface2.y);
                }
            } else {
                this.asBinder.preTranslate(-pointFAsInterface2.x, -pointFAsInterface2.y);
            }
        }
        return this.asBinder;
    }

    public final Matrix TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f) {
        onStop onstopAsInterface;
        PointF pointFAsInterface;
        float f2;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 101;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        binderDied<?, PointF> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        PointF pointFAsInterface2 = binderdied == null ? null : binderdied.asInterface();
        binderDied<onStop, onStop> binderdied2 = this.g;
        if (binderdied2 == null) {
            int i3 = RemoteActionCompatParcelizer + 107;
            INotificationSideChannelStubProxy = i3 % 128;
            int i4 = i3 % 2;
            onstopAsInterface = null;
        } else {
            onstopAsInterface = binderdied2.asInterface();
        }
        this.asBinder.reset();
        if (pointFAsInterface2 != null) {
            this.asBinder.preTranslate(pointFAsInterface2.x * f, pointFAsInterface2.y * f);
        }
        if (onstopAsInterface != null) {
            double d = f;
            this.asBinder.preScale((float) Math.pow(onstopAsInterface.b, d), (float) Math.pow(onstopAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3, d));
        }
        binderDied<Float, Float> binderdied3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (binderdied3 != null) {
            float fFloatValue = binderdied3.asInterface().floatValue();
            binderDied<PointF, PointF> binderdied4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (binderdied4 == null) {
                int i5 = RemoteActionCompatParcelizer + 85;
                INotificationSideChannelStubProxy = i5 % 128;
                if (i5 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                pointFAsInterface = null;
            } else {
                pointFAsInterface = binderdied4.asInterface();
                int i6 = RemoteActionCompatParcelizer + 91;
                INotificationSideChannelStubProxy = i6 % 128;
                int i7 = i6 % 2;
            }
            Matrix matrix = this.asBinder;
            float f3 = 0.0f;
            if (pointFAsInterface == null) {
                int i8 = RemoteActionCompatParcelizer + 91;
                INotificationSideChannelStubProxy = i8 % 128;
                f2 = i8 % 2 != 0 ? 2.0f : 0.0f;
            } else {
                f2 = pointFAsInterface.x;
            }
            if (pointFAsInterface != null) {
                int i9 = INotificationSideChannelStubProxy + 17;
                RemoteActionCompatParcelizer = i9 % 128;
                if (i9 % 2 == 0) {
                    float f4 = pointFAsInterface.y;
                    throw null;
                }
                f3 = pointFAsInterface.y;
            }
            matrix.preRotate(fFloatValue * f, f2, f3);
        }
        return this.asBinder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        r6.asInterface = new defpackage.processPendingCallbacksLocked(r8, 100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> boolean TuitionPaymentFragmentbindingInflater1(T r7, defpackage.MediaSessionCompatCallbackCallbackHandler<T> r8) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentbindingInflater1(java.lang.Object, MediaSessionCompatCallbackCallbackHandler):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, short r9) {
        /*
            int r7 = 105 - r7
            byte[] r0 = defpackage.MediaControllerCompatCallbackStubCompat.$$c
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaControllerCompatCallbackStubCompat.$$g(byte, int, short):java.lang.String");
    }
}
