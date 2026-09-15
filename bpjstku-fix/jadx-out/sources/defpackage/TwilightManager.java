package defpackage;

import id.vida.liveness.dto.VidaLivenessResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"LTwilightManager;", "", "<init>", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "LTwilightManager$TuitionPaymentFragmentbindingInflater1;", "LTwilightManager$TuitionPaymentFragmentspecialinlinedviewModeldefault1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class TwilightManager {

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends TwilightManager {
        public final VidaLivenessResponse TuitionPaymentFragmentbindingInflater1;
        public final List<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(VidaLivenessResponse vidaLivenessResponse, List<byte[]> list) {
            super(null);
            Intrinsics.checkNotNullParameter(vidaLivenessResponse, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentbindingInflater1 = vidaLivenessResponse;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        }

        public final String toString() {
            VidaLivenessResponse vidaLivenessResponse = this.TuitionPaymentFragmentbindingInflater1;
            List<byte[]> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("Success(response=");
            sb.append(vidaLivenessResponse);
            sb.append(", additionalImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    private TwilightManager() {
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends TwilightManager {
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final VidaLivenessResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(int i, String str, VidaLivenessResponse vidaLivenessResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(vidaLivenessResponse, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.b = vidaLivenessResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentbindingInflater1.b);
        }

        public final int hashCode() {
            return (((Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VidaLivenessResponse vidaLivenessResponse = this.b;
            StringBuilder sb = new StringBuilder("Error(errorCode=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(", response=");
            sb.append(vidaLivenessResponse);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ TwilightManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
