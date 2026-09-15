package defpackage;

import com.bpjstku.data.registration.general.model.response.VerificationSignatureItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"LReportDrawnWhen;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Lcom/bpjstku/data/registration/general/model/response/VerificationSignatureItem;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReportDrawnWhen {
    public static final ReportDrawnWhen INSTANCE = new ReportDrawnWhen();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final Function1<VerificationSignatureItem, VerificationSignatureItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Function1() { // from class: ReportDrawnWhenlambda10
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ReportDrawnWhen.TuitionPaymentFragmentspecialinlinedviewModeldefault3((VerificationSignatureItem) obj);
        }
    };

    private ReportDrawnWhen() {
    }

    public static Function1<VerificationSignatureItem, VerificationSignatureItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static /* synthetic */ VerificationSignatureItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(VerificationSignatureItem verificationSignatureItem) {
        Intrinsics.checkNotNullParameter(verificationSignatureItem, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(verificationSignatureItem.getSignature()), TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return new VerificationSignatureItem(String.valueOf(verificationSignatureItem.getOtp()), String.valueOf(verificationSignatureItem.getCheckSum()), strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
