package at.favre.lib.bytes;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface BytesValidator {
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr);

    public static final class Length implements BytesValidator {
        private final Mode TuitionPaymentFragmentbindingInflater1;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public enum Mode {
            SMALLER_OR_EQ_THAN,
            GREATER_OR_EQ_THAN,
            EXACT
        }

        public Length(int i, Mode mode) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentbindingInflater1 = mode;
        }

        @Override // at.favre.lib.bytes.BytesValidator
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr) {
            int i = AnonymousClass1.TuitionPaymentFragmentbindingInflater1[this.TuitionPaymentFragmentbindingInflater1.ordinal()];
            if (i == 1) {
                return bArr.length >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            if (i != 2) {
                return bArr.length == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            return bArr.length <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    public static final class Logical implements BytesValidator {
        private final List<BytesValidator> TuitionPaymentFragmentbindingInflater1;
        private final Operator TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public enum Operator {
            OR,
            AND,
            NOT
        }

        public Logical(List<BytesValidator> list, Operator operator) {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("must contain at least 1 element");
            }
            if (operator == Operator.NOT && list.size() != 1) {
                throw new IllegalArgumentException("not operator can only be applied to single element");
            }
            this.TuitionPaymentFragmentbindingInflater1 = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = operator;
        }

        @Override // at.favre.lib.bytes.BytesValidator
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == Operator.NOT) {
                return !this.TuitionPaymentFragmentbindingInflater1.get(0).TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
            }
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != Operator.OR;
            for (BytesValidator bytesValidator : this.TuitionPaymentFragmentbindingInflater1) {
                if (AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal()] == 1) {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault1 &= bytesValidator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                } else {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault1 |= bytesValidator.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                }
            }
            return zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    /* JADX INFO: renamed from: at.favre.lib.bytes.BytesValidator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[Logical.Operator.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[Logical.Operator.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[Logical.Operator.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Length.Mode.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr2;
            try {
                iArr2[Length.Mode.GREATER_OR_EQ_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Length.Mode.SMALLER_OR_EQ_THAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[Length.Mode.EXACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
