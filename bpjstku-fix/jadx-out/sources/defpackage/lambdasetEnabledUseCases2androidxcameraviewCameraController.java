package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes7.dex */
final class lambdasetEnabledUseCases2androidxcameraviewCameraController implements KType {
    private final KType TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdasetEnabledUseCases2androidxcameraviewCameraController(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = kType;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List<Annotation> getAnnotations() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List<KTypeProjection> getArguments() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClassifier();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isMarkedNullable();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KType kType = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        lambdasetEnabledUseCases2androidxcameraviewCameraController lambdasetenabledusecases2androidxcameraviewcameracontroller = obj instanceof lambdasetEnabledUseCases2androidxcameraviewCameraController ? (lambdasetEnabledUseCases2androidxcameraviewCameraController) obj : null;
        if (!Intrinsics.areEqual(kType, lambdasetenabledusecases2androidxcameraviewcameracontroller != null ? lambdasetenabledusecases2androidxcameraviewcameracontroller.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            KType kType2 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) classifier), JvmClassMappingKt.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KTypeWrapper: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return sb.toString();
    }
}
