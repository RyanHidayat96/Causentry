package defpackage;

import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;
import com.rtchagas.pingplacepicker.viewmodel.Resource;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends setCollectionUri {
    public AutoValue_FileOutputOptions_FileOutputOptionsInternal1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final MutableLiveData<Resource<List<Place>>> TuitionPaymentFragmentbindingInflater1 = new MutableLiveData<>();
    private LatLng TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new LatLng(0.0d, 0.0d);

    public AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(AutoValue_FileOutputOptions_FileOutputOptionsInternal1 autoValue_FileOutputOptions_FileOutputOptionsInternal1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_FileOutputOptions_FileOutputOptionsInternal1;
    }

    public final LiveData<Resource<List<Place>>> b(LatLng latLng) {
        deriveCodec<List<Place>> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (this.TuitionPaymentFragmentbindingInflater1.getValue() != null && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, latLng)) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = latLng;
        AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
        if (AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(latLng);
        } else {
            derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault2, appendbackupvideoprofileB);
        appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
        share.b(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1, "scheduler is null");
        SingleObserveOn singleObserveOn = new SingleObserveOn(singleSubscribeOn, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1);
        logToString<BufferProviderState> logtostring = new logToString<BufferProviderState>() { // from class: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.4
            @Override // defpackage.logToString
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final void accept(BufferProviderState bufferProviderState) {
                MutableLiveData mutableLiveData = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.this.TuitionPaymentFragmentbindingInflater1;
                Resource.Companion companion2 = Resource.INSTANCE;
                mutableLiveData.setValue(Resource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        };
        share.b(logtostring, "onSubscribe is null");
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SilentAudioStreamExternalSyntheticLambda0(singleObserveOn, logtostring).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString<List<? extends Place>>() { // from class: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.5
            @Override // defpackage.logToString
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final void accept(List<? extends Place> list) {
                MutableLiveData mutableLiveData = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.this.TuitionPaymentFragmentbindingInflater1;
                Resource.Companion companion2 = Resource.INSTANCE;
                mutableLiveData.setValue(Resource.Companion.TuitionPaymentFragmentbindingInflater1(list));
            }
        }, new logToString<Throwable>() { // from class: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.2
            @Override // defpackage.logToString
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable th) {
                MutableLiveData mutableLiveData = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.this.TuitionPaymentFragmentbindingInflater1;
                Resource.Companion companion2 = Resource.INSTANCE;
                mutableLiveData.setValue(Resource.Companion.TuitionPaymentFragmentbindingInflater1(th));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
