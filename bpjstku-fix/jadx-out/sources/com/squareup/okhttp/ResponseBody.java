package com.squareup.okhttp;

import androidx.collection.SieveCacheKt;
import com.squareup.okhttp.internal.Util;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    public abstract long contentLength() throws IOException;

    public abstract MediaType contentType();

    public abstract RotationProvider1 source() throws IOException;

    public final InputStream byteStream() throws IOException {
        return source().a();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(jContentLength)));
        }
        RotationProvider1 rotationProvider1Source = source();
        try {
            byte[] bArrCancelAll = rotationProvider1Source.cancelAll();
            Util.closeQuietly(rotationProvider1Source);
            if (jContentLength == -1 || jContentLength == bArrCancelAll.length) {
                return bArrCancelAll;
            }
            throw new IOException("Content-Length and stream length disagree");
        } catch (Throwable th) {
            Util.closeQuietly(rotationProvider1Source);
            throw th;
        }
    }

    public final Reader charStream() throws IOException {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(byteStream(), charset());
        this.reader = inputStreamReader;
        return inputStreamReader;
    }

    public final String string() throws IOException {
        return new String(bytes(), charset().name());
    }

    private Charset charset() {
        MediaType mediaTypeContentType = contentType();
        return mediaTypeContentType != null ? mediaTypeContentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        source().close();
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; charset=utf-8");
            mediaType = MediaType.parse(sb.toString());
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB = rotationProviderListenerWrapper.b(str, 0, str.length(), charset);
        return create(mediaType, rotationProviderListenerWrapperB.size, rotationProviderListenerWrapperB);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter(bArr, "");
        return create(mediaType, bArr.length, rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 0, bArr.length));
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final RotationProvider1 rotationProvider1) {
        if (rotationProvider1 == null) {
            throw new NullPointerException("source == null");
        }
        return new ResponseBody() { // from class: com.squareup.okhttp.ResponseBody.1
            @Override // com.squareup.okhttp.ResponseBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // com.squareup.okhttp.ResponseBody
            public final long contentLength() {
                return j;
            }

            @Override // com.squareup.okhttp.ResponseBody
            public final RotationProvider1 source() {
                return rotationProvider1;
            }
        };
    }
}
