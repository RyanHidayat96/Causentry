package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes7.dex */
public final class getTextureViewCorrectionMatrix {
    public static final createTransformedBitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(stopListeningToRotationEvents stoplisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        createTransformedBitmap createtransformedbitmap = stoplisteningtorotationevents instanceof createTransformedBitmap ? (createTransformedBitmap) stoplisteningtorotationevents : null;
        if (createtransformedbitmap != null) {
            return createtransformedbitmap;
        }
        StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        sb.append(Reflection.getOrCreateKotlinClass(stoplisteningtorotationevents.getClass()));
        throw new IllegalStateException(sb.toString());
    }

    public static final transformView TuitionPaymentFragmentspecialinlinedviewModeldefault1(startListeningToRotationEvents startlisteningtorotationevents) {
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        transformView transformview = startlisteningtorotationevents instanceof transformView ? (transformView) startlisteningtorotationevents : null;
        if (transformview != null) {
            return transformview;
        }
        StringBuilder sb = new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        sb.append(Reflection.getOrCreateKotlinClass(startlisteningtorotationevents.getClass()));
        throw new IllegalStateException(sb.toString());
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements createImageAnalysis {
        private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.createImageAnalysis
        public final boolean b() {
            return false;
        }

        @Override // defpackage.createImageAnalysis
        public final boolean d() {
            return false;
        }

        TuitionPaymentFragmentbindingInflater1(Function0<? extends createImageAnalysis> function0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(function0);
        }

        @Override // defpackage.createImageAnalysis
        public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return CollectionsKt.emptyList();
        }

        @Override // defpackage.createImageAnalysis
        public final List<Annotation> b(int i) {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b(i);
        }

        @Override // defpackage.createImageAnalysis
        public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // defpackage.createImageAnalysis
        public final int TuitionPaymentFragmentbindingInflater1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1(str);
        }

        @Override // defpackage.createImageAnalysis
        public final String TuitionPaymentFragmentbindingInflater1(int i) {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1(i);
        }

        @Override // defpackage.createImageAnalysis
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
        public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.createImageAnalysis
        public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.createImageAnalysis
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public final String getINotificationSideChannel() {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getINotificationSideChannel();
        }

        @Override // defpackage.createImageAnalysis
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            return ((createImageAnalysis) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        }
    }
}
