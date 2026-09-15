package defpackage;

import com.android.volley.toolbox.HttpHeaderParser;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\n\u001a\u00020\f8GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\r\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a"}, d2 = {"LscaleBitmap;", "", "LRotationProvider1;", "p0", "<init>", "(LRotationProvider1;)V", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "LRotationProviderListener;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LRotationProviderListener;)V", "Lokhttp3/CacheControl;", "b", "Lkotlin/Lazy;", "Lokhttp3/MediaType;", "d", "TuitionPaymentFragmentbindingInflater1", "()Lokhttp3/MediaType;", "", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Z", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "asBinder"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class scaleBitmap {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final long b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final Headers asBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: MediaMetadataCompatRatingKey
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CacheControl.INSTANCE.parse(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: putString
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return scaleBitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaType TuitionPaymentFragmentspecialinlinedviewModeldefault1(scaleBitmap scalebitmap) {
        String str = scalebitmap.asBinder.get(HttpHeaderParser.HEADER_CONTENT_TYPE);
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    public final MediaType TuitionPaymentFragmentbindingInflater1() {
        return (MediaType) this.TuitionPaymentFragmentbindingInflater1.getValue();
    }

    public scaleBitmap(RotationProvider1 rotationProvider1) {
        this.b = Long.parseLong(rotationProvider1.IconCompatParcelizer());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Long.parseLong(rotationProvider1.IconCompatParcelizer());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Integer.parseInt(rotationProvider1.IconCompatParcelizer()) > 0;
        int i = Integer.parseInt(rotationProvider1.IconCompatParcelizer());
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(builder, rotationProvider1.IconCompatParcelizer());
        }
        this.asBinder = builder.build();
    }

    public scaleBitmap(Response response) {
        this.b = response.sentRequestAtMillis();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = response.receivedResponseAtMillis();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = response.handshake() != null;
        this.asBinder = response.headers();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RotationProviderListener p0) throws IOException {
        p0.a(this.b).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
        p0.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
        p0.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? 1L : 0L).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
        p0.a(this.asBinder.size()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
        int size = this.asBinder.size();
        for (int i = 0; i < size; i++) {
            p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder.name(i)).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.asBinder.value(i)).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
        }
    }
}
