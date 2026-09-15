package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p002lifecycle.LifecycleRegistry;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.SavedStateRegistryController;
import androidx.p013savedstate.SavedStateRegistryOwner;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\rH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0011H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryWrapper;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/savedstate/SavedStateRegistryOwner;", "p0", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "", "", "canBeSaved", "(Ljava/lang/Object;)Z", "", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "performSave", "()Ljava/util/Map;", "Lkotlin/Function0;", "p1", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "Landroidx/savedstate/SavedStateRegistryController;", "controller", "Landroidx/savedstate/SavedStateRegistryController;", "getController", "()Landroidx/savedstate/SavedStateRegistryController;", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle$annotations", "()V", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SaveableStateRegistryWrapper implements SaveableStateRegistry, SavedStateRegistryOwner {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final SavedStateRegistryController controller;
    private final LifecycleRegistry lifecycle;
    private final SavedStateRegistry savedStateRegistry;

    public static /* synthetic */ void getLifecycle$annotations() {
    }

    public SaveableStateRegistryWrapper(SaveableStateRegistry saveableStateRegistry) {
        this.$$delegate_0 = saveableStateRegistry;
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.INSTANCE.create(this);
        this.controller = savedStateRegistryControllerCreate;
        this.lifecycle = LifecycleRegistry.INSTANCE.createUnsafe(this);
        this.savedStateRegistry = savedStateRegistryControllerCreate.getSavedStateRegistry();
        Object objConsumeRestored = consumeRestored("androidx.savedstate.SavedStateRegistry");
        savedStateRegistryControllerCreate.performRestore(objConsumeRestored instanceof Bundle ? (Bundle) objConsumeRestored : null);
        registerProvider("androidx.savedstate.SavedStateRegistry", new Function0() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryWrapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SaveableStateRegistryWrapper._init_$lambda$1(this.f$0);
            }
        });
    }

    public final SavedStateRegistryController getController() {
        return this.controller;
    }

    @Override // androidx.p002lifecycle.LifecycleOwner
    public final LifecycleRegistry getLifecycle() {
        return this.lifecycle;
    }

    @Override // androidx.p013savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$1(SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        Pair[] pairArr;
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        saveableStateRegistryWrapper.controller.performSave(bundleBundleOf);
        if (SavedStateReader.m7446isEmptyimpl(SavedStateReader.m7368constructorimpl(bundleBundleOf))) {
            return null;
        }
        return bundleBundleOf;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object p0) {
        return this.$$delegate_0.canBeSaved(p0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String p0) {
        return this.$$delegate_0.consumeRestored(p0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry registerProvider(String p0, Function0<? extends Object> p1) {
        return this.$$delegate_0.registerProvider(p0, p1);
    }
}
