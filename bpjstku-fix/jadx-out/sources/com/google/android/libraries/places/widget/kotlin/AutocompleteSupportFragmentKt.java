package com.google.android.libraries.places.widget.kotlin;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import defpackage.EncoderImpl;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.onEncodePaused;
import defpackage.setEncoderCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;", "LclampVideoBitrateIfNotSupported;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "placeSelectionEvents", "(Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)LclampVideoBitrateIfNotSupported;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AutocompleteSupportFragmentKt {
    public static final clampVideoBitrateIfNotSupported<PlaceSelectionResult> placeSelectionEvents(AutocompleteSupportFragment autocompleteSupportFragment) {
        Intrinsics.checkNotNullParameter(autocompleteSupportFragment, "");
        return new EncoderImpl(new AnonymousClass1(autocompleteSupportFragment, null), null, 0, null, 14, null);
    }

    /* JADX INFO: renamed from: com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt$placeSelectionEvents$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public static final /* synthetic */ int zzc = 0;
        int zza;
        final /* synthetic */ AutocompleteSupportFragment zzb;
        private /* synthetic */ Object zzd;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((onEncodePaused) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.zza;
            ResultKt.throwOnFailure(obj);
            if (i == 0) {
                final onEncodePaused onencodepaused = (onEncodePaused) this.zzd;
                final AutocompleteSupportFragment autocompleteSupportFragment = this.zzb;
                autocompleteSupportFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() { // from class: com.google.android.libraries.places.widget.kotlin.AutocompleteSupportFragmentKt.placeSelectionEvents.1.1
                    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
                    public final void onError(Status p0) {
                        Intrinsics.checkNotNullParameter(p0, "");
                        onencodepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PlaceSelectionError(p0));
                    }

                    @Override // com.google.android.libraries.places.widget.listener.PlaceSelectionListener
                    public final void onPlaceSelected(Place p0) {
                        Intrinsics.checkNotNullParameter(p0, "");
                        onencodepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PlaceSelectionSuccess(p0));
                    }
                });
                this.zza = 1;
                if (setEncoderCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(onencodepaused, new Function0() { // from class: com.google.android.libraries.places.widget.kotlin.zza
                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Object invoke() {
                        autocompleteSupportFragment.setOnPlaceSelectedListener(null);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AutocompleteSupportFragment autocompleteSupportFragment, Continuation continuation) {
            super(2, continuation);
            this.zzb = autocompleteSupportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.zzb, continuation);
            anonymousClass1.zzd = obj;
            return anonymousClass1;
        }
    }
}
