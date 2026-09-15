package com.bpjstku.presentation.program.jht.olddaysecurity.evidence;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentCallbacks;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtItem;
import com.bpjstku.databinding.ActivityReceiptClaimOldDaySecurityBinding;
import com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.api.model.zzn;
import com.google.android.material.button.MaterialButton;
import com.google.mlkit.common.MlKitException;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraUseCaseAdapter;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.addTask;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.getCameraOperatingMode;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.getTextOn;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0015R\u0015\u0010\u0006\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\r\u001a\u00020\u001b8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/evidence/ReceiptClaimOldDaySecurityActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityReceiptClaimOldDaySecurityBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Z)V", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LacquireBuffer;", "Lkotlin/Lazy;", "LoutputFormatToAudioProfile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReceiptClaimOldDaySecurityActivity extends BindingBaseActivity<ActivityReceiptClaimOldDaySecurityBinding> {
    private static int asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private ClaimEvidenceJhtItem b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$f = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {70, -114, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 175;
    private static int g = 1;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f594a = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: executePreCapture
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReceiptClaimOldDaySecurityActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_receipt_claim_old_day_security;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws IllegalAccessException {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = i7 | i3;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i3));
        int i11 = (~(i4 | i3)) | (~(i7 | i4));
        int i12 = i9 | i8;
        int i13 = i3 + i6 + i2 + (988256597 * i5) + ((-695401848) * i);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i3) - 1270611968) + ((-1462879173) * i6) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i2) + (479985664 * i5) + (1063256064 * i) + (1273561088 * i14);
        int i16 = (i3 * (-1367684995)) + 376186498 + (i6 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i2 * (-1367684709)) + (i5 * 1512018807) + (1127043160 * i) + (i14 * (-418185216));
        int i17 = i15 + (i16 * i16 * 1903099904);
        if (i17 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 3) {
            final ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = (ReceiptClaimOldDaySecurityActivity) objArr[0];
            int i18 = 2 % 2;
            ((ActivityReceiptClaimOldDaySecurityBinding) ((ViewBinding) receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbarEvidence.setNavigationOnClickListener(new View.OnClickListener() { // from class: executeCapture
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
                }
            });
            MaterialButton materialButton = ((ActivityReceiptClaimOldDaySecurityBinding) ((ViewBinding) receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnShare;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdaexecuteCapture0androidxcameracamera2internalCamera2CapturePipelinePipeline
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
                }
            }));
            ImageView imageView = ((ActivityReceiptClaimOldDaySecurityBinding) ((ViewBinding) receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnDownload;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdaexecutePreCapture3androidxcameracamera2internalCamera2CapturePipelinePipeline
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
                }
            }));
            int i19 = f594a + 57;
            asBinder = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        if (i17 != 4) {
            return b(objArr);
        }
        ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity2 = (ReceiptClaimOldDaySecurityActivity) objArr[0];
        int i21 = 2 % 2;
        int i22 = f594a + 35;
        asBinder = i22 % 128;
        int i23 = i22 % 2;
        int i24 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i25 = ~iUptimeMillis;
        if (i24 != 2142254032 + (((-951622402) | i25) * (-369)) + (((~((-121651323) | i25)) | (-951638866)) * (-369)) + (((~(iUptimeMillis | 121651322)) | (-1073273724) | (~(i25 | (-16465)))) * 369)) {
            int i26 = f594a + 15;
            asBinder = i26 % 128;
            int i27 = i26 % 2;
            int[] iArr = new int[1151433667];
            iArr[1151433666] = 1;
            int i28 = 981039814 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i29 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i30 = 959848768 + (((~((-291611696) | i)) | 287310850 | (~((-2007523027) | i))) * (-754));
        int i31 = ~((-287310851) | i);
        int i32 = ~i;
        if (i29 == i30 + ((i31 | (~((-1720212177) | i32))) * (-754)) + ((i32 | (-291611696)) * 754)) {
            super.onResume();
            return null;
        }
        int i33 = (-1059390476) % 2;
        throw new ArithmeticException();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity.$$a
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r6 = r7
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r5]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    public static final /* synthetic */ Bitmap TuitionPaymentFragmentbindingInflater1(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, ScrollView scrollView) {
        int i = 2 % 2;
        int height = scrollView.getChildAt(0).getHeight();
        int height2 = scrollView.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(receiptClaimOldDaySecurityActivity.getResources().getDisplayMetrics().widthPixels, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        scrollView.draw(new Canvas(bitmapCreateBitmap));
        ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
        layoutParams.height = height2;
        scrollView.setLayoutParams(layoutParams);
        int i2 = asBinder + 99;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        return bitmapCreateBitmap;
    }

    public static final /* synthetic */ ActivityReceiptClaimOldDaySecurityBinding TuitionPaymentFragmentbindingInflater1(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        ActivityReceiptClaimOldDaySecurityBinding activityReceiptClaimOldDaySecurityBinding = (ActivityReceiptClaimOldDaySecurityBinding) ((ViewBinding) receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = f594a + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return activityReceiptClaimOldDaySecurityBinding;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, Bitmap bitmap) {
        int i = 2 % 2;
        File file = new File(receiptClaimOldDaySecurityActivity.getExternalCacheDir(), "JMO");
        if (!file.exists()) {
            int i2 = asBinder + 123;
            f594a = i2 % 128;
            if (i2 % 2 == 0) {
                file.mkdirs();
                int i3 = 9 / 0;
            } else {
                file.mkdirs();
            }
        }
        ClaimEvidenceJhtItem claimEvidenceJhtItem = receiptClaimOldDaySecurityActivity.b;
        PendingIntent activity = null;
        String kodeKlaim = claimEvidenceJhtItem != null ? claimEvidenceJhtItem.getKodeKlaim() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(kodeKlaim);
        sb.append(".jpg");
        File file2 = new File(file, sb.toString());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", file2.getName());
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("relative_path", "Pictures/JMO");
            Uri uriInsert = receiptClaimOldDaySecurityActivity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                int i4 = asBinder + 57;
                f594a = i4 % 128;
                if (i4 % 2 == 0) {
                    receiptClaimOldDaySecurityActivity.getContentResolver().openOutputStream(uriInsert);
                    activity.hashCode();
                    throw null;
                }
                OutputStream outputStreamOpenOutputStream = receiptClaimOldDaySecurityActivity.getContentResolver().openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    OutputStream outputStream = outputStreamOpenOutputStream;
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                        CloseableKt.closeFinally(outputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(outputStream, th);
                            throw th2;
                        }
                    }
                }
                String string = receiptClaimOldDaySecurityActivity.getString(R.string.label_content_title_evidence);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = receiptClaimOldDaySecurityActivity.getString(R.string.label_content_text_evidence);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Object systemService = receiptClaimOldDaySecurityActivity.getSystemService("notification");
                Intrinsics.checkNotNull(systemService, "");
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (Build.VERSION.SDK_INT >= 26) {
                    notificationManager.createNotificationChannel(new NotificationChannel("bpjstku_channel_id", "bpjstku", 4));
                }
                NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(receiptClaimOldDaySecurityActivity, "bpjstku_channel_id").setContentTitle(string).setContentText(string2).setSmallIcon(2131231113);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriInsert, "image/*");
                intent.addFlags(1);
                List<ResolveInfo> listQueryIntentActivities = receiptClaimOldDaySecurityActivity.getPackageManager().queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
                if (!listQueryIntentActivities.isEmpty()) {
                    int i5 = asBinder + 71;
                    f594a = i5 % 128;
                    int i6 = i5 % 2;
                    activity = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(receiptClaimOldDaySecurityActivity, 0, intent, 201326592) : PendingIntent.getActivity(receiptClaimOldDaySecurityActivity, 0, intent, 1140850688);
                }
                Notification notificationBuild = smallIcon.setContentIntent(activity).setPriority(1).setAutoCancel(true).build();
                Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
                notificationManager.notify((int) System.currentTimeMillis(), notificationBuild);
                String string3 = receiptClaimOldDaySecurityActivity.getString(R.string.label_content_text_evidence);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, Bitmap bitmap) {
        int i = 2 % 2;
        try {
            File file = new File(receiptClaimOldDaySecurityActivity.getExternalCacheDir(), "images");
            if (!file.exists()) {
                int i2 = asBinder + 123;
                f594a = i2 % 128;
                int i3 = i2 % 2;
                file.mkdirs();
                int i4 = asBinder + 85;
                f594a = i4 % 128;
                int i5 = i4 % 2;
            }
            ClaimEvidenceJhtItem claimEvidenceJhtItem = receiptClaimOldDaySecurityActivity.b;
            String kodeKlaim = claimEvidenceJhtItem != null ? claimEvidenceJhtItem.getKodeKlaim() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(kodeKlaim);
            sb.append(".jpg");
            File file2 = new File(file, sb.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            String packageName = receiptClaimOldDaySecurityActivity.getPackageName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageName);
            sb2.append(".provider");
            Uri uriForFile = FileProvider.getUriForFile(receiptClaimOldDaySecurityActivity, sb2.toString(), file2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.setType("image/*");
            receiptClaimOldDaySecurityActivity.startActivity(Intent.createChooser(intent, "Share via..."));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = (ReceiptClaimOldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 117;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
        int i4 = f594a + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return null;
    }

    public ReceiptClaimOldDaySecurityActivity() {
        final ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = receiptClaimOldDaySecurityActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/evidence/ReceiptClaimOldDaySecurityActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "p1", "", "b", "(Landroid/content/Context;Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, ClaimEvidenceJhtItem p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ReceiptClaimOldDaySecurityActivity.class, new Pair[]{TuplesKt.to("key_evidence_claim", p1)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityReceiptClaimOldDaySecurityBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        ReceiptClaimOldDaySecurityActivity$bindingInflater$1 receiptClaimOldDaySecurityActivity$bindingInflater$1 = ReceiptClaimOldDaySecurityActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i4 = f594a + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return receiptClaimOldDaySecurityActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        f594a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
        throw null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements ViewTreeObserver.OnPreDrawListener {
        private /* synthetic */ View TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ ReceiptClaimOldDaySecurityActivity b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = view;
            this.b = receiptClaimOldDaySecurityActivity;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() throws IllegalAccessException {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getViewTreeObserver().removeOnPreDrawListener(this);
            ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = this.b;
            ScrollView scrollView = ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(receiptClaimOldDaySecurityActivity).rootReceipt;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(receiptClaimOldDaySecurityActivity, scrollView));
            ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            return true;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ViewTreeObserver.OnPreDrawListener {
        private /* synthetic */ View TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ ReceiptClaimOldDaySecurityActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = view;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = receiptClaimOldDaySecurityActivity;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() throws IllegalAccessException {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getViewTreeObserver().removeOnPreDrawListener(this);
            ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ScrollView scrollView = ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(receiptClaimOldDaySecurityActivity).rootReceipt;
            Intrinsics.checkNotNullExpressionValue(scrollView, "");
            ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentbindingInflater1(receiptClaimOldDaySecurityActivity, scrollView));
            ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return true;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = f594a + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        this.b = intent != null ? (ClaimEvidenceJhtItem) intent.getParcelableExtra("key_evidence_claim") : null;
        int i4 = f594a + 67;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ClaimEvidenceJhtItem claimEvidenceJhtItem = this.b;
        ActivityReceiptClaimOldDaySecurityBinding activityReceiptClaimOldDaySecurityBinding = (ActivityReceiptClaimOldDaySecurityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        if (claimEvidenceJhtItem != null) {
            String paymentDate = claimEvidenceJhtItem.getPaymentDate();
            if (paymentDate != null && paymentDate.length() > 0) {
                int i2 = f594a + 91;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 51 / 0;
                    if (!Intrinsics.areEqual(claimEvidenceJhtItem.getPaymentDate(), "-")) {
                        try {
                            activityReceiptClaimOldDaySecurityBinding.timeStatus.setVisibility(0);
                            activityReceiptClaimOldDaySecurityBinding.timeStatus.setText(TuitionPaymentFragmentbindingInflater1(claimEvidenceJhtItem.getPaymentDate()));
                            int i4 = asBinder + 35;
                            f594a = i4 % 128;
                            int i5 = i4 % 2;
                        } catch (Exception unused) {
                            activityReceiptClaimOldDaySecurityBinding.timeStatus.setText(claimEvidenceJhtItem.getPaymentDate());
                        }
                    } else {
                        activityReceiptClaimOldDaySecurityBinding.timeStatus.setVisibility(8);
                    }
                } else if (!Intrinsics.areEqual(claimEvidenceJhtItem.getPaymentDate(), "-")) {
                    activityReceiptClaimOldDaySecurityBinding.timeStatus.setVisibility(0);
                    activityReceiptClaimOldDaySecurityBinding.timeStatus.setText(TuitionPaymentFragmentbindingInflater1(claimEvidenceJhtItem.getPaymentDate()));
                    int i6 = asBinder + 35;
                    f594a = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    activityReceiptClaimOldDaySecurityBinding.timeStatus.setVisibility(8);
                }
            } else {
                activityReceiptClaimOldDaySecurityBinding.timeStatus.setVisibility(8);
            }
            activityReceiptClaimOldDaySecurityBinding.codeClaim.setText(getString(R.string.label_code_claim_not_semicolon, claimEvidenceJhtItem.getKodeKlaim()));
            activityReceiptClaimOldDaySecurityBinding.tvBankAccountValue.setText(claimEvidenceJhtItem.getNomorRekening());
            activityReceiptClaimOldDaySecurityBinding.tvBankNameValue.setText(claimEvidenceJhtItem.getNamaBank());
            activityReceiptClaimOldDaySecurityBinding.tvReceiverNameValue.setText(claimEvidenceJhtItem.getNamaPenerima());
            activityReceiptClaimOldDaySecurityBinding.tvNumberKpjValue.setText(claimEvidenceJhtItem.getKpj());
            TextView textView = activityReceiptClaimOldDaySecurityBinding.tvTransactionValue;
            String jmlTransfer = claimEvidenceJhtItem.getJmlTransfer();
            textView.setText(jmlTransfer != null ? getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(jmlTransfer) : null);
            TextView textView2 = activityReceiptClaimOldDaySecurityBinding.statusTransactionValue;
            String status = claimEvidenceJhtItem.getStatus();
            textView2.setVisibility((status == null || status.length() <= 0) ? 8 : 0);
            activityReceiptClaimOldDaySecurityBinding.tvDescSkn.setVisibility(Intrinsics.areEqual(claimEvidenceJhtItem.getKodeBayar(), "SKN") ? 0 : 8);
            if (Intrinsics.areEqual(claimEvidenceJhtItem.getStatus(), "SUKSES")) {
                activityReceiptClaimOldDaySecurityBinding.tvNotificationClaim.setText(getString(Intrinsics.areEqual(claimEvidenceJhtItem.getKodeBayar(), "SKN") ? R.string.label_success_process_claim : R.string.label_success_claim));
                activityReceiptClaimOldDaySecurityBinding.statusTransactionValue.setText(getString(R.string.label_success));
                ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = this;
                activityReceiptClaimOldDaySecurityBinding.statusTransactionValue.setTextColor(ContextCompat.getColor(receiptClaimOldDaySecurityActivity, R.color.green_forest_primary));
                activityReceiptClaimOldDaySecurityBinding.statusTransactionValue.setBackground(ContextCompat.getDrawable(receiptClaimOldDaySecurityActivity, R.drawable.bg_round_green));
                return;
            }
            activityReceiptClaimOldDaySecurityBinding.tvNotificationClaim.setText(getString(R.string.label_waiting_claim));
            activityReceiptClaimOldDaySecurityBinding.statusTransactionValue.setText(getString(R.string.label_status_waiting_payment));
            ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity2 = this;
            activityReceiptClaimOldDaySecurityBinding.statusTransactionValue.setTextColor(ContextCompat.getColor(receiptClaimOldDaySecurityActivity2, R.color.colorAmber500));
            activityReceiptClaimOldDaySecurityBinding.statusTransactionValue.setBackground(ContextCompat.getDrawable(receiptClaimOldDaySecurityActivity2, R.drawable.bg_round_amber));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x017d  */
    /* JADX WARN: Code duplicated, block: B:38:0x017e  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i6 = $11 + 41;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 % 5;
        }
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(asInterface)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 3291, Drawable.resolveOpacity(0, 0) + 31, 1199271174, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 651 - Color.argb(0, 0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 44, -450685997, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i9 = $11 + 95;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            int i11 = $11 + 61;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i13 = $10 + 49;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.red(0), (Process.myPid() >> 22) + 651, TextUtils.indexOf("", "") + 44, -450685997, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private static String TuitionPaymentFragmentbindingInflater1(String p0) {
        int i = 2 % 2;
        String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy/MM/dd HH:mm:ss", "MM/dd/yyyy HH:mm:ss", "dd/MM/yyyy HH:mm:ss", "yyyyMMddHHmmss", "yyyyMMdd"};
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm 'WIB'", Locale.getDefault());
        for (int i2 = 0; i2 < 8; i2++) {
            try {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(strArr[i2], Locale.getDefault());
                Date date = null;
                if (p0 != null) {
                    int i3 = asBinder + 97;
                    f594a = i3 % 128;
                    if (i3 % 2 == 0) {
                        simpleDateFormat2.parse(p0);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    date = simpleDateFormat2.parse(p0);
                }
                if (date != null) {
                    int i4 = asBinder + 39;
                    f594a = i4 % 128;
                    int i5 = i4 % 2;
                    String str = simpleDateFormat.format(date);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
        if (p0 != null) {
            return p0;
        }
        int i6 = asBinder + 93;
        f594a = i6 % 128;
        int i7 = i6 % 2;
        return "";
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean p0) {
        int i = 2 % 2;
        int i2 = f594a + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ActivityReceiptClaimOldDaySecurityBinding activityReceiptClaimOldDaySecurityBinding = (ActivityReceiptClaimOldDaySecurityBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        if (!p0) {
            activityReceiptClaimOldDaySecurityBinding.btnShare.setVisibility(8);
            activityReceiptClaimOldDaySecurityBinding.btnDownload.setVisibility(8);
            activityReceiptClaimOldDaySecurityBinding.toolbarEvidence.setVisibility(8);
            int i4 = f594a + 93;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 78 / 0;
                return;
            }
            return;
        }
        int i6 = f594a + 19;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        activityReceiptClaimOldDaySecurityBinding.btnShare.setVisibility(0);
        activityReceiptClaimOldDaySecurityBinding.btnDownload.setVisibility(0);
        activityReceiptClaimOldDaySecurityBinding.toolbarEvidence.setVisibility(0);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = (ReceiptClaimOldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final addTask addtask = new addTask(receiptClaimOldDaySecurityActivity);
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: executePostCapture
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                ReceiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(addtask, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        int i2 = asBinder + 63;
        f594a = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
            int iMyTid = (Process.myTid() >> 22) + 15;
            byte[] bArr = $$a;
            short s = bArr[5];
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(s, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, maximumFlingVelocity, iMyTid, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 240, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 94, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 104, new char[]{16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f'}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 254, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_day_of_week_column_header).substring(0, 4).length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_paid).substring(0, 6).length() + 3, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
            int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16;
            byte b2 = $$a[7];
            Object[] objArr5 = new Object[1];
            c((short) 51, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, threadPriority, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 89;
            f594a = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1030;
                int iGreen = 15 - Color.green(0);
                Object[] objArr6 = new Object[1];
                c((short) 103, $$a[132], (byte) 52, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, i6, iGreen, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[3])[0];
            int i8 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = 106353603 + (((~(549671053 | i9)) | (~((-793951224) | iIdentityHashCode))) * 1900) + (((~(i9 | 793951223)) | (~(iIdentityHashCode | (-549671054)))) * (-950)) + (((~(iIdentityHashCode | 793951223)) | (~(i9 | (-549671054)))) * 950) + 226580649;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_4).substring(1, 2).length() + 284, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 22, new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, TextUtils.getCapsMode("", 0, 0) + 289, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).length() + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_save_credit_card).substring(7, 10).length() + 8, new char[]{3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {174219169};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 46038), TextUtils.indexOf((CharSequence) "", '0') + 1135, 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 226580649, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 1031;
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr2 = $$a;
                    short s2 = bArr2[5];
                    byte b3 = bArr2[7];
                    Object[] objArr12 = new Object[1];
                    c(s2, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iIndexOf, iLastIndexOf, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45992), 1117 - View.getDefaultSize(0, 0), Color.red(0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int iIndexOf2 = 1031 - TextUtils.indexOf("", "", 0);
                    int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                    Object[] objArr13 = new Object[1];
                    c((short) 103, $$a[132], (byte) 52, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iIndexOf2, packedPositionType, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(false, 286 - (Process.myPid() >> 22), 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).codePointAt(1) - 33, new char[]{16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f'}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_object_active).substring(3, 4).codePointAt(0) + 189, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.epay_bri).substring(0, 9).codePointAt(6) - 51, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_title_text).substring(0, 20).codePointAt(15) - 88, new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int packedPositionType2 = 1031 - ExpandableListView.getPackedPositionType(0L);
                        int iRed = 15 - Color.red(0);
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 51, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, packedPositionType2, iRed, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iArgb = Color.argb(0, 0, 0, 0) + 1031;
                        int deadChar = 15 - KeyEvent.getDeadChar(0, 0);
                        byte[] bArr3 = $$a;
                        short s3 = bArr3[5];
                        byte b5 = bArr3[7];
                        Object[] objArr17 = new Object[1];
                        c(s3, b5, b5, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(maximumFlingVelocity2, iArgb, deadChar, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i13 = asBinder + 73;
                    f594a = i13 % 128;
                    int i14 = i13 % 2;
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i17 = f594a + 17;
                    asBinder = i17 % 128;
                    if (i17 % 2 != 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 72;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[3])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i21 = (int) Runtime.getRuntime().totalMemory();
        int i22 = ~i21;
        int i23 = i18 + (-1091923213) + (((~(i22 | (-3168677))) | 6304 | (~((-244286475) | i21))) * 717) + (((~(i21 | (-3168677))) | (~(i22 | (-244286475))) | 6304) * 717);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
        int i26 = asBinder + 61;
        f594a = i26 % 128;
        int i27 = i26 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int i28 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
            int iGreen2 = 23 - Color.green(0);
            byte b6 = $$a[7];
            Object[] objArr19 = new Object[1];
            c((short) 103, b6, (byte) (b6 | 15), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarFadeDuration, i28, iGreen2, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int gidForName = Process.getGidForName("") + 1756;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
                byte b7 = $$a[7];
                Object[] objArr20 = new Object[1];
                c((short) 51, b7, b7, objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf2, gidForName, iLastIndexOf2, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i29 = 555421763 + (((~(iIdentityHashCode2 | (-691080617))) | 903683042) * 191) + (((~((~iIdentityHashCode2) | (-691080617))) | 554764704) * 191) + 1180530285;
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i31 ^ (i31 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.retrofit_network_message).substring(4, 5).codePointAt(0) + 177, View.resolveSize(0, 0) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 3, new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_alfamart).substring(19, 20).length() + 288, 16 - KeyEvent.normalizeMetaState(0), 10 - ImageFormat.getBitsPerPixel(0), new char[]{3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14}, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {174219169};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (View.MeasureSpec.getMode(0) + 42049), (ViewConfiguration.getPressedStateDuration() >> 16) + 1726, (ViewConfiguration.getScrollBarSize() >> 8) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 1180530285, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                int i32 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i33 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                c((short) 51, b8, b8, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(touchSlop, i32, i33, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr26 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 240, 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f'}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 254, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.fetching_offers).substring(1, 2).codePointAt(0) - 86, 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMyPid2 = (char) ((Process.myPid() >> 22) + 29944);
                    int size = 1755 - View.MeasureSpec.getSize(0);
                    int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                    short s4 = (short) ($$b & 988);
                    byte b9 = $$a[7];
                    Object[] objArr28 = new Object[1];
                    c(s4, b9, b9, objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMyPid2, size, iRgb, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                    int i34 = 1755 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iRgb2 = (-16777193) - Color.rgb(0, 0, 0);
                    byte b10 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((short) 103, b10, (byte) (b10 | 15), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(deadChar2, i34, iRgb2, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i35 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
        int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        if (i36 == i35) {
            int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int iNextInt = new Random().nextInt();
            int i38 = ~(767731061 | iNextInt);
            int i39 = ~iNextInt;
            int i40 = i38 | (~(980333487 | i39));
            int i41 = ~((-767731062) | i39);
            int i42 = i37 + 154427301 + ((i40 | i41) * (-516)) + (((~(iNextInt | (-304878219))) | (~((-675455270) | i39))) * 516) + ((675455269 | i41) * 516);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr30[3])[0] = i44 ^ (i44 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
        if (strArr4 != null) {
            int i45 = asBinder + 59;
            f594a = i45 % 128;
            int i46 = i45 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i36 / (((i36 - 1) * i36) % 2), 0).show();
        int i47 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i48 = ~((-198859780) | iIdentityHashCode3);
        int i49 = ~iIdentityHashCode3;
        int i50 = i47 + (-1939252905) + ((i48 | (~(198966839 | i49))) * (-406)) + ((~((-185224194) | i49)) * (-406)) + (((~(iIdentityHashCode3 | (-13742647))) | (~(198859779 | i49))) * 406);
        int i51 = (i50 << 13) ^ i50;
        int i52 = i51 ^ (i51 >>> 17);
        ((int[]) objArr31[3])[0] = i52 ^ (i52 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        f594a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1]).getInt(null);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i4 = ~iElapsedRealtime;
            int i5 = ~(214691749 | i4);
            if (i3 != 145995416 + (((-1053814782) | i5) * (-712)) + (((~(iElapsedRealtime | (-839123033))) | (~(i4 | 1053814781))) * (-712)) + ((1044679292 | i5) * 712)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i6 != 1903282896 + (((~((-277382699) | iIdentityHashCode)) | (~((~iIdentityHashCode) | (-1107370242)))) * (-318)) + (((~(1032623678 | iIdentityHashCode)) | (-2139993920)) * (-318)) + (((~(iIdentityHashCode | (-1032623679))) | 1862611221) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) {
                throw null;
            }
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i7 != ((~((-18886673) | iIdentityHashCode2)) * 521) + 72169458 + (((~((~iIdentityHashCode2) | (-18886673))) | 1478034570) * 521)) {
            throw null;
        }
        super.onStart();
        int i8 = f594a + 31;
        asBinder = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 11 / 0;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i6 = ~i5;
        if (i4 != 475278640 + (((~(1331795321 | i6)) | 501807778) * (-90)) + (((~(1331795321 | i5)) | 1107363161) * (-45)) + (((~(i5 | (-501807779))) | 1331795321 | (~(i6 | 501807778))) * 45)) {
            throw null;
        }
        int i7 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i9 = ~i8;
        if (i7 != (((~((-1987393860) | i9)) | (~((-591662106) | i8)) | (~(i9 | 591662105))) * 959) + 1021267292 + (((~(i8 | 591662105)) | (~(i9 | (-591662106))) | (~((-1987393860) | i8))) * 959)) {
            throw null;
        }
        super.onCreate(bundle);
        int i10 = asBinder + 23;
        f594a = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ outputFormatToAudioProfile b(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(receiptClaimOldDaySecurityActivity);
        int i2 = asBinder + 73;
        f594a = i2 % 128;
        if (i2 % 2 != 0) {
            return outputformattoaudioprofile;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                receiptClaimOldDaySecurityActivity.d_();
                ViewPortBuilder.b();
                int i4 = 17 / 0;
            } else {
                receiptClaimOldDaySecurityActivity.d_();
                ViewPortBuilder.b();
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
        View viewFindViewById = receiptClaimOldDaySecurityActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewFindViewById, receiptClaimOldDaySecurityActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 19;
        f594a = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        f594a = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 1;
        f594a = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        receiptClaimOldDaySecurityActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
        View viewFindViewById = receiptClaimOldDaySecurityActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewFindViewById, receiptClaimOldDaySecurityActivity));
        Unit unit = Unit.INSTANCE;
        int i2 = f594a + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity = (ReceiptClaimOldDaySecurityActivity) objArr[0];
        int i = 2 % 2;
        if (!((Boolean) objArr[1]).booleanValue()) {
            int i2 = f594a + 113;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            AutoValue_LifecycleCameraRepository_Key.b(receiptClaimOldDaySecurityActivity, "Izin akses tidak diberikan.");
            int i4 = f594a + 81;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity, Boolean bool) {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{receiptClaimOldDaySecurityActivity, bool}, -1944569501, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater3, 1944569502);
    }

    static {
        d = 0;
        g();
        INSTANCE = new Companion(null);
        int i = g + 105;
        d = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReceiptClaimOldDaySecurityActivity receiptClaimOldDaySecurityActivity) throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{receiptClaimOldDaySecurityActivity}, 1828431136, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater3, -1828431134);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IllegalAccessException {
        int i = 922110732 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iCodePointAt = 664130292 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_internet_instruction_4).substring(3, 4).codePointAt(0);
        int iTuitionPaymentFragmentbindingInflater1 = zzn.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzn.TuitionPaymentFragmentbindingInflater1(), iCodePointAt, new Object[]{this}, -2137767274, i, iTuitionPaymentFragmentbindingInflater1, 2137767277);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        f594a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{this}, 1066112004, iTuitionPaymentFragmentbindingInflater1, iTuitionPaymentFragmentbindingInflater3, -1066112004);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima7).substring(105, 113).codePointAt(3) - 2099064712;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTextOn.TuitionPaymentFragmentbindingInflater1(), zzn.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 753191980, iCodePointAt, getTextOn.TuitionPaymentFragmentbindingInflater1(), -753191976);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = f594a + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = f594a + 21;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void g() {
        asInterface = -83722279;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r7 = 120 - r7
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity.$$c
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.evidence.ReceiptClaimOldDaySecurityActivity.$$i(int, short, short):java.lang.String");
    }
}
