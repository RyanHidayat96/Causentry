package com.bumptech.glide.load;

import defpackage.CameraUnavailableException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface ImageHeaderParser {
    int TuitionPaymentFragmentbindingInflater1(InputStream inputStream, CameraUnavailableException cameraUnavailableException) throws IOException;

    int TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, CameraUnavailableException cameraUnavailableException) throws IOException;

    ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteBuffer byteBuffer) throws IOException;

    ImageType b(InputStream inputStream) throws IOException;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public final boolean hasAlpha() {
            return this.hasAlpha;
        }

        public final boolean isWebp() {
            int i = AnonymousClass2.b[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ImageType.values().length];
            b = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
