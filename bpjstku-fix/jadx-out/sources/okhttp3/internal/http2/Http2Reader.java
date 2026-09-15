package okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import com.google.firebase.messaging.Constants;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.cancelPreviousRequest;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003,-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J5\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0014J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J/\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0014J/\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0014R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "LRotationProvider1;", "p0", "", "p1", "<init>", "(LRotationProvider1;Z)V", "", "close", "()V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "nextFrame", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", "readConnectionPreface", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "", "p2", "p3", "readData", "(Lokhttp3/internal/http2/Http2Reader$Handler;III)V", "readGoAway", "", "Lokhttp3/internal/http2/Header;", "readHeaderBlock", "(IIII)Ljava/util/List;", "readHeaders", "readPing", "readPriority", "(Lokhttp3/internal/http2/Http2Reader$Handler;I)V", "readPushPromise", "readRstStream", "readSettings", "readWindowUpdate", "client", "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "source", "LRotationProvider1;", "Companion", "ContinuationSource", "Handler"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final RotationProvider1 source;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J?\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0011H&¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0015H&¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\rH&¢\u0006\u0004\b'\u0010("}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "ackSettings", "()V", "", "p0", "", "p1", "Lokio/ByteString;", "p2", "p3", "p4", "", "p5", "alternateService", "(ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;IJ)V", "", "LRotationProvider1;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(ZILRotationProvider1;I)V", "Lokhttp3/internal/http2/ErrorCode;", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "Lokhttp3/internal/http2/Header;", "headers", "(ZIILjava/util/List;)V", "ping", "(ZII)V", "priority", "(IIIZ)V", "pushPromise", "(IILjava/util/List;)V", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "windowUpdate", "(IJ)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int p0, String p1, ByteString p2, String p3, int p4, long p5);

        void data(boolean p0, int p1, RotationProvider1 p2, int p3) throws IOException;

        void goAway(int p0, ErrorCode p1, ByteString p2);

        void headers(boolean p0, int p1, int p2, List<Header> p3);

        void ping(boolean p0, int p1, int p2);

        void priority(int p0, int p1, int p2, boolean p3);

        void pushPromise(int p0, int p1, List<Header> p2) throws IOException;

        void rstStream(int p0, ErrorCode p1);

        void settings(boolean p0, Settings p1);

        void windowUpdate(int p0, long p1);
    }

    public Http2Reader(RotationProvider1 rotationProvider1, boolean z) {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        this.source = rotationProvider1;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(rotationProvider1);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public final void readConnectionPreface(Handler p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.client) {
            if (!nextFrame(true, p0)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteStringTuitionPaymentFragmentbindingInflater1 = this.source.TuitionPaymentFragmentbindingInflater1(Http2.CONNECTION_PREFACE.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            StringBuilder sb = new StringBuilder("<< CONNECTION ");
            sb.append(byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            logger2.fine(Util.format(sb.toString(), new Object[0]));
        }
        if (Intrinsics.areEqual(Http2.CONNECTION_PREFACE, byteStringTuitionPaymentFragmentbindingInflater1)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Expected a connection header but was ");
        String str = byteStringTuitionPaymentFragmentbindingInflater1.utf8;
        if (str == null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteStringTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
            byteStringTuitionPaymentFragmentbindingInflater1.utf8 = str2;
            str = str2;
        }
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    public final boolean nextFrame(boolean p0, Handler p1) throws IOException {
        Intrinsics.checkNotNullParameter(p1, "");
        try {
            this.source.asInterface(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: ".concat(String.valueOf(medium)));
            }
            int iAnd = Util.and(this.source.cancel(), 255);
            int iAnd2 = Util.and(this.source.cancel(), 255);
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, iINotificationSideChannelStubProxy, medium, iAnd, iAnd2));
            }
            if (p0 && iAnd != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                sb.append(Http2.INSTANCE.formattedType$okhttp(iAnd));
                throw new IOException(sb.toString());
            }
            switch (iAnd) {
                case 0:
                    readData(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 1:
                    readHeaders(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 2:
                    readPriority(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 3:
                    readRstStream(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 4:
                    readSettings(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 5:
                    readPushPromise(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 6:
                    readPing(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 7:
                    readGoAway(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                case 8:
                    readWindowUpdate(p1, medium, iAnd2, iINotificationSideChannelStubProxy);
                    return true;
                default:
                    this.source.g(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    private final void readHeaders(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (p2 & 1) != 0;
        int iAnd = (p2 & 8) != 0 ? Util.and(this.source.cancel(), 255) : 0;
        if ((p2 & 32) != 0) {
            readPriority(p0, p3);
            p1 -= 5;
        }
        p0.headers(z, p3, -1, readHeaderBlock(INSTANCE.lengthWithoutPadding(p1, p2, iAnd), iAnd, p2, p3));
    }

    private final List<Header> readHeaderBlock(int p0, int p1, int p2, int p3) throws IOException {
        this.continuation.setLeft(p0);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(p1);
        this.continuation.setFlags(p2);
        this.continuation.setStreamId(p3);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readData(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (p2 & 1) != 0;
        if ((p2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (p2 & 8) != 0 ? Util.and(this.source.cancel(), 255) : 0;
        p0.data(z, p3, this.source, INSTANCE.lengthWithoutPadding(p1, p2, iAnd));
        this.source.g(iAnd);
    }

    private final void readPriority(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p1 == 5) {
            if (p3 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(p0, p3);
        } else {
            StringBuilder sb = new StringBuilder("TYPE_PRIORITY length: ");
            sb.append(p1);
            sb.append(" != 5");
            throw new IOException(sb.toString());
        }
    }

    private final void readPriority(Handler p0, int p1) throws IOException {
        int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
        p0.priority(p1, iINotificationSideChannelStubProxy & Integer.MAX_VALUE, Util.and(this.source.cancel(), 255) + 1, (Integer.MIN_VALUE & iINotificationSideChannelStubProxy) != 0);
    }

    private final void readRstStream(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p1 != 4) {
            StringBuilder sb = new StringBuilder("TYPE_RST_STREAM length: ");
            sb.append(p1);
            sb.append(" != 4");
            throw new IOException(sb.toString());
        }
        if (p3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
        ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(iINotificationSideChannelStubProxy);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_RST_STREAM unexpected error code: ".concat(String.valueOf(iINotificationSideChannelStubProxy)));
        }
        p0.rstStream(p3, errorCodeFromHttp2);
    }

    private final void readSettings(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((p2 & 1) != 0) {
            if (p1 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            p0.ackSettings();
            return;
        }
        if (p1 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: ".concat(String.valueOf(p1)));
        }
        Settings settings = new Settings();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, p1), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iAnd = Util.and(this.source.MediaBrowserCompat(), 65535);
                int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (iINotificationSideChannelStubProxy < 16384 || iINotificationSideChannelStubProxy > 16777215)) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ".concat(String.valueOf(iINotificationSideChannelStubProxy)));
                        }
                    } else {
                        if (iINotificationSideChannelStubProxy < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (iINotificationSideChannelStubProxy != 0 && iINotificationSideChannelStubProxy != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, iINotificationSideChannelStubProxy);
                if (first != last) {
                    first += step;
                }
            }
        }
        p0.settings(false, settings);
    }

    private final void readPushPromise(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (p2 & 8) != 0 ? Util.and(this.source.cancel(), 255) : 0;
        p0.pushPromise(p3, Integer.MAX_VALUE & this.source.INotificationSideChannelStubProxy(), readHeaderBlock(INSTANCE.lengthWithoutPadding(p1 - 4, p2, iAnd), iAnd, p2, p3));
    }

    private final void readPing(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p1 != 8) {
            throw new IOException("TYPE_PING length != 8: ".concat(String.valueOf(p1)));
        }
        if (p3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        p0.ping((p2 & 1) != 0, this.source.INotificationSideChannelStubProxy(), this.source.INotificationSideChannelStubProxy());
    }

    private final void readGoAway(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p1 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: ".concat(String.valueOf(p1)));
        }
        if (p3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy();
        int iINotificationSideChannelStubProxy2 = this.source.INotificationSideChannelStubProxy();
        int i = p1 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(iINotificationSideChannelStubProxy2);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: ".concat(String.valueOf(iINotificationSideChannelStubProxy2)));
        }
        ByteString byteStringTuitionPaymentFragmentbindingInflater1 = ByteString.EMPTY;
        if (i > 0) {
            byteStringTuitionPaymentFragmentbindingInflater1 = this.source.TuitionPaymentFragmentbindingInflater1(i);
        }
        p0.goAway(iINotificationSideChannelStubProxy, errorCodeFromHttp2, byteStringTuitionPaymentFragmentbindingInflater1);
    }

    private final void readWindowUpdate(Handler p0, int p1, int p2, int p3) throws IOException {
        if (p1 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: ".concat(String.valueOf(p1)));
        }
        long jAnd = Util.and(this.source.INotificationSideChannelStubProxy(), SieveCacheKt.NodeLinkMask);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        p0.windowUpdate(p3, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.source.close();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "LtryToComplete;", "LRotationProvider1;", "p0", "<init>", "(LRotationProvider1;)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "readContinuationHeader", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "", "flags", "I", "getFlags", "()I", "setFlags", "(I)V", "left", "getLeft", "setLeft", "length", "getLength", "setLength", "padding", "getPadding", "setPadding", "source", "LRotationProvider1;", "streamId", "getStreamId", "setStreamId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContinuationSource implements tryToComplete {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final RotationProvider1 source;
        private int streamId;

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        public ContinuationSource(RotationProvider1 rotationProvider1) {
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            this.source = rotationProvider1;
        }

        public final int getLength() {
            return this.length;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public final int getLeft() {
            return this.left;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.g(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long j = this.source.read(p0, Math.min(p1, i));
                    if (j == -1) {
                        return -1L;
                    }
                    this.left -= (int) j;
                    return j;
                }
            }
        }

        @Override // defpackage.tryToComplete
        /* JADX INFO: renamed from: timeout */
        public final cancelPreviousRequest getTimeout() {
            return this.source.getTimeout();
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.cancel(), 255);
            this.flags = Util.and(this.source.cancel(), 255);
            if (Http2Reader.INSTANCE.getLogger().isLoggable(Level.FINE)) {
                Http2Reader.INSTANCE.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int iINotificationSideChannelStubProxy = this.source.INotificationSideChannelStubProxy() & Integer.MAX_VALUE;
            this.streamId = iINotificationSideChannelStubProxy;
            if (iAnd == 9) {
                if (iINotificationSideChannelStubProxy != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(iAnd);
                sb.append(" != TYPE_CONTINUATION");
                throw new IOException(sb.toString());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "", "p0", "p1", "p2", "lengthWithoutPadding", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int p0, int p1, int p2) throws IOException {
            if ((p1 & 8) != 0) {
                p0--;
            }
            if (p2 <= p0) {
                return p0 - p2;
            }
            StringBuilder sb = new StringBuilder("PROTOCOL_ERROR padding ");
            sb.append(p2);
            sb.append(" > remaining length ");
            sb.append(p0);
            throw new IOException(sb.toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger2, "");
        logger = logger2;
    }
}
