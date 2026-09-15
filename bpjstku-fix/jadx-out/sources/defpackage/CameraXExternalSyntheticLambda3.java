package defpackage;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXExternalSyntheticLambda3<Model, Data> implements getSchedulerHandler<Model, Data> {
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> TuitionPaymentFragmentbindingInflater1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> {
        Class<Data> TuitionPaymentFragmentbindingInflater1();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Data data) throws IOException;

        Data TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IllegalArgumentException;
    }

    public CameraXExternalSyntheticLambda3(TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.getSchedulerHandler
    public final getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<Data> TuitionPaymentFragmentbindingInflater1(Model model, int i, int i2, getTargetRotation gettargetrotation) {
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(new setResolutionSelector(model), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(model.toString(), this.TuitionPaymentFragmentbindingInflater1));
    }

    @Override // defpackage.getSchedulerHandler
    public final boolean TuitionPaymentFragmentbindingInflater1(Model model) {
        return model.toString().startsWith("data:image");
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> implements isUseCasesCombinationSupportedByFramework<Data> {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Data TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final String b;

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, TuitionPaymentFragmentspecialinlinedviewModeldefault3<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super Data> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            try {
                Data dataTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = dataTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(dataTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } catch (IllegalArgumentException e2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            return DataSource.LOCAL;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<Model> implements getDeviceSurfaceManagerProvider<Model, InputStream> {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3<InputStream>() { // from class: CameraXExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.3
            @Override // CameraXExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // CameraXExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final Class<InputStream> TuitionPaymentFragmentbindingInflater1() {
                return InputStream.class;
            }

            @Override // CameraXExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
                return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            }
        };

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Model, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new CameraXExternalSyntheticLambda3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            UseCaseAttachStateExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = UseCaseAttachStateExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
        }
    }
}
