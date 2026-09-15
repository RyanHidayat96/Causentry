package androidx.compose.ui.graphics.layer.view;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/view/ViewLayerContainer;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "dispatchGetDisplayList", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewLayerContainer extends DrawChildContainer {
    @Override // androidx.compose.ui.graphics.layer.view.DrawChildContainer, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas p0) {
    }

    protected final void dispatchGetDisplayList() {
    }

    public ViewLayerContainer(Context context) {
        super(context);
    }
}
