package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
public class LensFacingCameraFilter {
    private static LensFacingCameraFilter[] g = {new LensFacingCameraFilter(false, 3, 5, 8, 8, 1), new LensFacingCameraFilter(false, 5, 7, 10, 10, 1), new LensFacingCameraFilter(true, 5, 7, 16, 6, 1), new LensFacingCameraFilter(false, 8, 10, 12, 12, 1), new LensFacingCameraFilter(true, 10, 11, 14, 6, 2), new LensFacingCameraFilter(false, 12, 12, 14, 14, 1), new LensFacingCameraFilter(true, 16, 14, 24, 10, 1), new LensFacingCameraFilter(false, 18, 14, 16, 16, 1), new LensFacingCameraFilter(false, 22, 18, 18, 18, 1), new LensFacingCameraFilter(true, 22, 18, 16, 10, 2), new LensFacingCameraFilter(false, 30, 20, 20, 20, 1), new LensFacingCameraFilter(true, 32, 24, 16, 14, 2), new LensFacingCameraFilter(false, 36, 24, 22, 22, 1), new LensFacingCameraFilter(false, 44, 28, 24, 24, 1), new LensFacingCameraFilter(true, 49, 28, 22, 14, 2), new LensFacingCameraFilter(false, 62, 36, 14, 14, 4), new LensFacingCameraFilter(false, 86, 42, 16, 16, 4), new LensFacingCameraFilter(false, 114, 48, 18, 18, 4), new LensFacingCameraFilter(false, 144, 56, 20, 20, 4), new LensFacingCameraFilter(false, 174, 68, 22, 22, 4), new LensFacingCameraFilter(false, 204, 84, 24, 24, 4, 102, 42), new LensFacingCameraFilter(false, 280, 112, 14, 14, 16, 140, 56), new LensFacingCameraFilter(false, 368, 144, 16, 16, 16, 92, 36), new LensFacingCameraFilter(false, 456, DerHeader.TAG_CLASS_PRIVATE, 18, 18, 16, 114, 48), new LensFacingCameraFilter(false, 576, 224, 20, 20, 16, 144, 56), new LensFacingCameraFilter(false, 696, 272, 22, 22, 16, 174, 68), new LensFacingCameraFilter(false, 816, 336, 24, 24, 16, 136, 56), new LensFacingCameraFilter(false, 1050, 408, 18, 18, 36, 175, 68), new LensFacingCameraFilter(false, 1304, 496, 20, 20, 36, 163, 62), new ImageReaderProxy()};
    final int TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f163a;
    private final int asBinder;
    private final boolean asInterface;
    final int b;

    private LensFacingCameraFilter(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    LensFacingCameraFilter(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.asInterface = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        this.asBinder = i5;
        this.f163a = i6;
        this.b = i7;
    }

    public static LensFacingCameraFilter TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, SymbolShapeHint symbolShapeHint, lambdasurfaceListWithTimeout1 lambdasurfacelistwithtimeout1, lambdasurfaceListWithTimeout1 lambdasurfacelistwithtimeout2) {
        for (LensFacingCameraFilter lensFacingCameraFilter : g) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && lensFacingCameraFilter.asInterface) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || lensFacingCameraFilter.asInterface) && ((lambdasurfacelistwithtimeout1 == null || ((lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + (lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3() << 1) >= lambdasurfacelistwithtimeout1.b && (lensFacingCameraFilter.TuitionPaymentFragmentbindingInflater1() * lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (lensFacingCameraFilter.TuitionPaymentFragmentbindingInflater1() << 1) >= lambdasurfacelistwithtimeout1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) && ((lambdasurfacelistwithtimeout2 == null || ((lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3() * lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + (lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3() << 1) <= lambdasurfacelistwithtimeout2.b && (lensFacingCameraFilter.TuitionPaymentFragmentbindingInflater1() * lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (lensFacingCameraFilter.TuitionPaymentFragmentbindingInflater1() << 1) <= lambdasurfacelistwithtimeout2.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) && i <= lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3)))) {
                return lensFacingCameraFilter;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = this.asBinder;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    public final int TuitionPaymentFragmentbindingInflater1() {
        int i = this.asBinder;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / this.f163a;
    }

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return this.f163a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.asInterface ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append('x');
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", symbol size ");
        sb.append((TuitionPaymentFragmentspecialinlinedviewModeldefault3() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + (TuitionPaymentFragmentspecialinlinedviewModeldefault3() << 1));
        sb.append('x');
        sb.append((TuitionPaymentFragmentbindingInflater1() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (TuitionPaymentFragmentbindingInflater1() << 1));
        sb.append(", symbol data size ");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append('x');
        sb.append(TuitionPaymentFragmentbindingInflater1() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", codewords ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('+');
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        return sb.toString();
    }
}
