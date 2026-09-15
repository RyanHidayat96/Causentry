package defpackage;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"LgetEdge;", "", "Landroidx/compose/ui/state/ToggleableState;", "p0", "Landroidx/compose/ui/semantics/Role;", "p1", "", "p2", "<init>", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/compose/ui/semantics/Role;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Landroidx/compose/ui/state/ToggleableState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class getEdge {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final ToggleableState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final Role b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private getEdge(ToggleableState toggleableState, Role role, String str) {
        Intrinsics.checkNotNullParameter(toggleableState, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = toggleableState;
        this.b = role;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleableInfo(state=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", role=");
        sb.append(this.b);
        sb.append(", sourceName='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("')");
        return sb.toString();
    }

    public /* synthetic */ getEdge(ToggleableState toggleableState, Role role, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, role, str);
    }
}
