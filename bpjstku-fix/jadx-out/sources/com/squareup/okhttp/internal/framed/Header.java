package com.squareup.okhttp.internal.framed;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Header {
    final int hpackSize;
    public final ByteString name;
    public final ByteString value;
    public static final ByteString RESPONSE_STATUS = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8);
    public static final ByteString TARGET_METHOD = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(okhttp3.internal.http2.Header.TARGET_METHOD_UTF8);
    public static final ByteString TARGET_PATH = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(okhttp3.internal.http2.Header.TARGET_PATH_UTF8);
    public static final ByteString TARGET_SCHEME = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8);
    public static final ByteString TARGET_AUTHORITY = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    public static final ByteString TARGET_HOST = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(":host");
    public static final ByteString VERSION = ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(":version");

    public Header(String str, String str2) {
        this(ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str), ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2));
    }

    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str));
    }

    public Header(ByteString byteString, ByteString byteString2) {
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + 32 + byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.name.equals(header.name) && this.value.equals(header.value);
    }

    public final int hashCode() {
        return ((this.name.hashCode() + 527) * 31) + this.value.hashCode();
    }

    public final String toString() {
        ByteString byteString = this.name;
        String str = byteString.utf8;
        if (str == null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
            byteString.utf8 = str2;
            str = str2;
        }
        ByteString byteString2 = this.value;
        String str3 = byteString2.utf8;
        if (str3 == null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            String str4 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, Charsets.UTF_8);
            byteString2.utf8 = str4;
            str3 = str4;
        }
        return String.format("%s: %s", str, str3);
    }
}
