package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class RetryPolicy implements updateTransformMatrix {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.updateTransformMatrix
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(map, "");
        for (ViewParent parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if ((parent instanceof RecyclerView) && view != null && (view.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                map.put("action.target.parent.index", Integer.valueOf(((RecyclerView) parent).getChildAdapterPosition(view)));
                map.put("action.target.parent.classname", parent.getClass().getCanonicalName());
                map.put("action.target.parent.resource_id", b((View) parent));
                return;
            }
            view = parent instanceof View ? (View) parent : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    private static String b(View view) {
        try {
            String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
            if (resourceEntryName != null) {
                return resourceEntryName;
            }
            String string = Integer.toString(view.getId(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "");
            return "0x".concat(String.valueOf(string));
        } catch (Resources.NotFoundException unused) {
            String string2 = Integer.toString(view.getId(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return "0x".concat(String.valueOf(string2));
        }
    }
}
