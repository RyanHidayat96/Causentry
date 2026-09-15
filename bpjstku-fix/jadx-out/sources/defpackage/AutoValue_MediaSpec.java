package defpackage;

import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.rtchagas.pingplacepicker.inject.RepositoryModuleKt$repositoryModule$1;
import com.rtchagas.pingplacepicker.repository.googlemaps.GoogleMapsAPI;
import defpackage.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder;
import defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternal1;
import defpackage.CoordinateTransform;
import defpackage.FileTransformFactory;
import defpackage.ZoomGestureDetectorZoomEventEnd;
import defpackage.ZoomGestureDetectorZoomEventMove;
import defpackage.ZoomGestureDetectorgestureDetector1;
import defpackage.isLenovoTablet;
import defpackage.setFile;
import defpackage.setStylusZoomEnabled;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_MediaSpec {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        RepositoryModuleKt$repositoryModule$1 repositoryModuleKt$repositoryModule$1 = new Function1<isLenovoTablet, Unit>() { // from class: com.rtchagas.pingplacepicker.inject.RepositoryModuleKt$repositoryModule$1
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isLenovoTablet islenovotablet) {
                AnonymousClass1 anonymousClass1 = new Function2<FileTransformFactory, CoordinateTransform, PlacesClient>() { // from class: com.rtchagas.pingplacepicker.inject.RepositoryModuleKt$repositoryModule$1.1
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final PlacesClient invoke(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
                        Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setStylusZoomEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fileTransformFactory);
                        AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1;
                        Places.initialize(contextTuitionPaymentFragmentspecialinlinedviewModeldefault3, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1());
                        return Places.createClient(setStylusZoomEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fileTransformFactory));
                    }
                };
                ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
                Kind kind = Kind.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(PlacesClient.class));
                zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = anonymousClass1;
                zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
                islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
                islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
                AnonymousClass2 anonymousClass2 = AnonymousClass2.TuitionPaymentFragmentbindingInflater1;
                ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
                Kind kind2 = Kind.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(GoogleMapsAPI.class));
                zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = anonymousClass2;
                zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
                islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(true, false));
                islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
                AnonymousClass3 anonymousClass3 = new Function2<FileTransformFactory, CoordinateTransform, setFile>() { // from class: com.rtchagas.pingplacepicker.inject.RepositoryModuleKt$repositoryModule$1.3
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final setFile invoke(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
                        return new setFile((PlacesClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PlacesClient.class), null, null), (GoogleMapsAPI) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(GoogleMapsAPI.class), null, null));
                    }
                };
                ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
                Kind kind3 = Kind.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(setFile.class));
                zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = anonymousClass3;
                zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
                islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
                islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
                zoomGestureDetectorZoomEventMove3.d.add(Reflection.getOrCreateKotlinClass(AutoValue_FileOutputOptions_FileOutputOptionsInternal1.class));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(isLenovoTablet islenovotablet) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(islenovotablet);
                return Unit.INSTANCE;
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        repositoryModuleKt$repositoryModule$1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
