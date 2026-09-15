package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.core.util.Consumer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings DEFAULT = QuirkSettings.withDefaultBehavior();
    private static final QuirkSettingsHolder sInstance = new QuirkSettingsHolder();
    private final MutableStateObservable<QuirkSettings> mObservable = MutableStateObservable.withInitialState(DEFAULT);

    public static QuirkSettingsHolder instance() {
        return sInstance;
    }

    public final QuirkSettings get() {
        try {
            return this.mObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e2);
        }
    }

    public final void set(QuirkSettings quirkSettings) {
        this.mObservable.setState(quirkSettings);
    }

    public final void observe(Executor executor, Consumer<QuirkSettings> consumer) {
        this.mObservable.addObserver(executor, new ObserverToConsumerAdapter(consumer));
    }

    public final void reset() {
        this.mObservable.removeObservers();
        this.mObservable.setState(DEFAULT);
    }

    static class ObserverToConsumerAdapter<T> implements Observable.Observer<T> {
        private static final String TAG = "ObserverToConsumerAdapter";
        private final Consumer<T> mDelegate;

        ObserverToConsumerAdapter(Consumer<T> consumer) {
            this.mDelegate = consumer;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(T t) {
            this.mDelegate.accept(t);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th) {
            Logger.e(TAG, "Unexpected error in Observable", th);
        }
    }
}
