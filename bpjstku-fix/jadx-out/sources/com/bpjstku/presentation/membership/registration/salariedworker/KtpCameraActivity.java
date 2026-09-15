package com.bpjstku.presentation.membership.registration.salariedworker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioTrack;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import com.bpjstku.databinding.ActivityKtpCameraBinding;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.Futures1;
import defpackage.Futures4;
import defpackage.FuturesExternalSyntheticLambda6;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.captureSingleRequest;
import defpackage.getConfigs;
import defpackage.initSession;
import defpackage.lambdanonCancellationPropagating0;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import defpackage.nonCancellationPropagating;
import defpackage.onCaptureSessionStart;
import defpackage.propagate;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010#\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010&\u001a\u0002048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00105"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpCameraActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Landroid/util/Size;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "([Landroid/util/Size;)Landroid/util/Size;", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/graphics/Bitmap;)Ljava/io/File;", "", "", "p1", "", "p2", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/bpjstku/databinding/ActivityKtpCameraBinding;", "Lcom/bpjstku/databinding/ActivityKtpCameraBinding;", "b", "Landroid/hardware/camera2/CameraDevice;", "Landroid/hardware/camera2/CameraDevice;", "TuitionPaymentFragmentbindingInflater1", "Landroid/hardware/camera2/CameraCaptureSession;", "asBinder", "Landroid/hardware/camera2/CameraCaptureSession;", "Landroid/media/ImageReader;", "asInterface", "Landroid/media/ImageReader;", "Landroid/os/Handler;", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "d", "Landroid/util/Size;", "g", "Landroid/graphics/Bitmap;", "Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpCameraActivity$TuitionPaymentFragmentbindingInflater1;", "onTransact", "Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpCameraActivity$TuitionPaymentFragmentbindingInflater1;", "a", "Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpCameraActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpCameraActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KtpCameraActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int cancel;
    private static long cancelAll;
    private static int getInterfaceDescriptor;
    private static char notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private HandlerThread d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private ActivityKtpCameraBinding b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private CameraDevice TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CameraCaptureSession TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private ImageReader TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Size g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Bitmap asBinder;
    private static final byte[] $$c = {73, 55, 58, 33};
    private static final int $$f = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {97, 58, 103, -72, -27, -6, 4, 3, -16, 27, -23, -13, 10, 1, -6, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 63, -6, -3, 32, -46, -3, 21, -16, -9, -15, -39, 9, -9, -1, 31, -33, -18, -7, -4, 0, 10, 29, -54, 1, 38, -44, -3, 16, -13, 3, 18, -28, 3, -20, -4, 0, 10, 46, 0, -33, -15, 5, -16, 14, 17, -23, -16, 10, -9, -1, -16, 44, -47, -1, -6, 12, -22, 48, -56, 18, -11, -6, 8, -4, -10, -6, 0, -14, -8, 51, -33, -14, -3, 7, -2, -5, -11, 35, -54, 16, -1, -21, -2, 2, -6, 24, -30, 14, -18, -3, 8, -16, 42, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -57, 0, -22, 16, 48, -70, -7, 13, -19, 13, -7, -8, 4, 54, -71, 10, -11, -5, -8, 12, 52, -38, -39, 13, -19, 13, -7, -8, 4, 35, -50, 4, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -69, -5, 10, -17, 11, -12, -9, 16, -22, 8, -9, -2, Base64.padSymbol, -69, -5, 0, 5, -14, 14, -15, 60, -63, -1, -15, 67, -68, 0, 5, -3, 0, -27, 3, 11, -1, -21, 0, 6, -14, -8, 72, -36, -32, 5, 29, -32, -27, 35, -21, -1, -21, 0, 6, -14, -8, 53, -37, -20, 8, -16, 10, -14, -8, 82, -82, 0, 8, -1, -9, 5, -14, 69, -3, -72, -8, -1, 0, -8, 6, -2, Base64.padSymbol, -72, -8, 1, 2, -1, -20, 77, -67, -4, -4, 2, -23, 6, -11, 77, -16, -47, -2, 5, -6, -1, 21, -36, -7, 8, -9, -2, 71, -19};
    private static final int $$e = 71;
    private static final byte[] $$a = {68, -119, -76, 97, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 119;
    private static int RemoteActionCompatParcelizer = 1;
    private static int INotificationSideChannel = 0;
    private static int INotificationSideChannelStub = 1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final TuitionPaymentFragmentbindingInflater1 a = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 asInterface = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~i4;
        int i10 = (~(i9 | i6)) | i8;
        int i11 = ~i2;
        int i12 = i11 | i6;
        int i13 = i10 | (~i12);
        int i14 = i7 | i4;
        int i15 = i8 | (~i14);
        int i16 = (~(i2 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i4));
        int i17 = i6 + i4 + i + ((-1254723898) * i5) + ((-1667789834) * i3);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i6) + 1379663872 + ((-481802647) * i4) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i) + ((-1033371648) * i5) + ((-106430464) * i3) + (1552875520 * i18);
        int i20 = ((i6 * (-402395399)) - 1316031342) + (i4 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i * (-402393527)) + (i5 * (-1219896714)) + (i3 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        if (i21 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i21 != 2) {
            return i21 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 214 - r8
            byte[] r0 = com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity.$$a
            int r7 = r7 + 84
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r4 = r2
            r7 = r6
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r8]
        L23:
            int r7 = r7 + r3
            int r8 = r8 + 1
            int r7 = r7 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity.$$d
            int r8 = r8 + 4
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r6 = r7
            r3 = r8
            r4 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L26:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            int r6 = r6 + (-3)
            r8 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity.f(short, short, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ CameraDevice TuitionPaymentFragmentbindingInflater1(KtpCameraActivity ktpCameraActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 5;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        CameraDevice cameraDevice = ktpCameraActivity.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            return cameraDevice;
        }
        throw null;
    }

    public static final /* synthetic */ CameraCaptureSession TuitionPaymentFragmentspecialinlinedviewModeldefault1(KtpCameraActivity ktpCameraActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 111;
        INotificationSideChannelStub = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureSession cameraCaptureSession = ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i2 + 25;
        INotificationSideChannelStub = i5 % 128;
        if (i5 % 2 != 0) {
            return cameraCaptureSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        KtpCameraActivity ktpCameraActivity = (KtpCameraActivity) objArr[0];
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 119;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraCaptureSession;
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KtpCameraActivity ktpCameraActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 9;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity ktpCameraActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 17;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        Handler handler = ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 107;
        INotificationSideChannel = i5 % 128;
        if (i5 % 2 == 0) {
            return handler;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity ktpCameraActivity, int i, int i2) throws Throwable {
        String str;
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i3 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
            int i4 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            c(b, b2, (short) (b2 | 210), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, deadChar, i4, -887667012, false, (String) objArr3[0], null);
        }
        ActivityKtpCameraBinding activityKtpCameraBinding = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{9470, 31758, 40955, 129}, (char) ((-1) - TextUtils.lastIndexOf("", '0')), Process.myTid() >> 22, new char[]{41897, 30734, 55352, 46093, 24157, 8999, 40281, 55459, 43773, 60183, 62413, 2832, 39418, 38261, 60406, 3631, 54698, 34726, 15727, 369, 11172, 45146}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{20838, 58411, 52462, 4674}, (char) (17100 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-287036590) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{9880, 4575, 4822, 13105, 45866, 47852, 16933, 262, 53208, 13802, 16554, 22449, 29154, 13063, 165}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            str = "";
            int iLastIndexOf = 2266 - TextUtils.lastIndexOf(str, '0');
            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 33;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr6 = new Object[1];
            c(b3, b4, (short) (b4 | 158), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iLastIndexOf, deadChar2, -874156483, false, (String) objArr6[0], null);
        } else {
            str = "";
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i5 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i6 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
                byte[] bArr = $$a;
                byte b5 = (byte) (bArr[33] - 1);
                byte b6 = bArr[7];
                Object[] objArr7 = new Object[1];
                c(b5, b6, (short) (b6 | 106), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, i5, i6, -654680577, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[]{i ^ (i << 5)}, new int[]{i}};
            int i7 = ((int[]) objArr8[0])[0];
            int i8 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[1];
            int i9 = ~i;
            int i10 = 1819891910 + (((~(8329459 | i9)) | (-817042776)) * (-983)) + (((~(i9 | (-817042776))) | 3346515) * 983) + 287002853;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            c = 3;
        } else {
            Context baseContext = ktpCameraActivity.getBaseContext();
            if (baseContext == null) {
                int i13 = INotificationSideChannel + 77;
                INotificationSideChannelStub = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr9 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{51619, 14734, 3132, 57863}, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 1804), View.combineMeasuredStates(0, 0), new char[]{62067, 13482, 29412, 26001, 28293, 37133, 22297, 15904, 16944, 2249, 60550, 30941, 48729, 18113, 650, 51572, 61260, 13710, 52115, 28095, 28640, 27091, 18006, 41342, 5268, 53079}, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{55761, 26809, 22472, 60657}, (char) (61783 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-1) - TextUtils.lastIndexOf(str, '0', 0, 0), new char[]{20863, 52502, 24991, 59704, 40561, 42913, 62885, 16161, 61240, 44251, 51846, 27882, 4254, 6970, 42546, 314, 5816, 37562}, objArr10);
                baseContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {baseContext, Integer.valueOf(i), 0, 287002853};
                byte[] bArr2 = $$d;
                Object[] objArr12 = new Object[1];
                f(bArr2[49], bArr2[277], bArr2[74], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                f(bArr2[36], (byte) (-bArr2[92]), bArr2[277], objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                if (baseContext != null) {
                    int i15 = INotificationSideChannelStub + 101;
                    INotificationSideChannel = i15 % 128;
                    int i16 = i15 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iBlue = 2267 - Color.blue(0);
                        int iAxisFromString = MotionEvent.axisFromString(str) + 34;
                        byte[] bArr3 = $$a;
                        byte b7 = (byte) (bArr3[33] - 1);
                        byte b8 = bArr3[7];
                        Object[] objArr14 = new Object[1];
                        c(b7, b8, (short) (b8 | 106), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, iBlue, iAxisFromString, -654680577, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr15 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{9470, 31758, 40955, 129}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.getMaxKeyCode() >> 16, new char[]{41897, 30734, 55352, 46093, 24157, 8999, 40281, 55459, 43773, 60183, 62413, 2832, 39418, 38261, 60406, 3631, 54698, 34726, 15727, 369, 11172, 45146}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{20838, 58411, 52462, 4674}, (char) (TextUtils.lastIndexOf(str, '0', 0, 0) + 17101), ExpandableListView.getPackedPositionChild(0L) - 287036590, new char[]{9880, 4575, 4822, 13105, 45866, 47852, 16933, 262, 53208, 13802, 16554, 22449, 29154, 13063, 165}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString(str) + 1);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
                            int iIndexOf = TextUtils.indexOf((CharSequence) str, '0') + 34;
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr17 = new Object[1];
                            c(b9, b10, (short) (b10 | 158), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, longPressTimeout, iIndexOf, -874156483, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iRed = 2267 - Color.red(0);
                            int i17 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr18 = new Object[1];
                            c(b11, b12, (short) (b12 | 210), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, iRed, i17, -887667012, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i18 = ((int[]) objArr[c])[0];
        int i19 = ((int[]) objArr[0])[0];
        if (i19 == i18) {
            objArr2 = new Object[]{new int[]{i}, strArr, new int[]{i ^ (i << 5)}, new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            int i22 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i23 = i20 + (((1353380065 + (((-277101825) | (~i)) * (-490))) + (((~((-447627073) | i)) | 170525248) * 490)) - 838600424);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            c2 = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i26 = INotificationSideChannel + 101;
                INotificationSideChannelStub = i26 % 128;
                int i27 = 2;
                int i28 = i26 % 2;
                int i29 = 0;
                while (i29 < strArr3.length) {
                    int i30 = INotificationSideChannel + 125;
                    INotificationSideChannelStub = i30 % 128;
                    int i31 = i30 % i27;
                    arrayList.add(strArr3[i29]);
                    i29++;
                    i27 = 2;
                }
            }
            int[] iArr = new int[i19];
            int i32 = i19 - 1;
            iArr[i32] = 1;
            Toast.makeText((Context) null, iArr[((i19 * i32) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[0])[0];
            int i35 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i36 = i33 + (((2119493254 + (((-167888931) | iFreeMemory) * (-381))) + (((~((~iFreeMemory) | 366621761)) | (-260308068)) * 381)) - 458827110);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            c2 = 2;
            ((int[]) objArr2[2])[0] = i38 ^ (i38 << 5);
        }
        Size size = ktpCameraActivity.g;
        if (size != null) {
            Matrix matrix = new Matrix();
            float f = i;
            float f2 = i2;
            int i39 = ((int[]) objArr2[c2])[0];
            int i40 = i39 * i39;
            int i41 = -(644695823 * i39);
            int i42 = (((i40 & i41) + (i40 | i41)) - (~(-(i39 * 525250851)))) - 1;
            int i43 = (i42 ^ (-546620815)) + (((-546620815) & i42) << 1);
            int i44 = (((i43 >> 28) - 31) / 16) + 1;
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            int i46 = ((i43 >> 20) - 8191) / 4096;
            int i47 = -(i45 ^ ((i46 ^ 1) + ((i46 & 1) << 1)));
            int i48 = (i47 & 4) + (i47 | 4);
            int i49 = i48 >> 15;
            int i50 = ((((-262143) | i49) << 1) - (i49 ^ (-262143))) / 131072;
            int i51 = (i50 & 1) + (i50 | 1);
            RectF rectF = new RectF((1624767112 / (((-((i51 & 1) + (i51 | 1))) & i48) * 2)) - 203095889, 0.0f, f, f2);
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getHeight(), size.getWidth());
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fMax = Math.max(f / rectF2.width(), f2 / rectF2.height());
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            ActivityKtpCameraBinding activityKtpCameraBinding2 = ktpCameraActivity.b;
            if (activityKtpCameraBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
            } else {
                activityKtpCameraBinding = activityKtpCameraBinding2;
            }
            activityKtpCameraBinding.cameraPreview.setTransform(matrix);
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity ktpCameraActivity, CameraDevice cameraDevice) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 39;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        ktpCameraActivity.TuitionPaymentFragmentbindingInflater1 = cameraDevice;
        int i5 = i3 + 5;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void b(KtpCameraActivity ktpCameraActivity) {
        ImageReader imageReader;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 1;
        int i3 = i2 % 128;
        INotificationSideChannelStub = i3;
        int i4 = i2 % 2;
        try {
            ActivityKtpCameraBinding activityKtpCameraBinding = ktpCameraActivity.b;
            Object obj = null;
            if (activityKtpCameraBinding == null) {
                int i5 = i3 + 121;
                INotificationSideChannel = i5 % 128;
                if (i5 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding = null;
            }
            SurfaceTexture surfaceTexture = activityKtpCameraBinding.cameraPreview.getSurfaceTexture();
            if (surfaceTexture != null) {
                int i6 = INotificationSideChannel;
                int i7 = i6 + 99;
                INotificationSideChannelStub = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraDevice cameraDevice = ktpCameraActivity.TuitionPaymentFragmentbindingInflater1;
                    obj.hashCode();
                    throw null;
                }
                CameraDevice cameraDevice2 = ktpCameraActivity.TuitionPaymentFragmentbindingInflater1;
                if (cameraDevice2 != null && (imageReader = ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
                    int i8 = i6 + 117;
                    int i9 = i8 % 128;
                    INotificationSideChannelStub = i9;
                    int i10 = i8 % 2;
                    Size size = ktpCameraActivity.g;
                    if (size != null) {
                        int i11 = i9 + 3;
                        INotificationSideChannel = i11 % 128;
                        if (i11 % 2 != 0) {
                            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                            obj.hashCode();
                            throw null;
                        }
                        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    }
                    Surface surface = new Surface(surfaceTexture);
                    CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice2.createCaptureRequest(1);
                    Intrinsics.checkNotNullExpressionValue(builderCreateCaptureRequest, "");
                    builderCreateCaptureRequest.addTarget(surface);
                    cameraDevice2.createCaptureSession(CollectionsKt.listOf((Object[]) new Surface[]{surface, imageReader.getSurface()}), ktpCameraActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3(builderCreateCaptureRequest), ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    return;
                }
            }
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
            return;
        }
        int i12 = INotificationSideChannel + 55;
        INotificationSideChannelStub = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/salariedworker/KtpCameraActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent TuitionPaymentFragmentbindingInflater1(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new Intent(p0, (Class<?>) KtpCameraActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements TextureView.SurfaceTextureListener {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws Throwable {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity.this, i, i2);
            KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(KtpCameraActivity.this);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) throws Throwable {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity.this, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends CameraDevice.StateCallback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            Intrinsics.checkNotNullParameter(cameraDevice, "");
            KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity.this, cameraDevice);
            KtpCameraActivity.b(KtpCameraActivity.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            Intrinsics.checkNotNullParameter(cameraDevice, "");
            CameraDevice cameraDeviceTuitionPaymentFragmentbindingInflater1 = KtpCameraActivity.TuitionPaymentFragmentbindingInflater1(KtpCameraActivity.this);
            if (cameraDeviceTuitionPaymentFragmentbindingInflater1 != null) {
                cameraDeviceTuitionPaymentFragmentbindingInflater1.close();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            Intrinsics.checkNotNullParameter(cameraDevice, "");
            CameraDevice cameraDeviceTuitionPaymentFragmentbindingInflater1 = KtpCameraActivity.TuitionPaymentFragmentbindingInflater1(KtpCameraActivity.this);
            if (cameraDeviceTuitionPaymentFragmentbindingInflater1 != null) {
                cameraDeviceTuitionPaymentFragmentbindingInflater1.close();
            }
            KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity.this, (CameraDevice) null);
            KtpCameraActivity.this.finish();
        }
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
            int i4 = $10 + 29;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getTapTimeout() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1235, View.MeasureSpec.makeMeasureSpec(0, 0) + 35, -653973969, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), 2764 - Gravity.getAbsoluteGravity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, 1504416861, false, $$g(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 43325), 253 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22 - (Process.myTid() >> 22), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - View.resolveSizeAndState(0, 0, 0)), Color.rgb(0, 0, 0) + 16780107, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16, 2012627446, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (cancelAll ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) cancel) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) notify) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 113;
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

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends CameraCaptureSession.StateCallback {
        private /* synthetic */ CaptureRequest.Builder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(CaptureRequest.Builder builder) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = builder;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Intrinsics.checkNotNullParameter(cameraCaptureSession, "");
            if (KtpCameraActivity.TuitionPaymentFragmentbindingInflater1(KtpCameraActivity.this) != null) {
                Object[] objArr = {KtpCameraActivity.this, cameraCaptureSession};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, -971192636, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 971192637);
                try {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    CameraCaptureSession cameraCaptureSessionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(KtpCameraActivity.this);
                    if (cameraCaptureSessionTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                        cameraCaptureSessionTuitionPaymentFragmentspecialinlinedviewModeldefault1.setRepeatingRequest(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.build(), null, KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity.this));
                    }
                } catch (CameraAccessException e2) {
                    e2.printStackTrace();
                } catch (IllegalStateException e3) {
                    e3.printStackTrace();
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Intrinsics.checkNotNullParameter(cameraCaptureSession, "");
            if (KtpCameraActivity.this.isFinishing() || KtpCameraActivity.this.isDestroyed()) {
                return;
            }
            KtpCameraActivity ktpCameraActivity = KtpCameraActivity.this;
            Toast.makeText(ktpCameraActivity, ktpCameraActivity.getString(R.string.message_failed_proceed_photo), 0).show();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        String str;
        Object[] objArr3;
        Object[] objArr4;
        int i;
        String str2;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        int i2;
        Object[] objArr9;
        Object[] objArr10;
        char c;
        int i3;
        String str3;
        Object[] objArr11;
        char c2;
        Object[] objArr12;
        char c3;
        char c4;
        String str4;
        Object[] objArr13;
        Object[] objArr14;
        char c5;
        char c6;
        Object[] objArr15;
        final KtpCameraActivity ktpCameraActivity = (KtpCameraActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i4 = 2 % 2;
        int i5 = INotificationSideChannelStub + 123;
        INotificationSideChannel = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{9470, 31758, 40955, 129}, (char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getSize(0), new char[]{41897, 30734, 55352, 46093, 24157, 8999, 40281, 55459, 43773, 60183, 62413, 2832, 39418, 38261, 60406, 3631, 54698, 34726, 15727, 369, 11172, 45146}, objArr16);
        String str5 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{20838, 58411, 52462, 4674}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step3).substring(0, 1).codePointAt(0) + 17033), (-287036590) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{9880, 4575, 4822, 13105, 45866, 47852, 16933, 262, 53208, 13802, 16554, 22449, 29154, 13063, 165}, objArr17);
        String str6 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{64359, 40079, 55206, 35156}, (char) (21719 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{31791, 1464, 57238, 39028, 40124, 58866, 8709, 30150, 13185, 56381, 36540, 59990, 51161, 61285, 17759, 1946}, objArr18);
        String str7 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{62128, 31805, 8807, 63916}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.xl_tunai_payment_instruction).substring(12, 13).length() + 44065), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_app).substring(13, 16).codePointAt(1) - 97, new char[]{52680, 36278, 29488, 37130, 41420, 47824, 56934, 16524, 31185, 32296, 45258, 45003, 28591, 58561, 39182, 44332}, objArr19);
        String str8 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{51619, 14734, 3132, 57863}, (char) (1805 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 115, new char[]{62067, 13482, 29412, 26001, 28293, 37133, 22297, 15904, 16944, 2249, 60550, 30941, 48729, 18113, 650, 51572, 61260, 13710, 52115, 28095, 28640, 27091, 18006, 41342, 5268, 53079}, objArr20);
        String str9 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{55761, 26809, 22472, 60657}, (char) (61783 - TextUtils.indexOf("", "", 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 112, new char[]{20863, 52502, 24991, 59704, 40561, 42913, 62885, 16161, 61240, 44251, 51846, 27882, 4254, 6970, 42546, 314, 5816, 37562}, objArr21);
        String str10 = (String) objArr21[0];
        int i7 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iNextInt = new Random().nextInt();
        int i8 = ~((-269518341) | iNextInt);
        int i9 = ~iNextInt;
        if (i7 != (-1745625752) + (((~(i9 | 2080237535)) | i8) * 920) + ((269518340 | (~((-980731653) | i9))) * 920) + (((~((-269518341) | i9)) | (~((-711213313) | iNextInt)) | (~(iNextInt | 2080237535))) * 920)) {
            int i10 = 932993494 % 2;
            throw new ArithmeticException();
        }
        int i11 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        if (i11 != ((((~((-992253662) | startElapsedRealtime)) | 555749504) * (-566)) - 694304676) + ((~(startElapsedRealtime | (-436504158))) * 566)) {
            throw new RuntimeException("-1951866031");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int keyRepeatDelay = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b = $$a[7];
            byte b2 = b;
            Object[] objArr22 = new Object[1];
            c(b, b2, (short) (b2 | 210), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, keyRepeatDelay, scrollBarSize, -887667012, false, (String) objArr22[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c7 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 34;
                byte[] bArr = $$a;
                byte b3 = (byte) (bArr[33] - 1);
                byte b4 = bArr[7];
                Object[] objArr23 = new Object[1];
                c(b3, b4, (short) (b4 | 106), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c7, iResolveSizeAndState, iIndexOf, -654680577, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr24[0])[0];
            int i13 = ((int[]) objArr24[3])[0];
            String[] strArr = (String[]) objArr24[1];
            int iNextInt2 = new Random().nextInt();
            int i14 = ~iNextInt2;
            int i15 = (((24239931 + (((~(635647072 | i14)) | 168871939) * 184)) + ((iNextInt2 | 631452768) * (-184))) + ((~((-173066244) | i14)) * 184)) - 1988129557;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr2[2])[0] = i17 ^ (i17 << 5);
            str6 = str6;
            str5 = str5;
        } else {
            Context baseContext = ktpCameraActivity.getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str9).getMethod(str10, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue();
            int i18 = INotificationSideChannelStub + 45;
            INotificationSideChannel = i18 % 128;
            int i19 = i18 % 2;
            try {
                Object[] objArr25 = {baseContext, Integer.valueOf(iIntValue), 0, -1988129557};
                byte[] bArr2 = $$d;
                Object[] objArr26 = new Object[1];
                f((byte) (-bArr2[238]), bArr2[74], bArr2[160], objArr26);
                Class<?> cls = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                f(bArr2[36], bArr2[250], bArr2[160], objArr27);
                Object[] objArr28 = (Object[]) cls.getMethod((String) objArr27[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr25);
                if (baseContext != null) {
                    int i20 = INotificationSideChannel + 11;
                    INotificationSideChannelStub = i20 % 128;
                    int i21 = i20 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
                        int i22 = 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b5 = (byte) (bArr3[33] - 1);
                        byte b6 = bArr3[7];
                        Object[] objArr29 = new Object[1];
                        c(b5, b6, (short) (b6 | 106), objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iNormalizeMetaState, i22, -654680577, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr28);
                    try {
                        long jLongValue = ((Long) Class.forName(str5).getDeclaredMethod(str6, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2268;
                            int i23 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr30 = new Object[1];
                            c(b7, b8, (short) (b8 | 158), objArr30);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, packedPositionChild, i23, -874156483, false, (String) objArr30[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                            int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 33;
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr31 = new Object[1];
                            c(b9, b10, (short) (b10 | 210), objArr31);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iLastIndexOf, packedPositionGroup, -887667012, false, (String) objArr31[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str6 = str6;
                    str5 = str5;
                    objArr28 = objArr28;
                }
                objArr2 = objArr28;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i24 = ((int[]) objArr2[3])[0];
        int i25 = ((int[]) objArr2[0])[0];
        if (i25 == i24) {
            Object[] objArr32 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr2[2])[0];
            int i27 = ((int[]) objArr2[0])[0];
            int i28 = ((int[]) objArr2[3])[0];
            String[] strArr2 = (String[]) objArr2[1];
            int iMyPid = Process.myPid();
            int i29 = ~iMyPid;
            int i30 = i26 + (-1015135913) + (((~(iMyPid | 575670523)) | (~((-4194409) | i29)) | (-804518908)) * (-68)) + ((~((-228848385) | i29)) * (-68)) + (((~((-575670524) | i29)) | (-233042793)) * 68);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr32[2])[0] = i32 ^ (i32 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr2[1];
            if (strArr3 != null) {
                for (String str11 : strArr3) {
                    arrayList.add(str11);
                }
            }
            int[] iArr = new int[i25];
            int i33 = i25 - 1;
            iArr[i33] = 1;
            Toast.makeText((Context) null, iArr[((i25 * i33) % 2) - 1], 1).show();
            Object[] objArr33 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i34 = ((int[]) objArr2[2])[0];
            int i35 = ((int[]) objArr2[0])[0];
            int i36 = ((int[]) objArr2[3])[0];
            String[] strArr4 = (String[]) objArr2[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i37 = ~iUptimeMillis;
            int i38 = i34 + (((~(i37 | 729668542)) | (~((-79044774) | i37)) | 75636737) * (-397)) + 246101265 + ((iUptimeMillis | 801897243) * 397);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr33[2])[0] = i40 ^ (i40 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c8 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
            int i41 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
            byte b11 = (byte) ($$b & 188);
            byte[] bArr4 = $$a;
            Object[] objArr34 = new Object[1];
            c(b11, (byte) (bArr4[205] + 1), bArr4[8], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c8, iCombineMeasuredStates, i41, -1048449946, false, (String) objArr34[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c9 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                int iArgb = 28 - Color.argb(0, 0, 0, 0);
                byte[] bArr5 = $$a;
                byte b12 = (byte) (bArr5[33] - 1);
                byte b13 = bArr5[7];
                Object[] objArr35 = new Object[1];
                c(b12, b13, (short) (b13 | 106), objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c9, absoluteGravity, iArgb, -1142834547, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr36[1])[0]}, (Object[]) objArr36[2], new int[]{((int[]) objArr36[3])[0]}, (String[]) objArr36[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i42 = ~iMaxMemory;
            int i43 = (~((-766187536) | i42)) | 27789315;
            int i44 = ~(iMaxMemory | (-269493889));
            int i45 = (((1237410934 + ((i43 | i44) * (-713))) + (i44 * 1426)) + ((~((-1007892109) | i42)) * 713)) - 1582407289;
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr3[0])[0] = i47 ^ (i47 << 5);
            str10 = str10;
            str = str6;
        } else {
            Context baseContext2 = ktpCameraActivity.getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str9).getMethod(str10, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr37 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue()), r2, -1582407289};
            byte[] bArr6 = $$d;
            Object[] objArr38 = new Object[1];
            f(bArr6[99], bArr6[16], (short) 100, objArr38);
            Class<?> cls2 = Class.forName((String) objArr38[0]);
            Object[] objArr39 = new Object[1];
            f(bArr6[36], (byte) (-bArr6[92]), bArr6[277], objArr39);
            Object[] objArr40 = (Object[]) cls2.getMethod((String) objArr39[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatTimeout = (char) (31533 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                byte[] bArr7 = $$a;
                byte b14 = (byte) (bArr7[33] - 1);
                byte b15 = bArr7[7];
                Object[] objArr41 = new Object[1];
                c(b14, b15, (short) (b15 | 106), objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout, touchSlop, bitsPerPixel, -1142834547, false, (String) objArr41[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr40);
            try {
                str = str6;
                long jLongValue2 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c10 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31534);
                    int iArgb2 = 921 - Color.argb(0, 0, 0, 0);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                    byte b16 = $$a[7];
                    byte b17 = b16;
                    Object[] objArr42 = new Object[1];
                    c(b16, b17, (short) (b17 | 210), objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c10, iArgb2, iResolveOpacity, -778300370, false, (String) objArr42[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                    int iMyTid = (Process.myTid() >> 22) + 921;
                    int iNormalizeMetaState2 = 28 - KeyEvent.normalizeMetaState(0);
                    byte b18 = (byte) ($$b & 188);
                    byte[] bArr8 = $$a;
                    Object[] objArr43 = new Object[1];
                    c(b18, (byte) (bArr8[205] + 1), bArr8[8], objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatTimeout2, iMyTid, iNormalizeMetaState2, -1048449946, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf4);
                objArr3 = objArr40;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i48 = ((int[]) objArr3[1])[0];
        int i49 = ((int[]) objArr3[3])[0];
        if (i49 == i48) {
            int i50 = ((int[]) objArr3[0])[0];
            Object[] objArr44 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i51 = ~iFreeMemory;
            int i52 = i50 + (-1110984714) + (((~((-761021328) | i51)) | 1013058316) * (-602)) + (((~(iFreeMemory | (-761021328))) | 742392588 | (~(1031687055 | i51))) * (-301)) + ((~(i51 | 1013058316)) * 301);
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr44[0])[0] = i54 ^ (i54 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[4];
            if (strArr5 != null) {
                int i55 = INotificationSideChannelStub + 89;
                INotificationSideChannel = i55 % 128;
                int i56 = i55 % 2;
                for (String str12 : strArr5) {
                    arrayList2.add(str12);
                }
            }
            int[] iArr2 = new int[i49];
            int i57 = i49 - 1;
            iArr2[i57] = 1;
            Toast.makeText((Context) null, iArr2[((i49 * i57) % 2) - 1], 1).show();
            int i58 = ((int[]) objArr3[0])[0];
            Object[] objArr45 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i59 = i58 + ((((~((-19538971) | iUptimeMillis2)) | 278136961) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1332673724) + ((~((~iUptimeMillis2) | (-19538971))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr45[0])[0] = i61 ^ (i61 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (46400 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 39 - TextUtils.indexOf((CharSequence) "", '0'), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 46401), 40 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(obj, null);
            super.onCreate(bundle);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int maxKeyCode = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                int i62 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                byte[] bArr9 = $$a;
                Object[] objArr46 = new Object[1];
                c((byte) 42, bArr9[205], bArr9[8], objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cCombineMeasuredStates, maxKeyCode, i62, -1199417970, false, (String) objArr46[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null);
            long jLongValue3 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c11 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int gidForName = 875 - Process.getGidForName("");
                int iGreen = 10 - Color.green(0);
                byte b19 = (byte) ($$b & 188);
                byte[] bArr10 = $$a;
                Object[] objArr47 = new Object[1];
                c(b19, bArr10[33], bArr10[41], objArr47);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c11, gidForName, iGreen, 254769921, false, (String) objArr47[0], null);
            }
            if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c12 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                    int iRgb = Color.rgb(0, 0, 0) + 16777226;
                    byte[] bArr11 = $$a;
                    Object[] objArr48 = new Object[1];
                    c(bArr11[44], bArr11[205], bArr11[41], objArr48);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c12, packedPositionType, iRgb, 1324201839, false, (String) objArr48[0], null);
                }
                Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null);
                objArr4 = new Object[]{new int[]{((int[]) objArr49[0])[0]}, new int[1], new int[]{((int[]) objArr49[2])[0]}, (String[]) objArr49[3]};
                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                int i63 = ~startElapsedRealtime2;
                int i64 = (((1854270488 + (((~(782196228 | i63)) | 822506457) * (-90))) + (((~(782196228 | startElapsedRealtime2)) | 244911108) * (-45))) + ((((~(startElapsedRealtime2 | (-822506458))) | 782196228) | (~(i63 | 822506457))) * 45)) - 1930803480;
                int i65 = (i64 << 13) ^ i64;
                int i66 = i65 ^ (i65 >>> 17);
                ((int[]) objArr4[1])[0] = i66 ^ (i66 << 5);
            } else {
                Object[] objArr50 = {Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue()), -1930803480};
                byte[] bArr12 = $$d;
                Object[] objArr51 = new Object[1];
                f((byte) (bArr12[9] - 1), bArr12[124], (short) 109, objArr51);
                Class<?> cls3 = Class.forName((String) objArr51[0]);
                Object[] objArr52 = new Object[1];
                f(bArr12[36], (byte) (-bArr12[92]), bArr12[277], objArr52);
                objArr4 = (Object[]) cls3.getMethod((String) objArr52[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr50);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                    int mode = View.MeasureSpec.getMode(0) + 10;
                    byte[] bArr13 = $$a;
                    Object[] objArr53 = new Object[1];
                    c(bArr13[44], bArr13[205], bArr13[41], objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(size, threadPriority, mode, 1324201839, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, objArr4);
                try {
                    long jLongValue4 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iNormalizeMetaState3 = 876 - KeyEvent.normalizeMetaState(0);
                        int iRed = Color.red(0) + 10;
                        byte b20 = (byte) ($$b & 188);
                        byte[] bArr14 = $$a;
                        Object[] objArr54 = new Object[1];
                        c(b20, bArr14[33], bArr14[41], objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cKeyCodeFromString, iNormalizeMetaState3, iRed, 254769921, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c13 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 876;
                        int iMyTid2 = (Process.myTid() >> 22) + 10;
                        byte[] bArr15 = $$a;
                        Object[] objArr55 = new Object[1];
                        c((byte) 42, bArr15[205], bArr15[8], objArr55);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c13, offsetAfter2, iMyTid2, -1199417970, false, (String) objArr55[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            int i67 = ((int[]) objArr4[2])[0];
            int i68 = ((int[]) objArr4[0])[0];
            if (i68 == i67) {
                int i69 = ((int[]) objArr4[1])[0];
                Object[] objArr56 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i70 = ~iElapsedRealtime;
                int i71 = i69 + 1461683252 + (((~((-135822085) | i70)) | 134748672 | (~(95511855 | i70))) * (-1136)) + (((~((-135822085) | iElapsedRealtime)) | (~(95511855 | iElapsedRealtime)) | (~((-94438444) | i70))) * (-568)) + (((~(iElapsedRealtime | (-134748673))) | (~(i70 | (-95511856))) | (~(135822084 | i70))) * 568);
                int i72 = (i71 << 13) ^ i71;
                int i73 = i72 ^ (i72 >>> 17);
                i = 0;
                ((int[]) objArr56[1])[0] = i73 ^ (i73 << 5);
            } else {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr6 = (String[]) objArr4[3];
                if (strArr6 != null) {
                    for (String str13 : strArr6) {
                        arrayList3.add(str13);
                    }
                }
                Toast.makeText((Context) null, i68 / (((i68 - 1) * i68) % 2), 0).show();
                int i74 = ((int[]) objArr4[1])[0];
                Object[] objArr57 = {new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i75 = 1153572500 + (((~((-888371453) | iElapsedRealtime2)) | 74651864 | (~(848061223 | iElapsedRealtime2))) * (-880));
                int i76 = (~((-888371453) | (~iElapsedRealtime2))) | (-848061224);
                int i77 = ~(iElapsedRealtime2 | 888371452);
                int i78 = i74 + i75 + ((i76 | i77) * (-880)) + (i77 * 880);
                int i79 = i78 ^ (i78 << 13);
                int i80 = i79 ^ (i79 >>> 17);
                i = 0;
                ((int[]) objArr57[1])[0] = i80 ^ (i80 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cAlpha = (char) Color.alpha(i);
                int i81 = (TypedValue.complexToFraction(i, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int iAlpha = Color.alpha(i) + 10;
                byte b21 = (byte) ($$b & 188);
                byte[] bArr16 = $$a;
                Object[] objArr58 = new Object[1];
                c(b21, (byte) (bArr16[205] + 1), bArr16[8], objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cAlpha, i81, iAlpha, 252381699, false, (String) objArr58[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null);
            long jLongValue5 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char gidForName2 = (char) (Process.getGidForName("") + 1);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                int maxKeyCode2 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b22 = $$a[7];
                byte b23 = b22;
                Object[] objArr59 = new Object[1];
                c(b22, b23, (short) (b23 | 69), objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(gidForName2, iIndexOf2, maxKeyCode2, 2009631821, false, (String) objArr59[0], null);
            }
            if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                    int iIndexOf3 = TextUtils.indexOf("", "") + 10;
                    byte b24 = (byte) ($$b & 188);
                    byte[] bArr17 = $$a;
                    Object[] objArr60 = new Object[1];
                    c(b24, bArr17[54], bArr17[7], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cResolveOpacity, scrollBarFadeDuration, iIndexOf3, 256017550, false, (String) objArr60[0], null);
                }
                Object[] objArr61 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr61[0])[0]}, new int[1], new int[]{((int[]) objArr61[2])[0]}, (String[]) objArr61[3]};
                int i82 = ~(Process.myPid() | 999334472);
                int i83 = ((((-45690428) | i82) * (-658)) - 2052015532) + ((i82 | (-1002024572)) * 658) + 1848866507;
                int i84 = (i83 << 13) ^ i83;
                int i85 = i84 ^ (i84 >>> 17);
                ((int[]) objArr5[1])[0] = i85 ^ (i85 << 5);
                str2 = str10;
            } else {
                Context baseContext3 = ktpCameraActivity.getBaseContext();
                if (baseContext3 == null) {
                    str2 = str10;
                    baseContext3 = (Context) Class.forName(str9).getMethod(str2, new Class[0]).invoke(null, null);
                } else {
                    str2 = str10;
                }
                if (baseContext3 != null) {
                    baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
                }
                Object[] objArr62 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue()), 1848866507};
                byte[] bArr18 = $$d;
                Object[] objArr63 = new Object[1];
                f(bArr18[106], bArr18[359], (short) 138, objArr63);
                Class<?> cls4 = Class.forName((String) objArr63[0]);
                Object[] objArr64 = new Object[1];
                f(bArr18[36], (byte) (-bArr18[92]), bArr18[277], objArr64);
                Object[] objArr65 = (Object[]) cls4.getMethod((String) objArr64[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr62);
                if (baseContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char c14 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int i86 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int longPressTimeout = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b25 = (byte) ($$b & 188);
                        byte[] bArr19 = $$a;
                        Object[] objArr66 = new Object[1];
                        c(b25, bArr19[54], bArr19[7], objArr66);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c14, i86, longPressTimeout, 256017550, false, (String) objArr66[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, objArr65);
                    try {
                        long jLongValue6 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                            char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                            int iIndexOf4 = TextUtils.indexOf("", "", 0) + 876;
                            int i87 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte b26 = $$a[7];
                            byte b27 = b26;
                            Object[] objArr67 = new Object[1];
                            c(b26, b27, (short) (b27 | 69), objArr67);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(packedPositionChild2, iIndexOf4, i87, 2009631821, false, (String) objArr67[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int i88 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                            byte b28 = (byte) ($$b & 188);
                            byte[] bArr20 = $$a;
                            Object[] objArr68 = new Object[1];
                            c(b28, (byte) (bArr20[205] + 1), bArr20[8], objArr68);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(mirror, i88, deadChar, 252381699, false, (String) objArr68[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf8);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr65 = objArr65;
                }
                objArr5 = objArr65;
            }
            int i89 = ((int[]) objArr5[2])[0];
            int i90 = ((int[]) objArr5[0])[0];
            if (i90 == i89) {
                int i91 = ((int[]) objArr5[1])[0];
                Object[] objArr69 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                int iMyTid3 = Process.myTid();
                int i92 = i91 + 937875632 + (((~(500849312 | iMyTid3)) | 496634496) * (-502)) + ((~((~iMyTid3) | 1037794037)) * (-502)) + (((~(iMyTid3 | (-541159542))) | 500849312) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i93 = (i92 << 13) ^ i92;
                int i94 = i93 ^ (i93 >>> 17);
                ((int[]) objArr69[1])[0] = i94 ^ (i94 << 5);
            } else {
                Toast.makeText((Context) null, i90 / (((i90 - 1) * i90) % 2), 0).show();
                int i95 = ((int[]) objArr5[1])[0];
                Object[] objArr70 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                int iNextInt3 = new Random().nextInt(1556624490);
                int i96 = ~iNextInt3;
                int i97 = i95 + 1858126516 + (((~(398510731 | i96)) | 136781920) * 168) + ((~((-136781921) | iNextInt3)) * 168) + (((~(iNextInt3 | 535292651)) | (~(i96 | (-438820961))) | 302039040) * 168);
                int i98 = i97 ^ (i97 << 13);
                int i99 = i98 ^ (i98 >>> 17);
                ((int[]) objArr70[1])[0] = i99 ^ (i99 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int i100 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iNormalizeMetaState4 = 15 - KeyEvent.normalizeMetaState(0);
                byte b29 = $$a[7];
                byte b30 = b29;
                Object[] objArr71 = new Object[1];
                c(b29, b30, (short) (b30 | 158), objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf, i100, iNormalizeMetaState4, 1357589585, false, (String) objArr71[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null);
            long jLongValue7 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int fadingEdgeLength = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int tapTimeout = 15 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b31 = $$a[7];
                byte b32 = b31;
                Object[] objArr72 = new Object[1];
                c(b31, b32, (short) (b32 | 210), objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(modifierMetaStateMask, fadingEdgeLength, tapTimeout, 1344079056, false, (String) objArr72[0], null);
            }
            if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) << 52) >>> 52)) >> 12)) {
                int i101 = INotificationSideChannelStub + 41;
                INotificationSideChannel = i101 % 128;
                int i102 = i101 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    byte b33 = (byte) ($$b & 188);
                    byte[] bArr21 = $$a;
                    Object[] objArr73 = new Object[1];
                    c(b33, (byte) (bArr21[205] + 1), bArr21[8], objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(capsMode, maximumFlingVelocity, minimumFlingVelocity2, 632103528, false, (String) objArr73[0], null);
                }
                Object[] objArr74 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
                objArr6 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i103 = ((int[]) objArr74[3])[0];
                int i104 = ((int[]) objArr74[1])[0];
                String[] strArr7 = (String[]) objArr74[0];
                int iMyTid4 = Process.myTid();
                int i105 = ~iMyTid4;
                int i106 = ((((-767179315) + ((((~(685966764 | i105)) | (-930246935)) | (~((-685966765) | iMyTid4))) * (-564))) + ((~(iMyTid4 | (-543293701))) * 1128)) + (((~((-930246935) | i105)) | 142673064) * 564)) - 1493529794;
                int i107 = (i106 << 13) ^ i106;
                int i108 = i107 ^ (i107 >>> 17);
                ((int[]) objArr6[2])[0] = i108 ^ (i108 << 5);
            } else {
                int iIntValue2 = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue();
                Object[] objArr75 = {-307102513};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b((char) ((-16731178) - Color.rgb(0, 0, 0)), 1134 - View.resolveSizeAndState(0, 0, 0), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr76 = {Integer.valueOf(iIntValue2), r2, -1493529794, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).newInstance(objArr75), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int offsetAfter3 = 1031 - TextUtils.getOffsetAfter("", 0);
                    int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                    byte b34 = $$a[7];
                    byte b35 = b34;
                    Object[] objArr77 = new Object[1];
                    c(b34, b35, (short) (b35 | 158), objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(maximumFlingVelocity2, offsetAfter3, iIndexOf5, 1298546779, false, (String) objArr77[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (KeyEvent.getMaxKeyCode() >> 16)), 1117 - View.combineMeasuredStates(0, 0), KeyEvent.normalizeMetaState(0) + 17), Boolean.TYPE});
                }
                objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).invoke(null, objArr76);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int bitsPerPixel2 = 14 - ImageFormat.getBitsPerPixel(0);
                    byte b36 = (byte) ($$b & 188);
                    byte[] bArr22 = $$a;
                    Object[] objArr78 = new Object[1];
                    c(b36, (byte) (bArr22[205] + 1), bArr22[8], objArr78);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cRgb, maximumFlingVelocity3, bitsPerPixel2, 632103528, false, (String) objArr78[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, objArr6);
                try {
                    long jLongValue8 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char size2 = (char) View.MeasureSpec.getSize(0);
                        int offsetAfter4 = 1031 - TextUtils.getOffsetAfter("", 0);
                        int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                        byte b37 = $$a[7];
                        byte b38 = b37;
                        Object[] objArr79 = new Object[1];
                        c(b37, b38, (short) (b38 | 210), objArr79);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(size2, offsetAfter4, iIndexOf6, 1344079056, false, (String) objArr79[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char c15 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                        int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                        int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 16;
                        byte b39 = $$a[7];
                        byte b40 = b39;
                        Object[] objArr80 = new Object[1];
                        c(b39, b40, (short) (b40 | 158), objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c15, iIndexOf7, bitsPerPixel3, 1357589585, false, (String) objArr80[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
            int i109 = ((int[]) objArr6[1])[0];
            int i110 = ((int[]) objArr6[3])[0];
            if (i110 == i109) {
                Object[] objArr81 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i111 = ((int[]) objArr6[2])[0];
                int i112 = ((int[]) objArr6[3])[0];
                int i113 = ((int[]) objArr6[1])[0];
                String[] strArr8 = (String[]) objArr6[0];
                int i114 = ~Process.myTid();
                int i115 = i111 + 92342789 + ((~((-40932617) | i114)) * 52) + (((~(495280883 | i114)) | (~(251000713 | i114)) | (-536213500)) * (-52)) + (((~(i114 | (-495280884))) | 210068097) * 52);
                int i116 = (i115 << 13) ^ i115;
                int i117 = i116 ^ (i116 >>> 17);
                ((int[]) objArr81[2])[0] = i117 ^ (i117 << 5);
            } else {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr9 = (String[]) objArr6[0];
                if (strArr9 != null) {
                    int i118 = INotificationSideChannel + 23;
                    INotificationSideChannelStub = i118 % 128;
                    int i119 = i118 % 2;
                    for (String str14 : strArr9) {
                        arrayList4.add(str14);
                    }
                }
                int[] iArr3 = new int[i110];
                int i120 = i110 - 1;
                iArr3[i120] = 1;
                Toast.makeText((Context) null, iArr3[((i110 * i120) % 2) - 1], 1).show();
                Object[] objArr82 = {strArr, new int[]{i}, new int[1], new int[]{i}};
                int i121 = ((int[]) objArr6[2])[0];
                int i122 = ((int[]) objArr6[3])[0];
                int i123 = ((int[]) objArr6[1])[0];
                String[] strArr10 = (String[]) objArr6[0];
                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                int i124 = ~iFreeMemory2;
                int i125 = i121 + (-1983075958) + (((~((-488839473) | i124)) | (-244559303)) * 519) + (((~(i124 | (-201525505))) | (~((-43033799) | iFreeMemory2))) * (-519)) + (((~(iFreeMemory2 | (-244559303))) | 488839472) * 519);
                int i126 = (i125 << 13) ^ i125;
                int i127 = i126 ^ (i126 >>> 17);
                ((int[]) objArr82[2])[0] = i127 ^ (i127 << 5);
            }
            ActivityKtpCameraBinding activityKtpCameraBindingInflate = ActivityKtpCameraBinding.inflate(ktpCameraActivity.getLayoutInflater());
            ktpCameraActivity.b = activityKtpCameraBindingInflate;
            if (activityKtpCameraBindingInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBindingInflate = null;
            }
            ktpCameraActivity.setContentView(activityKtpCameraBindingInflate.getRoot());
            ActivityKtpCameraBinding activityKtpCameraBinding = ktpCameraActivity.b;
            if (activityKtpCameraBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding = null;
            }
            activityKtpCameraBinding.btnCapture.setOnClickListener(new View.OnClickListener() { // from class: setAlwaysUseBrowserUI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KtpCameraActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            ActivityKtpCameraBinding activityKtpCameraBinding2 = ktpCameraActivity.b;
            if (activityKtpCameraBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding2 = null;
            }
            activityKtpCameraBinding2.btnClose.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsIntentActivityHeightResizeBehavior
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
            ActivityKtpCameraBinding activityKtpCameraBinding3 = ktpCameraActivity.b;
            if (activityKtpCameraBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding3 = null;
            }
            activityKtpCameraBinding3.btnRetake.setOnClickListener(new View.OnClickListener() { // from class: launchUrl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, view);
                }
            });
            ActivityKtpCameraBinding activityKtpCameraBinding4 = ktpCameraActivity.b;
            if (activityKtpCameraBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding4 = null;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char tapTimeout2 = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                int i128 = 3112 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                byte b41 = $$a[7];
                byte b42 = b41;
                Object[] objArr83 = new Object[1];
                c(b41, b42, (short) (b42 | 158), objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(tapTimeout2, i128, tapTimeout3, -1272852037, false, (String) objArr83[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char cRed = (char) (Color.red(0) + 43042);
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 3111;
                    int defaultSize = 22 - View.getDefaultSize(0, 0);
                    byte[] bArr23 = $$a;
                    byte b43 = (byte) (bArr23[33] - 1);
                    byte b44 = bArr23[7];
                    Object[] objArr84 = new Object[1];
                    c(b43, b44, (short) (b44 | 106), objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cRed, packedPositionGroup2, defaultSize, 154975793, false, (String) objArr84[0], null);
                }
                Object[] objArr85 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
                int i129 = ((int[]) objArr85[2])[0];
                int i130 = ((int[]) objArr85[1])[0];
                String[] strArr11 = (String[]) objArr85[3];
                int[] iArr4 = {i130};
                int i131 = ~(new Random().nextInt() | 971599221);
                int i132 = ((((273163344 | i131) * (-196)) - 44006386) + ((i131 | 698435877) * 196)) - 715645869;
                int i133 = (i132 << 13) ^ i132;
                int i134 = i133 ^ (i133 >>> 17);
                ((int[]) objArr7[0])[0] = i134 ^ (i134 << 5);
                objArr7 = new Object[]{new int[1], iArr4, new int[]{i129}, strArr11};
            } else {
                Object[] objArr86 = {null, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue()), r2, -715645869};
                byte[] bArr24 = $$d;
                Object[] objArr87 = new Object[1];
                f(bArr24[74], bArr24[28], (short) ($$e | 144), objArr87);
                Class<?> cls5 = Class.forName((String) objArr87[0]);
                byte b45 = bArr24[13];
                byte b46 = bArr24[74];
                Object[] objArr88 = new Object[1];
                f(b45, b46, (short) (b46 | 258), objArr88);
                Object[] objArr89 = (Object[]) cls5.getMethod((String) objArr88[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr86);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char c16 = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int size3 = View.MeasureSpec.getSize(0) + 3111;
                    int touchSlop2 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr25 = $$a;
                    byte b47 = (byte) (bArr25[33] - 1);
                    byte b48 = bArr25[7];
                    Object[] objArr90 = new Object[1];
                    c(b47, b48, (short) (b48 | 106), objArr90);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c16, size3, touchSlop2, 154975793, false, (String) objArr90[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr89);
                try {
                    long jLongValue9 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char tapTimeout4 = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                        int defaultSize2 = 3111 - View.getDefaultSize(0, 0);
                        int i135 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b49 = $$a[7];
                        byte b50 = b49;
                        Object[] objArr91 = new Object[1];
                        c(b49, b50, (short) (b50 | 210), objArr91);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(tapTimeout4, defaultSize2, i135, -1269618118, false, (String) objArr91[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char c17 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int edgeSlop = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 23;
                        byte b51 = $$a[7];
                        byte b52 = b51;
                        Object[] objArr92 = new Object[1];
                        c(b51, b52, (short) (b52 | 158), objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c17, edgeSlop, iLastIndexOf2, -1272852037, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                    objArr7 = objArr89;
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr7[2])[0] != ((int[]) objArr7[1])[0]) {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr12 = (String[]) objArr7[3];
                if (strArr12 != null) {
                    for (String str15 : strArr12) {
                        arrayList5.add(str15);
                    }
                }
                throw null;
            }
            int i136 = ((int[]) objArr7[0])[0];
            int i137 = ((int[]) objArr7[2])[0];
            int i138 = ((int[]) objArr7[1])[0];
            String[] strArr13 = (String[]) objArr7[3];
            int[] iArr5 = {i138};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i139 = i136 + (-2094622906) + (((~((-297851177) | iMaxMemory2)) | (~((~iMaxMemory2) | 1407180282))) * (-318)) + (((~(297983290 | iMaxMemory2)) | 1109196992) * (-318)) + (((~(iMaxMemory2 | (-297983291))) | (-1407048169)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i140 = (i139 << 13) ^ i139;
            int i141 = i140 ^ (i140 >>> 17);
            Object obj2 = new Object[]{new int[1], iArr5, new int[]{i137}, strArr13}[0];
            ((int[]) obj2)[0] = i141 ^ (i141 << 5);
            ((Field) Futures4.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{286253060, 82602115, 672609491}, ((int[]) obj2)[0], Integer.MAX_VALUE) - (-1788302724));
            MaterialButton materialButton = activityKtpCameraBinding4.btnUsePhoto;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char c18 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i142 = 652 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0') + 45;
                byte b53 = $$a[7];
                byte b54 = b53;
                Object[] objArr93 = new Object[1];
                c(b53, b54, (short) (b54 | 69), objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(c18, i142, iIndexOf8, -459846511, false, (String) objArr93[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null);
            long jLongValue10 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char minimumFlingVelocity3 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iGreen2 = 651 - Color.green(0);
                int iAxisFromString = 43 - MotionEvent.axisFromString("");
                byte b55 = (byte) ($$b & 188);
                byte[] bArr26 = $$a;
                Object[] objArr94 = new Object[1];
                c(b55, (byte) (bArr26[205] + 1), bArr26[8], objArr94);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(minimumFlingVelocity3, iGreen2, iAxisFromString, -873460649, false, (String) objArr94[0], null);
            }
            if (j4 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int threadPriority2 = 651 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                    byte[] bArr27 = $$a;
                    byte b56 = (byte) (bArr27[33] - 1);
                    byte b57 = bArr27[7];
                    Object[] objArr95 = new Object[1];
                    c(b56, b57, (short) (b57 | 106), objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(scrollBarFadeDuration2, threadPriority2, packedPositionGroup3, -1595579076, false, (String) objArr95[0], null);
                }
                Object[] objArr96 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
                objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i143 = ((int[]) objArr96[2])[0];
                int i144 = ((int[]) objArr96[0])[0];
                int iMyUid = Process.myUid();
                int i145 = (-1786931064) + (((~((~iMyUid) | 19468873)) | (-25000940)) * (-245));
                int i146 = ~(iMyUid | 19468873);
                int i147 = i145 + (i146 * (-245)) + ((i146 | 22899683) * 245) + 489939337;
                int i148 = (i147 << 13) ^ i147;
                int i149 = i148 ^ (i148 >>> 17);
                ((int[]) objArr8[3])[0] = i149 ^ (i149 << 5);
                i2 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b((char) KeyEvent.normalizeMetaState(0), 1610 - View.MeasureSpec.getMode(0), TextUtils.getOffsetBefore("", 0) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr97 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).newInstance(null), 489939337, r2};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char c19 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651;
                    int iAlpha2 = 44 - Color.alpha(0);
                    byte b58 = (byte) ($$b & 188);
                    byte[] bArr28 = $$a;
                    Object[] objArr98 = new Object[1];
                    c(b58, (byte) (bArr28[205] + 1), bArr28[8], objArr98);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c19, keyRepeatDelay2, iAlpha2, 2075921419, false, (String) objArr98[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), Color.red(0) + 695, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 793 - Color.argb(0, 0, 0, 0), 83 - View.resolveSize(0, 0)), Integer.TYPE, Integer.TYPE});
                }
                objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).invoke(null, objArr97);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int pressedStateDuration2 = 651 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i150 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr29 = $$a;
                    byte b59 = (byte) (bArr29[33] - 1);
                    byte b60 = bArr29[7];
                    Object[] objArr99 = new Object[1];
                    c(b59, b60, (short) (b60 | 106), objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(pressedStateDuration, pressedStateDuration2, i150, -1595579076, false, (String) objArr99[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr8);
                try {
                    long jLongValue11 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char c20 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int trimmedLength = TextUtils.getTrimmedLength("") + 651;
                        int iGreen3 = Color.green(0) + 44;
                        byte b61 = (byte) ($$b & 188);
                        byte[] bArr30 = $$a;
                        Object[] objArr100 = new Object[1];
                        c(b61, (byte) (bArr30[205] + 1), bArr30[8], objArr100);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(c20, trimmedLength, iGreen3, -873460649, false, (String) objArr100[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char c21 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iGreen4 = 651 - Color.green(0);
                        int iResolveSize = View.resolveSize(0, 0) + 44;
                        byte b62 = $$a[7];
                        byte b63 = b62;
                        Object[] objArr101 = new Object[1];
                        c(b62, b63, (short) (b63 | 69), objArr101);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c21, iGreen4, iResolveSize, -459846511, false, (String) objArr101[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf14);
                    i2 = 0;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr8[2])[i2] != ((int[]) objArr8[i2])[i2]) {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr14 = (String[]) objArr8[1];
                if (strArr14 != null) {
                    for (int i151 = i2; i151 < strArr14.length; i151++) {
                        int i152 = INotificationSideChannelStub + 59;
                        INotificationSideChannel = i152 % 128;
                        int i153 = i152 % 2;
                        arrayList6.add(strArr14[i151]);
                    }
                }
                throw null;
            }
            int i154 = INotificationSideChannelStub + 7;
            INotificationSideChannel = i154 % 128;
            int i155 = i154 % 2;
            Object[] objArr102 = new Object[4];
            int[] iArr6 = new int[1];
            objArr102[i2] = iArr6;
            int[] iArr7 = new int[1];
            objArr102[2] = iArr7;
            objArr102[3] = new int[1];
            int i156 = ((int[]) objArr8[3])[i2];
            int i157 = ((int[]) objArr8[2])[i2];
            int i158 = ((int[]) objArr8[i2])[i2];
            iArr7[i2] = i157;
            iArr6[i2] = i158;
            objArr102[1] = new String[i2];
            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
            int i159 = i156 + 1818329828 + (((~((~iMaxMemory3) | 137366302)) | 130789504) * 529) + (((~(iMaxMemory3 | 137366302)) | 133935492) * 529);
            int i160 = (i159 << 13) ^ i159;
            int i161 = i160 ^ (i160 >>> 17);
            Object obj3 = objArr102[3];
            ((int[]) obj3)[0] = i161 ^ (i161 << 5);
            ((Field) FuturesExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{192118641, 1375678634, 1269944273}, ((int[]) obj3)[0], Integer.MAX_VALUE) - (-1929369560));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 24;
                byte[] bArr31 = $$a;
                byte b64 = (byte) (bArr31[33] - 1);
                byte b65 = bArr31[7];
                Object[] objArr103 = new Object[1];
                c(b64, b65, (short) (b65 | 106), objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(doubleTapTimeout, keyRepeatTimeout3, bitsPerPixel4, 986134021, false, (String) objArr103[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char longPressTimeout2 = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int i162 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1754;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    byte b66 = $$a[7];
                    byte b67 = b66;
                    Object[] objArr104 = new Object[1];
                    c(b66, b67, (short) (b67 | 210), objArr104);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(longPressTimeout2, i162, maximumDrawingCacheSize, 1599039318, false, (String) objArr104[0], null);
                }
                Object[] objArr105 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr9 = new Object[]{new int[]{((int[]) objArr105[0])[0]}, new int[]{((int[]) objArr105[1])[0]}, (Object[]) objArr105[2], new int[1], (String[]) objArr105[4]};
                int i163 = ~((~((int) Runtime.getRuntime().freeMemory())) | (-852243020));
                int i164 = ((((-1073509072) | i163) * (-970)) - 1588817423) + ((i163 | 221266052) * 970) + 648854978;
                int i165 = (i164 << 13) ^ i164;
                int i166 = i165 ^ (i165 >>> 17);
                ((int[]) objArr9[3])[0] = i166 ^ (i166 << 5);
            } else {
                int iIntValue3 = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue();
                Object[] objArr106 = {1132972284};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b((char) (42049 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1725 - MotionEvent.axisFromString(""), TextUtils.indexOf((CharSequence) "", '0') + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).newInstance(objArr106), 648854978, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int longPressTimeout3 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iAxisFromString2 = MotionEvent.axisFromString("") + 24;
                    byte b68 = $$a[7];
                    byte b69 = b68;
                    Object[] objArr107 = new Object[1];
                    c(b68, b69, (short) (b69 | 210), objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cIndexOf2, longPressTimeout3, iAxisFromString2, 1599039318, false, (String) objArr107[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    long jLongValue12 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char c22 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                        int maximumFlingVelocity4 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf9 = TextUtils.indexOf("", "", 0, 0) + 23;
                        byte b70 = $$a[7];
                        byte b71 = b70;
                        Object[] objArr108 = new Object[1];
                        c(b70, b71, (short) (b71 | 69), objArr108);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c22, maximumFlingVelocity4, iIndexOf9, 1596667560, false, (String) objArr108[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char absoluteGravity2 = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
                        int maxKeyCode3 = 1755 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 24;
                        byte[] bArr32 = $$a;
                        byte b72 = (byte) (bArr32[33] - 1);
                        byte b73 = bArr32[7];
                        Object[] objArr109 = new Object[1];
                        c(b72, b73, (short) (b73 | 106), objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(absoluteGravity2, maxKeyCode3, iLastIndexOf3, 986134021, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
                    objArr9 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            int i167 = ((int[]) objArr9[1])[0];
            int i168 = ((int[]) objArr9[0])[0];
            if (i168 == i167) {
                int i169 = ((int[]) objArr9[3])[0];
                objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[]{((int[]) objArr9[1])[0]}, (Object[]) objArr9[2], new int[1], (String[]) objArr9[4]};
                int i170 = (int) Runtime.getRuntime().totalMemory();
                int i171 = ~i170;
                int i172 = i169 + 1196185772 + (((~((-638325377) | i171)) | (~((-1165593) | i170)) | (~(1065213918 | i170))) * 765) + (((~((-639490969) | i171)) | 638325376) * 1530) + (((~(i170 | (-639490969))) | (~(i171 | 1065213918))) * 765);
                int i173 = (i172 << 13) ^ i172;
                int i174 = i173 ^ (i173 >>> 17);
                ((int[]) objArr10[3])[0] = i174 ^ (i174 << 5);
                c = 3;
                i3 = 0;
            } else {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr15 = (String[]) objArr9[4];
                if (strArr15 != null) {
                    for (String str16 : strArr15) {
                        arrayList7.add(str16);
                    }
                }
                Toast.makeText((Context) null, i168 / (((i168 - 1) * i168) % 2), 0).show();
                int i175 = ((int[]) objArr9[3])[0];
                objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[]{((int[]) objArr9[1])[0]}, (Object[]) objArr9[2], new int[1], (String[]) objArr9[4]};
                int iNextInt4 = new Random().nextInt();
                int i176 = ~iNextInt4;
                int i177 = i175 + 711695537 + (((~((-405768503) | i176)) | 271352066 | (~(193166076 | i176))) * (-1136)) + (((~((-405768503) | iNextInt4)) | (~(193166076 | iNextInt4)) | (~((-58749641) | i176))) * (-568)) + (((~(iNextInt4 | (-271352067))) | (~(i176 | (-193166077))) | (~(405768502 | i176))) * 568);
                int i178 = (i177 << 13) ^ i177;
                int i179 = i178 ^ (i178 >>> 17);
                c = 3;
                i3 = 0;
                ((int[]) objArr10[3])[0] = i179 ^ (i179 << 5);
            }
            ((Field) Futures1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{155730599, 1151835742, 1524303568}, ((int[]) objArr10[c])[i3], Integer.MAX_VALUE) + 1360282292);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cResolveSize = (char) (37567 - View.resolveSize(i3, i3));
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 14;
                byte b74 = (byte) ($$b & 188);
                byte[] bArr33 = $$a;
                Object[] objArr110 = new Object[1];
                c(b74, (byte) (bArr33[205] + 1), bArr33[8], objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cResolveSize, modifierMetaStateMask2, packedPositionType2, -477065106, false, (String) objArr110[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
            long jLongValue13 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char c23 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                int i180 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 625;
                int offsetAfter5 = 14 - TextUtils.getOffsetAfter("", 0);
                byte b75 = $$a[7];
                byte b76 = b75;
                Object[] objArr111 = new Object[1];
                c(b75, b76, (short) (b76 | 158), objArr111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c23, i180, offsetAfter5, -976899241, false, (String) objArr111[0], null);
            }
            if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char c24 = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 626;
                    int scrollBarSize2 = 14 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b77 = $$a[7];
                    byte b78 = b77;
                    Object[] objArr112 = new Object[1];
                    c(b77, b78, (short) (b78 | 210), objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c24, iLastIndexOf4, scrollBarSize2, -973632554, false, (String) objArr112[0], null);
                }
                Object[] objArr113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                int i181 = ((int[]) objArr113[2])[0];
                int i182 = ((int[]) objArr113[0])[0];
                String[] strArr16 = (String[]) objArr113[3];
                int[] iArr8 = {i181};
                int iNextInt5 = new Random().nextInt(28920271);
                int i183 = ~iNextInt5;
                int i184 = ((((-1479432764) + ((iNextInt5 | 9032388) * 988)) + (((~(43899861 | i183)) | 1744970786) * (-1976))) + ((((~(iNextInt5 | (-1779838260))) | 9032388) | (~(1779838259 | i183))) * 988)) - 289303230;
                int i185 = (i184 << 13) ^ i184;
                int i186 = i185 ^ (i185 >>> 17);
                ((int[]) objArr[1])[0] = i186 ^ (i186 << 5);
                Object[] objArr114 = {new int[]{i182}, new int[1], iArr8, strArr16};
                c2 = 0;
                objArr11 = objArr114;
                str3 = str2;
            } else {
                Context baseContext4 = ktpCameraActivity.getBaseContext();
                if (baseContext4 == null) {
                    baseContext4 = (Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null);
                }
                if (baseContext4 != null) {
                    str3 = str2;
                    if ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) {
                        str3 = str2;
                        baseContext4 = null;
                    } else {
                        str3 = str2;
                        str3 = str2;
                        baseContext4 = baseContext4.getApplicationContext();
                    }
                }
                str3 = str2;
                str3 = str2;
                int iIntValue4 = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue();
                Object[] objArr115 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{14804, 20806, 53031, 56622}, (char) (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{43607, 52261, 62937, 54123, 4041, 43333, 8677, 20446, 54687, 52264, 53547, 40498, 24226, 7836, 27507, 32687, 50863, 396, 43335, 39425, 12960, 52128, 24501, 19168, 13726, 59776, 14844, 43895, 50891, 45668, 64442, 37641, 32133, 31535, 31312, 3700, 39626, 16606, 13633, 10562, 55847, 15388, 17085, 36481, 6198, 22081, 55328, 4124, 18184, 55245, 8685, 58575, 48710, 60413, 34827, 63896, 13672, 9879, 783, 11493, 23070, 36939, 17596, 16270}, objArr115);
                String str17 = (String) objArr115[0];
                Object[] objArr116 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{9112, 47577, 5943, 63449}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{25957, 30545, 28649, 28822, 18931, 26965, 14721, 19501, 36832, 23708, 40910, 44363, 39061, 52538, 56569, 39582, 53177, 30515, 20060, 4926, 57380, 63517, 40784, 23188, 12074, 52008, 18098, 55575, 65257, 50166, 976, 47990, 59771, 42282, 53519, 2749, 39522, 39563, 36319, 16080, 32003, 18082, 4569, 12470, 21829, 6559, 31427, 50774, 29758, 17074, 62969, 28090, 18681, 37561, 50392, 11094, 42104, 32853, 7854, 17543, 57913, 14140, 21702, 30179}, objArr116);
                Object[] objArr117 = {baseContext4, new String[]{str17, (String) objArr116[0]}, Integer.valueOf(iIntValue4), 17, -289303230};
                byte[] bArr34 = $$d;
                byte b79 = bArr34[74];
                Object[] objArr118 = new Object[1];
                f(b79, (byte) (b79 | 107), (short) 258, objArr118);
                Class<?> cls6 = Class.forName((String) objArr118[0]);
                Object[] objArr119 = new Object[1];
                f(bArr34[36], bArr34[250], bArr34[160], objArr119);
                objArr11 = (Object[]) cls6.getMethod((String) objArr119[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr117);
                int i187 = ((int[]) objArr11[0])[0];
                int i188 = ((int[]) objArr11[2])[0];
                if (baseContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char threadPriority3 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 37567);
                        int iMyTid5 = 625 - (Process.myTid() >> 22);
                        int iArgb3 = 14 - Color.argb(0, 0, 0, 0);
                        byte b80 = $$a[7];
                        byte b81 = b80;
                        Object[] objArr120 = new Object[1];
                        c(b80, b81, (short) (b81 | 210), objArr120);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(threadPriority3, iMyTid5, iArgb3, -973632554, false, (String) objArr120[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr11);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                            char scrollBarSize3 = (char) (37567 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int iIndexOf10 = TextUtils.indexOf("", "", 0) + 625;
                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 14;
                            byte b82 = $$a[7];
                            byte b83 = b82;
                            Object[] objArr121 = new Object[1];
                            c(b82, b83, (short) (b83 | 158), objArr121);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(scrollBarSize3, iIndexOf10, trimmedLength2, -976899241, false, (String) objArr121[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                            char keyRepeatDelay3 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37567);
                            int iLastIndexOf5 = 624 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                            byte b84 = (byte) ($$b & 188);
                            byte[] bArr35 = $$a;
                            Object[] objArr122 = new Object[1];
                            c(b84, (byte) (bArr35[205] + 1), bArr35[8], objArr122);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(keyRepeatDelay3, iLastIndexOf5, threadPriority4, -477065106, false, (String) objArr122[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr11 = objArr11;
                }
                c2 = 0;
            }
            int i189 = ((int[]) objArr11[c2])[c2];
            int i190 = ((int[]) objArr11[2])[c2];
            if (i190 == i189) {
                objArr12 = new Object[4];
                int[] iArr9 = new int[1];
                objArr12[c2] = iArr9;
                objArr12[1] = new int[1];
                int[] iArr10 = new int[1];
                objArr12[2] = iArr10;
                int i191 = ((int[]) objArr11[1])[c2];
                int i192 = ((int[]) objArr11[2])[c2];
                int i193 = ((int[]) objArr11[c2])[c2];
                String[] strArr17 = (String[]) objArr11[3];
                iArr10[c2] = i192;
                iArr9[c2] = i193;
                int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                int i194 = ~iUptimeMillis3;
                int i195 = 398917544 + (((~((-282168870) | i194)) | 281020961 | (~((-1541569252) | i194)) | (~(1542717159 | iUptimeMillis3))) * (-84));
                int i196 = (~(iUptimeMillis3 | (-1541569252))) | 282168869;
                int i197 = ~(i194 | 1541569251);
                int i198 = i191 + i195 + ((i196 | i197) * (-84)) + (((-1542717160) | i197) * 84);
                int i199 = (i198 << 13) ^ i198;
                int i200 = i199 ^ (i199 >>> 17);
                ((int[]) objArr12[1])[0] = i200 ^ (i200 << 5);
                objArr12[3] = strArr17;
                c3 = 1;
                c4 = 0;
            } else {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr18 = (String[]) objArr11[3];
                if (strArr18 != null) {
                    for (String str18 : strArr18) {
                        arrayList8.add(str18);
                    }
                }
                Toast.makeText((Context) null, i190 / (((i190 - 1) * i190) % 2), 0).show();
                int i201 = ((int[]) objArr11[1])[0];
                int i202 = ((int[]) objArr11[2])[0];
                int i203 = ((int[]) objArr11[0])[0];
                String[] strArr19 = (String[]) objArr11[3];
                int[] iArr11 = {i202};
                int iMyTid6 = Process.myTid();
                int i204 = (~((-784997143) | iMyTid6)) | 751307026;
                int i205 = ~iMyTid6;
                int i206 = i201 + 209015292 + ((i204 | (~(1072431094 | i205))) * 886) + (((~(i205 | 784997142)) | 1038740978) * (-1772)) + ((~(i205 | 1038740978)) * 886);
                int i207 = i206 ^ (i206 << 13);
                int i208 = i207 ^ (i207 >>> 17);
                c3 = 1;
                c4 = 0;
                ((int[]) objArr12[1])[0] = i208 ^ (i208 << 5);
                objArr12 = new Object[]{new int[]{i203}, new int[1], iArr11, strArr19};
            }
            ((Field) propagate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c4]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1199021532, 1900166482, 57628734}, ((int[]) objArr12[c3])[c4], Integer.MAX_VALUE) - (-713712292));
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: CustomTabsIntentActivitySideSheetDecorationType
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr123 = {this.b, view};
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr123, 978555104, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -978555101);
                }
            });
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                int i209 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iRgb2 = Color.rgb(0, 0, 0) + 16777226;
                byte[] bArr36 = $$a;
                byte b85 = (byte) (bArr36[33] - 1);
                byte b86 = bArr36[7];
                Object[] objArr123 = new Object[1];
                c(b85, b86, (short) (b86 | 106), objArr123);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(packedPositionType3, i209, iRgb2, -1650998592, false, (String) objArr123[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null);
            long jLongValue15 = ((Long) Class.forName(str5).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char packedPositionType4 = (char) ExpandableListView.getPackedPositionType(0L);
                int packedPositionChild3 = 875 - ExpandableListView.getPackedPositionChild(0L);
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10;
                byte b87 = $$a[7];
                byte b88 = b87;
                Object[] objArr124 = new Object[1];
                c(b87, b88, (short) (b88 | 210), objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(packedPositionType4, packedPositionChild3, doubleTapTimeout2, 2012020043, false, (String) objArr124[0], null);
            }
            if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int iResolveSize2 = View.resolveSize(0, 0) + 876;
                    int i210 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                    byte b89 = $$a[7];
                    byte b90 = b89;
                    Object[] objArr125 = new Object[1];
                    c(b89, b90, (short) (b90 | 158), objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(modifierMetaStateMask3, iResolveSize2, i210, 2012931276, false, (String) objArr125[0], null);
                }
                Object[] objArr126 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
                objArr13 = new Object[]{new int[]{((int[]) objArr126[0])[0]}, new int[1], new int[]{((int[]) objArr126[2])[0]}, (String[]) objArr126[3]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i211 = (((1334900936 + (((~((-970798773) | startUptimeMillis)) | 943981696) * (-140))) + ((~((-26817077) | startUptimeMillis)) * 70)) + (((~(startUptimeMillis | 1011109001)) | (-93944382)) * 70)) - 630947428;
                int i212 = (i211 << 13) ^ i211;
                int i213 = i212 ^ (i212 >>> 17);
                ((int[]) objArr13[1])[0] = i213 ^ (i213 << 5);
                str4 = str;
            } else {
                Context baseContext5 = ktpCameraActivity.getBaseContext();
                if (baseContext5 == null) {
                    baseContext5 = (Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null);
                }
                if (baseContext5 != null) {
                    baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
                }
                Object[] objArr127 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue()), 0, -630947428};
                byte[] bArr37 = $$d;
                byte b91 = bArr37[106];
                byte b92 = bArr37[237];
                Object[] objArr128 = new Object[1];
                f(b91, b92, (short) (b92 | 352), objArr128);
                Class<?> cls7 = Class.forName((String) objArr128[0]);
                byte b93 = bArr37[13];
                byte b94 = bArr37[74];
                Object[] objArr129 = new Object[1];
                f(b93, b94, (short) (b94 | 258), objArr129);
                Object[] objArr130 = (Object[]) cls7.getMethod((String) objArr129[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr127);
                if (baseContext5 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char c25 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int minimumFlingVelocity4 = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int trimmedLength3 = 10 - TextUtils.getTrimmedLength("");
                        byte b95 = $$a[7];
                        byte b96 = b95;
                        Object[] objArr131 = new Object[1];
                        c(b95, b96, (short) (b96 | 158), objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c25, minimumFlingVelocity4, trimmedLength3, 2012931276, false, (String) objArr131[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr130);
                    try {
                        str4 = str;
                        long jLongValue16 = ((Long) Class.forName(str5).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                            char packedPositionType5 = (char) ExpandableListView.getPackedPositionType(0L);
                            int maxKeyCode4 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                            int iIndexOf11 = TextUtils.indexOf("", "", 0) + 10;
                            byte b97 = $$a[7];
                            byte b98 = b97;
                            Object[] objArr132 = new Object[1];
                            c(b97, b98, (short) (b98 | 210), objArr132);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(packedPositionType5, maxKeyCode4, iIndexOf11, 2012020043, false, (String) objArr132[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                            char cAlpha2 = (char) Color.alpha(0);
                            int size4 = View.MeasureSpec.getSize(0) + 876;
                            int gidForName3 = Process.getGidForName("") + 11;
                            byte[] bArr38 = $$a;
                            byte b99 = (byte) (bArr38[33] - 1);
                            byte b100 = bArr38[7];
                            Object[] objArr133 = new Object[1];
                            c(b99, b100, (short) (b100 | 106), objArr133);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cAlpha2, size4, gidForName3, -1650998592, false, (String) objArr133[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr130 = objArr130;
                    str4 = str;
                }
                objArr13 = objArr130;
            }
            int i214 = ((int[]) objArr13[2])[0];
            int i215 = ((int[]) objArr13[0])[0];
            if (i215 == i214) {
                int i216 = ((int[]) objArr13[1])[0];
                objArr14 = new Object[]{new int[]{((int[]) objArr13[0])[0]}, new int[1], new int[]{((int[]) objArr13[2])[0]}, (String[]) objArr13[3]};
                int i217 = (int) Runtime.getRuntime().totalMemory();
                int i218 = i216 + ((((-1703544620) + (((~(140984384 | i217)) | 42472981) * 576)) + (((~((~i217) | 183457365)) | 138821632) * 576)) - 1305366720);
                int i219 = (i218 << 13) ^ i218;
                int i220 = i219 ^ (i219 >>> 17);
                c5 = 1;
                c6 = 0;
                ((int[]) objArr14[1])[0] = i220 ^ (i220 << 5);
            } else {
                int[] iArr12 = new int[i215];
                int i221 = i215 - 1;
                iArr12[i221] = 1;
                Toast.makeText((Context) null, iArr12[((i215 * i221) % 2) - 1], 1).show();
                int i222 = ((int[]) objArr13[1])[0];
                objArr14 = new Object[]{new int[]{((int[]) objArr13[0])[0]}, new int[1], new int[]{((int[]) objArr13[2])[0]}, (String[]) objArr13[3]};
                int iMyPid2 = Process.myPid();
                int i223 = ~iMyPid2;
                int i224 = i222 + (-1156912172) + (((~((-513863766) | i223)) | 554173994) * 220) + (((~(i223 | (-513994838))) | 554305066) * (-440)) + ((iMyPid2 | (-513863766)) * 220);
                int i225 = (i224 << 13) ^ i224;
                int i226 = i225 ^ (i225 >>> 17);
                c5 = 1;
                c6 = 0;
                ((int[]) objArr14[1])[0] = i226 ^ (i226 << 5);
            }
            ((Field) nonCancellationPropagating.TuitionPaymentFragmentspecialinlinedviewModeldefault1[c6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2091623391, 1198111395, 1567518613}, ((int[]) objArr14[c5])[c6], Integer.MAX_VALUE));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char c26 = (char) (53894 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int i227 = 1320 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 36;
                byte b101 = (byte) ($$b & 188);
                byte[] bArr39 = $$a;
                Object[] objArr134 = new Object[1];
                c(b101, (byte) (bArr39[205] + 1), bArr39[8], objArr134);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(c26, i227, capsMode2, -1433084963, false, (String) objArr134[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char c27 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 53892);
                    int mode2 = 1320 - View.MeasureSpec.getMode(0);
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 36;
                    byte b102 = $$a[7];
                    byte b103 = b102;
                    Object[] objArr135 = new Object[1];
                    c(b102, b103, (short) (b103 | 210), objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c27, mode2, absoluteGravity3, -1920778747, false, (String) objArr135[0], null);
                }
                Object[] objArr136 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
                objArr15 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i228 = ((int[]) objArr136[0])[0];
                int i229 = ((int[]) objArr136[3])[0];
                String[] strArr20 = (String[]) objArr136[2];
                int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                int i230 = (-708204944) + ((~(iElapsedRealtime3 | 829632608)) * 216);
                int i231 = ~iElapsedRealtime3;
                int i232 = ((i230 + (((-839313) | i231) * (-216))) + (((~(i231 | 829632608)) | 540995216) * 216)) - 244239975;
                int i233 = (i232 << 13) ^ i232;
                int i234 = i233 ^ (i233 >>> 17);
                ((int[]) objArr15[1])[0] = i234 ^ (i234 << 5);
            } else {
                Context baseContext6 = ktpCameraActivity.getBaseContext();
                if (baseContext6 == null) {
                    baseContext6 = (Context) Class.forName(str9).getMethod(str3, new Class[0]).invoke(null, null);
                }
                if (baseContext6 != null) {
                    int i235 = INotificationSideChannel + 111;
                    INotificationSideChannelStub = i235 % 128;
                    int i236 = i235 % 2;
                    baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
                }
                int iIntValue5 = ((Integer) Class.forName(str7).getMethod(str8, Object.class).invoke(null, ktpCameraActivity)).intValue();
                Object[] objArr137 = {993228122};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47976), Color.rgb(0, 0, 0) + 16778516, 19 - ImageFormat.getBitsPerPixel(0), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr138 = {baseContext6, "com.bpjstku", -244239975, Integer.valueOf(iIntValue5), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).newInstance(objArr137), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char minimumFlingVelocity5 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 53893);
                    int offsetBefore = 1320 - TextUtils.getOffsetBefore("", 0);
                    int keyRepeatDelay4 = 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte b104 = $$a[7];
                    byte b105 = b104;
                    Object[] objArr139 = new Object[1];
                    c(b104, b105, (short) (b105 | 210), objArr139);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(minimumFlingVelocity5, offsetBefore, keyRepeatDelay4, 819724799, false, (String) objArr139[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.getDefaultSize(0, 0) + 57878), 1393 - MotionEvent.axisFromString(""), 75 - View.MeasureSpec.getMode(0)), Boolean.TYPE});
                }
                objArr15 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).invoke(null, objArr138);
                if (baseContext6 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                        char scrollBarFadeDuration3 = (char) (53893 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int mirror2 = AndroidCharacter.getMirror('0') + 1272;
                        int keyRepeatDelay5 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36;
                        byte b106 = $$a[7];
                        byte b107 = b106;
                        Object[] objArr140 = new Object[1];
                        c(b106, b107, (short) (b107 | 210), objArr140);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(scrollBarFadeDuration3, mirror2, keyRepeatDelay5, -1920778747, false, (String) objArr140[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr15);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str5).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                            char doubleTapTimeout3 = (char) (53893 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1320;
                            int i237 = 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr40 = $$a;
                            byte b108 = (byte) (bArr40[33] - 1);
                            byte b109 = bArr40[7];
                            Object[] objArr141 = new Object[1];
                            c(b108, b109, (short) (b109 | 106), objArr141);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(doubleTapTimeout3, edgeSlop2, i237, -1273706634, false, (String) objArr141[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                            char cNormalizeMetaState = (char) (53893 - KeyEvent.normalizeMetaState(0));
                            int i238 = 1320 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iIndexOf12 = 35 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte b110 = (byte) ($$b & 188);
                            byte[] bArr41 = $$a;
                            Object[] objArr142 = new Object[1];
                            c(b110, (byte) (bArr41[205] + 1), bArr41[8], objArr142);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(cNormalizeMetaState, i238, iIndexOf12, -1433084963, false, (String) objArr142[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
            }
            if (((int[]) objArr15[0])[0] != ((int[]) objArr15[3])[0]) {
                throw null;
            }
            Object[] objArr143 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i239 = ((int[]) objArr15[1])[0];
            int i240 = ((int[]) objArr15[0])[0];
            int i241 = ((int[]) objArr15[3])[0];
            String[] strArr21 = (String[]) objArr15[2];
            int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
            int i242 = ~((-1142997069) | iUptimeMillis4);
            int i243 = i239 + 1054951328 + ((167845504 | i242) * (-476)) + (i242 * 952) + ((~((~iUptimeMillis4) | (-1142997069))) * 476);
            int i244 = (i243 << 13) ^ i243;
            int i245 = i244 ^ (i244 >>> 17);
            Object obj4 = objArr143[1];
            ((int[]) obj4)[0] = i245 ^ (i245 << 5);
            int i246 = INotificationSideChannelStub + 69;
            INotificationSideChannel = i246 % 128;
            int i247 = i246 % 2;
            ((Field) lambdanonCancellationPropagating0.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{618604965, 38345459, 1890628679}, ((int[]) obj4)[0], Integer.MAX_VALUE) - (-416287290));
            return null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -671421366
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity.onResume():void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - TextUtils.getTrimmedLength(""), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 46400), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            CameraCaptureSession cameraCaptureSession = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (cameraCaptureSession != null) {
                int i2 = INotificationSideChannelStub + 67;
                INotificationSideChannel = i2 % 128;
                if (i2 % 2 != 0) {
                    cameraCaptureSession.close();
                    int i3 = 61 / 0;
                } else {
                    cameraCaptureSession.close();
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            CameraDevice cameraDevice = this.TuitionPaymentFragmentbindingInflater1;
            if (cameraDevice != null) {
                int i4 = INotificationSideChannel + 25;
                INotificationSideChannelStub = i4 % 128;
                if (i4 % 2 == 0) {
                    cameraDevice.close();
                    throw null;
                }
                cameraDevice.close();
            }
            this.TuitionPaymentFragmentbindingInflater1 = null;
            ImageReader imageReader = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (imageReader != null) {
                int i5 = INotificationSideChannel + 79;
                INotificationSideChannelStub = i5 % 128;
                int i6 = i5 % 2;
                imageReader.close();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            HandlerThread handlerThread = this.d;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            try {
                HandlerThread handlerThread2 = this.d;
                if (handlerThread2 != null) {
                    int i7 = INotificationSideChannel + 77;
                    INotificationSideChannelStub = i7 % 128;
                    int i8 = i7 % 2;
                    handlerThread2.join();
                }
                this.d = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            super.onPause();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        String str;
        int i = 2 % 2;
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            int i2 = INotificationSideChannel + 87;
            INotificationSideChannelStub = i2 % 128;
            if (i2 % 2 != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 200);
                return;
            }
            String[] strArr = new String[1];
            strArr[1] = "android.permission.CAMERA";
            ActivityCompat.requestPermissions(this, strArr, 32327);
            return;
        }
        Object systemService = getSystemService("camera");
        Intrinsics.checkNotNull(systemService, "");
        CameraManager cameraManager = (CameraManager) systemService;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
            String[] strArr2 = cameraIdList;
            int length = strArr2.length;
            int i3 = INotificationSideChannel + 71;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    str = null;
                    break;
                }
                int i6 = INotificationSideChannelStub + 77;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                str = strArr2[i5];
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    break;
                } else {
                    i5++;
                }
            }
            String str2 = str;
            if (str2 == null) {
                str2 = cameraManager.getCameraIdList()[0];
            }
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str2);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics2, "");
            Object obj = cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Intrinsics.checkNotNull(obj);
            Size[] outputSizes = ((StreamConfigurationMap) obj).getOutputSizes(SurfaceTexture.class);
            Intrinsics.checkNotNullExpressionValue(outputSizes, "");
            Size sizeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(outputSizes);
            this.g = sizeTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(sizeTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int width = sizeTuitionPaymentFragmentspecialinlinedviewModeldefault2.getWidth();
            Size size = this.g;
            Intrinsics.checkNotNull(size);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImageReader.newInstance(width, size.getHeight(), 256, 1);
            cameraManager.openCamera(str2, this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } catch (CameraAccessException e2) {
            e2.printStackTrace();
        }
    }

    private static Size TuitionPaymentFragmentspecialinlinedviewModeldefault2(Size[] p0) {
        Size size;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (Size size2 : p0) {
            if (size2.getWidth() >= 1920 && size2.getHeight() >= 1080) {
                arrayList.add(size2);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            final Function2 function2 = new Function2() { // from class: isBookmarksButtonEnabled
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(KtpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Size) obj, (Size) obj2));
                }
            };
            Object objMin = Collections.min(arrayList2, new Comparator() { // from class: isDownloadButtonEnabled
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return KtpCameraActivity.b(function2, obj, obj2);
                }
            });
            Intrinsics.checkNotNull(objMin);
            Size size3 = (Size) objMin;
            int i2 = INotificationSideChannel + 59;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            return size3;
        }
        if (p0.length != 0) {
            size = p0[0];
            int lastIndex = ArraysKt.getLastIndex(p0);
            if (lastIndex != 0) {
                long width = ((long) size.getWidth()) * ((long) size.getHeight());
                if (lastIndex > 0) {
                    int i4 = 1;
                    while (true) {
                        Size size4 = p0[i4];
                        long width2 = ((long) size4.getWidth()) * ((long) size4.getHeight());
                        if (width < width2) {
                            size = size4;
                            width = width2;
                        }
                        if (i4 == lastIndex) {
                            break;
                        }
                        int i5 = INotificationSideChannel + 111;
                        INotificationSideChannelStub = i5 % 128;
                        i4 = i5 % 2 == 0 ? i4 + 104 : i4 + 1;
                    }
                }
            }
        } else {
            int i6 = INotificationSideChannelStub + 73;
            INotificationSideChannel = i6 % 128;
            size = null;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
        if (size != null) {
            return size;
        }
        int i7 = INotificationSideChannelStub + 95;
        INotificationSideChannel = i7 % 128;
        return i7 % 2 != 0 ? p0[1] : p0[0];
    }

    private final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap p0) {
        int i = 2 % 2;
        try {
            ActivityKtpCameraBinding activityKtpCameraBinding = this.b;
            ActivityKtpCameraBinding activityKtpCameraBinding2 = null;
            if (activityKtpCameraBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding = null;
            }
            View view = activityKtpCameraBinding.ktpFrame;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ActivityKtpCameraBinding activityKtpCameraBinding3 = this.b;
            if (activityKtpCameraBinding3 == null) {
                int i2 = INotificationSideChannel + 19;
                INotificationSideChannelStub = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                activityKtpCameraBinding2 = activityKtpCameraBinding3;
            }
            TextureView textureView = activityKtpCameraBinding2.cameraPreview;
            Intrinsics.checkNotNullExpressionValue(textureView, "");
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            textureView.getLocationInWindow(iArr2);
            int i4 = iArr[0];
            int i5 = iArr2[0];
            int i6 = iArr[1];
            int i7 = iArr2[1];
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            if (width > 0) {
                int i8 = INotificationSideChannel + 33;
                int i9 = i8 % 128;
                INotificationSideChannelStub = i9;
                int i10 = i8 % 2;
                if (height > 0) {
                    int i11 = i9 + 105;
                    INotificationSideChannel = i11 % 128;
                    int i12 = i11 % 2;
                    int width2 = p0.getWidth();
                    int height2 = p0.getHeight();
                    float f = width2 / width;
                    float f2 = height2 / height;
                    int iCoerceIn = RangesKt.coerceIn((int) ((i4 - i5) * f), 0, width2 - 1);
                    int iCoerceIn2 = RangesKt.coerceIn((int) ((i6 - i7) * f2), 0, height2 - 1);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(p0, iCoerceIn, iCoerceIn2, RangesKt.coerceIn((int) (view.getWidth() * f), 1, width2 - iCoerceIn), RangesKt.coerceIn((int) (view.getHeight() * f2), 1, height2 - iCoerceIn2));
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                    return bitmapCreateBitmap;
                }
            }
            return p0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return p0;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        KtpCameraActivity ktpCameraActivity = (KtpCameraActivity) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i = 2 % 2;
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        File externalFilesDir = ktpCameraActivity.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        StringBuilder sb = new StringBuilder("KTP_");
        sb.append(str);
        sb.append(".jpg");
        File file = new File(externalFilesDir, sb.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            CloseableKt.closeFinally(fileOutputStream, null);
            int i2 = INotificationSideChannel + 73;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            return file;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        super.onRequestPermissionsResult(p0, p1, p2);
        if (p0 == 200) {
            int i2 = INotificationSideChannelStub + 49;
            int i3 = i2 % 128;
            INotificationSideChannel = i3;
            int i4 = i2 % 2;
            if (p2.length != 0) {
                int i5 = i3 + 89;
                INotificationSideChannelStub = i5 % 128;
                int i6 = i5 % 2;
                if (p2[0] == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    return;
                }
            }
            Toast.makeText(this, getString(R.string.message_camera_storage_permission_required), 0).show();
            finish();
        }
        int i7 = INotificationSideChannelStub + 17;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRed = (char) (Color.red(0) + 29944);
            int iBlue = Color.blue(0) + 1755;
            int iArgb = 23 - Color.argb(0, 0, 0, 0);
            byte[] bArr = $$a;
            byte b = (byte) (bArr[33] - 1);
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, b2, (short) (b2 | 106), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, iBlue, iArgb, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0', 0);
                int mode = View.MeasureSpec.getMode(0) + 23;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr3 = new Object[1];
                c(b3, b4, (short) (b4 | 210), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, iLastIndexOf, mode, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iMyTid = Process.myTid();
            int i2 = (((((~(iMyTid | 841515189)) | (-628912764)) * 56) + 479195537) + (((~((~iMyTid) | (-628912764))) | 841515189) * 56)) - 785589691;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i4 ^ (i4 << 5);
            int i5 = INotificationSideChannelStub + 63;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{64359, 40079, 55206, 35156}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 21612), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_akulaku).substring(18, 21).codePointAt(1) - 107, new char[]{31791, 1464, 57238, 39028, 40124, 58866, 8709, 30150, 13185, 56381, 36540, 59990, 51161, 61285, 17759, 1946}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{62128, 31805, 8807, 63916}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 43950), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{52680, 36278, 29488, 37130, 41420, 47824, 56934, 16524, 31185, 32296, 45258, 45003, 28591, 58561, 39182, 44332}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {858209563};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - (Process.myPid() >> 22)), 1725 - TextUtils.lastIndexOf("", '0', 0), 29 - View.MeasureSpec.getMode(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -785589691);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                    int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1754;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr8 = new Object[1];
                    c(b5, b6, (short) (b6 | 210), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i7, maxKeyCode, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{9470, 31758, 40955, 129}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_internal_detection_error_detected_image_is_null).substring(0, 24).codePointAt(20) - 114, new char[]{41897, 30734, 55352, 46093, 24157, 8999, 40281, 55459, 43773, 60183, 62413, 2832, 39418, 38261, 60406, 3631, 54698, 34726, 15727, 369, 11172, 45146}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{20838, 58411, 52462, 4674}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).length() + 17057), (-287036592) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{9880, 4575, 4822, 13105, 45866, 47852, 16933, 262, 53208, 13802, 16554, 22449, 29154, 13063, 165}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatTimeout = (char) (29944 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int iMyPid = 1755 - (Process.myPid() >> 22);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (short) (b8 | 69), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, iMyPid, iIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                        int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                        byte[] bArr2 = $$a;
                        byte b9 = (byte) (bArr2[33] - 1);
                        byte b10 = bArr2[7];
                        Object[] objArr12 = new Object[1];
                        c(b9, b10, (short) (b10 | 106), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, iMakeMeasureSpec, iCombineMeasuredStates, 986134021, false, (String) objArr12[0], null);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i9 != i8) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                int i10 = INotificationSideChannel + 65;
                INotificationSideChannelStub = i10 % 128;
                int i11 = i10 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i9));
        }
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int i13 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i14 = i12 + (((1332474231 + (((~i13) | 232534522) * 1444)) + (((~(i13 | (-278630886))) | ((~(491233311 | i13)) | 9966048)) * (-1444))) - 386201062);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        int i17 = INotificationSideChannel + 5;
        INotificationSideChannelStub = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iLastIndexOf2 = 14 - TextUtils.lastIndexOf("", '0', 0);
            byte b11 = $$a[7];
            byte b12 = b11;
            Object[] objArr14 = new Object[1];
            c(b11, b12, (short) (b12 | 158), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, maximumDrawingCacheSize, iLastIndexOf2, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{9470, 31758, 40955, 129}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_payment).substring(1, 3).codePointAt(0) - 97), ExpandableListView.getPackedPositionChild(0L) + 1, new char[]{41897, 30734, 55352, 46093, 24157, 8999, 40281, 55459, 43773, 60183, 62413, 2832, 39418, 38261, 60406, 3631, 54698, 34726, 15727, 369, 11172, 45146}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{20838, 58411, 52462, 4674}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1052).substring(0, 25).length() + 17075), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_left_eye_closed).substring(0, 14).codePointAt(3) - 287036688, new char[]{9880, 4575, 4822, 13105, 45866, 47852, 16933, 262, 53208, 13802, 16554, 22449, 29154, 13063, 165}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
            int mirror = '?' - AndroidCharacter.getMirror('0');
            byte b13 = $$a[7];
            byte b14 = b13;
            Object[] objArr17 = new Object[1];
            c(b13, b14, (short) (b14 | 210), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, tapTimeout, mirror, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char gidForName = (char) (Process.getGidForName("") + 1);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1032;
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 16;
                byte b15 = (byte) ($$b & 188);
                byte[] bArr3 = $$a;
                Object[] objArr18 = new Object[1];
                c(b15, (byte) (bArr3[205] + 1), bArr3[8], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(gidForName, iIndexOf2, bitsPerPixel2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i19 = ((int[]) objArr19[3])[0];
            int i20 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = (~((-1050500087) | iIdentityHashCode)) | 244321138;
            int i22 = (-659599367) + (i21 * 992) + ((i21 | (~((~iIdentityHashCode) | (-40969)))) * (-496)) + ((iIdentityHashCode | (-806219917)) * 496) + 2097771538;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[2])[0] = i24 ^ (i24 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{64359, 40079, 55206, 35156}, (char) (21719 - (ViewConfiguration.getEdgeSlop() >> 16)), View.MeasureSpec.getMode(0), new char[]{31791, 1464, 57238, 39028, 40124, 58866, 8709, 30150, 13185, 56381, 36540, 59990, 51161, 61285, 17759, 1946}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{62128, 31805, 8807, 63916}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 44055), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{52680, 36278, 29488, 37130, 41420, 47824, 56934, 16524, 31185, 32296, 45258, 45003, 28591, 58561, 39182, 44332}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {858209563};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46037), 1134 - (ViewConfiguration.getJumpTapTimeout() >> 16), 18 - ((Process.getThreadPriority(0) + 20) >> 6), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 2097771538, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0);
                int minimumFlingVelocity = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte b16 = $$a[7];
                byte b17 = b16;
                Object[] objArr24 = new Object[1];
                c(b16, b17, (short) (b17 | 158), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(capsMode, iIndexOf3, minimumFlingVelocity, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getMode(0) + 45993), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1117, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iMyTid2 = 1031 - (Process.myTid() >> 22);
                int iIndexOf4 = TextUtils.indexOf("", "", 0) + 15;
                byte b18 = (byte) ($$b & 188);
                byte[] bArr4 = $$a;
                Object[] objArr25 = new Object[1];
                c(b18, (byte) (bArr4[205] + 1), bArr4[8], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout2, iMyTid2, iIndexOf4, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{9470, 31758, 40955, 129}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.how_much_point).substring(27, 28).length() - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama6).substring(9, 10).length() - 1, new char[]{41897, 30734, 55352, 46093, 24157, 8999, 40281, 55459, 43773, 60183, 62413, 2832, 39418, 38261, 60406, 3631, 54698, 34726, 15727, 369, 11172, 45146}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{20838, 58411, 52462, 4674}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.how_much_point).substring(27, 28).codePointAt(0) + 17068), (-287036692) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_5).substring(1, 2).codePointAt(0), new char[]{9880, 4575, 4822, 13105, 45866, 47852, 16933, 262, 53208, 13802, 16554, 22449, 29154, 13063, 165}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int bitsPerPixel3 = 1030 - ImageFormat.getBitsPerPixel(0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 16;
                    byte b19 = $$a[7];
                    byte b20 = b19;
                    Object[] objArr28 = new Object[1];
                    c(b19, b20, (short) (b20 | 210), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSize, bitsPerPixel3, packedPositionChild, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                    int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                    byte b21 = $$a[7];
                    byte b22 = b21;
                    Object[] objArr29 = new Object[1];
                    c(b21, b22, (short) (b22 | 158), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(doubleTapTimeout, trimmedLength, absoluteGravity, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i25 = ((int[]) objArr[1])[0];
        int i26 = ((int[]) objArr[3])[0];
        if (i26 != i25) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i27 = INotificationSideChannelStub + 115;
                INotificationSideChannel = i27 % 128;
                for (int i28 = i27 % 2 == 0 ? 0 : 1; i28 < strArr3.length; i28++) {
                    arrayList2.add(strArr3[i28]);
                }
            }
            throw new RuntimeException(String.valueOf(i26));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i29 = ((int[]) objArr[2])[0];
        int i30 = ((int[]) objArr[3])[0];
        int i31 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i32 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation | (-717499582));
        int i33 = i29 + (((-1003994304) | i32) * (-196)) + 711501537 + ((i32 | 286494722) * 196);
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr30[2])[0] = i35 ^ (i35 << 5);
        int i36 = INotificationSideChannelStub + 33;
        INotificationSideChannel = i36 % 128;
        if (i36 % 2 != 0) {
            int i37 = 53 / 0;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -782960520
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.salariedworker.KtpCameraActivity.onStart():void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(KtpCameraActivity ktpCameraActivity, View view) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 1;
        INotificationSideChannelStub = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                ktpCameraActivity.finish();
                ViewPortBuilder.b();
                int i4 = 54 / 0;
            } else {
                ktpCameraActivity.finish();
                ViewPortBuilder.b();
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        KtpCameraActivity ktpCameraActivity = (KtpCameraActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 63;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Bitmap bitmap = ktpCameraActivity.asBinder;
            if (bitmap != null) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                File file = (File) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{ktpCameraActivity, bitmap}, 888950371, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 650501610, -888950369);
                Intent intent = new Intent();
                intent.putExtra("extra_photo_path", file.getAbsolutePath());
                ktpCameraActivity.setResult(-1, intent);
                ktpCameraActivity.finish();
                int i4 = INotificationSideChannelStub + 83;
                INotificationSideChannel = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 4;
                }
            }
            return null;
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(KtpCameraActivity ktpCameraActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            try {
                ActivityKtpCameraBinding activityKtpCameraBinding = ktpCameraActivity.b;
                ActivityKtpCameraBinding activityKtpCameraBinding2 = null;
                if (activityKtpCameraBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityKtpCameraBinding = null;
                }
                Bitmap bitmap = activityKtpCameraBinding.cameraPreview.getBitmap();
                if (bitmap != null) {
                    Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap);
                    ktpCameraActivity.asBinder = bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    ActivityKtpCameraBinding activityKtpCameraBinding3 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding3 == null) {
                        int i2 = INotificationSideChannel + 93;
                        INotificationSideChannelStub = i2 % 128;
                        int i3 = i2 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding3 = null;
                    }
                    activityKtpCameraBinding3.imgPreview.setImageBitmap(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    ActivityKtpCameraBinding activityKtpCameraBinding4 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding4 == null) {
                        int i4 = INotificationSideChannelStub + 85;
                        INotificationSideChannel = i4 % 128;
                        int i5 = i4 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding4 = null;
                    }
                    activityKtpCameraBinding4.imgPreview.setVisibility(0);
                    ActivityKtpCameraBinding activityKtpCameraBinding5 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding5 = null;
                    }
                    activityKtpCameraBinding5.cameraPreview.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding6 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding6 = null;
                    }
                    activityKtpCameraBinding6.overlayTop.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding7 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding7 = null;
                    }
                    activityKtpCameraBinding7.overlayBottom.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding8 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding8 = null;
                    }
                    activityKtpCameraBinding8.overlayLeft.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding9 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding9 = null;
                    }
                    activityKtpCameraBinding9.overlayRight.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding10 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding10 == null) {
                        int i6 = INotificationSideChannelStub + 19;
                        INotificationSideChannel = i6 % 128;
                        int i7 = i6 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding10 = null;
                    }
                    activityKtpCameraBinding10.ktpFrame.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding11 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding11 == null) {
                        int i8 = INotificationSideChannelStub + 35;
                        INotificationSideChannel = i8 % 128;
                        int i9 = i8 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding11 = null;
                    }
                    activityKtpCameraBinding11.tvTitle.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding12 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding12 = null;
                    }
                    activityKtpCameraBinding12.tvInstruction.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding13 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding13 = null;
                    }
                    activityKtpCameraBinding13.btnCapture.setVisibility(8);
                    ActivityKtpCameraBinding activityKtpCameraBinding14 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        activityKtpCameraBinding14 = null;
                    }
                    activityKtpCameraBinding14.btnRetake.setVisibility(0);
                    ActivityKtpCameraBinding activityKtpCameraBinding15 = ktpCameraActivity.b;
                    if (activityKtpCameraBinding15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        activityKtpCameraBinding2 = activityKtpCameraBinding15;
                    }
                    activityKtpCameraBinding2.btnUsePhoto.setVisibility(0);
                    int i10 = INotificationSideChannel + 15;
                    INotificationSideChannelStub = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 3 % 4;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(KtpCameraActivity ktpCameraActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        ActivityKtpCameraBinding activityKtpCameraBinding = null;
        try {
            ktpCameraActivity.asBinder = null;
            ActivityKtpCameraBinding activityKtpCameraBinding2 = ktpCameraActivity.b;
            if (activityKtpCameraBinding2 == null) {
                int i2 = INotificationSideChannel + 107;
                INotificationSideChannelStub = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i3 = 66 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                activityKtpCameraBinding2 = null;
            }
            activityKtpCameraBinding2.imgPreview.setVisibility(8);
            ActivityKtpCameraBinding activityKtpCameraBinding3 = ktpCameraActivity.b;
            if (activityKtpCameraBinding3 == null) {
                int i4 = INotificationSideChannelStub + 21;
                INotificationSideChannel = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding3 = null;
            }
            activityKtpCameraBinding3.cameraPreview.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding4 = ktpCameraActivity.b;
            if (activityKtpCameraBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding4 = null;
            }
            activityKtpCameraBinding4.overlayTop.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding5 = ktpCameraActivity.b;
            if (activityKtpCameraBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding5 = null;
            }
            activityKtpCameraBinding5.overlayBottom.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding6 = ktpCameraActivity.b;
            if (activityKtpCameraBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding6 = null;
            }
            activityKtpCameraBinding6.overlayLeft.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding7 = ktpCameraActivity.b;
            if (activityKtpCameraBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding7 = null;
            }
            activityKtpCameraBinding7.overlayRight.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding8 = ktpCameraActivity.b;
            if (activityKtpCameraBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding8 = null;
            }
            activityKtpCameraBinding8.ktpFrame.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding9 = ktpCameraActivity.b;
            if (activityKtpCameraBinding9 == null) {
                int i6 = INotificationSideChannelStub + 111;
                INotificationSideChannel = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = 81 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                activityKtpCameraBinding9 = null;
            }
            activityKtpCameraBinding9.tvTitle.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding10 = ktpCameraActivity.b;
            if (activityKtpCameraBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding10 = null;
            }
            activityKtpCameraBinding10.tvInstruction.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding11 = ktpCameraActivity.b;
            if (activityKtpCameraBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding11 = null;
            }
            activityKtpCameraBinding11.btnCapture.setVisibility(0);
            ActivityKtpCameraBinding activityKtpCameraBinding12 = ktpCameraActivity.b;
            if (activityKtpCameraBinding12 == null) {
                int i8 = INotificationSideChannel + 91;
                INotificationSideChannelStub = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding12 = null;
            }
            activityKtpCameraBinding12.btnRetake.setVisibility(8);
            ActivityKtpCameraBinding activityKtpCameraBinding13 = ktpCameraActivity.b;
            if (activityKtpCameraBinding13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding13 = null;
            }
            activityKtpCameraBinding13.btnUsePhoto.setVisibility(8);
            ActivityKtpCameraBinding activityKtpCameraBinding14 = ktpCameraActivity.b;
            if (activityKtpCameraBinding14 == null) {
                int i10 = INotificationSideChannel + 17;
                INotificationSideChannelStub = i10 % 128;
                int i11 = i10 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityKtpCameraBinding14 = null;
            }
            if (activityKtpCameraBinding14.cameraPreview.isAvailable()) {
                int i12 = INotificationSideChannel + 57;
                INotificationSideChannelStub = i12 % 128;
                if (i12 % 2 == 0) {
                    ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    throw null;
                }
                ktpCameraActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                ActivityKtpCameraBinding activityKtpCameraBinding15 = ktpCameraActivity.b;
                if (activityKtpCameraBinding15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    activityKtpCameraBinding = activityKtpCameraBinding15;
                }
                activityKtpCameraBinding.cameraPreview.setSurfaceTextureListener(ktpCameraActivity.a);
            }
            ViewPortBuilder.b();
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ int b(Function2 function2, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 59;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) function2.invoke(obj, obj2)).intValue();
            throw null;
        }
        int iIntValue = ((Number) function2.invoke(obj, obj2)).intValue();
        int i3 = INotificationSideChannelStub + 35;
        INotificationSideChannel = i3 % 128;
        int i4 = i3 % 2;
        return iIntValue;
    }

    public static /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Size size, Size size2) {
        long width;
        int i = 2 % 2;
        int i2 = INotificationSideChannelStub + 51;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            width = (((long) size.getWidth()) / ((long) size.getHeight())) / (((long) size2.getHeight()) ^ ((long) size2.getWidth()));
        } else {
            width = (((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight()));
        }
        return (int) width;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(KtpCameraActivity ktpCameraActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{ktpCameraActivity, view}, 978555104, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -978555101);
    }

    static {
        getInterfaceDescriptor = 0;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 11;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(KtpCameraActivity ktpCameraActivity, CameraCaptureSession cameraCaptureSession) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{ktpCameraActivity, cameraCaptureSession}, -971192636, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 971192637);
    }

    private final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap p0) {
        Object[] objArr = {this, p0};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (File) TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, 888950371, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 650501610, -888950369);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_hint_xl_order_id).substring(14, 15).codePointAt(0) - 1633443324;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(captureSingleRequest.b(), iCodePointAt, captureSingleRequest.b(), new Object[]{this, p0}, 380414126, ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -380414126);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        cancelAll = -6377398940819159759L;
        cancel = 1257176610;
        notify = (char) 34097;
    }

    private static String $$g(byte b, short s, short s2) {
        byte[] bArr = $$c;
        int i = s + 102;
        int i2 = b * 3;
        int i3 = (s2 * 3) + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i += i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i3];
            i3++;
            i += b2;
        }
    }
}
