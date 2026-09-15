package androidx.p005navigation;

import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import defpackage.CameraController2;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001:\u0001;BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0010BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0012BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001a\u0010#\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010!R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u001a\u0010(\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0015R\u001a\u0010*\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0015R\u001a\u0010.\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u0015R(\u00100\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001fR0\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R(\u00107\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:"}, d2 = {"Landroidx/navigation/NavOptions;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(ZZIZZIIII)V", "", "(ZZLjava/lang/String;ZZIIII)V", "Lkotlin/reflect/KClass;", "(ZZLkotlin/reflect/KClass;ZZIIII)V", "(ZZLjava/lang/Object;ZZIIII)V", "getPopUpTo", "()I", "shouldLaunchSingleTop", "()Z", "shouldRestoreState", "isPopUpToInclusive", "shouldPopUpToSaveState", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "singleTop", "Z", "restoreState", "popUpToId", "I", "getPopUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "getEnterAnim", "exitAnim", "getExitAnim", "popEnterAnim", "getPopEnterAnim", "popExitAnim", "getPopExitAnim", "popUpToRoute", "Ljava/lang/String;", "getPopUpToRoute", "popUpToRouteClass", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "popUpToRouteObject", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavOptions {
    private final int enterAnim;
    private final int exitAnim;
    private final int popEnterAnim;
    private final int popExitAnim;
    private final int popUpToId;
    private final boolean popUpToInclusive;
    private String popUpToRoute;
    private KClass<?> popUpToRouteClass;
    private Object popUpToRouteObject;
    private final boolean popUpToSaveState;
    private final boolean restoreState;
    private final boolean singleTop;

    public NavOptions(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.singleTop = z;
        this.restoreState = z2;
        this.popUpToId = i;
        this.popUpToInclusive = z3;
        this.popUpToSaveState = z4;
        this.enterAnim = i2;
        this.exitAnim = i3;
        this.popEnterAnim = i4;
        this.popExitAnim = i5;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final int getEnterAnim() {
        return this.enterAnim;
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    @Deprecated(message = "Use popUpToId instead.", replaceWith = @ReplaceWith(expression = "popUpToId", imports = {}))
    /* JADX INFO: renamed from: getPopUpTo, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final KClass<?> getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public NavOptions(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(z, z2, NavDestination.INSTANCE.createRoute(str).hashCode(), z3, z4, i, i2, i3, i4);
        this.popUpToRoute = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavOptions(boolean z, boolean z2, KClass<?> kClass, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNull(kClass);
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1((KClass) kClass, (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) new videoProfileHdrFormatsToDynamicRangeEncoding[0]);
        videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null ? CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass) : videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1;
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            this(z, z2, RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1), z3, z4, i, i2, i3, i4);
            this.popUpToRouteClass = kClass;
        } else {
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kClass);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavOptions(boolean z, boolean z2, Object obj, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(obj, "");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
        videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(orCreateKotlinClass, (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) new videoProfileHdrFormatsToDynamicRangeEncoding[0]);
        videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null ? CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(orCreateKotlinClass) : videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1;
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
            this(z, z2, RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1), z3, z4, i, i2, i3, i4);
            this.popUpToRouteObject = obj;
        } else {
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) orCreateKotlinClass);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: shouldLaunchSingleTop, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* JADX INFO: renamed from: shouldRestoreState, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    /* JADX INFO: renamed from: isPopUpToInclusive, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* JADX INFO: renamed from: shouldPopUpToSaveState, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || !(p0 instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) p0;
        return this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && Intrinsics.areEqual(this.popUpToRoute, navOptions.popUpToRoute) && Intrinsics.areEqual(this.popUpToRouteClass, navOptions.popUpToRouteClass) && Intrinsics.areEqual(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim;
    }

    public final int hashCode() {
        boolean singleTop = getSingleTop();
        boolean restoreState = getRestoreState();
        int i = this.popUpToId;
        String str = this.popUpToRoute;
        int iHashCode = str != null ? str.hashCode() : 0;
        KClass<?> kClass = this.popUpToRouteClass;
        int iHashCode2 = kClass != null ? kClass.hashCode() : 0;
        Object obj = this.popUpToRouteObject;
        int iHashCode3 = obj != null ? obj.hashCode() : 0;
        boolean popUpToInclusive = getPopUpToInclusive();
        boolean popUpToSaveState = getPopUpToSaveState();
        int i2 = this.enterAnim;
        return ((((((((((((((((((((((singleTop ? 1 : 0) * 31) + (restoreState ? 1 : 0)) * 31) + i) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (popUpToInclusive ? 1 : 0)) * 31) + (popUpToSaveState ? 1 : 0)) * 31) + i2) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (this.singleTop) {
            sb.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb.append(str2);
            } else {
                KClass<?> kClass = this.popUpToRouteClass;
                if (kClass != null) {
                    sb.append(kClass);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.enterAnim));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.exitAnim));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.popEnterAnim));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.popExitAnim));
            sb.append(")");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J)\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000fJ.\u0010\f\u001a\u00020\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\f\u0010\u0011J9\u0010\f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0010*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0013J3\u0010\f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010*\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010!R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010!"}, d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "p0", "setLaunchSingleTop", "(Z)Landroidx/navigation/NavOptions$Builder;", "setRestoreState", "", "p1", "p2", "setPopUpTo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "(ZZ)Landroidx/navigation/NavOptions$Builder;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;ZZ)Landroidx/navigation/NavOptions$Builder;", "(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;", "setEnterAnim", "(I)Landroidx/navigation/NavOptions$Builder;", "setExitAnim", "setPopEnterAnim", "setPopExitAnim", "Landroidx/navigation/NavOptions;", "build", "()Landroidx/navigation/NavOptions;", "singleTop", "Z", "restoreState", "popUpToId", "I", "popUpToRoute", "Ljava/lang/String;", "popUpToRouteClass", "Lkotlin/reflect/KClass;", "popUpToRouteObject", "Ljava/lang/Object;", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private boolean popUpToInclusive;
        private String popUpToRoute;
        private KClass<?> popUpToRouteClass;
        private Object popUpToRouteObject;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;
        private int popUpToId = -1;
        private int enterAnim = -1;
        private int exitAnim = -1;
        private int popEnterAnim = -1;
        private int popExitAnim = -1;

        public final Builder setLaunchSingleTop(boolean p0) {
            this.singleTop = p0;
            return this;
        }

        public final Builder setRestoreState(boolean p0) {
            this.restoreState = p0;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(i, z, z2);
        }

        public final Builder setPopUpTo(int p0, boolean p1, boolean p2) {
            this.popUpToId = p0;
            this.popUpToRoute = null;
            this.popUpToInclusive = p1;
            this.popUpToSaveState = p2;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(str, z, z2);
        }

        public final Builder setPopUpTo(String p0, boolean p1, boolean p2) {
            this.popUpToRoute = p0;
            this.popUpToId = -1;
            this.popUpToInclusive = p1;
            this.popUpToSaveState = p2;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            builder.setPopUpTo(Reflection.getOrCreateKotlinClass(Object.class), z, z2);
            return builder;
        }

        public final /* synthetic */ <T> Builder setPopUpTo(boolean p0, boolean p1) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            setPopUpTo((KClass) Reflection.getOrCreateKotlinClass(Object.class), p0, p1);
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, KClass kClass, boolean z, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(kClass, z, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Builder setPopUpTo(KClass<T> p0, boolean p1, boolean p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.popUpToRouteClass = p0;
            this.popUpToId = -1;
            this.popUpToInclusive = p1;
            this.popUpToSaveState = p2;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, Object obj, boolean z, boolean z2, int i, Object obj2) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            return builder.setPopUpTo(obj, z, z2);
        }

        public final <T> Builder setPopUpTo(T p0, boolean p1, boolean p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.popUpToRouteObject = p0;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(p0.getClass());
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
            videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
            Intrinsics.checkNotNullParameter(orCreateKotlinClass, "");
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass(orCreateKotlinClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(orCreateKotlinClass);
            }
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                setPopUpTo(RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1), p1, p2);
                return this;
            }
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) orCreateKotlinClass);
            throw new KotlinNothingValueException();
        }

        public final Builder setEnterAnim(int p0) {
            this.enterAnim = p0;
            return this;
        }

        public final Builder setExitAnim(int p0) {
            this.exitAnim = p0;
            return this;
        }

        public final Builder setPopEnterAnim(int p0) {
            this.popEnterAnim = p0;
            return this;
        }

        public final Builder setPopExitAnim(int p0) {
            this.popExitAnim = p0;
            return this;
        }

        public final NavOptions build() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            KClass<?> kClass = this.popUpToRouteClass;
            if (kClass != null) {
                return new NavOptions(this.singleTop, this.restoreState, kClass, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj != null) {
                boolean z = this.singleTop;
                boolean z2 = this.restoreState;
                Intrinsics.checkNotNull(obj);
                return new NavOptions(z, z2, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final /* synthetic */ <T> Builder setPopUpTo(boolean z) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            setPopUpTo((KClass) Reflection.getOrCreateKotlinClass(Object.class), z, false);
            return this;
        }

        public final Builder setPopUpTo(int i, boolean z) {
            return setPopUpTo$default(this, i, z, false, 4, (Object) null);
        }

        public final <T> Builder setPopUpTo(T t, boolean z) {
            Intrinsics.checkNotNullParameter(t, "");
            return setPopUpTo$default(this, (Object) t, z, false, 4, (Object) null);
        }

        public final Builder setPopUpTo(String str, boolean z) {
            return setPopUpTo$default(this, str, z, false, 4, (Object) null);
        }

        public final <T> Builder setPopUpTo(KClass<T> kClass, boolean z) {
            Intrinsics.checkNotNullParameter(kClass, "");
            return setPopUpTo$default(this, (KClass) kClass, z, false, 4, (Object) null);
        }
    }
}
