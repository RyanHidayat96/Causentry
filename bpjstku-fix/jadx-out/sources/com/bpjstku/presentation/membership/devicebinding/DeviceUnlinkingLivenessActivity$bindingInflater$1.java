package com.bpjstku.presentation.membership.devicebinding;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDeviceUnlinkingLivenessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DeviceUnlinkingLivenessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDeviceUnlinkingLivenessBinding> {
    public static final DeviceUnlinkingLivenessActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new DeviceUnlinkingLivenessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityDeviceUnlinkingLivenessBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDeviceUnlinkingLivenessBinding.inflate(layoutInflater);
    }

    DeviceUnlinkingLivenessActivity$bindingInflater$1() {
        super(1, ActivityDeviceUnlinkingLivenessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDeviceUnlinkingLivenessBinding;", 0);
    }
}
