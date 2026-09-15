package androidx.compose.ui.graphics.shadow;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0019H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0005R*\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006j\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Landroidx/compose/ui/graphics/shadow/AndroidShadowContext;", "Landroidx/compose/ui/graphics/shadow/PlatformShadowContext;", "Landroidx/compose/ui/graphics/shadow/DropShadowRendererProvider;", "Landroidx/compose/ui/graphics/shadow/InnerShadowRendererProvider;", "<init>", "()V", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/graphics/shadow/AndroidShadowContext$ShadowKey;", "Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "Landroidx/compose/ui/graphics/shadow/DropShadowCache;", "obtainDropShadowCache", "()Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/graphics/shadow/InnerShadowRenderer;", "Landroidx/compose/ui/graphics/shadow/InnerShadowCache;", "obtainInnerShadowCache", "obtainShadowKey", "()Landroidx/compose/ui/graphics/shadow/AndroidShadowContext$ShadowKey;", "Landroidx/compose/ui/graphics/Shape;", "p0", "Landroidx/compose/ui/geometry/Size;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "Landroidx/compose/ui/graphics/shadow/Shadow;", "p4", "obtainDropShadowRenderer-eZhPAX0", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/DropShadowRenderer;", "obtainDropShadowRenderer", "obtainInnerShadowRenderer-eZhPAX0", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/InnerShadowRenderer;", "obtainInnerShadowRenderer", "Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "createDropShadowPainter", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "createInnerShadowPainter", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "", "clearCache", "dropShadowCache", "Landroidx/collection/MutableScatterMap;", "innerShadowCache", "shadowKey", "Landroidx/compose/ui/graphics/shadow/AndroidShadowContext$ShadowKey;", "ShadowKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AndroidShadowContext implements PlatformShadowContext, DropShadowRendererProvider, InnerShadowRendererProvider {
    private MutableScatterMap<ShadowKey, DropShadowRenderer> dropShadowCache;
    private MutableScatterMap<ShadowKey, InnerShadowRenderer> innerShadowCache;
    private ShadowKey shadowKey;

    private final MutableScatterMap<ShadowKey, DropShadowRenderer> obtainDropShadowCache() {
        MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap = this.dropShadowCache;
        if (mutableScatterMap != null) {
            return mutableScatterMap;
        }
        MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
        this.dropShadowCache = mutableScatterMap2;
        return mutableScatterMap2;
    }

    private final MutableScatterMap<ShadowKey, InnerShadowRenderer> obtainInnerShadowCache() {
        MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap = this.innerShadowCache;
        if (mutableScatterMap != null) {
            return mutableScatterMap;
        }
        MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
        this.innerShadowCache = mutableScatterMap2;
        return mutableScatterMap2;
    }

    private final ShadowKey obtainShadowKey() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H×\u0001¢\u0006\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u00103R\"\u00104\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010="}, d2 = {"Landroidx/compose/ui/graphics/shadow/AndroidShadowContext$ShadowKey;", "", "Landroidx/compose/ui/graphics/Shape;", "p0", "Landroidx/compose/ui/geometry/Size;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "", "p3", "Landroidx/compose/ui/graphics/shadow/Shadow;", "p4", "<init>", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;FLandroidx/compose/ui/graphics/shadow/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/graphics/Shape;", "component2-NH-jbRc", "()J", "component2", "component3", "()Landroidx/compose/ui/unit/LayoutDirection;", "component4", "()F", "component5", "()Landroidx/compose/ui/graphics/shadow/Shadow;", "copy-eZhPAX0", "(Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/ui/unit/LayoutDirection;FLandroidx/compose/ui/graphics/shadow/Shadow;)Landroidx/compose/ui/graphics/shadow/AndroidShadowContext$ShadowKey;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "J", "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "density", "F", "getDensity", "setDensity", "(F)V", "shadow", "Landroidx/compose/ui/graphics/shadow/Shadow;", "getShadow", "setShadow", "(Landroidx/compose/ui/graphics/shadow/Shadow;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShadowKey {
        private float density;
        private LayoutDirection layoutDirection;
        private Shadow shadow;
        private Shape shape;
        private long size;

        private ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            this.shape = shape;
            this.size = j;
            this.layoutDirection = layoutDirection;
            this.density = f;
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 2) != 0 ? Size.INSTANCE.m4052getZeroNHjbRc() : j, (i & 4) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? null : shadow, null);
        }

        public final Shape getShape() {
            return this.shape;
        }

        public final void setShape(Shape shape) {
            this.shape = shape;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m4929getSizeNHjbRc() {
            return this.size;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m4930setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final float getDensity() {
            return this.density;
        }

        public final void setDensity(float f) {
            this.density = f;
        }

        public final Shadow getShadow() {
            return this.shadow;
        }

        public final void setShadow(Shadow shadow) {
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
            this(shape, j, layoutDirection, f, shadow);
        }

        /* JADX INFO: renamed from: copy-eZhPAX0$default, reason: not valid java name */
        public static /* synthetic */ ShadowKey m4926copyeZhPAX0$default(ShadowKey shadowKey, Shape shape, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, Object obj) {
            if ((i & 1) != 0) {
                shape = shadowKey.shape;
            }
            if ((i & 2) != 0) {
                j = shadowKey.size;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                layoutDirection = shadowKey.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 8) != 0) {
                f = shadowKey.density;
            }
            float f2 = f;
            if ((i & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            return shadowKey.m4928copyeZhPAX0(shape, j2, layoutDirection2, f2, shadow);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Shape getShape() {
            return this.shape;
        }

        /* JADX INFO: renamed from: component2-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getDensity() {
            return this.density;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Shadow getShadow() {
            return this.shadow;
        }

        /* JADX INFO: renamed from: copy-eZhPAX0, reason: not valid java name */
        public final ShadowKey m4928copyeZhPAX0(Shape p0, long p1, LayoutDirection p2, float p3, Shadow p4) {
            return new ShadowKey(p0, p1, p2, p3, p4, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) p0;
            return Intrinsics.areEqual(this.shape, shadowKey.shape) && Size.m4039equalsimpl0(this.size, shadowKey.size) && this.layoutDirection == shadowKey.layoutDirection && Float.compare(this.density, shadowKey.density) == 0 && Intrinsics.areEqual(this.shadow, shadowKey.shadow);
        }

        public final int hashCode() {
            int iHashCode = this.shape.hashCode();
            int iM4044hashCodeimpl = Size.m4044hashCodeimpl(this.size);
            int iHashCode2 = this.layoutDirection.hashCode();
            int iHashCode3 = Float.hashCode(this.density);
            Shadow shadow = this.shadow;
            return (((((((iHashCode * 31) + iM4044hashCodeimpl) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (shadow == null ? 0 : shadow.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShadowKey(shape=");
            sb.append(this.shape);
            sb.append(", size=");
            sb.append((Object) Size.m4047toStringimpl(this.size));
            sb.append(", layoutDirection=");
            sb.append(this.layoutDirection);
            sb.append(", density=");
            sb.append(this.density);
            sb.append(", shadow=");
            sb.append(this.shadow);
            sb.append(')');
            return sb.toString();
        }
    }

    @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
    /* JADX INFO: renamed from: obtainDropShadowRenderer-eZhPAX0, reason: not valid java name */
    public final DropShadowRenderer mo4924obtainDropShadowRenderereZhPAX0(Shape p0, long p1, LayoutDirection p2, Density p3, Shadow p4) {
        DropShadowRenderer dropShadowRenderer;
        synchronized (this) {
            ShadowKey shadowKeyObtainShadowKey = obtainShadowKey();
            shadowKeyObtainShadowKey.setShape(p0);
            shadowKeyObtainShadowKey.m4930setSizeuvyYCjk(p1);
            shadowKeyObtainShadowKey.setLayoutDirection(p2);
            shadowKeyObtainShadowKey.setDensity(p3.getDensity());
            shadowKeyObtainShadowKey.setShadow(p4.copyWithoutOffset$ui_graphics_release());
            dropShadowRenderer = obtainDropShadowCache().get(shadowKeyObtainShadowKey);
            if (dropShadowRenderer == null) {
                DropShadowRenderer dropShadowRenderer2 = new DropShadowRenderer(p4, p0.mo605createOutlinePq9zytI(p1, p2, p3));
                obtainDropShadowCache().set(ShadowKey.m4926copyeZhPAX0$default(shadowKeyObtainShadowKey, null, 0L, null, 0.0f, null, 31, null), dropShadowRenderer2);
                dropShadowRenderer = dropShadowRenderer2;
            }
        }
        return dropShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
    /* JADX INFO: renamed from: obtainInnerShadowRenderer-eZhPAX0, reason: not valid java name */
    public final InnerShadowRenderer mo4925obtainInnerShadowRenderereZhPAX0(Shape p0, long p1, LayoutDirection p2, Density p3, Shadow p4) {
        InnerShadowRenderer innerShadowRenderer;
        synchronized (this) {
            ShadowKey shadowKeyObtainShadowKey = obtainShadowKey();
            shadowKeyObtainShadowKey.setShape(p0);
            shadowKeyObtainShadowKey.m4930setSizeuvyYCjk(p1);
            shadowKeyObtainShadowKey.setLayoutDirection(p2);
            shadowKeyObtainShadowKey.setDensity(p3.getDensity());
            shadowKeyObtainShadowKey.setShadow(p4);
            innerShadowRenderer = obtainInnerShadowCache().get(shadowKeyObtainShadowKey);
            if (innerShadowRenderer == null) {
                InnerShadowRenderer innerShadowRenderer2 = new InnerShadowRenderer(p4, p0.mo605createOutlinePq9zytI(p1, p2, p3));
                obtainInnerShadowCache().set(ShadowKey.m4926copyeZhPAX0$default(shadowKeyObtainShadowKey, null, 0L, null, 0.0f, null, 31, null), innerShadowRenderer2);
                innerShadowRenderer = innerShadowRenderer2;
            }
        }
        return innerShadowRenderer;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public final DropShadowPainter createDropShadowPainter(Shape p0, Shadow p1) {
        return new DropShadowPainter(p0, p1, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public final InnerShadowPainter createInnerShadowPainter(Shape p0, Shadow p1) {
        return new InnerShadowPainter(p0, p1, this);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowContext
    public final void clearCache() {
        synchronized (this) {
            MutableScatterMap<ShadowKey, DropShadowRenderer> mutableScatterMap = this.dropShadowCache;
            if (mutableScatterMap != null) {
                mutableScatterMap.clear();
            }
            MutableScatterMap<ShadowKey, InnerShadowRenderer> mutableScatterMap2 = this.innerShadowCache;
            if (mutableScatterMap2 != null) {
                mutableScatterMap2.clear();
            }
            this.shadowKey = null;
            Unit unit = Unit.INSTANCE;
        }
    }
}
