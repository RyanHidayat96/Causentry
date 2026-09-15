package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.core.metrics.TelemetryMetricType;
import com.datadog.android.privacy.TrackingConsent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001c\u001fBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u0019\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u001c\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b\u001c\u0010\"J3\u0010&\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00172\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180$H\u0017¢\u0006\u0004\b&\u0010'R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010&\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010,R\u0014\u0010\u001f\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010/\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010-\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b9\u00100R\u0014\u0010;\u001a\u00020:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"LImageCaptureImageCaptureError;", "LImageCaptureOnImageSavedCallback;", "Ljava/util/concurrent/ExecutorService;", "p0", "LImageCaptureOutputFileOptionsBuilder;", "p1", "p2", "LImageInfo;", "p3", "LgetImageCaptureError;", "p4", "LgetSavedUri;", "p5", "Lcom/datadog/android/api/InternalLogger;", "p6", "LgetSaveCollection;", "p7", "LImageCaptureExternalSyntheticLambda5;", "p8", "<init>", "(Ljava/util/concurrent/ExecutorService;LImageCaptureOutputFileOptionsBuilder;LImageCaptureOutputFileOptionsBuilder;LImageInfo;LgetImageCaptureError;LgetSavedUri;Lcom/datadog/android/api/InternalLogger;LgetSaveCollection;LImageCaptureExternalSyntheticLambda5;)V", "LImageCaptureImageCaptureCapabilitiesImpl;", "LImageCaptureBuilder;", "", "", "b", "(LImageCaptureImageCaptureCapabilitiesImpl;LImageCaptureBuilder;Z)V", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/io/File;LImageCaptureBuilder;)V", "(Ljava/io/File;)V", "TuitionPaymentFragmentbindingInflater1", "()V", "LImageCaptureFlashType;", "()LImageCaptureFlashType;", "LrecalculateTransformMatrixAndCropRect;", "Lkotlin/Function1;", "LImageAnalysisNonBlockingAnalyzer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LrecalculateTransformMatrixAndCropRect;ZLkotlin/jvm/functions/Function1;)V", "LImageInfo;", "LgetImageCaptureError;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/concurrent/ExecutorService;", "LgetSavedUri;", "g", "LgetSaveCollection;", "asInterface", "LImageCaptureOutputFileOptionsBuilder;", "a", "Lcom/datadog/android/api/InternalLogger;", "", "LImageCaptureImageCaptureError$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "d", "Ljava/util/Set;", "asBinder", "LImageCaptureExternalSyntheticLambda5;", "notify", "", "cancel", "Ljava/lang/Object;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureImageCaptureError implements ImageCaptureOnImageSavedCallback {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ExecutorService b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final getSavedUri TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ImageInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InternalLogger asInterface;
    private final ImageCaptureExternalSyntheticLambda5 asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ImageCaptureOutputFileOptionsBuilder a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final getImageCaptureError TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Object cancel;
    private final Set<TuitionPaymentFragmentspecialinlinedviewModeldefault3> d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final getSaveCollection TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final ImageCaptureOutputFileOptionsBuilder g;

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackingConsent.values().length];
            try {
                iArr[TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackingConsent.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageCaptureImageCaptureError(ExecutorService executorService, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2, ImageInfo imageInfo, getImageCaptureError getimagecaptureerror, getSavedUri getsaveduri, InternalLogger internalLogger, getSaveCollection getsavecollection, ImageCaptureExternalSyntheticLambda5 imageCaptureExternalSyntheticLambda5) {
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder2, "");
        Intrinsics.checkNotNullParameter(imageInfo, "");
        Intrinsics.checkNotNullParameter(getimagecaptureerror, "");
        Intrinsics.checkNotNullParameter(getsaveduri, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Intrinsics.checkNotNullParameter(imageCaptureExternalSyntheticLambda5, "");
        this.b = executorService;
        this.a = imageCaptureOutputFileOptionsBuilder;
        this.g = imageCaptureOutputFileOptionsBuilder2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getimagecaptureerror;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsaveduri;
        this.asInterface = internalLogger;
        this.TuitionPaymentFragmentbindingInflater1 = getsavecollection;
        this.asBinder = imageCaptureExternalSyntheticLambda5;
        this.d = new LinkedHashSet();
        this.cancel = new Object();
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final ImageCaptureFlashType TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this.d) {
            ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder = this.a;
            Set<TuitionPaymentFragmentspecialinlinedviewModeldefault3> set = this.d;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((TuitionPaymentFragmentspecialinlinedviewModeldefault3) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            File fileB = imageCaptureOutputFileOptionsBuilder.b(CollectionsKt.toSet(arrayList));
            byte[] bArrB = null;
            if (fileB == null) {
                return null;
            }
            File fileB2 = this.a.b(fileB);
            this.d.add(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(fileB, fileB2));
            Pair pair = TuplesKt.to(fileB, fileB2);
            File file = (File) pair.component1();
            File file2 = (File) pair.component2();
            ImageCaptureImageCaptureCapabilitiesImpl.Companion companion = ImageCaptureImageCaptureCapabilitiesImpl.INSTANCE;
            Intrinsics.checkNotNullParameter(file, "");
            ImageCaptureImageCaptureCapabilitiesImpl imageCaptureImageCaptureCapabilitiesImpl = new ImageCaptureImageCaptureCapabilitiesImpl(ImageCaptureImageCaptureCapabilitiesImpl.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file));
            if (file2 != null && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, this.asInterface)) {
                bArrB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(file2);
            }
            return new ImageCaptureFlashType(imageCaptureImageCaptureCapabilitiesImpl, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(file), bArrB);
        }
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final void b(ImageCaptureImageCaptureCapabilitiesImpl p0, ImageCaptureBuilder p1, boolean p2) {
        Object next;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        File file;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this.d) {
            Iterator<T> it = this.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                file = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) next).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Intrinsics.checkNotNullParameter(file, "");
                ImageCaptureImageCaptureCapabilitiesImpl.Companion companion = ImageCaptureImageCaptureCapabilitiesImpl.INSTANCE;
            } while (!Intrinsics.areEqual(ImageCaptureImageCaptureCapabilitiesImpl.Companion.TuitionPaymentFragmentbindingInflater1(file), p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) next;
        }
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return;
        }
        if (p2) {
            File file2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            File file3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(file2, p1);
            if (file3 != null && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3, this.asInterface)) {
                b(file3);
            }
        }
        synchronized (this.d) {
            this.d.remove(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final void TuitionPaymentFragmentbindingInflater1() {
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, "ConsentAwareStorage.dropAll", this.asInterface, new Runnable() { // from class: isReversedHorizontal
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            }
        });
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final File p0, ImageCaptureBuilder p1) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(p0)) {
            this.asBinder.b(p0, p1);
        } else {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchFile$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
        }
    }

    private final void b(final File p0) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(p0)) {
            return;
        }
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchMetadataFile$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = String.format(Locale.US, "Unable to delete file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final File TuitionPaymentFragmentbindingInflater1;
        final File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file, File file2) {
            Intrinsics.checkNotNullParameter(file, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
            this.TuitionPaymentFragmentbindingInflater1 = file2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            File file = this.TuitionPaymentFragmentbindingInflater1;
            return (iHashCode * 31) + (file == null ? 0 : file.hashCode());
        }

        public final String toString() {
            File file = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            File file2 = this.TuitionPaymentFragmentbindingInflater1;
            StringBuilder sb = new StringBuilder("Batch(file=");
            sb.append(file);
            sb.append(", metaFile=");
            sb.append(file2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageCaptureImageCaptureError imageCaptureImageCaptureError) {
        Intrinsics.checkNotNullParameter(imageCaptureImageCaptureError, "");
        synchronized (imageCaptureImageCaptureError.d) {
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 : imageCaptureImageCaptureError.d) {
                ImageCaptureBuilder.b bVar = ImageCaptureBuilder.b.INSTANCE;
                File file = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                File file2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                imageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file, bVar);
                if (file2 != null && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, imageCaptureImageCaptureError.asInterface)) {
                    imageCaptureImageCaptureError.b(file2);
                }
            }
            imageCaptureImageCaptureError.d.clear();
            Unit unit = Unit.INSTANCE;
        }
        ImageCaptureOutputFileOptionsBuilder[] imageCaptureOutputFileOptionsBuilderArr = {imageCaptureImageCaptureError.g, imageCaptureImageCaptureError.a};
        for (int i = 0; i < 2; i++) {
            ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder = imageCaptureOutputFileOptionsBuilderArr[i];
            for (File file3 : imageCaptureOutputFileOptionsBuilder.b()) {
                File fileB = imageCaptureOutputFileOptionsBuilder.b(file3);
                imageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file3, ImageCaptureBuilder.b.INSTANCE);
                if (fileB != null && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileB, imageCaptureImageCaptureError.asInterface)) {
                    imageCaptureImageCaptureError.b(fileB);
                }
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageCaptureImageCaptureError imageCaptureImageCaptureError, ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, boolean z, Function1 function1, ImageReaderFormatRecommenderFormatCombo imageReaderFormatRecommenderFormatCombo) {
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(imageCaptureImageCaptureError, "");
        Intrinsics.checkNotNullParameter(function1, "");
        synchronized (imageCaptureImageCaptureError.cancel) {
            if (imageCaptureOutputFileOptionsBuilder != null) {
                try {
                    fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageCaptureOutputFileOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
            ImageAnalysisNonBlockingAnalyzer setlocation = (imageCaptureOutputFileOptionsBuilder == null || fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) ? new setLocation() : new getLocation(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1, fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null ? imageCaptureOutputFileOptionsBuilder.b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1) : null, imageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault3, imageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault2, imageCaptureImageCaptureError.TuitionPaymentFragmentbindingInflater1, imageCaptureImageCaptureError.asInterface);
            function1.invoke(setlocation);
            if (imageReaderFormatRecommenderFormatCombo != null) {
                imageReaderFormatRecommenderFormatCombo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(!(setlocation instanceof setLocation));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.ImageCaptureOnImageSavedCallback
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateTransformMatrixAndCropRect p0, final boolean p1, final Function1<? super ImageAnalysisNonBlockingAnalyzer, Unit> p2) {
        ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder;
        final ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder2;
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        int i = WhenMappings.$EnumSwitchMapping$0[p0.notify.ordinal()];
        String nameWithoutExtension = null;
        if (i == 1) {
            imageCaptureOutputFileOptionsBuilder = this.a;
        } else {
            if (i == 2) {
                imageCaptureOutputFileOptionsBuilder = this.g;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                imageCaptureOutputFileOptionsBuilder2 = null;
            }
            InternalLogger internalLogger = this.asInterface;
            String name = ImageCaptureImageCaptureError.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            TelemetryMetricType telemetryMetricType = TelemetryMetricType.MethodCalled;
            float rate = MethodCallSamplingRate.RARE.getRate();
            if (imageCaptureOutputFileOptionsBuilder2 != null && (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageCaptureOutputFileOptionsBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) != null) {
                nameWithoutExtension = FilesKt.getNameWithoutExtension(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            StringBuilder sb = new StringBuilder("writeCurrentBatch[");
            sb.append(nameWithoutExtension);
            sb.append("]");
            final ImageReaderFormatRecommenderFormatCombo imageReaderFormatRecommenderFormatComboTuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(name, telemetryMetricType, rate, sb.toString());
            ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, "Data write", this.asInterface, new Runnable() { // from class: isPostviewSupported
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, imageCaptureOutputFileOptionsBuilder2, p1, p2, imageReaderFormatRecommenderFormatComboTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            });
        }
        imageCaptureOutputFileOptionsBuilder2 = imageCaptureOutputFileOptionsBuilder;
        InternalLogger internalLogger2 = this.asInterface;
        String name2 = ImageCaptureImageCaptureError.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        TelemetryMetricType telemetryMetricType2 = TelemetryMetricType.MethodCalled;
        float rate2 = MethodCallSamplingRate.RARE.getRate();
        if (imageCaptureOutputFileOptionsBuilder2 != null) {
            nameWithoutExtension = FilesKt.getNameWithoutExtension(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        StringBuilder sb2 = new StringBuilder("writeCurrentBatch[");
        sb2.append(nameWithoutExtension);
        sb2.append("]");
        final ImageReaderFormatRecommenderFormatCombo imageReaderFormatRecommenderFormatComboTuitionPaymentFragmentspecialinlinedviewModeldefault4 = internalLogger2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(name2, telemetryMetricType2, rate2, sb2.toString());
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, "Data write", this.asInterface, new Runnable() { // from class: isPostviewSupported
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureImageCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, imageCaptureOutputFileOptionsBuilder2, p1, p2, imageReaderFormatRecommenderFormatComboTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        });
    }
}
