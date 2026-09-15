package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bpjstku.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class createDirectByteBuffer {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "DecoderThread";
    public HandlerThread INotificationSideChannel;
    public isCropAspectRatioHasEffect TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f883a;
    Handler asInterface;
    public Rect b;
    public createBitmapFromRgbaImage g;
    public boolean d = false;
    final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object();
    public final Handler.Callback TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Handler.Callback() { // from class: createDirectByteBuffer.2
        /* JADX WARN: Code duplicated, block: B:32:0x0084  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            byte[] bArr;
            byte[] bArr2;
            DeferrableSurfacesExternalSyntheticLambda1 deferrableSurfacesExternalSyntheticLambda1;
            if (message.what == R.id.zxing_decode) {
                createDirectByteBuffer createdirectbytebuffer = createDirectByteBuffer.this;
                isJpegFormats isjpegformats = (isJpegFormats) message.obj;
                System.currentTimeMillis();
                isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createdirectbytebuffer.b;
                if (createdirectbytebuffer.b == null) {
                    deferrableSurfacesExternalSyntheticLambda1 = null;
                } else {
                    int i = isjpegformats.asInterface;
                    byte[] bArr3 = isjpegformats.TuitionPaymentFragmentbindingInflater1;
                    int i2 = isjpegformats.b;
                    int i3 = isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i4 = 0;
                    if (i == 90) {
                        bArr = new byte[i2 * i3];
                        int i5 = 0;
                        while (i4 < i2) {
                            for (int i6 = i3 - 1; i6 >= 0; i6--) {
                                bArr[i5] = bArr3[(i6 * i2) + i4];
                                i5++;
                            }
                            i4++;
                        }
                    } else {
                        if (i == 180) {
                            int i7 = i2 * i3;
                            bArr = new byte[i7];
                            int i8 = i7 - 1;
                            while (i4 < i7) {
                                bArr[i8] = bArr3[i4];
                                i8--;
                                i4++;
                            }
                        } else if (i != 270) {
                            bArr2 = bArr3;
                        } else {
                            int i9 = i2 * i3;
                            byte[] bArr4 = new byte[i9];
                            int i10 = i9 - 1;
                            while (i4 < i2) {
                                for (int i11 = i3 - 1; i11 >= 0; i11--) {
                                    bArr4[i10] = bArr3[(i11 * i2) + i4];
                                    i10--;
                                }
                                i4++;
                            }
                            bArr2 = bArr4;
                        }
                        if (isjpegformats.asInterface % 180 != 0) {
                            deferrableSurfacesExternalSyntheticLambda1 = new DeferrableSurfacesExternalSyntheticLambda1(bArr2, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault2, isjpegformats.b, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.left, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.top, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width(), isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height());
                        } else {
                            deferrableSurfacesExternalSyntheticLambda1 = new DeferrableSurfacesExternalSyntheticLambda1(bArr2, isjpegformats.b, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault2, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.left, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.top, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width(), isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height());
                        }
                    }
                    bArr2 = bArr;
                    if (isjpegformats.asInterface % 180 != 0) {
                        deferrableSurfacesExternalSyntheticLambda1 = new DeferrableSurfacesExternalSyntheticLambda1(bArr2, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault2, isjpegformats.b, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.left, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.top, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width(), isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height());
                    } else {
                        deferrableSurfacesExternalSyntheticLambda1 = new DeferrableSurfacesExternalSyntheticLambda1(bArr2, isjpegformats.b, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault2, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.left, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.top, isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.width(), isjpegformats.TuitionPaymentFragmentspecialinlinedviewModeldefault1.height());
                    }
                }
                DynamicRanges dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = deferrableSurfacesExternalSyntheticLambda1 != null ? createdirectbytebuffer.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfacesExternalSyntheticLambda1) : null;
                if (dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    System.currentTimeMillis();
                    if (createdirectbytebuffer.asInterface != null) {
                        Message messageObtain = Message.obtain(createdirectbytebuffer.asInterface, R.id.zxing_decode_succeeded, new computeCropRectFromDispatchInfo(dynamicRangesTuitionPaymentFragmentspecialinlinedviewModeldefault2, isjpegformats));
                        messageObtain.setData(new Bundle());
                        messageObtain.sendToTarget();
                    }
                } else {
                    Handler handler = createdirectbytebuffer.asInterface;
                    if (handler != null) {
                        Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                    }
                }
                if (createdirectbytebuffer.asInterface != null) {
                    Message.obtain(createdirectbytebuffer.asInterface, R.id.zxing_possible_result_points, new ArrayList(createdirectbytebuffer.g.TuitionPaymentFragmentbindingInflater1)).sendToTarget();
                }
                if (createdirectbytebuffer.TuitionPaymentFragmentbindingInflater1.d) {
                    createdirectbytebuffer.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(createdirectbytebuffer.asBinder);
                }
            } else if (message.what == R.id.zxing_preview_failed) {
                createDirectByteBuffer createdirectbytebuffer2 = createDirectByteBuffer.this;
                if (createdirectbytebuffer2.TuitionPaymentFragmentbindingInflater1.d) {
                    createdirectbytebuffer2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(createdirectbytebuffer2.asBinder);
                }
            }
            return true;
        }
    };
    public final RingBuffer asBinder = new RingBuffer() { // from class: createDirectByteBuffer.1
        @Override // defpackage.RingBuffer
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isJpegFormats isjpegformats) {
            synchronized (createDirectByteBuffer.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                if (createDirectByteBuffer.this.d) {
                    createDirectByteBuffer.this.f883a.obtainMessage(R.id.zxing_decode, isjpegformats).sendToTarget();
                }
            }
        }

        @Override // defpackage.RingBuffer
        public final void TuitionPaymentFragmentbindingInflater1() {
            synchronized (createDirectByteBuffer.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                if (createDirectByteBuffer.this.d) {
                    createDirectByteBuffer.this.f883a.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            }
        }
    };

    public createDirectByteBuffer(isCropAspectRatioHasEffect iscropaspectratiohaseffect, createBitmapFromRgbaImage createbitmapfromrgbaimage, Handler handler) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.TuitionPaymentFragmentbindingInflater1 = iscropaspectratiohaseffect;
            this.g = createbitmapfromrgbaimage;
            this.asInterface = handler;
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.d = false;
                this.f883a.removeCallbacksAndMessages(null);
                this.INotificationSideChannel.quit();
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
