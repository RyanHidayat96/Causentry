package com.bpjstku.presentation.asik.resign.nonsalariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikResignNonSalariedJobDescriptionFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding> {
    public static final AsikResignNonSalariedJobDescriptionFragment$bindingInflater$1 b = new AsikResignNonSalariedJobDescriptionFragment$bindingInflater$1();

    public final FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return b(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikResignNonSalariedJobDescriptionFragment$bindingInflater$1() {
        super(3, FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding;", 0);
    }
}
