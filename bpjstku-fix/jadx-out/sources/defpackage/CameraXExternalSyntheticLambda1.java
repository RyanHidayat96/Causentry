package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraXExternalSyntheticLambda1<DataT> implements getSchedulerHandler<Integer, DataT> {
    private final Context TuitionPaymentFragmentbindingInflater1;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault1<DataT> {
        void TuitionPaymentFragmentbindingInflater1(DataT datat) throws IOException;

        Class<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        DataT TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resources.Theme theme, Resources resources, int i);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Integer num, int i, int i2, getTargetRotation gettargetrotation) {
        Resources resources;
        Integer num2 = num;
        isMirroring<Resources.Theme> ismirroring = ExtendableBuilder.b;
        Resources.Theme theme = (Resources.Theme) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.TuitionPaymentFragmentbindingInflater1.getResources();
        }
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1(new setResolutionSelector(num2), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(theme, resources, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, num2.intValue()));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Integer num) {
        return true;
    }

    CameraXExternalSyntheticLambda1(Context context, TuitionPaymentFragmentspecialinlinedviewModeldefault1<DataT> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.TuitionPaymentFragmentbindingInflater1 = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getDeviceSurfaceManagerProvider<Integer, AssetFileDescriptor>, TuitionPaymentFragmentspecialinlinedviewModeldefault1<AssetFileDescriptor> {
        private final Context TuitionPaymentFragmentbindingInflater1;

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        public TuitionPaymentFragmentbindingInflater1(Context context) {
            this.TuitionPaymentFragmentbindingInflater1 = context;
        }

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return AssetFileDescriptor.class;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Integer, AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new CameraXExternalSyntheticLambda1(this.TuitionPaymentFragmentbindingInflater1, this);
        }

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ AssetFileDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class b implements getDeviceSurfaceManagerProvider<Integer, InputStream>, TuitionPaymentFragmentspecialinlinedviewModeldefault1<InputStream> {
        private final Context b;

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        public b(Context context) {
            this.b = context;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Integer, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new CameraXExternalSyntheticLambda1(this.b, this);
        }

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return InputStream.class;
        }

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getDeviceSurfaceManagerProvider<Integer, Drawable>, TuitionPaymentFragmentspecialinlinedviewModeldefault1<Drawable> {
        private final Context TuitionPaymentFragmentbindingInflater1;

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Drawable drawable) throws IOException {
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
            this.TuitionPaymentFragmentbindingInflater1 = context;
        }

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return Drawable.class;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Integer, Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new CameraXExternalSyntheticLambda1(this.TuitionPaymentFragmentbindingInflater1, this);
        }

        @Override // CameraXExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ Drawable TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resources.Theme theme, Resources resources, int i) {
            Context context = this.TuitionPaymentFragmentbindingInflater1;
            return ExperimentalMirrorMode.TuitionPaymentFragmentbindingInflater1(context, context, i, theme);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<DataT> implements isUseCasesCombinationSupportedByFramework<DataT> {
        private final Resources TuitionPaymentFragmentbindingInflater1;
        private final Resources.Theme TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private DataT TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault1<DataT> b;

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Resources.Theme theme, Resources resources, TuitionPaymentFragmentspecialinlinedviewModeldefault1<DataT> tuitionPaymentFragmentspecialinlinedviewModeldefault1, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = theme;
            this.TuitionPaymentFragmentbindingInflater1 = resources;
            this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super DataT> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            try {
                DataT datatTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = datatTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(datatTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } catch (Resources.NotFoundException e2) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
            DataT datat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (datat != null) {
                try {
                    this.b.TuitionPaymentFragmentbindingInflater1(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<DataT> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            return DataSource.LOCAL;
        }
    }
}
