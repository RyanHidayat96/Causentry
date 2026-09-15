package com.bpjstku.presentation.loyalti;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityListFeatureLoyaltiBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ListFeatureLoyaltiActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityListFeatureLoyaltiBinding> {
    public static final ListFeatureLoyaltiActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ListFeatureLoyaltiActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityListFeatureLoyaltiBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityListFeatureLoyaltiBinding.inflate(layoutInflater);
    }

    ListFeatureLoyaltiActivity$bindingInflater$1() {
        super(1, ActivityListFeatureLoyaltiBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityListFeatureLoyaltiBinding;", 0);
    }
}
