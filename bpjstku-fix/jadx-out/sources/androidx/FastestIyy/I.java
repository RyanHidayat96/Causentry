package androidx.FastestIyy;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class I {
    public static byte[] a(String str) throws IOException {
        if (str.isEmpty() || str.length() % 2 != 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2;
            try {
                byteArrayOutputStream.write((byte) (Integer.parseInt(str.substring(i, i2), 16) & 255));
                i = i2;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void b() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.FastestIyy.I$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                I.a();
            }
        });
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static int a(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int i4 = inputStream.read(bArr, i3, i);
            if (i4 <= 0) {
                return -1;
            }
            i3 += i4;
            i -= i4;
            i2 += i4;
        }
        return i2;
    }

    public static int a(Context context, String str, String[] strArr, byte[] bArr, byte[] bArr2) throws Throwable {
        Throwable th;
        int i = 32768;
        try {
            StringBuilder sb = new StringBuilder("lib");
            sb.append(str);
            sb.append(".so");
            String string = sb.toString();
            String str2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArrDigest = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(str2);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                if (nextEntry.getName().contains(string)) {
                                    nextEntry.getName();
                                    messageDigest.reset();
                                    long size = nextEntry.getSize();
                                    int i2 = (int) (size / PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
                                    byte[] bArr3 = bArrDigest;
                                    try {
                                        byte[] bArr4 = new byte[32768];
                                        int iA = a(zipInputStream, bArr4, (int) (size - (((long) i2) * PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)));
                                        int iA2 = K.a(bArr4, bArr2);
                                        if (iA2 >= 0) {
                                            messageDigest.update(bArr4, iA2, iA - iA2);
                                            while (i2 > 0) {
                                                int iA3 = a(zipInputStream, bArr4, 32768);
                                                int iA4 = K.a(bArr4, bArr);
                                                if (iA4 >= 0) {
                                                    iA3 = iA4;
                                                }
                                                messageDigest.update(bArr4, 0, iA3);
                                                i2--;
                                            }
                                            bArrDigest = messageDigest.digest();
                                            a(bArrDigest);
                                        } else {
                                            throw new RuntimeException("E334901111");
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bArrDigest = bArr3;
                                    }
                                    th = th;
                                }
                            } else {
                                byte[] bArr5 = bArrDigest;
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused) {
                                }
                                bArrDigest = bArr5;
                                break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                        }
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Exception unused2) {
            }
            String str3 = context.getApplicationInfo().nativeLibraryDir;
            if (str3 == null) {
                return 32768;
            }
            File[] fileArrListFiles = new File(str3).listFiles();
            ArrayList arrayList = new ArrayList();
            if (fileArrListFiles != null) {
                Integer.valueOf(fileArrListFiles.length);
                int length = fileArrListFiles.length;
                int i3 = 0;
                while (i3 < length) {
                    File file = fileArrListFiles[i3];
                    if (file.getPath().contains(string)) {
                        file.getPath();
                        messageDigest.reset();
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(file.getPath());
                            try {
                                int iAvailable = fileInputStream2.available();
                                int i4 = iAvailable / i;
                                int i5 = iAvailable - (i4 * i);
                                Integer.valueOf(i5);
                                byte[] bArr6 = new byte[i];
                                int iA5 = a(fileInputStream2, bArr6, i5);
                                Integer.valueOf(iA5);
                                int iA6 = K.a(bArr6, bArr2);
                                if (iA6 >= 0) {
                                    int i6 = iA5 - iA6;
                                    Integer.valueOf(i6);
                                    messageDigest.update(bArr6, iA6, i6);
                                    while (i4 > 0) {
                                        int iA7 = a(fileInputStream2, bArr6, 32768);
                                        Integer.valueOf(i4);
                                        Integer.valueOf(iA7);
                                        int iA8 = K.a(bArr6, bArr);
                                        if (iA8 >= 0) {
                                            iA7 = iA8;
                                        }
                                        messageDigest.update(bArr6, 0, iA7);
                                        i4--;
                                    }
                                    fileInputStream2.close();
                                    byte[] bArrDigest2 = messageDigest.digest();
                                    file.getPath();
                                    a(bArrDigest2);
                                    arrayList.add(bArrDigest2);
                                } else {
                                    throw new RuntimeException("E334902222");
                                }
                            } catch (Throwable th6) {
                                try {
                                    fileInputStream2.close();
                                    throw th6;
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                    throw th6;
                                }
                            }
                        } catch (Exception e2) {
                            new Object[]{e2, file.getPath()};
                            return 32768;
                        }
                        new Object[]{e2, file.getPath()};
                        return 32768;
                    }
                    i3++;
                    i = 32768;
                }
            }
            if (bArrDigest != null) {
                int length2 = strArr.length;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i7 < length2) {
                        byte[] bArrA = a(strArr[i7]);
                        if (bArrA != null) {
                            if (Arrays.equals(bArrDigest, bArrA)) {
                                a(bArrDigest);
                                a(bArrA);
                                break;
                            }
                        } else {
                            i8++;
                        }
                        i7++;
                    } else {
                        if (i8 >= strArr.length) {
                            break;
                        }
                        return 4;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return 32768;
            }
            int i9 = 0;
            for (String str4 : strArr) {
                byte[] bArrA2 = a(str4);
                if (bArrA2 != null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        byte[] bArr7 = (byte[]) arrayList.get(i10);
                        a(bArr7);
                        if (Arrays.equals(bArrA2, bArr7)) {
                            return 0;
                        }
                        i9++;
                    }
                }
            }
            return i9 == 0 ? 0 : 4;
        } catch (Exception e3) {
            new Object[]{e3};
            return 32768;
        }
    }

    public static void a() {
        System.exit(0);
    }
}
