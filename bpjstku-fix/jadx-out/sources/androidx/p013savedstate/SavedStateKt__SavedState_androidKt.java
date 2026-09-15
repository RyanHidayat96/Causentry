package androidx.p013savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a>\u0010\u000b\u001a\u00060\tj\u0002`\n2\n\u0010\u0003\u001a\u00060\tj\u0002`\n2\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\r*\n\u0010\u000e\"\u00020\t2\u00020\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "", "", "p0", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateWriter;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "savedState", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroid/os/Bundle;", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)Landroid/os/Bundle;", "b"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateKt")
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static final Bundle savedState(Map<String, ? extends Object> map, Function1<? super SavedStateWriter, Unit> function1) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        function1.invoke(SavedStateWriter.m7452boximpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }

    public static final Bundle savedState(Bundle bundle, Function1<? super SavedStateWriter, Unit> function1) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Bundle bundle2 = new Bundle(bundle);
        function1.invoke(SavedStateWriter.m7452boximpl(SavedStateWriter.m7454constructorimpl(bundle2)));
        return bundle2;
    }

    public static /* synthetic */ Bundle savedState$default(Bundle bundle, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<SavedStateWriter, Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.3
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
                    m7366invokexApjlu4(savedStateWriter.getSource());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m7366invokexApjlu4(Bundle bundle2) {
                    Intrinsics.checkNotNullParameter(bundle2, "");
                }
            };
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Bundle bundle2 = new Bundle(bundle);
        function1.invoke(SavedStateWriter.m7452boximpl(SavedStateWriter.m7454constructorimpl(bundle2)));
        return bundle2;
    }

    public static /* synthetic */ Bundle savedState$default(Map map, Function1 function1, int i, Object obj) {
        Pair[] pairArr;
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            function1 = new Function1<SavedStateWriter, Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt.savedState.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(SavedStateWriter savedStateWriter) {
                    m7365invokexApjlu4(savedStateWriter.getSource());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m7365invokexApjlu4(Bundle bundle) {
                    Intrinsics.checkNotNullParameter(bundle, "");
                }
            };
        }
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        function1.invoke(SavedStateWriter.m7452boximpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf)));
        return bundleBundleOf;
    }
}
