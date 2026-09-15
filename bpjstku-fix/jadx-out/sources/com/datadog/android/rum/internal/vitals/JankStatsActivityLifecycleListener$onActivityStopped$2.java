package com.datadog.android.rum.internal.vitals;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class JankStatsActivityLifecycleListener$onActivityStopped$2 extends Lambda implements Function1<WeakReference<Activity>, Boolean> {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final /* synthetic */ Activity $activity;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        return Boolean.valueOf(weakReference.get() == null || Intrinsics.areEqual(weakReference.get(), this.$activity));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JankStatsActivityLifecycleListener$onActivityStopped$2(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 6904744;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }
}
