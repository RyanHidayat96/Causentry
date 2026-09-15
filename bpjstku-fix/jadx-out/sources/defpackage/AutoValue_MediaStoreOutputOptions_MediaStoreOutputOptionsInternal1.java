package defpackage;

import android.graphics.Bitmap;
import androidx.p002lifecycle.MutableLiveData;
import com.rtchagas.pingplacepicker.viewmodel.Resource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1 extends setCollectionUri {
    public AutoValue_FileOutputOptions_FileOutputOptionsInternal1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<Resource<Bitmap>> b = new MutableLiveData<>();

    public AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1(AutoValue_FileOutputOptions_FileOutputOptionsInternal1 autoValue_FileOutputOptions_FileOutputOptionsInternal1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_FileOutputOptions_FileOutputOptionsInternal1;
    }

    /* JADX INFO: renamed from: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1$5, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/graphics/Bitmap;)V"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass5<T> implements logToString<Bitmap> {
        @Override // defpackage.logToString
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
        public final void accept(Bitmap bitmap) {
            MutableLiveData mutableLiveData = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.this.b;
            Resource.Companion companion = Resource.INSTANCE;
            mutableLiveData.setValue(Resource.Companion.TuitionPaymentFragmentbindingInflater1(bitmap));
        }

        public AnonymousClass5() {
        }

        public static /* synthetic */ void b() {
            isPossibleMod16FromAspectRatio.TuitionPaymentFragmentbindingInflater1[0] = AspectRatioUtilCompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
        }
    }
}
