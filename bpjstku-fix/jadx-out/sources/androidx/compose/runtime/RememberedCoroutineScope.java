package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import defpackage.SizeCannotEncodeVideoQuirk;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/coroutines/CoroutineContext;", "p0", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "", "cancelIfCreated", "()V", "onRemembered", "onForgotten", "onAbandoned", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "overlayContext", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "_coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RememberedCoroutineScope implements CoroutineScope, RememberObserver {
    private volatile CoroutineContext _coroutineContext;
    private final Object lock = this;
    private final CoroutineContext overlayContext;
    private final CoroutineContext parentContext;
    public static final int $stable = 8;
    public static final CoroutineContext CancelledCoroutineContext = new CancelledCoroutineContext();

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    public RememberedCoroutineScope(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.parentContext = coroutineContext;
        this.overlayContext = coroutineContext2;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        EmptyCoroutineContext rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1;
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this._coroutineContext;
        if (coroutineContext == null || coroutineContext == CancelledCoroutineContext) {
            CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.parentContext.get(CompositionErrorContextImpl.INSTANCE);
            if (compositionErrorContextImpl == null) {
                rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = EmptyCoroutineContext.INSTANCE;
            } else {
                rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = new RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, compositionErrorContextImpl, this);
            }
            synchronized (this.lock) {
                CoroutineContext coroutineContext2 = this._coroutineContext;
                if (coroutineContext2 == null) {
                    CoroutineContext coroutineContext3 = this.parentContext;
                    coroutineContextPlus = coroutineContext3.plus(VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VideoMimeInfoBuilder) coroutineContext3.get(VideoMimeInfoBuilder.b))).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                } else if (coroutineContext2 == CancelledCoroutineContext) {
                    CoroutineContext coroutineContext4 = this.parentContext;
                    SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VideoMimeInfoBuilder) coroutineContext4.get(VideoMimeInfoBuilder.b));
                    sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ForgottenCoroutineScopeException());
                    coroutineContextPlus = coroutineContext4.plus(sizeCannotEncodeVideoQuirkTuitionPaymentFragmentspecialinlinedviewModeldefault3).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                } else {
                    coroutineContextPlus = coroutineContext2;
                }
                this._coroutineContext = coroutineContextPlus;
                Unit unit = Unit.INSTANCE;
            }
            coroutineContext = coroutineContextPlus;
        }
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            CoroutineContext coroutineContext = this._coroutineContext;
            if (coroutineContext == null) {
                this._coroutineContext = CancelledCoroutineContext;
            } else {
                ForgottenCoroutineScopeException forgottenCoroutineScopeException = new ForgottenCoroutineScopeException();
                VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b);
                if (videoMimeInfoBuilder != null) {
                    videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(forgottenCoroutineScopeException);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        cancelIfCreated();
    }
}
