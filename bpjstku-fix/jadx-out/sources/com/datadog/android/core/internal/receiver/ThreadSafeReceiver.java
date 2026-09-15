package com.datadog.android.core.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/IntentFilter;", "p1", "Landroid/content/Intent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Landroid/content/IntentFilter;)Landroid/content/Intent;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class ThreadSafeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicBoolean(false);

    public final Intent TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, IntentFilter p1) {
        Intent intentRegisterReceiver;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (Build.VERSION.SDK_INT >= 33 || Build.VERSION.SDK_INT >= 26) {
            intentRegisterReceiver = p0.registerReceiver(this, p1, 4);
        } else {
            intentRegisterReceiver = p0.registerReceiver(this, p1);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(true);
        return intentRegisterReceiver;
    }

    public final void TuitionPaymentFragmentbindingInflater1(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.compareAndSet(true, false)) {
            p0.unregisterReceiver(this);
        }
    }
}
