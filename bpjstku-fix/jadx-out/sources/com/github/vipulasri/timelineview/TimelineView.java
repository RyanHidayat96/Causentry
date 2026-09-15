package com.github.vipulasri.timelineview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import defpackage.lambdatransform3androidxcameracoreimagecaptureProcessingNode;

/* JADX INFO: loaded from: classes3.dex */
public class TimelineView extends View {
    private int INotificationSideChannel;
    private Drawable INotificationSideChannelDefault;
    private int INotificationSideChannelStub;
    private int INotificationSideChannelStubProxy;
    private float IconCompatParcelizer;
    private int MediaBrowserCompat;
    private boolean RemoteActionCompatParcelizer;
    private float TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Rect TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f766a;
    private float asBinder;
    private int asInterface;
    private boolean b;
    private int cancel;
    private Paint cancelAll;
    private float connect;
    private int d;
    private float disconnect;
    private float g;
    private float getExtras;
    private int getInterfaceDescriptor;
    private int notify;
    private int onTransact;
    private int read;
    private int write;

    public static int b(int i, int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i == 0) {
            return 1;
        }
        return i == i2 - 1 ? 2 : 0;
    }

    public TimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cancelAll = new Paint();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        this.b = false;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.INotificationSideChannelDefault = typedArrayObtainStyledAttributes.getDrawable(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g);
        this.write = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify, (int) TypedValue.applyDimension(1, 20.0f, getContext().getResources().getDisplayMetrics()));
        this.INotificationSideChannelStub = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact, 0);
        this.read = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel, 0);
        this.getInterfaceDescriptor = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll, 0);
        this.INotificationSideChannelStubProxy = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel, 0);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1269a, true);
        this.MediaBrowserCompat = typedArrayObtainStyledAttributes.getColor(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy, getResources().getColor(R.color.darker_gray));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = typedArrayObtainStyledAttributes.getColor(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getResources().getColor(R.color.darker_gray));
        this.notify = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder, (int) TypedValue.applyDimension(1, 2.0f, getContext().getResources().getDisplayMetrics()));
        this.d = typedArrayObtainStyledAttributes.getInt(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, 1);
        this.asInterface = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0);
        this.onTransact = typedArrayObtainStyledAttributes.getInt(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, 0);
        this.INotificationSideChannel = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics()));
        this.cancel = typedArrayObtainStyledAttributes.getDimensionPixelSize(lambdatransform3androidxcameracoreimagecaptureProcessingNode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface, (int) TypedValue.applyDimension(1, 4.0f, getContext().getResources().getDisplayMetrics()));
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.b = true;
        }
        if (this.INotificationSideChannelDefault == null) {
            this.INotificationSideChannelDefault = getResources().getDrawable(com.bpjstku.R.drawable.marker);
        }
        b();
        TuitionPaymentFragmentbindingInflater1();
        setLayerType(1, null);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.write;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i4 = this.write;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(resolveSizeAndState(i3 + paddingLeft + paddingRight, i, 0), resolveSizeAndState(i4 + paddingTop + getPaddingBottom(), i2, 0));
        b();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    private void b() {
        int i;
        int i2;
        int i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        int iMin = Math.min(this.write, Math.min((width - paddingLeft) - paddingRight, (height - paddingTop) - paddingBottom));
        if (this.RemoteActionCompatParcelizer) {
            int i4 = width / 2;
            int i5 = iMin / 2;
            int i6 = i4 - i5;
            int i7 = height / 2;
            int i8 = i7 - i5;
            int i9 = i4 + i5;
            int i10 = i7 + i5;
            int i11 = this.d;
            if (i11 == 0) {
                int i12 = this.INotificationSideChannelStub - this.getInterfaceDescriptor;
                i6 += i12;
                i9 += i12;
            } else if (i11 == 1) {
                int i13 = this.read - this.INotificationSideChannelStubProxy;
                i8 += i13;
                i10 += i13;
            }
            Drawable drawable = this.INotificationSideChannelDefault;
            if (drawable != null) {
                drawable.setBounds(i6, i8, i9, i10);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.INotificationSideChannelDefault.getBounds();
            }
        } else {
            int i14 = paddingLeft + iMin;
            int i15 = this.d;
            if (i15 == 0) {
                int i16 = height / 2;
                int i17 = iMin / 2;
                i = i16 - i17;
                i2 = i17 + i16;
                int i18 = this.INotificationSideChannelStub - this.getInterfaceDescriptor;
                i3 = i18 + paddingLeft;
                i14 += i18;
            } else if (i15 != 1) {
                i3 = paddingLeft;
                i2 = paddingTop;
                i = i2;
            } else {
                int i19 = this.read;
                int i20 = this.INotificationSideChannelStubProxy;
                i = (i19 - i20) + paddingTop;
                i2 = ((iMin + i19) - i20) + paddingTop;
                i3 = paddingLeft;
            }
            Drawable drawable2 = this.INotificationSideChannelDefault;
            if (drawable2 != null) {
                drawable2.setBounds(i3, i, i14, i2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.INotificationSideChannelDefault.getBounds();
            }
        }
        if (this.d == 0) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.connect = paddingLeft;
                this.IconCompatParcelizer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerY();
                this.disconnect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.left - this.asInterface;
                this.getExtras = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerY();
            }
            if (this.b) {
                if (this.onTransact == 1) {
                    this.TuitionPaymentFragmentbindingInflater1 = getWidth() - this.cancel;
                    this.f766a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerY();
                    this.g = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.right + this.asInterface;
                    this.asBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerY();
                } else {
                    this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.right + this.asInterface;
                    this.f766a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerY();
                    this.g = getWidth();
                    this.asBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerY();
                }
            }
        } else {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.connect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerX();
                this.IconCompatParcelizer = paddingTop;
                this.disconnect = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerX();
                this.getExtras = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.top - this.asInterface;
            }
            if (this.b) {
                if (this.onTransact == 1) {
                    this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerX();
                    this.f766a = getHeight() - this.cancel;
                    this.g = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerX();
                    this.asBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.bottom + this.asInterface;
                } else {
                    this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerX();
                    this.f766a = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.bottom + this.asInterface;
                    this.g = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.centerX();
                    this.asBinder = getHeight();
                }
            }
        }
        invalidate();
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        this.cancelAll.setAlpha(0);
        this.cancelAll.setAntiAlias(true);
        this.cancelAll.setColor(this.MediaBrowserCompat);
        this.cancelAll.setStyle(Paint.Style.STROKE);
        this.cancelAll.setStrokeWidth(this.notify);
        if (this.onTransact == 1) {
            this.cancelAll.setPathEffect(new DashPathEffect(new float[]{this.INotificationSideChannel, this.cancel}, 0.0f));
        } else {
            this.cancelAll.setPathEffect(new PathEffect());
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.INotificationSideChannelDefault;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.cancelAll.setColor(this.MediaBrowserCompat);
            canvas.drawLine(this.connect, this.IconCompatParcelizer, this.disconnect, this.getExtras, this.cancelAll);
        }
        if (this.b) {
            this.cancelAll.setColor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            canvas.drawLine(this.TuitionPaymentFragmentbindingInflater1, this.f766a, this.g, this.asBinder, this.cancelAll);
        }
    }

    public void setMarker(Drawable drawable) {
        this.INotificationSideChannelDefault = drawable;
        b();
    }

    public void setMarker(Drawable drawable, int i) {
        this.INotificationSideChannelDefault = drawable;
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        b();
    }

    public void setMarkerColor(int i) {
        this.INotificationSideChannelDefault.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        b();
    }

    public void setStartLineColor(int i, int i2) {
        this.MediaBrowserCompat = i;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
    }

    public void setEndLineColor(int i, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
    }

    public void setMarkerSize(int i) {
        this.write = i;
        b();
    }

    public void setMarkerPaddingLeft(int i) {
        this.INotificationSideChannelStub = i;
        b();
    }

    public void setMarkerPaddingTop(int i) {
        this.read = i;
        b();
    }

    public void setMarkerPaddingRight(int i) {
        this.getInterfaceDescriptor = i;
        b();
    }

    public void setMarkerPaddingBottom(int i) {
        this.INotificationSideChannelStubProxy = i;
        b();
    }

    public void setMarkerInCenter(boolean z) {
        this.RemoteActionCompatParcelizer = z;
        b();
    }

    public void setLineWidth(int i) {
        this.notify = i;
        b();
    }

    public void setLinePadding(int i) {
        this.asInterface = i;
        b();
    }

    public void setLineOrientation(int i) {
        this.d = i;
    }

    public void setLineStyle(int i) {
        this.onTransact = i;
        TuitionPaymentFragmentbindingInflater1();
    }

    public void setLineStyleDashLength(int i) {
        this.INotificationSideChannel = i;
        TuitionPaymentFragmentbindingInflater1();
    }

    public void setLineStyleDashGap(int i) {
        this.cancel = i;
        TuitionPaymentFragmentbindingInflater1();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        if (i == 1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            this.b = true;
        } else if (i == 2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.b = false;
        } else if (i == 3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            this.b = false;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.b = true;
        }
        b();
    }
}
