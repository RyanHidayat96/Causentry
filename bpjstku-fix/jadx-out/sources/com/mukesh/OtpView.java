package com.mukesh;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import defpackage.createCameraCaptureCallback;
import defpackage.getParentMetadataCallback;
import defpackage.notifyStateAttached;

/* JADX INFO: loaded from: classes4.dex */
public class OtpView extends AppCompatEditText {
    private boolean INotificationSideChannel;
    private int INotificationSideChannelDefault;
    private final PointF INotificationSideChannelStub;
    private final RectF INotificationSideChannelStubProxy;
    private int IconCompatParcelizer;
    private notifyStateAttached MediaBrowserCompat;
    private ColorStateList RemoteActionCompatParcelizer;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    private final TextPaint TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f859a;
    private int asBinder;
    private int asInterface;
    private boolean cancel;
    private boolean cancelAll;
    private int connect;
    private int d;
    private final Path disconnect;
    private float g;
    private int getExtras;
    private final RectF getInterfaceDescriptor;
    private final Paint getItem;
    private int getNotifyChildrenChangedOptions;
    private int getRoot;
    private int getServiceComponent;
    private boolean isConnected;
    private boolean notify;
    private Drawable onTransact;
    private String read;
    private final Rect sendCustomAction;
    private int write;
    private static final InputFilter[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new InputFilter[0];
    private static final int[] b = {R.attr.state_selected};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {com.bpjstku.R.attr.state_filled};

    public OtpView(Context context) {
        this(context, null);
    }

    public OtpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.bpjstku.R.attr.otpViewStyle);
    }

    public OtpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextPaint textPaint = new TextPaint();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = textPaint;
        this.asBinder = ViewCompat.MEASURED_STATE_MASK;
        this.sendCustomAction = new Rect();
        this.getInterfaceDescriptor = new RectF();
        this.INotificationSideChannelStubProxy = new RectF();
        this.disconnect = new Path();
        this.INotificationSideChannelStub = new PointF();
        this.INotificationSideChannel = false;
        Resources resources = getResources();
        Paint paint = new Paint(1);
        this.getItem = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i, 0);
        this.getServiceComponent = typedArrayObtainStyledAttributes.getInt(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy, 2);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder, 4);
        int i2 = getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d;
        this.connect = (int) typedArrayObtainStyledAttributes.getDimension(6, resources.getDimensionPixelSize(com.bpjstku.R.dimen.otp_view_item_size));
        int i3 = getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel;
        this.getNotifyChildrenChangedOptions = (int) typedArrayObtainStyledAttributes.getDimension(9, resources.getDimensionPixelSize(com.bpjstku.R.dimen.otp_view_item_size));
        int i4 = getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g;
        this.getExtras = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, resources.getDimensionPixelSize(com.bpjstku.R.dimen.otp_view_item_spacing));
        this.getRoot = (int) typedArrayObtainStyledAttributes.getDimension(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f963a, 0.0f);
        int i5 = getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify;
        this.write = (int) typedArrayObtainStyledAttributes.getDimension(11, resources.getDimensionPixelSize(com.bpjstku.R.dimen.otp_view_item_line_width));
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getColorStateList(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll);
        this.cancelAll = typedArrayObtainStyledAttributes.getBoolean(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, true);
        this.d = typedArrayObtainStyledAttributes.getColor(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, getCurrentTextColor());
        int i6 = getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.asInterface = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(com.bpjstku.R.dimen.otp_view_cursor_width));
        this.onTransact = typedArrayObtainStyledAttributes.getDrawable(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.notify = typedArrayObtainStyledAttributes.getBoolean(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface, false);
        this.isConnected = typedArrayObtainStyledAttributes.getBoolean(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact, false);
        this.read = typedArrayObtainStyledAttributes.getString(getParentMetadataCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.RemoteActionCompatParcelizer;
        if (colorStateList != null) {
            this.asBinder = colorStateList.getDefaultColor();
        }
        asInterface();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.IconCompatParcelizer);
        paint.setStrokeWidth(this.write);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f859a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.f859a.setInterpolator(new DecelerateInterpolator());
        this.f859a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mukesh.OtpView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OtpView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setTextSize(OtpView.this.getTextSize() * fFloatValue);
                OtpView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setAlpha((int) (255.0f * fFloatValue));
                OtpView.this.postInvalidate();
            }
        });
        super.setCursorVisible(false);
        setTextIsSelectable(false);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        setFilters(i >= 0 ? new InputFilter[]{new InputFilter.LengthFilter(i)} : TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = this.getServiceComponent;
        if (i == 1) {
            if (this.getRoot > this.write / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i == 0) {
            if (this.getRoot > this.getNotifyChildrenChangedOptions / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.connect;
        if (mode != 1073741824) {
            int i4 = this.IconCompatParcelizer;
            size = ViewCompat.getPaddingStart(this) + ((i4 - 1) * this.getExtras) + (i4 * this.getNotifyChildrenChangedOptions) + ViewCompat.getPaddingEnd(this);
            if (this.getExtras == 0) {
                size -= (this.IconCompatParcelizer - 1) * this.write;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + i3 + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ValueAnimator valueAnimator;
        notifyStateAttached notifystateattached;
        if (i != charSequence.length() && getText() != null) {
            setSelection(getText().length());
        }
        if (charSequence.length() == this.IconCompatParcelizer && (notifystateattached = this.MediaBrowserCompat) != null) {
            notifystateattached.TuitionPaymentFragmentspecialinlinedviewModeldefault3(charSequence.toString());
        }
        TuitionPaymentFragmentbindingInflater1();
        if (!this.INotificationSideChannel || i3 - i2 <= 0 || (valueAnimator = this.f859a) == null) {
            return;
        }
        valueAnimator.end();
        this.f859a.start();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            if (getText() != null) {
                setSelection(getText().length());
            }
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (getText() == null || i2 == getText().length() || getText() == null) {
            return;
        }
        setSelection(getText().length());
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.RemoteActionCompatParcelizer;
        if (colorStateList == null || colorStateList.isStateful()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x0223  */
    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int length;
        int i2;
        int[] iArr;
        ColorStateList colorStateList;
        int colorForState;
        boolean z;
        int[] drawableState;
        int colorForState2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        ColorStateList colorStateList2;
        canvas.save();
        this.getItem.setColor(this.asBinder);
        this.getItem.setStyle(Paint.Style.STROKE);
        this.getItem.setStrokeWidth(this.write);
        getPaint().setColor(getCurrentTextColor());
        if (this.isConnected) {
            length = this.IconCompatParcelizer - 1;
        } else {
            if (getText() != null) {
                length = getText().length();
            } else {
                i = 0;
            }
            for (i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
                if (isFocused() || i != i2) {
                    z = false;
                } else {
                    z = true;
                }
                if (i2 < i) {
                    drawableState = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                } else if (z) {
                    drawableState = b;
                } else {
                    drawableState = null;
                }
                Paint paint = this.getItem;
                colorForState2 = (drawableState == null || (colorStateList2 = this.RemoteActionCompatParcelizer) == null) ? this.asBinder : colorStateList2.getColorForState(drawableState, this.asBinder);
                paint.setColor(colorForState2);
                b(i2);
                b();
                canvas.save();
                if (this.getServiceComponent == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2);
                    canvas.clipPath(this.disconnect);
                }
                if (this.onTransact != null) {
                    float f = this.write / 2.0f;
                    this.onTransact.setBounds(Math.round(this.getInterfaceDescriptor.left - f), Math.round(this.getInterfaceDescriptor.top - f), Math.round(this.getInterfaceDescriptor.right + f), Math.round(this.getInterfaceDescriptor.bottom + f));
                    if (this.getServiceComponent != 2) {
                        Drawable drawable = this.onTransact;
                        if (drawableState == null) {
                            drawableState = getDrawableState();
                        }
                        drawable.setState(drawableState);
                    }
                    this.onTransact.draw(canvas);
                }
                canvas.restore();
                if (z && this.cancel) {
                    float f2 = this.INotificationSideChannelStub.x;
                    float f3 = this.INotificationSideChannelStub.y - (this.g / 2.0f);
                    int color = this.getItem.getColor();
                    float strokeWidth = this.getItem.getStrokeWidth();
                    this.getItem.setColor(this.d);
                    this.getItem.setStrokeWidth(this.asInterface);
                    canvas.drawLine(f2, f3, f2, f3 + this.g, this.getItem);
                    this.getItem.setColor(color);
                    this.getItem.setStrokeWidth(strokeWidth);
                }
                i3 = this.getServiceComponent;
                if (i3 == 0) {
                    b(canvas, i2);
                } else if (i3 == 1 && (getText() == null || !this.notify || i2 >= getText().length())) {
                    if (this.getExtras == 0 || (i4 = this.IconCompatParcelizer) <= 1) {
                        z2 = true;
                    } else {
                        if (i2 == 0) {
                            z3 = false;
                            z4 = true;
                        } else if (i2 == i4 - 1) {
                            z4 = false;
                            z3 = true;
                        } else {
                            z2 = false;
                        }
                        this.getItem.setStyle(Paint.Style.FILL);
                        this.getItem.setStrokeWidth(this.write / 10.0f);
                        float f4 = this.write / 2.0f;
                        this.INotificationSideChannelStubProxy.set(this.getInterfaceDescriptor.left - f4, this.getInterfaceDescriptor.bottom - f4, this.getInterfaceDescriptor.right + f4, this.getInterfaceDescriptor.bottom + f4);
                        RectF rectF = this.INotificationSideChannelStubProxy;
                        float f5 = this.getRoot;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(rectF, f5, f5, z4, z3, z3, z4);
                        canvas.drawPath(this.disconnect, this.getItem);
                    }
                    z3 = z2;
                    z4 = z3;
                    this.getItem.setStyle(Paint.Style.FILL);
                    this.getItem.setStrokeWidth(this.write / 10.0f);
                    float f6 = this.write / 2.0f;
                    this.INotificationSideChannelStubProxy.set(this.getInterfaceDescriptor.left - f6, this.getInterfaceDescriptor.bottom - f6, this.getInterfaceDescriptor.right + f6, this.getInterfaceDescriptor.bottom + f6);
                    RectF rectF2 = this.INotificationSideChannelStubProxy;
                    float f7 = this.getRoot;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1(rectF2, f7, f7, z4, z3, z3, z4);
                    canvas.drawPath(this.disconnect, this.getItem);
                }
                if (this.isConnected) {
                    if (getText().length() >= this.IconCompatParcelizer - i2) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, i2);
                    } else if (TextUtils.isEmpty(getHint()) && getHint().length() == this.IconCompatParcelizer) {
                        TuitionPaymentFragmentbindingInflater1(canvas, i2);
                    }
                } else if (getText().length() > i2) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, i2);
                } else if (TextUtils.isEmpty(getHint()) && getHint().length() == this.IconCompatParcelizer) {
                    TuitionPaymentFragmentbindingInflater1(canvas, i2);
                }
            }
            if (isFocused() && getText() != null && getText().length() != this.IconCompatParcelizer && this.getServiceComponent == 0) {
                int length2 = getText().length();
                b(length2);
                b();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(length2);
                Paint paint2 = this.getItem;
                iArr = b;
                colorStateList = this.RemoteActionCompatParcelizer;
                if (colorStateList != null) {
                    colorForState = colorStateList.getColorForState(iArr, this.asBinder);
                } else {
                    colorForState = this.asBinder;
                }
                paint2.setColor(colorForState);
                b(canvas, length2);
            }
            canvas.restore();
        }
        i = length;
        while (i2 < this.IconCompatParcelizer) {
            if (isFocused()) {
                z = false;
            } else {
                z = false;
            }
            if (i2 < i) {
                drawableState = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } else if (z) {
                drawableState = b;
            } else {
                drawableState = null;
            }
            Paint paint3 = this.getItem;
            if (drawableState == null) {
                colorForState2 = this.asBinder;
            }
            paint3.setColor(colorForState2);
            b(i2);
            b();
            canvas.save();
            if (this.getServiceComponent == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2);
                canvas.clipPath(this.disconnect);
            }
            if (this.onTransact != null) {
                float f8 = this.write / 2.0f;
                this.onTransact.setBounds(Math.round(this.getInterfaceDescriptor.left - f8), Math.round(this.getInterfaceDescriptor.top - f8), Math.round(this.getInterfaceDescriptor.right + f8), Math.round(this.getInterfaceDescriptor.bottom + f8));
                if (this.getServiceComponent != 2) {
                    Drawable drawable2 = this.onTransact;
                    if (drawableState == null) {
                        drawableState = getDrawableState();
                    }
                    drawable2.setState(drawableState);
                }
                this.onTransact.draw(canvas);
            }
            canvas.restore();
            if (z) {
                float f9 = this.INotificationSideChannelStub.x;
                float f10 = this.INotificationSideChannelStub.y - (this.g / 2.0f);
                int color2 = this.getItem.getColor();
                float strokeWidth2 = this.getItem.getStrokeWidth();
                this.getItem.setColor(this.d);
                this.getItem.setStrokeWidth(this.asInterface);
                canvas.drawLine(f9, f10, f9, f10 + this.g, this.getItem);
                this.getItem.setColor(color2);
                this.getItem.setStrokeWidth(strokeWidth2);
            }
            i3 = this.getServiceComponent;
            if (i3 == 0) {
                b(canvas, i2);
            } else if (i3 == 1) {
                if (this.getExtras == 0) {
                    z2 = true;
                    z3 = z2;
                    z4 = z3;
                } else {
                    z2 = true;
                    z3 = z2;
                    z4 = z3;
                }
                this.getItem.setStyle(Paint.Style.FILL);
                this.getItem.setStrokeWidth(this.write / 10.0f);
                float f11 = this.write / 2.0f;
                this.INotificationSideChannelStubProxy.set(this.getInterfaceDescriptor.left - f11, this.getInterfaceDescriptor.bottom - f11, this.getInterfaceDescriptor.right + f11, this.getInterfaceDescriptor.bottom + f11);
                RectF rectF3 = this.INotificationSideChannelStubProxy;
                float f12 = this.getRoot;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(rectF3, f12, f12, z4, z3, z3, z4);
                canvas.drawPath(this.disconnect, this.getItem);
            }
            if (this.isConnected) {
                if (getText().length() >= this.IconCompatParcelizer - i2) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, i2);
                } else if (TextUtils.isEmpty(getHint())) {
                }
            } else if (getText().length() > i2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, i2);
            } else if (TextUtils.isEmpty(getHint())) {
            }
        }
        if (isFocused()) {
            int length3 = getText().length();
            b(length3);
            b();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(length3);
            Paint paint4 = this.getItem;
            iArr = b;
            colorStateList = this.RemoteActionCompatParcelizer;
            if (colorStateList != null) {
                colorForState = colorStateList.getColorForState(iArr, this.asBinder);
            } else {
                colorForState = this.asBinder;
            }
            paint4.setColor(colorForState);
            b(canvas, length3);
        }
        canvas.restore();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, int i) {
        int inputType;
        if (this.read != null && (getInputType() == 2 || (inputType = getInputType() & 4095) == 129 || inputType == 225 || inputType == 18)) {
            String string = Character.toString(this.read.charAt(0));
            Paint paintTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i);
            paintTuitionPaymentFragmentbindingInflater1.setColor(getCurrentTextColor());
            if (this.isConnected) {
                int length = this.IconCompatParcelizer - i;
                if (getText() != null) {
                    length -= getText().length();
                }
                if (length > 0 || getText() == null) {
                    return;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, paintTuitionPaymentFragmentbindingInflater1, getText().toString().replaceAll(".", string), Math.abs(length));
                return;
            }
            if (getText() != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, paintTuitionPaymentFragmentbindingInflater1, getText().toString().replaceAll(".", string), i);
                return;
            }
            return;
        }
        int inputType2 = getInputType() & 4095;
        if (inputType2 == 129 || inputType2 == 225 || inputType2 == 18) {
            Paint paintTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(i);
            float f = this.INotificationSideChannelStub.x;
            float f2 = this.INotificationSideChannelStub.y;
            if (this.isConnected) {
                if ((this.IconCompatParcelizer - i) - getHint().length() <= 0) {
                    canvas.drawCircle(f, f2, paintTuitionPaymentFragmentbindingInflater2.getTextSize() / 2.0f, paintTuitionPaymentFragmentbindingInflater2);
                    return;
                }
                return;
            }
            canvas.drawCircle(f, f2, paintTuitionPaymentFragmentbindingInflater2.getTextSize() / 2.0f, paintTuitionPaymentFragmentbindingInflater2);
            return;
        }
        Paint paintTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(i);
        paintTuitionPaymentFragmentbindingInflater3.setColor(getCurrentTextColor());
        if (this.isConnected) {
            int length2 = this.IconCompatParcelizer - i;
            if (getText() != null) {
                length2 -= getText().length();
            }
            if (length2 > 0 || getText() == null) {
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, paintTuitionPaymentFragmentbindingInflater3, getText(), Math.abs(length2));
            return;
        }
        if (getText() != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, paintTuitionPaymentFragmentbindingInflater3, getText(), i);
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        boolean z;
        boolean z2;
        if (this.getExtras != 0) {
            z = true;
            z2 = true;
        } else {
            boolean z3 = i == 0 && i != this.IconCompatParcelizer - 1;
            z = i == this.IconCompatParcelizer - 1 && i != 0;
            z2 = z3;
        }
        RectF rectF = this.getInterfaceDescriptor;
        float f = this.getRoot;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(rectF, f, f, z2, z, z, z2);
    }

    private void b(Canvas canvas, int i) {
        if (getText() == null || !this.notify || i >= getText().length()) {
            canvas.drawPath(this.disconnect, this.getItem);
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RectF rectF, float f, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.disconnect.reset();
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = (rectF.right - f3) - (f * 2.0f);
        float f6 = (rectF.bottom - f4) - (2.0f * f2);
        this.disconnect.moveTo(f3, f4 + f2);
        if (z) {
            float f7 = -f2;
            this.disconnect.rQuadTo(0.0f, f7, f, f7);
        } else {
            this.disconnect.rLineTo(0.0f, -f2);
            this.disconnect.rLineTo(f, 0.0f);
        }
        this.disconnect.rLineTo(f5, 0.0f);
        if (z2) {
            this.disconnect.rQuadTo(f, 0.0f, f, f2);
        } else {
            this.disconnect.rLineTo(f, 0.0f);
            this.disconnect.rLineTo(0.0f, f2);
        }
        this.disconnect.rLineTo(0.0f, f6);
        if (z3) {
            this.disconnect.rQuadTo(0.0f, f2, -f, f2);
        } else {
            this.disconnect.rLineTo(0.0f, f2);
            this.disconnect.rLineTo(-f, 0.0f);
        }
        this.disconnect.rLineTo(-f5, 0.0f);
        if (z4) {
            float f8 = -f;
            this.disconnect.rQuadTo(f8, 0.0f, f8, -f2);
        } else {
            this.disconnect.rLineTo(-f, 0.0f);
            this.disconnect.rLineTo(0.0f, -f2);
        }
        this.disconnect.rLineTo(0.0f, -f6);
        this.disconnect.close();
    }

    private void b(int i) {
        float f = this.write / 2.0f;
        int scrollX = getScrollX();
        int paddingStart = ViewCompat.getPaddingStart(this);
        int i2 = this.getExtras;
        int i3 = this.getNotifyChildrenChangedOptions;
        float f2 = scrollX + paddingStart + ((i2 + i3) * i) + f;
        if (i2 == 0 && i > 0) {
            f2 -= this.write * i;
        }
        float f3 = this.write;
        float scrollY = getScrollY() + getPaddingTop() + f;
        this.getInterfaceDescriptor.set(f2, scrollY, (i3 + f2) - f3, (this.connect + scrollY) - this.write);
    }

    private void TuitionPaymentFragmentbindingInflater1(Canvas canvas, int i) {
        Paint paintTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i);
        paintTuitionPaymentFragmentbindingInflater1.setColor(getCurrentHintTextColor());
        if (this.isConnected) {
            int length = (this.IconCompatParcelizer - i) - getHint().length();
            if (length <= 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, paintTuitionPaymentFragmentbindingInflater1, getHint(), Math.abs(length));
                return;
            }
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, paintTuitionPaymentFragmentbindingInflater1, getHint(), i);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Paint paint, CharSequence charSequence, int i) {
        int i2 = i + 1;
        paint.getTextBounds(charSequence.toString(), i, i2, this.sendCustomAction);
        float f = this.INotificationSideChannelStub.x;
        float f2 = this.INotificationSideChannelStub.y;
        canvas.drawText(charSequence, i, i2, (f - (Math.abs(this.sendCustomAction.width()) / 2.0f)) - this.sendCustomAction.left, (f2 + (Math.abs(this.sendCustomAction.height()) / 2.0f)) - this.sendCustomAction.bottom, paint);
    }

    private Paint TuitionPaymentFragmentbindingInflater1(int i) {
        if (getText() != null && this.INotificationSideChannel && i == getText().length() - 1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(getPaint().getColor());
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return getPaint();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        ColorStateList colorStateList = this.RemoteActionCompatParcelizer;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : getCurrentTextColor();
        if (colorForState != this.asBinder) {
            this.asBinder = colorForState;
            invalidate();
        }
    }

    private void b() {
        this.INotificationSideChannelStub.set(this.getInterfaceDescriptor.left + (Math.abs(this.getInterfaceDescriptor.width()) / 2.0f), this.getInterfaceDescriptor.top + (Math.abs(this.getInterfaceDescriptor.height()) / 2.0f));
    }

    public void setLineColor(int i) {
        this.RemoteActionCompatParcelizer = ColorStateList.valueOf(i);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public void setLineColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.RemoteActionCompatParcelizer = colorStateList;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public void setLineWidth(int i) {
        this.write = i;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        requestLayout();
    }

    public void setItemCount(int i) {
        this.IconCompatParcelizer = i;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        requestLayout();
    }

    public void setItemRadius(int i) {
        this.getRoot = i;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        requestLayout();
    }

    public void setItemSpacing(int i) {
        this.getExtras = i;
        requestLayout();
    }

    public void setItemHeight(int i) {
        this.connect = i;
        asInterface();
        requestLayout();
    }

    public void setItemWidth(int i) {
        this.getNotifyChildrenChangedOptions = i;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        requestLayout();
    }

    public void setAnimationEnable(boolean z) {
        this.INotificationSideChannel = z;
    }

    public void setHideLineWhenFilled(boolean z) {
        this.notify = z;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        asInterface();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        asInterface();
    }

    public void setOtpCompletionListener(notifyStateAttached notifystateattached) {
        this.MediaBrowserCompat = notifystateattached;
    }

    public void setItemBackgroundResources(int i) {
        if (i == 0 || this.INotificationSideChannelDefault == i) {
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), i, getContext().getTheme());
            this.onTransact = drawable;
            setItemBackground(drawable);
            this.INotificationSideChannelDefault = i;
        }
    }

    public void setItemBackgroundColor(int i) {
        Drawable drawable = this.onTransact;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable.mutate()).setColor(i);
            this.INotificationSideChannelDefault = 0;
        } else {
            setItemBackground(new ColorDrawable(i));
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.INotificationSideChannelDefault = 0;
        this.onTransact = drawable;
        invalidate();
    }

    public void setCursorWidth(int i) {
        this.asInterface = i;
        if (!isCursorVisible() || this.cancel) {
            return;
        }
        this.cancel = true;
        invalidate();
    }

    public void setCursorColor(int i) {
        this.d = i;
        if (!isCursorVisible() || this.cancel) {
            return;
        }
        this.cancel = true;
        invalidate();
    }

    public void setMaskingChar(String str) {
        this.read = str;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z) {
        if (this.cancelAll != z) {
            this.cancelAll = z;
            if (this.cancel != z) {
                this.cancel = z;
                invalidate();
            }
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    @Override // android.widget.TextView
    public boolean isCursorVisible() {
        return this.cancelAll;
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (i != 1) {
            if (i == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            if (!tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                OtpView.this.removeCallbacks(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            }
            if (this.cancel) {
                this.cancel = false;
                invalidate();
            }
        }
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(OtpView otpView, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            OtpView.this.removeCallbacks(this);
            if (OtpView.TuitionPaymentFragmentbindingInflater1(OtpView.this)) {
                OtpView otpView = OtpView.this;
                OtpView.TuitionPaymentFragmentspecialinlinedviewModeldefault2(otpView, !otpView.cancel);
                OtpView.this.postDelayed(this, 500L);
            }
        }
    }

    static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(OtpView otpView) {
        return otpView.isCursorVisible() && otpView.isFocused();
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(OtpView otpView, boolean z) {
        if (otpView.cancel != z) {
            otpView.cancel = z;
            otpView.invalidate();
        }
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        if (isCursorVisible() && isFocused()) {
            byte b2 = 0;
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                this.TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, b2);
            }
            removeCallbacks(this.TuitionPaymentFragmentbindingInflater1);
            this.cancel = false;
            postDelayed(this.TuitionPaymentFragmentbindingInflater1, 500L);
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            removeCallbacks(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    private void asInterface() {
        float f = ((int) ((getResources().getDisplayMetrics().density * 2.0f) + 0.5f)) * 2;
        this.g = ((float) this.connect) - getTextSize() > f ? getTextSize() + f : getTextSize();
    }

    @Override // android.widget.EditText, android.widget.TextView
    protected MovementMethod getDefaultMovementMethod() {
        if (createCameraCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            createCameraCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new createCameraCaptureCallback();
        }
        return createCameraCaptureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
