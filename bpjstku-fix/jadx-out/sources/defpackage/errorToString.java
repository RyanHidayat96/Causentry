package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface errorToString<T> {
    void b(T t);

    void onComplete();

    void onError(Throwable th);

    void onSubscribe(BufferProviderState bufferProviderState);
}
