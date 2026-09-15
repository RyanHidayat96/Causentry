package androidx.p002lifecycle;

import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0015\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0002\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\n\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0002\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00112\n\u0010\n\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0015J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0016*\u00060\u0007j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/lifecycle/ViewModel;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "p0", "(Lkotlinx/coroutines/CoroutineScope;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/jdk7/TuitionPaymentFragmentbindingInflater1;", "([Ljava/lang/AutoCloseable;)V", "p1", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel_release", "", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", ExifInterface.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "impl", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ViewModel {
    private final ViewModelImpl impl;

    public void onCleared() {
    }

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public ViewModel(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.impl = new ViewModelImpl(coroutineScope);
    }

    public ViewModel(AutoCloseable... autoCloseableArr) {
        Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public ViewModel(CoroutineScope coroutineScope, AutoCloseable... autoCloseableArr) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.impl = new ViewModelImpl(coroutineScope, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ ViewModel(Closeable... closeableArr) {
        Intrinsics.checkNotNullParameter(closeableArr, "");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }

    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    public final void addCloseable(String p0, AutoCloseable p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(p0, p1);
        }
    }

    public void addCloseable(AutoCloseable p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(p0);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(p0);
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(p0);
        }
        return null;
    }
}
