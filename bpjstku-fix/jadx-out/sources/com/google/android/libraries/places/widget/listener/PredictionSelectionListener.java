package com.google.android.libraries.places.widget.listener;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/google/android/libraries/places/widget/listener/PredictionSelectionListener;", "", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "p0", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "p1", "", "onPredictionSelected", "(Lcom/google/android/libraries/places/api/model/AutocompletePrediction;Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;)V", "Lcom/google/android/gms/common/api/Status;", "onError", "(Lcom/google/android/gms/common/api/Status;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PredictionSelectionListener {
    void onError(Status p0);

    void onPredictionSelected(AutocompletePrediction p0, AutocompleteSessionToken p1);
}
