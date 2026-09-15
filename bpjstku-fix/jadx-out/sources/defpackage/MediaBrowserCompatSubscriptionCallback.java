package defpackage;

import android.graphics.ColorSpace;
import coil.memory.MemoryCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatSubscriptionCallback {
    private static final getCallbacks TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getCallbacks {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // defpackage.getCallbacks
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof newUnratedRating) || !(obj2 instanceof newUnratedRating)) {
                return Intrinsics.areEqual(obj, obj2);
            }
            newUnratedRating newunratedrating = (newUnratedRating) obj;
            newUnratedRating newunratedrating2 = (newUnratedRating) obj2;
            return Intrinsics.areEqual(newunratedrating.getINotificationSideChannel(), newunratedrating2.getINotificationSideChannel()) && Intrinsics.areEqual(newunratedrating.getOnTransact(), newunratedrating2.getOnTransact()) && Intrinsics.areEqual(newunratedrating.getGetNotifyChildrenChangedOptions(), newunratedrating2.getGetNotifyChildrenChangedOptions()) && Intrinsics.areEqual(newunratedrating.getIconCompatParcelizer(), newunratedrating2.getIconCompatParcelizer()) && Intrinsics.areEqual(newunratedrating.getINotificationSideChannelDefault(), newunratedrating2.getINotificationSideChannelDefault()) && newunratedrating.getAsBinder() == newunratedrating2.getAsBinder() && Intrinsics.areEqual(newunratedrating.getCancelAll(), newunratedrating2.getCancelAll()) && Intrinsics.areEqual(newunratedrating.sendCustomAction(), newunratedrating2.sendCustomAction()) && Intrinsics.areEqual(newunratedrating.getMediaBrowserCompat(), newunratedrating2.getMediaBrowserCompat()) && newunratedrating.getG() == newunratedrating2.getG() && newunratedrating.getF1280a() == newunratedrating2.getF1280a() && newunratedrating.getD() == newunratedrating2.getD() && newunratedrating.getSendCustomAction() == newunratedrating2.getSendCustomAction() && newunratedrating.getDisconnect() == newunratedrating2.getDisconnect() && newunratedrating.getINotificationSideChannelStubProxy() == newunratedrating2.getINotificationSideChannelStubProxy() && newunratedrating.getGetExtras() == newunratedrating2.getGetExtras() && Intrinsics.areEqual(newunratedrating.getIsConnected(), newunratedrating2.getIsConnected()) && newunratedrating.getSearch() == newunratedrating2.getSearch() && newunratedrating.getGetSessionToken() == newunratedrating2.getGetSessionToken() && Intrinsics.areEqual(newunratedrating.getGetRoot(), newunratedrating2.getGetRoot());
        }

        @Override // defpackage.getCallbacks
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
            if (!(obj instanceof newUnratedRating)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            newUnratedRating newunratedrating = (newUnratedRating) obj;
            int iHashCode = newunratedrating.getINotificationSideChannel().hashCode();
            int iHashCode2 = newunratedrating.getOnTransact().hashCode();
            MemoryCache.Key getNotifyChildrenChangedOptions = newunratedrating.getGetNotifyChildrenChangedOptions();
            int iHashCode3 = getNotifyChildrenChangedOptions != null ? getNotifyChildrenChangedOptions.hashCode() : 0;
            MemoryCache.Key iconCompatParcelizer = newunratedrating.getIconCompatParcelizer();
            int iHashCode4 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
            String iNotificationSideChannelDefault = newunratedrating.getINotificationSideChannelDefault();
            int iHashCode5 = iNotificationSideChannelDefault != null ? iNotificationSideChannelDefault.hashCode() : 0;
            int iHashCode6 = newunratedrating.getAsBinder().hashCode();
            ColorSpace cancelAll = newunratedrating.getCancelAll();
            int iHashCode7 = cancelAll != null ? cancelAll.hashCode() : 0;
            int iHashCode8 = newunratedrating.sendCustomAction().hashCode();
            int iHashCode9 = newunratedrating.getMediaBrowserCompat().hashCode();
            int iHashCode10 = Boolean.hashCode(newunratedrating.getG());
            int iHashCode11 = Boolean.hashCode(newunratedrating.getF1280a());
            int iHashCode12 = Boolean.hashCode(newunratedrating.getD());
            int iHashCode13 = Boolean.hashCode(newunratedrating.getSendCustomAction());
            int iHashCode14 = newunratedrating.getDisconnect().hashCode();
            int iHashCode15 = newunratedrating.getINotificationSideChannelStubProxy().hashCode();
            int iHashCode16 = newunratedrating.getGetExtras().hashCode();
            return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + newunratedrating.getIsConnected().hashCode()) * 31) + newunratedrating.getSearch().hashCode()) * 31) + newunratedrating.getGetSessionToken().hashCode()) * 31) + newunratedrating.getGetRoot().hashCode();
        }
    }

    public static final getCallbacks TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentbindingInflater1;
    }
}
