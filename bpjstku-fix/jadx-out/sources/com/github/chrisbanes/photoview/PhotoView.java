package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.injectProcessingInput2Packet;
import defpackage.lambdaprocessPostviewInputPacket6;
import defpackage.lambdatransform0androidxcameracoreimagecaptureProcessingNode;
import defpackage.lambdatransform1androidxcameracoreimagecaptureProcessingNode;
import defpackage.lambdatransform2androidxcameracoreimagecaptureProcessingNode;
import defpackage.processInputPacket;
import defpackage.processOnDiskCapture;
import defpackage.processPostviewInputPacket;
import defpackage.sendError;

/* JADX INFO: loaded from: classes3.dex */
public class PhotoView extends AppCompatImageView {
    private processOnDiskCapture TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ImageView.ScaleType b;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new processOnDiskCapture(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.b = null;
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.MediaBrowserCompat;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = onLongClickListener;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getInterfaceDescriptor = onClickListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (processondiskcapture == null) {
            this.b = scaleType;
            return;
        }
        if (scaleType == null) {
            return;
        }
        if (processInputPacket.AnonymousClass5.TuitionPaymentFragmentbindingInflater1[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != processondiskcapture.MediaBrowserCompat) {
            processondiskcapture.MediaBrowserCompat = scaleType;
            if (processondiskcapture.getRoot) {
                processondiskcapture.TuitionPaymentFragmentbindingInflater1(processondiskcapture.g.getDrawable());
                return;
            }
            processondiskcapture.write.reset();
            float f = processondiskcapture.TuitionPaymentFragmentbindingInflater1;
            processondiskcapture.write.postRotate(0.0f);
            if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                processondiskcapture.asBinder.postConcat(processondiskcapture.write);
                Matrix matrix = processondiskcapture.asBinder;
                processondiskcapture.g.setImageMatrix(matrix);
                if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) != null) {
                    lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
                }
            }
            processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            processondiskcapture.asBinder.postConcat(processondiskcapture.write);
            Matrix matrix2 = processondiskcapture.asBinder;
            processondiskcapture.g.setImageMatrix(matrix2);
            if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix2) != null) {
                lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket7 = processondiskcapture.onTransact;
            }
            processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (processondiskcapture != null) {
            if (processondiskcapture.getRoot) {
                processondiskcapture.TuitionPaymentFragmentbindingInflater1(processondiskcapture.g.getDrawable());
                return;
            }
            processondiskcapture.write.reset();
            float f = processondiskcapture.TuitionPaymentFragmentbindingInflater1;
            processondiskcapture.write.postRotate(0.0f);
            if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                processondiskcapture.asBinder.postConcat(processondiskcapture.write);
                Matrix matrix = processondiskcapture.asBinder;
                processondiskcapture.g.setImageMatrix(matrix);
                if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) != null) {
                    lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
                }
            }
            processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            processondiskcapture.asBinder.postConcat(processondiskcapture.write);
            Matrix matrix2 = processondiskcapture.asBinder;
            processondiskcapture.g.setImageMatrix(matrix2);
            if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix2) != null) {
                lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket7 = processondiskcapture.onTransact;
            }
            processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (processondiskcapture != null) {
            if (processondiskcapture.getRoot) {
                processondiskcapture.TuitionPaymentFragmentbindingInflater1(processondiskcapture.g.getDrawable());
                return;
            }
            processondiskcapture.write.reset();
            float f = processondiskcapture.TuitionPaymentFragmentbindingInflater1;
            processondiskcapture.write.postRotate(0.0f);
            if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                processondiskcapture.asBinder.postConcat(processondiskcapture.write);
                Matrix matrix = processondiskcapture.asBinder;
                processondiskcapture.g.setImageMatrix(matrix);
                if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) != null) {
                    lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
                }
            }
            processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            processondiskcapture.asBinder.postConcat(processondiskcapture.write);
            Matrix matrix2 = processondiskcapture.asBinder;
            processondiskcapture.g.setImageMatrix(matrix2);
            if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix2) != null) {
                lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket7 = processondiskcapture.onTransact;
            }
            processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (processondiskcapture != null) {
            if (processondiskcapture.getRoot) {
                processondiskcapture.TuitionPaymentFragmentbindingInflater1(processondiskcapture.g.getDrawable());
                return;
            }
            processondiskcapture.write.reset();
            float f = processondiskcapture.TuitionPaymentFragmentbindingInflater1;
            processondiskcapture.write.postRotate(0.0f);
            if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                processondiskcapture.asBinder.postConcat(processondiskcapture.write);
                Matrix matrix = processondiskcapture.asBinder;
                processondiskcapture.g.setImageMatrix(matrix);
                if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) != null) {
                    lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
                }
            }
            processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            processondiskcapture.asBinder.postConcat(processondiskcapture.write);
            Matrix matrix2 = processondiskcapture.asBinder;
            processondiskcapture.g.setImageMatrix(matrix2);
            if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix2) != null) {
                lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket7 = processondiskcapture.onTransact;
            }
            processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (processondiskcapture.getRoot) {
                processondiskcapture.TuitionPaymentFragmentbindingInflater1(processondiskcapture.g.getDrawable());
            } else {
                processondiskcapture.write.reset();
                float f = processondiskcapture.TuitionPaymentFragmentbindingInflater1;
                processondiskcapture.write.postRotate(0.0f);
                if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    processondiskcapture.asBinder.postConcat(processondiskcapture.write);
                    Matrix matrix = processondiskcapture.asBinder;
                    processondiskcapture.g.setImageMatrix(matrix);
                    if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) != null) {
                        lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
                    }
                }
                processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                processondiskcapture.asBinder.postConcat(processondiskcapture.write);
                Matrix matrix2 = processondiskcapture.asBinder;
                processondiskcapture.g.setImageMatrix(matrix2);
                if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix2) != null) {
                    lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket7 = processondiskcapture.onTransact;
                }
                processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
        return frame;
    }

    public void setRotationTo(float f) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processondiskcapture.write.setRotate(f % 360.0f);
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

    public void setRotationBy(float f) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processondiskcapture.write.postRotate(f % 360.0f);
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

    public void setZoomable(boolean z) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processondiskcapture.getRoot = z;
        if (processondiskcapture.getRoot) {
            processondiskcapture.TuitionPaymentFragmentbindingInflater1(processondiskcapture.g.getDrawable());
            return;
        }
        processondiskcapture.write.reset();
        float f = processondiskcapture.TuitionPaymentFragmentbindingInflater1;
        processondiskcapture.write.postRotate(0.0f);
        if (processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            processondiskcapture.asBinder.postConcat(processondiskcapture.write);
            Matrix matrix = processondiskcapture.asBinder;
            processondiskcapture.g.setImageMatrix(matrix);
            if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix) != null) {
                lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6 = processondiskcapture.onTransact;
            }
        }
        processondiskcapture.asBinder.set(processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        processondiskcapture.asBinder.postConcat(processondiskcapture.write);
        Matrix matrix2 = processondiskcapture.asBinder;
        processondiskcapture.g.setImageMatrix(matrix2);
        if (processondiskcapture.onTransact != null && processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(matrix2) != null) {
            lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket7 = processondiskcapture.onTransact;
        }
        processondiskcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    public void setMinimumScale(float f) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processInputPacket.b(f, processondiskcapture.cancel, processondiskcapture.INotificationSideChannel);
        processondiskcapture.cancelAll = f;
    }

    public void setMediumScale(float f) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processInputPacket.b(processondiskcapture.cancelAll, f, processondiskcapture.INotificationSideChannel);
        processondiskcapture.cancel = f;
    }

    public void setMaximumScale(float f) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processInputPacket.b(processondiskcapture.cancelAll, processondiskcapture.cancel, f);
        processondiskcapture.INotificationSideChannel = f;
    }

    public void setScaleLevels(float f, float f2, float f3) {
        processOnDiskCapture processondiskcapture = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processInputPacket.b(f, f2, f3);
        processondiskcapture.cancelAll = f;
        processondiskcapture.cancel = f2;
        processondiskcapture.INotificationSideChannel = f3;
    }

    public void setOnMatrixChangeListener(lambdaprocessPostviewInputPacket6 lambdaprocesspostviewinputpacket6) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact = lambdaprocesspostviewinputpacket6;
    }

    public void setOnPhotoTapListener(lambdatransform0androidxcameracoreimagecaptureProcessingNode lambdatransform0androidxcameracoreimagecaptureprocessingnode) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault = lambdatransform0androidxcameracoreimagecaptureprocessingnode;
    }

    public void setOnOutsidePhotoTapListener(lambdatransform2androidxcameracoreimagecaptureProcessingNode lambdatransform2androidxcameracoreimagecaptureprocessingnode) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStub = lambdatransform2androidxcameracoreimagecaptureprocessingnode;
    }

    public void setOnViewTapListener(processPostviewInputPacket processpostviewinputpacket) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.disconnect = processpostviewinputpacket;
    }

    public void setOnViewDragListener(injectProcessingInput2Packet injectprocessinginput2packet) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.RemoteActionCompatParcelizer = injectprocessinginput2packet;
    }

    public void setScale(float f) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f, false);
    }

    public void setScale(float f, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f, z);
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(f, f2, f3, z);
    }

    public void setZoomTransitionDuration(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getExtras = i;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnScaleChangeListener(sendError senderror) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy = senderror;
    }

    public void setOnSingleFlingListener(lambdatransform1androidxcameracoreimagecaptureProcessingNode lambdatransform1androidxcameracoreimagecaptureprocessingnode) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer = lambdatransform1androidxcameracoreimagecaptureprocessingnode;
    }
}
