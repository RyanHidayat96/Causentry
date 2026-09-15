package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bpjstku.R;
import com.google.android.gms.measurement.internal.zznf;
import defpackage.ArrayRingBuffer;
import defpackage.DeferrableSurfaces1;
import defpackage.addConfig;
import defpackage.computeCropRectFromDispatchInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DecoratedBarcodeView extends FrameLayout {
    public BarcodeView TuitionPaymentFragmentbindingInflater1;
    private TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ViewfinderView b;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ArrayRingBuffer {
        private ArrayRingBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(ArrayRingBuffer arrayRingBuffer) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayRingBuffer;
        }

        @Override // defpackage.ArrayRingBuffer
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(computeCropRectFromDispatchInfo computecroprectfromdispatchinfo) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(computecroprectfromdispatchinfo);
        }

        @Override // defpackage.ArrayRingBuffer
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<DeferrableSurfaces1> list) {
            for (DeferrableSurfaces1 deferrableSurfaces1 : list) {
                List<DeferrableSurfaces1> list2 = DecoratedBarcodeView.this.b.TuitionPaymentFragmentbindingInflater1;
                list2.add(deferrableSurfaces1);
                int size = list2.size();
                if (size > 20) {
                    list2.subList(0, size - 10).clear();
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(attributeSet);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, addConfig.b.cancelAll);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(addConfig.b.onTransact, R.layout.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.TuitionPaymentFragmentbindingInflater1 = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -892119474, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 892119476, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{barcodeView, attributeSet});
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.TuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) findViewById(R.id.zxing_status_view);
    }

    public void setStatusText(String str) {
        TextView textView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchOn() {
        this.TuitionPaymentFragmentbindingInflater1.setTorch(true);
    }

    public void setTorchOff() {
        this.TuitionPaymentFragmentbindingInflater1.setTorch(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            setTorchOn();
            return true;
        }
        if (i == 25) {
            setTorchOff();
            return true;
        }
        if (i == 27 || i == 80) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setTorchListener(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
