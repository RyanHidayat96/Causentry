package okhttp3.internal.http;

import defpackage.RotationProviderListenerWrapper;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a!\u0010\u000f\u001a\u00020\u000e*\u00020\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a!\u0010\u0017\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010 "}, d2 = {"Lokhttp3/Response;", "p0", "", "hasBody", "(Lokhttp3/Response;)Z", "Lokhttp3/Headers;", "", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "promisesBody", "LRotationProviderListenerWrapper;", "", "", "readChallengeHeader", "(LRotationProviderListenerWrapper;Ljava/util/List;)V", "readQuotedString", "(LRotationProviderListenerWrapper;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "p1", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "skipCommasAndWhitespace", "(LRotationProviderListenerWrapper;)Z", "", "startsWith", "(LRotationProviderListenerWrapper;B)Z", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lokio/ByteString;", "TOKEN_DELIMITERS"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        QUOTED_STRING_DELIMITERS = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\"\\");
        ByteString.Companion companion2 = ByteString.INSTANCE;
        TOKEN_DELIMITERS = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1("\t ,=");
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (StringsKt.equals(str, headers.name(i), true)) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                String strValue = headers.value(i);
                Intrinsics.checkNotNullParameter(strValue, "");
                try {
                    readChallengeHeader(rotationProviderListenerWrapper.b(strValue, 0, strValue.length()), arrayList);
                } catch (EOFException e2) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[EDGE_INSN: B:52:0x00ba->B:41:0x00ba BREAK  A[LOOP:2: B:19:0x0075->B:39:0x00b7], SYNTHETIC] */
    private static final void readChallengeHeader(RotationProviderListenerWrapper rotationProviderListenerWrapper, List<Challenge> list) throws EOFException {
        while (true) {
            String token = null;
            while (true) {
                if (token == null) {
                    skipCommasAndWhitespace(rotationProviderListenerWrapper);
                    token = readToken(rotationProviderListenerWrapper);
                    if (token == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(rotationProviderListenerWrapper);
                String token2 = readToken(rotationProviderListenerWrapper);
                if (token2 == null) {
                    if (rotationProviderListenerWrapper.size == 0) {
                        list.add(new Challenge(token, (Map<String, String>) MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(rotationProviderListenerWrapper, Base64.padSymbol);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(rotationProviderListenerWrapper);
                if (!zSkipCommasAndWhitespace && (zSkipCommasAndWhitespace2 || rotationProviderListenerWrapper.size == 0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(token2);
                    sb.append(StringsKt.repeat("=", iSkipAll));
                    Map mapSingletonMap = Collections.singletonMap(null, sb.toString());
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
                    list.add(new Challenge(token, (Map<String, String>) mapSingletonMap));
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = iSkipAll + Util.skipAll(rotationProviderListenerWrapper, Base64.padSymbol);
                    while (true) {
                        if (token2 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            } else if (iSkipAll2 <= 1) {
                                return;
                            } else {
                                return;
                            }
                        }
                        token2 = readToken(rotationProviderListenerWrapper);
                        if (!skipCommasAndWhitespace(rotationProviderListenerWrapper)) {
                            iSkipAll2 = Util.skipAll(rotationProviderListenerWrapper, Base64.padSymbol);
                            if (iSkipAll2 != 0) {
                                break;
                            }
                            if (iSkipAll2 <= 1 || skipCommasAndWhitespace(rotationProviderListenerWrapper)) {
                                return;
                            }
                            String quotedString = startsWith(rotationProviderListenerWrapper, (byte) 34) ? readQuotedString(rotationProviderListenerWrapper) : readToken(rotationProviderListenerWrapper);
                            if (quotedString == null || ((String) linkedHashMap.put(token2, quotedString)) != null) {
                                return;
                            }
                            if (!skipCommasAndWhitespace(rotationProviderListenerWrapper) && rotationProviderListenerWrapper.size != 0) {
                                return;
                            } else {
                                token2 = null;
                            }
                        } else {
                            break;
                        }
                    }
                    list.add(new Challenge(token, linkedHashMap));
                    token = token2;
                }
            }
        }
    }

    private static final String readQuotedString(RotationProviderListenerWrapper rotationProviderListenerWrapper) throws EOFException {
        if (rotationProviderListenerWrapper.cancel() != 34) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
        while (true) {
            ByteString byteString = QUOTED_STRING_DELIMITERS;
            Intrinsics.checkNotNullParameter(byteString, "");
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString, 0L);
            if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
                return null;
            }
            if (rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jTuitionPaymentFragmentspecialinlinedviewModeldefault2) == 34) {
                rotationProviderListenerWrapper2.write(rotationProviderListenerWrapper, jTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                rotationProviderListenerWrapper.cancel();
                return rotationProviderListenerWrapper2.b(rotationProviderListenerWrapper2.size, Charsets.UTF_8);
            }
            if (rotationProviderListenerWrapper.size == jTuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1) {
                return null;
            }
            rotationProviderListenerWrapper2.write(rotationProviderListenerWrapper, jTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            rotationProviderListenerWrapper.cancel();
            rotationProviderListenerWrapper2.write(rotationProviderListenerWrapper, 1L);
        }
    }

    private static final String readToken(RotationProviderListenerWrapper rotationProviderListenerWrapper) {
        ByteString byteString = TOKEN_DELIMITERS;
        Intrinsics.checkNotNullParameter(byteString, "");
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString, 0L);
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
            jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = rotationProviderListenerWrapper.size;
        }
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
            return rotationProviderListenerWrapper.b(jTuitionPaymentFragmentspecialinlinedviewModeldefault2, Charsets.UTF_8);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(headers, "");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
            if (all.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(httpUrl, all);
        }
    }

    public static final boolean promisesBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !StringsKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        return promisesBody(response);
    }

    private static final boolean skipCommasAndWhitespace(RotationProviderListenerWrapper rotationProviderListenerWrapper) throws EOFException {
        boolean z = false;
        while (rotationProviderListenerWrapper.size != 0) {
            byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L);
            if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 44) {
                if (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 32 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 9) {
                    break;
                }
                rotationProviderListenerWrapper.cancel();
            } else {
                rotationProviderListenerWrapper.cancel();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(RotationProviderListenerWrapper rotationProviderListenerWrapper, byte b) {
        return rotationProviderListenerWrapper.size != 0 && rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L) == b;
    }
}
