package com.squareup.okhttp.internal.http;

import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import defpackage.RotationProvider1;

/* JADX INFO: loaded from: classes7.dex */
public final class RealResponseBody extends ResponseBody {
    private final Headers headers;
    private final RotationProvider1 source;

    public RealResponseBody(Headers headers, RotationProvider1 rotationProvider1) {
        this.headers = headers;
        this.source = rotationProvider1;
    }

    @Override // com.squareup.okhttp.ResponseBody
    public final MediaType contentType() {
        String str = this.headers.get(HttpHeaderParser.HEADER_CONTENT_TYPE);
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // com.squareup.okhttp.ResponseBody
    public final long contentLength() {
        return OkHeaders.contentLength(this.headers);
    }

    @Override // com.squareup.okhttp.ResponseBody
    public final RotationProvider1 source() {
        return this.source;
    }
}
