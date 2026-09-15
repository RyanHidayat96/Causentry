package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: loaded from: classes5.dex */
public final class setErrorListener {
    int TuitionPaymentFragmentbindingInflater1 = -1;
    Mode TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public addOutputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    ErrorCorrectionLevel TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    SessionConfigBuilder b;

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("\n ecLevel: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("\n version: ");
        sb.append(this.b);
        sb.append("\n maskPattern: ");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
