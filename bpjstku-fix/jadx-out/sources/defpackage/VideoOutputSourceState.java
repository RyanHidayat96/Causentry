package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoOutputSourceState {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(BufferProviderState bufferProviderState);
}
