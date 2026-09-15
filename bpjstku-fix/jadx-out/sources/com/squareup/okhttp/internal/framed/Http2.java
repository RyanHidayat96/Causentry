package com.squareup.okhttp.internal.framed;

import androidx.collection.SieveCacheKt;
import com.squareup.okhttp.Protocol;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.cancelPreviousRequest;
import defpackage.tryToComplete;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Http2 implements Variant {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    private static final Logger logger = Logger.getLogger(FrameLogger.class.getName());
    private static final ByteString CONNECTION_PREFACE = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    @Override // com.squareup.okhttp.internal.framed.Variant
    public final Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public final FrameReader newReader(RotationProvider1 rotationProvider1, boolean z) {
        return new Reader(rotationProvider1, 4096, z);
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public final FrameWriter newWriter(RotationProviderListener rotationProviderListener, boolean z) {
        return new Writer(rotationProviderListener, z);
    }

    static final class Reader implements FrameReader {
        private final boolean client;
        private final ContinuationSource continuation;
        final Hpack.Reader hpackReader;
        private final RotationProvider1 source;

        Reader(RotationProvider1 rotationProvider1, int i, boolean z) {
            this.source = rotationProvider1;
            this.client = z;
            ContinuationSource continuationSource = new ContinuationSource(rotationProvider1);
            this.continuation = continuationSource;
            this.hpackReader = new Hpack.Reader(i, continuationSource);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public final void readConnectionPreface() throws IOException {
            if (this.client) {
                return;
            }
            ByteString byteStringTuitionPaymentFragmentbindingInflater1 = this.source.TuitionPaymentFragmentbindingInflater1(Http2.CONNECTION_PREFACE.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(String.format("<< CONNECTION %s", byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
            }
            if (Http2.CONNECTION_PREFACE.equals(byteStringTuitionPaymentFragmentbindingInflater1)) {
                return;
            }
            String str = byteStringTuitionPaymentFragmentbindingInflater1.utf8;
            if (str == null) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                byteStringTuitionPaymentFragmentbindingInflater1.utf8 = str2;
                str = str2;
            }
            throw Http2.ioException("Expected a connection header but was %s", str);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public final boolean nextFrame(FrameReader.Handler handler) throws IOException {
            try {
                this.source.asInterface(9L);
                int medium = Http2.readMedium(this.source);
                if (medium < 0 || medium > 16384) {
                    throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(medium));
                }
                byte bCancel = (byte) (this.source.cancel() & UByte.MAX_VALUE);
                byte bCancel2 = (byte) (this.source.cancel() & UByte.MAX_VALUE);
                int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE;
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(FrameLogger.formatHeader(true, iINotificationSideChannelStubProxy, medium, bCancel, bCancel2));
                }
                switch (bCancel) {
                    case 0:
                        readData(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 1:
                        readHeaders(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 2:
                        readPriority(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 3:
                        readRstStream(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 4:
                        readSettings(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 5:
                        readPushPromise(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 6:
                        readPing(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 7:
                        readGoAway(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    case 8:
                        readWindowUpdate(handler, medium, bCancel2, iINotificationSideChannelStubProxy);
                        return true;
                    default:
                        this.source.g(medium);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        private void readHeaders(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z = (b & 1) != 0;
            short sCancel = (b & 8) != 0 ? (short) (this.source.cancel() & UByte.MAX_VALUE) : (short) 0;
            if ((b & 32) != 0) {
                readPriority(handler, i2);
                i -= 5;
            }
            handler.headers(false, z, i2, -1, readHeaderBlock(Http2.lengthWithoutPadding(i, b, sCancel), sCancel, b, i2), HeadersMode.HTTP_20_HEADERS);
        }

        private List<Header> readHeaderBlock(int i, short s, byte b, int i2) throws IOException {
            ContinuationSource continuationSource = this.continuation;
            continuationSource.left = i;
            continuationSource.length = i;
            this.continuation.padding = s;
            this.continuation.flags = b;
            this.continuation.streamId = i2;
            this.hpackReader.readHeaders();
            return this.hpackReader.getAndResetHeaderList();
        }

        private void readData(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            boolean z = (b & 1) != 0;
            if ((b & 32) != 0) {
                throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short sCancel = (b & 8) != 0 ? (short) (this.source.cancel() & UByte.MAX_VALUE) : (short) 0;
            handler.data(z, i2, this.source, Http2.lengthWithoutPadding(i, b, sCancel));
            this.source.g(sCancel);
        }

        private void readPriority(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            readPriority(handler, i2);
        }

        private void readPriority(FrameReader.Handler handler, int i) throws IOException {
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            handler.priority(i, iINotificationSideChannelStubProxy & Integer.MAX_VALUE, (this.source.cancel() & UByte.MAX_VALUE) + 1, (Integer.MIN_VALUE & iINotificationSideChannelStubProxy) != 0);
        }

        private void readRstStream(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            }
            if (i2 == 0) {
                throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(iINotificationSideChannelStubProxy);
            if (errorCodeFromHttp2 == null) {
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iINotificationSideChannelStubProxy));
            }
            handler.rstStream(i2, errorCodeFromHttp2);
        }

        private void readSettings(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b & 1) != 0) {
                if (i != 0) {
                    throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                handler.ackSettings();
                return;
            }
            if (i % 6 != 0) {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
            Settings settings = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short sMediaBrowserCompat = this.source.MediaBrowserCompat();
                int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
                switch (sMediaBrowserCompat) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (iINotificationSideChannelStubProxy != 0 && iINotificationSideChannelStubProxy != 1) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                        break;
                    case 3:
                        sMediaBrowserCompat = 4;
                        break;
                    case 4:
                        if (iINotificationSideChannelStubProxy < 0) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        sMediaBrowserCompat = 7;
                        break;
                        break;
                    case 5:
                        if (iINotificationSideChannelStubProxy < 16384 || iINotificationSideChannelStubProxy > 16777215) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iINotificationSideChannelStubProxy));
                        }
                        break;
                        break;
                    default:
                        throw Http2.ioException("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(sMediaBrowserCompat));
                }
                settings.set(sMediaBrowserCompat, 0, iINotificationSideChannelStubProxy);
            }
            handler.settings(false, settings);
            if (settings.getHeaderTableSize() >= 0) {
                this.hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
            }
        }

        private void readPushPromise(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short sCancel = (b & 8) != 0 ? (short) (this.source.cancel() & UByte.MAX_VALUE) : (short) 0;
            handler.pushPromise(i2, Integer.MAX_VALUE & this.source.INotificationSideChannelStubProxy(), readHeaderBlock(Http2.lengthWithoutPadding(i - 4, b, sCancel), sCancel, b, i2));
        }

        private void readPing(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 8) {
                throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            handler.ping((b & 1) != 0, this.source.INotificationSideChannelStubProxy(), this.source.INotificationSideChannelStubProxy());
        }

        private void readGoAway(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            }
            if (i2 != 0) {
                throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
            int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
            int i3 = i - 8;
            ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(iINotificationSideChannelStubProxy2);
            if (errorCodeFromHttp2 == null) {
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iINotificationSideChannelStubProxy2));
            }
            ByteString byteStringTuitionPaymentFragmentbindingInflater1 = ByteString.EMPTY;
            if (i3 > 0) {
                byteStringTuitionPaymentFragmentbindingInflater1 = this.source.TuitionPaymentFragmentbindingInflater1(i3);
            }
            handler.goAway(iINotificationSideChannelStubProxy, errorCodeFromHttp2, byteStringTuitionPaymentFragmentbindingInflater1);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
            long jINotificationSideChannelStubProxy = ((long) this.source.INotificationSideChannelStubProxy()) & SieveCacheKt.NodeLinkMask;
            if (jINotificationSideChannelStubProxy == 0) {
                throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(jINotificationSideChannelStubProxy));
            }
            handler.windowUpdate(i2, jINotificationSideChannelStubProxy);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.source.close();
        }
    }

    static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final RotationProviderListenerWrapper hpackBuffer;
        private final Hpack.Writer hpackWriter;
        private int maxFrameSize;
        private final RotationProviderListener sink;

        Writer(RotationProviderListener rotationProviderListener, boolean z) {
            this.sink = rotationProviderListener;
            this.client = z;
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            this.hpackBuffer = rotationProviderListenerWrapper;
            this.hpackWriter = new Hpack.Writer(rotationProviderListenerWrapper);
            this.maxFrameSize = 16384;
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
        public final void ackSettings(Settings settings) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
                frameHeader(0, 0, (byte) 4, (byte) 1);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void connectionPreface() throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (this.client) {
                    if (Http2.logger.isLoggable(Level.FINE)) {
                        Http2.logger.fine(String.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
                    }
                    this.sink.b(Http2.CONNECTION_PREFACE.asBinder());
                    this.sink.flush();
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void synStream(boolean z, boolean z2, int i, int i2, List<Header> list) throws IOException {
            synchronized (this) {
                try {
                    if (z2) {
                        throw new UnsupportedOperationException();
                    }
                    if (this.closed) {
                        throw new IOException("closed");
                    }
                    headers(z, i, list);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void synReply(boolean z, int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                headers(z, i, list);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void headers(int i, List<Header> list) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                headers(false, i, list);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void pushPromise(int i, int i2, List<Header> list) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                this.hpackWriter.writeHeaders(list);
                long j = this.hpackBuffer.size;
                int iMin = (int) Math.min(this.maxFrameSize - 4, j);
                long j2 = iMin;
                frameHeader(i, iMin + 4, Http2.TYPE_PUSH_PROMISE, j == j2 ? (byte) 4 : (byte) 0);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2 & Integer.MAX_VALUE);
                this.sink.write(this.hpackBuffer, j2);
                if (j > j2) {
                    writeContinuationFrames(i, j - j2);
                }
            }
        }

        final void headers(boolean z, int i, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long j = this.hpackBuffer.size;
            int iMin = (int) Math.min(this.maxFrameSize, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, iMin, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j2);
            if (j > j2) {
                writeContinuationFrames(i, j - j2);
            }
        }

        private void writeContinuationFrames(int i, long j) throws IOException {
            while (j > 0) {
                int iMin = (int) Math.min(this.maxFrameSize, j);
                long j2 = iMin;
                j -= j2;
                frameHeader(i, iMin, Http2.TYPE_CONTINUATION, j == 0 ? (byte) 4 : (byte) 0);
                this.sink.write(this.hpackBuffer, j2);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void rstStream(int i, ErrorCode errorCode) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.httpCode == -1) {
                    throw new IllegalArgumentException();
                }
                frameHeader(i, 4, Http2.TYPE_RST_STREAM, (byte) 0);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(errorCode.httpCode);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final int maxDataLength() {
            return this.maxFrameSize;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void data(boolean z, int i, RotationProviderListenerWrapper rotationProviderListenerWrapper, int i2) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                dataFrame(i, z ? (byte) 1 : (byte) 0, rotationProviderListenerWrapper, i2);
            }
        }

        final void dataFrame(int i, byte b, RotationProviderListenerWrapper rotationProviderListenerWrapper, int i2) throws IOException {
            frameHeader(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.sink.write(rotationProviderListenerWrapper, i2);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void settings(Settings settings) throws IOException {
            int i;
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                int i2 = 0;
                frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                while (i2 < 10) {
                    if (settings.isSet(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else {
                            i = i2 == 7 ? 4 : i2;
                        }
                        this.sink.a(i);
                        this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(settings.get(i2));
                    }
                    i2++;
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
                frameHeader(0, 8, Http2.TYPE_PING, z ? (byte) 1 : (byte) 0);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
                this.sink.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public final void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            synchronized (this) {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.httpCode == -1) {
                    throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
                }
                frameHeader(0, bArr.length + 8, Http2.TYPE_GOAWAY, (byte) 0);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.sink.b(bArr);
                }
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
                    throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
                }
                frameHeader(i, 4, (byte) 8, (byte) 0);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) j);
                this.sink.flush();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (this) {
                this.closed = true;
                this.sink.close();
            }
        }

        final void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(false, i, i2, b, b2));
            }
            int i3 = this.maxFrameSize;
            if (i2 > i3) {
                throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            if ((Integer.MIN_VALUE & i) == 0) {
                Http2.writeMedium(this.sink, i2);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b & UByte.MAX_VALUE);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b2 & UByte.MAX_VALUE);
                this.sink.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i & Integer.MAX_VALUE);
                return;
            }
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    static final class ContinuationSource implements tryToComplete {
        byte flags;
        int left;
        int length;
        short padding;
        private final RotationProvider1 source;
        int streamId;

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        public ContinuationSource(RotationProvider1 rotationProvider1) {
            this.source = rotationProvider1;
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.g(this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long j2 = this.source.read(rotationProviderListenerWrapper, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.left = (int) (((long) this.left) - j2);
                    return j2;
                }
            }
        }

        @Override // defpackage.tryToComplete
        public final cancelPreviousRequest timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = Http2.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            byte bCancel = (byte) (this.source.cancel() & UByte.MAX_VALUE);
            this.flags = (byte) (this.source.cancel() & UByte.MAX_VALUE);
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(true, this.streamId, this.length, bCancel, this.flags));
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE;
            this.streamId = iINotificationSideChannelStubProxy;
            if (bCancel != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(bCancel));
            }
            if (iINotificationSideChannelStubProxy != i) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lengthWithoutPadding(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    static final class FrameLogger {
        private static final String[] TYPES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        private static final String[] FLAGS = new String[64];
        private static final String[] BINARY = new String[256];

        FrameLogger() {
        }

        static String formatHeader(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = TYPES;
            return String.format("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b < strArr.length ? strArr[b] : String.format("0x%02x", Byte.valueOf(b)), formatFlags(b, b2));
        }

        static String formatFlags(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : BINARY[b2];
                }
                if (b != 7 && b != 8) {
                    String[] strArr = FLAGS;
                    String str = b2 < strArr.length ? strArr[b2] : BINARY[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return BINARY[b2];
        }

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = BINARY;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = FLAGS;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i3 = iArr[0];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr2[i3]);
            sb.append("|PADDED");
            strArr2[i3 | 8] = sb.toString();
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = FLAGS;
                int i7 = i6 | i5;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr3[i6]);
                sb2.append('|');
                sb2.append(strArr3[i5]);
                strArr3[i7] = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strArr3[i6]);
                sb3.append('|');
                sb3.append(strArr3[i5]);
                sb3.append("|PADDED");
                strArr3[i7 | 8] = sb3.toString();
            }
            while (true) {
                String[] strArr4 = FLAGS;
                if (i >= strArr4.length) {
                    return;
                }
                if (strArr4[i] == null) {
                    strArr4[i] = BINARY[i];
                }
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readMedium(RotationProvider1 rotationProvider1) throws IOException {
        return (rotationProvider1.cancel() & UByte.MAX_VALUE) | ((rotationProvider1.cancel() & UByte.MAX_VALUE) << 16) | ((rotationProvider1.cancel() & UByte.MAX_VALUE) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMedium(RotationProviderListener rotationProviderListener, int i) throws IOException {
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((i >>> 16) & 255);
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((i >>> 8) & 255);
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i & 255);
    }
}
