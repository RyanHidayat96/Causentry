package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p002lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.size.Scale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompatStarStyle {
    private final pause TuitionPaymentFragmentbindingInflater1;
    private final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final isCaptioningEnabled TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public RatingCompatStarStyle(writeToParcel writetoparcel, pause pauseVar, getVolumeAttributes getvolumeattributes) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = writetoparcel;
        this.TuitionPaymentFragmentbindingInflater1 = pauseVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getPlaybackState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getvolumeattributes);
    }

    public final getPercentRating b(newUnratedRating newunratedrating, VideoMimeInfoBuilder videoMimeInfoBuilder) {
        Lifecycle write = newunratedrating.getWrite();
        onShuffleModeChangedRemoved subscribe = newunratedrating.getSubscribe();
        if (subscribe instanceof onShuffleModeChanged) {
            return new RatingCompatStyle(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, newunratedrating, (onShuffleModeChanged) subscribe, write, videoMimeInfoBuilder);
        }
        return new ParceledListSliceAdapterApi21(write, videoMimeInfoBuilder);
    }

    public static newPercentageRating TuitionPaymentFragmentspecialinlinedviewModeldefault1(newUnratedRating newunratedrating, Throwable th) {
        Drawable drawableTuitionPaymentFragmentbindingInflater1;
        if (!(th instanceof NullRequestDataException) || (drawableTuitionPaymentFragmentbindingInflater1 = getQueueTitle.TuitionPaymentFragmentbindingInflater1(newunratedrating, newunratedrating.b, newunratedrating.TuitionPaymentFragmentbindingInflater1, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel)) == null) {
            drawableTuitionPaymentFragmentbindingInflater1 = getQueueTitle.TuitionPaymentFragmentbindingInflater1(newunratedrating, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault2, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3, newunratedrating.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact);
        }
        return new newPercentageRating(drawableTuitionPaymentFragmentbindingInflater1, newunratedrating, th);
    }

    public final getStarRating b(newUnratedRating newunratedrating, onQueueTitleChanged onqueuetitlechanged) {
        Scale search;
        Bitmap.Config asBinder = (TuitionPaymentFragmentspecialinlinedviewModeldefault2(newunratedrating) && TuitionPaymentFragmentspecialinlinedviewModeldefault3(newunratedrating, onqueuetitlechanged)) ? newunratedrating.getAsBinder() : Bitmap.Config.ARGB_8888;
        if (Intrinsics.areEqual(onqueuetitlechanged.getTuitionPaymentFragmentspecialinlinedviewModeldefault1(), onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE) || Intrinsics.areEqual(onqueuetitlechanged.getTuitionPaymentFragmentspecialinlinedviewModeldefault3(), onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE)) {
            search = Scale.FIT;
        } else {
            search = newunratedrating.getSearch();
        }
        return new getStarRating(newunratedrating.getINotificationSideChannel(), asBinder, newunratedrating.getCancelAll(), onqueuetitlechanged, search, getQueueTitle.TuitionPaymentFragmentbindingInflater1(newunratedrating), newunratedrating.getD() && newunratedrating.sendCustomAction().isEmpty() && asBinder != Bitmap.Config.ALPHA_8, newunratedrating.getSendCustomAction(), newunratedrating.getINotificationSideChannelDefault(), newunratedrating.getMediaBrowserCompat(), newunratedrating.getUnsubscribe(), newunratedrating.getGetRoot(), newunratedrating.getDisconnect(), newunratedrating.getINotificationSideChannelStubProxy(), newunratedrating.getGetExtras());
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(newUnratedRating newunratedrating, Bitmap.Config config) {
        if (!fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault3(config)) {
            return true;
        }
        if (!newunratedrating.getF1280a()) {
            return false;
        }
        onShuffleModeChangedRemoved subscribe = newunratedrating.getSubscribe();
        if (subscribe instanceof onShuffleModeChanged) {
            View viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((onShuffleModeChanged) subscribe).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (viewTuitionPaymentFragmentspecialinlinedviewModeldefault2.isAttachedToWindow() && !viewTuitionPaymentFragmentspecialinlinedviewModeldefault2.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final getStarRating b(getStarRating getstarrating) {
        boolean z;
        Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CachePolicy cachePolicyAsInterface = getstarrating.asInterface();
        boolean z2 = true;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(getstarrating)) {
            z = false;
        } else {
            configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bitmap.Config.ARGB_8888;
            z = true;
        }
        if (!getstarrating.asInterface().getReadEnabled() || this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            z2 = z;
        } else {
            cachePolicyAsInterface = CachePolicy.DISABLED;
        }
        return z2 ? getStarRating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getstarrating, configTuitionPaymentFragmentspecialinlinedviewModeldefault3, cachePolicyAsInterface) : getstarrating;
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(getStarRating getstarrating) {
        return !fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getstarrating.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(newUnratedRating newunratedrating, onQueueTitleChanged onqueuetitlechanged) {
        if (fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault3(newunratedrating.getAsBinder())) {
            return TuitionPaymentFragmentbindingInflater1(newunratedrating, newunratedrating.getAsBinder()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onqueuetitlechanged);
        }
        return true;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(newUnratedRating newunratedrating) {
        return newunratedrating.sendCustomAction().isEmpty() || ArraysKt.contains(getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), newunratedrating.getAsBinder());
    }
}
