package com.nbs.utils.exts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "b", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
public final class ViewExtKt$onTextChange$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Function1 $doOnChange;

    public final void b(String str) {
        this.$doOnChange.invoke(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewExtKt$onTextChange$2(Function1 function1) {
        super(1);
        this.$doOnChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        b(str);
        return Unit.INSTANCE;
    }
}
