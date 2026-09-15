package com.bpjstku.presentation.about;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAboutBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AboutActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAboutBinding> {
    public static final AboutActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AboutActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityAboutBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAboutBinding.inflate(layoutInflater);
    }

    AboutActivity$bindingInflater$1() {
        super(1, ActivityAboutBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAboutBinding;", 0);
    }
}
