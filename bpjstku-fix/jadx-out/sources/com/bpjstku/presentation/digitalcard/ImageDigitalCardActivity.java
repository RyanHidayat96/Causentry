package com.bpjstku.presentation.digitalcard;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.databinding.ActivityImageDigitalCardBinding;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.AutoValue_MediaSpec1;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CaptureSession1;
import defpackage.VideoRecordEventStart;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.abortCapture;
import defpackage.acquireBuffer;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0004R\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0015\u0010\u000b\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/ImageDigitalCardActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityImageDigitalCardBinding;", "<init>", "()V", "", "g", "()Ljava/lang/String;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "onTransact", "asInterface", "asBinder", "a", "LacquireBuffer;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LoutputFormatToAudioProfile;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageDigitalCardActivity extends BindingBaseActivity<ActivityImageDigitalCardBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f487a;
    private static long g;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: removeItemAtInt
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ImageDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private DigitalCard b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {123, -2, -101, -104};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {32, 1, 70, -122, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 36;
    private static int asInterface = 1;
    private static int d = 0;
    private static int asBinder = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = i | i7 | (~i6);
        int i9 = ~i;
        int i10 = (~(i6 | i7)) | (~(i7 | i9));
        int i11 = i2 + i + i4 + ((-92689393) * i5) + (1942122663 * i3);
        int i12 = i11 * i11;
        int i13 = (((-665130586) * i2) - 357761024) + ((-674687396) * i) + (4778405 * i8) + (i9 * (-4778405)) + ((-4778405) * i10) + ((-669908992) * i4) + ((-1056047104) * i5) + ((-742522880) * i3) + ((-592117760) * i12);
        int i14 = (i2 * 1048061654) + 1366922925 + (i * 1048062268) + (i8 * (-307)) + (i9 * 307) + (i10 * 307) + (i4 * 1048061961) + (i5 * 439444615) + (i3 * (-1279783457)) + (i12 * 173867008);
        int i15 = i13 + (i14 * i14 * (-1898250240));
        if (i15 == 1) {
            return b(objArr);
        }
        if (i15 != 2) {
            return i15 != 3 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
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
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 53 - r6
            int r7 = 144 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.c(int, short, int, java.lang.Object[]):void");
    }

    public ImageDigitalCardActivity() {
        final ImageDigitalCardActivity imageDigitalCardActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = imageDigitalCardActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/digitalcard/ImageDigitalCardActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "p1", "", "p2", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Lcom/bpjstku/domain/digitalcard/model/DigitalCard;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, DigitalCard p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ImageDigitalCardActivity.class, new Pair[]{TuplesKt.to("digital_card_info", p1), TuplesKt.to("email", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(g ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 64838), 1356 - TextUtils.getTrimmedLength(""), TextUtils.getOffsetAfter("", 0) + 38, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 47773), 468 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i6 = $11 + 77;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            ImageDigitalCardActivity$bindingInflater$1 imageDigitalCardActivity$bindingInflater$1 = ImageDigitalCardActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
        ImageDigitalCardActivity$bindingInflater$1 imageDigitalCardActivity$bindingInflater$2 = ImageDigitalCardActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = d + 91;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return imageDigitalCardActivity$bindingInflater$2;
    }

    private static String g() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath();
            int i4 = d + 69;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return path;
            }
            throw null;
        } catch (Exception unused) {
            String path2 = Environment.getExternalStorageDirectory().getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(path2);
            sb.append("/JMO");
            return sb.toString();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        MaterialButton materialButton = ((ActivityImageDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnSaveDigitalCard;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(materialButton, new Function0() { // from class: setHeaderInternal
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageDigitalCardActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        int i2 = d + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        String stringExtra = null;
        this.b = intent != null ? (DigitalCard) intent.getParcelableExtra("digital_card_info") : null;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            stringExtra = intent2.getStringExtra("email");
            int i4 = asBinder + 121;
            d = i4 % 128;
            int i5 = i4 % 2;
        }
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra;
    }

    private void onTransact() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 17;
        int i4 = i3 % 128;
        d = i4;
        String str = null;
        if (i3 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        DigitalCard digitalCard = this.b;
        if (digitalCard != null) {
            int i5 = i2 + 101;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                str = digitalCard.TuitionPaymentFragmentbindingInflater1;
                int i6 = 71 / 0;
            } else {
                str = digitalCard.TuitionPaymentFragmentbindingInflater1;
            }
        } else {
            int i7 = i4 + 21;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        if (str == null) {
            int i9 = asBinder + 13;
            d = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str3 = str;
        }
        Glide.with(this).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new DigitalCardImageRequest(str2, str3)).into(((ActivityImageDigitalCardBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).imgDigitalCardDetail);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = d + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onTransact();
        int i4 = asBinder + 81;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            ImageDigitalCardActivity imageDigitalCardActivity = this;
            Intrinsics.checkNotNullParameter(imageDigitalCardActivity, "");
            imageDigitalCardActivity.getWindow().addFlags(5270);
        } else {
            ImageDigitalCardActivity imageDigitalCardActivity2 = this;
            Intrinsics.checkNotNullParameter(imageDigitalCardActivity2, "");
            imageDigitalCardActivity2.getWindow().addFlags(8192);
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int scrollBarFadeDuration = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b, (short) (b | 141), bArr[1], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, scrollBarFadeDuration, iKeyCodeFromString, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{29276, 29245, 16838, 51401, 54937, 59087, 7459, 12023, 55490, 9477, 28045, 64187, 52155, 34387, 267, 42890, 25705, 31639, 41493, 888, 289, 56475, 18385, 57358, 48619, 45559}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_bank_name).substring(1, 2).length(), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{36490, 36591, 64976, 57220, 27277, 61831, 52887, 53821, 2932, 39197, 31429, 10609, 14183, 14933, 5633, 29723, 39087, 51101, 46412}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).length(), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1031;
            int iRed = 15 - Color.red(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 | 89), bArr2[1], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollDefaultDelay, iRed, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 1031;
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15;
                int i2 = $$b;
                Object[] objArr6 = new Object[1];
                c((byte) (i2 | 16), (short) (i2 + 1), $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, trimmedLength, scrollBarFadeDuration2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[3])[0];
            int i4 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i5 = 1624281220 + ((~(263712255 | startUptimeMillis)) * 623) + (((~startUptimeMillis) | 475157) * (-623)) + (((~(startUptimeMillis | 254233791)) | (~(9953621 | startUptimeMillis)) | (-263712256)) * 623) + 963357820;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[2])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{25213, 25111, 18745, 11263, 56937, 1515, 51369, 16023, 3419, 11760, 36524, 12130, 56210, 36606, 57938, 29241, 29762, 29536, 16672, 55017}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{45362, 45403, 16153, 53225, 43084, 57838, 50832, 60802, 877, 23504, 27324, 8515, 2290, 63636, 1655, 31774, 42813, 1374, 42276, 55511}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-869671326};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46038), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 963357820, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                    int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                    byte[] bArr3 = $$a;
                    byte b3 = bArr3[7];
                    Object[] objArr12 = new Object[1];
                    c(b3, (short) (b3 | 141), bArr3[1], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, edgeSlop, i8, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1116 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    int keyRepeatTimeout = 1031 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i9 = 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i10 = $$b;
                    Object[] objArr13 = new Object[1];
                    c((byte) (i10 | 16), (short) (i10 + 1), $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, keyRepeatTimeout, i9, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{29276, 29245, 16838, 51401, 54937, 59087, 7459, 12023, 55490, 9477, 28045, 64187, 52155, 34387, 267, 42890, 25705, 31639, 41493, 888, 289, 56475, 18385, 57358, 48619, 45559}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{36490, 36591, 64976, 57220, 27277, 61831, 52887, 53821, 2932, 39197, 31429, 10609, 14183, 14933, 5633, 29723, 39087, 51101, 46412}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.text_yes).substring(0, 1).length(), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iAxisFromString = MotionEvent.axisFromString("") + 1032;
                        int i11 = 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        c(b4, (short) (b4 | 89), bArr4[1], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, iAxisFromString, i11, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int mirror = AndroidCharacter.getMirror('0') + 983;
                        int iIndexOf = TextUtils.indexOf("", "") + 15;
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b5, (short) (b5 | 141), bArr5[1], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cKeyCodeFromString, mirror, iIndexOf, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[3])[0];
            int i14 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i15 = (-152627745) + ((iUptimeMillis | 504718062) * (-50));
            int i16 = ~((-269484139) | iUptimeMillis);
            int i17 = ~iUptimeMillis;
            int i18 = i12 + i15 + ((i16 | (~(529922030 | i17))) * 50) + (((~(i17 | 504718062)) | (~(260437892 | i17)) | (-529922031)) * 50);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr18[2])[0] = i20 ^ (i20 << 5);
            int i21 = asBinder + 105;
            d = i21 % 128;
            int i22 = i21 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char minimumFlingVelocity = (char) (29944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                int trimmedLength2 = TextUtils.getTrimmedLength("") + 23;
                Object[] objArr19 = new Object[1];
                c((byte) 15, (short) ($$b + 1), $$a[1], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(minimumFlingVelocity, iLastIndexOf, trimmedLength2, 986134021, false, (String) objArr19[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int i23 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1754;
                    int i24 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                    byte[] bArr6 = $$a;
                    byte b6 = bArr6[7];
                    Object[] objArr20 = new Object[1];
                    c(b6, (short) (b6 | 89), bArr6[1], objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cMyTid, i23, i24, 1599039318, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
                int i25 = ~System.identityHashCode(this);
                int i26 = ~(1016234080 | i25);
                int i27 = (-1185118847) + ((i26 | (-803631655)) * 764) + (((~(i25 | (-803631655))) | 746717216) * (-1528)) + (((-326431303) | i26) * 764) + 449141566;
                int i28 = (i27 << 13) ^ i27;
                int i29 = i28 ^ (i28 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i29 ^ (i29 << 5);
            } else {
                Object[] objArr22 = new Object[1];
                e(new char[]{25213, 25111, 18745, 11263, 56937, 1515, 51369, 16023, 3419, 11760, 36524, 12130, 56210, 36606, 57938, 29241, 29762, 29536, 16672, 55017}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step6).substring(39, 40).length(), objArr22);
                Class<?> cls4 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(new char[]{45362, 45403, 16153, 53225, 43084, 57838, 50832, 60802, 877, 23504, 27324, 8515, 2290, 63636, 1655, 31774, 42813, 1374, 42276, 55511}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_gojek_message).substring(35, 37).codePointAt(1) - 106, objArr23);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr24 = {-869671326};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.getDefaultSize(0, 0) + 1726, 29 - Color.green(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), 449141566);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1755;
                    int i30 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    byte[] bArr7 = $$a;
                    byte b7 = bArr7[7];
                    Object[] objArr25 = new Object[1];
                    c(b7, (short) (b7 | 89), bArr7[1], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cCombineMeasuredStates, iResolveOpacity, i30, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    Object[] objArr26 = new Object[1];
                    e(new char[]{29276, 29245, 16838, 51401, 54937, 59087, 7459, 12023, 55490, 9477, 28045, 64187, 52155, 34387, 267, 42890, 25705, 31639, 41493, 888, 289, 56475, 18385, 57358, 48619, 45559}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_instruction_step2).substring(32, 33).codePointAt(0) - 98, objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(new char[]{36490, 36591, 64976, 57220, 27277, 61831, 52887, 53821, 2932, 39197, 31429, 10609, 14183, 14933, 5633, 29723, 39087, 51101, 46412}, 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
                        int i31 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 23;
                        byte[] bArr8 = $$a;
                        byte b8 = bArr8[7];
                        Object[] objArr28 = new Object[1];
                        c(b8, b8, bArr8[1], objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf, i31, capsMode, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int bitsPerPixel2 = 1754 - ImageFormat.getBitsPerPixel(0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23;
                        Object[] objArr29 = new Object[1];
                        c((byte) 15, (short) ($$b + 1), $$a[1], objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(modifierMetaStateMask, bitsPerPixel2, maximumFlingVelocity, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i32 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
            int i33 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
            if (i33 == i32) {
                int i34 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
                Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto4).substring(12, 13).codePointAt(0) - 1596808365;
                int i35 = i34 + (-423213295) + (((~((-97142678) | iCodePointAt)) | 79709828) * 104) + ((~((~iCodePointAt) | 132892597)) * (-104)) + ((iCodePointAt | 115459748) * 104);
                int i36 = (i35 << 13) ^ i35;
                int i37 = i36 ^ (i36 >>> 17);
                ((int[]) objArr30[3])[0] = i37 ^ (i37 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i33 / (((i33 - 1) * i33) % 2), 0).show();
            int i38 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iMyUid = Process.myUid();
            int i39 = ~iMyUid;
            int i40 = i38 + 2146645661 + (((~((-737637660) | i39)) | 950240085) * (-328)) + ((iMyUid | 950240085) * 164) + (((~(iMyUid | 737637659)) | 268468804 | (~(i39 | (-55866379)))) * 164);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr31[3])[0] = i42 ^ (i42 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i43 = asBinder;
            int i44 = i43 + 121;
            d = i44 % 128;
            int i45 = i43 + 87;
            d = i45 % 128;
            int i46 = i45 % 2;
            for (int i47 = i44 % 2 == 0 ? 0 : 1; i47 < strArr4.length; i47++) {
                arrayList2.add(strArr4[i47]);
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a1, code lost:
    
        if (r1 != ((759439788 + (((~((~r2) | (-38014983))) | 1753926313) * (-591))) + ((r2 | (-38014983)) * 591))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a3, code lost:
    
        super.onResume();
        r1 = com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.d + 37;
        com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.asBinder = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        r0 = 45 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b5, code lost:
    
        r1 = 1322245956 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00be, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        throw new java.lang.RuntimeException("1022416506");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (r1 == (((1753615336 + (((-1402994528) | r6) * (-712))) + (((~(r4 | (-1098947864))) | (~(r5 | 1402994527))) * (-712))) + ((1134034207 | r6) * 712))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (r1 == (((2007683688 + ((1318644607 | r4) * 376)) + (((~((~r4) | 248981716)) | 1074316075) * (-376))) + (((~(r4 | (-248981717))) | (-1078969260)) * 376))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007a, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        r2 = (int) java.lang.Runtime.getRuntime().freeMemory();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() throws java.lang.IllegalAccessException {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.d
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.asBinder = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L47
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r4 = 1
            r1 = r1[r4]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r9)
            int r5 = ~r4
            r6 = 304046664(0x121f6248, float:5.0292695E-28)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = -1402994528(0xffffffffac6000a0, float:-3.1832662E-12)
            r7 = r7 | r6
            int r7 = r7 * (-712)
            r8 = 1753615336(0x68860be8, float:5.064134E24)
            int r8 = r8 + r7
            r7 = 1402994527(0x539fff5f, float:1.3743684E12)
            r5 = r5 | r7
            int r5 = ~r5
            r7 = -1098947864(0xffffffffbe7f62e8, float:-0.24940073)
            r4 = r4 | r7
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * (-712)
            int r8 = r8 + r4
            r4 = 1134034207(0x4397fd1f, float:303.9775)
            r4 = r4 | r6
            int r4 = r4 * 712
            int r8 = r8 + r4
            if (r1 != r8) goto Lbf
            goto L7a
        L47:
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            int r4 = java.lang.System.identityHashCode(r9)
            r5 = 1318644607(0x4e98eb7f, float:1.2827852E9)
            r5 = r5 | r4
            int r5 = r5 * 376
            r6 = 2007683688(0x77aad268, float:6.9293595E33)
            int r6 = r6 + r5
            int r5 = ~r4
            r7 = 248981716(0xed728d4, float:5.304091E-30)
            r5 = r5 | r7
            int r5 = ~r5
            r7 = 1074316075(0x4008c32b, float:2.136912)
            r5 = r5 | r7
            int r5 = r5 * (-376)
            int r6 = r6 + r5
            r5 = -248981717(0xfffffffff128d72b, float:-8.3605766E29)
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -1078969260(0xffffffffbfb03c54, float:-1.3768411)
            r4 = r4 | r5
            int r4 = r4 * 376
            int r6 = r6 + r4
            if (r1 != r6) goto Lbf
        L7a:
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r3]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r2)
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r4 = r2.freeMemory()
            int r2 = (int) r4
            int r4 = ~r2
            r5 = -38014983(0xfffffffffdbbeff9, float:-3.1226456E37)
            r4 = r4 | r5
            int r4 = ~r4
            r6 = 1753926313(0x688acaa9, float:5.2434E24)
            r4 = r4 | r6
            int r4 = r4 * (-591)
            r6 = 759439788(0x2d4421ac, float:1.1148787E-11)
            int r6 = r6 + r4
            r2 = r2 | r5
            int r2 = r2 * 591
            int r6 = r6 + r2
            if (r1 != r6) goto Lb5
            super.onResume()
            int r1 = com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.d
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.asBinder = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Lb4
            r0 = 45
            int r0 = r0 / r3
        Lb4:
            return
        Lb5:
            r1 = 1322245956(0x4ecfdf44, float:1.7437578E9)
            int r1 = r1 % r0
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>()
            throw r0
        Lbf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "1022416506"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i3 = (-1106690312) + ((iMyUid | 417338828) * (-859));
        int i4 = ~iMyUid;
        if (i2 != i3 + (((~(iMyUid | (-278922573))) | (~(417338828 | i4))) * 859) + (((~(1247326371 | i4)) | (-1526248944)) * 859)) {
            throw null;
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i6 = ~((int) Runtime.getRuntime().freeMemory());
        int i7 = ~(760863822 | i6);
        if (i5 != 409711252 + ((i7 | 1818192142) * 764) + (((~(i6 | 1818192142)) | 16815168) * (-1528)) + ((1090958656 | i7) * 764)) {
            int i8 = d + 109;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            int[] iArr = new int[2117039716];
            iArr[2117039715] = 1;
            int i10 = (-1589059412) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
            int i11 = d + 75;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
        }
        super.onStart();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1562826592
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageDigitalCardActivity imageDigitalCardActivity) {
        int i = 2 % 2;
        int i2 = d + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        imageDigitalCardActivity.onTransact();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 45;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageDigitalCardActivity imageDigitalCardActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(imageDigitalCardActivity);
        int i2 = d + 15;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
        return outputformattoaudioprofile;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0133, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0148, code lost:
    
        if (r1 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ kotlin.Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity r11, java.lang.Boolean r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(com.bpjstku.presentation.digitalcard.ImageDigitalCardActivity, java.lang.Boolean):kotlin.Unit");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final ImageDigitalCardActivity imageDigitalCardActivity) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 40, Color.alpha(0) + 19, 1513912262, false, "b", null);
        }
        int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 37836), 59 - TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37837 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.alpha(0) + 59, View.getDefaultSize(0, 0) + 18, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 52;
        long j3 = -1;
        long jMyPid = ((long) Process.myPid()) ^ j3;
        long j4 = j3 ^ 1578125838666682278L;
        long j5 = j3 ^ 3941127658493103961L;
        long j6 = (((long) (-51)) * 3941127658493103961L) + (((long) 53) * 1578125838666682278L) + (((jMyPid | 4032889628464238591L) ^ j3) * j2) + (((long) (-52)) * (((j4 | jMyPid) ^ j3) | ((j4 | 3941127658493103961L) ^ j3) | ((jMyPid | 3941127658493103961L) ^ j3))) + (j2 * (((jMyPid | j5) ^ j3) | (j3 ^ (j5 | 1578125838666682278L))));
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i7 != 0) {
                break;
            }
            int i9 = asBinder + 23;
            d = i9 % 128;
            i7 = i9 % 2 != 0 ? i7 + 4 : i7 + 1;
            j = j6;
        }
        if (i6 != i4) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - Color.green(0)), 40 - (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i5));
        }
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) imageDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: setShortcutsVisibleInner
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: getOrdering
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr = {function1, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ImageDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(69341430, -69341429, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) imageDigitalCardActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 37;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        throw null;
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(69341430, -69341429, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{function1, obj}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static {
        f487a = 0;
        d();
        INSTANCE = new Companion(null);
        int i = asInterface + 35;
        f487a = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityImageDigitalCardBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.j1772_ev_connector_type).substring(0, 5).codePointAt(1) + 531131233;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1404140420, 1404140422, Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iCodePointAt, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1998615915, 1998615915, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 101329723, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(2020706796, -2020706793, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellResolutionTitle).substring(0, 10).length() - 1957491884, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        d = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = d + 85;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void d() {
        g = 1222196886916267351L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 3;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_image_digital_card);
        }
        int i5 = 57 / 0;
        return Integer.valueOf(R.layout.activity_image_digital_card);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = d + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static String $$i(int i, int i2, byte b) {
        int i3 = i2 * 3;
        int i4 = 3 - (i * 4);
        int i5 = 107 - (b * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i5 = i4 + i3;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i5 = bArr[i8] + i5;
            i4 = i8;
        }
    }
}
