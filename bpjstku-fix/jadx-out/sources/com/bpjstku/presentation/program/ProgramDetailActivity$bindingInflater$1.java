package com.bpjstku.presentation.program;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityProgramDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ProgramDetailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityProgramDetailBinding> {
    public static final ProgramDetailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ProgramDetailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityProgramDetailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityProgramDetailBinding.inflate(layoutInflater);
    }

    ProgramDetailActivity$bindingInflater$1() {
        super(1, ActivityProgramDetailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityProgramDetailBinding;", 0);
    }
}
