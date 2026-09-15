package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0014\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR$\u0010%\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR+\u0010)\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u0014\u0010+\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0014\u0010-\u001a\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0014\u00100\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R+\u00104\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R+\u0010@\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010D\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u001f\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010\u001cR+\u0010H\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001f\u001a\u0004\bF\u0010\u001a\"\u0004\bG\u0010\u001cR0\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u0001058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u00109\"\u0004\bK\u0010LR\"\u0010M\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR+\u0010T\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\u001f\u001a\u0004\bR\u0010\u001a\"\u0004\bS\u0010\u001cR+\u0010X\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u001f\u001a\u0004\bV\u0010\u001a\"\u0004\bW\u0010\u001cR\u0014\u0010Z\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010/R+\u0010^\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\u001f\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010\u001cR\u001a\u0010_\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010/R\u001a\u0010c\u001a\u00020b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR+\u0010l\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00058A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010/\"\u0004\bj\u0010kR \u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/RangeSliderState;", "", "", "p0", "p1", "", "p2", "Lkotlin/Function0;", "", "p3", "Lkotlin/ranges/ClosedFloatingPointRange;", "p4", "<init>", "(FFILkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;)V", "", "onDrag$material3_release", "(ZF)V", "scaleToOffset", "(FFF)F", "Landroidx/compose/material3/SliderRange;", "scaleToUserValue-owVgs5E", "(FFJ)J", "scaleToUserValue", "updateMinMaxPx$material3_release", "()V", "getActiveRangeEnd", "()F", "setActiveRangeEnd", "(F)V", "activeRangeEnd", "activeRangeEndState$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getActiveRangeEndState", "setActiveRangeEndState", "activeRangeEndState", "getActiveRangeStart", "setActiveRangeStart", "activeRangeStart", "activeRangeStartState$delegate", "getActiveRangeStartState", "setActiveRangeStartState", "activeRangeStartState", "getCoercedActiveRangeEndAsFraction$material3_release", "coercedActiveRangeEndAsFraction", "getCoercedActiveRangeStartAsFraction$material3_release", "coercedActiveRangeStartAsFraction", "getEndSteps$material3_release", "()I", "endSteps", "endThumbWidth$delegate", "getEndThumbWidth$material3_release", "setEndThumbWidth$material3_release", "endThumbWidth", "Lkotlin/Function1;", "gestureEndAction", "Lkotlin/jvm/functions/Function1;", "getGestureEndAction$material3_release", "()Lkotlin/jvm/functions/Function1;", "isRtl$delegate", "Landroidx/compose/runtime/MutableState;", "isRtl$material3_release", "()Z", "setRtl$material3_release", "(Z)V", "isRtl", "maxPx$delegate", "getMaxPx", "setMaxPx", "maxPx", "minPx$delegate", "getMinPx", "setMinPx", "minPx", "onValueChange", "getOnValueChange$material3_release", "setOnValueChange$material3_release", "(Lkotlin/jvm/functions/Function1;)V", "onValueChangeFinished", "Lkotlin/jvm/functions/Function0;", "getOnValueChangeFinished", "()Lkotlin/jvm/functions/Function0;", "rawOffsetEnd$delegate", "getRawOffsetEnd$material3_release", "setRawOffsetEnd$material3_release", "rawOffsetEnd", "rawOffsetStart$delegate", "getRawOffsetStart$material3_release", "setRawOffsetStart$material3_release", "rawOffsetStart", "getStartSteps$material3_release", "startSteps", "startThumbWidth$delegate", "getStartThumbWidth$material3_release", "setStartThumbWidth$material3_release", "startThumbWidth", "steps", "I", "getSteps", "", "tickFractions", "[F", "getTickFractions$material3_release", "()[F", "totalWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getTotalWidth$material3_release", "setTotalWidth$material3_release", "(I)V", "totalWidth", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "getValueRange", "()Lkotlin/ranges/ClosedFloatingPointRange;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RangeSliderState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: activeRangeEndState$delegate, reason: from kotlin metadata */
    private final MutableFloatState activeRangeEndState;

    /* JADX INFO: renamed from: activeRangeStartState$delegate, reason: from kotlin metadata */
    private final MutableFloatState activeRangeStartState;

    /* JADX INFO: renamed from: endThumbWidth$delegate, reason: from kotlin metadata */
    private final MutableFloatState endThumbWidth;
    private final Function1<Boolean, Unit> gestureEndAction;

    /* JADX INFO: renamed from: isRtl$delegate, reason: from kotlin metadata */
    private final MutableState isRtl;

    /* JADX INFO: renamed from: maxPx$delegate, reason: from kotlin metadata */
    private final MutableFloatState maxPx;

    /* JADX INFO: renamed from: minPx$delegate, reason: from kotlin metadata */
    private final MutableFloatState minPx;
    private Function1<? super SliderRange, Unit> onValueChange;
    private final Function0<Unit> onValueChangeFinished;

    /* JADX INFO: renamed from: rawOffsetEnd$delegate, reason: from kotlin metadata */
    private final MutableFloatState rawOffsetEnd;

    /* JADX INFO: renamed from: rawOffsetStart$delegate, reason: from kotlin metadata */
    private final MutableFloatState rawOffsetStart;

    /* JADX INFO: renamed from: startThumbWidth$delegate, reason: from kotlin metadata */
    private final MutableFloatState startThumbWidth;
    private final int steps;
    private final float[] tickFractions;

    /* JADX INFO: renamed from: totalWidth$delegate, reason: from kotlin metadata */
    private final MutableIntState totalWidth;
    private final ClosedFloatingPointRange<Float> valueRange;

    public RangeSliderState(float f, float f2, int i, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.steps = i;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.activeRangeStartState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.activeRangeEndState = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.tickFractions = SliderKt.stepsToTickFractions(i);
        this.startThumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isRtl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new Function1<Boolean, Unit>() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Function0<Unit> onValueChangeFinished = this.this$0.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
            }

            {
                super(1);
            }
        };
        this.maxPx = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public final int getSteps() {
        return this.steps;
    }

    public final Function0<Unit> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public /* synthetic */ RangeSliderState(float f, float f2, int i, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : function0, (i2 & 16) != 0 ? RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange);
    }

    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState.getFloatValue();
    }

    private final void setActiveRangeStartState(float f) {
        this.activeRangeStartState.setFloatValue(f);
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState.getFloatValue();
    }

    private final void setActiveRangeEndState(float f) {
        this.activeRangeEndState.setFloatValue(f);
    }

    public final void setActiveRangeStart(float f) {
        setActiveRangeStartState(SliderKt.snapValueToTick(RangesKt.coerceIn(f, this.valueRange.getStart().floatValue(), getActiveRangeEnd()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final void setActiveRangeEnd(float f) {
        setActiveRangeEndState(SliderKt.snapValueToTick(RangesKt.coerceIn(f, getActiveRangeStart(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final Function1<SliderRange, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(Function1<? super SliderRange, Unit> function1) {
        this.onValueChange = function1;
    }

    /* JADX INFO: renamed from: getTickFractions$material3_release, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final float getStartThumbWidth$material3_release() {
        return this.startThumbWidth.getFloatValue();
    }

    public final void setStartThumbWidth$material3_release(float f) {
        this.startThumbWidth.setFloatValue(f);
    }

    public final float getEndThumbWidth$material3_release() {
        return this.endThumbWidth.getFloatValue();
    }

    public final void setEndThumbWidth$material3_release(float f) {
        this.endThumbWidth.setFloatValue(f);
    }

    public final int getTotalWidth$material3_release() {
        return this.totalWidth.getIntValue();
    }

    public final void setTotalWidth$material3_release(int i) {
        this.totalWidth.setIntValue(i);
    }

    public final float getRawOffsetStart$material3_release() {
        return this.rawOffsetStart.getFloatValue();
    }

    public final void setRawOffsetStart$material3_release(float f) {
        this.rawOffsetStart.setFloatValue(f);
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.rawOffsetEnd.getFloatValue();
    }

    public final void setRawOffsetEnd$material3_release(float f) {
        this.rawOffsetEnd.setFloatValue(f);
    }

    public final boolean isRtl$material3_release() {
        return ((Boolean) this.isRtl.getValue()).booleanValue();
    }

    public final void setRtl$material3_release(boolean z) {
        this.isRtl.setValue(Boolean.valueOf(z));
    }

    public final Function1<Boolean, Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    private final float getMaxPx() {
        return this.maxPx.getFloatValue();
    }

    private final void setMaxPx(float f) {
        this.maxPx.setFloatValue(f);
    }

    private final float getMinPx() {
        return this.minPx.getFloatValue();
    }

    private final void setMinPx(float f) {
        this.minPx.setFloatValue(f);
    }

    public final void onDrag$material3_release(boolean p0, float p1) {
        long jSliderRange;
        if (p0) {
            setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + p1);
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3_release = getRawOffsetEnd$material3_release();
            jSliderRange = SliderKt.SliderRange(SliderKt.snapValueToTick(RangesKt.coerceIn(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + p1);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, SliderKt.snapValueToTick(RangesKt.coerceIn(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()));
        }
        long jM2301scaleToUserValueowVgs5E = m2301scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), jSliderRange);
        if (SliderRange.m2411equalsimpl0(jM2301scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            return;
        }
        Function1<? super SliderRange, Unit> function1 = this.onValueChange;
        if (function1 == null) {
            setActiveRangeStart(SliderRange.m2413getStartimpl(jM2301scaleToUserValueowVgs5E));
            setActiveRangeEnd(SliderRange.m2412getEndInclusiveimpl(jM2301scaleToUserValueowVgs5E));
        } else if (function1 != null) {
            function1.invoke(SliderRange.m2408boximpl(jM2301scaleToUserValueowVgs5E));
        }
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeStart());
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeEnd());
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3_release());
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3_release()));
    }

    /* JADX INFO: renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m2301scaleToUserValueowVgs5E(float p0, float p1, long p2) {
        return SliderKt.m2404scaleziovWd0(p0, p1, p2, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float p0, float p1, float p2) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), p2, p0, p1);
    }

    public final void updateMinMaxPx$material3_release() {
        float fMax = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / 2.0f), 0.0f);
        float fMin = Math.min(getStartThumbWidth$material3_release() / 2.0f, fMax);
        if (getMinPx() == fMin && getMaxPx() == fMax) {
            return;
        }
        setMinPx(fMin);
        setMaxPx(fMax);
        setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
        setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
    }

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }
}
