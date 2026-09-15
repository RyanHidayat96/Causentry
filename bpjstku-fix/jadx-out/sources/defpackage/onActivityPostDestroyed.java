package defpackage;

import com.bpjstku.data.about.model.response.AboutItem;
import com.bpjstku.domain.about.model.About;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"LonActivityPostDestroyed;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/bpjstku/data/about/model/response/AboutItem;", "Lcom/bpjstku/domain/about/model/About;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lkotlin/jvm/functions/Function1;", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onActivityPostDestroyed {
    public static final onActivityPostDestroyed INSTANCE = new onActivityPostDestroyed();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static final Function1<AboutItem, About> b = new Function1() { // from class: onActivityPreDestroyed
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return onActivityPostDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2((AboutItem) obj);
        }
    };

    private onActivityPostDestroyed() {
    }

    public static Function1<AboutItem, About> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return b;
    }

    public static /* synthetic */ About TuitionPaymentFragmentspecialinlinedviewModeldefault2(AboutItem aboutItem) {
        Intrinsics.checkNotNullParameter(aboutItem, "");
        String about = aboutItem.getAbout();
        if (about == null) {
            about = "";
        }
        String email = aboutItem.getEmail();
        if (email == null) {
            email = "";
        }
        String phone = aboutItem.getPhone();
        return new About(about, email, phone != null ? phone : "");
    }
}
