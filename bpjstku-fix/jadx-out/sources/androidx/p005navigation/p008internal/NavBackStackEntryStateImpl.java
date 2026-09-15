package androidx.p005navigation.p008internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p002lifecycle.Lifecycle;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavControllerViewModel;
import androidx.p005navigation.NavDestination;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0010\u0012\n\u0010\u0003\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\u000b\u001a\u00060\bj\u0002`\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u001e\u0010\"\u001a\u00060\bj\u0002`\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\f"}, d2 = {"Landroidx/navigation/internal/NavBackStackEntryStateImpl;", "", "Landroidx/navigation/NavBackStackEntry;", "p0", "", "p1", "<init>", "(Landroidx/navigation/NavBackStackEntry;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "(Landroid/os/Bundle;)V", "writeToState$navigation_runtime_release", "()Landroid/os/Bundle;", "Landroidx/navigation/internal/NavContext;", "Landroidx/navigation/NavDestination;", "p2", "Landroidx/lifecycle/Lifecycle$State;", "p3", "Landroidx/navigation/NavControllerViewModel;", "p4", "instantiate", "(Landroidx/navigation/internal/NavContext;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "", "id", "Ljava/lang/String;", "getId$navigation_runtime_release", "()Ljava/lang/String;", "destinationId", "I", "getDestinationId$navigation_runtime_release", "()I", "args", "Landroid/os/Bundle;", "getArgs$navigation_runtime_release", "savedState", "getSavedState$navigation_runtime_release", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavBackStackEntryStateImpl {
    public static final String KEY_ARGS = "nav-entry-state:args";
    public static final String KEY_DESTINATION_ID = "nav-entry-state:destination-id";
    public static final String KEY_ID = "nav-entry-state:id";
    public static final String KEY_SAVED_STATE = "nav-entry-state:saved-state";
    private final Bundle args;
    private final int destinationId;
    private final String id;
    private final Bundle savedState;

    /* JADX INFO: renamed from: getId$navigation_runtime_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getDestinationId$navigation_runtime_release, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* JADX INFO: renamed from: getArgs$navigation_runtime_release, reason: from getter */
    public final Bundle getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: getSavedState$navigation_runtime_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    public NavBackStackEntryStateImpl(NavBackStackEntry navBackStackEntry, int i) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        this.id = navBackStackEntry.getId();
        this.destinationId = i;
        this.args = navBackStackEntry.getArguments();
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
        this.savedState = bundleBundleOf;
        navBackStackEntry.saveState(bundleBundleOf);
    }

    public NavBackStackEntryStateImpl(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        this.id = SavedStateReader.m7439getStringimpl(SavedStateReader.m7368constructorimpl(bundle), KEY_ID);
        this.destinationId = SavedStateReader.m7399getIntimpl(SavedStateReader.m7368constructorimpl(bundle), KEY_DESTINATION_ID);
        this.args = SavedStateReader.m7425getSavedStateimpl(SavedStateReader.m7368constructorimpl(bundle), KEY_ARGS);
        this.savedState = SavedStateReader.m7425getSavedStateimpl(SavedStateReader.m7368constructorimpl(bundle), KEY_SAVED_STATE);
    }

    public final NavBackStackEntry instantiate(NavContext p0, NavDestination p1, Bundle p2, Lifecycle.State p3, NavControllerViewModel p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return NavBackStackEntry.INSTANCE.create(p0, p1, p2, p3, p4, this.id, this.savedState);
    }

    public final Bundle writeToState$navigation_runtime_release() {
        Pair[] pairArr;
        Pair[] pairArr2;
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
        SavedStateWriter.m7487putStringimpl(bundleM7454constructorimpl, KEY_ID, this.id);
        SavedStateWriter.m7471putIntimpl(bundleM7454constructorimpl, KEY_DESTINATION_ID, this.destinationId);
        Bundle bundleBundleOf2 = this.args;
        if (bundleBundleOf2 == null) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList2.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m7454constructorimpl(bundleBundleOf2);
        }
        SavedStateWriter.m7481putSavedStateimpl(bundleM7454constructorimpl, KEY_ARGS, bundleBundleOf2);
        SavedStateWriter.m7481putSavedStateimpl(bundleM7454constructorimpl, KEY_SAVED_STATE, this.savedState);
        return bundleBundleOf;
    }
}
