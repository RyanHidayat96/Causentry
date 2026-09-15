package androidx.camera.view;

import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MediatorLiveData;
import androidx.p002lifecycle.Observer;

/* JADX INFO: loaded from: classes5.dex */
final class ForwardingLiveData<T> extends MediatorLiveData<T> {
    private LiveData<T> mLiveDataSource;

    ForwardingLiveData() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void setSource(LiveData<T> liveData) {
        LiveData<T> liveData2 = this.mLiveDataSource;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.mLiveDataSource = liveData;
        super.addSource(liveData, new Observer() { // from class: androidx.camera.view.ForwardingLiveData$$ExternalSyntheticLambda0
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.setValue(obj);
            }
        });
    }

    @Override // androidx.p002lifecycle.LiveData
    public final T getValue() {
        LiveData<T> liveData = this.mLiveDataSource;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}
