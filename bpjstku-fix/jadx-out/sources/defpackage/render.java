package defpackage;

import com.koushikdutta.async.AsyncServer;
import com.koushikdutta.async.http.BodyDecoderException;
import com.koushikdutta.async.http.filter.ChunkedInputFilter;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class render {

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends lambdaexecuteSafely11 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* JADX INFO: renamed from: render$TuitionPaymentFragmentspecialinlinedviewModeldefault3$5, reason: invalid class name */
        static final class AnonymousClass5 implements Runnable {
            private /* synthetic */ Exception TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            AnonymousClass5(Exception exc) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static checkReadyToRelease TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkReadyToRelease checkreadytorelease, getOutSurfaceOrThrow getoutsurfaceorthrow) {
        long j;
        lambdaexecuteSafely11 chunkedInputFilter;
        lambdaexecuteSafely11 hasprovider;
        try {
            String strTuitionPaymentFragmentbindingInflater1 = getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Content-Length".toLowerCase(Locale.US));
            j = strTuitionPaymentFragmentbindingInflater1 != null ? Long.parseLong(strTuitionPaymentFragmentbindingInflater1) : -1L;
        } catch (NumberFormatException unused) {
        }
        if (-1 == j) {
            if ("chunked".equalsIgnoreCase(getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Transfer-Encoding".toLowerCase(Locale.US)))) {
                chunkedInputFilter = new ChunkedInputFilter();
                chunkedInputFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
            }
            if ("gzip".equals(getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Content-Encoding".toLowerCase(Locale.US)))) {
                hasprovider = new lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge();
                hasprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
            } else {
                if ("deflate".equals(getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Content-Encoding".toLowerCase(Locale.US)))) {
                    return checkreadytorelease;
                }
                hasprovider = new hasProvider();
                hasprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
            }
            return hasprovider;
        }
        if (j < 0) {
            AsyncServer asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkreadytorelease.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            BodyDecoderException bodyDecoderException = new BodyDecoderException("not using chunked encoding, and no content-length found.");
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault3.new AnonymousClass5(bodyDecoderException), 0L);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (j == 0) {
            AsyncServer asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault4 = checkreadytorelease.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault4.new AnonymousClass5(null), 0L);
            tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
            return tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        }
        chunkedInputFilter = new notifyTransformationInfoUpdate(j);
        chunkedInputFilter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
        checkreadytorelease = chunkedInputFilter;
        if ("gzip".equals(getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Content-Encoding".toLowerCase(Locale.US)))) {
            hasprovider = new lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge();
            hasprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
        } else {
            if ("deflate".equals(getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Content-Encoding".toLowerCase(Locale.US)))) {
                return checkreadytorelease;
            }
            hasprovider = new hasProvider();
            hasprovider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkreadytorelease);
        }
        return hasprovider;
    }

    public static long b(getOutSurfaceOrThrow getoutsurfaceorthrow) {
        String strTuitionPaymentFragmentbindingInflater1 = getoutsurfaceorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1("Content-Length".toLowerCase(Locale.US));
        if (strTuitionPaymentFragmentbindingInflater1 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strTuitionPaymentFragmentbindingInflater1);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
