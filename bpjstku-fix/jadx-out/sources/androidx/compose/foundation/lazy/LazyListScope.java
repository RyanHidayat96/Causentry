package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJE\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\fJz\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\r2\u001b\b\u0002\u0010\b\u001a\u0015\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032'\u0010\u0010\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J]\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\r2\u001b\b\u0002\u0010\b\u001a\u0015\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032'\u0010\u000b\u001a#\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0013JE\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0007H'¢\u0006\u0004\b\u0014\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "p0", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "p1", "item", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "Lkotlin/ParameterName;", "Lkotlin/Function2;", "p3", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyListScope {
    void stickyHeader(Object p0, Object p1, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> p2);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3) {
            LazyListScope.super.item(obj, obj2, function3);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function2, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
            LazyListScope.super.items(i, function1, function2, function4);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, function3);
    }

    default void item(Object p0, Object p1, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> p2) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Function3 function3, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void item(Object p0, Function3 p1) {
        item(p0, null, p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, Function1 function2, Function4 function4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function2 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                public final Void invoke(int i3) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i, function1, function2, function4);
    }

    default void items(int p0, Function1<? super Integer, ? extends Object> p1, Function1<? super Integer, ? extends Object> p2, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> p3) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, Function1 function1, Function4 function4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(i, function1, function4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void items(int p0, Function1 p1, Function4 p2) {
        items(p0, p1, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
            public final Object invoke(int i) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, p2);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, function3);
    }
}
