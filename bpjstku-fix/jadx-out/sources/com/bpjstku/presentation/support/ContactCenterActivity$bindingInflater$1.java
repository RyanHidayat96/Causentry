package com.bpjstku.presentation.support;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityContactCenterBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ContactCenterActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityContactCenterBinding> {
    public static final ContactCenterActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ContactCenterActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityContactCenterBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityContactCenterBinding.inflate(layoutInflater);
    }

    ContactCenterActivity$bindingInflater$1() {
        super(1, ActivityContactCenterBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityContactCenterBinding;", 0);
    }
}
