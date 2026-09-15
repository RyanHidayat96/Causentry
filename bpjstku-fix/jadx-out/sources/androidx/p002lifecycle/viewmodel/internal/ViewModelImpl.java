package androidx.p002lifecycle.viewmodel.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0015\b\u0016\u0012\n\u0010\u0005\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0002\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\n\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0002\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u0003J!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u000f\u001a\u00020\f2\n\u0010\u0005\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000f\u0010\u0011J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0012*\u00060\u0007j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "p0", "(Lkotlinx/coroutines/CoroutineScope;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/jdk7/TuitionPaymentFragmentbindingInflater1;", "([Ljava/lang/AutoCloseable;)V", "p1", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "", "clear", "", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", ExifInterface.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "closeWithRuntimeException", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "", "keyToCloseables", "Ljava/util/Map;", "", "closeables", "Ljava/util/Set;", "", "isCleared", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewModelImpl {
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;
    private final Map<String, AutoCloseable> keyToCloseables;
    private final SynchronizedObject lock;

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    public ViewModelImpl(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(coroutineScope));
    }

    public ViewModelImpl(AutoCloseable... autoCloseableArr) {
        Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    public ViewModelImpl(CoroutineScope coroutineScope, AutoCloseable... autoCloseableArr) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(autoCloseableArr, "");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(coroutineScope));
        CollectionsKt.addAll(linkedHashSet, autoCloseableArr);
    }

    public final void clear() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            Iterator it = this.keyToCloseables.values().iterator();
            while (it.hasNext()) {
                closeWithRuntimeException((AutoCloseable) it.next());
            }
            Iterator it2 = this.closeables.iterator();
            while (it2.hasNext()) {
                closeWithRuntimeException((AutoCloseable) it2.next());
            }
            this.closeables.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void addCloseable(String p0, AutoCloseable p1) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.isCleared) {
            closeWithRuntimeException(p1);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(p0, p1);
        }
        closeWithRuntimeException(autoCloseable);
    }

    public final void addCloseable(AutoCloseable p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.isCleared) {
            closeWithRuntimeException(p0);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(p0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final <T extends AutoCloseable> T getCloseable(String p0) {
        T t;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            t = (T) this.keyToCloseables.get(p0);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable p0) {
        if (p0 != null) {
            try {
                p0.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
