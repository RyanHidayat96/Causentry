package com.bpjstku.presentation.membership.registration.salariedworker;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import defpackage.PreviewCapabilitiesImpl;
import defpackage.getFocusY;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.mapPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroid/arch/lifecycle/ViewModel;", "org/koin/android/viewmodel/ext/android/FragmentExtKt$sharedViewModel$2"}, k = 3, mv = {2, 1, 0})
public final class SalariedWorkerTermAndConditionFragment$special$$inlined$sharedViewModel$default$2 extends Lambda implements Function0<getUntrustedCreatorPackageName> {
    final /* synthetic */ Function0 $from;
    final /* synthetic */ Fragment $this_sharedViewModel;
    final /* synthetic */ mapPoint $qualifier = null;
    final /* synthetic */ Function0 $parameters = null;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
        return getFocusY.b(this.$this_sharedViewModel, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, this.$from, this.$parameters);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SalariedWorkerTermAndConditionFragment$special$$inlined$sharedViewModel$default$2(Fragment fragment, Function0 function0) {
        super(0);
        this.$this_sharedViewModel = fragment;
        this.$from = function0;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        PreviewCapabilitiesImpl.b[0] = Class.forName("com.google.gson.internal.ConstructorConstructor$12").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault2");
    }
}
