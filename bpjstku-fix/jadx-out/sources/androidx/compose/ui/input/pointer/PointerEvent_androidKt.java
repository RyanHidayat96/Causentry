package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\t\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\f\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0003¢\u0006\u0004\b\r\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u0006*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0015\u0010\u0017\u001a\u00020\u0006*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\"\u0015\u0010\u0019\u001a\u00020\u0006*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\"\u0015\u0010\u001b\u001a\u00020\u0006*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010\"\u0015\u0010\u001d\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010\"\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010\"\u0015\u0010!\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b \u0010\u0010\"\u0015\u0010#\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010\"\u0015\u0010%\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b$\u0010\u0010\"\u0015\u0010'\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b&\u0010\u0010\"\u0015\u0010)\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b(\u0010\u0010\"\u0015\u0010+\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b*\u0010\u0010\"\u0015\u0010-\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b,\u0010\u0010\"\u0015\u0010/\u001a\u00020\u0006*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b.\u0010\u0010*\f\b\u0000\u00100\"\u00020\u00042\u00020\u0004*\f\b\u0000\u00101\"\u00020\u00042\u00020\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "EmptyPointerKeyboardModifiers", "()I", "Landroidx/compose/ui/input/pointer/PointerButtons;", "", "p0", "", "isPressed-bNIWhpI", "(II)Z", "isPressed", "indexOfFirstPressed-aHzCx-E", "(I)I", "indexOfFirstPressed", "indexOfLastPressed-aHzCx-E", "indexOfLastPressed", "isPrimaryPressed-aHzCx-E", "(I)Z", "isPrimaryPressed", "isSecondaryPressed-aHzCx-E", "isSecondaryPressed", "isTertiaryPressed-aHzCx-E", "isTertiaryPressed", "isBackPressed-aHzCx-E", "isBackPressed", "isForwardPressed-aHzCx-E", "isForwardPressed", "getAreAnyPressed-aHzCx-E", "areAnyPressed", "isCtrlPressed-5xRPYO0", "isCtrlPressed", "isMetaPressed-5xRPYO0", "isMetaPressed", "isAltPressed-5xRPYO0", "isAltPressed", "isAltGraphPressed-5xRPYO0", "isAltGraphPressed", "isSymPressed-5xRPYO0", "isSymPressed", "isShiftPressed-5xRPYO0", "isShiftPressed", "isFunctionPressed-5xRPYO0", "isFunctionPressed", "isCapsLockOn-5xRPYO0", "isCapsLockOn", "isScrollLockOn-5xRPYO0", "isScrollLockOn", "isNumLockOn-5xRPYO0", "isNumLockOn", "NativePointerButtons", "NativePointerKeyboardModifiers"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PointerEvent_androidKt {
    /* JADX INFO: renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5469getAreAnyPressedaHzCxE(int i) {
        return i != 0;
    }

    /* JADX INFO: renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m5470indexOfFirstPressedaHzCxE(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = ((i & 96) >>> 5) | (i & (-97)); (i3 & 1) == 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m5471indexOfLastPressedaHzCxE(int i) {
        int i2 = -1;
        for (int i3 = ((i & 96) >>> 5) | (i & (-97)); i3 != 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5472isAltGraphPressed5xRPYO0(int i) {
        return false;
    }

    /* JADX INFO: renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5473isAltPressed5xRPYO0(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5474isBackPressedaHzCxE(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5475isCapsLockOn5xRPYO0(int i) {
        return (i & 1048576) != 0;
    }

    /* JADX INFO: renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5476isCtrlPressed5xRPYO0(int i) {
        return (i & 4096) != 0;
    }

    /* JADX INFO: renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5477isForwardPressedaHzCxE(int i) {
        return (i & 16) != 0;
    }

    /* JADX INFO: renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5478isFunctionPressed5xRPYO0(int i) {
        return (i & 8) != 0;
    }

    /* JADX INFO: renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5479isMetaPressed5xRPYO0(int i) {
        return (i & 65536) != 0;
    }

    /* JADX INFO: renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5480isNumLockOn5xRPYO0(int i) {
        return (i & 2097152) != 0;
    }

    /* JADX INFO: renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5482isPrimaryPressedaHzCxE(int i) {
        return (i & 33) != 0;
    }

    /* JADX INFO: renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5483isScrollLockOn5xRPYO0(int i) {
        return (i & 4194304) != 0;
    }

    /* JADX INFO: renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5484isSecondaryPressedaHzCxE(int i) {
        return (i & 66) != 0;
    }

    /* JADX INFO: renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5485isShiftPressed5xRPYO0(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5486isSymPressed5xRPYO0(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5487isTertiaryPressedaHzCxE(int i) {
        return (i & 4) != 0;
    }

    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m5571constructorimpl(0);
    }

    /* JADX INFO: renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m5481isPressedbNIWhpI(int i, int i2) {
        if (i2 == 0) {
            return m5482isPrimaryPressedaHzCxE(i);
        }
        if (i2 == 1) {
            return m5484isSecondaryPressedaHzCxE(i);
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return (i & (1 << i2)) != 0;
        }
        return (i & (1 << (i2 + 2))) != 0;
    }
}
