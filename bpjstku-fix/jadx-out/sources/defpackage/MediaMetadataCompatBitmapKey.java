package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.size.Scale;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\u001b\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0018\u0010\u001f\u001a\u00020\u0017*\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$R\u001a\u0010\u0014\u001a\u0004\u0018\u00010%*\u00020\u00138CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010&"}, d2 = {"LMediaMetadataCompatBitmapKey;", "", "LwriteToParcel;", "p0", "LRatingCompatStarStyle;", "p1", "LgetVolumeAttributes;", "p2", "<init>", "(LwriteToParcel;LRatingCompatStarStyle;LgetVolumeAttributes;)V", "LnewUnratedRating;", "LgetStarRating;", "LgetMediaId;", "p3", "Lcoil/memory/MemoryCache$Key;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LnewUnratedRating;Ljava/lang/Object;LgetStarRating;)Lcoil/memory/MemoryCache$Key;", "LonQueueTitleChanged;", "Lcoil/size/Scale;", "Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;", "b", "(LnewUnratedRating;Lcoil/memory/MemoryCache$Key;LonQueueTitleChanged;Lcoil/size/Scale;)Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;", "p4", "", "TuitionPaymentFragmentbindingInflater1", "(LnewUnratedRating;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;LonQueueTitleChanged;Lcoil/size/Scale;)Z", "LnewInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcoil/memory/MemoryCache$Key;LnewUnratedRating;LnewInstance$TuitionPaymentFragmentspecialinlinedviewModeldefault1;)Z", "LfromParcel$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LisThumbUp;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LfromParcel$TuitionPaymentFragmentspecialinlinedviewModeldefault2;LnewUnratedRating;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;)LisThumbUp;", "LwriteToParcel;", "LRatingCompatStarStyle;", "LgetVolumeAttributes;", "(Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;)Z", "", "(Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaMetadataCompatBitmapKey {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final getVolumeAttributes TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final RatingCompatStarStyle TuitionPaymentFragmentbindingInflater1;

    public MediaMetadataCompatBitmapKey(writeToParcel writetoparcel, RatingCompatStarStyle ratingCompatStarStyle, getVolumeAttributes getvolumeattributes) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = writetoparcel;
        this.TuitionPaymentFragmentbindingInflater1 = ratingCompatStarStyle;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getvolumeattributes;
    }

    public final MemoryCache.Key TuitionPaymentFragmentspecialinlinedviewModeldefault3(newUnratedRating newunratedrating, Object obj, getStarRating getstarrating) {
        MemoryCache.Key iconCompatParcelizer = newunratedrating.getIconCompatParcelizer();
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer;
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getCancel().TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj, getstarrating);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        List<IMediaControllerCallbackStub> listSendCustomAction = newunratedrating.sendCustomAction();
        Map<String, String> mapB = newunratedrating.getGetRoot().b();
        if (listSendCustomAction.isEmpty() && mapB.isEmpty()) {
            return new MemoryCache.Key(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, null, 2, null);
        }
        Map mutableMap = MapsKt.toMutableMap(mapB);
        if (!listSendCustomAction.isEmpty()) {
            List<IMediaControllerCallbackStub> listSendCustomAction2 = newunratedrating.sendCustomAction();
            int size = listSendCustomAction2.size();
            for (int i = 0; i < size; i++) {
                mutableMap.put("coil#transformation_".concat(String.valueOf(i)), listSendCustomAction2.get(i).b());
            }
            mutableMap.put("coil#transformation_size", getstarrating.cancel().toString());
        }
        return new MemoryCache.Key(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, mutableMap);
    }

    public final MemoryCache.TuitionPaymentFragmentbindingInflater1 b(newUnratedRating p0, MemoryCache.Key p1, onQueueTitleChanged p2, Scale p3) {
        if (!p0.getDisconnect().getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCacheTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = memoryCacheTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? memoryCacheTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1) : null;
        if (tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || !TuitionPaymentFragmentbindingInflater1(p0, p1, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2, p2, p3)) {
            return null;
        }
        return tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private boolean TuitionPaymentFragmentbindingInflater1(newUnratedRating p0, MemoryCache.Key p1, MemoryCache.TuitionPaymentFragmentbindingInflater1 p2, onQueueTitleChanged p3, Scale p4) {
        if (!RatingCompatStarStyle.TuitionPaymentFragmentbindingInflater1(p0, fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()))) {
            getVolumeAttributes getvolumeattributes = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getvolumeattributes == null || getvolumeattributes.TuitionPaymentFragmentbindingInflater1() > 3) {
                return false;
            }
            Objects.toString(p0.getOnTransact());
            return false;
        }
        return b(p0, p1, p2, p3, p4);
    }

    private final boolean b(newUnratedRating p0, MemoryCache.Key p1, MemoryCache.TuitionPaymentFragmentbindingInflater1 p2, onQueueTitleChanged p3, Scale p4) {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(p2);
        if (onExtrasChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p3)) {
            if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return true;
            }
            getVolumeAttributes getvolumeattributes = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getvolumeattributes != null && getvolumeattributes.TuitionPaymentFragmentbindingInflater1() <= 3) {
                Objects.toString(p0.getOnTransact());
            }
            return false;
        }
        String str = p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().get("coil#transformation_size");
        if (str != null) {
            return Intrinsics.areEqual(str, p3.toString());
        }
        int width = p2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1().getWidth();
        int height = p2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1().getHeight();
        onEvent tuitionPaymentFragmentspecialinlinedviewModeldefault1 = p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = tuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? ((onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) tuitionPaymentFragmentspecialinlinedviewModeldefault1).b : Integer.MAX_VALUE;
        onEvent tuitionPaymentFragmentspecialinlinedviewModeldefault3 = p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? ((onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) tuitionPaymentFragmentspecialinlinedviewModeldefault3).b : Integer.MAX_VALUE;
        double dTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MediaBrowserCompatApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2(width, height, i, i2, p4);
        boolean zTuitionPaymentFragmentbindingInflater1 = getQueueTitle.TuitionPaymentFragmentbindingInflater1(p0);
        if (zTuitionPaymentFragmentbindingInflater1) {
            double dCoerceAtMost = RangesKt.coerceAtMost(dTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1.0d);
            if (Math.abs(((double) i) - (((double) width) * dCoerceAtMost)) <= 1.0d || Math.abs(((double) i2) - (dCoerceAtMost * ((double) height))) <= 1.0d) {
                return true;
            }
        } else if ((getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i) || Math.abs(i - width) <= 1) && (getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2) || Math.abs(i2 - height) <= 1)) {
            return true;
        }
        if (dTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 1.0d && !zTuitionPaymentFragmentbindingInflater1) {
            getVolumeAttributes getvolumeattributes2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getvolumeattributes2 == null || getvolumeattributes2.TuitionPaymentFragmentbindingInflater1() > 3) {
                return false;
            }
            Objects.toString(p0.getOnTransact());
            Objects.toString(p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1());
            Objects.toString(p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Objects.toString(p4);
            return false;
        }
        if (dTuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 1.0d || !zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return true;
        }
        getVolumeAttributes getvolumeattributes3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (getvolumeattributes3 == null || getvolumeattributes3.TuitionPaymentFragmentbindingInflater1() > 3) {
            return false;
        }
        Objects.toString(p0.getOnTransact());
        Objects.toString(p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1());
        Objects.toString(p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Objects.toString(p4);
        return false;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(MemoryCache.Key p0, newUnratedRating p1, newInstance.TuitionPaymentFragmentspecialinlinedviewModeldefault1 p2) {
        MemoryCache memoryCacheTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Bitmap bitmap;
        if (p1.getDisconnect().getWriteEnabled() && (memoryCacheTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) != null && p0 != null) {
            Drawable drawableTuitionPaymentFragmentspecialinlinedviewModeldefault3 = p2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
            BitmapDrawable bitmapDrawable = drawableTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof BitmapDrawable ? (BitmapDrawable) drawableTuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(p2.getTuitionPaymentFragmentspecialinlinedviewModeldefault3()));
                String strB = p2.getTuitionPaymentFragmentbindingInflater1();
                if (strB != null) {
                    linkedHashMap.put("coil#disk_cache_key", strB);
                }
                memoryCacheTuitionPaymentFragmentspecialinlinedviewModeldefault1.b(p0, new MemoryCache.TuitionPaymentFragmentbindingInflater1(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }

    public static isThumbUp TuitionPaymentFragmentspecialinlinedviewModeldefault1(fromParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault2 p0, newUnratedRating p1, MemoryCache.Key p2, MemoryCache.TuitionPaymentFragmentbindingInflater1 p3) {
        return new isThumbUp(new BitmapDrawable(p1.getINotificationSideChannel().getResources(), p3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()), p1, DataSource.MEMORY_CACHE, p2, b(p3), TuitionPaymentFragmentspecialinlinedviewModeldefault2(p3), getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0));
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Object obj = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static String b(MemoryCache.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Object obj = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
