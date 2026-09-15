package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.RotationProvider1;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "LRotationProvider1;", "p0", "<init>", "(LRotationProvider1;)V", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "", "readLine", "()Ljava/lang/String;", "", "headerLimit", "J", "source", "LRotationProvider1;", "getSource", "()LRotationProvider1;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final RotationProvider1 source;

    public HeadersReader(RotationProvider1 rotationProvider1) {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        this.source = rotationProvider1;
        this.headerLimit = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public final RotationProvider1 getSource() {
        return this.source;
    }

    public final String readLine() throws IOException {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.source.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.headerLimit);
        this.headerLimit -= (long) strTuitionPaymentFragmentspecialinlinedviewModeldefault2.length();
        return strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() != 0) {
                builder.addLenient$okhttp(line);
            } else {
                return builder.build();
            }
        }
    }
}
