package com.sofakingforever.analytics.exceptions;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.AutoValue_OutputResults;
import defpackage.AutoValue_Quality_ConstantQuality;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\f"}, d2 = {"Lcom/sofakingforever/analytics/exceptions/EventNotTrackedException;", "Ljava/lang/RuntimeException;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LAutoValue_OutputResults;", "p0", "LAutoValue_Quality_ConstantQuality;", "p1", "", "p2", "<init>", "(LAutoValue_OutputResults;LAutoValue_Quality_ConstantQuality;Ljava/lang/Throwable;)V", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 3, 0})
public final class EventNotTrackedException extends RuntimeException {
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 119;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -17, 90, 37, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 62;
    private static final byte[] $$a = {88, 99, -94, -58, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
    private static final int $$b = 189;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722297;
    private static char[] b = {60083, 60105, 60089, 60127, 60035, 60110, 60037, 60095, 60049, 60090, 60052, 60056, 60067, 60054, 60040, 60115, 60091, 60087, 60044, 60099, 60060, 60033, 60075, 60062, 60072, 60078, 60106, 60063, 60055, 60050, 60053, 60094, 60041, 60086, 60117, 60123, 60048, 60079, 60045, 60098, 60073, 60109, 60107, 60043, 60088, 60093, 60058, 60051, 60085, 60047, 60057, 60084, 60032, 60145, 60092, 60082, 60097, 60046, 60119, 60034, 60080, 60061, 60081, 60118};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57193;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.sofakingforever.analytics.exceptions.EventNotTrackedException.$$d
            int r8 = r8 + 4
            int r9 = r9 + 1
            int r7 = r7 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r8
            r3 = r9
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L29:
            int r8 = r8 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sofakingforever.analytics.exceptions.EventNotTrackedException.d(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 17
            int r0 = 34 - r8
            int r6 = r6 * 3
            int r6 = 106 - r6
            byte[] r1 = com.sofakingforever.analytics.exceptions.EventNotTrackedException.$$a
            byte[] r0 = new byte[r0]
            int r8 = 33 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r7 = r7 + r6
            int r6 = r7 + (-3)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sofakingforever.analytics.exceptions.EventNotTrackedException.e(byte, byte, int, java.lang.Object[]):void");
    }

    private EventNotTrackedException(String str, Throwable th) {
        super(str, th);
    }

    public EventNotTrackedException(AutoValue_OutputResults autoValue_OutputResults, AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality, Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append(autoValue_OutputResults.b());
        Object[] objArr = new Object[1];
        a(true, View.MeasureSpec.getSize(0) + 255, 27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 22, new char[]{65478, 26, 65485, 20, '\n', 18, 27, 21, '\t', 65478, 24, 11, 14, '\t', 26, 7, 22, 25, 15, '\n', 65478, 65480, 65478, 11, 24, 15, '\f'}, objArr);
        sb.append((String) objArr[0]);
        sb.append(autoValue_Quality_ConstantQuality.getClass().getName());
        sb.append("\" event");
        this(sb.toString(), th);
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3290 - ((byte) KeyEvent.getModifierMetaStateMask()), 30 - Process.getGidForName(""), 1199271174, false, $$g((byte) ($$f & 15), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionChild(0L) + 652, TextUtils.getCapsMode("", 0, 0) + 44, -450685997, false, $$g((byte) ($$f & 14), b3, b3), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, -450685997, false, $$g((byte) ($$f & 14), b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = b;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $10 + 55;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.green(0) + 2267, 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) (49268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 3261;
                            int i6 = 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte b7 = (byte) ($$f & 1);
                            byte b8 = (byte) (b7 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveSizeAndState, i6, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 22879);
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 594;
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 17;
                                byte b9 = (byte) ($$f & 11);
                                byte b10 = (byte) (b9 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, longPressTimeout, packedPositionType, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i7 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i7];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i8 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i8];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i9];
                            } else {
                                int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i10];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i11];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i12 = $11 + 21;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                obj2 = obj;
            }
        }
        int i14 = $10 + 91;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < i) {
            int i17 = $11 + 119;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 11237);
                i16 += 63;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 289001. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r68, java.lang.String[] r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instruction units count: 28900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sofakingforever.analytics.exceptions.EventNotTrackedException.TuitionPaymentFragmentbindingInflater1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.sofakingforever.analytics.exceptions.EventNotTrackedException.$$c
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 + 113
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sofakingforever.analytics.exceptions.EventNotTrackedException.$$g(int, short, short):java.lang.String");
    }
}
