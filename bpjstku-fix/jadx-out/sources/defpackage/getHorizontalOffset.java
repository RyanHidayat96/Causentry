package defpackage;

import android.content.Context;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingVerificationActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getHorizontalOffset implements Function0 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ DeviceUnlinkingVerificationActivity b;

    public /* synthetic */ getHorizontalOffset(DeviceUnlinkingVerificationActivity deviceUnlinkingVerificationActivity) {
        this.b = deviceUnlinkingVerificationActivity;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 6232775;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = layoutDirection;
        return layoutDirection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return DeviceUnlinkingVerificationActivity.b(this.b);
    }
}
