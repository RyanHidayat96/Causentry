package defpackage;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.fetch.HttpUriFetcher$executeNetworkRequest$1;
import coil.fetch.HttpUriFetcher$fetch$1;
import coil.network.HttpException;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0002\"\u0013B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0010\u001a\u0004\u0018\u00010\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0010\u0010\u0018J\u000f\u0010\u0010\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u0019J\u0018\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0010\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0017*\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u001c\u001a\u00020!*\u00020$H\u0002¢\u0006\u0004\b\u001c\u0010%R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010(\u001a\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010-R\u0014\u00100\u001a\u00020.8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010/"}, d2 = {"LsetIconUri;", "LsetMediaId;", "", "p0", "LgetStarRating;", "p1", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "p2", "LfromMediaDescription;", "p3", "", "p4", "<init>", "(Ljava/lang/String;LgetStarRating;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "LsetMediaUri;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lokhttp3/Request;", "Lokhttp3/Response;", "LscaleBitmap;", "(LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Lokhttp3/Request;Lokhttp3/Response;LscaleBitmap;)LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "()Lokhttp3/Request;", "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "(LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;)LscaleBitmap;", "LMediaBrowserCompatApi23ItemCallback;", "b", "(LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;)LMediaBrowserCompatApi23ItemCallback;", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)LMediaBrowserCompatApi23ItemCallback;", "d", "Ljava/lang/String;", "asInterface", "LgetStarRating;", "Lkotlin/Lazy;", "asBinder", "Z", "()Ljava/lang/String;", "LanimateToFullOpacity;", "()LanimateToFullOpacity;", "a"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setIconUri implements setMediaId {
    private static final CacheControl TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CacheControl.Builder().noCache().noStore().build();
    private static final CacheControl TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy<Call.Factory> b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final getStarRating TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy<fromMediaDescription> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Multi-variable type inference failed */
    public setIconUri(String str, getStarRating getstarrating, Lazy<? extends Call.Factory> lazy, Lazy<? extends fromMediaDescription> lazy2, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getstarrating;
        this.b = lazy;
        this.TuitionPaymentFragmentbindingInflater1 = lazy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01a3 A[Catch: Exception -> 0x01ae, TryCatch #1 {Exception -> 0x01ae, blocks: (B:70:0x018b, B:72:0x01a3, B:74:0x01a8, B:73:0x01a6), top: B:91:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6 A[Catch: Exception -> 0x01ae, TryCatch #1 {Exception -> 0x01ae, blocks: (B:70:0x018b, B:72:0x01a3, B:74:0x01a8, B:73:0x01a6), top: B:91:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4  */
    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) throws Exception {
        HttpUriFetcher$fetch$1 httpUriFetcher$fetch$1;
        fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Exception e2;
        putText puttextB;
        setIconUri seticonuri;
        Response response;
        ResponseBody responseBodyB;
        Response response2;
        fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        setIconUri seticonuri2;
        DataSource dataSource;
        if (continuation instanceof HttpUriFetcher$fetch$1) {
            httpUriFetcher$fetch$1 = (HttpUriFetcher$fetch$1) continuation;
            if ((httpUriFetcher$fetch$1.label & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$fetch$1.label -= Integer.MIN_VALUE;
            } else {
                httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, continuation);
            }
        } else {
            httpUriFetcher$fetch$1 = new HttpUriFetcher$fetch$1(this, continuation);
        }
        Object obj = httpUriFetcher$fetch$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = httpUriFetcher$fetch$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                try {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                        animateToFullOpacity animatetofullopacityTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
                        SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1, "");
                        Long l = surfaceDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(animatetofullopacityTuitionPaymentFragmentbindingInflater1, surfaceViewImplementationExternalSyntheticLambda1TuitionPaymentFragmentbindingInflater1).asInterface;
                        if (l != null && l.longValue() == 0) {
                            return new MediaDescriptionCompatApi21Builder(b(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1), TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null), DataSource.DISK);
                        }
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            puttextB = new putText.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1)).b();
                            if (puttextB.getTuitionPaymentFragmentbindingInflater1() == null && puttextB.getB() != null) {
                                return new MediaDescriptionCompatApi21Builder(b(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1), TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, puttextB.getB().TuitionPaymentFragmentbindingInflater1()), DataSource.DISK);
                            }
                        } else {
                            MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallbackB = b(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            scaleBitmap scalebitmapTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            return new MediaDescriptionCompatApi21Builder(mediaBrowserCompatApi23ItemCallbackB, TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, scalebitmapTuitionPaymentFragmentbindingInflater1 != null ? scalebitmapTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1() : null), DataSource.DISK);
                        }
                    } else {
                        puttextB = new putText.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null).b();
                    }
                    Request tuitionPaymentFragmentbindingInflater1 = puttextB.getTuitionPaymentFragmentbindingInflater1();
                    Intrinsics.checkNotNull(tuitionPaymentFragmentbindingInflater1);
                    httpUriFetcher$fetch$1.L$0 = this;
                    httpUriFetcher$fetch$1.L$1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    httpUriFetcher$fetch$1.L$2 = puttextB;
                    httpUriFetcher$fetch$1.label = 1;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1, httpUriFetcher$fetch$1);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 != coroutine_suspended) {
                        seticonuri = this;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        obj = objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                    return coroutine_suspended;
                } catch (Exception e3) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    e2 = e3;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        getRatingType.b(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    throw e2;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                response2 = (Response) httpUriFetcher$fetch$1.L$2;
                tuitionPaymentFragmentspecialinlinedviewModeldefault4 = (fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3) httpUriFetcher$fetch$1.L$1;
                seticonuri2 = (setIconUri) httpUriFetcher$fetch$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    response = (Response) obj;
                    try {
                        ResponseBody responseBodyB2 = getRatingType.b(response);
                        MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = seticonuri2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(responseBodyB2);
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(seticonuri2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, responseBodyB2.get$contentType());
                        if (response.networkResponse() != null) {
                            dataSource = DataSource.NETWORK;
                        } else {
                            dataSource = DataSource.DISK;
                        }
                        return new MediaDescriptionCompatApi21Builder(mediaBrowserCompatApi23ItemCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, dataSource);
                    } catch (Exception e4) {
                        e = e4;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        response2 = response;
                        e = e;
                        tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        try {
                            getRatingType.b((Closeable) response2);
                            throw e;
                        } catch (Exception e5) {
                            e2 = e5;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                getRatingType.b(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            }
                            throw e2;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    getRatingType.b((Closeable) response2);
                    throw e;
                }
            }
            puttextB = (putText) httpUriFetcher$fetch$1.L$2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3) httpUriFetcher$fetch$1.L$1;
            seticonuri = (setIconUri) httpUriFetcher$fetch$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e7) {
                e2 = e7;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    getRatingType.b(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                throw e2;
            }
            fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault4 = seticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault3, puttextB.getTuitionPaymentFragmentbindingInflater1(), response, puttextB.getB());
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
                MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallbackB2 = seticonuri.b(TuitionPaymentFragmentspecialinlinedviewModeldefault4);
                String str2 = seticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                scaleBitmap scalebitmapTuitionPaymentFragmentbindingInflater2 = seticonuri.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault4);
                return new MediaDescriptionCompatApi21Builder(mediaBrowserCompatApi23ItemCallbackB2, TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, scalebitmapTuitionPaymentFragmentbindingInflater2 != null ? scalebitmapTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1() : null), DataSource.NETWORK);
            }
            if (responseBodyB.getSource().asBinder(1L)) {
                return new MediaDescriptionCompatApi21Builder(seticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(responseBodyB), TuitionPaymentFragmentspecialinlinedviewModeldefault2(seticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3, responseBodyB.get$contentType()), response.networkResponse() != null ? DataSource.NETWORK : DataSource.DISK);
            }
            getRatingType.b((Closeable) response);
            Request requestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = seticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            httpUriFetcher$fetch$1.L$0 = seticonuri;
            httpUriFetcher$fetch$1.L$1 = TuitionPaymentFragmentspecialinlinedviewModeldefault4;
            httpUriFetcher$fetch$1.L$2 = response;
            httpUriFetcher$fetch$1.label = 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = seticonuri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(requestTuitionPaymentFragmentspecialinlinedviewModeldefault3, httpUriFetcher$fetch$1);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 != coroutine_suspended) {
                response2 = response;
                obj = objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                tuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault4;
                seticonuri2 = seticonuri;
                response = (Response) obj;
                ResponseBody responseBodyB3 = getRatingType.b(response);
                MediaBrowserCompatApi23ItemCallback mediaBrowserCompatApi23ItemCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = seticonuri2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(responseBodyB3);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(seticonuri2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, responseBodyB3.get$contentType());
                if (response.networkResponse() != null) {
                    dataSource = DataSource.NETWORK;
                } else {
                    dataSource = DataSource.DISK;
                }
                return new MediaDescriptionCompatApi21Builder(mediaBrowserCompatApi23ItemCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, dataSource);
            }
            return coroutine_suspended;
        } catch (Exception e8) {
            e = e8;
            response2 = response;
            e = e;
            tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getRatingType.b((Closeable) response2);
            throw e;
        }
        response = (Response) obj;
        responseBodyB = getRatingType.b(response);
    }

    private final fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        fromMediaDescription value;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder().getReadEnabled() || (value = this.TuitionPaymentFragmentbindingInflater1.getValue()) == null) {
            return null;
        }
        return value.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b());
    }

    private final fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 p0, Request p1, Response p2, scaleBitmap p3) {
        fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1;
        Throwable th;
        Throwable th2 = null;
        if (!TuitionPaymentFragmentbindingInflater1(p1, p2)) {
            if (p0 != null) {
                getRatingType.b(p0);
            }
            return null;
        }
        if (p0 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            fromMediaDescription value = this.TuitionPaymentFragmentbindingInflater1.getValue();
            tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 = value != null ? value.TuitionPaymentFragmentbindingInflater1(b()) : null;
        }
        try {
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1 == null) {
                return null;
            }
            try {
                if (p2.code() == 304 && p3 != null) {
                    Response.Builder builderNewBuilder = p2.newBuilder();
                    putText.Companion companion = putText.INSTANCE;
                    Headers headers = p3.asBinder;
                    Headers headers2 = p2.headers();
                    Headers.Builder builder = new Headers.Builder();
                    int size = headers.size();
                    for (int i = 0; i < size; i++) {
                        String strName = headers.name(i);
                        String strValue = headers.value(i);
                        if ((!StringsKt.equals("Warning", strName, true) || !StringsKt.startsWith$default(strValue, "1", false, 2, (Object) null)) && (putText.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strName) || !putText.Companion.TuitionPaymentFragmentbindingInflater1(strName) || headers2.get(strName) == null)) {
                            builder.addUnsafeNonAscii(strName, strValue);
                        }
                    }
                    int size2 = headers2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String strName2 = headers2.name(i2);
                        if (!putText.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strName2) && putText.Companion.TuitionPaymentFragmentbindingInflater1(strName2)) {
                            builder.addUnsafeNonAscii(strName2, headers2.value(i2));
                        }
                    }
                    Response responseBuild = builderNewBuilder.headers(builder.build()).build();
                    RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false));
                    try {
                        new scaleBitmap(responseBuild).TuitionPaymentFragmentspecialinlinedviewModeldefault1(rotationProviderListenerTuitionPaymentFragmentbindingInflater1);
                        Unit unit = Unit.INSTANCE;
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater1.close();
                        } catch (Throwable th5) {
                            ExceptionsKt.addSuppressed(th2, th5);
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                } else {
                    RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater2 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), false));
                    try {
                        new scaleBitmap(p2).TuitionPaymentFragmentspecialinlinedviewModeldefault1(rotationProviderListenerTuitionPaymentFragmentbindingInflater2);
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater2.close();
                            th = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater2.close();
                        } catch (Throwable th8) {
                            ExceptionsKt.addSuppressed(th7, th8);
                        }
                        th = th7;
                    }
                    if (th != null) {
                        throw th;
                    }
                    RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater3 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(), false));
                    try {
                        ResponseBody responseBodyBody = p2.body();
                        Intrinsics.checkNotNull(responseBodyBody);
                        responseBodyBody.getSource().TuitionPaymentFragmentspecialinlinedviewModeldefault1(rotationProviderListenerTuitionPaymentFragmentbindingInflater3);
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater3.close();
                        } catch (Throwable th9) {
                            th2 = th9;
                        }
                    } catch (Throwable th10) {
                        th2 = th10;
                        try {
                            rotationProviderListenerTuitionPaymentFragmentbindingInflater3.close();
                        } catch (Throwable th11) {
                            ExceptionsKt.addSuppressed(th2, th11);
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                }
                fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                getRatingType.b((Closeable) p2);
                return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } catch (Exception e2) {
                getRatingType.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentbindingInflater1);
                throw e2;
            }
        } catch (Throwable th12) {
            getRatingType.b((Closeable) p2);
            throw th12;
        }
    }

    private final Request TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Request.Builder builderHeaders = new Request.Builder().url(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).headers(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d());
        Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        for (Map.Entry<Class<?>, Object> entry : ((IMediaControllerCallback) getStarRating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1785821996, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1785821996, objArr, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).b().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "");
            builderHeaders.tag(key, entry.getValue());
        }
        boolean readEnabled = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder().getReadEnabled();
        boolean readEnabled2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                builderHeaders.cacheControl(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder().getWriteEnabled()) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return builderHeaders.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Request request, Continuation<? super Response> continuation) throws Exception {
        HttpUriFetcher$executeNetworkRequest$1 httpUriFetcher$executeNetworkRequest$1;
        Response responseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (continuation instanceof HttpUriFetcher$executeNetworkRequest$1) {
            httpUriFetcher$executeNetworkRequest$1 = (HttpUriFetcher$executeNetworkRequest$1) continuation;
            if ((httpUriFetcher$executeNetworkRequest$1.label & Integer.MIN_VALUE) != 0) {
                httpUriFetcher$executeNetworkRequest$1.label -= Integer.MIN_VALUE;
            } else {
                httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuation);
            }
        } else {
            httpUriFetcher$executeNetworkRequest$1 = new HttpUriFetcher$executeNetworkRequest$1(this, continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = httpUriFetcher$executeNetworkRequest$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = httpUriFetcher$executeNetworkRequest$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (getRatingType.b()) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface().getReadEnabled()) {
                    throw new NetworkOnMainThreadException();
                }
                responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.getValue().newCall(request));
            } else {
                Call callNewCall = this.b.getValue().newCall(request);
                httpUriFetcher$executeNetworkRequest$1.label = 1;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = IMediaSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2(callNewCall, httpUriFetcher$executeNetworkRequest$1);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.isSuccessful() || responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.code() == 304) {
                return responseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            ResponseBody responseBodyBody = responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.body();
            if (responseBodyBody != null) {
                getRatingType.b(responseBodyBody);
            }
            throw new HttpException(responseTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Response) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.isSuccessful()) {
        }
        return responseTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, MediaType p1) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String string = p1 != null ? p1.toString() : null;
        if ((string == null || StringsKt.startsWith$default(string, "text/plain", false, 2, (Object) null)) && (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MimeTypeMap.getSingleton(), p0)) != null) {
            return strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (string != null) {
            return StringsKt.substringBefore$default(string, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    private final boolean TuitionPaymentFragmentbindingInflater1(Request p0, Response p1) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder().getWriteEnabled()) {
            return false;
        }
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return true;
        }
        putText.Companion companion = putText.INSTANCE;
        return putText.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
    }

    private final scaleBitmap TuitionPaymentFragmentbindingInflater1(fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) throws Throwable {
        scaleBitmap scalebitmap;
        Throwable th;
        try {
            RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1()));
            try {
                scalebitmap = new scaleBitmap(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                try {
                    rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
                scalebitmap = null;
                th = th3;
            }
            if (th == null) {
                return scalebitmap;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private final MediaBrowserCompatApi23ItemCallback b(fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        return MediaBrowserCompatApi26SubscriptionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TuitionPaymentFragmentbindingInflater1(), b(), tuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private final MediaBrowserCompatApi23ItemCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2(ResponseBody responseBody) {
        return new MediaBrowserCompatApi26SubscriptionCallbackProxy(responseBody.getSource(), new MediaDescriptionCompat(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), null);
    }

    private final String b() {
        String strA = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a();
        return strA == null ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : strA;
    }

    private final animateToFullOpacity TuitionPaymentFragmentbindingInflater1() {
        fromMediaDescription value = this.TuitionPaymentFragmentbindingInflater1.getValue();
        Intrinsics.checkNotNull(value);
        return value.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static final class b implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Uri> {
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Lazy<Call.Factory> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final Lazy<fromMediaDescription> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Lazy<? extends Call.Factory> lazy, Lazy<? extends fromMediaDescription> lazy2, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lazy;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lazy2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, getStarRating getstarrating) {
            if (b(uri)) {
                return new setIconUri(uri.toString(), getstarrating, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            return null;
        }

        private static boolean b(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https");
        }
    }
}
