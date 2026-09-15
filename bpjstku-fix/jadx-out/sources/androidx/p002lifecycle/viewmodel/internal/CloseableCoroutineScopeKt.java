package androidx.p002lifecycle.viewmodel.internal;

import defpackage.getDataSpace;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "createViewModelScope", "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "asCloseable", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "", "VIEW_MODEL_SCOPE_KEY", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope createViewModelScope() {
        EmptyCoroutineContext emptyCoroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        try {
            emptyCoroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } catch (IllegalStateException unused) {
            emptyCoroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            emptyCoroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(emptyCoroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2.plus(new getDataSpace(null)));
    }

    public static final CloseableCoroutineScope asCloseable(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new CloseableCoroutineScope(coroutineScope);
    }
}
