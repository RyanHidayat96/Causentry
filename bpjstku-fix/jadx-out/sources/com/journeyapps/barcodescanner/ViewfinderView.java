package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bpjstku.R;
import defpackage.DeferrableSurfaces1;
import defpackage.addConfig;
import java.util.ArrayList;
import java.util.List;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public class ViewfinderView extends View {
    private static int[] b = {0, 64, 128, DerHeader.TAG_CLASS_PRIVATE, 255, DerHeader.TAG_CLASS_PRIVATE, 128, 64};
    private int INotificationSideChannel;
    List<DeferrableSurfaces1> TuitionPaymentFragmentbindingInflater1;
    private CameraPreview TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Rect TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DeferrableSurfaces1> f836a;
    private Rect asBinder;
    private Bitmap asInterface;
    private Paint d;
    private int g;
    private int notify;
    private int onTransact;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, addConfig.b.asBinder);
        int i = addConfig.b.g;
        this.g = typedArrayObtainStyledAttributes.getColor(3, resources.getColor(R.color.zxing_viewfinder_mask));
        int i2 = addConfig.b.asInterface;
        this.onTransact = typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        int i3 = addConfig.b.f254a;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = typedArrayObtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        int i4 = addConfig.b.d;
        this.INotificationSideChannel = typedArrayObtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        typedArrayObtainStyledAttributes.recycle();
        this.notify = 0;
        this.TuitionPaymentFragmentbindingInflater1 = new ArrayList(5);
        this.f836a = null;
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraPreview;
        cameraPreview.g.add(new CameraPreview.b() { // from class: com.journeyapps.barcodescanner.ViewfinderView.5
            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc) {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void b() {
                ViewfinderView.this.b();
                ViewfinderView.this.invalidate();
            }
        });
    }

    protected final void b() {
        CameraPreview cameraPreview = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cameraPreview != null) {
            Rect rect = cameraPreview.TuitionPaymentFragmentbindingInflater1;
            Rect rect2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder;
            if (rect == null || rect2 == null) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = rect;
            this.asBinder = rect2;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect;
        b();
        Rect rect2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (rect2 == null || (rect = this.asBinder) == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.d.setColor(this.g);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rect2.top, this.d);
        canvas.drawRect(0.0f, rect2.top, rect2.left, rect2.bottom + 1, this.d);
        canvas.drawRect(rect2.right + 1, rect2.top, f, rect2.bottom + 1, this.d);
        canvas.drawRect(0.0f, rect2.bottom + 1, f, height, this.d);
        this.d.setColor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Paint paint = this.d;
        int[] iArr = b;
        paint.setAlpha(iArr[this.notify]);
        this.notify = (this.notify + 1) % iArr.length;
        int iHeight = (rect2.height() / 2) + rect2.top;
        canvas.drawRect(rect2.left + 2, iHeight - 1, rect2.right - 1, iHeight + 2, this.d);
        float fWidth = rect2.width() / rect.width();
        float fHeight = rect2.height() / rect.height();
        List<DeferrableSurfaces1> list = this.TuitionPaymentFragmentbindingInflater1;
        List<DeferrableSurfaces1> list2 = this.f836a;
        int i = rect2.left;
        int i2 = rect2.top;
        if (list.isEmpty()) {
            this.f836a = null;
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = new ArrayList(5);
            this.f836a = list;
            this.d.setAlpha(160);
            this.d.setColor(this.INotificationSideChannel);
            for (DeferrableSurfaces1 deferrableSurfaces1 : list) {
                canvas.drawCircle(((int) (deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * fWidth)) + i, ((int) (deferrableSurfaces1.b * fHeight)) + i2, 6.0f, this.d);
            }
        }
        if (list2 != null) {
            this.d.setAlpha(80);
            this.d.setColor(this.INotificationSideChannel);
            for (DeferrableSurfaces1 deferrableSurfaces2 : list2) {
                canvas.drawCircle(((int) (deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * fWidth)) + i, ((int) (deferrableSurfaces2.b * fHeight)) + i2, 3.0f, this.d);
            }
        }
        postInvalidateDelayed(80L, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
    }
}
