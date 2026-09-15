package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceEdgeExternalSyntheticLambda3 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2017779056;

    public static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = dataInputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                dataInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static void b(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
