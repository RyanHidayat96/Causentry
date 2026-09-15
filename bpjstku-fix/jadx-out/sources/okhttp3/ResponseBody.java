package okhttp3;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0003JB\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0017H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0018H'¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "Lokio/ByteString;", "byteString", "()Lokio/ByteString;", "", "bytes", "()[B", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "", "close", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "LRotationProvider1;", "p0", "", "p1", "consumeSource", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "source", "()LRotationProvider1;", "", TypedValues.Custom.S_STRING, "()Ljava/lang/String;", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Reader reader;

    /* JADX INFO: renamed from: contentLength */
    public abstract long get$contentLength();

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    /* JADX INFO: renamed from: source */
    public abstract RotationProvider1 get$this_asResponseBody();

    public final InputStream byteStream() {
        return get$this_asResponseBody().a();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(Function1<? super RotationProvider1, ? extends T> p0, Function1<? super T, Integer> p1) throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(jContentLength)));
        }
        RotationProvider1 rotationProvider1Source = get$this_asResponseBody();
        try {
            T tInvoke = p0.invoke(rotationProvider1Source);
            CloseableKt.closeFinally(rotationProvider1Source, null);
            int iIntValue = p1.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            StringBuilder sb = new StringBuilder("Content-Length (");
            sb.append(jContentLength);
            sb.append(") and stream length (");
            sb.append(iIntValue);
            sb.append(") disagree");
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(rotationProvider1Source, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public final String string() throws IOException {
        RotationProvider1 rotationProvider1Source = get$this_asResponseBody();
        try {
            RotationProvider1 rotationProvider1 = rotationProvider1Source;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProvider1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Util.readBomAsCharset(rotationProvider1, charset()));
            CloseableKt.closeFinally(rotationProvider1Source, null);
            return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(rotationProvider1Source, th);
                throw th2;
            }
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = get$contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charset;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(get$this_asResponseBody());
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "LRotationProvider1;", "p0", "Ljava/nio/charset/Charset;", "p1", "<init>", "(LRotationProvider1;Ljava/nio/charset/Charset;)V", "", "close", "()V", "", "", "p2", "read", "([CII)I", "charset", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "source", "LRotationProvider1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final RotationProvider1 source;

        public BomAwareReader(RotationProvider1 rotationProvider1, Charset charset) {
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            Intrinsics.checkNotNullParameter(charset, "");
            this.source = rotationProvider1;
            this.charset = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] p0, int p1, int p2) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.a(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(p0, p1, p2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Unit unit;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.source.close();
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\t\u0010\u000eJ!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\t\u0010\u0010J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\t\u0010\u0012J)\u0010\t\u001a\u00020\b*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\u0013J\u001f\u0010\t\u001a\u00020\b*\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0014J\u001f\u0010\t\u001a\u00020\b*\u00020\u000f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0015J\u001f\u0010\t\u001a\u00020\b*\u00020\u00112\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0016"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "Lokhttp3/MediaType;", "p0", "", "p1", "Lokhttp3/ResponseBody;", "create", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "", "LRotationProvider1;", "p2", "(Lokhttp3/MediaType;JLRotationProvider1;)Lokhttp3/ResponseBody;", "", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "Lokio/ByteString;", "(Lokhttp3/MediaType;Lokio/ByteString;)Lokhttp3/ResponseBody;", "(LRotationProvider1;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(String str, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "");
            Charset charsetCharset$default = Charsets.UTF_8;
            if (mediaType != null && (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) {
                charsetCharset$default = Charsets.UTF_8;
                MediaType.Companion companion = MediaType.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType = companion.parse(sb.toString());
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charsetCharset$default, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapperB = rotationProviderListenerWrapper.b(str, 0, str.length(), charsetCharset$default);
            return create(rotationProviderListenerWrapperB, mediaType, rotationProviderListenerWrapperB.size);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(bArr, "");
            return create(rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 0, bArr.length), mediaType, bArr.length);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @JvmStatic
        public final ResponseBody create(ByteString byteString, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(byteString, "");
            byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            return create(rotationProviderListenerWrapper, mediaType, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, RotationProvider1 rotationProvider1, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(rotationProvider1, mediaType, j);
        }

        @JvmStatic
        public final ResponseBody create(final RotationProvider1 rotationProvider1, final MediaType mediaType, final long j) {
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public final MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public final long get$contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public final RotationProvider1 get$this_asResponseBody() {
                    return rotationProvider1;
                }
            };
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        public final ResponseBody create(MediaType p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            return create(p1, p0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        public final ResponseBody create(MediaType p0, byte[] p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            return create(p1, p0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        public final ResponseBody create(MediaType p0, ByteString p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            return create(p1, p0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @JvmStatic
        public final ResponseBody create(MediaType p0, long p1, RotationProvider1 p2) {
            Intrinsics.checkNotNullParameter(p2, "");
            return create(p2, p0, p1);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(jContentLength)));
        }
        RotationProvider1 rotationProvider1Source = get$this_asResponseBody();
        try {
            byte[] bArrCancelAll = rotationProvider1Source.cancelAll();
            CloseableKt.closeFinally(rotationProvider1Source, null);
            int length = bArrCancelAll.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrCancelAll;
            }
            StringBuilder sb = new StringBuilder("Content-Length (");
            sb.append(jContentLength);
            sb.append(") and stream length (");
            sb.append(length);
            sb.append(") disagree");
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(rotationProvider1Source, th);
                throw th2;
            }
        }
    }

    public final ByteString byteString() throws IOException {
        long jContentLength = get$contentLength();
        if (jContentLength > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(jContentLength)));
        }
        RotationProvider1 rotationProvider1Source = get$this_asResponseBody();
        try {
            ByteString byteStringOnTransact = rotationProvider1Source.onTransact();
            CloseableKt.closeFinally(rotationProvider1Source, null);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = byteStringOnTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (jContentLength == -1 || jContentLength == iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return byteStringOnTransact;
            }
            StringBuilder sb = new StringBuilder("Content-Length (");
            sb.append(jContentLength);
            sb.append(") and stream length (");
            sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(") disagree");
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(rotationProvider1Source, th);
                throw th2;
            }
        }
    }

    @JvmStatic
    public static final ResponseBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final ResponseBody create(MediaType mediaType, long j, RotationProvider1 rotationProvider1) {
        return INSTANCE.create(mediaType, j, rotationProvider1);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final ResponseBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final ResponseBody create(MediaType mediaType, ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @JvmStatic
    public static final ResponseBody create(RotationProvider1 rotationProvider1, MediaType mediaType, long j) {
        return INSTANCE.create(rotationProvider1, mediaType, j);
    }

    @JvmStatic
    public static final ResponseBody create(ByteString byteString, MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @JvmStatic
    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
