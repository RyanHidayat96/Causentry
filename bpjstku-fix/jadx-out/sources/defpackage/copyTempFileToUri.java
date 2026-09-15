package defpackage;

import JpegBytes2Image.b;
import android.os.Handler;
import android.os.Looper;
import com.esafirm.imagepicker.features.ImagePickerConfig;
import com.esafirm.imagepicker.features.camera.DefaultCameraModule;
import com.esafirm.imagepicker.model.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class copyTempFileToUri extends writeBytesToFile<JpegBytes2DiskIn> {
    Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Handler(Looper.getMainLooper());
    DefaultCameraModule TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    JpegBytes2Image b;

    copyTempFileToUri(JpegBytes2Image jpegBytes2Image) {
        this.b = jpegBytes2Image;
    }

    /* JADX INFO: renamed from: copyTempFileToUri$3, reason: invalid class name */
    final class AnonymousClass3 implements createImageProxyWithEmptyMetadata {
        AnonymousClass3() {
        }

        @Override // defpackage.createImageProxyWithEmptyMetadata
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final List<Image> list, final List<lambdaprocessInputPacket5> list2) {
            copyTempFileToUri copytempfiletouri = copyTempFileToUri.this;
            copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new isSaveToFile(copytempfiletouri, new Runnable() { // from class: moveFileToTarget
                @Override // java.lang.Runnable
                public final void run() {
                    copyTempFileToUri.AnonymousClass3 anonymousClass3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    List<Image> list3 = list;
                    List<lambdaprocessInputPacket5> list4 = list2;
                    ((JpegBytes2DiskIn) copyTempFileToUri.this.TuitionPaymentFragmentbindingInflater1).b(list3, list4);
                    if (list4 != null ? list4.isEmpty() : list3.isEmpty()) {
                        ((JpegBytes2DiskIn) copyTempFileToUri.this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        ((JpegBytes2DiskIn) copyTempFileToUri.this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                    }
                }
            }));
        }

        @Override // defpackage.createImageProxyWithEmptyMetadata
        public final void TuitionPaymentFragmentbindingInflater1(final Throwable th) {
            copyTempFileToUri copytempfiletouri = copyTempFileToUri.this;
            copytempfiletouri.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new isSaveToFile(copytempfiletouri, new Runnable() { // from class: getFileExtensionWithDot
                @Override // java.lang.Runnable
                public final void run() {
                    copyTempFileToUri.AnonymousClass3 anonymousClass3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    ((JpegBytes2DiskIn) copyTempFileToUri.this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
                }
            }));
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<Image> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            if (!new File(list.get(i).TuitionPaymentFragmentbindingInflater1).exists()) {
                list.remove(i);
                i--;
            }
            i++;
        }
        ((JpegBytes2DiskIn) this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1(list);
    }

    final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            runnable.run();
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImagePickerConfig imagePickerConfig) {
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            boolean z = imagePickerConfig.b;
            boolean z2 = imagePickerConfig.g;
            boolean z3 = imagePickerConfig.notify;
            boolean z4 = imagePickerConfig.asBinder;
            ArrayList<File> arrayList = imagePickerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new isSaveToFile(this, new isSaveToOutputStream(this)));
            JpegBytes2Image jpegBytes2Image = this.b;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            if (jpegBytes2Image.TuitionPaymentFragmentbindingInflater1 == null) {
                jpegBytes2Image.TuitionPaymentFragmentbindingInflater1 = Executors.newSingleThreadExecutor();
            }
            jpegBytes2Image.TuitionPaymentFragmentbindingInflater1.execute(jpegBytes2Image.new b(z, z3, z2, z4, arrayList, anonymousClass3));
        }
    }
}
