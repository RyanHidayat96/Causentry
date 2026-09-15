package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class Quality {
    private static final String b = File.separator;

    public static final Bitmap b(File file, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        if (iIntValue > i2 || iIntValue2 > i) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "");
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "");
        return bitmapDecodeFile;
    }

    public static final Bitmap TuitionPaymentFragmentbindingInflater1(File file, Bitmap bitmap) {
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkExpressionValueIsNotNull(bitmapCreateBitmap, "");
        return bitmapCreateBitmap;
    }

    public static final File b(Context context, File file) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        File cacheDir = context.getCacheDir();
        Intrinsics.checkExpressionValueIsNotNull(cacheDir, "");
        sb2.append(cacheDir.getPath());
        String str = b;
        sb2.append(str);
        sb2.append("compressor");
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append(file.getName());
        return FilesKt.copyTo$default(file, new File(sb.toString()), true, 0, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        Bitmap.CompressFormat compressFormat2;
        File file2;
        Throwable th;
        String extension = FilesKt.getExtension(file);
        if (extension != null) {
            String lowerCase = extension.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "");
            int iHashCode = lowerCase.hashCode();
            String str = "webp";
            if (iHashCode == 111145) {
                if (lowerCase.equals("png")) {
                    compressFormat2 = Bitmap.CompressFormat.PNG;
                } else {
                    compressFormat2 = Bitmap.CompressFormat.JPEG;
                }
            } else if (iHashCode == 3645340 && lowerCase.equals("webp")) {
                compressFormat2 = Bitmap.CompressFormat.WEBP;
            } else {
                compressFormat2 = Bitmap.CompressFormat.JPEG;
            }
            FileOutputStream fileOutputStream = null;
            if (compressFormat == compressFormat2) {
                file2 = file;
            } else {
                StringBuilder sb = new StringBuilder();
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "");
                sb.append(StringsKt.substringBeforeLast$default(absolutePath, ".", (String) null, 2, (Object) null));
                sb.append('.');
                int i2 = isAudioEnabled$WhenMappings.$EnumSwitchMapping$0[compressFormat.ordinal()];
                if (i2 == 1) {
                    str = "png";
                } else if (i2 != 2) {
                    str = "jpg";
                }
                sb.append(str);
                file2 = new File(sb.toString());
            }
            file.delete();
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2.getAbsolutePath());
                try {
                    bitmap.compress(compressFormat, i, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    return file2;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
