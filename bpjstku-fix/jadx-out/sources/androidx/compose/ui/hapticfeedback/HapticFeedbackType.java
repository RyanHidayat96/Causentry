package androidx.compose.ui.hapticfeedback;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u000f\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "", "p0", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "value", "I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class HapticFeedbackType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4994constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4996equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    public final String toString() {
        return m4998toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4998toStringimpl(int i) {
        Companion companion = INSTANCE;
        if (m4996equalsimpl0(i, companion.m5000getConfirm5zf0vsI())) {
            return "Confirm";
        }
        if (m4996equalsimpl0(i, companion.m5001getContextClick5zf0vsI())) {
            return "ContextClick";
        }
        if (m4996equalsimpl0(i, companion.m5002getGestureEnd5zf0vsI())) {
            return "GestureEnd";
        }
        if (m4996equalsimpl0(i, companion.m5003getGestureThresholdActivate5zf0vsI())) {
            return "GestureThresholdActivate";
        }
        if (m4996equalsimpl0(i, companion.m5004getKeyboardTap5zf0vsI())) {
            return "KeyboardTap";
        }
        if (m4996equalsimpl0(i, companion.m5005getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m4996equalsimpl0(i, companion.m5006getReject5zf0vsI())) {
            return "Reject";
        }
        if (m4996equalsimpl0(i, companion.m5007getSegmentFrequentTick5zf0vsI())) {
            return "SegmentFrequentTick";
        }
        if (m4996equalsimpl0(i, companion.m5008getSegmentTick5zf0vsI())) {
            return "SegmentTick";
        }
        if (m4996equalsimpl0(i, companion.m5009getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        if (m4996equalsimpl0(i, companion.m5010getToggleOff5zf0vsI())) {
            return "ToggleOff";
        }
        if (m4996equalsimpl0(i, companion.m5011getToggleOn5zf0vsI())) {
            return "ToggleOn";
        }
        return m4996equalsimpl0(i, companion.m5012getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m4993boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010 \u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010\"\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b!\u0010\t"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "values", "()Ljava/util/List;", "getConfirm-5zf0vsI", "()I", "Confirm", "getContextClick-5zf0vsI", "ContextClick", "getGestureEnd-5zf0vsI", "GestureEnd", "getGestureThresholdActivate-5zf0vsI", "GestureThresholdActivate", "getKeyboardTap-5zf0vsI", "KeyboardTap", "getLongPress-5zf0vsI", "LongPress", "getReject-5zf0vsI", "Reject", "getSegmentFrequentTick-5zf0vsI", "SegmentFrequentTick", "getSegmentTick-5zf0vsI", "SegmentTick", "getTextHandleMove-5zf0vsI", "TextHandleMove", "getToggleOff-5zf0vsI", "ToggleOff", "getToggleOn-5zf0vsI", "ToggleOn", "getVirtualKey-5zf0vsI", "VirtualKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m5000getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5013getConfirm5zf0vsI();
        }

        /* JADX INFO: renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m5001getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5014getContextClick5zf0vsI();
        }

        /* JADX INFO: renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m5002getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5015getGestureEnd5zf0vsI();
        }

        /* JADX INFO: renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m5003getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5016getGestureThresholdActivate5zf0vsI();
        }

        /* JADX INFO: renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m5004getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5017getKeyboardTap5zf0vsI();
        }

        /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m5005getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5018getLongPress5zf0vsI();
        }

        /* JADX INFO: renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m5006getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5019getReject5zf0vsI();
        }

        /* JADX INFO: renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m5007getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5020getSegmentFrequentTick5zf0vsI();
        }

        /* JADX INFO: renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m5008getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5021getSegmentTick5zf0vsI();
        }

        /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m5009getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5022getTextHandleMove5zf0vsI();
        }

        /* JADX INFO: renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m5010getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5023getToggleOff5zf0vsI();
        }

        /* JADX INFO: renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m5011getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5024getToggleOn5zf0vsI();
        }

        /* JADX INFO: renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m5012getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5025getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m4993boximpl(m5000getConfirm5zf0vsI()), HapticFeedbackType.m4993boximpl(m5001getContextClick5zf0vsI()), HapticFeedbackType.m4993boximpl(m5002getGestureEnd5zf0vsI()), HapticFeedbackType.m4993boximpl(m5003getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m4993boximpl(m5004getKeyboardTap5zf0vsI()), HapticFeedbackType.m4993boximpl(m5005getLongPress5zf0vsI()), HapticFeedbackType.m4993boximpl(m5006getReject5zf0vsI()), HapticFeedbackType.m4993boximpl(m5007getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m4993boximpl(m5008getSegmentTick5zf0vsI()), HapticFeedbackType.m4993boximpl(m5009getTextHandleMove5zf0vsI()), HapticFeedbackType.m4993boximpl(m5010getToggleOff5zf0vsI()), HapticFeedbackType.m4993boximpl(m5011getToggleOn5zf0vsI()), HapticFeedbackType.m4993boximpl(m5012getVirtualKey5zf0vsI())});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4995equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).getValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4997hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return m4995equalsimpl(this.value, p0);
    }

    public final int hashCode() {
        return m4997hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
