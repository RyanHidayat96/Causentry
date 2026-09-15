package androidx.compose.ui.hapticfeedback;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;", "", "<init>", "()V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "Confirm", "I", "getConfirm-5zf0vsI", "()I", "ContextClick", "getContextClick-5zf0vsI", "GestureEnd", "getGestureEnd-5zf0vsI", "GestureThresholdActivate", "getGestureThresholdActivate-5zf0vsI", "KeyboardTap", "getKeyboardTap-5zf0vsI", "LongPress", "getLongPress-5zf0vsI", "Reject", "getReject-5zf0vsI", "SegmentFrequentTick", "getSegmentFrequentTick-5zf0vsI", "SegmentTick", "getSegmentTick-5zf0vsI", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ToggleOff", "getToggleOff-5zf0vsI", "ToggleOn", "getToggleOn-5zf0vsI", "VirtualKey", "getVirtualKey-5zf0vsI"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlatformHapticFeedbackType {
    public static final int $stable = 0;
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();
    private static final int Confirm = HapticFeedbackType.m4994constructorimpl(16);
    private static final int ContextClick = HapticFeedbackType.m4994constructorimpl(6);
    private static final int GestureEnd = HapticFeedbackType.m4994constructorimpl(13);
    private static final int GestureThresholdActivate = HapticFeedbackType.m4994constructorimpl(23);
    private static final int KeyboardTap = HapticFeedbackType.m4994constructorimpl(3);
    private static final int LongPress = HapticFeedbackType.m4994constructorimpl(0);
    private static final int Reject = HapticFeedbackType.m4994constructorimpl(17);
    private static final int SegmentFrequentTick = HapticFeedbackType.m4994constructorimpl(27);
    private static final int SegmentTick = HapticFeedbackType.m4994constructorimpl(26);
    private static final int TextHandleMove = HapticFeedbackType.m4994constructorimpl(9);
    private static final int ToggleOff = HapticFeedbackType.m4994constructorimpl(22);
    private static final int ToggleOn = HapticFeedbackType.m4994constructorimpl(21);
    private static final int VirtualKey = HapticFeedbackType.m4994constructorimpl(1);

    private PlatformHapticFeedbackType() {
    }

    /* JADX INFO: renamed from: getConfirm-5zf0vsI, reason: not valid java name */
    public final int m5013getConfirm5zf0vsI() {
        return Confirm;
    }

    /* JADX INFO: renamed from: getContextClick-5zf0vsI, reason: not valid java name */
    public final int m5014getContextClick5zf0vsI() {
        return ContextClick;
    }

    /* JADX INFO: renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
    public final int m5015getGestureEnd5zf0vsI() {
        return GestureEnd;
    }

    /* JADX INFO: renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
    public final int m5016getGestureThresholdActivate5zf0vsI() {
        return GestureThresholdActivate;
    }

    /* JADX INFO: renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
    public final int m5017getKeyboardTap5zf0vsI() {
        return KeyboardTap;
    }

    /* JADX INFO: renamed from: getLongPress-5zf0vsI, reason: not valid java name */
    public final int m5018getLongPress5zf0vsI() {
        return LongPress;
    }

    /* JADX INFO: renamed from: getReject-5zf0vsI, reason: not valid java name */
    public final int m5019getReject5zf0vsI() {
        return Reject;
    }

    /* JADX INFO: renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
    public final int m5020getSegmentFrequentTick5zf0vsI() {
        return SegmentFrequentTick;
    }

    /* JADX INFO: renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
    public final int m5021getSegmentTick5zf0vsI() {
        return SegmentTick;
    }

    /* JADX INFO: renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
    public final int m5022getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }

    /* JADX INFO: renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
    public final int m5023getToggleOff5zf0vsI() {
        return ToggleOff;
    }

    /* JADX INFO: renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
    public final int m5024getToggleOn5zf0vsI() {
        return ToggleOn;
    }

    /* JADX INFO: renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
    public final int m5025getVirtualKey5zf0vsI() {
        return VirtualKey;
    }
}
