package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.CameraUnavailableException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "Exif\u0000\u0000".getBytes(Charset.forName(Hex.DEFAULT_CHARSET_NAME));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(inputStream));
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBuffer));
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int TuitionPaymentFragmentbindingInflater1(InputStream inputStream, CameraUnavailableException cameraUnavailableException) throws IOException {
        if (inputStream != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(inputStream);
            if (cameraUnavailableException != null) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault3, cameraUnavailableException);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, CameraUnavailableException cameraUnavailableException) throws IOException {
        if (byteBuffer != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBuffer);
            if (cameraUnavailableException != null) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault1, cameraUnavailableException);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private static ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault3(Reader reader) throws IOException {
        try {
            int iTuitionPaymentFragmentbindingInflater1 = reader.TuitionPaymentFragmentbindingInflater1();
            if (iTuitionPaymentFragmentbindingInflater1 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = (iTuitionPaymentFragmentbindingInflater1 << 8) | reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 << 8) | reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1991225785) {
                reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(21L);
                try {
                    return reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1380533830) {
                reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4L);
                if (((reader.TuitionPaymentFragmentbindingInflater1() << 16) | reader.TuitionPaymentFragmentbindingInflater1()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iTuitionPaymentFragmentbindingInflater2 = (reader.TuitionPaymentFragmentbindingInflater1() << 16) | reader.TuitionPaymentFragmentbindingInflater1();
                if ((iTuitionPaymentFragmentbindingInflater2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iTuitionPaymentFragmentbindingInflater2 & 255;
                if (i != 88) {
                    if (i == 76) {
                        reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4L);
                        return (reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4L);
                short sTuitionPaymentFragmentspecialinlinedviewModeldefault2 = reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if ((sTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                if ((sTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.TuitionPaymentFragmentbindingInflater1() << 16) | reader.TuitionPaymentFragmentbindingInflater1()) == 1718909296) {
                int iTuitionPaymentFragmentbindingInflater3 = (reader.TuitionPaymentFragmentbindingInflater1() << 16) | reader.TuitionPaymentFragmentbindingInflater1();
                if (iTuitionPaymentFragmentbindingInflater3 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                int i2 = 0;
                boolean z = iTuitionPaymentFragmentbindingInflater3 == 1635150182;
                reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4L);
                int i3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 16;
                if (i3 % 4 == 0) {
                    while (i2 < 5 && i3 > 0) {
                        int iTuitionPaymentFragmentbindingInflater4 = (reader.TuitionPaymentFragmentbindingInflater1() << 16) | reader.TuitionPaymentFragmentbindingInflater1();
                        if (iTuitionPaymentFragmentbindingInflater4 == 1635150195) {
                            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                        }
                        if (iTuitionPaymentFragmentbindingInflater4 == 1635150182) {
                            z = true;
                        }
                        i2++;
                        i3 -= 4;
                    }
                }
                if (z) {
                    return ImageHeaderParser.ImageType.AVIF;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008f A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009b A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x009e A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:27:0x0055, B:29:0x005b, B:33:0x0064, B:39:0x006f, B:41:0x0074, B:44:0x007b, B:46:0x0080, B:48:0x008f, B:52:0x009b, B:55:0x00a3, B:57:0x00b4, B:59:0x00bc, B:61:0x00c7, B:64:0x00d1, B:66:0x00df, B:68:0x00e9, B:70:0x00f4, B:75:0x0102, B:77:0x010d, B:80:0x0117, B:81:0x011b, B:83:0x0125, B:84:0x0129, B:86:0x012d, B:89:0x0137, B:91:0x0140, B:93:0x0149, B:94:0x0150, B:95:0x0154, B:53:0x009e, B:54:0x00a1), top: B:104:0x0055, outer: #0 }] */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Reader reader, CameraUnavailableException cameraUnavailableException) throws IOException {
        int iTuitionPaymentFragmentbindingInflater1;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1;
        short s;
        ByteOrder byteOrder;
        int i;
        int i2;
        short s2;
        int i3;
        short s3;
        short sTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        try {
            int iTuitionPaymentFragmentbindingInflater2 = reader.TuitionPaymentFragmentbindingInflater1();
            if ((iTuitionPaymentFragmentbindingInflater2 & 65496) != 65496 && iTuitionPaymentFragmentbindingInflater2 != 19789 && iTuitionPaymentFragmentbindingInflater2 != 18761) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2() == 255 && (sTuitionPaymentFragmentspecialinlinedviewModeldefault2 = reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) != 218 && sTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 217) {
                    iTuitionPaymentFragmentbindingInflater1 = reader.TuitionPaymentFragmentbindingInflater1() - 2;
                    if (sTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 225) {
                        break;
                    }
                    long j = iTuitionPaymentFragmentbindingInflater1;
                    if (reader.TuitionPaymentFragmentspecialinlinedviewModeldefault2(j) != j) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        iTuitionPaymentFragmentbindingInflater1 = -1;
                        break;
                    }
                } else {
                    iTuitionPaymentFragmentbindingInflater1 = -1;
                    break;
                }
            }
            if (iTuitionPaymentFragmentbindingInflater1 == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentbindingInflater1, byte[].class);
            try {
                if (reader.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr, iTuitionPaymentFragmentbindingInflater1) != iTuitionPaymentFragmentbindingInflater1) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    boolean z = bArr != null && iTuitionPaymentFragmentbindingInflater1 > TuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                    if (z) {
                        int i4 = 0;
                        while (true) {
                            byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (i4 < bArr2.length) {
                                if (bArr[i4] == bArr2[i4]) {
                                    i4++;
                                }
                            } else if (z) {
                                tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(bArr, iTuitionPaymentFragmentbindingInflater1);
                                if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - 6 >= 2) {
                                    s = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(6);
                                } else {
                                    s = -1;
                                }
                                if (s != 18761) {
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                } else if (s != 19789) {
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                } else {
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                }
                                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.order(byteOrder);
                                if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - 10 >= 4) {
                                    i = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getInt(10);
                                } else {
                                    i = -1;
                                }
                                i2 = i + 6;
                                if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i2 >= 2) {
                                    s2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(i2);
                                } else {
                                    s2 = -1;
                                }
                                for (int i5 = 0; i5 < s2; i5++) {
                                    i3 = i + 8 + (i5 * 12);
                                    if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i3 < 2 && tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(i3) == 274) {
                                        int i6 = i3 + 2;
                                        short s4 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i6 >= 2 ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(i6) : (short) -1;
                                        if (s4 > 0 && s4 <= 12) {
                                            int i7 = i3 + 4;
                                            int i8 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i7 >= 4 ? tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getInt(i7) : -1;
                                            if (i8 < 0) {
                                                Log.isLoggable("DfltImageHeaderParser", 3);
                                            } else {
                                                Log.isLoggable("DfltImageHeaderParser", 3);
                                                int i9 = i8 + b[s4];
                                                if (i9 > 4) {
                                                    Log.isLoggable("DfltImageHeaderParser", 3);
                                                } else {
                                                    int i10 = i3 + 8;
                                                    if (i10 < 0 || i10 > tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining()) {
                                                        Log.isLoggable("DfltImageHeaderParser", 3);
                                                    } else if (i9 < 0 || i9 + i10 > tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining()) {
                                                        Log.isLoggable("DfltImageHeaderParser", 3);
                                                    } else if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i10 >= 2) {
                                                        s3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(i10);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(bArr, iTuitionPaymentFragmentbindingInflater1);
                        if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - 6 >= 2) {
                            s = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(6);
                        } else {
                            s = -1;
                        }
                        if (s != 18761) {
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                        } else if (s != 19789) {
                            byteOrder = ByteOrder.BIG_ENDIAN;
                        } else {
                            byteOrder = ByteOrder.BIG_ENDIAN;
                        }
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.order(byteOrder);
                        if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - 10 >= 4) {
                            i = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getInt(10);
                        } else {
                            i = -1;
                        }
                        i2 = i + 6;
                        if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i2 >= 2) {
                            s2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getShort(i2);
                        } else {
                            s2 = -1;
                        }
                        while (i5 < s2) {
                            i3 = i + 8 + (i5 * 12);
                            if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() - i3 < 2) {
                            }
                        }
                    }
                    cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                    return s3;
                }
                s3 = -1;
                cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                return s3;
            } catch (Throwable th) {
                cameraUnavailableException.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr);
                throw th;
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(byte[] bArr, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }
    }

    interface Reader {
        int TuitionPaymentFragmentbindingInflater1() throws IOException;

        long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) throws IOException;

        short TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException;

        int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i) throws IOException;

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Reader {
        private final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer byteBuffer) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Reader.EndOfFileException {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() <= 0) {
                throw new Reader.EndOfFileException();
            }
            return (short) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() & UByte.MAX_VALUE);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i) {
            int iMin = Math.min(i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
            int iMin = (int) Math.min(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining(), j);
            ByteBuffer byteBuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int TuitionPaymentFragmentbindingInflater1() throws Reader.EndOfFileException {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() <= 0) {
                throw new Reader.EndOfFileException();
            }
            int i = ((short) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() & UByte.MAX_VALUE)) << 8;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining() <= 0) {
                throw new Reader.EndOfFileException();
            }
            return i | ((short) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() & UByte.MAX_VALUE));
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Reader {
        private final InputStream TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(InputStream inputStream) {
            this.TuitionPaymentFragmentbindingInflater1 = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
            int i = this.TuitionPaymentFragmentbindingInflater1.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i3 < i && (i2 = this.TuitionPaymentFragmentbindingInflater1.read(bArr, i3, i - i3)) != -1) {
                i3 += i2;
            }
            if (i3 == 0 && i2 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.TuitionPaymentFragmentbindingInflater1.skip(j2);
                if (jSkip <= 0) {
                    if (this.TuitionPaymentFragmentbindingInflater1.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int TuitionPaymentFragmentbindingInflater1() throws IOException {
            int i = this.TuitionPaymentFragmentbindingInflater1.read();
            if (i == -1) {
                throw new Reader.EndOfFileException();
            }
            int i2 = ((short) i) << 8;
            int i3 = this.TuitionPaymentFragmentbindingInflater1.read();
            if (i3 != -1) {
                return i2 | ((short) i3);
            }
            throw new Reader.EndOfFileException();
        }
    }
}
