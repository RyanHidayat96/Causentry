package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemRadioButtonBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u00060\u0004R\u00020\u00000\u0001:\u0001\u0012BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007\u0012\"\b\u0002\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"LlambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl;", "LsetVirtualCameraRotationDegrees;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "LsetPictureInPictureParams;", "LlambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function2;", "", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LlambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl$b;", "b", "Landroid/content/Context;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl extends setVirtualCameraRotationDegrees<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams>, b> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function2<Integer, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams>, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Context b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl(Context context, ArrayList arrayList, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams>> list, Function2<? super Integer, ? super lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams>, Unit> function2) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
    }

    private b TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemRadioButtonBinding itemRadioButtonBindingInflate = ItemRadioButtonBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemRadioButtonBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemRadioButtonBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams>> {
        private final ItemRadioButtonBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl, ItemRadioButtonBinding itemRadioButtonBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemRadioButtonBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl;
            Context context = lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            AppCompatRadioButton root = itemRadioButtonBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemRadioButtonBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
            final lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<setPictureInPictureParams> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2 = lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy;
            Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2, "");
            ItemRadioButtonBinding itemRadioButtonBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            View view = this.itemView;
            itemRadioButtonBinding.rbChoice.setText(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
            itemRadioButtonBinding.rbChoice.setChecked(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentbindingInflater1);
            Intrinsics.checkNotNull(view);
            view.setOnClickListener(new isBound(new Function1() { // from class: lambdaremoveSessionCameraCaptureCallback9androidxcameracamera2internalCamera2CameraControlImpl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl, this, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaupdateSessionConfigAsync7androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl, b bVar, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function2 function2 = lambdaupdatesessionconfigasync7androidxcameracamera2internalcamera2cameracontrolimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(bVar.getAdapterPosition()), lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            }
            return Unit.INSTANCE;
        }
    }
}
