package com.bpjstku.presentation.membership.accountactivation.salariedworker;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModelStoreOwner;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Landroidx/lifecycle/ViewModelStoreOwner;"}, k = 3, mv = {2, 1, 0})
public final class SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1 extends Lambda implements Function0<ViewModelStoreOwner> {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final /* synthetic */ Fragment $this_sharedViewModel;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ViewModelStoreOwner invoke() {
        FragmentActivity activity = this.$this_sharedViewModel.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1(Fragment fragment) {
        super(0);
        this.$this_sharedViewModel = fragment;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 9710462;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }
}
