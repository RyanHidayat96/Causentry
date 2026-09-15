package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B4\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR-\u0010\u000e\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/core/content/ContinuationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lkotlin/coroutines/Continuation;", "p0", "Lkotlin/Function2;", "Landroid/content/Intent;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "onReceiveChecked", "Lkotlin/jvm/functions/Function2;", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ContinuationBroadcastReceiver extends BroadcastReceiver {
    private Continuation<?> continuation;
    private final Function2<BroadcastReceiver, Intent, Unit> onReceiveChecked;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationBroadcastReceiver(Continuation<?> continuation, Function2<? super BroadcastReceiver, ? super Intent, Unit> function2) {
        this.onReceiveChecked = function2;
        this.continuation = continuation;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) {
        try {
            this.onReceiveChecked.invoke(this, p1);
        } catch (Throwable th) {
            Continuation<?> continuation = this.continuation;
            if (continuation == null) {
                throw th;
            }
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(th)));
            this.continuation = null;
        }
    }
}
