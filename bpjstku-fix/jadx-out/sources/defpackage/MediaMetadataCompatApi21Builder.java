package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.size.Precision;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R\u001a\u0010/\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u001f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b1\u00102R\u001a\u0010&\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b'\u00104R\u001a\u00107\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b/\u00106R\u001a\u0010!\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b#\u00106R\u001c\u0010$\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b&\u00109R\u0016\u0010(\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00108R\u0016\u0010-\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u00108R\u001a\u00101\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\b7\u0010;R\u001a\u0010)\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b*\u0010;R\u001a\u0010+\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b\u001f\u0010;"}, d2 = {"LMediaMetadataCompatApi21Builder;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "p0", "p1", "p2", "p3", "LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "p4", "Lcoil/size/Precision;", "p5", "Landroid/graphics/Bitmap$Config;", "p6", "", "p7", "p8", "Landroid/graphics/drawable/Drawable;", "p9", "p10", "p11", "Lcoil/request/CachePolicy;", "p12", "p13", "p14", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;LadjustVolume$TuitionPaymentFragmentbindingInflater1;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "asInterface", "()Lkotlinx/coroutines/CoroutineDispatcher;", "TuitionPaymentFragmentbindingInflater1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "onTransact", "INotificationSideChannel", "b", "notify", "LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "cancel", "()LadjustVolume$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcoil/size/Precision;", "cancelAll", "()Lcoil/size/Precision;", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Z", "()Z", "g", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "Lcoil/request/CachePolicy;", "()Lcoil/request/CachePolicy;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaMetadataCompatApi21Builder {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Precision a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Bitmap.Config d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final Drawable onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final Drawable cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final boolean asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final CachePolicy cancelAll;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean g;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final CachePolicy notify;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Drawable asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final CachePolicy INotificationSideChannel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final adjustVolume.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final CoroutineDispatcher b;

    private MediaMetadataCompatApi21Builder(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Precision precision, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.TuitionPaymentFragmentbindingInflater1 = coroutineDispatcher;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = coroutineDispatcher2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = coroutineDispatcher3;
        this.b = coroutineDispatcher4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        this.a = precision;
        this.d = config;
        this.g = z;
        this.asInterface = z2;
        this.asBinder = drawable;
        this.onTransact = drawable2;
        this.cancel = drawable3;
        this.cancelAll = cachePolicy;
        this.INotificationSideChannel = cachePolicy2;
        this.notify = cachePolicy3;
    }

    public /* synthetic */ MediaMetadataCompatApi21Builder(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, adjustVolume.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, Precision precision, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2() : coroutineDispatcher, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher2, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher3, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher4, (i & 16) != 0 ? adjustVolume.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : tuitionPaymentFragmentbindingInflater1, (i & 32) != 0 ? Precision.AUTOMATIC : precision, (i & 64) != 0 ? getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : config, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : drawable, (i & 1024) != 0 ? null : drawable2, (i & 2048) == 0 ? drawable3 : null, (i & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy, (i & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i & 16384) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }

    /* JADX INFO: renamed from: asInterface, reason: from getter */
    public final CoroutineDispatcher getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final CoroutineDispatcher getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final CoroutineDispatcher getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from getter */
    public final CoroutineDispatcher getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: cancel, reason: from getter */
    public final adjustVolume.TuitionPaymentFragmentbindingInflater1 getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX INFO: renamed from: cancelAll, reason: from getter */
    public final Precision getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final Bitmap.Config getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final boolean getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final boolean getAsInterface() {
        return this.asInterface;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Drawable getAsBinder() {
        return this.asBinder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CachePolicy getCancelAll() {
        return this.cancelAll;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CachePolicy getINotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CachePolicy getNotify() {
        return this.notify;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MediaMetadataCompatApi21Builder)) {
            return false;
        }
        MediaMetadataCompatApi21Builder mediaMetadataCompatApi21Builder = (MediaMetadataCompatApi21Builder) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, mediaMetadataCompatApi21Builder.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, mediaMetadataCompatApi21Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, mediaMetadataCompatApi21Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, mediaMetadataCompatApi21Builder.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, mediaMetadataCompatApi21Builder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.a == mediaMetadataCompatApi21Builder.a && this.d == mediaMetadataCompatApi21Builder.d && this.g == mediaMetadataCompatApi21Builder.g && this.asInterface == mediaMetadataCompatApi21Builder.asInterface && Intrinsics.areEqual(this.asBinder, mediaMetadataCompatApi21Builder.asBinder) && Intrinsics.areEqual(this.onTransact, mediaMetadataCompatApi21Builder.onTransact) && Intrinsics.areEqual(this.cancel, mediaMetadataCompatApi21Builder.cancel) && this.cancelAll == mediaMetadataCompatApi21Builder.cancelAll && this.INotificationSideChannel == mediaMetadataCompatApi21Builder.INotificationSideChannel && this.notify == mediaMetadataCompatApi21Builder.notify;
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode4 = this.b.hashCode();
        int iHashCode5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode6 = this.a.hashCode();
        int iHashCode7 = this.d.hashCode();
        int iHashCode8 = Boolean.hashCode(this.g);
        int iHashCode9 = Boolean.hashCode(this.asInterface);
        Drawable drawable = this.asBinder;
        int iHashCode10 = drawable != null ? drawable.hashCode() : 0;
        Drawable drawable2 = this.onTransact;
        int iHashCode11 = drawable2 != null ? drawable2.hashCode() : 0;
        Drawable drawable3 = this.cancel;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.cancelAll.hashCode()) * 31) + this.INotificationSideChannel.hashCode()) * 31) + this.notify.hashCode();
    }

    public MediaMetadataCompatApi21Builder() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }
}
