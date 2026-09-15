package com.google.common.io;

import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.ConfigOptionMatcher;
import defpackage.updateAndVerifyState;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseEncoding {
    private static final BaseEncoding TuitionPaymentFragmentbindingInflater1;
    private static final BaseEncoding TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    abstract int TuitionPaymentFragmentbindingInflater1(int i);

    abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i);

    public abstract BaseEncoding TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, CharSequence charSequence) throws DecodingException;

    abstract void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    BaseEncoding() {
    }

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, int i) {
        int length = bArr.length;
        if (i >= 0 && i <= length) {
            StringBuilder sb = new StringBuilder(TuitionPaymentFragmentbindingInflater1(i));
            try {
                b(sb, bArr, 0, i);
                return sb.toString();
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(0, i, length));
    }

    CharSequence TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
        return charSequence;
    }

    static {
        new TuitionPaymentFragmentspecialinlinedviewModeldefault2("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new TuitionPaymentFragmentspecialinlinedviewModeldefault1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new TuitionPaymentFragmentspecialinlinedviewModeldefault1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3("base16()", "0123456789ABCDEF");
    }

    public static BaseEncoding TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static BaseEncoding TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        final char[] TuitionPaymentFragmentbindingInflater1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean[] f815a;
        private final String asBinder;
        private final boolean asInterface;
        final int b;
        final int d;

        TuitionPaymentFragmentbindingInflater1(String str, char[] cArr) {
            this(str, cArr, TuitionPaymentFragmentspecialinlinedviewModeldefault1(cArr));
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0072 A[LOOP:0: B:22:0x006e->B:24:0x0072, LOOP_END] */
        private TuitionPaymentFragmentbindingInflater1(String str, char[] cArr, byte[] bArr) {
            int iNumberOfLeadingZeros;
            boolean[] zArr;
            int i;
            this.asBinder = str;
            this.TuitionPaymentFragmentbindingInflater1 = cArr;
            try {
                int length = cArr.length;
                RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                if (length <= 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("x");
                    sb.append(" (");
                    sb.append(length);
                    sb.append(") must be > 0");
                    throw new IllegalArgumentException(sb.toString());
                }
                switch (ConfigOptionMatcher.AnonymousClass5.b[roundingMode.ordinal()]) {
                    case 1:
                        if (!((length > 0) & (((length + (-1)) & length) == 0))) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.b = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i2 = 1 << (3 - iNumberOfTrailingZeros);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.d = cArr.length - 1;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr;
                        zArr = new boolean[i2];
                        for (i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
                            zArr[ConfigOptionMatcher.b(i * 8, this.b, RoundingMode.CEILING)] = true;
                        }
                        this.f815a = zArr;
                        this.asInterface = false;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.b = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i3 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.d = cArr.length - 1;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr;
                        zArr = new boolean[i3];
                        while (i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            zArr[ConfigOptionMatcher.b(i * 8, this.b, RoundingMode.CEILING)] = true;
                        }
                        this.f815a = zArr;
                        this.asInterface = false;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros2) - length))) >>> 31);
                        this.b = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i4 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.d = cArr.length - 1;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr;
                        zArr = new boolean[i4];
                        while (i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            zArr[ConfigOptionMatcher.b(i * 8, this.b, RoundingMode.CEILING)] = true;
                        }
                        this.f815a = zArr;
                        this.asInterface = false;
                        return;
                    default:
                        throw new AssertionError();
                }
            } catch (ArithmeticException e2) {
                StringBuilder sb2 = new StringBuilder("Illegal alphabet length ");
                sb2.append(cArr.length);
                throw new IllegalArgumentException(sb2.toString(), e2);
            }
        }

        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                if (c < 128) {
                    if (bArr[c] == -1) {
                        bArr[c] = (byte) i;
                    } else {
                        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Duplicate character: %s", Character.valueOf(c)));
                    }
                } else {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Non-ASCII character: %s", Character.valueOf(c)));
                }
            }
            return bArr;
        }

        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(char c) throws DecodingException {
            if (c > 127) {
                StringBuilder sb = new StringBuilder("Unrecognized character: 0x");
                sb.append(Integer.toHexString(c));
                throw new DecodingException(sb.toString());
            }
            byte b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                StringBuilder sb2 = new StringBuilder("Unrecognized character: 0x");
                sb2.append(Integer.toHexString(c));
                throw new DecodingException(sb2.toString());
            }
            throw new DecodingException("Unrecognized character: ".concat(String.valueOf(c)));
        }

        public final String toString() {
            return this.asBinder;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            boolean z = tuitionPaymentFragmentbindingInflater1.asInterface;
            return Arrays.equals(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.TuitionPaymentFragmentbindingInflater1) + 1237;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends BaseEncoding {
        private Character TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, Character ch) {
            this(new TuitionPaymentFragmentbindingInflater1(str, str2.toCharArray()), ch);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Character ch) {
            boolean z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
            if (ch != null) {
                char cCharValue = ch.charValue();
                byte[] bArr = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ch;
                return;
            }
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Padding character %s was already in alphabet", ch));
        }

        @Override // com.google.common.io.BaseEncoding
        final int TuitionPaymentFragmentbindingInflater1(int i) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * ConfigOptionMatcher.b(i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            int length = bArr.length;
            int i3 = 0;
            if (i2 < 0 || i2 > length) {
                throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(0, i2, length));
            }
            while (i3 < i2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(appendable, bArr, i3, Math.min(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i2 - i3));
                i3 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            int i3 = i + i2;
            int length = bArr.length;
            if (i >= 0 && i3 >= i && i3 <= length) {
                if (i2 <= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    int i4 = 0;
                    long j = 0;
                    for (int i5 = 0; i5 < i2; i5++) {
                        j = (j | ((long) (bArr[i + i5] & UByte.MAX_VALUE))) << 8;
                    }
                    int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    while (i4 < i2 * 8) {
                        appendable.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[((int) (j >>> ((((i2 + 1) * 8) - i6) - i4))) & this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d]);
                        i4 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    }
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                        while (i4 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 8) {
                            appendable.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.charValue());
                            i4 += this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(i, i3, length));
        }

        @Override // com.google.common.io.BaseEncoding
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
            return (int) (((((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) * ((long) i)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        final CharSequence TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
            Character ch = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(charSequence);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (!tuitionPaymentFragmentbindingInflater1.f815a[charSequenceTuitionPaymentFragmentbindingInflater1.length() % tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3]) {
                StringBuilder sb = new StringBuilder("Invalid input length ");
                sb.append(charSequenceTuitionPaymentFragmentbindingInflater1.length());
                throw new DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceTuitionPaymentFragmentbindingInflater1.length()) {
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3; i4++) {
                    jTuitionPaymentFragmentspecialinlinedviewModeldefault1 <<= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    if (i + i4 < charSequenceTuitionPaymentFragmentbindingInflater1.length()) {
                        jTuitionPaymentFragmentspecialinlinedviewModeldefault1 |= (long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequenceTuitionPaymentFragmentbindingInflater1.charAt(i3 + i));
                        i3++;
                    }
                }
                int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                int i7 = (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) * 8;
                while (i7 >= (i5 * 8) - (i3 * i6)) {
                    bArr[i2] = (byte) ((jTuitionPaymentFragmentspecialinlinedviewModeldefault1 >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? this : b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        BaseEncoding b(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (8 % this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b != 0) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) obj;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Objects.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public int hashCode() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() ^ Objects.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private char[] b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2) {
            this(new TuitionPaymentFragmentbindingInflater1(str, str2.toCharArray()));
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            super(tuitionPaymentFragmentbindingInflater1, null);
            this.b = new char[512];
            if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.length != 16) {
                throw new IllegalArgumentException();
            }
            for (int i = 0; i < 256; i++) {
                this.b[i] = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1[i >>> 4];
                this.b[i | 256] = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1[i & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.io.BaseEncoding
        final void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            int length = bArr.length;
            if (i2 < 0 || i2 > length) {
                throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(0, i2, length));
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i3] & UByte.MAX_VALUE;
                appendable.append(this.b[i4]);
                appendable.append(this.b[i4 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.io.BaseEncoding
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, CharSequence charSequence) throws DecodingException {
            if (charSequence.length() % 2 == 1) {
                StringBuilder sb = new StringBuilder("Invalid input length ");
                sb.append(charSequence.length());
                throw new DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequence.charAt(i)) << 4) | this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final BaseEncoding b(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, Character ch) {
            this(new TuitionPaymentFragmentbindingInflater1(str, str2.toCharArray()), ch);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Character ch) {
            super(tuitionPaymentFragmentbindingInflater1, ch);
            if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.length != 64) {
                throw new IllegalArgumentException();
            }
        }

        @Override // com.google.common.io.BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.io.BaseEncoding
        final void b(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            int length = bArr.length;
            if (i2 < 0 || i2 > length) {
                throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(0, i2, length));
            }
            int i3 = i2;
            while (i3 >= 3) {
                int i4 = i + 3;
                int i5 = (bArr[i + 2] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 16) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8);
                appendable.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[i5 >>> 18]);
                appendable.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[(i5 >>> 12) & 63]);
                appendable.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[(i5 >>> 6) & 63]);
                appendable.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1[i5 & 63]);
                i3 -= 3;
                i = i4;
            }
            if (i < i2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(appendable, bArr, i, i2 - i);
            }
        }

        @Override // com.google.common.io.BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.io.BaseEncoding
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(charSequence);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (!tuitionPaymentFragmentbindingInflater1.f815a[charSequenceTuitionPaymentFragmentbindingInflater1.length() % tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3]) {
                StringBuilder sb = new StringBuilder("Invalid input length ");
                sb.append(charSequenceTuitionPaymentFragmentbindingInflater1.length());
                throw new DecodingException(sb.toString());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceTuitionPaymentFragmentbindingInflater1.length()) {
                int i3 = i + 2;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequenceTuitionPaymentFragmentbindingInflater1.charAt(i)) << 18) | (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequenceTuitionPaymentFragmentbindingInflater1.charAt(i + 1)) << 12);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 >>> 16);
                if (i3 < charSequenceTuitionPaymentFragmentbindingInflater1.length()) {
                    int i5 = i + 3;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequenceTuitionPaymentFragmentbindingInflater1.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> 8) & 255);
                    if (i5 < charSequenceTuitionPaymentFragmentbindingInflater1.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(charSequenceTuitionPaymentFragmentbindingInflater1.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        final BaseEncoding b(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, null);
        }
    }

    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(CharSequence charSequence) {
        try {
            CharSequence charSequenceTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(charSequence);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(charSequenceTuitionPaymentFragmentbindingInflater1.length());
            byte[] bArr = new byte[iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr, charSequenceTuitionPaymentFragmentbindingInflater1);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == iTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return bArr;
            }
            byte[] bArr2 = new byte[iTuitionPaymentFragmentspecialinlinedviewModeldefault3];
            System.arraycopy(bArr, 0, bArr2, 0, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return bArr2;
        } catch (DecodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
