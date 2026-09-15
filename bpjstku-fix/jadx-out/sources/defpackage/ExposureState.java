package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class ExposureState implements Camera<ByteBuffer, isAutoCancelEnabled> {
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getMeteringPointsAwb asBinder;
    private final Context b;
    private final List<ImageHeaderParser> g;
    private static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentbindingInflater1();
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    @Override // defpackage.Camera
    public final /* bridge */ /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, getTargetRotation gettargetrotation) throws IOException {
        ImageHeaderParser.ImageType imageTypeTuitionPaymentFragmentbindingInflater1;
        ByteBuffer byteBuffer2 = byteBuffer;
        isMirroring<Boolean> ismirroring = addPoint.TuitionPaymentFragmentbindingInflater1;
        if (((Boolean) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.g;
        if (byteBuffer2 == null) {
            imageTypeTuitionPaymentFragmentbindingInflater1 = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            imageTypeTuitionPaymentFragmentbindingInflater1 = hasCameraTransform.TuitionPaymentFragmentbindingInflater1(list, new hasCameraTransform.AnonymousClass4(byteBuffer2));
        }
        return imageTypeTuitionPaymentFragmentbindingInflater1 == ImageHeaderParser.ImageType.GIF;
    }

    public ExposureState(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, CameraUnavailableException cameraUnavailableException) {
        this(context, list, bitmapPool, cameraUnavailableException, TuitionPaymentFragmentspecialinlinedviewModeldefault2, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private ExposureState(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, CameraUnavailableException cameraUnavailableException, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.b = context.getApplicationContext();
        this.g = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        this.asBinder = new getMeteringPointsAwb(bitmapPool, cameraUnavailableException);
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.Camera
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public getAutoCancelDurationInMillis TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, int i, int i2, getTargetRotation gettargetrotation) {
        getEventCode geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteBuffer);
        try {
            getAutoCancelDurationInMillis getautocanceldurationinmillisTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(byteBuffer, i, i2, geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2, gettargetrotation);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = null;
                geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.offer(geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return getautocanceldurationinmillisTuitionPaymentFragmentbindingInflater1;
        } catch (Throwable th) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.TuitionPaymentFragmentbindingInflater1;
            synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault4) {
                geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = null;
                geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.offer(geteventcodeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw th;
            }
        }
    }

    private getAutoCancelDurationInMillis TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, int i, int i2, getEventCode geteventcode, getTargetRotation gettargetrotation) {
        boolean z;
        AutoValue_SurfaceRequest_Result autoValue_SurfaceRequest_Result;
        StringBuilder sb;
        long jTuitionPaymentFragmentbindingInflater1 = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
        try {
            if (geteventcode.TuitionPaymentFragmentbindingInflater1 == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            int iHighestOneBit = 0;
            if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify != 0) {
                autoValue_SurfaceRequest_Result = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i3 = 0; i3 < 6; i3++) {
                    sb2.append((char) geteventcode.TuitionPaymentFragmentbindingInflater1());
                }
                if (sb2.toString().startsWith("GIF")) {
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                    int iTuitionPaymentFragmentbindingInflater1 = geteventcode.TuitionPaymentFragmentbindingInflater1();
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder = (iTuitionPaymentFragmentbindingInflater1 & 128) != 0;
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d = (int) Math.pow(2.0d, (iTuitionPaymentFragmentbindingInflater1 & 7) + 1);
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = geteventcode.TuitionPaymentFragmentbindingInflater1();
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel = geteventcode.TuitionPaymentFragmentbindingInflater1();
                    if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder && geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify == 0) {
                        AutoValue_SurfaceRequest_Result autoValue_SurfaceRequest_Result2 = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        autoValue_SurfaceRequest_Result2.f85a = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(autoValue_SurfaceRequest_Result2.d);
                        AutoValue_SurfaceRequest_Result autoValue_SurfaceRequest_Result3 = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        autoValue_SurfaceRequest_Result3.TuitionPaymentFragmentbindingInflater1 = autoValue_SurfaceRequest_Result3.f85a[geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    }
                } else {
                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = 1;
                }
                if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify == 0) {
                    boolean z2 = false;
                    while (!z2 && geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify == 0 && geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= Integer.MAX_VALUE) {
                        int iTuitionPaymentFragmentbindingInflater2 = geteventcode.TuitionPaymentFragmentbindingInflater1();
                        if (iTuitionPaymentFragmentbindingInflater2 == 33) {
                            z = z2;
                            int iTuitionPaymentFragmentbindingInflater3 = geteventcode.TuitionPaymentFragmentbindingInflater1();
                            if (iTuitionPaymentFragmentbindingInflater3 == 1) {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            } else if (iTuitionPaymentFragmentbindingInflater3 == 249) {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = new getSurfaceOutput();
                                geteventcode.TuitionPaymentFragmentbindingInflater1();
                                int iTuitionPaymentFragmentbindingInflater4 = geteventcode.TuitionPaymentFragmentbindingInflater1();
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentbindingInflater1 = (iTuitionPaymentFragmentbindingInflater4 & 28) >> 2;
                                if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentbindingInflater1 == 0) {
                                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentbindingInflater1 = 1;
                                }
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.cancel = (iTuitionPaymentFragmentbindingInflater4 & 1) != 0;
                                short s = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                                if (s < 2) {
                                    s = 10;
                                }
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = s * 10;
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.asBinder = geteventcode.TuitionPaymentFragmentbindingInflater1();
                                geteventcode.TuitionPaymentFragmentbindingInflater1();
                            } else if (iTuitionPaymentFragmentbindingInflater3 == 254 || iTuitionPaymentFragmentbindingInflater3 != 255) {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            } else {
                                geteventcode.b();
                                StringBuilder sb3 = new StringBuilder();
                                for (int i4 = 0; i4 < 11; i4++) {
                                    sb3.append((char) geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i4]);
                                }
                                if (sb3.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        geteventcode.b();
                                        byte[] bArr = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        if (bArr[0] == 1) {
                                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
                                        }
                                        if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0) {
                                            break;
                                        }
                                    } while (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify == 0);
                                } else {
                                    geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                }
                            }
                        } else if (iTuitionPaymentFragmentbindingInflater2 == 44) {
                            if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b == null) {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = new getSurfaceOutput();
                            }
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.f992a = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.d = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.asInterface = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = geteventcode.TuitionPaymentFragmentbindingInflater1.getShort();
                            int iTuitionPaymentFragmentbindingInflater5 = geteventcode.TuitionPaymentFragmentbindingInflater1();
                            boolean z3 = (iTuitionPaymentFragmentbindingInflater5 & 128) != 0;
                            z = z2;
                            int iPow = (int) Math.pow(2.0d, (iTuitionPaymentFragmentbindingInflater5 & 7) + 1);
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.b = (iTuitionPaymentFragmentbindingInflater5 & 64) != 0;
                            if (z3) {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.g = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iPow);
                            } else {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.g = null;
                            }
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = geteventcode.TuitionPaymentFragmentbindingInflater1.position();
                            geteventcode.TuitionPaymentFragmentbindingInflater1();
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify == 0) {
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                                geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b);
                            }
                        } else if (iTuitionPaymentFragmentbindingInflater2 != 59) {
                            geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = 1;
                            z = z2;
                        } else {
                            z2 = true;
                        }
                        z2 = z;
                    }
                    if (geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < 0) {
                        geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = 1;
                    }
                }
                autoValue_SurfaceRequest_Result = geteventcode.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            if (autoValue_SurfaceRequest_Result.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0 && autoValue_SurfaceRequest_Result.notify == 0) {
                isMirroring<DecodeFormat> ismirroring = addPoint.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Bitmap.Config config = (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(autoValue_SurfaceRequest_Result.g / i2, autoValue_SurfaceRequest_Result.INotificationSideChannel / i);
                if (iMin != 0) {
                    iHighestOneBit = Integer.highestOneBit(iMin);
                }
                int iMax = Math.max(1, iHighestOneBit);
                if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
                    int i5 = autoValue_SurfaceRequest_Result.INotificationSideChannel;
                    int i6 = autoValue_SurfaceRequest_Result.g;
                }
                AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = new AutoValue_SurfaceRequest_TransformationInfo(this.asBinder, autoValue_SurfaceRequest_Result, byteBuffer, iMax);
                autoValue_SurfaceRequest_TransformationInfo.b(config);
                autoValue_SurfaceRequest_TransformationInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Bitmap bitmapAsInterface = autoValue_SurfaceRequest_TransformationInfo.asInterface();
                if (bitmapAsInterface != null) {
                    getAutoCancelDurationInMillis getautocanceldurationinmillis = new getAutoCancelDurationInMillis(new isAutoCancelEnabled(this.b, autoValue_SurfaceRequest_TransformationInfo, createCaptureBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i, i2, bitmapAsInterface));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
                    }
                    return getautocanceldurationinmillis;
                }
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    sb = new StringBuilder("Decoded GIF from stream in ");
                    sb.append(setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1));
                }
            } else if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1));
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
            }
            throw th;
        }
    }

    static class TuitionPaymentFragmentbindingInflater1 {
        TuitionPaymentFragmentbindingInflater1() {
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final Queue<getEventCode> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        final getEventCode TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer byteBuffer) {
            getEventCode geteventcodePoll;
            synchronized (this) {
                geteventcodePoll = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.poll();
                if (geteventcodePoll == null) {
                    geteventcodePoll = new getEventCode();
                }
                geteventcodePoll.TuitionPaymentFragmentbindingInflater1 = null;
                Arrays.fill(geteventcodePoll.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (byte) 0);
                geteventcodePoll.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_SurfaceRequest_Result();
                geteventcodePoll.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                geteventcodePoll.TuitionPaymentFragmentbindingInflater1 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                geteventcodePoll.TuitionPaymentFragmentbindingInflater1.order(ByteOrder.LITTLE_ENDIAN);
            }
            return geteventcodePoll;
        }
    }
}
