package androidx.view.contextaware;

import android.content.Context;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u000b\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1;", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", "p0", "", "onContextAvailable", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 176)
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk<R> $co;
    final /* synthetic */ Function1<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<R> mediaFormatMustNotUseFrameRateToFindEncoderQuirk, Function1<Context, R> function1) {
        this.$co = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.view.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context p0) {
        Object objM8024constructorimpl;
        Intrinsics.checkNotNullParameter(p0, "");
        Continuation continuation = this.$co;
        Function1<Context, R> function1 = this.$onContextAvailable;
        try {
            Result.Companion companion = Result.INSTANCE;
            ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = this;
            objM8024constructorimpl = Result.m8024constructorimpl(function1.invoke(p0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
        continuation.resumeWith(objM8024constructorimpl);
    }
}
