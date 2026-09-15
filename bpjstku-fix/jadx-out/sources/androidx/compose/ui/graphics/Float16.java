package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081@\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001QB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0012J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\u000f\u0010%\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b)\u0010*J\r\u0010-\u001a\u00020\u0000¢\u0006\u0004\b,\u0010\u0005J\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b.\u0010\u0005J\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b0\u0010\u0005J\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b2\u0010\u0005J\r\u00105\u001a\u00020\u0000¢\u0006\u0004\b4\u0010\u0005J\r\u00109\u001a\u000206¢\u0006\u0004\b7\u00108J\r\u0010;\u001a\u000206¢\u0006\u0004\b:\u00108J\r\u0010=\u001a\u000206¢\u0006\u0004\b<\u00108J\r\u0010?\u001a\u000206¢\u0006\u0004\b>\u00108J\u000f\u0010A\u001a\u00020\"H\u0007¢\u0006\u0004\b@\u0010$J\u001a\u0010C\u001a\u0002062\b\u0010\u0003\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010G\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0011\u0010L\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0011\u0010N\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bM\u0010\u0012R\u0011\u0010P\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bO\u0010\u0012\u0088\u0001G\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "p0", "constructor-impl", "(S)S", "", "(F)S", "", "(D)S", "", "toByte-impl", "(S)B", "toByte", "toShort-impl", "toShort", "", "toInt-impl", "(S)I", "toInt", "", "toLong-impl", "(S)J", "toLong", "toFloat-impl", "(S)F", "toFloat", "toDouble-impl", "(S)D", "toDouble", "toBits-impl", "toBits", "toRawBits-impl", "toRawBits", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "compareTo-41bOqos", "(SS)I", "compareTo", "withSign-qCeQghg", "(SS)S", "withSign", "absoluteValue-slo4al4", "absoluteValue", "round-slo4al4", "round", "ceil-slo4al4", "ceil", "floor-slo4al4", PlaceTypes.FLOOR, "trunc-slo4al4", "trunc", "", "isNaN-impl", "(S)Z", "isNaN", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "isNormalized-impl", "isNormalized", "toHexString-impl", "toHexString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "halfValue", ExifInterface.LATITUDE_SOUTH, "getHalfValue", "()S", "getSign-slo4al4", "sign", "getExponent-impl", "exponent", "getSignificand-impl", "significand", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m4329constructorimpl((short) 5120);
    private static final short LowestValue = m4329constructorimpl((short) -1025);
    private static final short MaxValue = m4329constructorimpl((short) 31743);
    private static final short MinNormal = m4329constructorimpl((short) 1024);
    private static final short MinValue = m4329constructorimpl((short) 1);
    private static final short NaN = m4329constructorimpl((short) 32256);
    private static final short NegativeInfinity = m4329constructorimpl((short) -1024);
    private static final short NegativeZero = m4329constructorimpl(ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m4329constructorimpl((short) 31744);
    private static final short PositiveZero = m4329constructorimpl((short) 0);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4329constructorimpl(short s) {
        return s;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4331equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* JADX INFO: renamed from: getExponent-impl, reason: not valid java name */
    public static final int m4333getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* JADX INFO: renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m4335getSignificandimpl(short s) {
        return s & 1023;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m4337isFiniteimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) != 31744;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4338isInfiniteimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) == 31744;
    }

    /* JADX INFO: renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m4339isNaNimpl(short s) {
        return (s & ShortCompanionObject.MAX_VALUE) > 31744;
    }

    /* JADX INFO: renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m4340isNormalizedimpl(short s) {
        int i = s & 31744;
        return (i != 0) & (i != 31744);
    }

    /* JADX INFO: renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m4349toRawBitsimpl(short s) {
        return s & UShort.MAX_VALUE;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Float16 float16) {
        return m4354compareTo41bOqos(float16.m4355unboximpl());
    }

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4327constructorimpl(double d) {
        return m4328constructorimpl((float) d);
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    public static final byte m4343toByteimpl(short s) {
        return (byte) m4345toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    public static final short m4350toShortimpl(short s) {
        return (short) m4345toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m4347toIntimpl(short s) {
        return (int) m4345toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m4348toLongimpl(short s) {
        return (long) m4345toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4344toDoubleimpl(short s) {
        return m4345toFloatimpl(s);
    }

    /* JADX INFO: renamed from: toBits-impl, reason: not valid java name */
    public static final int m4342toBitsimpl(short s) {
        if (m4339isNaNimpl(s)) {
            return 32256;
        }
        return s & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4351toStringimpl(short s) {
        return String.valueOf(m4345toFloatimpl(s));
    }

    public final String toString() {
        return m4351toStringimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public final int m4354compareTo41bOqos(short s) {
        return m4326compareTo41bOqos(this.halfValue, s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m4326compareTo41bOqos(short s, short s2) {
        if (m4339isNaNimpl(s)) {
            return !m4339isNaNimpl(s2) ? 1 : 0;
        }
        if (m4339isNaNimpl(s2)) {
            return -1;
        }
        boolean z = s & ShortCompanionObject.MIN_VALUE;
        int i = s & UShort.MAX_VALUE;
        if (z != 0) {
            i = 32768 - i;
        }
        return Intrinsics.compare(i, (s2 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s2 & UShort.MAX_VALUE) : s2 & UShort.MAX_VALUE);
    }

    /* JADX INFO: renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m4334getSignslo4al4(short s) {
        int i = s & ShortCompanionObject.MAX_VALUE;
        if (!((i > 31744) | (i == 0))) {
            i = (s & ShortCompanionObject.MIN_VALUE) | 15360;
        }
        return m4329constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m4353withSignqCeQghg(short s, short s2) {
        return m4329constructorimpl((short) ((s & ShortCompanionObject.MAX_VALUE) | (s2 & ShortCompanionObject.MIN_VALUE)));
    }

    /* JADX INFO: renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m4323absoluteValueslo4al4(short s) {
        return m4329constructorimpl((short) (s & ShortCompanionObject.MAX_VALUE));
    }

    /* JADX INFO: renamed from: round-slo4al4, reason: not valid java name */
    public static final short m4341roundslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = s & ShortCompanionObject.MAX_VALUE;
        if (i2 < 15360) {
            i = (s & ShortCompanionObject.MIN_VALUE) | ((i2 < 14336 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = i2 >> 10;
            i = (i + (1 << (24 - i3))) & (~((1 << (25 - i3)) - 1));
        }
        return m4329constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m4325ceilslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & ShortCompanionObject.MAX_VALUE;
        if (i2 < 15360) {
            i = ((-((~(i >> 15)) & (i2 == 0 ? 0 : 1))) & 15360) | (s & ShortCompanionObject.MIN_VALUE);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + (((i >> 15) - 1) & i3)) & (~i3);
        }
        return m4329constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m4332floorslo4al4(short s) {
        int i = s & UShort.MAX_VALUE;
        int i2 = s & ShortCompanionObject.MAX_VALUE;
        if (i2 < 15360) {
            i = (s & ShortCompanionObject.MIN_VALUE) | ((i <= 32768 ? 0 : 65535) & 15360);
        } else if (i2 < 25600) {
            int i3 = (1 << (25 - (i2 >> 10))) - 1;
            i = (i + ((-(i >> 15)) & i3)) & (~i3);
        }
        return m4329constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m4352truncslo4al4(short s) {
        int i = 65535 & s;
        int i2 = s & ShortCompanionObject.MAX_VALUE;
        if (i2 < 15360) {
            i = Short.MIN_VALUE & s;
        } else if (i2 < 25600) {
            i &= ~((1 << (25 - (i2 >> 10))) - 1);
        }
        return m4329constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: toHexString-impl, reason: not valid java name */
    public static final String m4346toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i = 65535 & s;
        int i2 = i >>> 15;
        int i3 = (i >>> 10) & 31;
        int i4 = s & 1023;
        if (i3 != 31) {
            if (i2 == 1) {
                sb.append('-');
            }
            if (i3 != 0) {
                sb.append("0x1.");
                String string = Integer.toString(i4, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb.append(new Regex("0{2,}$").replaceFirst(string, ""));
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                String string2 = Integer.toString(i4, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                sb.append(new Regex("0{2,}$").replaceFirst(string2, ""));
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i2 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "<init>", "()V", "", "Size", "I", "Landroidx/compose/ui/graphics/Float16;", "Epsilon", ExifInterface.LATITUDE_SOUTH, "getEpsilon-slo4al4", "()S", "MaxExponent", "MinExponent", "LowestValue", "getLowestValue-slo4al4", "MaxValue", "getMaxValue-slo4al4", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m4356getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* JADX INFO: renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m4357getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* JADX INFO: renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m4358getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* JADX INFO: renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m4359getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* JADX INFO: renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m4360getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* JADX INFO: renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m4361getNaNslo4al4() {
            return Float16.NaN;
        }

        /* JADX INFO: renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m4362getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* JADX INFO: renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m4363getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* JADX INFO: renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m4364getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* JADX INFO: renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m4365getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m4328constructorimpl(float f) {
        int i;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i4 = 8388607 & iFloatToRawIntBits;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = i3 - 112;
            if (i7 >= 31) {
                i5 = 49;
            } else {
                if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    } else {
                        i5 = i7;
                    }
                    return m4329constructorimpl((short) i);
                }
                if (i7 >= -10) {
                    int i8 = (8388608 | i4) >> (1 - i7);
                    if ((i8 & 4096) != 0) {
                        i8 += 8192;
                    }
                    i5 = 0;
                    i6 = i8 >> 13;
                } else {
                    i5 = 0;
                }
            }
        } else if (i4 != 0) {
            i6 = 512;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return m4329constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    public static final float m4345toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m4324boximpl(short s) {
        return new Float16(s);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4330equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m4355unboximpl();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4336hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    public final boolean equals(Object p0) {
        return m4330equalsimpl(this.halfValue, p0);
    }

    public final int hashCode() {
        return m4336hashCodeimpl(this.halfValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m4355unboximpl() {
        return this.halfValue;
    }
}
