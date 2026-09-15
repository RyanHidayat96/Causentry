package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class createVideoCapture implements createImageAnalysis, createUseCaseGroup {
    private final List<Annotation> TuitionPaymentFragmentbindingInflater1;
    private final List<Annotation>[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f890a;
    private final int asBinder;
    private final boolean[] asInterface;
    private final createImageAnalysis[] b;
    private final createImageAnalysis[] cancel;
    private final deactivateRecording d;
    private final String g;
    private final Set<String> onTransact;

    @Override // defpackage.createImageAnalysis
    public final boolean b() {
        return false;
    }

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        return false;
    }

    public createVideoCapture(String str, deactivateRecording deactivaterecording, int i, List<? extends createImageAnalysis> list, calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deactivaterecording, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(calculateuptimetorealtimeoffsetus, "");
        this.g = str;
        this.d = deactivaterecording;
        this.asBinder = i;
        this.TuitionPaymentFragmentbindingInflater1 = calculateuptimetorealtimeoffsetus.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.onTransact = CollectionsKt.toHashSet(calculateuptimetorealtimeoffsetus.b);
        String[] strArr = (String[]) calculateuptimetorealtimeoffsetus.b.toArray(new String[0]);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = strArr;
        this.b = updatePreviewViewTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(calculateuptimetorealtimeoffsetus.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (List[]) calculateuptimetorealtimeoffsetus.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toArray(new List[0]);
        this.asInterface = CollectionsKt.toBooleanArray(calculateuptimetorealtimeoffsetus.TuitionPaymentFragmentbindingInflater1);
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.f890a = MapsKt.toMap(arrayList);
        this.cancel = updatePreviewViewTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: configureResolution
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                createVideoCapture createvideocapture = this.TuitionPaymentFragmentbindingInflater1;
                return Integer.valueOf(CameraControllerExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createvideocapture, createvideocapture.cancel));
            }
        });
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final String getINotificationSideChannel() {
        return this.g;
    }

    @Override // defpackage.createImageAnalysis
    public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return this.d;
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.asBinder;
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.createUseCaseGroup
    public final Set<String> a() {
        return this.onTransact;
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i];
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer num = this.f890a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i];
    }

    @Override // defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return this.b[i];
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return this.asInterface[i];
    }

    public final boolean equals(Object obj) {
        createVideoCapture createvideocapture = this;
        if (createvideocapture == obj) {
            return true;
        }
        if (!(obj instanceof createVideoCapture)) {
            return false;
        }
        createImageAnalysis createimageanalysis = (createImageAnalysis) obj;
        if (!Intrinsics.areEqual(createvideocapture.getINotificationSideChannel(), createimageanalysis.getINotificationSideChannel()) || !Arrays.equals(this.cancel, ((createVideoCapture) obj).cancel) || createvideocapture.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() != createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return false;
        }
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = createvideocapture.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            if (!Intrinsics.areEqual(createvideocapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel(), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel()) || !Intrinsics.areEqual(createvideocapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).TuitionPaymentFragmentbindingInflater1(), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).TuitionPaymentFragmentbindingInflater1())) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ CharSequence TuitionPaymentFragmentspecialinlinedviewModeldefault1(createVideoCapture createvideocapture, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(createvideocapture.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i]);
        sb.append(": ");
        sb.append(createvideocapture.b[i].getINotificationSideChannel());
        return sb.toString();
    }

    public final int hashCode() {
        return ((Number) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).intValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append('(');
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.asBinder), ", ", sb.toString(), ")", 0, null, new Function1() { // from class: createImageCapture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createVideoCapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
