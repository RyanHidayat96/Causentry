package okhttp3.internal.ws;

import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokio/ByteString;", "EMPTY_DEFLATE_BLOCK", "Lokio/ByteString;", "", "LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION", "I"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MessageDeflaterKt {
    private static final ByteString EMPTY_DEFLATE_BLOCK;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        EMPTY_DEFLATE_BLOCK = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2("000000ffff");
    }
}
