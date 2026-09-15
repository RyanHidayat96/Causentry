package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class getLayoutSettings {
    public static final isMirroring<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Queue<BitmapFactory.Options> asInterface;
    static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;
    private static isMirroring<Boolean> d;
    final CameraUnavailableException TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<ImageHeaderParser> f950a;
    private final DisplayMetrics asBinder;
    private final BitmapPool g;
    private final DelegatingImageSavedCallback onTransact = DelegatingImageSavedCallback.TuitionPaymentFragmentbindingInflater1();
    private static final byte[] $$a = {81, -102, -70, -91, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 76;
    public static final isMirroring<DecodeFormat> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isMirroring.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    public static final isMirroring<PreferredColorSpace> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isMirroring.TuitionPaymentFragmentspecialinlinedviewModeldefault3("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return true;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getLayoutSettings.$$a
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r1 = r8 + 53
            byte[] r1 = new byte[r1]
            int r8 = r8 + 52
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLayoutSettings.c(byte, byte, int, java.lang.Object[]):void");
    }

    static {
        isMirroring<DownsampleStrategy> ismirroring = DownsampleStrategy.asInterface;
        Boolean bool = Boolean.FALSE;
        d = isMirroring.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isMirroring.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: getLayoutSettings.1
            @Override // getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapPool bitmapPool, Bitmap bitmap) {
            }

            @Override // getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            }
        };
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        asInterface = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
    }

    public getLayoutSettings(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, CameraUnavailableException cameraUnavailableException) {
        this.f950a = list;
        if (displayMetrics == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.asBinder = displayMetrics;
        if (bitmapPool == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.g = bitmapPool;
        if (cameraUnavailableException == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentbindingInflater1 = cameraUnavailableException;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17311. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> b(defpackage.getEncoding r44, int r45, int r46, defpackage.getTargetRotation r47, getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1 r48) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLayoutSettings.b(getEncoding, int, int, getTargetRotation, getLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault1):com.bumptech.glide.load.engine.Resource");
    }

    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(getEncoding getencoding, BitmapFactory.Options options, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, BitmapPool bitmapPool) throws IOException {
        options.inJustDecodeBounds = true;
        TuitionPaymentFragmentbindingInflater1(getencoding, options, tuitionPaymentFragmentspecialinlinedviewModeldefault1, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap TuitionPaymentFragmentbindingInflater1(defpackage.getEncoding r6, android.graphics.BitmapFactory.Options r7, getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1 r8, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r9) throws java.io.IOException {
        /*
            boolean r0 = r7.inJustDecodeBounds
            if (r0 != 0) goto La
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            r6.b()
        La:
            int r0 = r7.outWidth
            int r1 = r7.outHeight
            java.lang.String r2 = r7.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            r3.lock()
            android.graphics.Bitmap r6 = r6.TuitionPaymentFragmentbindingInflater1(r7)     // Catch: java.lang.Throwable -> L1c java.lang.IllegalArgumentException -> L1e
            goto L60
        L1c:
            r6 = move-exception
            goto L6a
        L1e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1c
            r4.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ", outHeight: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L1c
            r4.append(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ", outMimeType: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L1c
            r4.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ", inBitmap: "
            r4.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r1 = r7.inBitmap     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = TuitionPaymentFragmentbindingInflater1(r1)     // Catch: java.lang.Throwable -> L1c
            r4.append(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r1 = r7.inBitmap     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L69
            android.graphics.Bitmap r1 = r7.inBitmap     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L68
            r9.TuitionPaymentFragmentbindingInflater1(r1)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L68
            r1 = 0
            r7.inBitmap = r1     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L68
            android.graphics.Bitmap r6 = TuitionPaymentFragmentbindingInflater1(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L68
        L60:
            java.util.concurrent.locks.Lock r7 = defpackage.ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            r7.unlock()
            return r6
        L68:
            throw r0     // Catch: java.lang.Throwable -> L1c
        L69:
            throw r0     // Catch: java.lang.Throwable -> L1c
        L6a:
            java.util.concurrent.locks.Lock r7 = defpackage.ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getLayoutSettings.TuitionPaymentFragmentbindingInflater1(getEncoding, android.graphics.BitmapFactory$Options, getLayoutSettings$TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    private static String TuitionPaymentFragmentbindingInflater1(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(" (");
        sb.append(bitmap.getAllocationByteCount());
        sb.append(")");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(string);
        return sb2.toString();
    }

    private static BitmapFactory.Options TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        BitmapFactory.Options optionsPoll;
        synchronized (getLayoutSettings.class) {
            Queue<BitmapFactory.Options> queue = asInterface;
            synchronized (queue) {
                optionsPoll = queue.poll();
            }
            if (optionsPoll == null) {
                optionsPoll = new BitmapFactory.Options();
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(optionsPoll);
            }
        }
        return optionsPoll;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static boolean b() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }
}
