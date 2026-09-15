package defpackage;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\b8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"LProcessingNodeExternalSyntheticLambda4;", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProcessingNodeExternalSyntheticLambda4 extends Painter {
    public static final ProcessingNodeExternalSyntheticLambda4 INSTANCE = new ProcessingNodeExternalSyntheticLambda4();

    private ProcessingNodeExternalSyntheticLambda4() {
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo0getIntrinsicSizeNHjbRc() {
        return Size.INSTANCE.m4051getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "");
    }
}
