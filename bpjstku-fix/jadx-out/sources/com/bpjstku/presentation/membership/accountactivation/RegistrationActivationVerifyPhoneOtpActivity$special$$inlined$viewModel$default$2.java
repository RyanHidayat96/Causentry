package com.bpjstku.presentation.membership.accountactivation;

import android.content.ComponentCallbacks;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.isSticky;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroid/arch/lifecycle/ViewModel;", "org/koin/android/viewmodel/ext/android/LifecycleOwnerExtKt$viewModel$2"}, k = 3, mv = {2, 1, 0})
public final class RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2 extends Lambda implements Function0<isSticky> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static int b;
    final /* synthetic */ LifecycleOwner $this_viewModel;
    final /* synthetic */ mapPoint $qualifier = null;
    final /* synthetic */ Function0 $parameters = null;

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, isSticky] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ isSticky invoke() {
        LifecycleOwner lifecycleOwner = this.$this_viewModel;
        mapPoint mappoint = this.$qualifier;
        Function0 function0 = this.$parameters;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(isSticky.class);
        if (lifecycleOwner != null) {
            ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
            return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationActivationVerifyPhoneOtpActivity$special$$inlined$viewModel$default$2(LifecycleOwner lifecycleOwner) {
        super(0);
        this.$this_viewModel = lifecycleOwner;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = b;
        int i2 = i % 7291023;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }
}
