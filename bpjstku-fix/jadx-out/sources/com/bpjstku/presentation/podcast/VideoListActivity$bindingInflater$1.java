package com.bpjstku.presentation.podcast;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVideoListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VideoListActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVideoListBinding> {
    public static final VideoListActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new VideoListActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityVideoListBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVideoListBinding.inflate(layoutInflater);
    }

    VideoListActivity$bindingInflater$1() {
        super(1, ActivityVideoListBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVideoListBinding;", 0);
    }
}
