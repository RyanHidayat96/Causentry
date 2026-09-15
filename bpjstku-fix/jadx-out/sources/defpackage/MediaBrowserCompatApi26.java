package defpackage;

import coil.decode.ExifOrientationPolicy;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatApi26 {
    private static final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SetsKt.setOf((Object[]) new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    public static final boolean b(MediaBrowserCompatApi21SubscriptionCallbackProxy mediaBrowserCompatApi21SubscriptionCallbackProxy) {
        return mediaBrowserCompatApi21SubscriptionCallbackProxy.getTuitionPaymentFragmentspecialinlinedviewModeldefault2() == 90 || mediaBrowserCompatApi21SubscriptionCallbackProxy.getTuitionPaymentFragmentspecialinlinedviewModeldefault2() == 270;
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaBrowserCompatApi21SubscriptionCallbackProxy mediaBrowserCompatApi21SubscriptionCallbackProxy) {
        return mediaBrowserCompatApi21SubscriptionCallbackProxy.getTuitionPaymentFragmentspecialinlinedviewModeldefault2() > 0;
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExifOrientationPolicy exifOrientationPolicy, String str) {
        int i = MediaBrowserCompatApi26$TuitionPaymentFragmentspecialinlinedviewModeldefault3$WhenMappings.$EnumSwitchMapping$0[exifOrientationPolicy.ordinal()];
        if (i == 1) {
            return str != null && TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(str);
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
