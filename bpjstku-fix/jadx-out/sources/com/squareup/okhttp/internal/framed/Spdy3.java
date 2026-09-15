package com.squareup.okhttp.internal.framed;

import androidx.collection.SieveCacheKt;
import androidx.core.view.ViewCompat;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.Util;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.onOrientationChanged;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Spdy3 implements Variant {
    static final byte[] DICTIONARY;
    static final int FLAG_FIN = 1;
    static final int FLAG_UNIDIRECTIONAL = 2;
    static final int TYPE_DATA = 0;
    static final int TYPE_GOAWAY = 7;
    static final int TYPE_HEADERS = 8;
    static final int TYPE_PING = 6;
    static final int TYPE_RST_STREAM = 3;
    static final int TYPE_SETTINGS = 4;
    static final int TYPE_SYN_REPLY = 2;
    static final int TYPE_SYN_STREAM = 1;
    static final int TYPE_WINDOW_UPDATE = 9;
    static final int VERSION = 3;

    @Override // com.squareup.okhttp.internal.framed.Variant
    public final Protocol getProtocol() {
        return Protocol.SPDY_3;
    }

    static {
        try {
            DICTIONARY = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public final FrameReader newReader(RotationProvider1 rotationProvider1, boolean z) {
        return new Reader(rotationProvider1, z);
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public final FrameWriter newWriter(RotationProviderListener rotationProviderListener, boolean z) {
        return new Writer(rotationProviderListener, z);
    }

    static final class Reader implements FrameReader {
        private final boolean client;
        private final NameValueBlockReader headerBlockReader;
        private final RotationProvider1 source;

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public final void readConnectionPreface() {
        }

        Reader(RotationProvider1 rotationProvider1, boolean z) {
            this.source = rotationProvider1;
            this.headerBlockReader = new NameValueBlockReader(rotationProvider1);
            this.client = z;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public final boolean nextFrame(FrameReader.Handler handler) throws IOException {
            try {
                int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
                int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
                boolean z = (Integer.MIN_VALUE & iINotificationSideChannelStubProxy) != 0;
                int i = ((-16777216) & iINotificationSideChannelStubProxy2) >>> 24;
                int i2 = iINotificationSideChannelStubProxy2 & ViewCompat.MEASURED_SIZE_MASK;
                if (!z) {
                    handler.data((i & 1) != 0, iINotificationSideChannelStubProxy & Integer.MAX_VALUE, this.source, i2);
                    return true;
                }
                int i3 = (2147418112 & iINotificationSideChannelStubProxy) >>> 16;
                if (i3 != 3) {
                    throw new ProtocolException("version != 3: ".concat(String.valueOf(i3)));
                }
                switch (65535 & iINotificationSideChannelStubProxy) {
                    case 1:
                        readSynStream(handler, i, i2);
                        return true;
                    case 2:
                        readSynReply(handler, i, i2);
                        return true;
                    case 3:
                        readRstStream(handler, i, i2);
                        return true;
                    case 4:
                        readSettings(handler, i, i2);
                        return true;
                    case 5:
                    default:
                        this.source.g(i2);
                        return true;
                    case 6:
                        readPing(handler, i, i2);
                        return true;
                    case 7:
                        readGoAway(handler, i, i2);
                        return true;
                    case 8:
                        readHeaders(handler, i, i2);
                        return true;
                    case 9:
                        readWindowUpdate(handler, i, i2);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        private void readSynStream(FrameReader.Handler handler, int i, int i2) throws IOException {
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
            this.source.MediaBrowserCompat();
            handler.headers((i & 2) != 0, (i & 1) != 0, iINotificationSideChannelStubProxy & Integer.MAX_VALUE, iINotificationSideChannelStubProxy2 & Integer.MAX_VALUE, this.headerBlockReader.readNameValueBlock(i2 - 10), HeadersMode.SPDY_SYN_STREAM);
        }

        private void readSynReply(FrameReader.Handler handler, int i, int i2) throws IOException {
            handler.headers(false, (i & 1) != 0, this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE, -1, this.headerBlockReader.readNameValueBlock(i2 - 4), HeadersMode.SPDY_REPLY);
        }

        private void readRstStream(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 != 8) {
                throw ioException("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
            ErrorCode errorCodeFromSpdy3Rst = ErrorCode.fromSpdy3Rst(iINotificationSideChannelStubProxy2);
            if (errorCodeFromSpdy3Rst == null) {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iINotificationSideChannelStubProxy2));
            }
            handler.rstStream(iINotificationSideChannelStubProxy & Integer.MAX_VALUE, errorCodeFromSpdy3Rst);
        }

        private void readHeaders(FrameReader.Handler handler, int i, int i2) throws IOException {
            handler.headers(false, false, this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE, -1, this.headerBlockReader.readNameValueBlock(i2 - 4), HeadersMode.SPDY_HEADERS);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 != 8) {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            long jINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE;
            if (jINotificationSideChannelStubProxy == 0) {
                throw ioException("windowSizeIncrement was 0", Long.valueOf(jINotificationSideChannelStubProxy));
            }
            handler.windowUpdate(iINotificationSideChannelStubProxy & Integer.MAX_VALUE, jINotificationSideChannelStubProxy);
        }

        private void readPing(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 != 4) {
                throw ioException("TYPE_PING length: %d != 4", Integer.valueOf(i2));
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            handler.ping(this.client == ((iINotificationSideChannelStubProxy & 1) == 1), iINotificationSideChannelStubProxy, 0);
        }

        private void readGoAway(FrameReader.Handler handler, int i, int i2) throws IOException {
            if (i2 != 8) {
                throw ioException("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
            ErrorCode errorCodeFromSpdyGoAway = ErrorCode.fromSpdyGoAway(iINotificationSideChannelStubProxy2);
            if (errorCodeFromSpdyGoAway == null) {
                throw ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iINotificationSideChannelStubProxy2));
            }
            handler.goAway(iINotificationSideChannelStubProxy & Integer.MAX_VALUE, errorCodeFromSpdyGoAway, ByteString.EMPTY);
        }

        private void readSettings(FrameReader.Handler handler, int i, int i2) throws IOException {
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            if (i2 != (iINotificationSideChannelStubProxy * 8) + 4) {
                throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(iINotificationSideChannelStubProxy));
            }
            Settings settings = new Settings();
            for (int i3 = 0; i3 < iINotificationSideChannelStubProxy; i3++) {
                int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
                settings.set(16777215 & iINotificationSideChannelStubProxy2, (iINotificationSideChannelStubProxy2 & ViewCompat.MEASURED_STATE_MASK) >>> 24, this.source.INotificationSideChannelStubProxy());
            }
            handler.settings((i & 1) != 0, settings);
        }

        private static IOException ioException(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.headerBlockReader.close();
        }
    }

    static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final RotationProviderListenerWrapper headerBlockBuffer;
        private final RotationProviderListener headerBlockOut;
        private final RotationProviderListener sink;

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void ackSettings(Settings settings) {
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final int maxDataLength() {
            return 16383;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
        }

        Writer(RotationProviderListener rotationProviderListener, boolean z) {
            this.sink = rotationProviderListener;
            this.client = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(Spdy3.DICTIONARY);
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            this.headerBlockBuffer = rotationProviderListenerWrapper;
            this.headerBlockOut = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(new onOrientationChanged((SurfaceViewImplementationApi24Impl) rotationProviderListenerWrapper, deflater));
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void connectionPreface() {
            synchronized (this) {
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void flush() throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                writeNameValueBlockToBuffer(list);
                int i3 = (int) (this.headerBlockBuffer.size + 10);
                int i4 = z2 ? 2 : 0;
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287039);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((((z ? 1 : 0) | i4) & 255) << 24) | (16777215 & i3));
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i & Integer.MAX_VALUE);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.MAX_VALUE & i2);
                this.sink.a(0);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.headerBlockBuffer);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void synReply(boolean z, int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                writeNameValueBlockToBuffer(list);
                int i2 = (int) (this.headerBlockBuffer.size + 4);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287038);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2((((z ? 1 : 0) & 255) << 24) | (i2 & ViewCompat.MEASURED_SIZE_MASK));
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i & Integer.MAX_VALUE);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.headerBlockBuffer);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void headers(int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                writeNameValueBlockToBuffer(list);
                int i2 = (int) (this.headerBlockBuffer.size + 4);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287032);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2 & ViewCompat.MEASURED_SIZE_MASK);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i & Integer.MAX_VALUE);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.headerBlockBuffer);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void rstStream(int i, ErrorCode errorCode) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.spdyRstCode == -1) {
                    throw new IllegalArgumentException();
                }
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287037);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i & Integer.MAX_VALUE);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(errorCode.spdyRstCode);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void data(boolean z, int i, RotationProviderListenerWrapper rotationProviderListenerWrapper, int i2) throws IOException {
            synchronized (this) {
                sendDataFrame(i, z ? 1 : 0, rotationProviderListenerWrapper, i2);
            }
        }

        final void sendDataFrame(int i, int i2, RotationProviderListenerWrapper rotationProviderListenerWrapper, int i3) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            long j = i3;
            if (j > 16777215) {
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: ".concat(String.valueOf(i3)));
            }
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i & Integer.MAX_VALUE);
            this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((i2 & 255) << 24) | (16777215 & i3));
            if (i3 > 0) {
                this.sink.write(rotationProviderListenerWrapper, j);
            }
        }

        private void writeNameValueBlockToBuffer(List<Header> list) throws IOException {
            this.headerBlockOut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ByteString byteString = list.get(i).name;
                this.headerBlockOut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                this.headerBlockOut.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteString);
                ByteString byteString2 = list.get(i).value;
                this.headerBlockOut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                this.headerBlockOut.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteString2);
            }
            this.headerBlockOut.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void settings(Settings settings) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                int size = settings.size();
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287036);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((size * 8) + 4) & ViewCompat.MEASURED_SIZE_MASK);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(size);
                for (int i = 0; i <= 10; i++) {
                    if (settings.isSet(i)) {
                        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((settings.flags(i) & 255) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK));
                        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(settings.get(i));
                    }
                }
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void ping(boolean z, int i, int i2) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (z != (this.client != ((i & 1) == 1))) {
                    throw new IllegalArgumentException("payload != reply");
                }
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287034);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.spdyGoAwayCode == -1) {
                    throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
                }
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287033);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(errorCode.spdyGoAwayCode);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void windowUpdate(int i, long j) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > SieveCacheKt.NodeLinkMask) {
                    StringBuilder sb = new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ");
                    sb.append(j);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-2147287031);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) j);
                this.sink.flush();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (this) {
                this.closed = true;
                Util.closeAll(this.sink, this.headerBlockOut);
            }
        }
    }
}
