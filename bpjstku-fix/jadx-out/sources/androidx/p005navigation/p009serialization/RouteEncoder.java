package androidx.p005navigation.p009serialization;

import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.CollectionNavType;
import androidx.p005navigation.NavType;
import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.QualityAddedEncoderProfilesProvider;
import defpackage.createImageAnalysis;
import defpackage.restartCameraIfAnalyzerResolutionChanged;
import defpackage.startListeningToRotationEvents;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import defpackage.waitForNextFrame;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010+\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", ExifInterface.GPS_DIRECTION_TRUE, "LrestartCameraIfAnalyzerResolutionChanged;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;Ljava/util/Map;)V", "", "encodeToArgMap", "(Ljava/lang/Object;)Ljava/util/Map;", "LQualityAddedEncoderProfilesProvider;", "", "encodeSerializableValue", "(LQualityAddedEncoderProfilesProvider;Ljava/lang/Object;)V", "LcreateImageAnalysis;", "", "", "encodeElement", "(LcreateImageAnalysis;I)Z", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "()V", "LstartListeningToRotationEvents;", "encodeInline", "(LcreateImageAnalysis;)LstartListeningToRotationEvents;", "internalEncodeValue", "serializer", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "typeMap", "Ljava/util/Map;", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "", "map", "elementIndex", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteEncoder<T> extends restartCameraIfAnalyzerResolutionChanged {
    private int elementIndex;
    private final Map<String, List<String>> map;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<T> serializer;
    private final PreviewViewImplementationOnSurfaceNotInUseListener serializersModule;
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding, Map<String, ? extends NavType<Object>> map) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.serializer = videoprofilehdrformatstodynamicrangeencoding;
        this.typeMap = map;
        this.serializersModule = waitForNextFrame.b();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    @Override // defpackage.startListeningToRotationEvents
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.serializersModule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, List<String>> encodeToArgMap(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.encodeSerializableValue(this.serializer, p0);
        return MapsKt.toMap(this.map);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final <T> void encodeSerializableValue(QualityAddedEncoderProfilesProvider<? super T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        internalEncodeValue(p1);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged
    public final boolean encodeElement(createImageAnalysis p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.elementIndex = p1;
        return true;
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged
    public final void encodeValue(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        internalEncodeValue(p0);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // defpackage.restartCameraIfAnalyzerResolutionChanged, defpackage.startListeningToRotationEvents
    public final startListeningToRotationEvents encodeInline(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (RouteSerializerKt.isValueClass(p0)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(p0);
    }

    private final void internalEncodeValue(Object p0) {
        List<String> listListOf;
        String strTuitionPaymentFragmentbindingInflater1 = this.serializer.getDescriptor().TuitionPaymentFragmentbindingInflater1(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(strTuitionPaymentFragmentbindingInflater1);
        if (navType == null) {
            StringBuilder sb = new StringBuilder("Cannot find NavType for argument ");
            sb.append(strTuitionPaymentFragmentbindingInflater1);
            sb.append(". Please provide NavType through typeMap.");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (navType instanceof CollectionNavType) {
            listListOf = ((CollectionNavType) navType).serializeAsValues(p0);
        } else {
            listListOf = CollectionsKt.listOf(navType.serializeAsValue(p0));
        }
        this.map.put(strTuitionPaymentFragmentbindingInflater1, listListOf);
    }
}
