package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import defpackage.AbsActionBarViewVisibilityAnimListener;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.SharedByteBuffer;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableScalarXMap {
    public static <T, R> boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        if (!(autoValue_VideoValidatedEncoderProfilesProxy instanceof Callable)) {
            return false;
        }
        try {
            AbsActionBarViewVisibilityAnimListener absActionBarViewVisibilityAnimListener = (Object) ((Callable) autoValue_VideoValidatedEncoderProfilesProxy).call();
            if (absActionBarViewVisibilityAnimListener == null) {
                EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
                return true;
            }
            try {
                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy2 = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(readablems.apply(absActionBarViewVisibilityAnimListener), "The mapper returned a null ObservableSource");
                if (autoValue_VideoValidatedEncoderProfilesProxy2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) autoValue_VideoValidatedEncoderProfilesProxy2).call();
                        if (objCall == null) {
                            EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(derivemediatype, objCall);
                        derivemediatype.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        EmptyDisposable.b(th, derivemediatype);
                        return true;
                    }
                } else {
                    autoValue_VideoValidatedEncoderProfilesProxy2.subscribe(derivemediatype);
                }
                return true;
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                EmptyDisposable.b(th2, derivemediatype);
                return true;
            }
        } catch (Throwable th3) {
            dumpMediaCodecListForFormat.b(th3);
            EmptyDisposable.b(th3, derivemediatype);
            return true;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T, R> extends VideoRecordEventStart<R> {
        private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> TuitionPaymentFragmentbindingInflater1;
        private T b;
        private static final byte[] $$c = {91, -17, 90, 37};
        private static final int $$f = 3;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$g = {86, -48, ByteCompanionObject.MIN_VALUE, 88, 17, -6, 18, 1, -2, -1, -50, 73, 6, -1, 4, 3, 7, 6, -66, 76, -62, -2, 67, -4, 3, 9, -4, -47, 73, -10, 18, 4, -6, 10, 3, -60, 35, 28, 3, 9, -4, -26, 48, 3, 10, 2, 1, 1, 4, -3, 17, -43, 48, 2, 7, -11, 23, -76, 52, 34, -13, 17, 9, 1, 3, 7, 6, -45, 48, 3, 10, 2, 1, 1, 11, -46, 51, -3, -51, 3, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -63};
        private static final int $$h = 188;
        private static final byte[] $$a = {83, -90, 68, -23, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 175;
        private static int asInterface = 0;
        private static int d = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47287, 47274, 47284, 47270, 47273, 47279, 47210, 47269, 47237, 47327, 47268, 47283, 47275, 47253, 47276, 47285, 47277, 47272, 47238, 47255, 47266, 47236, 47280, 47267, 47278, 47281, 47248};
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2047719512;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static boolean f1211a = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void g(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r0 = 53 - r7
                int r6 = r6 * 14
                int r6 = r6 + 84
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                int r8 = r8 * 52
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2c
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r8 + (-10)
                int r8 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void i(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 24
                int r0 = r7 + 53
                int r8 = r8 * 13
                int r8 = 97 - r8
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                int r7 = r7 + 52
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2f
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2f:
                int r3 = r3 + r6
                int r6 = r3 + (-4)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.i(short, short, byte, java.lang.Object[]):void");
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
            this.b = t;
            this.TuitionPaymentFragmentbindingInflater1 = readablems;
        }

        private static void h(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i4]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i3) + 31340);
                            int offsetBefore = 2994 - TextUtils.getOffsetBefore("", i3);
                            int threadPriority = ((Process.getThreadPriority(i3) + 20) >> 6) + 17;
                            byte b = (byte) ($$f - 3);
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, offsetBefore, threadPriority, 1182129903, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i4++;
                        i3 = 0;
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
            try {
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43325), 253 - KeyEvent.keyCodeFromString(""), 22 - Drawable.resolveOpacity(0, 0), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                if (f1211a) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33601);
                            int keyRepeatDelay = 3085 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                            byte b3 = (byte) ($$f - 3);
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, keyRepeatDelay, iCombineMeasuredStates, -2146875848, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    }
                    objArr[0] = new String(cArr4);
                    int i5 = $10 + 95;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (33602 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3085;
                            int iAlpha = Color.alpha(0) + 26;
                            byte b5 = (byte) ($$f - 3);
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i7, iAlpha, -2146875848, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    int i8 = $11 + 57;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        @Override // defpackage.VideoRecordEventStart
        public final void subscribeActual(deriveMediaType<? super R> derivemediatype) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = asInterface + 103;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int capsMode = 921 - TextUtils.getCapsMode("", 0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                g(bArr[7], (byte) 52, bArr[80], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, capsMode, iIndexOf, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            h(127 - TextUtils.indexOf("", ""), null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            h((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char gidForName = (char) (Process.getGidForName("") + 31534);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b = $$a[80];
                byte b2 = b;
                Object[] objArr5 = new Object[1];
                g(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, absoluteGravity, edgeSlop, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                    int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iRed = 28 - Color.red(0);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    g(bArr2[80], (byte) (-bArr2[33]), bArr2[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(edgeSlop2, jumpTapTimeout, iRed, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyTid = Process.myTid();
                int i4 = (((((~((-1236308068) | iMyTid)) | 860160) * 449) - 49884936) + (((~((~iMyTid) | (-1236308068))) | 860160) * 449)) - 696424640;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                h(Color.red(0) + 127, null, null, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                h(127 - View.MeasureSpec.getSize(0), null, null, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = d + 27;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
                }
                Object[] objArr10 = new Object[1];
                h(TextUtils.getCapsMode("", 0, 0) + 127, null, null, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                h(Color.rgb(0, 0, 0) + 16777343, null, null, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -696424640};
                    byte[] bArr3 = $$g;
                    Object[] objArr13 = new Object[1];
                    i(bArr3[9], bArr3[7], bArr3[117], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    i((byte) (bArr3[19] - 1), bArr3[117], bArr3[7], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char defaultSize = (char) (31533 - View.getDefaultSize(0, 0));
                        int i8 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int gidForName2 = 27 - Process.getGidForName("");
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        g(bArr4[80], (byte) (-bArr4[33]), bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, i8, gidForName2, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        h(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        h((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, null, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
                            int i9 = 921 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int size = View.MeasureSpec.getSize(0) + 28;
                            byte b3 = $$a[80];
                            byte b4 = b3;
                            Object[] objArr19 = new Object[1];
                            g(b3, b4, b4, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, i9, size, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            g(bArr5[7], (byte) 52, bArr5[80], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, modifierMetaStateMask, maximumDrawingCacheSize, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw null;
            }
            int i10 = asInterface + 37;
            d = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = i12 + (((788831605 + (((~iIdentityHashCode) | (-1706918164)) * 1444)) + (((~(iIdentityHashCode | 1200973510)) | ((~(573106133 | iIdentityHashCode)) | (-1740498904))) * (-1444))) - 260700266);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr21[0])[0] = i15 ^ (i15 << 5);
            try {
                AutoValue_VideoValidatedEncoderProfilesProxy<? extends R> autoValue_VideoValidatedEncoderProfilesProxyApply = this.TuitionPaymentFragmentbindingInflater1.apply(this.b);
                int i16 = ((int[]) objArr21[0])[0];
                int i17 = i16 * i16;
                int i18 = -(1511686697 * i16);
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                int i20 = -(i16 * (-1327695937));
                int i21 = ((i19 & i20) + (i20 | i19)) - 1511044976;
                int i22 = ((i21 >> 26) + ComposerKt.defaultsKey) / 64;
                int i23 = ((i22 | 1) << 1) - (i22 ^ 1);
                int i24 = (i21 ^ i23) + ((i23 & i21) << 1);
                int i25 = i21 >> 21;
                int i26 = (((i25 | (-4095)) << 1) - (i25 ^ (-4095))) / 2048;
                int i27 = -(i24 ^ (((i26 | 1) << 1) - (i26 ^ 1)));
                int i28 = (i27 & 1) + (i27 | 1);
                int i29 = i28 >> 27;
                int i30 = (((i29 ^ (-63)) + ((i29 & (-63)) << 1)) / 32) + 1;
                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(autoValue_VideoValidatedEncoderProfilesProxyApply, "16,25,22,30,The mapper returned a null ObservableSource".substring(2976 / (((-(((i30 | 1) << 1) - (i30 ^ 1))) & i28) * 248)));
                if (!(autoValue_VideoValidatedEncoderProfilesProxy instanceof Callable)) {
                    autoValue_VideoValidatedEncoderProfilesProxy.subscribe(derivemediatype);
                    return;
                }
                try {
                    Object objCall = ((Callable) autoValue_VideoValidatedEncoderProfilesProxy).call();
                    if (objCall != null) {
                        ScalarDisposable scalarDisposable = new ScalarDisposable(derivemediatype, objCall);
                        derivemediatype.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                        int i31 = asInterface + 99;
                        d = i31 % 128;
                        int i32 = i31 % 2;
                        return;
                    }
                    int i33 = asInterface + 83;
                    d = i33 % 128;
                    if (i33 % 2 != 0) {
                        EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
                    } else {
                        EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
                        int i34 = 9 / 0;
                    }
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    EmptyDisposable.b(th2, derivemediatype);
                }
            } catch (Throwable th3) {
                EmptyDisposable.b(th3, derivemediatype);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$i(byte r5, int r6, byte r7) {
            /*
                int r7 = 68 - r7
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r6 = r6 * 3
                int r6 = 3 - r6
                int r5 = r5 * 3
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r5
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r6 = r6 + 1
                int r4 = r3 + 1
                if (r3 != r5) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L27:
                r3 = r0[r6]
            L29:
                int r7 = r7 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$i(byte, int, byte):java.lang.String");
        }
    }

    public static final class ScalarDisposable<T> extends AtomicInteger implements SharedByteBuffer<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final deriveMediaType<? super T> observer;
        final T value;

        public ScalarDisposable(deriveMediaType<? super T> derivemediatype, T t) {
            this.observer = derivemediatype;
            this.value = t;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentbindingInflater1(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return get() != 1;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            lazySet(3);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            set(3);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == 3;
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }
}
