package defpackage;

import com.bpjstku.data.asik.model.response.OtpRequestItem;
import com.bpjstku.domain.asik.model.OtpAsik;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"LActivityViewModelLazyKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/bpjstku/data/asik/model/response/OtpRequestItem;", "Lcom/bpjstku/domain/asik/model/OtpAsik;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityViewModelLazyKt {
    public static final ActivityViewModelLazyKt INSTANCE = new ActivityViewModelLazyKt();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final Function1<OtpRequestItem, OtpAsik> TuitionPaymentFragmentbindingInflater1 = new Function1() { // from class: ActivityFlags
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ActivityViewModelLazyKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2((OtpRequestItem) obj);
        }
    };

    private ActivityViewModelLazyKt() {
    }

    public static Function1<OtpRequestItem, OtpAsik> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ OtpAsik TuitionPaymentFragmentspecialinlinedviewModeldefault2(OtpRequestItem otpRequestItem) {
        Intrinsics.checkNotNullParameter(otpRequestItem, "");
        String otp = otpRequestItem.getOtp();
        if (otp != null) {
            return new OtpAsik(otp);
        }
        return null;
    }
}
