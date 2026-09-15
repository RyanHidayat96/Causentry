package androidx.p005navigation.p006compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p002lifecycle.ViewModel;
import androidx.p005navigation.p006compose.p007internal.NavComposeUtils_androidKt;
import androidx.p005navigation.p006compose.p007internal.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "", "onCleared", "()V", "", "IdKey", "Ljava/lang/String;", "id", "getId", "()Ljava/lang/String;", "Landroidx/navigation/compose/internal/WeakReference;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolderRef", "Landroidx/navigation/compose/internal/WeakReference;", "getSaveableStateHolderRef", "()Landroidx/navigation/compose/internal/WeakReference;", "setSaveableStateHolderRef", "(Landroidx/navigation/compose/internal/WeakReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackStackEntryIdViewModel extends ViewModel {
    public static final int $stable = 8;
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";
    private final String id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        String strRandomUUID = (String) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (strRandomUUID == null) {
            strRandomUUID = NavComposeUtils_androidKt.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", strRandomUUID);
        }
        this.id = strRandomUUID;
    }

    public final String getId() {
        return this.id;
    }

    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSaveableStateHolderRef(WeakReference<SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        getSaveableStateHolderRef().clear();
    }
}
