package com.bpjstku.presentation.membership.devicebinding;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDeviceUnlinkingSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DeviceUnlinkingSuccessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDeviceUnlinkingSuccessBinding> {
    public static final DeviceUnlinkingSuccessActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new DeviceUnlinkingSuccessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityDeviceUnlinkingSuccessBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDeviceUnlinkingSuccessBinding.inflate(layoutInflater);
    }

    DeviceUnlinkingSuccessActivity$bindingInflater$1() {
        super(1, ActivityDeviceUnlinkingSuccessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDeviceUnlinkingSuccessBinding;", 0);
    }
}
