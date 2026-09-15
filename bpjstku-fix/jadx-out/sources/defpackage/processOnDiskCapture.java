package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes3.dex */
public final class processOnDiskCapture implements View.OnTouchListener, View.OnLayoutChangeListener {
    public lambdatransform0androidxcameracoreimagecaptureProcessingNode INotificationSideChannelDefault;
    public lambdatransform2androidxcameracoreimagecaptureProcessingNode INotificationSideChannelStub;
    public sendError INotificationSideChannelStubProxy;
    public lambdatransform1androidxcameracoreimagecaptureProcessingNode IconCompatParcelizer;
    public injectProcessingInput2Packet RemoteActionCompatParcelizer;
    public float TuitionPaymentFragmentbindingInflater1;
    TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public GestureDetector asInterface;
    public processPostviewInputPacket disconnect;
    public ImageView g;
    public View.OnClickListener getInterfaceDescriptor;
    public View.OnLongClickListener notify;
    public lambdaprocessPostviewInputPacket6 onTransact;
    cropAndMaybeApplyEffect read;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Interpolator f1326a = new AccelerateDecelerateInterpolator();
    public int getExtras = 200;
    public float cancelAll = 1.0f;
    public float cancel = 1.75f;
    public float INotificationSideChannel = 3.0f;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    boolean b = false;
    public final Matrix TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Matrix();
    public final Matrix asBinder = new Matrix();
    public final Matrix write = new Matrix();
    private final RectF getNotifyChildrenChangedOptions = new RectF();
    private final float[] search = new float[9];
    int d = 2;
    int connect = 2;
    public boolean getRoot = true;
    public ImageView.ScaleType MediaBrowserCompat = ImageView.ScaleType.FIT_CENTER;
    lambdaprocessInputPacket4 getItem = new lambdaprocessInputPacket4() { // from class: processOnDiskCapture.1
        @Override // defpackage.lambdaprocessInputPacket4
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f, float f2) {
            if (processOnDiskCapture.this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isInProgress()) {
                return;
            }
            if (processOnDiskCapture.this.RemoteActionCompatParcelizer != null) {
                injectProcessingInput2Packet injectprocessinginput2packet = processOnDiskCapture.this.RemoteActionCompatParcelizer;
            }
            processOnDiskCapture.this.write.postTranslate(f, f2);
            processOnDiskCapture.b(processOnDiskCapture.this);
            ViewParent parent = processOnDiskCapture.this.g.getParent();
            if (!processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || processOnDiskCapture.this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isInProgress() || processOnDiskCapture.this.b) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((processOnDiskCapture.this.d == 2 || ((processOnDiskCapture.this.d == 0 && f >= 1.0f) || ((processOnDiskCapture.this.d == 1 && f <= -1.0f) || ((processOnDiskCapture.this.connect == 0 && f2 >= 1.0f) || (processOnDiskCapture.this.connect == 1 && f2 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // defpackage.lambdaprocessInputPacket4
        public final void b(float f, float f2) {
            int i;
            int iRound;
            int i2;
            int iRound2;
            processOnDiskCapture processondiskcapture = processOnDiskCapture.this;
            processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = processondiskcapture.new TuitionPaymentFragmentspecialinlinedviewModeldefault3(processondiskcapture.g.getContext());
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ImageView imageView = processOnDiskCapture.this.g;
            int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
            ImageView imageView2 = processOnDiskCapture.this.g;
            int height = (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom();
            int i3 = (int) f;
            int i4 = (int) f2;
            RectF rectFTuitionPaymentFragmentbindingInflater1 = processOnDiskCapture.this.TuitionPaymentFragmentbindingInflater1();
            if (rectFTuitionPaymentFragmentbindingInflater1 != null) {
                int iRound3 = Math.round(-rectFTuitionPaymentFragmentbindingInflater1.left);
                float f3 = width;
                if (f3 < rectFTuitionPaymentFragmentbindingInflater1.width()) {
                    iRound = Math.round(rectFTuitionPaymentFragmentbindingInflater1.width() - f3);
                    i = 0;
                } else {
                    i = iRound3;
                    iRound = i;
                }
                int iRound4 = Math.round(-rectFTuitionPaymentFragmentbindingInflater1.top);
                float f4 = height;
                if (f4 < rectFTuitionPaymentFragmentbindingInflater1.height()) {
                    iRound2 = Math.round(rectFTuitionPaymentFragmentbindingInflater1.height() - f4);
                    i2 = 0;
                } else {
                    i2 = iRound4;
                    iRound2 = i2;
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iRound3;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = iRound4;
                if (iRound3 != iRound || iRound4 != iRound2) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.fling(iRound3, iRound4, i3, i4, i, iRound, i2, iRound2, 0, 0);
                }
            }
            processOnDiskCapture.this.g.post(processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // defpackage.lambdaprocessInputPacket4
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3) {
            if (processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3() < processOnDiskCapture.this.INotificationSideChannel || f < 1.0f) {
                if (processOnDiskCapture.this.INotificationSideChannelStubProxy != null) {
                    sendError senderror = processOnDiskCapture.this.INotificationSideChannelStubProxy;
                }
                processOnDiskCapture.this.write.postScale(f, f, f2, f3);
                processOnDiskCapture.b(processOnDiskCapture.this);
            }
        }
    };

    public processOnDiskCapture(ImageView imageView) {
        this.g = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1 = 0.0f;
        this.read = new cropAndMaybeApplyEffect(imageView.getContext(), this.getItem);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: processOnDiskCapture.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (processOnDiskCapture.this.notify != null) {
                    processOnDiskCapture.this.notify.onLongClick(processOnDiskCapture.this.g);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (processOnDiskCapture.this.IconCompatParcelizer == null || processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return processOnDiskCapture.this.IconCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        });
        this.asInterface = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: processOnDiskCapture.5
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (processOnDiskCapture.this.getInterfaceDescriptor != null) {
                    processOnDiskCapture.this.getInterfaceDescriptor.onClick(processOnDiskCapture.this.g);
                }
                RectF rectFTuitionPaymentFragmentbindingInflater1 = processOnDiskCapture.this.TuitionPaymentFragmentbindingInflater1();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (processOnDiskCapture.this.disconnect != null) {
                    processPostviewInputPacket processpostviewinputpacket = processOnDiskCapture.this.disconnect;
                    ImageView imageView2 = processOnDiskCapture.this.g;
                }
                if (rectFTuitionPaymentFragmentbindingInflater1 == null) {
                    return false;
                }
                if (rectFTuitionPaymentFragmentbindingInflater1.contains(x, y)) {
                    float f = rectFTuitionPaymentFragmentbindingInflater1.left;
                    rectFTuitionPaymentFragmentbindingInflater1.width();
                    float f2 = rectFTuitionPaymentFragmentbindingInflater1.top;
                    rectFTuitionPaymentFragmentbindingInflater1.height();
                    if (processOnDiskCapture.this.INotificationSideChannelDefault == null) {
                        return true;
                    }
                    lambdatransform0androidxcameracoreimagecaptureProcessingNode lambdatransform0androidxcameracoreimagecaptureprocessingnode = processOnDiskCapture.this.INotificationSideChannelDefault;
                    ImageView imageView3 = processOnDiskCapture.this.g;
                    return true;
                }
                if (processOnDiskCapture.this.INotificationSideChannelStub == null) {
                    return false;
                }
                lambdatransform2androidxcameracoreimagecaptureProcessingNode lambdatransform2androidxcameracoreimagecaptureprocessingnode = processOnDiskCapture.this.INotificationSideChannelStub;
                ImageView imageView4 = processOnDiskCapture.this.g;
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                try {
                    float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (fTuitionPaymentFragmentspecialinlinedviewModeldefault3 < processOnDiskCapture.this.cancel) {
                        processOnDiskCapture processondiskcapture = processOnDiskCapture.this;
                        processondiskcapture.b(processondiskcapture.cancel, x, y, true);
                    } else if (fTuitionPaymentFragmentspecialinlinedviewModeldefault3 >= processOnDiskCapture.this.cancel && fTuitionPaymentFragmentspecialinlinedviewModeldefault3 < processOnDiskCapture.this.INotificationSideChannel) {
                        processOnDiskCapture processondiskcapture2 = processOnDiskCapture.this;
                        processondiskcapture2.b(processondiskcapture2.INotificationSideChannel, x, y, true);
                    } else {
                        processOnDiskCapture processondiskcapture3 = processOnDiskCapture.this;
                        processondiskcapture3.b(processondiskcapture3.cancelAll, x, y, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }
        });
    }

    public final RectF TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.asBinder.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.asBinder.postConcat(this.write);
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder);
    }

    public final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.write.getValues(this.search);
        float fPow = (float) Math.pow(this.search[0], 2.0d);
        this.write.getValues(this.search);
        return (float) Math.sqrt(fPow + ((float) Math.pow(this.search[3], 2.0d)));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        TuitionPaymentFragmentbindingInflater1(this.g.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        cropAndMaybeApplyEffect cropandmaybeapplyeffect;
        GestureDetector gestureDetector;
        boolean zIsInProgress;
        boolean z2;
        boolean z3;
        boolean z4;
        RectF rectFTuitionPaymentFragmentbindingInflater1;
        boolean z5 = false;
        if (!this.getRoot || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.forceFinished(true);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            }
        } else {
            if (action == 1 || action == 3) {
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3() < this.cancelAll) {
                    RectF rectFTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1();
                    if (rectFTuitionPaymentFragmentbindingInflater2 != null) {
                        view.post(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), this.cancelAll, rectFTuitionPaymentFragmentbindingInflater2.centerX(), rectFTuitionPaymentFragmentbindingInflater2.centerY()));
                        z = true;
                    }
                } else if (TuitionPaymentFragmentspecialinlinedviewModeldefault3() > this.INotificationSideChannel && (rectFTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1()) != null) {
                    view.post(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), this.INotificationSideChannel, rectFTuitionPaymentFragmentbindingInflater1.centerX(), rectFTuitionPaymentFragmentbindingInflater1.centerY()));
                    z = true;
                }
            }
            cropandmaybeapplyeffect = this.read;
            if (cropandmaybeapplyeffect != null) {
                zIsInProgress = cropandmaybeapplyeffect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isInProgress();
                z2 = this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionEvent);
                if (!zIsInProgress || this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isInProgress()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z2 || this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3 && z4) {
                    z5 = true;
                }
                this.b = z5;
                z = true;
            }
            gestureDetector = this.asInterface;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z;
        }
        z = false;
        cropandmaybeapplyeffect = this.read;
        if (cropandmaybeapplyeffect != null) {
            zIsInProgress = cropandmaybeapplyeffect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isInProgress();
            z2 = this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionEvent);
            if (zIsInProgress) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (z2) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z3) {
                z5 = true;
            }
            this.b = z5;
            z = true;
        }
        gestureDetector = this.asInterface;
        if (gestureDetector == null) {
        }
        return z;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, boolean z) {
        b(f, this.g.getRight() / 2, this.g.getBottom() / 2, z);
    }

    public final void b(float f, float f2, float f3, boolean z) {
        if (f < this.cancelAll || f > this.INotificationSideChannel) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.g.post(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(), f, f2, f3));
        } else {
            this.write.setScale(f, f, f2, f3);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    private void b() {
        this.write.reset();
        this.write.postRotate(0.0f);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.asBinder.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.asBinder.postConcat(this.write);
        Matrix matrix = this.asBinder;
        this.g.setImageMatrix(matrix);
        if (this.onTransact != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            this.asBinder.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            this.asBinder.postConcat(this.write);
            Matrix matrix = this.asBinder;
            this.g.setImageMatrix(matrix);
            if (this.onTransact != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix);
            }
        }
    }

    public final RectF TuitionPaymentFragmentspecialinlinedviewModeldefault3(Matrix matrix) {
        Drawable drawable = this.g.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.getNotifyChildrenChangedOptions.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.getNotifyChildrenChangedOptions);
        return this.getNotifyChildrenChangedOptions;
    }

    public final void TuitionPaymentFragmentbindingInflater1(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ImageView imageView = this.g;
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        ImageView imageView2 = this.g;
        float height = (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        if (this.MediaBrowserCompat == ImageView.ScaleType.CENTER) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (this.MediaBrowserCompat == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postScale(fMax, fMax);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postTranslate((width - (f * fMax)) / 2.0f, (height - (f3 * fMax)) / 2.0f);
        } else if (this.MediaBrowserCompat == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postScale(fMin, fMin);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.postTranslate((width - (f * fMin)) / 2.0f, (height - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            int i = 0 % 180;
            int i2 = AnonymousClass2.TuitionPaymentFragmentbindingInflater1[this.MediaBrowserCompat.ordinal()];
            if (i2 == 1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i2 == 2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i2 == 4) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        b();
    }

    /* JADX INFO: renamed from: processOnDiskCapture$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Runnable {
        private final float TuitionPaymentFragmentbindingInflater1;
        private final float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final float TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = System.currentTimeMillis();
        private final float b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(float f, float f2, float f3, float f4) {
            this.TuitionPaymentFragmentbindingInflater1 = f3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f4;
            this.b = f;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float interpolation = processOnDiskCapture.this.f1326a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 1.0f) / processOnDiskCapture.this.getExtras));
            float f = this.b;
            processOnDiskCapture.this.getItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3((f + ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - f) * interpolation)) / processOnDiskCapture.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (interpolation < 1.0f) {
                processOnDiskCapture.this.g.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        final OverScroller TuitionPaymentFragmentbindingInflater1;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
            this.TuitionPaymentFragmentbindingInflater1 = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.TuitionPaymentFragmentbindingInflater1.isFinished() || !this.TuitionPaymentFragmentbindingInflater1.computeScrollOffset()) {
                return;
            }
            int currX = this.TuitionPaymentFragmentbindingInflater1.getCurrX();
            int currY = this.TuitionPaymentFragmentbindingInflater1.getCurrY();
            processOnDiskCapture.this.write.postTranslate(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - currX, this.b - currY);
            processOnDiskCapture.b(processOnDiskCapture.this);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = currX;
            this.b = currY;
            processOnDiskCapture.this.g.postOnAnimation(this);
        }
    }

    static /* synthetic */ void b(processOnDiskCapture processondiskcapture) {
        if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            processondiskcapture.asBinder.postConcat(processondiskcapture.write);
            Matrix matrix = processondiskcapture.asBinder;
            processondiskcapture.g.setImageMatrix(matrix);
            if (processondiskcapture.onTransact == null || processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) == null) {
                return;
            }
            lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        this.asBinder.set(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.asBinder.postConcat(this.write);
        RectF rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder);
        if (rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return false;
        }
        float fHeight = rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.height();
        float fWidth = rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.width();
        ImageView imageView = this.g;
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        float f6 = 0.0f;
        if (fHeight <= height) {
            int i = AnonymousClass2.TuitionPaymentFragmentbindingInflater1[this.MediaBrowserCompat.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    f4 = height - fHeight;
                    f5 = rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.top;
                } else {
                    f4 = (height - fHeight) / 2.0f;
                    f5 = rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.top;
                }
                f = f4 - f5;
            } else {
                f = -rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.top;
            }
            this.connect = 2;
        } else if (rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.top > 0.0f) {
            this.connect = 0;
            f = -rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.top;
        } else if (rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.bottom < height) {
            this.connect = 1;
            f = height - rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.bottom;
        } else {
            this.connect = -1;
            f = 0.0f;
        }
        ImageView imageView2 = this.g;
        float width = (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight();
        if (fWidth <= width) {
            int i2 = AnonymousClass2.TuitionPaymentFragmentbindingInflater1[this.MediaBrowserCompat.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f2 = width - fWidth;
                    f3 = rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.left;
                } else {
                    f2 = (width - fWidth) / 2.0f;
                    f3 = rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.left;
            }
            this.d = 2;
        } else if (rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.left > 0.0f) {
            this.d = 0;
            f6 = -rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.left;
        } else if (rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.right < width) {
            f6 = width - rectFTuitionPaymentFragmentspecialinlinedviewModeldefault3.right;
            this.d = 1;
        } else {
            this.d = -1;
        }
        this.write.postTranslate(f6, f);
        return true;
    }
}
