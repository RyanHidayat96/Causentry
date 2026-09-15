package com.bpjstku.presentation.membership.registration;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityChooseNationalityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ChooseNationalityActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityChooseNationalityBinding> {
    public static final ChooseNationalityActivity$bindingInflater$1 b = new ChooseNationalityActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityChooseNationalityBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityChooseNationalityBinding.inflate(layoutInflater);
    }

    ChooseNationalityActivity$bindingInflater$1() {
        super(1, ActivityChooseNationalityBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityChooseNationalityBinding;", 0);
    }
}
