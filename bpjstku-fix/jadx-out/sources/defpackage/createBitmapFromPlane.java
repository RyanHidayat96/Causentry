package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Handler;
import com.bpjstku.R;
import com.google.android.gms.measurement.internal.zznf;
import com.google.zxing.ResultMetadataType;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class createBitmapFromPlane {
    public DecoratedBarcodeView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public EncoderProfilesProxyVideoProfileProxyVideoEncoder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ForwardingCameraInfo f881a;
    public Handler asInterface;
    public Activity b;
    private final CameraPreview.b onTransact;
    public int asBinder = -1;
    public boolean cancel = false;
    public boolean d = false;
    boolean g = false;
    public ArrayRingBuffer TuitionPaymentFragmentbindingInflater1 = new ArrayRingBuffer() { // from class: createBitmapFromPlane.2
        @Override // defpackage.ArrayRingBuffer
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<DeferrableSurfaces1> list) {
        }

        @Override // defpackage.ArrayRingBuffer
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final computeCropRectFromDispatchInfo computecroprectfromdispatchinfo) {
            createBitmapFromPlane.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            EncoderProfilesProxyVideoProfileProxyVideoEncoder encoderProfilesProxyVideoProfileProxyVideoEncoder = createBitmapFromPlane.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            synchronized (encoderProfilesProxyVideoProfileProxyVideoEncoder) {
                if (encoderProfilesProxyVideoProfileProxyVideoEncoder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    encoderProfilesProxyVideoProfileProxyVideoEncoder.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                boolean z = encoderProfilesProxyVideoProfileProxyVideoEncoder.TuitionPaymentFragmentbindingInflater1;
            }
            createBitmapFromPlane.this.asInterface.post(new Runnable() { // from class: createBitmapFromPlane.2.4
                @Override // java.lang.Runnable
                public final void run() {
                    createBitmapFromPlane createbitmapfromplane = createBitmapFromPlane.this;
                    computeCropRectFromDispatchInfo computecroprectfromdispatchinfo2 = computecroprectfromdispatchinfo;
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createbitmapfromplane.TuitionPaymentFragmentspecialinlinedviewModeldefault3(computecroprectfromdispatchinfo2);
                    Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                    intent.addFlags(524288);
                    intent.putExtra("SCAN_RESULT", computecroprectfromdispatchinfo2.toString());
                    intent.putExtra("SCAN_RESULT_FORMAT", computecroprectfromdispatchinfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
                    byte[] bArr = computecroprectfromdispatchinfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr != null && bArr.length > 0) {
                        intent.putExtra("SCAN_RESULT_BYTES", bArr);
                    }
                    Map<ResultMetadataType, Object> map = computecroprectfromdispatchinfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (map != null) {
                        if (map.containsKey(ResultMetadataType.UPC_EAN_EXTENSION)) {
                            intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(ResultMetadataType.UPC_EAN_EXTENSION).toString());
                        }
                        Number number = (Number) map.get(ResultMetadataType.ORIENTATION);
                        if (number != null) {
                            intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                        }
                        String str = (String) map.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
                        if (str != null) {
                            intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str);
                        }
                        Iterable iterable = (Iterable) map.get(ResultMetadataType.BYTE_SEGMENTS);
                        if (iterable != null) {
                            Iterator it = iterable.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_".concat(String.valueOf(i)), (byte[]) it.next());
                                i++;
                            }
                        }
                    }
                    if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                        intent.putExtra("SCAN_RESULT_IMAGE_PATH", strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    createbitmapfromplane.b.setResult(-1, intent);
                    createbitmapfromplane.TuitionPaymentFragmentbindingInflater1();
                }
            });
        }
    };

    public createBitmapFromPlane(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        CameraPreview.b bVar = new CameraPreview.b() { // from class: createBitmapFromPlane.1
            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void b() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc) {
                createBitmapFromPlane.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                if (createBitmapFromPlane.this.g) {
                    createBitmapFromPlane.this.b.finish();
                }
            }
        };
        this.onTransact = bVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        this.b = activity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = decoratedBarcodeView;
        ((BarcodeView) decoratedBarcodeView.findViewById(R.id.zxing_barcode_surface)).g.add(bVar);
        this.asInterface = new Handler();
        this.f881a = new ForwardingCameraInfo(activity, new Runnable() { // from class: createBitmapFromPlane.4
            @Override // java.lang.Runnable
            public final void run() {
                createBitmapFromPlane.this.b.finish();
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EncoderProfilesProxyVideoProfileProxyVideoEncoder(activity);
    }

    public final void TuitionPaymentFragmentbindingInflater1(int i, int[] iArr) {
        if (i == 250) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 125814690, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -125814690, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, objArr);
        }
    }

    String TuitionPaymentFragmentspecialinlinedviewModeldefault3(computeCropRectFromDispatchInfo computecroprectfromdispatchinfo) {
        if (!this.cancel) {
            return null;
        }
        isJpegFormats isjpegformats = computecroprectfromdispatchinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Rect rect = isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (isjpegformats.asInterface % 180 != 0) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(isjpegformats.TuitionPaymentFragmentbindingInflater1, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault3, isjpegformats.b, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (isjpegformats.asInterface != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(isjpegformats.asInterface);
            bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        }
        try {
            File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.b.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return fileCreateTempFile.getAbsolutePath();
        } catch (IOException e2) {
            e2.toString();
            return null;
        }
    }

    void TuitionPaymentFragmentbindingInflater1() {
        isCropAspectRatioHasEffect iscropaspectratiohaseffect = ((BarcodeView) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.findViewById(R.id.zxing_barcode_surface)).b;
        if (iscropaspectratiohaseffect != null && !iscropaspectratiohaseffect.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.g = true;
        } else {
            this.b.finish();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.f881a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (this.b.isFinishing() || this.d || this.g) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(this.b.getString(R.string.zxing_app_name));
        builder.setMessage(this.b.getString(R.string.zxing_msg_camera_framework_bug));
        builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: createBitmapFromPlane.5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                createBitmapFromPlane.this.b.finish();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: createBitmapFromPlane.8
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                createBitmapFromPlane.this.b.finish();
            }
        });
        builder.show();
    }
}
