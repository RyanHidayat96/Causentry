package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.Charset;
import kotlin.UByte;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdaaddObserver2androidxcameracoreimplLiveDataObservable {
    public lambdasurfaceListWithTimeout1 TuitionPaymentFragmentbindingInflater1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public lambdasurfaceListWithTimeout1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SymbolShapeHint f1247a;
    public LensFacingCameraFilter asInterface;
    public final String b;
    public int d;
    public int g;

    public lambdaaddObserver2androidxcameracoreimplLiveDataObservable(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & UByte.MAX_VALUE);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.b = sb.toString();
        this.f1247a = SymbolShapeHint.FORCE_NONE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new StringBuilder(str.length());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
    }

    public final void b(int i) {
        LensFacingCameraFilter lensFacingCameraFilter = this.asInterface;
        if (lensFacingCameraFilter == null || i > lensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.asInterface = LensFacingCameraFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, this.f1247a, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
        }
    }
}
