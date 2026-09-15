package com.bpjstku.util.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import defpackage.onPlaybackPositionUpdate;

/* JADX INFO: loaded from: classes3.dex */
public class CircleImageView extends ImageView {
    private static final ImageView.ScaleType TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private final RectF INotificationSideChannel;
    private float INotificationSideChannelDefault;
    private final Paint INotificationSideChannelStub;
    private final RectF INotificationSideChannelStubProxy;
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private int TuitionPaymentFragmentbindingInflater1;
    private Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Paint TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f667a;
    private boolean asBinder;
    private int asInterface;
    private int cancel;
    private boolean cancelAll;
    private final Matrix connect;
    private BitmapShader d;
    private final Paint g;
    private int getInterfaceDescriptor;
    private float notify;
    private ColorFilter onTransact;

    public CircleImageView(Context context) {
        super(context);
        this.INotificationSideChannelStubProxy = new RectF();
        this.INotificationSideChannel = new RectF();
        this.connect = new Matrix();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Paint();
        this.g = new Paint();
        this.INotificationSideChannelStub = new Paint();
        this.f667a = ViewCompat.MEASURED_STATE_MASK;
        this.cancel = 0;
        this.getInterfaceDescriptor = 0;
        super.setScaleType(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.RemoteActionCompatParcelizer = true;
        if (this.IconCompatParcelizer) {
            TuitionPaymentFragmentbindingInflater1();
            this.IconCompatParcelizer = false;
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.INotificationSideChannelStubProxy = new RectF();
        this.INotificationSideChannel = new RectF();
        this.connect = new Matrix();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Paint();
        this.g = new Paint();
        this.INotificationSideChannelStub = new Paint();
        this.f667a = ViewCompat.MEASURED_STATE_MASK;
        this.cancel = 0;
        this.getInterfaceDescriptor = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onPlaybackPositionUpdate.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, i, 0);
        this.cancel = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f667a = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
        this.asBinder = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.getInterfaceDescriptor = typedArrayObtainStyledAttributes.getColor(3, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setScaleType(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.RemoteActionCompatParcelizer = true;
        if (this.IconCompatParcelizer) {
            TuitionPaymentFragmentbindingInflater1();
            this.IconCompatParcelizer = false;
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.cancelAll) {
            super.onDraw(canvas);
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            if (this.getInterfaceDescriptor != 0) {
                canvas.drawCircle(this.INotificationSideChannelStubProxy.centerX(), this.INotificationSideChannelStubProxy.centerY(), this.INotificationSideChannelDefault, this.INotificationSideChannelStub);
            }
            canvas.drawCircle(this.INotificationSideChannelStubProxy.centerX(), this.INotificationSideChannelStubProxy.centerY(), this.INotificationSideChannelDefault, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (this.cancel > 0) {
                canvas.drawCircle(this.INotificationSideChannel.centerX(), this.INotificationSideChannel.centerY(), this.notify, this.g);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        TuitionPaymentFragmentbindingInflater1();
    }

    public void setBorderColor(int i) {
        if (i == this.f667a) {
            return;
        }
        this.f667a = i;
        this.g.setColor(i);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    @Deprecated
    public void setFillColor(int i) {
        if (i == this.getInterfaceDescriptor) {
            return;
        }
        this.getInterfaceDescriptor = i;
        this.INotificationSideChannelStub.setColor(i);
        invalidate();
    }

    @Deprecated
    public void setFillColorResource(int i) {
        setFillColor(getContext().getResources().getColor(i));
    }

    public void setBorderWidth(int i) {
        if (i == this.cancel) {
            return;
        }
        this.cancel = i;
        TuitionPaymentFragmentbindingInflater1();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.asBinder) {
            return;
        }
        this.asBinder = z;
        TuitionPaymentFragmentbindingInflater1();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.cancelAll == z) {
            return;
        }
        this.cancelAll = z;
        if (z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDrawable());
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.cancelAll) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDrawable());
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.cancelAll) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDrawable());
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.cancelAll) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDrawable());
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.cancelAll) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDrawable());
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.onTransact) {
            return;
        }
        this.onTransact = colorFilter;
        Paint paint = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidate();
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.onTransact;
    }

    private static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmapCreateBitmap = Bitmap.createBitmap(2, 2, b);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        int i;
        if (!this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.d = new BitmapShader(bitmap, tileMode, tileMode);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setAntiAlias(true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setShader(this.d);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setAntiAlias(true);
        this.g.setColor(this.f667a);
        this.g.setStrokeWidth(this.cancel);
        this.INotificationSideChannelStub.setStyle(Paint.Style.FILL);
        this.INotificationSideChannelStub.setAntiAlias(true);
        this.INotificationSideChannelStub.setColor(this.getInterfaceDescriptor);
        this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getHeight();
        this.asInterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getWidth();
        this.INotificationSideChannel.set(b());
        this.notify = Math.min((this.INotificationSideChannel.height() - this.cancel) / 2.0f, (this.INotificationSideChannel.width() - this.cancel) / 2.0f);
        this.INotificationSideChannelStubProxy.set(this.INotificationSideChannel);
        if (!this.asBinder && (i = this.cancel) > 0) {
            float f = i - 1.0f;
            this.INotificationSideChannelStubProxy.inset(f, f);
        }
        this.INotificationSideChannelDefault = Math.min(this.INotificationSideChannelStubProxy.height() / 2.0f, this.INotificationSideChannelStubProxy.width() / 2.0f);
        Paint paint = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (paint != null) {
            paint.setColorFilter(this.onTransact);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        invalidate();
    }

    private RectF b() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = getPaddingLeft() + ((width - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((height - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        float fWidth;
        float fHeight;
        this.connect.set(null);
        float fWidth2 = 0.0f;
        if (this.asInterface * this.INotificationSideChannelStubProxy.height() > this.INotificationSideChannelStubProxy.width() * this.TuitionPaymentFragmentbindingInflater1) {
            fWidth = this.INotificationSideChannelStubProxy.height() / this.TuitionPaymentFragmentbindingInflater1;
            fHeight = 0.0f;
            fWidth2 = (this.INotificationSideChannelStubProxy.width() - (this.asInterface * fWidth)) * 0.5f;
        } else {
            fWidth = this.INotificationSideChannelStubProxy.width() / this.asInterface;
            fHeight = (this.INotificationSideChannelStubProxy.height() - (this.TuitionPaymentFragmentbindingInflater1 * fWidth)) * 0.5f;
        }
        this.connect.setScale(fWidth, fWidth);
        this.connect.postTranslate(((int) (fWidth2 + 0.5f)) + this.INotificationSideChannelStubProxy.left, ((int) (fHeight + 0.5f)) + this.INotificationSideChannelStubProxy.top);
        this.d.setLocalMatrix(this.connect);
    }
}
