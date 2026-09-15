package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes5.dex */
@LazyStaggeredGridScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001JQ\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\f\u0010\rJ\u0097\u0001\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000e2\u001b\b\u0002\u0010\u0003\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062'\u0010\u0011\u001a#\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "p0", "p1", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "p2", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "p3", "item", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "", "Lkotlin/ParameterName;", "Lkotlin/Function2;", "p4", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyStaggeredGridScope {
    void item(Object p0, Object p1, StaggeredGridItemSpan p2, Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> p3);

    void items(int p0, Function1<? super Integer, ? extends Object> p1, Function1<? super Integer, ? extends Object> p2, Function1<? super Integer, StaggeredGridItemSpan> p3, Function4<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> p4);

    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, Function3 function3, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i, Function1 function1, Function1 function2, Function1 function3, Function4 function4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        Function1 function5 = (i2 & 2) != 0 ? null : function1;
        if ((i2 & 4) != 0) {
            function2 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
                public final Void invoke(int i3) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyStaggeredGridScope.items(i, function5, function2, (i2 & 8) != 0 ? null : function3, function4);
    }
}
