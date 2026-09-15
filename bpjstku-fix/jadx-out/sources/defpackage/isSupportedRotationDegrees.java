package defpackage;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"LisSupportedRotationDegrees;", "", "", "b", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface isSupportedRotationDegrees {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.TuitionPaymentFragmentbindingInflater1;

    int b();

    /* JADX INFO: renamed from: isSupportedRotationDegrees$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion TuitionPaymentFragmentbindingInflater1 = new Companion();
        private static final isSupportedRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new C0161TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        private Companion() {
        }

        /* JADX INFO: renamed from: isSupportedRotationDegrees$TuitionPaymentFragmentspecialinlinedviewModeldefault1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: collision with other inner class name */
        public static final class C0161TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements isSupportedRotationDegrees {
            private final int b = Build.VERSION.SDK_INT;

            C0161TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // defpackage.isSupportedRotationDegrees
            public final int b() {
                return this.b;
            }
        }

        public static isSupportedRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
