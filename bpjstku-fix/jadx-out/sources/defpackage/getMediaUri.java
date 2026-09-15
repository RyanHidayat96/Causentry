package defpackage;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0003\u0015\u001c\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0011\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0013\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u000e\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e"}, d2 = {"LgetMediaUri;", "LfromMediaDescription;", "", "p0", "LSurfaceViewImplementationExternalSyntheticLambda1;", "p1", "LanimateToFullOpacity;", "p2", "Lkotlinx/coroutines/CoroutineDispatcher;", "p3", "<init>", "(JLSurfaceViewImplementationExternalSyntheticLambda1;LanimateToFullOpacity;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)LfromMediaDescription$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Ljava/lang/String;", "b", "J", "()J", "LSurfaceViewImplementationExternalSyntheticLambda1;", "()LSurfaceViewImplementationExternalSyntheticLambda1;", "LanimateToFullOpacity;", "()LanimateToFullOpacity;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetIconUri;", "LgetIconUri;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMediaUri implements fromMediaDescription {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final getIconUri TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final animateToFullOpacity TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentbindingInflater1;

    public getMediaUri(long j, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity animatetofullopacity, CoroutineDispatcher coroutineDispatcher) {
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceViewImplementationExternalSyntheticLambda1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = animatetofullopacity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getIconUri(getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), getTuitionPaymentFragmentspecialinlinedviewModeldefault2(), coroutineDispatcher, getTuitionPaymentFragmentbindingInflater1());
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    private long getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    private SurfaceViewImplementationExternalSyntheticLambda1 getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.fromMediaDescription
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final animateToFullOpacity getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.fromMediaDescription
    public final fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0));
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? new b(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
    }

    @Override // defpackage.fromMediaDescription
    public final fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(String p0) {
        getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0));
        return tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3) : null;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        ByteString.Companion companion = ByteString.INSTANCE;
        return ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str).b("SHA-256").TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    static final class b implements fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private final getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;

        public b(getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0);
        }

        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.TuitionPaymentFragmentbindingInflater1.close();
        }

        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final /* synthetic */ fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? new TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentspecialinlinedviewModeldefault3) : null;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0);
        }

        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final SurfaceViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
        public b TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            getIconUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                return new b(tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            return null;
        }

        @Override // fromMediaDescription.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void b() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        }
    }
}
