package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004:;<=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00142\n\u0010\u001f\u001a\u00060!j\u0002` H\u0004¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0014H\u0016J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\n\u0010\u001f\u001a\u00060!j\u0002` ¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u00020\u00182\n\u0010)\u001a\u00060!j\u0002` H\u0016¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\r2\n\u0010)\u001a\u00060!j\u0002` H\u0002¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\n\u0018\u00010!j\u0004\u0018\u0001` H\u0002¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0018H\u0002J\b\u00100\u001a\u00020\u0018H\u0002J\u0016\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020\r2\u0006\u0010)\u001a\u000204H\u0002J\u0018\u00106\u001a\u0002072\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u000204H\u0002J\b\u00108\u001a\u00020\u0018H\u0004J\b\u00109\u001a\u00020\u0018H\u0002R\u0011\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006>"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "_queue", "Lkotlinx/atomicfu/AtomicRef;", "", "_delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", "value", "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "shutdown", "", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "processNextEvent", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "enqueue", "task", "(Ljava/lang/Runnable;)V", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "dequeue", "()Ljava/lang/Runnable;", "enqueueDelayedTasks", "closeQueue", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "shouldUnpark", "scheduleImpl", "", "resetAll", "rescheduleAllDelayed", "DelayedTask", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AutoValue_AudioMimeInfo1 extends AutoValue_AudioMimeInfo implements selectSampleRateOrNearestSupported {
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final /* synthetic */ AtomicReferenceFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    private static final byte[] $$l = {7, 15, 25, 25};
    private static final int $$m = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {55, -47, -47, 67, -7, -8, 5, 0, -8, Base64.padSymbol, -72, 11, -15, -7, 13, -12, 8, -5, -17, 66, -40, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 18, -3, -3, 9, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 77, -76, 1, -8, -10, -1, 76, -16, 10, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
    private static final int $$k = 21;
    private static final byte[] $$d = {88, 99, -94, -58, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 203;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f78a = 0;
    private static int asInterface = 1;
    private static int asBinder = 0;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i6) | i7 | i2);
        int i9 = (~(i7 | (~i2))) | (~(i2 | i6));
        int i10 = (~(i6 | i3)) | i2;
        int i11 = i2 + i3 + i + ((-407681510) * i4) + ((-298114539) * i5);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i2) + 672923648 + (2103481690 * i3) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i) + ((-328728576) * i4) + ((-2108424192) * i5) + ((-1296629760) * i12);
        int i14 = ((i2 * 57881544) - 1472685786) + (i3 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) + (i * 57881749) + (i4 * 289608994) + (i5 * 969284153) + (i12 * 813891584);
        return i13 + ((i14 * i14) * 454098944) != 1 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    private static void h(int i, short s, int i2, Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = (s * 52) + 4;
        int i4 = (i2 * 14) + 84;
        byte[] bArr2 = new byte[i + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i3 + i4) - 10;
        }
        while (true) {
            int i6 = i4;
            int i7 = i3;
            i5++;
            bArr2[i5] = (byte) i6;
            if (i5 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i7 + 1;
                i4 = (i6 + bArr[i7]) - 10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 23
            int r9 = 76 - r9
            int r8 = r8 * 23
            int r8 = r8 + 84
            byte[] r0 = defpackage.AutoValue_AudioMimeInfo1.$$j
            int r7 = r7 * 75
            int r7 = 79 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r3 = r3 + r8
            int r7 = r7 + 1
            int r8 = r3 + (-3)
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AutoValue_AudioMimeInfo1.j(byte, short, short, java.lang.Object[]):void");
    }

    private static void i(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 51;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 9;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 64838), 1356 - TextUtils.getOffsetBefore("", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, 894276454, false, $$n(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 47773), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 468, 13 - (ViewConfiguration.getEdgeSlop() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_AudioMimeInfo1 autoValue_AudioMimeInfo1) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = f78a + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {autoValue_AudioMimeInfo1};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (i3 == 0) {
            zBooleanValue = ((Boolean) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, objArr, 988108801, -988108801, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault6, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue();
            int i4 = 17 / 0;
        } else {
            zBooleanValue = ((Boolean) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, objArr, 988108801, -988108801, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault6, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue();
        }
        int i5 = f78a + 117;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Runnable runnable, CoroutineContext coroutineContext) {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        f78a = i2 % 128;
        int i3 = i2 % 2;
        setCompatibleAudioProfile setcompatibleaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = resolveAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, runnable, coroutineContext);
        int i4 = f78a + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return setcompatibleaudioprofileTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        AutoValue_AudioMimeInfo1 autoValue_AudioMimeInfo1 = (AutoValue_AudioMimeInfo1) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 15;
        f78a = i2 % 128;
        int i3 = i2 % 2;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(autoValue_AudioMimeInfo1) != 0) {
            int i4 = f78a + 79;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = f78a + 77;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // defpackage.AutoValue_AudioMimeInfoBuilder
    protected final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f78a + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque = this.b;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ArrayDeque<AudioConfigUtilExternalSyntheticLambda0<?>> arrayDeque2 = this.b;
        if (arrayDeque2 == null || arrayDeque2.isEmpty()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) TuitionPaymentFragmentbindingInflater1.get(this);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && !tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1()) {
                return false;
            }
            Object obj2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(this);
            if (obj2 == null) {
                return true;
            }
            if (!(obj2 instanceof updatePauseRangeStateAndCheckIfBufferPaused)) {
                if (obj2 != AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentbindingInflater1) {
                    return false;
                }
                int i3 = f78a + 125;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            long j = updatePauseRangeStateAndCheckIfBufferPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get((updatePauseRangeStateAndCheckIfBufferPaused) obj2);
            return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
        }
        int i5 = f78a + 51;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (((int) (1073741823 - r11)) == ((int) ((r11 | 1152921503533105152L) << 42))) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (((int) (1073741823 & r11)) == ((int) ((r11 & 1152921503533105152L) >> 30))) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        return 0L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[] r13) {
        /*
            r0 = 0
            r13 = r13[r0]
            AutoValue_AudioMimeInfo1 r13 = (defpackage.AutoValue_AudioMimeInfo1) r13
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.AutoValue_AudioMimeInfo1.asInterface
            int r1 = r1 + 109
            int r2 = r1 % 128
            defpackage.AutoValue_AudioMimeInfo1.f78a = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L20
            long r4 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            r6 = 1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L2d
            goto L28
        L20:
            long r4 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L2d
        L28:
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            return r13
        L2d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.AutoValue_AudioMimeInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Object r1 = r1.get(r13)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L90
            boolean r6 = r1 instanceof defpackage.updatePauseRangeStateAndCheckIfBufferPaused
            if (r6 == 0) goto L80
            int r6 = defpackage.AutoValue_AudioMimeInfo1.asInterface
            int r6 = r6 + 73
            int r7 = r6 % 128
            defpackage.AutoValue_AudioMimeInfo1.f78a = r7
            int r6 = r6 % r0
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            if (r6 == 0) goto L66
            updatePauseRangeStateAndCheckIfBufferPaused r1 = (defpackage.updatePauseRangeStateAndCheckIfBufferPaused) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.updatePauseRangeStateAndCheckIfBufferPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            long r11 = r6.get(r1)
            long r9 = r9 - r11
            int r1 = (int) r9
            long r6 = r11 | r7
            r8 = 42
            long r6 = r6 << r8
            int r6 = (int) r6
            if (r1 != r6) goto L7b
            goto L90
        L66:
            updatePauseRangeStateAndCheckIfBufferPaused r1 = (defpackage.updatePauseRangeStateAndCheckIfBufferPaused) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.updatePauseRangeStateAndCheckIfBufferPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            long r11 = r6.get(r1)
            long r9 = r9 & r11
            int r1 = (int) r9
            long r6 = r11 & r7
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
            if (r1 != r6) goto L7b
            goto L90
        L7b:
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            return r13
        L80:
            EncoderImplMediaCodecCallbackExternalSyntheticLambda0 r13 = defpackage.AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            if (r1 != r13) goto L8b
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            return r13
        L8b:
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            return r13
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.AutoValue_AudioMimeInfo1.TuitionPaymentFragmentbindingInflater1
            java.lang.Object r13 = r1.get(r13)
            AutoValue_AudioMimeInfo1$TuitionPaymentFragmentspecialinlinedviewModeldefault3 r13 = (AutoValue_AudioMimeInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) r13
            if (r13 == 0) goto Lbf
            EncoderImplMediaCodecCallback1 r13 = r13.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            AutoValue_AudioMimeInfo1$TuitionPaymentFragmentbindingInflater1 r13 = (AutoValue_AudioMimeInfo1.TuitionPaymentFragmentbindingInflater1) r13
            if (r13 == 0) goto Lbf
            long r4 = r13.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            long r6 = java.lang.System.nanoTime()
            long r4 = r4 - r6
            long r1 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r2)
            int r13 = defpackage.AutoValue_AudioMimeInfo1.asInterface
            int r13 = r13 + 63
            int r3 = r13 % 128
            defpackage.AutoValue_AudioMimeInfo1.f78a = r3
            int r13 = r13 % r0
            if (r13 != 0) goto Lbd
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            return r13
        Lbd:
            r13 = 0
            throw r13
        Lbf:
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AutoValue_AudioMimeInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.AutoValue_AudioMimeInfoBuilder
    public void TuitionPaymentFragmentbindingInflater1() {
        Object obj;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setDataSpace.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(this, 1);
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            obj = null;
            if (obj2 != null) {
                if (!(!(obj2 instanceof updatePauseRangeStateAndCheckIfBufferPaused))) {
                    int i2 = asInterface + 43;
                    f78a = i2 % 128;
                    int i3 = i2 % 2;
                    ((updatePauseRangeStateAndCheckIfBufferPaused) obj2).b();
                    break;
                }
                if (obj2 == AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentbindingInflater1) {
                    break;
                }
                updatePauseRangeStateAndCheckIfBufferPaused updatepauserangestateandcheckifbufferpaused = new updatePauseRangeStateAndCheckIfBufferPaused(8, true);
                Intrinsics.checkNotNull(obj2, "");
                updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Runnable) obj2);
                if (!(!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, obj2, updatepauserangestateandcheckifbufferpaused))) {
                    break;
                }
            } else if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, null, AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentbindingInflater1)) {
                break;
            }
        }
        while (g() <= 0) {
        }
        int i4 = f78a + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            System.nanoTime();
            obj.hashCode();
            throw null;
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) TuitionPaymentFragmentbindingInflater1.get(this);
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) == null) {
                return;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(jNanoTime, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        f78a = i2 % 128;
        int i3 = i2 % 2;
        long jB = AutoValue_VideoMimeInfoBuilder.b(j);
        if (jB < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(jB + jNanoTime, mediaFormatMustNotUseFrameRateToFindEncoderQuirk);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(jNanoTime, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            MediaStoreVideoCannotWrite.b(mediaFormatMustNotUseFrameRateToFindEncoderQuirk, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i4 = asInterface + 123;
            f78a = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0002j\u0002`\u00012\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0007j\u0002`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020'H\u0016R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "", "<init>", "(J)V", "_heap", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "timeToExecute", "", "now", "scheduleTask", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "dispose", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TuitionPaymentFragmentbindingInflater1 implements Runnable, Comparable<TuitionPaymentFragmentbindingInflater1>, setCompatibleAudioProfile, EncoderImplMediaCodecCallback1 {
        public long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        private volatile Object _heap;

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public TuitionPaymentFragmentbindingInflater1(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        }

        @Override // defpackage.EncoderImplMediaCodecCallback1
        public final EncoderImplMediaCodecCallbackExternalSyntheticLambda9<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Object obj = this._heap;
            if (obj instanceof EncoderImplMediaCodecCallbackExternalSyntheticLambda9) {
                return (EncoderImplMediaCodecCallbackExternalSyntheticLambda9) obj;
            }
            return null;
        }

        @Override // defpackage.EncoderImplMediaCodecCallback1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EncoderImplMediaCodecCallbackExternalSyntheticLambda9<?> encoderImplMediaCodecCallbackExternalSyntheticLambda9) {
            if (this._heap == AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = encoderImplMediaCodecCallbackExternalSyntheticLambda9;
        }

        @Override // defpackage.EncoderImplMediaCodecCallback1
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
        public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.EncoderImplMediaCodecCallback1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        public final boolean b(long j) {
            return j - this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Delayed[nanos=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(']');
            return sb.toString();
        }

        public final int TuitionPaymentFragmentbindingInflater1(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, AutoValue_AudioMimeInfo1 autoValue_AudioMimeInfo1) {
            synchronized (this) {
                if (this._heap == AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return 2;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault4) {
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = tuitionPaymentFragmentspecialinlinedviewModeldefault4.b();
                    if (AutoValue_AudioMimeInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_AudioMimeInfo1)) {
                        return 1;
                    }
                    if (tuitionPaymentFragmentbindingInflater1B == null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
                    } else {
                        long j2 = tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
                        }
                    }
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < 0) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
                    return 0;
                    throw th;
                }
            }
        }

        @Override // defpackage.setCompatibleAudioProfile
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    return;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj : null;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                }
                this._heap = AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentbindingInflater1 {
        private final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            super(j);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AutoValue_AudioMimeInfo1.this, Unit.INSTANCE);
        }

        @Override // AutoValue_AudioMimeInfo1.TuitionPaymentFragmentbindingInflater1
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return sb.toString();
        }
    }

    static final class b extends TuitionPaymentFragmentbindingInflater1 {
        private final Runnable b;

        public b(long j, Runnable runnable) {
            super(j);
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.run();
        }

        @Override // AutoValue_AudioMimeInfo1.TuitionPaymentFragmentbindingInflater1
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.b);
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends EncoderImplMediaCodecCallbackExternalSyntheticLambda9<TuitionPaymentFragmentbindingInflater1> {
        public long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        }
    }

    @Override // defpackage.AutoValue_AudioMimeInfoBuilder
    public final long g() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int iIndexOf = 921 - TextUtils.indexOf("", "", 0);
            int i2 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
            byte[] bArr = $$d;
            byte b2 = bArr[80];
            Object[] objArr3 = new Object[1];
            h(b2, b2, bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iIndexOf, i2, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        i(new char[]{55759, 36073, 55726, 37508, 62755, 57639, 41388, 6799, 32055, 51521, 47964, 26983, 10680, 33409, 58737, 61742, 45458, 2749, 27935, 30996, 14738, 29337, 54555, 33034, 33168, 64189}, 1 - ExpandableListView.getPackedPositionType(0L), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        i(new char[]{58824, 41847, 58797, 48408, 30350, 32581, 40375, 13597, 65183, 19177, 9532, 63355, 5557, 44301, 26267, 28521, 36229, 9533, 61094}, -ImageFormat.getBitsPerPixel(0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int scrollBarFadeDuration = 921 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte b3 = $$d[80];
            Object[] objArr6 = new Object[1];
            h((byte) 52, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollBarFadeDuration, scrollDefaultDelay, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (31533 - Drawable.resolveOpacity(0, 0));
                int i3 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$d;
                Object[] objArr7 = new Object[1];
                h((byte) 37, bArr2[37], bArr2[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, i3, maximumDrawingCacheSize, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iNextInt = new Random().nextInt();
            int i4 = ((((-722815019) + (((~((-1744401906) | iNextInt)) | (-1744698876)) * (-502))) + ((~((~iNextInt) | (-1715021138))) * (-502))) + (((~(iNextInt | (-29677739))) | (-1744401906)) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1493275614;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            i(new char[]{51623, 18094, 51654, 22723, 61290, 23775, 45508, 53448, 26494, 54024, 1700, 54431, 14814, 18629, 65382, 19627, 41410, 49386, 30550, 50400, 10721, 47348, 53066, 15588, 37327, 12537, 18232, 46212, 6542, 43137}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            i(new char[]{50522, 60138, 50489, 62620, 8333, 40004, 48435, 31883, 43167, 7417, 50751, 5227, 13618, 58497, 12427, 35959, 44317, 27820, 47271, 1147, 9477, 5303}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            i(new char[]{35028, 39509, 35006, 33847, 37938, 38292, 61686, 3126, 7217, 43074, 53244, 7559, 30891, 37984, 33807, 34212, 57475, 7174, 3085, 3516}, 1 - TextUtils.indexOf("", ""), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            i(new char[]{64256, 13676, 64361, 11019, 41076, 52710, 33656, 41738, 10353, 39959, 38785, 17901, 2896, 15126, 45178, 56776, 37735, 45860, 14425, 21961}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1493275614};
                byte[] bArr3 = $$j;
                byte b4 = bArr3[47];
                Object[] objArr14 = new Object[1];
                j(b4, b4, bArr3[7], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b5 = bArr3[7];
                Object[] objArr15 = new Object[1];
                j(b5, b5, bArr3[47], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRed = (char) (Color.red(0) + 31533);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 921;
                    int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                    byte[] bArr4 = $$d;
                    Object[] objArr17 = new Object[1];
                    h((byte) 37, bArr4[37], bArr4[80], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, trimmedLength, i7, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    i(new char[]{55759, 36073, 55726, 37508, 62755, 57639, 41388, 6799, 32055, 51521, 47964, 26983, 10680, 33409, 58737, 61742, 45458, 2749, 27935, 30996, 14738, 29337, 54555, 33034, 33168, 64189}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    i(new char[]{58824, 41847, 58797, 48408, 30350, 32581, 40375, 13597, 65183, 19177, 9532, 63355, 5557, 44301, 26267, 28521, 36229, 9533, 61094}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 921;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                        byte b6 = $$d[80];
                        Object[] objArr20 = new Object[1];
                        h((byte) 52, b6, b6, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, pressedStateDuration2, keyRepeatDelay, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize2 = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i8 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr5 = $$d;
                        byte b7 = bArr5[80];
                        byte b8 = bArr5[37];
                        Object[] objArr21 = new Object[1];
                        h(b7, b7, b8, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize2, i8, bitsPerPixel, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr16;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 == i9) {
            int i11 = asInterface + 7;
            f78a = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt2 = new Random().nextInt();
            int i14 = i13 + (-1428875575) + (((-213942945) | (~iNextInt2)) * (-490)) + (((~(iNextInt2 | (-1556466337))) | 1342523392) * 490) + 743661480;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr2[0])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i17 = 0;
                while (i17 < strArr.length) {
                    int i18 = asInterface + 53;
                    f78a = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList.add(strArr[i17]);
                    } else {
                        arrayList.add(strArr[i17]);
                        i17++;
                    }
                }
            }
            int[] iArr = new int[i10];
            int i19 = i10 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i21 = ~iFreeMemory;
            int i22 = 1766244947 + (((~((-738367137) | i21)) | (~(1035704233 | iFreeMemory))) * 520);
            int i23 = ~((-1035704234) | i21);
            int i24 = ~(iFreeMemory | 738375410);
            int i25 = i20 + i22 + ((i23 | i24) * (-1040)) + ((i24 | (~(i21 | (-738375411))) | 297337097) * 520);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
        }
        if (!d()) {
            cancel();
            Runnable runnableB = b();
            if (runnableB == null) {
                return ((Long) TuitionPaymentFragmentbindingInflater1(MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 1533349600, -1533349599, MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).longValue();
            }
            int i28 = f78a + 21;
            asInterface = i28 % 128;
            if (i28 % 2 == 0) {
                runnableB.run();
                return 1L;
            }
            runnableB.run();
            return 0L;
        }
        int i29 = asInterface + 61;
        f78a = i29 % 128;
        int i30 = i29 % 2;
        int i31 = ((int[]) objArr2[0])[0];
        int i32 = i31 * i31;
        int i33 = -(1235278391 * i31);
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = -(i31 * 1439920237);
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        int i37 = (i36 ^ (-593965500)) + (((-593965500) & i36) << 1);
        int i38 = ((i37 >> 21) - 4095) / 2048;
        int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
        int i40 = (i37 ^ i39) + ((i39 & i37) << 1);
        int i41 = i37 >> 18;
        int i42 = ((i41 ^ (-32767)) + ((i41 & (-32767)) << 1)) / 16384;
        int i43 = -(i40 ^ ((i42 & 1) + (i42 | 1)));
        int i44 = (i43 ^ 4) + ((i43 & 4) << 1);
        int i45 = ((i44 >> 29) - 15) / 8;
        return ((long) (1049040 / (((-(((i45 ^ 1) + ((i45 & 1) << 1)) + 1)) & i44) * 564))) - 465;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext context, Runnable block) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        f78a = i2 % 128;
        int i3 = i2 % 2;
        b(block);
        int i4 = asInterface + 49;
        f78a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void b(Runnable runnable) {
        int i = 2 % 2;
        cancel();
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable)) {
            resolveAudioSettings.TuitionPaymentFragmentbindingInflater1.b(runnable);
            int i2 = asInterface + 33;
            f78a = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = f78a + 73;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            onTransact();
        } else {
            onTransact();
            int i5 = 28 / 0;
        }
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (((Boolean) TuitionPaymentFragmentbindingInflater1(MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 988108801, -988108801, MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).booleanValue()) {
                return false;
            }
            if (obj == null) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, null, runnable)) {
                    int i2 = asInterface + 91;
                    f78a = i2 % 128;
                    return i2 % 2 == 0;
                }
            } else if (obj instanceof updatePauseRangeStateAndCheckIfBufferPaused) {
                int i3 = asInterface + 53;
                f78a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNull(obj, "");
                updatePauseRangeStateAndCheckIfBufferPaused updatepauserangestateandcheckifbufferpaused = (updatePauseRangeStateAndCheckIfBufferPaused) obj;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                    return true;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                    AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, obj, updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentbindingInflater1(updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
                    int i5 = asInterface + 63;
                    f78a = i5 % 128;
                    int i6 = i5 % 2;
                } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                    return false;
                }
            } else {
                if (obj == AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentbindingInflater1) {
                    return false;
                }
                updatePauseRangeStateAndCheckIfBufferPaused updatepauserangestateandcheckifbufferpaused2 = new updatePauseRangeStateAndCheckIfBufferPaused(8, true);
                Intrinsics.checkNotNull(obj, "");
                updatepauserangestateandcheckifbufferpaused2.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Runnable) obj);
                updatepauserangestateandcheckifbufferpaused2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(runnable);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, obj, updatepauserangestateandcheckifbufferpaused2)) {
                    return true;
                }
            }
        }
    }

    private final Runnable b() {
        int i = 2 % 2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof updatePauseRangeStateAndCheckIfBufferPaused) {
                Intrinsics.checkNotNull(obj, "");
                updatePauseRangeStateAndCheckIfBufferPaused updatepauserangestateandcheckifbufferpaused = (updatePauseRangeStateAndCheckIfBufferPaused) obj;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 != updatePauseRangeStateAndCheckIfBufferPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    int i2 = f78a + 119;
                    asInterface = i2 % 128;
                    if (i2 % 2 != 0) {
                        return (Runnable) objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    }
                    throw null;
                }
                AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, obj, updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentbindingInflater1(updatepauserangestateandcheckifbufferpaused.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
            } else {
                if (obj == AutoValue_VideoMimeInfoBuilder.TuitionPaymentFragmentbindingInflater1) {
                    int i3 = asInterface + 117;
                    f78a = i3 % 128;
                    int i4 = i3 % 2;
                    return null;
                }
                if (!(!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(TuitionPaymentFragmentspecialinlinedviewModeldefault3, this, obj, null))) {
                    Intrinsics.checkNotNull(obj, "");
                    return (Runnable) obj;
                }
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        int i = 2 % 2;
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(j, tuitionPaymentFragmentbindingInflater1);
        if (iTuitionPaymentFragmentbindingInflater1 != 0) {
            int i2 = f78a + 119;
            asInterface = i2 % 128;
            if (i2 % 2 != 0 ? iTuitionPaymentFragmentbindingInflater1 == 1 : iTuitionPaymentFragmentbindingInflater1 == 1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, tuitionPaymentFragmentbindingInflater1);
                return;
            } else {
                if (iTuitionPaymentFragmentbindingInflater1 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1)) {
            int i3 = f78a + 63;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            onTransact();
        }
    }

    private final int TuitionPaymentFragmentbindingInflater1(long j, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        int i = 2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((Boolean) TuitionPaymentFragmentbindingInflater1(MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 988108801, -988108801, MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue()) {
            int i2 = asInterface + 63;
            f78a = i2 % 128;
            int i3 = i2 % 2;
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TuitionPaymentFragmentbindingInflater1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) atomicReferenceFieldUpdater.get(this);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(j));
            Object obj = atomicReferenceFieldUpdater.get(this);
            Intrinsics.checkNotNull(obj);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
        }
        int iTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(j, tuitionPaymentFragmentspecialinlinedviewModeldefault3, this);
        int i4 = asInterface + 117;
        f78a = i4 % 128;
        int i5 = i4 % 2;
        return iTuitionPaymentFragmentbindingInflater1;
    }

    protected final void a() {
        int i = 2 % 2;
        int i2 = f78a + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(this, null);
        TuitionPaymentFragmentbindingInflater1.set(this, null);
        int i4 = f78a + 123;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    private final void cancel() {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) TuitionPaymentFragmentbindingInflater1.get(this);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault4) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = tuitionPaymentFragmentspecialinlinedviewModeldefault4.b();
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                if (tuitionPaymentFragmentbindingInflater1B != null) {
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1B;
                    if (tuitionPaymentFragmentbindingInflater1.b(jNanoTime) && TuitionPaymentFragmentspecialinlinedviewModeldefault1((Runnable) tuitionPaymentFragmentbindingInflater1)) {
                        tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
                    }
                }
            }
        } while (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null);
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        int i = 2 % 2;
        int i2 = f78a + 113;
        asInterface = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = null;
        if (i2 % 2 == 0) {
            tuitionPaymentFragmentbindingInflater2.hashCode();
            throw null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) TuitionPaymentFragmentbindingInflater1.get(this);
        if ((tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : null) != tuitionPaymentFragmentbindingInflater1) {
            return false;
        }
        int i3 = f78a + 83;
        asInterface = i3 % 128;
        return i3 % 2 != 0;
    }

    static {
        d = 1;
        asInterface();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = AtomicReferenceFieldUpdater.newUpdater(AutoValue_AudioMimeInfo1.class, Object.class, "_queue$volatile");
        TuitionPaymentFragmentbindingInflater1 = AtomicReferenceFieldUpdater.newUpdater(AutoValue_AudioMimeInfo1.class, Object.class, "_delayed$volatile");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(AutoValue_AudioMimeInfo1.class, "_isCompleted$volatile");
        int i = asBinder + 33;
        d = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    private final boolean cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 988108801, -988108801, MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue();
    }

    @Override // defpackage.AutoValue_AudioMimeInfoBuilder
    protected final long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Long) TuitionPaymentFragmentbindingInflater1(MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Object[]{this}, 1533349600, -1533349599, MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MaterialShapeDrawable.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).longValue();
    }

    static void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6243276563924120677L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = defpackage.AutoValue_AudioMimeInfo1.$$l
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AutoValue_AudioMimeInfo1.$$n(short, int, byte):java.lang.String");
    }
}
