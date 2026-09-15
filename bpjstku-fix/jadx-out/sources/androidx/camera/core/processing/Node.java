package androidx.camera.core.processing;

/* JADX INFO: loaded from: classes5.dex */
public interface Node<I, O> {
    void release();

    O transform(I i);
}
