package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001ar\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0002¢\u0006\u0002\b\u00062\u001f\u0010\t\u001a\u001b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function1;", "p1", "Landroidx/compose/runtime/saveable/Saver;", "", "listSaver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ListSaverKt {
    public static final <Original, Saveable> Saver<Original, Object> listSaver(final Function2<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> function2, Function1<? super List<? extends Saveable>, ? extends Original> function1) {
        Function2 function3 = new Function2() { // from class: androidx.compose.runtime.saveable.ListSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ListSaverKt.listSaver$lambda$1(function2, (SaverScope) obj, obj2);
            }
        };
        Intrinsics.checkNotNull(function1, "");
        return SaverKt.Saver(function3, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object listSaver$lambda$1(Function2 function2, SaverScope saverScope, Object obj) {
        List list = (List) function2.invoke(saverScope, obj);
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            if (obj2 != null && !saverScope.canBeSaved(obj2)) {
                StringBuilder sb = new StringBuilder("item at index ");
                sb.append(i);
                sb.append(" can't be saved: ");
                sb.append(obj2);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
