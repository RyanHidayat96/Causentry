package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface deriveMediaType<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(BufferProviderState bufferProviderState);
}
