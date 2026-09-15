package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001:\u0004\u0005456J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0012\u0010\u0013JK\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\r\u001a\u00020\u00172\u001c\b\u0002\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H'¢\u0006\u0004\b\u001d\u0010\u001eJs\u0010*\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u00162\b\b\u0002\u0010(\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020\u0004H'¢\u0006\u0004\b*\u0010+JU\u0010,\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020!2\b\b\u0002\u0010 \u001a\u00020%2\b\b\u0002\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010-JU\u0010.\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020!2\b\b\u0002\u0010 \u001a\u00020%2\b\b\u0002\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u0004H'¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0014*\u00020\u0014H'¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/graphics/Shape;", "p0", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "OverlayClip", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "rememberSharedContentState", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/Alignment;", "p1", "Landroidx/compose/animation/EnterTransition;", "scaleInSharedContentToBounds", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "scaleOutSharedContentToBounds", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", "", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "p2", "renderInSharedTransitionScopeOverlay", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "p3", "Landroidx/compose/animation/BoundsTransform;", "p4", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "p5", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "p6", "p7", "p8", "p9", "sharedBounds", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$ResizeMode;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "sharedElement", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "sharedElementWithCallerManagedVisibility", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/SharedTransitionScope$SharedContentState;ZLandroidx/compose/animation/BoundsTransform;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZFLandroidx/compose/animation/SharedTransitionScope$OverlayClip;)Landroidx/compose/ui/Modifier;", "skipToLookaheadSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "isTransitionActive", "()Z", "PlaceHolderSize", "ResizeMode", "SharedContentState"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SharedTransitionScope extends LookaheadScope {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "p0", "Landroidx/compose/ui/geometry/Rect;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/unit/Density;", "p3", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Path;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OverlayClip {
        Path getClipPath(SharedContentState p0, Rect p1, LayoutDirection p2, Density p3);
    }

    OverlayClip OverlayClip(Shape p0);

    boolean isTransitionActive();

    SharedContentState rememberSharedContentState(Object obj, Composer composer, int i);

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, Function0<Boolean> function0, float f, Function2<? super LayoutDirection, ? super Density, ? extends Path> function2);

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z, float f, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z, float f, OverlayClip overlayClip);

    Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z2, float f, OverlayClip overlayClip);

    Modifier skipToLookaheadSize(Modifier modifier);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "", "Landroidx/compose/ui/unit/IntSize;", "p0", "p1", "calculateSize-JyjRU_E", "(JJ)J", "calculateSize", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PlaceHolderSize {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* JADX INFO: renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo429calculateSizeJyjRU_E(long p0, long p1);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "animatedSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "getAnimatedSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "contentSize", "getContentSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PlaceHolderSize animatedSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* JADX INFO: renamed from: calculateSize-JyjRU_E */
                public final long mo429calculateSizeJyjRU_E(long j, long j2) {
                    return j2;
                }
            };
            private static final PlaceHolderSize contentSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* JADX INFO: renamed from: calculateSize-JyjRU_E */
                public final long mo429calculateSizeJyjRU_E(long j, long j2) {
                    return j;
                }
            };

            private Companion() {
            }

            public final PlaceHolderSize getAnimatedSize() {
                return animatedSize;
            }

            public final PlaceHolderSize getContentSize() {
                return contentSize;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "", "Companion", "Landroidx/compose/animation/RemeasureImpl;", "Landroidx/compose/animation/ScaleToBoundsImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ResizeMode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/ContentScale;", "p0", "Landroidx/compose/ui/Alignment;", "p1", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "ScaleToBounds", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "RemeasureToBounds", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "getRemeasureToBounds", "()Landroidx/compose/animation/SharedTransitionScope$ResizeMode;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }

            public static /* synthetic */ ResizeMode ScaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i, Object obj) {
                if ((i & 1) != 0) {
                    contentScale = ContentScale.INSTANCE.getFillWidth();
                }
                if ((i & 2) != 0) {
                    alignment = Alignment.INSTANCE.getCenter();
                }
                return companion.ScaleToBounds(contentScale, alignment);
            }

            public final ResizeMode ScaleToBounds(ContentScale p0, Alignment p1) {
                return SharedTransitionScopeKt.ScaleToBoundsCached(p0, p1);
            }
        }
    }

    static /* synthetic */ EnterTransition scaleInSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
        }
        if ((i & 1) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        return sharedTransitionScope.scaleInSharedContentToBounds(contentScale, alignment);
    }

    @Deprecated(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    default EnterTransition scaleInSharedContentToBounds(ContentScale p0, Alignment p1) {
        return EnterExitTransitionKt.withEffect(EnterTransition.INSTANCE.getNone(), new ContentScaleTransitionEffect(p0, p1));
    }

    static /* synthetic */ ExitTransition scaleOutSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
        }
        if ((i & 1) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getCenter();
        }
        return sharedTransitionScope.scaleOutSharedContentToBounds(contentScale, alignment);
    }

    @Deprecated(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    default ExitTransition scaleOutSharedContentToBounds(ContentScale p0, Alignment p1) {
        return EnterExitTransitionKt.withEffect(ExitTransition.INSTANCE.getNone(), new ContentScaleTransitionEffect(p0, p1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, Function0 function0, float f, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
        }
        if ((i & 1) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScope.renderInSharedTransitionScopeOverlay.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
                }

                {
                    super(0);
                }
            };
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            function2 = SharedTransitionScopeKt.DefaultClipInOverlayDuringTransition;
        }
        return sharedTransitionScope.renderInSharedTransitionScopeOverlay(modifier, function0, f, function2);
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z, float f, OverlayClip overlayClip, int i, Object obj) {
        if (obj == null) {
            return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, (i & 4) != 0 ? SharedTransitionScopeKt.DefaultBoundsTransform : boundsTransform, (i & 8) != 0 ? PlaceHolderSize.INSTANCE.getContentSize() : placeHolderSize, (i & 16) != 0 ? true : z, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z, float f, OverlayClip overlayClip, int i, Object obj) {
        if (obj == null) {
            return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, (i & 4) != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : enterTransition, (i & 8) != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null) : exitTransition, (i & 16) != 0 ? SharedTransitionScopeKt.DefaultBoundsTransform : boundsTransform, (i & 32) != 0 ? ResizeMode.INSTANCE.ScaleToBounds(ContentScale.INSTANCE.getFillWidth(), Alignment.INSTANCE.getCenter()) : resizeMode, (i & 64) != 0 ? PlaceHolderSize.INSTANCE.getContentSize() : placeHolderSize, (i & 128) != 0 ? true : z, (i & 256) != 0 ? 0.0f : f, (i & 512) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
    }

    static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z2, float f, OverlayClip overlayClip, int i, Object obj) {
        if (obj == null) {
            return sharedTransitionScope.sharedElementWithCallerManagedVisibility(modifier, sharedContentState, z, (i & 4) != 0 ? SharedTransitionScopeKt.DefaultBoundsTransform : boundsTransform, (i & 8) != 0 ? PlaceHolderSize.INSTANCE.getContentSize() : placeHolderSize, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R/\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\t8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "", "p0", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay", "()Landroidx/compose/ui/graphics/Path;", "clipPathInOverlay", "Landroidx/compose/animation/SharedElementInternalState;", "internalState$delegate", "Landroidx/compose/runtime/MutableState;", "getInternalState$animation_release", "()Landroidx/compose/animation/SharedElementInternalState;", "setInternalState$animation_release", "(Landroidx/compose/animation/SharedElementInternalState;)V", "internalState", "", "isMatchFound", "()Z", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getNonNullInternalState", "nonNullInternalState", "getParentSharedContentState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "parentSharedContentState"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SharedContentState {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: internalState$delegate, reason: from kotlin metadata */
        private final MutableState internalState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final Object key;

        public SharedContentState(Object obj) {
            this.key = obj;
        }

        public final Object getKey() {
            return this.key;
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementInternalState internalState$animation_release = getInternalState$animation_release();
            if (internalState$animation_release == null || (sharedElement = internalState$animation_release.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay();
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementInternalState parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        public final SharedElementInternalState getInternalState$animation_release() {
            return (SharedElementInternalState) this.internalState.getValue();
        }

        public final void setInternalState$animation_release(SharedElementInternalState sharedElementInternalState) {
            this.internalState.setValue(sharedElementInternalState);
        }

        private final SharedElementInternalState getNonNullInternalState() {
            SharedElementInternalState internalState$animation_release = getInternalState$animation_release();
            if (internalState$animation_release != null) {
                return internalState$animation_release;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.".toString());
        }
    }
}
