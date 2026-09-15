package com.bpjstku.presentation.compose.feature.scholarship.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p005navigation.NavHostController;
import androidx.p005navigation.Navigator;
import androidx.p005navigation.p006compose.NavHostControllerKt;
import androidx.view.compose.ComponentActivityKt;
import com.bpjstku.R;
import com.bpjstku.presentation.asik.active.model.IndividualDataAsik;
import com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.IntegerRes;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.applyAppLocales;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.generateCameraId;
import defpackage.generateUltraHdrSupportedCombinationList;
import defpackage.getEventTime;
import defpackage.getNextMenuPosition;
import defpackage.getRatioByPercentage;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.mapPoint;
import defpackage.onScroll;
import defpackage.populateOptionsMenu;
import defpackage.setQuickZoomEnabled;
import defpackage.shouldAllowTextWithIcon;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\f\u001a\u00020\t8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0015\u0010\u000e\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0015\u0010\u0011\u001a\u00020\u000f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0015\u0010\u0010\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0015\u0010\n\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0015\u0010\u0015\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/compose/feature/scholarship/ui/ScholarshipGranteeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "LgetRatioByPercentage;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LlambdaenableTorch1androidxcameracamera2internalTorchControl;", "TuitionPaymentFragmentbindingInflater1", "LgenerateUltraHdrSupportedCombinationList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "LpopulateOptionsMenu;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LIntegerRes;", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScholarshipGranteeActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy g;
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$f = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {110, -73, -111, 99, 2, 19, -45, 34, 19, 8, 5, 1, -9, -20, 38, -7, 5, -61, 52, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, -14, 11, 9, -6, 9, 9, -3, -26, 41, -4, 10, -7, 23, -11, 17, -61, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -61, -7, 17, -8, 13, 7, -1, -32, 31, 5, 13, 10, -7, 1, 7, 0, 17, -45, 38, 21, -7, 10, 3, 16, 2, -59, 67, 0, -1, 20, 2, -13, 17, 9, -65, 73, -11, 11, -57, 75, -8, 6, 2, 15, -66, 76, -9, 0, 22, 0, -65, 56, 3, 17, 1, 13, 2, -13, 17, 9, -9, 3, 17, -64, 73, 5, -15, 23, 5, 2, -65, 35, 24, 17, -6, 9, 13, -5, -35, 43, 7, 4, -21, 37, -15, 23, 5, 2, -46, 38, 21, -7, 17, -9, 15, 9, -81, 18, 3, 21, -11, 6, 11, 7, 3, -9, 2, 6, 10, 6, 9, -3, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -63, -10, 19, -33, 42, 3, 0, 9, 3, -42, 45, 7, -1, -8, 23, -76, 52, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, -14, 11, 9, -6, 9, 9, -3, -26, 41, -4, 10, -7, 23, -11, 17, -61, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, -14, 11, 9, -6, 9, 9, -3, -26, 41, -4, 10, -7, 23, -11, 17, -61, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, Base64.padSymbol, 10, 10, -65, 67, -8, 19, 7, -65, 67, 6, -7, 5, 11, -58, 38, 35, 1, 17, -14, 12, 3, 16, 2, -59, Base64.padSymbol, 12, 4, -4, 9, -3, -51, 55, 17, -6, 18, 1, -2, -1, -50, Base64.padSymbol, 10, 10, -65, 63, 9, 10, -11, 17, 0, -9, 15, -58, 67, 3, 3, 2, 15, -17, 27, -9, 14, -6, 10, 3, -11, 11, -1, 6, 6, -51, 80, 4, -8, 3};
    private static final int $$e = 255;
    private static final byte[] $$a = {70, -114, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 148;
    private static int asInterface = 0;
    private static int d = 1;
    private static char[] asBinder = {43981, 27632, 11180, 60232, 43787, 27455, 10980, 60124, 43613, 27166, 10792, 59812, 43445, 26949, 10596, 59691, 43258, 26775, 10332, 59491, 43024, 28638, 12178, 61367, 44925, 28458, 45567, 29147, 12682, 61816, 45361, 28936, 12484, 61571, 45180, 28718, 12292, 62419, 45991, 29559, 13140, 62235, 45779, 29344, 47845, 31452, 15005, 64120, 47721, 31257, 15298, 64447, 47992, 31587, 15144, 63696, 47268, 30833, 14422, 63500, 15701, 64874, 48445, 32196, 15744, 64943, 48228, 31771, 15588, 64671, 48315, 32626, 16167, 65497, 49124, 32695, 45565, 29120, 12700, 61816, 45371, 28943, 12500, 61676, 45155, 28717, 12358, 62441, 46013, 29541, 13140, 62231, 45777, 29325, 12916, 62021, 45591, 30189, 45561, 29122, 12697, 61818, 45351, 28931, 12500, 61584, 45161, 28735, 12292, 62414, 45997, 29563, 13125, 45486, 29131, 12702, 61803, 45365, 28932, 12502, 61684, 45109, 28728, 12302, 62351, 45985, 29555, 13121, 62279, 45707, 29439, 12846, 62031, 45633, 30129, 13799, 62848, 46409, 30025, 13546, 62699, 46295, 29778, 13428, 63403, 47077, 30607, 14090, 63347, 46757, 30359, 14024, 63075, 46634, 31147, 14748, 63938, 47458, 31027, 14675, 63623, 47261, 30782, 14432, 63499, 48000, 31742, 15138, 64320, 47957, 31366, 15100, 64120, 47686, 31248, 15794, 64944, 45567, 29135, 12700, 61756, 45412, 29011, 12498, 61685, 45161, 28728, 12376, 62424, 45985, 29476, 13126, 62278, 45710, 29437, 12846, 61977, 45633, 30129, 13750, 62932, 46414, 30026, 13546, 62691, 46295, 29711, 13433, 63402, 47077, 30604, 14093, 63355, 46752, 30403, 13969, 63024, 46718, 31227, 14798, 63948, 47411, 31074, 14675, 63617, 47301, 30829, 14433, 63571, 48086, 31730, 15139, 64272, 47887, 31448, 15098, 64046, 47685, 31302, 15798, 64948};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f480a = 7654467268835766702L;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0102, code lost:
    
        if (r11 == (((563617737 + (((~((~r13) | (-362781358))) | (-1192768901)) * (-235))) + (((~((-362781358) | r13)) | (-1192768901)) * (-470))) + (((~(r13 | (-85463173))) | (-1470087086)) * 235))) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0104, code lost:
    
        r11 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r13 = (int) android.os.Process.getStartUptimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0129, code lost:
    
        if (r11 == ((((~((-19996945) | r13)) * 521) + 406115258) + (((~((~r13) | (-19996945))) | (-1870658558)) * 521))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x012b, code lost:
    
        r11 = com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.d + 31;
        com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.asInterface = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x013b, code lost:
    
        if ((r11 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x013d, code lost:
    
        r10 = new int[482335852];
        r10[482335851(0x1cbfdc6b, float:1.2696296E-21)] = 1;
        android.widget.Toast.makeText((android.content.Context) null, r10[-1], 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x014b, code lost:
    
        r8 = new int[482335852];
        r8[482335851(0x1cbfdc6b, float:1.2696296E-21)] = 1;
        r11 = 707916068 % 2;
        android.widget.Toast.makeText((android.content.Context) null, r8[-1], 1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x015c, code lost:
    
        super.onStart();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0160, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0168, code lost:
    
        throw new java.lang.RuntimeException("1514693430");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00cd, code lost:
    
        if (r11 == ((r2 + ((r1 | (~(2126360573 | r13))) * 50)) + (((~(r13 | 750555125)) | ((~(1580542668 | r13)) | (-2126360574))) * 50))) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int r7, int r8, java.lang.Object[] r9, int r10, int r11, int r12, int r13) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 84
            byte[] r0 = com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.$$a
            int r8 = 53 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L27:
            int r3 = r3 + r7
            int r7 = r9 + 1
            int r9 = r3 + (-11)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.e(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.$$d
            int r7 = 76 - r7
            int r8 = r8 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r8 = r8 + r9
            int r8 = r8 + (-4)
            r9 = r3
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.f(int, short, int, java.lang.Object[]):void");
    }

    public ScholarshipGranteeActivity() {
        final ScholarshipGranteeActivity scholarshipGranteeActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getRatioByPercentage>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getRatioByPercentage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getRatioByPercentage invoke() {
                ComponentCallbacks componentCallbacks = scholarshipGranteeActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getRatioByPercentage.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final ScholarshipGranteeActivity scholarshipGranteeActivity2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<lambdaenableTorch1androidxcameracamera2internalTorchControl>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, lambdaenableTorch1androidxcameracamera2internalTorchControl] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl invoke() {
                LifecycleOwner lifecycleOwner = scholarshipGranteeActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(lambdaenableTorch1androidxcameracamera2internalTorchControl.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0<generateUltraHdrSupportedCombinationList>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, generateUltraHdrSupportedCombinationList] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ generateUltraHdrSupportedCombinationList invoke() {
                LifecycleOwner lifecycleOwner = scholarshipGranteeActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(generateUltraHdrSupportedCombinationList.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<populateOptionsMenu>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, populateOptionsMenu] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ populateOptionsMenu invoke() {
                LifecycleOwner lifecycleOwner = scholarshipGranteeActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(populateOptionsMenu.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = scholarshipGranteeActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = scholarshipGranteeActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ populateOptionsMenu TuitionPaymentFragmentbindingInflater1(ScholarshipGranteeActivity scholarshipGranteeActivity) {
        int i = 2 % 2;
        int i2 = d + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        populateOptionsMenu populateoptionsmenu = (populateOptionsMenu) scholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        int i4 = asInterface + 41;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return populateoptionsmenu;
        }
        throw null;
    }

    public static final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipGranteeActivity scholarshipGranteeActivity) {
        int i = 2 % 2;
        int i2 = d + 77;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = (ActivityResultContractsPickVisualMediaMediaCapabilities) scholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        int i3 = d + 25;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return activityResultContractsPickVisualMediaMediaCapabilities;
    }

    public static final /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipGranteeActivity scholarshipGranteeActivity) {
        int i = 2 % 2;
        int i2 = d + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        return (getRatioByPercentage) scholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    public static final /* synthetic */ generateUltraHdrSupportedCombinationList TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipGranteeActivity scholarshipGranteeActivity) {
        int i = 2 % 2;
        int i2 = d + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = (generateUltraHdrSupportedCombinationList) scholarshipGranteeActivity.b.getValue();
        int i4 = asInterface + 43;
        d = i4 % 128;
        int i5 = i4 % 2;
        return generateultrahdrsupportedcombinationlist;
    }

    public static final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl b(ScholarshipGranteeActivity scholarshipGranteeActivity) {
        int i = 2 % 2;
        int i2 = d + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = (lambdaenableTorch1androidxcameracamera2internalTorchControl) scholarshipGranteeActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        int i4 = asInterface + 1;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        }
        throw null;
    }

    public static final /* synthetic */ IntegerRes d(ScholarshipGranteeActivity scholarshipGranteeActivity) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        d = i2 % 128;
        int i3 = i2 % 2;
        IntegerRes integerRes = (IntegerRes) scholarshipGranteeActivity.g.getValue();
        int i4 = asInterface + 55;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return integerRes;
        }
        throw null;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1271860990, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.onCreate.<anonymous> (ScholarshipGranteeActivity.kt:30)");
                }
                NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer2, 0);
                getRatioByPercentage getratiobypercentageTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipGranteeActivity.this);
                lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrolB = ScholarshipGranteeActivity.b(ScholarshipGranteeActivity.this);
                generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlistTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ScholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarshipGranteeActivity.this);
                populateOptionsMenu populateoptionsmenuTuitionPaymentFragmentbindingInflater1 = ScholarshipGranteeActivity.TuitionPaymentFragmentbindingInflater1(ScholarshipGranteeActivity.this);
                ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilitiesTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ScholarshipGranteeActivity.this);
                IntegerRes integerResD = ScholarshipGranteeActivity.d(ScholarshipGranteeActivity.this);
                composer2.startReplaceGroup(639658353);
                boolean zChangedInstance = composer2.changedInstance(ScholarshipGranteeActivity.this);
                final ScholarshipGranteeActivity scholarshipGranteeActivity = ScholarshipGranteeActivity.this;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: ActionMenuItemView
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ScholarshipGranteeActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(scholarshipGranteeActivity);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3(navHostControllerRememberNavController, getratiobypercentageTuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaenabletorch1androidxcameracamera2internaltorchcontrolB, generateultrahdrsupportedcombinationlistTuitionPaymentFragmentspecialinlinedviewModeldefault3, populateoptionsmenuTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilitiesTuitionPaymentFragmentspecialinlinedviewModeldefault1, integerResD, (Function0) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(ScholarshipGranteeActivity scholarshipGranteeActivity) {
            scholarshipGranteeActivity.finish();
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 49;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(asBinder[i * i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 2187 - Color.green(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 841711447, false, $$g(b, b2, (byte) (b2 + 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f480a), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33017), Color.argb(0, 0, 0, 0) + 3011, 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - Color.argb(0, 0, 0, 0)), TextUtils.indexOf("", "", 0, 0) + 3376, TextUtils.indexOf((CharSequence) "", '0') + 18, -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(asBinder[i + i8])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 2187 - TextUtils.indexOf("", "", 0), 40 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 841711447, false, $$g(b7, b8, (byte) (b8 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f480a), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.green(0) + 33017), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3010, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, 321985076, false, $$g(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36505), 3377 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), -968507904, false, $$g(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.getDefaultSize(0, 0) + 3376, Color.argb(0, 0, 0, 0) + 17, -968507904, false, $$g(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            int i9 = $10 + 33;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
        int i11 = $11 + 107;
        $10 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Type inference failed for: r3v292, types: [boolean, int] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        String str;
        String str2;
        String str3;
        Object[] objArr3;
        char c;
        Object[] objArr4;
        int i;
        String str4;
        String str5;
        Object[] objArr5;
        char c2;
        Object[] objArr6;
        Object[] objArr7;
        String str6;
        Object[] objArr8;
        char c3;
        Object[] objArr9;
        String str7;
        Object[] objArr10;
        int i2;
        Object[] objArr11;
        int i3;
        String str8;
        Object[] objArr12;
        Object[] objArr13;
        int i4;
        Object[] objArr14;
        String str9;
        Object[] objArr15;
        Object[] objArrB$7879113;
        Object[] objArr16;
        char c4;
        char c5;
        int i5 = 2 % 2;
        int i6 = d + 7;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr17 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 23, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr17);
        String str10 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 62, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 94, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr18);
        String str11 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_shippingcountry_empty).substring(10, 11).length() + 43, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_uob_description_web).substring(1, 3).length() + 2833), objArr19);
        String str12 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_wearing_scarf_text).substring(0, 4).length() + 56, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardCriticalTitle).substring(0, 17).codePointAt(5) - 57, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 35964), objArr20);
        String str13 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        c(AndroidCharacter.getMirror('0') - '0', ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_5).substring(6, 7).codePointAt(0) - 71, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 6704), objArr21);
        String str14 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_notification_shopee_app).substring(26, 27).length() + 17, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).codePointAt(0) - 80), objArr22);
        String str15 = (String) objArr22[0];
        int i8 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart).substring(0, 8).length() - 1380759542;
        if (i8 != 959287048 + ((~((~length) | (-838935769))) * (-116)) + ((10406433 | length) * 116) + (((~(length | 840393976)) | 8948225) * 116)) {
            throw new RuntimeException("-1333231035");
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_debit_card).substring(1, 2).codePointAt(0) - 1543509949;
        int i10 = ~iCodePointAt;
        if (i9 != (-688119780) + ((~(i10 | 836104828)) * (-560)) + ((~(iCodePointAt | (-1176633473))) * (-560)) + (((~(1742951136 | i10)) | 269787164) * 560)) {
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
            int i11 = 2266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33;
            short s = $$a[7];
            byte b = (byte) s;
            Object[] objArr23 = new Object[1];
            e(s, b, b, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, i11, keyRepeatTimeout, -887667012, false, (String) objArr23[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2268;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 34;
                byte[] bArr = $$a;
                Object[] objArr24 = new Object[1];
                e((short) 52, (byte) (bArr[33] - 1), bArr[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, iIndexOf, modifierMetaStateMask, -654680577, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr25[0])[0];
            int i13 = ((int[]) objArr25[3])[0];
            String[] strArr = (String[]) objArr25[1];
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_email_id).substring(14, 16).codePointAt(0) - 885342817;
            int i14 = 784363481 + (((~((-494167379) | iCodePointAt2)) | (-536868692)) * (-502)) + ((~((~iCodePointAt2) | (-222322755))) * (-502)) + (((~(iCodePointAt2 | (-314545938))) | (-494167379)) * TypedValues.PositionType.TYPE_DRAWPATH) + 1572477710;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr[2])[0] = i16 ^ (i16 << 5);
            str15 = str15;
            str12 = str12;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str14).getMethod(str15, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str12).getMethod(str13, Object.class).invoke(null, this)).intValue();
            int i17 = d + 73;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr26 = {baseContext, Integer.valueOf(iIntValue), 0, 1572477710};
                byte[] bArr2 = $$d;
                Object[] objArr27 = new Object[1];
                f(bArr2[52], bArr2[5], bArr2[103], objArr27);
                Class<?> cls = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                f(bArr2[52], bArr2[93], (short) (-bArr2[370]), objArr28);
                Object[] objArr29 = (Object[]) cls.getMethod((String) objArr28[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr26);
                if (baseContext != null) {
                    int i19 = asInterface + 71;
                    d = i19 % 128;
                    try {
                        if (i19 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cRed = (char) Color.red(0);
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2267;
                                int i20 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
                                byte[] bArr3 = $$a;
                                Object[] objArr30 = new Object[1];
                                e((short) 52, (byte) (bArr3[33] - 1), bArr3[7], objArr30);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, capsMode, i20, -654680577, false, (String) objArr30[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr29);
                            long jLongValue = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                                byte b2 = $$a[7];
                                Object[] objArr31 = new Object[1];
                                e((short) 89, b2, b2, objArr31);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, scrollBarFadeDuration, maximumFlingVelocity, -874156483, false, (String) objArr31[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue >>> 22);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int iNormalizeMetaState = 2267 - KeyEvent.normalizeMetaState(0);
                                int mirror = AndroidCharacter.getMirror('0') - 15;
                                short s2 = $$a[7];
                                byte b3 = (byte) s2;
                                Object[] objArr32 = new Object[1];
                                e(s2, b3, b3, objArr32);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(windowTouchSlop, iNormalizeMetaState, mirror, -887667012, false, (String) objArr32[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                            str15 = str15;
                            objArr29 = objArr29;
                        } else {
                            str12 = str12;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                                byte[] bArr4 = $$a;
                                Object[] objArr33 = new Object[1];
                                e((short) 52, (byte) (bArr4[33] - 1), bArr4[7], objArr33);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, scrollDefaultDelay, touchSlop, -654680577, false, (String) objArr33[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr29);
                            long jLongValue2 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                                int i21 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                                byte b4 = $$a[7];
                                Object[] objArr34 = new Object[1];
                                e((short) 89, b4, b4, objArr34);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop2, packedPositionGroup, i21, -874156483, false, (String) objArr34[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                int i22 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 33;
                                short s3 = $$a[7];
                                byte b5 = (byte) s3;
                                Object[] objArr35 = new Object[1];
                                e(s3, b5, b5, objArr35);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetAfter, i22, offsetBefore, -887667012, false, (String) objArr35[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf4);
                        }
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str15 = str15;
                    objArr29 = objArr29;
                    str12 = str12;
                }
                objArr = objArr29;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i23 = ((int[]) objArr[3])[0];
        int i24 = ((int[]) objArr[0])[0];
        if (i24 == i23) {
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[0])[0];
            int i27 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 844680420;
            int i29 = ~i28;
            int i30 = i25 + 1462847139 + ((168321040 | i29) * (-192)) + (((~((-354917196) | i29)) | 285475080) * (-384)) + (((~(i28 | 523238235)) | (~(i29 | (-69442116))) | (~((-285475081) | i28))) * DerHeader.TAG_CLASS_PRIVATE);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[2])[0] = i32 ^ (i32 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i33 = d + 103;
                asInterface = i33 % 128;
                int i34 = i33 % 2;
                for (String str16 : strArr3) {
                    arrayList.add(str16);
                }
            }
            Toast.makeText((Context) null, i24 / (((i24 - 1) * i24) % 2), 0).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[0])[0];
            int i37 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i38 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i39 = (-2043905723) + ((263453275 | i38) * 614);
            int i40 = ~i38;
            int i41 = i35 + i39 + (((~((-356565784) | i40)) | 83935763 | (~(452147532 | i40))) * (-1228)) + (((~(i40 | 536083295)) | (~((-272630021) | i40))) * 614);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr2[2])[0] = i43 ^ (i43 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myPid() >> 22) + 40, 19 - ExpandableListView.getPackedPositionType(0L), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Color.alpha(0) + 46400), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(obj, null);
            super.onCreate(p0);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cGreen = (char) (Color.green(0) + 37567);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 625;
                int mode = View.MeasureSpec.getMode(0) + 14;
                Object[] objArr36 = new Object[1];
                e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cGreen, threadPriority, mode, -477065106, false, (String) objArr36[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
            long jLongValue3 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 37567);
                int i44 = 625 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int threadPriority2 = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b6 = $$a[7];
                Object[] objArr37 = new Object[1];
                e((short) 89, b6, b6, objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarSize, i44, threadPriority2, -976899241, false, (String) objArr37[0], null);
            }
            if (j == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char gidForName = (char) (37566 - Process.getGidForName(""));
                    int iMyTid = 625 - (Process.myTid() >> 22);
                    int iIndexOf2 = TextUtils.indexOf("", "") + 14;
                    short s4 = $$a[7];
                    byte b7 = (byte) s4;
                    Object[] objArr38 = new Object[1];
                    e(s4, b7, b7, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(gidForName, iMyTid, iIndexOf2, -973632554, false, (String) objArr38[0], null);
                }
                Object[] objArr39 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
                int i45 = ((int[]) objArr39[2])[0];
                int i46 = ((int[]) objArr39[0])[0];
                String[] strArr5 = (String[]) objArr39[3];
                int[] iArr = {i45};
                int iIdentityHashCode = System.identityHashCode(this);
                int i47 = ~iIdentityHashCode;
                int i48 = ((((-953830936) + ((iIdentityHashCode | 32758996) * (-859))) + (((~(iIdentityHashCode | (-12586005))) | (~(32758996 | i47))) * 859)) + (((~((-1790979125) | i47)) | 1778393120) * 859)) - 321351676;
                int i49 = (i48 << 13) ^ i48;
                int i50 = i49 ^ (i49 >>> 17);
                ((int[]) objArr3[1])[0] = i50 ^ (i50 << 5);
                objArr3 = new Object[]{new int[]{i46}, new int[1], iArr, strArr5};
                c = 0;
                str = str15;
                str3 = str11;
                str2 = str13;
            } else {
                Context baseContext2 = getBaseContext();
                if (baseContext2 == null) {
                    str = str15;
                    baseContext2 = (Context) Class.forName(str14).getMethod(str, new Class[0]).invoke(null, null);
                } else {
                    str = str15;
                }
                if (baseContext2 != null) {
                    baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
                }
                str2 = str13;
                int iIntValue2 = ((Integer) Class.forName(str12).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr40 = new Object[1];
                c(113 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 53, (char) Gravity.getAbsoluteGravity(0, 0), objArr40);
                String str17 = (String) objArr40[0];
                Object[] objArr41 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 166, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 35, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.place_photo_viewer_next_image_button_content_description).substring(0, 15).length() - 15), objArr41);
                Object[] objArr42 = {baseContext2, new String[]{str17, (String) objArr41[0]}, Integer.valueOf(iIntValue2), 17, -321351676};
                int i51 = $$e;
                byte[] bArr5 = $$d;
                Object[] objArr43 = new Object[1];
                f((byte) (i51 & 53), bArr5[27], (short) (i51 & 359), objArr43);
                Class<?> cls2 = Class.forName((String) objArr43[0]);
                Object[] objArr44 = new Object[1];
                f(bArr5[146], bArr5[440], (short) (i51 & 381), objArr44);
                Object[] objArr45 = (Object[]) cls2.getMethod((String) objArr44[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr42);
                int i52 = ((int[]) objArr45[0])[0];
                int i53 = ((int[]) objArr45[2])[0];
                if (baseContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char c6 = (char) (37567 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int mirror2 = AndroidCharacter.getMirror('0') + 577;
                        int iIndexOf3 = 14 - TextUtils.indexOf("", "", 0);
                        short s5 = $$a[7];
                        byte b8 = (byte) s5;
                        Object[] objArr46 = new Object[1];
                        e(s5, b8, b8, objArr46);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c6, mirror2, iIndexOf3, -973632554, false, (String) objArr46[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr45);
                    try {
                        str3 = str11;
                        long jLongValue4 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue4);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                            char keyRepeatTimeout2 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37567);
                            int absoluteGravity2 = 625 - Gravity.getAbsoluteGravity(0, 0);
                            int packedPositionType = 14 - ExpandableListView.getPackedPositionType(0L);
                            byte b9 = $$a[7];
                            Object[] objArr47 = new Object[1];
                            e((short) 89, b9, b9, objArr47);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(keyRepeatTimeout2, absoluteGravity2, packedPositionType, -976899241, false, (String) objArr47[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                            char keyRepeatDelay = (char) (37567 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            int trimmedLength = 625 - TextUtils.getTrimmedLength("");
                            int absoluteGravity3 = 14 - Gravity.getAbsoluteGravity(0, 0);
                            Object[] objArr48 = new Object[1];
                            e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr48);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(keyRepeatDelay, trimmedLength, absoluteGravity3, -477065106, false, (String) objArr48[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr45 = objArr45;
                    str = str;
                    str3 = str11;
                    str2 = str2;
                }
                objArr3 = objArr45;
                c = 0;
            }
            int i54 = ((int[]) objArr3[c])[c];
            int i55 = ((int[]) objArr3[2])[c];
            if (i55 == i54) {
                int i56 = d + 71;
                asInterface = i56 % 128;
                int i57 = i56 % 2;
                int i58 = ((int[]) objArr3[1])[0];
                int i59 = ((int[]) objArr3[2])[0];
                int i60 = ((int[]) objArr3[0])[0];
                String[] strArr6 = (String[]) objArr3[3];
                int[] iArr2 = {i59};
                int iCodePointAt3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_permata).substring(1, 3).codePointAt(0) + 277924235;
                int i61 = i58 + 213563058 + (((~((~iCodePointAt3) | 773604369)) | (-1050658040)) * 529) + (((~(iCodePointAt3 | 773604369)) | (-1050133752)) * 529);
                int i62 = i61 ^ (i61 << 13);
                int i63 = i62 ^ (i62 >>> 17);
                ((int[]) objArr[1])[0] = i63 ^ (i63 << 5);
                Object[] objArr49 = {new int[]{i60}, new int[1], iArr2, strArr6};
                objArr4 = objArr49;
                i = 0;
            } else {
                ArrayList arrayList2 = new ArrayList();
                String[] strArr7 = (String[]) objArr3[3];
                if (strArr7 != null) {
                    for (String str18 : strArr7) {
                        arrayList2.add(str18);
                    }
                }
                int[] iArr3 = new int[i55];
                int i64 = i55 - 1;
                iArr3[i64] = 1;
                Toast.makeText((Context) null, iArr3[((i55 * i64) % 2) - 1], 1).show();
                int i65 = ((int[]) objArr3[1])[0];
                int i66 = ((int[]) objArr3[2])[0];
                int i67 = ((int[]) objArr3[0])[0];
                String[] strArr8 = (String[]) objArr3[3];
                int[] iArr4 = {i66};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i68 = ~iIdentityHashCode2;
                int i69 = i65 + (-645383916) + ((iIdentityHashCode2 | 269644416) * 988) + (((~(1024621457 | i68)) | 44139622) * (-1976)) + (((~(iIdentityHashCode2 | (-799116664))) | 269644416 | (~(799116663 | i68))) * 988);
                int i70 = (i69 << 13) ^ i69;
                int i71 = i70 ^ (i70 >>> 17);
                i = 0;
                ((int[]) objArr4[1])[0] = i71 ^ (i71 << 5);
                objArr4 = new Object[]{new int[]{i67}, new int[1], iArr4, strArr8};
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char cRed2 = (char) Color.red(i);
                int iIndexOf4 = 875 - TextUtils.indexOf((CharSequence) "", '0', i, i);
                int iAlpha = 10 - Color.alpha(i);
                byte[] bArr6 = $$a;
                Object[] objArr50 = new Object[1];
                e((short) 52, (byte) (bArr6[33] - 1), bArr6[7], objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cRed2, iIndexOf4, iAlpha, -1650998592, false, (String) objArr50[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null);
            long jLongValue5 = ((Long) Class.forName(str10).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int iNormalizeMetaState2 = 10 - KeyEvent.normalizeMetaState(0);
                short s6 = $$a[7];
                byte b10 = (byte) s6;
                Object[] objArr51 = new Object[1];
                e(s6, b10, b10, objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cIndexOf2, iResolveOpacity, iNormalizeMetaState2, 2012020043, false, (String) objArr51[0], null);
            }
            if (j2 == ((jLongValue5 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                    int absoluteGravity4 = 876 - Gravity.getAbsoluteGravity(0, 0);
                    int i72 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                    byte b11 = $$a[7];
                    Object[] objArr52 = new Object[1];
                    e((short) 89, b11, b11, objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf3, absoluteGravity4, i72, 2012931276, false, (String) objArr52[0], null);
                }
                Object[] objArr53 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
                objArr5 = new Object[]{new int[]{((int[]) objArr53[0])[0]}, new int[1], new int[]{((int[]) objArr53[2])[0]}, (String[]) objArr53[3]};
                int i73 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 170002161;
                int i74 = (-981816544) + (((~((-783058067) | i73)) | 44597250) * 345) + (((~((-783058067) | (~i73))) | (-787345088)) * 345) + ((~(i73 | (-44597251))) * 345) + 204372886;
                int i75 = (i74 << 13) ^ i74;
                int i76 = i75 ^ (i75 >>> 17);
                ((int[]) objArr5[1])[0] = i76 ^ (i76 << 5);
                str4 = str2;
                str5 = str3;
                c2 = 2;
                str14 = str14;
            } else {
                Context baseContext3 = getBaseContext();
                if (baseContext3 == null) {
                    int i77 = d + 79;
                    asInterface = i77 % 128;
                    int i78 = i77 % 2;
                    str = str;
                    baseContext3 = (Context) Class.forName(str14).getMethod(str, new Class[0]).invoke(null, null);
                } else {
                    str = str;
                }
                if (baseContext3 != null) {
                    baseContext3 = (!((baseContext3 instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
                }
                str4 = str2;
                Object[] objArr54 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 204372886};
                byte[] bArr7 = $$d;
                Object[] objArr55 = new Object[1];
                f(bArr7[93], bArr7[21], (short) ($$e & 381), objArr55);
                Class<?> cls3 = Class.forName((String) objArr55[0]);
                Object[] objArr56 = new Object[1];
                f(bArr7[52], bArr7[93], (short) (-bArr7[370]), objArr56);
                Object[] objArr57 = (Object[]) cls3.getMethod((String) objArr56[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr54);
                if (baseContext3 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char cBlue = (char) Color.blue(0);
                        int mode2 = 876 - View.MeasureSpec.getMode(0);
                        int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                        byte b12 = $$a[7];
                        Object[] objArr58 = new Object[1];
                        e((short) 89, b12, b12, objArr58);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cBlue, mode2, modifierMetaStateMask2, 2012931276, false, (String) objArr58[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr57);
                    try {
                        str5 = str3;
                        long jLongValue6 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf7 = Long.valueOf(jLongValue6);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                            char c7 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iIndexOf5 = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            short s7 = $$a[7];
                            byte b13 = (byte) s7;
                            Object[] objArr59 = new Object[1];
                            e(s7, b13, b13, objArr59);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c7, edgeSlop, iIndexOf5, 2012020043, false, (String) objArr59[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf7);
                        Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                            int iIndexOf6 = 10 - TextUtils.indexOf("", "", 0);
                            byte[] bArr8 = $$a;
                            Object[] objArr60 = new Object[1];
                            e((short) 52, (byte) (bArr8[33] - 1), bArr8[7], objArr60);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cRgb, iKeyCodeFromString, iIndexOf6, -1650998592, false, (String) objArr60[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf8);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                } else {
                    str = str;
                    objArr57 = objArr57;
                    str5 = str3;
                    str14 = str14;
                }
                objArr5 = objArr57;
                c2 = 2;
            }
            int i79 = ((int[]) objArr5[c2])[0];
            int i80 = ((int[]) objArr5[0])[0];
            if (i80 == i79) {
                int i81 = ((int[]) objArr5[1])[0];
                objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                int iMyPid = Process.myPid();
                int i82 = i81 + 1001096684 + (((~iMyPid) | 128511981) * 1444) + (((~(iMyPid | (-313781533))) | (~(354091761 | iMyPid)) | 44100876) * (-1444)) + 1703629508;
                int i83 = (i82 << 13) ^ i82;
                int i84 = i83 ^ (i83 >>> 17);
                ((int[]) objArr6[1])[0] = i84 ^ (i84 << 5);
            } else {
                Toast.makeText((Context) null, i80 / (((i80 - 1) * i80) % 2), 0).show();
                int i85 = ((int[]) objArr5[1])[0];
                objArr6 = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
                int i86 = ~System.identityHashCode(this);
                int i87 = i85 + (-249376900) + (((~((-316918831) | i86)) | 276608601) * (-933)) + (((~(i86 | 276608601)) | (-318766720)) * 933) + 1724080437;
                int i88 = i87 ^ (i87 << 13);
                int i89 = i88 ^ (i88 >>> 17);
                ((int[]) objArr6[1])[0] = i89 ^ (i89 << 5);
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                int scrollBarFadeDuration2 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr61 = new Object[1];
                e((short) 141, (byte) 42, $$a[153], objArr61);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(minimumFlingVelocity, windowTouchSlop3, scrollBarFadeDuration2, -1199417970, false, (String) objArr61[0], null);
            }
            long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null);
            long jLongValue7 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int absoluteGravity5 = 876 - Gravity.getAbsoluteGravity(0, 0);
                int i90 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                Object[] objArr62 = new Object[1];
                e((short) ($$b + 3), (byte) 52, $$a[33], objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(scrollBarFadeDuration3, absoluteGravity5, i90, 254769921, false, (String) objArr62[0], null);
            }
            if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iMyPid2 = (Process.myPid() >> 22) + 876;
                    int size = View.MeasureSpec.getSize(0) + 10;
                    short s8 = (short) ($$b + 3);
                    byte[] bArr9 = $$a;
                    Object[] objArr63 = new Object[1];
                    e(s8, bArr9[44], bArr9[153], objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(fadingEdgeLength, iMyPid2, size, 1324201839, false, (String) objArr63[0], null);
                }
                Object[] objArr64 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).get(null);
                objArr7 = new Object[]{new int[]{((int[]) objArr64[0])[0]}, new int[1], new int[]{((int[]) objArr64[2])[0]}, (String[]) objArr64[3]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i91 = (-110414582) + (((~((~iIdentityHashCode3) | 637529965)) | 33558672) * 529) + (((~(iIdentityHashCode3 | 637529965)) | 597219736) * 529) + 507005472;
                int i92 = (i91 << 13) ^ i91;
                int i93 = i92 ^ (i92 >>> 17);
                ((int[]) objArr7[1])[0] = i93 ^ (i93 << 5);
            } else {
                Object[] objArr65 = {Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 507005472};
                byte[] bArr10 = $$d;
                Object[] objArr66 = new Object[1];
                f(bArr10[364], bArr10[440], (short) ($$e & 968), objArr66);
                Class<?> cls4 = Class.forName((String) objArr66[0]);
                byte b14 = bArr10[52];
                byte b15 = bArr10[93];
                Object[] objArr67 = new Object[1];
                f(b14, b15, (short) (b15 | 214), objArr67);
                objArr7 = (Object[]) cls4.getMethod((String) objArr67[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr65);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                    int iAxisFromString = 875 - MotionEvent.axisFromString("");
                    int iBlue = 10 - Color.blue(0);
                    short s9 = (short) ($$b + 3);
                    byte[] bArr11 = $$a;
                    Object[] objArr68 = new Object[1];
                    e(s9, bArr11[44], bArr11[153], objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(packedPositionType2, iAxisFromString, iBlue, 1324201839, false, (String) objArr68[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr7);
                try {
                    long jLongValue8 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                        char c8 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iMyPid3 = 876 - (Process.myPid() >> 22);
                        int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                        Object[] objArr69 = new Object[1];
                        e((short) ($$b + 3), (byte) 52, $$a[33], objArr69);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c8, iMyPid3, iIndexOf7, 254769921, false, (String) objArr69[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char c9 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i94 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                        Object[] objArr70 = new Object[1];
                        e((short) 141, (byte) 42, $$a[153], objArr70);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c9, i94, maximumDrawingCacheSize, -1199417970, false, (String) objArr70[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf10);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            int i95 = ((int[]) objArr7[2])[0];
            int i96 = ((int[]) objArr7[0])[0];
            if (i96 != i95) {
                ArrayList arrayList3 = new ArrayList();
                String[] strArr9 = (String[]) objArr7[3];
                if (strArr9 != null) {
                    for (String str19 : strArr9) {
                        arrayList3.add(str19);
                    }
                }
                throw new RuntimeException(String.valueOf(i96));
            }
            int i97 = ((int[]) objArr7[1])[0];
            Object[] objArr71 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iCodePointAt4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1396003809;
            int i98 = i97 + ((((-1703544620) + (((~(223495211 | iCodePointAt4)) | 44636672) * 576)) + (((~((~iCodePointAt4) | 268131883)) | 219168768) * 576)) - 59080704);
            int i99 = i98 ^ (i98 << 13);
            int i100 = i99 ^ (i99 >>> 17);
            ((int[]) objArr71[1])[0] = i100 ^ (i100 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 53894);
                int iIndexOf8 = 1320 - TextUtils.indexOf("", "", 0);
                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37;
                Object[] objArr72 = new Object[1];
                e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(bitsPerPixel, iIndexOf8, iIndexOf9, -1433084963, false, (String) objArr72[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) != -1) {
                int i101 = d + 43;
                asInterface = i101 % 128;
                int i102 = i101 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cIndexOf4 = (char) (53892 - TextUtils.indexOf((CharSequence) "", '0'));
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1320;
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                    short s10 = $$a[7];
                    byte b16 = (byte) s10;
                    Object[] objArr73 = new Object[1];
                    e(s10, b16, b16, objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf4, pressedStateDuration, jumpTapTimeout2, -1920778747, false, (String) objArr73[0], null);
                }
                Object[] objArr74 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                objArr8 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                int i103 = ((int[]) objArr74[0])[0];
                int i104 = ((int[]) objArr74[3])[0];
                String[] strArr10 = (String[]) objArr74[2];
                int i105 = ~(((int) Runtime.getRuntime().totalMemory()) | 848656531);
                int i106 = (((-1348701660) + (((-521971294) | i105) * (-220))) + ((i105 | (-1067319008)) * 220)) - 54218927;
                int i107 = (i106 << 13) ^ i106;
                int i108 = i107 ^ (i107 >>> 17);
                ((int[]) objArr8[1])[0] = i108 ^ (i108 << 5);
                str6 = str;
                c3 = 3;
                objArr71 = objArr71;
            } else {
                Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    str6 = str;
                    baseContext4 = (Context) Class.forName(str14).getMethod(str6, new Class[0]).invoke(null, null);
                } else {
                    str6 = str;
                }
                if (baseContext4 != null) {
                    baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
                }
                int iIntValue3 = ((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue();
                Object[] objArr75 = {1316708816};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b((char) (47977 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 1300, TextUtils.indexOf((CharSequence) "", '0') + 21, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr76 = {baseContext4, "com.bpjstku", 1804006093, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).newInstance(objArr75), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 53894);
                    int size2 = 1320 - View.MeasureSpec.getSize(0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 36;
                    short s11 = $$a[7];
                    byte b17 = (byte) s11;
                    Object[] objArr77 = new Object[1];
                    e(s11, b17, b17, objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cLastIndexOf, size2, iResolveSizeAndState, 819724799, false, (String) objArr77[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 57878), 1395 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 75 - ExpandableListView.getPackedPositionType(0L)), Boolean.TYPE});
                }
                Object[] objArr78 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).invoke(null, objArr76);
                if (baseContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char cLastIndexOf2 = (char) (53892 - TextUtils.lastIndexOf("", '0', 0));
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1320;
                        int deadChar = 36 - KeyEvent.getDeadChar(0, 0);
                        short s12 = $$a[7];
                        byte b18 = (byte) s12;
                        Object[] objArr79 = new Object[1];
                        e(s12, b18, b18, objArr79);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cLastIndexOf2, scrollBarSize2, deadChar, -1920778747, false, (String) objArr79[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, objArr78);
                    try {
                        long jLongValue9 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue9);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                            char tapTimeout = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                            int iIndexOf10 = TextUtils.indexOf("", "", 0, 0) + 1320;
                            int i109 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35;
                            byte[] bArr12 = $$a;
                            Object[] objArr80 = new Object[1];
                            e((short) 52, (byte) (bArr12[33] - 1), bArr12[7], objArr80);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(tapTimeout, iIndexOf10, i109, -1273706634, false, (String) objArr80[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                            char c10 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53892);
                            int i110 = 1320 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int capsMode2 = 36 - TextUtils.getCapsMode("", 0, 0);
                            Object[] objArr81 = new Object[1];
                            e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr81);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c10, i110, capsMode2, -1433084963, false, (String) objArr81[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf12);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                } else {
                    str6 = str6;
                    objArr78 = objArr78;
                }
                objArr8 = objArr78;
                c3 = 3;
            }
            if (((int[]) objArr8[0])[0] != ((int[]) objArr8[c3])[0]) {
                throw null;
            }
            Object[] objArr82 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i111 = ((int[]) objArr8[1])[0];
            int i112 = ((int[]) objArr8[0])[0];
            int i113 = ((int[]) objArr8[3])[0];
            String[] strArr11 = (String[]) objArr8[2];
            int i114 = (~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode) | 245247243;
            int i115 = i111 + 1352945648 + (i114 * 495) + (((~i114) | 34742529) * 495);
            int i116 = (i115 << 13) ^ i115;
            int i117 = i116 ^ (i116 >>> 17);
            ((int[]) objArr82[1])[0] = i117 ^ (i117 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                int maxKeyCode = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
                int maxKeyCode2 = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b19 = $$a[7];
                Object[] objArr83 = new Object[1];
                e((short) 89, b19, b19, objArr83);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cResolveSizeAndState, maxKeyCode, maxKeyCode2, -1272852037, false, (String) objArr83[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char packedPositionGroup2 = (char) (43042 - ExpandableListView.getPackedPositionGroup(0L));
                    int i118 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3111;
                    int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                    byte[] bArr13 = $$a;
                    Object[] objArr84 = new Object[1];
                    e((short) 52, (byte) (bArr13[33] - 1), bArr13[7], objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionGroup2, i118, maximumFlingVelocity2, 154975793, false, (String) objArr84[0], null);
                }
                Object[] objArr85 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
                int i119 = ((int[]) objArr85[2])[0];
                int i120 = ((int[]) objArr85[1])[0];
                String[] strArr12 = (String[]) objArr85[3];
                int[] iArr5 = {i120};
                int i121 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.ef_gif).substring(0, 3).length() + 1327971386);
                int i122 = (((-1819161582) + (((-1427931153) | i121) * 184)) + (((~(i121 | 138616585)) | (-1428064017)) * 184)) - 2070791538;
                int i123 = (i122 << 13) ^ i122;
                int i124 = i123 ^ (i123 >>> 17);
                ((int[]) objArr9[0])[0] = i124 ^ (i124 << 5);
                objArr9 = new Object[]{new int[1], iArr5, new int[]{i119}, strArr12};
                int i125 = d + 47;
                asInterface = i125 % 128;
                int i126 = i125 % 2;
                objArr82 = objArr82;
            } else {
                Object[] objArr86 = {null, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, -2070791538};
                byte[] bArr14 = $$d;
                Object[] objArr87 = new Object[1];
                f(bArr14[91], bArr14[115], (short) 266, objArr87);
                Class<?> cls5 = Class.forName((String) objArr87[0]);
                byte b20 = bArr14[14];
                byte b21 = bArr14[93];
                Object[] objArr88 = new Object[1];
                f(b20, b21, (short) (b21 | 319), objArr88);
                Object[] objArr89 = (Object[]) cls5.getMethod((String) objArr88[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr86);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int i127 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3110;
                    int i128 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                    byte[] bArr15 = $$a;
                    Object[] objArr90 = new Object[1];
                    e((short) 52, (byte) (bArr15[33] - 1), bArr15[7], objArr90);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(longPressTimeout, i127, i128, 154975793, false, (String) objArr90[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, objArr89);
                try {
                    long jLongValue10 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char cMyTid = (char) ((Process.myTid() >> 22) + 43042);
                        int minimumFlingVelocity2 = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 23;
                        short s13 = $$a[7];
                        byte b22 = (byte) s13;
                        Object[] objArr91 = new Object[1];
                        e(s13, b22, b22, objArr91);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cMyTid, minimumFlingVelocity2, bitsPerPixel2, -1269618118, false, (String) objArr91[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                        char c11 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43041);
                        int i129 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                        int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                        byte b23 = $$a[7];
                        Object[] objArr92 = new Object[1];
                        e((short) 89, b23, b23, objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c11, i129, iCombineMeasuredStates, -1272852037, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf14);
                    objArr9 = objArr89;
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr9[2])[0] != ((int[]) objArr9[1])[0]) {
                ArrayList arrayList4 = new ArrayList();
                String[] strArr13 = (String[]) objArr9[3];
                if (strArr13 != null) {
                    for (String str20 : strArr13) {
                        arrayList4.add(str20);
                    }
                }
                throw null;
            }
            int i130 = ((int[]) objArr9[0])[0];
            int i131 = ((int[]) objArr9[2])[0];
            int i132 = ((int[]) objArr9[1])[0];
            String[] strArr14 = (String[]) objArr9[3];
            int[] iArr6 = {i132};
            int i133 = ~System.identityHashCode(this);
            int i134 = i130 + (((440129208 + (((~((-253396545) | i133)) | (-1451634915)) * (-933))) + (((~(i133 | (-1451634915))) | 1350840482) * 933)) - 2104527183);
            int i135 = (i134 << 13) ^ i134;
            int i136 = i135 ^ (i135 >>> 17);
            ((int[]) objArr[0])[0] = i136 ^ (i136 << 5);
            Object[] objArr93 = {new int[1], iArr6, new int[]{i131}, strArr14};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char cIndexOf5 = (char) (31533 - TextUtils.indexOf("", ""));
                int iIndexOf11 = TextUtils.indexOf("", "", 0) + 921;
                int iMyPid4 = (Process.myPid() >> 22) + 28;
                Object[] objArr94 = new Object[1];
                e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr94);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cIndexOf5, iIndexOf11, iMyPid4, -1048449946, false, (String) objArr94[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char c12 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31533);
                    int i137 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                    byte[] bArr16 = $$a;
                    Object[] objArr95 = new Object[1];
                    e((short) 52, (byte) (bArr16[33] - 1), bArr16[7], objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c12, i137, maxKeyCode3, -1142834547, false, (String) objArr95[0], null);
                }
                Object[] objArr96 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).get(null);
                objArr10 = new Object[]{new int[1], new int[]{((int[]) objArr96[1])[0]}, (Object[]) objArr96[2], new int[]{((int[]) objArr96[3])[0]}, (String[]) objArr96[4]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i138 = (-140572215) + (((~iFreeMemory) | 205678252) * 1324) + (((~(iFreeMemory | 1551034350)) | (~(223045293 | iFreeMemory))) * (-1324)) + 652679842;
                int i139 = (i138 << 13) ^ i138;
                int i140 = i139 ^ (i139 >>> 17);
                ((int[]) objArr10[0])[0] = i140 ^ (i140 << 5);
                str4 = str4;
                str7 = str6;
                i2 = 1;
                objArr93 = objArr93;
            } else {
                Context baseContext5 = getBaseContext();
                if (baseContext5 == null) {
                    str7 = str6;
                    baseContext5 = (Context) Class.forName(str14).getMethod(str7, new Class[0]).invoke(null, null);
                } else {
                    str7 = str6;
                }
                if (baseContext5 != null) {
                    baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
                }
                Object[] objArr97 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str4, Object.class).invoke(null, this)).intValue()), 0, 473093984};
                byte[] bArr17 = $$d;
                Object[] objArr98 = new Object[1];
                f(bArr17[178], bArr17[21], (short) 356, objArr98);
                Class<?> cls6 = Class.forName((String) objArr98[0]);
                byte b24 = bArr17[14];
                byte b25 = bArr17[93];
                Object[] objArr99 = new Object[1];
                f(b24, b25, (short) (b25 | 319), objArr99);
                Object[] objArr100 = (Object[]) cls6.getMethod((String) objArr99[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr97);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char c13 = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iAlpha2 = Color.alpha(0) + 921;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                    byte[] bArr18 = $$a;
                    Object[] objArr101 = new Object[1];
                    e((short) 52, (byte) (bArr18[33] - 1), bArr18[7], objArr101);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c13, iAlpha2, iLastIndexOf, -1142834547, false, (String) objArr101[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr100);
                try {
                    long jLongValue11 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char keyRepeatTimeout3 = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int iRed = 921 - Color.red(0);
                        int scrollBarFadeDuration4 = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        short s14 = $$a[7];
                        byte b26 = (byte) s14;
                        Object[] objArr102 = new Object[1];
                        e(s14, b26, b26, objArr102);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(keyRepeatTimeout3, iRed, scrollBarFadeDuration4, -778300370, false, (String) objArr102[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                        int iMyPid5 = 921 - (Process.myPid() >> 22);
                        int iIndexOf12 = 27 - TextUtils.indexOf((CharSequence) "", '0');
                        Object[] objArr103 = new Object[1];
                        e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cLastIndexOf3, iMyPid5, iIndexOf12, -1048449946, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf16);
                    objArr10 = objArr100;
                    i2 = 1;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            int i141 = ((int[]) objArr10[i2])[0];
            int i142 = ((int[]) objArr10[3])[0];
            if (i142 == i141) {
                objArr11 = new Object[5];
                objArr11[0] = new int[i2];
                int[] iArr7 = new int[i2];
                objArr11[i2] = iArr7;
                int[] iArr8 = new int[i2];
                objArr11[3] = iArr8;
                int i143 = ((int[]) objArr10[0])[0];
                int i144 = ((int[]) objArr10[3])[0];
                int i145 = ((int[]) objArr10[i2])[0];
                String[] strArr15 = (String[]) objArr10[4];
                Object[] objArr104 = (Object[]) objArr10[2];
                iArr8[0] = i144;
                iArr7[0] = i145;
                objArr11[4] = strArr15;
                objArr11[2] = objArr104;
                int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).length() - 164647922;
                int i146 = ~length2;
                int i147 = i143 + 1976734818 + (((~((-787851362) | i146)) | (-986228283)) * (-865)) + ((~(length2 | 787851361)) * 865) + (((~((-986228283) | i146)) | (~(i146 | 787851361))) * 865);
                int i148 = (i147 << 13) ^ i147;
                int i149 = i148 ^ (i148 >>> 17);
                i3 = 0;
                ((int[]) objArr11[0])[0] = i149 ^ (i149 << 5);
            } else {
                ArrayList arrayList5 = new ArrayList();
                String[] strArr16 = (String[]) objArr10[4];
                if (strArr16 != null) {
                    for (String str21 : strArr16) {
                        arrayList5.add(str21);
                    }
                }
                Toast.makeText((Context) null, i142 / (((i142 - 1) * i142) % 2), 0).show();
                int i150 = ((int[]) objArr10[0])[0];
                objArr11 = new Object[]{new int[1], new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[]{((int[]) objArr10[3])[0]}, (String[]) objArr10[4]};
                int i151 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
                int i152 = i150 + ((((-1696515670) + (((~((-704667821) | i151)) | (~(1069411823 | i151))) * 69)) + (((~(i151 | 1067803820)) | ((~((-706275824) | i151)) | 1608003)) * (-69))) - 713419776);
                int i153 = (i152 << 13) ^ i152;
                int i154 = i153 ^ (i153 >>> 17);
                i3 = 0;
                ((int[]) objArr11[0])[0] = i154 ^ (i154 << 5);
            }
            ScholarshipGranteeActivity scholarshipGranteeActivity = this;
            Intrinsics.checkNotNullParameter(scholarshipGranteeActivity, "");
            scholarshipGranteeActivity.getWindow().addFlags(8192);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char deadChar2 = (char) KeyEvent.getDeadChar(i3, i3);
                int iNormalizeMetaState3 = 876 - KeyEvent.normalizeMetaState(i3);
                int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 11;
                Object[] objArr105 = new Object[1];
                e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(deadChar2, iNormalizeMetaState3, modifierMetaStateMask3, 252381699, false, (String) objArr105[0], null);
            }
            long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null);
            long jLongValue12 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char c14 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                int tapTimeout2 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                short s15 = (short) ($$b | 10);
                byte b27 = $$a[7];
                Object[] objArr106 = new Object[1];
                e(s15, b27, b27, objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c14, maxKeyCode4, tapTimeout2, 2009631821, false, (String) objArr106[0], null);
            }
            if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int absoluteGravity6 = Gravity.getAbsoluteGravity(0, 0) + 876;
                    int i155 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    short s16 = (short) 210;
                    Object[] objArr107 = new Object[1];
                    e(s16, (byte) (s16 >>> 2), $$a[54], objArr107);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cNormalizeMetaState, absoluteGravity6, i155, 256017550, false, (String) objArr107[0], null);
                }
                Object[] objArr108 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                objArr12 = new Object[]{new int[]{((int[]) objArr108[0])[0]}, new int[1], new int[]{((int[]) objArr108[2])[0]}, (String[]) objArr108[3]};
                int iNextInt = new Random().nextInt();
                int i156 = ~iNextInt;
                int i157 = (((1650998078 + ((~(257054572 | i156)) * 979)) + ((iNextInt | 297364801) * (-979))) + (((~(iNextInt | 257054572)) | (~(i156 | 297364801))) * 979)) - 1343553060;
                int i158 = (i157 << 13) ^ i157;
                int i159 = i158 ^ (i158 >>> 17);
                ((int[]) objArr12[1])[0] = i159 ^ (i159 << 5);
                str8 = str4;
            } else {
                Context baseContext6 = getBaseContext();
                if (baseContext6 == null) {
                    baseContext6 = (Context) Class.forName(str14).getMethod(str7, new Class[0]).invoke(null, null);
                }
                if (baseContext6 != null) {
                    baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
                }
                str8 = str4;
                Object[] objArr109 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str8, Object.class).invoke(null, this)).intValue()), -1343553060};
                byte[] bArr19 = $$d;
                Object[] objArr110 = new Object[1];
                f(bArr19[91], bArr19[21], (short) 396, objArr110);
                Class<?> cls7 = Class.forName((String) objArr110[0]);
                byte b28 = bArr19[14];
                byte b29 = bArr19[93];
                Object[] objArr111 = new Object[1];
                f(b28, b29, (short) (b29 | 319), objArr111);
                objArr12 = (Object[]) cls7.getMethod((String) objArr111[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr109);
                if (baseContext6 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                        int i160 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iRed2 = 10 - Color.red(0);
                        short s17 = (short) 210;
                        Object[] objArr112 = new Object[1];
                        e(s17, (byte) (s17 >>> 2), $$a[54], objArr112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(gidForName2, i160, iRed2, 256017550, false, (String) objArr112[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr12);
                    try {
                        long jLongValue13 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf17 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                            char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int packedPositionType3 = 876 - ExpandableListView.getPackedPositionType(0L);
                            int packedPositionGroup3 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                            short s18 = (short) ($$b | 10);
                            byte b30 = $$a[7];
                            Object[] objArr113 = new Object[1];
                            e(s18, b30, b30, objArr113);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(tapTimeout3, packedPositionType3, packedPositionGroup3, 2009631821, false, (String) objArr113[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf17);
                        Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                            char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 876;
                            int iGreen = Color.green(0) + 10;
                            Object[] objArr114 = new Object[1];
                            e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(deadChar3, iKeyCodeFromString2, iGreen, 252381699, false, (String) objArr114[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf18);
                    } catch (Exception unused8) {
                        throw new RuntimeException();
                    }
                }
            }
            int i161 = ((int[]) objArr12[2])[0];
            int i162 = ((int[]) objArr12[0])[0];
            if (i162 != i161) {
                throw new RuntimeException(String.valueOf(i162));
            }
            int i163 = ((int[]) objArr12[1])[0];
            Object[] objArr115 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i164 = i163 + ((((-1703544620) + (((~(855805323 | iIdentityHashCode4)) | 73998944) * 576)) + (((~((~iIdentityHashCode4) | 929804267)) | 822116608) * 576)) - 326281216);
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr115[1])[0] = i166 ^ (i166 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                int i167 = 652 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int fadingEdgeLength2 = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                short s19 = (short) ($$b | 10);
                byte b31 = $$a[7];
                Object[] objArr116 = new Object[1];
                e(s19, b31, b31, objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(offsetBefore2, i167, fadingEdgeLength2, -459846511, false, (String) objArr116[0], null);
            }
            long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
            long jLongValue14 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char mode3 = (char) View.MeasureSpec.getMode(0);
                int iIndexOf13 = 651 - TextUtils.indexOf("", "", 0, 0);
                int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 44;
                Object[] objArr117 = new Object[1];
                e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(mode3, iIndexOf13, packedPositionGroup4, -873460649, false, (String) objArr117[0], null);
            }
            if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char c15 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int i168 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i169 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte[] bArr20 = $$a;
                    Object[] objArr118 = new Object[1];
                    e((short) 52, (byte) (bArr20[33] - 1), bArr20[7], objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c15, i168, i169, -1595579076, false, (String) objArr118[0], null);
                }
                Object[] objArr119 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                objArr13 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i170 = ((int[]) objArr119[2])[0];
                int i171 = ((int[]) objArr119[0])[0];
                int i172 = ~System.identityHashCode(this);
                int i173 = 528201913 + (((~(i172 | 654445313)) | 13480038) * (-160)) + (((~(i172 | 651014503)) | 654445313) * 160) + 991352329;
                int i174 = (i173 << 13) ^ i173;
                int i175 = i174 ^ (i174 >>> 17);
                ((int[]) objArr13[3])[0] = i175 ^ (i175 << 5);
                i4 = 0;
            } else {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1610 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr120 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).newInstance(null), 991352329, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char cIndexOf6 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int jumpTapTimeout3 = 651 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 45;
                    Object[] objArr121 = new Object[1];
                    e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr121);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(cIndexOf6, jumpTapTimeout3, bitsPerPixel3, 2075921419, false, (String) objArr121[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Drawable.resolveOpacity(0, 0) + 695, (ViewConfiguration.getTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.myTid() >> 22) + 63406), (KeyEvent.getMaxKeyCode() >> 16) + 793, TextUtils.indexOf("", "") + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).invoke(null, objArr120);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                    int iMyPid6 = 651 - (Process.myPid() >> 22);
                    int iIndexOf14 = 44 - TextUtils.indexOf("", "", 0);
                    byte[] bArr21 = $$a;
                    Object[] objArr122 = new Object[1];
                    e((short) 52, (byte) (bArr21[33] - 1), bArr21[7], objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cLastIndexOf4, iMyPid6, iIndexOf14, -1595579076, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, objArr13);
                try {
                    long jLongValue15 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                        int i176 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 650;
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                        Object[] objArr123 = new Object[1];
                        e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr123);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(packedPositionChild, i176, maximumDrawingCacheSize2, -873460649, false, (String) objArr123[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                        char c16 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int longPressTimeout2 = 651 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 44;
                        short s20 = (short) ($$b | 10);
                        byte b32 = $$a[7];
                        Object[] objArr124 = new Object[1];
                        e(s20, b32, b32, objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c16, longPressTimeout2, capsMode3, -459846511, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf20);
                    i4 = 0;
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            int i177 = ((int[]) objArr13[i4])[i4];
            int i178 = ((int[]) objArr13[2])[i4];
            if (i178 == i177) {
                objArr14 = new Object[4];
                int[] iArr9 = new int[1];
                objArr14[i4] = iArr9;
                int[] iArr10 = new int[1];
                objArr14[2] = iArr10;
                objArr14[3] = new int[1];
                int i179 = ((int[]) objArr13[3])[i4];
                int i180 = ((int[]) objArr13[2])[i4];
                int i181 = ((int[]) objArr13[i4])[i4];
                iArr10[i4] = i180;
                iArr9[i4] = i181;
                objArr14[1] = new String[i4];
                int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                int i182 = ~iFreeMemory2;
                int i183 = i179 + (((~(166723582 | i182)) | (~((-4957827) | iFreeMemory2))) * 988) + 1216170997 + (((~(iFreeMemory2 | 158334946)) | 8388636 | (~(i182 | (-4957827)))) * 988);
                int i184 = (i183 << 13) ^ i183;
                int i185 = i184 ^ (i184 >>> 17);
                ((int[]) objArr14[3])[0] = i185 ^ (i185 << 5);
            } else {
                ArrayList arrayList6 = new ArrayList();
                String[] strArr17 = (String[]) objArr13[1];
                if (strArr17 != null) {
                    int i186 = 0;
                    while (i186 < strArr17.length) {
                        int i187 = asInterface + 41;
                        d = i187 % 128;
                        if (i187 % 2 == 0) {
                            arrayList6.add(strArr17[i186]);
                            i186 += 27;
                        } else {
                            arrayList6.add(strArr17[i186]);
                            i186++;
                        }
                    }
                }
                int[] iArr11 = new int[i178];
                int i188 = i178 - 1;
                iArr11[i188] = 1;
                Toast.makeText((Context) null, iArr11[((i178 * i188) % 2) - 1], 1).show();
                objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i189 = ((int[]) objArr13[3])[0];
                int i190 = ((int[]) objArr13[2])[0];
                int i191 = ((int[]) objArr13[0])[0];
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i192 = ~iIdentityHashCode5;
                int i193 = i189 + 1952130321 + (((~((-1023670457) | i192)) | 16801952 | (~(1020239646 | i192))) * (-1136)) + (((~((-1023670457) | iIdentityHashCode5)) | (~(1020239646 | iIdentityHashCode5)) | (~((-13371143) | i192))) * (-568)) + (((~(iIdentityHashCode5 | (-16801953))) | (~(i192 | (-1020239647))) | (~(1023670456 | i192))) * 568);
                int i194 = (i193 << 13) ^ i193;
                int i195 = i194 ^ (i194 >>> 17);
                ((int[]) objArr14[3])[0] = i195 ^ (i195 << 5);
                int i196 = asInterface + 119;
                d = i196 % 128;
                int i197 = i196 % 2;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cGreen2 = (char) Color.green(0);
                int iMyPid7 = (Process.myPid() >> 22) + 1031;
                int gidForName3 = Process.getGidForName("") + 16;
                byte b33 = $$a[7];
                Object[] objArr125 = new Object[1];
                e((short) 89, b33, b33, objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cGreen2, iMyPid7, gidForName3, 1357589585, false, (String) objArr125[0], null);
            }
            long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null);
            long jLongValue16 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char tapTimeout4 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 1031;
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 16;
                short s21 = $$a[7];
                byte b34 = (byte) s21;
                Object[] objArr126 = new Object[1];
                e(s21, b34, b34, objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(tapTimeout4, iResolveSizeAndState2, packedPositionChild2, 1344079056, false, (String) objArr126[0], null);
            }
            if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char packedPositionGroup5 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf15 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                    int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr127 = new Object[1];
                    e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(packedPositionGroup5, iIndexOf15, iMakeMeasureSpec, 632103528, false, (String) objArr127[0], null);
                }
                Object[] objArr128 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).get(null);
                objArr15 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                int i198 = ((int[]) objArr128[3])[0];
                int i199 = ((int[]) objArr128[1])[0];
                String[] strArr18 = (String[]) objArr128[0];
                str9 = "currentApplication";
                int length3 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str9, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_no_face).substring(13, 14).length() + 1079884696;
                int i200 = ~length3;
                int i201 = (((1240780915 + (((~(772658666 | i200)) | (-1050531327)) * 98)) + ((((~(i200 | (-1016938837))) | 772658666) | (~(1016938836 | length3))) * (-49))) + (((~(length3 | 772658666)) | 33592490) * 49)) - 1485787070;
                int i202 = (i201 << 13) ^ i201;
                int i203 = i202 ^ (i202 >>> 17);
                ((int[]) objArr15[2])[0] = i203 ^ (i203 << 5);
            } else {
                str9 = r0;
                int iIntValue4 = ((Integer) Class.forName(str12).getMethod(str8, Object.class).invoke(null, this)).intValue();
                Object[] objArr129 = {105185386};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 46038), 1134 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr130 = {Integer.valueOf(iIntValue4), 0, -1485787070, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).newInstance(objArr129), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    char cGreen3 = (char) Color.green(0);
                    int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 1031;
                    int iIndexOf16 = TextUtils.indexOf("", "", 0) + 15;
                    byte b35 = $$a[7];
                    Object[] objArr131 = new Object[1];
                    e((short) 89, b35, b35, objArr131);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cGreen3, capsMode4, iIndexOf16, 1298546779, false, (String) objArr131[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0, 0) + 45993), 1117 - Gravity.getAbsoluteGravity(0, 0), 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Boolean.TYPE});
                }
                Object[] objArr132 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).invoke(null, objArr130);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int i204 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i205 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr133 = new Object[1];
                    e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cKeyCodeFromString, i204, i205, 632103528, false, (String) objArr133[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr132);
                try {
                    long jLongValue17 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                        char cLastIndexOf5 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int i206 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int defaultSize = View.getDefaultSize(0, 0) + 15;
                        short s22 = $$a[7];
                        byte b36 = (byte) s22;
                        Object[] objArr134 = new Object[1];
                        e(s22, b36, b36, objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cLastIndexOf5, i206, defaultSize, 1344079056, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                        char maxKeyCode5 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int i207 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1030;
                        int defaultSize2 = 15 - View.getDefaultSize(0, 0);
                        byte b37 = $$a[7];
                        Object[] objArr135 = new Object[1];
                        e((short) 89, b37, b37, objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(maxKeyCode5, i207, defaultSize2, 1357589585, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf22);
                    objArr15 = objArr132;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            int i208 = ((int[]) objArr15[1])[0];
            int i209 = ((int[]) objArr15[3])[0];
            if (i209 != i208) {
                ArrayList arrayList7 = new ArrayList();
                String[] strArr19 = (String[]) objArr15[0];
                if (strArr19 != null) {
                    for (String str22 : strArr19) {
                        arrayList7.add(str22);
                    }
                }
                throw new RuntimeException(String.valueOf(i209));
            }
            Object[] objArr136 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i210 = ((int[]) objArr15[2])[0];
            int i211 = ((int[]) objArr15[3])[0];
            int i212 = ((int[]) objArr15[1])[0];
            String[] strArr20 = (String[]) objArr15[0];
            int iMyTid2 = Process.myTid();
            int i213 = 619903433 + (((~(497518867 | iMyTid2)) | (-253238698)) * 672);
            int i214 = ~iMyTid2;
            int i215 = i210 + i213 + (((~(iMyTid2 | (-253238698))) | (~((-497518868) | i214))) * (-672)) + (((~(253238697 | i214)) | (-532651452)) * 672);
            int i216 = (i215 << 13) ^ i215;
            int i217 = i216 ^ (i216 >>> 17);
            ((int[]) objArr136[2])[0] = i217 ^ (i217 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16807160);
                int iRgb = Color.rgb(0, 0, 0) + 16778971;
                int i218 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr22 = $$a;
                Object[] objArr137 = new Object[1];
                e((short) 52, (byte) (bArr22[33] - 1), bArr22[7], objArr137);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cRgb2, iRgb, i218, 986134021, false, (String) objArr137[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                    char windowTouchSlop4 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                    int offsetBefore3 = TextUtils.getOffsetBefore("", 0) + 1755;
                    int i219 = 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    short s23 = $$a[7];
                    byte b38 = (byte) s23;
                    Object[] objArr138 = new Object[1];
                    e(s23, b38, b38, objArr138);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(windowTouchSlop4, offsetBefore3, i219, 1599039318, false, (String) objArr138[0], null);
                }
                Object[] objArr139 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).get(null);
                objArrB$7879113 = new Object[]{new int[]{((int[]) objArr139[0])[0]}, new int[]{((int[]) objArr139[1])[0]}, (Object[]) objArr139[2], new int[1], (String[]) objArr139[4]};
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i220 = ~iIdentityHashCode6;
                int i221 = (((1353485922 + (((-341835785) | i220) * (-369))) + (((~((-722247623) | i220)) | (-509645197)) * (-369))) + ((((~(iIdentityHashCode6 | 722247622)) | (-1064083407)) | (~(i220 | (-167809413)))) * 369)) - 1672289656;
                int i222 = (i221 << 13) ^ i221;
                int i223 = i222 ^ (i222 >>> 17);
                ((int[]) objArrB$7879113[3])[0] = i223 ^ (i223 << 5);
            } else {
                int iIntValue5 = ((Integer) Class.forName(str12).getMethod(str8, Object.class).invoke(null, this)).intValue();
                Object[] objArr140 = {105185386};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b((char) (42048 - ExpandableListView.getPackedPositionChild(0L)), 1726 - TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionChild(0L) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue5, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).newInstance(objArr140), -1672289656, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                    char keyRepeatDelay2 = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1756;
                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    short s24 = $$a[7];
                    byte b39 = (byte) s24;
                    Object[] objArr141 = new Object[1];
                    e(s24, b39, b39, objArr141);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(keyRepeatDelay2, iLastIndexOf2, keyRepeatDelay3, 1599039318, false, (String) objArr141[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, objArrB$7879113);
                try {
                    long jLongValue18 = ((Long) Class.forName(str10).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf23 = Long.valueOf(jLongValue18);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                        char longPressTimeout3 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                        int i224 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                        int iAlpha3 = 23 - Color.alpha(0);
                        short s25 = (short) ($$b | 10);
                        byte b40 = $$a[7];
                        Object[] objArr142 = new Object[1];
                        e(s25, b40, b40, objArr142);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(longPressTimeout3, i224, iAlpha3, 1596667560, false, (String) objArr142[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).set(null, lValueOf23);
                    Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault75 == null) {
                        char c17 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int absoluteGravity7 = 1755 - Gravity.getAbsoluteGravity(0, 0);
                        int iKeyCodeFromString3 = 23 - KeyEvent.keyCodeFromString("");
                        byte[] bArr23 = $$a;
                        Object[] objArr143 = new Object[1];
                        e((short) 52, (byte) (bArr23[33] - 1), bArr23[7], objArr143);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault75 = initSession.b(c17, absoluteGravity7, iKeyCodeFromString3, 986134021, false, (String) objArr143[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault75).set(null, lValueOf24);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            int i225 = ((int[]) objArrB$7879113[1])[0];
            int i226 = ((int[]) objArrB$7879113[0])[0];
            if (i226 == i225) {
                int i227 = ((int[]) objArrB$7879113[3])[0];
                objArr16 = new Object[]{new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
                int i228 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str9, new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
                int i229 = (~(601742828 | i228)) | 268443650;
                int i230 = ~i228;
                int i231 = i227 + 691582847 + ((i229 | (~((-55841225) | i230))) * 886) + (((~(i230 | (-601742829))) | 814345254) * (-1772)) + ((~(i230 | 814345254)) * 886);
                int i232 = (i231 << 13) ^ i231;
                int i233 = i232 ^ (i232 >>> 17);
                ((int[]) objArr16[3])[0] = i233 ^ (i233 << 5);
                c5 = 0;
                c4 = 3;
            } else {
                ArrayList arrayList8 = new ArrayList();
                String[] strArr21 = (String[]) objArrB$7879113[4];
                if (strArr21 != null) {
                    for (String str23 : strArr21) {
                        arrayList8.add(str23);
                    }
                }
                Toast.makeText((Context) null, i226 / (((i226 - 1) * i226) % 2), 0).show();
                int i234 = ((int[]) objArrB$7879113[3])[0];
                objArr16 = new Object[]{new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
                int iCodePointAt5 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str9, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_shopeepay_instruction_tablet_step2).substring(0, 5).codePointAt(3) + 1784098511;
                int i235 = i234 + ((((-118798613) + (((~((~iCodePointAt5) | 414319229)) | 625741954) * 446)) + (((~(iCodePointAt5 | 1040061183)) | 1179701) * 446)) - 91962756);
                int i236 = (i235 << 13) ^ i235;
                int i237 = i236 ^ (i236 >>> 17);
                c4 = 3;
                c5 = 0;
                ((int[]) objArr16[3])[0] = i237 ^ (i237 << 5);
            }
            int i238 = ((int[]) objArr14[c4])[c5];
            int i239 = i238 * i238;
            int i240 = -(1974266171 * i238);
            int i241 = (((i239 & i240) + (i239 | i240)) - (~(-(i238 * (-490801347))))) - 1;
            int i242 = (i241 & (-95908336)) + ((-95908336) | i241);
            int i243 = i242 >> 27;
            int i244 = ((i243 ^ (-63)) + ((i243 & (-63)) << 1)) / 32;
            int i245 = (i244 & 1) + (i244 | 1);
            int i246 = (i242 & i245) + (i245 | i242);
            int i247 = i242 >> 17;
            int i248 = (((-65535) ^ i247) + ((i247 & (-65535)) << 1)) / 32768;
            int i249 = -(i246 ^ (((i248 | 1) << 1) - (i248 ^ 1)));
            int i250 = ((i249 | 4) << 1) - (4 ^ i249);
            int i251 = i250 >> 19;
            int i252 = ((i251 & (-16383)) + (i251 | (-16383))) / 8192;
            int i253 = (i252 & 1) + (i252 | 1);
            int i254 = ((-1182115136) / (((-((i253 & 1) + (i253 | 1))) & i250) * 2)) - 1124096598;
            int i255 = ((int[]) objArr2[2])[0];
            int i256 = i255 * i255;
            int i257 = -(1979991549 * i255);
            int i258 = (i256 & i257) + (i256 | i257);
            int i259 = -(i255 * 846973243);
            int i260 = (i258 & i259) + (i259 | i258);
            int i261 = (i260 ^ 775546640) + ((775546640 & i260) << 1);
            int i262 = ((i261 >> 16) - 131071) / 65536;
            int i263 = i262 & 1;
            int i264 = (i262 ^ 1) + (i263 << 1);
            int i265 = (-(((i261 ^ i264) + ((i264 & i261) << 1)) ^ (i263 + (i262 | 1)))) + 1;
            int i266 = i265 >> 15;
            int i267 = (((-262143) & i266) + (i266 | (-262143))) / 131072;
            int i268 = 965954 / ((i265 & (-(((i267 & 1) + (i267 | 1)) + 1))) * 1909);
            int i269 = ((int[]) objArr6[1])[0];
            int i270 = ((i269 * i269) - (~(-(806586583 * i269)))) - 1;
            int i271 = -(i269 * 159779109);
            int i272 = (i270 & i271) + (i271 | i270);
            int i273 = (i272 & (-2103583740)) + ((-2103583740) | i272);
            int i274 = i273 >> 27;
            int i275 = ((i274 ^ (-63)) + ((i274 & (-63)) << 1)) / 32;
            int i276 = -(((i273 - (~(((i275 | 1) << 1) - (i275 ^ 1)))) - 1) ^ ((((i273 >> 22) - 2047) / 1024) + 1));
            int i277 = ((i276 | 9) << 1) - (i276 ^ 9);
            int i278 = i277 >> 16;
            int i279 = ((((-131071) ^ i278) + ((i278 & (-131071)) << 1)) / 65536) + 1;
            int i280 = i268 + (1260792 / (((-((i279 ^ 1) + ((i279 & 1) << 1))) & i277) * 156));
            int i281 = ((int[]) objArr71[1])[0];
            int i282 = i281 * i281;
            int i283 = -(1451348254 * i281);
            int i284 = ((i282 | i283) << 1) - (i282 ^ i283);
            int i285 = -(i281 * (-1550616322));
            int i286 = (i284 ^ i285) + ((i285 & i284) << 1);
            int i287 = (i286 ^ (-75297596)) + (((-75297596) & i286) << 1);
            int i288 = i287 >> 17;
            int i289 = (i287 - (~(((((-65535) & i288) + (i288 | (-65535))) / 32768) + 1))) - 1;
            int i290 = i287 >> 23;
            int i291 = (((i290 | (-1023)) << 1) - (i290 ^ (-1023))) / 512;
            int i292 = -(i289 ^ ((i291 & 1) + (i291 | 1)));
            int i293 = ((i292 | 6) << 1) - (i292 ^ 6);
            int i294 = ((i293 >> 26) + ComposerKt.defaultsKey) / 64;
            int i295 = ((i294 | 1) << 1) - (i294 ^ 1);
            int i296 = i280 + (2172024 / (((-((i295 & 1) + (i295 | 1))) & i293) * 388));
            int i297 = ((int[]) objArr82[1])[0];
            int i298 = i297 * i297;
            int i299 = -(1751942580 * i297);
            int i300 = (((i298 ^ i299) + ((i298 & i299) << 1)) - (~(-(i297 * 740383334)))) - 1405853528;
            int i301 = i300 >> 15;
            int i302 = ((((-262143) & i301) + (i301 | (-262143))) / 131072) + 1;
            int i303 = (i300 & i302) + (i302 | i300);
            int i304 = i300 >> 17;
            int i305 = (((-65535) ^ i304) + ((i304 & (-65535)) << 1)) / 32768;
            int i306 = -(i303 ^ (((i305 | 1) << 1) - (i305 ^ 1)));
            int i307 = ((i306 | 5) << 1) - (i306 ^ 5);
            int i308 = ((i307 >> 26) + ComposerKt.defaultsKey) / 64;
            int i309 = (i308 ^ 1) + ((i308 & 1) << 1);
            int i310 = i296 + (1990245 / (((-((i309 ^ 1) + ((i309 & 1) << 1))) & i307) * 831));
            int i311 = ((int[]) objArr93[0])[0];
            int i312 = i311 * i311;
            int i313 = -(802828230 * i311);
            int i314 = (i312 & i313) + (i312 | i313);
            int i315 = -(i311 * (-2057140750));
            int i316 = ((i314 & i315) + (i315 | i314)) - 137401072;
            int i317 = i316 >> 22;
            int i318 = ((((i317 | (-2047)) << 1) - (i317 ^ (-2047))) / 1024) + 1;
            int i319 = (i316 & i318) + (i318 | i316);
            int i320 = i316 >> 26;
            int i321 = -(i319 ^ (((((i320 | ComposerKt.defaultsKey) << 1) - (i320 ^ ComposerKt.defaultsKey)) / 64) + 1));
            int i322 = (i321 & 8) + (i321 | 8);
            int i323 = ((i322 >> 24) - 511) / 256;
            int i324 = (i323 & 1) + (i323 | 1);
            int i325 = i310 + (4809024 / (((-((i324 & 1) + (i324 | 1))) & i322) * PointerIconCompat.TYPE_NO_DROP));
            int i326 = ((int[]) objArr115[1])[0];
            int i327 = i326 * i326;
            int i328 = -(241658361 * i326);
            int i329 = ((i327 | i328) << 1) - (i327 ^ i328);
            int i330 = -(i326 * (-91184871));
            int i331 = ((i329 | i330) << 1) - (i330 ^ i329);
            int i332 = ((i331 | (-1529437359)) << 1) - ((-1529437359) ^ i331);
            int i333 = ((i332 >> 17) - 65535) / 32768;
            int i334 = (i333 ^ 1) + ((i333 & 1) << 1);
            int i335 = (i332 & i334) + (i334 | i332);
            int i336 = i332 >> 24;
            int i337 = ((i336 ^ (-511)) + ((i336 & (-511)) << 1)) / 256;
            int i338 = (-(i335 ^ ((i337 ^ 1) + ((i337 & 1) << 1)))) + 9;
            int i339 = i338 >> 22;
            int i340 = (((i339 ^ (-2047)) + ((i339 & (-2047)) << 1)) / 1024) + 1;
            int i341 = i325 + (3896991 / ((i338 & (-((i340 ^ 1) + ((i340 & 1) << 1)))) * TypedValues.MotionType.TYPE_POLAR_RELATIVETO));
            int i342 = ((int[]) objArr136[2])[0];
            int i343 = i342 * i342;
            int i344 = -(960909943 * i342);
            int i345 = ((i343 | i344) << 1) - (i343 ^ i344);
            int i346 = -(i342 * 1784862671);
            int i347 = ((i345 | i346) << 1) - (i346 ^ i345);
            int i348 = (i347 ^ 2128200393) + ((2128200393 & i347) << 1);
            int i349 = i348 >> 19;
            int i350 = ((i349 & (-16383)) + (i349 | (-16383))) / 8192;
            int i351 = ((i350 | 1) << 1) - (i350 ^ 1);
            int i352 = ((i348 | i351) << 1) - (i351 ^ i348);
            int i353 = i348 >> 16;
            int i354 = (((-131071) ^ i353) + ((i353 & (-131071)) << 1)) / 65536;
            int i355 = -(i352 ^ (((i354 | 1) << 1) - (i354 ^ 1)));
            int i356 = (i355 & 1) + (i355 | 1);
            int i357 = i356 >> 26;
            int i358 = (((i357 | ComposerKt.defaultsKey) << 1) - (i357 ^ ComposerKt.defaultsKey)) / 64;
            int i359 = ((i358 | 1) << 1) - (i358 ^ 1);
            int i360 = i341 + (153700 / (((-(((i359 | 1) << 1) - (i359 ^ 1))) & i356) * 1325));
            int i361 = ((int[]) objArr16[3])[0];
            int i362 = i361 * i361;
            int i363 = -(1744804028 * i361);
            int i364 = (i362 ^ i363) + ((i362 & i363) << 1);
            int i365 = -(i361 * (-159439624));
            int i366 = (i364 ^ i365) + ((i365 & i364) << 1);
            int i367 = (i366 ^ (-563031644)) + (((-563031644) & i366) << 1);
            int i368 = i367 >> 24;
            int i369 = ((i368 ^ (-511)) + ((i368 & (-511)) << 1)) / 256;
            int i370 = (i369 & 1) + (i369 | 1);
            int i371 = ((i367 | i370) << 1) - (i370 ^ i367);
            int i372 = ((i367 >> 27) - 63) / 32;
            int i373 = -(i371 ^ ((i372 & 1) + (i372 | 1)));
            int i374 = (i373 & 3) + (i373 | 3);
            int i375 = i374 >> 28;
            int i376 = ((i375 & (-31)) + (i375 | (-31))) / 16;
            int i377 = ((i376 | 1) << 1) - (i376 ^ 1);
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(i254, i360 + ((-19163664) / (((-((i377 & 1) + (i377 | 1))) & i374) * 1508)), new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            int i378 = ((int[]) objArr4[1])[0];
            int i379 = ((i378 * i378) - (~(-(2103069637 * i378)))) - 1;
            int i380 = -(i378 * (-1102001807));
            int i381 = ((i379 | i380) << 1) - (i380 ^ i379);
            int i382 = (i381 ^ 251230681) + ((251230681 & i381) << 1);
            int i383 = i382 >> 29;
            int i384 = (i383 - 15) / 8;
            int i385 = (i384 & 1) + (i384 | 1);
            int i386 = (i382 ^ i385) + ((i382 & i385) << 1);
            int i387 = ((i383 ^ (-15)) + ((i383 & (-15)) << 1)) / 8;
            int i388 = -((((i387 | 1) << 1) - (i387 ^ 1)) ^ i386);
            int i389 = ((i388 | 9) << 1) - (i388 ^ 9);
            int i390 = i389 >> 19;
            int i391 = ((i390 ^ (-16383)) + ((i390 & (-16383)) << 1)) / 8192;
            int i392 = 572643 / (((-(((i391 & 1) + (i391 | 1)) + 1)) & i389) * 127);
            int i393 = ((int[]) objArr11[0])[0];
            int i394 = i393 * i393;
            int i395 = -(224997231 * i393);
            int i396 = ((i394 | i395) << 1) - (i394 ^ i395);
            int i397 = -(i393 * (-784779045));
            int i398 = (i396 & i397) + (i397 | i396);
            int i399 = (i398 ^ 537464153) + ((537464153 & i398) << 1);
            int i400 = i399 >> 21;
            int i401 = (((i400 | (-4095)) << 1) - (i400 ^ (-4095))) / 2048;
            int i402 = (i401 ^ 1) + ((i401 & 1) << 1);
            int i403 = ((i399 | i402) << 1) - (i402 ^ i399);
            int i404 = ((i399 >> 16) - 131071) / 65536;
            int i405 = (-(i403 ^ ((i404 & 1) + (i404 | 1)))) + 4;
            int i406 = (((i405 >> 24) - 511) / 256) + 1;
            ComponentActivityKt.setContent$default(this, null, composableLambdaComposableLambdaInstance, i392 + ((-3684000) / ((i405 & (-((i406 & 1) + (i406 | 1)))) * 1842)), null);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = d + 109;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            if (i3 != (-573117390) + (((~(i4 | 464583283)) | 1141441800) * 305) + (((~((~i4) | 464583283)) | 1294570826) * 305)) {
                throw null;
            }
        } else {
            int i5 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
            if (i5 != (((-1794418524) + (((~((-546015275) | i6)) | (~((-1376002818) | i6))) * 69)) + (((~(i6 | (-1466185490))) | ((~((-636197947) | i6)) | 90182672)) * (-69))) - 1402899244) {
                throw null;
            }
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_7).substring(0, 1).codePointAt(0) - 100559446;
        if (i7 != ((((~((-58319072) | iCodePointAt)) | 21004418) * (-283)) - 66628334) + ((~(iCodePointAt | (-37314654))) * 283)) {
            int i8 = (-806385592) % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.getDefaultSize(0, 0)), 41 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Process.getGidForName("") + 20, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 46401), 40 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj2, null);
            super.onResume();
            int i9 = d + 13;
            asInterface = i9 % 128;
            if (i9 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws Throwable {
        ScholarshipGranteeActivity scholarshipGranteeActivity = (ScholarshipGranteeActivity) objArr[0];
        int i = 2 % 2;
        int i2 = d + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 41 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.resolveSize(0, 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - View.MeasureSpec.makeMeasureSpec(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, 19 - (Process.myTid() >> 22), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onPause();
            int i4 = d + 89;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iBlue = Color.blue(0) + 1031;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            byte b = $$a[7];
            Object[] objArr2 = new Object[1];
            e((short) 89, b, b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, iBlue, touchSlop, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((KeyEvent.getMaxKeyCode() >> 16) + 76, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step2).substring(13, 14).codePointAt(0) - 24, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(Color.alpha(0) + 98, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1060).substring(0, 31).length() - 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).length() - 25), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int pressedStateDuration = 1031 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int keyRepeatDelay = 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            short s = $$a[7];
            byte b2 = (byte) s;
            Object[] objArr5 = new Object[1];
            e(s, b2, b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, pressedStateDuration, keyRepeatDelay, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr6 = new Object[1];
                e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iResolveSizeAndState, fadingEdgeLength, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ((1727962791 + (((~(224135886 | i5)) | (~((-468416057) | iIdentityHashCode))) * 210)) + (((~(iIdentityHashCode | 536837886)) | (~(i5 | (-155714057)))) * 210)) - 1310702176;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(44 - View.getDefaultSize(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 2789), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(60 - Color.argb(0, 0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, (char) (View.MeasureSpec.getMode(0) + 36000), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1540068406};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - TextUtils.indexOf("", "", 0, 0)), 1134 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.keyCodeFromString("") + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -1310702176, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i9 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 15;
                    byte b3 = $$a[7];
                    Object[] objArr12 = new Object[1];
                    e((short) 89, b3, b3, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i9, packedPositionType, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45992), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1116, 17 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
                }
                Object[] objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1031;
                    int mirror = AndroidCharacter.getMirror('0') - '!';
                    Object[] objArr14 = new Object[1];
                    e((short) 141, (byte) 52, (byte) ($$a[153] + 1), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, iMakeMeasureSpec, mirror, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step2).substring(227, 231).codePointAt(0) + 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_atm_bersama4_permata).substring(16, 17).length() + 97, 15 - View.resolveSizeAndState(0, 0, 0), (char) ExpandableListView.getPackedPositionType(0L), objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int maxKeyCode = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                        int iResolveSize = View.resolveSize(0, 0) + 15;
                        short s2 = $$a[7];
                        byte b4 = (byte) s2;
                        Object[] objArr17 = new Object[1];
                        e(s2, b4, b4, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cArgb, maxKeyCode, iResolveSize, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                        int iIndexOf = 1031 - TextUtils.indexOf("", "", 0, 0);
                        int iIndexOf2 = TextUtils.indexOf("", "") + 15;
                        byte b5 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        e((short) 89, b5, b5, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iIndexOf, iIndexOf2, 1357589585, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[3])[0];
        if (i11 == i10) {
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i15 = i12 + 840105787 + (((~(202383509 | iIdentityHashCode2)) | 67117056) * (-502)) + ((~((~iIdentityHashCode2) | 513780735)) * (-502)) + (((~(iIdentityHashCode2 | (-446663680))) | 202383509) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr19[2])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i18 = asInterface + 11;
                d = i18 % 128;
                for (int i19 = i18 % 2 == 0 ? 1 : 0; i19 < strArr3.length; i19++) {
                    arrayList.add(strArr3[i19]);
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            Object[] objArr20 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[3])[0];
            int i22 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i23 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i24 = i20 + (-2140082559) + (((~(81963538 | i23)) | 319821164) * 336) + (((~(i23 | 326243708)) | 75540994) * (-168)) + (((~((~i23) | 326243708)) | 81963538) * 168);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[2])[0] = i26 ^ (i26 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
            int iArgb = 1755 - Color.argb(0, 0, 0, 0);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr21 = new Object[1];
            e((short) 52, (byte) (bArr[33] - 1), bArr[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(edgeSlop2, iArgb, capsMode, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int iGreen = 1755 - Color.green(0);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 23;
                short s3 = $$a[7];
                byte b6 = (byte) s3;
                Object[] objArr22 = new Object[1];
                e(s3, b6, b6, objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(minimumFlingVelocity, iGreen, windowTouchSlop, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr23[0])[0]}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i28 = (~(40634649 | i27)) | 219158082;
            int i29 = ~((~i27) | (-6555657));
            int i30 = 137685861 + ((i28 | i29) * (-470)) + (((~(i27 | 259792731)) | i29) * 470) + 384191967;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i32 ^ (i32 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 8, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.permata_instruction_step6).substring(6, 7).codePointAt(0) + 2803), objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            c((ViewConfiguration.getLongPressTimeout() >> 16) + 60, View.MeasureSpec.getSize(0) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email).substring(0, 5).length() + 35995), objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {1540068406};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42048 - MotionEvent.axisFromString("")), 1726 - (ViewConfiguration.getPressedStateDuration() >> 16), 29 - ExpandableListView.getPackedPositionGroup(0L), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = IndividualDataAsik.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr26), 384191967);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char gidForName = (char) (29943 - Process.getGidForName(""));
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                int i33 = 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                short s4 = $$a[7];
                byte b7 = (byte) s4;
                Object[] objArr27 = new Object[1];
                e(s4, b7, b7, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(gidForName, tapTimeout, i33, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr28 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.show_instruction).substring(1, 2).codePointAt(0) - 29, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_atm_transfer_step3).substring(35, 41).codePointAt(2) - 92, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.status_order_id).substring(0, 8).length() + 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 101, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29943);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                    int iGreen2 = 23 - Color.green(0);
                    short s5 = (short) ($$b | 10);
                    byte b8 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    e(s5, b8, b8, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, maximumDrawingCacheSize2, iGreen2, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cRgb = (char) ((-16747272) - Color.rgb(0, 0, 0));
                    int iBlue2 = Color.blue(0) + 1755;
                    int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr2 = $$a;
                    Object[] objArr31 = new Object[1];
                    e((short) 52, (byte) (bArr2[33] - 1), bArr2[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cRgb, iBlue2, iNormalizeMetaState, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                int i34 = d + 85;
                asInterface = i34 % 128;
                int i35 = i34 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] == ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            int i36 = asInterface + 63;
            d = i36 % 128;
            int i37 = i36 % 2;
            int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
            Object[] objArr32 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
            int i39 = (int) Runtime.getRuntime().totalMemory();
            int i40 = i38 + 631833220 + (((~(i39 | 77613642)) | (-212585456)) * 305) + (((~((~i39) | 77613642)) | (-134988784)) * 305);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr32[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
        if (strArr5 != null) {
            int i43 = d + 121;
            asInterface = i43 % 128;
            int i44 = i43 % 2;
            while (i2 < strArr5.length) {
                int i45 = asInterface + 5;
                d = i45 % 128;
                if (i45 % 2 == 0) {
                    arrayList2.add(strArr5[i2]);
                    i2 += 52;
                } else {
                    arrayList2.add(strArr5[i2]);
                    i2++;
                }
            }
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iTuitionPaymentFragmentbindingInflater1 = applyAppLocales.TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(432310856, applyAppLocales.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, 1087674741 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step4).substring(89, 91).codePointAt(1), getNextMenuPosition.b(), iTuitionPaymentFragmentbindingInflater1, -432310855);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws IllegalAccessException {
        int i = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32004202;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(1825472698, applyAppLocales.TuitionPaymentFragmentbindingInflater1(), new Object[]{this}, getNextMenuPosition.b(), applyAppLocales.TuitionPaymentFragmentbindingInflater1(), i, -1825472698);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, int r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L31
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity.$$g(int, short, int):java.lang.String");
    }
}
