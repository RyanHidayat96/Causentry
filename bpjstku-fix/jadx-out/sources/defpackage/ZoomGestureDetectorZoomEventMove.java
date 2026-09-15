package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.setUsingCropRect;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010C\u001a\u00020!J\u0006\u0010D\u001a\u00020!J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010H\u001a\u00020FJ\b\u0010I\u001a\u00020JH\u0016J\u0019\u0010K\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010L\u001a\u00020M¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020PH\u0016R;\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\r¢\u0006\u0002\b\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010\u001f\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R6\u0010'\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0015\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R2\u0010<\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070=j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006Q"}, d2 = {"Lorg/koin/core/definition/BeanDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "scopeName", "primaryType", "Lkotlin/reflect/KClass;", "(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "getDefinition", "()Lkotlin/jvm/functions/Function2;", "setDefinition", "(Lkotlin/jvm/functions/Function2;)V", "instance", "Lorg/koin/core/instance/DefinitionInstance;", "getInstance", "()Lorg/koin/core/instance/DefinitionInstance;", "setInstance", "(Lorg/koin/core/instance/DefinitionInstance;)V", "kind", "Lorg/koin/core/definition/Kind;", "getKind", "()Lorg/koin/core/definition/Kind;", "setKind", "(Lorg/koin/core/definition/Kind;)V", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "getOnClose", "()Lkotlin/jvm/functions/Function1;", "setOnClose", "(Lkotlin/jvm/functions/Function1;)V", "onRelease", "Lorg/koin/core/definition/OnReleaseCallback;", "getOnRelease", "setOnRelease", "options", "Lorg/koin/core/definition/Options;", "getOptions", "()Lorg/koin/core/definition/Options;", "setOptions", "(Lorg/koin/core/definition/Options;)V", "getPrimaryType", "()Lkotlin/reflect/KClass;", "properties", "Lorg/koin/core/definition/Properties;", "getProperties", "()Lorg/koin/core/definition/Properties;", "setProperties", "(Lorg/koin/core/definition/Properties;)V", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "getScopeName", "secondaryTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSecondaryTypes", "()Ljava/util/ArrayList;", "setSecondaryTypes", "(Ljava/util/ArrayList;)V", "close", "createInstanceHolder", "equals", "", "other", "hasScopeSet", "hashCode", "", "resolveInstance", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "toString", "", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class ZoomGestureDetectorZoomEventMove<T> {
    public final KClass<?> TuitionPaymentFragmentbindingInflater1;
    public Kind TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public ZoomGestureDetectorZoomEventBegin TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final mapPoint asBinder;
    public final mapPoint asInterface;
    public ZoomGestureDetectorgestureDetector1 b;
    public ArrayList<KClass<?>> d;
    private SurfaceViewStretchedQuirk<T> g;

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomGestureDetectorZoomEventMove(mapPoint mappoint, mapPoint mappoint2, KClass<?> kClass) {
        this.asInterface = mappoint;
        this.asBinder = mappoint2;
        this.TuitionPaymentFragmentbindingInflater1 = kClass;
        this.d = new ArrayList<>();
        boolean z = false;
        this.b = new ZoomGestureDetectorgestureDetector1(z, z, 3, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ZoomGestureDetectorZoomEventBegin(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ZoomGestureDetectorZoomEventMove(mapPoint mappoint, mapPoint mappoint2, KClass kClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mappoint, (i & 2) != 0 ? null : mappoint2, kClass);
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk;
        Kind kind = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (kind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int i = onDoubleTap$WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 1) {
            surfaceViewNotCroppedByParentQuirk = new SurfaceViewNotCroppedByParentQuirk(this);
        } else if (i == 2) {
            surfaceViewNotCroppedByParentQuirk = new ScreenFlashUiInfoProviderType(this);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            surfaceViewNotCroppedByParentQuirk = new getProviderType(this);
        }
        this.g = surfaceViewNotCroppedByParentQuirk;
    }

    public final <T> T b(ScreenFlashUiInfo screenFlashUiInfo) {
        T tB;
        SurfaceViewStretchedQuirk<T> surfaceViewStretchedQuirk = this.g;
        if (surfaceViewStretchedQuirk == null || (tB = surfaceViewStretchedQuirk.b(screenFlashUiInfo)) == null) {
            throw new IllegalStateException("Definition without any InstanceContext - ".concat(String.valueOf(this)).toString());
        }
        return tB;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final String toString() {
        String string;
        String string2;
        Kind kind = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (kind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        String string3 = kind.toString();
        if (this.asInterface != null) {
            StringBuilder sb = new StringBuilder("name:'");
            sb.append(this.asInterface);
            sb.append("', ");
            string = sb.toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        if (this.asBinder != null) {
            StringBuilder sb2 = new StringBuilder("scope:'");
            sb2.append(this.asBinder);
            sb2.append("', ");
            string2 = sb2.toString();
            if (string2 == null) {
                string2 = "";
            }
        } else {
            string2 = "";
        }
        StringBuilder sb3 = new StringBuilder("primary_type:'");
        sb3.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1));
        sb3.append('\'');
        String string4 = sb3.toString();
        String strConcat = this.d.isEmpty() ? "" : ", secondary_type:".concat(String.valueOf(CollectionsKt.joinToString$default(this.d, ",", null, null, 0, null, new Function1<KClass<?>, String>() { // from class: org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(KClass<?> kClass) {
                return setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass);
            }
        }, 30, null)));
        StringBuilder sb4 = new StringBuilder("[type:");
        sb4.append(string3);
        sb4.append(',');
        sb4.append(string2);
        sb4.append(string);
        sb4.append(string4);
        sb4.append(strConcat);
        sb4.append(']');
        return sb4.toString();
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            ZoomGestureDetectorZoomEventMove zoomGestureDetectorZoomEventMove = (ZoomGestureDetectorZoomEventMove) other;
            return Intrinsics.areEqual(this.asInterface, zoomGestureDetectorZoomEventMove.asInterface) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentbindingInflater1);
        }
        throw new TypeCastException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    public final int hashCode() {
        mapPoint mappoint = this.asInterface;
        return ((mappoint != null ? mappoint.hashCode() : 0) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }
}
