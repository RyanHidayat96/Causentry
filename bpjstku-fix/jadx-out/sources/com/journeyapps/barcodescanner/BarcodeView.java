package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.bpjstku.R;
import com.google.zxing.DecodeHintType;
import defpackage.ArrayRingBuffer;
import defpackage.DeferrableSurfaces1;
import defpackage.computeCropRectFromDispatchInfo;
import defpackage.createBitmapFromImageProxy;
import defpackage.createBitmapFromRgbaImage;
import defpackage.createDirectByteBuffer;
import defpackage.cropJpegByteArray;
import defpackage.getRotatedAspectRatio;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BarcodeView extends CameraPreview {
    ArrayRingBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    createDirectByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    DecodeMode TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler.Callback f834a;
    private Handler asInterface;
    private createBitmapFromImageProxy d;

    enum DecodeMode {
        NONE,
        SINGLE,
        /* JADX INFO: Fake field, exist only in values array */
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DecodeMode.NONE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        Handler.Callback callback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.BarcodeView.4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_decode_succeeded) {
                    computeCropRectFromDispatchInfo computecroprectfromdispatchinfo = (computeCropRectFromDispatchInfo) message.obj;
                    if (computecroprectfromdispatchinfo != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DecodeMode.NONE) {
                        BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(computecroprectfromdispatchinfo);
                        if (BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == DecodeMode.SINGLE) {
                            BarcodeView barcodeView = BarcodeView.this;
                            barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DecodeMode.NONE;
                            barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            createDirectByteBuffer createdirectbytebuffer = barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (createdirectbytebuffer != null) {
                                createdirectbytebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                            }
                        }
                    }
                    return true;
                }
                if (message.what == R.id.zxing_decode_failed) {
                    return true;
                }
                if (message.what != R.id.zxing_possible_result_points) {
                    return false;
                }
                List<DeferrableSurfaces1> list = (List) message.obj;
                if (BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DecodeMode.NONE) {
                    BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
                }
                return true;
            }
        };
        this.f834a = callback;
        this.d = new cropJpegByteArray();
        this.asInterface = new Handler(callback);
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DecodeMode.NONE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        Handler.Callback callback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.BarcodeView.4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_decode_succeeded) {
                    computeCropRectFromDispatchInfo computecroprectfromdispatchinfo = (computeCropRectFromDispatchInfo) message.obj;
                    if (computecroprectfromdispatchinfo != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DecodeMode.NONE) {
                        BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(computecroprectfromdispatchinfo);
                        if (BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == DecodeMode.SINGLE) {
                            BarcodeView barcodeView = BarcodeView.this;
                            barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DecodeMode.NONE;
                            barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            createDirectByteBuffer createdirectbytebuffer = barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (createdirectbytebuffer != null) {
                                createdirectbytebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                            }
                        }
                    }
                    return true;
                }
                if (message.what == R.id.zxing_decode_failed) {
                    return true;
                }
                if (message.what != R.id.zxing_possible_result_points) {
                    return false;
                }
                List<DeferrableSurfaces1> list = (List) message.obj;
                if (BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DecodeMode.NONE) {
                    BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
                }
                return true;
            }
        };
        this.f834a = callback;
        this.d = new cropJpegByteArray();
        this.asInterface = new Handler(callback);
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DecodeMode.NONE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        Handler.Callback callback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.BarcodeView.4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_decode_succeeded) {
                    computeCropRectFromDispatchInfo computecroprectfromdispatchinfo = (computeCropRectFromDispatchInfo) message.obj;
                    if (computecroprectfromdispatchinfo != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DecodeMode.NONE) {
                        BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(computecroprectfromdispatchinfo);
                        if (BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == DecodeMode.SINGLE) {
                            BarcodeView barcodeView = BarcodeView.this;
                            barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DecodeMode.NONE;
                            barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                            createDirectByteBuffer createdirectbytebuffer = barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (createdirectbytebuffer != null) {
                                createdirectbytebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                            }
                        }
                    }
                    return true;
                }
                if (message.what == R.id.zxing_decode_failed) {
                    return true;
                }
                if (message.what != R.id.zxing_possible_result_points) {
                    return false;
                }
                List<DeferrableSurfaces1> list = (List) message.obj;
                if (BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != DecodeMode.NONE) {
                    BarcodeView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
                }
                return true;
            }
        };
        this.f834a = callback;
        this.d = new cropJpegByteArray();
        this.asInterface = new Handler(callback);
    }

    private createBitmapFromRgbaImage asInterface() {
        if (this.d == null) {
            this.d = new cropJpegByteArray();
        }
        getRotatedAspectRatio getrotatedaspectratio = new getRotatedAspectRatio();
        HashMap map = new HashMap();
        map.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, getrotatedaspectratio);
        createBitmapFromRgbaImage createbitmapfromrgbaimageTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(map);
        getrotatedaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createbitmapfromrgbaimageTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return createbitmapfromrgbaimageTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    protected final void TuitionPaymentFragmentbindingInflater1() {
        super.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        createDirectByteBuffer createdirectbytebuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (createdirectbytebuffer != null) {
            createdirectbytebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == DecodeMode.NONE || !TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return;
        }
        createDirectByteBuffer createdirectbytebuffer2 = new createDirectByteBuffer(this.b, asInterface(), this.asInterface);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = createdirectbytebuffer2;
        createdirectbytebuffer2.b = this.asBinder;
        createDirectByteBuffer createdirectbytebuffer3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            HandlerThread handlerThread = new HandlerThread(createDirectByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            createdirectbytebuffer3.INotificationSideChannel = handlerThread;
            handlerThread.start();
            createdirectbytebuffer3.f883a = new Handler(createdirectbytebuffer3.INotificationSideChannel.getLooper(), createdirectbytebuffer3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            createdirectbytebuffer3.d = true;
            if (createdirectbytebuffer3.TuitionPaymentFragmentbindingInflater1.d) {
                createdirectbytebuffer3.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(createdirectbytebuffer3.asBinder);
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        createDirectByteBuffer createdirectbytebuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (createdirectbytebuffer != null) {
            createdirectbytebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setDecoderFactory(createBitmapFromImageProxy createbitmapfromimageproxy) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.d = createbitmapfromimageproxy;
            createDirectByteBuffer createdirectbytebuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (createdirectbytebuffer != null) {
                createdirectbytebuffer.g = asInterface();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
