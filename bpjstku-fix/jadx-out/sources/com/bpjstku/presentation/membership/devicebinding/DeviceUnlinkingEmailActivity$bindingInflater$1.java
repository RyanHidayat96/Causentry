package com.bpjstku.presentation.membership.devicebinding;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDeviceUnlinkingEmailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DeviceUnlinkingEmailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDeviceUnlinkingEmailBinding> {
    public static final DeviceUnlinkingEmailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new DeviceUnlinkingEmailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityDeviceUnlinkingEmailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDeviceUnlinkingEmailBinding.inflate(layoutInflater);
    }

    DeviceUnlinkingEmailActivity$bindingInflater$1() {
        super(1, ActivityDeviceUnlinkingEmailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDeviceUnlinkingEmailBinding;", 0);
    }
}
