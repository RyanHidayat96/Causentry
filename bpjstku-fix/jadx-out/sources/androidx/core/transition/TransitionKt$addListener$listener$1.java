package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u000b\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Landroidx/core/transition/TransitionKt$addListener$listener$1;", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "p0", "", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ Function1<Transition, Unit> $onCancel;
    final /* synthetic */ Function1<Transition, Unit> $onEnd;
    final /* synthetic */ Function1<Transition, Unit> $onPause;
    final /* synthetic */ Function1<Transition, Unit> $onResume;
    final /* synthetic */ Function1<Transition, Unit> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(Function1<? super Transition, Unit> function1, Function1<? super Transition, Unit> function2, Function1<? super Transition, Unit> function3, Function1<? super Transition, Unit> function4, Function1<? super Transition, Unit> function5) {
        this.$onEnd = function1;
        this.$onResume = function2;
        this.$onPause = function3;
        this.$onCancel = function4;
        this.$onStart = function5;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition p0) {
        this.$onEnd.invoke(p0);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition p0) {
        this.$onResume.invoke(p0);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition p0) {
        this.$onPause.invoke(p0);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition p0) {
        this.$onCancel.invoke(p0);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition p0) {
        this.$onStart.invoke(p0);
    }
}
