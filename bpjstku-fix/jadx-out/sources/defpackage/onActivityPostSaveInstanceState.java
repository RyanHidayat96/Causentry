package defpackage;

import com.bpjstku.data.about.AboutRepository;
import com.bpjstku.data.about.model.request.AboutEventRequest;
import com.bpjstku.data.about.model.response.AboutItem;
import com.bpjstku.domain.about.model.About;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class onActivityPostSaveInstanceState implements onActivityPostResumed {
    private final AboutRepository TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public onActivityPostSaveInstanceState(AboutRepository aboutRepository) {
        Intrinsics.checkNotNullParameter(aboutRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = aboutRepository;
    }

    @Override // defpackage.onActivityPostResumed
    public final deriveCodec<About> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AboutEventRequest aboutEventRequest) {
        Intrinsics.checkNotNullParameter(aboutEventRequest, "");
        deriveCodec<AboutItem> aboutEvent = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAboutEvent();
        final Function1 function1 = new Function1() { // from class: onActivityPostPaused
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityPostSaveInstanceState.b((AboutItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onActivityPostCreated
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return onActivityPostSaveInstanceState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(aboutEvent, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ About b(AboutItem aboutItem) {
        Intrinsics.checkNotNullParameter(aboutItem, "");
        onActivityPostDestroyed onactivitypostdestroyed = onActivityPostDestroyed.INSTANCE;
        return onActivityPostDestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2().invoke(aboutItem);
    }

    public static /* synthetic */ About TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (About) function1.invoke(obj);
    }
}
