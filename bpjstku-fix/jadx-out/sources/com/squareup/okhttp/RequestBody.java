package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import defpackage.RotationProviderListener;
import defpackage.SurfaceViewImplementation;
import defpackage.tryToComplete;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RequestBody {
    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(RotationProviderListener rotationProviderListener) throws IOException;

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = MediaType.parse(sb.toString());
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() { // from class: com.squareup.okhttp.RequestBody.1
            @Override // com.squareup.okhttp.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // com.squareup.okhttp.RequestBody
            public final long contentLength() throws IOException {
                return byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }

            @Override // com.squareup.okhttp.RequestBody
            public final void writeTo(RotationProviderListener rotationProviderListener) throws IOException {
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteString);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        Util.checkOffsetAndCount(bArr.length, i, i2);
        return new RequestBody() { // from class: com.squareup.okhttp.RequestBody.2
            @Override // com.squareup.okhttp.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // com.squareup.okhttp.RequestBody
            public final long contentLength() {
                return i2;
            }

            @Override // com.squareup.okhttp.RequestBody
            public final void writeTo(RotationProviderListener rotationProviderListener) throws IOException {
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, i, i2);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file == null) {
            throw new NullPointerException("content == null");
        }
        return new RequestBody() { // from class: com.squareup.okhttp.RequestBody.3
            @Override // com.squareup.okhttp.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // com.squareup.okhttp.RequestBody
            public final long contentLength() {
                return file.length();
            }

            @Override // com.squareup.okhttp.RequestBody
            public final void writeTo(RotationProviderListener rotationProviderListener) throws IOException {
                tryToComplete trytocompleteTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                try {
                    trytocompleteTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file);
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(trytocompleteTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } finally {
                    Util.closeQuietly(trytocompleteTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        };
    }
}
