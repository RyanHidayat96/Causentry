package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public interface onSessionDestroyed<T extends View> extends onSessionReady {
    T TuitionPaymentFragmentbindingInflater1();

    default boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return true;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements ViewTreeObserver.OnPreDrawListener {
        private boolean TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ ViewTreeObserver TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk<onQueueTitleChanged> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ onSessionDestroyed<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSessionDestroyed<T> onsessiondestroyed, ViewTreeObserver viewTreeObserver, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super onQueueTitleChanged> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.b = onsessiondestroyed;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = viewTreeObserver;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            onQueueTitleChanged onqueuetitlechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onSessionDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            if (onqueuetitlechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                onSessionDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this);
                if (!this.TuitionPaymentFragmentbindingInflater1) {
                    this.TuitionPaymentFragmentbindingInflater1 = true;
                    MediaFormatMustNotUseFrameRateToFindEncoderQuirk<onQueueTitleChanged> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Result.Companion companion = Result.INSTANCE;
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(onqueuetitlechangedTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                }
            }
            return true;
        }
    }

    static final class b implements Function1<Throwable, Unit> {
        private /* synthetic */ onSessionDestroyed<T> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ ViewTreeObserver TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            onSessionDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return Unit.INSTANCE;
        }

        b(onSessionDestroyed<T> onsessiondestroyed, ViewTreeObserver viewTreeObserver, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentbindingInflater1 = onsessiondestroyed;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = viewTreeObserver;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    private default onEvent TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        ViewGroup.LayoutParams layoutParams = TuitionPaymentFragmentbindingInflater1().getLayoutParams();
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutParams != null ? layoutParams.width : -1, TuitionPaymentFragmentbindingInflater1().getWidth(), TuitionPaymentFragmentspecialinlinedviewModeldefault1() ? TuitionPaymentFragmentbindingInflater1().getPaddingLeft() + TuitionPaymentFragmentbindingInflater1().getPaddingRight() : 0);
    }

    private default onEvent b() {
        ViewGroup.LayoutParams layoutParams = TuitionPaymentFragmentbindingInflater1().getLayoutParams();
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutParams != null ? layoutParams.height : -1, TuitionPaymentFragmentbindingInflater1().getHeight(), TuitionPaymentFragmentspecialinlinedviewModeldefault1() ? TuitionPaymentFragmentbindingInflater1().getPaddingTop() + TuitionPaymentFragmentbindingInflater1().getPaddingBottom() : 0);
    }

    private static onEvent TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3) {
        if (i == -2) {
            return onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return onMetadataChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i5);
        }
        return null;
    }

    static /* synthetic */ onQueueTitleChanged TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSessionDestroyed onsessiondestroyed) {
        onEvent oneventB;
        onEvent oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onsessiondestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || (oneventB = onsessiondestroyed.b()) == null) {
            return null;
        }
        return new onQueueTitleChanged(oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2, oneventB);
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSessionDestroyed onsessiondestroyed, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            onsessiondestroyed.TuitionPaymentFragmentbindingInflater1().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    static /* synthetic */ <T extends View> Object b(onSessionDestroyed<T> onsessiondestroyed, Continuation<? super onQueueTitleChanged> continuation) {
        onEvent oneventB;
        onEvent oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onsessiondestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        onQueueTitleChanged onqueuetitlechanged = null;
        if (oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && (oneventB = onsessiondestroyed.b()) != null) {
            onqueuetitlechanged = new onQueueTitleChanged(oneventTuitionPaymentFragmentspecialinlinedviewModeldefault2, oneventB);
        }
        if (onqueuetitlechanged != null) {
            return onqueuetitlechanged;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ViewTreeObserver viewTreeObserver = onsessiondestroyed.TuitionPaymentFragmentbindingInflater1().getViewTreeObserver();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(onsessiondestroyed, viewTreeObserver, cancellableContinuationImpl2);
        viewTreeObserver.addOnPreDrawListener(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new b(onsessiondestroyed, viewTreeObserver, tuitionPaymentFragmentspecialinlinedviewModeldefault1));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // defpackage.onSessionReady
    default Object b(Continuation<? super onQueueTitleChanged> continuation) {
        return b(this, continuation);
    }
}
