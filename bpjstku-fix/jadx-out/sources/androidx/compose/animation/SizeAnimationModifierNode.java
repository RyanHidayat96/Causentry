package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001>BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012&\b\u0002\u0010\n\u001a \u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\b\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000eJ&\u0010\u001b\u001a\u00020\u0018*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0013H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R/\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010\u0004\u001a\u0004\u0018\u00010\"8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R@\u00100\u001a \u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\b\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R'\u00106\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00138\u0002@CX\u0083\u000eø\u0001\u0001¢\u0006\f\n\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0019\u0010=\u001a\u00020\u00038\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "p0", "Landroidx/compose/ui/Alignment;", "p1", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "p2", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)V", "animateTo-mzRDjE0", "(J)J", "animateTo", "onAttach", "()V", "onReset", "Landroidx/compose/ui/unit/Constraints;", "targetConstraints-ZezNO4M", "targetConstraints", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;)V", "animData", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "lookaheadConstraints", "J", "setLookaheadConstraints-BRTryo0", "(J)V", "", "lookaheadConstraintsAvailable", "Z", "lookaheadSize", "AnimData"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;

    /* JADX INFO: renamed from: animData$delegate, reason: from kotlin metadata */
    private final MutableState animData;
    private AnimationSpec<IntSize> animationSpec;
    private Function2<? super IntSize, ? super IntSize, Unit> listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(animationSpec, (i & 2) != 0 ? Alignment.INSTANCE.getTopStart() : alignment, (i & 4) != 0 ? null : function2);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final Function2<IntSize, IntSize, Unit> getListener() {
        return this.listener;
    }

    public final void setListener(Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.listener = function2;
    }

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, Alignment alignment, Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = function2;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m436setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraints = j;
        this.lookaheadConstraintsAvailable = true;
    }

    /* JADX INFO: renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m437targetConstraintsZezNO4M(long p0) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : p0;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR%\u0010\u001d\u001a\u00020\u00038\u0007@\u0007X\u0087\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "p0", "p1", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2-YbymL2g", "()J", "component2", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "anim", "Landroidx/compose/animation/core/Animatable;", "getAnim", "startSize", "J", "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m442getStartSizeYbymL2g() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m443setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m439copyO0kMr_c$default(AnimData animData, Animatable animatable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i & 2) != 0) {
                j = animData.startSize;
            }
            return animData.m441copyO0kMr_c(animatable, j);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name and from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m441copyO0kMr_c(Animatable<IntSize, AnimationVector2D> p0, long p1) {
            return new AnimData(p0, p1, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) p0;
            return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.m7104equalsimpl0(this.startSize, animData.startSize);
        }

        public final int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m7107hashCodeimpl(this.startSize);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimData(anim=");
            sb.append(this.anim);
            sb.append(", startSize=");
            sb.append((Object) IntSize.m7109toStringimpl(this.startSize));
            sb.append(')');
            return sb.toString();
        }
    }

    public final AnimData getAnimData() {
        return (AnimData) this.animData.getValue();
    }

    public final void setAnimData(AnimData animData) {
        this.animData.setValue(animData);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        setAnimData(null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo412measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableMo5637measureBRTryo0;
        long jM6902constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m436setLookaheadConstraintsBRTryo0(j);
            placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
        } else {
            placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(m437targetConstraintsZezNO4M(j));
        }
        final Placeable placeable = placeableMo5637measureBRTryo0;
        final long jIntSize = IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight());
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = jIntSize;
            jM6902constrain4WqzIAM = jIntSize;
        } else {
            jM6902constrain4WqzIAM = ConstraintsKt.m6902constrain4WqzIAM(j, m438animateTomzRDjE0(AnimationModifierKt.m389isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jIntSize));
        }
        final int iM7106getWidthimpl = IntSize.m7106getWidthimpl(jM6902constrain4WqzIAM);
        final int iM7105getHeightimpl = IntSize.m7105getHeightimpl(jM6902constrain4WqzIAM);
        return MeasureScope.layout$default(measureScope, iM7106getWidthimpl, iM7105getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m5703placeRelative70tqf50$default(placementScope, placeable, this.this$0.getAlignment().mo3697alignKFBX0sM(jIntSize, IntSizeKt.IntSize(iM7106getWidthimpl, iM7105getHeightimpl), measureScope.getLayoutDirection()), 0.0f, 2, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m438animateTomzRDjE0(long p0) {
        AnimData animData = getAnimData();
        if (animData != null) {
            boolean z = (IntSize.m7104equalsimpl0(p0, animData.getAnim().getValue().m7110unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m7104equalsimpl0(p0, animData.getAnim().getTargetValue().m7110unboximpl()) || z) {
                animData.m443setStartSizeozmzZPI(animData.getAnim().getValue().m7110unboximpl());
                b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, p0, this, null), 3, null);
            }
        } else {
            animData = new AnimData(new Animatable(IntSize.m7098boximpl(p0), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), IntSize.m7098boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), p0, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m7110unboximpl();
    }
}
