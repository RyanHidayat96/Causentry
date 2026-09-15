package androidx.work;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.impl.utils.DurationApi26Impl;
import androidx.work.impl.utils.NetworkRequest30;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 <2\u00020\u0001:\u0003=<>B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001aJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u001aJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0013\u00102\u001a\u0004\u0018\u00010/8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010;R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010;R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010;"}, d2 = {"Landroidx/work/Constraints;", "", "Landroidx/work/NetworkType;", "p0", "", "p1", "p2", "p3", "<init>", "(Landroidx/work/NetworkType;ZZZ)V", "p4", "(Landroidx/work/NetworkType;ZZZZ)V", "", "p5", "p6", "", "Landroidx/work/Constraints$ContentUriTrigger;", "p7", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "Landroidx/work/impl/utils/NetworkRequestCompat;", "p8", "(Landroidx/work/impl/utils/NetworkRequestCompat;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "(Landroidx/work/Constraints;)V", "equals", "(Ljava/lang/Object;)Z", "hasContentUriTriggers", "()Z", "", "hashCode", "()I", "requiresBatteryNotLow", "requiresCharging", "requiresDeviceIdle", "requiresStorageNotLow", "", "toString", "()Ljava/lang/String;", "contentTriggerMaxDelayMillis", "J", "getContentTriggerMaxDelayMillis", "()J", "contentTriggerUpdateDelayMillis", "getContentTriggerUpdateDelayMillis", "contentUriTriggers", "Ljava/util/Set;", "getContentUriTriggers", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "getRequiredNetworkRequest", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "requiredNetworkRequestCompat", "Landroidx/work/impl/utils/NetworkRequestCompat;", "getRequiredNetworkRequestCompat$work_runtime_release", "()Landroidx/work/impl/utils/NetworkRequestCompat;", "requiredNetworkType", "Landroidx/work/NetworkType;", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", "Z", "Companion", "Builder", "ContentUriTrigger"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Constraints {
    public static final Constraints NONE = new Constraints(null, false, false, false, 15, null);
    private final long contentTriggerMaxDelayMillis;
    private final long contentTriggerUpdateDelayMillis;
    private final Set<ContentUriTrigger> contentUriTriggers;
    private final NetworkRequestCompat requiredNetworkRequestCompat;
    private final NetworkType requiredNetworkType;
    private final boolean requiresBatteryNotLow;
    private final boolean requiresCharging;
    private final boolean requiresDeviceIdle;
    private final boolean requiresStorageNotLow;

    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final NetworkRequest getRequiredNetworkRequest() {
        return this.requiredNetworkRequestCompat.getNetworkRequest();
    }

    /* JADX INFO: renamed from: getRequiredNetworkRequestCompat$work_runtime_release, reason: from getter */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3) {
        this(networkType, z, false, z2, z3);
        Intrinsics.checkNotNullParameter(networkType, "");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(networkType, z, z2, z3, z4, -1L, 0L, null, DerHeader.TAG_CLASS_PRIVATE, null);
        Intrinsics.checkNotNullParameter(networkType, "");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j, (i & 64) == 0 ? j2 : -1L, (i & 128) != 0 ? SetsKt.emptySet() : set);
    }

    public Constraints(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<ContentUriTrigger> set) {
        Intrinsics.checkNotNullParameter(networkType, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public /* synthetic */ Constraints(NetworkRequestCompat networkRequestCompat, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkRequestCompat, (i & 2) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) == 0 ? z4 : false, (i & 64) != 0 ? -1L : j, (i & 128) == 0 ? j2 : -1L, (i & 256) != 0 ? SetsKt.emptySet() : set);
    }

    public Constraints(NetworkRequestCompat networkRequestCompat, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<ContentUriTrigger> set) {
        Intrinsics.checkNotNullParameter(networkRequestCompat, "");
        Intrinsics.checkNotNullParameter(networkType, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.requiredNetworkRequestCompat = networkRequestCompat;
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public Constraints(Constraints constraints) {
        Intrinsics.checkNotNullParameter(constraints, "");
        this.requiresCharging = constraints.requiresCharging;
        this.requiresDeviceIdle = constraints.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = constraints.requiredNetworkRequestCompat;
        this.requiredNetworkType = constraints.requiredNetworkType;
        this.requiresBatteryNotLow = constraints.requiresBatteryNotLow;
        this.requiresStorageNotLow = constraints.requiresStorageNotLow;
        this.contentUriTriggers = constraints.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = constraints.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = constraints.contentTriggerMaxDelayMillis;
    }

    /* JADX INFO: renamed from: requiresCharging, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* JADX INFO: renamed from: requiresDeviceIdle, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: requiresBatteryNotLow, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    /* JADX INFO: renamed from: requiresStorageNotLow, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    public final boolean hasContentUriTriggers() {
        return !this.contentUriTriggers.isEmpty();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !Intrinsics.areEqual(getClass(), p0.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) p0;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && Intrinsics.areEqual(getRequiredNetworkRequest(), constraints.getRequiredNetworkRequest()) && this.requiredNetworkType == constraints.requiredNetworkType) {
            return Intrinsics.areEqual(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.requiredNetworkType.hashCode();
        boolean z = this.requiresCharging;
        boolean z2 = this.requiresDeviceIdle;
        boolean z3 = this.requiresBatteryNotLow;
        boolean z4 = this.requiresStorageNotLow;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.contentTriggerMaxDelayMillis;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode2 = this.contentUriTriggers.hashCode();
        NetworkRequest requiredNetworkRequest = getRequiredNetworkRequest();
        return (((((((((((((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + i) * 31) + i2) * 31) + iHashCode2) * 31) + (requiredNetworkRequest != null ? requiredNetworkRequest.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.requiredNetworkType);
        sb.append(", requiresCharging=");
        sb.append(this.requiresCharging);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.requiresDeviceIdle);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.requiresBatteryNotLow);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.requiresStorageNotLow);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.contentTriggerUpdateDelayMillis);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.contentTriggerMaxDelayMillis);
        sb.append(", contentUriTriggers=");
        sb.append(this.contentUriTriggers);
        sb.append(", }");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001a\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010.\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010/"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "<init>", "()V", "Landroidx/work/Constraints;", "p0", "(Landroidx/work/Constraints;)V", "Landroid/net/Uri;", "", "p1", "addContentUriTrigger", "(Landroid/net/Uri;Z)Landroidx/work/Constraints$Builder;", "build", "()Landroidx/work/Constraints;", "Landroid/net/NetworkRequest;", "Landroidx/work/NetworkType;", "setRequiredNetworkRequest", "(Landroid/net/NetworkRequest;Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "setRequiredNetworkType", "(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "setRequiresBatteryNotLow", "(Z)Landroidx/work/Constraints$Builder;", "setRequiresCharging", "setRequiresDeviceIdle", "setRequiresStorageNotLow", "Ljava/time/Duration;", "setTriggerContentMaxDelay", "(Ljava/time/Duration;)Landroidx/work/Constraints$Builder;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/Constraints$Builder;", "setTriggerContentUpdateDelay", "", "Landroidx/work/Constraints$ContentUriTrigger;", "contentUriTriggers", "Ljava/util/Set;", "Landroidx/work/impl/utils/NetworkRequestCompat;", "requiredNetworkRequest", "Landroidx/work/impl/utils/NetworkRequestCompat;", "requiredNetworkType", "Landroidx/work/NetworkType;", "requiresBatteryNotLow", "Z", "requiresCharging", "requiresDeviceIdle", "requiresStorageNotLow", "triggerContentMaxDelay", "J", "triggerContentUpdateDelay"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private Set<ContentUriTrigger> contentUriTriggers;
        private NetworkRequestCompat requiredNetworkRequest;
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        public Builder(Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "");
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.getRequiresCharging();
            this.requiresDeviceIdle = constraints.getRequiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.getRequiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.getRequiresStorageNotLow();
            this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
            this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
            this.contentUriTriggers = CollectionsKt.toMutableSet(constraints.getContentUriTriggers());
        }

        public final Builder setRequiresCharging(boolean p0) {
            this.requiresCharging = p0;
            return this;
        }

        public final Builder setRequiresDeviceIdle(boolean p0) {
            this.requiresDeviceIdle = p0;
            return this;
        }

        public final Builder setRequiredNetworkType(NetworkType p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.requiredNetworkType = p0;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        public final Builder setRequiredNetworkRequest(NetworkRequest p0, NetworkType p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (Build.VERSION.SDK_INT >= 28) {
                if (Build.VERSION.SDK_INT >= 31 && NetworkRequest30.INSTANCE.getNetworkSpecifier(p0) != null) {
                    throw new IllegalArgumentException("NetworkRequests with NetworkSpecifiers set aren't supported.");
                }
                this.requiredNetworkRequest = new NetworkRequestCompat(p0);
                this.requiredNetworkType = NetworkType.NOT_REQUIRED;
                return this;
            }
            this.requiredNetworkType = p1;
            return this;
        }

        public final Builder setRequiresBatteryNotLow(boolean p0) {
            this.requiresBatteryNotLow = p0;
            return this;
        }

        public final Builder setRequiresStorageNotLow(boolean p0) {
            this.requiresStorageNotLow = p0;
            return this;
        }

        public final Builder addContentUriTrigger(Uri p0, boolean p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.contentUriTriggers.add(new ContentUriTrigger(p0, p1));
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.triggerContentUpdateDelay = p1.toMillis(p0);
            return this;
        }

        public final Builder setTriggerContentUpdateDelay(Duration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(p0);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.triggerContentMaxDelay = p1.toMillis(p0);
            return this;
        }

        public final Builder setTriggerContentMaxDelay(Duration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(p0);
            return this;
        }

        public final Constraints build() {
            Set set = CollectionsKt.toSet(this.contentUriTriggers);
            return new Constraints(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, set);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "Landroid/net/Uri;", "p0", "", "p1", "<init>", "(Landroid/net/Uri;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isTriggeredForDescendants", "Z", "()Z", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final Uri uri;

        public ContentUriTrigger(Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(uri, "");
            this.uri = uri;
            this.isTriggeredForDescendants = z;
        }

        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: isTriggeredForDescendants, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(p0, "");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) p0;
            return Intrinsics.areEqual(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public final int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }
}
