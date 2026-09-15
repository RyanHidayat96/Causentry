package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LTorchStateReset;", "LVirtualCameraControlExternalSyntheticLambda0;", "LLifecycleCameraRepository;", "Landroidx/fragment/app/FragmentManager;", "p0", "", "p1", "", "p2", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TorchStateReset extends VirtualCameraControlExternalSyntheticLambda0<LifecycleCameraRepository> {
    public /* synthetic */ TorchStateReset(FragmentManager fragmentManager, List list, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, list, (i & 4) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TorchStateReset(FragmentManager fragmentManager, List<? extends LifecycleCameraRepository> list, List<String> list2) {
        super(fragmentManager, list, list2);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final /* synthetic */ Fragment getItem(int i) {
        return b().get(i);
    }
}
