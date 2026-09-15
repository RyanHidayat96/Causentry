package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementation;
import defpackage.cancelPreviousRequest;
import defpackage.lambdagetPreviewBitmap1;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010 \u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lokhttp3/ResponseBody;", "p0", "<init>", "(Lokhttp3/ResponseBody;)V", "LRotationProvider1;", "", "p1", "(LRotationProvider1;Ljava/lang/String;)V", "", "close", "()V", "", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "", "closed", "Z", "Lokio/ByteString;", "crlfDashDashBoundary", "Lokio/ByteString;", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "dashDashBoundary", "noMoreParts", "", "partCount", "I", "source", "LRotationProvider1;", "Companion", "Part", "PartSource"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final lambdagetPreviewBitmap1 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final ByteString crlfDashDashBoundary;
    private PartSource currentPart;
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final RotationProvider1 source;

    public MultipartReader(RotationProvider1 rotationProvider1, String str) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.source = rotationProvider1;
        this.boundary = str;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter("--", "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB = rotationProviderListenerWrapper.b("--", 0, 2);
        Intrinsics.checkNotNullParameter(str, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB2 = rotationProviderListenerWrapperB.b(str, 0, str.length());
        this.dashDashBoundary = rotationProviderListenerWrapperB2.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapperB2.size);
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
        Intrinsics.checkNotNullParameter("\r\n--", "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB3 = rotationProviderListenerWrapper2.b("\r\n--", 0, 4);
        Intrinsics.checkNotNullParameter(str, "");
        RotationProviderListenerWrapper rotationProviderListenerWrapperB4 = rotationProviderListenerWrapperB3.b(str, 0, str.length());
        this.crlfDashDashBoundary = rotationProviderListenerWrapperB4.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapperB4.size);
    }

    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws IOException {
        String strParameter;
        Intrinsics.checkNotNullParameter(responseBody, "");
        RotationProvider1 source = responseBody.getSource();
        MediaType mediaType = responseBody.get$contentType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(source, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0L, this.dashDashBoundary)) {
            this.source.g(this.dashDashBoundary.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.g(jCurrentPartBytesRemaining);
            }
            this.source.g(this.crlfDashDashBoundary.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        boolean z = false;
        while (true) {
            int iTuitionPaymentFragmentbindingInflater1 = this.source.TuitionPaymentFragmentbindingInflater1(afterBoundaryOptions);
            if (iTuitionPaymentFragmentbindingInflater1 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iTuitionPaymentFragmentbindingInflater1 == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(partSource));
            }
            if (iTuitionPaymentFragmentbindingInflater1 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iTuitionPaymentFragmentbindingInflater1 == 2 || iTuitionPaymentFragmentbindingInflater1 == 3) {
                z = true;
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "LtryToComplete;", "<init>", "(Lokhttp3/MultipartReader;)V", "", "close", "()V", "LRotationProviderListenerWrapper;", "p0", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "LcancelPreviousRequest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class PartSource implements tryToComplete {
        private final cancelPreviousRequest timeout = new cancelPreviousRequest();

        public PartSource() {
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 >= 0) {
                if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                    cancelPreviousRequest cancelpreviousrequestTimeout = MultipartReader.this.source.getTimeout();
                    cancelPreviousRequest cancelpreviousrequest = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = cancelpreviousrequestTimeout.getTimeoutNanos();
                    cancelPreviousRequest.Companion companion = cancelPreviousRequest.INSTANCE;
                    cancelpreviousrequestTimeout.timeout(cancelPreviousRequest.Companion.b(cancelpreviousrequest.getTimeoutNanos(), cancelpreviousrequestTimeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
                    if (cancelpreviousrequestTimeout.getHasDeadline()) {
                        long jDeadlineNanoTime = cancelpreviousrequestTimeout.deadlineNanoTime();
                        if (cancelpreviousrequest.getHasDeadline()) {
                            cancelpreviousrequestTimeout.deadlineNanoTime(Math.min(cancelpreviousrequestTimeout.deadlineNanoTime(), cancelpreviousrequest.deadlineNanoTime()));
                        }
                        try {
                            long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(p1);
                            return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(p0, jCurrentPartBytesRemaining);
                        } finally {
                            cancelpreviousrequestTimeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (cancelpreviousrequest.getHasDeadline()) {
                                cancelpreviousrequestTimeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                    if (cancelpreviousrequest.getHasDeadline()) {
                        cancelpreviousrequestTimeout.deadlineNanoTime(cancelpreviousrequest.deadlineNanoTime());
                    }
                    try {
                        long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(p1);
                        return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(p0, jCurrentPartBytesRemaining2);
                    } finally {
                        cancelpreviousrequestTimeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (cancelpreviousrequest.getHasDeadline()) {
                            cancelpreviousrequestTimeout.clearDeadline();
                        }
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
        }

        @Override // defpackage.tryToComplete
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public final cancelPreviousRequest getTimeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long p0) throws IOException {
        this.source.asInterface(this.crlfDashDashBoundary.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        RotationProviderListenerWrapper rotationProviderListenerWrapperAsInterface = this.source.asInterface();
        ByteString byteString = this.crlfDashDashBoundary;
        Intrinsics.checkNotNullParameter(byteString, "");
        long jTuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapperAsInterface.TuitionPaymentFragmentbindingInflater1(byteString, 0L);
        if (jTuitionPaymentFragmentbindingInflater1 == -1) {
            return Math.min(p0, (this.source.asInterface().size - ((long) this.crlfDashDashBoundary.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) + 1);
        }
        return Math.min(p0, jTuitionPaymentFragmentbindingInflater1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "p0", "LRotationProvider1;", "p1", "<init>", "(Lokhttp3/Headers;LRotationProvider1;)V", "", "close", "()V", "body", "LRotationProvider1;", "()LRotationProvider1;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable {
        private final RotationProvider1 body;
        private final Headers headers;

        public Part(Headers headers, RotationProvider1 rotationProvider1) {
            Intrinsics.checkNotNullParameter(headers, "");
            Intrinsics.checkNotNullParameter(rotationProvider1, "");
            this.headers = headers;
            this.body = rotationProvider1;
        }

        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: body, reason: from getter */
        public final RotationProvider1 getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.body.close();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "LlambdagetPreviewBitmap1;", "afterBoundaryOptions", "LlambdagetPreviewBitmap1;", "getAfterBoundaryOptions", "()LlambdagetPreviewBitmap1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final lambdagetPreviewBitmap1 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        lambdagetPreviewBitmap1.Companion companion = lambdagetPreviewBitmap1.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\r\n");
        ByteString.Companion companion3 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("--");
        ByteString.Companion companion4 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(" ");
        ByteString.Companion companion5 = ByteString.INSTANCE;
        afterBoundaryOptions = companion.b(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault1, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\t"));
    }
}
