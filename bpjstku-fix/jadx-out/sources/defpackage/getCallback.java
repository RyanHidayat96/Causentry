package defpackage;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.exifinterface.media.ExifInterface;
import coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class getCallback implements onSessionReady, LayoutModifier {
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<Constraints> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Constraints.m6875boximpl(setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));

    @Override // defpackage.onSessionReady
    public final Object b(Continuation<? super onQueueTitleChanged> continuation) {
        return lambdapause5androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentbindingInflater1(new b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), continuation);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo385measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(Constraints.m6875boximpl(j));
        final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight(), null, new Function1() { // from class: registerCallbackMessenger
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(placeableMo5637measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    public static final class b implements clampVideoBitrateIfNotSupported<onQueueTitleChanged> {
        private /* synthetic */ clampVideoBitrateIfNotSupported TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: getCallback$b$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass1<T> implements addSignalEosTimeoutIfNeeded {
            private /* synthetic */ addSignalEosTimeoutIfNeeded $TuitionPaymentFragmentbindingInflater1;

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            @Override // defpackage.addSignalEosTimeoutIfNeeded
            public final Object emit(Object obj, Continuation continuation) {
                ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) {
                    constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = (ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) continuation;
                    if ((constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label & Integer.MIN_VALUE) != 0) {
                        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label -= Integer.MIN_VALUE;
                    } else {
                        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = new ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                } else {
                    constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = new ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1(this, continuation);
                }
                Object obj2 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj2);
                    addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.$TuitionPaymentFragmentbindingInflater1;
                    onQueueTitleChanged onqueuetitlechangedTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setSubscription.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Constraints) obj).getValue());
                    if (onqueuetitlechangedTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.label = 1;
                        if (addsignaleostimeoutifneeded.emit(onqueuetitlechangedTuitionPaymentFragmentspecialinlinedviewModeldefault1, constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }

            public AnonymousClass1(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
                this.$TuitionPaymentFragmentbindingInflater1 = addsignaleostimeoutifneeded;
            }
        }

        public b(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported) {
            this.TuitionPaymentFragmentbindingInflater1 = clampvideobitrateifnotsupported;
        }

        @Override // defpackage.clampVideoBitrateIfNotSupported
        public final Object collect(addSignalEosTimeoutIfNeeded<? super onQueueTitleChanged> addsignaleostimeoutifneeded, Continuation continuation) {
            Object objCollect = this.TuitionPaymentFragmentbindingInflater1.collect(new AnonymousClass1(addsignaleostimeoutifneeded), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
    }
}
