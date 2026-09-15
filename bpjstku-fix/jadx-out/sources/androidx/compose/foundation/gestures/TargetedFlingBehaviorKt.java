package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\" \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function1;", "", "", "NoOnReport", "Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TargetedFlingBehaviorKt {
    private static final Function1<Float, Unit> NoOnReport = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.TargetedFlingBehaviorKt$NoOnReport$1
        public final void invoke(float f) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }
    };
}
