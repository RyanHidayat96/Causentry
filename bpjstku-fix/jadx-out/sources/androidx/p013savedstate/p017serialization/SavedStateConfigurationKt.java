package androidx.p013savedstate.p017serialization;

import android.os.Bundle;
import androidx.p013savedstate.p017serialization.serializers.SavedStateSerializer;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.onSurfaceProvided;
import defpackage.waitForNextFrame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "p0", "Lkotlin/Function1;", "Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p1", "SavedStateConfiguration", "(Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/savedstate/serialization/SavedStateConfiguration;", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "DEFAULT_SERIALIZERS_MODULE", "LPreviewViewImplementationOnSurfaceNotInUseListener;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfigurationKt {
    private static final PreviewViewImplementationOnSurfaceNotInUseListener DEFAULT_SERIALIZERS_MODULE;

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration savedStateConfiguration, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, function1);
    }

    public static final SavedStateConfiguration SavedStateConfiguration(SavedStateConfiguration savedStateConfiguration, Function1<? super SavedStateConfiguration.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SavedStateConfiguration.Builder builder = new SavedStateConfiguration.Builder(savedStateConfiguration);
        function1.invoke(builder);
        return builder.build$savedstate_release();
    }

    static {
        onSurfaceProvided onsurfaceprovided = new onSurfaceProvided();
        onsurfaceprovided.b(Reflection.getOrCreateKotlinClass(Bundle.class), SavedStateSerializer.INSTANCE);
        DEFAULT_SERIALIZERS_MODULE = waitForNextFrame.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onsurfaceprovided.TuitionPaymentFragmentbindingInflater1(), SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform());
    }

    public static final SavedStateConfiguration SavedStateConfiguration(Function1<? super SavedStateConfiguration.Builder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return SavedStateConfiguration$default(null, function1, 1, null);
    }
}
