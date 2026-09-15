package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class getQueueTitle {
    private static final MediaMetadataCompatApi21Builder TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MediaMetadataCompatApi21Builder(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public static final MediaMetadataCompatApi21Builder TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final Drawable TuitionPaymentFragmentbindingInflater1(newUnratedRating newunratedrating, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context iNotificationSideChannel = newunratedrating.getINotificationSideChannel();
        int iIntValue = num.intValue();
        Drawable drawable3 = AppCompatResources.getDrawable(iNotificationSideChannel, iIntValue);
        if (drawable3 != null) {
            return drawable3;
        }
        throw new IllegalStateException("Invalid resource ID: ".concat(String.valueOf(iIntValue)).toString());
    }

    public static final boolean TuitionPaymentFragmentbindingInflater1(newUnratedRating newunratedrating) {
        int i = getQueueTitle$TuitionPaymentFragmentspecialinlinedviewModeldefault2$WhenMappings.$EnumSwitchMapping$0[newunratedrating.getGetSessionToken().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (newunratedrating.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault3() == null && (newunratedrating.getIsConnected() instanceof onCaptioningEnabledChanged)) {
            return true;
        }
        return (newunratedrating.getSubscribe() instanceof onShuffleModeChanged) && (newunratedrating.getIsConnected() instanceof onSessionDestroyed) && (((onShuffleModeChanged) newunratedrating.getSubscribe()).TuitionPaymentFragmentspecialinlinedviewModeldefault2() instanceof ImageView) && ((onShuffleModeChanged) newunratedrating.getSubscribe()).TuitionPaymentFragmentspecialinlinedviewModeldefault2() == ((onSessionDestroyed) newunratedrating.getIsConnected()).TuitionPaymentFragmentbindingInflater1();
    }
}
