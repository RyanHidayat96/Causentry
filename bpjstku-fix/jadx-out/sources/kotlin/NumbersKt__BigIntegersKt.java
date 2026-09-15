package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\n\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u000b\u0010\t\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\t\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\r\u0010\u0003\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0010H\u0087\f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0010H\u0087\f¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u0016H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0017\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0087\b¢\u0006\u0004\b\u0019\u0010\u001d"}, d2 = {"Ljava/math/BigInteger;", "p0", "plus", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", "minus", "times", "div", "rem", "unaryMinus", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", "inc", "dec", "inv", "and", "or", "xor", "", "shl", "(Ljava/math/BigInteger;I)Ljava/math/BigInteger;", "shr", "toBigInteger", "(I)Ljava/math/BigInteger;", "", "(J)Ljava/math/BigInteger;", "Ljava/math/BigDecimal;", "toBigDecimal", "(Ljava/math/BigInteger;)Ljava/math/BigDecimal;", "Ljava/math/MathContext;", "p1", "(Ljava/math/BigInteger;ILjava/math/MathContext;)Ljava/math/BigDecimal;"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt {
    private static final BigInteger plus(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "");
        return bigIntegerAdd;
    }

    private static final BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "");
        return bigIntegerSubtract;
    }

    private static final BigInteger times(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "");
        return bigIntegerMultiply;
    }

    private static final BigInteger div(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerDivide = bigInteger.divide(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerDivide, "");
        return bigIntegerDivide;
    }

    private static final BigInteger rem(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerRemainder = bigInteger.remainder(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "");
        return bigIntegerRemainder;
    }

    private static final BigInteger unaryMinus(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerNegate = bigInteger.negate();
        Intrinsics.checkNotNullExpressionValue(bigIntegerNegate, "");
        return bigIntegerNegate;
    }

    private static final BigInteger inc(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "");
        return bigIntegerAdd;
    }

    private static final BigInteger dec(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "");
        return bigIntegerSubtract;
    }

    private static final BigInteger inv(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerNot = bigInteger.not();
        Intrinsics.checkNotNullExpressionValue(bigIntegerNot, "");
        return bigIntegerNot;
    }

    private static final BigInteger and(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerAnd = bigInteger.and(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAnd, "");
        return bigIntegerAnd;
    }

    private static final BigInteger or(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerOr = bigInteger.or(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerOr, "");
        return bigIntegerOr;
    }

    private static final BigInteger xor(BigInteger bigInteger, BigInteger bigInteger2) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(bigInteger2, "");
        BigInteger bigIntegerXor = bigInteger.xor(bigInteger2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerXor, "");
        return bigIntegerXor;
    }

    private static final BigInteger shl(BigInteger bigInteger, int i) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i);
        Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft, "");
        return bigIntegerShiftLeft;
    }

    private static final BigInteger shr(BigInteger bigInteger, int i) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i);
        Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight, "");
        return bigIntegerShiftRight;
    }

    private static final BigInteger toBigInteger(int i) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        return bigIntegerValueOf;
    }

    private static final BigInteger toBigInteger(long j) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        return bigIntegerValueOf;
    }

    private static final BigDecimal toBigDecimal(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        return new BigDecimal(bigInteger);
    }

    static /* synthetic */ BigDecimal toBigDecimal$default(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
        }
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(mathContext, "");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    private static final BigDecimal toBigDecimal(BigInteger bigInteger, int i, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(mathContext, "");
        return new BigDecimal(bigInteger, i, mathContext);
    }
}
