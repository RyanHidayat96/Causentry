package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.asik.model.Asik;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"LonServicesDiscovered;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/domain/asik/model/Asik;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onServicesDiscovered {
    public static final onServicesDiscovered INSTANCE = new onServicesDiscovered();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private static final Function1<BaseItem, Asik> TuitionPaymentFragmentbindingInflater1 = new Function1() { // from class: z
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return onServicesDiscovered.b((BaseItem) obj);
        }
    };

    private onServicesDiscovered() {
    }

    public static Function1<BaseItem, Asik> TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ Asik b(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return new Asik(baseItem.getIsSuccessful(), baseItem.getMessage(), "", "");
    }
}
