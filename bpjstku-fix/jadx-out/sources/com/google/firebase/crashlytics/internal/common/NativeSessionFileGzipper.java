package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes6.dex */
class NativeSessionFileGzipper {
    NativeSessionFileGzipper() {
    }

    static void processNativeSessions(File file, List<NativeSessionFile> list) {
        for (NativeSessionFile nativeSessionFile : list) {
            InputStream stream = null;
            try {
                stream = nativeSessionFile.getStream();
                if (stream != null) {
                    gzipInputStream(stream, new File(file, nativeSessionFile.getReportsEndpointFilename()));
                }
            } catch (IOException unused) {
            } finally {
                CommonUtils.closeQuietly(stream);
            }
        }
    }

    private static void gzipInputStream(InputStream inputStream, File file) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        try {
            gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i > 0) {
                        gZIPOutputStream.write(bArr, 0, i);
                    } else {
                        gZIPOutputStream.finish();
                        CommonUtils.closeQuietly(gZIPOutputStream);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
        }
    }
}
