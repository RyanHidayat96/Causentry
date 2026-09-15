package com.bpjstku.presentation.asik.resign;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAsikResignProgramBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AsikResignProgramActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAsikResignProgramBinding> {
    public static final AsikResignProgramActivity$bindingInflater$1 b = new AsikResignProgramActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityAsikResignProgramBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAsikResignProgramBinding.inflate(layoutInflater);
    }

    AsikResignProgramActivity$bindingInflater$1() {
        super(1, ActivityAsikResignProgramBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAsikResignProgramBinding;", 0);
    }
}
