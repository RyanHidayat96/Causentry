package defpackage;

import com.bpjstku.data.partners.model.response.PartnerItem;
import com.bpjstku.domain.partners.model.Partner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LremoveReporter;", "", "<init>", "()V", "Lcom/bpjstku/data/partners/model/response/PartnerItem;", "Lcom/bpjstku/domain/partners/model/Partner;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/data/partners/model/response/PartnerItem;)Lcom/bpjstku/domain/partners/model/Partner;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class removeReporter {
    public static final removeReporter INSTANCE = new removeReporter();

    private removeReporter() {
    }

    public static Partner TuitionPaymentFragmentspecialinlinedviewModeldefault3(PartnerItem partnerItem) {
        Intrinsics.checkNotNullParameter(partnerItem, "");
        String address = partnerItem.getAddress();
        if (address == null) {
            address = "";
        }
        String ppkName = partnerItem.getPpkName();
        if (ppkName == null) {
            ppkName = "";
        }
        String ppkNumber = partnerItem.getPpkNumber();
        if (ppkNumber == null) {
            ppkNumber = "";
        }
        String partnerCode = partnerItem.getPartnerCode();
        return new Partner(address, ppkName, ppkNumber, partnerCode != null ? partnerCode : "");
    }
}
