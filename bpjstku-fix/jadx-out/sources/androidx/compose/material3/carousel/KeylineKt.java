package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a8\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00002\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"", "p0", "Landroidx/compose/material3/carousel/CarouselAlignment;", "p1", "Lkotlin/Function1;", "Landroidx/compose/material3/carousel/KeylineListScope;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Landroidx/compose/material3/carousel/KeylineList;", "keylineListOf", "(FLandroidx/compose/material3/carousel/CarouselAlignment;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;", "", "p3", "(FIFLkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeylineKt {
    public static final KeylineList keylineListOf(float f, CarouselAlignment carouselAlignment, Function1<? super KeylineListScope, Unit> function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithAlignment(f, carouselAlignment);
    }

    public static final KeylineList keylineListOf(float f, int i, float f2, Function1<? super KeylineListScope, Unit> function1) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f, i, f2);
    }
}
