package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showIdCard$1$1$1;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.model.Image;
import com.google.android.material.button.MaterialButton;
import com.yalantis.ucrop.UCrop;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.mapPoint;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FileTreeWalk;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Typography;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J)\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0004R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0015\u0010\u001b\u001a\u00020\u00188BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001b\u0010\u001eR.\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010#R\u001a\u0010%\u001a\u00020\u00078\u0015X\u0095D¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"LgetIOThreadExecutor;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding;", "<init>", "()V", "", "g", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "cancelAll", "b_", "cancel", "onTransact", "INotificationSideChannel", "Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/io/File;", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LacquireBuffer;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getIOThreadExecutor extends AutoValue_CameraState_StateError<FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f940a;
    private static char asBinder;
    private static int cancel;
    private static char d;
    private static char onTransact;
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: getHint
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return getIOThreadExecutor.b(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int asBinder = R.layout.fragment_indonesian_migrant_worker_upload_document_registration;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private static final byte[] $$c = {108, -26, -110, 50};
    private static final int $$f = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {102, -96, -78, -55, -14, 0, Base64.padSymbol, -56, 1, -21, 17, -5, -13, 6, 55, -53, -15, 8, -16, 1, 4, 3, 52, -70, -5, 6, Base64.padSymbol, -65, -4, 9, -3, -9, 60, -32, -37, -1, 5, 17, -15, -20, 6, 36, -51, 15, -11, -8, 78, -77, -1, 24, -32, 15, -15, -7, 16, -4, -19, 78, -64};
    private static final int $$e = 161;
    private static final byte[] $$a = {2, -84, 82, -15, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 154;
    private static int INotificationSideChannel = 0;
    private static int cancelAll = 0;
    private static int notify = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = ~i5;
        int i12 = i11 | i2;
        int i13 = ~(i6 | i12);
        int i14 = i9 | i10 | i13;
        int i15 = i13 | (~(i7 | i11 | i8));
        int i16 = (~i12) | i10;
        int i17 = i2 + i5 + i + ((-573665793) * i4) + ((-1595597844) * i3);
        int i18 = i17 * i17;
        int i19 = ((-1787860089) * i2) + 959184896 + (1033409659 * i5) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i) + (1316749312 * i4) + (833617920 * i3) + (497221632 * i18);
        int i20 = ((i2 * 2143800573) - 1595758) + (i5 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i * 2143800411) + (i4 * 1405922725) + (i3 * (-1943733020)) + (i18 * 1827733504);
        int i21 = i19 + (i20 * i20 * (-911933440));
        if (i21 != 1) {
            return i21 != 2 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = defpackage.getIOThreadExecutor.$$a
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2a:
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getIOThreadExecutor.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 98
            int r5 = r5 * 55
            int r0 = r5 + 1
            int r6 = r6 * 55
            int r6 = r6 + 4
            byte[] r1 = defpackage.getIOThreadExecutor.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getIOThreadExecutor.f(byte, short, byte, java.lang.Object[]):void");
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getIOThreadExecutor getiothreadexecutor, File file) {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 75;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = file;
        int i5 = i2 + 37;
        cancelAll = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
    }

    public static final /* synthetic */ File TuitionPaymentFragmentspecialinlinedviewModeldefault2(getIOThreadExecutor getiothreadexecutor) {
        int i = 2 % 2;
        int i2 = notify;
        int i3 = i2 + 15;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        File file = getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 73;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        getIOThreadExecutor getiothreadexecutor = (getIOThreadExecutor) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 29;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        File file = getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return file;
        }
        throw null;
    }

    public static final /* synthetic */ void b(getIOThreadExecutor getiothreadexecutor, File file) {
        int i = 2 % 2;
        int i2 = cancelAll;
        int i3 = i2 + 109;
        notify = i3 % 128;
        int i4 = i3 % 2;
        getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = file;
        int i5 = i2 + 59;
        notify = i5 % 128;
        int i6 = i5 % 2;
    }

    public getIOThreadExecutor() {
        final getIOThreadExecutor getiothreadexecutor = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$special$$inlined$inject$default$1
            private static final byte[] $$c = {19, 78, 114, 113};
            private static final int $$f = 104;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {51, -5, 77, 89, -11, 60, -73, 8, -1, -7, -22, 6, -18, 12, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -61, -20, 2, 6, -22, 6, -11, -4, -10, 64, -29, -52, 2, 6, -22, 6, -11, -4, -10, 74, -72, -3, -20, 28, -23, -19, -5, 5, -11, -4, 21, -32, -1, 1, -14, -38, 7, -16, 6, -11, -4, 25, -22, -29, 7, 3, -14, -11, 41, -49, 12, -11, -11, 3, -14, -11, -4, -2, 6, -3, -11, 3, -16, -2, -10, -3, -2, -10, 4, -4, -23, 8, -1, -23, 37, -39, 6, -6, -12, 3, -6, -6, 0, -25, 4, -13, 60};
            private static final int $$e = 147;
            private static final byte[] $$a = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 2;
            private static int $TuitionPaymentFragmentbindingInflater1 = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] b = {33451, 2947, 37088, 6605, 42553, 12128, 46148, 17141, 52125, 20710, 55650, 26164, 61287, 29762, 668, 35814, 4311, 39198, 9752, 44864, 13733, 49810, 45561, 14551, 41907, 10905, 38259, 7226, 34578, 29151, 63681, 25506, 60022, 21829, 56353, 18186, 12763, 45565, 14549, 41910, 10907, 38255, 7222, 34578, 29091, 63685, 25523, 60010, 21791, 56329, 18180, 12746, 47292, 9114, 43618, 5462, 39936, 1732, 61895, 30900, 58232, 27221, 54583, 52854, 18247, 56361, 21778, 60140, 25528, 63627, 3653, 34653, 7226, 38399, 10961, 41890, 14479, 20035, 50997, 23562, 54764, 46266, 15766, 42728, 12228, 36962, 6527, 33371, 29871, 64911, 26273, 61189, 20484, 55671, 16991, 13463, 48628, 45557, 14559, 41911, 10887, 38260, 7222, 34562, 29172, 63724, 25506, 60009, 21849, 56331, 18184, 12762, 47280, 13434, 48394, 9824, 44892, 4277, 39401, 708, 62575, 32073, 58993, 28584, 53456, 23033, 49878, 46091, 15668, 42511, 12270, 37056, 6600, 33649, 29772, 64805, 26283, 61317, 20656, 55772, 17252, 13375, 48455, 9966, 45000, 4241, 39470, 852, 62500, 32005, 59098, 28602, 53464, 23094, 49986, 46106, 15869, 42650, 12278, 37241, 6740, 33657, 29711, 65006, 26348, 61328, 20835, 55872, 17227, 13561, 48607, 9898, 45015, 4366, 39525, 776, 62643, 45567, 14554, 41910, 10975, 38192, 7274, 34580, 29114, 63681, 25509, 59946, 21843, 56365, 18261, 12760, 47329, 9182, 43576, 5396, 40010, 1701, 61848, 30880, 58155, 27222, 54631, 23560, 50872, 45547, 14542, 41783, 10781, 38213, 8185, 34439, 29176, 63700, 25434, 59959, 21855, 57270, 18118, 12700, 47143, 8991, 43635, 5293, 40838, 1781, 61832, 30779, 58208, 27154, 54459, 24469, 50895, 45431, 14421, 41848, 10837, 38105, 8167, 34520, 29027};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3435543947844663483L;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            private static void a(short s, short s2, short s3, Object[] objArr) {
                int i = (s2 * 52) + 4;
                int i2 = s * 52;
                byte[] bArr = $$a;
                int i3 = (s3 * 14) + 84;
                byte[] bArr2 = new byte[i2 + 1];
                int i4 = -1;
                if (bArr == null) {
                    i++;
                    i3 = (i2 + (-i3)) - 11;
                    i4 = -1;
                }
                while (true) {
                    int i5 = i4 + 1;
                    bArr2[i5] = (byte) i3;
                    if (i5 == i2) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i++;
                    i3 = (i3 + (-bArr[i])) - 11;
                    i4 = i5;
                }
            }

            private static void d(short s, byte b2, short s2, Object[] objArr) {
                byte[] bArr = $$d;
                int i = 60 - (s2 * 56);
                int i2 = 105 - (s * 21);
                int i3 = b2 * 4;
                byte[] bArr2 = new byte[57 - i3];
                int i4 = 56 - i3;
                int i5 = -1;
                if (bArr == null) {
                    i++;
                    i2 = (i2 + (-i4)) - 5;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i2;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        i++;
                        i2 = (i2 + (-bArr[i])) - 5;
                    }
                }
            }

            private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i5 = $10 + 83;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 5 / 2;
                }
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i7 = $11 + 69;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(b[i / i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i3;
                                byte b3 = (byte) (b2 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2188 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 40 - TextUtils.indexOf("", "", 0, 0), 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - ExpandableListView.getPackedPositionGroup(0L)), 3010 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                try {
                                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b6 = (byte) 1;
                                        byte b7 = (byte) (b6 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36505), 3376 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionChild(0L) + 18, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } else {
                        int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr5 = {Integer.valueOf(b[i + i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 2;
                                byte b9 = (byte) (b8 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2187, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 33017), TextUtils.lastIndexOf("", '0') + 3012, (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, 321985076, false, $$g(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) 1;
                                byte b13 = (byte) (b12 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((-16740711) - Color.rgb(0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + 3376, 17 - Color.alpha(0), -968507904, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b14 = (byte) 1;
                        byte b15 = (byte) (b14 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36504 - TextUtils.indexOf((CharSequence) "", '0', 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3375, 17 - KeyEvent.getDeadChar(0, 0), -968507904, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    int i10 = $11 + 39;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                objArr[0] = new String(cArr);
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentbindingInflater1 + 99;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
                    int keyRepeatTimeout = 625 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iGreen = Color.green(0) + 14;
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b2, bArr[5], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, keyRepeatTimeout, iGreen, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(MotionEvent.axisFromString("") + 1, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 13142), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(Color.rgb(0, 0, 0) + 16777238, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char keyRepeatTimeout2 = (char) (37567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
                    int i4 = 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[5];
                    byte b4 = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    a(b3, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout2, capsMode, i4, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cGreen = (char) (Color.green(0) + 37567);
                        int i5 = 626 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 14;
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[5];
                        Object[] objArr6 = new Object[1];
                        a(b5, b5, bArr3[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, i5, threadPriority, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[2])[0];
                    int i7 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i8 = ~iUptimeMillis;
                    int i9 = (((-1942565751) + ((((~(i8 | 1120503437)) | (-1810597632)) | (~((-13140490) | iUptimeMillis))) * 717)) + (((~(iUptimeMillis | 1120503437)) | ((~(i8 | (-13140490))) | (-1810597632))) * 717)) - 738352501;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
                    objArr = new Object[]{new int[]{i7}, new int[1], new int[]{i6}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    c(37 - (Process.myPid() >> 22), 26 - (ViewConfiguration.getTapTimeout() >> 16), (char) Color.red(0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(63 - Color.red(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, (char) (32648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(80 - Process.getGidForName(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, (char) (1356 - View.resolveSizeAndState(0, 0, 0)), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c((ViewConfiguration.getScrollDefaultDelay() >> 16) + 97, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, (char) ('0' - AndroidCharacter.getMirror('0')), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c(114 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 64 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 34261), objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c(177 - View.resolveSize(0, 0), 64 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
                    String[] strArr2 = {str, (String) objArr13[0]};
                    int i12 = $TuitionPaymentFragmentbindingInflater1 + 43;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -738352501};
                        byte[] bArr4 = $$d;
                        byte b6 = bArr4[107];
                        Object[] objArr15 = new Object[1];
                        d(b6, b6, bArr4[58], objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b7 = bArr4[58];
                        Object[] objArr16 = new Object[1];
                        d(b7, b7, bArr4[107], objArr16);
                        Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i14 = ((int[]) objArr17[0])[0];
                        int i15 = ((int[]) objArr17[2])[0];
                        if (applicationContext != null) {
                            int i16 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                            $TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                            int i17 = i16 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 37567);
                                int iAxisFromString = 624 - MotionEvent.axisFromString("");
                                int i18 = 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[5];
                                Object[] objArr18 = new Object[1];
                                a(b8, b8, bArr5[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, iAxisFromString, i18, -973632554, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                            try {
                                Object[] objArr19 = new Object[1];
                                c(ViewConfiguration.getDoubleTapTimeout() >> 16, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, (char) (13142 - (ViewConfiguration.getTapTimeout() >> 16)), objArr19);
                                Class<?> cls5 = Class.forName((String) objArr19[0]);
                                Object[] objArr20 = new Object[1];
                                c((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, TextUtils.indexOf("", "") + 15, (char) Color.alpha(0), objArr20);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c = (char) (37567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    int i19 = 626 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int i20 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13;
                                    byte[] bArr6 = $$a;
                                    byte b9 = bArr6[5];
                                    byte b10 = bArr6[7];
                                    Object[] objArr21 = new Object[1];
                                    a(b9, b10, b10, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i19, i20, -976899241, false, (String) objArr21[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cKeyCodeFromString = (char) (37567 - KeyEvent.keyCodeFromString(""));
                                    int i21 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 624;
                                    int i22 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    byte[] bArr7 = $$a;
                                    byte b11 = bArr7[7];
                                    Object[] objArr22 = new Object[1];
                                    a(b11, b11, bArr7[5], objArr22);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, i21, i22, -477065106, false, (String) objArr22[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr17;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i23 = ((int[]) objArr[0])[0];
                int i24 = ((int[]) objArr[2])[0];
                if (i24 != i23) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        for (String str2 : strArr3) {
                            arrayList.add(str2);
                        }
                    }
                    throw new RuntimeException(String.valueOf(i24));
                }
                int i25 = ((int[]) objArr[1])[0];
                int i26 = ((int[]) objArr[2])[0];
                int i27 = ((int[]) objArr[0])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr = {i26};
                int iIdentityHashCode = System.identityHashCode(this);
                int i28 = ~iIdentityHashCode;
                int i29 = (~((-1366506710) | i28)) | 289410065;
                int i30 = ~(iIdentityHashCode | 1534328055);
                int i31 = i25 + ((i29 | i30) * (-252)) + 1740630468 + ((i30 | (~(i28 | (-1077096645)))) * 252);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr[1])[0] = i33 ^ (i33 << 5);
                Object[] objArr23 = {new int[]{i27}, new int[1], iArr, strArr4};
                ComponentCallbacks componentCallbacks = getiothreadexecutor;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, int r7, byte r8) {
                /*
                    int r8 = r8 * 4
                    int r0 = r8 + 1
                    int r6 = r6 * 3
                    int r6 = 115 - r6
                    byte[] r1 = com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$special$$inlined$inject$default$1.$$c
                    int r7 = r7 * 2
                    int r7 = r7 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2b:
                    int r7 = -r7
                    int r3 = r3 + 1
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerUploadDocumentRegistrationFragment$special$$inlined$inject$default$1.$$g(int, int, byte):java.lang.String");
            }
        });
    }

    /* JADX INFO: renamed from: getIOThreadExecutor$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LgetIOThreadExecutor$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "p0", "LgetIOThreadExecutor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)LgetIOThreadExecutor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getIOThreadExecutor TuitionPaymentFragmentspecialinlinedviewModeldefault3(MigrantWorkerRegistration p0) {
            getIOThreadExecutor getiothreadexecutor = new getIOThreadExecutor();
            Bundle bundle = new Bundle();
            bundle.putParcelable("migration_worker_data", p0);
            getiothreadexecutor.setArguments(bundle);
            return getiothreadexecutor;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = 0;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) asBinder) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i3) + 47774);
                        int capsMode = 468 - TextUtils.getCapsMode("", i3, i3);
                        int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, capsMode, iIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f940a) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(d)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 47774), Drawable.resolveOpacity(0, 0) + 468, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) (-1);
                byte b2 = (byte) (b + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2322 - TextUtils.indexOf((CharSequence) "", '0', 0), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private final MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = notify + 35;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
            int trimmedLength = TextUtils.getTrimmedLength("") + 921;
            int iResolveSize = 28 - View.resolveSize(0, 0);
            byte[] bArr = $$a;
            byte b = bArr[37];
            Object[] objArr2 = new Object[1];
            c(b, b, bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, trimmedLength, iResolveSize, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{32411, 7749, 63817, 31993, 63790, 55567, 28290, 48695, 45733, 53791, 2794, 40722, 63255, 34382, 25885, 19309, 7485, 15667, 42136, 37448, 58264, 2271, 38692, 10578}, 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{32284, 50302, 21064, 29090, 44647, 65144, 32237, 31709, 5356, 64083, 60575, 59911, 20224, 21125, 32343, 36772, 31270, 58082}, KeyEvent.normalizeMetaState(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRed = (char) (Color.red(0) + 31533);
            int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int absoluteGravity = 28 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[80], bArr2[37], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, maximumFlingVelocity, absoluteGravity, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = cancelAll + 11;
            notify = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
                int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                byte b2 = $$a[80];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, (byte) (b3 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iLastIndexOf, i7, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i8 = ~System.identityHashCode(this);
            int i9 = 1101086674 + ((~((-285999129) | i8)) * (-783)) + (((~(i8 | 1286750019)) | (-487329625)) * 783) + 879756207;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{11834, 39608, 56798, 3414, 19075, 10158, 12355, 7375, 57365, 6550, 16650, 6624, 18002, 49840, 43063, 29397, 63101, 17683, 62932, 6614, 19648, 57225, 47873, 7612, 691, '2', 53369, 49822}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{62076, 2923, 53993, 16061, 25888, 46313, 44973, 59021, 49495, 21007, 61029, 370, 19433, 32791, 65118, 59853, 21182, 6429, 50523, 29703}, Color.argb(0, 0, 0, 0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{34091, 65465, 31120, 38059, 55132, Typography.dagger, 53757, 49636, 3846, 12946, 15104, 22315, 35137, 16507, 16948, 11380, 58474, 42412}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{40119, 15390, 41497, 54888, 14337, 14014, 36021, 14697, 27762, 23384, 53532, 36846, 32526, 19423, 47951, 38047, 27766, 1501}, 16 - View.MeasureSpec.getMode(0), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = notify + 107;
            cancelAll = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 879756207};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[8];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b4, bArr3[5], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[5];
                Object[] objArr14 = new Object[1];
                f(b6, bArr3[8], b6, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) (31533 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                    int iRed = 28 - Color.red(0);
                    byte b7 = $$a[80];
                    byte b8 = b7;
                    Object[] objArr15 = new Object[1];
                    c(b7, b8, (byte) (b8 | 37), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, edgeSlop, iRed, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{32411, 7749, 63817, 31993, 63790, 55567, 28290, 48695, 45733, 53791, 2794, 40722, 63255, 34382, 25885, 19309, 7485, 15667, 42136, 37448, 58264, 2271, 38692, 10578}, (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{32284, 50302, 21064, 29090, 44647, 65144, 32237, 31709, 5356, 64083, 60575, 59911, 20224, 21125, 32343, 36772, 31270, 58082}, 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                        byte[] bArr4 = $$a;
                        Object[] objArr18 = new Object[1];
                        c(bArr4[80], bArr4[37], (byte) 52, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, jumpTapTimeout, capsMode, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int modifierMetaStateMask = 920 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int gidForName = 27 - Process.getGidForName("");
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[37];
                        Object[] objArr19 = new Object[1];
                        c(b9, b9, bArr5[80], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, modifierMetaStateMask, gidForName, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    int i16 = cancelAll + 117;
                    notify = i16 % 128;
                    if (i16 % 2 == 0) {
                        arrayList.add(strArr[i4]);
                        i4 += 101;
                    } else {
                        arrayList.add(strArr[i4]);
                        i4++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i17 = ((int[]) objArr[0])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = ~iIdentityHashCode;
        int i19 = (~((-906448715) | i18)) | 67174410;
        int i20 = ~(iIdentityHashCode | (-28356626));
        int i21 = i17 + (-613610724) + ((i19 | i20) * (-713)) + (i20 * 1426) + ((~((-867630930) | i18)) * 713);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
        int i24 = notify + 95;
        cancelAll = i24 % 128;
        int i25 = i24 % 2;
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        int i26 = cancelAll + 3;
        notify = i26 % 128;
        int i27 = i26 % 2;
        return migrantWorkerRegistration;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = notify + 117;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        IndonesianMigrantWorkerUploadDocumentRegistrationFragment$bindingInflater$1 indonesianMigrantWorkerUploadDocumentRegistrationFragment$bindingInflater$1 = IndonesianMigrantWorkerUploadDocumentRegistrationFragment$bindingInflater$1.b;
        int i4 = notify + 25;
        cancelAll = i4 % 128;
        int i5 = i4 % 2;
        return indonesianMigrantWorkerUploadDocumentRegistrationFragment$bindingInflater$1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = cancelAll + 121;
        notify = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asBinder;
        if (i3 == 0) {
            int i5 = 74 / 0;
        }
        return i4;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        int i = 2 % 2;
        final FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface = asInterface();
        MaterialButton materialButton = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: executeOnDiskIO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getIOThreadExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface, (View) obj);
            }
        }));
        fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface.cvIdCardUpload.setOnClickListener(new View.OnClickListener() { // from class: isMainThread
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getIOThreadExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface.cvWorkAgreement.setOnClickListener(new View.OnClickListener() { // from class: lambdastatic0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getIOThreadExecutor.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        int i2 = notify + 97;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        File cacheDir;
        Image imageB;
        FragmentActivity activity;
        File file;
        int i;
        Uri output;
        FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface;
        int i2 = 2 % 2;
        int i3 = notify;
        int i4 = i3 + 119;
        int i5 = i4 % 128;
        cancelAll = i5;
        if (i4 % 2 == 0) {
            if (p1 == -1) {
                if (p2 != null) {
                    int i6 = i5 + 29;
                    notify = i6 % 128;
                    int i7 = i6 % 2;
                    cacheDir = null;
                    if (p0 == 101) {
                        imageB = getCaptureNode.b(p2);
                        if (p0 == 100) {
                            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1(this, imageB, asInterface(), null), 3, null);
                        } else if (imageB != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder("croppedIdCardImage");
                            sb.append(jCurrentTimeMillis);
                            sb.append(".jpg");
                            String string = sb.toString();
                            activity = getActivity();
                            if (activity != null) {
                                i = cancelAll + 97;
                                notify = i % 128;
                                if (i % 2 != 0) {
                                    activity.getCacheDir();
                                    cacheDir.hashCode();
                                    throw null;
                                }
                                cacheDir = activity.getCacheDir();
                            }
                            file = new File(cacheDir, string);
                            if (file.exists()) {
                                file.delete();
                            }
                            Context contextRequireContext = requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            String str = imageB.TuitionPaymentFragmentbindingInflater1;
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            Uri uriFromFile = Uri.fromFile(file);
                            Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
                            Camera2CameraControlExternalSyntheticLambda5.b(contextRequireContext, str, uriFromFile, this, 16.0f, 9.0f, 101);
                        }
                    } else if (p2 != null) {
                        int i8 = i5 + 79;
                        notify = i8 % 128;
                        int i9 = i8 % 2;
                        output = UCrop.getOutput(p2);
                        fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface = asInterface();
                        if (output != null) {
                            b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showIdCard$1$1$1(this, output, fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface, null), 3, null);
                        }
                    }
                }
            }
            super.onActivityResult(p0, p1, p2);
        }
        int i10 = 64 / 0;
        if (p1 == -1) {
            if (p2 != null) {
                int i11 = i5 + 29;
                notify = i11 % 128;
                int i12 = i11 % 2;
                cacheDir = null;
                if (p0 == 101) {
                    imageB = getCaptureNode.b(p2);
                    if (p0 == 100) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showWorkAgreement$1$1(this, imageB, asInterface(), null), 3, null);
                    } else if (imageB != null) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        StringBuilder sb2 = new StringBuilder("croppedIdCardImage");
                        sb2.append(jCurrentTimeMillis2);
                        sb2.append(".jpg");
                        String string2 = sb2.toString();
                        activity = getActivity();
                        if (activity != null) {
                            i = cancelAll + 97;
                            notify = i % 128;
                            if (i % 2 != 0) {
                                activity.getCacheDir();
                                cacheDir.hashCode();
                                throw null;
                            }
                            cacheDir = activity.getCacheDir();
                        }
                        file = new File(cacheDir, string2);
                        if (file.exists()) {
                            file.delete();
                        }
                        Context contextRequireContext2 = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        String str2 = imageB.TuitionPaymentFragmentbindingInflater1;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        Uri uriFromFile2 = Uri.fromFile(file);
                        Intrinsics.checkNotNullExpressionValue(uriFromFile2, "");
                        Camera2CameraControlExternalSyntheticLambda5.b(contextRequireContext2, str2, uriFromFile2, this, 16.0f, 9.0f, 101);
                    }
                } else if (p2 != null) {
                    int i13 = i5 + 79;
                    notify = i13 % 128;
                    int i14 = i13 % 2;
                    output = UCrop.getOutput(p2);
                    fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface = asInterface();
                    if (output != null) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IndonesianMigrantWorkerUploadDocumentRegistrationFragment$showIdCard$1$1$1(this, output, fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBindingAsInterface, null), 3, null);
                    }
                }
            }
        }
        super.onActivityResult(p0, p1, p2);
        if (p2 != null) {
            int i15 = i3 + 25;
            cancelAll = i15 % 128;
            int i16 = i15 % 2;
            UCrop.getError(p2);
        }
        super.onActivityResult(p0, p1, p2);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(getIOThreadExecutor getiothreadexecutor, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            updateFileExif updatefileexif = new updateFileExif();
            getIOThreadExecutor getiothreadexecutor2 = getiothreadexecutor;
            Intent intent = new Intent(getiothreadexecutor2.getActivity(), (Class<?>) ImagePickerActivity.class);
            intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            getiothreadexecutor2.startActivityForResult(intent, 200);
            ViewPortBuilder.b();
            int i2 = cancelAll + 55;
            notify = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ MigrantWorkerRegistration b(getIOThreadExecutor getiothreadexecutor) {
        int i = 2 % 2;
        int i2 = cancelAll + 33;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getiothreadexecutor.getArguments();
        if (arguments == null) {
            int i4 = notify + 95;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 66 / 0;
            }
            return null;
        }
        int i6 = cancelAll + 53;
        notify = i6 % 128;
        if (i6 % 2 != 0) {
            return (MigrantWorkerRegistration) arguments.getParcelable("migration_worker_data");
        }
        int i7 = 39 / 0;
        return (MigrantWorkerRegistration) arguments.getParcelable("migration_worker_data");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getIOThreadExecutor getiothreadexecutor, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            updateFileExif updatefileexif = new updateFileExif();
            getIOThreadExecutor getiothreadexecutor2 = getiothreadexecutor;
            Intent intent = new Intent(getiothreadexecutor2.getActivity(), (Class<?>) ImagePickerActivity.class);
            intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            getiothreadexecutor2.startActivityForResult(intent, 100);
            ViewPortBuilder.b();
            int i2 = cancelAll + 57;
            notify = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getIOThreadExecutor getiothreadexecutor, FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        File file = getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (file == null || getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            if (file == null) {
                TextView textView = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.tvIdCardError;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
            }
            if (getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                int i2 = notify + 109;
                cancelAll = i2 % 128;
                if (i2 % 2 != 0) {
                    TextView textView2 = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.tvWorkAgrermentError;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                } else {
                    TextView textView3 = fragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding.tvWorkAgrermentError;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(0);
                }
                int i3 = cancelAll + 5;
                notify = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            int i5 = notify + 87;
            cancelAll = i5 % 128;
            MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = null;
            if (i5 % 2 != 0) {
                getiothreadexecutor.TuitionPaymentFragmentbindingInflater1();
                migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1.hashCode();
                throw null;
            }
            MigrantWorkerRegistration migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater2 = getiothreadexecutor.TuitionPaymentFragmentbindingInflater1();
            migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1 = migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater2 != null ? MigrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1(migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getiothreadexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, -1, 9) : null;
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            Camera2CameraControlExternalSyntheticLambda1 camera2CameraControlExternalSyntheticLambda1 = new Camera2CameraControlExternalSyntheticLambda1(migrantWorkerRegistrationTuitionPaymentFragmentbindingInflater1);
            Intrinsics.checkNotNullParameter(camera2CameraControlExternalSyntheticLambda1, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(camera2CameraControlExternalSyntheticLambda1);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = cancelAll + 61;
        notify = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    static {
        cancel = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 85;
        cancel = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    public static final /* synthetic */ File TuitionPaymentFragmentspecialinlinedviewModeldefault1(getIOThreadExecutor getiothreadexecutor) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (File) TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1583776921, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{getiothreadexecutor}, -1583776920, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -637768396, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, 637768398, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1744278919, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, new Object[]{this}, -1744278919, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = cancelAll + 91;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        int i = 2 % 2;
        int i2 = notify + 43;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        int i = 2 % 2;
        int i2 = notify + 1;
        cancelAll = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        f940a = (char) 54196;
        d = (char) 20057;
        asBinder = (char) 33195;
        onTransact = (char) 41843;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 53;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancelAll + 77;
        notify = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 108
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = defpackage.getIOThreadExecutor.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getIOThreadExecutor.$$g(byte, short, int):java.lang.String");
    }
}
