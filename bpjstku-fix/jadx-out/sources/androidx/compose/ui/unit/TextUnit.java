package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087@\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fH\u0086\n¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\t\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u0010\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fH\u0086\n¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\u00028AX\u0081\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0005R\u0011\u0010&\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0011\u0010)\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010.\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b,\u0010-\u0088\u0001\u001e\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "", "p0", "constructor-impl", "(J)J", "unaryMinus-XSAIIZE", "unaryMinus", "", "div-kPz2Gy4", "(JF)J", "div", "", "(JD)J", "", "(JI)J", "times-kPz2Gy4", "times", "compareTo--R2X_6o", "(JJ)I", "compareTo", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "packedValue", "J", "getRawType-impl", "getRawType$annotations", "()V", "rawType", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "type", "isSp-impl", "(J)Z", "isSp", "isEm-impl", "isEm", "getValue-impl", "(J)F", "value", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class TextUnit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextUnitType[] TextUnitTypes = {TextUnitType.m7154boximpl(TextUnitType.INSTANCE.m7163getUnspecifiedUIouoOA()), TextUnitType.m7154boximpl(TextUnitType.INSTANCE.m7162getSpUIouoOA()), TextUnitType.m7154boximpl(TextUnitType.INSTANCE.m7161getEmUIouoOA())};
    private static final long Unspecified = TextUnitKt.pack(0, Float.NaN);
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m7121constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7126equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* JADX INFO: renamed from: getRawType-impl, reason: not valid java name */
    public static final long m7127getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m7137unaryMinusXSAIIZE(long j) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), -m7129getValueimpl(j));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7123divkPz2Gy4(long j, float f) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), m7129getValueimpl(j) / f);
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7122divkPz2Gy4(long j, double d) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), (float) (((double) m7129getValueimpl(j)) / d));
    }

    /* JADX INFO: renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7124divkPz2Gy4(long j, int i) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), m7129getValueimpl(j) / i);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7134timeskPz2Gy4(long j, float f) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), m7129getValueimpl(j) * f);
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7133timeskPz2Gy4(long j, double d) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), (float) (((double) m7129getValueimpl(j)) * d));
    }

    /* JADX INFO: renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7135timeskPz2Gy4(long j, int i) {
        TextUnitKt.m7142checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7127getRawTypeimpl(j), m7129getValueimpl(j) * i);
    }

    /* JADX INFO: renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m7120compareToR2X_6o(long j, long j2) {
        TextUnitKt.m7143checkArithmeticNB67dxo(j, j2);
        return Float.compare(m7129getValueimpl(j), m7129getValueimpl(j2));
    }

    public final String toString() {
        return m7136toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7136toStringimpl(long j) {
        long jM7128getTypeUIouoOA = m7128getTypeUIouoOA(j);
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7163getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            StringBuilder sb = new StringBuilder();
            sb.append(m7129getValueimpl(j));
            sb.append(".sp");
            return sb.toString();
        }
        if (!TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
            return "Invalid";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7129getValueimpl(j));
        sb2.append(".em");
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnitTypes", "[Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit", "()[Landroidx/compose/ui/unit/TextUnitType;", "Landroidx/compose/ui/unit/TextUnit;", "Unspecified", "J", "getUnspecified-XSAIIZE", "()J", "getUnspecified-XSAIIZE$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7139getUnspecifiedXSAIIZE$annotations() {
        }

        private Companion() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit() {
            return TextUnit.TextUnitTypes;
        }

        /* JADX INFO: renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m7140getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m7128getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m7127getRawTypeimpl(j) >>> 32)].getType();
    }

    /* JADX INFO: renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m7132isSpimpl(long j) {
        return m7127getRawTypeimpl(j) == 4294967296L;
    }

    /* JADX INFO: renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m7131isEmimpl(long j) {
        return m7127getRawTypeimpl(j) == 8589934592L;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    public static final float m7129getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m7119boximpl(long j) {
        return new TextUnit(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7125equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7130hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m7125equalsimpl(this.packedValue, p0);
    }

    public final int hashCode() {
        return m7130hashCodeimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
