package androidx.view.compose;

import androidx.view.compose.internal.BackHandlerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/activity/compose/ComposeBackHandler;", "Landroidx/activity/compose/internal/BackHandlerCompat;", "Landroidx/activity/compose/BackHandlerInfo;", "p0", "<init>", "(Landroidx/activity/compose/BackHandlerInfo;)V", "", "onBackCompleted", "()V", "Lkotlin/Function0;", "currentOnBackCompleted", "Lkotlin/jvm/functions/Function0;", "getCurrentOnBackCompleted", "()Lkotlin/jvm/functions/Function0;", "setCurrentOnBackCompleted", "(Lkotlin/jvm/functions/Function0;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ComposeBackHandler extends BackHandlerCompat {
    private Function0<Unit> currentOnBackCompleted;

    public ComposeBackHandler(BackHandlerInfo backHandlerInfo) {
        super(backHandlerInfo);
        this.currentOnBackCompleted = new Function0() { // from class: androidx.activity.compose.ComposeBackHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
    }

    public final Function0<Unit> getCurrentOnBackCompleted() {
        return this.currentOnBackCompleted;
    }

    public final void setCurrentOnBackCompleted(Function0<Unit> function0) {
        this.currentOnBackCompleted = function0;
    }

    @Override // androidx.view.compose.internal.BackHandlerCompat
    public final void onBackCompleted() {
        this.currentOnBackCompleted.invoke();
    }
}
