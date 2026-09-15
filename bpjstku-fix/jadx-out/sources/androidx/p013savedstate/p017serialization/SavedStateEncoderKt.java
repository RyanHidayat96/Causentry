package androidx.p013savedstate.p017serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateWriter;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.QualityAddedEncoderProfilesProvider;
import defpackage.isCloseToRealtime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "p0", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p1", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "encodeToSavedState", "(Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "LQualityAddedEncoderProfilesProvider;", "p2", "(LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateEncoderKt {
    public static /* synthetic */ Bundle encodeToSavedState$default(Object obj, SavedStateConfiguration savedStateConfiguration, int i, Object obj2) {
        if ((i & 2) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), obj, savedStateConfiguration);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedState(T t, SavedStateConfiguration savedStateConfiguration) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        PreviewViewImplementationOnSurfaceNotInUseListener serializersModule = savedStateConfiguration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(isCloseToRealtime.TuitionPaymentFragmentspecialinlinedviewModeldefault2(serializersModule, null), t, savedStateConfiguration);
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(QualityAddedEncoderProfilesProvider qualityAddedEncoderProfilesProvider, Object obj, SavedStateConfiguration savedStateConfiguration, int i, Object obj2) {
        if ((i & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return encodeToSavedState(qualityAddedEncoderProfilesProvider, obj, savedStateConfiguration);
    }

    public static final <T> Bundle encodeToSavedState(QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t, SavedStateConfiguration savedStateConfiguration) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        new SavedStateEncoder(bundleBundleOf, savedStateConfiguration).encodeSerializableValue(qualityAddedEncoderProfilesProvider, t);
        return bundleBundleOf;
    }

    public static final <T> Bundle encodeToSavedState(QualityAddedEncoderProfilesProvider<? super T> qualityAddedEncoderProfilesProvider, T t) {
        Intrinsics.checkNotNullParameter(qualityAddedEncoderProfilesProvider, "");
        Intrinsics.checkNotNullParameter(t, "");
        return encodeToSavedState$default(qualityAddedEncoderProfilesProvider, t, null, 4, null);
    }
}
