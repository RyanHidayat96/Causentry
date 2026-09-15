package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\f\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u000b\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\r\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\r\u0010\u0010J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0088\u0001!\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "", "p0", "constructor-impl", "(F)F", "plus-5rwHm24", "(FF)F", "plus", "minus-5rwHm24", "minus", "unaryMinus-D9Ej5fM", "unaryMinus", "div-u2uoSUM", "div", "", "(FI)F", "div-0680j_4", "times-u2uoSUM", "times", "compareTo-0680j_4", "(FF)I", "compareTo", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "value", "F", "getValue", "()F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class Dp implements Comparable<Dp> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float Hairline = m6935constructorimpl(0.0f);
    private static final float Infinity = m6935constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m6935constructorimpl(Float.NaN);
    private final float value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float m6935constructorimpl(float f) {
        return f;
    }

    /* JADX INFO: renamed from: div-0680j_4, reason: not valid java name */
    public static final float m6936div0680j_4(float f, float f2) {
        return f / f2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Dp dp) {
        return m6948compareTo0680j_4(dp.m6949unboximpl());
    }

    private /* synthetic */ Dp(float f) {
        this.value = f;
    }

    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m6943plus5rwHm24(float f, float f2) {
        return m6935constructorimpl(f + f2);
    }

    /* JADX INFO: renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m6942minus5rwHm24(float f, float f2) {
        return m6935constructorimpl(f - f2);
    }

    /* JADX INFO: renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m6947unaryMinusD9Ej5fM(float f) {
        return m6935constructorimpl(-f);
    }

    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6937divu2uoSUM(float f, float f2) {
        return m6935constructorimpl(f / f2);
    }

    /* JADX INFO: renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6938divu2uoSUM(float f, int i) {
        return m6935constructorimpl(f / i);
    }

    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6944timesu2uoSUM(float f, float f2) {
        return m6935constructorimpl(f * f2);
    }

    /* JADX INFO: renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6945timesu2uoSUM(float f, int i) {
        return m6935constructorimpl(f * i);
    }

    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public final int m6948compareTo0680j_4(float f) {
        return m6934compareTo0680j_4(this.value, f);
    }

    /* JADX INFO: renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m6934compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    public final String toString() {
        return m6946toStringimpl(this.value);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Hairline", "F", "getHairline-D9Ej5fM", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "getInfinity-D9Ej5fM", "getInfinity-D9Ej5fM$annotations", "Unspecified", "getUnspecified-D9Ej5fM", "getUnspecified-D9Ej5fM$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6950getHairlineD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6951getInfinityD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m6952getUnspecifiedD9Ej5fM$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m6953getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* JADX INFO: renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m6954getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* JADX INFO: renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m6955getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6946toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(".dp");
        return sb.toString();
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m6933boximpl(float f) {
        return new Dp(f);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6939equalsimpl(float f, Object obj) {
        return (obj instanceof Dp) && Float.compare(f, ((Dp) obj).m6949unboximpl()) == 0;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6940equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6941hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    public final boolean equals(Object p0) {
        return m6939equalsimpl(this.value, p0);
    }

    public final int hashCode() {
        return m6941hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m6949unboximpl() {
        return this.value;
    }
}
