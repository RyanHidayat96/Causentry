package androidx.p013savedstate.p017serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.p013savedstate.p017serialization.serializers.SizeFSerializer;
import androidx.p013savedstate.p017serialization.serializers.SizeSerializer;
import androidx.p013savedstate.p017serialization.serializers.SparseArraySerializer;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.onSurfaceProvided;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LPreviewViewImplementationOnSurfaceNotInUseListener;", "getDefaultSerializersModuleOnPlatform", "()LPreviewViewImplementationOnSurfaceNotInUseListener;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfig_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final videoProfileHdrFormatsToDynamicRangeEncoding getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SparseArraySerializer((videoProfileHdrFormatsToDynamicRangeEncoding) CollectionsKt.first(list));
    }

    public static final PreviewViewImplementationOnSurfaceNotInUseListener getDefaultSerializersModuleOnPlatform() {
        onSurfaceProvided onsurfaceprovided = new onSurfaceProvided();
        onsurfaceprovided.b(Reflection.getOrCreateKotlinClass(Size.class), SizeSerializer.INSTANCE);
        onsurfaceprovided.b(Reflection.getOrCreateKotlinClass(SizeF.class), SizeFSerializer.INSTANCE);
        onsurfaceprovided.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Reflection.getOrCreateKotlinClass(SparseArray.class), new Function1() { // from class: androidx.savedstate.serialization.SavedStateConfig_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            }
        });
        return onsurfaceprovided.TuitionPaymentFragmentbindingInflater1();
    }
}
