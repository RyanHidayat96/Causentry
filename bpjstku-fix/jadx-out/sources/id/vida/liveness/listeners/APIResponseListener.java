package id.vida.liveness.listeners;

/* JADX INFO: loaded from: classes7.dex */
public interface APIResponseListener<T> {
    void onError(int i, String str);

    void onResponse(T t);
}
