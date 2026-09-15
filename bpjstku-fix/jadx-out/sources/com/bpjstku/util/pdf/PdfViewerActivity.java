package com.bpjstku.util.pdf;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.databinding.ActivityPdfViewerBinding;
import com.bpjstku.util.pdf.PdfViewerActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.CaptureSession1;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.createExtraImageCapture;
import defpackage.createExtraPreview;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getTextOn;
import defpackage.initSession;
import defpackage.updateSession;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/bpjstku/util/pdf/PdfViewerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/bpjstku/databinding/ActivityPdfViewerBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/databinding/ActivityPdfViewerBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LupdateSession;", "LupdateSession;", "b", "", "I", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PdfViewerActivity extends AppCompatActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder;
    private static long asInterface;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private ActivityPdfViewerBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private updateSession b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$d = {94, 6, -99, -107, 0, 17, -31, 20, 9, -5, 0, 19, -13, 1, -25, 45, -13, 10, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -65, -2, -1, 14, 2, -2, -59, -3, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 55, 14, 1, -9, 20, -1, 2, -11, 11, 8, -68, 40, 15, 20, -6, -24, 38, -14, 18, -14, -12, 17, -35, 40, 1, -2, 7, 1, -44, 43, 5, -3, -10, 21, -78, 50, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, -16, 9, 7, -8, 7, 7, -5, -28, 39, -6, 8, -9, 21, -13, 15, -63, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, -16, 9, 7, -8, 7, 7, -5, -28, 39, -6, 8, -9, 21, -13, 15, -63, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 53, 15, -8, 16, -1, -4, -3, -52, 64, -1, -5, 18, -15, 19, -7, -2, 16, -67, 68, -2, -9, 4, 4, 16, -67, 38, -44, 71, -3, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 53, 15, -8, 16, -1, -4, -3, -52, 59, 8, 8, -67, Base64.padSymbol, 7, 8, -13, 15, -2, -11, 13, -60, 53, 22, 1, -10, -56, 78, 2, -17, 12, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -64, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 25, 47, 2, -1, 5, -43, 51, -15, 11, 8, -78, 34, 35, 19, -11, -4, 4, -15, 39, -7, -9, -63, 50, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -63, 14, 0, -61, 63, 6, 8, 0, -9, 3, 4, -5, 19, 1, 2, -17, -49, 53, 20, 8, -9, -9, -51, 21, 52, 8, -9, -9, -14, 20, 15, 6, -15, 15, -76, 19, -15, 19};
    private static final int $$e = 94;
    private static final byte[] $$a = {88, 99, -94, -58, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
    private static final int $$b = 118;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f670a = 0;
    private static int d = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~i4) | i8;
        int i10 = ~(i4 | i8);
        int i11 = i3 + i5 + i2 + ((-714989572) * i6) + (1142003473 * i);
        int i12 = i11 * i11;
        int i13 = (((-190873766) * i3) - 1983905792) + (1136689320 * i5) + (i7 * (-1483702105)) + (1483702105 * i9) + ((-1483702105) * i10) + ((-1674575872) * i2) + ((-1891631104) * i6) + ((-1355808768) * i) + ((-1882259456) * i12);
        int i14 = (i3 * (-1158907614)) + 1427560840 + (i5 * (-1158905656)) + (i7 * 979) + (i9 * (-979)) + (i10 * 979) + (i2 * (-1158906635)) + (i6 * 1387703340) + (i * 1202573125) + (i12 * (-451215360));
        int i15 = i13 + (i14 * i14 * (-310837248));
        if (i15 != 1) {
            return i15 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r8 = r8 + 84
            int r9 = r9 + 1
            byte[] r0 = com.bpjstku.util.pdf.PdfViewerActivity.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L2a
        L10:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.pdf.PdfViewerActivity.e(int, int, byte, java.lang.Object[]):void");
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
    private static void f(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.util.pdf.PdfViewerActivity.$$d
            int r9 = 115 - r9
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r9 = r8
            r4 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L26:
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.util.pdf.PdfViewerActivity.f(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        boolean z;
        ActivityPdfViewerBinding activityPdfViewerBinding;
        boolean z2 = false;
        PdfViewerActivity pdfViewerActivity = (PdfViewerActivity) objArr[0];
        int i = 2 % 2;
        ActivityPdfViewerBinding activityPdfViewerBinding2 = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (activityPdfViewerBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityPdfViewerBinding2 = null;
        }
        Button button = activityPdfViewerBinding2.btnPrevious;
        if (pdfViewerActivity.TuitionPaymentFragmentbindingInflater1 > 0) {
            int i2 = f670a + 105;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
            button.setEnabled(z);
            activityPdfViewerBinding = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (activityPdfViewerBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityPdfViewerBinding = null;
            }
            Button button2 = activityPdfViewerBinding.btnNext;
            if (pdfViewerActivity.TuitionPaymentFragmentbindingInflater1 < pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) {
                int i3 = f670a + 71;
                d = i3 % 128;
                int i4 = i3 % 2;
                z2 = true;
            }
            button2.setEnabled(z2);
            return null;
        }
        int i5 = d + 95;
        f670a = i5 % 128;
        int i6 = i5 % 2;
        z = false;
        button.setEnabled(z);
        activityPdfViewerBinding = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (activityPdfViewerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityPdfViewerBinding = null;
        }
        Button button3 = activityPdfViewerBinding.btnNext;
        if (pdfViewerActivity.TuitionPaymentFragmentbindingInflater1 < pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) {
            int i7 = f670a + 71;
            d = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        }
        button3.setEnabled(z2);
        return null;
    }

    public static final /* synthetic */ updateSession TuitionPaymentFragmentbindingInflater1(PdfViewerActivity pdfViewerActivity) {
        int i = 2 % 2;
        int i2 = d + 77;
        f670a = i2 % 128;
        int i3 = i2 % 2;
        updateSession updatesession = pdfViewerActivity.b;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return updatesession;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(PdfViewerActivity pdfViewerActivity) {
        int i = 2 % 2;
        int i2 = f670a;
        int i3 = i2 + 93;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i4 == 0) {
            throw null;
        }
        int i6 = i2 + 121;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 91 / 0;
        }
        return i5;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PdfViewerActivity pdfViewerActivity, int i) {
        int i2 = 2 % 2;
        int i3 = f670a + 95;
        d = i3 % 128;
        int i4 = i3 % 2;
        pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        if (i4 == 0) {
            int i5 = 18 / 0;
        }
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(PdfViewerActivity pdfViewerActivity) {
        int i = 2 % 2;
        int i2 = f670a;
        int i3 = i2 + 85;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = pdfViewerActivity.TuitionPaymentFragmentbindingInflater1;
        int i6 = i2 + 107;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        PdfViewerActivity pdfViewerActivity = (PdfViewerActivity) objArr[0];
        int i = 2 % 2;
        ActivityPdfViewerBinding activityPdfViewerBinding = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (activityPdfViewerBinding == null) {
            int i2 = f670a + 97;
            d = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f670a + 59;
            d = i4 % 128;
            int i5 = i4 % 2;
            activityPdfViewerBinding = null;
        }
        TextView textView = activityPdfViewerBinding.textPageInfo;
        int i6 = pdfViewerActivity.TuitionPaymentFragmentbindingInflater1;
        int i7 = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder();
        sb.append(i6 + 1);
        sb.append(" / ");
        sb.append(i7);
        textView.setText(sb.toString());
        return null;
    }

    public static final /* synthetic */ ActivityPdfViewerBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(PdfViewerActivity pdfViewerActivity) {
        int i = 2 % 2;
        int i2 = d + 95;
        f670a = i2 % 128;
        int i3 = i2 % 2;
        ActivityPdfViewerBinding activityPdfViewerBinding = pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return activityPdfViewerBinding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void b(PdfViewerActivity pdfViewerActivity) {
        int i = 2 % 2;
        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(pdfViewerActivity), null, null, new PdfViewerActivity$renderCurrentPage$1(pdfViewerActivity, null), 3, null);
        int i2 = f670a + 67;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 19472), 2624 - Color.red(0), TextUtils.getTrimmedLength("") + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (asInterface ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getScrollBarSize() >> 8)), 481 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 15;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i8 = $11 + 19;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.red(0) + 39422), 481 - ExpandableListView.getPackedPositionType(0L), 37 - View.resolveSize(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - Color.green(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 481, (Process.myPid() >> 22) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        String str;
        String str2;
        Object[] objArr3;
        char c;
        Object[] objArr4;
        Object[] objArr5;
        char c2;
        String str3;
        Object[] objArr6;
        Object[] objArr7;
        String str4;
        String str5;
        Object[] objArr8;
        char c3;
        Object[] objArr9;
        String str6;
        Object[] objArr10;
        Object[] objArr11;
        Object[] objArr12;
        String str7;
        int i2;
        String str8;
        Object[] objArr13;
        char c4;
        Object[] objArr14;
        int i3;
        String str9;
        Object[] objArr15;
        Object[] objArr16;
        int i4;
        Object[] objArr17;
        Object[] objArr18;
        int i5 = 2 % 2;
        String str10 = "android.app.ActivityThread";
        Object[] objArr19 = new Object[1];
        c(new char[]{45869, 57989, 4198, 18379, 62911, 11110, 23234, 35059, 15899, 28128, 33764, 12594, 24801, 38468, 50202, 31712, 43345, 57112, 3742, 48198, 53795, 404}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_billingcountry_empty).substring(10, 11).length() + 20902, objArr19);
        String str11 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        c(new char[]{45865, 22667, 25723, 28733, 7571, 10622, 13610, 49843, 61041, 64046, 34702, 37729, 48929, 17550, 20595}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 60219, objArr20);
        String str12 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        c(new char[]{45862, 40038, 60844, 16076, 3662, 24407, 43247, 63535, 51571, 6849, 27633, 47884, 33979, 54775, 9523, 30276}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12096, objArr21);
        String str13 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        c(new char[]{45861, 46135, 48407, 42623, 44868, 37054, 39298, 33516, 35836, 62266, 62473, 64881, 59003, 61360, 53402, 55800}, (ViewConfiguration.getPressedStateDuration() >> 16) + 1823, objArr22);
        String str14 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        c(new char[]{45869, 47713, 41390, 43255, 38447, 40298, 33978, 62391, 63797, 57447, 61346, 54915, 56361, 52040, 12946, 14792, 9994, 11862, 5518, 7372, 2596, 29019, 30972, 26156, 28005, 21667}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2335, objArr23);
        String str15 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        c(new char[]{45871, 37584, 61676, 54917, 13453, 6831, 30798, 24146, 48244, 33293, 57402, 50726, 9667, 3064, 27014, 20354, 44467, 62299}, Drawable.resolveOpacity(0, 0) + 8681, objArr24);
        String str16 = (String) objArr24[0];
        int i6 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1080259386;
        int i7 = ~iCodePointAt;
        if (i6 != 2143642072 + ((iCodePointAt | 86378704) * 988) + (((-1472130560) | (~(i7 | 364260860))) * (-1976)) + (((~(i7 | (-1194248404))) | (~(1194248403 | iCodePointAt)) | 86378704) * 988)) {
            throw new RuntimeException("190650004");
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 556907366;
        if (i8 != 2128602320 + (((~(1731086922 | iCodePointAt2)) | 1728593992) * (-502)) + ((~((~iCodePointAt2) | 1743769583)) * (-502)) + (((~(iCodePointAt2 | (-15175592))) | 1731086922) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            throw new RuntimeException("379342731");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
            int fadingEdgeLength = 1755 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int i9 = 22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            short s = bArr[5];
            byte b = bArr[7];
            Object[] objArr25 = new Object[1];
            e(s, b, (byte) (b | 37), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, fadingEdgeLength, i9, 986134021, false, (String) objArr25[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char longPressTimeout = (char) (29944 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                int scrollDefaultDelay = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                short s2 = (short) ($$b & 173);
                byte b2 = $$a[7];
                Object[] objArr26 = new Object[1];
                e(s2, b2, (byte) (b2 | 52), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iIndexOf, scrollDefaultDelay, 1599039318, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr27[0])[0]}, new int[]{((int[]) objArr27[1])[0]}, (Object[]) objArr27[2], new int[1], (String[]) objArr27[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = 196700473 + (((~(408032078 | iIdentityHashCode)) | (-195429653)) * 672);
            int i11 = ~iIdentityHashCode;
            int i12 = i10 + (((~(iIdentityHashCode | (-195429653))) | (~((-408032079) | i11))) * (-672)) + (((~(195429652 | i11)) | (-469112671)) * 672) + 1780641867;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[3])[0] = i14 ^ (i14 << 5);
            str13 = str13;
            str14 = str14;
        } else {
            str16 = str16;
            int iIntValue = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr28 = {-1800907900};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42050), View.combineMeasuredStates(0, 0) + 1726, 29 - (ViewConfiguration.getTapTimeout() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr28), 1780641867);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c5 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                    int i15 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    short s3 = (short) ($$b & 173);
                    byte b3 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    e(s3, b3, (byte) (b3 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c5, iIndexOf2, i15, 1599039318, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    long jLongValue = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
                        int iMyPid = 1755 - (Process.myPid() >> 22);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 23;
                        byte[] bArr2 = $$a;
                        short s4 = bArr2[0];
                        byte b4 = bArr2[7];
                        Object[] objArr30 = new Object[1];
                        e(s4, b4, (byte) (b4 | 52), objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, iMyPid, scrollBarFadeDuration, 1596667560, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int longPressTimeout2 = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0, 0);
                        byte[] bArr3 = $$a;
                        short s5 = bArr3[5];
                        byte b5 = bArr3[7];
                        Object[] objArr31 = new Object[1];
                        e(s5, b5, (byte) (b5 | 37), objArr31);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, longPressTimeout2, iIndexOf3, 986134021, false, (String) objArr31[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = f670a + 31;
            d = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(1509419416);
            int i21 = (-1939066929) + (((~((-1014585672) | iNextInt)) | 801983245) * (-318));
            int i22 = ~(801983245 | iNextInt);
            int i23 = ~iNextInt;
            int i24 = i20 + i21 + ((i22 | (~((-58982921) | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iNextInt | (-58982921))) | (~(1073568591 | i23))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            i = 0;
            ((int[]) objArr2[3])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str17 : strArr) {
                    arrayList.add(str17);
                }
            }
            int[] iArr = new int[i17];
            int i27 = i17 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i17 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[3])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i29 = ~layoutDirection;
            int i30 = i28 + (((~(174674879 | i29)) | (~((-387277306) | layoutDirection)) | (~(i29 | 387277305))) * 959) + 373768760 + (((~(layoutDirection | 387277305)) | (~(i29 | (-387277306))) | (~(174674879 | layoutDirection))) * 959);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            i = 0;
            ((int[]) objArr2[3])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c6 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iIndexOf4 = 876 - TextUtils.indexOf("", "", i);
            int iIndexOf5 = TextUtils.indexOf("", "") + 10;
            byte[] bArr4 = $$a;
            Object[] objArr32 = new Object[1];
            e((short) 140, (byte) (bArr4[205] + 1), bArr4[7], objArr32);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c6, iIndexOf4, iIndexOf5, 252381699, false, (String) objArr32[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
            int i33 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr5 = $$a;
            short s6 = bArr5[0];
            byte b6 = bArr5[7];
            Object[] objArr33 = new Object[1];
            e(s6, b6, (byte) (b6 | 52), objArr33);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, keyRepeatTimeout, i33, 2009631821, false, (String) objArr33[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cRed = (char) Color.red(0);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                byte[] bArr6 = $$a;
                Object[] objArr34 = new Object[1];
                e((short) 140, bArr6[91], bArr6[7], objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cRed, iResolveSizeAndState, deadChar, 256017550, false, (String) objArr34[0], null);
            }
            Object[] objArr35 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr35[0])[0]}, new int[1], new int[]{((int[]) objArr35[2])[0]}, (String[]) objArr35[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i34 = 1765969572 + ((~(iIdentityHashCode2 | 938818657)) * 216);
            int i35 = ~iIdentityHashCode2;
            int i36 = i34 + ((939474669 | i35) * (-216)) + (((~(i35 | 938818657)) | (-898508429)) * 216) + 1569187191;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr3[1])[0] = i38 ^ (i38 << 5);
            str = str16;
            str2 = str14;
            c = 2;
            str10 = "android.app.ActivityThread";
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                str = str16;
                baseContext = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            } else {
                str = str16;
            }
            if (baseContext != null) {
                int i39 = d + 31;
                f670a = i39 % 128;
                int i40 = i39 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            str2 = str14;
            try {
                Object[] objArr36 = {baseContext, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str2, Object.class).invoke(null, this)).intValue()), 1569187191};
                byte[] bArr7 = $$d;
                Object[] objArr37 = new Object[1];
                f(bArr7[72], bArr7[4], bArr7[274], objArr37);
                Class<?> cls = Class.forName((String) objArr37[0]);
                Object[] objArr38 = new Object[1];
                f(bArr7[454], bArr7[72], (byte) (-bArr7[6]), objArr38);
                Object[] objArr39 = (Object[]) cls.getMethod((String) objArr38[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr36);
                if (baseContext != null) {
                    int i41 = d + 53;
                    f670a = i41 % 128;
                    try {
                        if (i41 % 2 != 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iIndexOf6 = TextUtils.indexOf("", "", 0) + 876;
                                int i42 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                byte[] bArr8 = $$a;
                                Object[] objArr40 = new Object[1];
                                e((short) 140, bArr8[91], bArr8[7], objArr40);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatDelay, iIndexOf6, i42, 256017550, false, (String) objArr40[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr39);
                            long jLongValue3 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[1]).invoke(null, new Object[1])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                                int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                                byte[] bArr9 = $$a;
                                short s7 = bArr9[0];
                                byte b7 = bArr9[7];
                                Object[] objArr41 = new Object[1];
                                e(s7, b7, (byte) (b7 | 52), objArr41);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mirror, pressedStateDuration, packedPositionChild, 2009631821, false, (String) objArr41[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue3 << 108);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                int defaultSize = 876 - View.getDefaultSize(0, 0);
                                int windowTouchSlop = 10 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                byte[] bArr10 = $$a;
                                Object[] objArr42 = new Object[1];
                                e((short) 140, (byte) (bArr10[205] + 1), bArr10[7], objArr42);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cNormalizeMetaState, defaultSize, windowTouchSlop, 252381699, false, (String) objArr42[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                            objArr39 = objArr39;
                        } else {
                            str10 = "android.app.ActivityThread";
                            str2 = str2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                int maximumDrawingCacheSize2 = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                                byte[] bArr11 = $$a;
                                Object[] objArr43 = new Object[1];
                                e((short) 140, bArr11[91], bArr11[7], objArr43);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize2, capsMode, 256017550, false, (String) objArr43[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr39);
                            long jLongValue4 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf5 = Long.valueOf(jLongValue4);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                                int size = 10 - View.MeasureSpec.getSize(0);
                                byte[] bArr12 = $$a;
                                short s8 = bArr12[0];
                                byte b8 = bArr12[7];
                                Object[] objArr44 = new Object[1];
                                e(s8, b8, (byte) (b8 | 52), objArr44);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(touchSlop, packedPositionType, size, 2009631821, false, (String) objArr44[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                            Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                                int iAxisFromString = 875 - MotionEvent.axisFromString("");
                                int i43 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte[] bArr13 = $$a;
                                Object[] objArr45 = new Object[1];
                                e((short) 140, (byte) (bArr13[205] + 1), bArr13[7], objArr45);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(capsMode2, iAxisFromString, i43, 252381699, false, (String) objArr45[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
                        }
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str10 = "android.app.ActivityThread";
                    objArr39 = objArr39;
                    str2 = str2;
                }
                objArr3 = objArr39;
                c = 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i44 = ((int[]) objArr3[c])[0];
        int i45 = ((int[]) objArr3[0])[0];
        if (i45 == i44) {
            int i46 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i47 = ~startElapsedRealtime;
            int i48 = ~(552628828 | i47);
            int i49 = i46 + 2006952884 + (((-1056538336) | i48) * (-712)) + (((~(startElapsedRealtime | (-503909508))) | (~(i47 | 1056538335))) * (-712)) + ((512318599 | i48) * 712);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr4[1])[0] = i51 ^ (i51 << 5);
        } else {
            Toast.makeText((Context) null, i45 / (((i45 - 1) * i45) % 2), 0).show();
            int i52 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iNextInt2 = new Random().nextInt();
            int i53 = ~iNextInt2;
            int i54 = i52 + (-1055301081) + (((~((-993947426) | i53)) | (~(953637196 | iNextInt2))) * 217) + (((~(iNextInt2 | (-993947426))) | 52962849) * 217) + (((~(953637196 | i53)) | 993947425) * 217);
            int i55 = i54 ^ (i54 << 13);
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArr4[1])[0] = i56 ^ (i56 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651;
            int iArgb = 44 - Color.argb(0, 0, 0, 0);
            byte[] bArr14 = $$a;
            short s9 = bArr14[0];
            byte b9 = bArr14[7];
            Object[] objArr46 = new Object[1];
            e(s9, b9, (byte) (b9 | 52), objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(scrollBarFadeDuration2, scrollDefaultDelay2, iArgb, -459846511, false, (String) objArr46[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char c7 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int iResolveSizeAndState2 = 651 - View.resolveSizeAndState(0, 0, 0);
            int defaultSize2 = 44 - View.getDefaultSize(0, 0);
            byte[] bArr15 = $$a;
            Object[] objArr47 = new Object[1];
            e((short) 140, (byte) (bArr15[205] + 1), bArr15[7], objArr47);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c7, iResolveSizeAndState2, defaultSize2, -873460649, false, (String) objArr47[0], null);
        }
        if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char c8 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 651;
                int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44;
                byte[] bArr16 = $$a;
                short s10 = bArr16[5];
                byte b10 = bArr16[7];
                Object[] objArr48 = new Object[1];
                e(s10, b10, (byte) (b10 | 37), objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c8, absoluteGravity, scrollDefaultDelay3, -1595579076, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
            objArr5 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i57 = ((int[]) objArr49[2])[0];
            int i58 = ((int[]) objArr49[0])[0];
            int iNextInt3 = new Random().nextInt();
            int i59 = (((~((-270663702) | iNextInt3)) | (-401581824)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1168900992 + ((~((~iNextInt3) | (-270663702))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 2118134216;
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr5[3])[0] = i61 ^ (i61 << 5);
            c2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b((char) Drawable.resolveOpacity(0, 0), 1610 - (KeyEvent.getMaxKeyCode() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr50 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).newInstance(null), 2118134216, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int gidForName = Process.getGidForName("") + 652;
                int i62 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43;
                byte[] bArr17 = $$a;
                Object[] objArr51 = new Object[1];
                e((short) 140, (byte) (bArr17[205] + 1), bArr17[7], objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(threadPriority, gidForName, i62, 2075921419, false, (String) objArr51[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 694, Color.blue(0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 793 - (ViewConfiguration.getFadingEdgeLength() >> 16), 83 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
            }
            objArr5 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr50);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char c9 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int offsetAfter = 651 - TextUtils.getOffsetAfter("", 0);
                int iBlue = 44 - Color.blue(0);
                byte[] bArr18 = $$a;
                short s11 = bArr18[5];
                byte b11 = bArr18[7];
                Object[] objArr52 = new Object[1];
                e(s11, b11, (byte) (b11 | 37), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c9, offsetAfter, iBlue, -1595579076, false, (String) objArr52[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, objArr5);
            try {
                long jLongValue6 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c10 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int i63 = 651 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr19 = $$a;
                    Object[] objArr53 = new Object[1];
                    e((short) 140, (byte) (bArr19[205] + 1), bArr19[7], objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c10, i63, iLastIndexOf, -873460649, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char c11 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                    int i64 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr20 = $$a;
                    short s12 = bArr20[0];
                    byte b12 = bArr20[7];
                    Object[] objArr54 = new Object[1];
                    e(s12, b12, (byte) (b12 | 52), objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c11, maxKeyCode2, i64, -459846511, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, lValueOf8);
                c2 = 0;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr5[2])[c2] != ((int[]) objArr5[c2])[c2]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr2 = (String[]) objArr5[1];
            if (strArr2 != null) {
                for (String str18 : strArr2) {
                    arrayList2.add(str18);
                }
            }
            throw null;
        }
        int i65 = f670a + 105;
        d = i65 % 128;
        int i66 = i65 % 2;
        Object[] objArr55 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i67 = ((int[]) objArr5[3])[0];
        int i68 = ((int[]) objArr5[2])[0];
        int i69 = ((int[]) objArr5[0])[0];
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i70 = ~iIdentityHashCode3;
        int i71 = (-279679737) + (((~((-743447746) | i70)) | 738202689) * (-1188));
        int i72 = (~(iIdentityHashCode3 | 743447745)) | 738202689;
        int i73 = ~(746878555 | i70);
        int i74 = i67 + i71 + ((i72 | i73) * 594) + (((~(743447745 | i70)) | (-752123612) | i73) * 594);
        int i75 = i74 ^ (i74 << 13);
        int i76 = i75 ^ (i75 >>> 17);
        ((int[]) objArr55[3])[0] = i76 ^ (i76 << 5);
        int i77 = f670a + 45;
        d = i77 % 128;
        if (i77 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int i78 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33;
                short s13 = (short) ($$b & 173);
                byte b13 = $$a[7];
                Object[] objArr56 = new Object[1];
                e(s13, b13, (byte) (b13 | 52), objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(packedPositionType2, i78, keyRepeatDelay2, -887667012, false, (String) objArr56[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null);
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char c12 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 2267;
            int i79 = 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            short s14 = (short) ($$b & 173);
            byte b14 = $$a[7];
            Object[] objArr57 = new Object[1];
            e(s14, b14, (byte) (b14 | 52), objArr57);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c12, packedPositionType3, i79, -887667012, false, (String) objArr57[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int trimmedLength = 2267 - TextUtils.getTrimmedLength("");
                int iIndexOf7 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr21 = $$a;
                short s15 = bArr21[5];
                byte b15 = bArr21[7];
                Object[] objArr58 = new Object[1];
                e(s15, b15, (byte) (b15 | 37), objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cNormalizeMetaState2, trimmedLength, iIndexOf7, -654680577, false, (String) objArr58[0], null);
            }
            Object[] objArr59 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).get(null);
            objArr6 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i80 = ((int[]) objArr59[0])[0];
            int i81 = ((int[]) objArr59[3])[0];
            String[] strArr3 = (String[]) objArr59[1];
            int iNextInt4 = new Random().nextInt();
            int i82 = (((((~((-616677786) | iNextInt4)) | 184680962) * 449) + 458515462) + (((~((~iNextInt4) | (-616677786))) | 184680962) * 449)) - 1429969600;
            int i83 = (i82 << 13) ^ i82;
            int i84 = i83 ^ (i83 >>> 17);
            ((int[]) objArr6[2])[0] = i84 ^ (i84 << 5);
            objArr55 = objArr55;
            str3 = str2;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            str3 = str2;
            Object[] objArr60 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -1429969600};
            byte[] bArr22 = $$d;
            Object[] objArr61 = new Object[1];
            f(bArr22[58], (short) ($$e & 483), bArr22[227], objArr61);
            Class<?> cls2 = Class.forName((String) objArr61[0]);
            byte b16 = bArr22[4];
            Object[] objArr62 = new Object[1];
            f(b16, (short) (b16 | 102), bArr22[5], objArr62);
            Object[] objArr63 = (Object[]) cls2.getMethod((String) objArr62[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr60);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 2268;
                    int trimmedLength2 = TextUtils.getTrimmedLength("") + 33;
                    byte[] bArr23 = $$a;
                    short s16 = bArr23[5];
                    byte b17 = bArr23[7];
                    Object[] objArr64 = new Object[1];
                    e(s16, b17, (byte) (b17 | 37), objArr64);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(modifierMetaStateMask, packedPositionChild2, trimmedLength2, -654680577, false, (String) objArr64[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, objArr63);
                try {
                    long jLongValue7 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char cGreen = (char) Color.green(0);
                        int i85 = 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 33;
                        byte b18 = $$a[7];
                        Object[] objArr65 = new Object[1];
                        e((short) 140, b18, (byte) (b18 | 52), objArr65);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cGreen, i85, iArgb2, -874156483, false, (String) objArr65[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char c13 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int iIndexOf8 = 2266 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i86 = 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        short s17 = (short) ($$b & 173);
                        byte b19 = $$a[7];
                        Object[] objArr66 = new Object[1];
                        e(s17, b19, (byte) (b19 | 52), objArr66);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c13, iIndexOf8, i86, -887667012, false, (String) objArr66[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf10);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr55 = objArr55;
                objArr63 = objArr63;
            }
            objArr6 = objArr63;
        }
        int i87 = ((int[]) objArr6[3])[0];
        int i88 = ((int[]) objArr6[0])[0];
        if (i88 != i87) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr4 = (String[]) objArr6[1];
            if (strArr4 != null) {
                int i89 = d + 87;
                f670a = i89 % 128;
                int i90 = i89 % 2 != 0 ? 1 : 0;
                while (i90 < strArr4.length) {
                    arrayList3.add(strArr4[i90]);
                    i90++;
                }
            }
            throw new RuntimeException(String.valueOf(i88));
        }
        Object[] objArr67 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i91 = ((int[]) objArr6[2])[0];
        int i92 = ((int[]) objArr6[0])[0];
        int i93 = ((int[]) objArr6[3])[0];
        String[] strArr5 = (String[]) objArr6[1];
        String str19 = "currentApplication";
        int i94 = ~((Context) Class.forName(str10).getMethod(str19, new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
        int i95 = i91 + (-2062646021) + (((-155383874) | i94) * 184) + (((~(i94 | 649658914)) | (-801372260)) * 184);
        int i96 = (i95 << 13) ^ i95;
        int i97 = i96 ^ (i96 >>> 17);
        ((int[]) objArr67[2])[0] = i97 ^ (i97 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
            char c14 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3111;
            int capsMode3 = 22 - TextUtils.getCapsMode("", 0, 0);
            byte b20 = $$a[7];
            Object[] objArr68 = new Object[1];
            e((short) 140, b20, (byte) (b20 | 52), objArr68);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c14, iCombineMeasuredStates, capsMode3, -1272852037, false, (String) objArr68[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).getLong(null) != -1) {
            int i98 = f670a + 119;
            d = i98 % 128;
            int i99 = i98 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                int maxKeyCode3 = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
                int defaultSize3 = 22 - View.getDefaultSize(0, 0);
                byte[] bArr24 = $$a;
                short s18 = bArr24[5];
                byte b21 = bArr24[7];
                Object[] objArr69 = new Object[1];
                e(s18, b21, (byte) (b21 | 37), objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cLastIndexOf, maxKeyCode3, defaultSize3, 154975793, false, (String) objArr69[0], null);
            }
            Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            int i100 = ((int[]) objArr70[2])[0];
            int i101 = ((int[]) objArr70[1])[0];
            String[] strArr6 = (String[]) objArr70[3];
            int[] iArr2 = {i101};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i102 = ~iIdentityHashCode4;
            int i103 = ((((-1746892414) + ((~(521970880 | i102)) * (-560))) + ((~(iIdentityHashCode4 | (-1082135075))) * (-560))) + (((~(1183060578 | i102)) | 421045376) * 560)) - 856845995;
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            ((int[]) objArr7[0])[0] = i105 ^ (i105 << 5);
            objArr7 = new Object[]{new int[1], iArr2, new int[]{i100}, strArr6};
            str19 = str19;
            objArr67 = objArr67;
        } else {
            Object[] objArr71 = {null, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str3, Object.class).invoke(null, this)).intValue()), 0, -856845995};
            byte[] bArr25 = $$d;
            Object[] objArr72 = new Object[1];
            f(bArr25[206], (short) 102, bArr25[4], objArr72);
            Class<?> cls3 = Class.forName((String) objArr72[0]);
            Object[] objArr73 = new Object[1];
            f((byte) (bArr25[102] - 1), (short) ModuleDescriptor.MODULE_VERSION, (byte) (-bArr25[6]), objArr73);
            Object[] objArr74 = (Object[]) cls3.getMethod((String) objArr73[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr71);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 43043);
                int iIndexOf9 = 3111 - TextUtils.indexOf("", "", 0, 0);
                int pressedStateDuration2 = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr26 = $$a;
                short s19 = bArr26[5];
                byte b22 = bArr26[7];
                Object[] objArr75 = new Object[1];
                e(s19, b22, (byte) (b22 | 37), objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(packedPositionChild3, iIndexOf9, pressedStateDuration2, 154975793, false, (String) objArr75[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr74);
            try {
                long jLongValue8 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char packedPositionGroup = (char) (43042 - ExpandableListView.getPackedPositionGroup(0L));
                    int defaultSize4 = View.getDefaultSize(0, 0) + 3111;
                    int iArgb3 = Color.argb(0, 0, 0, 0) + 22;
                    short s20 = (short) ($$b & 173);
                    byte b23 = $$a[7];
                    Object[] objArr76 = new Object[1];
                    e(s20, b23, (byte) (b23 | 52), objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(packedPositionGroup, defaultSize4, iArgb3, -1269618118, false, (String) objArr76[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char cMyTid = (char) (43042 - (Process.myTid() >> 22));
                    int pressedStateDuration3 = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b24 = $$a[7];
                    Object[] objArr77 = new Object[1];
                    e((short) 140, b24, (byte) (b24 | 52), objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cMyTid, pressedStateDuration3, packedPositionGroup2, -1272852037, false, (String) objArr77[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf12);
                objArr7 = objArr74;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr7[2])[0] != ((int[]) objArr7[1])[0]) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr7 = (String[]) objArr7[3];
            if (strArr7 != null) {
                for (String str20 : strArr7) {
                    arrayList4.add(str20);
                }
            }
            throw null;
        }
        int i106 = ((int[]) objArr7[0])[0];
        int i107 = ((int[]) objArr7[2])[0];
        int i108 = ((int[]) objArr7[1])[0];
        String[] strArr8 = (String[]) objArr7[3];
        int[] iArr3 = {i108};
        int i109 = ~System.identityHashCode(this);
        int i110 = ~(168008013 | i109);
        int i111 = i106 + 1989421462 + ((i110 | 1537023445) * 764) + (((~(i109 | 1537023445)) | 163848) * (-1528)) + ((1369343128 | i110) * 764);
        int i112 = (i111 << 13) ^ i111;
        int i113 = i112 ^ (i112 >>> 17);
        ((int[]) objArr[0])[0] = i113 ^ (i113 << 5);
        Object[] objArr78 = {new int[1], iArr3, new int[]{i107}, strArr8};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (TextUtils.getTrimmedLength("") + 46400), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, 18 - TextUtils.indexOf((CharSequence) "", '0'), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 46400), 39 - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(obj, null);
        super.onCreate(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char c15 = (char) (37567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
            int scrollBarFadeDuration3 = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr27 = $$a;
            Object[] objArr79 = new Object[1];
            e((short) 140, (byte) (bArr27[205] + 1), bArr27[7], objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(c15, minimumFlingVelocity, scrollBarFadeDuration3, -477065106, false, (String) objArr79[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37567);
            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 625;
            int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 14;
            byte b25 = $$a[7];
            Object[] objArr80 = new Object[1];
            e((short) 140, b25, (byte) (b25 | 52), objArr80);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(edgeSlop, keyRepeatTimeout2, capsMode4, -976899241, false, (String) objArr80[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char c16 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37567);
                int iRed = Color.red(0) + 625;
                int iCombineMeasuredStates2 = 14 - View.combineMeasuredStates(0, 0);
                short s21 = (short) ($$b & 173);
                byte b26 = $$a[7];
                Object[] objArr81 = new Object[1];
                e(s21, b26, (byte) (b26 | 52), objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(c16, iRed, iCombineMeasuredStates2, -973632554, false, (String) objArr81[0], null);
            }
            Object[] objArr82 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            int i114 = ((int[]) objArr82[2])[0];
            int i115 = ((int[]) objArr82[0])[0];
            String[] strArr9 = (String[]) objArr82[3];
            int[] iArr4 = {i114};
            int[] iArr5 = {i115};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i116 = ~iIdentityHashCode5;
            int i117 = ~(69051625 | i116);
            int i118 = (-595077320) + ((1753366550 | i117) * (-712)) + (((~(iIdentityHashCode5 | 1822418175)) | (~(i116 | (-1753366551)))) * (-712)) + (((-1754686496) | i117) * 712) + 171481581;
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            ((int[]) objArr8[1])[0] = i120 ^ (i120 << 5);
            objArr8 = new Object[]{iArr5, new int[1], iArr4, strArr9};
            c3 = 0;
            str4 = str19;
            str5 = "";
            str3 = str3;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str3, Object.class).invoke(null, this)).intValue();
            str4 = str19;
            Object[] objArr83 = new Object[1];
            c(new char[]{45950, 22598, 26100, 29024, 7825, 10757, 14256, 50035, 59405, 62925, 33148, 44732, 47645, 18314, 21311, 30968, 1419, 4386, 16052, 51732, 55253, 58208, 35057, 38359, 41281, 20140, 23144, 26568, 29531, 6331, 9338, 12548, 56981, 60002, 63424, 33624, 43233, 46198, 16654, 28356, 31346, 1982, 4942, 14545, 50238, 53674, 65165, 35352, 38909, 41795, 18650, 21552, 25076, 3727, 6676, 10231, 13117, 55491, 58462, 61883, 40234, 43609, 47004, 17279}, ((Context) Class.forName(str10).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60235, objArr83);
            String str21 = (String) objArr83[0];
            Object[] objArr84 = new Object[1];
            c(new char[]{45871, 29908, 15578, 58513, 44184, 21668, 7416, 50356, 36065, 46315, 31942, 9373, 60549, 38107, 23732, 1263, 52462, 62710, 48376, 25604, 11277, 54294, 40012, 17445, 3190, 13353, 64612, 42038, 27715, 5184, 56411, 33875, 19541, 29751, 15467, 58486, 44156, 21972, 7643, 50577, 36246, 46536, 32240, 9641, 60855, 38333, 24001, 1480, 52677, 62854, 48599, 26094, 11706, 54773, 40441, 17665, 3415, 13659, 64788, 42267, 28017, 5417, 56628, 34157}, ((Context) Class.forName(str10).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step5).substring(0, 3).length() + 51190, objArr84);
            Object[] objArr85 = {baseContext3, new String[]{str21, (String) objArr84[0]}, Integer.valueOf(iIntValue2), 17, 171481581};
            byte[] bArr28 = $$d;
            Object[] objArr86 = new Object[1];
            f(bArr28[151], (short) DerHeader.TAG_CLASS_PRIVATE, bArr28[209], objArr86);
            Class<?> cls4 = Class.forName((String) objArr86[0]);
            Object[] objArr87 = new Object[1];
            f(bArr28[454], bArr28[72], (byte) (-bArr28[6]), objArr87);
            Object[] objArr88 = (Object[]) cls4.getMethod((String) objArr87[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr85);
            int i121 = ((int[]) objArr88[0])[0];
            int i122 = ((int[]) objArr88[2])[0];
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char mirror2 = (char) (37615 - AndroidCharacter.getMirror('0'));
                    int i123 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iRed2 = Color.red(0) + 14;
                    short s22 = (short) ($$b & 173);
                    byte b27 = $$a[7];
                    Object[] objArr89 = new Object[1];
                    e(s22, b27, (byte) (b27 | 52), objArr89);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(mirror2, i123, iRed2, -973632554, false, (String) objArr89[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr88);
                try {
                    long jLongValue10 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                        str5 = r14;
                        char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) str5, '0', 0));
                        int i124 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                        int iIndexOf10 = 13 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                        byte b28 = $$a[7];
                        Object[] objArr90 = new Object[1];
                        e((short) 140, b28, (byte) (b28 | 52), objArr90);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cIndexOf, i124, iIndexOf10, -976899241, false, (String) objArr90[0], null);
                    } else {
                        str5 = r14;
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cIndexOf2 = (char) (37567 - TextUtils.indexOf(str5, str5, 0, 0));
                        int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 625;
                        int iMakeMeasureSpec = 14 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr29 = $$a;
                        Object[] objArr91 = new Object[1];
                        e((short) 140, (byte) (bArr29[205] + 1), bArr29[7], objArr91);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cIndexOf2, keyRepeatDelay3, iMakeMeasureSpec, -477065106, false, (String) objArr91[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr88 = objArr88;
                str5 = r14;
                str3 = str3;
            }
            objArr8 = objArr88;
            c3 = 0;
        }
        int i125 = ((int[]) objArr8[c3])[c3];
        int i126 = ((int[]) objArr8[2])[c3];
        if (i126 == i125) {
            int i127 = f670a + 111;
            d = i127 % 128;
            int i128 = i127 % 2;
            int i129 = ((int[]) objArr8[1])[0];
            int i130 = ((int[]) objArr8[2])[0];
            int i131 = ((int[]) objArr8[0])[0];
            String[] strArr10 = (String[]) objArr8[3];
            int[] iArr6 = {i130};
            int i132 = ((Context) Class.forName(str10).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i133 = ~((-1766159106) | i132);
            int i134 = ~i132;
            int i135 = i133 | (~(57579015 | i134));
            int i136 = ~(1766159105 | i134);
            int i137 = i129 + (-1312198416) + ((i135 | i136) * (-516)) + (((~(i132 | (-21238274))) | (~((-36340743) | i134))) * 516) + ((36340742 | i136) * 516);
            int i138 = i137 ^ (i137 << 13);
            int i139 = i138 ^ (i138 >>> 17);
            ((int[]) objArr9[1])[0] = i139 ^ (i139 << 5);
            objArr9 = new Object[]{new int[]{i131}, new int[1], iArr6, strArr10};
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr11 = (String[]) objArr8[3];
            if (strArr11 != null) {
                for (String str22 : strArr11) {
                    arrayList5.add(str22);
                }
            }
            int[] iArr7 = new int[i126];
            int i140 = i126 - 1;
            iArr7[i140] = 1;
            Toast.makeText((Context) null, iArr7[((i126 * i140) % 2) - 1], 1).show();
            int i141 = ((int[]) objArr8[1])[0];
            int i142 = ((int[]) objArr8[2])[0];
            int i143 = ((int[]) objArr8[0])[0];
            String[] strArr12 = (String[]) objArr8[3];
            int[] iArr8 = {i142};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i144 = ~iMaxMemory;
            int i145 = i141 + 196458960 + (((~((-389621888) | i144)) | 1434116233) * 519) + (((~(i144 | (-33622135))) | (~(1467738367 | iMaxMemory))) * (-519)) + (((~(iMaxMemory | 1434116233)) | 389621887) * 519);
            int i146 = (i145 << 13) ^ i145;
            int i147 = i146 ^ (i146 >>> 17);
            ((int[]) objArr[1])[0] = i147 ^ (i147 << 5);
            Object[] objArr92 = {new int[]{i143}, new int[1], iArr8, strArr12};
            objArr9 = objArr92;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char c17 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int touchSlop2 = 876 - (ViewConfiguration.getTouchSlop() >> 8);
            int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
            byte[] bArr30 = $$a;
            short s23 = bArr30[5];
            byte b29 = bArr30[7];
            Object[] objArr93 = new Object[1];
            e(s23, b29, (byte) (b29 | 37), objArr93);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c17, touchSlop2, maximumDrawingCacheSize3, -1650998592, false, (String) objArr93[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(str5));
            int i148 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int touchSlop3 = 10 - (ViewConfiguration.getTouchSlop() >> 8);
            short s24 = (short) ($$b & 173);
            byte b30 = $$a[7];
            Object[] objArr94 = new Object[1];
            e(s24, b30, (byte) (b30 | 52), objArr94);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cAxisFromString, i148, touchSlop3, 2012020043, false, (String) objArr94[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char c18 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int windowTouchSlop2 = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i149 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                byte b31 = $$a[7];
                Object[] objArr95 = new Object[1];
                e((short) 140, b31, (byte) (b31 | 52), objArr95);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c18, windowTouchSlop2, i149, 2012931276, false, (String) objArr95[0], null);
            }
            Object[] objArr96 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr96[0])[0]}, new int[1], new int[]{((int[]) objArr96[2])[0]}, (String[]) objArr96[3]};
            int i150 = ~new Random().nextInt();
            int i151 = (((-2020454220) + (((~(i150 | 905690405)) | 33817168) * (-160))) + (((~(i150 | 865380176)) | 905690405) * 160)) - 856032807;
            int i152 = (i151 << 13) ^ i151;
            int i153 = i152 ^ (i152 >>> 17);
            ((int[]) objArr10[1])[0] = i153 ^ (i153 << 5);
            str6 = str3;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str15).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            str6 = str3;
            Object[] objArr97 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -856032807};
            byte[] bArr31 = $$d;
            Object[] objArr98 = new Object[1];
            f(bArr31[97], (short) 231, bArr31[209], objArr98);
            Class<?> cls5 = Class.forName((String) objArr98[0]);
            Object[] objArr99 = new Object[1];
            f(bArr31[454], (short) 271, (byte) (-bArr31[6]), objArr99);
            Object[] objArr100 = (Object[]) cls5.getMethod((String) objArr99[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr97);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str5, '0') + 1);
                    int i154 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iBlue2 = Color.blue(0) + 10;
                    byte b32 = $$a[7];
                    Object[] objArr101 = new Object[1];
                    e((short) 140, b32, (byte) (b32 | 52), objArr101);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cLastIndexOf2, i154, iBlue2, 2012931276, false, (String) objArr101[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr100);
                try {
                    long jLongValue12 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                        char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str5, '0', 0));
                        int offsetAfter2 = 876 - TextUtils.getOffsetAfter(str5, 0);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
                        short s25 = (short) ($$b & 173);
                        byte b33 = $$a[7];
                        Object[] objArr102 = new Object[1];
                        e(s25, b33, (byte) (b33 | 52), objArr102);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cIndexOf3, offsetAfter2, iResolveOpacity, 2012020043, false, (String) objArr102[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char cBlue = (char) Color.blue(0);
                        int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString(str5);
                        int i155 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte[] bArr32 = $$a;
                        short s26 = bArr32[5];
                        byte b34 = bArr32[7];
                        Object[] objArr103 = new Object[1];
                        e(s26, b34, (byte) (b34 | 37), objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cBlue, iKeyCodeFromString, i155, -1650998592, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr100 = objArr100;
            }
            objArr10 = objArr100;
        }
        int i156 = ((int[]) objArr10[2])[0];
        int i157 = ((int[]) objArr10[0])[0];
        if (i157 != i156) {
            throw new RuntimeException(String.valueOf(i157));
        }
        int i158 = ((int[]) objArr10[1])[0];
        Object[] objArr104 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
        int i159 = (int) Runtime.getRuntime().totalMemory();
        int i160 = ~i159;
        int i161 = (-1946645980) + (((~((-73867494) | i160)) | (~((-588832529) | i159))) * 520);
        int i162 = ~(588832528 | i160);
        int i163 = ~(i159 | 629142757);
        int i164 = i158 + i161 + ((i162 | i163) * (-1040)) + ((i163 | (~(i160 | (-629142758))) | (-662700022)) * 520);
        int i165 = (i164 << 13) ^ i164;
        int i166 = i165 ^ (i165 >>> 17);
        ((int[]) objArr104[1])[0] = i166 ^ (i166 << 5);
        int i167 = f670a + 101;
        d = i167 % 128;
        int i168 = i167 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char cLastIndexOf3 = (char) ((-1) - TextUtils.lastIndexOf(str5, '0', 0, 0));
            int iIndexOf11 = 875 - TextUtils.indexOf((CharSequence) str5, '0', 0);
            int iArgb4 = 10 - Color.argb(0, 0, 0, 0);
            short s27 = (short) DerHeader.TAG_CLASS_PRIVATE;
            byte[] bArr33 = $$a;
            Object[] objArr105 = new Object[1];
            e(s27, bArr33[205], bArr33[9], objArr105);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cLastIndexOf3, iIndexOf11, iArgb4, -1199417970, false, (String) objArr105[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
            int pressedStateDuration4 = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int i169 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr34 = $$a;
            Object[] objArr106 = new Object[1];
            e((short) 202, bArr34[27], bArr34[7], objArr106);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(cRgb, pressedStateDuration4, i169, 254769921, false, (String) objArr106[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int i170 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int iIndexOf12 = TextUtils.indexOf((CharSequence) str5, '0', 0, 0) + 11;
                byte[] bArr35 = $$a;
                Object[] objArr107 = new Object[1];
                e((short) 202, bArr35[205], bArr35[78], objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(longPressTimeout3, i170, iIndexOf12, 1324201839, false, (String) objArr107[0], null);
            }
            Object[] objArr108 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr108[0])[0]}, new int[1], new int[]{((int[]) objArr108[2])[0]}, (String[]) objArr108[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i171 = ~(899528801 | iFreeMemory);
            int i172 = ~iFreeMemory;
            int i173 = i171 | (~(939839030 | i172));
            int i174 = ~((-899528802) | i172);
            int i175 = 114281332 + ((i173 | i174) * (-516)) + (((~(iFreeMemory | (-134235671))) | (~((-805603361) | i172))) * 516) + ((805603360 | i174) * 516) + 1055307739;
            int i176 = (i175 << 13) ^ i175;
            int i177 = i176 ^ (i176 >>> 17);
            ((int[]) objArr11[1])[0] = i177 ^ (i177 << 5);
        } else {
            Object[] objArr109 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1055307739};
            byte[] bArr36 = $$d;
            Object[] objArr110 = new Object[1];
            f((byte) 104, (short) 323, bArr36[209], objArr110);
            Class<?> cls6 = Class.forName((String) objArr110[0]);
            Object[] objArr111 = new Object[1];
            f(bArr36[454], (short) 271, (byte) (-bArr36[6]), objArr111);
            objArr11 = (Object[]) cls6.getMethod((String) objArr111[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr109);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char trimmedLength3 = (char) TextUtils.getTrimmedLength(str5);
                int iIndexOf13 = 876 - TextUtils.indexOf(str5, str5, 0, 0);
                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 10;
                byte[] bArr37 = $$a;
                Object[] objArr112 = new Object[1];
                e((short) 202, bArr37[205], bArr37[78], objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(trimmedLength3, iIndexOf13, deadChar2, 1324201839, false, (String) objArr112[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr11);
            try {
                long jLongValue14 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char trimmedLength4 = (char) TextUtils.getTrimmedLength(str5);
                    int i178 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i179 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                    byte[] bArr38 = $$a;
                    Object[] objArr113 = new Object[1];
                    e((short) 202, bArr38[27], bArr38[7], objArr113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(trimmedLength4, i178, i179, 254769921, false, (String) objArr113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int iBlue3 = Color.blue(0) + 876;
                    int iBlue4 = Color.blue(0) + 10;
                    short s28 = (short) DerHeader.TAG_CLASS_PRIVATE;
                    byte[] bArr39 = $$a;
                    Object[] objArr114 = new Object[1];
                    e(s28, bArr39[205], bArr39[9], objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cResolveSizeAndState, iBlue3, iBlue4, -1199417970, false, (String) objArr114[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf18);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i180 = ((int[]) objArr11[2])[0];
        int i181 = ((int[]) objArr11[0])[0];
        if (i181 == i180) {
            int i182 = ((int[]) objArr11[1])[0];
            objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i183 = ~iIdentityHashCode6;
            int i184 = i182 + (-1215075052) + ((iIdentityHashCode6 | (-239227060)) * 140) + (((~((-239227060) | i183)) | 16512) * (-280)) + (((~(iIdentityHashCode6 | (-16513))) | (~(279537288 | i183)) | (-518747836)) * 140);
            int i185 = (i184 << 13) ^ i184;
            int i186 = i185 ^ (i185 >>> 17);
            i2 = 0;
            ((int[]) objArr12[1])[0] = i186 ^ (i186 << 5);
            str7 = str4;
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr11[3];
            if (strArr13 != null) {
                int i187 = d + 81;
                f670a = i187 % 128;
                for (int i188 = i187 % 2 != 0 ? 1 : 0; i188 < strArr13.length; i188++) {
                    arrayList6.add(strArr13[i188]);
                }
            }
            int[] iArr9 = new int[i181];
            int i189 = i181 - 1;
            iArr9[i189] = 1;
            Toast.makeText((Context) null, iArr9[((i181 * i189) % 2) - 1], 1).show();
            int i190 = ((int[]) objArr11[1])[0];
            objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            str7 = str4;
            int i191 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1565909768;
            int i192 = ~i191;
            int i193 = i190 + 46018238 + (((~(605581052 | i192)) | (~((-645891282) | i191))) * 210) + (((~(i191 | 645918461)) | (~(i192 | (-605553873)))) * 210);
            int i194 = (i193 << 13) ^ i193;
            int i195 = i194 ^ (i194 >>> 17);
            i2 = 0;
            ((int[]) objArr12[1])[0] = i195 ^ (i195 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char cIndexOf4 = (char) (53893 - TextUtils.indexOf(str5, str5, i2, i2));
            int scrollBarFadeDuration4 = 1320 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str5) + 36;
            byte[] bArr40 = $$a;
            Object[] objArr115 = new Object[1];
            e((short) 140, (byte) (bArr40[205] + 1), bArr40[7], objArr115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf4, scrollBarFadeDuration4, iKeyCodeFromString2, -1433084963, false, (String) objArr115[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char modifierMetaStateMask2 = (char) (53892 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int doubleTapTimeout = 1320 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i196 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36;
                short s29 = (short) ($$b & 173);
                byte b35 = $$a[7];
                Object[] objArr116 = new Object[1];
                e(s29, b35, (byte) (b35 | 52), objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(modifierMetaStateMask2, doubleTapTimeout, i196, -1920778747, false, (String) objArr116[0], null);
            }
            Object[] objArr117 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).get(null);
            objArr13 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i197 = ((int[]) objArr117[0])[0];
            int i198 = ((int[]) objArr117[3])[0];
            String[] strArr14 = (String[]) objArr117[2];
            int i199 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i200 = ~i199;
            int i201 = 785775555 + (((~(i200 | 1189380399)) | (-1324195312) | (~((-46432514) | i199))) * 717) + (((~(i199 | 1189380399)) | (~(i200 | (-46432514))) | (-1324195312)) * 717) + 1900515114;
            int i202 = (i201 << 13) ^ i201;
            int i203 = i202 ^ (i202 >>> 17);
            ((int[]) objArr13[1])[0] = i203 ^ (i203 << 5);
            objArr12 = objArr12;
            str8 = str;
            c4 = 3;
            str12 = str12;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str15).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                str8 = str;
                if ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) {
                    str8 = str;
                    baseContext5 = null;
                } else {
                    str8 = str;
                    str8 = str;
                    baseContext5 = baseContext5.getApplicationContext();
                }
            }
            str8 = str;
            str8 = str;
            int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr118 = {-1851240757};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b((char) (47976 - TextUtils.lastIndexOf(str5, '0', 0, 0)), 1300 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 20 - KeyEvent.normalizeMetaState(0), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr119 = {baseContext5, "com.bpjstku", 1900515114, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).newInstance(objArr118), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char offsetBefore = (char) (TextUtils.getOffsetBefore(str5, 0) + 53893);
                int i204 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1319;
                int iRed3 = 36 - Color.red(0);
                short s30 = (short) ($$b & 173);
                byte b36 = $$a[7];
                Object[] objArr120 = new Object[1];
                e(s30, b36, (byte) (b36 | 52), objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(offsetBefore, i204, iRed3, 819724799, false, (String) objArr120[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.green(0) + 57878), 1394 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf(str5, str5) + 75), Boolean.TYPE});
            }
            Object[] objArr121 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).invoke(null, objArr119);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char c19 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 53893);
                    int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1320;
                    int iGreen = Color.green(0) + 36;
                    short s31 = (short) ($$b & 173);
                    byte b37 = $$a[7];
                    Object[] objArr122 = new Object[1];
                    e(s31, b37, (byte) (b37 | 52), objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c19, windowTouchSlop3, iGreen, -1920778747, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, objArr121);
                try {
                    long jLongValue15 = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                        char c20 = (char) (53894 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1321;
                        int iIndexOf14 = TextUtils.indexOf(str5, str5, 0, 0) + 36;
                        byte[] bArr41 = $$a;
                        short s32 = bArr41[5];
                        byte b38 = bArr41[7];
                        Object[] objArr123 = new Object[1];
                        e(s32, b38, (byte) (b38 | 37), objArr123);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(c20, bitsPerPixel, iIndexOf14, -1273706634, false, (String) objArr123[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char cLastIndexOf4 = (char) (53892 - TextUtils.lastIndexOf(str5, '0', 0));
                        int iBlue5 = Color.blue(0) + 1320;
                        int iArgb5 = Color.argb(0, 0, 0, 0) + 36;
                        byte[] bArr42 = $$a;
                        Object[] objArr124 = new Object[1];
                        e((short) 140, (byte) (bArr42[205] + 1), bArr42[7], objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cLastIndexOf4, iBlue5, iArgb5, -1433084963, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf20);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                str12 = str12;
                objArr121 = objArr121;
            }
            objArr13 = objArr121;
            c4 = 3;
        }
        int i205 = ((int[]) objArr13[c4])[0];
        int i206 = ((int[]) objArr13[0])[0];
        if (i206 == i205) {
            objArr14 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i207 = ((int[]) objArr13[1])[0];
            int i208 = ((int[]) objArr13[0])[0];
            int i209 = ((int[]) objArr13[3])[0];
            String[] strArr15 = (String[]) objArr13[2];
            int i210 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i211 = i207 + (((634339876 + (((-403841266) | (~i210)) * (-490))) + (((~(i210 | (-957787648))) | 553946382) * 490)) - 428224308);
            int i212 = (i211 << 13) ^ i211;
            int i213 = i212 ^ (i212 >>> 17);
            ((int[]) objArr14[1])[0] = i213 ^ (i213 << 5);
            i3 = 0;
        } else {
            int[] iArr10 = new int[i206];
            int i214 = i206 - 1;
            iArr10[i214] = 1;
            Toast.makeText((Context) null, iArr10[((i206 * i214) % 2) - 1], 1).show();
            objArr14 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i215 = ((int[]) objArr13[1])[0];
            int i216 = ((int[]) objArr13[0])[0];
            int i217 = ((int[]) objArr13[3])[0];
            String[] strArr16 = (String[]) objArr13[2];
            int i218 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            int i219 = ~(1021837721 | i218);
            int i220 = i215 + (-1252937789) + ((138310 | i219) * (-814)) + ((i219 | (~((~i218) | (-348790104))) | 673185928) * 407) + (((~(i218 | 348790103)) | (~((-1021837722) | i218)) | 673185928) * 407);
            int i221 = (i220 << 13) ^ i220;
            int i222 = i221 ^ (i221 >>> 17);
            i3 = 0;
            ((int[]) objArr14[1])[0] = i222 ^ (i222 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
            char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
            int iResolveOpacity2 = Drawable.resolveOpacity(i3, i3) + 921;
            int iIndexOf15 = 28 - TextUtils.indexOf(str5, str5);
            byte[] bArr43 = $$a;
            Object[] objArr125 = new Object[1];
            e((short) 140, (byte) (bArr43[205] + 1), bArr43[7], objArr125);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(edgeSlop2, iResolveOpacity2, iIndexOf15, -1048449946, false, (String) objArr125[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                char windowTouchSlop4 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 31533);
                int iBlue6 = Color.blue(0) + 921;
                int iLastIndexOf2 = TextUtils.lastIndexOf(str5, '0') + 29;
                byte[] bArr44 = $$a;
                short s33 = bArr44[5];
                byte b39 = bArr44[7];
                Object[] objArr126 = new Object[1];
                e(s33, b39, (byte) (b39 | 37), objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(windowTouchSlop4, iBlue6, iLastIndexOf2, -1142834547, false, (String) objArr126[0], null);
            }
            Object[] objArr127 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).get(null);
            objArr15 = new Object[]{new int[1], new int[]{((int[]) objArr127[1])[0]}, (Object[]) objArr127[2], new int[]{((int[]) objArr127[3])[0]}, (String[]) objArr127[4]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i223 = ~iIdentityHashCode7;
            int i224 = (~((-595156030) | i223)) | 37769244;
            int i225 = ~(iIdentityHashCode7 | 1736310399);
            int i226 = (-740596349) + ((i224 | i225) * (-502)) + ((i225 | (~(i223 | (-557386786)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 567323857;
            int i227 = (i226 << 13) ^ i226;
            int i228 = i227 ^ (i227 >>> 17);
            ((int[]) objArr15[0])[0] = i228 ^ (i228 << 5);
            str9 = str12;
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str15).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr128 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 567323857};
            byte[] bArr45 = $$d;
            Object[] objArr129 = new Object[1];
            f((byte) (bArr45[102] - 1), (short) 427, bArr45[209], objArr129);
            Class<?> cls7 = Class.forName((String) objArr129[0]);
            Object[] objArr130 = new Object[1];
            f(bArr45[454], (short) 271, (byte) (-bArr45[6]), objArr130);
            Object[] objArr131 = (Object[]) cls7.getMethod((String) objArr130[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr128);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                char bitsPerPixel2 = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 921;
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                byte[] bArr46 = $$a;
                short s34 = bArr46[5];
                byte b40 = bArr46[7];
                Object[] objArr132 = new Object[1];
                e(s34, b40, (byte) (b40 | 37), objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(bitsPerPixel2, iCombineMeasuredStates3, scrollBarSize, -1142834547, false, (String) objArr132[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, objArr131);
            try {
                str9 = str12;
                long jLongValue16 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char c21 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                    int iAxisFromString2 = MotionEvent.axisFromString(str5) + 922;
                    int iKeyCodeFromString3 = 28 - KeyEvent.keyCodeFromString(str5);
                    short s35 = (short) ($$b & 173);
                    byte b41 = $$a[7];
                    Object[] objArr133 = new Object[1];
                    e(s35, b41, (byte) (b41 | 52), objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c21, iAxisFromString2, iKeyCodeFromString3, -778300370, false, (String) objArr133[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                    char c22 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                    int iIndexOf16 = 920 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                    int iResolveOpacity3 = 28 - Drawable.resolveOpacity(0, 0);
                    byte[] bArr47 = $$a;
                    Object[] objArr134 = new Object[1];
                    e((short) 140, (byte) (bArr47[205] + 1), bArr47[7], objArr134);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c22, iIndexOf16, iResolveOpacity3, -1048449946, false, (String) objArr134[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf22);
                objArr15 = objArr131;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i229 = ((int[]) objArr15[1])[0];
        int i230 = ((int[]) objArr15[3])[0];
        if (i230 == i229) {
            int i231 = ((int[]) objArr15[0])[0];
            objArr16 = new Object[]{new int[1], new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[]{((int[]) objArr15[3])[0]}, (String[]) objArr15[4]};
            int length = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_user_canceled_liveness).substring(3, 4).length() - 48261529;
            int i232 = ~((-271728329) | length);
            int i233 = ~length;
            int i234 = i231 + 1687429059 + ((i232 | (~(1502351315 | i233))) * (-1808)) + (((~((-268439233) | length)) | (~(i233 | 1505640411))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(length | (-1502351316))) | 3289096 | (~(271728328 | i233))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i235 = (i234 << 13) ^ i234;
            int i236 = i235 ^ (i235 >>> 17);
            i4 = 0;
            ((int[]) objArr16[0])[0] = i236 ^ (i236 << 5);
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr15[4];
            if (strArr17 != null) {
                for (String str23 : strArr17) {
                    arrayList7.add(str23);
                }
            }
            Toast.makeText((Context) null, i230 / (((i230 - 1) * i230) % 2), 0).show();
            int i237 = ((int[]) objArr15[0])[0];
            objArr16 = new Object[]{new int[1], new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[]{((int[]) objArr15[3])[0]}, (String[]) objArr15[4]};
            int iCodePointAt3 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_frame_your_face_out_of_box).substring(15, 16).codePointAt(0) + 1090652174;
            int i238 = i237 + 260512925 + (((~((-335958301) | iCodePointAt3)) | (~((~iCodePointAt3) | 1438121343))) * (-318)) + (((~(355925278 | iCodePointAt3)) | 1082196065) * (-318)) + (((~(iCodePointAt3 | (-355925279))) | (-1418154366)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i239 = (i238 << 13) ^ i238;
            int i240 = i239 ^ (i239 >>> 17);
            i4 = 0;
            ((int[]) objArr16[0])[0] = i240 ^ (i240 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
            char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iLastIndexOf3 = TextUtils.lastIndexOf(str5, '0', i4) + 1032;
            int touchSlop5 = 15 - (ViewConfiguration.getTouchSlop() >> 8);
            byte b42 = $$a[7];
            Object[] objArr135 = new Object[1];
            e((short) 140, b42, (byte) (b42 | 52), objArr135);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(touchSlop4, iLastIndexOf3, touchSlop5, 1357589585, false, (String) objArr135[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).getLong(null);
        long jLongValue17 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
            char cLastIndexOf5 = (char) (TextUtils.lastIndexOf(str5, '0') + 1);
            int mode = 1031 - View.MeasureSpec.getMode(0);
            int iKeyCodeFromString4 = KeyEvent.keyCodeFromString(str5) + 15;
            short s36 = (short) ($$b & 173);
            byte b43 = $$a[7];
            Object[] objArr136 = new Object[1];
            e(s36, b43, (byte) (b43 | 52), objArr136);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cLastIndexOf5, mode, iKeyCodeFromString4, 1344079056, false, (String) objArr136[0], null);
        }
        if (j6 == ((jLongValue17 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                char cRed2 = (char) Color.red(0);
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int iMyTid = 15 - (Process.myTid() >> 22);
                byte[] bArr48 = $$a;
                Object[] objArr137 = new Object[1];
                e((short) 140, (byte) (bArr48[205] + 1), bArr48[7], objArr137);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cRed2, threadPriority2, iMyTid, 632103528, false, (String) objArr137[0], null);
            }
            Object[] objArr138 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).get(null);
            objArr17 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i241 = ((int[]) objArr138[3])[0];
            int i242 = ((int[]) objArr138[1])[0];
            String[] strArr18 = (String[]) objArr138[0];
            int iCodePointAt4 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, 3).codePointAt(1) + 1554309553;
            int i243 = (-569610185) + (((~((~iCodePointAt4) | (-203686146))) | (~(234732381 | iCodePointAt4))) * (-302)) + ((~((-203686146) | iCodePointAt4)) * (-604)) + (((~(iCodePointAt4 | 31046236)) | 21498448) * 302) + 689741209;
            int i244 = (i243 << 13) ^ i243;
            int i245 = i244 ^ (i244 >>> 17);
            ((int[]) objArr17[2])[0] = i245 ^ (i245 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr139 = {-1851240757};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b((char) (46039 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.alpha(0) + 1134, (ViewConfiguration.getScrollBarSize() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr140 = {Integer.valueOf(iIntValue4), 0, 689741209, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).newInstance(objArr139), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                int edgeSlop3 = 1031 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iIndexOf17 = TextUtils.indexOf((CharSequence) str5, '0', 0) + 16;
                byte b44 = $$a[7];
                Object[] objArr141 = new Object[1];
                e((short) 140, b44, (byte) (b44 | 52), objArr141);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cCombineMeasuredStates2, edgeSlop3, iIndexOf17, 1298546779, false, (String) objArr141[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.getGidForName(str5) + 45994), 1117 - Color.blue(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr142 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).invoke(null, objArr140);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                char offsetBefore2 = (char) TextUtils.getOffsetBefore(str5, 0);
                int size2 = View.MeasureSpec.getSize(0) + 1031;
                int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                byte[] bArr49 = $$a;
                Object[] objArr143 = new Object[1];
                e((short) 140, (byte) (bArr49[205] + 1), bArr49[7], objArr143);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(offsetBefore2, size2, edgeSlop4, 632103528, false, (String) objArr143[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).set(null, objArr142);
            try {
                long jLongValue18 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf23 = Long.valueOf(jLongValue18);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1031;
                    int iIndexOf18 = TextUtils.indexOf(str5, str5, 0) + 15;
                    short s37 = (short) ($$b & 173);
                    byte b45 = $$a[7];
                    Object[] objArr144 = new Object[1];
                    e(s37, b45, (byte) (b45 | 52), objArr144);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(maximumFlingVelocity, iNormalizeMetaState, iIndexOf18, 1344079056, false, (String) objArr144[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).set(null, lValueOf23);
                Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault76 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault76 == null) {
                    char packedPositionChild4 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int i246 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b46 = $$a[7];
                    Object[] objArr145 = new Object[1];
                    e((short) 140, b46, (byte) (b46 | 52), objArr145);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault76 = initSession.b(packedPositionChild4, i246, jumpTapTimeout, 1357589585, false, (String) objArr145[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault76).set(null, lValueOf24);
                objArr17 = objArr142;
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i247 = ((int[]) objArr17[1])[0];
        int i248 = ((int[]) objArr17[3])[0];
        if (i248 == i247) {
            objArr18 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i249 = ((int[]) objArr17[2])[0];
            int i250 = ((int[]) objArr17[3])[0];
            int i251 = ((int[]) objArr17[1])[0];
            String[] strArr19 = (String[]) objArr17[0];
            int iNextInt5 = new Random().nextInt();
            int i252 = ~iNextInt5;
            int i253 = ~(713127359 | i252);
            int i254 = i249 + 491991297 + (((-1005813760) | i253) * (-712)) + (((~(iNextInt5 | (-292686401))) | (~(i252 | 1005813759))) * (-712)) + ((468847189 | i253) * 712);
            int i255 = (i254 << 13) ^ i254;
            int i256 = i255 ^ (i255 >>> 17);
            ((int[]) objArr18[2])[0] = i256 ^ (i256 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr17[0];
            if (strArr20 != null) {
                for (String str24 : strArr20) {
                    arrayList8.add(str24);
                }
            }
            Toast.makeText((Context) null, i248 / (((i248 - 1) * i248) % 2), 0).show();
            Object[] objArr146 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i257 = ((int[]) objArr17[2])[0];
            int i258 = ((int[]) objArr17[3])[0];
            int i259 = ((int[]) objArr17[1])[0];
            String[] strArr21 = (String[]) objArr17[0];
            int i260 = ((Context) Class.forName(str10).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            int i261 = ~i260;
            int i262 = (~(129956200 | i261)) | 272630930;
            int i263 = ~(i260 | (-28350761));
            int i264 = i257 + ((i262 | i263) * (-252)) + 227797793 + ((i263 | (~(i261 | 402587130))) * 252);
            int i265 = (i264 << 13) ^ i264;
            int i266 = i265 ^ (i265 >>> 17);
            ((int[]) objArr146[2])[0] = i266 ^ (i266 << 5);
            objArr18 = objArr146;
        }
        ActivityPdfViewerBinding activityPdfViewerBindingInflate = ActivityPdfViewerBinding.inflate(getLayoutInflater());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = activityPdfViewerBindingInflate;
        if (activityPdfViewerBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str5);
            activityPdfViewerBindingInflate = null;
        }
        setContentView(activityPdfViewerBindingInflate.getRoot());
        PdfViewerActivity pdfViewerActivity = this;
        this.b = new updateSession(pdfViewerActivity);
        ActivityPdfViewerBinding activityPdfViewerBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (activityPdfViewerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str5);
            activityPdfViewerBinding = null;
        }
        activityPdfViewerBinding.btnPrevious.setOnClickListener(new View.OnClickListener() { // from class: addCaptureRequestOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        ActivityPdfViewerBinding activityPdfViewerBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (activityPdfViewerBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str5);
            activityPdfViewerBinding2 = null;
        }
        activityPdfViewerBinding2.btnNext.setOnClickListener(new View.OnClickListener() { // from class: lambdaaddCaptureRequestOptions2androidxcameracamera2interopCamera2CameraControl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr147 = {this.TuitionPaymentFragmentbindingInflater1, view};
                int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
                PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), getTextOn.TuitionPaymentFragmentbindingInflater1(), objArr147, -1179372270, iTuitionPaymentFragmentbindingInflater1, 1179372271, getTextOn.TuitionPaymentFragmentbindingInflater1());
            }
        });
        ActivityPdfViewerBinding activityPdfViewerBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (activityPdfViewerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str5);
            activityPdfViewerBinding3 = null;
        }
        activityPdfViewerBinding3.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lambdaclearCaptureRequestOptions5androidxcameracamera2interopCamera2CameraControl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        Intent intent = getIntent();
        int i267 = ((int[]) objArr2[3])[0];
        int i268 = ((((i267 * i267) - (~(-(418494727 * i267)))) - 1) - (~(-(i267 * (-1993989565))))) - 1;
        int i269 = (i268 ^ (-1295455143)) + ((i268 & (-1295455143)) << 1);
        int i270 = i269 >> 25;
        int i271 = ((i270 & (-255)) + (i270 | (-255))) / 128;
        int i272 = ((i271 | 1) << 1) - (i271 ^ 1);
        int i273 = (i269 ^ i272) + ((i272 & i269) << 1);
        int i274 = ((i269 >> 15) - 262143) / 131072;
        int i275 = -(i273 ^ ((i274 & 1) + (i274 | 1)));
        int i276 = (i275 ^ 6) + ((i275 & 6) << 1);
        int i277 = i276 >> 17;
        int i278 = (((-65535) ^ i277) + ((i277 & (-65535)) << 1)) / 32768;
        int i279 = (i278 & 1) + (i278 | 1);
        int i280 = 933990 / (((-(((i279 | 1) << 1) - (i279 ^ 1))) & i276) * 815);
        int i281 = ((int[]) objArr4[1])[0];
        int i282 = i281 * i281;
        int i283 = -(212325389 * i281);
        int i284 = ((i282 | i283) << 1) - (i282 ^ i283);
        int i285 = -(i281 * 60230803);
        int i286 = ((i284 ^ i285) + ((i285 & i284) << 1)) - (-1688606976);
        int i287 = (i286 - (~((((i286 >> 17) - 65535) / 32768) + 1))) - 1;
        int i288 = i286 >> 27;
        int i289 = ((i288 & (-63)) + (i288 | (-63))) / 32;
        int i290 = -(i287 ^ (((i289 | 1) << 1) - (i289 ^ 1)));
        int i291 = (i290 ^ 2) + ((i290 & 2) << 1);
        int i292 = i291 >> 26;
        int i293 = ((i292 ^ ComposerKt.defaultsKey) + ((i292 & ComposerKt.defaultsKey) << 1)) / 64;
        int i294 = i280 + (703044 / (((-((((i293 | 1) << 1) - (i293 ^ 1)) + 1)) & i291) * 1062));
        int i295 = ((int[]) objArr55[3])[0];
        int i296 = i295 * i295;
        int i297 = -(2109304967 * i295);
        int i298 = (i296 & i297) + (i296 | i297);
        int i299 = -(i295 * (-1568784689));
        int i300 = (((i298 | i299) << 1) - (i299 ^ i298)) - 1815958471;
        int i301 = i300 >> 28;
        int i302 = (((i301 | (-31)) << 1) - (i301 ^ (-31))) / 16;
        int i303 = (i300 - (~(((i302 | 1) << 1) - (i302 ^ 1)))) - 1;
        int i304 = i300 >> 21;
        int i305 = ((i304 ^ (-4095)) + ((i304 & (-4095)) << 1)) / 2048;
        int i306 = -(i303 ^ ((i305 & 1) + (i305 | 1)));
        int i307 = (i306 ^ 4) + ((i306 & 4) << 1);
        int i308 = i307 >> 18;
        int i309 = ((i308 & (-32767)) + (i308 | (-32767))) / 16384;
        int i310 = i294 + (149688 / (((-(((i309 ^ 1) + ((i309 & 1) << 1)) + 1)) & i307) * 126));
        int i311 = ((int[]) objArr67[2])[0];
        int i312 = i311 * i311;
        int i313 = -(1061937578 * i311);
        int i314 = (i312 & i313) + (i312 | i313);
        int i315 = -(i311 * 1593065234);
        int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
        int i317 = (i316 & 478929540) + (478929540 | i316);
        int i318 = i317 >> 23;
        int i319 = (i317 - (~(((((i318 | (-1023)) << 1) - (i318 ^ (-1023))) / 512) + 1))) - 1;
        int i320 = i317 >> 18;
        int i321 = (((i320 | (-32767)) << 1) - (i320 ^ (-32767))) / 16384;
        int i322 = -(i319 ^ ((i321 & 1) + (i321 | 1)));
        int i323 = (i322 ^ 7) + ((i322 & 7) << 1);
        int i324 = i323 >> 16;
        int i325 = ((((-131071) ^ i324) + ((i324 & (-131071)) << 1)) / 65536) + 1;
        int i326 = i310 + (5531568 / (((-(((i325 | 1) << 1) - (i325 ^ 1))) & i323) * 978));
        int i327 = ((int[]) objArr78[0])[0];
        int i328 = i327 * i327;
        int i329 = -(1833908365 * i327);
        int i330 = (i328 ^ i329) + ((i328 & i329) << 1);
        int i331 = -(i327 * 1285881273);
        int i332 = (i330 & i331) + (i331 | i330);
        int i333 = (i332 ^ 725378761) + ((725378761 & i332) << 1);
        int i334 = (((i333 >> 29) - 15) / 8) + 1;
        int i335 = ((i333 | i334) << 1) - (i334 ^ i333);
        int i336 = i333 >> 24;
        int i337 = -(i335 ^ ((((i336 & (-511)) + (i336 | (-511))) / 256) + 1));
        int i338 = (i337 ^ 6) + ((i337 & 6) << 1);
        int i339 = (((i338 >> 21) - 4095) / 2048) + 1;
        int i340 = i326 + (3019716 / (((-((i339 & 1) + (i339 | 1))) & i338) * 521));
        int i341 = ((int[]) objArr9[1])[0];
        int i342 = i341 * i341;
        int i343 = -(925166017 * i341);
        int i344 = (i342 ^ i343) + ((i342 & i343) << 1);
        int i345 = -(i341 * 501616701);
        int i346 = (((i344 | i345) << 1) - (i345 ^ i344)) - 906099199;
        int i347 = i346 >> 22;
        int i348 = (((i347 | (-2047)) << 1) - (i347 ^ (-2047))) / 1024;
        int i349 = (i348 ^ 1) + ((i348 & 1) << 1);
        int i350 = ((i346 | i349) << 1) - (i349 ^ i346);
        int i351 = i346 >> 15;
        int i352 = ((((-262143) | i351) << 1) - (i351 ^ (-262143))) / 131072;
        int i353 = (-(((i352 & 1) + (i352 | 1)) ^ i350)) + 1;
        int i354 = (((i353 >> 29) - 15) / 8) + 1;
        int i355 = i340 + (824670 / ((i353 & (-(((i354 | 1) << 1) - (i354 ^ 1)))) * 1530));
        int i356 = ((int[]) objArr104[1])[0];
        int i357 = ((i356 * i356) - (~(-(778284746 * i356)))) - 1;
        int i358 = -(i356 * 1803918064);
        int i359 = (i357 ^ i358) + ((i358 & i357) << 1);
        int i360 = (i359 & (-411834679)) + ((-411834679) | i359);
        int i361 = i360 >> 17;
        int i362 = ((((-65535) ^ i361) + ((i361 & (-65535)) << 1)) / 32768) + 1;
        int i363 = (i360 ^ i362) + ((i362 & i360) << 1);
        int i364 = ((i360 >> 25) - 255) / 128;
        int i365 = -(i363 ^ ((i364 ^ 1) + ((i364 & 1) << 1)));
        int i366 = (i365 & 5) + (i365 | 5);
        int i367 = i366 >> 19;
        int i368 = (((i367 ^ (-16383)) + ((i367 & (-16383)) << 1)) / 8192) + 1;
        int i369 = i355 + (4635435 / (((-((i368 ^ 1) + ((i368 & 1) << 1))) & i366) * PointerIconCompat.TYPE_COPY));
        int i370 = ((int[]) objArr12[1])[0];
        int i371 = ((i370 * i370) - (~(-(1456826611 * i370)))) - 1;
        int i372 = -(i370 * (-675558221));
        int i373 = ((i371 | i372) << 1) - (i372 ^ i371);
        int i374 = ((i373 | 1582467561) << 1) - (1582467561 ^ i373);
        int i375 = i374 >> 24;
        int i376 = -(((i374 - (~((((i375 & (-511)) + (i375 | (-511))) / 256) + 1))) - 1) ^ ((((i374 >> 22) - 2047) / 1024) + 1));
        int i377 = (i376 ^ 2) + ((i376 & 2) << 1);
        int i378 = i377 >> 19;
        int i379 = (((i378 | (-16383)) << 1) - (i378 ^ (-16383))) / 8192;
        int i380 = i369 + (1394024 / (((-((((i379 | 1) << 1) - (i379 ^ 1)) + 1)) & i377) * 1084));
        int i381 = ((int[]) objArr14[1])[0];
        int i382 = ((i381 * i381) - (~(-(97433789 * i381)))) - 1;
        int i383 = -(i381 * (-348230335));
        int i384 = ((i382 | i383) << 1) - (i383 ^ i382);
        int i385 = (i384 ^ 1197201921) + ((1197201921 & i384) << 1);
        int i386 = i385 >> 28;
        int i387 = i386 & (-31);
        int i388 = ((i386 | (-31)) + i387) / 16;
        int i389 = (i388 & 1) + (i388 | 1);
        int i390 = ((i386 ^ (-31)) + (i387 << 1)) / 16;
        int i391 = -(((i385 & i389) + (i385 | i389)) ^ ((i390 & 1) + (i390 | 1)));
        int i392 = (i391 ^ 6) + ((i391 & 6) << 1);
        int i393 = i392 >> 23;
        int i394 = (((i393 | (-1023)) << 1) - (i393 ^ (-1023))) / 512;
        int i395 = i380 + (8209656 / (((-((((i394 | 1) << 1) - (i394 ^ 1)) + 1)) & i392) * 1911));
        int i396 = ((int[]) objArr16[0])[0];
        int i397 = i396 * i396;
        int i398 = -(472138518 * i396);
        int i399 = ((i397 | i398) << 1) - (i397 ^ i398);
        int i400 = -(i396 * (-204730298));
        int i401 = (i399 & i400) + (i400 | i399);
        int i402 = (i401 & 1273573956) + (1273573956 | i401);
        int i403 = i402 >> 18;
        int i404 = ((i403 ^ (-32767)) + ((i403 & (-32767)) << 1)) / 16384;
        int i405 = i404 | 1;
        int i406 = (i404 & 1) + i405;
        int i407 = -(((i402 & i406) + (i406 | i402)) ^ ((i405 << 1) - (i404 ^ 1)));
        int i408 = (i407 & 8) + (i407 | 8);
        int i409 = i408 >> 22;
        int i410 = (((i409 | (-2047)) << 1) - (i409 ^ (-2047))) / 1024;
        int i411 = (i410 ^ 1) + ((i410 & 1) << 1);
        int i412 = i395 + (472376 / (((-((i411 ^ 1) + ((i411 & 1) << 1))) & i408) * 137));
        int i413 = ((int[]) objArr18[2])[0];
        int i414 = i413 * i413;
        int i415 = -(1704897130 * i413);
        int i416 = (((i414 & i415) + (i414 | i415)) - (~(-(i413 * 1729197784)))) - 1;
        int i417 = (i416 ^ (-1144748735)) + (((-1144748735) & i416) << 1);
        int i418 = i417 >> 19;
        int i419 = (((i418 & (-16383)) + (i418 | (-16383))) / 8192) + 1;
        int i420 = ((i417 | i419) << 1) - (i419 ^ i417);
        int i421 = i417 >> 21;
        int i422 = (((i421 | (-4095)) << 1) - (i421 ^ (-4095))) / 2048;
        int i423 = (-(i420 ^ ((i422 ^ 1) + ((i422 & 1) << 1)))) + 2;
        int i424 = i423 >> 23;
        int i425 = ((((i424 | (-1023)) << 1) - (i424 ^ (-1023))) / 512) + 1;
        String stringExtra = intent.getStringExtra("12\\pdf_path".substring(i412 + ((-1902536) / ((i423 & (-((i425 & 1) + (i425 | 1)))) * 163))));
        if (stringExtra != null) {
            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PdfViewerActivity$loadPdf$1(this, new File(stringExtra), null), 3, null);
        } else {
            Toast.makeText(pdfViewerActivity, "PDF file not found", 0).show();
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        updateSession updatesession = this.b;
        if (updatesession == null) {
            int i2 = d + 3;
            f670a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                int i4 = 52 / 0;
            }
            updatesession = null;
        }
        updatesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i5 = d + 57;
        f670a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = f670a + 81;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i5 = ~i4;
            if (i3 != (-91835496) + (((~((-1048681505) | i5)) | (-1878669048)) * (-602)) + (((~(i4 | (-1048681505))) | 268535808 | (~((-1098523352) | i5))) * (-301)) + ((~(i5 | (-1878669048))) * 301)) {
                throw null;
            }
        } else {
            int i6 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            if (i6 != (-1806733070) + (((~((~i7) | 764738040)) | 1376322567) * 529) + (((~(i7 | 764738040)) | 1594725583) * 529)) {
                throw null;
            }
        }
        int i8 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i9 = (~((-763358915) | iIdentityHashCode)) | 741951106;
        if (i8 != (-1027415268) + (i9 * 992) + ((i9 | (~((~iIdentityHashCode) | 1837104858))) * (-496)) + ((iIdentityHashCode | 1815697050) * 496)) {
            int i10 = (-51335202) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 40, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46400), 40 - ExpandableListView.getPackedPositionGroup(0L), 19 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            int i11 = d + 59;
            f670a = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = d + 109;
        f670a = i2 % 128;
        if (i2 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 46400), View.resolveSizeAndState(0, 0, 0) + 40, TextUtils.indexOf((CharSequence) "", '0') + 20, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 40 - View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0') + 20, 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                int i3 = 90 / 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46400), TextUtils.indexOf("", "", 0, 0) + 40, KeyEvent.keyCodeFromString("") + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 46401), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, 19 - TextUtils.getOffsetBefore("", 0), 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
                super.onPause();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i4 = f670a + 69;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f670a + 51;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 23;
            byte[] bArr = $$a;
            short s = bArr[5];
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            e(s, b, (byte) (b | 37), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, i4, touchSlop, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int packedPositionGroup = 1755 - ExpandableListView.getPackedPositionGroup(0L);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 24;
                short s2 = (short) ($$b & 173);
                byte b2 = $$a[7];
                Object[] objArr3 = new Object[1];
                e(s2, b2, (byte) (b2 | 52), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, packedPositionGroup, packedPositionChild, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_4).substring(5, 12).length() + 1541425055;
            int i5 = ~length;
            int i6 = (((1958332176 + (((~(15695103 | i5)) | 228297529) * 226)) + (((~(i5 | 234881023)) | (9111609 | (~((-228297530) | length)))) * (-113))) + ((~(length | 15695103)) * 113)) - 99691208;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(new char[]{45862, 40038, 60844, 16076, 3662, 24407, 43247, 63535, 51571, 6849, 27633, 47884, 33979, 54775, 9523, 30276}, (KeyEvent.getMaxKeyCode() >> 16) + 12107, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(new char[]{45861, 46135, 48407, 42623, 44868, 37054, 39298, 33516, 35836, 62266, 62473, 64881, 59003, 61360, 53402, 55800}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_failed).substring(53, 55).length() + 1821, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1057800223};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42048 - Process.getGidForName("")), Color.rgb(0, 0, 0) + 16778942, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -99691208);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration2 = (char) (29944 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                    short s3 = (short) ($$b & 173);
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    e(s3, b3, (byte) (b3 | 52), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration2, maximumFlingVelocity, iLastIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    c(new char[]{45869, 57989, 4198, 18379, 62911, 11110, 23234, 35059, 15899, 28128, 33764, 12594, 24801, 38468, 50202, 31712, 43345, 57112, 3742, 48198, 53795, 404}, 20903 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(new char[]{45865, 22667, 25723, 28733, 7571, 10622, 13610, 49843, 61041, 64046, 34702, 37729, 48929, 17550, 20595}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_5).substring(25, 26).codePointAt(0) + 60299, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                        int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                        byte[] bArr2 = $$a;
                        short s4 = bArr2[0];
                        byte b4 = bArr2[7];
                        Object[] objArr11 = new Object[1];
                        e(s4, b4, (byte) (b4 | 52), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild2, i9, scrollBarSize, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRed = (char) (29944 - Color.red(0));
                        int iLastIndexOf2 = 1754 - TextUtils.lastIndexOf("", '0');
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                        byte[] bArr3 = $$a;
                        short s5 = bArr3[5];
                        byte b5 = bArr3[7];
                        Object[] objArr12 = new Object[1];
                        e(s5, b5, (byte) (b5 | 37), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, iLastIndexOf2, iResolveSizeAndState, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = ~(502265723 | iIdentityHashCode);
            int i14 = i12 + 1692794277 + ((276825409 | i13) * (-476)) + (i13 * 952) + ((~((~iIdentityHashCode) | 502265723)) * 476);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i17 = 0;
                while (i17 < strArr.length) {
                    int i18 = d + 29;
                    f670a = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList.add(strArr[i17]);
                        i17 += 15;
                    } else {
                        arrayList.add(strArr[i17]);
                        i17++;
                    }
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int i20 = (int) Runtime.getRuntime().totalMemory();
            int i21 = ~i20;
            int i22 = i19 + (-144688828) + (((~((-220111425) | i21)) | (~(7508998 | i21))) * (-867)) + (((~((-220111425) | i20)) | 218899008 | (~(7508998 | i20))) * (-1734)) + (((~(i20 | 226408006)) | (~(i21 | (-218899009))) | (~((-1212417) | i20))) * 867);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr14[3])[0] = i24 ^ (i24 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int iBlue = Color.blue(0) + 1031;
            int maximumFlingVelocity2 = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b6 = $$a[7];
            Object[] objArr15 = new Object[1];
            e((short) 140, b6, (byte) (b6 | 52), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iBlue, maximumFlingVelocity2, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        c(new char[]{45869, 57989, 4198, 18379, 62911, 11110, 23234, 35059, 15899, 28128, 33764, 12594, 24801, 38468, 50202, 31712, 43345, 57112, 3742, 48198, 53795, 404}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_video).substring(0, 5).codePointAt(2) + 20803, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(new char[]{45865, 22667, 25723, 28733, 7571, 10622, 13610, 49843, 61041, 64046, 34702, 37729, 48929, 17550, 20595}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_submit).substring(0, 5).length() + 60326, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int iIndexOf = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
            short s6 = (short) ($$b & 173);
            byte b7 = $$a[7];
            Object[] objArr18 = new Object[1];
            e(s6, b7, (byte) (b7 | 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, iIndexOf, offsetBefore, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                int iBlue2 = 15 - Color.blue(0);
                byte[] bArr4 = $$a;
                Object[] objArr19 = new Object[1];
                e((short) 140, (byte) (bArr4[205] + 1), bArr4[7], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, iBlue2, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i27 = (((-1330492805) + (((~((~iIdentityHashCode2) | 586037362)) | 286360460) * 446)) + (((~(iIdentityHashCode2 | 872397822)) | 543957072) * 446)) - 1007933611;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr[2])[0] = i29 ^ (i29 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(new char[]{45862, 40038, 60844, 16076, 3662, 24407, 43247, 63535, 51571, 6849, 27633, 47884, 33979, 54775, 9523, 30276}, 12107 - TextUtils.getOffsetBefore("", 0), objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(new char[]{45861, 46135, 48407, 42623, 44868, 37054, 39298, 33516, 35836, 62266, 62473, 64881, 59003, 61360, 53402, 55800}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1822, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {1057800223};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (46038 - KeyEvent.normalizeMetaState(0)), 1134 - ExpandableListView.getPackedPositionGroup(0L), 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, 124320109, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int i30 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b8 = $$a[7];
                Object[] objArr25 = new Object[1];
                e((short) 140, b8, (byte) (b8 | 52), objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cKeyCodeFromString, i30, scrollBarFadeDuration, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45993), View.resolveSizeAndState(0, 0, 0) + 1117, 17 - TextUtils.indexOf("", "")), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 15;
                byte[] bArr5 = $$a;
                Object[] objArr26 = new Object[1];
                e((short) 140, (byte) (bArr5[205] + 1), bArr5[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarFadeDuration2, iIndexOf2, iKeyCodeFromString, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                c(new char[]{45869, 57989, 4198, 18379, 62911, 11110, 23234, 35059, 15899, 28128, 33764, 12594, 24801, 38468, 50202, 31712, 43345, 57112, 3742, 48198, 53795, 404}, 20903 - TextUtils.indexOf("", ""), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(new char[]{45865, 22667, 25723, 28733, 7571, 10622, 13610, 49843, 61041, 64046, 34702, 37729, 48929, 17550, 20595}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 60220, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                    int iBlue3 = Color.blue(0) + 15;
                    short s7 = (short) ($$b & 173);
                    byte b9 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    e(s7, b9, (byte) (b9 | 52), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(absoluteGravity, maximumDrawingCacheSize2, iBlue3, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1031;
                    int pressedStateDuration3 = 15 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b10 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    e((short) 140, b10, (byte) (b10 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionType, scrollBarSize2, pressedStateDuration3, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i31 = ((int[]) objArr[1])[0];
        int i32 = ((int[]) objArr[3])[0];
        if (i32 == i31) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i37 = ~i36;
            int i38 = i33 + 1581789188 + (((~((-571833409) | i37)) | (~(327553238 | i37))) * (-867)) + (((~((-571833409) | i36)) | 538012672 | (~(327553238 | i36))) * (-1734)) + (((~(i36 | 865565910)) | (~(i37 | (-538012673))) | (~((-33820737) | i36))) * 867);
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr31[2])[0] = i40 ^ (i40 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i41 = f670a + 115;
            d = i41 % 128;
            int i42 = i41 % 2;
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        Toast.makeText((Context) null, i32 / (((i32 - 1) * i32) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1834405179;
        int i46 = i43 + 901993235 + (((~((~length2) | (-201592965))) | (~((-303112705) | length2))) * (-302)) + ((~((-201592965) | length2)) * (-604)) + (((~(length2 | (-504705669))) | (-1052098543)) * 302);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[2])[0] = i48 ^ (i48 << 5);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = d + 55;
        f670a = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i5 = 1061067256 + ((layoutDirection | 222568448) * 988);
        int i6 = ~layoutDirection;
        if (i4 != i5 + (((~(768909460 | i6)) | (-2145238016)) * (-1976)) + (((~(layoutDirection | 1598897003)) | 222568448 | (~((-1598897004) | i6))) * 988)) {
            int i7 = 1786975000 % 2;
            throw new ArithmeticException();
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        int i10 = ~i9;
        if (i8 != 1501369344 + ((i9 | 2089384755) * 140) + (((~(2089384755 | i10)) | 19300360) * (-280)) + (((~(i9 | (-19300361))) | (~(489671209 | i10)) | 1619013906) * 140)) {
            throw null;
        }
        super.onStart();
        int i11 = f670a + 115;
        d = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(PdfViewerActivity pdfViewerActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 19;
        f670a = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                int i4 = pdfViewerActivity.TuitionPaymentFragmentbindingInflater1;
                throw null;
            }
            int i5 = pdfViewerActivity.TuitionPaymentFragmentbindingInflater1;
            if (i5 > 0) {
                pdfViewerActivity.TuitionPaymentFragmentbindingInflater1 = i5 - 1;
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(pdfViewerActivity), null, null, new PdfViewerActivity$renderCurrentPage$1(pdfViewerActivity, null), 3, null);
            }
            ViewPortBuilder.b();
            int i6 = f670a + 25;
            d = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PdfViewerActivity pdfViewerActivity, View view) {
        int i = 2 % 2;
        int i2 = d + 57;
        f670a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                pdfViewerActivity.finish();
                ViewPortBuilder.b();
            } else {
                pdfViewerActivity.finish();
                ViewPortBuilder.b();
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i;
        int i2;
        PdfViewerActivity pdfViewerActivity = (PdfViewerActivity) objArr[0];
        View view = (View) objArr[1];
        int i3 = 2 % 2;
        int i4 = d + 51;
        f670a = i4 % 128;
        int i5 = i4 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i5 != 0) {
                i = pdfViewerActivity.TuitionPaymentFragmentbindingInflater1;
                if (i < pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) {
                    pdfViewerActivity.TuitionPaymentFragmentbindingInflater1 = i + 1;
                    b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(pdfViewerActivity), null, null, new PdfViewerActivity$renderCurrentPage$1(pdfViewerActivity, null), 3, null);
                    i2 = d + 105;
                    f670a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i6 = 5 / 5;
                    }
                }
            } else {
                i = pdfViewerActivity.TuitionPaymentFragmentbindingInflater1;
                if (i < pdfViewerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) {
                    pdfViewerActivity.TuitionPaymentFragmentbindingInflater1 = i + 1;
                    b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(pdfViewerActivity), null, null, new PdfViewerActivity$renderCurrentPage$1(pdfViewerActivity, null), 3, null);
                    i2 = d + 105;
                    f670a = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i7 = 5 / 5;
                    }
                }
            }
            ViewPortBuilder.b();
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PdfViewerActivity pdfViewerActivity, View view) {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{pdfViewerActivity, view}, -1179372270, iTuitionPaymentFragmentbindingInflater1, 1179372271, iTuitionPaymentFragmentbindingInflater3);
    }

    static {
        asBinder = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = g + 31;
        asBinder = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    public static final /* synthetic */ void g(PdfViewerActivity pdfViewerActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{pdfViewerActivity}, -1150345456, iTuitionPaymentFragmentbindingInflater1, 1150345456, iTuitionPaymentFragmentbindingInflater3);
    }

    public static final /* synthetic */ void asInterface(PdfViewerActivity pdfViewerActivity) {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTextOn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater2, new Object[]{pdfViewerActivity}, -1487426480, iTuitionPaymentFragmentbindingInflater1, 1487426482, iTuitionPaymentFragmentbindingInflater3);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        asInterface = 4233439794876521047L;
    }
}
