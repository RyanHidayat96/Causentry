package com.squareup.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import defpackage.RotationProviderListenerWrapper;
import java.io.EOFException;

/* JADX INFO: loaded from: classes6.dex */
public final class FormEncodingBuilder {
    private static final MediaType CONTENT_TYPE = MediaType.parse(ShareTarget.ENCODING_TYPE_URL_ENCODED);
    private final RotationProviderListenerWrapper content = new RotationProviderListenerWrapper();

    public final FormEncodingBuilder add(String str, String str2) throws EOFException {
        if (this.content.size > 0) {
            this.content.TuitionPaymentFragmentspecialinlinedviewModeldefault3(38);
        }
        HttpUrl.canonicalize(this.content, str, 0, str.length(), okhttp3.HttpUrl.FORM_ENCODE_SET, false, true, true);
        this.content.TuitionPaymentFragmentspecialinlinedviewModeldefault3(61);
        HttpUrl.canonicalize(this.content, str2, 0, str2.length(), okhttp3.HttpUrl.FORM_ENCODE_SET, false, true, true);
        return this;
    }

    public final FormEncodingBuilder addEncoded(String str, String str2) throws EOFException {
        if (this.content.size > 0) {
            this.content.TuitionPaymentFragmentspecialinlinedviewModeldefault3(38);
        }
        HttpUrl.canonicalize(this.content, str, 0, str.length(), okhttp3.HttpUrl.FORM_ENCODE_SET, true, true, true);
        this.content.TuitionPaymentFragmentspecialinlinedviewModeldefault3(61);
        HttpUrl.canonicalize(this.content, str2, 0, str2.length(), okhttp3.HttpUrl.FORM_ENCODE_SET, true, true, true);
        return this;
    }

    public final RequestBody build() {
        return RequestBody.create(CONTENT_TYPE, this.content.connect());
    }
}
