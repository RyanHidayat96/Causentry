package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioConfig<T> {
    void b(OutputTransform outputTransform);

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
