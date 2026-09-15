package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J7\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "", "Landroidx/compose/ui/graphics/Shape;", "p0", "Landroidx/compose/ui/geometry/Size;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "Landroidx/compose/ui/graphics/shadow/Shadow;", "p4", "Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "obtainDropShadowRenderer-eZhPAX0", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "obtainDropShadowRenderer", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DropShadowRendererProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: obtainDropShadowRenderer-eZhPAX0 */
    DropShadowRenderer mo4924obtainDropShadowRenderereZhPAX0(Shape p0, long p1, LayoutDirection p2, Density p3, Shadow p4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "Default", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "getDefault", "()Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DropShadowRendererProvider Default = new DropShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.DropShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
            /* JADX INFO: renamed from: obtainDropShadowRenderer-eZhPAX0 */
            public final DropShadowRenderer mo4924obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new DropShadowRenderer(shadow, shape.mo605createOutlinePq9zytI(j, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final DropShadowRendererProvider getDefault() {
            return Default;
        }
    }
}
