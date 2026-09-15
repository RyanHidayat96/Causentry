package defpackage;

import com.android.volley.toolbox.HttpHeaderParser;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\n\u0010B\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f"}, d2 = {"LputText;", "", "Lokhttp3/Request;", "p0", "LscaleBitmap;", "p1", "<init>", "(Lokhttp3/Request;LscaleBitmap;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LscaleBitmap;", "()LscaleBitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class putText {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final scaleBitmap b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Request TuitionPaymentFragmentbindingInflater1;

    private putText(Request request, scaleBitmap scalebitmap) {
        this.TuitionPaymentFragmentbindingInflater1 = request;
        this.b = scalebitmap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Request getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final scaleBitmap getB() {
        return this.b;
    }

    public static final class b {
        private Date TuitionPaymentFragmentbindingInflater1;
        private final scaleBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Date TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Request f1330a;
        private long asBinder;
        private Date asInterface;
        private String b;
        private String d;
        private long g;
        private String onTransact;

        public b(Request request, scaleBitmap scalebitmap) {
            this.f1330a = request;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = scalebitmap;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
            if (scalebitmap != null) {
                this.g = scalebitmap.b;
                this.asBinder = scalebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Headers headers = scalebitmap.asBinder;
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strName = headers.name(i);
                    if (StringsKt.equals(strName, "Date", true)) {
                        this.asInterface = headers.getDate("Date");
                        this.onTransact = headers.value(i);
                    } else if (StringsKt.equals(strName, "Expires", true)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = headers.getDate("Expires");
                    } else if (StringsKt.equals(strName, "Last-Modified", true)) {
                        this.TuitionPaymentFragmentbindingInflater1 = headers.getDate("Last-Modified");
                        this.d = headers.value(i);
                    } else if (StringsKt.equals(strName, "ETag", true)) {
                        this.b = headers.value(i);
                    } else if (StringsKt.equals(strName, "Age", true)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRatingType.TuitionPaymentFragmentbindingInflater1(headers.value(i));
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final putText b() {
            scaleBitmap scalebitmap = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                return new putText(this.f1330a, scalebitmap, objArr12 == true ? 1 : 0);
            }
            if (this.f1330a.isHttps() && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return new putText(this.f1330a, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            CacheControl cacheControl = (CacheControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            Companion companion = putText.INSTANCE;
            if (!Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.f1330a, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return new putText(this.f1330a, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            CacheControl cacheControl2 = this.f1330a.cacheControl();
            if (!cacheControl2.noCache()) {
                Request request = this.f1330a;
                String str = "If-Modified-Since";
                if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                    long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    long jTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
                    if (cacheControl2.maxAgeSeconds() != -1) {
                        jTuitionPaymentFragmentbindingInflater1 = Math.min(jTuitionPaymentFragmentbindingInflater1, TimeUnit.SECONDS.toMillis(cacheControl2.maxAgeSeconds()));
                    }
                    long millis = 0;
                    long millis2 = cacheControl2.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl2.minFreshSeconds()) : 0L;
                    if (!cacheControl.mustRevalidate() && cacheControl2.maxStaleSeconds() != -1) {
                        millis = TimeUnit.SECONDS.toMillis(cacheControl2.maxStaleSeconds());
                    }
                    if (!cacheControl.noCache() && jTuitionPaymentFragmentspecialinlinedviewModeldefault1 + millis2 < jTuitionPaymentFragmentbindingInflater1 + millis) {
                        return new putText(objArr7 == true ? 1 : 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr6 == true ? 1 : 0);
                    }
                    String str2 = this.b;
                    if (str2 != null) {
                        Intrinsics.checkNotNull(str2);
                        str = "If-None-Match";
                    } else if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                        str2 = this.d;
                        Intrinsics.checkNotNull(str2);
                    } else if (this.asInterface != null) {
                        str2 = this.onTransact;
                        Intrinsics.checkNotNull(str2);
                    } else {
                        return new putText(this.f1330a, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    return new putText(this.f1330a.newBuilder().addHeader(str, str2).build(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objArr5 == true ? 1 : 0);
                }
            }
            return new putText(this.f1330a, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
        }

        private final long TuitionPaymentFragmentbindingInflater1() {
            scaleBitmap scalebitmap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNull(scalebitmap);
            CacheControl cacheControl = (CacheControl) scalebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            Date date = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (date != null) {
                Date date2 = this.asInterface;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.asBinder);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.TuitionPaymentFragmentbindingInflater1 != null && this.f1330a.url().query() == null) {
                Date date3 = this.asInterface;
                long time2 = date3 != null ? date3.getTime() : this.g;
                Date date4 = this.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Date date = this.asInterface;
            long jMax = date != null ? Math.max(0L, this.asBinder - date.getTime()) : 0L;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            }
            long j = jMax + (this.asBinder - this.g);
            playFromUri playfromuri = playFromUri.INSTANCE;
            return j + (playFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2() - this.asBinder);
        }
    }

    public /* synthetic */ putText(Request request, scaleBitmap scalebitmap, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, scalebitmap);
    }

    /* JADX INFO: renamed from: putText$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\t\u0010\u0010"}, d2 = {"LputText$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lokhttp3/Request;", "p0", "Lokhttp3/Response;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "LscaleBitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lokhttp3/Request;LscaleBitmap;)Z", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Request p0, Response p1) {
            return (p0.cacheControl().noStore() || p1.cacheControl().noStore() || Intrinsics.areEqual(p1.headers().get("Vary"), "*")) ? false : true;
        }

        public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Request p0, scaleBitmap p1) {
            return (p0.cacheControl().noStore() || ((CacheControl) p1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).noStore() || Intrinsics.areEqual(p1.asBinder.get("Vary"), "*")) ? false : true;
        }

        public static boolean TuitionPaymentFragmentbindingInflater1(String p0) {
            return (StringsKt.equals("Connection", p0, true) || StringsKt.equals("Keep-Alive", p0, true) || StringsKt.equals("Proxy-Authenticate", p0, true) || StringsKt.equals("Proxy-Authorization", p0, true) || StringsKt.equals("TE", p0, true) || StringsKt.equals("Trailers", p0, true) || StringsKt.equals("Transfer-Encoding", p0, true) || StringsKt.equals("Upgrade", p0, true)) ? false : true;
        }

        public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
            return StringsKt.equals("Content-Length", p0, true) || StringsKt.equals("Content-Encoding", p0, true) || StringsKt.equals(HttpHeaderParser.HEADER_CONTENT_TYPE, p0, true);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
