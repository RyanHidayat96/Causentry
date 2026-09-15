package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.R;
import com.google.android.gms.measurement.internal.zznf;
import com.google.mlkit.common.MlKitException;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import defpackage.ImageUtilCodecFailedException;
import defpackage.ImageUtilCodecFailedExceptionFailureType;
import defpackage.RingBufferOnRemoveCallback;
import defpackage.SessionProcessor;
import defpackage.SizeUtil;
import defpackage.addConfig;
import defpackage.getArea;
import defpackage.getFailureType;
import defpackage.initSession;
import defpackage.inverseRational;
import defpackage.isCropAspectRatioHasEffect;
import defpackage.rotateBitmap;
import defpackage.shouldCropImage;
import defpackage.yuv_420_888toNv21;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CameraPreview extends ViewGroup {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "CameraPreview";
    private boolean INotificationSideChannel;
    private rotateBitmap INotificationSideChannelDefault;
    private final Handler.Callback INotificationSideChannelStub;
    private Handler INotificationSideChannelStubProxy;
    private TextureView IconCompatParcelizer;
    private SurfaceView MediaBrowserCompat;
    private shouldCropImage RemoteActionCompatParcelizer;
    Rect TuitionPaymentFragmentbindingInflater1;
    private shouldCropImage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private CameraSettings TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f835a;
    Rect asBinder;
    private shouldCropImage asInterface;
    public isCropAspectRatioHasEffect b;
    private getArea cancel;
    private shouldCropImage cancelAll;
    private Rect connect;
    private ImageUtilCodecFailedExceptionFailureType d;
    public List<b> g;
    private boolean getExtras;
    private inverseRational getInterfaceDescriptor;
    private WindowManager getRoot;
    private int notify;
    private double onTransact;
    private final SurfaceHolder.Callback read;
    private boolean write;
    private static final byte[] $$c = {27, -8, 5, 78};
    private static final int $$f = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, 40, 23, -13, -41, -9, -7, -21, -8, 9, -9, -18, -1, 10, -42, -5, 4, -3, -10, -10, -22, 38, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 59};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$a = {123, -2, -101, -104, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 1;
    private static int isConnected = 0;
    private static int sendCustomAction = 1;
    private static long getItem = 6134607899315257368L;
    private static int disconnect = -981105359;
    private static char getNotifyChildrenChangedOptions = 34097;

    public interface b {
        void TuitionPaymentFragmentbindingInflater1();

        void TuitionPaymentFragmentbindingInflater1(Exception exc);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        void b();
    }

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i5);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i5)) | (~(i7 | i9)) | (~(i9 | i5));
        int i14 = i5 + i2 + i4 + (669352129 * i3) + (266941808 * i);
        int i15 = i14 * i14;
        int i16 = (720661947 * i5) + 1572077568 + ((-1243901369) * i2) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i4) + ((-1100480512) * i3) + ((-1249902592) * i) + ((-491520000) * i15);
        int i17 = (i5 * 1617402437) + 56426783 + (i2 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i4 * 1617401855) + (i3 * 1244927807) + (i * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        if (i18 != 1) {
            return i18 != 2 ? b(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.journeyapps.barcodescanner.CameraPreview.$$a
            int r8 = r8 * 52
            int r8 = 56 - r8
            int r1 = 53 - r6
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CameraPreview.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.journeyapps.barcodescanner.CameraPreview.$$d
            int r6 = r6 * 11
            int r1 = r6 + 42
            int r7 = r7 * 16
            int r7 = r7 + 68
            int r5 = r5 * 41
            int r5 = 45 - r5
            byte[] r1 = new byte[r1]
            int r6 = r6 + 41
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CameraPreview.f(short, short, short, java.lang.Object[]):void");
    }

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(CameraPreview cameraPreview) {
        int i = 2 % 2;
        int i2 = sendCustomAction + 125;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -654321951, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 654321952, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{cameraPreview});
        int i4 = isConnected + 93;
        sendCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview cameraPreview) {
        int i = 2 % 2;
        int i2 = sendCustomAction + 45;
        int i3 = i2 % 128;
        isConnected = i3;
        int i4 = i2 % 2;
        List<b> list = cameraPreview.g;
        int i5 = i3 + 37;
        sendCustomAction = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static /* synthetic */ shouldCropImage TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview cameraPreview, shouldCropImage shouldcropimage) {
        int i = 2 % 2;
        int i2 = isConnected + 73;
        int i3 = i2 % 128;
        sendCustomAction = i3;
        int i4 = i2 % 2;
        cameraPreview.asInterface = shouldcropimage;
        if (i4 == 0) {
            int i5 = 7 / 0;
        }
        int i6 = i3 + 29;
        isConnected = i6 % 128;
        if (i6 % 2 == 0) {
            return shouldcropimage;
        }
        throw null;
    }

    static /* synthetic */ b TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview cameraPreview) {
        int i = 2 % 2;
        int i2 = isConnected + 101;
        int i3 = i2 % 128;
        sendCustomAction = i3;
        int i4 = i2 % 2;
        b bVar = cameraPreview.f835a;
        int i5 = i3 + 119;
        isConnected = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return bVar;
    }

    static /* synthetic */ Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview cameraPreview) {
        int i = 2 % 2;
        int i2 = sendCustomAction;
        int i3 = i2 + 27;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = cameraPreview.INotificationSideChannelStubProxy;
        int i5 = i2 + 9;
        isConnected = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview cameraPreview, shouldCropImage shouldcropimage) {
        int i = 2 % 2;
        cameraPreview.RemoteActionCompatParcelizer = shouldcropimage;
        shouldCropImage shouldcropimage2 = cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (shouldcropimage2 != null) {
            if (shouldcropimage2 == null || shouldcropimage == null || cameraPreview.d == null) {
                cameraPreview.asBinder = null;
                cameraPreview.TuitionPaymentFragmentbindingInflater1 = null;
                cameraPreview.connect = null;
                throw new IllegalStateException("containerSize or previewSize is not set yet");
            }
            int i2 = shouldcropimage.TuitionPaymentFragmentbindingInflater1;
            int i3 = cameraPreview.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i4 = cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
            int i5 = cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ImageUtilCodecFailedExceptionFailureType imageUtilCodecFailedExceptionFailureType = cameraPreview.d;
            cameraPreview.connect = imageUtilCodecFailedExceptionFailureType.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraPreview.RemoteActionCompatParcelizer, imageUtilCodecFailedExceptionFailureType.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Rect rect = new Rect(0, 0, i4, i5);
            Rect rect2 = cameraPreview.connect;
            Rect rect3 = new Rect(rect);
            rect3.intersect(rect2);
            if (cameraPreview.cancelAll != null) {
                rect3.inset(Math.max(0, (rect3.width() - cameraPreview.cancelAll.TuitionPaymentFragmentbindingInflater1) / 2), Math.max(0, (rect3.height() - cameraPreview.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 2));
            } else {
                int iMin = (int) Math.min(((double) rect3.width()) * cameraPreview.onTransact, ((double) rect3.height()) * cameraPreview.onTransact);
                rect3.inset(iMin, iMin);
                if (rect3.height() > rect3.width()) {
                    int i6 = isConnected + 31;
                    sendCustomAction = i6 % 128;
                    if (i6 % 2 == 0) {
                        rect3.inset(1, (rect3.height() % rect3.width()) % 5);
                    } else {
                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                    }
                }
            }
            cameraPreview.TuitionPaymentFragmentbindingInflater1 = rect3;
            Rect rect4 = new Rect(cameraPreview.TuitionPaymentFragmentbindingInflater1);
            rect4.offset(-cameraPreview.connect.left, -cameraPreview.connect.top);
            Rect rect5 = new Rect((rect4.left * i2) / cameraPreview.connect.width(), (rect4.top * i3) / cameraPreview.connect.height(), (rect4.right * i2) / cameraPreview.connect.width(), (rect4.bottom * i3) / cameraPreview.connect.height());
            cameraPreview.asBinder = rect5;
            if (rect5.width() <= 0 || cameraPreview.asBinder.height() <= 0) {
                cameraPreview.asBinder = null;
                cameraPreview.TuitionPaymentFragmentbindingInflater1 = null;
            } else {
                int i7 = isConnected + 69;
                sendCustomAction = i7 % 128;
                int i8 = i7 % 2;
                cameraPreview.f835a.b();
            }
            cameraPreview.requestLayout();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -654321951, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 654321952, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{cameraPreview});
            int i9 = isConnected + 15;
            sendCustomAction = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    static /* synthetic */ String b() {
        int i = 2 % 2;
        int i2 = sendCustomAction + 15;
        int i3 = i2 % 128;
        isConnected = i3;
        int i4 = i2 % 2;
        String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 47;
        sendCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static /* synthetic */ void b(CameraPreview cameraPreview) {
        int i = 2 % 2;
        boolean z = false;
        if (cameraPreview.b != null) {
            int i2 = isConnected + 3;
            sendCustomAction = i2 % 128;
            z = !(i2 % 2 == 0);
        }
        if (z && cameraPreview.getRoot.getDefaultDisplay().getRotation() != cameraPreview.notify) {
            cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 125814690, zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -125814690, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{cameraPreview});
        }
        int i3 = sendCustomAction + 79;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - Color.green(0)), 1235 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 36, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2764 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 14 - (Process.myPid() >> 22), 1504416861, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 253 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - TextUtils.getOffsetAfter("", 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.alpha(0) + 65200), ExpandableListView.getPackedPositionChild(0L) + 2892, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (getItem ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) disconnect) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) getNotifyChildrenChangedOptions) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 77;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.CameraPreview$1, reason: invalid class name */
    final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, new shouldCropImage(i, i2));
            CameraPreview.TuitionPaymentFragmentbindingInflater1(CameraPreview.this);
        }
    }

    public CameraPreview(Context context) {
        super(context);
        this.getExtras = false;
        this.INotificationSideChannel = false;
        this.notify = -1;
        this.g = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraSettings();
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.asBinder = null;
        this.cancelAll = null;
        this.onTransact = 0.1d;
        this.cancel = null;
        this.write = false;
        this.read = new SurfaceHolder.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.4
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, (shouldCropImage) null);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (surfaceHolder == null) {
                    CameraPreview.b();
                } else {
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, new shouldCropImage(i2, i3));
                    CameraPreview.TuitionPaymentFragmentbindingInflater1(CameraPreview.this);
                }
            }
        };
        this.INotificationSideChannelStub = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.5
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_prewiew_size_ready) {
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview.this, (shouldCropImage) message.obj);
                    return true;
                }
                if (message.what == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (CameraPreview.this.b == null) {
                        return false;
                    }
                    CameraPreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview.this).TuitionPaymentFragmentbindingInflater1(exc);
                    return false;
                }
                if (message.what != R.id.zxing_camera_closed) {
                    return false;
                }
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return false;
            }
        };
        this.getInterfaceDescriptor = new inverseRational() { // from class: com.journeyapps.barcodescanner.CameraPreview.2
            @Override // defpackage.inverseRational
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview.this).postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.CameraPreview.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreview.b(CameraPreview.this);
                    }
                }, 250L);
            }
        };
        this.f835a = new b() { // from class: com.journeyapps.barcodescanner.CameraPreview.3
            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void b() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentbindingInflater1();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc) {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentbindingInflater1(exc);
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, (AttributeSet) null);
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getExtras = false;
        this.INotificationSideChannel = false;
        this.notify = -1;
        this.g = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraSettings();
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.asBinder = null;
        this.cancelAll = null;
        this.onTransact = 0.1d;
        this.cancel = null;
        this.write = false;
        this.read = new SurfaceHolder.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.4
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, (shouldCropImage) null);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (surfaceHolder == null) {
                    CameraPreview.b();
                } else {
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, new shouldCropImage(i2, i3));
                    CameraPreview.TuitionPaymentFragmentbindingInflater1(CameraPreview.this);
                }
            }
        };
        this.INotificationSideChannelStub = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.5
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_prewiew_size_ready) {
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview.this, (shouldCropImage) message.obj);
                    return true;
                }
                if (message.what == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (CameraPreview.this.b == null) {
                        return false;
                    }
                    CameraPreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview.this).TuitionPaymentFragmentbindingInflater1(exc);
                    return false;
                }
                if (message.what != R.id.zxing_camera_closed) {
                    return false;
                }
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return false;
            }
        };
        this.getInterfaceDescriptor = new inverseRational() { // from class: com.journeyapps.barcodescanner.CameraPreview.2
            @Override // defpackage.inverseRational
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview.this).postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.CameraPreview.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreview.b(CameraPreview.this);
                    }
                }, 250L);
            }
        };
        this.f835a = new b() { // from class: com.journeyapps.barcodescanner.CameraPreview.3
            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void b() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentbindingInflater1();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc) {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentbindingInflater1(exc);
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, attributeSet);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getExtras = false;
        this.INotificationSideChannel = false;
        this.notify = -1;
        this.g = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraSettings();
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.asBinder = null;
        this.cancelAll = null;
        this.onTransact = 0.1d;
        this.cancel = null;
        this.write = false;
        this.read = new SurfaceHolder.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.4
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, (shouldCropImage) null);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                if (surfaceHolder == null) {
                    CameraPreview.b();
                } else {
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this, new shouldCropImage(i3, i4));
                    CameraPreview.TuitionPaymentFragmentbindingInflater1(CameraPreview.this);
                }
            }
        };
        this.INotificationSideChannelStub = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.CameraPreview.5
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == R.id.zxing_prewiew_size_ready) {
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview.this, (shouldCropImage) message.obj);
                    return true;
                }
                if (message.what == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (CameraPreview.this.b == null) {
                        return false;
                    }
                    CameraPreview.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview.this).TuitionPaymentFragmentbindingInflater1(exc);
                    return false;
                }
                if (message.what != R.id.zxing_camera_closed) {
                    return false;
                }
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraPreview.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return false;
            }
        };
        this.getInterfaceDescriptor = new inverseRational() { // from class: com.journeyapps.barcodescanner.CameraPreview.2
            @Override // defpackage.inverseRational
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CameraPreview.this).postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.CameraPreview.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraPreview.b(CameraPreview.this);
                    }
                }, 250L);
            }
        };
        this.f835a = new b() { // from class: com.journeyapps.barcodescanner.CameraPreview.3
            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void b() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentbindingInflater1();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentbindingInflater1(Exception exc) {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentbindingInflater1(exc);
                }
            }

            @Override // com.journeyapps.barcodescanner.CameraPreview.b
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                Iterator it = CameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraPreview.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, attributeSet);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = sendCustomAction + 125;
        isConnected = i2 % 128;
        int i3 = i2 % 2;
        if (getBackground() == null) {
            int i4 = sendCustomAction + 7;
            isConnected = i4 % 128;
            if (i4 % 2 != 0) {
                setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -892119474, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 892119476, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, attributeSet});
        this.getRoot = (WindowManager) context.getSystemService("window");
        this.INotificationSideChannelStubProxy = new Handler(this.INotificationSideChannelStub);
        this.INotificationSideChannelDefault = new rotateBitmap();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = isConnected + 15;
        sendCustomAction = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        if (this.getExtras) {
            TextureView textureView = new TextureView(getContext());
            this.IconCompatParcelizer = textureView;
            textureView.setSurfaceTextureListener(new AnonymousClass1());
            addView(this.IconCompatParcelizer);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.MediaBrowserCompat = surfaceView;
        surfaceView.getHolder().addCallback(this.read);
        addView(this.MediaBrowserCompat);
        int i4 = isConnected + 71;
        sendCustomAction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        CameraPreview cameraPreview = (CameraPreview) objArr[0];
        AttributeSet attributeSet = (AttributeSet) objArr[1];
        int i = 2 % 2;
        int i2 = isConnected + 1;
        sendCustomAction = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TypedArray typedArrayObtainStyledAttributes = cameraPreview.getContext().obtainStyledAttributes(attributeSet, addConfig.b.TuitionPaymentFragmentbindingInflater1);
            typedArrayObtainStyledAttributes.getDimension(addConfig.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3, -1.0f);
            typedArrayObtainStyledAttributes.getDimension(addConfig.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1, -1.0f);
            obj.hashCode();
            throw null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = cameraPreview.getContext().obtainStyledAttributes(attributeSet, addConfig.b.TuitionPaymentFragmentbindingInflater1);
        int dimension = (int) typedArrayObtainStyledAttributes2.getDimension(addConfig.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes2.getDimension(addConfig.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            cameraPreview.cancelAll = new shouldCropImage(dimension, dimension2);
        }
        cameraPreview.getExtras = typedArrayObtainStyledAttributes2.getBoolean(addConfig.b.b, true);
        int integer = typedArrayObtainStyledAttributes2.getInteger(addConfig.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2, -1);
        if (integer == 1) {
            cameraPreview.cancel = new yuv_420_888toNv21();
        } else if (integer == 2) {
            cameraPreview.cancel = new RingBufferOnRemoveCallback();
            int i3 = isConnected + 97;
            sendCustomAction = i3 % 128;
            int i4 = i3 % 2;
        } else if (integer == 3) {
            cameraPreview.cancel = new SizeUtil();
        }
        typedArrayObtainStyledAttributes2.recycle();
        return null;
    }

    public void setTorch(boolean z) {
        isCropAspectRatioHasEffect iscropaspectratiohaseffect;
        int i = 2 % 2;
        int i2 = sendCustomAction + 103;
        isConnected = i2 % 128;
        if (i2 % 2 != 0) {
            this.write = z;
            iscropaspectratiohaseffect = this.b;
            int i3 = 61 / 0;
            if (iscropaspectratiohaseffect == null) {
                return;
            }
        } else {
            this.write = z;
            iscropaspectratiohaseffect = this.b;
            if (iscropaspectratiohaseffect == null) {
                return;
            }
        }
        iscropaspectratiohaseffect.TuitionPaymentFragmentbindingInflater1(z);
        int i4 = isConnected + 7;
        sendCustomAction = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setPreviewScalingStrategy(getArea getarea) {
        int i = 2 % 2;
        int i2 = sendCustomAction + 15;
        int i3 = i2 % 128;
        isConnected = i3;
        int i4 = i2 % 2;
        this.cancel = getarea;
        int i5 = i3 + 109;
        sendCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static Matrix TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldCropImage shouldcropimage, shouldCropImage shouldcropimage2) {
        float f;
        int i = 2 % 2;
        float f2 = shouldcropimage.TuitionPaymentFragmentbindingInflater1 / shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f3 = shouldcropimage2.TuitionPaymentFragmentbindingInflater1 / shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f4 = 1.0f;
        if (f2 < f3) {
            float f5 = f3 / f2;
            int i2 = sendCustomAction + 123;
            isConnected = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 4;
            }
            f = 1.0f;
            f4 = f5;
        } else {
            f = f2 / f3;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f);
        matrix.postTranslate((shouldcropimage.TuitionPaymentFragmentbindingInflater1 - (shouldcropimage.TuitionPaymentFragmentbindingInflater1 * f4)) / 2.0f, (shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * f)) / 2.0f);
        int i4 = isConnected + 19;
        sendCustomAction = i4 % 128;
        if (i4 % 2 != 0) {
            return matrix;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        CameraPreview cameraPreview = (CameraPreview) objArr[0];
        int i = 2 % 2;
        shouldCropImage shouldcropimage = cameraPreview.asInterface;
        if (shouldcropimage != null && cameraPreview.RemoteActionCompatParcelizer != null) {
            int i2 = isConnected + 121;
            sendCustomAction = i2 % 128;
            int i3 = i2 % 2;
            Rect rect = cameraPreview.connect;
            if (rect != null) {
                if (cameraPreview.MediaBrowserCompat != null && shouldcropimage.equals(new shouldCropImage(rect.width(), cameraPreview.connect.height()))) {
                    cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getFailureType(cameraPreview.MediaBrowserCompat.getHolder()));
                    return null;
                }
                TextureView textureView = cameraPreview.IconCompatParcelizer;
                if (textureView != null) {
                    int i4 = sendCustomAction + 29;
                    isConnected = i4 % 128;
                    int i5 = i4 % 2;
                    if (textureView.getSurfaceTexture() != null) {
                        int i6 = isConnected + 69;
                        sendCustomAction = i6 % 128;
                        if (i6 % 2 == 0) {
                            shouldCropImage shouldcropimage2 = cameraPreview.RemoteActionCompatParcelizer;
                            throw null;
                        }
                        if (cameraPreview.RemoteActionCompatParcelizer != null) {
                            cameraPreview.IconCompatParcelizer.setTransform(TuitionPaymentFragmentspecialinlinedviewModeldefault1(new shouldCropImage(cameraPreview.IconCompatParcelizer.getWidth(), cameraPreview.IconCompatParcelizer.getHeight()), cameraPreview.RemoteActionCompatParcelizer));
                        }
                        cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getFailureType(cameraPreview.IconCompatParcelizer.getSurfaceTexture()));
                        int i7 = isConnected + 3;
                        sendCustomAction = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 5 % 2;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        shouldCropImage shouldcropimage = new shouldCropImage(i3 - i, i4 - i2);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = shouldcropimage;
        isCropAspectRatioHasEffect iscropaspectratiohaseffect = this.b;
        if (iscropaspectratiohaseffect != null && iscropaspectratiohaseffect.asBinder == null) {
            ImageUtilCodecFailedExceptionFailureType imageUtilCodecFailedExceptionFailureType = new ImageUtilCodecFailedExceptionFailureType(this.getRoot.getDefaultDisplay().getRotation(), shouldcropimage);
            this.d = imageUtilCodecFailedExceptionFailureType;
            getArea ringBufferOnRemoveCallback = this.cancel;
            if (ringBufferOnRemoveCallback == null) {
                if (this.IconCompatParcelizer != null) {
                    ringBufferOnRemoveCallback = new yuv_420_888toNv21();
                } else {
                    ringBufferOnRemoveCallback = new RingBufferOnRemoveCallback();
                }
            }
            imageUtilCodecFailedExceptionFailureType.b = ringBufferOnRemoveCallback;
            isCropAspectRatioHasEffect iscropaspectratiohaseffect2 = this.b;
            ImageUtilCodecFailedExceptionFailureType imageUtilCodecFailedExceptionFailureType2 = this.d;
            iscropaspectratiohaseffect2.asBinder = imageUtilCodecFailedExceptionFailureType2;
            iscropaspectratiohaseffect2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d = imageUtilCodecFailedExceptionFailureType2;
            isCropAspectRatioHasEffect iscropaspectratiohaseffect3 = this.b;
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("Must be called from the main thread.");
            }
            if (iscropaspectratiohaseffect3.d) {
                ImageUtilCodecFailedException imageUtilCodecFailedException = iscropaspectratiohaseffect3.b;
                Runnable runnable = iscropaspectratiohaseffect3.f1219a;
                synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(runnable);
                }
                boolean z2 = this.write;
                if (z2) {
                    this.b.TuitionPaymentFragmentbindingInflater1(z2);
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.MediaBrowserCompat;
        if (surfaceView != null) {
            Rect rect = this.connect;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
                return;
            } else {
                surfaceView.layout(rect.left, this.connect.top, this.connect.right, this.connect.bottom);
                return;
            }
        }
        TextureView textureView = this.IconCompatParcelizer;
        if (textureView != null) {
            textureView.layout(0, 0, getWidth(), getHeight());
        }
    }

    public void setCameraSettings(CameraSettings cameraSettings) {
        int i = 2 % 2;
        int i2 = isConnected + 19;
        int i3 = i2 % 128;
        sendCustomAction = i3;
        int i4 = i2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraSettings;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = i3 + 121;
        isConnected = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        CameraPreview cameraPreview = (CameraPreview) objArr[0];
        int i = 2 % 2;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
        cameraPreview.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (cameraPreview.asInterface != null) {
            int i2 = isConnected + 9;
            sendCustomAction = i2 % 128;
            int i3 = i2 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -654321951, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 654321952, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{cameraPreview});
        } else {
            SurfaceView surfaceView = cameraPreview.MediaBrowserCompat;
            if (surfaceView != null) {
                int i4 = sendCustomAction + 35;
                isConnected = i4 % 128;
                int i5 = i4 % 2;
                surfaceView.getHolder().addCallback(cameraPreview.read);
            } else {
                TextureView textureView = cameraPreview.IconCompatParcelizer;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        cameraPreview.new AnonymousClass1().onSurfaceTextureAvailable(cameraPreview.IconCompatParcelizer.getSurfaceTexture(), cameraPreview.IconCompatParcelizer.getWidth(), cameraPreview.IconCompatParcelizer.getHeight());
                    } else {
                        cameraPreview.IconCompatParcelizer.setSurfaceTextureListener(cameraPreview.new AnonymousClass1());
                    }
                }
            }
        }
        cameraPreview.requestLayout();
        cameraPreview.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cameraPreview.getContext(), cameraPreview.getInterfaceDescriptor);
        return null;
    }

    public void setFramingRectSize(shouldCropImage shouldcropimage) {
        int i = 2 % 2;
        int i2 = sendCustomAction + 117;
        int i3 = i2 % 128;
        isConnected = i3;
        int i4 = i2 % 2;
        this.cancelAll = shouldcropimage;
        int i5 = i3 + 121;
        sendCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMarginFraction(double d) {
        int i = 2 % 2;
        int i2 = isConnected;
        int i3 = i2 + 55;
        sendCustomAction = i3 % 128;
        int i4 = i3 % 2;
        if (d >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.onTransact = d;
        int i5 = i2 + 83;
        sendCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setUseTextureView(boolean z) {
        int i = 2 % 2;
        int i2 = sendCustomAction;
        int i3 = i2 + 121;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
        this.getExtras = z;
        int i5 = i2 + 103;
        isConnected = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = sendCustomAction + 79;
        isConnected = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.b != null) {
            return;
        }
        isCropAspectRatioHasEffect iscropaspectratiohaseffect = new isCropAspectRatioHasEffect(getContext());
        CameraSettings cameraSettings = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (!iscropaspectratiohaseffect.d) {
            int i3 = isConnected + 31;
            sendCustomAction = i3 % 128;
            if (i3 % 2 == 0) {
                iscropaspectratiohaseffect.TuitionPaymentFragmentbindingInflater1 = cameraSettings;
                iscropaspectratiohaseffect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = cameraSettings;
                throw null;
            }
            iscropaspectratiohaseffect.TuitionPaymentFragmentbindingInflater1 = cameraSettings;
            iscropaspectratiohaseffect.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify = cameraSettings;
        }
        this.b = iscropaspectratiohaseffect;
        iscropaspectratiohaseffect.asInterface = this.INotificationSideChannelStubProxy;
        this.b.b();
        this.notify = this.getRoot.getDefaultDisplay().getRotation();
        int i4 = sendCustomAction + 113;
        isConnected = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFailureType getfailuretype) {
        isCropAspectRatioHasEffect iscropaspectratiohaseffect;
        if (this.INotificationSideChannel || (iscropaspectratiohaseffect = this.b) == null) {
            return;
        }
        iscropaspectratiohaseffect.onTransact = getfailuretype;
        isCropAspectRatioHasEffect iscropaspectratiohaseffect2 = this.b;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
        if (iscropaspectratiohaseffect2.d) {
            ImageUtilCodecFailedException imageUtilCodecFailedException = iscropaspectratiohaseffect2.b;
            Runnable runnable = iscropaspectratiohaseffect2.g;
            synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(runnable);
            }
            this.INotificationSideChannel = true;
            TuitionPaymentFragmentbindingInflater1();
            this.f835a.TuitionPaymentFragmentbindingInflater1();
            return;
        }
        throw new IllegalStateException("CameraInstance is not open");
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = isConnected;
        int i3 = i2 + 119;
        sendCustomAction = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.INotificationSideChannel;
        int i4 = i2 + 103;
        sendCustomAction = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.write);
        int i2 = isConnected + 65;
        sendCustomAction = i2 % 128;
        int i3 = i2 % 2;
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) throws Throwable {
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = sendCustomAction + 85;
        isConnected = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
            int iRgb = Color.rgb(0, 0, 0) + 16778137;
            int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
            Object[] objArr3 = new Object[1];
            c((byte) 52, $$a[80], (byte) $$b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iRgb, iIndexOf, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{17705, 1912, 27666, 62044}, new char[]{45304, 44010, 13718, 432}, (char) TextUtils.indexOf("", "", 0), View.MeasureSpec.getMode(0), new char[]{30388, 34736, 48768, 3531, 41617, 44255, 7202, 27760, 12936, 60908, 46352, 18240, 12337, 2676, 41823, 201, 62700, 33891, 29447, 24048, 2584, 40865}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{17705, 1912, 27666, 62044}, new char[]{10828, 7592, 52893, 4707}, (char) (25550 - View.MeasureSpec.getMode(0)), (-1659000791) - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{39110, 2153, 62566, 32045, 15951, 26975, 31043, 20150, 21302, 58873, 2206, 32770, 14027, 14356, 58232}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
            int maximumFlingVelocity = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b2 = $$a[80];
            byte b3 = (byte) $$b;
            Object[] objArr6 = new Object[1];
            c(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, offsetBefore, maximumFlingVelocity, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31534);
                int iKeyCodeFromString = 921 - KeyEvent.keyCodeFromString("");
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                byte[] bArr = $$a;
                Object[] objArr7 = new Object[1];
                c(bArr[33], (byte) $$b, bArr[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iKeyCodeFromString, longPressTimeout, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = (((-1147656481) + (((~(1610481243 | startUptimeMillis)) | 163598400) * (-756))) + (((~startUptimeMillis) | 1610481243) * 756)) - 56775145;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{17705, 1912, 27666, 62044}, new char[]{61631, 24578, 25863, 28784}, (char) (TextUtils.getCapsMode("", 0, 0) + 28773), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{50330, 58091, 29227, 20705, 33739, 53196, 25975, 29241, 1507, 25274, 54266, 19453, 41039, 15085, 27602, 16061, 40393, 46327, 33642, 29507, 17832, 56601, 50861, 64649, 57493, 14706}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{17705, 1912, 27666, 62044}, new char[]{15044, 58690, 31309, 58768}, (char) (36986 - TextUtils.getCapsMode("", 0, 0)), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{11646, 23409, 27160, 2312, 41497, 54735, 35241, 39187, 30443, 38782, 25456, 8733, 3626, 29632, 43271, 15028, 60677, 14155}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{17705, 1912, 27666, 62044}, new char[]{34286, 42092, 37851, 46744}, (char) (39059 - KeyEvent.normalizeMetaState(0)), KeyEvent.normalizeMetaState(0), new char[]{32034, 54639, 45724, 44545, 44845, 63109, 3172, 28962, 63226, 3039, 64849, 8263, 40462, 30750, 24091, 46669}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{17705, 1912, 27666, 62044}, new char[]{20039, 40216, 19563, 16893}, (char) (64844 - TextUtils.getOffsetBefore("", 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{2063, 34274, 22504, 40656, 8566, 52894, 12040, 28602, 10104, 26422, 48342, 63596, 12130, 46448, 47506, 48824}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -56775145};
                byte[] bArr2 = $$d;
                byte b4 = bArr2[78];
                byte b5 = bArr2[55];
                Object[] objArr14 = new Object[1];
                f(b4, b5, b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = bArr2[55];
                byte b7 = bArr2[78];
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    i = 22;
                    char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                    int iAlpha = 921 - Color.alpha(0);
                    int mode = View.MeasureSpec.getMode(0) + 28;
                    byte[] bArr3 = $$a;
                    Object[] objArr16 = new Object[1];
                    c(bArr3[33], (byte) $$b, bArr3[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, iAlpha, mode, -1142834547, false, (String) objArr16[0], null);
                } else {
                    i = 22;
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    char[] cArr = new char[i];
                    // fill-array-data instruction
                    cArr[0] = 30388;
                    cArr[1] = 34736;
                    cArr[2] = 48768;
                    cArr[3] = 3531;
                    cArr[4] = 41617;
                    cArr[5] = 44255;
                    cArr[6] = 7202;
                    cArr[7] = 27760;
                    cArr[8] = 12936;
                    cArr[9] = 60908;
                    cArr[10] = 46352;
                    cArr[11] = 18240;
                    cArr[12] = 12337;
                    cArr[13] = 2676;
                    cArr[14] = 41823;
                    cArr[15] = 201;
                    cArr[16] = 62700;
                    cArr[17] = 33891;
                    cArr[18] = 29447;
                    cArr[19] = 24048;
                    cArr[20] = 2584;
                    cArr[21] = 40865;
                    Object[] objArr17 = new Object[1];
                    e(new char[]{17705, 1912, 27666, 62044}, new char[]{45304, 44010, 13718, 432}, (char) (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getWindowTouchSlop() >> 8, cArr, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{17705, 1912, 27666, 62044}, new char[]{10828, 7592, 52893, 4707}, (char) (25550 - Color.argb(0, 0, 0, 0)), (-1659000790) + (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{39110, 2153, 62566, 32045, 15951, 26975, 31043, 20150, 21302, 58873, 2206, 32770, 14027, 14356, 58232}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 28;
                        byte b8 = $$a[80];
                        byte b9 = (byte) $$b;
                        Object[] objArr19 = new Object[1];
                        c(b8, b9, b9, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionType, iNormalizeMetaState, absoluteGravity, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31533);
                        int iRgb2 = (-16776295) - Color.rgb(0, 0, 0);
                        int iRed = Color.red(0) + 28;
                        Object[] objArr20 = new Object[1];
                        c((byte) 52, $$a[80], (byte) $$b, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout2, iRgb2, iRed, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i8 = ((int[]) objArr[1])[0];
        int i9 = ((int[]) objArr[3])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = (-594336959) + (((~((-795525685) | iIdentityHashCode)) | (-978553960)) * (-318));
            int i12 = ~((-978553960) | iIdentityHashCode);
            int i13 = ~iIdentityHashCode;
            int i14 = i10 + i11 + ((i12 | (~(1065078391 | i13))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode | 1065078391)) | (~((-269552708) | i13))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr2[0])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
            int i17 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = i17 + (((~((-785500871) | iIdentityHashCode2)) | 68241410) * (-566)) + 1744012039 + ((~(iIdentityHashCode2 | (-717259461))) * 566);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
            int i21 = sendCustomAction + 5;
            isConnected = i21 % 128;
            int i22 = i21 % 2;
            objArr2 = objArr21;
        }
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            int i23 = isConnected + 79;
            sendCustomAction = i23 % 128;
            int i24 = i23 % 2;
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        int i25 = ((int[]) objArr2[0])[0];
        int i26 = i25 * i25;
        int i27 = -(2020612019 * i25);
        int i28 = ((((i26 | i27) << 1) - (i26 ^ i27)) - (~(-(i25 * (-614725355))))) - (-2092738319);
        int i29 = ((i28 >> 24) - 511) / 256;
        int i30 = ((i29 | 1) << 1) - (i29 ^ 1);
        int i31 = (i28 ^ i30) + ((i30 & i28) << 1);
        int i32 = i28 >> 17;
        int i33 = (-(i31 ^ (((((-65535) & i32) + (i32 | (-65535))) / 32768) + 1))) + 8;
        int i34 = i33 >> 20;
        int i35 = (((i34 | (-8191)) << 1) - (i34 ^ (-8191))) / 4096;
        int i36 = (i35 & 1) + (i35 | 1);
        setTorch(bundle.getBoolean("11\\torch".substring(7920 / ((i33 & (-(((i36 | 1) << 1) - (i36 ^ 1)))) * 330))));
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TextureView textureView;
        SurfaceView surfaceView;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.notify = -1;
            isCropAspectRatioHasEffect iscropaspectratiohaseffect = this.b;
            if (iscropaspectratiohaseffect == null) {
                this.INotificationSideChannelStubProxy.sendEmptyMessage(R.id.zxing_camera_closed);
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                if (iscropaspectratiohaseffect.d) {
                    ImageUtilCodecFailedException imageUtilCodecFailedException = iscropaspectratiohaseffect.b;
                    Runnable runnable = iscropaspectratiohaseffect.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(runnable);
                    }
                } else {
                    iscropaspectratiohaseffect.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                }
                iscropaspectratiohaseffect.d = false;
                this.b = null;
                this.INotificationSideChannel = false;
            } else {
                throw new IllegalStateException("Must be called from the main thread.");
            }
            if (this.asInterface == null && (surfaceView = this.MediaBrowserCompat) != null) {
                surfaceView.getHolder().removeCallback(this.read);
            }
            if (this.asInterface == null && (textureView = this.IconCompatParcelizer) != null) {
                textureView.setSurfaceTextureListener(null);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.RemoteActionCompatParcelizer = null;
            this.asBinder = null;
            rotateBitmap rotatebitmap = this.INotificationSideChannelDefault;
            OrientationEventListener orientationEventListener = rotatebitmap.b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
            rotatebitmap.b = null;
            rotatebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            rotatebitmap.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            this.f835a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    private void asInterface() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -654321951, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 654321952, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this});
    }

    protected final void b(AttributeSet attributeSet) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -892119474, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 892119476, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this, attributeSet});
    }

    protected void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = isConnected + 113;
        sendCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void g() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 125814690, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -125814690, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this});
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 + 102
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = com.journeyapps.barcodescanner.CameraPreview.$$c
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CameraPreview.$$g(byte, short, byte):java.lang.String");
    }
}
