package defpackage;

import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class setFrameRate extends setQualitySelector {
    Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object[32];
    private String notify;

    setFrameRate() {
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
        if (this.asInterface == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.d[this.asInterface - 1] == 1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface] = arrayList;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.asInterface] = 0;
        int[] iArr = this.d;
        int i = this.asInterface;
        this.asInterface = i + 1;
        iArr[i] = 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector b() throws IOException {
        if (this.f1381a) {
            StringBuilder sb = new StringBuilder("Object cannot be used as a map key in JSON at path ");
            sb.append(g());
            throw new IllegalStateException(sb.toString());
        }
        if (this.asInterface == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.d[this.asInterface - 1] == 3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return this;
        }
        d();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(linkedHashTreeMap);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface] = linkedHashTreeMap;
        int[] iArr = this.d;
        int i = this.asInterface;
        this.asInterface = i + 1;
        iArr[i] = 3;
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
        if (this.d[i - 1] != 3 || this.notify != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.notify = str;
        this.g[this.asInterface - 1] = str;
        this.f1381a = false;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IOException {
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
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
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
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
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Boolean.valueOf(z));
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentbindingInflater1(double d) throws IOException {
        if (!this.TuitionPaymentFragmentbindingInflater1 && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d)));
        }
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(Double.toString(d));
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Double.valueOf(d));
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
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Long.valueOf(j));
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1(Number number) throws IOException {
        if (number instanceof Float) {
            return TuitionPaymentFragmentbindingInflater1(number.doubleValue());
        }
        if (number == null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        BigDecimal bigDecimal = new BigDecimal(number.toString());
        if (this.f1381a) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(bigDecimal.toString());
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(bigDecimal);
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.asInterface - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.asInterface;
        if (i > 1 || (i == 1 && this.d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.asInterface = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.asInterface == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    private setFrameRate TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        Object objPut;
        int i = this.asInterface;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int i2 = this.d[i - 1];
        if (this.asInterface == 1) {
            if (i2 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.d[this.asInterface - 1] = 7;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface - 1] = obj;
            return this;
        }
        if (i2 != 3 || this.notify == null) {
            if (i2 == 1) {
                ((List) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface - 1]).add(obj);
                return this;
            }
            if (i2 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj != null || this.asBinder) && (objPut = ((Map) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface - 1]).put(this.notify, obj)) != null) {
            StringBuilder sb = new StringBuilder("Map key '");
            sb.append(this.notify);
            sb.append("' has multiple values at path ");
            sb.append(g());
            sb.append(": ");
            sb.append(objPut);
            sb.append(" and ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        this.notify = null;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException {
        int i = this.asInterface;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.d[i - 1] != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.asInterface == (~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ~this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return this;
        }
        this.asInterface--;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface] = null;
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = this.asInterface - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // defpackage.setQualitySelector
    public final setQualitySelector TuitionPaymentFragmentbindingInflater1() throws IOException {
        int i = this.asInterface;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.d[i - 1] != 3) {
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
        this.f1381a = false;
        this.asInterface--;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.asInterface] = null;
        this.g[this.asInterface] = null;
        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = this.asInterface - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }
}
