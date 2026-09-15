package defpackage;

import android.content.Context;
import androidx.core.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class getRemoteControlClient {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getRemoteControlClient(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context.getApplicationContext();
    }

    final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(b(), TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    final File b() {
        File file = new File(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, FileExtension fileExtension, boolean z) {
        String string;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (!z) {
            string = fileExtension.extension;
        } else {
            StringBuilder sb2 = new StringBuilder(".temp");
            sb2.append(fileExtension.extension);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }

    public final Pair<FileExtension, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        FileExtension fileExtension;
        try {
            File file = new File(b(), TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, FileExtension.JSON, false));
            if (!file.exists()) {
                file = new File(b(), TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, FileExtension.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            file.getAbsolutePath();
            onSetCaptioningEnabled.TuitionPaymentFragmentbindingInflater1();
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
