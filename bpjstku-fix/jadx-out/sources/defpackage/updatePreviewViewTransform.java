package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
public final class updatePreviewViewTransform {
    private static final createImageAnalysis[] TuitionPaymentFragmentbindingInflater1 = new createImageAnalysis[0];

    public static final Set<String> TuitionPaymentFragmentbindingInflater1(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        if (createimageanalysis instanceof createUseCaseGroup) {
            return ((createUseCaseGroup) createimageanalysis).a();
        }
        HashSet hashSet = new HashSet(createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int tuitionPaymentFragmentspecialinlinedviewModeldefault2 = createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault2; i++) {
            hashSet.add(createimageanalysis.TuitionPaymentFragmentbindingInflater1(i));
        }
        return hashSet;
    }

    public static final createImageAnalysis[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<? extends createImageAnalysis> list) {
        createImageAnalysis[] createimageanalysisArr;
        List<? extends createImageAnalysis> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (createimageanalysisArr = (createImageAnalysis[]) list.toArray(new createImageAnalysis[0])) == null) ? TuitionPaymentFragmentbindingInflater1 : createimageanalysisArr;
    }

    public static final Void TuitionPaymentFragmentbindingInflater1(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        Intrinsics.checkNotNullParameter(simpleName, "");
        StringBuilder sb = new StringBuilder("Serializer for class '");
        sb.append(simpleName);
        sb.append("' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
        throw new SerializationException(sb.toString());
    }

    public static final KClass<Object> TuitionPaymentFragmentbindingInflater1(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (classifier instanceof KTypeParameter) {
            StringBuilder sb = new StringBuilder("Captured type parameter ");
            sb.append(classifier);
            sb.append(" from generic non-reified function. Such functionality cannot be supported because ");
            sb.append(classifier);
            sb.append(" is erased, either specify serializer explicitly or make calling function inline with reified ");
            sb.append(classifier);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got ".concat(String.valueOf(classifier)));
    }

    public static final KType TuitionPaymentFragmentspecialinlinedviewModeldefault2(KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "");
        KType type = kTypeProjection.getType();
        if (type != null) {
            return type;
        }
        StringBuilder sb = new StringBuilder("Star projections in type arguments are not allowed, but had ");
        sb.append(kTypeProjection.getType());
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
