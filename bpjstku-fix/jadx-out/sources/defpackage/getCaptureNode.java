package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.features.ImagePickerConfig;
import com.esafirm.imagepicker.features.ImagePickerSavePath;
import com.esafirm.imagepicker.features.ReturnMode;
import com.esafirm.imagepicker.model.Image;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getCaptureNode {
    public ImagePickerConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public abstract void b();

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends getCaptureNode {
        private Activity TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activity;
            ImagePickerConfig imagePickerConfig = new ImagePickerConfig();
            imagePickerConfig.INotificationSideChannel = 2;
            imagePickerConfig.d = 999;
            imagePickerConfig.cancel = true;
            imagePickerConfig.b = false;
            imagePickerConfig.onTransact = new ArrayList<>();
            imagePickerConfig.INotificationSideChannelStub = ImagePickerSavePath.TuitionPaymentFragmentbindingInflater1;
            imagePickerConfig.cancelAll = ReturnMode.NONE;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imagePickerConfig;
        }

        @Override // defpackage.getCaptureNode
        public final void b() {
            Activity activity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            createPacketWithHalRotation.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f765a;
            ImagePickerConfig imagePickerConfig = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (imagePickerConfig == null) {
                throw new IllegalStateException("ImagePickerConfig cannot be null");
            }
            if (imagePickerConfig.INotificationSideChannel == 1 || (imagePickerConfig.cancelAll != ReturnMode.GALLERY_ONLY && imagePickerConfig.cancelAll != ReturnMode.ALL)) {
                Intent intent = new Intent(activity, (Class<?>) ImagePickerActivity.class);
                intent.putExtra("ImagePickerConfig", imagePickerConfig);
                activity.startActivityForResult(intent, 553);
                return;
            }
            throw new IllegalStateException("ReturnMode.GALLERY_ONLY and ReturnMode.ALL is only applicable in Single Mode!");
        }
    }

    public static Image b(Intent intent) {
        ArrayList parcelableArrayListExtra = intent == null ? null : intent.getParcelableArrayListExtra("selectedImages");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            return null;
        }
        return (Image) parcelableArrayListExtra.get(0);
    }
}
