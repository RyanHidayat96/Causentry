package defpackage;

import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setQualitySelector implements Closeable, Flushable {
    boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f1381a;
    boolean asBinder;
    String b;
    int asInterface = 0;
    int[] d = new int[32];
    String[] g = new String[32];
    int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[32];
    int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;

    public abstract setQualitySelector TuitionPaymentFragmentbindingInflater1() throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentbindingInflater1(double d) throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1(Number number) throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IOException;

    public abstract setQualitySelector TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException;

    public abstract setQualitySelector b() throws IOException;

    public abstract setQualitySelector b(boolean z) throws IOException;

    setQualitySelector() {
    }

    final boolean d() {
        int i = this.asInterface;
        int[] iArr = this.d;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            StringBuilder sb = new StringBuilder("Nesting too deep at ");
            sb.append(g());
            sb.append(": circular reference?");
            throw new JsonDataException(sb.toString());
        }
        this.d = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.g;
        this.g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof setFrameRate)) {
            return true;
        }
        setFrameRate setframerate = (setFrameRate) this;
        setframerate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Arrays.copyOf(setframerate.TuitionPaymentFragmentspecialinlinedviewModeldefault3, setframerate.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length * 2);
        return true;
    }

    public final String g() {
        return getStreamState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asInterface, this.d, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}
