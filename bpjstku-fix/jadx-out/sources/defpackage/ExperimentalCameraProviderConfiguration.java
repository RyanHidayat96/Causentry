package defpackage;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"LExperimentalCameraProviderConfiguration;", "", "<init>", "()V", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Landroid/content/Context;", "p0", "", "b", "(Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0})
public final class ExperimentalCameraProviderConfiguration {
    public static final ExperimentalCameraProviderConfiguration INSTANCE = new ExperimentalCameraProviderConfiguration();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private static Context b;

    private ExperimentalCameraProviderConfiguration() {
    }

    @JvmStatic
    public static final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Context context = b;
        if (context == null) {
            throw new IllegalStateException("call init first");
        }
        if (context == null) {
            Intrinsics.throwNpe();
        }
        return context;
    }

    @JvmStatic
    public static final void b(Context p0) {
        b = p0;
    }
}
