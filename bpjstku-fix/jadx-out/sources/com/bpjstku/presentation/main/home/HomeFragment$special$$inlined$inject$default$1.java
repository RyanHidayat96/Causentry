package com.bpjstku.presentation.main.home;

import android.content.ComponentCallbacks;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
public final class HomeFragment$special$$inlined$inject$default$1 extends Lambda implements Function0<ActivityResultContractsPickVisualMediaMediaCapabilities> {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final /* synthetic */ ComponentCallbacks $this_inject;
    final /* synthetic */ mapPoint $qualifier = null;
    final /* synthetic */ Function0 $parameters = null;

    /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
        ComponentCallbacks componentCallbacks = this.$this_inject;
        return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$special$$inlined$inject$default$1(ComponentCallbacks componentCallbacks) {
        super(0);
        this.$this_inject = componentCallbacks;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 6669249;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iElapsedRealtime;
        return iElapsedRealtime;
    }
}
