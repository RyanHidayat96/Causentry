package com.bpjstku.presentation.membership.devicebinding;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDeviceUnlinkingBiometricBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DeviceUnlinkingBiometricActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDeviceUnlinkingBiometricBinding> {
    public static final DeviceUnlinkingBiometricActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new DeviceUnlinkingBiometricActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityDeviceUnlinkingBiometricBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDeviceUnlinkingBiometricBinding.inflate(layoutInflater);
    }

    DeviceUnlinkingBiometricActivity$bindingInflater$1() {
        super(1, ActivityDeviceUnlinkingBiometricBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDeviceUnlinkingBiometricBinding;", 0);
    }
}
