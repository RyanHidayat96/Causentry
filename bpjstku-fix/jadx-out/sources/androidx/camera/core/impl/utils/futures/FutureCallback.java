package androidx.camera.core.impl.utils.futures;

/* JADX INFO: loaded from: classes5.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable th);

    void onSuccess(V v);
}
