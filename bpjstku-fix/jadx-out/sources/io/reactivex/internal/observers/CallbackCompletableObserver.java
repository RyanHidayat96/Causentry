package io.reactivex.internal.observers;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoOutputSourceState;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.formatInterval;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.onCaptureSessionEnd;
import defpackage.setSurfaceOccupancyPriority;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class CallbackCompletableObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState, BufferProviderState, logToString<Throwable> {
    private static final long serialVersionUID = -4361286194466301354L;
    final formatInterval onComplete;
    final logToString<? super Throwable> onError;
    private static final byte[] $$c = {21, 65, -9, -121};
    private static final int $$d = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 47, -18, 64};
    private static final int $$b = 235;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static char b = 27131;
    private static char TuitionPaymentFragmentbindingInflater1 = 50819;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 59250;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4215;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 98
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = io.reactivex.internal.observers.CallbackCompletableObserver.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.observers.CallbackCompletableObserver.c(int, byte, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.logToString
    public final /* synthetic */ void accept(Throwable th) throws Exception {
        int i = 2 % 2;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new OnErrorNotImplementedException(th));
        int i2 = g + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public CallbackCompletableObserver(logToString<? super Throwable> logtostring, formatInterval formatinterval) {
        this.onError = logtostring;
        this.onComplete = formatinterval;
    }

    @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
    public final void onComplete() {
        int i = 2 % 2;
        int i2 = g + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.onComplete.run();
                lazySet(DisposableHelper.DISPOSED);
                int i3 = g + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.onComplete.run();
            throw null;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    @Override // defpackage.VideoOutputSourceState
    public final void onError(Throwable th) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.onError.accept(th);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            g = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th2) {
            dumpMediaCodecListForFormat.b(th2);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th2);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // defpackage.VideoOutputSourceState
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        g = i2 % 128;
        int i3 = i2 % 2;
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = g + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        int i = 2 % 2;
        int i2 = g + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        int i = 2 % 2;
        int i2 = g + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (get() != DisposableHelper.DISPOSED) {
            return false;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        g = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = $11 + 63;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 47773);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 468;
                        int iIndexOf = 13 - TextUtils.indexOf("", "", i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, maximumDrawingCacheSize, iIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 47773), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 467, 13 - KeyEvent.keyCodeFromString(""), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i10 = $10 + 51;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    c = 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2323, 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1312321721, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0555 A[Catch: Exception -> 0x0576, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0576, blocks: (B:73:0x03e6, B:77:0x0466, B:79:0x0494, B:81:0x049c, B:83:0x04c1, B:91:0x0516, B:94:0x0528, B:100:0x0555, B:103:0x055a, B:104:0x0560, B:107:0x056f, B:108:0x0575, B:86:0x04dc, B:90:0x0501, B:89:0x04f0, B:78:0x0470), top: B:124:0x03e6, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0561  */
    /* JADX WARN: Code duplicated, block: B:109:0x0576  */
    /* JADX WARN: Code duplicated, block: B:75:0x0457  */
    /* JADX WARN: Code duplicated, block: B:77:0x0466 A[Catch: Exception -> 0x0576, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0576, blocks: (B:73:0x03e6, B:77:0x0466, B:79:0x0494, B:81:0x049c, B:83:0x04c1, B:91:0x0516, B:94:0x0528, B:100:0x0555, B:103:0x055a, B:104:0x0560, B:107:0x056f, B:108:0x0575, B:86:0x04dc, B:90:0x0501, B:89:0x04f0, B:78:0x0470), top: B:124:0x03e6, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x049c A[Catch: Exception -> 0x0576, TryCatch #2 {Exception -> 0x0576, blocks: (B:73:0x03e6, B:77:0x0466, B:79:0x0494, B:81:0x049c, B:83:0x04c1, B:91:0x0516, B:94:0x0528, B:100:0x0555, B:103:0x055a, B:104:0x0560, B:107:0x056f, B:108:0x0575, B:86:0x04dc, B:90:0x0501, B:89:0x04f0, B:78:0x0470), top: B:124:0x03e6, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x04c1 A[Catch: Exception -> 0x0576, TRY_LEAVE, TryCatch #2 {Exception -> 0x0576, blocks: (B:73:0x03e6, B:77:0x0466, B:79:0x0494, B:81:0x049c, B:83:0x04c1, B:91:0x0516, B:94:0x0528, B:100:0x0555, B:103:0x055a, B:104:0x0560, B:107:0x056f, B:108:0x0575, B:86:0x04dc, B:90:0x0501, B:89:0x04f0, B:78:0x0470), top: B:124:0x03e6, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x04dc A[Catch: all -> 0x04ee, TRY_ENTER, TryCatch #5 {all -> 0x04ee, blocks: (B:86:0x04dc, B:90:0x0501, B:89:0x04f0), top: B:128:0x04da, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x04f0 A[Catch: all -> 0x04ee, TryCatch #5 {all -> 0x04ee, blocks: (B:86:0x04dc, B:90:0x0501, B:89:0x04f0), top: B:128:0x04da, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0528 A[Catch: Exception -> 0x0576, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0576, blocks: (B:73:0x03e6, B:77:0x0466, B:79:0x0494, B:81:0x049c, B:83:0x04c1, B:91:0x0516, B:94:0x0528, B:100:0x0555, B:103:0x055a, B:104:0x0560, B:107:0x056f, B:108:0x0575, B:86:0x04dc, B:90:0x0501, B:89:0x04f0, B:78:0x0470), top: B:124:0x03e6, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x052d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0538  */
    /* JADX WARN: Code duplicated, block: B:99:0x0553  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String line;
        Object[] objArr;
        int i8;
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        File file2;
        int i9;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        int i10;
        String line2;
        char[] cArr;
        int offsetAfter;
        int i11;
        boolean zEquals2;
        int i12;
        int i13;
        int i14;
        int i15;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i16;
        int i17;
        String str;
        int i18 = 2 % 2;
        int i19 = -1;
        int i20 = 1;
        try {
            String[] strArr = new String[2];
            int i21 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
            int i22 = (i21 ^ 19) + ((i21 & 19) << 1);
            Object[] objArr2 = new Object[1];
            a(new char[]{45735, 13202, 36099, 5352, 61762, 27630, 35632, 12818, 47605, 54087, 13596, 1930, 1492, 43158, 6703, 22637, 6118, 29610, 59102, 15547, 33598, 26}, i22, objArr2);
            String str2 = (String) objArr2[0];
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i24 = (i23 & 69) + (i23 | 69);
            g = i24 % 128;
            int i25 = i24 % 2;
            strArr[0] = str2;
            char[] cArr2 = {45761, 14587, 58591, 23709, 44966, 37499, 31654, 14828, 20993, 35334, 48165, 61243, 17867, 31299, 34570, 9880, 28897, 20109, 29970, 29982};
            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
            int i26 = g + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
            int i27 = i26 % 2;
            Object[] objArr3 = new Object[1];
            a(cArr2, 17 - (~(-scrollDefaultDelay)), objArr3);
            strArr[1] = (String) objArr3[0];
            int i28 = 0;
            while (true) {
                if (i28 >= 2) {
                    i3 = i;
                    break;
                }
                int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                g = i29 % 128;
                int i30 = i29 % 2;
                String str3 = strArr[i28];
                char[] cArr3 = {24487, 64739, 22971, 23631, 39103, 22793, 625, 46236, 50165, 6575, 3967, 55319, 58593, 12512, 33241, 13088, 16909, 51904};
                int i31 = -ExpandableListView.getPackedPositionGroup(0L);
                int i32 = g;
                int i33 = (i32 & 11) + (i32 | 11);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                if (i33 % 2 != 0) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    i16 = (677 % i31) >> i19;
                } else {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i34 = i31 * 677;
                    i16 = (i34 | (-10800)) + (i34 & (-10800));
                }
                int i35 = g;
                int i36 = ((i35 | 43) << i20) - (i35 ^ 43);
                int i37 = i36 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i37;
                int i38 = i36 % 2;
                int i39 = (i31 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i31 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i40 = i16 + (((i39 ^ (-17)) | (i39 & (-17))) * (-676));
                int i41 = ~((-17) | i31);
                int i42 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i43 = ~((i42 ^ i31) | (i42 & i31));
                int i44 = (i37 ^ 67) + ((i37 & 67) << 1);
                g = i44 % 128;
                int i45 = i44 % 2;
                int i46 = i40 + (676 * (i43 | i41));
                int i47 = ~i31;
                int i48 = ~((i47 & (-17)) | (i47 ^ (-17)));
                int i49 = ~(((-17) & i42) | ((-17) ^ i42));
                int i50 = (i49 & i48) | (i48 ^ i49);
                int i51 = i31 | 16;
                int i52 = i37 + 35;
                g = i52 % 128;
                int i53 = i52 % 2;
                int i54 = ~((i51 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i51 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                int i55 = (i50 & i54) | (i50 ^ i54);
                if (i53 == 0) {
                    int i56 = i46 * (676 >> i55);
                    i17 = 1;
                    Object[] objArr4 = new Object[1];
                    a(cArr3, i56, objArr4);
                    str = (String) objArr4[0];
                } else {
                    int i57 = i55 * 676;
                    int i58 = ((i46 | i57) << 1) - (i57 ^ i46);
                    Object[] objArr5 = new Object[1];
                    a(cArr3, i58, objArr5);
                    i17 = 0;
                    str = (String) objArr5[0];
                }
                Class<?> cls = Class.forName(str);
                if (((Boolean) cls.getMethod(str3, new Class[i17]).invoke(cls, null)).booleanValue()) {
                    i3 = i ^ 1;
                    break;
                }
                int i59 = (i28 ^ (-126)) + ((i28 & (-126)) << 1);
                i28 = (i59 & 127) + (i59 | 127);
                i19 = -1;
                i20 = 1;
            }
        } catch (Exception unused) {
            i3 = (~(i & 2)) & (i | 2);
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cGreen = (char) (2419 - Color.green(0));
                int iAlpha = 2845 - Color.alpha(0);
                int iAlpha2 = 5 - Color.alpha(0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, iAlpha, iAlpha2, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = -756640371;
            long j2 = -167;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long j5 = i;
            long j6 = (j2 * j) + (j2 * jLongValue) + (((long) 336) * ((((j ^ j3) | j4) ^ j3) | ((j4 | j5) ^ j3))) + (((long) (-168)) * (((j | jLongValue) ^ j3) | ((j | j5) ^ j3))) + (((long) 168) * (j4 | (((j5 ^ j3) | j) ^ j3))) + ((long) (-402546315));
            int i60 = (int) (j6 >> 32);
            int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            g = i61 % 128;
            if (i61 % 2 == 0) {
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i62 = ~iElapsedRealtime;
                int i63 = i60 & (2065535074 + (((~(1877609655 | i62)) | 980131229 | (~((-1877609656) | iElapsedRealtime))) * (-564)) + ((~(iElapsedRealtime | (-1166016547))) * 1128) + (((~(980131229 | i62)) | 711593109) * 564));
                int iMyTid = Process.myTid();
                int i64 = ~iMyTid;
                int i65 = ((int) j6) & (1453938690 + (((~((-1994090708) | i64)) | 863650178) * 519) + (((~(i64 | (-1149315154))) | (~(2012965331 | iMyTid))) * (-519)) + (((~(iMyTid | 863650178)) | 1994090707) * 519));
                i4 = (i63 & i65) | (i63 ^ i65);
                i5 = i ^ 96;
            } else {
                int i66 = ~i;
                int i67 = i60 & (1207948874 + (((-537921547) | i66) * 184) + (((~(i66 | 460175184)) | (-558967051)) * 184));
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i68 = ((int) j6) & (484646344 + (((~(1386039973 | iUptimeMillis)) | (-1402817446)) * 345) + (((~(1386039973 | (~iUptimeMillis))) | 1351631009) * 345) + ((~(iUptimeMillis | 1402817445)) * 345));
                i4 = (i67 & i68) | (i67 ^ i68);
                i5 = (~(i & 10)) & (i | 10);
            }
            int i69 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i70 = i69 + 47;
            g = i70 % 128;
            if (i70 % 2 == 0) {
                i6 = 1;
                int i71 = (i4 | 1) & (~(i4 & 1));
                i7 = (i71 | (-i71)) % 75;
            } else {
                i6 = 1;
                int i72 = i4 ^ 1;
                int i73 = -i72;
                i7 = ((i72 & i73) | (i72 ^ i73)) >> 31;
            }
            int i74 = ((i69 | 63) << i6) - (i69 ^ 63);
            g = i74 % 128;
            int i75 = i74 % 2;
            int i76 = i5 & (~i7);
            int i77 = i7 & i;
            int i78 = (i77 & i76) | (i76 ^ i77);
            int i79 = (~i3) & i;
            int i80 = ~i;
            int i81 = i79 | (i3 & i80);
            int i82 = (i81 | (-i81)) >> 31;
            int i83 = i78 & (~i82);
            int i84 = i3 & i82;
            int i85 = (i83 ^ i84) | (i84 & i83);
            try {
                try {
                    int i86 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i87 = ((i86 | 40) << 1) - (i86 ^ 40);
                    Object[] objArr7 = new Object[1];
                    a(new char[]{23022, 23527, 26351, 36913, 39636, 52083, 65295, 15748, 19299, 60203, 51365, 11332, 23476, 229, 20192, 34246, 1335, 10153, 23033, 35656, 16521, 25321, 6427, 41905, 26430, 1050, 64078, 35167, 44776, 25684, 13618, 48367, 30963, 548, 54781, 723, 36499, 7251, 30687, 36407, 23325, 9065}, i87, objArr7);
                    File file3 = new File((String) objArr7[0]);
                    int i88 = g;
                    int i89 = ((i88 | 37) << 1) - (i88 ^ 37);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i89 % 128;
                    int i90 = i89 % 2;
                    if (file3.canRead()) {
                        FileReader fileReader3 = new FileReader(file3);
                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                        int i91 = g + 59;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i91 % 128;
                        int i92 = i91 % 2;
                        try {
                            line = bufferedReader3.readLine();
                            char[] cArr4 = {2978, 41326, 56641, 4034, 16788, 55150};
                            int i93 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i94 = g + 113;
                            int i95 = i94 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i95;
                            if (i94 % 2 != 0) {
                                i13 = -i93;
                                int i96 = 43 / 0;
                            } else {
                                i13 = -i93;
                            }
                            int i97 = ((495 * i13) - 1479) + ((i13 | (-4)) * (-988));
                            int i98 = ~i13;
                            int i99 = ((i98 & 3) | (i98 ^ 3) | i80) * 494;
                            int i100 = (i97 & i99) + (i97 | i99);
                            int i101 = ~i13;
                            int i102 = ~((i101 & (-4)) | (i101 ^ (-4)));
                            int i103 = (i95 & 53) + (i95 | 53);
                            g = i103 % 128;
                            if (i103 % 2 == 0) {
                                int i104 = ~(i80 | 3);
                                i14 = (i102 & i104) | (i102 ^ i104);
                                i15 = ~((i13 & 3) | (i13 ^ 3));
                                int i105 = 34 / 0;
                            } else {
                                int i106 = ~((i80 ^ 3) | (i80 & 3));
                                i14 = (i102 & i106) | (i102 ^ i106);
                                i15 = ~(i13 | 3);
                            }
                            int i107 = 494 * ((i15 & i14) | (i14 ^ i15));
                            Object[] objArr8 = new Object[1];
                            a(cArr4, (i100 & i107) + (i107 | i100), objArr8);
                            if (line.equals((String) objArr8[0])) {
                                fileReader3.close();
                                bufferedReader3.close();
                            } else {
                                int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i109 = (i108 ^ 53) + ((i108 & 53) << 1);
                                g = i109 % 128;
                                int i110 = i109 % 2;
                                fileReader3.close();
                                bufferedReader3.close();
                                int i111 = g;
                                int i112 = (i111 ^ 43) + ((i111 & 43) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i112 % 128;
                                int i113 = i112 % 2;
                            }
                            int i114 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i115 = i114 * (-445);
                            int i116 = ((i115 | (-14240)) << 1) - (i115 ^ (-14240));
                            int i117 = ~i114;
                            int i118 = ~(i117 | (-33));
                            int i119 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i120 = ~(((-33) ^ i119) | (i119 & (-33)));
                            int i121 = (i116 - (~(((i118 ^ i120) | (i118 & i120)) * 446))) - 1;
                            int i122 = ~i114;
                            int i123 = ~((32 & i122) | (i122 ^ 32));
                            int i124 = (i114 & (-33)) | ((-33) ^ i114);
                            int i125 = ~((i124 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i124 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            int i126 = ((i123 & i125) | (i123 ^ i125)) * 446;
                            int i127 = ((i121 | i126) << 1) - (i126 ^ i121);
                            int i128 = -(-((~(i117 | (-33))) * 446));
                            int i129 = (i127 & i128) + (i128 | i127);
                            Object[] objArr9 = new Object[1];
                            a(new char[]{58118, 39954, 62615, 50976, 15864, 56798, 25850, 30493, 36566, 61550, 2073, 64533, 40104, 12868, 59690, 59869, 41352, 24952, 59395, 869, 20836, 38814, 43875, 58230, 54313, 55287, 55314, 27310, 1065, 7463, 62681, 43962, 32518, 38843}, i129, objArr9);
                            file = new File((String) objArr9[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                try {
                                    String line3 = bufferedReader.readLine();
                                    int i130 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    int i131 = ((i130 | 1) << 1) - (i130 ^ 1);
                                    Object[] objArr10 = new Object[1];
                                    a(new char[]{46726, 11291, 30641, 29898}, i131, objArr10);
                                    zEquals = line3.equals((String) objArr10[0]);
                                    fileReader.close();
                                    bufferedReader.close();
                                    if (zEquals) {
                                        Object[] objArr11 = new Object[1];
                                        a(new char[]{15776, 50545, 10012, 25683, 25391, 9470, 63605, 52048, 6920, 18114, 52113, 58472, 59066, 205, 27117, 37522, 34552, 44395, 55819, 35118, 31030, 45345, 21006, 47046, 51809, 3731, 1486, 6029, 18967, 61207, 15608, 62247, 62908, 47564, 10755, 1361, 60003, 55893}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36, objArr11);
                                        file2 = new File((String) objArr11[0]);
                                        if (file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            i10 = ((i132 | 23) << 1) - (i132 ^ 23);
                                            g = i10 % 128;
                                            try {
                                                if (i10 % 2 == 0) {
                                                    line2 = bufferedReader2.readLine();
                                                    cArr = new char[]{46726, 11291, 30641, 29898};
                                                    offsetAfter = TextUtils.getOffsetAfter("", 1);
                                                    i11 = 0;
                                                } else {
                                                    line2 = bufferedReader2.readLine();
                                                    cArr = new char[]{46726, 11291, 30641, 29898};
                                                    offsetAfter = TextUtils.getOffsetAfter("", 0);
                                                    i11 = 1;
                                                }
                                                int i133 = -offsetAfter;
                                                int i134 = (i11 ^ i133) + ((i133 & i11) << 1);
                                                Object[] objArr12 = new Object[1];
                                                a(cArr, i134, objArr12);
                                                zEquals2 = line2.equals((String) objArr12[0]);
                                                fileReader2.close();
                                                int i135 = g;
                                                i12 = (i135 & 121) + (i135 | 121);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                                                if (i12 % 2 == 0) {
                                                    bufferedReader2.close();
                                                    throw null;
                                                }
                                                bufferedReader2.close();
                                                if (zEquals2) {
                                                    int i136 = g + 87;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i136 % 128;
                                                    int i137 = i136 % 2;
                                                    if (line != null) {
                                                        objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{line}};
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                } else {
                                                    i8 = 2;
                                                }
                                                Object[] objArr13 = new Object[i8];
                                                objArr13[0] = new int[]{i};
                                                objArr13[1] = new String[0];
                                                int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i139 = ((i138 | 61) << 1) - (i138 ^ 61);
                                                g = i139 % 128;
                                                int i140 = i139 % 2;
                                                objArr = objArr13;
                                            } catch (Throwable th) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th;
                                            }
                                        } else {
                                            int i141 = g;
                                            i9 = (i141 & 41) + (i141 | 41);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                                        }
                                    } else {
                                        i8 = 2;
                                        Object[] objArr14 = new Object[i8];
                                        objArr14[0] = new int[]{i};
                                        objArr14[1] = new String[0];
                                        int i1310 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i1311 = ((i1310 | 61) << 1) - (i1310 ^ 61);
                                        g = i1311 % 128;
                                        int i142 = i1311 % 2;
                                        objArr = objArr14;
                                    }
                                    int i143 = ((int[]) objArr[0])[0];
                                    int i144 = ((~i85) & i) | (i85 & i80);
                                    int i145 = -i144;
                                    int i146 = ((i144 & i145) | (i144 ^ i145)) >> 31;
                                    int i147 = (~i146) & i143;
                                    int i148 = i85 & i146;
                                    int i149 = (i148 & i147) | (i147 ^ i148);
                                    String[] strArr2 = (String[]) objArr[1];
                                    Object[] objArr15 = new Object[2];
                                    int i150 = (i143 & i80) | ((~i143) & i);
                                    int i151 = -i150;
                                    int i152 = (((i150 & i151) | (i150 ^ i151)) >> 31) & 1;
                                    int i153 = -i152;
                                    int i154 = (~(((i153 & i152) | (i152 ^ i153)) >> 31)) & 1;
                                    int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i156 = ((i155 | 17) << 1) - (i155 ^ 17);
                                    g = i156 % 128;
                                    int i157 = i156 % 2;
                                    objArr15[i152] = null;
                                    objArr15[i154] = strArr2;
                                    String[] strArr3 = (String[]) objArr15[0];
                                    int i158 = (~(i & i149)) & (i | i149);
                                    int i159 = -i158;
                                    int i160 = (((i158 & i159) | (i158 ^ i159)) >> 31) & 16;
                                    Object[] objArr16 = {new int[]{i}, new int[1], new int[]{i149}, strArr3};
                                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int i161 = (-981816544) + (((~((-402205938) | iMaxMemory)) | 40446177) * 345) + (((~((-402205938) | (~iMaxMemory))) | (-402341886)) * 345) + ((~(iMaxMemory | (-40446178))) * 345);
                                    int i162 = i160 * (-751);
                                    int i163 = i161 * (-751);
                                    int i164 = ((i162 | i163) << 1) - (i162 ^ i163);
                                    int i165 = ~i160;
                                    int i166 = ~((~i161) | i165);
                                    int i167 = ~i160;
                                    int i168 = i165 | i161;
                                    int i169 = i164 + ((i166 | (~((i167 ^ i) | (i167 & i)))) * 1504) + ((~((i168 & i) | (i168 ^ i))) * (-1504));
                                    int i170 = ~(i167 | i161);
                                    int i171 = ~((~i161) | i160);
                                    int i172 = ((i170 & i171) | (i170 ^ i171)) * 752;
                                    int i173 = ((i169 | i172) << 1) - (i172 ^ i169);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i174 = g;
                                    int i175 = (i174 ^ 49) + ((i174 & 49) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i175 % 128;
                                    int i176 = i175 % 2;
                                    int i177 = (i173 * (-711)) + (i2 * 713);
                                    int i178 = ~i2;
                                    int i179 = ~((i178 ^ i173) | (i178 & i173));
                                    int i180 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i181 = ~((i180 & i173) | (i180 ^ i173));
                                    int i182 = ((i179 & i181) | (i179 ^ i181)) * (-712);
                                    int i183 = (i177 ^ i182) + ((i177 & i182) << 1);
                                    int i184 = ~i2;
                                    int i185 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i186 = ~(i184 | i185 | i173);
                                    int i187 = (i2 & i173) | (i173 ^ i2);
                                    int i188 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i187) | (i187 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i189 = ((i188 & i186) | (i186 ^ i188)) * (-712);
                                    int i190 = (i183 & i189) + (i189 | i183);
                                    int i191 = ~(i185 | i173);
                                    int i192 = ((i191 & i178) | (i178 ^ i191)) * 712;
                                    int i193 = ((i190 | i192) << 1) - (i192 ^ i190);
                                    int i194 = i193 << 13;
                                    int i195 = (i194 & (~i193)) | ((~i194) & i193);
                                    int i196 = i195 ^ (i195 >>> 17);
                                    ((int[]) objArr16[1])[0] = i196 ^ (i196 << 5);
                                    int i197 = i174 + 9;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i197 % 128;
                                    int i198 = i197 % 2;
                                    return objArr16;
                                } catch (Throwable th2) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    throw th2;
                                }
                            }
                            int i199 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i9 = (i199 & 67) + (i199 | 67);
                            g = i9 % 128;
                            int i200 = i9 % 2;
                            i8 = 2;
                            Object[] objArr17 = new Object[i8];
                            objArr17[0] = new int[]{i};
                            objArr17[1] = new String[0];
                            int i1312 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i1313 = ((i1312 | 61) << 1) - (i1312 ^ 61);
                            g = i1313 % 128;
                            int i1410 = i1313 % 2;
                            objArr = objArr17;
                            int i1411 = ((int[]) objArr[0])[0];
                            int i1412 = ((~i85) & i) | (i85 & i80);
                            int i1413 = -i1412;
                            int i1414 = ((i1412 & i1413) | (i1412 ^ i1413)) >> 31;
                            int i1415 = (~i1414) & i1411;
                            int i1416 = i85 & i1414;
                            int i1417 = (i1416 & i1415) | (i1415 ^ i1416);
                            String[] strArr4 = (String[]) objArr[1];
                            Object[] objArr18 = new Object[2];
                            int i1510 = (i1411 & i80) | ((~i1411) & i);
                            int i1511 = -i1510;
                            int i1512 = (((i1510 & i1511) | (i1510 ^ i1511)) >> 31) & 1;
                            int i1513 = -i1512;
                            int i1514 = (~(((i1513 & i1512) | (i1512 ^ i1513)) >> 31)) & 1;
                            int i1515 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i1516 = ((i1515 | 17) << 1) - (i1515 ^ 17);
                            g = i1516 % 128;
                            int i1517 = i1516 % 2;
                            objArr18[i1512] = null;
                            objArr18[i1514] = strArr4;
                            String[] strArr5 = (String[]) objArr18[0];
                            int i1518 = (~(i & i1417)) & (i | i1417);
                            int i1519 = -i1518;
                            int i1610 = (((i1518 & i1519) | (i1518 ^ i1519)) >> 31) & 16;
                            Object[] objArr19 = {new int[]{i}, new int[1], new int[]{i1417}, strArr5};
                            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                            int i1611 = (-981816544) + (((~((-402205938) | iMaxMemory2)) | 40446177) * 345) + (((~((-402205938) | (~iMaxMemory2))) | (-402341886)) * 345) + ((~(iMaxMemory2 | (-40446178))) * 345);
                            int i1612 = i1610 * (-751);
                            int i1613 = i1611 * (-751);
                            int i1614 = ((i1612 | i1613) << 1) - (i1612 ^ i1613);
                            int i1615 = ~i1610;
                            int i1616 = ~((~i1611) | i1615);
                            int i1617 = ~i1610;
                            int i1618 = i1615 | i1611;
                            int i1619 = i1614 + ((i1616 | (~((i1617 ^ i) | (i1617 & i)))) * 1504) + ((~((i1618 & i) | (i1618 ^ i))) * (-1504));
                            int i1710 = ~(i1617 | i1611);
                            int i1711 = ~((~i1611) | i1610);
                            int i1712 = ((i1710 & i1711) | (i1710 ^ i1711)) * 752;
                            int i1713 = ((i1619 | i1712) << 1) - (i1712 ^ i1619);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i1714 = g;
                            int i1715 = (i1714 ^ 49) + ((i1714 & 49) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1715 % 128;
                            int i1716 = i1715 % 2;
                            int i1717 = (i1713 * (-711)) + (i2 * 713);
                            int i1718 = ~i2;
                            int i1719 = ~((i1718 ^ i1713) | (i1718 & i1713));
                            int i1810 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i1811 = ~((i1810 & i1713) | (i1810 ^ i1713));
                            int i1812 = ((i1719 & i1811) | (i1719 ^ i1811)) * (-712);
                            int i1813 = (i1717 ^ i1812) + ((i1717 & i1812) << 1);
                            int i1814 = ~i2;
                            int i1815 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i1816 = ~(i1814 | i1815 | i1713);
                            int i1817 = (i2 & i1713) | (i1713 ^ i2);
                            int i1818 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i1817) | (i1817 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i1819 = ((i1818 & i1816) | (i1816 ^ i1818)) * (-712);
                            int i1910 = (i1813 & i1819) + (i1819 | i1813);
                            int i1911 = ~(i1815 | i1713);
                            int i1912 = ((i1911 & i1718) | (i1718 ^ i1911)) * 712;
                            int i1913 = ((i1910 | i1912) << 1) - (i1912 ^ i1910);
                            int i1914 = i1913 << 13;
                            int i1915 = (i1914 & (~i1913)) | ((~i1914) & i1913);
                            int i1916 = i1915 ^ (i1915 >>> 17);
                            ((int[]) objArr19[1])[0] = i1916 ^ (i1916 << 5);
                            int i1917 = i1714 + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1917 % 128;
                            int i1918 = i1917 % 2;
                            return objArr19;
                        } catch (Throwable th3) {
                            fileReader3.close();
                            bufferedReader3.close();
                            throw th3;
                        }
                    }
                } catch (Exception unused2) {
                }
                int i1110 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i1111 = i1110 * (-445);
                int i1112 = ((i1111 | (-14240)) << 1) - (i1111 ^ (-14240));
                int i1113 = ~i1110;
                int i1114 = ~(i1113 | (-33));
                int i1115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i1210 = ~(((-33) ^ i1115) | (i1115 & (-33)));
                int i1211 = (i1112 - (~(((i1114 ^ i1210) | (i1114 & i1210)) * 446))) - 1;
                int i1212 = ~i1110;
                int i1213 = ~((32 & i1212) | (i1212 ^ 32));
                int i1214 = (i1110 & (-33)) | ((-33) ^ i1110);
                int i1215 = ~((i1214 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1214 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i1216 = ((i1213 & i1215) | (i1213 ^ i1215)) * 446;
                int i1217 = ((i1211 | i1216) << 1) - (i1216 ^ i1211);
                int i1218 = -(-((~(i1113 | (-33))) * 446));
                int i1219 = (i1217 & i1218) + (i1218 | i1217);
                Object[] objArr20 = new Object[1];
                a(new char[]{58118, 39954, 62615, 50976, 15864, 56798, 25850, 30493, 36566, 61550, 2073, 64533, 40104, 12868, 59690, 59869, 41352, 24952, 59395, 869, 20836, 38814, 43875, 58230, 54313, 55287, 55314, 27310, 1065, 7463, 62681, 43962, 32518, 38843}, i1219, objArr20);
                file = new File((String) objArr20[0]);
                if (!file.canRead()) {
                    fileReader = new FileReader(file);
                    bufferedReader = new BufferedReader(fileReader);
                    String line4 = bufferedReader.readLine();
                    int i1314 = -(ViewConfiguration.getTouchSlop() >> 8);
                    int i1315 = ((i1314 | 1) << 1) - (i1314 ^ 1);
                    Object[] objArr110 = new Object[1];
                    a(new char[]{46726, 11291, 30641, 29898}, i1315, objArr110);
                    zEquals = line4.equals((String) objArr110[0]);
                    fileReader.close();
                    bufferedReader.close();
                    if (zEquals) {
                        Object[] objArr111 = new Object[1];
                        a(new char[]{15776, 50545, 10012, 25683, 25391, 9470, 63605, 52048, 6920, 18114, 52113, 58472, 59066, 205, 27117, 37522, 34552, 44395, 55819, 35118, 31030, 45345, 21006, 47046, 51809, 3731, 1486, 6029, 18967, 61207, 15608, 62247, 62908, 47564, 10755, 1361, 60003, 55893}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36, objArr111);
                        file2 = new File((String) objArr111[0]);
                        if (file2.canRead()) {
                            fileReader2 = new FileReader(file2);
                            bufferedReader2 = new BufferedReader(fileReader2);
                            int i1316 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i10 = ((i1316 | 23) << 1) - (i1316 ^ 23);
                            g = i10 % 128;
                            if (i10 % 2 == 0) {
                                line2 = bufferedReader2.readLine();
                                cArr = new char[]{46726, 11291, 30641, 29898};
                                offsetAfter = TextUtils.getOffsetAfter("", 1);
                                i11 = 0;
                            } else {
                                line2 = bufferedReader2.readLine();
                                cArr = new char[]{46726, 11291, 30641, 29898};
                                offsetAfter = TextUtils.getOffsetAfter("", 0);
                                i11 = 1;
                            }
                            int i1317 = -offsetAfter;
                            int i1318 = (i11 ^ i1317) + ((i1317 & i11) << 1);
                            Object[] objArr112 = new Object[1];
                            a(cArr, i1318, objArr112);
                            zEquals2 = line2.equals((String) objArr112[0]);
                            fileReader2.close();
                            int i1319 = g;
                            i12 = (i1319 & 121) + (i1319 | 121);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                            if (i12 % 2 == 0) {
                                bufferedReader2.close();
                                throw null;
                            }
                            bufferedReader2.close();
                            if (zEquals2) {
                                int i1320 = g + 87;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1320 % 128;
                                int i1321 = i1320 % 2;
                                if (line != null) {
                                    objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{line}};
                                } else {
                                    i8 = 2;
                                }
                            } else {
                                i8 = 2;
                            }
                            Object[] objArr113 = new Object[i8];
                            objArr113[0] = new int[]{i};
                            objArr113[1] = new String[0];
                            int i13110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i13111 = ((i13110 | 61) << 1) - (i13110 ^ 61);
                            g = i13111 % 128;
                            int i1418 = i13111 % 2;
                            objArr = objArr113;
                        } else {
                            int i1419 = g;
                            i9 = (i1419 & 41) + (i1419 | 41);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                        }
                    } else {
                        i8 = 2;
                        Object[] objArr114 = new Object[i8];
                        objArr114[0] = new int[]{i};
                        objArr114[1] = new String[0];
                        int i13112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i13113 = ((i13112 | 61) << 1) - (i13112 ^ 61);
                        g = i13113 % 128;
                        int i14110 = i13113 % 2;
                        objArr = objArr114;
                    }
                    int i14111 = ((int[]) objArr[0])[0];
                    int i14112 = ((~i85) & i) | (i85 & i80);
                    int i14113 = -i14112;
                    int i14114 = ((i14112 & i14113) | (i14112 ^ i14113)) >> 31;
                    int i14115 = (~i14114) & i14111;
                    int i14116 = i85 & i14114;
                    int i14117 = (i14116 & i14115) | (i14115 ^ i14116);
                    String[] strArr6 = (String[]) objArr[1];
                    Object[] objArr115 = new Object[2];
                    int i15110 = (i14111 & i80) | ((~i14111) & i);
                    int i15111 = -i15110;
                    int i15112 = (((i15110 & i15111) | (i15110 ^ i15111)) >> 31) & 1;
                    int i15113 = -i15112;
                    int i15114 = (~(((i15113 & i15112) | (i15112 ^ i15113)) >> 31)) & 1;
                    int i15115 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i15116 = ((i15115 | 17) << 1) - (i15115 ^ 17);
                    g = i15116 % 128;
                    int i15117 = i15116 % 2;
                    objArr115[i15112] = null;
                    objArr115[i15114] = strArr6;
                    String[] strArr7 = (String[]) objArr115[0];
                    int i15118 = (~(i & i14117)) & (i | i14117);
                    int i15119 = -i15118;
                    int i16110 = (((i15118 & i15119) | (i15118 ^ i15119)) >> 31) & 16;
                    Object[] objArr116 = {new int[]{i}, new int[1], new int[]{i14117}, strArr7};
                    int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                    int i16111 = (-981816544) + (((~((-402205938) | iMaxMemory3)) | 40446177) * 345) + (((~((-402205938) | (~iMaxMemory3))) | (-402341886)) * 345) + ((~(iMaxMemory3 | (-40446178))) * 345);
                    int i16112 = i16110 * (-751);
                    int i16113 = i16111 * (-751);
                    int i16114 = ((i16112 | i16113) << 1) - (i16112 ^ i16113);
                    int i16115 = ~i16110;
                    int i16116 = ~((~i16111) | i16115);
                    int i16117 = ~i16110;
                    int i16118 = i16115 | i16111;
                    int i16119 = i16114 + ((i16116 | (~((i16117 ^ i) | (i16117 & i)))) * 1504) + ((~((i16118 & i) | (i16118 ^ i))) * (-1504));
                    int i17110 = ~(i16117 | i16111);
                    int i17111 = ~((~i16111) | i16110);
                    int i17112 = ((i17110 & i17111) | (i17110 ^ i17111)) * 752;
                    int i17113 = ((i16119 | i17112) << 1) - (i17112 ^ i16119);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i17114 = g;
                    int i17115 = (i17114 ^ 49) + ((i17114 & 49) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17115 % 128;
                    int i17116 = i17115 % 2;
                    int i17117 = (i17113 * (-711)) + (i2 * 713);
                    int i17118 = ~i2;
                    int i17119 = ~((i17118 ^ i17113) | (i17118 & i17113));
                    int i18110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i18111 = ~((i18110 & i17113) | (i18110 ^ i17113));
                    int i18112 = ((i17119 & i18111) | (i17119 ^ i18111)) * (-712);
                    int i18113 = (i17117 ^ i18112) + ((i17117 & i18112) << 1);
                    int i18114 = ~i2;
                    int i18115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i18116 = ~(i18114 | i18115 | i17113);
                    int i18117 = (i2 & i17113) | (i17113 ^ i2);
                    int i18118 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i18117) | (i18117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                    int i18119 = ((i18118 & i18116) | (i18116 ^ i18118)) * (-712);
                    int i1919 = (i18113 & i18119) + (i18119 | i18113);
                    int i19110 = ~(i18115 | i17113);
                    int i19111 = ((i19110 & i17118) | (i17118 ^ i19110)) * 712;
                    int i19112 = ((i1919 | i19111) << 1) - (i19111 ^ i1919);
                    int i19113 = i19112 << 13;
                    int i19114 = (i19113 & (~i19112)) | ((~i19113) & i19112);
                    int i19115 = i19114 ^ (i19114 >>> 17);
                    ((int[]) objArr116[1])[0] = i19115 ^ (i19115 << 5);
                    int i19116 = i17114 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19116 % 128;
                    int i19117 = i19116 % 2;
                    return objArr116;
                }
                int i1920 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i9 = (i1920 & 67) + (i1920 | 67);
                g = i9 % 128;
                int i201 = i9 % 2;
            } catch (Exception unused3) {
            }
            line = null;
            i8 = 2;
            Object[] objArr117 = new Object[i8];
            objArr117[0] = new int[]{i};
            objArr117[1] = new String[0];
            int i13114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i13115 = ((i13114 | 61) << 1) - (i13114 ^ 61);
            g = i13115 % 128;
            int i14118 = i13115 % 2;
            objArr = objArr117;
            int i14119 = ((int[]) objArr[0])[0];
            int i141110 = ((~i85) & i) | (i85 & i80);
            int i141111 = -i141110;
            int i141112 = ((i141110 & i141111) | (i141110 ^ i141111)) >> 31;
            int i141113 = (~i141112) & i14119;
            int i141114 = i85 & i141112;
            int i141115 = (i141114 & i141113) | (i141113 ^ i141114);
            String[] strArr8 = (String[]) objArr[1];
            Object[] objArr118 = new Object[2];
            int i151110 = (i14119 & i80) | ((~i14119) & i);
            int i151111 = -i151110;
            int i151112 = (((i151110 & i151111) | (i151110 ^ i151111)) >> 31) & 1;
            int i151113 = -i151112;
            int i151114 = (~(((i151113 & i151112) | (i151112 ^ i151113)) >> 31)) & 1;
            int i151115 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i151116 = ((i151115 | 17) << 1) - (i151115 ^ 17);
            g = i151116 % 128;
            int i151117 = i151116 % 2;
            objArr118[i151112] = null;
            objArr118[i151114] = strArr8;
            String[] strArr9 = (String[]) objArr118[0];
            int i151118 = (~(i & i141115)) & (i | i141115);
            int i151119 = -i151118;
            int i161110 = (((i151118 & i151119) | (i151118 ^ i151119)) >> 31) & 16;
            Object[] objArr119 = {new int[]{i}, new int[1], new int[]{i141115}, strArr9};
            int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
            int i161111 = (-981816544) + (((~((-402205938) | iMaxMemory4)) | 40446177) * 345) + (((~((-402205938) | (~iMaxMemory4))) | (-402341886)) * 345) + ((~(iMaxMemory4 | (-40446178))) * 345);
            int i161112 = i161110 * (-751);
            int i161113 = i161111 * (-751);
            int i161114 = ((i161112 | i161113) << 1) - (i161112 ^ i161113);
            int i161115 = ~i161110;
            int i161116 = ~((~i161111) | i161115);
            int i161117 = ~i161110;
            int i161118 = i161115 | i161111;
            int i161119 = i161114 + ((i161116 | (~((i161117 ^ i) | (i161117 & i)))) * 1504) + ((~((i161118 & i) | (i161118 ^ i))) * (-1504));
            int i171110 = ~(i161117 | i161111);
            int i171111 = ~((~i161111) | i161110);
            int i171112 = ((i171110 & i171111) | (i171110 ^ i171111)) * 752;
            int i171113 = ((i161119 | i171112) << 1) - (i171112 ^ i161119);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = setSurfaceOccupancyPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i171114 = g;
            int i171115 = (i171114 ^ 49) + ((i171114 & 49) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i171115 % 128;
            int i171116 = i171115 % 2;
            int i171117 = (i171113 * (-711)) + (i2 * 713);
            int i171118 = ~i2;
            int i171119 = ~((i171118 ^ i171113) | (i171118 & i171113));
            int i181110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i181111 = ~((i181110 & i171113) | (i181110 ^ i171113));
            int i181112 = ((i171119 & i181111) | (i171119 ^ i181111)) * (-712);
            int i181113 = (i171117 ^ i181112) + ((i171117 & i181112) << 1);
            int i181114 = ~i2;
            int i181115 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i181116 = ~(i181114 | i181115 | i171113);
            int i181117 = (i2 & i171113) | (i171113 ^ i2);
            int i181118 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & i181117) | (i181117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
            int i181119 = ((i181118 & i181116) | (i181116 ^ i181118)) * (-712);
            int i19118 = (i181113 & i181119) + (i181119 | i181113);
            int i19119 = ~(i181115 | i171113);
            int i191110 = ((i19119 & i171118) | (i171118 ^ i19119)) * 712;
            int i191111 = ((i19118 | i191110) << 1) - (i191110 ^ i19118);
            int i191112 = i191111 << 13;
            int i191113 = (i191112 & (~i191111)) | ((~i191112) & i191111);
            int i191114 = i191113 ^ (i191113 >>> 17);
            ((int[]) objArr119[1])[0] = i191114 ^ (i191114 << 5);
            int i191115 = i171114 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i191115 % 128;
            int i191116 = i191115 % 2;
            return objArr119;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = r6 + 108
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = io.reactivex.internal.observers.CallbackCompletableObserver.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r6]
        L2a:
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.observers.CallbackCompletableObserver.$$e(short, byte, short):java.lang.String");
    }
}
