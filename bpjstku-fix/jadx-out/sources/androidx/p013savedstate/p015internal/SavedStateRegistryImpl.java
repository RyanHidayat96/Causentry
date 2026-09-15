package androidx.p013savedstate.p015internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateRegistry;
import androidx.p013savedstate.SavedStateRegistryOwner;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00052\n\u0010\u0003\u001a\u00060\nj\u0002`\u000bH\u0001¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010+\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8G@BX\u0087\u000e¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b+\u0010,R\"\u0010-\u001a\u00020&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010,\"\u0004\b/\u00100"}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl;", "", "Landroidx/savedstate/SavedStateRegistryOwner;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Lkotlin/jvm/functions/Function0;)V", "", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registerSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "getSavedStateProvider", "(Ljava/lang/String;)Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "unregisterSavedStateProvider", "(Ljava/lang/String;)V", "performAttach", "()V", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performSave$savedstate_release", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "onAttach", "Lkotlin/jvm/functions/Function0;", "getOnAttach$savedstate_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/savedstate/internal/SynchronizedObject;", "lock", "Landroidx/savedstate/internal/SynchronizedObject;", "", "keyToProviders", "Ljava/util/Map;", "", "attached", "Z", "restoredState", "Landroid/os/Bundle;", "isRestored", "()Z", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateRegistryImpl {
    private static final Companion Companion = new Companion(null);
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private boolean isAllowingSavingState;
    private boolean isRestored;
    private final Map<String, SavedStateRegistry.SavedStateProvider> keyToProviders;
    private final SynchronizedObject lock;
    private final Function0<Unit> onAttach;
    private final SavedStateRegistryOwner owner;
    private Bundle restoredState;

    public SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.owner = savedStateRegistryOwner;
        this.onAttach = function0;
        this.lock = new SynchronizedObject();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    public /* synthetic */ SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateRegistryOwner, (i & 2) != 0 ? new Function0() { // from class: androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0);
    }

    public final Function0<Unit> getOnAttach$savedstate_release() {
        return this.onAttach;
    }

    /* JADX INFO: renamed from: isRestored, reason: from getter */
    public final boolean getIsRestored() {
        return this.isRestored;
    }

    /* JADX INFO: renamed from: isAllowingSavingState$savedstate_release, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    public final void setAllowingSavingState$savedstate_release(boolean z) {
        this.isAllowingSavingState = z;
    }

    public final Bundle consumeRestoredStateForKey(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state".toString());
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(bundle);
        Bundle bundleM7425getSavedStateimpl = SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p0) ? SavedStateReader.m7425getSavedStateimpl(bundleM7368constructorimpl, p0) : null;
        SavedStateWriter.m7490removeimpl(SavedStateWriter.m7454constructorimpl(bundle), p0);
        if (SavedStateReader.m7446isEmptyimpl(SavedStateReader.m7368constructorimpl(bundle))) {
            this.restoredState = null;
        }
        return bundleM7425getSavedStateimpl;
    }

    public final void registerSavedStateProvider(String p0, SavedStateRegistry.SavedStateProvider p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this.lock) {
            if (!this.keyToProviders.containsKey(p0)) {
                this.keyToProviders.put(p0, p1);
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
            }
        }
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider(String p0) {
        SavedStateRegistry.SavedStateProvider savedStateProvider;
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                SavedStateRegistry.SavedStateProvider savedStateProvider2 = (SavedStateRegistry.SavedStateProvider) entry.getValue();
                if (Intrinsics.areEqual(str, p0)) {
                    savedStateProvider = savedStateProvider2;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    public final void unregisterSavedStateProvider(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.lock) {
        }
    }

    public final void performAttach() {
        if (this.owner.getLifecycle().getState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        this.onAttach.invoke();
        this.owner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0
            @Override // androidx.p002lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistryImpl.performAttach$lambda$12(this.f$0, lifecycleOwner, event);
            }
        });
        this.attached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$12(SavedStateRegistryImpl savedStateRegistryImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistryImpl.isAllowingSavingState = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistryImpl.isAllowingSavingState = false;
        }
    }

    public final void performRestore$savedstate_release(Bundle p0) {
        if (!this.attached) {
            performAttach();
        }
        if (this.owner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            sb.append(this.owner.getLifecycle().getState());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        Bundle bundleM7425getSavedStateimpl = null;
        if (p0 != null) {
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, SAVED_COMPONENTS_KEY)) {
                bundleM7425getSavedStateimpl = SavedStateReader.m7425getSavedStateimpl(bundleM7368constructorimpl, SAVED_COMPONENTS_KEY);
            }
        }
        this.restoredState = bundleM7425getSavedStateimpl;
        this.isRestored = true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl$Companion;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void performSave$savedstate_release(Bundle p0) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(p0, "");
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
        Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundle);
        }
        synchronized (this.lock) {
            for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                SavedStateWriter.m7481putSavedStateimpl(bundleM7454constructorimpl, (String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).saveState());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (SavedStateReader.m7446isEmptyimpl(SavedStateReader.m7368constructorimpl(bundleBundleOf))) {
            return;
        }
        SavedStateWriter.m7481putSavedStateimpl(SavedStateWriter.m7454constructorimpl(p0), SAVED_COMPONENTS_KEY, bundleBundleOf);
    }
}
