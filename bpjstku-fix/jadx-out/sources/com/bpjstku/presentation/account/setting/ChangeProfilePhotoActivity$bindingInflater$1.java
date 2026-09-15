package com.bpjstku.presentation.account.setting;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityChangePhotoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ChangeProfilePhotoActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityChangePhotoBinding> {
    public static final ChangeProfilePhotoActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ChangeProfilePhotoActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityChangePhotoBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityChangePhotoBinding.inflate(layoutInflater);
    }

    ChangeProfilePhotoActivity$bindingInflater$1() {
        super(1, ActivityChangePhotoBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityChangePhotoBinding;", 0);
    }
}
