package retrofit2.adapter.rxjava2;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deInitSession;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.requestClose;
import io.reactivex.exceptions.CompositeException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class CallEnqueueObservable<T> extends VideoRecordEventStart<Response<T>> {
    private final Call<T> originalCall;
    private static final byte[] $$c = {0, -94, -62, -97};
    private static final int $$f = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$h = 9;
    private static final byte[] $$a = {92, 126, -38, -95, -15, 8, -16, 1, 4, 3, 52, -67, -6, 67, -24, -35, 1, -21, 12, -12, 45, -35, 1, -21, 12, -2, 0, -15, 45, -46, -1, -2, 7, 0, -19, 13, -1};
    private static final int $$b = 5;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60079, 60051, 60081, 60075, 60060, 60034, 60085, 60083, 60063, 60045, 60091, 60040, 60058, 60043, 60053, 60087, 60088, 60047, 60041, 60080, 60055, 60078, 60117, 60073, 60050, 60046, 60062, 60089, 60061, 60086, 60082, 60084, 60054, 60049, 60056, 60052};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 8
            int r6 = 105 - r6
            int r8 = r8 + 4
            byte[] r0 = retrofit2.adapter.rxjava2.CallEnqueueObservable.$$a
            int r7 = r7 * 3
            int r1 = r7 + 16
            byte[] r1 = new byte[r1]
            int r7 = r7 + 15
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-2)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.CallEnqueueObservable.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = retrofit2.adapter.rxjava2.CallEnqueueObservable.$$g
            int r6 = r6 + 84
            int r8 = r8 * 52
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.CallEnqueueObservable.d(int, short, int, java.lang.Object[]):void");
    }

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Response<T>> derivemediatype) {
        int i = 2 % 2;
        Call<T> callMo9655clone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callMo9655clone, derivemediatype);
        derivemediatype.onSubscribe(callCallback);
        if (!callCallback.isDisposed()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            b = i2 % 128;
            int i3 = i2 % 2;
            callMo9655clone.enqueue(callCallback);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = b + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static final class CallCallback<T> implements BufferProviderState, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final deriveMediaType<? super Response<T>> observer;
        boolean terminated = false;

        CallCallback(Call<?> call, deriveMediaType<? super Response<T>> derivemediatype) {
            this.call = call;
            this.observer = derivemediatype;
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                if (this.terminated) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
                }
            }
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<T> call, Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th);
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.disposed;
        }
    }

    private static void g(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iGreen = 2267 - Color.green(0);
                        int iBlue = Color.blue(0) + 33;
                        byte b3 = $$c[0];
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iGreen, iBlue, -1927765101, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int i6 = 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iArgb = Color.argb(0, 0, 0, 0) + 33;
            byte b5 = $$c[0];
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, i6, iArgb, -1927765101, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
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
                int i7 = $10 + 111;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    int i9 = $10 + 119;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49266);
                        int keyRepeatDelay = 3261 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iResolveSizeAndState = 30 - View.resolveSizeAndState(0, 0, 0);
                        byte b7 = $$c[0];
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, keyRepeatDelay, iResolveSizeAndState, -127612708, false, $$i(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 22878);
                            int fadingEdgeLength = 594 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iIndexOf = 17 - TextUtils.indexOf("", "", 0);
                            byte b9 = $$c[0];
                            byte b10 = (byte) (b9 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, fadingEdgeLength, iIndexOf, 1570859318, false, $$i(b9, b10, (byte) (b10 - 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i12 = $11 + 69;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        int i18 = 0;
        while (i18 < i) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            i18++;
            int i19 = $10 + 111;
            $11 = i19 % 128;
            int i20 = i19 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0990 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x03da  */
    /* JADX WARN: Code duplicated, block: B:33:0x0419  */
    /* JADX WARN: Code duplicated, block: B:35:0x0430 A[Catch: all -> 0x09a0, TRY_LEAVE, TryCatch #0 {all -> 0x09a0, blocks: (B:14:0x01af, B:16:0x020d, B:18:0x0236, B:20:0x02ec, B:24:0x0365, B:30:0x03dd, B:34:0x041b, B:38:0x0490, B:40:0x04a6, B:44:0x052a, B:50:0x05a7, B:52:0x0627, B:54:0x0634, B:35:0x0430, B:27:0x0398), top: B:136:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:43:0x051f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0565  */
    /* JADX WARN: Code duplicated, block: B:48:0x0580  */
    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        int i;
        String string;
        Method method;
        Class cls;
        Class<?> cls2;
        int i2;
        int i3;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4;
        Object[] objArr;
        int i5;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object[] objArr2;
        int iResolveSizeAndState;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Long l;
        int i17 = 2;
        int i18 = 2 % 2;
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
        b = i19 % 128;
        int i20 = i19 % 2;
        byte[] bArr = $$a;
        int i21 = 1;
        Object[] objArr3 = new Object[1];
        a(bArr[7], bArr[26], bArr[30], objArr3);
        int i22 = 0;
        Class<?> cls3 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(bArr[26], bArr[7], (byte) (bArr[35] + 1), objArr4);
        Method[] methodArr = {cls3.getMethod((String) objArr4[0], new Class[0])};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iRed = 2823 - Color.red(0);
            int iIndexOf = 22 - TextUtils.indexOf("", "", 0);
            byte[] bArr2 = $$g;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            d(b2, bArr2[5], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, iRed, iIndexOf, 1814927978, false, (String) objArr5[0], null);
        }
        Class<?>[] clsArr = null;
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                int i23 = b;
                int i24 = (i23 & 59) + (i23 | 59);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                int i25 = i24 % 2;
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getDeclaredMethods();
                int length = declaredMethods.length;
                int i26 = b + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = 0;
                while (i28 < length) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i29 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                    int i30 = ~(((-1983940058) & i29) | ((-1983940058) ^ i29));
                    int i31 = -(-(((1926244735 ^ i30) | (i30 & 1926244735)) * (-602)));
                    int i32 = ((-261118941) & i31) + ((-261118941) | i31);
                    int i33 = ~(((-1983940058) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-1983940058)));
                    int i34 = (1916797273 ^ i33) | (i33 & 1916797273);
                    int i35 = (i29 ^ 1983940057) | (1983940057 & i29);
                    int i36 = ~((i35 ^ 1926244735) | (i35 & 1926244735));
                    int i37 = (((i32 - (~(-(-(((i34 ^ i36) | (i34 & i36)) * (-301)))))) - 1) - (~((~((i29 ^ 1926244735) | (i29 & 1926244735))) * 301))) - 1;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i38 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i39 = ~(((-11567629) ^ i38) | ((-11567629) & i38));
                    int i40 = ~(((-100884737) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-100884737) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                    int i41 = (i39 ^ i40) | (i40 & i39);
                    int i42 = ~(((-1879574580) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-1879574580) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                    int i43 = -(-(((i41 ^ i42) | (i41 & i42)) * 765));
                    int i44 = ((-1864607408) & i43) + (i43 | (-1864607408));
                    int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i46 = ~(((-112452365) ^ i45) | (i45 & (-112452365)));
                    int i47 = ((11567628 ^ i46) | (11567628 & i46)) * 1530;
                    int i48 = (i44 ^ i47) + ((i44 & i47) << i21);
                    int i49 = ~((-112452365) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                    int i50 = ((-1891142208) & i38) | ((-1891142208) ^ i38);
                    int i51 = ~((i50 & 112452364) | (i50 ^ 112452364));
                    int i52 = ((i49 & i51) | (i49 ^ i51)) * 765;
                    if (i37 > (i48 ^ i52) + ((i48 & i52) << i21)) {
                        method = declaredMethods[i28];
                        int i53 = 81 / i22;
                    } else {
                        method = declaredMethods[i28];
                    }
                    int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i55 = ((i54 | 97) << i21) - (i54 ^ 97);
                    b = i55 % 128;
                    int i56 = i55 % i17;
                    try {
                        int i57 = -(ViewConfiguration.getEdgeSlop() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i58 = i57 * (-755);
                        int i59 = (i58 & (-18120)) + (i58 | (-18120));
                        int i60 = ~i57;
                        int i61 = -(-((~((i60 ^ (-25)) | (i60 & (-25)))) * 1512));
                        int i62 = (i59 & i61) + (i61 | i59);
                        int i63 = b;
                        int i64 = ((i63 | 99) << i21) - (i63 ^ 99);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i64 % 128;
                        int i65 = i64 % i17;
                        int i66 = ~i57;
                        int i67 = ~((i66 & (-25)) | (i66 ^ (-25)));
                        int i68 = i57 | 24;
                        int i69 = ~((i68 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i68 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                        int i70 = i62 + ((-756) * ((i67 ^ i69) | (i67 & i69)));
                        int i71 = (i57 & 24) | (i57 ^ 24);
                        int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                        int i73 = -(-(((i71 & i72) | (i71 ^ i72)) * 756));
                        int i74 = (i70 & i73) + (i70 | i73);
                        int i75 = -(SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                        Object[] objArr6 = new Object[i21];
                        g(i74, new char[]{30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, 24, 27, '\r', 5, ' ', 11}, (byte) ((i75 & 96) + (i75 | 96)), objArr6);
                        Class<?> cls4 = Class.forName((String) objArr6[i22]);
                        int i76 = b + 37;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i76 % 128;
                        int i77 = i76 % i17;
                        int i78 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        Object[] objArr7 = new Object[i21];
                        g(12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{2, 28, 23, '#', ' ', 11, 25, 29, 25, 27, 23, 6}, (byte) ((i78 ^ 110) + ((i78 & 110) << i21)), objArr7);
                        Object[] objArr8 = new Object[i21];
                        objArr8[i22] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr7[i22], clsArr).invoke(method, clsArr)).intValue());
                        int absoluteGravity = Gravity.getAbsoluteGravity(i22, i22);
                        int i79 = (absoluteGravity ^ 26) + ((absoluteGravity & 26) << i21);
                        char[] cArr = {30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, '#', 5, 6, 26, 29, 25, 24, 20};
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(i22, i22);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                        int i81 = ~(((-61) ^ i80) | ((-61) & i80));
                        int i82 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                        int i83 = i82 % 128;
                        b = i83;
                        int i84 = i82 % 2;
                        int i85 = ((absoluteGravity2 * (-112)) - 6720) + (226 * ((absoluteGravity2 ^ i81) | (i81 & absoluteGravity2)));
                        int i86 = ~absoluteGravity2;
                        int i87 = ~((i86 & 60) | (i86 ^ 60));
                        int i88 = ~absoluteGravity2;
                        int i89 = ~((i88 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i88 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
                        int i90 = (i87 ^ i89) | (i87 & i89);
                        int i91 = ~(i80 | (-61) | absoluteGravity2);
                        int i92 = -(-(((i90 & i91) | (i90 ^ i91)) * (-113)));
                        int i93 = (i85 ^ i92) + ((i92 & i85) << 1);
                        int i94 = ~((-61) | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                        int i95 = i83 + 47;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i95 % 128;
                        int i96 = i95 % 2;
                        int i97 = 113 * i94;
                        byte b3 = (byte) (((i93 | i97) << 1) - (i93 ^ i97));
                        Object[] objArr9 = new Object[1];
                        g(i79, cArr, b3, objArr9);
                        Class<?> cls5 = Class.forName((String) objArr9[0]);
                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i98 = packedPositionChild2 * (-51);
                        int i99 = (i98 ^ 477) + ((i98 & 477) << 1);
                        int i100 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                        int i101 = (i100 & packedPositionChild2) | (i100 ^ packedPositionChild2);
                        int i102 = i99 + ((~((i101 & 9) | (i101 ^ 9))) * 52);
                        int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                        int i104 = ~(((-10) & i103) | ((-10) ^ i103));
                        int i105 = ~(((-10) & packedPositionChild2) | ((-10) ^ packedPositionChild2));
                        int i106 = ((i104 & i105) | (i104 ^ i105) | (~((i103 ^ packedPositionChild2) | (i103 & packedPositionChild2)))) * (-52);
                        int i107 = (i102 & i106) + (i106 | i102);
                        int i108 = ~packedPositionChild2;
                        int i109 = ~((i103 & i108) | (i108 ^ i103));
                        int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i111 = (i110 ^ 119) + ((i110 & 119) << 1);
                        b = i111 % 128;
                        int i112 = i111 % 2;
                        int i113 = ~packedPositionChild2;
                        if (i112 == 0) {
                            int i114 = ~((i113 & 9) | (i113 ^ 9));
                            Object[] objArr10 = new Object[1];
                            g(i107 << (52 << ((i109 & i114) | (i109 ^ i114))), new char[]{29, 6, '\f', 18, '\f', 29, '\b', 27}, (byte) (113 >>> View.MeasureSpec.makeMeasureSpec(0, 1)), objArr10);
                            String str = (String) objArr10[0];
                            Class<?>[] clsArr2 = new Class[1];
                            clsArr2[1] = Integer.TYPE;
                            if (!(!((Boolean) cls5.getMethod(str, clsArr2).invoke(null, objArr8)).booleanValue())) {
                                cls = Long.TYPE;
                                int i115 = -(-TextUtils.getTrimmedLength(""));
                                Object[] objArr11 = new Object[1];
                                g(23 - (~(-(-Color.red(0)))), new char[]{30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, 24, 27, '\r', 5, ' ', 11}, (byte) ((i115 & 95) + (i115 | 95)), objArr11);
                                cls2 = Class.forName((String) objArr11[0]);
                                int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i2 = (i116 & 117) + (i116 | 117);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    i3 = -TextUtils.lastIndexOf("", '0', 1, 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i117 = (-949) / i3;
                                    i4 = (i117 ^ 3887104) + ((i117 & 3887104) << 1);
                                } else {
                                    i3 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i118 = i3 * (-949);
                                    i4 = (i118 ^ (-11388)) + ((i118 & (-11388)) << 1);
                                }
                                int i119 = b + 121;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i119 % 128;
                                int i120 = i119 % 2;
                                int i121 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (-13));
                                int i122 = ~i3;
                                int i123 = ~((i122 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i122 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i124 = (i4 - (~(-(-(1900 * ((i121 & i123) | (i121 ^ i123))))))) - 1;
                                int i125 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i126 = ~((i125 ^ i3) | (i125 & i3));
                                int i127 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | 12);
                                int i128 = ((i126 & i127) | (i126 ^ i127)) * (-950);
                                int i129 = ~((i125 & 12) | (i125 ^ 12));
                                int i130 = ~((i3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i131 = (((i124 | i128) << 1) - (i128 ^ i124)) + (((i130 & i129) | (i129 ^ i130)) * 950);
                                char[] cArr2 = {2, 28, 23, 29, 29, 14, 24, 19, '\f', 2, 1, 17, 13897};
                                int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay();
                                int i132 = b + 45;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i132 % 128;
                                int i133 = i132 % 2;
                                int i134 = -(scrollDefaultDelay >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i135 = i134 * (-496);
                                int i136 = (i135 & (-36704)) + (i135 | (-36704));
                                int i137 = ~i134;
                                int i138 = -(-((~((i137 ^ (-75)) | (i137 & (-75)))) * 497));
                                int i139 = (i136 ^ i138) + ((i138 & i136) << 1);
                                int i140 = (i137 & (-75)) | (i137 ^ (-75));
                                int i141 = ~((i140 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i140 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                int i142 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                int i143 = (-75) | i142;
                                int i144 = ~((i143 ^ i134) | (i143 & i134));
                                int i145 = -(-(((i141 ^ i144) | (i141 & i144)) * 497));
                                int i146 = ((i139 | i145) << 1) - (i145 ^ i139);
                                int i147 = ~i134;
                                int i148 = (i134 & (-75)) | ((-75) ^ i134);
                                int i149 = -(-(((~((i148 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i148 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) | (~(i147 | 74)) | (~(i142 | i147))) * 497));
                                objArr = new Object[1];
                                g(i131, cArr2, (byte) (((i146 | i149) << 1) - (i149 ^ i146)), objArr);
                                if (cls.equals(cls2.getMethod((String) objArr[0], null).invoke(method, null))) {
                                    int i150 = b + 23;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i150 % 128;
                                    int i151 = i150 % 2;
                                    int iNormalizeMetaState = 24 - KeyEvent.normalizeMetaState(0);
                                    char[] cArr3 = {30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, 24, 27, '\r', 5, ' ', 11};
                                    i5 = -Color.blue(0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i152 = i5 * (-1965);
                                    int i153 = (i152 & 93480) + (i152 | 93480);
                                    int i154 = ((i5 ^ (-96)) | (i5 & (-96))) * 983;
                                    i6 = (i153 ^ i154) + ((i154 & i153) << 1);
                                    i7 = ~i5;
                                    i8 = b + 83;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i155 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-96));
                                        i9 = i6 * (((i7 & i155) | (i7 ^ i155)) - 983);
                                        int i156 = ~i5;
                                        int i157 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i158 = ~((i157 & i156) | (i156 ^ i157));
                                        int i159 = ~((i156 & 95) | (i156 ^ 95));
                                        i10 = i158 ^ i159;
                                        i11 = i159 & i158;
                                    } else {
                                        int i160 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        i9 = (i6 - (~(((~((i160 & (-96)) | ((-96) ^ i160))) | i7) * (-983)))) - 1;
                                        int i161 = ~i5;
                                        int i162 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i163 = ~((i161 & i162) | (i161 ^ i162));
                                        int i164 = ~((i7 ^ 95) | (i7 & 95));
                                        i10 = i163 ^ i164;
                                        i11 = i163 & i164;
                                    }
                                    int i165 = 983 * (i11 | i10);
                                    Object[] objArr12 = new Object[1];
                                    g(iNormalizeMetaState, cArr3, (byte) ((i9 & i165) + (i165 | i9)), objArr12);
                                    Class<?> cls6 = Class.forName((String) objArr12[0]);
                                    int i166 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i167 = (i166 * 989) - 16779;
                                    int i168 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                    int i169 = ~((-18) | i168 | i166);
                                    int i170 = (i166 ^ 17) | (i166 & 17);
                                    int i171 = b;
                                    int i172 = (i171 ^ 85) + ((i171 & 85) << 1);
                                    int i173 = i172 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i173;
                                    int i174 = i172 % 2;
                                    int i175 = ~((i170 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i170 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i176 = -(-(988 * ((i169 & i175) | (i169 ^ i175))));
                                    int i177 = (((i167 ^ i176) + ((i167 & i176) << 1)) - (~(((i166 ^ (-18)) | (i166 & (-18))) * (-988)))) - 1;
                                    int i178 = ~i166;
                                    int i179 = ~((i178 & (-18)) | (i178 ^ (-18)));
                                    int i180 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & (-18)) | ((-18) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                    int i181 = (i166 & i168) | (i168 ^ i166);
                                    int i182 = (i177 - (~(-(-(((~((i181 & 17) | (i181 ^ 17))) | ((i180 & i179) | (i179 ^ i180))) * 988))))) - 1;
                                    char[] cArr4 = {2, 28, 15, 5, 18, 24, 14, 30, 29, 14, 24, 20, 1, 0, 14, 25, 13846};
                                    int i183 = i173 + 29;
                                    b = i183 % 128;
                                    int i184 = i183 % 2;
                                    int trimmedLength = TextUtils.getTrimmedLength("");
                                    Object[] objArr13 = new Object[1];
                                    g(i182, cArr4, (byte) ((trimmedLength & 45) + (trimmedLength | 45)), objArr13);
                                    objArr2 = (Object[]) cls6.getMethod((String) objArr13[0], null).invoke(method, null);
                                    if (objArr2.length == 2 && Long.TYPE.equals(objArr2[0])) {
                                        int i185 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i186 = ((i185 | 73) << 1) - (i185 ^ 73);
                                        b = i186 % 128;
                                        if (i186 % 2 == 0) {
                                            iResolveSizeAndState = View.resolveSizeAndState(0, 1, 1);
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i187 = -iResolveSizeAndState;
                                            i12 = (i187 ^ (-574)) + ((i187 & (-574)) << 1);
                                            i13 = -18368;
                                            i14 = 32;
                                        } else {
                                            iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            i12 = iResolveSizeAndState * (-574);
                                            i13 = -13776;
                                            i14 = 24;
                                        }
                                        int i188 = ((i12 | i13) << 1) - (i12 ^ i13);
                                        int i189 = ~iResolveSizeAndState;
                                        int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i191 = ~((i189 ^ i190) | (i189 & i190));
                                        int i192 = ~i14;
                                        int i193 = ~((i192 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i192 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                        int i194 = ((i191 ^ i193) | (i191 & i193)) * 1150;
                                        int i195 = ((i188 | i194) << 1) - (i194 ^ i188);
                                        int i196 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                        int i197 = ~((i14 & i196) | (i196 ^ i14));
                                        int i198 = -(-(((i197 & i193) | (i193 ^ i197)) * (-575)));
                                        int i199 = (i195 ^ i198) + ((i195 & i198) << 1);
                                        int i200 = ~((i189 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i189 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                        int i201 = ~((iResolveSizeAndState & i190) | (i190 ^ iResolveSizeAndState));
                                        int i202 = (i199 - (~(((i200 & i201) | (i200 ^ i201)) * 575))) - 1;
                                        char[] cArr5 = {30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, 24, 27, '\r', 5, ' ', 11};
                                        int iArgb = Color.argb(0, 0, 0, 0);
                                        int i203 = b;
                                        int i204 = (i203 & 111) + (i203 | 111);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i204 % 128;
                                        int i205 = i204 % 2;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i206 = ~iArgb;
                                        int i207 = b;
                                        int i208 = i207 + 55;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i208 % 128;
                                        int i209 = i208 % 2;
                                        int i210 = i206 | (-96);
                                        int i211 = ~((i210 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i210 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
                                        int i212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                        int i213 = (i212 & iArgb) | (i212 ^ iArgb);
                                        int i214 = ~((i213 & 95) | (i213 ^ 95));
                                        int i215 = (((iArgb * (-317)) + 30305) - (~(-(-((-318) * ((i211 & i214) | (i211 ^ i214))))))) - 1;
                                        int i216 = (i207 ^ 65) + ((i207 & 65) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i216 % 128;
                                        if (i216 % 2 != 0) {
                                            i15 = i215 - ((-318) >> ((~((-96) | iArgb)) | (~((iArgb ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (iArgb & iTuitionPaymentFragmentspecialinlinedviewModeldefault13)))));
                                            int i217 = ~iArgb;
                                            i16 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & i217) | (i217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                                        } else {
                                            int i218 = ~(((-96) & iArgb) | ((-96) ^ iArgb));
                                            int i219 = ~(iArgb | iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
                                            int i220 = ((i218 & i219) | (i218 ^ i219)) * (-318);
                                            i15 = (i215 | i220) + (i215 & i220);
                                            i16 = iTuitionPaymentFragmentspecialinlinedviewModeldefault13 | (~iArgb);
                                        }
                                        byte b4 = (byte) (i15 + (TypedValues.AttributesType.TYPE_PIVOT_TARGET * ((~i16) | (-96))));
                                        Object[] objArr14 = new Object[1];
                                        g(i202, cArr5, b4, objArr14);
                                        if (Class.forName((String) objArr14[0]).equals(objArr2[1])) {
                                            int i221 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i222 = (i221 ^ 115) + ((i221 & 115) << 1);
                                            b = i222 % 128;
                                            int i223 = i222 % 2;
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (i223 == 0) {
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                                    int iArgb2 = Color.argb(0, 0, 0, 0) + 2823;
                                                    int packedPositionType = 22 - ExpandableListView.getPackedPositionType(0L);
                                                    byte[] bArr3 = $$g;
                                                    byte b5 = bArr3[7];
                                                    Object[] objArr15 = new Object[1];
                                                    d(b5, bArr3[5], b5, objArr15);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iArgb2, packedPositionType, 1814927978, false, (String) objArr15[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cBlue = (char) Color.blue(0);
                                                    int iRed2 = 2823 - Color.red(0);
                                                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                                    byte[] bArr4 = $$g;
                                                    byte b6 = bArr4[7];
                                                    Object[] objArr16 = new Object[1];
                                                    d(b6, bArr4[5], b6, objArr16);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iRed2, minimumFlingVelocity, 1814927978, false, (String) objArr16[0], null);
                                                }
                                                Object[] objArr17 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                    int iRgb = 16780039 + Color.rgb(0, 0, 0);
                                                    int mode = 22 - View.MeasureSpec.getMode(0);
                                                    byte[] bArr5 = $$g;
                                                    Object[] objArr18 = new Object[1];
                                                    d(bArr5[10], bArr5[7], bArr5[5], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iRgb, mode, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17);
                                            } else {
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char cMyPid = (char) (Process.myPid() >> 22);
                                                    int i224 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824;
                                                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                                                    byte[] bArr6 = $$g;
                                                    byte b7 = bArr6[7];
                                                    Object[] objArr19 = new Object[1];
                                                    d(b7, bArr6[5], b7, objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, i224, touchSlop2, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2824;
                                                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 22;
                                                    byte[] bArr7 = $$g;
                                                    byte b8 = bArr7[7];
                                                    Object[] objArr20 = new Object[1];
                                                    d(b8, bArr7[5], b8, objArr20);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, modifierMetaStateMask, iResolveSizeAndState2, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                                    int i225 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2822;
                                                    int i226 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    byte[] bArr8 = $$g;
                                                    Object[] objArr22 = new Object[1];
                                                    d(bArr8[10], bArr8[7], bArr8[5], objArr22);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i225, i226, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                l = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
                                            }
                                            l.longValue();
                                            int i227 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i228 = ((i227 | 73) << 1) - (i227 ^ 73);
                                            b = i228 % 128;
                                            int i229 = i228 % 2;
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            int i230 = ~((i113 & 9) | (i113 ^ 9));
                            int i231 = i109 ^ i230;
                            int i232 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                            Object[] objArr23 = new Object[1];
                            g(i107 + (((i109 & i230) | i231) * 52), new char[]{29, 6, '\f', 18, '\f', 29, '\b', 27}, (byte) ((i232 ^ 54) + ((i232 & 54) << 1)), objArr23);
                            if (((Boolean) cls5.getMethod((String) objArr23[0], Integer.TYPE).invoke(null, objArr8)).booleanValue()) {
                                cls = Long.TYPE;
                                int i1110 = -(-TextUtils.getTrimmedLength(""));
                                Object[] objArr110 = new Object[1];
                                g(23 - (~(-(-Color.red(0)))), new char[]{30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, 24, 27, '\r', 5, ' ', 11}, (byte) ((i1110 & 95) + (i1110 | 95)), objArr110);
                                cls2 = Class.forName((String) objArr110[0]);
                                int i1111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i2 = (i1111 & 117) + (i1111 | 117);
                                b = i2 % 128;
                                if (i2 % 2 == 0) {
                                    i3 = -TextUtils.lastIndexOf("", '0', 1, 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i1112 = (-949) / i3;
                                    i4 = (i1112 ^ 3887104) + ((i1112 & 3887104) << 1);
                                } else {
                                    i3 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i1113 = i3 * (-949);
                                    i4 = (i1113 ^ (-11388)) + ((i1113 & (-11388)) << 1);
                                }
                                int i1114 = b + 121;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1114 % 128;
                                int i1210 = i1114 % 2;
                                int i1211 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (-13));
                                int i1212 = ~i3;
                                int i1213 = ~((i1212 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1212 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i1214 = (i4 - (~(-(-(1900 * ((i1211 & i1213) | (i1211 ^ i1213))))))) - 1;
                                int i1215 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i1216 = ~((i1215 ^ i3) | (i1215 & i3));
                                int i1217 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | 12);
                                int i1218 = ((i1216 & i1217) | (i1216 ^ i1217)) * (-950);
                                int i1219 = ~((i1215 & 12) | (i1215 ^ 12));
                                int i1310 = ~((i3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i1311 = (((i1214 | i1218) << 1) - (i1218 ^ i1214)) + (((i1310 & i1219) | (i1219 ^ i1310)) * 950);
                                char[] cArr6 = {2, 28, 23, 29, 29, 14, 24, 19, '\f', 2, 1, 17, 13897};
                                int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay();
                                int i1312 = b + 45;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1312 % 128;
                                int i1313 = i1312 % 2;
                                int i1314 = -(scrollDefaultDelay2 >> 16);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1315 = i1314 * (-496);
                                int i1316 = (i1315 & (-36704)) + (i1315 | (-36704));
                                int i1317 = ~i1314;
                                int i1318 = -(-((~((i1317 ^ (-75)) | (i1317 & (-75)))) * 497));
                                int i1319 = (i1316 ^ i1318) + ((i1318 & i1316) << 1);
                                int i1410 = (i1317 & (-75)) | (i1317 ^ (-75));
                                int i1411 = ~((i1410 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i1410 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                                int i1412 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                int i1413 = (-75) | i1412;
                                int i1414 = ~((i1413 ^ i1314) | (i1413 & i1314));
                                int i1415 = -(-(((i1411 ^ i1414) | (i1411 & i1414)) * 497));
                                int i1416 = ((i1319 | i1415) << 1) - (i1415 ^ i1319);
                                int i1417 = ~i1314;
                                int i1418 = (i1314 & (-75)) | ((-75) ^ i1314);
                                int i1419 = -(-(((~((i1418 & iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | (i1418 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14))) | (~(i1417 | 74)) | (~(i1412 | i1417))) * 497));
                                objArr = new Object[1];
                                g(i1311, cArr6, (byte) (((i1416 | i1419) << 1) - (i1419 ^ i1416)), objArr);
                                if (cls.equals(cls2.getMethod((String) objArr[0], null).invoke(method, null))) {
                                    int i1510 = b + 23;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1510 % 128;
                                    int i1511 = i1510 % 2;
                                    int iNormalizeMetaState2 = 24 - KeyEvent.normalizeMetaState(0);
                                    char[] cArr7 = {30, 15, 6, 15, 23, 21, '\r', 15, '\n', 28, 20, 24, 26, 22, 28, ' ', 16, 23, 24, 27, '\r', 5, ' ', 11};
                                    i5 = -Color.blue(0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i1512 = i5 * (-1965);
                                    int i1513 = (i1512 & 93480) + (i1512 | 93480);
                                    int i1514 = ((i5 ^ (-96)) | (i5 & (-96))) * 983;
                                    i6 = (i1513 ^ i1514) + ((i1514 & i1513) << 1);
                                    i7 = ~i5;
                                    i8 = b + 83;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        int i1515 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (-96));
                                        i9 = i6 * (((i7 & i1515) | (i7 ^ i1515)) - 983);
                                        int i1516 = ~i5;
                                        int i1517 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1518 = ~((i1517 & i1516) | (i1516 ^ i1517));
                                        int i1519 = ~((i1516 & 95) | (i1516 ^ 95));
                                        i10 = i1518 ^ i1519;
                                        i11 = i1519 & i1518;
                                    } else {
                                        int i1610 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        i9 = (i6 - (~(((~((i1610 & (-96)) | ((-96) ^ i1610))) | i7) * (-983)))) - 1;
                                        int i1611 = ~i5;
                                        int i1612 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i1613 = ~((i1611 & i1612) | (i1611 ^ i1612));
                                        int i1614 = ~((i7 ^ 95) | (i7 & 95));
                                        i10 = i1613 ^ i1614;
                                        i11 = i1613 & i1614;
                                    }
                                    int i1615 = 983 * (i11 | i10);
                                    Object[] objArr111 = new Object[1];
                                    g(iNormalizeMetaState2, cArr7, (byte) ((i9 & i1615) + (i1615 | i9)), objArr111);
                                    Class<?> cls7 = Class.forName((String) objArr111[0]);
                                    int i1616 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = requestClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    int i1617 = (i1616 * 989) - 16779;
                                    int i1618 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                    int i1619 = ~((-18) | i1618 | i1616);
                                    int i1710 = (i1616 ^ 17) | (i1616 & 17);
                                    int i1711 = b;
                                    int i1712 = (i1711 ^ 85) + ((i1711 & 85) << 1);
                                    int i1713 = i1712 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1713;
                                    int i1714 = i1712 % 2;
                                    int i1715 = ~((i1710 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i1710 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                                    int i1716 = -(-(988 * ((i1619 & i1715) | (i1619 ^ i1715))));
                                    int i1717 = (((i1617 ^ i1716) + ((i1617 & i1716) << 1)) - (~(((i1616 ^ (-18)) | (i1616 & (-18))) * (-988)))) - 1;
                                    int i1718 = ~i1616;
                                    int i1719 = ~((i1718 & (-18)) | (i1718 ^ (-18)));
                                    int i1810 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & (-18)) | ((-18) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
                                    int i1811 = (i1616 & i1618) | (i1618 ^ i1616);
                                    int i1812 = (i1717 - (~(-(-(((~((i1811 & 17) | (i1811 ^ 17))) | ((i1810 & i1719) | (i1719 ^ i1810))) * 988))))) - 1;
                                    char[] cArr8 = {2, 28, 15, 5, 18, 24, 14, 30, 29, 14, 24, 20, 1, 0, 14, 25, 13846};
                                    int i1813 = i1713 + 29;
                                    b = i1813 % 128;
                                    int i1814 = i1813 % 2;
                                    int trimmedLength2 = TextUtils.getTrimmedLength("");
                                    Object[] objArr112 = new Object[1];
                                    g(i1812, cArr8, (byte) ((trimmedLength2 & 45) + (trimmedLength2 | 45)), objArr112);
                                    objArr2 = (Object[]) cls7.getMethod((String) objArr112[0], null).invoke(method, null);
                                    if (objArr2.length == 2) {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i28 = (i28 ^ 1) + ((i28 & 1) << 1);
                        i17 = 2;
                        clsArr = null;
                        i22 = 0;
                        i21 = 1;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int deadChar = KeyEvent.getDeadChar(0, 0) + 2823;
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                byte[] bArr9 = $$g;
                byte b9 = bArr9[7];
                Object[] objArr24 = new Object[1];
                d(b9, bArr9[5], b9, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, deadChar, minimumFlingVelocity2, 1814927978, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int mirror = 2871 - AndroidCharacter.getMirror('0');
                int mode2 = 22 - View.MeasureSpec.getMode(0);
                byte b10 = (byte) ($$h + 5);
                byte[] bArr10 = $$g;
                Object[] objArr26 = new Object[1];
                d(b10, bArr10[7], bArr10[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, mirror, mode2, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr25);
            Object[] objArr27 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c4 = (char) (37658 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i233 = 2720 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iNormalizeMetaState3 = 19 - KeyEvent.normalizeMetaState(0);
                byte b11 = (byte) ($$h + 5);
                byte[] bArr11 = $$g;
                Object[] objArr28 = new Object[1];
                d(b11, bArr11[7], bArr11[5], objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, i233, iNormalizeMetaState3, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr27)).longValue();
            long j2 = -501160825;
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            long j3 = TypedValues.CycleType.TYPE_EASING;
            long j4 = iUptimeMillis;
            long j5 = -1;
            long j6 = j2 ^ j5;
            long j7 = (((long) (-419)) * j2) + (((long) 421) * jLongValue) + (((jLongValue | j4) ^ j5) * j3) + (((long) (-420)) * (jLongValue | j6)) + (j3 * ((((j4 ^ j5) | jLongValue) ^ j5) | ((j6 | (jLongValue ^ j5)) ^ j5))) + ((long) (-1309245020));
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i234 = (~((-1019269541) | iElapsedRealtime)) | 415268868;
            int i235 = ~iElapsedRealtime;
            int i236 = ((int) (j7 >> 32)) & ((-2102222438) + ((i234 | (~(1021957542 | i235))) * 886) + (((~(i235 | 1019269540)) | 417956870) * (-1772)) + ((~(i235 | 417956870)) * 886));
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i237 = ~iElapsedRealtime2;
            int i238 = i236 | (((int) j7) & ((-685152980) + (((~(1837849145 | i237)) | (-400622736)) * (-865)) + ((~(iElapsedRealtime2 | (-1837849146))) * 865) + (((~((-400622736) | i237)) | (~(i237 | (-1837849146)))) * 865)));
            int i239 = i238 >>> 24;
            int i240 = i238 & ViewCompat.MEASURED_SIZE_MASK;
            if (i239 != 0) {
                int i241 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i242 = ((i241 | 19) << 1) - (i241 ^ 19);
                b = i242 % 128;
                int i243 = i242 % 2;
                i = 1;
            } else {
                i = 0;
            }
            if (i == 0 || i240 >= 1) {
                string = null;
            } else {
                int i244 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                b = i244 % 128;
                if (i244 % 2 == 0) {
                    Method method2 = methodArr[i240];
                    throw null;
                }
                Method method3 = methodArr[i240];
                if (method3 != null) {
                    string = method3.toString();
                } else {
                    string = null;
                }
            }
            list.add(string);
            return (i239 + 6) * i;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r7, int r8, byte r9) {
        /*
            int r8 = r8 + 113
            int r9 = r9 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = retrofit2.adapter.rxjava2.CallEnqueueObservable.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.CallEnqueueObservable.$$i(byte, int, byte):java.lang.String");
    }
}
