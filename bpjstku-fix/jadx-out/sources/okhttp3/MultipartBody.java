package okhttp3;

import androidx.browser.trusted.sharing.ShareTarget;
import com.android.volley.toolbox.HttpHeaderParser;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okhttp3.internal.Util;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 +2\u00020\u0001:\u0003,+-B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0012J!\u0010\u001d\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010\u0017R\u0011\u0010)\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b*\u0010\u0012"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/ByteString;", "p0", "Lokhttp3/MediaType;", "p1", "", "Lokhttp3/MultipartBody$Part;", "p2", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "", "-deprecated_boundary", "()Ljava/lang/String;", "", "contentLength", "()J", "contentType", "()Lokhttp3/MediaType;", "", "part", "(I)Lokhttp3/MultipartBody$Part;", "-deprecated_parts", "()Ljava/util/List;", "-deprecated_size", "()I", "-deprecated_type", "LRotationProviderListener;", "", "writeOrCountBytes", "(LRotationProviderListener;Z)J", "", "writeTo", "(LRotationProviderListener;)V", "boundary", "boundaryByteString", "Lokio/ByteString;", "J", "Lokhttp3/MediaType;", "parts", "Ljava/util/List;", "size", "type", "Companion", "Builder", "Part"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartBody extends RequestBody {
    private final ByteString boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final MediaType MIXED = MediaType.INSTANCE.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.INSTANCE.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.INSTANCE.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.INSTANCE.get("multipart/parallel");
    public static final MediaType FORM = MediaType.INSTANCE.get(ShareTarget.ENCODING_TYPE_MULTIPART);
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    public final MediaType type() {
        return this.type;
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List<Part> list) {
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.boundaryByteString = byteString;
        this.type = mediaType;
        this.parts = list;
        MediaType.Companion companion = MediaType.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(mediaType);
        sb.append("; boundary=");
        sb.append(boundary());
        this.contentType = companion.get(sb.toString());
        this.contentLength = -1L;
    }

    public final String boundary() {
        ByteString byteString = this.boundaryByteString;
        String str = byteString.utf8;
        if (str != null) {
            return str;
        }
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
        byteString.utf8 = str2;
        return str2;
    }

    public final int size() {
        return this.parts.size();
    }

    public final Part part(int p0) {
        return this.parts.get(p0);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType get$contentType() {
        return this.contentType;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final MediaType getType() {
        return this.type;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "boundary", imports = {}))
    /* JADX INFO: renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m9594deprecated_boundary() {
        return boundary();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m9596deprecated_size() {
        return size();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "parts", imports = {}))
    /* JADX INFO: renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m9595deprecated_parts() {
        return this.parts;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(RotationProviderListener p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        writeOrCountBytes(p0, false);
    }

    private final long writeOrCountBytes(RotationProviderListener p0, boolean p1) throws IOException {
        RotationProviderListenerWrapper rotationProviderListenerWrapper;
        RotationProviderListenerWrapper rotationProviderListenerWrapper2;
        if (p1) {
            rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
            rotationProviderListenerWrapper = rotationProviderListenerWrapper2;
        } else {
            rotationProviderListenerWrapper = p0;
            rotationProviderListenerWrapper2 = null;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            Intrinsics.checkNotNull(rotationProviderListenerWrapper);
            rotationProviderListenerWrapper.b(DASHDASH);
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.boundaryByteString);
            rotationProviderListenerWrapper.b(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.name(i2)).b(COLONSPACE).TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.value(i2)).b(CRLF);
                }
            }
            MediaType contentType = requestBodyBody.get$contentType();
            if (contentType != null) {
                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Content-Type: ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(contentType.toString()).b(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Content-Length: ").a(jContentLength).b(CRLF);
            } else if (p1) {
                Intrinsics.checkNotNull(rotationProviderListenerWrapper2);
                rotationProviderListenerWrapper2.g(rotationProviderListenerWrapper2.size);
                return -1L;
            }
            byte[] bArr = CRLF;
            rotationProviderListenerWrapper.b(bArr);
            if (p1) {
                j += jContentLength;
            } else {
                requestBodyBody.writeTo(rotationProviderListenerWrapper);
            }
            rotationProviderListenerWrapper.b(bArr);
        }
        Intrinsics.checkNotNull(rotationProviderListenerWrapper);
        byte[] bArr2 = DASHDASH;
        rotationProviderListenerWrapper.b(bArr2);
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.boundaryByteString);
        rotationProviderListenerWrapper.b(bArr2);
        rotationProviderListenerWrapper.b(CRLF);
        if (!p1) {
            return j;
        }
        Intrinsics.checkNotNull(rotationProviderListenerWrapper2);
        long j2 = j + rotationProviderListenerWrapper2.size;
        rotationProviderListenerWrapper2.g(rotationProviderListenerWrapper2.size);
        return j2;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Lokhttp3/Headers;", "p0", "Lokhttp3/RequestBody;", "p1", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "-deprecated_body", "()Lokhttp3/RequestBody;", "-deprecated_headers", "()Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "headers", "Lokhttp3/Headers;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public final Headers headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
        /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u000bJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u0010"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "p0", "Lokhttp3/RequestBody;", "p1", "Lokhttp3/MultipartBody$Part;", "create", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "", "createFormData", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;", "p2", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final Part create(RequestBody p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return create(null, p0);
            }

            @JvmStatic
            public final Part create(Headers p0, RequestBody p1) {
                Intrinsics.checkNotNullParameter(p1, "");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((p0 != null ? p0.get(HttpHeaderParser.HEADER_CONTENT_TYPE) : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((p0 != null ? p0.get("Content-Length") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                return new Part(p0, p1, defaultConstructorMarker);
            }

            @JvmStatic
            public final Part createFormData(String p0, String p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                return createFormData(p0, null, RequestBody.Companion.create$default(RequestBody.INSTANCE, p1, (MediaType) null, 1, (Object) null));
            }

            @JvmStatic
            public final Part createFormData(String p0, String p1, RequestBody p2) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p2, "");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                MultipartBody.INSTANCE.appendQuotedString$okhttp(sb, p0);
                if (p1 != null) {
                    sb.append("; filename=");
                    MultipartBody.INSTANCE.appendQuotedString$okhttp(sb, p1);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), p2);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        @JvmStatic
        public static final Part create(Headers headers, RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        @JvmStatic
        public static final Part create(RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        @JvmStatic
        public static final Part createFormData(String str, String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        @JvmStatic
        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ!\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "p1", "addFormDataPart", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/RequestBody;", "p2", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "addPart", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "build", "()Lokhttp3/MultipartBody;", "Lokhttp3/MediaType;", "setType", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokio/ByteString;", "boundary", "Lokio/ByteString;", "", "parts", "Ljava/util/List;", "type", "Lokhttp3/MediaType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ByteString.Companion companion = ByteString.INSTANCE;
            this.boundary = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            this(str);
        }

        public final Builder setType(MediaType p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (!Intrinsics.areEqual(p0.type(), "multipart")) {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(p0)).toString());
            }
            this.type = p0;
            return this;
        }

        public final Builder addPart(RequestBody p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            addPart(Part.INSTANCE.create(p0));
            return this;
        }

        public final Builder addPart(Headers p0, RequestBody p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            addPart(Part.INSTANCE.create(p0, p1));
            return this;
        }

        public final Builder addFormDataPart(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            addPart(Part.INSTANCE.createFormData(p0, p1));
            return this;
        }

        public final Builder addFormDataPart(String p0, String p1, RequestBody p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            addPart(Part.INSTANCE.createFormData(p0, p1, p2));
            return this;
        }

        public final Builder addPart(Part p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.parts.add(p0);
            return this;
        }

        public final MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.".toString());
            }
            return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\r"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "p0", "", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            Intrinsics.checkNotNullParameter(sb, "");
            Intrinsics.checkNotNullParameter(str, "");
            sb.append(Typography.quote);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append(Typography.quote);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
