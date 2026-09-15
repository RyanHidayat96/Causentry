package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes3.dex */
final class getInputCropRect {
    static final Charset TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Charset.forName("US-ASCII");

    static {
        Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    static void TuitionPaymentFragmentbindingInflater1(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }
}
