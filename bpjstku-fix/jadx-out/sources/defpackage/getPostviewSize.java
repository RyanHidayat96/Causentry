package defpackage;

import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"LgetPostviewSize;", "", "", "p0", "Landroidx/compose/ui/semantics/Role;", "p1", "Lkotlin/Function0;", "p2", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function0;", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/compose/ui/semantics/Role;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class getPostviewSize {
    final Role TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final Function0<Object> b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private getPostviewSize(String str, Role role, Function0<? extends Object> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = role;
        this.b = function0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableInfo{interactionType='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("', role=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", function=");
        sb.append(this.b.getClass().getName());
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ getPostviewSize(String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, role, function0);
    }
}
