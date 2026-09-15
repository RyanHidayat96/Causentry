package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getInProgressTransformationInfo extends setQualitySelector {
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new String[128];
    private final RotationProviderListener INotificationSideChannel;
    private String cancel = ":";
    private String notify;

    static {
        for (int i = 0; i <= 31; i++) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public getInProgressTransformationInfo(RotationProviderListener rotationProviderListener) {
        this.INotificationSideChannel = rotationProviderListener;
        int[] iArr = this.d;
        int i = this.asInterface;
        this.asInterface = i + 1;
        iArr[i] = 6;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
        if (this.f1381a) {
            StringBuilder sb = new StringBuilder("Array cannot be used as a map key in JSON at path ");
            sb.append(g());
            throw new IllegalStateException(sb.toString());
        }
        asBinder();
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(1, 2, '[');
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(1, 2, ']');
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector b() throws IOException {
        if (this.f1381a) {
            StringBuilder sb = new StringBuilder("Object cannot be used as a map key in JSON at path ");
            sb.append(g());
            throw new IllegalStateException(sb.toString());
        }
        asBinder();
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(3, 5, '{');
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentbindingInflater1() throws IOException {
        this.f1381a = false;
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(3, 5, '}');
    }

    private setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, char c) throws IOException {
        if (this.asInterface == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && (this.d[this.asInterface - 1] == i || this.d[this.asInterface - 1] == i2)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return this;
        }
        asInterface();
        d();
        int[] iArr = this.d;
        int i3 = this.asInterface;
        this.asInterface = i3 + 1;
        iArr[i3] = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.asInterface - 1] = 0;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(c);
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.asInterface == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i = this.asInterface;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.d[i - 1];
        if ((i2 != 3 && i2 != 5) || this.notify != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.notify = str;
        this.g[this.asInterface - 1] = str;
        this.f1381a = false;
        return this;
    }

    private void asBinder() throws IOException {
        if (this.notify != null) {
            int i = this.asInterface;
            if (i == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            int i2 = this.d[i - 1];
            if (i2 == 5) {
                this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(44);
            } else if (i2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            String str = this.b;
            this.d[this.asInterface - 1] = 4;
            TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannel, this.notify);
            this.notify = null;
        }
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IOException {
        if (str == null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        }
        asBinder();
        asInterface();
        TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannel, str);
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        if (this.f1381a) {
            StringBuilder sb = new StringBuilder("null cannot be used as a map key in JSON at path ");
            sb.append(g());
            throw new IllegalStateException(sb.toString());
        }
        if (this.notify != null) {
            if (this.asBinder) {
                asBinder();
            } else {
                this.notify = null;
                return this;
            }
        }
        asInterface();
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1("null");
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector b(boolean z) throws IOException {
        if (this.f1381a) {
            StringBuilder sb = new StringBuilder("Boolean cannot be used as a map key in JSON at path ");
            sb.append(g());
            throw new IllegalStateException(sb.toString());
        }
        asBinder();
        asInterface();
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z ? "true" : "false");
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentbindingInflater1(double d) throws IOException {
        if (!this.TuitionPaymentFragmentbindingInflater1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d)));
        }
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(Double.toString(d));
        }
        asBinder();
        asInterface();
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Double.toString(d));
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) throws IOException {
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(Long.toString(j));
        }
        asBinder();
        asInterface();
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Long.toString(j));
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1(Number number) throws IOException {
        if (number == null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        String string = number.toString();
        if (!this.TuitionPaymentFragmentbindingInflater1 && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
        }
        asBinder();
        asInterface();
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.asInterface == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.INotificationSideChannel.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.INotificationSideChannel.close();
        int i = this.asInterface;
        if (i > 1 || (i == 1 && this.d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.asInterface = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void TuitionPaymentFragmentbindingInflater1(RotationProviderListener rotationProviderListener, String str) throws IOException {
        String str2;
        String[] strArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        rotationProviderListener.b(str, i, i2);
                    }
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    rotationProviderListener.b(str, i, i2);
                }
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            rotationProviderListener.b(str, i, length);
        }
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(34);
    }

    private void asInterface() throws IOException {
        int i = this.asInterface;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.d[i - 1];
        int i3 = 2;
        if (i2 == 1) {
            String str = this.b;
        } else if (i2 == 2) {
            this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(44);
            String str2 = this.b;
        } else if (i2 == 4) {
            this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.cancel);
            i3 = 5;
        } else {
            if (i2 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            if (i2 != 6) {
                if (i2 == 7) {
                    if (!this.TuitionPaymentFragmentbindingInflater1) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            i3 = 7;
        }
        this.d[this.asInterface - 1] = i3;
    }

    private setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, char c) throws IOException {
        int i3 = this.asInterface;
        if (i3 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i4 = this.d[i3 - 1];
        if (i4 != i2 && i4 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.notify != null) {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.notify);
            throw new IllegalStateException(sb.toString());
        }
        if (this.asInterface == (~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return this;
        }
        this.asInterface--;
        this.g[this.asInterface] = null;
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = this.asInterface - 1;
        iArr[i5] = iArr[i5] + 1;
        if (i4 == i2) {
            String str = this.b;
        }
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(c);
        return this;
    }
}
