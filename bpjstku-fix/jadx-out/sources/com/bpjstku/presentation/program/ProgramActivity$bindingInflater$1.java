package com.bpjstku.presentation.program;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityProgramBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ProgramActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityProgramBinding> {
    public static final ProgramActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ProgramActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityProgramBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityProgramBinding.inflate(layoutInflater);
    }

    ProgramActivity$bindingInflater$1() {
        super(1, ActivityProgramBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityProgramBinding;", 0);
    }
}
