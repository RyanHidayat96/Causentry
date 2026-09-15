package com.squareup.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.okhttp.internal.Util;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.ByteString;

/* JADX INFO: loaded from: classes6.dex */
public final class MultipartBuilder {
    private final ByteString boundary;
    private final List<RequestBody> partBodies;
    private final List<Headers> partHeaders;
    private MediaType type;
    public static final MediaType MIXED = MediaType.parse("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.parse("multipart/alternative");
    public static final MediaType DIGEST = MediaType.parse("multipart/digest");
    public static final MediaType PARALLEL = MediaType.parse("multipart/parallel");
    public static final MediaType FORM = MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART);
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    public MultipartBuilder() {
        this(UUID.randomUUID().toString());
    }

    public MultipartBuilder(String str) {
        this.type = MIXED;
        this.partHeaders = new ArrayList();
        this.partBodies = new ArrayList();
        this.boundary = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
    }

    public final MultipartBuilder type(MediaType mediaType) {
        if (mediaType == null) {
            throw new NullPointerException("type == null");
        }
        if (!mediaType.type().equals("multipart")) {
            throw new IllegalArgumentException("multipart != ".concat(String.valueOf(mediaType)));
        }
        this.type = mediaType;
        return this;
    }

    public final MultipartBuilder addPart(RequestBody requestBody) {
        return addPart(null, requestBody);
    }

    public final MultipartBuilder addPart(Headers headers, RequestBody requestBody) {
        if (requestBody == null) {
            throw new NullPointerException("body == null");
        }
        if (headers != null && headers.get(HttpHeaderParser.HEADER_CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers != null && headers.get("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        this.partHeaders.add(headers);
        this.partBodies.add(requestBody);
        return this;
    }

    private static StringBuilder appendQuotedString(StringBuilder sb, String str) {
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
        return sb;
    }

    public final MultipartBuilder addFormDataPart(String str, String str2) {
        return addFormDataPart(str, null, RequestBody.create((MediaType) null, str2));
    }

    public final MultipartBuilder addFormDataPart(String str, String str2, RequestBody requestBody) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        StringBuilder sb = new StringBuilder("form-data; name=");
        appendQuotedString(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            appendQuotedString(sb, str2);
        }
        return addPart(Headers.of("Content-Disposition", sb.toString()), requestBody);
    }

    public final RequestBody build() {
        if (this.partHeaders.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new MultipartRequestBody(this.type, this.boundary, this.partHeaders, this.partBodies);
    }

    static final class MultipartRequestBody extends RequestBody {
        private final ByteString boundary;
        private long contentLength = -1;
        private final MediaType contentType;
        private final List<RequestBody> partBodies;
        private final List<Headers> partHeaders;

        public MultipartRequestBody(MediaType mediaType, ByteString byteString, List<Headers> list, List<RequestBody> list2) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            }
            this.boundary = byteString;
            StringBuilder sb = new StringBuilder();
            sb.append(mediaType);
            sb.append("; boundary=");
            String str = byteString.utf8;
            if (str == null) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                byteString.utf8 = str2;
                str = str2;
            }
            sb.append(str);
            this.contentType = MediaType.parse(sb.toString());
            this.partHeaders = Util.immutableList(list);
            this.partBodies = Util.immutableList(list2);
        }

        @Override // com.squareup.okhttp.RequestBody
        public final MediaType contentType() {
            return this.contentType;
        }

        @Override // com.squareup.okhttp.RequestBody
        public final long contentLength() throws IOException {
            long j = this.contentLength;
            if (j != -1) {
                return j;
            }
            long jWriteOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = jWriteOrCountBytes;
            return jWriteOrCountBytes;
        }

        private long writeOrCountBytes(RotationProviderListener rotationProviderListener, boolean z) throws IOException {
            RotationProviderListener rotationProviderListener2;
            RotationProviderListenerWrapper rotationProviderListenerWrapper;
            if (z) {
                rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                rotationProviderListener2 = rotationProviderListenerWrapper;
            } else {
                rotationProviderListener2 = rotationProviderListener;
                rotationProviderListenerWrapper = null;
            }
            int size = this.partHeaders.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                Headers headers = this.partHeaders.get(i);
                RequestBody requestBody = this.partBodies.get(i);
                rotationProviderListener2.b(MultipartBuilder.DASHDASH);
                rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.boundary);
                rotationProviderListener2.b(MultipartBuilder.CRLF);
                if (headers != null) {
                    int size2 = headers.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.name(i2)).b(MultipartBuilder.COLONSPACE).TuitionPaymentFragmentspecialinlinedviewModeldefault1(headers.value(i2)).b(MultipartBuilder.CRLF);
                    }
                }
                MediaType mediaTypeContentType = requestBody.contentType();
                if (mediaTypeContentType != null) {
                    rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Content-Type: ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaTypeContentType.toString()).b(MultipartBuilder.CRLF);
                }
                long jContentLength = requestBody.contentLength();
                if (jContentLength != -1) {
                    rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Content-Length: ").a(jContentLength).b(MultipartBuilder.CRLF);
                } else if (z) {
                    rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
                    return -1L;
                }
                rotationProviderListener2.b(MultipartBuilder.CRLF);
                if (z) {
                    j += jContentLength;
                } else {
                    this.partBodies.get(i).writeTo(rotationProviderListener2);
                }
                rotationProviderListener2.b(MultipartBuilder.CRLF);
            }
            rotationProviderListener2.b(MultipartBuilder.DASHDASH);
            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.boundary);
            rotationProviderListener2.b(MultipartBuilder.DASHDASH);
            rotationProviderListener2.b(MultipartBuilder.CRLF);
            if (!z) {
                return j;
            }
            long j2 = j + rotationProviderListenerWrapper.size;
            rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
            return j2;
        }

        @Override // com.squareup.okhttp.RequestBody
        public final void writeTo(RotationProviderListener rotationProviderListener) throws IOException {
            writeOrCountBytes(rotationProviderListener, false);
        }
    }
}
