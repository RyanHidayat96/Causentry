package defpackage;

import com.bpjstku.data.jht.model.response.JhtClaimContributionItem;
import com.bpjstku.data.jht.model.response.JhtClaimContributionList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b"}, d2 = {"LComponentActivityExternalSyntheticLambda0;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionItem;", "LstartActivityForResult;", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/jht/model/response/JhtClaimContributionList;", "LremoveOnUserLeaveHintListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComponentActivityExternalSyntheticLambda0 {
    public static final ComponentActivityExternalSyntheticLambda0 INSTANCE = new ComponentActivityExternalSyntheticLambda0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Function1<JhtClaimContributionItem, startActivityForResult> TuitionPaymentFragmentbindingInflater1 = new Function1() { // from class: startIntentSenderForResult
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ComponentActivityExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1((JhtClaimContributionItem) obj);
        }
    };
    private static final Function1<JhtClaimContributionList, removeOnUserLeaveHintListener> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Function1() { // from class: ComponentActivityExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ComponentActivityExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1((JhtClaimContributionList) obj);
        }
    };

    private ComponentActivityExternalSyntheticLambda0() {
    }

    public static Function1<JhtClaimContributionItem, startActivityForResult> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ removeOnUserLeaveHintListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(JhtClaimContributionList jhtClaimContributionList) {
        Intrinsics.checkNotNullParameter(jhtClaimContributionList, "");
        String blth = jhtClaimContributionList.getBlth();
        if (blth == null) {
            blth = "";
        }
        String contribution = jhtClaimContributionList.getContribution();
        return new removeOnUserLeaveHintListener(blth, contribution != null ? contribution : "");
    }

    public static /* synthetic */ startActivityForResult TuitionPaymentFragmentbindingInflater1(JhtClaimContributionItem jhtClaimContributionItem) {
        Intrinsics.checkNotNullParameter(jhtClaimContributionItem, "");
        String companyName = jhtClaimContributionItem.getCompanyName();
        String str = companyName != null ? companyName : "";
        List<JhtClaimContributionList> contributions = jhtClaimContributionItem.getContributions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contributions, 10));
        Iterator<T> it = contributions.iterator();
        while (it.hasNext()) {
            arrayList.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke((JhtClaimContributionList) it.next()));
        }
        return new startActivityForResult(str, arrayList);
    }
}
