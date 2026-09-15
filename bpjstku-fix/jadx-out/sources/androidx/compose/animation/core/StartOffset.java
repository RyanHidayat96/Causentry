package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u001a\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00048Gø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0088\u0001\u0019\u0092\u0001\u00020\b\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "p0", "Landroidx/compose/animation/core/StartOffsetType;", "p1", "constructor-impl", "(II)J", "", "(J)J", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getOffsetMillis-impl", "offsetMillis", "getOffsetType-Eo1U57Q", "offsetType", "value", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class StartOffset {
    private final long value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m494constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m497equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ StartOffset(long j) {
        this.value = j;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m493constructorimpl(int i, int i2) {
        return m494constructorimpl(i * i2);
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m495constructorimpl$default(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = StartOffsetType.INSTANCE.m510getDelayEo1U57Q();
        }
        return m493constructorimpl(i, i2);
    }

    /* JADX INFO: renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m498getOffsetMillisimpl(long j) {
        return Math.abs((int) j);
    }

    /* JADX INFO: renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m499getOffsetTypeEo1U57Q(long j) {
        if (j > 0) {
            return StartOffsetType.INSTANCE.m511getFastForwardEo1U57Q();
        }
        return StartOffsetType.INSTANCE.m510getDelayEo1U57Q();
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m492boximpl(long j) {
        return new StartOffset(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m496equalsimpl(long j, Object obj) {
        return (obj instanceof StartOffset) && j == ((StartOffset) obj).getValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m500hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m501toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("StartOffset(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return m496equalsimpl(this.value, obj);
    }

    public final int hashCode() {
        return m500hashCodeimpl(this.value);
    }

    public final String toString() {
        return m501toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
