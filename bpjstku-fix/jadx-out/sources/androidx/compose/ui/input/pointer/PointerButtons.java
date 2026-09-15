package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u000f\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerButtons;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerButtons;", "p0", "constructor-impl", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "packedValue", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class PointerButtons {
    private final int packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m5442constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5444equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ PointerButtons(int i) {
        this.packedValue = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m5441boximpl(int i) {
        return new PointerButtons(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5443equalsimpl(int i, Object obj) {
        return (obj instanceof PointerButtons) && i == ((PointerButtons) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5445hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5446toStringimpl(int i) {
        StringBuilder sb = new StringBuilder("PointerButtons(packedValue=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m5443equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m5445hashCodeimpl(this.packedValue);
    }

    public final String toString() {
        return m5446toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }
}
