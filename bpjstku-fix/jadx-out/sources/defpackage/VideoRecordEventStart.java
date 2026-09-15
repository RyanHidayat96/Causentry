package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.TestObserver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VideoRecordEventStart<T> implements AutoValue_VideoValidatedEncoderProfilesProxy<T> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {27, -8, 5, 78, 45, -2, -47, 42, -4, 1, -17, 17, -50, 31, 5, -9, 0, -8, 17, -17, -30, 34, 1, -6, -34, 27, 8, -1, -41, 22, 7, 5, -51, 31, -4, 10, 1, -30, 17, -6, 16, 10, -4, -65, 55, 6, -2, -10, 3, -9, -57, 49, 11, -12, 12, -5, -8, -7, -56, 55, 4, 4, -71, 57, 3, 4, -17, 11, -6, -15, 9, -64, Base64.padSymbol, -3, -3, -4, 9, -23, 2, 10, -4, -2, 0, -3, -66, 74, -2, -26, 14, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -3, -5, -13, -4, 4, -10, 9, -5, 3, -4, -5, 3, -11, -3, 16, -15, -6, 16, -44, 32, -13, -1, 5, -10, -1, -1, -7, 18, -11, 6, -68, 1, -2, -37, 41, -2, -26, 11, 4, 10, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -20, 5, 3, -12, 3, 3, -9, -32, 35, -10, 4, -13, 17, -17, 11, -67, 10, -4, -65, 50, 12, -8, 7, -1, -11, 8, -73, 52, -5, 17, -21, -53, 69, -4, -16, 11, -70, Base64.padSymbol, 0, -13, -1, 5, -64, 66, -15, 10, 2, -18, 12, -1, -72, 37, 25, -14, -5, 17, -17, -35, 31, 15, -15, -8, 0, -19, 25, -6, -8, 7, 29, -46, 29, 0, 6, -29, 32, -15, 12, -2, -16, -3, -35, 28, 9, -2, -12, -3, 0, 6, -30, 29, -46, 29, 0, 6, -29, 32, -15, 12, -2, -16, -3, -33, 47, -19, 7, 4, -46, 23, 11, -12, 6, -9, 11, 36, -8, -1, -17, 6, -45, 29, 15, -33, 31, 3, -15, -9, -36, 42, -4, 1, -17, 11, -7, 4, -3, -43, 49, -6, -17, 11, -6, -15, 9, -27, 36, -13, 4, -14, -5, 13, -13, -8, -25, 19, 10, -13, 0, -5, -51, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -3, -5, -13, -4, 4, -10, 9, -5, 3, -4, -5, 3, -11, -3, 16, -15, -6, 16, -44, 32, -13, -1, 5, -10, -1, -1, -7, 18, -11, 6, -69, 10, -4, -65, 55, 6, -2, -10, 3, -9, -57, 49, 11, -12, 12, -5, -8, -7, -56, 55, 4, 4, -71, 57, 3, 4, -17, 11, -6, -15, 9, -64, 54, 1, -7, 9, -67, 74, -2, -27, -2};
    private static final int $$k = 56;
    private static final byte[] $$d = {29, 88, -118, 32, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 27;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = 4475025787752771908L;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 + 1
            int r7 = 103 - r7
            byte[] r0 = defpackage.VideoRecordEventStart.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r8]
        L23:
            int r8 = r8 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VideoRecordEventStart.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = defpackage.VideoRecordEventStart.$$j
            int r6 = r6 + 1
            int r7 = r7 + 65
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r5
            r7 = r6
            r3 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r0[r5]
        L23:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + 2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VideoRecordEventStart.f(short, int, byte, java.lang.Object[]):void");
    }

    protected abstract void subscribeActual(deriveMediaType<? super T> derivemediatype);

    /* JADX WARN: Code duplicated, block: B:52:0x0246  */
    /* JADX WARN: Code duplicated, block: B:53:0x0247  */
    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = $11 + 67;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 19472), 2624 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 39423), 480 - TextUtils.indexOf((CharSequence) "", '0', 0), 36 - ImageFormat.getBitsPerPixel(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 19472), 2624 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 39422), Color.rgb(0, 0, 0) + 16777697, 36 - ExpandableListView.getPackedPositionChild(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $11 + 125;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $10 + 115;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 39422), Drawable.resolveOpacity(0, 0) + 481, 37 - KeyEvent.getDeadChar(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 480, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    public static <T> VideoRecordEventStart<T> amb(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        int i = 2 % 2;
        share.b(iterable, "sources is null");
        Object obj = null;
        ObservableAmb observableAmb = new ObservableAmb(null, iterable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableAmb;
        }
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> ambArray(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxyArr, "sources is null");
            int length = autoValue_VideoValidatedEncoderProfilesProxyArr.length;
            obj.hashCode();
            throw null;
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxyArr, "sources is null");
        int length2 = autoValue_VideoValidatedEncoderProfilesProxyArr.length;
        if (length2 != 0) {
            if (length2 == 1) {
                return wrap(autoValue_VideoValidatedEncoderProfilesProxyArr[0]);
            }
            return new ObservableAmb(autoValue_VideoValidatedEncoderProfilesProxyArr, null);
        }
        VideoRecordEventStart<T> videoRecordEventStartEmpty = empty();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartEmpty;
    }

    public static int bufferSize() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int iB = VideoRecordEvent.b();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return iB;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatest(readableMs<? super Object[], ? extends R> readablems, int i, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return combineLatest(autoValue_VideoValidatedEncoderProfilesProxyArr, readablems, i);
        }
        combineLatest(autoValue_VideoValidatedEncoderProfilesProxyArr, readablems, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatest(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(iterable, readablems, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartCombineLatest;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatest(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems, int i) {
        int i2 = 2 % 2;
        share.b(iterable, "sources is null");
        share.b(readablems, "combiner is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableCombineLatest observableCombineLatest = new ObservableCombineLatest(null, iterable, readablems, i << 1, false);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return observableCombineLatest;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, readableMs<? super Object[], ? extends R> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            combineLatest(autoValue_VideoValidatedEncoderProfilesProxyArr, readablems, bufferSize());
            throw null;
        }
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(autoValue_VideoValidatedEncoderProfilesProxyArr, readablems, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoRecordEventStartCombineLatest;
        }
        obj.hashCode();
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, readableMs<? super Object[], ? extends R> readablems, int i) {
        VideoRecordEventStart<R> videoRecordEventStartEmpty;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxyArr, "sources is null");
        if (autoValue_VideoValidatedEncoderProfilesProxyArr.length != 0) {
            share.b(readablems, "combiner is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
            return new ObservableCombineLatest(autoValue_VideoValidatedEncoderProfilesProxyArr, null, readablems, i << 1, false);
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            videoRecordEventStartEmpty = empty();
            int i6 = 88 / 0;
        } else {
            videoRecordEventStartEmpty = empty();
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 != 0) {
            return videoRecordEventStartEmpty;
        }
        throw null;
    }

    public static <T1, T2, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            return combineLatest(Functions.b(dumpcodeccapabilities), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        readableMs readablemsB = Functions.b(dumpcodeccapabilities);
        int iBufferSize = bufferSize();
        AutoValue_VideoValidatedEncoderProfilesProxy[] autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[5];
        autoValue_VideoValidatedEncoderProfilesProxyArr[0] = autoValue_VideoValidatedEncoderProfilesProxy;
        autoValue_VideoValidatedEncoderProfilesProxyArr[0] = autoValue_VideoValidatedEncoderProfilesProxy2;
        return combineLatest(readablemsB, iBufferSize, autoValue_VideoValidatedEncoderProfilesProxyArr);
    }

    public static <T1, T2, T3, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, stringToLog<? super T1, ? super T2, ? super T3, ? extends R> stringtolog) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((stringToLog) stringtolog), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartCombineLatest;
    }

    public static <T1, T2, T3, T4, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, exploreProfiles<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> exploreprofiles) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.TuitionPaymentFragmentbindingInflater1((exploreProfiles) exploreprofiles), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartCombineLatest;
    }

    public static <T1, T2, T3, T4, T5, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, QualityExploredEncoderProfilesProvider<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> qualityExploredEncoderProfilesProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.b(qualityExploredEncoderProfilesProvider), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartCombineLatest;
        }
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, filterUnmatchedDynamicRange<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> filterunmatcheddynamicrange) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.TuitionPaymentFragmentbindingInflater1((filterUnmatchedDynamicRange) filterunmatcheddynamicrange), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return videoRecordEventStartCombineLatest;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T7> autoValue_VideoValidatedEncoderProfilesProxy7, DynamicRangeMatchedEncoderProfilesProvider<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> dynamicRangeMatchedEncoderProfilesProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy7, "source7 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1((DynamicRangeMatchedEncoderProfilesProvider) dynamicRangeMatchedEncoderProfilesProvider), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6, autoValue_VideoValidatedEncoderProfilesProxy7);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartCombineLatest;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T7> autoValue_VideoValidatedEncoderProfilesProxy7, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T8> autoValue_VideoValidatedEncoderProfilesProxy8, checkFullySpecifiedOrThrow<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> checkfullyspecifiedorthrow) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy7, "source7 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy8, "source8 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkfullyspecifiedorthrow), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6, autoValue_VideoValidatedEncoderProfilesProxy7, autoValue_VideoValidatedEncoderProfilesProxy8);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartCombineLatest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> VideoRecordEventStart<R> combineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T7> autoValue_VideoValidatedEncoderProfilesProxy7, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T8> autoValue_VideoValidatedEncoderProfilesProxy8, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T9> autoValue_VideoValidatedEncoderProfilesProxy9, hasMatchedVideoProfileForAllTargetDynamicRanges<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> hasmatchedvideoprofileforalltargetdynamicranges) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy7, "source7 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy8, "source8 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy9, "source9 is null");
        VideoRecordEventStart<R> videoRecordEventStartCombineLatest = combineLatest(Functions.TuitionPaymentFragmentbindingInflater1((hasMatchedVideoProfileForAllTargetDynamicRanges) hasmatchedvideoprofileforalltargetdynamicranges), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6, autoValue_VideoValidatedEncoderProfilesProxy7, autoValue_VideoValidatedEncoderProfilesProxy8, autoValue_VideoValidatedEncoderProfilesProxy9);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartCombineLatest;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatestDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, readableMs<? super Object[], ? extends R> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartCombineLatestDelayError = combineLatestDelayError(autoValue_VideoValidatedEncoderProfilesProxyArr, readablems, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartCombineLatestDelayError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatestDelayError(readableMs<? super Object[], ? extends R> readablems, int i, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartCombineLatestDelayError = combineLatestDelayError(autoValue_VideoValidatedEncoderProfilesProxyArr, readablems, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return videoRecordEventStartCombineLatestDelayError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatestDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, readableMs<? super Object[], ? extends R> readablems, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        share.b(readablems, "combiner is null");
        if (autoValue_VideoValidatedEncoderProfilesProxyArr.length != 0) {
            ObservableCombineLatest observableCombineLatest = new ObservableCombineLatest(autoValue_VideoValidatedEncoderProfilesProxyArr, null, readablems, i << 1, true);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            return observableCombineLatest;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            return empty();
        }
        empty();
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatestDelayError(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems) {
        VideoRecordEventStart<R> videoRecordEventStartCombineLatestDelayError;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            videoRecordEventStartCombineLatestDelayError = combineLatestDelayError(iterable, readablems, bufferSize());
            int i3 = 69 / 0;
        } else {
            videoRecordEventStartCombineLatestDelayError = combineLatestDelayError(iterable, readablems, bufferSize());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartCombineLatestDelayError;
        }
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> combineLatestDelayError(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems, int i) {
        int i2 = 2 % 2;
        share.b(iterable, "sources is null");
        share.b(readablems, "combiner is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableCombineLatest observableCombineLatest = new ObservableCombineLatest(null, iterable, readablems, i << 1, true);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return observableCombineLatest;
    }

    public static <T> VideoRecordEventStart<T> concat(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(iterable, "sources is null");
        VideoRecordEventStart<T> videoRecordEventStartConcatMapDelayError = fromIterable(iterable).concatMapDelayError(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), bufferSize(), false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatMapDelayError;
    }

    public static <T> VideoRecordEventStart<T> concat(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcat = concat(autoValue_VideoValidatedEncoderProfilesProxy, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcat;
    }

    public static <T> VideoRecordEventStart<T> concat(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        ObservableConcatMap observableConcatMap = new ObservableConcatMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, ErrorMode.IMMEDIATE);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return observableConcatMap;
    }

    public static <T> VideoRecordEventStart<T> concat(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        VideoRecordEventStart<T> videoRecordEventStartConcatArray = concatArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatArray;
    }

    public static <T> VideoRecordEventStart<T> concat(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy3) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
            return concatArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3);
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        AutoValue_VideoValidatedEncoderProfilesProxy[] autoValue_VideoValidatedEncoderProfilesProxyArr = {autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2};
        autoValue_VideoValidatedEncoderProfilesProxyArr[5] = autoValue_VideoValidatedEncoderProfilesProxy3;
        return concatArray(autoValue_VideoValidatedEncoderProfilesProxyArr);
    }

    public static <T> VideoRecordEventStart<T> concat(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        VideoRecordEventStart<T> videoRecordEventStartConcatArray = concatArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartConcatArray;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        return empty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r5.length != 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r1 = r1 + 21;
        defpackage.VideoRecordEventStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        return wrap(r5[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return wrap(r5[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        return new io.reactivex.internal.operators.observable.ObservableConcatMap(fromArray(r5), io.reactivex.internal.functions.Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), bufferSize(), io.reactivex.internal.util.ErrorMode.BOUNDARY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return empty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5.length == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5.length == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r1 + 37;
        defpackage.VideoRecordEventStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> defpackage.VideoRecordEventStart<T> concatArray(defpackage.AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.VideoRecordEventStart.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r1 + 65
            int r3 = r2 % 128
            defpackage.VideoRecordEventStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L16
            int r2 = r5.length
            r4 = 20
            int r4 = r4 / r3
            if (r2 != 0) goto L2f
            goto L19
        L16:
            int r2 = r5.length
            if (r2 != 0) goto L2f
        L19:
            int r1 = r1 + 37
            int r5 = r1 % 128
            defpackage.VideoRecordEventStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L2a
            VideoRecordEventStart r5 = empty()
            r0 = 11
            int r0 = r0 / r3
            goto L2e
        L2a:
            VideoRecordEventStart r5 = empty()
        L2e:
            return r5
        L2f:
            int r2 = r5.length
            r4 = 1
            if (r2 != r4) goto L4a
            int r1 = r1 + 21
            int r2 = r1 % 128
            defpackage.VideoRecordEventStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L43
            r5 = r5[r4]
            VideoRecordEventStart r5 = wrap(r5)
            return r5
        L43:
            r5 = r5[r3]
            VideoRecordEventStart r5 = wrap(r5)
            return r5
        L4a:
            io.reactivex.internal.operators.observable.ObservableConcatMap r0 = new io.reactivex.internal.operators.observable.ObservableConcatMap
            VideoRecordEventStart r5 = fromArray(r5)
            readableMs r1 = io.reactivex.internal.functions.Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            int r2 = bufferSize()
            io.reactivex.internal.util.ErrorMode r3 = io.reactivex.internal.util.ErrorMode.BOUNDARY
            r0.<init>(r5, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VideoRecordEventStart.concatArray(AutoValue_VideoValidatedEncoderProfilesProxy[]):VideoRecordEventStart");
    }

    public static <T> VideoRecordEventStart<T> concatArrayDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i = 2 % 2;
        if (autoValue_VideoValidatedEncoderProfilesProxyArr.length == 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return empty();
            }
            int i3 = 77 / 0;
            return empty();
        }
        if (autoValue_VideoValidatedEncoderProfilesProxyArr.length != 1) {
            return concatDelayError(fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return wrap(autoValue_VideoValidatedEncoderProfilesProxyArr[0]);
    }

    public static <T> VideoRecordEventStart<T> concatArrayEager(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatArrayEager = concatArrayEager(bufferSize(), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxyArr);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return videoRecordEventStartConcatArrayEager;
    }

    public static <T> VideoRecordEventStart<T> concatArrayEager(int i, int i2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr).concatMapEagerDelayError(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, i2, false);
    }

    public static <T> VideoRecordEventStart<T> concatArrayEagerDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatArrayEagerDelayError = concatArrayEagerDelayError(bufferSize(), bufferSize(), autoValue_VideoValidatedEncoderProfilesProxyArr);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatArrayEagerDelayError;
    }

    public static <T> VideoRecordEventStart<T> concatArrayEagerDelayError(int i, int i2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatMapEagerDelayError = fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr).concatMapEagerDelayError(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, i2, true);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return videoRecordEventStartConcatMapEagerDelayError;
    }

    public static <T> VideoRecordEventStart<T> concatDelayError(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        VideoRecordEventStart<T> videoRecordEventStartConcatDelayError;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(iterable, "sources is null");
            videoRecordEventStartConcatDelayError = concatDelayError(fromIterable(iterable));
            int i3 = 78 / 0;
        } else {
            share.b(iterable, "sources is null");
            videoRecordEventStartConcatDelayError = concatDelayError(fromIterable(iterable));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return videoRecordEventStartConcatDelayError;
    }

    public static <T> VideoRecordEventStart<T> concatDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return concatDelayError(autoValue_VideoValidatedEncoderProfilesProxy, bufferSize(), i2 % 2 == 0);
    }

    public static <T> VideoRecordEventStart<T> concatDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i, boolean z) {
        ErrorMode errorMode;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch is null");
        readableMs readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (!z) {
            errorMode = ErrorMode.BOUNDARY;
        } else {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                ErrorMode errorMode2 = ErrorMode.END;
                throw null;
            }
            errorMode = ErrorMode.END;
        }
        return new ObservableConcatMap(autoValue_VideoValidatedEncoderProfilesProxy, readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2, i, errorMode);
    }

    public static <T> VideoRecordEventStart<T> concatEager(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatEager = concatEager(autoValue_VideoValidatedEncoderProfilesProxy, bufferSize(), bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartConcatEager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> concatEager(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatMapEager = wrap(autoValue_VideoValidatedEncoderProfilesProxy).concatMapEager(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, i2);
        if (i5 != 0) {
            int i6 = 72 / 0;
        }
        return videoRecordEventStartConcatMapEager;
    }

    public static <T> VideoRecordEventStart<T> concatEager(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatEager = concatEager(iterable, bufferSize(), bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatEager;
    }

    public static <T> VideoRecordEventStart<T> concatEager(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatMapEagerDelayError = fromIterable(iterable).concatMapEagerDelayError(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, i2, false);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return videoRecordEventStartConcatMapEagerDelayError;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> create(getVideoOutput<T> getvideooutput) {
        int i = 2 % 2;
        share.b(getvideooutput, "source is null");
        ObservableCreate observableCreate = new ObservableCreate(getvideooutput);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> defer(Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> callable) {
        int i = 2 % 2;
        share.b(callable, "supplier is null");
        AudioSource1 audioSource1 = new AudioSource1(callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioSource1;
    }

    public static <T> VideoRecordEventStart<T> empty() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStart = (VideoRecordEventStart<T>) AudioStreamPacketInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 0) {
            return videoRecordEventStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> error(Callable<? extends Throwable> callable) {
        int i = 2 % 2;
        share.b(callable, "errorSupplier is null");
        AudioSourceAccessException audioSourceAccessException = new AudioSourceAccessException(callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceAccessException;
    }

    public static <T> VideoRecordEventStart<T> error(Throwable th) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(th, "exception is null");
            return error((Callable<? extends Throwable>) Functions.TuitionPaymentFragmentbindingInflater1(th));
        }
        share.b(th, "exception is null");
        error((Callable<? extends Throwable>) Functions.TuitionPaymentFragmentbindingInflater1(th));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> fromArray(T... tArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(tArr, "items is null");
            int length = tArr.length;
            throw null;
        }
        share.b(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        if (tArr.length == 1) {
            return just(tArr[0]);
        }
        AudioStreamImpl audioStreamImpl = new AudioStreamImpl(tArr);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return audioStreamImpl;
    }

    public static <T> VideoRecordEventStart<T> fromCallable(Callable<? extends T> callable) {
        int i = 2 % 2;
        share.b(callable, "supplier is null");
        AudioStreamFactory audioStreamFactory = new AudioStreamFactory(callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return audioStreamFactory;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> fromFuture(Future<? extends T> future) {
        int i = 2 % 2;
        share.b(future, "future is null");
        Object obj = null;
        getSizeInBytes getsizeinbytes = new getSizeInBytes(future, 0L, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return getsizeinbytes;
        }
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        share.b(future, "future is null");
        share.b(timeUnit, "unit is null");
        getSizeInBytes getsizeinbytes = new getSizeInBytes(future, j, timeUnit);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return getsizeinbytes;
    }

    public static <T> VideoRecordEventStart<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(appendbackupvideoprofile, "scheduler is null");
            fromFuture(future, j, timeUnit).subscribeOn(appendbackupvideoprofile);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        share.b(appendbackupvideoprofile, "scheduler is null");
        VideoRecordEventStart<T> videoRecordEventStartSubscribeOn = fromFuture(future, j, timeUnit).subscribeOn(appendbackupvideoprofile);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartSubscribeOn;
    }

    public static <T> VideoRecordEventStart<T> fromFuture(Future<? extends T> future, appendBackupVideoProfile appendbackupvideoprofile) {
        VideoRecordEventStart<T> videoRecordEventStartSubscribeOn;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(appendbackupvideoprofile, "scheduler is null");
            videoRecordEventStartSubscribeOn = fromFuture(future).subscribeOn(appendbackupvideoprofile);
            int i3 = 5 / 0;
        } else {
            share.b(appendbackupvideoprofile, "scheduler is null");
            videoRecordEventStartSubscribeOn = fromFuture(future).subscribeOn(appendbackupvideoprofile);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartSubscribeOn;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> fromIterable(Iterable<? extends T> iterable) {
        int i = 2 % 2;
        share.b(iterable, "source is null");
        getMinBufferSize getminbuffersize = new getMinBufferSize(iterable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return getminbuffersize;
    }

    public static <T> VideoRecordEventStart<T> fromPublisher(ImageProxyTransformFactory<? extends T> imageProxyTransformFactory) {
        int i = 2 % 2;
        share.b(imageProxyTransformFactory, "publisher is null");
        checkStartedOrThrow checkstartedorthrow = new checkStartedOrThrow(imageProxyTransformFactory);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return checkstartedorthrow;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> generate(logToString<getRecordingStats<T>> logtostring) {
        int i = 2 % 2;
        share.b(logtostring, "generator is null");
        VideoRecordEventStart<T> videoRecordEventStartGenerate = generate(Functions.g(), new AudioStreamImplExternalSyntheticLambda0.cancel(logtostring), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return videoRecordEventStartGenerate;
    }

    public static <T, S> VideoRecordEventStart<T> generate(Callable<S> callable, dumpVideoCapabilities<S, getRecordingStats<T>> dumpvideocapabilities) {
        int i = 2 % 2;
        share.b(dumpvideocapabilities, "generator is null");
        VideoRecordEventStart<T> videoRecordEventStartGenerate = generate(callable, new AudioStreamImplExternalSyntheticLambda0.cancelAll(dumpvideocapabilities), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return videoRecordEventStartGenerate;
    }

    public static <T, S> VideoRecordEventStart<T> generate(Callable<S> callable, dumpVideoCapabilities<S, getRecordingStats<T>> dumpvideocapabilities, logToString<? super S> logtostring) {
        int i = 2 % 2;
        share.b(dumpvideocapabilities, "generator is null");
        VideoRecordEventStart<T> videoRecordEventStartGenerate = generate(callable, new AudioStreamImplExternalSyntheticLambda0.cancelAll(dumpvideocapabilities), logtostring);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return videoRecordEventStartGenerate;
    }

    public static <T, S> VideoRecordEventStart<T> generate(Callable<S> callable, dumpCodecCapabilities<S, getRecordingStats<T>, S> dumpcodeccapabilities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartGenerate = generate(callable, dumpcodeccapabilities, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartGenerate;
    }

    public static <T, S> VideoRecordEventStart<T> generate(Callable<S> callable, dumpCodecCapabilities<S, getRecordingStats<T>, S> dumpcodeccapabilities, logToString<? super S> logtostring) {
        int i = 2 % 2;
        share.b(callable, "initialState is null");
        share.b(dumpcodeccapabilities, "generator is null");
        share.b(logtostring, "disposeState is null");
        checkNotReleasedOrThrow checknotreleasedorthrow = new checkNotReleasedOrThrow(callable, dumpcodeccapabilities, logtostring);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return checknotreleasedorthrow;
        }
        throw null;
    }

    public static VideoRecordEventStart<Long> interval(long j, long j2, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<Long> videoRecordEventStartInterval = interval(j, j2, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartInterval;
    }

    public static VideoRecordEventStart<Long> interval(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableInterval observableInterval = new ObservableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableInterval;
    }

    public static VideoRecordEventStart<Long> interval(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<Long> videoRecordEventStartInterval = interval(j, j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartInterval;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VideoRecordEventStart<Long> interval(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<Long> videoRecordEventStartInterval = interval(j, j, timeUnit, appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartInterval;
        }
        throw null;
    }

    public static VideoRecordEventStart<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<Long> videoRecordEventStartIntervalRange = intervalRange(j, j2, j3, j4, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartIntervalRange;
        }
        throw null;
    }

    public static VideoRecordEventStart<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        if (j2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j2)));
        }
        Object obj = null;
        if (j2 == 0) {
            int i5 = i3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 != 0) {
                empty().delay(j3, timeUnit, appendbackupvideoprofile);
                throw null;
            }
            VideoRecordEventStart<Long> videoRecordEventStartDelay = empty().delay(j3, timeUnit, appendbackupvideoprofile);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return videoRecordEventStartDelay;
        }
        long j5 = (j2 - 1) + j;
        if (j > 0 && j5 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableIntervalRange observableIntervalRange = new ObservableIntervalRange(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, appendbackupvideoprofile);
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        if (i8 % 2 == 0) {
            return observableIntervalRange;
        }
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> just(T t) {
        int i = 2 % 2;
        share.b(t, "item is null");
        AudioStreamImplAudioRecordingApi29Callback audioStreamImplAudioRecordingApi29Callback = new AudioStreamImplAudioRecordingApi29Callback(t);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return audioStreamImplAudioRecordingApi29Callback;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return videoRecordEventStartFromArray;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(t, "item1 is null");
            share.b(t2, "item2 is null");
            share.b(t3, "item3 is null");
            return fromArray(t, t2, t3);
        }
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        Object[] objArr = new Object[4];
        objArr[1] = t;
        objArr[0] = t2;
        objArr[4] = t3;
        return fromArray(objArr);
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return videoRecordEventStartFromArray;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4, T t5) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        share.b(t5, "item5 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4, t5);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return videoRecordEventStartFromArray;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        share.b(t5, "item5 is null");
        share.b(t6, "item6 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4, t5, t6);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFromArray;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        share.b(t5, "item5 is null");
        share.b(t6, "item6 is null");
        share.b(t7, "item7 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4, t5, t6, t7);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartFromArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        share.b(t5, "item5 is null");
        share.b(t6, "item6 is null");
        share.b(t7, "item7 is null");
        share.b(t8, "item8 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4, t5, t6, t7, t8);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFromArray;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        share.b(t5, "item5 is null");
        share.b(t6, "item6 is null");
        share.b(t7, "item7 is null");
        share.b(t8, "item8 is null");
        share.b(t9, "item9 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartFromArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item1 is null");
        share.b(t2, "item2 is null");
        share.b(t3, "item3 is null");
        share.b(t4, "item4 is null");
        share.b(t5, "item5 is null");
        share.b(t6, "item6 is null");
        share.b(t7, "item7 is null");
        share.b(t8, "item8 is null");
        share.b(t9, "item9 is null");
        share.b(t10, "item10 is null");
        VideoRecordEventStart<T> videoRecordEventStartFromArray = fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartFromArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> merge(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromIterable(iterable).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, i, i2);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeArray(int i, int i2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, i, i2);
    }

    public static <T> VideoRecordEventStart<T> merge(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromIterable(iterable).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartFlatMap;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> merge(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart videoRecordEventStartFromIterable = fromIterable(iterable);
        if (i4 != 0) {
            videoRecordEventStartFromIterable.flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i);
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = videoRecordEventStartFromIterable.flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return videoRecordEventStartFlatMap;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> merge(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        ObservableFlatMap observableFlatMap = new ObservableFlatMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, Integer.MAX_VALUE, bufferSize());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableFlatMap;
    }

    public static <T> VideoRecordEventStart<T> merge(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "maxConcurrency");
        ObservableFlatMap observableFlatMap = new ObservableFlatMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, i, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return observableFlatMap;
    }

    public static <T> VideoRecordEventStart<T> merge(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        VideoRecordEventStart videoRecordEventStartFromArray;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            i = 3;
            AutoValue_VideoValidatedEncoderProfilesProxy[] autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[3];
            autoValue_VideoValidatedEncoderProfilesProxyArr[0] = autoValue_VideoValidatedEncoderProfilesProxy;
            autoValue_VideoValidatedEncoderProfilesProxyArr[1] = autoValue_VideoValidatedEncoderProfilesProxy2;
            videoRecordEventStartFromArray = fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr);
        } else {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            videoRecordEventStartFromArray = fromArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
        }
        return videoRecordEventStartFromArray.flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, i);
    }

    public static <T> VideoRecordEventStart<T> merge(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy3) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, 3);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> merge(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, 4);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeArray(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart videoRecordEventStartFromArray = fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr);
        if (i3 != 0) {
            return videoRecordEventStartFromArray.flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), autoValue_VideoValidatedEncoderProfilesProxyArr.length);
        }
        videoRecordEventStartFromArray.flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), autoValue_VideoValidatedEncoderProfilesProxyArr.length);
        throw null;
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromIterable(iterable).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, int i, int i2) {
        readableMs readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart videoRecordEventStartFromIterable = fromIterable(iterable);
        if (i5 != 0) {
            readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            z = false;
        } else {
            readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            z = true;
        }
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = videoRecordEventStartFromIterable.flatMap(readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2, z, i, i2);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeArrayDelayError(int i, int i2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, i, i2);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return fromIterable(iterable).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, i);
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        ObservableFlatMap observableFlatMap = new ObservableFlatMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, Integer.MAX_VALUE, bufferSize());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "maxConcurrency");
        ObservableFlatMap observableFlatMap = new ObservableFlatMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, i, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return observableFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        VideoRecordEventStart videoRecordEventStartFromArray;
        readableMs readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            AutoValue_VideoValidatedEncoderProfilesProxy[] autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[3];
            autoValue_VideoValidatedEncoderProfilesProxyArr[1] = autoValue_VideoValidatedEncoderProfilesProxy;
            autoValue_VideoValidatedEncoderProfilesProxyArr[0] = autoValue_VideoValidatedEncoderProfilesProxy2;
            videoRecordEventStartFromArray = fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr);
            readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            i = 5;
        } else {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            videoRecordEventStartFromArray = fromArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
            readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        return videoRecordEventStartFromArray.flatMap(readablemsTuitionPaymentFragmentspecialinlinedviewModeldefault2, true, i);
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy3) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, 3);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> mergeDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy4) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromArray(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, 4);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartFlatMap;
        }
        throw null;
    }

    public static <T> VideoRecordEventStart<T> mergeArrayDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartFlatMap = fromArray(autoValue_VideoValidatedEncoderProfilesProxyArr).flatMap(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, autoValue_VideoValidatedEncoderProfilesProxyArr.length);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return videoRecordEventStartFlatMap;
    }

    public static <T> VideoRecordEventStart<T> never() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStart = (VideoRecordEventStart<T>) frameCountToSize.TuitionPaymentFragmentbindingInflater1;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return videoRecordEventStart;
    }

    public static VideoRecordEventStart<Integer> range(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(i2)));
        }
        int i6 = i5 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        if (i2 == 0) {
            int i8 = i5 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return empty();
        }
        if (i2 != 1) {
            if (((long) i) + ((long) (i2 - 1)) <= SieveCacheKt.NodeLinkMask) {
                return new ObservableRange(i, i2);
            }
            throw new IllegalArgumentException("Integer overflow");
        }
        int i10 = i5 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 == 0) {
            just(Integer.valueOf(i));
            throw null;
        }
        VideoRecordEventStart<Integer> videoRecordEventStartJust = just(Integer.valueOf(i));
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 66 / 0;
        }
        return videoRecordEventStartJust;
    }

    public static VideoRecordEventStart<Long> rangeLong(long j, long j2) {
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        if (i3 % 2 != 0 ? j2 < 0 : j2 < 1) {
            throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j2)));
        }
        int i5 = i4 + 37;
        int i6 = i5 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
        int i7 = i5 % 2;
        if (i == 0) {
            VideoRecordEventStart<Long> videoRecordEventStartEmpty = empty();
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            int i9 = i8 % 2;
            return videoRecordEventStartEmpty;
        }
        if (j2 == 1) {
            int i10 = i6 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            return just(Long.valueOf(j));
        }
        if (j > 0 && (j2 - 1) + j < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return new ObservableRangeLong(j, j2);
    }

    public static <T> deriveCodec<Boolean> sequenceEqual(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        deriveCodec<Boolean> derivecodecSequenceEqual;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            derivecodecSequenceEqual = sequenceEqual(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, share.b(), bufferSize());
            int i3 = 31 / 0;
        } else {
            derivecodecSequenceEqual = sequenceEqual(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, share.b(), bufferSize());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return derivecodecSequenceEqual;
    }

    public static <T> deriveCodec<Boolean> sequenceEqual(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        deriveCodec<Boolean> derivecodecSequenceEqual = sequenceEqual(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, dumpencodercapabilities, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return derivecodecSequenceEqual;
    }

    public static <T> deriveCodec<Boolean> sequenceEqual(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(dumpencodercapabilities, "isEqual is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableSequenceEqualSingle observableSequenceEqualSingle = new ObservableSequenceEqualSingle(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, dumpencodercapabilities, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return observableSequenceEqualSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> deriveCodec<Boolean> sequenceEqual(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        deriveCodec<Boolean> derivecodecSequenceEqual = sequenceEqual(autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, share.b(), i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return derivecodecSequenceEqual;
    }

    public static <T> VideoRecordEventStart<T> switchOnNext(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableSwitchMap observableSwitchMap = new ObservableSwitchMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, false);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return observableSwitchMap;
    }

    public static <T> VideoRecordEventStart<T> switchOnNext(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartSwitchOnNext = switchOnNext(autoValue_VideoValidatedEncoderProfilesProxy, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return videoRecordEventStartSwitchOnNext;
    }

    public static <T> VideoRecordEventStart<T> switchOnNextDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartSwitchOnNextDelayError = switchOnNextDelayError(autoValue_VideoValidatedEncoderProfilesProxy, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartSwitchOnNextDelayError;
    }

    public static <T> VideoRecordEventStart<T> switchOnNextDelayError(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        ObservableSwitchMap observableSwitchMap = new ObservableSwitchMap(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), i, true);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return observableSwitchMap;
    }

    public static VideoRecordEventStart<Long> timer(long j, TimeUnit timeUnit) {
        VideoRecordEventStart<Long> videoRecordEventStartTimer;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            videoRecordEventStartTimer = timer(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            int i3 = 4 / 0;
        } else {
            videoRecordEventStartTimer = timer(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartTimer;
        }
        throw null;
    }

    public static VideoRecordEventStart<Long> timer(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableTimer observableTimer = new ObservableTimer(Math.max(j, 0L), timeUnit, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableTimer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T> VideoRecordEventStart<T> unsafeCreate(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "onSubscribe is null");
            boolean z = autoValue_VideoValidatedEncoderProfilesProxy instanceof VideoRecordEventStart;
            throw null;
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "onSubscribe is null");
        if (autoValue_VideoValidatedEncoderProfilesProxy instanceof VideoRecordEventStart) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        generatePresentationTimeNs generatepresentationtimens = new generatePresentationTimeNs(autoValue_VideoValidatedEncoderProfilesProxy);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return generatepresentationtimens;
        }
        throw null;
    }

    public static <T, D> VideoRecordEventStart<T> using(Callable<? extends D> callable, readableMs<? super D, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> readablems, logToString<? super D> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return using(callable, readablems, logtostring, true);
    }

    public static <T, D> VideoRecordEventStart<T> using(Callable<? extends D> callable, readableMs<? super D, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> readablems, logToString<? super D> logtostring, boolean z) {
        int i = 2 % 2;
        share.b(callable, "resourceSupplier is null");
        share.b(readablems, "sourceSupplier is null");
        share.b(logtostring, "disposer is null");
        ObservableUsing observableUsing = new ObservableUsing(callable, readablems, logtostring, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return observableUsing;
    }

    public static <T> VideoRecordEventStart<T> wrap(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source is null");
        if (!(autoValue_VideoValidatedEncoderProfilesProxy instanceof VideoRecordEventStart)) {
            return new generatePresentationTimeNs(autoValue_VideoValidatedEncoderProfilesProxy);
        }
        VideoRecordEventStart<T> videoRecordEventStart = (VideoRecordEventStart) autoValue_VideoValidatedEncoderProfilesProxy;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStart;
    }

    public static <T, R> VideoRecordEventStart<R> zip(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems) {
        int i = 2 % 2;
        share.b(readablems, "zipper is null");
        share.b(iterable, "sources is null");
        ObservableZip observableZip = new ObservableZip(null, iterable, readablems, bufferSize(), false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return observableZip;
    }

    public static <T, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super Object[], ? extends R> readablems) {
        int i = 2 % 2;
        share.b(readablems, "zipper is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sources is null");
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = new BufferedAudioStreamAudioData(autoValue_VideoValidatedEncoderProfilesProxy).flatMap(new AudioStreamImplExternalSyntheticLambda0.onTransact(readablems));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return videoRecordEventStartFlatMap;
    }

    public static <T1, T2, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities) {
        VideoRecordEventStart<R> videoRecordEventStartZipArray;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            readableMs readablemsB = Functions.b(dumpcodeccapabilities);
            int iBufferSize = bufferSize();
            AutoValue_VideoValidatedEncoderProfilesProxy[] autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[3];
            autoValue_VideoValidatedEncoderProfilesProxyArr[1] = autoValue_VideoValidatedEncoderProfilesProxy;
            autoValue_VideoValidatedEncoderProfilesProxyArr[1] = autoValue_VideoValidatedEncoderProfilesProxy2;
            videoRecordEventStartZipArray = zipArray(readablemsB, true, iBufferSize, autoValue_VideoValidatedEncoderProfilesProxyArr);
        } else {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            videoRecordEventStartZipArray = zipArray(Functions.b(dumpcodeccapabilities), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoRecordEventStartZipArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T1, T2, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.b(dumpcodeccapabilities), z, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartZipArray;
        }
        throw null;
    }

    public static <T1, T2, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
            return zipArray(Functions.b(dumpcodeccapabilities), z, i, autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2);
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        readableMs readablemsB = Functions.b(dumpcodeccapabilities);
        AutoValue_VideoValidatedEncoderProfilesProxy[] autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[4];
        autoValue_VideoValidatedEncoderProfilesProxyArr[0] = autoValue_VideoValidatedEncoderProfilesProxy;
        autoValue_VideoValidatedEncoderProfilesProxyArr[0] = autoValue_VideoValidatedEncoderProfilesProxy2;
        return zipArray(readablemsB, z, i, autoValue_VideoValidatedEncoderProfilesProxyArr);
    }

    public static <T1, T2, T3, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, stringToLog<? super T1, ? super T2, ? super T3, ? extends R> stringtolog) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((stringToLog) stringtolog), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartZipArray;
    }

    public static <T1, T2, T3, T4, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, exploreProfiles<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> exploreprofiles) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.TuitionPaymentFragmentbindingInflater1((exploreProfiles) exploreprofiles), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartZipArray;
    }

    public static <T1, T2, T3, T4, T5, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, QualityExploredEncoderProfilesProvider<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> qualityExploredEncoderProfilesProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.b(qualityExploredEncoderProfilesProvider), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return videoRecordEventStartZipArray;
    }

    public static <T1, T2, T3, T4, T5, T6, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, filterUnmatchedDynamicRange<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> filterunmatcheddynamicrange) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.TuitionPaymentFragmentbindingInflater1((filterUnmatchedDynamicRange) filterunmatcheddynamicrange), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartZipArray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T7> autoValue_VideoValidatedEncoderProfilesProxy7, DynamicRangeMatchedEncoderProfilesProvider<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> dynamicRangeMatchedEncoderProfilesProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy7, "source7 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1((DynamicRangeMatchedEncoderProfilesProvider) dynamicRangeMatchedEncoderProfilesProvider), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6, autoValue_VideoValidatedEncoderProfilesProxy7);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartZipArray;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T7> autoValue_VideoValidatedEncoderProfilesProxy7, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T8> autoValue_VideoValidatedEncoderProfilesProxy8, checkFullySpecifiedOrThrow<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> checkfullyspecifiedorthrow) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy7, "source7 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy8, "source8 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkfullyspecifiedorthrow), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6, autoValue_VideoValidatedEncoderProfilesProxy7, autoValue_VideoValidatedEncoderProfilesProxy8);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartZipArray;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> VideoRecordEventStart<R> zip(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T4> autoValue_VideoValidatedEncoderProfilesProxy4, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T5> autoValue_VideoValidatedEncoderProfilesProxy5, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T6> autoValue_VideoValidatedEncoderProfilesProxy6, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T7> autoValue_VideoValidatedEncoderProfilesProxy7, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T8> autoValue_VideoValidatedEncoderProfilesProxy8, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T9> autoValue_VideoValidatedEncoderProfilesProxy9, hasMatchedVideoProfileForAllTargetDynamicRanges<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> hasmatchedvideoprofileforalltargetdynamicranges) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "source1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "source2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "source3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "source4 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy5, "source5 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy6, "source6 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy7, "source7 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy8, "source8 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy9, "source9 is null");
        VideoRecordEventStart<R> videoRecordEventStartZipArray = zipArray(Functions.TuitionPaymentFragmentbindingInflater1((hasMatchedVideoProfileForAllTargetDynamicRanges) hasmatchedvideoprofileforalltargetdynamicranges), false, bufferSize(), autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4, autoValue_VideoValidatedEncoderProfilesProxy5, autoValue_VideoValidatedEncoderProfilesProxy6, autoValue_VideoValidatedEncoderProfilesProxy7, autoValue_VideoValidatedEncoderProfilesProxy8, autoValue_VideoValidatedEncoderProfilesProxy9);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartZipArray;
    }

    public static <T, R> VideoRecordEventStart<R> zipArray(readableMs<? super Object[], ? extends R> readablems, boolean z, int i, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>... autoValue_VideoValidatedEncoderProfilesProxyArr) {
        int i2 = 2 % 2;
        if (autoValue_VideoValidatedEncoderProfilesProxyArr.length != 0) {
            share.b(readablems, "zipper is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
            return new ObservableZip(autoValue_VideoValidatedEncoderProfilesProxyArr, null, readablems, i, z);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartEmpty = empty();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return videoRecordEventStartEmpty;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static <T, R> VideoRecordEventStart<R> zipIterable(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems, boolean z, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "zipper is null");
        share.b(iterable, "sources is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableZip observableZip = new ObservableZip(null, iterable, readablems, i, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableZip;
        }
        throw null;
    }

    public final deriveCodec<Boolean> all(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "predicate is null");
        setAudioSourceCallback setaudiosourcecallback = new setAudioSourceCallback(this, findqualityintargetqualities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return setaudiosourcecallback;
    }

    public final VideoRecordEventStart<T> ambWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartAmbArray = ambArray(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartAmbArray;
    }

    public final deriveCodec<Boolean> any(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "predicate is null");
        AudioSourceExternalSyntheticLambda11 audioSourceExternalSyntheticLambda11 = new AudioSourceExternalSyntheticLambda11(this, findqualityintargetqualities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return audioSourceExternalSyntheticLambda11;
        }
        throw null;
    }

    public final <R> R as(VideoCaptureConfig<T, ? extends R> videoCaptureConfig) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        R r = (R) ((VideoCaptureConfig) share.b(videoCaptureConfig, "converter is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return r;
    }

    public final T blockingFirst() {
        int i = 2 % 2;
        fetchBufferProviderState fetchbufferproviderstate = new fetchBufferProviderState();
        subscribe(fetchbufferproviderstate);
        T tTuitionPaymentFragmentbindingInflater1 = fetchbufferproviderstate.TuitionPaymentFragmentbindingInflater1();
        if (tTuitionPaymentFragmentbindingInflater1 == null) {
            throw new NoSuchElementException();
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return tTuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final T blockingFirst(T t) {
        int i = 2 % 2;
        fetchBufferProviderState fetchbufferproviderstate = new fetchBufferProviderState();
        subscribe(fetchbufferproviderstate);
        T tTuitionPaymentFragmentbindingInflater1 = fetchbufferproviderstate.TuitionPaymentFragmentbindingInflater1();
        if (tTuitionPaymentFragmentbindingInflater1 == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return t;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return tTuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void blockingForEach(logToString<? super T> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            blockingIterable().iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            try {
                logtostring.accept(it.next());
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                ((BufferProviderState) it).dispose();
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Iterable<T> iterableBlockingIterable = blockingIterable(bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return iterableBlockingIterable;
    }

    public final Iterable<T> blockingIterable(int i) {
        int i2 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        BlockingObservableIterable blockingObservableIterable = new BlockingObservableIterable(this, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return blockingObservableIterable;
    }

    public final T blockingLast() {
        int i = 2 % 2;
        lambdanotifyError8 lambdanotifyerror8 = new lambdanotifyError8();
        subscribe(lambdanotifyerror8);
        T tTuitionPaymentFragmentbindingInflater1 = lambdanotifyerror8.TuitionPaymentFragmentbindingInflater1();
        if (tTuitionPaymentFragmentbindingInflater1 == null) {
            throw new NoSuchElementException();
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return tTuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final T blockingLast(T t) {
        int i = 2 % 2;
        lambdanotifyError8 lambdanotifyerror8 = new lambdanotifyError8();
        subscribe(lambdanotifyerror8);
        T tTuitionPaymentFragmentbindingInflater1 = lambdanotifyerror8.TuitionPaymentFragmentbindingInflater1();
        Object obj = null;
        if (tTuitionPaymentFragmentbindingInflater1 == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                return t;
            }
            throw null;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return tTuitionPaymentFragmentbindingInflater1;
        }
        obj.hashCode();
        throw null;
    }

    public final Iterable<T> blockingLatest() {
        int i = 2 % 2;
        lambdastop3androidxcameravideointernalaudioAudioSource lambdastop3androidxcameravideointernalaudioaudiosource = new lambdastop3androidxcameravideointernalaudioAudioSource(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return lambdastop3androidxcameravideointernalaudioaudiosource;
    }

    public final Iterable<T> blockingMostRecent(T t) {
        int i = 2 % 2;
        retryStartAudioStream retrystartaudiostream = new retryStartAudioStream(this, t);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return retrystartaudiostream;
    }

    public final Iterable<T> blockingNext() {
        int i = 2 % 2;
        setBufferProvider setbufferprovider = new setBufferProvider(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return setbufferprovider;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final T blockingSingle() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            singleElement().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        T tTuitionPaymentFragmentspecialinlinedviewModeldefault1 = singleElement().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (tTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            throw new NoSuchElementException();
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return tTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final T blockingSingle(T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        T tB = single(t).b();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return tB;
    }

    public final Future<T> toFuture() {
        int i = 2 % 2;
        Future<T> future = (Future) subscribeWith(new lambdanotifySilenced9());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return future;
    }

    public final void blockingSubscribe() {
        int i = 2 % 2;
        isVivo1820 isvivo1820 = new isVivo1820();
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), isvivo1820, isvivo1820, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        subscribe(lambdaObserver);
        if (isvivo1820.getCount() != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    isvivo1820.await();
                    int i3 = 59 / 0;
                } else {
                    isvivo1820.await();
                }
            } catch (InterruptedException e2) {
                lambdaObserver.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e2);
            }
        }
        Throwable th = isvivo1820.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (th != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            }
            ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
            throw null;
        }
    }

    public final void blockingSubscribe(logToString<? super T> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            AudioSourceExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, logtostring, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Functions.TuitionPaymentFragmentbindingInflater1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AudioSourceExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, logtostring, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Functions.TuitionPaymentFragmentbindingInflater1);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
    }

    public final void blockingSubscribe(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            AudioSourceExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, logtostring, logtostring2, Functions.TuitionPaymentFragmentbindingInflater1);
            int i3 = 39 / 0;
        } else {
            AudioSourceExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, logtostring, logtostring2, Functions.TuitionPaymentFragmentbindingInflater1);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void blockingSubscribe(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        AudioSourceExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, logtostring, logtostring2, formatinterval);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void blockingSubscribe(deriveMediaType<? super T> derivemediatype) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        AudioSourceExternalSyntheticLambda10.b(this, derivemediatype);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final VideoRecordEventStart<List<T>> buffer(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<List<T>> videoRecordEventStartBuffer = buffer(i, i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return videoRecordEventStartBuffer;
    }

    public final VideoRecordEventStart<List<T>> buffer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<List<T>> videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(i, i2, ArrayListSupplier.b());
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return videoRecordEventStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U extends Collection<? super T>> VideoRecordEventStart<U> buffer(int i, int i2, Callable<U> callable) {
        int i3 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "count");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, "skip");
        share.b(callable, "bufferSupplier is null");
        ObservableBuffer observableBuffer = new ObservableBuffer(this, i, i2, callable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return observableBuffer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U extends Collection<? super T>> VideoRecordEventStart<U> buffer(int i, Callable<U> callable) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return buffer(i, i, callable);
        }
        buffer(i, i, callable);
        throw null;
    }

    public final VideoRecordEventStart<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        VideoRecordEventStart<List<T>> videoRecordEventStart;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(j, j2, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArrayListSupplier.b());
            int i3 = 87 / 0;
        } else {
            videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(j, j2, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArrayListSupplier.b());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return videoRecordEventStart;
    }

    public final VideoRecordEventStart<List<T>> buffer(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (VideoRecordEventStart<List<T>>) buffer(j, j2, timeUnit, appendbackupvideoprofile, ArrayListSupplier.b());
        }
        buffer(j, j2, timeUnit, appendbackupvideoprofile, ArrayListSupplier.b());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U extends Collection<? super T>> VideoRecordEventStart<U> buffer(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, Callable<U> callable) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.b(callable, "bufferSupplier is null");
        AudioSourceExternalSyntheticLambda0 audioSourceExternalSyntheticLambda0 = new AudioSourceExternalSyntheticLambda0(this, j, j2, timeUnit, appendbackupvideoprofile, callable, Integer.MAX_VALUE, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return audioSourceExternalSyntheticLambda0;
        }
        throw null;
    }

    public final VideoRecordEventStart<List<T>> buffer(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            buffer(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Integer.MAX_VALUE);
            throw null;
        }
        VideoRecordEventStart<List<T>> videoRecordEventStartBuffer = buffer(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Integer.MAX_VALUE);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return videoRecordEventStartBuffer;
    }

    public final VideoRecordEventStart<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return buffer(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i);
        }
        buffer(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i);
        throw null;
    }

    public final VideoRecordEventStart<List<T>> buffer(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        return i3 % 2 != 0 ? (VideoRecordEventStart<List<T>>) buffer(j, timeUnit, appendbackupvideoprofile, i, ArrayListSupplier.b(), true) : (VideoRecordEventStart<List<T>>) buffer(j, timeUnit, appendbackupvideoprofile, i, ArrayListSupplier.b(), false);
    }

    public final <U extends Collection<? super T>> VideoRecordEventStart<U> buffer(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i, Callable<U> callable, boolean z) {
        int i2 = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.b(callable, "bufferSupplier is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "count");
        AudioSourceExternalSyntheticLambda0 audioSourceExternalSyntheticLambda0 = new AudioSourceExternalSyntheticLambda0(this, j, j, timeUnit, appendbackupvideoprofile, callable, i, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return audioSourceExternalSyntheticLambda0;
        }
        throw null;
    }

    public final VideoRecordEventStart<List<T>> buffer(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<List<T>> videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(j, timeUnit, appendbackupvideoprofile, Integer.MAX_VALUE, ArrayListSupplier.b(), false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStart;
    }

    public final <TOpening, TClosing> VideoRecordEventStart<List<T>> buffer(AutoValue_VideoValidatedEncoderProfilesProxy<? extends TOpening> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super TOpening, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends TClosing>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<List<T>> videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(autoValue_VideoValidatedEncoderProfilesProxy, readablems, ArrayListSupplier.b());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStart;
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> VideoRecordEventStart<U> buffer(AutoValue_VideoValidatedEncoderProfilesProxy<? extends TOpening> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super TOpening, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends TClosing>> readablems, Callable<U> callable) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "openingIndicator is null");
        share.b(readablems, "closingIndicator is null");
        share.b(callable, "bufferSupplier is null");
        ObservableBufferBoundary observableBufferBoundary = new ObservableBufferBoundary(this, autoValue_VideoValidatedEncoderProfilesProxy, readablems, callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableBufferBoundary;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <B> VideoRecordEventStart<List<T>> buffer(AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<List<T>> videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(autoValue_VideoValidatedEncoderProfilesProxy, ArrayListSupplier.b());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStart;
        }
        throw null;
    }

    public final <B> VideoRecordEventStart<List<T>> buffer(AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "initialCapacity");
            return (VideoRecordEventStart<List<T>>) buffer(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i));
        }
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "initialCapacity");
        buffer(autoValue_VideoValidatedEncoderProfilesProxy, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i));
        throw null;
    }

    public final <B, U extends Collection<? super T>> VideoRecordEventStart<U> buffer(AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy, Callable<U> callable) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "boundary is null");
        share.b(callable, "bufferSupplier is null");
        AudioSourceExternalSyntheticLambda1 audioSourceExternalSyntheticLambda1 = new AudioSourceExternalSyntheticLambda1(this, autoValue_VideoValidatedEncoderProfilesProxy, callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return audioSourceExternalSyntheticLambda1;
    }

    public final <B> VideoRecordEventStart<List<T>> buffer(Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            buffer(callable, ArrayListSupplier.b());
            throw null;
        }
        VideoRecordEventStart<List<T>> videoRecordEventStart = (VideoRecordEventStart<List<T>>) buffer(callable, ArrayListSupplier.b());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStart;
    }

    public final <B, U extends Collection<? super T>> VideoRecordEventStart<U> buffer(Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable, Callable<U> callable2) {
        int i = 2 % 2;
        share.b(callable, "boundarySupplier is null");
        share.b(callable2, "bufferSupplier is null");
        updateSendingAudio updatesendingaudio = new updateSendingAudio(this, callable, callable2);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return updatesendingaudio;
    }

    public final VideoRecordEventStart<T> cache() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return cacheWithInitialCapacity(i2 % 2 != 0 ? 104 : 16);
    }

    public final VideoRecordEventStart<T> cacheWithInitialCapacity(int i) {
        int i2 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "initialCapacity");
        ObservableCache observableCache = new ObservableCache(this, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return observableCache;
    }

    public final <U> VideoRecordEventStart<U> cast(Class<U> cls) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(cls, "clazz is null");
            return (VideoRecordEventStart<U>) map(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Class) cls));
        }
        share.b(cls, "clazz is null");
        map(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Class) cls));
        throw null;
    }

    public final <U> deriveCodec<U> collect(Callable<? extends U> callable, dumpVideoCapabilities<? super U, ? super T> dumpvideocapabilities) {
        int i = 2 % 2;
        share.b(callable, "initialValueSupplier is null");
        share.b(dumpvideocapabilities, "collector is null");
        AudioSourceExternalSyntheticLambda12 audioSourceExternalSyntheticLambda12 = new AudioSourceExternalSyntheticLambda12(this, callable, dumpvideocapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceExternalSyntheticLambda12;
    }

    public final <U> deriveCodec<U> collectInto(U u, dumpVideoCapabilities<? super U, ? super T> dumpvideocapabilities) {
        deriveCodec<U> derivecodecCollect;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(u, "initialValue is null");
            derivecodecCollect = collect(Functions.TuitionPaymentFragmentbindingInflater1(u), dumpvideocapabilities);
            int i3 = 19 / 0;
        } else {
            share.b(u, "initialValue is null");
            derivecodecCollect = collect(Functions.TuitionPaymentFragmentbindingInflater1(u), dumpvideocapabilities);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return derivecodecCollect;
    }

    public final <R> VideoRecordEventStart<R> compose(getVideoEncoderInfoFinder<? super T, ? extends R> getvideoencoderinfofinder) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartWrap = wrap(((getVideoEncoderInfoFinder) share.b(getvideoencoderinfofinder, "composer is null")).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWrap;
    }

    public final <R> VideoRecordEventStart<R> concatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return concatMap(readablems, i2 % 2 == 0 ? 3 : 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> VideoRecordEventStart<R> concatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i) {
        VideoRecordEventStart<R> videoRecordEventStartEmpty;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        if (!(this instanceof setAudioFormat)) {
            ObservableConcatMap observableConcatMap = new ObservableConcatMap(this, readablems, i, ErrorMode.IMMEDIATE);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return observableConcatMap;
        }
        Object objCall = ((setAudioFormat) this).call();
        if (objCall != null) {
            ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objCall, readablems);
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
        if (i9 % 2 != 0) {
            videoRecordEventStartEmpty = empty();
            int i10 = 78 / 0;
        } else {
            videoRecordEventStartEmpty = empty();
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        if (i11 % 2 != 0) {
            return videoRecordEventStartEmpty;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> concatMapDelayError(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return concatMapDelayError(readablems, bufferSize(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> VideoRecordEventStart<R> concatMapDelayError(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, boolean z) {
        ErrorMode errorMode;
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        if (!(this instanceof setAudioFormat)) {
            if (!(!z)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                errorMode = ErrorMode.END;
            } else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return new ObservableConcatMap(this, readablems, i, errorMode);
        }
        Object objCall = ((setAudioFormat) this).call();
        if (objCall != null) {
            return new ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objCall, readablems);
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return empty();
        }
        empty();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> concatMapEager(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return concatMapEager(readablems, Integer.MAX_VALUE, bufferSize());
        }
        concatMapEager(readablems, Integer.MAX_VALUE, bufferSize());
        throw null;
    }

    public final <R> VideoRecordEventStart<R> concatMapEager(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, int i2) {
        int i3 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "maxConcurrency");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, "prefetch");
        ObservableConcatMapEager observableConcatMapEager = new ObservableConcatMapEager(this, readablems, ErrorMode.IMMEDIATE, i, i2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return observableConcatMapEager;
    }

    public final <R> VideoRecordEventStart<R> concatMapEagerDelayError(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            concatMapEagerDelayError(readablems, Integer.MAX_VALUE, bufferSize(), z);
            throw null;
        }
        VideoRecordEventStart<R> videoRecordEventStartConcatMapEagerDelayError = concatMapEagerDelayError(readablems, Integer.MAX_VALUE, bufferSize(), z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartConcatMapEagerDelayError;
    }

    public final <R> VideoRecordEventStart<R> concatMapEagerDelayError(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, int i2, boolean z) {
        ErrorMode errorMode;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "maxConcurrency");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, "prefetch");
        if (z) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0) {
                ErrorMode errorMode2 = ErrorMode.END;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
        }
        return new ObservableConcatMapEager(this, readablems, errorMode, i, i2);
    }

    public final VideoEncoderSession1 concatMapCompletable(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderSession1 videoEncoderSession1ConcatMapCompletable = concatMapCompletable(readablems, 2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoEncoderSession1ConcatMapCompletable;
    }

    public final VideoEncoderSession1 concatMapCompletable(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "capacityHint");
        ObservableConcatMapCompletable observableConcatMapCompletable = new ObservableConcatMapCompletable(this, readablems, ErrorMode.IMMEDIATE, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableConcatMapCompletable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoEncoderSession1 concatMapCompletableDelayError(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        VideoEncoderSession1 videoEncoderSession1ConcatMapCompletableDelayError = i2 % 2 == 0 ? concatMapCompletableDelayError(readablems, true, 4) : concatMapCompletableDelayError(readablems, true, 2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return videoEncoderSession1ConcatMapCompletableDelayError;
    }

    public final VideoEncoderSession1 concatMapCompletableDelayError(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoEncoderSession1 videoEncoderSession1ConcatMapCompletableDelayError = concatMapCompletableDelayError(readablems, z, 2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return videoEncoderSession1ConcatMapCompletableDelayError;
    }

    public final VideoEncoderSession1 concatMapCompletableDelayError(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z, int i) {
        ErrorMode errorMode;
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        if (z) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return new ObservableConcatMapCompletable(this, readablems, errorMode, i);
    }

    public final <U> VideoRecordEventStart<U> concatMapIterable(readableMs<? super T, ? extends Iterable<? extends U>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        checkAudioRecordInitialStateOrReleaseAndThrow checkaudiorecordinitialstateorreleaseandthrow = new checkAudioRecordInitialStateOrReleaseAndThrow(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return checkaudiorecordinitialstateorreleaseandthrow;
        }
        throw null;
    }

    public final <U> VideoRecordEventStart<U> concatMapIterable(readableMs<? super T, ? extends Iterable<? extends U>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        VideoRecordEventStart<U> videoRecordEventStart = (VideoRecordEventStart<U>) concatMap(new AudioStreamImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(readablems), i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
        return videoRecordEventStart;
    }

    public final <R> VideoRecordEventStart<R> concatMapMaybe(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartConcatMapMaybe = concatMapMaybe(readablems, 2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatMapMaybe;
    }

    public final <R> VideoRecordEventStart<R> concatMapMaybe(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        ObservableConcatMapMaybe observableConcatMapMaybe = new ObservableConcatMapMaybe(this, readablems, ErrorMode.IMMEDIATE, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableConcatMapMaybe;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> concatMapMaybeDelayError(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        VideoRecordEventStart<R> videoRecordEventStartConcatMapMaybeDelayError = i2 % 2 == 0 ? concatMapMaybeDelayError(readablems, false, 5) : concatMapMaybeDelayError(readablems, true, 2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartConcatMapMaybeDelayError;
    }

    public final <R> VideoRecordEventStart<R> concatMapMaybeDelayError(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return concatMapMaybeDelayError(readablems, z, i2 % 2 != 0 ? 4 : 2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final <R> VideoRecordEventStart<R> concatMapMaybeDelayError(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z, int i) {
        int i2;
        ErrorMode errorMode;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            share.b(readablems, "mapper is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
            int i5 = 38 / 0;
            if (z) {
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    ErrorMode errorMode2 = ErrorMode.END;
                    throw null;
                }
                errorMode = ErrorMode.END;
            } else {
                errorMode = ErrorMode.BOUNDARY;
            }
        } else {
            share.b(readablems, "mapper is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
            if (z) {
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    ErrorMode errorMode3 = ErrorMode.END;
                    throw null;
                }
                errorMode = ErrorMode.END;
            } else {
                errorMode = ErrorMode.BOUNDARY;
            }
        }
        return new ObservableConcatMapMaybe(this, readablems, errorMode, i);
    }

    public final <R> VideoRecordEventStart<R> concatMapSingle(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return concatMapSingle(readablems, i2 % 2 != 0 ? 3 : 2);
    }

    public final <R> VideoRecordEventStart<R> concatMapSingle(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        ObservableConcatMapSingle observableConcatMapSingle = new ObservableConcatMapSingle(this, readablems, ErrorMode.IMMEDIATE, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return observableConcatMapSingle;
        }
        throw null;
    }

    public final <R> VideoRecordEventStart<R> concatMapSingleDelayError(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartConcatMapSingleDelayError = concatMapSingleDelayError(readablems, true, 2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartConcatMapSingleDelayError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> concatMapSingleDelayError(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartConcatMapSingleDelayError = concatMapSingleDelayError(readablems, z, 2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatMapSingleDelayError;
    }

    public final <R> VideoRecordEventStart<R> concatMapSingleDelayError(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, boolean z, int i) {
        ErrorMode errorMode;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            share.b(readablems, "mapper is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
            obj.hashCode();
            throw null;
        }
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "prefetch");
        if (z) {
            errorMode = ErrorMode.END;
        } else {
            errorMode = ErrorMode.BOUNDARY;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
        ObservableConcatMapSingle observableConcatMapSingle = new ObservableConcatMapSingle(this, readablems, errorMode, i);
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            return observableConcatMapSingle;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> concatWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartConcat = concat(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcat;
    }

    public final VideoRecordEventStart<T> concatWith(generateBackupProfile<? extends T> generatebackupprofile) {
        int i = 2 % 2;
        share.b(generatebackupprofile, "other is null");
        ObservableConcatWithSingle observableConcatWithSingle = new ObservableConcatWithSingle(this, generatebackupprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableConcatWithSingle;
    }

    public final VideoRecordEventStart<T> concatWith(VideoSpecBuilder<? extends T> videoSpecBuilder) {
        int i = 2 % 2;
        share.b(videoSpecBuilder, "other is null");
        ObservableConcatWithMaybe observableConcatWithMaybe = new ObservableConcatWithMaybe(this, videoSpecBuilder);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableConcatWithMaybe;
    }

    public final VideoRecordEventStart<T> concatWith(VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
        int i = 2 % 2;
        share.b(videoEncoderSessionExternalSyntheticLambda6, "other is null");
        ObservableConcatWithCompletable observableConcatWithCompletable = new ObservableConcatWithCompletable(this, videoEncoderSessionExternalSyntheticLambda6);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return observableConcatWithCompletable;
    }

    public final deriveCodec<Boolean> contains(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(obj, "element is null");
            return any(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj));
        }
        share.b(obj, "element is null");
        any(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj));
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final deriveCodec<Long> count() {
        int i = 2 % 2;
        AudioSourceExternalSyntheticLambda5 audioSourceExternalSyntheticLambda5 = new AudioSourceExternalSyntheticLambda5(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return audioSourceExternalSyntheticLambda5;
    }

    public final <U> VideoRecordEventStart<T> debounce(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "debounceSelector is null");
        AudioSourceExternalSyntheticLambda3 audioSourceExternalSyntheticLambda3 = new AudioSourceExternalSyntheticLambda3(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceExternalSyntheticLambda3;
    }

    public final VideoRecordEventStart<T> debounce(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDebounce = debounce(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartDebounce;
    }

    public final VideoRecordEventStart<T> debounce(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableDebounceTimed observableDebounceTimed = new ObservableDebounceTimed(this, j, timeUnit, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableDebounceTimed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> defaultIfEmpty(T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "defaultItem is null");
        VideoRecordEventStart<T> videoRecordEventStartSwitchIfEmpty = switchIfEmpty(just(t));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartSwitchIfEmpty;
    }

    public final <U> VideoRecordEventStart<T> delay(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "itemDelay is null");
        VideoRecordEventStart<T> videoRecordEventStart = (VideoRecordEventStart<T>) flatMap(new AudioStreamImplExternalSyntheticLambda0.g(readablems));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return videoRecordEventStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r14v20, types: [boolean, int] */
    public final VideoRecordEventStart<T> delay(long j, TimeUnit timeUnit) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            c((byte) (-bArr[26]), bArr[36], bArr[24], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iIndexOf, offsetAfter, -1199417970, false, (String) objArr3[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, KeyEvent.normalizeMetaState(0) + 57973, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, 4447 - (Process.myTid() >> 22), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) Color.blue(0);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
            int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            byte[] bArr2 = $$d;
            Object[] objArr6 = new Object[1];
            c(bArr2[24], (byte) (-bArr2[31]), (short) (-bArr2[26]), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, packedPositionChild, i4, 254769921, false, (String) objArr6[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                int i6 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                byte[] bArr3 = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr3[146], bArr3[36], (short) (-bArr3[26]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, i5, i6, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i7 = ~System.identityHashCode(this);
            int i8 = 435750112 + (((-436740393) | i7) * 494) + (((~(i7 | (-464003498))) | 94836439) * 494) + 199538801;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{55349, 14695, 6811, 31797, 23829, 48782, 36904, 61790, 54000, 13392, 5494, 30453, 18432, 43438, 35556, 60421}, 57689 - ((Process.getThreadPriority(0) + 20) >> 6), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{55350, 14574, 6544, 31310, 23423, 48159, 40149, 65013, 57023, 16195, 4222, 28944, 20960, 45793, 37789, 62529}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57558, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr11 = {Integer.valueOf(iIntValue), 199538801};
                byte[] bArr4 = $$j;
                byte b = bArr4[16];
                Object[] objArr12 = new Object[1];
                f(b, bArr4[222], b, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                f(bArr4[222], bArr4[16], (byte) (-bArr4[272]), objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                    int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr5 = $$d;
                    Object[] objArr15 = new Object[1];
                    c(bArr5[146], bArr5[36], (short) (-bArr5[26]), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, threadPriority, iIndexOf2, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - ((Process.getThreadPriority(0) + 20) >> 6), objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (ViewConfiguration.getEdgeSlop() >> 16) + 4447, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iIndexOf3 = 876 - TextUtils.indexOf("", "", 0, 0);
                        int iResolveSize = 10 - View.resolveSize(0, 0);
                        byte[] bArr6 = $$d;
                        Object[] objArr18 = new Object[1];
                        c(bArr6[24], (byte) (-bArr6[31]), (short) (-bArr6[26]), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf3, iResolveSize, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iGreen = Color.green(0) + 876;
                        int mirror = ':' - AndroidCharacter.getMirror('0');
                        byte[] bArr7 = $$d;
                        Object[] objArr19 = new Object[1];
                        c((byte) (-bArr7[26]), bArr7[36], bArr7[24], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iGreen, mirror, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = i17 + (((~((-542114049) | iIdentityHashCode)) | (-1073687518)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 70646346 + ((~((~iIdentityHashCode) | (-542114049))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[1])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i21 = i14 - 1;
            iArr[i21] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i21) % 2) - 1], 1).show();
            int i22 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = i22 + (-110414582) + (((~((~iIdentityHashCode2) | 735096787)) | 2691116) * 529) + (((~(iIdentityHashCode2 | 735096787)) | 694786558) * 529);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
        }
        appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i26 = ((int[]) objArr2[1])[0];
        int i27 = i26 * i26;
        int i28 = -(370658559 * i26);
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = -(i26 * 1390652155);
        int i31 = (i29 & i30) + (i30 | i29);
        int i32 = (i31 & (-417490935)) + ((-417490935) | i31);
        int i33 = i32 >> 19;
        int i34 = i32 >> 26;
        int i35 = -(((i32 - (~((((i33 ^ (-16383)) + ((i33 & (-16383)) << 1)) / 8192) + 1))) - 1) ^ ((((i34 & ComposerKt.defaultsKey) + (i34 | ComposerKt.defaultsKey)) / 64) + 1));
        int i36 = (i35 ^ 4) + ((i35 & 4) << 1);
        int i37 = i36 >> 23;
        int i38 = (((i37 & (-1023)) + (i37 | (-1023))) / 512) + 1;
        VideoRecordEventStart<T> videoRecordEventStartDelay = delay(j, timeUnit, appendbackupvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3, 0 / (((-((i38 & 1) + (i38 | 1))) & i36) * 975));
        int i39 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i39 % 128;
        int i40 = i39 % 2;
        return videoRecordEventStartDelay;
    }

    public final VideoRecordEventStart<T> delay(long j, TimeUnit timeUnit, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDelay = delay(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartDelay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> delay(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDelay = delay(j, timeUnit, appendbackupvideoprofile, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartDelay;
    }

    public final VideoRecordEventStart<T> delay(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        AudioSourceExternalSyntheticLambda7 audioSourceExternalSyntheticLambda7 = new AudioSourceExternalSyntheticLambda7(this, j, timeUnit, appendbackupvideoprofile, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceExternalSyntheticLambda7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> VideoRecordEventStart<T> delay(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDelay = delaySubscription(autoValue_VideoValidatedEncoderProfilesProxy).delay(readablems);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return videoRecordEventStartDelay;
    }

    public final <U> VideoRecordEventStart<T> delaySubscription(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        AudioSourceExternalSyntheticLambda6 audioSourceExternalSyntheticLambda6 = new AudioSourceExternalSyntheticLambda6(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return audioSourceExternalSyntheticLambda6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> delaySubscription(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDelaySubscription = delaySubscription(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return videoRecordEventStartDelaySubscription;
    }

    public final VideoRecordEventStart<T> delaySubscription(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDelaySubscription = delaySubscription(timer(j, timeUnit, appendbackupvideoprofile));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return videoRecordEventStartDelaySubscription;
    }

    @Deprecated
    public final <T2> VideoRecordEventStart<T2> dematerialize() {
        int i = 2 % 2;
        AudioSourceExternalSyntheticLambda8 audioSourceExternalSyntheticLambda8 = new AudioSourceExternalSyntheticLambda8(this, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceExternalSyntheticLambda8;
    }

    public final <R> VideoRecordEventStart<R> dematerialize(readableMs<? super T, VideoRecordEventStatus<R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "selector is null");
        AudioSourceExternalSyntheticLambda8 audioSourceExternalSyntheticLambda8 = new AudioSourceExternalSyntheticLambda8(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceExternalSyntheticLambda8;
    }

    public final VideoRecordEventStart<T> distinct() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDistinct = distinct(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), Functions.TuitionPaymentFragmentbindingInflater1());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartDistinct;
        }
        throw null;
    }

    public final <K> VideoRecordEventStart<T> distinct(readableMs<? super T, K> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDistinct = distinct(readablems, Functions.TuitionPaymentFragmentbindingInflater1());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartDistinct;
    }

    public final <K> VideoRecordEventStart<T> distinct(readableMs<? super T, K> readablems, Callable<? extends Collection<? super K>> callable) {
        int i = 2 % 2;
        share.b(readablems, "keySelector is null");
        share.b(callable, "collectionSupplier is null");
        onSuspendStateChanged onsuspendstatechanged = new onSuspendStateChanged(this, readablems, callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return onsuspendstatechanged;
    }

    public final VideoRecordEventStart<T> distinctUntilChanged() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDistinctUntilChanged = distinctUntilChanged(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return videoRecordEventStartDistinctUntilChanged;
    }

    public final <K> VideoRecordEventStart<T> distinctUntilChanged(readableMs<? super T, K> readablems) {
        int i = 2 % 2;
        share.b(readablems, "keySelector is null");
        AudioSource2 audioSource2 = new AudioSource2(this, readablems, share.b());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return audioSource2;
    }

    public final VideoRecordEventStart<T> distinctUntilChanged(dumpEncoderCapabilities<? super T, ? super T> dumpencodercapabilities) {
        int i = 2 % 2;
        share.b(dumpencodercapabilities, "comparer is null");
        AudioSource2 audioSource2 = new AudioSource2(this, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), dumpencodercapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return audioSource2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> doAfterNext(logToString<? super T> logtostring) {
        int i = 2 % 2;
        share.b(logtostring, "onAfterNext is null");
        AudioSourceInternalState audioSourceInternalState = new AudioSourceInternalState(this, logtostring);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceInternalState;
    }

    public final VideoRecordEventStart<T> doAfterTerminate(formatInterval formatinterval) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(formatinterval, "onFinally is null");
            doOnEach(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Functions.TuitionPaymentFragmentbindingInflater1, formatinterval);
            throw null;
        }
        share.b(formatinterval, "onFinally is null");
        VideoRecordEventStart<T> videoRecordEventStartDoOnEach = doOnEach(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Functions.TuitionPaymentFragmentbindingInflater1, formatinterval);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartDoOnEach;
    }

    public final VideoRecordEventStart<T> doFinally(formatInterval formatinterval) {
        int i = 2 % 2;
        share.b(formatinterval, "onFinally is null");
        ObservableDoFinally observableDoFinally = new ObservableDoFinally(this, formatinterval);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableDoFinally;
    }

    public final VideoRecordEventStart<T> doOnDispose(formatInterval formatinterval) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDoOnLifecycle = doOnLifecycle(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), formatinterval);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartDoOnLifecycle;
    }

    public final VideoRecordEventStart<T> doOnComplete(formatInterval formatinterval) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        logToString<? super T> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (i3 != 0) {
            return doOnEach(logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), formatinterval, Functions.TuitionPaymentFragmentbindingInflater1);
        }
        doOnEach(logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), formatinterval, Functions.TuitionPaymentFragmentbindingInflater1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private VideoRecordEventStart<T> doOnEach(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval, formatInterval formatinterval2) {
        int i = 2 % 2;
        share.b(logtostring, "onNext is null");
        share.b(logtostring2, "onError is null");
        share.b(formatinterval, "onComplete is null");
        share.b(formatinterval2, "onAfterTerminate is null");
        AudioSourceAudioStreamCallback audioSourceAudioStreamCallback = new AudioSourceAudioStreamCallback(this, logtostring, logtostring2, formatinterval, formatinterval2);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceAudioStreamCallback;
    }

    public final VideoRecordEventStart<T> doOnEach(logToString<? super VideoRecordEventStatus<T>> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(logtostring, "onNotification is null");
            doOnEach(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((logToString) logtostring), Functions.b(logtostring), Functions.TuitionPaymentFragmentbindingInflater1((logToString) logtostring), Functions.TuitionPaymentFragmentbindingInflater1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        share.b(logtostring, "onNotification is null");
        VideoRecordEventStart<T> videoRecordEventStartDoOnEach = doOnEach(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((logToString) logtostring), Functions.b(logtostring), Functions.TuitionPaymentFragmentbindingInflater1((logToString) logtostring), Functions.TuitionPaymentFragmentbindingInflater1);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartDoOnEach;
    }

    public final VideoRecordEventStart<T> doOnEach(deriveMediaType<? super T> derivemediatype) {
        int i = 2 % 2;
        share.b(derivemediatype, "observer is null");
        VideoRecordEventStart<T> videoRecordEventStartDoOnEach = doOnEach(new AudioStreamImplExternalSyntheticLambda0.d(derivemediatype), new AudioStreamImplExternalSyntheticLambda0.asInterface(derivemediatype), new AudioStreamImplExternalSyntheticLambda0.a(derivemediatype), Functions.TuitionPaymentFragmentbindingInflater1);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return videoRecordEventStartDoOnEach;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> doOnError(logToString<? super Throwable> logtostring) {
        VideoRecordEventStart<T> videoRecordEventStartDoOnEach;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            logToString<? super T> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            formatInterval formatinterval = Functions.TuitionPaymentFragmentbindingInflater1;
            videoRecordEventStartDoOnEach = doOnEach(logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3, logtostring, formatinterval, formatinterval);
            int i3 = 90 / 0;
        } else {
            logToString<? super T> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            formatInterval formatinterval2 = Functions.TuitionPaymentFragmentbindingInflater1;
            videoRecordEventStartDoOnEach = doOnEach(logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault4, logtostring, formatinterval2, formatinterval2);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartDoOnEach;
    }

    public final VideoRecordEventStart<T> doOnLifecycle(logToString<? super BufferProviderState> logtostring, formatInterval formatinterval) {
        int i = 2 % 2;
        share.b(logtostring, "onSubscribe is null");
        share.b(formatinterval, "onDispose is null");
        AudioSourceAudioSourceCallback audioSourceAudioSourceCallback = new AudioSourceAudioSourceCallback(this, logtostring, formatinterval);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceAudioSourceCallback;
    }

    public final VideoRecordEventStart<T> doOnNext(logToString<? super T> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            logToString<? super Throwable> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            formatInterval formatinterval = Functions.TuitionPaymentFragmentbindingInflater1;
            doOnEach(logtostring, logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3, formatinterval, formatinterval);
            obj.hashCode();
            throw null;
        }
        logToString<? super Throwable> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        formatInterval formatinterval2 = Functions.TuitionPaymentFragmentbindingInflater1;
        VideoRecordEventStart<T> videoRecordEventStartDoOnEach = doOnEach(logtostring, logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault4, formatinterval2, formatinterval2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return videoRecordEventStartDoOnEach;
        }
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> doOnSubscribe(logToString<? super BufferProviderState> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            doOnLifecycle(logtostring, Functions.TuitionPaymentFragmentbindingInflater1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartDoOnLifecycle = doOnLifecycle(logtostring, Functions.TuitionPaymentFragmentbindingInflater1);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return videoRecordEventStartDoOnLifecycle;
    }

    public final VideoRecordEventStart<T> doOnTerminate(formatInterval formatinterval) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(formatinterval, "onTerminate is null");
        VideoRecordEventStart<T> videoRecordEventStartDoOnEach = doOnEach(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(formatinterval), formatinterval, Functions.TuitionPaymentFragmentbindingInflater1);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartDoOnEach;
        }
        throw null;
    }

    public final VideoRecordEventResume<T> elementAt(long j) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        if (j < 0) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was ".concat(String.valueOf(j)));
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maxKeyCode = (char) (37567 - (KeyEvent.getMaxKeyCode() >> 16));
            int size = 625 - View.MeasureSpec.getSize(0);
            int i2 = 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr = $$d;
            byte b = bArr[24];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b + 5), (short) (-bArr[7]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, size, i2, -477065106, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - View.MeasureSpec.getMode(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, 4447 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 37567);
            int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14;
            byte[] bArr2 = $$d;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[27], (short) (-bArr2[7]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, capsMode, maximumDrawingCacheSize, -976899241, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iIndexOf = 625 - TextUtils.indexOf("", "", 0, 0);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                Object[] objArr6 = new Object[1];
                c((byte) 52, $$d[27], (short) 69, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf, doubleTapTimeout, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-382307552) + (((~((-770258292) | iIdentityHashCode)) | (-1053479830)) * (-948)) + ((~((~iIdentityHashCode) | (-751309074))) * (-948)) + 1987862346;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{55358, 43134, 14501, 35008, 6412, 59837, 31201, 51800, 23110, 10984, 47929, 2836, 39850, 27711, 64633, 19607, 56537, 44297, 15781, 36347, 7719, 61004, 32487, 53027, 24406, 12172}, 28751 - KeyEvent.keyCodeFromString(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{55356, 24653, 43235, 61720, 14758, 16946, 35393, 53967, 6935, 41904, 60469, 13403, 31976, 34053, 52617, 5695, 24128, 59110}, 47206 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(!(applicationContext instanceof ContextWrapper)) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{55349, 14695, 6811, 31797, 23829, 48782, 36904, 61790, 54000, 13392, 5494, 30453, 18432, 43438, 35556, 60421}, ((byte) KeyEvent.getModifierMetaStateMask()) + 57690, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{55350, 14574, 6544, 31310, 23423, 48159, 40149, 65013, 57023, 16195, 4222, 28944, 20960, 45793, 37789, 62529}, 57557 - View.combineMeasuredStates(0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new char[]{55405, 48009, 8031, 62247, 22258, 10818, 36363, 24972, 50686, 22898, 15559, 37083, 29790, 51245, 44020, 3863, 58200, 18061, 56063, 48755, 4502, 62919, 18698, 11560, 33010, 25619, 63507, 23439, 16376, 37756, 30353, 51915, 44550, 557, 58795, 31007, 56642, 45233, 5365, 59515, 19393, 12225, 33589, 26486, 64253, 24141, 12870, 38327, 27054, 52524, 41105, 1175, 38967, 31848, 57263, 45896, 5966, 60092, 20197, 8828, 34249, 6558, 64823, 20784}, (Process.myPid() >> 22) + 25523, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new char[]{55356, 34925, 30877, 10384, 39203, 18933, 14799, 59949, 23202, 2770, 64337, 43948, 7134, 52314, 48307, 27830, 56669, 36335, 32191, 11845, 40470, 20135, 16155, 61212, 24565, 'p', 61523, 41127, 4472, 49409, 45532, 25194, 53766, 33422, 29548, 9015, 37831, 17349, 13420, 58568, 21653, 1393, 62887, 42392, 5676, 50940, 46726, 26449, 55286, 34783, 26704, 55535, 35041, 31044, 10734, 39352, 18964, 14914, 60067, 23370, 2890, 64424, 44147, 7252}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 20563, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1523114522};
                byte[] bArr3 = $$j;
                Object[] objArr15 = new Object[1];
                f(bArr3[222], (byte) (-bArr3[102]), bArr3[21], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                f((short) 85, bArr3[198], bArr3[324], objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i14 = ((int[]) objArr17[0])[0];
                int i15 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                    int i17 = i16 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37567);
                        int i18 = 626 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int mode = View.MeasureSpec.getMode(0) + 14;
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, $$d[27], (short) 69, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, i18, mode, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, 4447 - ((Process.getThreadPriority(0) + 20) >> 6), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
                            int iIndexOf2 = 624 - TextUtils.indexOf((CharSequence) "", '0');
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 15;
                            byte[] bArr4 = $$d;
                            Object[] objArr21 = new Object[1];
                            c((byte) 52, bArr4[27], (short) (-bArr4[7]), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, iIndexOf2, packedPositionChild, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37566);
                            int iMyTid = (Process.myTid() >> 22) + 625;
                            int threadPriority = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte[] bArr5 = $$d;
                            byte b2 = bArr5[24];
                            Object[] objArr22 = new Object[1];
                            c(b2, (byte) (b2 + 5), (short) (-bArr5[7]), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iMyTid, threadPriority, -477065106, false, (String) objArr22[0], null);
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
        int i19 = ((int[]) objArr[0])[0];
        int i20 = ((int[]) objArr[2])[0];
        if (i20 != i19) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                    int i22 = i21 % 2;
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i20));
        }
        int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
        int i24 = i23 % 2;
        int i25 = ((int[]) objArr[1])[0];
        int i26 = ((int[]) objArr[2])[0];
        int i27 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i26};
        int i28 = (int) Runtime.getRuntime().totalMemory();
        int i29 = ~i28;
        int i30 = i25 + 597316472 + ((i28 | 44041440) * 988) + (((~(866256364 | i29)) | 135266832) * (-1976)) + (((~(i28 | (-957481757))) | 44041440 | (~(957481756 | i29))) * 988);
        int i31 = (i30 << 13) ^ i30;
        int i32 = i31 ^ (i31 >>> 17);
        ((int[]) objArr[1])[0] = i32 ^ (i32 << 5);
        Object[] objArr23 = {new int[]{i27}, new int[1], iArr2, strArr4};
        return new AudioStreamAudioStreamCallback(this, j);
    }

    public final deriveCodec<T> elementAt(long j, T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0 ? j < 0 : j < 1) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was ".concat(String.valueOf(j)));
        }
        share.b(t, "defaultItem is null");
        AudioStream audioStream = new AudioStream(this, j, t);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return audioStream;
    }

    public final deriveCodec<T> elementAtOrError(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (j < 0) {
            throw new IndexOutOfBoundsException("index >= 0 required but it was ".concat(String.valueOf(j)));
        }
        AudioStream audioStream = new AudioStream(this, j, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return audioStream;
    }

    public final VideoRecordEventStart<T> filter(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "predicate is null");
        getTimestampNs gettimestampns = new getTimestampNs(this, findqualityintargetqualities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return gettimestampns;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventResume<T> firstElement() throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventResume<T> videoRecordEventResumeElementAt = elementAt(0L);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventResumeElementAt;
    }

    public final deriveCodec<T> first(T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        deriveCodec<T> derivecodecElementAt = elementAt(i2 % 2 == 0 ? 1L : 0L, t);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return derivecodecElementAt;
    }

    public final deriveCodec<T> firstOrError() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        deriveCodec<T> derivecodecElementAtOrError = elementAtOrError(0L);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return derivecodecElementAtOrError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap((readableMs) readablems, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMap;
    }

    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            flatMap(readablems, z, Integer.MAX_VALUE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap(readablems, z, Integer.MAX_VALUE);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        return videoRecordEventStartFlatMap;
    }

    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap(readablems, z, i, bufferSize());
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return videoRecordEventStartFlatMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, boolean z, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "maxConcurrency");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, "bufferSize");
        if (!(this instanceof setAudioFormat)) {
            return new ObservableFlatMap(this, readablems, z, i, i2);
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
        Object objCall = ((setAudioFormat) this).call();
        if (objCall != null) {
            return new ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objCall, readablems);
        }
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        if (i8 % 2 == 0) {
            return empty();
        }
        empty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems2, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> callable) {
        int i = 2 % 2;
        share.b(readablems, "onNextMapper is null");
        share.b(readablems2, "onErrorMapper is null");
        share.b(callable, "onCompleteSupplier is null");
        VideoRecordEventStart<R> videoRecordEventStartMerge = merge(new channelCountToChannelMask(this, readablems, readablems2, callable));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return videoRecordEventStartMerge;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, readableMs<Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems2, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> callable, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "onNextMapper is null");
        share.b(readablems2, "onErrorMapper is null");
        share.b(callable, "onCompleteSupplier is null");
        VideoRecordEventStart<R> videoRecordEventStartMerge = merge(new channelCountToChannelMask(this, readablems, readablems2, callable), i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartMerge;
    }

    public final <R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap((readableMs) readablems, false, i, bufferSize());
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return videoRecordEventStartFlatMap;
    }

    public final <U, R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap(readablems, dumpcodeccapabilities, false, bufferSize(), bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMap;
    }

    public final <U, R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return flatMap(readablems, dumpcodeccapabilities, z, bufferSize(), bufferSize());
        }
        flatMap(readablems, dumpcodeccapabilities, z, bufferSize(), bufferSize());
        throw null;
    }

    public final <U, R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap(readablems, dumpcodeccapabilities, z, i, bufferSize());
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return videoRecordEventStartFlatMap;
    }

    public final <U, R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, boolean z, int i, int i2) {
        int i3 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.b(dumpcodeccapabilities, "combiner is null");
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap(new AudioStreamImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(dumpcodeccapabilities, readablems), z, i, i2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMap;
    }

    public final <U, R> VideoRecordEventStart<R> flatMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMap = flatMap(readablems, dumpcodeccapabilities, false, i, bufferSize());
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return videoRecordEventStartFlatMap;
    }

    public final VideoEncoderSession1 flatMapCompletable(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return flatMapCompletable(readablems, i2 % 2 == 0);
    }

    public final VideoEncoderSession1 flatMapCompletable(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableFlatMapCompletableCompletable observableFlatMapCompletableCompletable = new ObservableFlatMapCompletableCompletable(this, readablems, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableFlatMapCompletableCompletable;
    }

    public final <U> VideoRecordEventStart<U> flatMapIterable(readableMs<? super T, ? extends Iterable<? extends U>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        checkAudioRecordInitialStateOrReleaseAndThrow checkaudiorecordinitialstateorreleaseandthrow = new checkAudioRecordInitialStateOrReleaseAndThrow(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return checkaudiorecordinitialstateorreleaseandthrow;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> VideoRecordEventStart<V> flatMapIterable(readableMs<? super T, ? extends Iterable<? extends U>> readablems, dumpCodecCapabilities<? super T, ? super U, ? extends V> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        share.b(dumpcodeccapabilities, "resultSelector is null");
        VideoRecordEventStart<V> videoRecordEventStart = (VideoRecordEventStart<V>) flatMap(new AudioStreamImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(readablems), dumpcodeccapabilities, false, bufferSize(), bufferSize());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
        return videoRecordEventStart;
    }

    public final <R> VideoRecordEventStart<R> flatMapMaybe(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartFlatMapMaybe = flatMapMaybe(readablems, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartFlatMapMaybe;
    }

    public final <R> VideoRecordEventStart<R> flatMapMaybe(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableFlatMapMaybe observableFlatMapMaybe = new ObservableFlatMapMaybe(this, readablems, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return observableFlatMapMaybe;
        }
        throw null;
    }

    public final <R> VideoRecordEventStart<R> flatMapSingle(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        VideoRecordEventStart<R> videoRecordEventStartFlatMapSingle = flatMapSingle(readablems, i2 % 2 != 0);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoRecordEventStartFlatMapSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> flatMapSingle(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, boolean z) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableFlatMapSingle observableFlatMapSingle = new ObservableFlatMapSingle(this, readablems, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
        return observableFlatMapSingle;
    }

    public final BufferProviderState forEach(logToString<? super T> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            subscribe(logtostring);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BufferProviderState bufferProviderStateSubscribe = subscribe(logtostring);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return bufferProviderStateSubscribe;
    }

    public final BufferProviderState forEachWhile(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        BufferProviderState bufferProviderStateForEachWhile = forEachWhile(findqualityintargetqualities, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Functions.TuitionPaymentFragmentbindingInflater1);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return bufferProviderStateForEachWhile;
    }

    public final BufferProviderState forEachWhile(findQualityInTargetQualities<? super T> findqualityintargetqualities, logToString<? super Throwable> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            forEachWhile(findqualityintargetqualities, logtostring, Functions.TuitionPaymentFragmentbindingInflater1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BufferProviderState bufferProviderStateForEachWhile = forEachWhile(findqualityintargetqualities, logtostring, Functions.TuitionPaymentFragmentbindingInflater1);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return bufferProviderStateForEachWhile;
    }

    public final BufferProviderState forEachWhile(findQualityInTargetQualities<? super T> findqualityintargetqualities, logToString<? super Throwable> logtostring, formatInterval formatinterval) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "onNext is null");
        share.b(logtostring, "onError is null");
        share.b(formatinterval, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(findqualityintargetqualities, logtostring, formatinterval);
        subscribe(forEachWhileObserver);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return forEachWhileObserver;
    }

    public final <K> VideoRecordEventStart<CodecStuckOnFlushQuirk<K, T>> groupBy(readableMs<? super T, ? extends K> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<CodecStuckOnFlushQuirk<K, T>> videoRecordEventStart = (VideoRecordEventStart<CodecStuckOnFlushQuirk<K, T>>) groupBy(readablems, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStart;
    }

    public final <K> VideoRecordEventStart<CodecStuckOnFlushQuirk<K, T>> groupBy(readableMs<? super T, ? extends K> readablems, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<CodecStuckOnFlushQuirk<K, T>> videoRecordEventStart = (VideoRecordEventStart<CodecStuckOnFlushQuirk<K, T>>) groupBy(readablems, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), z, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStart;
    }

    public final <K, V> VideoRecordEventStart<CodecStuckOnFlushQuirk<K, V>> groupBy(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        return i2 % 2 != 0 ? groupBy(readablems, readablems2, true, bufferSize()) : groupBy(readablems, readablems2, false, bufferSize());
    }

    public final <K, V> VideoRecordEventStart<CodecStuckOnFlushQuirk<K, V>> groupBy(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<CodecStuckOnFlushQuirk<K, V>> videoRecordEventStartGroupBy = groupBy(readablems, readablems2, z, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return videoRecordEventStartGroupBy;
    }

    public final <K, V> VideoRecordEventStart<CodecStuckOnFlushQuirk<K, V>> groupBy(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, boolean z, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        share.b(readablems, "keySelector is null");
        share.b(readablems2, "valueSelector is null");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
            int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$d;
            byte b = bArr[24];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b + 5), (short) (-bArr[7]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, scrollBarSize, bitsPerPixel, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4448, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
            int i3 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr5 = new Object[1];
            c((byte) 52, $$d[27], (short) 69, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, deadChar, i3, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                c((byte) (bArr2[15] - 1), bArr2[27], (short) 121, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, tapTimeout, packedPositionGroup, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i6 = ~(new Random().nextInt(644076782) | 817190168);
            int i7 = (((-707942239) + (((-956889476) | i6) * (-220))) + ((i6 | (-968752540)) * 220)) - 968767059;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{55358, 43134, 14501, 35008, 6412, 59837, 31201, 51800, 23110, 10984, 47929, 2836, 39850, 27711, 64633, 19607, 56537, 44297, 15781, 36347, 7719, 61004, 32487, 53027, 24406, 12172}, TextUtils.getTrimmedLength("") + 28751, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{55356, 24653, 43235, 61720, 14758, 16946, 35393, 53967, 6935, 41904, 60469, 13403, 31976, 34053, 52617, 5695, 24128, 59110}, 47207 - (KeyEvent.getMaxKeyCode() >> 16), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -1765695725};
                byte[] bArr3 = $$j;
                Object[] objArr11 = new Object[1];
                f((short) 137, bArr3[70], bArr3[129], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                f((short) 146, bArr3[222], bArr3[324], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                    int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 29;
                    byte[] bArr4 = $$d;
                    Object[] objArr14 = new Object[1];
                    c((byte) (bArr4[15] - 1), bArr4[27], (short) 121, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iRgb, iIndexOf, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, (ViewConfiguration.getLongPressTimeout() >> 16) + 57973, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (ViewConfiguration.getPressedStateDuration() >> 16) + 4447, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                        int mirror = AndroidCharacter.getMirror('0') + 873;
                        int offsetAfter = 28 - TextUtils.getOffsetAfter("", 0);
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, $$d[27], (short) 69, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, mirror, offsetAfter, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize2 = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int i10 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iMyTid = (Process.myTid() >> 22) + 28;
                        byte[] bArr5 = $$d;
                        byte b2 = bArr5[24];
                        Object[] objArr18 = new Object[1];
                        c(b2, (byte) (b2 + 5), (short) (-bArr5[7]), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize2, i10, iMyTid, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArr[0])[0];
        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i14 = (~((-1671318144) | elapsedCpuTime)) | 33554460;
        int i15 = ~((~elapsedCpuTime) | 1740525183);
        int i16 = i13 + 364806659 + ((i14 | i15) * (-470)) + (((~(elapsedCpuTime | (-1637763684))) | i15) * 470);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        Object obj = objArr19[0];
        ((int[]) obj)[0] = i18 ^ (i18 << 5);
        int i19 = ((int[]) obj)[0];
        int i20 = i19 * i19;
        int i21 = -(1891903259 * i19);
        int i22 = (i20 & i21) + (i20 | i21);
        int i23 = -(i19 * (-955444017));
        int i24 = (((i22 | i23) << 1) - (i23 ^ i22)) - (-1535536249);
        int i25 = i24 >> 17;
        int i26 = ((((-65535) ^ i25) + ((i25 & (-65535)) << 1)) / 32768) + 1;
        int i27 = (i24 ^ i26) + ((i26 & i24) << 1);
        int i28 = ((i24 >> 23) - 1023) / 512;
        int i29 = -(i27 ^ ((i28 ^ 1) + ((i28 & 1) << 1)));
        int i30 = (i29 & 4) + (i29 | 4);
        int i31 = i30 >> 29;
        int i32 = ((i31 ^ (-15)) + ((i31 & (-15)) << 1)) / 8;
        int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "27\\1\\bufferSize".substring(39420 / (((-((i33 & 1) + (i33 | 1))) & i30) * 1971)));
        return new ObservableGroupBy(this, readablems, readablems2, i, z);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> VideoRecordEventStart<R> groupJoin(AutoValue_VideoValidatedEncoderProfilesProxy<? extends TRight> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> readablems, readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> readablems2, dumpCodecCapabilities<? super T, ? super VideoRecordEventStart<TRight>, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        share.b(readablems, "leftEnd is null");
        share.b(readablems2, "rightEnd is null");
        share.b(dumpcodeccapabilities, "resultSelector is null");
        ObservableGroupJoin observableGroupJoin = new ObservableGroupJoin(this, autoValue_VideoValidatedEncoderProfilesProxy, readablems, readablems2, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableGroupJoin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> hide() {
        int i = 2 % 2;
        createAudioRecord createaudiorecord = new createAudioRecord(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return createaudiorecord;
    }

    public final VideoEncoderSession1 ignoreElements() {
        int i = 2 % 2;
        hasAudioTimestampQuirk hasaudiotimestampquirk = new hasAudioTimestampQuirk(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return hasaudiotimestampquirk;
    }

    public final deriveCodec<Boolean> isEmpty() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            all(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw null;
        }
        deriveCodec<Boolean> derivecodecAll = all(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return derivecodecAll;
    }

    public final <TRight, TLeftEnd, TRightEnd, R> VideoRecordEventStart<R> join(AutoValue_VideoValidatedEncoderProfilesProxy<? extends TRight> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> readablems, readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> readablems2, dumpCodecCapabilities<? super T, ? super TRight, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        share.b(readablems, "leftEnd is null");
        share.b(readablems2, "rightEnd is null");
        share.b(dumpcodeccapabilities, "resultSelector is null");
        ObservableJoin observableJoin = new ObservableJoin(this, autoValue_VideoValidatedEncoderProfilesProxy, readablems, readablems2, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return observableJoin;
    }

    public final VideoRecordEventResume<T> lastElement() {
        int i = 2 % 2;
        lambdanotifySilenced0 lambdanotifysilenced0 = new lambdanotifySilenced0(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return lambdanotifysilenced0;
    }

    public final deriveCodec<T> last(T t) {
        int i = 2 % 2;
        share.b(t, "defaultItem is null");
        computeInterpolatedTimeNs computeinterpolatedtimens = new computeInterpolatedTimeNs(this, t);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return computeinterpolatedtimens;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deriveCodec<T> lastOrError() {
        int i = 2 % 2;
        Object obj = null;
        computeInterpolatedTimeNs computeinterpolatedtimens = new computeInterpolatedTimeNs(this, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return computeinterpolatedtimens;
        }
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> lift(isSurfaceProcessingForceEnabled<? extends R, ? super T> issurfaceprocessingforceenabled) {
        int i = 2 % 2;
        share.b(issurfaceprocessingforceenabled, "lifter is null");
        frameCountToDurationNs framecounttodurationns = new frameCountToDurationNs(this, issurfaceprocessingforceenabled);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return framecounttodurationns;
        }
        throw null;
    }

    public final <R> VideoRecordEventStart<R> map(readableMs<? super T, ? extends R> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        channelCountToChannelConfig channelcounttochannelconfig = new channelCountToChannelConfig(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return channelcounttochannelconfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStatus<T>> materialize() {
        int i = 2 % 2;
        AudioUtils audioUtils = new AudioUtils(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return audioUtils;
    }

    public final VideoRecordEventStart<T> mergeWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
            merge(this, autoValue_VideoValidatedEncoderProfilesProxy);
            obj.hashCode();
            throw null;
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartMerge = merge(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return videoRecordEventStartMerge;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> mergeWith(generateBackupProfile<? extends T> generatebackupprofile) {
        int i = 2 % 2;
        share.b(generatebackupprofile, "other is null");
        ObservableMergeWithSingle observableMergeWithSingle = new ObservableMergeWithSingle(this, generatebackupprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableMergeWithSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> mergeWith(VideoSpecBuilder<? extends T> videoSpecBuilder) {
        int i = 2 % 2;
        share.b(videoSpecBuilder, "other is null");
        ObservableMergeWithMaybe observableMergeWithMaybe = new ObservableMergeWithMaybe(this, videoSpecBuilder);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableMergeWithMaybe;
    }

    public final VideoRecordEventStart<T> mergeWith(VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6) {
        int i = 2 % 2;
        share.b(videoEncoderSessionExternalSyntheticLambda6, "other is null");
        ObservableMergeWithCompletable observableMergeWithCompletable = new ObservableMergeWithCompletable(this, videoEncoderSessionExternalSyntheticLambda6);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableMergeWithCompletable;
    }

    public final VideoRecordEventStart<T> observeOn(appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartObserveOn = observeOn(appendbackupvideoprofile, false, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return videoRecordEventStartObserveOn;
    }

    public final VideoRecordEventStart<T> observeOn(appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartObserveOn = observeOn(appendbackupvideoprofile, z, bufferSize());
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return videoRecordEventStartObserveOn;
    }

    public final VideoRecordEventStart<T> observeOn(appendBackupVideoProfile appendbackupvideoprofile, boolean z, int i) {
        int i2 = 2 % 2;
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableObserveOn observableObserveOn = new ObservableObserveOn(this, appendbackupvideoprofile, z, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableObserveOn;
        }
        throw null;
    }

    public final <U> VideoRecordEventStart<U> ofType(Class<U> cls) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(cls, "clazz is null");
        VideoRecordEventStart<U> videoRecordEventStartCast = filter(Functions.TuitionPaymentFragmentbindingInflater1((Class) cls)).cast(cls);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartCast;
    }

    public final VideoRecordEventStart<T> onErrorResumeNext(readableMs<? super Throwable, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "resumeFunction is null");
        sizeToFrameCount sizetoframecount = new sizeToFrameCount(this, readablems, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return sizetoframecount;
    }

    public final VideoRecordEventStart<T> onErrorResumeNext(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "next is null");
        VideoRecordEventStart<T> videoRecordEventStartOnErrorResumeNext = onErrorResumeNext(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_VideoValidatedEncoderProfilesProxy));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartOnErrorResumeNext;
    }

    public final VideoRecordEventStart<T> onErrorReturn(readableMs<? super Throwable, ? extends T> readablems) {
        int i = 2 % 2;
        share.b(readablems, "valueSupplier is null");
        AutoValue_AudioSettings autoValue_AudioSettings = new AutoValue_AudioSettings(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return autoValue_AudioSettings;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> onErrorReturnItem(T t) {
        VideoRecordEventStart<T> videoRecordEventStartOnErrorReturn;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(t, "item is null");
            videoRecordEventStartOnErrorReturn = onErrorReturn(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(t));
            int i3 = 43 / 0;
        } else {
            share.b(t, "item is null");
            videoRecordEventStartOnErrorReturn = onErrorReturn(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(t));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartOnErrorReturn;
    }

    public final VideoRecordEventStart<T> onExceptionResumeNext(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "next is null");
        sizeToFrameCount sizetoframecount = new sizeToFrameCount(this, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_VideoValidatedEncoderProfilesProxy), true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return sizetoframecount;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> onTerminateDetach() {
        int i = 2 % 2;
        AudioSourceExternalSyntheticLambda9 audioSourceExternalSyntheticLambda9 = new AudioSourceExternalSyntheticLambda9(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return audioSourceExternalSyntheticLambda9;
    }

    public final usesAffectedSoc<T> publish() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            ObservablePublish.b(this);
            throw null;
        }
        usesAffectedSoc<T> usesaffectedsocB = ObservablePublish.b(this);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
        }
        return usesaffectedsocB;
    }

    public final <R> VideoRecordEventStart<R> publish(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "selector is null");
        ObservablePublishSelector observablePublishSelector = new ObservablePublishSelector(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observablePublishSelector;
    }

    public final VideoRecordEventResume<T> reduce(dumpCodecCapabilities<T, T, T> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(dumpcodeccapabilities, "reducer is null");
        AutoValue_AudioSettingsBuilder autoValue_AudioSettingsBuilder = new AutoValue_AudioSettingsBuilder(this, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return autoValue_AudioSettingsBuilder;
    }

    public final <R> deriveCodec<R> reduce(R r, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(r, "seed is null");
        share.b(dumpcodeccapabilities, "reducer is null");
        AutoValue_AudioStream_PacketInfo autoValue_AudioStream_PacketInfo = new AutoValue_AudioStream_PacketInfo(this, r, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return autoValue_AudioStream_PacketInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> deriveCodec<R> reduceWith(Callable<R> callable, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(callable, "seedSupplier is null");
        share.b(dumpcodeccapabilities, "reducer is null");
        BufferedAudioStream bufferedAudioStream = new BufferedAudioStream(this, callable, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return bufferedAudioStream;
    }

    public final VideoRecordEventStart<T> repeat() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return repeat(Long.MAX_VALUE);
        }
        repeat(Long.MAX_VALUE);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> repeat(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        if (j < 0) {
            throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
        }
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (j == 0) {
            return empty();
        }
        return new ObservableRepeat(this, j);
    }

    public final VideoRecordEventStart<T> repeatUntil(readableBufferInfo readablebufferinfo) {
        int i = 2 % 2;
        share.b(readablebufferinfo, "stop is null");
        ObservableRepeatUntil observableRepeatUntil = new ObservableRepeatUntil(this, readablebufferinfo);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableRepeatUntil;
    }

    public final VideoRecordEventStart<T> repeatWhen(readableMs<? super VideoRecordEventStart<Object>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "handler is null");
        ObservableRepeatWhen observableRepeatWhen = new ObservableRepeatWhen(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableRepeatWhen;
    }

    public final usesAffectedSoc<T> replay() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }
        ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "selector is null");
        VideoRecordEventStart<R> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AudioStreamImplExternalSyntheticLambda0.asBinder(this), readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "selector is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        VideoRecordEventStart<R> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AudioStreamImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, i), readablems);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, int i, long j, TimeUnit timeUnit) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return replay(readablems, i, j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        VideoRecordEventStart<R> videoRecordEventStartReplay = replay(readablems, i, j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = 4 / 0;
        return videoRecordEventStartReplay;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, int i, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i2 = 2 % 2;
        share.b(readablems, "selector is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        VideoRecordEventStart<R> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AudioStreamImplExternalSyntheticLambda0.b(this, i, j, timeUnit, appendbackupvideoprofile), readablems);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, int i, appendBackupVideoProfile appendbackupvideoprofile) {
        int i2 = 2 % 2;
        share.b(readablems, "selector is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        VideoRecordEventStart<R> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AudioStreamImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, i), new AudioStreamImplExternalSyntheticLambda0.notify(readablems, appendbackupvideoprofile));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<R> videoRecordEventStartReplay = replay(readablems, j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return videoRecordEventStartReplay;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(readablems, "selector is null");
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        VideoRecordEventStart<R> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AudioStreamImplExternalSyntheticLambda0.INotificationSideChannel(this, j, timeUnit, appendbackupvideoprofile), readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    public final <R> VideoRecordEventStart<R> replay(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(readablems, "selector is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        VideoRecordEventStart<R> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new AudioStreamImplExternalSyntheticLambda0.asBinder(this), new AudioStreamImplExternalSyntheticLambda0.notify(readablems, appendbackupvideoprofile));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final usesAffectedSoc<T> replay(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
            ObservableReplay.TuitionPaymentFragmentbindingInflater1(this, i);
            obj.hashCode();
            throw null;
        }
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        usesAffectedSoc<T> usesaffectedsocTuitionPaymentFragmentbindingInflater1 = ObservableReplay.TuitionPaymentFragmentbindingInflater1(this, i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return usesaffectedsocTuitionPaymentFragmentbindingInflater1;
        }
        obj.hashCode();
        throw null;
    }

    public final usesAffectedSoc<T> replay(int i, long j, TimeUnit timeUnit) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return replay(i, j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        replay(i, j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final usesAffectedSoc<T> replay(int i, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
            share.b(timeUnit, "unit is null");
            share.b(appendbackupvideoprofile, "scheduler is null");
            return ObservableReplay.TuitionPaymentFragmentbindingInflater1(this, j, timeUnit, appendbackupvideoprofile, i);
        }
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        usesAffectedSoc<T> usesaffectedsocTuitionPaymentFragmentbindingInflater1 = ObservableReplay.TuitionPaymentFragmentbindingInflater1(this, j, timeUnit, appendbackupvideoprofile, i);
        int i4 = 95 / 0;
        return usesaffectedsocTuitionPaymentFragmentbindingInflater1;
    }

    public final usesAffectedSoc<T> replay(int i, appendBackupVideoProfile appendbackupvideoprofile) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        usesAffectedSoc<T> usesaffectedsocTuitionPaymentFragmentbindingInflater1 = ObservableReplay.TuitionPaymentFragmentbindingInflater1(replay(i), appendbackupvideoprofile);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return usesaffectedsocTuitionPaymentFragmentbindingInflater1;
    }

    public final usesAffectedSoc<T> replay(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            replay(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        usesAffectedSoc<T> usesaffectedsocReplay = replay(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return usesaffectedsocReplay;
    }

    public final usesAffectedSoc<T> replay(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(timeUnit, "unit is null");
            share.b(appendbackupvideoprofile, "scheduler is null");
            return ObservableReplay.TuitionPaymentFragmentbindingInflater1(this, j, timeUnit, appendbackupvideoprofile);
        }
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        int i3 = 27 / 0;
        return ObservableReplay.TuitionPaymentFragmentbindingInflater1(this, j, timeUnit, appendbackupvideoprofile);
    }

    public final usesAffectedSoc<T> replay(appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(appendbackupvideoprofile, "scheduler is null");
        usesAffectedSoc<T> usesaffectedsocTuitionPaymentFragmentbindingInflater1 = ObservableReplay.TuitionPaymentFragmentbindingInflater1(replay(), appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return usesaffectedsocTuitionPaymentFragmentbindingInflater1;
    }

    public final VideoRecordEventStart<T> retry() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartRetry = retry(Long.MAX_VALUE, Functions.b());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return videoRecordEventStartRetry;
    }

    public final VideoRecordEventStart<T> retry(dumpEncoderCapabilities<? super Integer, ? super Throwable> dumpencodercapabilities) {
        int i = 2 % 2;
        share.b(dumpencodercapabilities, "predicate is null");
        ObservableRetryBiPredicate observableRetryBiPredicate = new ObservableRetryBiPredicate(this, dumpencodercapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableRetryBiPredicate;
    }

    public final VideoRecordEventStart<T> retry(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartRetry = retry(j, Functions.b());
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return videoRecordEventStartRetry;
    }

    public final VideoRecordEventStart<T> retry(long j, findQualityInTargetQualities<? super Throwable> findqualityintargetqualities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (j < 0) {
            throw new IllegalArgumentException("times >= 0 required but it was ".concat(String.valueOf(j)));
        }
        share.b(findqualityintargetqualities, "predicate is null");
        ObservableRetryPredicate observableRetryPredicate = new ObservableRetryPredicate(this, j, findqualityintargetqualities);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return observableRetryPredicate;
    }

    public final VideoRecordEventStart<T> retry(findQualityInTargetQualities<? super Throwable> findqualityintargetqualities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartRetry = retry(Long.MAX_VALUE, findqualityintargetqualities);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartRetry;
    }

    public final VideoRecordEventStart<T> retryUntil(readableBufferInfo readablebufferinfo) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(readablebufferinfo, "stop is null");
        VideoRecordEventStart<T> videoRecordEventStartRetry = retry(Long.MAX_VALUE, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(readablebufferinfo));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartRetry;
    }

    public final VideoRecordEventStart<T> retryWhen(readableMs<? super VideoRecordEventStart<Throwable>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "handler is null");
        ObservableRetryWhen observableRetryWhen = new ObservableRetryWhen(this, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return observableRetryWhen;
    }

    public final void safeSubscribe(deriveMediaType<? super T> derivemediatype) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(derivemediatype, "observer is null");
        if (!(derivemediatype instanceof EncoderNotUsePersistentInputSurfaceQuirk)) {
            subscribe(new EncoderNotUsePersistentInputSurfaceQuirk(derivemediatype));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        subscribe(derivemediatype);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    public final VideoRecordEventStart<T> sample(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            sample(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartSample = sample(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartSample;
    }

    public final VideoRecordEventStart<T> sample(long j, TimeUnit timeUnit, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartSample = sample(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), z);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return videoRecordEventStartSample;
    }

    public final VideoRecordEventStart<T> sample(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableSampleTimed observableSampleTimed = new ObservableSampleTimed(this, j, timeUnit, appendbackupvideoprofile, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return observableSampleTimed;
    }

    public final VideoRecordEventStart<T> sample(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableSampleTimed observableSampleTimed = new ObservableSampleTimed(this, j, timeUnit, appendbackupvideoprofile, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableSampleTimed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U> VideoRecordEventStart<T> sample(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sampler is null");
        ObservableSampleWithObservable observableSampleWithObservable = new ObservableSampleWithObservable(this, autoValue_VideoValidatedEncoderProfilesProxy, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return observableSampleWithObservable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U> VideoRecordEventStart<T> sample(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, boolean z) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "sampler is null");
        ObservableSampleWithObservable observableSampleWithObservable = new ObservableSampleWithObservable(this, autoValue_VideoValidatedEncoderProfilesProxy, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableSampleWithObservable;
    }

    public final VideoRecordEventStart<T> scan(dumpCodecCapabilities<T, T, T> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(dumpcodeccapabilities, "accumulator is null");
        startCollectingAudioData startcollectingaudiodata = new startCollectingAudioData(this, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return startcollectingaudiodata;
        }
        throw null;
    }

    public final <R> VideoRecordEventStart<R> scan(R r, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(r, "initialValue is null");
        VideoRecordEventStart<R> videoRecordEventStartScanWith = scanWith(Functions.TuitionPaymentFragmentbindingInflater1(r), dumpcodeccapabilities);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartScanWith;
        }
        throw null;
    }

    public final <R> VideoRecordEventStart<R> scanWith(Callable<R> callable, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(callable, "seedSupplier is null");
        share.b(dumpcodeccapabilities, "accumulator is null");
        collectAudioData collectaudiodata = new collectAudioData(this, callable, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return collectaudiodata;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> serialize() {
        int i = 2 % 2;
        r8lambdazqHvpax8KCfsZm8P4td9pnVSrdg r8lambdazqhvpax8kcfszm8p4td9pnvsrdg = new r8lambdazqHvpax8KCfsZm8P4td9pnVSrdg(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return r8lambdazqhvpax8kcfszm8p4td9pnvsrdg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [usesAffectedSoc] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final VideoRecordEventStart<T> share() {
        int i = 2 % 2;
        usesAffectedSoc<T> usesaffectedsocPublish = publish();
        boolean z = usesaffectedsocPublish instanceof AutoValue_AudioSettings1;
        ?? observablePublishAlt = usesaffectedsocPublish;
        if (z) {
            observablePublishAlt = new ObservablePublishAlt(((AutoValue_AudioSettings1) usesaffectedsocPublish).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        return new ObservableRefCount(observablePublishAlt);
    }

    public final VideoRecordEventResume<T> singleElement() {
        int i = 2 % 2;
        lambdastart0androidxcameravideointernalaudioBufferedAudioStream lambdastart0androidxcameravideointernalaudiobufferedaudiostream = new lambdastart0androidxcameravideointernalaudioBufferedAudioStream(this);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return lambdastart0androidxcameravideointernalaudiobufferedaudiostream;
    }

    public final deriveCodec<T> single(T t) {
        int i = 2 % 2;
        share.b(t, "defaultItem is null");
        updateCollectionBufferSize updatecollectionbuffersize = new updateCollectionBufferSize(this, t);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return updatecollectionbuffersize;
        }
        throw null;
    }

    public final deriveCodec<T> singleOrError() {
        int i = 2 % 2;
        updateCollectionBufferSize updatecollectionbuffersize = new updateCollectionBufferSize(this, null);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
        return updatecollectionbuffersize;
    }

    public final VideoRecordEventStart<T> skip(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0 ? j > 0 : j > 0) {
            return new lambdarelease2androidxcameravideointernalaudioBufferedAudioStream(this, j);
        }
        int i4 = i2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0228  */
    /* JADX WARN: Code duplicated, block: B:27:0x0234  */
    public final VideoRecordEventStart<T> skip(long j, TimeUnit timeUnit) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 37568);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
            int iArgb = Color.argb(0, 0, 0, 0) + 14;
            byte[] bArr = $$d;
            byte b = bArr[24];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b + 5), (short) (-bArr[7]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, scrollDefaultDelay, iArgb, -477065106, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 57972, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, 4447 - View.combineMeasuredStates(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37567);
            int iAxisFromString = MotionEvent.axisFromString("") + 626;
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13;
            byte[] bArr2 = $$d;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr2[27], (short) (-bArr2[7]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iAxisFromString, i4, -976899241, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37567);
                int i5 = 626 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 14;
                Object[] objArr6 = new Object[1];
                c((byte) 52, $$d[27], (short) 69, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, i5, jumpTapTimeout, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i8 = ~iMaxMemory;
            int i9 = (((((~((-144868967) | i8)) | (~(1017890807 | iMaxMemory))) * 988) - 527303964) + ((((~(iMaxMemory | (-950716280))) | 805847313) | (~(i8 | 1017890807))) * 988)) - 1137065578;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[]{i7}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{55358, 43134, 14501, 35008, 6412, 59837, 31201, 51800, 23110, 10984, 47929, 2836, 39850, 27711, 64633, 19607, 56537, 44297, 15781, 36347, 7719, 61004, 32487, 53027, 24406, 12172}, 28751 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{55356, 24653, 43235, 61720, 14758, 16946, 35393, 53967, 6935, 41904, 60469, 13403, 31976, 34053, 52617, 5695, 24128, 59110}, 47208 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
                int i13 = i12 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
                int i14 = i12 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i15 = i13 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 46 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                            int i18 = i17 % 2;
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                        int i110 = i19 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{55349, 14695, 6811, 31797, 23829, 48782, 36904, 61790, 54000, 13392, 5494, 30453, 18432, 43438, 35556, 60421}, TextUtils.lastIndexOf("", '0', 0) + 57690, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{55350, 14574, 6544, 31310, 23423, 48159, 40149, 65013, 57023, 16195, 4222, 28944, 20960, 45793, 37789, 62529}, (-16719659) - Color.rgb(0, 0, 0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new char[]{55405, 48009, 8031, 62247, 22258, 10818, 36363, 24972, 50686, 22898, 15559, 37083, 29790, 51245, 44020, 3863, 58200, 18061, 56063, 48755, 4502, 62919, 18698, 11560, 33010, 25619, 63507, 23439, 16376, 37756, 30353, 51915, 44550, 557, 58795, 31007, 56642, 45233, 5365, 59515, 19393, 12225, 33589, 26486, 64253, 24141, 12870, 38327, 27054, 52524, 41105, 1175, 38967, 31848, 57263, 45896, 5966, 60092, 20197, 8828, 34249, 6558, 64823, 20784}, View.getDefaultSize(0, 0) + 25523, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new char[]{55356, 34925, 30877, 10384, 39203, 18933, 14799, 59949, 23202, 2770, 64337, 43948, 7134, 52314, 48307, 27830, 56669, 36335, 32191, 11845, 40470, 20135, 16155, 61212, 24565, 'p', 61523, 41127, 4472, 49409, 45532, 25194, 53766, 33422, 29548, 9015, 37831, 17349, 13420, 58568, 21653, 1393, 62887, 42392, 5676, 50940, 46726, 26449, 55286, 34783, 26704, 55535, 35041, 31044, 10734, 39352, 18964, 14914, 60067, 23370, 2890, 64424, 44147, 7252}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20563, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -1137065578};
                byte[] bArr3 = $$j;
                Object[] objArr15 = new Object[1];
                f((short) 183, bArr3[198], bArr3[21], objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                f(bArr3[222], bArr3[16], (byte) (-bArr3[272]), objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i22 = ((int[]) objArr17[0])[0];
                int i23 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int iCombineMeasuredStates = 625 - View.combineMeasuredStates(0, 0);
                        int longPressTimeout = 14 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        Object[] objArr18 = new Object[1];
                        c((byte) 52, $$d[27], (short) 69, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, iCombineMeasuredStates, longPressTimeout, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - (Process.myPid() >> 22), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (Process.myPid() >> 22) + 4447, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cLastIndexOf2 = (char) (37566 - TextUtils.lastIndexOf("", '0'));
                            int gidForName = Process.getGidForName("") + 626;
                            int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 14;
                            byte[] bArr4 = $$d;
                            Object[] objArr21 = new Object[1];
                            c((byte) 52, bArr4[27], (short) (-bArr4[7]), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, gidForName, scrollBarSize2, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                            int threadPriority = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte[] bArr5 = $$d;
                            byte b2 = bArr5[24];
                            Object[] objArr22 = new Object[1];
                            c(b2, (byte) (b2 + 5), (short) (-bArr5[7]), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout2, longPressTimeout2, threadPriority, -477065106, false, (String) objArr22[0], null);
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
        int i24 = ((int[]) objArr[0])[0];
        int i25 = ((int[]) objArr[2])[0];
        if (i25 != i24) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i25));
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[2])[0];
        int i28 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i27};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i29 = (~((-1155798345) | startElapsedRealtime)) | 79958336;
        int i30 = ~((~startElapsedRealtime) | 1743779784);
        int i31 = i26 + 749450376 + ((i29 | i30) * (-470)) + (((~(startElapsedRealtime | (-1075840009))) | i30) * 470);
        int i32 = (i31 << 13) ^ i31;
        int i33 = i32 ^ (i32 >>> 17);
        ((int[]) objArr[1])[0] = i33 ^ (i33 << 5);
        Object[] objArr23 = {new int[]{i28}, new int[1], iArr2, strArr4};
        int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i34 % 128;
        int i35 = i34 % 2;
        return skipUntil(timer(j, timeUnit));
    }

    public final VideoRecordEventStart<T> skip(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        VideoRecordEventStart<Long> videoRecordEventStartTimer = timer(j, timeUnit, appendbackupvideoprofile);
        if (i3 == 0) {
            skipUntil(videoRecordEventStartTimer);
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartSkipUntil = skipUntil(videoRecordEventStartTimer);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartSkipUntil;
        }
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> skipLast(int i) {
        int i2 = 2 % 2;
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was ".concat(String.valueOf(i)));
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        int i4 = i3 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        int i5 = i3 % 2;
        if (i == 0) {
            int i6 = i4 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }
        ObservableSkipLast observableSkipLast = new ObservableSkipLast(this, i);
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
        return observableSkipLast;
    }

    public final VideoRecordEventStart<T> skipLast(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        return i2 % 2 == 0 ? skipLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, bufferSize()) : skipLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, bufferSize());
    }

    public final VideoRecordEventStart<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        VideoRecordEventStart<T> videoRecordEventStartSkipLast;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            videoRecordEventStartSkipLast = skipLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), z, bufferSize());
            int i3 = 16 / 0;
        } else {
            videoRecordEventStartSkipLast = skipLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), z, bufferSize());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartSkipLast;
    }

    public final VideoRecordEventStart<T> skipLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        VideoRecordEventStart<T> videoRecordEventStartSkipLast = i2 % 2 != 0 ? skipLast(j, timeUnit, appendbackupvideoprofile, true, bufferSize()) : skipLast(j, timeUnit, appendbackupvideoprofile, false, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoRecordEventStartSkipLast;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> skipLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartSkipLast = skipLast(j, timeUnit, appendbackupvideoprofile, z, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartSkipLast;
    }

    public final VideoRecordEventStart<T> skipLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z, int i) {
        int i2 = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableSkipLastTimed observableSkipLastTimed = new ObservableSkipLastTimed(this, j, timeUnit, appendbackupvideoprofile, i << 1, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableSkipLastTimed;
        }
        throw null;
    }

    public final <U> VideoRecordEventStart<T> skipUntil(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream lambdasetcallback3androidxcameravideointernalaudiobufferedaudiostream = new lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return lambdasetcallback3androidxcameravideointernalaudiobufferedaudiostream;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> skipWhile(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "predicate is null");
        updateCollectionBufferSizeAsync updatecollectionbuffersizeasync = new updateCollectionBufferSizeAsync(this, findqualityintargetqualities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return updatecollectionbuffersizeasync;
    }

    public final VideoRecordEventStart<T> sorted() {
        VideoRecordEventStart<T> videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = toList() instanceof newSharedInstance;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        deriveCodec<List<T>> list = toList();
        if (list instanceof newSharedInstance) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((newSharedInstance) list).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            SingleToObservable singleToObservable = new SingleToObservable(list);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2 = singleToObservable;
        }
        return videoRecordEventStartTuitionPaymentFragmentspecialinlinedviewModeldefault2.map(Functions.TuitionPaymentFragmentbindingInflater1(Functions.a())).flatMapIterable(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public final VideoRecordEventStart<T> sorted(Comparator<? super T> comparator) {
        VideoRecordEventStart<T> singleToObservable;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(comparator, "sortFunction is null");
            boolean z = toList() instanceof newSharedInstance;
            throw null;
        }
        share.b(comparator, "sortFunction is null");
        deriveCodec<List<T>> list = toList();
        if (list instanceof newSharedInstance) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 == 0) {
                ((newSharedInstance) list).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                throw null;
            }
            singleToObservable = ((newSharedInstance) list).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            singleToObservable = new SingleToObservable<>(list);
        }
        return singleToObservable.map(Functions.TuitionPaymentFragmentbindingInflater1((Comparator) comparator)).flatMapIterable(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public final VideoRecordEventStart<T> startWith(Iterable<? extends T> iterable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartConcatArray = concatArray(fromIterable(iterable), this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatArray;
    }

    public final VideoRecordEventStart<T> startWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartConcatArray = concatArray(autoValue_VideoValidatedEncoderProfilesProxy, this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartConcatArray;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> startWith(T t) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(t, "item is null");
        VideoRecordEventStart<T> videoRecordEventStartConcatArray = concatArray(just(t), this);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartConcatArray;
    }

    public final VideoRecordEventStart<T> startWithArray(T... tArr) {
        int i = 2 % 2;
        VideoRecordEventStart videoRecordEventStartFromArray = fromArray(tArr);
        Object obj = null;
        if (videoRecordEventStartFromArray == empty()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartConcatArray = concatArray(videoRecordEventStartFromArray, this);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoRecordEventStartConcatArray;
        }
        throw null;
    }

    public final BufferProviderState subscribe() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        logToString<? super T> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (i3 != 0) {
            return subscribe(logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Functions.TuitionPaymentFragmentbindingInflater1, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        subscribe(logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Functions.TuitionPaymentFragmentbindingInflater1, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BufferProviderState subscribe(logToString<? super T> logtostring) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        BufferProviderState bufferProviderStateSubscribe = subscribe(logtostring, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2, Functions.TuitionPaymentFragmentbindingInflater1, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return bufferProviderStateSubscribe;
    }

    public final BufferProviderState subscribe(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        formatInterval formatinterval = Functions.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            return subscribe(logtostring, logtostring2, formatinterval, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        subscribe(logtostring, logtostring2, formatinterval, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        throw null;
    }

    public final BufferProviderState subscribe(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        logToString<? super BufferProviderState> logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (i3 == 0) {
            return subscribe(logtostring, logtostring2, formatinterval, logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        subscribe(logtostring, logtostring2, formatinterval, logtostringTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        throw null;
    }

    public final BufferProviderState subscribe(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2, formatInterval formatinterval, logToString<? super BufferProviderState> logtostring3) {
        int i = 2 % 2;
        share.b(logtostring, "onNext is null");
        share.b(logtostring2, "onError is null");
        share.b(formatinterval, "onComplete is null");
        share.b(logtostring3, "onSubscribe is null");
        LambdaObserver lambdaObserver = new LambdaObserver(logtostring, logtostring2, formatinterval, logtostring3);
        subscribe(lambdaObserver);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return lambdaObserver;
    }

    @Override // defpackage.AutoValue_VideoValidatedEncoderProfilesProxy
    public final void subscribe(deriveMediaType<? super T> derivemediatype) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(derivemediatype, "observer is null");
        try {
            share.b(derivemediatype, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(derivemediatype);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <E extends deriveMediaType<? super T>> E subscribeWith(E e2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        subscribe(e2);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return e2;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> subscribeOn(appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableSubscribeOn observableSubscribeOn = new ObservableSubscribeOn(this, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return observableSubscribeOn;
    }

    public final VideoRecordEventStart<T> switchIfEmpty(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        BufferedAudioStreamExternalSyntheticLambda0 bufferedAudioStreamExternalSyntheticLambda0 = new BufferedAudioStreamExternalSyntheticLambda0(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return bufferedAudioStreamExternalSyntheticLambda0;
    }

    public final <R> VideoRecordEventStart<R> switchMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            switchMap(readablems, bufferSize());
            throw null;
        }
        VideoRecordEventStart<R> videoRecordEventStartSwitchMap = switchMap(readablems, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 84 / 0;
        }
        return videoRecordEventStartSwitchMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> VideoRecordEventStart<R> switchMap(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        if (!(this instanceof setAudioFormat)) {
            return new ObservableSwitchMap(this, readablems, i, false);
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        Object objCall = ((setAudioFormat) this).call();
        if (objCall == null) {
            return empty();
        }
        ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objCall, readablems);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        throw null;
    }

    public final VideoEncoderSession1 switchMapCompletable(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableSwitchMapCompletable observableSwitchMapCompletable = new ObservableSwitchMapCompletable(this, readablems, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return observableSwitchMapCompletable;
    }

    public final VideoEncoderSession1 switchMapCompletableDelayError(readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableSwitchMapCompletable observableSwitchMapCompletable = new ObservableSwitchMapCompletable(this, readablems, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableSwitchMapCompletable;
    }

    public final <R> VideoRecordEventStart<R> switchMapMaybe(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableSwitchMapMaybe observableSwitchMapMaybe = new ObservableSwitchMapMaybe(this, readablems, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableSwitchMapMaybe;
    }

    public final <R> VideoRecordEventStart<R> switchMapMaybeDelayError(readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableSwitchMapMaybe observableSwitchMapMaybe = new ObservableSwitchMapMaybe(this, readablems, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableSwitchMapMaybe;
    }

    public final <R> VideoRecordEventStart<R> switchMapSingle(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableSwitchMapSingle observableSwitchMapSingle = new ObservableSwitchMapSingle(this, readablems, false);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableSwitchMapSingle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> switchMapSingleDelayError(readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
        int i = 2 % 2;
        share.b(readablems, "mapper is null");
        ObservableSwitchMapSingle observableSwitchMapSingle = new ObservableSwitchMapSingle(this, readablems, true);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return observableSwitchMapSingle;
    }

    public final <R> VideoRecordEventStart<R> switchMapDelayError(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            switchMapDelayError(readablems, bufferSize());
            throw null;
        }
        VideoRecordEventStart<R> videoRecordEventStartSwitchMapDelayError = switchMapDelayError(readablems, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return videoRecordEventStartSwitchMapDelayError;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> VideoRecordEventStart<R> switchMapDelayError(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(readablems, "mapper is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        if (!(this instanceof setAudioFormat)) {
            ObservableSwitchMap observableSwitchMap = new ObservableSwitchMap(this, readablems, i, true);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                return observableSwitchMap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objCall = ((setAudioFormat) this).call();
        if (objCall != null) {
            return new ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objCall, readablems);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordEventStart<R> videoRecordEventStartEmpty = empty();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return videoRecordEventStartEmpty;
    }

    public final VideoRecordEventStart<T> take(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0 ? j < 0 : j < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was ".concat(String.valueOf(j)));
        }
        BufferedAudioStreamExternalSyntheticLambda1 bufferedAudioStreamExternalSyntheticLambda1 = new BufferedAudioStreamExternalSyntheticLambda1(this, j);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return bufferedAudioStreamExternalSyntheticLambda1;
    }

    public final VideoRecordEventStart<T> take(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTakeUntil = takeUntil(timer(j, timeUnit));
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return videoRecordEventStartTakeUntil;
    }

    public final VideoRecordEventStart<T> take(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTakeUntil = takeUntil(timer(j, timeUnit, appendbackupvideoprofile));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return videoRecordEventStartTakeUntil;
    }

    public final VideoRecordEventStart<T> takeLast(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = i3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        if (i < 0) {
            throw new IndexOutOfBoundsException("count >= 0 required but it was ".concat(String.valueOf(i)));
        }
        int i6 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (i == 0) {
            return new onRecordingConfigChanged(this);
        }
        if (i == 1) {
            return new lambdaupdateCollectionBufferSizeAsync4androidxcameravideointernalaudioBufferedAudioStream(this);
        }
        ObservableTakeLast observableTakeLast = new ObservableTakeLast(this, i);
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        return observableTakeLast;
    }

    public final VideoRecordEventStart<T> takeLast(long j, long j2, TimeUnit timeUnit) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTakeLast = takeLast(j, j2, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartTakeLast;
    }

    public final VideoRecordEventStart<T> takeLast(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTakeLast = takeLast(j, j2, timeUnit, appendbackupvideoprofile, false, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartTakeLast;
    }

    public final VideoRecordEventStart<T> takeLast(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        share.b(timeUnit, "unit is null");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i3 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3111;
            int i4 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[27], (short) (-bArr[7]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, absoluteGravity, i4, -1272852037, false, (String) objArr2[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 57973, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (ViewConfiguration.getTapTimeout() >> 16) + 4447, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) (43042 - View.getDefaultSize(0, 0));
            int iAxisFromString = 3110 - MotionEvent.axisFromString("");
            int i5 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr5 = new Object[1];
            c((byte) 52, $$d[27], (short) 69, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, iAxisFromString, i5, -1269618118, false, (String) objArr5[0], null);
        }
        if (j3 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
                int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3110;
                int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                c((byte) (bArr2[15] - 1), bArr2[27], (short) 121, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, i8, scrollDefaultDelay, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i9 = ((int[]) objArr7[2])[0];
            int i10 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i9};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = (((-2074922926) + (((~((-111233866) | iIdentityHashCode)) | (~(1593797593 | iIdentityHashCode))) * 69)) + (((~(iIdentityHashCode | 1191136217)) | ((~((-513895242) | iIdentityHashCode)) | 402661376)) * (-69))) - 525245402;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], new int[]{i10}, iArr, strArr};
        } else {
            try {
                Object[] objArr8 = {null, Integer.valueOf(i), 0, -2024063658};
                byte[] bArr3 = $$j;
                Object[] objArr9 = new Object[1];
                f((short) 235, bArr3[4], bArr3[88], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                f((short) 146, bArr3[222], bArr3[324], objArr10);
                Object[] objArr11 = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cBlue = (char) (43042 - Color.blue(0));
                    int pressedStateDuration = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                    byte[] bArr4 = $$d;
                    Object[] objArr12 = new Object[1];
                    c((byte) (bArr4[15] - 1), bArr4[27], (short) 121, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cBlue, pressedStateDuration, iLastIndexOf, 154975793, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, ((Process.getThreadPriority(0) + 20) >> 6) + 57973, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, 4447 - Color.green(0), objArr14);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43042);
                        int i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3110;
                        int iMyPid = (Process.myPid() >> 22) + 22;
                        Object[] objArr15 = new Object[1];
                        c((byte) 52, $$d[27], (short) 69, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, i14, iMyPid, -1269618118, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43042);
                        int capsMode = 3111 - TextUtils.getCapsMode("", 0, 0);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 23;
                        byte[] bArr5 = $$d;
                        Object[] objArr16 = new Object[1];
                        c((byte) 52, bArr5[27], (short) (-bArr5[7]), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity2, capsMode, packedPositionChild, -1272852037, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr11;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i17 % 128;
                int i18 = i17 % 2;
                while (i3 < strArr2.length) {
                    int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                    if (i19 % 2 == 0) {
                        arrayList.add(strArr2[i3]);
                        i3 += 91;
                    } else {
                        arrayList.add(strArr2[i3]);
                        i3++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i21};
        int i23 = ~i;
        int i24 = i20 + (-1603944958) + (((~(i23 | 933362170)) | (-1073741307)) * (-160)) + (((~(i23 | (-771669289))) | 933362170) * 160);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        int i27 = ((int[]) new Object[]{new int[]{i26 ^ (i26 << 5)}, new int[]{i22}, iArr2, strArr3}[0])[0];
        int i28 = i27 * i27;
        int i29 = -(1187420620 * i27);
        int i30 = ((((i28 | i29) << 1) - (i28 ^ i29)) - (~(-(i27 * 1897148610)))) - 1;
        int i31 = ((i30 | 663165361) << 1) - (663165361 ^ i30);
        int i32 = i31 >> 24;
        int i33 = ((i32 ^ (-511)) + ((i32 & (-511)) << 1)) / 256;
        int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
        int i35 = ((i31 | i34) << 1) - (i34 ^ i31);
        int i36 = ((i31 >> 25) - 255) / 128;
        int i37 = -(i35 ^ ((i36 & 1) + (i36 | 1)));
        int i38 = (i37 & 9) + (i37 | 9);
        if (j >= ((long) (6743700 / (((-((((i38 >> 16) - 131071) / 65536) + 2)) & i38) * 1180))) - 635) {
            return new ObservableTakeLastTimed(this, j, j2, timeUnit, appendbackupvideoprofile, i, z);
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was ".concat(String.valueOf(j)));
    }

    public final VideoRecordEventStart<T> takeLast(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        VideoRecordEventStart<T> videoRecordEventStartTakeLast = i2 % 2 != 0 ? takeLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), true, bufferSize()) : takeLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return videoRecordEventStartTakeLast;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> takeLast(long j, TimeUnit timeUnit, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return takeLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), z, bufferSize());
        }
        takeLast(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), z, bufferSize());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> takeLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        VideoRecordEventStart<T> videoRecordEventStartTakeLast = i2 % 2 == 0 ? takeLast(j, timeUnit, appendbackupvideoprofile, false, bufferSize()) : takeLast(j, timeUnit, appendbackupvideoprofile, false, bufferSize());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartTakeLast;
    }

    public final VideoRecordEventStart<T> takeLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTakeLast = takeLast(j, timeUnit, appendbackupvideoprofile, z, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartTakeLast;
    }

    public final VideoRecordEventStart<T> takeLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return takeLast(Long.MAX_VALUE, j, timeUnit, appendbackupvideoprofile, z, i);
        }
        takeLast(Long.MAX_VALUE, j, timeUnit, appendbackupvideoprofile, z, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U> VideoRecordEventStart<T> takeUntil(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        ObservableTakeUntil observableTakeUntil = new ObservableTakeUntil(this, autoValue_VideoValidatedEncoderProfilesProxy);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return observableTakeUntil;
    }

    public final VideoRecordEventStart<T> takeUntil(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "stopPredicate is null");
        BufferedAudioStreamExternalSyntheticLambda2 bufferedAudioStreamExternalSyntheticLambda2 = new BufferedAudioStreamExternalSyntheticLambda2(this, findqualityintargetqualities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return bufferedAudioStreamExternalSyntheticLambda2;
    }

    public final VideoRecordEventStart<T> takeWhile(findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        int i = 2 % 2;
        share.b(findqualityintargetqualities, "predicate is null");
        lambdastop1androidxcameravideointernalaudioBufferedAudioStream lambdastop1androidxcameravideointernalaudiobufferedaudiostream = new lambdastop1androidxcameravideointernalaudioBufferedAudioStream(this, findqualityintargetqualities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return lambdastop1androidxcameravideointernalaudiobufferedaudiostream;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> throttleFirst(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throttleFirst(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartThrottleFirst = throttleFirst(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartThrottleFirst;
    }

    /* JADX INFO: renamed from: VideoRecordEventStart$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            b = iArr;
            try {
                iArr[BackpressureStrategy.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[BackpressureStrategy.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[BackpressureStrategy.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[BackpressureStrategy.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public final VideoRecordEventStart<T> throttleFirst(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableThrottleFirstTimed observableThrottleFirstTimed = new ObservableThrottleFirstTimed(this, j, timeUnit, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableThrottleFirstTimed;
    }

    public final VideoRecordEventStart<T> throttleLast(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartSample = sample(j, timeUnit);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartSample;
    }

    public final VideoRecordEventStart<T> throttleLast(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartSample = sample(j, timeUnit, appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartSample;
    }

    public final VideoRecordEventStart<T> throttleLatest(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        VideoRecordEventStart<T> videoRecordEventStartThrottleLatest = i2 % 2 == 0 ? throttleLatest(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), false) : throttleLatest(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), false);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartThrottleLatest;
    }

    public final VideoRecordEventStart<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return throttleLatest(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), z);
        }
        throttleLatest(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> throttleLatest(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartThrottleLatest = throttleLatest(j, timeUnit, appendbackupvideoprofile, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartThrottleLatest;
    }

    public final VideoRecordEventStart<T> throttleLatest(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableThrottleLatest observableThrottleLatest = new ObservableThrottleLatest(this, j, timeUnit, appendbackupvideoprofile, z);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return observableThrottleLatest;
    }

    public final VideoRecordEventStart<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return debounce(j, timeUnit);
        }
        debounce(j, timeUnit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> throttleWithTimeout(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartDebounce = debounce(j, timeUnit, appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartDebounce;
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timeInterval() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (i3 == 0) {
            return timeInterval(timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        timeInterval(timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        throw null;
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timeInterval(appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<isSamsungJ4<T>> videoRecordEventStartTimeInterval = timeInterval(TimeUnit.MILLISECONDS, appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartTimeInterval;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timeInterval(TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<isSamsungJ4<T>> videoRecordEventStartTimeInterval = timeInterval(timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartTimeInterval;
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timeInterval(TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        getRemainingBufferSizeInBytes getremainingbuffersizeinbytes = new getRemainingBufferSizeInBytes(this, timeUnit, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return getremainingbuffersizeinbytes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <V> VideoRecordEventStart<T> timeout(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(null, readablems, null);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return videoRecordEventStartTimeout0;
    }

    public final <V> VideoRecordEventStart<T> timeout(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(null, readablems, autoValue_VideoValidatedEncoderProfilesProxy);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartTimeout0;
        }
        throw null;
    }

    public final VideoRecordEventStart<T> timeout(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (i3 != 0) {
            timeout0(j, timeUnit, null, appendbackupvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(j, timeUnit, null, appendbackupvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartTimeout0;
        }
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<T> timeout(long j, TimeUnit timeUnit, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
            timeout0(j, timeUnit, autoValue_VideoValidatedEncoderProfilesProxy, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(j, timeUnit, autoValue_VideoValidatedEncoderProfilesProxy, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
        return videoRecordEventStartTimeout0;
    }

    public final VideoRecordEventStart<T> timeout(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(j, timeUnit, autoValue_VideoValidatedEncoderProfilesProxy, appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartTimeout0;
    }

    public final VideoRecordEventStart<T> timeout(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(j, timeUnit, null, appendbackupvideoprofile);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return videoRecordEventStartTimeout0;
    }

    public final <U, V> VideoRecordEventStart<T> timeout(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "firstTimeoutIndicator is null");
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(autoValue_VideoValidatedEncoderProfilesProxy, readablems, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return videoRecordEventStartTimeout0;
    }

    public final <U, V> VideoRecordEventStart<T> timeout(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(autoValue_VideoValidatedEncoderProfilesProxy, "firstTimeoutIndicator is null");
            share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "other is null");
            timeout0(autoValue_VideoValidatedEncoderProfilesProxy, readablems, autoValue_VideoValidatedEncoderProfilesProxy2);
            throw null;
        }
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "firstTimeoutIndicator is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "other is null");
        VideoRecordEventStart<T> videoRecordEventStartTimeout0 = timeout0(autoValue_VideoValidatedEncoderProfilesProxy, readablems, autoValue_VideoValidatedEncoderProfilesProxy2);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartTimeout0;
    }

    private VideoRecordEventStart<T> timeout0(long j, TimeUnit timeUnit, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(timeUnit, "timeUnit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableTimeoutTimed observableTimeoutTimed = new ObservableTimeoutTimed(this, j, timeUnit, appendbackupvideoprofile, autoValue_VideoValidatedEncoderProfilesProxy);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableTimeoutTimed;
        }
        throw null;
    }

    private <U, V> VideoRecordEventStart<T> timeout0(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        int i = 2 % 2;
        share.b(readablems, "itemTimeoutIndicator is null");
        ObservableTimeout observableTimeout = new ObservableTimeout(this, autoValue_VideoValidatedEncoderProfilesProxy, readablems, autoValue_VideoValidatedEncoderProfilesProxy2);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return observableTimeout;
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timestamp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<isSamsungJ4<T>> videoRecordEventStartTimestamp = timestamp(TimeUnit.MILLISECONDS, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartTimestamp;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x020e  */
    public final VideoRecordEventStart<isSamsungJ4<T>> timestamp(appendBackupVideoProfile appendbackupvideoprofile) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            c((byte) (bArr[15] - 1), bArr[27], (short) 121, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, packedPositionGroup, keyRepeatTimeout, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, Color.alpha(0) + 57973, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (KeyEvent.getMaxKeyCode() >> 16) + 4447, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i4 = 876 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
            Object[] objArr5 = new Object[1];
            c((byte) 52, $$d[27], (short) 69, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i4, fadingEdgeLength, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                int iAlpha = Color.alpha(0) + 876;
                int iRgb = Color.rgb(0, 0, 0) + 16777226;
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                c((byte) 52, bArr2[27], (short) (-bArr2[7]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity2, iAlpha, iRgb, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyUid = Process.myUid();
            int i5 = ~iMyUid;
            int i6 = (((((~(754085090 | i5)) | (~((-794395320) | iMyUid))) | (~(i5 | 794395319))) * 959) - 1580675864) + (((~(iMyUid | 794395319)) | (~(i5 | (-794395320))) | (~(754085090 | iMyUid))) * 959) + 1786372346;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{55358, 43134, 14501, 35008, 6412, 59837, 31201, 51800, 23110, 10984, 47929, 2836, 39850, 27711, 64633, 19607, 56537, 44297, 15781, 36347, 7719, 61004, 32487, 53027, 24406, 12172}, (Process.myTid() >> 22) + 28751, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{55356, 24653, 43235, 61720, 14758, 16946, 35393, 53967, 6935, 41904, 60469, 13403, 31976, 34053, 52617, 5695, 24128, 59110}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47207, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    if (i9 % 2 != 0) {
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
            e(new char[]{55349, 14695, 6811, 31797, 23829, 48782, 36904, 61790, 54000, 13392, 5494, 30453, 18432, 43438, 35556, 60421}, 57688 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{55350, 14574, 6544, 31310, 23423, 48159, 40149, 65013, 57023, 16195, 4222, 28944, 20960, 45793, 37789, 62529}, 57557 - Color.alpha(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            int i11 = i10 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1786372346};
                byte[] bArr3 = $$j;
                Object[] objArr13 = new Object[1];
                f((short) 280, (byte) (-bArr3[240]), bArr3[137], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((short) 326, bArr3[198], bArr3[324], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                        byte[] bArr4 = $$d;
                        Object[] objArr15 = new Object[1];
                        c((byte) 52, bArr4[27], (short) (-bArr4[7]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, tapTimeout, deadChar, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - TextUtils.indexOf("", "", 0, 0), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4447, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iRed = Color.red(0) + 876;
                            int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0');
                            Object[] objArr18 = new Object[1];
                            c((byte) 52, $$d[27], (short) 69, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength2, iRed, iLastIndexOf, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                            byte[] bArr5 = $$d;
                            Object[] objArr19 = new Object[1];
                            c((byte) (bArr5[15] - 1), bArr5[27], (short) 121, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, absoluteGravity, i15, -1650998592, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i17 = ~startUptimeMillis;
        int i18 = 1029641396 + (((~((-50931289) | i17)) | (~((-280367272) | startUptimeMillis))) * 520);
        int i19 = ~(280367271 | i17);
        int i20 = ~(startUptimeMillis | 320677500);
        int i21 = i16 + i18 + ((i19 | i20) * (-1040)) + ((i20 | (~(i17 | (-320677501))) | (-331298560)) * 520);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr20[1])[0] = i23 ^ (i23 << 5);
        return timestamp(TimeUnit.MILLISECONDS, appendbackupvideoprofile);
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timestamp(TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<isSamsungJ4<T>> videoRecordEventStartTimestamp = timestamp(timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<isSamsungJ4<T>> timestamp(TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(timeUnit, "unit is null");
        share.b(appendbackupvideoprofile, "scheduler is null");
        VideoRecordEventStart<isSamsungJ4<T>> videoRecordEventStart = (VideoRecordEventStart<isSamsungJ4<T>>) map(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(timeUnit, appendbackupvideoprofile));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStart;
    }

    public final <R> R to(readableMs<? super VideoRecordEventStart<T>, R> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        try {
            R r = (R) ((readableMs) share.b(readablems, "converter is null")).apply(this);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return r;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
    }

    public final deriveCodec<List<T>> toList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        deriveCodec<List<T>> list = toList(16);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final deriveCodec<List<T>> toList(int i) {
        int i2 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "capacityHint");
        BufferedAudioStreamExternalSyntheticLambda4 bufferedAudioStreamExternalSyntheticLambda4 = new BufferedAudioStreamExternalSyntheticLambda4(this, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return bufferedAudioStreamExternalSyntheticLambda4;
        }
        throw null;
    }

    public final <U extends Collection<? super T>> deriveCodec<U> toList(Callable<U> callable) {
        int i = 2 % 2;
        share.b(callable, "collectionSupplier is null");
        BufferedAudioStreamExternalSyntheticLambda4 bufferedAudioStreamExternalSyntheticLambda4 = new BufferedAudioStreamExternalSyntheticLambda4(this, callable);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return bufferedAudioStreamExternalSyntheticLambda4;
    }

    public final <K> deriveCodec<Map<K, T>> toMap(readableMs<? super T, ? extends K> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            share.b(readablems, "keySelector is null");
            return (deriveCodec<Map<K, T>>) collect(HashMapSupplier.TuitionPaymentFragmentbindingInflater1(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((readableMs) readablems));
        }
        share.b(readablems, "keySelector is null");
        collect(HashMapSupplier.TuitionPaymentFragmentbindingInflater1(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((readableMs) readablems));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <K, V> deriveCodec<Map<K, V>> toMap(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(readablems, "keySelector is null");
        share.b(readablems2, "valueSelector is null");
        deriveCodec<Map<K, V>> derivecodec = (deriveCodec<Map<K, V>>) collect(HashMapSupplier.TuitionPaymentFragmentbindingInflater1(), Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(readablems, readablems2));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return derivecodec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> deriveCodec<Map<K, V>> toMap(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, Callable<? extends Map<K, V>> callable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(readablems, "keySelector is null");
        share.b(readablems2, "valueSelector is null");
        share.b(callable, "mapSupplier is null");
        deriveCodec<Map<K, V>> derivecodec = (deriveCodec<Map<K, V>>) collect(callable, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(readablems, readablems2));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return derivecodec;
    }

    public final <K> deriveCodec<Map<K, Collection<T>>> toMultimap(readableMs<? super T, ? extends K> readablems) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        deriveCodec<Map<K, Collection<T>>> derivecodec = (deriveCodec<Map<K, Collection<T>>>) toMultimap(readablems, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), HashMapSupplier.TuitionPaymentFragmentbindingInflater1(), ArrayListSupplier.TuitionPaymentFragmentbindingInflater1());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return derivecodec;
    }

    public final <K, V> deriveCodec<Map<K, Collection<V>>> toMultimap(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2) {
        deriveCodec<Map<K, Collection<V>>> multimap;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            multimap = toMultimap(readablems, readablems2, HashMapSupplier.TuitionPaymentFragmentbindingInflater1(), ArrayListSupplier.TuitionPaymentFragmentbindingInflater1());
            int i3 = 85 / 0;
        } else {
            multimap = toMultimap(readablems, readablems2, HashMapSupplier.TuitionPaymentFragmentbindingInflater1(), ArrayListSupplier.TuitionPaymentFragmentbindingInflater1());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return multimap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> deriveCodec<Map<K, Collection<V>>> toMultimap(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, Callable<? extends Map<K, Collection<V>>> callable, readableMs<? super K, ? extends Collection<? super V>> readablems3) {
        deriveCodec<Map<K, Collection<V>>> derivecodec;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            share.b(readablems, "keySelector is null");
            share.b(readablems2, "valueSelector is null");
            share.b(callable, "mapSupplier is null");
            share.b(readablems3, "collectionFactory is null");
            derivecodec = (deriveCodec<Map<K, Collection<V>>>) collect(callable, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(readablems, readablems2, readablems3));
            int i3 = 50 / 0;
        } else {
            share.b(readablems, "keySelector is null");
            share.b(readablems2, "valueSelector is null");
            share.b(callable, "mapSupplier is null");
            share.b(readablems3, "collectionFactory is null");
            derivecodec = (deriveCodec<Map<K, Collection<V>>>) collect(callable, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(readablems, readablems2, readablems3));
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return derivecodec;
        }
        throw null;
    }

    public final <K, V> deriveCodec<Map<K, Collection<V>>> toMultimap(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, Callable<Map<K, Collection<V>>> callable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        deriveCodec<Map<K, Collection<V>>> multimap = toMultimap(readablems, readablems2, callable, ArrayListSupplier.TuitionPaymentFragmentbindingInflater1());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return multimap;
    }

    public final VideoRecordEvent<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        int i = 2 % 2;
        lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource lambdasetbufferprovider0androidxcameravideointernalaudioaudiosource = new lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource(this);
        int i2 = AnonymousClass1.b[backpressureStrategy.ordinal()];
        if (i2 != 1) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (i2 == 2) {
                return new FlowableOnBackpressureLatest(lambdasetbufferprovider0androidxcameravideointernalaudioaudiosource);
            }
            if (i2 == 3) {
                return lambdasetbufferprovider0androidxcameravideointernalaudioaudiosource;
            }
            if (i2 == 4) {
                return new FlowableOnBackpressureError(lambdasetbufferprovider0androidxcameravideointernalaudioaudiosource);
            }
            int iB = VideoRecordEvent.b();
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, "capacity");
            return new FlowableOnBackpressureBuffer(lambdasetbufferprovider0androidxcameravideointernalaudioaudiosource, iB, true, false, Functions.TuitionPaymentFragmentbindingInflater1);
        }
        FlowableOnBackpressureDrop flowableOnBackpressureDrop = new FlowableOnBackpressureDrop(lambdasetbufferprovider0androidxcameravideointernalaudioaudiosource);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return flowableOnBackpressureDrop;
        }
        throw null;
    }

    public final deriveCodec<List<T>> toSortedList() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        deriveCodec<List<T>> sortedList = toSortedList(Functions.asInterface());
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return sortedList;
    }

    public final deriveCodec<List<T>> toSortedList(Comparator<? super T> comparator) {
        int i = 2 % 2;
        share.b(comparator, "comparator is null");
        deriveCodec<List<T>> list = toList();
        readableMs readablemsTuitionPaymentFragmentbindingInflater1 = Functions.TuitionPaymentFragmentbindingInflater1((Comparator) comparator);
        share.b(readablemsTuitionPaymentFragmentbindingInflater1, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(list, readablemsTuitionPaymentFragmentbindingInflater1);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    public final deriveCodec<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        int i2 = 2 % 2;
        share.b(comparator, "comparator is null");
        deriveCodec<List<T>> list = toList(i);
        readableMs readablemsTuitionPaymentFragmentbindingInflater1 = Functions.TuitionPaymentFragmentbindingInflater1((Comparator) comparator);
        share.b(readablemsTuitionPaymentFragmentbindingInflater1, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(list, readablemsTuitionPaymentFragmentbindingInflater1);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return api23Impl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deriveCodec<List<T>> toSortedList(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            toSortedList(Functions.asInterface(), i);
            throw null;
        }
        deriveCodec<List<T>> sortedList = toSortedList(Functions.asInterface(), i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return sortedList;
    }

    public final VideoRecordEventStart<T> unsubscribeOn(appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        share.b(appendbackupvideoprofile, "scheduler is null");
        ObservableUnsubscribeOn observableUnsubscribeOn = new ObservableUnsubscribeOn(this, appendbackupvideoprofile);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
        return observableUnsubscribeOn;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return window(j, j, bufferSize());
        }
        window(j, j, bufferSize());
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, long j2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(j, j2, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWindow;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, long j2, int i) {
        int i2 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j, "count");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j2, "skip");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableWindow observableWindow = new ObservableWindow(this, j, j2, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableWindow;
        }
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, long j2, TimeUnit timeUnit) {
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            videoRecordEventStartWindow = window(j, j2, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), bufferSize());
            int i3 = 88 / 0;
        } else {
            videoRecordEventStartWindow = window(j, j2, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), bufferSize());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartWindow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(j, j2, timeUnit, appendbackupvideoprofile, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWindow;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i) {
        int i2 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j, "timespan");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j2, "timeskip");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.b(timeUnit, "unit is null");
        BufferedAudioStreamExternalSyntheticLambda5 bufferedAudioStreamExternalSyntheticLambda5 = new BufferedAudioStreamExternalSyntheticLambda5(this, j, j2, timeUnit, appendbackupvideoprofile, Long.MAX_VALUE, i, false);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return bufferedAudioStreamExternalSyntheticLambda5;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = i2 % 2 == 0 ? window(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Long.MAX_VALUE, false) : window(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), Long.MAX_VALUE, false);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return videoRecordEventStartWindow;
        }
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit, long j2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), j2, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return videoRecordEventStartWindow;
        }
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            window(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), j2, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(j, timeUnit, isSamsungJ2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), j2, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartWindow;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = i2 % 2 != 0 ? window(j, timeUnit, appendbackupvideoprofile, Long.MAX_VALUE, true) : window(j, timeUnit, appendbackupvideoprofile, Long.MAX_VALUE, false);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartWindow;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, long j2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(j, timeUnit, appendbackupvideoprofile, j2, false);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWindow;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            return window(j, timeUnit, appendbackupvideoprofile, j2, z, bufferSize());
        }
        window(j, timeUnit, appendbackupvideoprofile, j2, z, bufferSize());
        throw null;
    }

    public final VideoRecordEventStart<VideoRecordEventStart<T>> window(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, long j2, boolean z, int i) {
        int i2 = 2 % 2;
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        share.b(appendbackupvideoprofile, "scheduler is null");
        share.b(timeUnit, "unit is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j2, "count");
        BufferedAudioStreamExternalSyntheticLambda5 bufferedAudioStreamExternalSyntheticLambda5 = new BufferedAudioStreamExternalSyntheticLambda5(this, j, j, timeUnit, appendbackupvideoprofile, j2, i, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return bufferedAudioStreamExternalSyntheticLambda5;
    }

    public final <B> VideoRecordEventStart<VideoRecordEventStart<T>> window(AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(autoValue_VideoValidatedEncoderProfilesProxy, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWindow;
    }

    public final <B> VideoRecordEventStart<VideoRecordEventStart<T>> window(AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "boundary is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableWindowBoundary observableWindowBoundary = new ObservableWindowBoundary(this, autoValue_VideoValidatedEncoderProfilesProxy, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return observableWindowBoundary;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0200  */
    public final <U, V> VideoRecordEventStart<VideoRecordEventStart<T>> window(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super U, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf = 876 - TextUtils.indexOf("", "", 0);
            int iIndexOf2 = TextUtils.indexOf("", "") + 10;
            byte[] bArr = $$d;
            byte b = bArr[24];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b + 5), (short) (-bArr[7]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, iIndexOf2, 252381699, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57974 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, 4447 - (ViewConfiguration.getTapTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
            int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
            Object[] objArr5 = new Object[1];
            c((byte) 52, $$d[27], (short) 158, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i2, offsetBefore, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b2 = $$d[24];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, (short) (b3 | 210), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, iMakeMeasureSpec, tapTimeout, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = 1329356762 + (((~(848766056 | iIdentityHashCode)) | 889076285) * (-366)) + (((~(iIdentityHashCode | 922697341)) | 815145000) * 366) + 1975347244;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{55358, 43134, 14501, 35008, 6412, 59837, 31201, 51800, 23110, 10984, 47929, 2836, 39850, 27711, 64633, 19607, 56537, 44297, 15781, 36347, 7719, 61004, 32487, 53027, 24406, 12172}, 28751 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{55356, 24653, 43235, 61720, 14758, 16946, 35393, 53967, 6935, 41904, 60469, 13403, 31976, 34053, 52617, 5695, 24128, 59110}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47206, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    if (i6 % 2 != 0) {
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
            e(new char[]{55349, 14695, 6811, 31797, 23829, 48782, 36904, 61790, 54000, 13392, 5494, 30453, 18432, 43438, 35556, 60421}, 57689 - ExpandableListView.getPackedPositionType(0L), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{55350, 14574, 6544, 31310, 23423, 48159, 40149, 65013, 57023, 16195, 4222, 28944, 20960, 45793, 37789, 62529}, (KeyEvent.getMaxKeyCode() >> 16) + 57557, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1975347244};
                short s = (short) ($$k | 322);
                byte[] bArr2 = $$j;
                Object[] objArr13 = new Object[1];
                f(s, (byte) (s & 172), bArr2[21], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((short) 85, bArr2[198], bArr2[324], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iAxisFromString = 875 - MotionEvent.axisFromString("");
                        int i7 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b4 = $$d[24];
                        byte b5 = b4;
                        Object[] objArr15 = new Object[1];
                        c(b4, b5, (short) (b5 | 210), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAxisFromString, i7, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{55358, 14916, 7377, 32626, 20964, 46207, 38533, 59714, 52120, 11825, 227, 25355, 17754, 42973, 47693, 40161, 65378, 53721, 13321, 5791, 26904, 19373}, 57973 - TextUtils.getTrimmedLength(""), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{55354, 51564, 64128, 60466, 40272, 36577, 45057, 41364, 21186, 17513, 30085, 26430, 2114, 14817, 11016}, Color.blue(0) + 4447, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            Object[] objArr18 = new Object[1];
                            c((byte) 52, $$d[27], (short) 158, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, doubleTapTimeout, pressedStateDuration, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int size = 876 - View.MeasureSpec.getSize(0);
                            int i8 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte[] bArr3 = $$d;
                            byte b6 = bArr3[24];
                            Object[] objArr19 = new Object[1];
                            c(b6, (byte) (b6 + 5), (short) (-bArr3[7]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, size, i8, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i9 = ((int[]) objArr[2])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 != i9) {
            throw new RuntimeException(String.valueOf(i10));
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((int[]) objArr[1])[0];
        Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i14 = i13 + (((~(iUptimeMillis | (-733677433))) * TypedValues.CycleType.TYPE_EASING) - 1285067584) + (((~((~iUptimeMillis) | (-733677433))) | 67115013) * TypedValues.CycleType.TYPE_EASING);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr20[1])[0] = i16 ^ (i16 << 5);
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 3 / 4;
        }
        return window(autoValue_VideoValidatedEncoderProfilesProxy, readablems, bufferSize());
    }

    public final <U, V> VideoRecordEventStart<VideoRecordEventStart<T>> window(AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super U, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, int i) {
        int i2 = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "openingIndicator is null");
        share.b(readablems, "closingIndicator is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        BufferedAudioStreamExternalSyntheticLambda3 bufferedAudioStreamExternalSyntheticLambda3 = new BufferedAudioStreamExternalSyntheticLambda3(this, autoValue_VideoValidatedEncoderProfilesProxy, readablems, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return bufferedAudioStreamExternalSyntheticLambda3;
    }

    public final <B> VideoRecordEventStart<VideoRecordEventStart<T>> window(Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        VideoRecordEventStart<VideoRecordEventStart<T>> videoRecordEventStartWindow = window(callable, bufferSize());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWindow;
    }

    public final <B> VideoRecordEventStart<VideoRecordEventStart<T>> window(Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable, int i) {
        int i2 = 2 % 2;
        share.b(callable, "boundary is null");
        share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "bufferSize");
        ObservableWindowBoundarySupplier observableWindowBoundarySupplier = new ObservableWindowBoundarySupplier(this, callable, i);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            return observableWindowBoundarySupplier;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <U, R> VideoRecordEventStart<R> withLatestFrom(AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        share.b(dumpcodeccapabilities, "combiner is null");
        ObservableWithLatestFrom observableWithLatestFrom = new ObservableWithLatestFrom(this, dumpcodeccapabilities, autoValue_VideoValidatedEncoderProfilesProxy);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableWithLatestFrom;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <T1, T2, R> VideoRecordEventStart<R> withLatestFrom(AutoValue_VideoValidatedEncoderProfilesProxy<T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<T2> autoValue_VideoValidatedEncoderProfilesProxy2, stringToLog<? super T, ? super T1, ? super T2, R> stringtolog) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "o1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "o2 is null");
        share.b(stringtolog, "combiner is null");
        VideoRecordEventStart<R> videoRecordEventStartWithLatestFrom = withLatestFrom(new AutoValue_VideoValidatedEncoderProfilesProxy[]{autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2}, Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3((stringToLog) stringtolog));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return videoRecordEventStartWithLatestFrom;
        }
        throw null;
    }

    public final <T1, T2, T3, R> VideoRecordEventStart<R> withLatestFrom(AutoValue_VideoValidatedEncoderProfilesProxy<T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<T3> autoValue_VideoValidatedEncoderProfilesProxy3, exploreProfiles<? super T, ? super T1, ? super T2, ? super T3, R> exploreprofiles) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "o1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "o2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "o3 is null");
        share.b(exploreprofiles, "combiner is null");
        VideoRecordEventStart<R> videoRecordEventStartWithLatestFrom = withLatestFrom(new AutoValue_VideoValidatedEncoderProfilesProxy[]{autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3}, Functions.TuitionPaymentFragmentbindingInflater1((exploreProfiles) exploreprofiles));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWithLatestFrom;
    }

    public final <T1, T2, T3, T4, R> VideoRecordEventStart<R> withLatestFrom(AutoValue_VideoValidatedEncoderProfilesProxy<T1> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<T2> autoValue_VideoValidatedEncoderProfilesProxy2, AutoValue_VideoValidatedEncoderProfilesProxy<T3> autoValue_VideoValidatedEncoderProfilesProxy3, AutoValue_VideoValidatedEncoderProfilesProxy<T4> autoValue_VideoValidatedEncoderProfilesProxy4, QualityExploredEncoderProfilesProvider<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> qualityExploredEncoderProfilesProvider) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "o1 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy2, "o2 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy3, "o3 is null");
        share.b(autoValue_VideoValidatedEncoderProfilesProxy4, "o4 is null");
        share.b(qualityExploredEncoderProfilesProvider, "combiner is null");
        VideoRecordEventStart<R> videoRecordEventStartWithLatestFrom = withLatestFrom(new AutoValue_VideoValidatedEncoderProfilesProxy[]{autoValue_VideoValidatedEncoderProfilesProxy, autoValue_VideoValidatedEncoderProfilesProxy2, autoValue_VideoValidatedEncoderProfilesProxy3, autoValue_VideoValidatedEncoderProfilesProxy4}, Functions.b(qualityExploredEncoderProfilesProvider));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordEventStartWithLatestFrom;
    }

    public final <R> VideoRecordEventStart<R> withLatestFrom(AutoValue_VideoValidatedEncoderProfilesProxy<?>[] autoValue_VideoValidatedEncoderProfilesProxyArr, readableMs<? super Object[], R> readablems) {
        int i = 2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxyArr, "others is null");
        share.b(readablems, "combiner is null");
        ObservableWithLatestFromMany observableWithLatestFromMany = new ObservableWithLatestFromMany(this, autoValue_VideoValidatedEncoderProfilesProxyArr, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return observableWithLatestFromMany;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R> VideoRecordEventStart<R> withLatestFrom(Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> iterable, readableMs<? super Object[], R> readablems) {
        int i = 2 % 2;
        share.b(iterable, "others is null");
        share.b(readablems, "combiner is null");
        ObservableWithLatestFromMany observableWithLatestFromMany = new ObservableWithLatestFromMany(this, iterable, readablems);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return observableWithLatestFromMany;
    }

    public final <U, R> VideoRecordEventStart<R> zipWith(Iterable<U> iterable, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        share.b(iterable, "other is null");
        share.b(dumpcodeccapabilities, "zipper is null");
        writeSilenceToBuffer writesilencetobuffer = new writeSilenceToBuffer(this, iterable, dumpcodeccapabilities);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return writesilencetobuffer;
    }

    public final <U, R> VideoRecordEventStart<R> zipWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        share.b(autoValue_VideoValidatedEncoderProfilesProxy, "other is null");
        VideoRecordEventStart<R> videoRecordEventStartZip = zip(this, autoValue_VideoValidatedEncoderProfilesProxy, dumpcodeccapabilities);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return videoRecordEventStartZip;
    }

    public final <U, R> VideoRecordEventStart<R> zipWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zip(this, autoValue_VideoValidatedEncoderProfilesProxy, dumpcodeccapabilities, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordEventStart<R> videoRecordEventStartZip = zip(this, autoValue_VideoValidatedEncoderProfilesProxy, dumpcodeccapabilities, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordEventStartZip;
    }

    public final <U, R> VideoRecordEventStart<R> zipWith(AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy, dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordEventStart<R> videoRecordEventStartZip = zip(this, autoValue_VideoValidatedEncoderProfilesProxy, dumpcodeccapabilities, z, i);
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        return videoRecordEventStartZip;
    }

    public final TestObserver<T> test() {
        int i = 2 % 2;
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe(testObserver);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return testObserver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TestObserver<T> test(boolean z) {
        int i = 2 % 2;
        TestObserver<T> testObserver = new TestObserver<>();
        if (z) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            testObserver.dispose();
        }
        subscribe(testObserver);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return testObserver;
    }
}
