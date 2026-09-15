package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import defpackage.Camera;
import defpackage.ConcurrentCameraSingleCameraConfig;
import defpackage.getTargetRotation;
import defpackage.isMirroring;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoDecoder<T> implements Camera<T, Bitmap> {
    private final TuitionPaymentFragmentbindingInflater1<T> asBinder;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface;
    private final BitmapPool b;
    public static final isMirroring<Long> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isMirroring.TuitionPaymentFragmentspecialinlinedviewModeldefault1("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new isMirroring.TuitionPaymentFragmentbindingInflater1<Long>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.4
        private final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ByteBuffer.allocate(8);

        @Override // isMirroring.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.position(0);
                messageDigest.update(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.putLong(l2.longValue()).array());
            }
        }
    });
    private static isMirroring<Integer> TuitionPaymentFragmentbindingInflater1 = isMirroring.TuitionPaymentFragmentspecialinlinedviewModeldefault1("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new isMirroring.TuitionPaymentFragmentbindingInflater1<Integer>() { // from class: com.bumptech.glide.load.resource.bitmap.VideoDecoder.1
        private final ByteBuffer b = ByteBuffer.allocate(4);

        @Override // isMirroring.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.b) {
                    this.b.position(0);
                    messageDigest.update(this.b.putInt(num2.intValue()).array());
                }
            }
        }
    });
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    private static final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    interface TuitionPaymentFragmentbindingInflater1<T> {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaExtractor mediaExtractor, T t) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @Override // defpackage.Camera
    public final boolean TuitionPaymentFragmentbindingInflater1(T t, getTargetRotation gettargetrotation) {
        return true;
    }

    public static Camera<AssetFileDescriptor, Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new b((byte) 0));
    }

    public static Camera<ParcelFileDescriptor, Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static Camera<ByteBuffer, Bitmap> TuitionPaymentFragmentbindingInflater1(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    private VideoDecoder(BitmapPool bitmapPool, TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1) {
        this(bitmapPool, tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    private VideoDecoder(BitmapPool bitmapPool, TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.b = bitmapPool;
        this.asBinder = tuitionPaymentFragmentbindingInflater1;
        this.asInterface = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.Camera
    public final Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(T t, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        isMirroring<Long> ismirroring = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long jLongValue = ((Long) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: ".concat(String.valueOf(jLongValue)));
        }
        isMirroring<Integer> ismirroring2 = TuitionPaymentFragmentbindingInflater1;
        Integer num = (Integer) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring2) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring2) : ismirroring2.b);
        if (num == null) {
            num = 2;
        }
        isMirroring<DownsampleStrategy> ismirroring3 = DownsampleStrategy.asInterface;
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring3) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring3) : ismirroring3.b);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.asBinder.b(mediaMetadataRetriever, t);
            int iIntValue = num.intValue();
            if (b(t, mediaMetadataRetriever)) {
                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
            }
            Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (Build.VERSION.SDK_INT < 27 || i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || downsampleStrategy2 == DownsampleStrategy.g) ? null : TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaMetadataRetriever, jLongValue, iIntValue, i, i2, downsampleStrategy2);
            if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaMetadataRetriever.getFrameAtTime(jLongValue, iIntValue);
            }
            Bitmap bitmapB = b(mediaMetadataRetriever, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (bitmapB != null) {
                mediaMetadataRetriever.release();
                return ConcurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapB, this.b);
            }
            throw new VideoDecoderException();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    private static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i6 == 90 || i6 == 270) {
                i5 = i4;
                i4 = i5;
            }
            float fTuitionPaymentFragmentbindingInflater1 = downsampleStrategy.TuitionPaymentFragmentbindingInflater1(i4, i5, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(i4 * fTuitionPaymentFragmentbindingInflater1), Math.round(fTuitionPaymentFragmentbindingInflater1 * i5));
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean b(T t, MediaMetadataRetriever mediaMetadataRetriever) {
        MediaExtractor mediaExtractor;
        if (Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                mediaExtractor = new MediaExtractor();
                try {
                    this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaExtractor, t);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i = 0; i < trackCount; i++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i).getString("mime"))) {
                            mediaExtractor.release();
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                    if (mediaExtractor != null) {
                    }
                    return false;
                }
                mediaExtractor.release();
            } catch (Throwable unused2) {
                mediaExtractor = null;
            }
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        }
        return false;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }
    }

    static final class b implements TuitionPaymentFragmentbindingInflater1<AssetFileDescriptor> {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements TuitionPaymentFragmentbindingInflater1<ParcelFileDescriptor> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements TuitionPaymentFragmentbindingInflater1<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new AnonymousClass1(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new AnonymousClass1(byteBuffer));
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$TuitionPaymentFragmentspecialinlinedviewModeldefault1$1, reason: invalid class name */
        final class AnonymousClass1 extends MediaDataSource {
            private /* synthetic */ ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            AnonymousClass1(ByteBuffer byteBuffer) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public final int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.limit()) {
                    return -1;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.position((int) j);
                int iMin = Math.min(i2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remaining());
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(bArr, i, iMin);
                return iMin;
            }

            @Override // android.media.MediaDataSource
            public final long getSize() {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.limit();
            }
        }
    }

    static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    private static Bitmap b(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        int i;
        if (!Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                try {
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                    i = Integer.parseInt(strExtractMetadata);
                    int i2 = Integer.parseInt(strExtractMetadata2);
                    if ((i != 7 || i == 6) && i2 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                } catch (NumberFormatException unused) {
                    break;
                }
            }
        } else {
            Iterator<String> it = TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
            while (it.hasNext()) {
                if (Build.ID.startsWith(it.next())) {
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                    i = Integer.parseInt(strExtractMetadata3);
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    if (i != 7) {
                        Matrix matrix2 = new Matrix();
                        matrix2.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                    }
                    Matrix matrix3 = new Matrix();
                    matrix3.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix3, true);
                }
            }
        }
        return bitmap;
    }
}
