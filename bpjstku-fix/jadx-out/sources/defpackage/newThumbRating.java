package defpackage;

import androidx.p002lifecycle.DefaultLifecycleObserver;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.LifecycleOwner;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"LnewThumbRating;", "Landroidx/lifecycle/Lifecycle;", "<init>", "()V", "Landroidx/lifecycle/LifecycleObserver;", "p0", "", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "", "toString", "()Ljava/lang/String;", "LnewThumbRating$b;", "TuitionPaymentFragmentbindingInflater1", "LnewThumbRating$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class newThumbRating extends Lifecycle {
    public static final newThumbRating INSTANCE = new newThumbRating();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static final b TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new b();

    @Override // androidx.p002lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver p0) {
    }

    private newThumbRating() {
    }

    public static final class b implements LifecycleOwner {
        b() {
        }

        @Override // androidx.p002lifecycle.LifecycleOwner
        public final /* synthetic */ Lifecycle getLifecycle() {
            return newThumbRating.INSTANCE;
        }
    }

    @Override // androidx.p002lifecycle.Lifecycle
    /* JADX INFO: renamed from: getCurrentState */
    public final Lifecycle.State getState() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.p002lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver p0) {
        if (!(p0 instanceof DefaultLifecycleObserver)) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(" must implement androidx.lifecycle.DefaultLifecycleObserver.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) p0;
        b bVar = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        defaultLifecycleObserver.onCreate(bVar);
        defaultLifecycleObserver.onStart(bVar);
        defaultLifecycleObserver.onResume(bVar);
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
