package id.vida.liveness.listeners;

/* JADX INFO: loaded from: classes7.dex */
public interface ServiceResponseListener<T> {
    void onError(int i, String str);

    Boolean onResponse(T t);
}
