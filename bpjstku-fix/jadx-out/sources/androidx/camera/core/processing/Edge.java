package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class Edge<T> implements Consumer<T> {
    private Consumer<T> mListener;

    @Override // androidx.core.util.Consumer
    public void accept(T t) {
        Intrinsics.checkNotNull(this.mListener, "");
        this.mListener.accept(t);
    }

    public void setListener(Consumer<T> consumer) {
        this.mListener = consumer;
    }
}
